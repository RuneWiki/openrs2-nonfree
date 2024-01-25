import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "Z")
	public static boolean aBoolean221;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Lclient!ula;")
	public static final Class379 aClass379_5 = new Class379("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "[I")
	public static final int[] anIntArray245 = new int[4096];

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "Lclient!ada;")
	public static Class3_Sub3 aClass3_Sub3_1 = null;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
	public static int anInt3512 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)V")
	public static void method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg0 * arg0;
		@Pc(22) int local22 = arg3 * arg3;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg3 << 1;
		@Pc(43) int local43 = local26 + (1 - local34) * local18;
		@Pc(52) int local52 = local22 - (local34 - 1) * local30;
		@Pc(56) int local56 = local18 << 2;
		@Pc(60) int local60 = local22 << 2;
		@Pc(68) int local68 = local26 * 3;
		@Pc(76) int local76 = ((arg3 << 1) - 3) * local30;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg3 - 1);
		@Pc(108) int local108;
		@Pc(116) int local116;
		if (arg2 >= Static549.anInt5294 && Static334.anInt5381 >= arg2) {
			local108 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg4 + arg0);
			local116 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg4 - arg0);
			Static202.method3077(Static118.anIntArrayArray7[arg2], local116, arg1, local108);
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
				local68 += local60;
				local82 += local60;
				local7++;
			}
			local52 += -local76;
			local43 += -local88;
			local88 -= local56;
			local76 -= local56;
			local9--;
			local108 = arg2 - local9;
			local116 = local9 + arg2;
			if (Static549.anInt5294 <= local116 && Static334.anInt5381 >= local108) {
				@Pc(227) int local227 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg4 + local7);
				@Pc(236) int local236 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg4 - local7);
				if (local108 >= Static549.anInt5294) {
					Static202.method3077(Static118.anIntArrayArray7[local108], local236, arg1, local227);
				}
				if (Static334.anInt5381 >= local116) {
					Static202.method3077(Static118.anIntArrayArray7[local116], local236, arg1, local227);
				}
			}
		}
	}
}
