import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uk", name = "L", descriptor = "F")
	public static float aFloat210;

	@OriginalMember(owner = "client!uk", name = "V", descriptor = "[I")
	public static int[] anIntArray544;

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "Lclient!pca;")
	public static Class251 aClass251_14 = null;

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "J")
	public static long aLong243 = -1L;

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
	public static final int anInt9487 = 0;

	@OriginalMember(owner = "client!uk", name = "W", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(JJ)J")
	public static long method7442(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIII)V")
	public static void method7445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg3 << 1) - 3);
		@Pc(77) int local77 = local55;
		Static504.method6755(arg0, arg4 + arg1, Static570.anIntArrayArray100[arg2], arg4 - arg1);
		@Pc(96) int local96 = (arg3 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local77 += local55;
					local63 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local77 += local55;
				local63 += local55;
				local7++;
			}
			local38 += -local96;
			local47 += -local71;
			local9--;
			local96 -= local51;
			local71 -= local51;
			@Pc(167) int local167 = arg2 - local9;
			@Pc(172) int local172 = arg2 + local9;
			@Pc(177) int local177 = arg4 + local7;
			@Pc(182) int local182 = arg4 - local7;
			Static504.method6755(arg0, local177, Static570.anIntArrayArray100[local167], local182);
			Static504.method6755(arg0, local177, Static570.anIntArrayArray100[local172], local182);
		}
	}
}
