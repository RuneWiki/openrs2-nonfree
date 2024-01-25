import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "J")
	public static long aLong189;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_168 = new Class81(46, 7);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIII)V")
	public static void method5199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(34) int local34 = arg0 << 1;
		@Pc(43) int local43 = local21 + local13 * (1 - local34);
		@Pc(52) int local52 = local17 - local25 * (local34 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg0 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg0 - 1);
		Static49.method990(Static277.anIntArrayArray40[arg3], arg4 + arg1, -arg4 + arg1, arg2);
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local68;
					local52 += local82;
					local68 += local60;
					local82 += local60;
					local7++;
				}
			}
			if (local52 < 0) {
				local43 += local68;
				local52 += local82;
				local82 += local60;
				local68 += local60;
				local7++;
			}
			local43 += -local88;
			local52 += -local76;
			local9--;
			local76 -= local56;
			local88 -= local56;
			@Pc(178) int local178 = arg3 - local9;
			@Pc(182) int local182 = local9 + arg3;
			@Pc(187) int local187 = arg1 + local7;
			@Pc(192) int local192 = arg1 - local7;
			Static49.method990(Static277.anIntArrayArray40[local178], local187, local192, arg2);
			Static49.method990(Static277.anIntArrayArray40[local182], local187, local192, arg2);
		}
	}
}
