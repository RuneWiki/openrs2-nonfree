import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg7 && arg2 == arg4 && arg3 == arg8 && arg1 == arg0) {
			Static103.method7655(arg6, arg7, arg2, arg1, arg3);
			return;
		}
		@Pc(44) int local44 = arg7;
		@Pc(46) int local46 = arg2;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(62) int local62 = arg4 * 3;
		@Pc(66) int local66 = arg8 * 3;
		@Pc(70) int local70 = arg0 * 3;
		@Pc(78) int local78 = local58 + arg3 - local66 - arg7;
		@Pc(86) int local86 = local62 + arg1 - local70 - arg2;
		@Pc(94) int local94 = local50 + local66 - local58 - local58;
		@Pc(104) int local104 = local54 + local70 - local62 - local62;
		@Pc(109) int local109 = local58 - local50;
		@Pc(113) int local113 = local62 - local54;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local123 * local115 >> 12;
			@Pc(133) int local133 = local78 * local129;
			@Pc(137) int local137 = local86 * local129;
			@Pc(141) int local141 = local94 * local123;
			@Pc(145) int local145 = local123 * local104;
			@Pc(149) int local149 = local109 * local115;
			@Pc(153) int local153 = local115 * local113;
			@Pc(165) int local165 = arg7 + (local133 + local141 + local149 >> 12);
			@Pc(176) int local176 = arg2 + (local153 + local137 + local145 >> 12);
			Static103.method7655(arg6, local44, local46, local176, local165);
			local46 = local176;
			local44 = local165;
		}
	}
}
