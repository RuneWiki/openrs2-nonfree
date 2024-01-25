import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!at", name = "m", descriptor = "Lclient!uk;")
	public static Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!at", name = "b", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_7 = new Class303(83, 8);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public static void method439(@OriginalArg(0) int arg0) {
		if (Static32.anInt602 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static205.aString25 == null) {
				Static267.method4087(Static196.aString85, Static61.anInt1462, Static173.aString18);
			} else {
				Static538.method7178(Static61.anInt1462);
			}
		}
		if (arg0 != 13 && Static225.aClass165_1 != null) {
			Static225.aClass165_1.method3977();
			Static225.aClass165_1 = null;
		}
		if (arg0 == 3) {
			Static206.method3371(Static270.anInt4755 != Static353.anInt6188);
		}
		if (arg0 == 7) {
			Static359.method5538(Static353.anInt6188 != Static121.anInt2791);
		}
		if (arg0 == 5) {
			if (Static205.aString25 == null) {
				Static194.method3269(Static173.aString18, Static196.aString85);
			} else {
				Static317.method4654();
			}
		} else if (arg0 == 6) {
			if (Static205.aString25 == null) {
				Static267.method4087(Static196.aString85, Static61.anInt1462, Static173.aString18);
			} else {
				Static538.method7178(Static61.anInt1462);
			}
		} else if (arg0 == 9) {
			if (Static205.aString25 == null) {
				Static267.method4087(Static196.aString85, Static61.anInt1462, Static173.aString18);
			} else {
				Static538.method7178(Static61.anInt1462);
			}
		} else if (arg0 == 12) {
			if (Static205.aString25 == null) {
				Static194.method3269(Static173.aString18, Static196.aString85);
			} else {
				Static317.method4654();
			}
		}
		if (Static399.method5812(Static32.anInt602)) {
			Static235.aClass322_82.anInt8219 = 2;
			Static429.aClass322_124.anInt8219 = 2;
			Static85.aClass322_29.anInt8219 = 2;
			Static478.aClass322_132.anInt8219 = 2;
			Static259.aClass322_90.anInt8219 = 2;
			Static51.aClass322_20.anInt8219 = 2;
			Static345.aClass322_108.anInt8219 = 2;
		}
		if (Static399.method5812(arg0)) {
			Static176.anInt3448 = 1;
			Static398.anInt6933 = 0;
			Static122.anInt2803 = 0;
			Static347.anInt6073 = 1;
			Static303.anInt5123 = 0;
			Static314.method4613(true);
			Static235.aClass322_82.anInt8219 = 1;
			Static429.aClass322_124.anInt8219 = 1;
			Static85.aClass322_29.anInt8219 = 1;
			Static478.aClass322_132.anInt8219 = 1;
			Static259.aClass322_90.anInt8219 = 1;
			Static51.aClass322_20.anInt8219 = 1;
			Static345.aClass322_108.anInt8219 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static492.method6665();
		}
		@Pc(240) boolean local240 = arg0 == 2 || Static37.method1503(arg0) || Static234.method3634(arg0);
		@Pc(255) boolean local255 = Static32.anInt602 == 2 || Static37.method1503(Static32.anInt602) || Static234.method3634(Static32.anInt602);
		if (local240 != local255) {
			if (local240) {
				Static416.anInt7067 = Static591.anInt9673;
				if (Static405.aClass3_Sub3_Sub1_1.anInt7555 == 0) {
					Static227.method3538();
				} else {
					Static144.method2790(Static287.aClass322_120, Static591.anInt9673, Static405.aClass3_Sub3_Sub1_1.anInt7555);
				}
				Static391.aClass277_2.method6110(false);
			} else {
				Static227.method3538();
				Static391.aClass277_2.method6110(true);
			}
		}
		if (Static399.method5812(arg0) || arg0 == 13) {
			Static505.aClass45_11.method7361();
		}
		Static32.anInt602 = arg0;
	}
}
