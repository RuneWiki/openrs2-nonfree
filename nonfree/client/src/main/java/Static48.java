import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array2;

	@OriginalMember(owner = "client!ef", name = "ib", descriptor = "Z")
	public static boolean aBoolean55;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "[Lclient!hi;")
	public static final Class35[] aClass35Array1 = new Class35[4];

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_340 = Static158.method3034("slide:");

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "J")
	public static long aLong40 = 0L;

	@OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_341 = aClass60_340;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_342 = Static158.method3034("Spieler");

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_343 = Static158.method3034("Benutzername: ");

	@OriginalMember(owner = "client!ef", name = "fb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_344 = aClass60_340;

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "[I")
	public static int[] anIntArray140 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!ef", name = "lb", descriptor = "[I")
	public static final int[] anIntArray141 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!ob;)V")
	public static void method1094(@OriginalArg(1) Class60 arg0) {
		if (Static2.anInt4174 >= 2) {
			@Pc(17) int local17;
			@Pc(38) int local38;
			if (arg0.method2698(Static185.aClass60_1278)) {
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				@Pc(28) Runtime local28 = Runtime.getRuntime();
				local38 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
				Static118.method2563(0, null, Static193.method3536(new Class60[] { Static33.aClass60_244, Static72.method1661(local38), Static56.aClass60_406 }));
			}
			if (arg0.method2698(Static90.aClass60_723)) {
				Static4.method69();
			}
			if (arg0.method2698(Static38.aClass60_266)) {
				Static105.aBoolean136 = true;
			}
			if (arg0.method2698(Static62.aClass60_456)) {
				Static105.aBoolean136 = false;
			}
			arg0.method2698(Static97.aClass60_789);
			arg0.method2698(Static9.aClass60_86);
			if (arg0.method2698(Static6.aClass60_63)) {
				for (local17 = 0; local17 < 4; local17++) {
					for (@Pc(102) int local102 = 1; local102 < 103; local102++) {
						for (local38 = 1; local38 < 103; local38++) {
							aClass35Array1[local17].anIntArrayArray14[local102][local38] = 0;
						}
					}
				}
			}
			if (arg0.method2697(Static64.aClass60_484) && Static143.anInt3743 != 0) {
				Static61.method1432(arg0.method2672(6).method2692());
			}
			if (arg0.method2698(Static172.aClass60_1159) && Static143.anInt3743 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2697(Static46.aClass60_327)) {
				Static159.anInt4432 = arg0.method2672(12).method2689().method2692();
				Static118.method2563(0, null, Static193.method3536(new Class60[] { Static40.aClass60_291, Static72.method1661(Static159.anInt4432) }));
			}
			if (arg0.method2698(Static37.aClass60_259)) {
				Static89.aBoolean102 = true;
			}
		}
		Static7.aClass2_Sub3_Sub1_43.method244(123);
		Static7.aClass2_Sub3_Sub1_43.method224(arg0.method2673() - 1);
		Static7.aClass2_Sub3_Sub1_43.method226(arg0.method2672(2));
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
	public static void method1095() {
		@Pc(7) int local7 = Static103.anInt2979;
		@Pc(9) int local9 = Static176.anInt4301;
		@Pc(11) int local11 = Static180.anInt3303;
		@Pc(13) int local13 = Static73.anInt2175;
		Static133.method2120(local7, local9, local11, local13, 6116423);
		Static133.method2120(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static133.method2111(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1786(Static11.aClass60_101, local7 + 3, local9 - -14, 6116423, -1);
		@Pc(66) int local66 = Static131.anInt215;
		@Pc(68) int local68 = Static157.anInt3985;
		for (@Pc(70) int local70 = 0; local70 < Static169.anInt4148; local70++) {
			@Pc(74) int local74 = 16777215;
			@Pc(87) int local87 = local9 + (Static169.anInt4148 - local70 - 1) * 15 + 31;
			if (local66 > local7 && local66 < local11 + local7 && local87 - 13 < local68 && local87 + 3 > local68) {
				local74 = 16776960;
			}
			Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1786(Static47.method2317(local70), local7 + 3, local87, local74, 0);
		}
		Static155.method2995(Static73.anInt2175, Static180.anInt3303, Static103.anInt2979, Static176.anInt4301);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLclient!pe;I)Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2 method1097(@OriginalArg(2) Class13 arg0, @OriginalArg(3) int arg1) {
		return Static52.method1229(arg1, arg0, 0) ? Static104.method2371() : null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method1098(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static147.anInt3820 != 1) {
			return;
		}
		if (Static74.anInt2294 >= 280 && Static74.anInt2294 <= 294 && Static174.anInt4254 >= 4 && Static174.anInt4254 <= 18) {
			Static1.method3(0, 0);
			return;
		}
		if (Static74.anInt2294 >= 295 && Static74.anInt2294 <= 360 && Static174.anInt4254 >= 4 && Static174.anInt4254 <= 18) {
			Static1.method3(0, 1);
			return;
		}
		if (Static74.anInt2294 >= 390 && Static74.anInt2294 <= 404 && Static174.anInt4254 >= 4 && Static174.anInt4254 <= 18) {
			Static1.method3(1, 0);
			return;
		}
		if (Static74.anInt2294 >= 405 && Static74.anInt2294 <= 470 && Static174.anInt4254 >= 4 && Static174.anInt4254 <= 18) {
			Static1.method3(1, 1);
			return;
		}
		if (Static74.anInt2294 >= 500 && Static74.anInt2294 <= 514 && Static174.anInt4254 >= 4 && Static174.anInt4254 <= 18) {
			Static1.method3(2, 0);
			return;
		}
		if (Static74.anInt2294 >= 515 && Static74.anInt2294 <= 580 && Static174.anInt4254 >= 4 && Static174.anInt4254 <= 18) {
			Static1.method3(2, 1);
			return;
		}
		if (Static74.anInt2294 >= 610 && Static74.anInt2294 <= 624 && Static174.anInt4254 >= 4 && Static174.anInt4254 <= 18) {
			Static1.method3(3, 0);
			return;
		}
		if (Static74.anInt2294 >= 625 && Static74.anInt2294 <= 690 && Static174.anInt4254 >= 4 && Static174.anInt4254 <= 18) {
			Static1.method3(3, 1);
			return;
		}
		if (Static74.anInt2294 >= 708 && Static174.anInt4254 >= 4 && Static74.anInt2294 <= 758 && Static174.anInt4254 <= 20) {
			Static80.aBoolean96 = false;
			Static97.aClass2_Sub1_Sub7_Sub4_5.method2149(0, 0);
			Static131.aClass2_Sub1_Sub7_Sub4_2.method2149(382, 0);
			Static142.aClass2_Sub1_Sub7_Sub2_2.method1202(382 - Static142.aClass2_Sub1_Sub7_Sub2_2.anInt1596 / 2, 18);
			return;
		}
		if (Static119.anInt3318 == -1) {
			return;
		}
		@Pc(280) Class14 local280 = Static43.aClass14Array1[Static119.anInt3318];
		if (local280.aBoolean27 == Static107.aBoolean117) {
			@Pc(306) byte[] local306 = Static193.method3536(new Class60[] { local280.aClass60_184, Static6.aClass60_62 }).method2674();
			Static50.aString1 = new String(local306, 0, local306.length);
			Static80.aBoolean96 = false;
			Static156.anInt3974 = local280.anInt767;
			if (Static143.anInt3743 != 0) {
				Static143.anInt3743 = 0;
				Static152.anInt2802 = 443;
				Static147.anInt3823 = 43594;
				Static65.anInt1998 = 43594;
			}
			Static97.aClass2_Sub1_Sub7_Sub4_5.method2149(0, 0);
			Static131.aClass2_Sub1_Sub7_Sub4_2.method2149(382, 0);
			Static142.aClass2_Sub1_Sub7_Sub2_2.method1202(382 - Static142.aClass2_Sub1_Sub7_Sub2_2.anInt1596 / 2, 18);
			return;
		}
		@Pc(407) Class60 local407 = Static193.method3536(new Class60[] { Static172.aClass60_1162, local280.aClass60_184, Static6.aClass60_62, Static101.aClass60_813, Static33.aClass60_245, Static72.method1661(Static8.aBoolean3 ? 1 : 0), Static107.aClass60_856, Static72.method1661(Static128.anInt3498), Static196.aClass60_1315, Static72.method1661(Static31.anInt994) });
		try {
			arg0.getAppletContext().showDocument(local407.method2688(), "_self");
			return;
		} catch (@Pc(416) Exception local416) {
			return;
		}
	}
}
