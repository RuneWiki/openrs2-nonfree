import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
	public static int anInt3265;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public static int anInt3259 = 0;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public static int anInt3261 = 0;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "[I")
	public static int[] anIntArray278 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
	public static void method2817(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static213.anInt4452 = arg1;
		Static98.anInt2007 = 0;
		Static11.anInt170 = arg0;
		Static29.anInt517 = 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIBII)V")
	public static void method2819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local13 << 1;
		@Pc(25) int local25 = local17 << 1;
		@Pc(34) int local34 = arg4 << 1;
		@Pc(43) int local43 = local21 + (1 - local34) * local17;
		@Pc(51) int local51 = local13 - local25 * (local34 - 1);
		@Pc(55) int local55 = local17 << 2;
		@Pc(59) int local59 = local13 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = local25 * ((arg4 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(107) int local107;
		@Pc(116) int local116;
		if (Static98.anInt2007 <= arg3 && Static213.anInt4452 >= arg3) {
			local107 = Static226.method3512(arg2 + arg1, Static29.anInt517, Static11.anInt170);
			local116 = Static226.method3512(arg2 - arg1, Static29.anInt517, Static11.anInt170);
			Static273.method4257(local116, Static183.anIntArrayArray26[arg3], arg0, local107);
		}
		@Pc(130) int local130 = (arg4 - 1) * local55;
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local7++;
					local43 += local67;
					local67 += local59;
					local51 += local81;
					local81 += local59;
				}
			}
			local9--;
			local107 = arg3 - local9;
			if (local51 < 0) {
				local51 += local81;
				local7++;
				local43 += local67;
				local67 += local59;
				local81 += local59;
			}
			local51 += -local75;
			local75 -= local55;
			local43 += -local130;
			local130 -= local55;
			local116 = arg3 + local9;
			if (Static98.anInt2007 <= local116 && Static213.anInt4452 >= local107) {
				@Pc(230) int local230 = Static226.method3512(local7 + arg2, Static29.anInt517, Static11.anInt170);
				@Pc(241) int local241 = Static226.method3512(arg2 - local7, Static29.anInt517, Static11.anInt170);
				if (local107 >= Static98.anInt2007) {
					Static273.method4257(local241, Static183.anIntArrayArray26[local107], arg0, local230);
				}
				if (local116 <= Static213.anInt4452) {
					Static273.method4257(local241, Static183.anIntArrayArray26[local116], arg0, local230);
				}
			}
		}
	}
}
