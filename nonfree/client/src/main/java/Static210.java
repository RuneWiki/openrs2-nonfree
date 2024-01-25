import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
	public static int anInt4419;

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
	public static int anInt4421 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIII)V")
	public static void method3840(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(80) int local80 = local25 * ((arg1 << 1) - 3);
		@Pc(86) int local86 = local54;
		@Pc(104) int local104;
		@Pc(113) int local113;
		if (arg0 >= Static96.anInt2302 && arg0 <= Static289.anInt5545) {
			local104 = Static501.method4264(arg3 + arg2, Class179_Sub2.lb, Static376.anInt7071);
			local113 = Static501.method4264(arg3 - arg2, Class179_Sub2.lb, Static376.anInt7071);
			Static115.method2332(local113, local104, arg4, Static183.anIntArrayArray26[arg0]);
		}
		@Pc(127) int local127 = local50 * (arg1 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local46 += local86;
					local38 += local62;
					local62 += local54;
					local7++;
					local86 += local54;
				}
			}
			if (local46 < 0) {
				local38 += local62;
				local46 += local86;
				local62 += local54;
				local7++;
				local86 += local54;
			}
			local46 += -local80;
			local38 += -local127;
			local9--;
			local127 -= local50;
			local80 -= local50;
			local104 = arg0 - local9;
			local113 = arg0 + local9;
			if (local113 >= Static96.anInt2302 && local104 <= Static289.anInt5545) {
				@Pc(219) int local219 = Static501.method4264(local7 + arg3, Class179_Sub2.lb, Static376.anInt7071);
				@Pc(228) int local228 = Static501.method4264(arg3 - local7, Class179_Sub2.lb, Static376.anInt7071);
				if (Static96.anInt2302 <= local104) {
					Static115.method2332(local228, local219, arg4, Static183.anIntArrayArray26[local104]);
				}
				if (Static289.anInt5545 >= local113) {
					Static115.method2332(local228, local219, arg4, Static183.anIntArrayArray26[local113]);
				}
			}
		}
	}
}
