import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_111 = new Class218(37, 2);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
	public static void method6720(@OriginalArg(0) boolean arg0) {
		if (Static153.aString28.length() == 0) {
			return;
		}
		Static238.method4024("--> " + Static153.aString28);
		Static371.method5395(Static153.aString28, false, arg0);
		Static66.anInt1306 = 0;
		Static153.aString28 = "";
		Static369.anInt5956 = 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII)V")
	public static void method6722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(34) int local34 = arg2 << 1;
		@Pc(43) int local43 = (1 - local34) * local13 + local21;
		@Pc(52) int local52 = local17 - (local34 - 1) * local25;
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg2 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg2 - 1);
		@Pc(106) int local106;
		@Pc(115) int local115;
		if (arg0 >= Static374.anInt5986 && arg0 <= Static84.anInt1667) {
			local106 = Static120.method2296(arg3 + arg1, Static7.anInt93, Static115.anInt2377);
			local115 = Static120.method2296(arg3 - arg1, Static7.anInt93, Static115.anInt2377);
			Static483.method7014(Static392.anIntArrayArray39[arg0], local115, local106, arg4);
		}
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local68;
					local52 += local82;
					local82 += local60;
					local7++;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local43 += local68;
				local52 += local82;
				local7++;
				local82 += local60;
				local68 += local60;
			}
			local52 += -local76;
			local43 += -local88;
			local88 -= local56;
			local76 -= local56;
			local9--;
			local106 = arg0 - local9;
			local115 = local9 + arg0;
			if (Static374.anInt5986 <= local115 && local106 <= Static84.anInt1667) {
				@Pc(220) int local220 = Static120.method2296(arg3 + local7, Static7.anInt93, Static115.anInt2377);
				@Pc(229) int local229 = Static120.method2296(arg3 - local7, Static7.anInt93, Static115.anInt2377);
				if (Static374.anInt5986 <= local106) {
					Static483.method7014(Static392.anIntArrayArray39[local106], local229, local220, arg4);
				}
				if (local115 <= Static84.anInt1667) {
					Static483.method7014(Static392.anIntArrayArray39[local115], local229, local220, arg4);
				}
			}
		}
	}
}
