import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
	public static int anInt98 = 0;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "S")
	public static short aShort3 = 256;

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
	public static int anInt100 = 0;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg8 && arg0 == arg4 && arg3 == arg7 && arg2 == arg5) {
			Static287.method4511(arg1, arg5, arg3, arg0, arg6);
			return;
		}
		@Pc(36) int local36 = arg1;
		@Pc(38) int local38 = arg0;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg2 * 3;
		@Pc(72) int local72 = local50 + arg3 - local58 - arg1;
		@Pc(81) int local81 = arg5 + local54 - local62 - arg0;
		@Pc(90) int local90 = local58 + local42 - local50 - local50;
		@Pc(101) int local101 = local62 + local46 - local54 - local54;
		@Pc(105) int local105 = local50 - local42;
		@Pc(110) int local110 = local54 - local46;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(120) int local120 = local112 * local112 >> 12;
			@Pc(126) int local126 = local112 * local120 >> 12;
			@Pc(130) int local130 = local126 * local72;
			@Pc(134) int local134 = local81 * local126;
			@Pc(138) int local138 = local120 * local90;
			@Pc(142) int local142 = local101 * local120;
			@Pc(146) int local146 = local105 * local112;
			@Pc(150) int local150 = local110 * local112;
			@Pc(160) int local160 = (local138 + local130 + local146 >> 12) + arg1;
			@Pc(172) int local172 = (local134 + local142 + local150 >> 12) + arg0;
			Static287.method4511(local36, local172, local160, local38, arg6);
			local38 = local172;
			local36 = local160;
		}
	}
}
