import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "[I")
	public static final int[] anIntArray447 = new int[500];

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method4790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg1 && arg5 == arg7 && arg3 == arg6 && arg4 == arg0) {
			Static60.method912(arg6, arg1, arg7, arg4, arg8);
			return;
		}
		@Pc(23) int local23 = arg1;
		@Pc(25) int local25 = arg7;
		@Pc(29) int local29 = arg1 * 3;
		@Pc(33) int local33 = arg7 * 3;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(59) int local59 = arg6 + local37 - local45 - arg1;
		@Pc(68) int local68 = arg4 + local41 - local49 - arg7;
		@Pc(77) int local77 = local45 + local29 - local37 - local37;
		@Pc(85) int local85 = local33 + local49 - local41 - local41;
		@Pc(90) int local90 = local37 - local29;
		@Pc(95) int local95 = local41 - local33;
		for (@Pc(97) int local97 = 128; local97 <= 4096; local97 += 128) {
			@Pc(105) int local105 = local97 * local97 >> 12;
			@Pc(111) int local111 = local97 * local105 >> 12;
			@Pc(115) int local115 = local111 * local59;
			@Pc(119) int local119 = local68 * local111;
			@Pc(123) int local123 = local105 * local77;
			@Pc(127) int local127 = local85 * local105;
			@Pc(131) int local131 = local90 * local97;
			@Pc(135) int local135 = local97 * local95;
			@Pc(147) int local147 = (local115 + local123 + local131 >> 12) + arg1;
			@Pc(157) int local157 = arg7 + (local135 + local119 + local127 >> 12);
			Static60.method912(local147, local23, local25, local157, arg8);
			local23 = local147;
			local25 = local157;
		}
	}
}
