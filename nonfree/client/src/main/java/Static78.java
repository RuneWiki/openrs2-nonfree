import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "Lclient!jg;")
	public static Class44 aClass44_17;

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
	public static int anInt2403;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!kb;")
	private static Class46 aClass46_792 = Static65.method1172("Welcome to RuneScape");

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_791 = aClass46_792;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "[I")
	public static int[] anIntArray241 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_793 = Static65.method1172("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
	public static int anInt2389 = 0;

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "Lclient!kb;")
	public static Class46 aClass46_794 = Static65.method1172("::rect_debug");

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)I")
	public static int method1610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = 256 - arg0;
		return ((arg2 & 0xFF00FF) * arg0 + local14 * (arg1 & 0xFF00FF) & 0xFF00FF00) + (arg0 * (arg2 & 0xFF00) + (arg1 & 0xFF00) * local14 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method1627() {
		aClass46_792 = null;
		aClass46_794 = null;
		aClass44_17 = null;
		anIntArray240 = null;
		aClass46_791 = null;
		aClass46_793 = null;
		anIntArray241 = null;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
	public static int method1629() {
		return 6;
	}
}
