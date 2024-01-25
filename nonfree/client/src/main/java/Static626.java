import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Z")
	public static boolean aBoolean718 = false;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public static final int anInt10362 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)B")
	public static byte method8456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method8457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg2 && arg5 == arg6 && arg8 == arg1 && arg3 == arg4) {
			Static400.method5532(arg8, arg2, arg5, arg0, arg3);
			return;
		}
		@Pc(44) int local44 = arg2;
		@Pc(46) int local46 = arg5;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(66) int local66 = arg1 * 3;
		@Pc(70) int local70 = arg4 * 3;
		@Pc(79) int local79 = arg8 + local58 - arg2 - local66;
		@Pc(89) int local89 = local62 + arg3 - arg5 - local70;
		@Pc(99) int local99 = local50 + local66 - local58 - local58;
		@Pc(109) int local109 = local70 + local54 - local62 - local62;
		@Pc(113) int local113 = local58 - local50;
		@Pc(118) int local118 = local62 - local54;
		for (@Pc(120) int local120 = 128; local120 <= 4096; local120 += 128) {
			@Pc(128) int local128 = local120 * local120 >> 12;
			@Pc(134) int local134 = local120 * local128 >> 12;
			@Pc(138) int local138 = local79 * local134;
			@Pc(142) int local142 = local89 * local134;
			@Pc(146) int local146 = local128 * local99;
			@Pc(150) int local150 = local109 * local128;
			@Pc(154) int local154 = local120 * local113;
			@Pc(158) int local158 = local118 * local120;
			@Pc(168) int local168 = (local154 + local138 + local146 >> 12) + arg2;
			@Pc(179) int local179 = arg5 + (local158 + local150 + local142 >> 12);
			Static400.method5532(local168, local44, local46, arg0, local179);
			local44 = local168;
			local46 = local179;
		}
	}
}
