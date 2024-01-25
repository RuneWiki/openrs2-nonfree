import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
	public static int anInt1713;

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_20 = new Class6(47, -1);

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "Lclient!lb;")
	public static final Class174 aClass174_4 = new Class174(8);

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
	public static final int anInt1714 = 1403;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
	public static void method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg1 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		Static227.method7421(arg2 - arg3, arg4, arg2 + arg3, Static81.anIntArrayArray25[arg0]);
		@Pc(98) int local98 = (arg1 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local7++;
					local63 += local55;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local77 += local55;
				local7++;
				local63 += local55;
			}
			local38 += -local98;
			local47 += -local71;
			local9--;
			local71 -= local51;
			local98 -= local51;
			@Pc(169) int local169 = arg0 - local9;
			@Pc(173) int local173 = local9 + arg0;
			@Pc(178) int local178 = arg2 + local7;
			@Pc(183) int local183 = arg2 - local7;
			Static227.method7421(local183, arg4, local178, Static81.anIntArrayArray25[local169]);
			Static227.method7421(local183, arg4, local178, Static81.anIntArrayArray25[local173]);
		}
	}
}
