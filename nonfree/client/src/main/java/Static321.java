import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "Lclient!ca;")
	public static final Class39 aClass39_4 = new Class39();

	@OriginalMember(owner = "client!mea", name = "s", descriptor = "Lclient!tc;")
	public static Class305 aClass305_8 = null;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BI)V")
	public static void method5542(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub6 local13 = Static367.method6025(10, arg0);
		local13.method1896();
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIIIII)V")
	public static void method5544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg0 << 1) - 3);
		@Pc(76) int local76 = local54;
		Static426.method6794(arg3 + arg1, Static333.anIntArrayArray56[arg2], arg3 - arg1, arg4);
		@Pc(100) int local100 = local50 * (arg0 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local46 += local76;
					local38 += local62;
					local7++;
					local62 += local54;
					local76 += local54;
				}
			}
			if (local46 < 0) {
				local46 += local76;
				local38 += local62;
				local62 += local54;
				local76 += local54;
				local7++;
			}
			local46 += -local70;
			local38 += -local100;
			local100 -= local50;
			local9--;
			local70 -= local50;
			@Pc(174) int local174 = arg2 - local9;
			@Pc(179) int local179 = arg2 + local9;
			@Pc(183) int local183 = local7 + arg3;
			@Pc(188) int local188 = arg3 - local7;
			Static426.method6794(local183, Static333.anIntArrayArray56[local174], local188, arg4);
			Static426.method6794(local183, Static333.anIntArrayArray56[local179], local188, arg4);
		}
	}
}
