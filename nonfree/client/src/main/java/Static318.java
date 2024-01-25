import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "[I")
	public static int[] anIntArray490;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg3 && arg7 == arg1 && arg6 == arg2 && arg5 == arg8) {
			Static132.method2559(arg2, arg7, arg8, arg4, arg0);
			return;
		}
		@Pc(34) int local34 = arg0;
		@Pc(36) int local36 = arg7;
		@Pc(40) int local40 = arg0 * 3;
		@Pc(44) int local44 = arg7 * 3;
		@Pc(48) int local48 = arg3 * 3;
		@Pc(52) int local52 = arg1 * 3;
		@Pc(56) int local56 = arg6 * 3;
		@Pc(60) int local60 = arg5 * 3;
		@Pc(69) int local69 = local48 + arg2 - local56 - arg0;
		@Pc(79) int local79 = local52 + arg8 - arg7 - local60;
		@Pc(88) int local88 = local40 + local56 - local48 - local48;
		@Pc(99) int local99 = local60 + local44 - local52 - local52;
		@Pc(104) int local104 = local48 - local40;
		@Pc(109) int local109 = local52 - local44;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local69 * local125;
			@Pc(133) int local133 = local79 * local125;
			@Pc(137) int local137 = local119 * local88;
			@Pc(141) int local141 = local119 * local99;
			@Pc(145) int local145 = local111 * local104;
			@Pc(149) int local149 = local111 * local109;
			@Pc(160) int local160 = (local129 + local137 + local145 >> 12) + arg0;
			@Pc(171) int local171 = arg7 + (local133 + local141 + local149 >> 12);
			Static132.method2559(local160, local36, local171, arg4, local34);
			local34 = local160;
			local36 = local171;
		}
	}
}
