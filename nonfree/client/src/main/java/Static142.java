import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!he", name = "t", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "I")
	public static int anInt2560;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "S")
	public static short aShort51 = 1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;IIIIIIB)V")
	public static void method2279(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(12) Class36_Sub2 local12 = new Class36_Sub2();
		local12.anInt1988 = arg1 + Static123.anInt2333;
		local12.anInt1994 = arg4;
		local12.anInt1995 = arg3;
		local12.anInt1989 = arg5;
		local12.aString40 = arg0;
		local12.anInt1987 = arg2;
		local12.anInt1992 = arg6;
		Static311.aClass242_8.method5501(local12);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method2281(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = Static123.anInt2333 - Static59.anInt1065;
		if (local13 >= 100) {
			Static57.anInt883 = 1;
			return;
		}
		@Pc(24) int local24 = (int) Static90.aFloat25;
		if (Static321.anInt5592 >> 8 > local24) {
			local24 = Static321.anInt5592 >> 8;
		}
		if (Static45.aBooleanArray3[4] && Static343.anIntArray454[4] + 128 > local24) {
			local24 = Static343.anIntArray454[4] + 128;
		}
		@Pc(57) int local57 = Static402.anInt7349 + (int) Static147.aFloat59 & 0x3FFF;
		Static104.method1680(Static34.anInt572, local57, local24, Static241.anInt4245, arg0, Static405.method5510(Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060, Static1.anInt41) - 50, (local24 >> 3) * 3 + 600 << 0);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local13) * (100 - local13) * (100 - local13)) / 1000000.0F;
		Static401.anInt7130 = (int) ((float) Static214.anInt6452 + (float) (Static401.anInt7130 - Static214.anInt6452) * local103);
		Static302.anInt5030 = (int) ((float) Static54.anInt987 + (float) (Static302.anInt5030 - Static54.anInt987) * local103);
		Static264.anInt4481 = (int) (local103 * (float) (Static264.anInt4481 - Static72.anInt1374) + (float) Static72.anInt1374);
		Static4.anInt149 = (int) ((float) Static336.anInt6117 + (float) (Static4.anInt149 - Static336.anInt6117) * local103);
		@Pc(154) int local154 = Static432.anInt7548 - Static151.anInt2734;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static432.anInt7548 = (int) ((float) local154 * local103 + (float) Static151.anInt2734);
		Static432.anInt7548 &= 0x3FFF;
	}
}
