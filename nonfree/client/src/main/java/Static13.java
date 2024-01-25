import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "yb", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V")
	public static void method360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(39) int local39 = arg0 << 1;
		@Pc(47) int local47 = local21 + local13 * (1 - local39);
		@Pc(56) int local56 = local17 - local25 * (local39 - 1);
		@Pc(60) int local60 = local13 << 2;
		@Pc(64) int local64 = local17 << 2;
		@Pc(72) int local72 = local21 * 3;
		@Pc(80) int local80 = local25 * ((arg0 << 1) - 3);
		@Pc(86) int local86 = local64;
		@Pc(92) int local92 = local60 * (arg0 - 1);
		Static260.method3979(arg2, arg3 - arg4, Static267.anIntArrayArray20[arg1], arg4 + arg3);
		while (local9 > 0) {
			if (local47 < 0) {
				while (local47 < 0) {
					local56 += local86;
					local47 += local72;
					local7++;
					local86 += local64;
					local72 += local64;
				}
			}
			if (local56 < 0) {
				local56 += local86;
				local47 += local72;
				local72 += local64;
				local86 += local64;
				local7++;
			}
			local56 += -local80;
			local47 += -local92;
			local9--;
			local92 -= local60;
			local80 -= local60;
			@Pc(176) int local176 = arg1 - local9;
			@Pc(180) int local180 = local9 + arg1;
			@Pc(184) int local184 = local7 + arg3;
			@Pc(189) int local189 = arg3 - local7;
			Static260.method3979(arg2, local189, Static267.anIntArrayArray20[local176], local184);
			Static260.method3979(arg2, local189, Static267.anIntArrayArray20[local180], local184);
		}
	}
}
