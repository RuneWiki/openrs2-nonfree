import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_109 = new Class93("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
	public static final int[] anIntArray469 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIII)V")
	public static void method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg4 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		Static205.method3670(arg2, arg3 + arg1, Static146.anIntArrayArray91[arg0], arg3 - arg1);
		@Pc(102) int local102 = (arg4 - 1) * local51;
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local68;
					local47 += local82;
					local82 += local60;
					local68 += local60;
					local7++;
				}
			}
			if (local47 < 0) {
				local47 += local82;
				local39 += local68;
				local68 += local60;
				local7++;
				local82 += local60;
			}
			local39 += -local102;
			local47 += -local76;
			local76 -= local51;
			local9--;
			local102 -= local51;
			@Pc(176) int local176 = arg0 - local9;
			@Pc(180) int local180 = arg0 + local9;
			@Pc(184) int local184 = arg3 + local7;
			@Pc(189) int local189 = arg3 - local7;
			Static205.method3670(arg2, local184, Static146.anIntArrayArray91[local176], local189);
			Static205.method3670(arg2, local184, Static146.anIntArrayArray91[local180], local189);
		}
	}
}
