import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	public static int anInt3197;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1405 = Static51.method932("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1406 = Static51.method932("null");

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
	public static int[] anIntArray338 = new int[2000];

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1407 = Static51.method932("Invalid username or password)3");

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "[I")
	public static int[] anIntArray339 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1410 = Static51.method932("Select a world");

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1408 = aClass10_1410;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1409 = aClass10_1407;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method2271() {
		if (Static58.aClass34_2 != null) {
			Static58.aClass34_2.method1136();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Lclient!cd;")
	public static Class10 method2272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static75.aClass10_773;
		} else if (local7 < -6) {
			return Static21.aClass10_252;
		} else if (local7 < -3) {
			return Static107.aClass10_1073;
		} else if (local7 < 0) {
			return Static57.aClass10_627;
		} else if (local7 > 9) {
			return Static114.aClass10_1105;
		} else if (local7 > 6) {
			return Static27.aClass10_351;
		} else if (local7 > 3) {
			return Static167.aClass10_865;
		} else if (local7 > 0) {
			return Static155.aClass10_1457;
		} else {
			return Static50.aClass10_559;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method2274() {
		aClass10_1410 = null;
		aClass10_1407 = null;
		anIntArray339 = null;
		aClass10_1409 = null;
		anIntArray338 = null;
		aClass10_1406 = null;
		aClass10_1405 = null;
		aClass10_1408 = null;
	}
}
