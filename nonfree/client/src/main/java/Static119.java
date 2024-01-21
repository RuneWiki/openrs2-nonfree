import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
	public static int anInt2638;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
	public static int[] anIntArray282 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!tg;")
	private static Class81 aClass81_961 = Static120.method2057("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_959 = aClass81_961;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	public static int anInt2628 = 0;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!tg;")
	private static Class81 aClass81_960 = Static120.method2057("Continue");

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!ah;")
	public static Class5 aClass5_8 = new Class5(8);

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_962 = aClass81_960;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	public static int anInt2639 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public static void method2033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass83_1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method2034() {
		aClass5_8 = null;
		anIntArray282 = null;
		aClass81_959 = null;
		aClass81_961 = null;
		aBooleanArray14 = null;
		aClass81_960 = null;
		aClass81_962 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JB)V")
	public static void method2035(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static104.aClass1_Sub8_Sub1_2.method366(204);
			Static104.aClass1_Sub8_Sub1_2.method355(arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)I")
	public static int method2036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
