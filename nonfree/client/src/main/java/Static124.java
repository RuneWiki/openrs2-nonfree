import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!et", name = "f", descriptor = "Lclient!kv;")
	public static Class80 aClass80_4;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "[[Lclient!ub;")
	public static Class1_Sub4[][] aClass1_Sub4ArrayArray4;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_219 = new Class362(84, 6);

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	public static int anInt9777 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg1 && arg7 == arg3 && arg6 == arg8 && arg0 == arg2) {
			Static393.method6222(arg5, arg8, arg4, arg3, arg2);
			return;
		}
		@Pc(31) int local31 = arg4;
		@Pc(33) int local33 = arg3;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg1 * 3;
		@Pc(49) int local49 = arg7 * 3;
		@Pc(53) int local53 = arg6 * 3;
		@Pc(57) int local57 = arg0 * 3;
		@Pc(67) int local67 = local45 + arg8 - arg4 - local53;
		@Pc(77) int local77 = arg2 + local49 - local57 - arg3;
		@Pc(87) int local87 = local37 + local53 - local45 - local45;
		@Pc(96) int local96 = local57 + local41 - local49 - local49;
		@Pc(101) int local101 = local45 - local37;
		@Pc(105) int local105 = local49 - local41;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local107 * local115 >> 12;
			@Pc(125) int local125 = local121 * local67;
			@Pc(129) int local129 = local121 * local77;
			@Pc(133) int local133 = local115 * local87;
			@Pc(137) int local137 = local96 * local115;
			@Pc(141) int local141 = local101 * local107;
			@Pc(145) int local145 = local107 * local105;
			@Pc(157) int local157 = arg4 + (local141 + local125 + local133 >> 12);
			@Pc(168) int local168 = (local129 + local137 + local145 >> 12) + arg3;
			Static393.method6222(arg5, local157, local31, local33, local168);
			local33 = local168;
			local31 = local157;
		}
	}
}
