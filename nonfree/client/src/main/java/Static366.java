import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
	public static int anInt7070;

	@OriginalMember(owner = "client!oaa", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!oaa", name = "K", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_100 = new Class90(98, 12);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIZIIIIII)V")
	public static void method5525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg7 && arg8 == arg0 && arg3 == arg4 && arg2 == arg6) {
			Static390.method6008(arg5, arg2, arg8, arg3, arg1);
			return;
		}
		@Pc(29) int local29 = arg1;
		@Pc(31) int local31 = arg8;
		@Pc(35) int local35 = arg1 * 3;
		@Pc(39) int local39 = arg8 * 3;
		@Pc(43) int local43 = arg7 * 3;
		@Pc(47) int local47 = arg0 * 3;
		@Pc(51) int local51 = arg4 * 3;
		@Pc(55) int local55 = arg6 * 3;
		@Pc(65) int local65 = local43 + arg3 - arg1 - local51;
		@Pc(75) int local75 = arg2 + local47 - local55 - arg8;
		@Pc(84) int local84 = local51 + local35 - local43 - local43;
		@Pc(92) int local92 = local55 + local39 - local47 - local47;
		@Pc(97) int local97 = local43 - local35;
		@Pc(102) int local102 = local47 - local39;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local104 * local112 >> 12;
			@Pc(122) int local122 = local65 * local118;
			@Pc(126) int local126 = local75 * local118;
			@Pc(130) int local130 = local84 * local112;
			@Pc(134) int local134 = local112 * local92;
			@Pc(138) int local138 = local104 * local97;
			@Pc(142) int local142 = local104 * local102;
			@Pc(153) int local153 = (local122 + local130 + local138 >> 12) + arg1;
			@Pc(164) int local164 = arg8 + (local142 + local126 + local134 >> 12);
			Static390.method6008(arg5, local164, local31, local153, local29);
			local31 = local164;
			local29 = local153;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)I")
	public static int method5529(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
