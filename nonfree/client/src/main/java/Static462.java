import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
	public static int anInt8534 = 0;

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "[I")
	public static final int[] anIntArray717 = new int[1];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method7141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg7 && arg6 == arg1 && arg0 == arg5 && arg4 == arg3) {
			Static162.method3293(arg5, arg4, arg7, arg2, arg6);
			return;
		}
		@Pc(23) int local23 = arg7;
		@Pc(25) int local25 = arg6;
		@Pc(29) int local29 = arg7 * 3;
		@Pc(33) int local33 = arg6 * 3;
		@Pc(37) int local37 = arg8 * 3;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(45) int local45 = arg0 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(58) int local58 = local37 + arg5 - arg7 - local45;
		@Pc(69) int local69 = arg4 + local41 - local49 - arg6;
		@Pc(79) int local79 = local29 + local45 - local37 - local37;
		@Pc(88) int local88 = local49 + local33 - local41 - local41;
		@Pc(93) int local93 = local37 - local29;
		@Pc(98) int local98 = local41 - local33;
		for (@Pc(100) int local100 = 128; local100 <= 4096; local100 += 128) {
			@Pc(108) int local108 = local100 * local100 >> 12;
			@Pc(114) int local114 = local100 * local108 >> 12;
			@Pc(118) int local118 = local58 * local114;
			@Pc(122) int local122 = local114 * local69;
			@Pc(126) int local126 = local79 * local108;
			@Pc(130) int local130 = local108 * local88;
			@Pc(134) int local134 = local93 * local100;
			@Pc(138) int local138 = local98 * local100;
			@Pc(148) int local148 = (local134 + local126 + local118 >> 12) + arg7;
			@Pc(161) int local161 = arg6 + (local122 + local130 + local138 >> 12);
			Static162.method3293(local148, local161, local23, arg2, local25);
			local23 = local148;
			local25 = local161;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method7143(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static79.method8202(arg0);
	}
}
