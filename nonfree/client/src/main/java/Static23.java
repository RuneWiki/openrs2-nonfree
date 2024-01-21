import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_367 = Static69.method1231("Lade)3)3)3");

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!je;")
	private static Class40 aClass40_369 = Static69.method1231("The server is being updated)3");

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_368 = aClass40_369;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public static int anInt650 = 0;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	public static int anInt652 = 0;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_370 = Static69.method1231("sl_back");

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_371 = Static69.method1231(" x ");

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_372 = Static69.method1231("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!je;")
	private static Class40 aClass40_374 = Static69.method1231("No reply from loginserver)3");

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_373 = aClass40_374;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
	public static void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static6.method1685(arg0, arg1, arg0 + arg3, arg1 - -arg2);
		Static78.method1390();
		Static96.anInt2435++;
		Static2.method70(true);
		Static129.method2140(true);
		Static2.method70(false);
		Static129.method2140(false);
		Static15.method240();
		Static70.method1220();
		@Pc(47) int local47;
		@Pc(45) int local45;
		if (!Static20.aBoolean47) {
			local45 = Static39.anInt1035 + Static123.anInt2870 & 0x7FF;
			local47 = Static33.anInt2670;
			if (Static84.anInt2237 / 256 > local47) {
				local47 = Static84.anInt2237 / 256;
			}
			if (Static126.aBooleanArray25[4] && local47 < Static95.anIntArray264[4] + 128) {
				local47 = Static95.anIntArray264[4] + 128;
			}
			Static105.method1828(Static47.anInt1292, Static93.method1730(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788, Static105.anInt2531, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792) - 50, local47, Static5.anInt155, local45, local47 * 3 + 600);
		}
		if (Static20.aBoolean47) {
			local47 = Static56.method1004();
		} else {
			local47 = Static32.method490();
		}
		local45 = Static83.anInt2155;
		@Pc(122) int local122 = Static2.anInt101;
		@Pc(124) int local124 = Static127.anInt2944;
		@Pc(126) int local126 = Static38.anInt1005;
		@Pc(128) int local128 = Static67.anInt1832;
		@Pc(171) int local171;
		for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
			if (Static126.aBooleanArray25[local130]) {
				local171 = (int) (Math.random() * (double) (Static73.anIntArray203[local130] * 2 + 1) - (double) Static73.anIntArray203[local130] + Math.sin((double) Static33.anIntArray303[local130] / 100.0D * (double) Static95.anIntArray263[local130]) * (double) Static95.anIntArray264[local130]);
				if (local130 == 1) {
					Static2.anInt101 += local171;
				}
				if (local130 == 3) {
					Static67.anInt1832 = Static67.anInt1832 + local171 & 0x7FF;
				}
				if (local130 == 0) {
					Static83.anInt2155 += local171;
				}
				if (local130 == 4) {
					Static38.anInt1005 += local171;
					if (Static38.anInt1005 < 128) {
						Static38.anInt1005 = 128;
					}
					if (Static38.anInt1005 > 383) {
						Static38.anInt1005 = 383;
					}
				}
				if (local130 == 2) {
					Static127.anInt2944 += local171;
				}
			}
		}
		local171 = Static112.anInt2616;
		@Pc(236) int local236 = Static85.anInt2261;
		if (arg0 <= local171 && local171 < arg0 + arg3 && local236 >= arg1 && local236 < arg2 + arg1) {
			Static4.anInt153 = Static85.anInt2261 - arg1;
			Static4.anInt150 = Static112.anInt2616 - arg0;
			Static4.aBoolean15 = true;
			Static4.anInt149 = 0;
		} else {
			Static4.anInt149 = 0;
			Static4.aBoolean15 = false;
		}
		Static55.method990();
		Static6.method1695(arg0, arg1, arg3, arg2, 0);
		Static55.method990();
		Static111.aClass30_1.method751(Static83.anInt2155, Static2.anInt101, Static127.anInt2944, Static38.anInt1005, Static67.anInt1832, local47);
		Static55.method990();
		Static111.aClass30_1.method742();
		Static70.method1222(arg3, arg2, arg1, arg0);
		Static125.method2077(arg1, arg0);
		((Class42) Static78.anInterface1_1).method1011(Static49.anInt1315);
		Static2.method72(arg2, arg1, arg3, arg0);
		Static2.anInt101 = local122;
		Static38.anInt1005 = local126;
		Static67.anInt1832 = local128;
		Static127.anInt2944 = local124;
		Static83.anInt2155 = local45;
		if (Static83.aBoolean166 && Static124.method2071() == 0) {
			Static83.aBoolean166 = false;
		}
		if (Static83.aBoolean166) {
			Static6.method1695(arg0, arg1, arg3, arg2, 0);
			Static5.method130(false, Static32.aClass40_456);
		}
		if (!Static83.aBoolean166 && !Static8.aBoolean21 && local171 >= arg0 && arg3 + arg0 > local171 && local236 >= arg1 && arg1 + arg2 > local236) {
			Static92.method1670(local171, arg0, arg1, local236);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method411() {
		aClass40_369 = null;
		aClass40_371 = null;
		aClass40_374 = null;
		aClass2_Sub1_Sub2_Sub4_1 = null;
		aClass40_370 = null;
		aClass40_372 = null;
		aClass40_367 = null;
		aClass40_373 = null;
		aClass40_368 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method412() {
		Static24.aClass55_92.method1413();
		Static87.aClass55_37.method1413();
	}
}
