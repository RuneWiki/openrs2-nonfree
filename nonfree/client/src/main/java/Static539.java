import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "[I")
	public static final int[] anIntArray540 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ufa", name = "n", descriptor = "[I")
	public static final int[] anIntArray541 = new int[14];

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method7377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg1 && arg0 == arg4 && arg7 == arg3 && arg2 == arg5) {
			Static410.method5765(arg4, arg6, arg2, arg1, arg7);
			return;
		}
		@Pc(32) int local32 = arg1;
		@Pc(34) int local34 = arg4;
		@Pc(38) int local38 = arg1 * 3;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg8 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(68) int local68 = local46 + arg7 - arg1 - local54;
		@Pc(78) int local78 = local50 + arg2 - local58 - arg4;
		@Pc(87) int local87 = local38 + local54 - local46 - local46;
		@Pc(96) int local96 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local46 - local38;
		@Pc(106) int local106 = local50 - local42;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local116 * local108 >> 12;
			@Pc(126) int local126 = local122 * local68;
			@Pc(130) int local130 = local122 * local78;
			@Pc(134) int local134 = local116 * local87;
			@Pc(138) int local138 = local116 * local96;
			@Pc(142) int local142 = local108 * local101;
			@Pc(146) int local146 = local108 * local106;
			@Pc(156) int local156 = (local142 + local134 + local126 >> 12) + arg1;
			@Pc(166) int local166 = (local146 + local138 + local130 >> 12) + arg4;
			Static410.method5765(local34, arg6, local166, local32, local156);
			local32 = local156;
			local34 = local166;
		}
	}
}
