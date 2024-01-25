import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method7003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg2 && arg5 == arg7 && arg6 == arg8 && arg1 == arg4) {
			Static254.method6587(arg0, arg5, arg1, arg3, arg8);
			return;
		}
		@Pc(40) int local40 = arg0;
		@Pc(42) int local42 = arg5;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg5 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(66) int local66 = arg4 * 3;
		@Pc(75) int local75 = local54 + arg8 - arg0 - local62;
		@Pc(86) int local86 = arg1 + local58 - local66 - arg5;
		@Pc(97) int local97 = local62 + local46 - local54 - local54;
		@Pc(106) int local106 = local50 + local66 - local58 - local58;
		@Pc(110) int local110 = local54 - local46;
		@Pc(114) int local114 = local58 - local50;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(124) int local124 = local116 * local116 >> 12;
			@Pc(130) int local130 = local116 * local124 >> 12;
			@Pc(134) int local134 = local130 * local75;
			@Pc(138) int local138 = local130 * local86;
			@Pc(142) int local142 = local97 * local124;
			@Pc(146) int local146 = local106 * local124;
			@Pc(150) int local150 = local116 * local110;
			@Pc(154) int local154 = local116 * local114;
			@Pc(164) int local164 = (local142 + local134 + local150 >> 12) + arg0;
			@Pc(175) int local175 = (local146 + local138 + local154 >> 12) + arg5;
			Static254.method6587(local40, local42, local175, arg3, local164);
			local40 = local164;
			local42 = local175;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JJ)J")
	public static long method7004(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
