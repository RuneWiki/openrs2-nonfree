import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!aq;")
	public static Class17 aClass17_3;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	public static int anInt6993 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method5825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg3 && arg7 == arg5 && arg6 == arg1 && arg4 == arg0) {
			Static283.method2973(arg0, arg1, arg8, arg5, arg3);
			return;
		}
		@Pc(19) int local19 = arg3;
		@Pc(21) int local21 = arg5;
		@Pc(25) int local25 = arg3 * 3;
		@Pc(29) int local29 = arg5 * 3;
		@Pc(33) int local33 = arg2 * 3;
		@Pc(37) int local37 = arg7 * 3;
		@Pc(41) int local41 = arg6 * 3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(55) int local55 = local33 + arg1 - arg3 - local41;
		@Pc(65) int local65 = local37 + arg0 - arg5 - local45;
		@Pc(74) int local74 = local41 + local25 - local33 - local33;
		@Pc(84) int local84 = local45 + local29 - local37 - local37;
		@Pc(89) int local89 = local33 - local25;
		@Pc(93) int local93 = local37 - local29;
		for (@Pc(95) int local95 = 128; local95 <= 4096; local95 += 128) {
			@Pc(103) int local103 = local95 * local95 >> 12;
			@Pc(109) int local109 = local95 * local103 >> 12;
			@Pc(113) int local113 = local109 * local55;
			@Pc(117) int local117 = local109 * local65;
			@Pc(121) int local121 = local74 * local103;
			@Pc(125) int local125 = local103 * local84;
			@Pc(129) int local129 = local95 * local89;
			@Pc(133) int local133 = local93 * local95;
			@Pc(143) int local143 = (local129 + local121 + local113 >> 12) + arg3;
			@Pc(154) int local154 = (local125 + local117 + local133 >> 12) + arg5;
			Static283.method2973(local154, local143, arg8, local21, local19);
			local19 = local143;
			local21 = local154;
		}
	}
}
