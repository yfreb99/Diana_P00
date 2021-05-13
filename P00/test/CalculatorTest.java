import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		 Calculator cal = new Calculator();
		 int actual = cal.add(a, b);
		 int expected = 9999;
		 assertEquals (actual, expected);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		 Calculator cal = new Calculator();
		 int actual = cal.subtract(a, b);
		 int expected = 5555;
		 assertEquals (actual, expected);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 0;
		 Calculator cal = new Calculator();
		 int actual = cal.multiple(a, b);
		 int expected = 0;
		 assertEquals (actual, expected);
	}
	@Test
	public void testDivideWithNon0Denominator () {
		//fail("Not yet implemented");
		int a = 0;
		int b = 3333;
		 Calculator cal = new Calculator();
		 int actual = cal.divide(a, b);
		 int expected = 0;
		 assertEquals (actual, expected);
	}
	
	@Test
	public void testDivideWith0Denominator () {
		//fail("Not yet implemented");
		int a = 3333;
		int b = 0;
		 try {
			 Calculator cal = new Calculator();
			 cal.divide(a, b);
			 fail("Expected an IllegalArgumentException to be thrown");
			  }catch(IllegalArgumentException e) {
				  assertEquals(e.getMessage(), "Division by zero is not supported");
			  }catch(Throwable t) {
				  assertEquals(t.getMessage(), "Expected an IllegalArgumentException to be thrown");
			  }
	}

}
