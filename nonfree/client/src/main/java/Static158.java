import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "[I")
	public static final int[] anIntArray216 = new int[200];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIBIII)V")
	public static void method2225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = ((arg3 << 1) - 3) * local25;
		@Pc(76) int local76 = local54;
		@Pc(82) int local82 = (arg3 - 1) * local50;
		Static236.method3990(arg0 + arg4, -arg4 + arg0, Static400.anIntArrayArray54[arg2], arg1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local62;
					local46 += local76;
					local62 += local54;
					local7++;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local38 += local62;
				local46 += local76;
				local7++;
				local62 += local54;
				local76 += local54;
			}
			local46 += -local70;
			local38 += -local82;
			local70 -= local50;
			local9--;
			local82 -= local50;
			@Pc(181) int local181 = arg2 - local9;
			@Pc(185) int local185 = arg2 + local9;
			@Pc(189) int local189 = local7 + arg0;
			@Pc(194) int local194 = arg0 - local7;
			Static236.method3990(local189, local194, Static400.anIntArrayArray54[local181], arg1);
			Static236.method3990(local189, local194, Static400.anIntArrayArray54[local185], arg1);
		}
	}
}
