import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "Lclient!qt;")
	public static Class282 aClass282_7;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "[I")
	public static final int[] anIntArray247 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_66 = new Class200(88, 8);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
	public static void method4279(@OriginalArg(1) int arg0) {
		if (arg0 == Static485.anInt8420) {
			return;
		}
		if (arg0 == 13) {
			if (Static76.aString8 == null) {
				Static173.method3035(Static90.anInt2169, Static446.aString85, Static336.aString67);
			} else {
				Static159.method2865(Static90.anInt2169);
			}
		}
		if (arg0 != 13 && Static528.aClass230_2 != null) {
			Static528.aClass230_2.method6028();
			Static528.aClass230_2 = null;
		}
		if (arg0 == 3) {
			Static260.method7708(Static307.anInt5465 != Static489.anInt8493);
		}
		if (arg0 == 7) {
			Static404.method6470(Static96.anInt2226 != Static307.anInt5465);
		}
		if (arg0 == 5) {
			if (Static76.aString8 == null) {
				Static36.method1272(Static446.aString85, Static336.aString67);
			} else {
				Static339.method5724();
			}
		} else if (arg0 == 6) {
			if (Static76.aString8 == null) {
				Static173.method3035(Static90.anInt2169, Static446.aString85, Static336.aString67);
			} else {
				Static159.method2865(Static90.anInt2169);
			}
		} else if (arg0 == 9) {
			if (Static76.aString8 == null) {
				Static173.method3035(Static90.anInt2169, Static446.aString85, Static336.aString67);
			} else {
				Static159.method2865(Static90.anInt2169);
			}
		} else if (arg0 == 12) {
			if (Static76.aString8 == null) {
				Static36.method1272(Static446.aString85, Static336.aString67);
			} else {
				Static339.method5724();
			}
		}
		if (Static487.method7257(Static485.anInt8420)) {
			Static351.aClass196_69.anInt5854 = 2;
			Static383.aClass196_76.anInt5854 = 2;
			Static557.aClass196_113.anInt5854 = 2;
			Static368.aClass196_74.anInt5854 = 2;
			Static311.aClass196_77.anInt5854 = 2;
			Static11.aClass196_129.anInt5854 = 2;
			Static35.aClass196_12.anInt5854 = 2;
		}
		if (Static487.method7257(arg0)) {
			Static365.anInt6937 = 0;
			Static236.anInt4460 = 0;
			Static9.anInt584 = 1;
			Static263.anInt4810 = 0;
			Static177.anInt3434 = 1;
			Static582.method8233(true);
			Static351.aClass196_69.anInt5854 = 1;
			Static383.aClass196_76.anInt5854 = 1;
			Static557.aClass196_113.anInt5854 = 1;
			Static368.aClass196_74.anInt5854 = 1;
			Static311.aClass196_77.anInt5854 = 1;
			Static11.aClass196_129.anInt5854 = 1;
			Static35.aClass196_12.anInt5854 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static445.method6914();
		}
		@Pc(233) boolean local233 = arg0 == 2 || Static103.method2142(arg0) || Static365.method5961(arg0);
		@Pc(248) boolean local248 = Static485.anInt8420 == 2 || Static103.method2142(Static485.anInt8420) || Static365.method5961(Static485.anInt8420);
		if (local233 != local248) {
			if (local233) {
				Static472.anInt8274 = Static249.anInt4578;
				if (Static262.aClass3_Sub27_12.aClass21_Sub14_3.method5405() == 0) {
					Static7.method2301();
				} else {
					Static591.method8303(Static262.aClass3_Sub27_12.aClass21_Sub14_3.method5405(), Static336.aClass196_65, Static249.anInt4578);
					Static464.method7046();
				}
				Static365.aClass248_1.method6456(false);
			} else {
				Static7.method2301();
				Static365.aClass248_1.method6456(true);
			}
		}
		if (Static487.method7257(arg0) || arg0 == 13) {
			Static323.aClass5_9.method7567();
		}
		Static485.anInt8420 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!la;ILclient!hga;)V")
	public static void method4281(@OriginalArg(0) Class196 arg0, @OriginalArg(2) Class138 arg1) {
		Static573.aClass138_6 = arg1;
		Static200.aClass196_42 = arg0;
		Static242.aString52 = "";
		if (Class3_Sub2_Sub7.aString21.startsWith("win")) {
			Static242.aString52 = Static242.aString52 + "windows/";
		} else if (Class3_Sub2_Sub7.aString21.startsWith("linux")) {
			Static242.aString52 = Static242.aString52 + "linux/";
		} else if (Class3_Sub2_Sub7.aString21.startsWith("mac")) {
			Static242.aString52 = Static242.aString52 + "macos/";
		}
		if (Static573.aClass138_6.aBoolean278) {
			Static242.aString52 = Static242.aString52 + "msjava/";
		} else if (Class3_Sub2_Sub7.aString20.startsWith("amd64") || Class3_Sub2_Sub7.aString20.startsWith("x86_64")) {
			Static242.aString52 = Static242.aString52 + "x86_64/";
		} else if (Class3_Sub2_Sub7.aString20.startsWith("i386") || Class3_Sub2_Sub7.aString20.startsWith("i486") || Class3_Sub2_Sub7.aString20.startsWith("i586") || Class3_Sub2_Sub7.aString20.startsWith("x86")) {
			Static242.aString52 = Static242.aString52 + "x86/";
		} else if (Class3_Sub2_Sub7.aString20.startsWith("ppc")) {
			Static242.aString52 = Static242.aString52 + "ppc/";
		} else {
			Static242.aString52 = Static242.aString52 + "universal/";
		}
	}
}
