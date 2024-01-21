import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	public static int anInt2546;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!je;")
	private static Class40 aClass40_1371 = Static69.method1231("Loading wordpack )2 ");

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!je;")
	public static Class40 aClass40_1366 = aClass40_1371;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_1367 = Static69.method1231("Mem:");

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_1368 = Static69.method1231(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	public static int anInt2544 = 0;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
	public static int[] anIntArray292 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_1369 = Static69.method1231("Nehmen");

	@OriginalMember(owner = "client!se", name = "s", descriptor = "Lclient!je;")
	public static Class40 aClass40_1370 = Static69.method1231("Passwort: ");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method1833() {
		Static97.aClass55_76.method1413();
		Static79.aClass55_61.method1413();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BII)Z")
	public static boolean method1836(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub9 local10 = new Class2_Sub9(arg1);
		@Pc(12) int local12 = -1;
		@Pc(14) boolean local14 = true;
		label70: while (true) {
			@Pc(23) int local23 = local10.method653();
			if (local23 == 0) {
				return local14;
			}
			local12 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(88) Class2_Sub1_Sub4 local88;
				do {
					@Pc(74) int local74;
					@Pc(70) int local70;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local10.method653();
										if (local39 == 0) {
											continue label70;
										}
										local10.method640();
									}
									local39 = local10.method653();
									if (local39 == 0) {
										continue label70;
									}
									local31 += local39 - 1;
									@Pc(56) int local56 = local31 >> 6 & 0x3F;
									@Pc(60) int local60 = local31 & 0x3F;
									local66 = local10.method640() >> 2;
									local70 = arg2 + local60;
									local74 = arg0 + local56;
								} while (local74 <= 0);
							} while (local70 <= 0);
						} while (local74 >= 103);
					} while (local70 >= 103);
					local88 = method1839(local12);
				} while (local66 == 22 && Static34.aBoolean60 && local88.anInt1067 == 0 && local88.anInt1048 != 1 && !local88.aBoolean71);
				if (!local88.method711()) {
					Static21.anInt644++;
					local14 = false;
				}
				local33 = true;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!m;III)V")
	public static void method1837(@OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1 == arg0 || Static57.anInt1500 >= 400) {
			return;
		}
		@Pc(67) Class40 local67;
		if (arg0.anInt1829 == 0) {
			local67 = Static40.method722(new Class40[] { arg0.aClass40_892, Static61.method1115(arg0.anInt1827, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1827), Static101.aClass40_1320, Static83.aClass40_1114, Static49.method886(arg0.anInt1827), Static14.aClass40_221 });
		} else {
			local67 = Static40.method722(new Class40[] { arg0.aClass40_892, Static101.aClass40_1320, Static55.aClass40_729, Static49.method886(arg0.anInt1829), Static14.aClass40_221 });
		}
		@Pc(134) int local134;
		if (Static111.anInt2597 == 1) {
			Static46.method830(arg1, arg2, Static40.method722(new Class40[] { Static2.aClass40_72, Static97.aClass40_1287, local67 }), arg3, 8, Static70.aClass40_936);
		} else if (!Static31.aBoolean53) {
			for (local134 = 7; local134 >= 0; local134--) {
				if (Static120.aClass40Array20[local134] != null) {
					@Pc(148) short local148 = 0;
					if (Static120.aClass40Array20[local134].method984(Static114.aClass40_1423)) {
						if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1827 < arg0.anInt1827) {
							local148 = 2000;
						}
						if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1831 != 0 && arg0.anInt1831 != 0) {
							if (arg0.anInt1831 == Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1831) {
								local148 = 2000;
							} else {
								local148 = 0;
							}
						}
					} else if (Static84.aBooleanArray22[local134]) {
						local148 = 2000;
					}
					@Pc(203) int local203 = Static123.anIntArray335[local134] + local148;
					Static46.method830(arg1, arg2, Static40.method722(new Class40[] { Static41.aClass40_565, local67 }), arg3, local203, Static120.aClass40Array20[local134]);
				}
			}
		} else if ((Static95.anInt2422 & 0x8) == 8) {
			Static46.method830(arg1, arg2, Static40.method722(new Class40[] { Static118.aClass40_1491, Static97.aClass40_1287, local67 }), arg3, 23, Static34.aClass40_471);
		}
		for (local134 = 0; local134 < Static57.anInt1500; local134++) {
			if (Static83.anIntArray236[local134] == 22) {
				Static25.aClass40Array1[local134] = Static40.method722(new Class40[] { Static41.aClass40_565, local67 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	public static void method1838() {
		aClass40_1366 = null;
		aClass40_1371 = null;
		aClass40_1368 = null;
		aClass40_1367 = null;
		aClass40_1370 = null;
		anIntArray292 = null;
		aClass40_1369 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lclient!ge;")
	public static Class2_Sub1_Sub4 method1839(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub4 local10 = (Class2_Sub1_Sub4) Static63.aClass55_18.method1410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static94.aClass24_27.method1931(arg0, 6);
		local10 = new Class2_Sub1_Sub4();
		local10.anInt1030 = arg0;
		if (local25 != null) {
			local10.method712(new Class2_Sub9(local25));
		}
		local10.method707();
		if (local10.aBoolean74) {
			local10.anInt1048 = 0;
			local10.aBoolean73 = false;
		}
		Static63.aClass55_18.method1411((long) arg0, local10);
		return local10;
	}
}
