import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_183 = new Class268(30, -1);

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lclient!qg;")
	public static Class271 aClass271_17 = null;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
	public static int anInt10329 = 0;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIII)V")
	public static void method8734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = ((arg2 << 1) - 3) * local25;
		@Pc(76) int local76 = local54;
		@Pc(82) int local82 = local50 * (arg2 - 1);
		Static312.method5228(arg4, Static484.anIntArrayArray41[arg1], arg3 + arg0, -arg3 + arg0);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local62;
					local46 += local76;
					local62 += local54;
					local7++;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local46 += local76;
				local37 += local62;
				local7++;
				local76 += local54;
				local62 += local54;
			}
			local46 += -local70;
			local37 += -local82;
			local9--;
			local70 -= local50;
			local82 -= local50;
			@Pc(169) int local169 = arg1 - local9;
			@Pc(174) int local174 = arg1 + local9;
			@Pc(178) int local178 = local7 + arg0;
			@Pc(183) int local183 = arg0 - local7;
			Static312.method5228(arg4, Static484.anIntArrayArray41[local169], local178, local183);
			Static312.method5228(arg4, Static484.anIntArrayArray41[local174], local178, local183);
		}
	}
}
