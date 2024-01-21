import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!f", name = "C", descriptor = "[Lclient!na;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "Z")
	public static boolean aBoolean25;

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_4;

	@OriginalMember(owner = "client!f", name = "T", descriptor = "Lclient!sb;")
	public static Class66 aClass66_2 = new Class66(32);

	@OriginalMember(owner = "client!f", name = "V", descriptor = "Lclient!qc;")
	public static Class60 aClass60_352 = Static121.method2047("Fallen lassen");

	@OriginalMember(owner = "client!f", name = "W", descriptor = "I")
	public static int anInt886 = 0;

	@OriginalMember(owner = "client!f", name = "X", descriptor = "Lclient!qc;")
	public static Class60 aClass60_353 = Static121.method2047("mapscene");

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "Lclient!qc;")
	public static Class60 aClass60_354 = Static121.method2047("null");

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "Lclient!qc;")
	private static Class60 aClass60_355 = Static121.method2047("button near the top of that page)3");

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_356 = Static121.method2047("lila:");

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_357 = Static121.method2047("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!f", name = "db", descriptor = "Lclient!qc;")
	public static Class60 aClass60_358 = Static121.method2047("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_359 = Static121.method2047("weiss:");

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_360 = aClass60_355;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!d;")
	public static Class4_Sub4_Sub2 method606(@OriginalArg(0) int arg0) {
		@Pc(6) Class4_Sub4_Sub2 local6 = (Class4_Sub4_Sub2) Static8.aClass48_5.method1390((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static60.aClass40_68.method1110(arg0, 4);
		local6 = new Class4_Sub4_Sub2();
		if (local20 != null) {
			local6.method358(new Class4_Sub13(local20), arg0);
		}
		local6.method361();
		Static8.aClass48_5.method1392(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZJ)V")
	public static void method607(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static46.anInt1193 >= 100 && Static64.anInt1709 != 1 || Static46.anInt1193 >= 200) {
			Static73.method1386(Static126.aClass60_1183, 0, Static22.aClass60_241);
			return;
		}
		@Pc(33) Class60 local33 = Static87.method1501(arg0).method1651();
		for (@Pc(35) int local35 = 0; local35 < Static46.anInt1193; local35++) {
			if (arg0 == Static122.aLongArray13[local35]) {
				Static73.method1386(Static125.method2072(new Class60[] { local33, Static38.aClass60_400 }), 0, Static22.aClass60_241);
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static85.anInt2032; local70++) {
			if (arg0 == Static39.aLongArray7[local70]) {
				Static73.method1386(Static125.method2072(new Class60[] { Static110.aClass60_1076, local33, Static46.aClass60_471 }), 0, Static22.aClass60_241);
				return;
			}
		}
		if (local33.method1660(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass60_1066)) {
			Static73.method1386(Static99.aClass60_986, 0, Static22.aClass60_241);
			return;
		}
		Static61.aClass60Array12[Static46.anInt1193] = local33;
		Static122.aLongArray13[Static46.anInt1193] = arg0;
		Static1.anIntArray1[Static46.anInt1193] = 0;
		Static72.anIntArray189[Static46.anInt1193] = 0;
		Static46.anInt1193++;
		Static92.anInt2194 = Static63.anInt1698;
		Static56.aClass4_Sub13_Sub1_1.method1265(82);
		Static56.aClass4_Sub13_Sub1_1.method1242(arg0);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	public static void method608() {
		if (Static10.aBooleanArray1[98]) {
			Static105.anInt2503 += (12 - Static105.anInt2503) / 2;
		} else if (Static10.aBooleanArray1[99]) {
			Static105.anInt2503 += (-Static105.anInt2503 - 12) / 2;
		} else {
			Static105.anInt2503 /= 2;
		}
		if (Static10.aBooleanArray1[96]) {
			Static101.anInt2467 += (-Static101.anInt2467 - 24) / 2;
		} else if (Static10.aBooleanArray1[97]) {
			Static101.anInt2467 += (24 - Static101.anInt2467) / 2;
		} else {
			Static101.anInt2467 /= 2;
		}
		@Pc(77) int local77 = Static69.anInt1768 + Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620;
		Static69.anInt1774 += Static105.anInt2503 / 2;
		if (Static69.anInt1774 < 128) {
			Static69.anInt1774 = 128;
		}
		if (Static69.anInt1774 > 383) {
			Static69.anInt1774 = 383;
		}
		Static52.anInt1339 = Static101.anInt2467 / 2 + Static52.anInt1339 & 0x7FF;
		@Pc(114) int local114 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 + Static83.anInt1976;
		if (Static70.anInt1809 - local77 < -500 || Static70.anInt1809 - local77 > 500 || Static112.anInt2727 - local114 < -500 || Static112.anInt2727 - local114 > 500) {
			Static70.anInt1809 = local77;
			Static112.anInt2727 = local114;
		}
		if (Static70.anInt1809 != local77) {
			Static70.anInt1809 += (local77 - Static70.anInt1809) / 16;
		}
		if (local114 != Static112.anInt2727) {
			Static112.anInt2727 += (local114 - Static112.anInt2727) / 16;
		}
		@Pc(178) int local178 = Static70.anInt1809 >> 7;
		@Pc(182) int local182 = Static112.anInt2727 >> 7;
		@Pc(184) int local184 = 0;
		@Pc(190) int local190 = Static54.method1001(Static70.anInt1809, Static112.anInt2727, Static129.anInt3003);
		@Pc(210) int local210;
		if (local178 > 3 && local182 > 3 && local178 < 100 && local182 < 100) {
			for (local210 = local178 - 4; local210 <= local178 + 4; local210++) {
				for (@Pc(216) int local216 = local182 - 4; local216 <= local182 + 4; local216++) {
					@Pc(220) int local220 = Static129.anInt3003;
					if (local220 < 3 && (Static95.aByteArrayArrayArray5[1][local210][local216] & 0x2) == 2) {
						local220++;
					}
					@Pc(247) int local247 = local190 - Static58.anIntArrayArrayArray5[local220][local210][local216];
					if (local184 < local247) {
						local184 = local247;
					}
				}
			}
		}
		local210 = local184 * 192;
		if (local210 > 98048) {
			local210 = 98048;
		}
		if (local210 < 32768) {
			local210 = 32768;
		}
		if (local210 > Static123.anInt2916) {
			Static123.anInt2916 += (local210 - Static123.anInt2916) / 24;
		} else if (Static123.anInt2916 > local210) {
			Static123.anInt2916 += (local210 - Static123.anInt2916) / 80;
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
	public static void method609() {
		@Pc(1) Object local1 = Static66.anObject5;
		synchronized (Static66.anObject5) {
			if (Static38.anInt965 != 0) {
				Static38.anInt965 = 1;
				try {
					Static66.anObject5.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static void method611() {
		aClass60_352 = null;
		aClass60_353 = null;
		aClass60_356 = null;
		aClass49Array1 = null;
		aClass60_355 = null;
		aClass60_360 = null;
		aClass66_2 = null;
		aClass60_354 = null;
		aClass60_359 = null;
		aClass60_358 = null;
		Class4_Sub10.anIntArray66 = null;
		aClass4_Sub17_4 = null;
		aClass60_357 = null;
	}
}
