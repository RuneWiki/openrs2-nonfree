import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!oj;Lclient!g;I)V")
	public static void method6106(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class83 arg1) {
		if (Static56.aBoolean384) {
			return;
		}
		arg0.method2512(0);
		Static75.aClass27_8 = arg0.method2527(Static399.method3372(arg1, Static129.anInt2810));
		Static75.aClass27_8.method5318((Static7.anInt157 - Static75.aClass27_8.method5317()) / 2, (Static336.anInt6217 - Static75.aClass27_8.method5328()) / 2);
		Static200.aClass27_13 = arg0.method2527(Static399.method3372(arg1, Static145.anInt5346));
		Static200.aClass27_13.method5318((Static7.anInt157 - Static200.aClass27_13.method5317()) / 2, 18);
		Static56.aBoolean384 = true;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V")
	public static void method6107() {
		if (Static9.aBoolean23) {
			return;
		}
		Static221.aBoolean480 = true;
		if (Static260.aBoolean369) {
			Static323.aFloat71 = (int) Static323.aFloat71 - 17 & 0xFFFFFFF0;
		} else {
			Static106.aFloat8 += (-12.0F - Static106.aFloat8) / 2.0F;
		}
		Static9.aBoolean23 = true;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3 local8 = Static134.method2355(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray13 != null) {
			@Pc(18) Class2_Sub5 local18 = new Class2_Sub5();
			local18.anInt473 = arg0;
			local18.aClass3_4 = local8;
			local18.aString7 = arg2;
			local18.anObjectArray33 = local8.anObjectArray13;
			Static351.method5589(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt59 != 0) {
			local35 = Static131.method2285(local8);
		}
		if (!local35 || !Static51.method778(local8).method3755(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static77.method1332(Static279.aClass183_76);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 2) {
			Static77.method1332(Static71.aClass183_21);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 3) {
			Static77.method1332(Static231.aClass183_69);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 4) {
			Static77.method1332(Static89.aClass183_24);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 5) {
			Static77.method1332(Static211.aClass183_62);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 6) {
			Static77.method1332(Static113.aClass183_88);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 7) {
			Static77.method1332(Static71.aClass183_20);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 8) {
			Static77.method1332(Static221.aClass183_107);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 9) {
			Static77.method1332(Static231.aClass183_68);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
		if (arg0 == 10) {
			Static77.method1332(Static211.aClass183_61);
			Static54.method843(arg1, arg3, local8.anInt56);
		}
	}
}
