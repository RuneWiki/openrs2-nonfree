import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array15;

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
	public static int anInt2373;

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_743 = Static170.method3101(" is already on your ignore list)3");

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_741 = aClass28_743;

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "[I")
	public static int[] anIntArray387 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
	public static int anInt2370 = 0;

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "Lclient!eh;")
	private static Class28 aClass28_742 = Static170.method3101("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!kd", name = "ob", descriptor = "Lclient!eh;")
	public static Class28 aClass28_744 = aClass28_742;

	@OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
	public static int anInt2377 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JBII)Z")
	public static boolean method1865(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local11 == 10 || local11 == 11 || local11 == 22) {
			@Pc(48) Class3_Sub2_Sub18 local48 = Static86.method1991(local29);
			@Pc(59) int local59;
			@Pc(62) int local62;
			if (local22 == 0 || local22 == 2) {
				local62 = local48.anInt4226;
				local59 = local48.anInt4242;
			} else {
				local59 = local48.anInt4226;
				local62 = local48.anInt4242;
			}
			@Pc(72) int local72 = local48.anInt4212;
			if (local22 != 0) {
				local72 = (local72 << local22 & 0xF) + (local72 >> 4 - local22);
			}
			Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], local59, local62, true, arg1, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], local72, 2, arg2, 0);
		} else {
			Static179.method3196(local11 + 1, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, true, arg1, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, arg2, local22);
		}
		Static176.anInt4190 = 0;
		Static78.anInt2324 = 2;
		Static146.anInt3647 = Static2.anInt80;
		Static128.anInt3274 = Static160.anInt3914;
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
	public static void method1866() {
		aClass28_742 = null;
		aClass28_741 = null;
		aClass28_743 = null;
		aString1 = null;
		aClass28_744 = null;
		aCRC32_1 = null;
		aClass28Array15 = null;
		anIntArray387 = null;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)I")
	public static int method1867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub15 local15 = (Class3_Sub15) Static1.aClass87_1.method3201((long) arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 >= 0 && local15.anIntArray474.length > arg0) {
			return local15.anIntArray474[arg0];
		} else {
			return 0;
		}
	}
}
