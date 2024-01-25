import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array18;

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
	public static final int anInt8217 = 1401;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg4 && arg2 == arg0 && arg5 == arg8 && arg6 == arg3) {
			Static217.method3480(arg6, arg8, arg0, arg1, arg4);
			return;
		}
		@Pc(31) int local31 = arg4;
		@Pc(33) int local33 = arg0;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg0 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(57) int local57 = arg3 * 3;
		@Pc(67) int local67 = arg8 + local45 - arg4 - local53;
		@Pc(77) int local77 = local49 + arg6 - local57 - arg0;
		@Pc(87) int local87 = local53 + local37 - local45 - local45;
		@Pc(97) int local97 = local57 + local41 - local49 - local49;
		@Pc(101) int local101 = local45 - local37;
		@Pc(105) int local105 = local49 - local41;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local107 * local115 >> 12;
			@Pc(125) int local125 = local67 * local121;
			@Pc(129) int local129 = local121 * local77;
			@Pc(133) int local133 = local115 * local87;
			@Pc(137) int local137 = local97 * local115;
			@Pc(141) int local141 = local101 * local107;
			@Pc(145) int local145 = local107 * local105;
			@Pc(157) int local157 = (local125 + local133 + local141 >> 12) + arg4;
			@Pc(168) int local168 = arg0 + (local145 + local129 + local137 >> 12);
			Static217.method3480(local168, local157, local33, arg1, local31);
			local33 = local168;
			local31 = local157;
		}
	}
}
