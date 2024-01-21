import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_24;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1314 = Static14.method2017("(U2");

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public static int anInt2700 = 0;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	public static int[] anIntArray328 = new int[100];

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1316 = Static14.method2017("flash2:");

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1315 = aClass36_1316;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1317 = Static14.method2017("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1318 = aClass36_1317;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1319 = Static14.method2017("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1320 = Static14.method2017(" x ");

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	public static int anInt2706 = 0;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray28 = new int[5][5000];

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean124 = true;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1321 = Static14.method2017(" x");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method1912() {
		aClass36_1315 = null;
		aCRC32_2 = null;
		aClass36_1319 = null;
		aClass36_1318 = null;
		anIntArrayArray28 = null;
		anIntArray328 = null;
		aClass36_1321 = null;
		aClass36_1317 = null;
		aClass36_1314 = null;
		aClass36_1320 = null;
		aClass2_Sub1_Sub1_Sub1_24 = null;
		aClass36_1316 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
	public static boolean method1913() {
		return Static41.aClass29_1 != null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
	public static void method1914(@OriginalArg(0) int arg0) {
		if (arg0 == Static23.anInt591) {
			return;
		}
		if (Static23.anInt591 == 0) {
			Static99.method1473();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static48.anInt1267 = 0;
			Static96.anInt2557 = 0;
			Static18.anInt456 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static13.aClass51_2 != null) {
			Static13.aClass51_2.method1483();
			Static13.aClass51_2 = null;
		}
		if (Static23.anInt591 == 25 || Static23.anInt591 == 40) {
			Static8.method181();
			Static54.method1587();
		}
		if (Static23.anInt591 == 25) {
			Static48.anInt1265 = 0;
			Static101.anInt2667 = 0;
			Static105.anInt2736 = 1;
			Static41.anInt1079 = 1;
			Static111.anInt2890 = 0;
		}
		if (arg0 == 35) {
			Static10.method209();
			Static43.method835();
			if (Static65.aClass14_24 == null) {
				Static65.aClass14_24 = Static39.method751(765, 503, Static107.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static65.aClass14_24 = null;
			Static10.method209();
			Static63.method1121(Static100.aClass3_Sub1_12, Static107.aCanvas1, Static29.aClass3_Sub1_4);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static65.aClass14_24 = null;
			Static43.method835();
			Static46.method903(Static29.aClass3_Sub1_4, Static107.aCanvas1);
		}
		Static23.anInt591 = arg0;
		Static108.aBoolean131 = true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
	public static void method1915() {
		Static108.method1960(null, 10, 0, false);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public static void method1916() {
		Static63.method1124();
		if (Static23.anInt591 != 10) {
			return;
		}
		@Pc(18) int local18 = Static95.anInt2522;
		@Pc(22) int local22 = Static59.anInt1578 - 202;
		@Pc(26) int local26 = Static90.anInt2349 - 171;
		if (Static85.anInt2215 == 0) {
			if (local18 == 1 && local22 >= 25 && local22 <= 175 && local26 >= 100 && local26 <= 140) {
				Static85.anInt2215 = 3;
				Static64.anInt1641 = 0;
			}
			if (local18 == 1 && local22 >= 185 && local22 <= 335 && local26 >= 100 && local26 <= 140) {
				Static15.aClass36_188 = Static90.aClass36_1116;
				Static15.aClass36_189 = Static90.aClass36_1093;
				Static85.anInt2215 = 2;
				Static15.aClass36_180 = Static20.aClass36_267;
				Static64.anInt1641 = 0;
			}
		} else if (Static85.anInt2215 == 2) {
			@Pc(91) byte local91 = 60;
			@Pc(92) int local92 = local91 + 30;
			if (local18 == 1 && local26 >= 75 && local26 < 90) {
				Static64.anInt1641 = 0;
			}
			local92 += 15;
			if (local18 == 1 && local26 >= 90 && local26 < 105) {
				Static64.anInt1641 = 1;
			}
			local92 += 15;
			if (local18 == 1 && local22 >= 25 && local22 <= 175 && local26 >= 130 && local26 <= 170) {
				Static15.aClass36_186 = Static15.aClass36_186.method1026().method1017();
				Static13.method264(Static41.aClass36_534, Static90.aClass36_1119, Static90.aClass36_1124);
				method1914(20);
			} else {
				if (local18 == 1 && local22 >= 185 && local22 <= 335 && local26 >= 130 && local26 <= 170) {
					Static85.anInt2215 = 0;
					Static15.aClass36_186 = Static15.aClass36_179;
					Static15.aClass36_190 = Static15.aClass36_179;
				}
				while (true) {
					while (Static94.method1762()) {
						@Pc(221) boolean local221 = false;
						for (@Pc(223) int local223 = 0; Static4.aClass36_64.method1028() > local223; local223++) {
							if (Static62.anInt1617 == Static4.aClass36_64.method1004(local223)) {
								local221 = true;
								break;
							}
						}
						if (Static64.anInt1641 == 0) {
							if (Static50.anInt1322 == 85 && Static15.aClass36_186.method1028() > 0) {
								Static15.aClass36_186 = Static15.aClass36_186.method1018(0, Static15.aClass36_186.method1028() - 1);
							}
							if (Static50.anInt1322 == 84 || Static50.anInt1322 == 80) {
								Static64.anInt1641 = 1;
							}
							if (local221 && Static15.aClass36_186.method1028() < 12) {
								Static15.aClass36_186 = Static15.aClass36_186.method1002(Static62.anInt1617);
							}
						} else if (Static64.anInt1641 == 1) {
							if (Static50.anInt1322 == 85 && Static15.aClass36_190.method1028() > 0) {
								Static15.aClass36_190 = Static15.aClass36_190.method1018(0, Static15.aClass36_190.method1028() - 1);
							}
							if (Static50.anInt1322 == 84 || Static50.anInt1322 == 80) {
								Static64.anInt1641 = 0;
							}
							if (local221 && Static15.aClass36_190.method1028() < 20) {
								Static15.aClass36_190 = Static15.aClass36_190.method1002(Static62.anInt1617);
							}
						}
					}
					return;
				}
			}
		} else if (Static85.anInt2215 == 3 && local18 == 1 && local22 >= 105 && local22 <= 255 && local26 >= 130 && local26 <= 170) {
			Static85.anInt2215 = 0;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZI)Z")
	public static boolean method1917(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method1918() {
		@Pc(13) int local13;
		if (Static90.anInt2348 > 0) {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static90.anInt2348 > 768) {
					Static58.anIntArray194[local13] = Static32.method707(Static91.anIntArray281[local13], Static1.anIntArray1[local13], 1024 - Static90.anInt2348);
				} else if (Static90.anInt2348 <= 256) {
					Static58.anIntArray194[local13] = Static32.method707(Static1.anIntArray1[local13], Static91.anIntArray281[local13], 256 - Static90.anInt2348);
				} else {
					Static58.anIntArray194[local13] = Static91.anIntArray281[local13];
				}
			}
		} else if (Static81.anInt2065 <= 0) {
			for (local13 = 0; local13 < 256; local13++) {
				Static58.anIntArray194[local13] = Static1.anIntArray1[local13];
			}
		} else {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static81.anInt2065 > 768) {
					Static58.anIntArray194[local13] = Static32.method707(Static38.anIntArray144[local13], Static1.anIntArray1[local13], 1024 - Static81.anInt2065);
				} else if (Static81.anInt2065 <= 256) {
					Static58.anIntArray194[local13] = Static32.method707(Static1.anIntArray1[local13], Static38.anIntArray144[local13], 256 - Static81.anInt2065);
				} else {
					Static58.anIntArray194[local13] = Static38.anIntArray144[local13];
				}
			}
		}
		for (local13 = 0; local13 < 33920; local13++) {
			Static61.aClass14_22.anIntArray242[local13] = Static24.aClass2_Sub1_Sub1_Sub3_3.anIntArray224[local13];
		}
		@Pc(163) int local163 = 1152;
		@Pc(165) int local165 = 0;
		@Pc(180) int local180;
		@Pc(184) int local184;
		@Pc(194) int local194;
		@Pc(201) int local201;
		@Pc(205) int local205;
		@Pc(215) int local215;
		@Pc(210) int local210;
		for (@Pc(167) int local167 = 1; local167 < 255; local167++) {
			local180 = Static92.anIntArray290[local167] * (256 - local167) / 256;
			local184 = local180 + 22;
			if (local184 < 0) {
				local184 = 0;
			}
			local165 += local184;
			for (local194 = local184; local194 < 128; local194++) {
				local201 = Static14.anIntArray346[local165++];
				if (local201 == 0) {
					local163++;
				} else {
					local205 = local201;
					local210 = Static61.aClass14_22.anIntArray242[local163];
					local215 = 256 - local201;
					local201 = Static58.anIntArray194[local201];
					Static61.aClass14_22.anIntArray242[local163++] = ((local210 & 0xFF00FF) * local215 + local205 * (local201 & 0xFF00FF) & 0xFF00FF00) + (local215 * (local210 & 0xFF00) + (local201 & 0xFF00) * local205 & 0xFF0000) >> 8;
				}
			}
			local163 += local184;
		}
		local165 = 0;
		for (local180 = 0; local180 < 33920; local180++) {
			Static101.aClass14_33.anIntArray242[local180] = Static60.aClass2_Sub1_Sub1_Sub3_5.anIntArray224[local180];
		}
		local163 = 1176;
		for (local184 = 1; local184 < 255; local184++) {
			local194 = (256 - local184) * Static92.anIntArray290[local184] / 256;
			local201 = 103 - local194;
			local163 += local194;
			for (local205 = 0; local205 < local201; local205++) {
				local215 = Static14.anIntArray346[local165++];
				if (local215 == 0) {
					local163++;
				} else {
					local210 = local215;
					@Pc(350) int local350 = 256 - local215;
					local215 = Static58.anIntArray194[local215];
					@Pc(359) int local359 = Static101.aClass14_33.anIntArray242[local163];
					Static101.aClass14_33.anIntArray242[local163++] = (local350 * (local359 & 0xFF00) + (local215 & 0xFF00) * local210 & 0xFF0000) + ((local215 & 0xFF00FF) * local210 + ((local359 & 0xFF00FF) * local350) & 0xFF00FF00) >> 8;
				}
			}
			local163 += 128 - local201 - local194;
			local165 += 128 - local201;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!v;")
	public static Class2_Sub1_Sub17 method1919(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub17 local8 = (Class2_Sub1_Sub17) Static77.aClass22_27.method711((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static113.aClass3_Sub1_16.method928(0, arg0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class2_Sub1_Sub17();
		@Pc(40) Class2_Sub12 local40 = new Class2_Sub12(local22);
		local40.anInt1939 = local40.aByteArray20.length - 12;
		@Pc(53) int local53 = local40.method1412();
		local8.anInt2772 = local40.method1366();
		local8.anInt2776 = local40.method1366();
		@Pc(65) int local65 = 0;
		local8.anInt2779 = local40.method1366();
		local8.anInt2781 = local40.method1366();
		local8.aClass36Array47 = new Class36[local53];
		local40.anInt1939 = 0;
		local8.anIntArray335 = new int[local53];
		local8.anIntArray336 = new int[local53];
		while (local40.anInt1939 < local40.aByteArray20.length - 12) {
			@Pc(98) int local98 = local40.method1366();
			if (local98 == 3) {
				local8.aClass36Array47[local65] = local40.method1404();
			} else if (local98 >= 100 || local98 == 21 || local98 == 38 || local98 == 39) {
				local8.anIntArray336[local65] = local40.method1399();
			} else {
				local8.anIntArray336[local65] = local40.method1412();
			}
			local8.anIntArray335[local65++] = local98;
		}
		Static77.aClass22_27.method712(local8, (long) arg0);
		return local8;
	}
}
