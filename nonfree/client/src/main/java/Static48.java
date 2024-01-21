import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_8;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
	public static int[] anIntArray242 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!u;")
	public static Class75 aClass75_1 = new Class75();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_507 = Static78.method1313(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public static int anInt1226 = 1;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
	public static int[] anIntArray243 = new int[128];

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!fc;")
	private static Class25 aClass25_508 = Static78.method1313("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!fc;")
	public static Class25 aClass25_509 = aClass25_508;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "I")
	public static int anInt1227 = 0;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	public static int anInt1228 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method979(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) Static67.aClass66_10.method1650((long) arg0);
		if (local6 != null) {
			local6.method2024();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method980() {
		aClass56_Sub1_8 = null;
		anIntArray243 = null;
		aClass75_1 = null;
		aClass25_508 = null;
		aClass25_507 = null;
		aClass25_509 = null;
		anIntArray242 = null;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	public static void method981(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1 local8 = (Class1_Sub1) Static67.aClass66_10.method1650((long) arg0);
		if (local8 != null) {
			for (@Pc(17) int local17 = 0; local17 < local8.anIntArray9.length; local17++) {
				local8.anIntArray9[local17] = -1;
				local8.anIntArray11[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)Z")
	public static boolean method982(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
