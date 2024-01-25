import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
	public static boolean aBoolean504 = false;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
	public static final int[] anIntArray531 = new int[13];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public static void method5992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class348 local16 = Static587.aClass348ArrayArray1[arg1][arg0];
		if (local16 != null) {
			Static534.anInt8851 = local16.anInt9428;
			Static383.anInt1377 = local16.anInt9425;
			Static448.anInt7748 = local16.anInt9430;
		}
		Static464.method6506();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = local7 * (Static507.aShort107 - Static394.aShort88) / 100 + Static394.aShort88;
		@Pc(36) int local36 = arg2 * local30 >> 8;
		@Pc(42) int local42 = 16384 - arg3 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg6 & 0x3FFF;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = local36;
		if (local42 != 0) {
			local53 = Class6_Sub2_Sub7.anIntArray178[local42] * -local36 >> 14;
			local55 = Class6_Sub2_Sub7.anIntArray177[local42] * local36 >> 14;
		}
		if (local49 != 0) {
			local51 = Class6_Sub2_Sub7.anIntArray178[local49] * local55 >> 14;
			local55 = local55 * Class6_Sub2_Sub7.anIntArray177[local49] >> 14;
		}
		Static67.anInt1407 = arg3;
		Static385.anInt6775 = 0;
		Static322.anInt5904 = arg4 - local55;
		Static371.anInt6572 = arg5 - local51;
		Static570.anInt9340 = arg6;
		Static111.anInt2160 = arg0 - local53;
	}
}
