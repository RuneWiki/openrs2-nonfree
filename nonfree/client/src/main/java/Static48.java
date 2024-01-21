import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public static int anInt1173;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!na;")
	public static Class56 aClass56_20;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array3;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_522 = Static119.method1462(" loggt sich aus)3");

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!pe;")
	private static Class65 aClass65_523 = Static119.method1462("Could not complete login)3");

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_524 = aClass65_523;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "[I")
	public static int[] anIntArray152 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	public static int anInt1180 = 0;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "Lclient!pe;")
	public static Class65 aClass65_525 = Static119.method1462(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method829() {
		anIntArray152 = null;
		aClass65_524 = null;
		aClass2_Sub1_Sub4_Sub2Array3 = null;
		aClass56_20 = null;
		aClass65_525 = null;
		aClass65_522 = null;
		aLongArray2 = null;
		aClass65_523 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
	public static int method830(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static66.method1207(arg1 - 1, arg0 + -1) + Static66.method1207(arg1 + 1, arg0 - 1) + Static66.method1207(arg1 + -1, arg0 + 1) + Static66.method1207(arg1 + 1, arg0 + 1);
		@Pc(79) int local79 = Static66.method1207(arg1 - 1, arg0) + Static66.method1207(arg1 + 1, arg0) + Static66.method1207(arg1, arg0 - 1) + Static66.method1207(arg1, arg0 + 1);
		@Pc(86) int local86 = Static66.method1207(arg1, arg0);
		return local86 / 4 + local49 / 16 + local79 / 8;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([BIIII[Lclient!la;I)V")
	public static void method831(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class46[] arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg1 + local7 > 0 && local7 + arg1 < 103 && arg5 + local11 > 0 && arg5 + local11 < 103) {
						arg4[local3].anIntArrayArray13[arg1 + local7][arg5 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(101) Class2_Sub4 local101 = new Class2_Sub4(arg0);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
				for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
					Static35.method642(local101, 0, arg3, local11, local107 + arg1, arg5 + local111, arg2);
				}
			}
		}
	}
}
