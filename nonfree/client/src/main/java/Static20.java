import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "[Lclient!bd;")
	public static final Class11[] aClass11Array1 = new Class11[50];

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_158 = Static81.method1507(" )2>");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg1 && arg3 == arg4 && arg7 == arg5 && arg2 == arg0) {
			Static117.method2008(arg4, arg7, arg0, arg6, arg1);
			return;
		}
		@Pc(31) int local31 = arg1;
		@Pc(33) int local33 = arg4;
		@Pc(37) int local37 = arg1 * 3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(53) int local53 = arg3 * 3;
		@Pc(57) int local57 = arg2 * 3;
		@Pc(67) int local67 = local45 + arg7 - arg1 - local49;
		@Pc(76) int local76 = local49 + local37 - local45 - local45;
		@Pc(85) int local85 = arg0 + local53 - local57 - arg4;
		@Pc(95) int local95 = local41 + local57 - local53 - local53;
		@Pc(100) int local100 = local53 - local41;
		@Pc(105) int local105 = local45 - local37;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local107 * local115 >> 12;
			@Pc(125) int local125 = local67 * local121;
			@Pc(129) int local129 = local115 * local95;
			@Pc(133) int local133 = local115 * local76;
			@Pc(137) int local137 = local121 * local85;
			@Pc(141) int local141 = local105 * local107;
			@Pc(145) int local145 = local100 * local107;
			@Pc(156) int local156 = (local141 + local125 + local133 >> 12) + arg1;
			@Pc(168) int local168 = arg4 + (local129 + local137 + local145 >> 12);
			Static117.method2008(local33, local156, local168, arg6, local31);
			local33 = local168;
			local31 = local156;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I")
	public static int method438(@OriginalArg(1) int arg0) {
		if (Static107.anInt2426 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}
}
