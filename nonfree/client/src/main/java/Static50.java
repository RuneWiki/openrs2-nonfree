import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
	public static int anInt1411;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
	public static int anInt1412;

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "Lclient!ec;")
	public static Class22 aClass22_348 = Static60.method1113("Passwort: ");

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	public static int anInt1405 = 0;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "Lclient!jd;")
	public static Class4_Sub11 aClass4_Sub11_1 = new Class4_Sub11(8);

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
	public static int anInt1407 = 0;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
	public static int anInt1408 = 0;

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
	public static int anInt1410 = -1;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Lclient!eb;")
	public static Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!ec;")
	private static Class22 aClass22_349 = Static60.method1113("Select");

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lclient!ec;")
	private static Class22 aClass22_350 = Static60.method1113("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lclient!ec;")
	public static Class22 aClass22_351 = aClass22_350;

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_352 = aClass22_349;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!f;)Lclient!ec;")
	public static Class22 method963(@OriginalArg(1) Class4_Sub7 arg0) {
		if (Static80.method1450(Static124.method1890(arg0)) == 0) {
			return null;
		} else if (arg0.aClass22_206 == null || arg0.aClass22_206.method484().method449() == 0) {
			return Static123.aBoolean278 ? Static109.aClass22_71 : null;
		} else {
			return arg0.aClass22_206;
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	public static void method965() {
		aClass22_348 = null;
		aClass22_349 = null;
		aClass22_350 = null;
		aClass22_351 = null;
		aClass4_Sub11_1 = null;
		aClass22_352 = null;
		aClass21_1 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method966() {
		if (!Static22.aBoolean250) {
			Static90.aClass22Array18[0] = Static76.aClass22_562;
			Static48.aClass22Array9[0] = Static64.aClass22_485;
			Static99.anInt2589 = 1;
			Static38.anIntArray111[0] = 1007;
		}
		if (Static11.anInt2982 != -1) {
			Static90.method1578(Static11.anInt2982);
		}
		for (@Pc(32) int local32 = 0; local32 < Static111.anInt2765; local32++) {
			if (Static122.aBooleanArray7[local32]) {
				Static67.aBooleanArray11[local32] = true;
			}
			Static49.aBooleanArray5[local32] = Static122.aBooleanArray7[local32];
			Static122.aBooleanArray7[local32] = false;
		}
		Static42.aClass4_Sub7_8 = null;
		Static130.anInt3086 = -1;
		Static26.anInt924 = Static117.anInt2877;
		Static28.anInt671 = -1;
		if (Static11.anInt2982 != -1) {
			Static111.anInt2765 = 0;
			Static70.method1176(0, 0, Static11.anInt2982, 0, -1, 765, 503, 0);
		}
		Static118.method1376();
		Static129.method1991();
		if (Static22.aBoolean250) {
			Static119.method1858();
		} else if (Static28.anInt671 != -1) {
			Static103.method1718(Static130.anInt3086, Static28.anInt671);
		}
		if (Static76.anInt2022 == 3) {
			for (@Pc(115) int local115 = 0; local115 < Static111.anInt2765; local115++) {
				if (Static49.aBooleanArray5[local115]) {
					Static118.method1377(Static121.anIntArray317[local115], Static103.anIntArray294[local115], Static24.anIntArray62[local115], Static16.anIntArray42[local115], 16711935, 128);
				} else if (Static67.aBooleanArray11[local115]) {
					Static118.method1377(Static121.anIntArray317[local115], Static103.anIntArray294[local115], Static24.anIntArray62[local115], Static16.anIntArray42[local115], 16711680, 128);
				}
			}
		}
		Static39.method623(Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500, Static46.anInt1293, Static37.anInt895);
		Static46.anInt1293 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!ka;BI)V")
	public static void method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub3_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1 == arg2 || Static99.anInt2589 >= 400) {
			return;
		}
		@Pc(64) Class22 local64;
		if (arg2.anInt1746 == 0) {
			local64 = Static44.method856(new Class22[] { arg2.aClass22_444, Static23.method391(arg2.anInt1732, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1732), Static35.aClass22_244, Static51.aClass22_364, Static134.method2042(arg2.anInt1732), Static19.aClass22_150 });
		} else {
			local64 = Static44.method856(new Class22[] { arg2.aClass22_444, Static35.aClass22_244, Static97.aClass22_751, Static134.method2042(arg2.anInt1746), Static19.aClass22_150 });
		}
		@Pc(104) int local104;
		if (Static104.anInt2636 == 1) {
			Static48.method905(arg0, Static35.aClass22_246, arg1, 5, Static44.method856(new Class22[] { Static43.aClass22_290, Static112.aClass22_864, local64 }), arg3);
		} else if (!Static128.aBoolean274) {
			for (local104 = 7; local104 >= 0; local104--) {
				if (Static33.aClass22Array6[local104] != null) {
					@Pc(116) short local116 = 0;
					if (Static33.aClass22Array6[local104].method480(Static59.aClass22_463)) {
						if (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1732 < arg2.anInt1732) {
							local116 = 2000;
						}
						if (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1734 != 0 && arg2.anInt1734 != 0) {
							if (arg2.anInt1734 == Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1734) {
								local116 = 2000;
							} else {
								local116 = 0;
							}
						}
					} else if (Static38.aBooleanArray3[local104]) {
						local116 = 2000;
					}
					@Pc(169) int local169 = Static80.anIntArray224[local104] + local116;
					Static48.method905(arg0, Static33.aClass22Array6[local104], arg1, local169, Static44.method856(new Class22[] { Static108.aClass22_805, local64 }), arg3);
				}
			}
		} else if ((Static73.anInt1961 & 0x8) == 8) {
			Static48.method905(arg0, Static124.aClass22_927, arg1, 22, Static44.method856(new Class22[] { Static12.aClass22_80, Static112.aClass22_864, local64 }), arg3);
		}
		for (local104 = 0; local104 < Static99.anInt2589; local104++) {
			if (Static38.anIntArray111[local104] == 3) {
				Static48.aClass22Array9[local104] = Static44.method856(new Class22[] { Static108.aClass22_805, local64 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public static void method969() {
		Static5.aClass33_3.method1003();
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
	public static void method970() {
		while (true) {
			@Pc(9) Class82 local9 = Static2.aClass82_1;
			@Pc(16) Class4_Sub20 local16;
			synchronized (Static2.aClass82_1) {
				local16 = (Class4_Sub20) Static134.aClass82_15.method2029();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass20_Sub1_74.method618(false, local16.aByteArray42, (int) local16.aLong99, local16.aClass71_4);
		}
	}
}
