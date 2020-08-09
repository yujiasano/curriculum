package check;

public class Check{
	private static String firstName = "浅野";
	private static String lastName = "雄司";
	
	private static void printName(String first_name, String last_name) {
		 String fullName =first_name + last_name;
		 System.out.println("printNameメソッド　→　"+fullName);
	}
	
	public static void main(String[] args) { 
		printName(firstName, lastName);
		
		Pet petName = new Pet(constants.Constants.CHECK_CLASS_JAVA, constants.Constants.CHECK_CLASS_HOGE );
		petName.introduce();
		
		RobotPet robotName = new RobotPet(constants.Constants.CHECK_CLASS_R2D2, constants.Constants.CHECK_CLASS_LUKE);
		robotName.introduce();
	}
	
}