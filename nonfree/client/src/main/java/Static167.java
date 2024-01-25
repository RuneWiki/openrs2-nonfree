import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_54 = new Class337(34, 0);

	@OriginalMember(owner = "client!ga", name = "hb", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_33 = new Class46(59, -1);

	@OriginalMember(owner = "client!ga", name = "jb", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_91 = new Class87(4);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(CB)Z")
	public static boolean method2461(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIIIII)V")
	public static void method2475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(43) int local43 = local21 + local13 * (1 - local29);
		@Pc(52) int local52 = local17 - local25 * (local29 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg1 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		Static491.method7219(Static249.anIntArrayArray23[arg0], arg4 - arg3, arg2, arg4 + arg3);
		@Pc(101) int local101 = (arg1 - 1) * local56;
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local68;
					local52 += local82;
					local82 += local60;
					local68 += local60;
					local7++;
				}
			}
			if (local52 < 0) {
				local43 += local68;
				local52 += local82;
				local7++;
				local82 += local60;
				local68 += local60;
			}
			local43 += -local101;
			local52 += -local76;
			local9--;
			local76 -= local56;
			local101 -= local56;
			@Pc(172) int local172 = arg0 - local9;
			@Pc(176) int local176 = arg0 + local9;
			@Pc(181) int local181 = arg4 + local7;
			@Pc(186) int local186 = arg4 - local7;
			Static491.method7219(Static249.anIntArrayArray23[local172], local186, arg2, local181);
			Static491.method7219(Static249.anIntArrayArray23[local176], local186, arg2, local181);
		}
	}
}
