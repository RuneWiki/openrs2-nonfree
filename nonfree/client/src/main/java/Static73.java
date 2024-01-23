import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int anInt1819;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ne;")
	public static Class2_Sub8_Sub14 aClass2_Sub8_Sub14_3;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!jj;")
	public static Class87 aClass87_3;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "[I")
	public static int[] anIntArray155 = new int[3];

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1821 = 0;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "[Lclient!u;")
	public static Class173[] aClass173Array1 = new Class173[50];

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	public static int anInt1823 = 0;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public static int anInt1827 = -1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Z")
	public static boolean method1394(@OriginalArg(1) int arg0) {
		Static258.aBoolean335 = true;
		Static281.anInt5563 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method1396() {
		Static244.method3897(false);
		@Pc(10) boolean local10 = true;
		Static41.anInt1021 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static296.aByteArrayArray19.length; local14++) {
			if (Static76.anIntArray160[local14] != -1 && Static296.aByteArrayArray19[local14] == null) {
				Static296.aByteArrayArray19[local14] = Static200.aClass42_61.method1256(Static76.anIntArray160[local14], 0);
				if (Static296.aByteArrayArray19[local14] == null) {
					local10 = false;
					Static41.anInt1021++;
				}
			}
			if (Static107.anIntArray212[local14] != -1 && Static195.aByteArrayArray20[local14] == null) {
				Static195.aByteArrayArray20[local14] = Static200.aClass42_61.method1282(0, Static107.anIntArray212[local14], Static204.anIntArrayArray31[local14]);
				if (Static195.aByteArrayArray20[local14] == null) {
					local10 = false;
					Static41.anInt1021++;
				}
			}
			if (Static116.aBoolean184) {
				if (Static53.anIntArray106[local14] != -1 && Static234.aByteArrayArray15[local14] == null) {
					Static234.aByteArrayArray15[local14] = Static200.aClass42_61.method1256(Static53.anIntArray106[local14], 0);
					if (Static234.aByteArrayArray15[local14] == null) {
						local10 = false;
						Static41.anInt1021++;
					}
				}
				if (Static60.anIntArray128[local14] != -1 && Static223.aByteArrayArray14[local14] == null) {
					Static223.aByteArrayArray14[local14] = Static200.aClass42_61.method1256(Static60.anIntArray128[local14], 0);
					if (Static223.aByteArrayArray14[local14] == null) {
						Static41.anInt1021++;
						local10 = false;
					}
				}
			}
			if (Static174.anIntArray375 != null && Static189.aByteArrayArray10[local14] == null && Static174.anIntArray375[local14] != -1) {
				Static189.aByteArrayArray10[local14] = Static200.aClass42_61.method1282(0, Static174.anIntArray375[local14], Static204.anIntArrayArray31[local14]);
				if (Static189.aByteArrayArray10[local14] == null) {
					local10 = false;
					Static41.anInt1021++;
				}
			}
		}
		if (Static27.aClass57_7 == null) {
			if (Static94.aClass2_Sub8_Sub16_1 == null || !Static278.aClass42_98.method1261(Static94.aClass2_Sub8_Sub16_1.aString151 + "_labels")) {
				Static27.aClass57_7 = new Class57(0);
			} else if (Static278.aClass42_98.method1277(Static94.aClass2_Sub8_Sub16_1.aString151 + "_labels")) {
				Static27.aClass57_7 = Static220.method3668(Static108.aBoolean163, Static94.aClass2_Sub8_Sub16_1.aString151 + "_labels", Static278.aClass42_98);
			} else {
				Static41.anInt1021++;
				local10 = false;
			}
		}
		if (!local10) {
			Static47.anInt1184 = 1;
			return;
		}
		Static287.anInt5650 = 0;
		local10 = true;
		@Pc(300) int local300;
		@Pc(290) int local290;
		for (local14 = 0; local14 < Static296.aByteArrayArray19.length; local14++) {
			@Pc(277) byte[] local277 = Static195.aByteArrayArray20[local14];
			if (local277 != null) {
				local290 = (Static253.anIntArray485[local14] & 0xFF) * 64 - Static234.anInt4705;
				local300 = (Static253.anIntArray485[local14] >> 8) * 64 - Static160.anInt5159;
				if (Static166.aBoolean246) {
					local300 = 10;
					local290 = 10;
				}
				local10 &= Static191.method3291(local277, local300, local290);
			}
			if (Static116.aBoolean184) {
				local277 = Static223.aByteArrayArray14[local14];
				if (local277 != null) {
					local290 = (Static253.anIntArray485[local14] & 0xFF) * 64 - Static234.anInt4705;
					local300 = (Static253.anIntArray485[local14] >> 8) * 64 - Static160.anInt5159;
					if (Static166.aBoolean246) {
						local290 = 10;
						local300 = 10;
					}
					local10 &= Static191.method3291(local277, local300, local290);
				}
			}
		}
		if (!local10) {
			Static47.anInt1184 = 2;
			return;
		}
		if (Static47.anInt1184 != 0) {
			Static63.method1183(Static269.aString179 + "<br>(100%)", true);
		}
		Static220.method3662();
		Static6.method116();
		@Pc(390) boolean local390 = false;
		@Pc(397) int local397;
		if (Static116.aBoolean184 && Static74.aBoolean118) {
			for (local397 = 0; local397 < Static296.aByteArrayArray19.length; local397++) {
				if (Static223.aByteArrayArray14[local397] != null || Static234.aByteArrayArray15[local397] != null) {
					local390 = true;
					break;
				}
			}
		}
		Static34.method655(Static116.aBoolean184 ? 28 : 25, local390);
		for (local397 = 0; local397 < 4; local397++) {
			Static89.aClass154Array1[local397].method3909();
		}
		for (local397 = 0; local397 < 4; local397++) {
			for (local300 = 0; local300 < 104; local300++) {
				for (local290 = 0; local290 < 104; local290++) {
					Static13.aByteArrayArrayArray2[local397][local300][local290] = 0;
				}
			}
		}
		Static153.method2804(false);
		if (Static116.aBoolean184) {
			Static266.aClass93_Sub1_4.method2570();
			for (local397 = 0; local397 < 13; local397++) {
				for (local300 = 0; local300 < 13; local300++) {
					Static266.aClass109ArrayArray1[local397][local300].aBoolean249 = true;
				}
			}
		}
		if (Static116.aBoolean184) {
			Static212.method3546();
		}
		if (Static116.aBoolean184) {
			Static60.method1159();
		}
		Static220.method3662();
		System.gc();
		Static244.method3897(true);
		Static146.method2599(false);
		if (!Static166.aBoolean246) {
			Static110.method1874(false);
			Static244.method3897(true);
			if (Static116.aBoolean184) {
				local397 = Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] >> 3;
				local300 = Static22.aClass15_Sub2_Sub2_1.anIntArray518[0] >> 3;
				Static60.method1162(local300, local397);
			}
			Static269.method4266(false);
			if (Static189.aByteArrayArray10 != null) {
				Static231.method3763();
			}
		}
		if (Static166.aBoolean246) {
			Static105.method796(false);
			Static244.method3897(true);
			if (Static116.aBoolean184) {
				local397 = Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] >> 3;
				local300 = Static22.aClass15_Sub2_Sub2_1.anIntArray518[0] >> 3;
				Static60.method1162(local300, local397);
			}
			Static44.method841(false);
		}
		Static6.method116();
		Static244.method3897(true);
		Static128.method2317(Static166.aBoolean246 ? Static50.anIntArrayArrayArray3 : (int[][][]) null, false, Static89.aClass154Array1);
		if (Static116.aBoolean184) {
			Static212.method3540();
		}
		Static244.method3897(true);
		local397 = Static305.anInt5900;
		if (local397 > Static32.anInt876) {
			local397 = Static32.anInt876;
		}
		if (Static32.anInt876 - 1 > local397) {
		}
		if (Static69.method2440()) {
			Static205.method3472(0);
		} else {
			Static205.method3472(Static305.anInt5900);
		}
		Static68.method1332();
		if (Static116.aBoolean184 && local390) {
			Static211.method3515(true);
			Static146.method2599(true);
			if (!Static166.aBoolean246) {
				Static110.method1874(true);
				Static244.method3897(true);
				Static269.method4266(true);
			}
			if (Static166.aBoolean246) {
				Static105.method796(true);
				Static244.method3897(true);
				Static44.method841(true);
			}
			Static6.method116();
			Static244.method3897(true);
			Static128.method2317(Static166.aBoolean246 ? Static50.anIntArrayArrayArray3 : (int[][][]) null, true, Static89.aClass154Array1);
			Static244.method3897(true);
			Static68.method1332();
			Static211.method3515(false);
		}
		if (Static116.aBoolean184) {
			for (local300 = 0; local300 < 13; local300++) {
				for (local290 = 0; local290 < 13; local290++) {
					Static266.aClass109ArrayArray1[local300][local290].method3089(Static9.anIntArrayArrayArray7[0], local300 * 8, local290 * 8);
				}
			}
		}
		for (local300 = 0; local300 < 104; local300++) {
			for (local290 = 0; local290 < 104; local290++) {
				Static99.method1706(local300, local290);
			}
		}
		Static227.method3705();
		Static220.method3662();
		Static33.method644();
		Static6.method116();
		Static143.aBoolean224 = false;
		if (Static116.aBoolean184) {
			Static35.method826(true);
		}
		if (Static72.aFrame1 != null && Static253.aClass34_3 != null && Static64.anInt1561 == 25) {
			Static211.aClass2_Sub16_Sub1_2.method2198(200);
			Static211.aClass2_Sub16_Sub1_2.method2186(1057001181);
		}
		if (!Static166.aBoolean246) {
			@Pc(833) int local833 = (Static261.anInt5142 - 6) / 8;
			local300 = (Static180.anInt3907 - 6) / 8;
			local290 = (Static180.anInt3907 + 6) / 8;
			@Pc(851) int local851 = (Static261.anInt5142 + 6) / 8;
			for (@Pc(855) int local855 = local300 - 1; local855 <= local290 + 1; local855++) {
				for (@Pc(864) int local864 = local833 - 1; local864 <= local851 + 1; local864++) {
					if (local300 > local855 || local290 < local855 || local833 > local864 || local864 > local851) {
						Static200.aClass42_61.method1263("m" + local855 + "_" + local864);
						Static200.aClass42_61.method1263("l" + local855 + "_" + local864);
					}
				}
			}
		}
		if (Static64.anInt1561 == 28) {
			Static305.method4624(10);
		} else {
			Static305.method4624(30);
			if (Static253.aClass34_3 != null) {
				Static211.aClass2_Sub16_Sub1_2.method2198(6);
			}
		}
		Static14.method246();
		Static220.method3662();
		Static226.method4757();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)V")
	public static void method1397(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static56.anIntArray123[arg0];
		@Pc(20) int local20 = (int) Static166.aLongArray4[arg0];
		@Pc(24) long local24 = Static166.aLongArray4[arg0];
		@Pc(28) int local28 = Static67.anIntArray144[arg0];
		@Pc(32) int local32 = Static290.aShortArray85[arg0];
		if (local32 >= 2000) {
			local32 -= 2000;
		}
		@Pc(44) Class15_Sub2_Sub2 local44;
		if (local32 == 43) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static226.anInt6057 = Static252.anInt4933;
				Static101.anInt2394 = 2;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static211.aClass2_Sub16_Sub1_2.method2198(166);
				Static211.aClass2_Sub16_Sub1_2.method2183(local20);
				Static211.aClass2_Sub16_Sub1_2.method2189(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		@Pc(108) Class15_Sub2_Sub1 local108;
		if (local32 == 16) {
			local108 = Static35.aClass15_Sub2_Sub1Array2[local20];
			if (local108 != null) {
				Static60.anInt1512 = Static86.anInt2010;
				Static226.anInt6057 = Static252.anInt4933;
				Static199.anInt4353 = 0;
				Static101.anInt2394 = 2;
				Static211.aClass2_Sub16_Sub1_2.method2198(53);
				Static211.aClass2_Sub16_Sub1_2.method2189(Static145.aBooleanArray13[82] ? 1 : 0);
				Static211.aClass2_Sub16_Sub1_2.method2164(local20);
				Static3.method82(local108.method4286(), local15, 0, 0, local108.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 37) {
			local108 = Static35.aClass15_Sub2_Sub1Array2[local20];
			if (local108 != null) {
				Static101.anInt2394 = 2;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static226.anInt6057 = Static252.anInt4933;
				Static211.aClass2_Sub16_Sub1_2.method2198(218);
				Static211.aClass2_Sub16_Sub1_2.method2164(local20);
				Static211.aClass2_Sub16_Sub1_2.method2183(Static239.anInt4787);
				Static211.aClass2_Sub16_Sub1_2.method2182(Static145.aBooleanArray13[82] ? 1 : 0);
				Static211.aClass2_Sub16_Sub1_2.method2184(Static220.anInt4519);
				Static3.method82(local108.method4286(), local15, 0, 0, local108.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 49) {
			Static211.aClass2_Sub16_Sub1_2.method2198(31);
			Static211.aClass2_Sub16_Sub1_2.method2167(local15);
			Static211.aClass2_Sub16_Sub1_2.method2164(local20);
			Static211.aClass2_Sub16_Sub1_2.method2180(local28);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		@Pc(278) Class56 local278;
		if (local32 == 20) {
			local278 = Static15.method273(local15, local28);
			if (local278 != null) {
				Static82.method1482();
				@Pc(285) Class2_Sub7 local285 = Static42.method804(local278);
				Static233.method4744(local278.anInt2037, local285.anInt428, local28, local15, local278.anInt2099, local285.method340());
				anInt1823 = 0;
				Static251.aString167 = Static50.method943(local278);
				if (Static251.aString167 == null) {
					Static251.aString167 = "Null";
				}
				if (local278.aBoolean132) {
					Static96.aString83 = local278.aString74 + "<col=ffffff>";
				} else {
					Static96.aString83 = "<col=00ff00>" + local278.aString72 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local32 == 25) {
			if (local20 == 0) {
				Static223.anInt4546 = 1;
				Static195.method4728(Static32.anInt876, local28, local15);
			} else if (local20 == 1) {
				Static211.aClass2_Sub16_Sub1_2.method2198(195);
				Static211.aClass2_Sub16_Sub1_2.method2183(Static239.anInt4787);
				Static211.aClass2_Sub16_Sub1_2.method2180(Static234.anInt4705 + local15);
				Static211.aClass2_Sub16_Sub1_2.method2173(Static220.anInt4519);
				Static211.aClass2_Sub16_Sub1_2.method2143(Static160.anInt5159 + local28);
			}
		}
		if (local32 == 32) {
			local108 = Static35.aClass15_Sub2_Sub1Array2[local20];
			if (local108 != null) {
				Static101.anInt2394 = 2;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static226.anInt6057 = Static252.anInt4933;
				Static211.aClass2_Sub16_Sub1_2.method2198(163);
				Static211.aClass2_Sub16_Sub1_2.method2180(local20);
				Static211.aClass2_Sub16_Sub1_2.method2189(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local108.method4286(), local15, 0, 0, local108.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 41 || local32 == 1011) {
			Static47.method879(local15, Static175.aStringArray28[arg0], local20, local28);
		}
		if (local32 == 11) {
			Static211.aClass2_Sub16_Sub1_2.method2198(170);
			Static211.aClass2_Sub16_Sub1_2.method2173(Static220.anInt4519);
			Static211.aClass2_Sub16_Sub1_2.method2186(local15);
			Static211.aClass2_Sub16_Sub1_2.method2164(local28);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static239.anInt4787);
		}
		if (local32 == 4) {
			local108 = Static35.aClass15_Sub2_Sub1Array2[local20];
			if (local108 != null) {
				Static199.anInt4353 = 0;
				Static226.anInt6057 = Static252.anInt4933;
				Static60.anInt1512 = Static86.anInt2010;
				Static101.anInt2394 = 2;
				Static211.aClass2_Sub16_Sub1_2.method2198(106);
				Static211.aClass2_Sub16_Sub1_2.method2183(Static252.anInt4937);
				Static211.aClass2_Sub16_Sub1_2.method2167(Static255.anInt5033);
				Static211.aClass2_Sub16_Sub1_2.method2182(Static145.aBooleanArray13[82] ? 1 : 0);
				Static211.aClass2_Sub16_Sub1_2.method2143(Static165.anInt3657);
				Static211.aClass2_Sub16_Sub1_2.method2180(local20);
				Static3.method82(local108.method4286(), local15, 0, 0, local108.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 51) {
			Static211.aClass2_Sub16_Sub1_2.method2198(157);
			Static211.aClass2_Sub16_Sub1_2.method2183(local20);
			Static211.aClass2_Sub16_Sub1_2.method2143(local28);
			Static211.aClass2_Sub16_Sub1_2.method2173(local15);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 1012) {
			Static60.anInt1512 = Static86.anInt2010;
			Static101.anInt2394 = 2;
			Static226.anInt6057 = Static252.anInt4933;
			Static199.anInt4353 = 0;
			Static211.aClass2_Sub16_Sub1_2.method2198(50);
			Static211.aClass2_Sub16_Sub1_2.method2183(local20);
		}
		if (local32 == 2) {
			Static101.anInt2394 = 2;
			Static199.anInt4353 = 0;
			Static60.anInt1512 = Static86.anInt2010;
			Static226.anInt6057 = Static252.anInt4933;
			Static211.aClass2_Sub16_Sub1_2.method2198(230);
			Static211.aClass2_Sub16_Sub1_2.method2182(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2143((int) (local24 >>> 32) & Integer.MAX_VALUE);
			Static211.aClass2_Sub16_Sub1_2.method2164(Static239.anInt4787);
			Static211.aClass2_Sub16_Sub1_2.method2173(Static220.anInt4519);
			Static211.aClass2_Sub16_Sub1_2.method2164(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2164(local28 + Static160.anInt5159);
			Static239.method3835(local24, local28, local15);
		}
		if (local32 == 14) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static101.anInt2394 = 2;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static226.anInt6057 = Static252.anInt4933;
				Static211.aClass2_Sub16_Sub1_2.method2198(127);
				Static211.aClass2_Sub16_Sub1_2.method2154(Static145.aBooleanArray13[82] ? 1 : 0);
				Static211.aClass2_Sub16_Sub1_2.method2183(local20);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 17) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static60.anInt1512 = Static86.anInt2010;
				Static101.anInt2394 = 2;
				Static226.anInt6057 = Static252.anInt4933;
				Static199.anInt4353 = 0;
				Static211.aClass2_Sub16_Sub1_2.method2198(227);
				Static211.aClass2_Sub16_Sub1_2.method2180(local20);
				Static211.aClass2_Sub16_Sub1_2.method2189(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 1002) {
			Static101.anInt2394 = 2;
			Static60.anInt1512 = Static86.anInt2010;
			Static199.anInt4353 = 0;
			Static226.anInt6057 = Static252.anInt4933;
			Static211.aClass2_Sub16_Sub1_2.method2198(124);
			Static211.aClass2_Sub16_Sub1_2.method2143(local20);
		}
		if (local32 == 1010) {
			Static60.anInt1512 = Static86.anInt2010;
			Static199.anInt4353 = 0;
			Static226.anInt6057 = Static252.anInt4933;
			Static101.anInt2394 = 2;
			local108 = Static35.aClass15_Sub2_Sub1Array2[local20];
			if (local108 != null) {
				@Pc(881) Class188 local881 = local108.aClass188_1;
				if (local881.anIntArray572 != null) {
					local881 = local881.method4618();
				}
				if (local881 != null) {
					Static211.aClass2_Sub16_Sub1_2.method2198(116);
					Static211.aClass2_Sub16_Sub1_2.method2180(local881.anInt5861);
				}
			}
		}
		if (local32 == 50) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static199.anInt4353 = 0;
				Static226.anInt6057 = Static252.anInt4933;
				Static60.anInt1512 = Static86.anInt2010;
				Static101.anInt2394 = 2;
				Static211.aClass2_Sub16_Sub1_2.method2198(248);
				Static211.aClass2_Sub16_Sub1_2.method2184(Static220.anInt4519);
				Static211.aClass2_Sub16_Sub1_2.method2164(local20);
				Static211.aClass2_Sub16_Sub1_2.method2154(Static145.aBooleanArray13[82] ? 1 : 0);
				Static211.aClass2_Sub16_Sub1_2.method2183(Static239.anInt4787);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 28) {
			Static60.anInt1512 = Static86.anInt2010;
			Static199.anInt4353 = 0;
			Static101.anInt2394 = 2;
			Static226.anInt6057 = Static252.anInt4933;
			Static211.aClass2_Sub16_Sub1_2.method2198(29);
			Static211.aClass2_Sub16_Sub1_2.method2182(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2143(Integer.MAX_VALUE & (int) (local24 >>> 32));
			Static211.aClass2_Sub16_Sub1_2.method2143(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2143(local28 + Static160.anInt5159);
			Static239.method3835(local24, local28, local15);
		}
		if (local32 == 58) {
			Static211.aClass2_Sub16_Sub1_2.method2198(74);
			Static211.aClass2_Sub16_Sub1_2.method2173(local15);
			Static211.aClass2_Sub16_Sub1_2.method2183(local20);
			Static211.aClass2_Sub16_Sub1_2.method2180(local28);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 42) {
			Static60.anInt1512 = Static86.anInt2010;
			Static101.anInt2394 = 2;
			Static199.anInt4353 = 0;
			Static226.anInt6057 = Static252.anInt4933;
			Static211.aClass2_Sub16_Sub1_2.method2198(137);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2164(local20);
			Static211.aClass2_Sub16_Sub1_2.method2143(Static160.anInt5159 + local28);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static145.aBooleanArray13[82] ? 1 : 0);
			Static3.method82(0, local15, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
		}
		@Pc(1183) int local1183;
		if (local32 == 19) {
			Static211.aClass2_Sub16_Sub1_2.method2198(213);
			Static211.aClass2_Sub16_Sub1_2.method2186(local15);
			local278 = Static38.method715(local15);
			if (local278.anIntArrayArray5 != null && local278.anIntArrayArray5[0][0] == 5) {
				local1183 = local278.anIntArrayArray5[0][1];
				if (local278.anIntArray182[0] != Static64.anIntArray134[local1183]) {
					Static64.anIntArray134[local1183] = local278.anIntArray182[0];
					Static143.method2545(local1183);
				}
			}
		}
		if (local32 == 12 && Static159.aClass56_17 == null) {
			Static306.method4639(local28, local15);
			Static159.aClass56_17 = Static15.method273(local15, local28);
			Static287.method4466(Static159.aClass56_17);
		}
		if (local32 == 36) {
			Static199.anInt4353 = 0;
			Static60.anInt1512 = Static86.anInt2010;
			Static101.anInt2394 = 2;
			Static226.anInt6057 = Static252.anInt4933;
			Static211.aClass2_Sub16_Sub1_2.method2198(117);
			Static211.aClass2_Sub16_Sub1_2.method2183(Static165.anInt3657);
			Static211.aClass2_Sub16_Sub1_2.method2183(local15 + Static234.anInt4705);
			Static211.aClass2_Sub16_Sub1_2.method2143(local28 + Static160.anInt5159);
			Static211.aClass2_Sub16_Sub1_2.method2183((int) (local24 >>> 32) & Integer.MAX_VALUE);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static252.anInt4937);
			Static211.aClass2_Sub16_Sub1_2.method2186(Static255.anInt5033);
			Static239.method3835(local24, local28, local15);
		}
		if (local32 == 10) {
			Static101.anInt2394 = 2;
			Static60.anInt1512 = Static86.anInt2010;
			Static226.anInt6057 = Static252.anInt4933;
			Static199.anInt4353 = 0;
			Static211.aClass2_Sub16_Sub1_2.method2198(252);
			Static211.aClass2_Sub16_Sub1_2.method2180(local15 + Static234.anInt4705);
			Static211.aClass2_Sub16_Sub1_2.method2183((int) (local24 >>> 32) & Integer.MAX_VALUE);
			Static211.aClass2_Sub16_Sub1_2.method2183(Static160.anInt5159 + local28);
			Static211.aClass2_Sub16_Sub1_2.method2154(Static145.aBooleanArray13[82] ? 1 : 0);
			Static239.method3835(local24, local28, local15);
		}
		if (local32 == 35) {
			if (local20 == 0) {
				Static197.anInt4175 = 1;
				Static195.method4728(Static32.anInt876, local28, local15);
			} else if (Static175.anInt3864 > 0 && Static145.aBooleanArray13[82] && Static145.aBooleanArray13[81]) {
				Static100.method1726(Static32.anInt876, Static160.anInt5159 + local28, Static234.anInt4705 + local15);
			} else {
				Static211.aClass2_Sub16_Sub1_2.method2198(105);
				Static211.aClass2_Sub16_Sub1_2.method2183(Static160.anInt5159 + local28);
				Static211.aClass2_Sub16_Sub1_2.method2143(Static234.anInt4705 + local15);
			}
		}
		if (local32 == 31) {
			if (local20 == 0) {
				Static195.method4728(Static32.anInt876, local28, local15);
			} else if (local20 == 1) {
				if (Static175.anInt3864 > 0 && Static145.aBooleanArray13[82] && Static145.aBooleanArray13[81]) {
					Static100.method1726(Static32.anInt876, Static160.anInt5159 + local28, local15 + Static234.anInt4705);
				} else {
					Static272.method4307(local28, 1, local15);
					Static211.aClass2_Sub16_Sub1_2.method2168(Static87.anInt2019);
					Static211.aClass2_Sub16_Sub1_2.method2168(Static71.anInt1813);
					Static211.aClass2_Sub16_Sub1_2.method2143((int) Static239.aFloat51);
					Static211.aClass2_Sub16_Sub1_2.method2168(57);
					if (Static16.anInt342 == 4) {
						Static211.aClass2_Sub16_Sub1_2.method2168(0);
						Static211.aClass2_Sub16_Sub1_2.method2168(0);
					} else {
						Static211.aClass2_Sub16_Sub1_2.method2168(Static301.anInt5810);
						Static211.aClass2_Sub16_Sub1_2.method2168(Static141.anInt3097);
					}
					Static211.aClass2_Sub16_Sub1_2.method2168(89);
					Static211.aClass2_Sub16_Sub1_2.method2143(Static22.aClass15_Sub2_Sub2_1.anInt5358);
					Static211.aClass2_Sub16_Sub1_2.method2143(Static22.aClass15_Sub2_Sub2_1.anInt5371);
					Static211.aClass2_Sub16_Sub1_2.method2168(Static281.anInt5549);
					Static211.aClass2_Sub16_Sub1_2.method2168(63);
					Static3.method82(0, local15, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
				}
			}
		}
		if (local32 == 1) {
			Static199.anInt4353 = 0;
			Static60.anInt1512 = Static86.anInt2010;
			Static101.anInt2394 = 2;
			Static226.anInt6057 = Static252.anInt4933;
			Static211.aClass2_Sub16_Sub1_2.method2198(108);
			Static211.aClass2_Sub16_Sub1_2.method2143(local20);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2143(Static160.anInt5159 + local28);
			Static211.aClass2_Sub16_Sub1_2.method2182(Static145.aBooleanArray13[82] ? 1 : 0);
			Static3.method82(0, local15, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
		}
		if (local32 == 26) {
			Static211.aClass2_Sub16_Sub1_2.method2198(91);
			Static211.aClass2_Sub16_Sub1_2.method2173(local15);
			Static211.aClass2_Sub16_Sub1_2.method2183(local20);
			Static211.aClass2_Sub16_Sub1_2.method2164(local28);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 3) {
			Static60.anInt1512 = Static86.anInt2010;
			Static101.anInt2394 = 2;
			Static199.anInt4353 = 0;
			Static226.anInt6057 = Static252.anInt4933;
			Static211.aClass2_Sub16_Sub1_2.method2198(249);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2180(Integer.MAX_VALUE & (int) (local24 >>> 32));
			Static211.aClass2_Sub16_Sub1_2.method2143(local28 + Static160.anInt5159);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static145.aBooleanArray13[82] ? 1 : 0);
			Static239.method3835(local24, local28, local15);
		}
		if (local32 == 59) {
			Static60.anInt1512 = Static86.anInt2010;
			Static101.anInt2394 = 2;
			Static226.anInt6057 = Static252.anInt4933;
			Static199.anInt4353 = 0;
			Static211.aClass2_Sub16_Sub1_2.method2198(194);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static160.anInt5159 + local28);
			Static211.aClass2_Sub16_Sub1_2.method2143(local20);
			Static211.aClass2_Sub16_Sub1_2.method2182(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2164(Static234.anInt4705 + local15);
			Static3.method82(0, local15, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
		}
		if (local32 == 60) {
			Static211.aClass2_Sub16_Sub1_2.method2198(25);
			Static211.aClass2_Sub16_Sub1_2.method2180(local28);
			Static211.aClass2_Sub16_Sub1_2.method2180(local20);
			Static211.aClass2_Sub16_Sub1_2.method2173(local15);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 46) {
			local108 = Static35.aClass15_Sub2_Sub1Array2[local20];
			if (local108 != null) {
				Static60.anInt1512 = Static86.anInt2010;
				Static101.anInt2394 = 2;
				Static199.anInt4353 = 0;
				Static226.anInt6057 = Static252.anInt4933;
				Static211.aClass2_Sub16_Sub1_2.method2198(152);
				Static211.aClass2_Sub16_Sub1_2.method2164(local20);
				Static211.aClass2_Sub16_Sub1_2.method2154(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local108.method4286(), local15, 0, 0, local108.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 57) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static101.anInt2394 = 2;
				Static226.anInt6057 = Static252.anInt4933;
				Static211.aClass2_Sub16_Sub1_2.method2198(40);
				Static211.aClass2_Sub16_Sub1_2.method2183(local20);
				Static211.aClass2_Sub16_Sub1_2.method2168(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 23) {
			Static211.aClass2_Sub16_Sub1_2.method2198(188);
			Static211.aClass2_Sub16_Sub1_2.method2183(local20);
			Static211.aClass2_Sub16_Sub1_2.method2164(local28);
			Static211.aClass2_Sub16_Sub1_2.method2186(local15);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 40) {
			@Pc(1983) boolean local1983 = true;
			local278 = Static38.method715(local15);
			if (local278.anInt2074 > 0) {
				local1983 = Static82.method1486(local278);
			}
			if (local1983) {
				Static211.aClass2_Sub16_Sub1_2.method2198(213);
				Static211.aClass2_Sub16_Sub1_2.method2186(local15);
			}
		}
		if (local32 == 48) {
			Static211.aClass2_Sub16_Sub1_2.method2198(121);
			Static211.aClass2_Sub16_Sub1_2.method2143(local28);
			Static211.aClass2_Sub16_Sub1_2.method2167(local15);
			Static211.aClass2_Sub16_Sub1_2.method2164(local20);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 47) {
			local108 = Static35.aClass15_Sub2_Sub1Array2[local20];
			if (local108 != null) {
				Static226.anInt6057 = Static252.anInt4933;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static101.anInt2394 = 2;
				Static211.aClass2_Sub16_Sub1_2.method2198(187);
				Static211.aClass2_Sub16_Sub1_2.method2182(Static145.aBooleanArray13[82] ? 1 : 0);
				Static211.aClass2_Sub16_Sub1_2.method2183(local20);
				Static3.method82(local108.method4286(), local15, 0, 0, local108.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 34) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static101.anInt2394 = 2;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static226.anInt6057 = Static252.anInt4933;
				Static211.aClass2_Sub16_Sub1_2.method2198(186);
				Static211.aClass2_Sub16_Sub1_2.method2154(Static145.aBooleanArray13[82] ? 1 : 0);
				Static211.aClass2_Sub16_Sub1_2.method2143(local20);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 5) {
			Static199.anInt4353 = 0;
			Static226.anInt6057 = Static252.anInt4933;
			Static101.anInt2394 = 2;
			Static60.anInt1512 = Static86.anInt2010;
			Static211.aClass2_Sub16_Sub1_2.method2198(99);
			Static211.aClass2_Sub16_Sub1_2.method2180(local28 + Static160.anInt5159);
			Static211.aClass2_Sub16_Sub1_2.method2154(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2143((int) (local24 >>> 32) & Integer.MAX_VALUE);
			Static211.aClass2_Sub16_Sub1_2.method2143(local15 + Static234.anInt4705);
			Static239.method3835(local24, local28, local15);
		}
		if (local32 == 7) {
			Static296.method4528();
		}
		if (local32 == 39) {
			Static101.anInt2394 = 2;
			Static60.anInt1512 = Static86.anInt2010;
			Static226.anInt6057 = Static252.anInt4933;
			Static199.anInt4353 = 0;
			Static211.aClass2_Sub16_Sub1_2.method2198(140);
			Static211.aClass2_Sub16_Sub1_2.method2143(local20);
			Static211.aClass2_Sub16_Sub1_2.method2189(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2164(local28 + Static160.anInt5159);
			Static211.aClass2_Sub16_Sub1_2.method2173(Static220.anInt4519);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static239.anInt4787);
			Static3.method82(0, local15, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
		}
		if (local32 == 13) {
			Static211.aClass2_Sub16_Sub1_2.method2198(34);
			Static211.aClass2_Sub16_Sub1_2.method2186(local15);
			Static211.aClass2_Sub16_Sub1_2.method2180(local20);
			Static211.aClass2_Sub16_Sub1_2.method2183(Static165.anInt3657);
			Static211.aClass2_Sub16_Sub1_2.method2143(Static252.anInt4937);
			Static211.aClass2_Sub16_Sub1_2.method2183(local28);
			Static211.aClass2_Sub16_Sub1_2.method2186(Static255.anInt5033);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 1008 || local32 == 1006 || local32 == 1005 || local32 == 1003 || local32 == 1009) {
			Static146.method2602(local32, local20, local28);
		}
		if (local32 == 30) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static226.anInt6057 = Static252.anInt4933;
				Static101.anInt2394 = 2;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static211.aClass2_Sub16_Sub1_2.method2198(190);
				Static211.aClass2_Sub16_Sub1_2.method2183(local20);
				Static211.aClass2_Sub16_Sub1_2.method2189(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 1007) {
			Static60.anInt1512 = Static86.anInt2010;
			Static226.anInt6057 = Static252.anInt4933;
			Static101.anInt2394 = 2;
			Static199.anInt4353 = 0;
			Static211.aClass2_Sub16_Sub1_2.method2198(179);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static160.anInt5159 + local28);
			Static211.aClass2_Sub16_Sub1_2.method2183((int) (local24 >>> 32) & Integer.MAX_VALUE);
			Static211.aClass2_Sub16_Sub1_2.method2164(local15 + Static234.anInt4705);
			Static239.method3835(local24, local28, local15);
		}
		if (local32 == 1001) {
			local278 = Static38.method715(local15);
			if (local278 == null || local278.anIntArray180[local28] < 100000) {
				Static211.aClass2_Sub16_Sub1_2.method2198(124);
				Static211.aClass2_Sub16_Sub1_2.method2143(local20);
			} else {
				Static315.method4765(local278.anIntArray180[local28] + " x " + Static87.method1546(local20).aString81);
			}
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 18) {
			Static226.anInt6057 = Static252.anInt4933;
			Static199.anInt4353 = 0;
			Static60.anInt1512 = Static86.anInt2010;
			Static101.anInt2394 = 2;
			Static211.aClass2_Sub16_Sub1_2.method2198(169);
			Static211.aClass2_Sub16_Sub1_2.method2164(local28 + Static160.anInt5159);
			Static211.aClass2_Sub16_Sub1_2.method2154(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2143(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2183(local20);
			Static3.method82(0, local15, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
		}
		if (local32 == 24) {
			Static101.anInt2394 = 2;
			Static60.anInt1512 = Static86.anInt2010;
			Static226.anInt6057 = Static252.anInt4933;
			Static199.anInt4353 = 0;
			Static211.aClass2_Sub16_Sub1_2.method2198(217);
			Static211.aClass2_Sub16_Sub1_2.method2180(Static165.anInt3657);
			Static211.aClass2_Sub16_Sub1_2.method2180(local20);
			Static211.aClass2_Sub16_Sub1_2.method2143(local28 + Static160.anInt5159);
			Static211.aClass2_Sub16_Sub1_2.method2164(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2167(Static255.anInt5033);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static145.aBooleanArray13[82] ? 1 : 0);
			Static211.aClass2_Sub16_Sub1_2.method2183(Static252.anInt4937);
			Static3.method82(0, local15, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
		}
		if (local32 == 6) {
			local108 = Static35.aClass15_Sub2_Sub1Array2[local20];
			if (local108 != null) {
				Static226.anInt6057 = Static252.anInt4933;
				Static101.anInt2394 = 2;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static211.aClass2_Sub16_Sub1_2.method2198(229);
				Static211.aClass2_Sub16_Sub1_2.method2180(local20);
				Static211.aClass2_Sub16_Sub1_2.method2154(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local108.method4286(), local15, 0, 0, local108.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 15) {
			Static101.anInt2394 = 2;
			Static60.anInt1512 = Static86.anInt2010;
			Static226.anInt6057 = Static252.anInt4933;
			Static199.anInt4353 = 0;
			Static211.aClass2_Sub16_Sub1_2.method2198(181);
			Static211.aClass2_Sub16_Sub1_2.method2164(Static234.anInt4705 + local15);
			Static211.aClass2_Sub16_Sub1_2.method2143(local20);
			Static211.aClass2_Sub16_Sub1_2.method2143(local28 + Static160.anInt5159);
			Static211.aClass2_Sub16_Sub1_2.method2189(Static145.aBooleanArray13[82] ? 1 : 0);
			Static3.method82(0, local15, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
		}
		if (local32 == 33) {
			Static211.aClass2_Sub16_Sub1_2.method2198(213);
			Static211.aClass2_Sub16_Sub1_2.method2186(local15);
			local278 = Static38.method715(local15);
			if (local278.anIntArrayArray5 != null && local278.anIntArrayArray5[0][0] == 5) {
				local1183 = local278.anIntArrayArray5[0][1];
				Static64.anIntArray134[local1183] = 1 - Static64.anIntArray134[local1183];
				Static143.method2545(local1183);
			}
		}
		if (local32 == 38) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static199.anInt4353 = 0;
				Static60.anInt1512 = Static86.anInt2010;
				Static101.anInt2394 = 2;
				Static226.anInt6057 = Static252.anInt4933;
				Static211.aClass2_Sub16_Sub1_2.method2198(142);
				Static211.aClass2_Sub16_Sub1_2.method2183(local20);
				Static211.aClass2_Sub16_Sub1_2.method2168(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 9) {
			Static211.aClass2_Sub16_Sub1_2.method2198(175);
			Static211.aClass2_Sub16_Sub1_2.method2143(local20);
			Static211.aClass2_Sub16_Sub1_2.method2143(local28);
			Static211.aClass2_Sub16_Sub1_2.method2167(local15);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 21) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static199.anInt4353 = 0;
				Static101.anInt2394 = 2;
				Static226.anInt6057 = Static252.anInt4933;
				Static60.anInt1512 = Static86.anInt2010;
				Static211.aClass2_Sub16_Sub1_2.method2198(36);
				Static211.aClass2_Sub16_Sub1_2.method2173(Static255.anInt5033);
				Static211.aClass2_Sub16_Sub1_2.method2168(Static145.aBooleanArray13[82] ? 1 : 0);
				Static211.aClass2_Sub16_Sub1_2.method2180(local20);
				Static211.aClass2_Sub16_Sub1_2.method2180(Static252.anInt4937);
				Static211.aClass2_Sub16_Sub1_2.method2143(Static165.anInt3657);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 29) {
			Static211.aClass2_Sub16_Sub1_2.method2198(174);
			Static211.aClass2_Sub16_Sub1_2.method2180(local20);
			Static211.aClass2_Sub16_Sub1_2.method2167(local15);
			Static211.aClass2_Sub16_Sub1_2.method2180(local28);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 22) {
			Static211.aClass2_Sub16_Sub1_2.method2198(61);
			Static211.aClass2_Sub16_Sub1_2.method2164(local20);
			Static211.aClass2_Sub16_Sub1_2.method2143(Static239.anInt4787);
			Static211.aClass2_Sub16_Sub1_2.method2184(local15);
			Static211.aClass2_Sub16_Sub1_2.method2173(Static220.anInt4519);
			Static211.aClass2_Sub16_Sub1_2.method2164(local28);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (local32 == 45) {
			local44 = Static188.aClass15_Sub2_Sub2Array41[local20];
			if (local44 != null) {
				Static101.anInt2394 = 2;
				Static226.anInt6057 = Static252.anInt4933;
				Static60.anInt1512 = Static86.anInt2010;
				Static199.anInt4353 = 0;
				Static211.aClass2_Sub16_Sub1_2.method2198(180);
				Static211.aClass2_Sub16_Sub1_2.method2143(local20);
				Static211.aClass2_Sub16_Sub1_2.method2189(Static145.aBooleanArray13[82] ? 1 : 0);
				Static3.method82(local44.method4286(), local15, 0, 0, local44.method4286(), Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local28, 0);
			}
		}
		if (local32 == 44) {
			Static82.method1482();
			local278 = Static38.method715(local15);
			Static165.anInt3657 = local20;
			Static252.anInt4937 = local28;
			Static255.anInt5033 = local15;
			anInt1823 = 1;
			Static287.method4466(local278);
			Static4.aString3 = "<col=ff9040>" + Static87.method1546(local20).aString81 + "<col=ffffff>";
			if (Static4.aString3 == null) {
				Static4.aString3 = "null";
			}
			return;
		}
		if (local32 == 8) {
			Static211.aClass2_Sub16_Sub1_2.method2198(88);
			Static211.aClass2_Sub16_Sub1_2.method2183(local20);
			Static211.aClass2_Sub16_Sub1_2.method2183(local28);
			Static211.aClass2_Sub16_Sub1_2.method2186(local15);
			Static26.anInt4565 = 0;
			Static137.aClass56_13 = Static38.method715(local15);
			Static13.anInt261 = local28;
		}
		if (anInt1823 != 0) {
			anInt1823 = 0;
			Static287.method4466(Static38.method715(Static255.anInt5033));
		}
		if (Static287.aBoolean373) {
			Static82.method1482();
		}
		if (Static137.aClass56_13 != null && Static26.anInt4565 == 0) {
			Static287.method4466(Static137.aClass56_13);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZI)V")
	public static void method1398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static268.method4233(arg1)) {
			Static5.method3853(arg0, Static262.aClass56ArrayArray1[arg1]);
		}
	}
}
