import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!tr;")
	public static Class241 aClass241_6;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public static int anInt6206 = 0;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!hv;")
	public static Class3_Sub23 aClass3_Sub23_2 = null;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public static int anInt6208 = 0;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
	public static final int anInt6209 = 1406;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZIIII)V")
	public static void method5114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg3 << 1) - 3);
		@Pc(76) int local76 = local54;
		@Pc(82) int local82 = local50 * (arg3 - 1);
		Static201.method3084(Static296.anIntArrayArray42[arg2], arg4 - arg1, arg1 + arg4, arg0);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local62;
					local46 += local76;
					local7++;
					local76 += local54;
					local62 += local54;
				}
			}
			if (local46 < 0) {
				local46 += local76;
				local38 += local62;
				local7++;
				local76 += local54;
				local62 += local54;
			}
			local46 += -local70;
			local38 += -local82;
			local9--;
			local82 -= local50;
			local70 -= local50;
			@Pc(175) int local175 = arg2 - local9;
			@Pc(180) int local180 = arg2 + local9;
			@Pc(184) int local184 = arg4 + local7;
			@Pc(188) int local188 = arg4 - local7;
			Static201.method3084(Static296.anIntArrayArray42[local175], local188, local184, arg0);
			Static201.method3084(Static296.anIntArrayArray42[local180], local188, local184, arg0);
		}
	}
}
