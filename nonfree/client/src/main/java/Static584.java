import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg4 && arg1 == arg7 && arg8 == arg0 && arg3 == arg5) {
			Static542.method7185(arg4, arg1, arg6, arg3, arg8);
			return;
		}
		@Pc(44) int local44 = arg4;
		@Pc(46) int local46 = arg1;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg2 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(66) int local66 = arg0 * 3;
		@Pc(70) int local70 = arg5 * 3;
		@Pc(79) int local79 = local58 + arg8 - arg4 - local66;
		@Pc(89) int local89 = local62 + arg3 - local70 - arg1;
		@Pc(98) int local98 = local50 + local66 - local58 - local58;
		@Pc(108) int local108 = local70 + local54 - local62 - local62;
		@Pc(113) int local113 = local58 - local50;
		@Pc(118) int local118 = local62 - local54;
		for (@Pc(120) int local120 = 128; local120 <= 4096; local120 += 128) {
			@Pc(128) int local128 = local120 * local120 >> 12;
			@Pc(134) int local134 = local128 * local120 >> 12;
			@Pc(138) int local138 = local134 * local79;
			@Pc(142) int local142 = local89 * local134;
			@Pc(146) int local146 = local128 * local98;
			@Pc(150) int local150 = local128 * local108;
			@Pc(154) int local154 = local113 * local120;
			@Pc(158) int local158 = local120 * local118;
			@Pc(169) int local169 = arg4 + (local154 + local138 + local146 >> 12);
			@Pc(180) int local180 = arg1 + (local158 + local150 + local142 >> 12);
			Static542.method7185(local44, local46, arg6, local180, local169);
			local44 = local169;
			local46 = local180;
		}
	}
}
