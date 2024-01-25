import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!nba;")
	public static final Class215 aClass215_3 = new Class215();

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_114 = new Class73(38, 9);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method5253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg6 && arg5 == arg8 && arg0 == arg2 && arg7 == arg1) {
			Static188.method3420(arg1, arg3, arg4, arg0, arg8);
			return;
		}
		@Pc(32) int local32 = arg3;
		@Pc(34) int local34 = arg8;
		@Pc(38) int local38 = arg3 * 3;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg5 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(67) int local67 = arg0 + local46 - local54 - arg3;
		@Pc(77) int local77 = arg1 + local50 - arg8 - local58;
		@Pc(87) int local87 = local54 + local38 - local46 - local46;
		@Pc(96) int local96 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local46 - local38;
		@Pc(106) int local106 = local50 - local42;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local108 * local116 >> 12;
			@Pc(126) int local126 = local122 * local67;
			@Pc(130) int local130 = local122 * local77;
			@Pc(134) int local134 = local116 * local87;
			@Pc(138) int local138 = local116 * local96;
			@Pc(142) int local142 = local108 * local101;
			@Pc(146) int local146 = local106 * local108;
			@Pc(157) int local157 = arg3 + (local142 + local134 + local126 >> 12);
			@Pc(168) int local168 = (local130 + local138 + local146 >> 12) + arg8;
			Static188.method3420(local168, local32, arg4, local157, local34);
			local34 = local168;
			local32 = local157;
		}
	}
}
