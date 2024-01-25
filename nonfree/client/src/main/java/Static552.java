import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!to", name = "d", descriptor = "Lclient!fga;")
	public static final Class108 aClass108_24 = new Class108();

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	public static int anInt9113 = -2;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method7660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg5 && arg7 == arg0 && arg8 == arg4 && arg2 == arg1) {
			Static542.method7602(arg3, arg6, arg2, arg8, arg0);
			return;
		}
		@Pc(21) int local21 = arg3;
		@Pc(23) int local23 = arg0;
		@Pc(27) int local27 = arg3 * 3;
		@Pc(31) int local31 = arg0 * 3;
		@Pc(35) int local35 = arg5 * 3;
		@Pc(39) int local39 = arg7 * 3;
		@Pc(43) int local43 = arg4 * 3;
		@Pc(47) int local47 = arg1 * 3;
		@Pc(57) int local57 = local35 + arg8 - arg3 - local43;
		@Pc(66) int local66 = local39 + arg2 - arg0 - local47;
		@Pc(75) int local75 = local43 + local27 - local35 - local35;
		@Pc(85) int local85 = local47 + local31 - local39 - local39;
		@Pc(90) int local90 = local35 - local27;
		@Pc(95) int local95 = local39 - local31;
		for (@Pc(97) int local97 = 128; local97 <= 4096; local97 += 128) {
			@Pc(104) int local104 = local97 * local97 >> 12;
			@Pc(110) int local110 = local104 * local97 >> 12;
			@Pc(114) int local114 = local110 * local57;
			@Pc(118) int local118 = local66 * local110;
			@Pc(122) int local122 = local75 * local104;
			@Pc(126) int local126 = local104 * local85;
			@Pc(130) int local130 = local90 * local97;
			@Pc(134) int local134 = local97 * local95;
			@Pc(144) int local144 = (local130 + local114 + local122 >> 12) + arg3;
			@Pc(154) int local154 = (local134 + local126 + local118 >> 12) + arg0;
			Static542.method7602(local21, arg6, local154, local144, local23);
			local21 = local144;
			local23 = local154;
		}
	}
}
