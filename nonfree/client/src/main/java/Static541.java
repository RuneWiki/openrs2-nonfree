import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "[I")
	public static final int[] anIntArray764 = new int[4096];

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	public static void method7775() {
		Static301.method4738(10);
		Static435.method6665();
		System.gc();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg5 && arg0 == arg2 && arg7 == arg6 && arg4 == arg3) {
			Static491.method6548(arg2, arg1, arg8, arg4, arg6);
			return;
		}
		@Pc(32) int local32 = arg8;
		@Pc(34) int local34 = arg2;
		@Pc(38) int local38 = arg8 * 3;
		@Pc(42) int local42 = arg2 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg3 * 3;
		@Pc(68) int local68 = local46 + arg6 - arg8 - local54;
		@Pc(77) int local77 = local50 + arg4 - arg2 - local58;
		@Pc(87) int local87 = local38 + local54 - local46 - local46;
		@Pc(97) int local97 = local42 + local58 - local50 - local50;
		@Pc(102) int local102 = local46 - local38;
		@Pc(106) int local106 = local50 - local42;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local116 * local108 >> 12;
			@Pc(126) int local126 = local122 * local68;
			@Pc(130) int local130 = local77 * local122;
			@Pc(134) int local134 = local116 * local87;
			@Pc(138) int local138 = local116 * local97;
			@Pc(142) int local142 = local102 * local108;
			@Pc(146) int local146 = local108 * local106;
			@Pc(156) int local156 = (local142 + local126 + local134 >> 12) + arg8;
			@Pc(166) int local166 = (local146 + local130 + local138 >> 12) + arg2;
			Static491.method6548(local34, arg1, local32, local166, local156);
			local32 = local156;
			local34 = local166;
		}
	}
}
