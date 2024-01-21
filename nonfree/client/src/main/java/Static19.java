import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!qb;")
	public static Class1_Sub8_Sub3 aClass1_Sub8_Sub3_1;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!ha;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_326 = Static108.method1915("Menge eingeben:");

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_327 = Static108.method1915("auf der Hautpseite)3");

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_328 = Static108.method1915("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!kd;")
	private static Class39 aClass39_330 = Static108.method1915("Click to continue");

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_329 = aClass39_330;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public static int anInt641 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method362() {
		Static69.aClass33_25.method1034();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public static void method363() {
		Static8.method223();
		if (Static77.anInt1930 == 1) {
			Static37.aClass1_Sub1_Sub4_Sub4Array6[Static95.anInt2879 / 100].method1539(Static104.anInt2644 - 12, -8 + -4 + Static66.anInt1726);
		}
		if (Static77.anInt1930 == 2) {
			Static37.aClass1_Sub1_Sub4_Sub4Array6[Static95.anInt2879 / 100 + 4].method1539(Static104.anInt2644 - 8 - 4, Static66.anInt1726 + -4 + -8);
		}
		if (Static1.anInt90 != -1) {
			Static93.method1565(Static1.anInt90);
			Static89.method1478(4, 334, Static1.anInt90, 512);
		}
		if (Static48.anInt1318 != -1) {
			Static93.method1565(Static48.anInt1318);
			Static89.method1478(0, 334, Static48.anInt1318, 512);
		}
		Static12.method276();
		if (!Static13.aBoolean47) {
			Static71.method1241();
			Static44.method782();
		} else if (Static46.anInt2774 == 0) {
			Static124.method2080();
		}
		if (Static49.anInt1368 == 1) {
			Static26.aClass1_Sub1_Sub4_Sub4_2.method1539(472, 296);
		}
		@Pc(126) int local126;
		if (Static81.aBoolean166) {
			@Pc(103) byte local103 = 20;
			Static93.aClass1_Sub1_Sub4_Sub3_3.method759(Static30.method601(new Class39[] { Static98.aClass39_1193, Static69.method1226(Static67.anInt1736) }), 507, 20, 16776960, -1);
			local126 = local103 + 15;
			@Pc(128) int local128 = 16776960;
			@Pc(130) Runtime local130 = Runtime.getRuntime();
			@Pc(139) int local139 = (int) ((local130.totalMemory() - local130.freeMemory()) / 1024L);
			if (local139 > 32768 && Static68.aBoolean149) {
				local128 = 16711680;
			}
			if (local139 > 65536 && !Static68.aBoolean149) {
				local128 = 16711680;
			}
			Static93.aClass1_Sub1_Sub4_Sub3_3.method759(Static30.method601(new Class39[] { Static43.aClass39_590, Static69.method1226(local139), Static16.aClass39_1214 }), 507, 35, local128, -1);
			local126 += 15;
			if (Static20.aBoolean62) {
				Static93.aClass1_Sub1_Sub4_Sub3_3.method759(Static127.aClass39_1537, 507, 50, 16711680, -1);
				local126 += 15;
				Static20.aBoolean62 = false;
			}
			if (Static99.aBoolean198) {
				Static93.aClass1_Sub1_Sub4_Sub3_3.method759(Static4.aClass39_59, 507, local126, 16711680, -1);
				local126 += 15;
				Static99.aBoolean198 = false;
			}
			if (Static85.aBoolean170) {
				Static93.aClass1_Sub1_Sub4_Sub3_3.method759(Static2.aClass39_47, 507, local126, 16711680, -1);
				Static85.aBoolean170 = false;
				local126 += 15;
			}
		}
		if (Static49.anInt1372 == 0) {
			return;
		}
		@Pc(224) int local224 = Static49.anInt1372 / 50;
		local126 = local224 / 60;
		@Pc(232) int local232 = local224 % 60;
		if (local232 >= 10) {
			Static93.aClass1_Sub1_Sub4_Sub3_3.method753(Static30.method601(new Class39[] { Static35.aClass39_498, Static69.method1226(local126), Static44.aClass39_596, Static69.method1226(local232) }), 4, 329, 16776960, -1);
		} else {
			Static93.aClass1_Sub1_Sub4_Sub3_3.method753(Static30.method601(new Class39[] { Static35.aClass39_498, Static69.method1226(local126), Static124.aClass39_1492, Static69.method1226(local232) }), 4, 329, 16776960, -1);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method364() {
		Static53.anInt1465 = 0;
		Static94.anInt2224 = 0;
		Static41.method2107();
		Static87.method1427();
		Static79.method1800();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static53.anInt1465; local25++) {
			local31 = Static79.anIntArray384[local25];
			if (Static45.anInt1256 != Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31].anInt2514) {
				Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31].aClass1_Sub1_Sub5_1 = null;
				Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local31] = null;
			}
		}
		if (Static72.anInt1801 != Static79.aClass1_Sub18_Sub1_3.anInt3078) {
			throw new RuntimeException("gnp1 pos:" + Static79.aClass1_Sub18_Sub1_3.anInt3078 + " psize:" + Static72.anInt1801);
		}
		for (local31 = 0; local31 < Static20.anInt731; local31++) {
			if (Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static51.anIntArray192[local31]] == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static20.anInt731);
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public static void method365() {
		aClass39_330 = null;
		aClass1_Sub8_Sub3_1 = null;
		aClass39_327 = null;
		aClass39_326 = null;
		aClass26_1 = null;
		aClass39_329 = null;
		aClass39_328 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
	public static int method366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) Static62.aClass70_11.method1961((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray20.length) {
			return local10.anIntArray20[arg0];
		} else {
			return -1;
		}
	}
}
