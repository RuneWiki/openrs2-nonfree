import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!cc;")
	public static Class45 aClass45_6;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt6451 = 0;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_93 = new Class98(110, -1);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5194(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg3 && arg1 == arg2 && arg0 == arg7 && arg4 == arg8) {
			Static481.method6774(arg6, arg0, arg5, arg4, arg2);
			return;
		}
		@Pc(43) int local43 = arg5;
		@Pc(45) int local45 = arg2;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(53) int local53 = arg2 * 3;
		@Pc(57) int local57 = arg3 * 3;
		@Pc(61) int local61 = arg1 * 3;
		@Pc(65) int local65 = arg7 * 3;
		@Pc(69) int local69 = arg8 * 3;
		@Pc(79) int local79 = local57 + arg0 - arg5 - local65;
		@Pc(89) int local89 = arg4 + local61 - local69 - arg2;
		@Pc(99) int local99 = local65 + local49 - local57 - local57;
		@Pc(109) int local109 = local53 + local69 - local61 - local61;
		@Pc(113) int local113 = local57 - local49;
		@Pc(118) int local118 = local61 - local53;
		for (@Pc(120) int local120 = 128; local120 <= 4096; local120 += 128) {
			@Pc(128) int local128 = local120 * local120 >> 12;
			@Pc(134) int local134 = local120 * local128 >> 12;
			@Pc(138) int local138 = local79 * local134;
			@Pc(142) int local142 = local134 * local89;
			@Pc(146) int local146 = local128 * local99;
			@Pc(150) int local150 = local109 * local128;
			@Pc(154) int local154 = local120 * local113;
			@Pc(158) int local158 = local118 * local120;
			@Pc(168) int local168 = (local146 + local138 + local154 >> 12) + arg5;
			@Pc(178) int local178 = arg2 + (local150 + local142 + local158 >> 12);
			Static481.method6774(arg6, local168, local43, local178, local45);
			local45 = local178;
			local43 = local168;
		}
	}
}
