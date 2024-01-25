import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "Lclient!io;")
	public static Class1_Sub20 aClass1_Sub20_4;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg6 && arg0 == arg1 && arg3 == arg7 && arg2 == arg5) {
			Static318.method4846(arg5, arg1, arg8, arg3, arg4);
			return;
		}
		@Pc(32) int local32 = arg8;
		@Pc(34) int local34 = arg1;
		@Pc(38) int local38 = arg8 * 3;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg2 * 3;
		@Pc(69) int local69 = arg3 + local46 - arg8 - local54;
		@Pc(78) int local78 = arg5 + local50 - local58 - arg1;
		@Pc(88) int local88 = local38 + local54 - local46 - local46;
		@Pc(99) int local99 = local58 + local42 - local50 - local50;
		@Pc(104) int local104 = local46 - local38;
		@Pc(109) int local109 = local50 - local42;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local119 * local111 >> 12;
			@Pc(129) int local129 = local69 * local125;
			@Pc(133) int local133 = local78 * local125;
			@Pc(137) int local137 = local119 * local88;
			@Pc(141) int local141 = local99 * local119;
			@Pc(145) int local145 = local104 * local111;
			@Pc(149) int local149 = local111 * local109;
			@Pc(160) int local160 = (local145 + local129 + local137 >> 12) + arg8;
			@Pc(170) int local170 = (local141 + local133 + local149 >> 12) + arg1;
			Static318.method4846(local170, local34, local32, local160, arg4);
			local34 = local170;
			local32 = local160;
		}
	}
}
