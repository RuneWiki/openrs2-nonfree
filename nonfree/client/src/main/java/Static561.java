import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!la;")
	public static Class207 aClass207_118;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_104 = new Class46(38, 8);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method8139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg2 && arg6 == arg0 && arg8 == arg7 && arg5 == arg1) {
			Static556.method8104(arg7, arg2, arg3, arg1, arg0);
			return;
		}
		@Pc(23) int local23 = arg2;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg2 * 3;
		@Pc(33) int local33 = arg0 * 3;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg6 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(58) int local58 = arg7 + local37 - local45 - arg2;
		@Pc(68) int local68 = arg1 + local41 - local49 - arg0;
		@Pc(77) int local77 = local45 + local29 - local37 - local37;
		@Pc(88) int local88 = local49 + local33 - local41 - local41;
		@Pc(93) int local93 = local37 - local29;
		@Pc(98) int local98 = local41 - local33;
		for (@Pc(100) int local100 = 128; local100 <= 4096; local100 += 128) {
			@Pc(108) int local108 = local100 * local100 >> 12;
			@Pc(114) int local114 = local100 * local108 >> 12;
			@Pc(118) int local118 = local58 * local114;
			@Pc(122) int local122 = local114 * local68;
			@Pc(126) int local126 = local108 * local77;
			@Pc(130) int local130 = local108 * local88;
			@Pc(134) int local134 = local93 * local100;
			@Pc(138) int local138 = local100 * local98;
			@Pc(149) int local149 = arg2 + (local118 + local126 + local134 >> 12);
			@Pc(160) int local160 = (local122 + local130 + local138 >> 12) + arg0;
			Static556.method8104(local149, local23, arg3, local160, local25);
			local23 = local149;
			local25 = local160;
		}
	}
}
