import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ffa", name = "V", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_3;

	@OriginalMember(owner = "client!ffa", name = "db", descriptor = "I")
	public static int anInt2462 = -2;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V")
	public static void method2323(@OriginalArg(1) int arg0) {
		if (Static387.anInt9114 == arg0) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static246.method4091();
		}
		if (arg0 != 14 && Static260.aClass278_1 != null) {
			Static260.aClass278_1.method6651();
			Static260.aClass278_1 = null;
		}
		if (arg0 == 3) {
			Static499.method7528(Static358.anInt6145 != Static551.aClass355_1.anInt9851);
		}
		if (arg0 == 7) {
			Static104.method1715(Static551.aClass355_1.anInt9856 != Static358.anInt6145);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static517.method7662();
		} else if (arg0 == 6 || arg0 == 9 && Static387.anInt9114 != 10) {
			Static246.method4091();
		}
		if (Static260.method4351(Static387.anInt9114)) {
			Static376.aClass310_102.anInt9032 = 2;
			Static192.aClass310_135.anInt9032 = 2;
			Static403.aClass310_85.anInt9032 = 2;
			Static524.aClass310_114.anInt9032 = 2;
			Static525.aClass310_105.anInt9032 = 2;
			Static214.aClass310_47.anInt9032 = 2;
			Static129.aClass310_28.anInt9032 = 2;
		}
		if (Static260.method4351(arg0)) {
			Static140.anInt2225 = 0;
			Static11.anInt179 = 1;
			Static464.anInt7758 = 0;
			Static101.anInt1762 = 1;
			Static472.anInt8114 = 0;
			Static467.method6886(true);
			Static376.aClass310_102.anInt9032 = 1;
			Static192.aClass310_135.anInt9032 = 1;
			Static403.aClass310_85.anInt9032 = 1;
			Static524.aClass310_114.anInt9032 = 1;
			Static525.aClass310_105.anInt9032 = 1;
			Static214.aClass310_47.anInt9032 = 1;
			Static129.aClass310_28.anInt9032 = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static533.method7883();
		}
		@Pc(221) boolean local221 = arg0 == 2 || Static648.method9079(arg0) || Static232.method3903(arg0);
		@Pc(243) boolean local243 = Static387.anInt9114 == 2 || Static648.method9079(Static387.anInt9114) || Static232.method3903(Static387.anInt9114);
		if (local243 != local221) {
			if (local221) {
				Static184.anInt7567 = Static350.anInt6000;
				if (Static181.aClass14_Sub26_9.aClass43_Sub11_2.method3829() == 0) {
					Static68.method1086();
				} else {
					Static12.method244(Static181.aClass14_Sub26_9.aClass43_Sub11_2.method3829(), Static341.aClass310_67, Static350.anInt6000);
					Static285.method4779();
				}
				Static685.aClass24_3.method377(false);
			} else {
				Static68.method1086();
				Static685.aClass24_3.method377(true);
			}
		}
		if (Static260.method4351(arg0) || arg0 == 14 || arg0 == 15) {
			Static103.aClass144_3.method6889();
		}
		Static387.anInt9114 = arg0;
	}
}
