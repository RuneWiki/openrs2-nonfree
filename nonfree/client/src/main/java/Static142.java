import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "Lclient!je;")
	public static Class40 aClass40_4;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_976 = Static38.method685("Clientscript error in: ");

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "[Lclient!mc;")
	public static Class2_Sub3_Sub5_Sub3[] aClass2_Sub3_Sub5_Sub3Array1 = new Class2_Sub3_Sub5_Sub3[4];

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "J")
	public static long aLong192 = 0L;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "[I")
	public static int[] anIntArray295 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "[I")
	public static int[] anIntArray296 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)I")
	public static int method2203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local11 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local11 * arg1;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
	public static void method2204() {
		anIntArray296 = null;
		aClass6_976 = null;
		aClass40_4 = null;
		anIntArray295 = null;
		aClass2_Sub3_Sub5_Sub3Array1 = null;
	}
}
