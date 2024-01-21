import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "J")
	public static long aLong166 = 0L;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7 = new byte[4][104][104];

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!p;")
	public static Class63 aClass63_24 = new Class63(64);

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1297 = Static78.method1313("(Udns");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1298 = Static78.method1313("null");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1299 = Static78.method1313("M");

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1300 = aClass25_1299;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1301 = Static78.method1313("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1302 = Static78.method1313("_");

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1306 = Static78.method1313("New User");

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1303 = aClass25_1306;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "[B")
	public static byte[] aByteArray33 = new byte[520];

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1305 = Static78.method1313("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1304 = aClass25_1305;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!fc;")
	public static Class25 method1858(@OriginalArg(1) int arg0) {
		@Pc(10) Class25 local10 = Static74.method1214(arg0);
		for (@Pc(16) int local16 = local10.method762() - 3; local16 > 0; local16 -= 3) {
			local10 = method1859(new Class25[] { local10.method781(0, local16), Static62.aClass25_622, local10.method794(local16) });
		}
		if (local10.method762() > 8) {
			local10 = method1859(new Class25[] { Static103.aClass25_1362, local10.method781(0, local10.method762() - 8), Static24.aClass25_300, Static59.aClass25_585, local10, Static26.aClass25_322 });
		} else if (local10.method762() > 4) {
			local10 = method1859(new Class25[] { Static120.aClass25_1380, local10.method781(0, local10.method762() - 4), Static1.aClass25_16, Static59.aClass25_585, local10, Static26.aClass25_322 });
		}
		return method1859(new Class25[] { Static70.aClass25_631, local10 });
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([Lclient!fc;B)Lclient!fc;")
	public static Class25 method1859(@OriginalArg(0) Class25[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static8.method228(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Lclient!g;")
	public static Class1_Sub2_Sub9 method1860(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub9 local6 = (Class1_Sub2_Sub9) Static76.aClass63_13.method1517((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static12.aClass56_11.method1269(14, arg0);
		local6 = new Class1_Sub2_Sub9();
		if (local20 != null) {
			local6.method876(new Class1_Sub5(local20));
		}
		Static76.aClass63_13.method1520(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1861() {
		if (Static65.anInt1449 == 0) {
			return;
		}
		@Pc(13) int local13 = 0;
		if (Static105.anInt2386 != 0) {
			local13 = 1;
		}
		for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
			if (Static97.aClass25Array20[local22] != null) {
				@Pc(32) int local32 = Static122.anIntArray495[local22];
				@Pc(36) Class25 local36 = Static118.aClass25Array23[local22];
				if (local36 != null && local36.method797(Static77.aClass25_810)) {
					local36 = local36.method794(5);
				}
				if (local36 != null && local36.method797(Static38.aClass25_448)) {
					local36 = local36.method794(5);
				}
				if ((local32 == 3 || local32 == 7) && (local32 == 7 || Static80.anInt1785 == 0 || Static80.anInt1785 == 1 && Static31.method704(local36))) {
					@Pc(91) int local91 = 329 - local13 * 13;
					local13++;
					if (Static10.anInt264 > 4 && Static111.anInt2597 - 4 > local91 - 10 && local91 + 3 >= Static111.anInt2597 + -4) {
						@Pc(142) int local142 = Static42.aClass1_Sub2_Sub2_Sub3_1.method1187(method1859(new Class25[] { Static10.aClass25_141, Static125.aClass25_1192, local36, Static97.aClass25Array20[local22] })) + 25;
						if (local142 > 450) {
							local142 = 450;
						}
						if (Static10.anInt264 < local142 + 4) {
							if (Static5.anInt108 >= 1) {
								Static80.method1365(0, 2056, 0, 0, method1859(new Class25[] { Static50.aClass25_516, local36 }), Static3.aClass25_40);
							}
							Static80.method1365(0, 2054, 0, 0, method1859(new Class25[] { Static50.aClass25_516, local36 }), Static11.aClass25_153);
							Static80.method1365(0, 2004, 0, 0, method1859(new Class25[] { Static50.aClass25_516, local36 }), Static96.aClass25_1373);
						}
					}
					if (local13 >= 5) {
						return;
					}
				}
				if ((local32 == 5 || local32 == 6) && Static80.anInt1785 < 2) {
					local13++;
					if (local13 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1862() {
		aClass25_1304 = null;
		aClass25_1298 = null;
		aClass63_24 = null;
		aClass25_1299 = null;
		aClass25_1303 = null;
		aClass25_1302 = null;
		aClass25_1297 = null;
		aClass25_1300 = null;
		aByteArray33 = null;
		aByteArrayArrayArray7 = null;
		aClass25_1306 = null;
		aClass25_1301 = null;
		aClass25_1305 = null;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public static void method1864() {
		Static121.method1992(false);
		Static3.anInt54 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(18) int local18 = 0; local18 < Static123.aByteArrayArray9.length; local18++) {
			if (Static50.anIntArray244[local18] != -1 && Static123.aByteArrayArray9[local18] == null) {
				Static123.aByteArrayArray9[local18] = Static18.aClass56_Sub1_2.method1269(Static50.anIntArray244[local18], 0);
				if (Static123.aByteArrayArray9[local18] == null) {
					local12 = false;
					Static3.anInt54++;
				}
			}
			if (Static14.anIntArray78[local18] != -1 && Static105.aByteArrayArray8[local18] == null) {
				Static105.aByteArrayArray8[local18] = Static18.aClass56_Sub1_2.method1271(Static127.anIntArrayArray30[local18], Static14.anIntArray78[local18], 0);
				if (Static105.aByteArrayArray8[local18] == null) {
					Static3.anInt54++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static34.anInt944 = 1;
			return;
		}
		local12 = true;
		Static105.anInt2381 = 0;
		@Pc(122) int local122;
		@Pc(133) int local133;
		for (@Pc(103) int local103 = 0; local103 < Static123.aByteArrayArray9.length; local103++) {
			@Pc(109) byte[] local109 = Static105.aByteArrayArray8[local103];
			if (local109 != null) {
				local122 = (Static8.anIntArray43[local103] >> 8) * 64 - Static46.anInt1190;
				local133 = (Static8.anIntArray43[local103] & 0xFF) * 64 - Static47.anInt1211;
				if (Static6.aBoolean3) {
					local133 = 10;
					local122 = 10;
				}
				local12 &= Static59.method1058(local122, local109, local133);
			}
		}
		if (!local12) {
			Static34.anInt944 = 2;
			return;
		}
		if (Static34.anInt944 != 0) {
			Static111.method1790(Static74.aClass25_737, Static2.aClass25_30, true);
		}
		Static106.method1722();
		Static50.method987();
		Static106.method1722();
		Static118.aClass4_1.method56();
		Static106.method1722();
		System.gc();
		for (@Pc(186) int local186 = 0; local186 < 4; local186++) {
			Static102.aClass62Array1[local186].method1458();
		}
		@Pc(209) int local209;
		for (local122 = 0; local122 < 4; local122++) {
			for (local133 = 0; local133 < 104; local133++) {
				for (local209 = 0; local209 < 104; local209++) {
					aByteArrayArrayArray7[local122][local133][local209] = 0;
				}
			}
		}
		Static106.method1722();
		Static24.method572();
		local133 = Static123.aByteArrayArray9.length;
		Static89.method423();
		Static121.method1992(true);
		@Pc(264) int local264;
		@Pc(279) int local279;
		@Pc(374) int local374;
		@Pc(329) int local329;
		@Pc(385) int local385;
		if (!Static6.aBoolean3) {
			@Pc(268) byte[] local268;
			for (local209 = 0; local209 < local133; local209++) {
				local264 = (Static8.anIntArray43[local209] >> 8) * 64 - Static46.anInt1190;
				local268 = Static123.aByteArrayArray9[local209];
				local279 = (Static8.anIntArray43[local209] & 0xFF) * 64 - Static47.anInt1211;
				if (local268 != null) {
					Static106.method1722();
					Static45.method961(local279, Static102.aClass62Array1, Static59.anInt1354 * 8 - 48, local268, local264, Static25.anInt725 * 8 - 48);
				}
			}
			for (local264 = 0; local264 < local133; local264++) {
				local279 = (Static8.anIntArray43[local264] >> 8) * 64 - Static46.anInt1190;
				local329 = (Static8.anIntArray43[local264] & 0xFF) * 64 - Static47.anInt1211;
				@Pc(333) byte[] local333 = Static123.aByteArrayArray9[local264];
				if (local333 == null && Static25.anInt725 < 800) {
					Static106.method1722();
					Static108.method1740(64, 64, local329, local279);
				}
			}
			Static121.method1992(true);
			for (local279 = 0; local279 < local133; local279++) {
				local268 = Static105.aByteArrayArray8[local279];
				if (local268 != null) {
					local374 = (Static8.anIntArray43[local279] & 0xFF) * 64 - Static47.anInt1211;
					local385 = (Static8.anIntArray43[local279] >> 8) * 64 - Static46.anInt1190;
					Static106.method1722();
					Static18.method425(local385, local374, Static118.aClass4_1, Static102.aClass62Array1, local268);
				}
			}
		}
		@Pc(456) int local456;
		@Pc(438) int local438;
		if (Static6.aBoolean3) {
			@Pc(450) int local450;
			@Pc(466) int local466;
			@Pc(468) int local468;
			for (local209 = 0; local209 < 4; local209++) {
				Static106.method1722();
				for (local264 = 0; local264 < 13; local264++) {
					for (local279 = 0; local279 < 13; local279++) {
						local385 = Static7.anIntArrayArrayArray4[local209][local264][local279];
						@Pc(428) boolean local428 = false;
						if (local385 != -1) {
							local438 = local385 >> 14 & 0x3FF;
							local374 = local385 >> 24 & 0x3;
							local450 = local385 >> 3 & 0x7FF;
							local456 = local385 >> 1 & 0x3;
							local466 = local450 / 8 + (local438 / 8 << 8);
							for (local468 = 0; local468 < Static8.anIntArray43.length; local468++) {
								if (Static8.anIntArray43[local468] == local466 && Static123.aByteArrayArray9[local468] != null) {
									Static80.method1366((local450 & 0x7) * 8, local279 * 8, Static102.aClass62Array1, local264 * 8, Static123.aByteArrayArray9[local468], local374, local456, (local438 & 0x7) * 8, local209);
									local428 = true;
									break;
								}
							}
						}
						if (!local428) {
							Static18.method433(local264 * 8, local279 * 8, local209);
						}
					}
				}
			}
			for (local264 = 0; local264 < 13; local264++) {
				for (local279 = 0; local279 < 13; local279++) {
					local329 = Static7.anIntArrayArrayArray4[0][local264][local279];
					if (local329 == -1) {
						Static108.method1740(8, 8, local279 * 8, local264 * 8);
					}
				}
			}
			Static121.method1992(true);
			for (local279 = 0; local279 < 4; local279++) {
				Static106.method1722();
				for (local329 = 0; local329 < 13; local329++) {
					for (local385 = 0; local385 < 13; local385++) {
						local374 = Static7.anIntArrayArrayArray4[local279][local329][local385];
						if (local374 != -1) {
							local438 = local374 >> 1 & 0x3;
							local456 = local374 >> 24 & 0x3;
							local450 = local374 >> 14 & 0x3FF;
							local466 = local374 >> 3 & 0x7FF;
							local468 = local466 / 8 + (local450 / 8 << 8);
							for (@Pc(641) int local641 = 0; local641 < Static8.anIntArray43.length; local641++) {
								if (Static8.anIntArray43[local641] == local468 && Static105.aByteArrayArray8[local641] != null) {
									Static76.method1235(local279, local456, (local450 & 0x7) * 8, Static118.aClass4_1, (local466 & 0x7) * 8, Static105.aByteArrayArray8[local641], local385 * 8, Static102.aClass62Array1, local438, local329 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static121.method1992(true);
		Static50.method987();
		Static106.method1722();
		Static9.method240(Static102.aClass62Array1, Static118.aClass4_1);
		Static121.method1992(true);
		local209 = Static121.anInt2875;
		if (local209 > Static21.anInt596) {
			local209 = Static21.anInt596;
		}
		if (local209 < Static21.anInt596 - 1) {
		}
		if (Static63.aBoolean55) {
			Static118.aClass4_1.method79(Static121.anInt2875);
		} else {
			Static118.aClass4_1.method79(0);
		}
		for (local264 = 0; local264 < 104; local264++) {
			for (local279 = 0; local279 < 104; local279++) {
				Static8.method232(local279, local264);
			}
		}
		Static106.method1722();
		Static7.method133();
		Static68.aClass63_10.method1513();
		if (Static75.aFrame1 != null) {
			Static68.aClass1_Sub5_Sub1_2.method688(19);
			Static68.aClass1_Sub5_Sub1_2.method633(1057001181);
		}
		if (!Static6.aBoolean3) {
			local279 = (Static59.anInt1354 - 6) / 8;
			local329 = (Static59.anInt1354 + 6) / 8;
			local385 = (Static25.anInt725 - 6) / 8;
			local374 = (Static25.anInt725 + 6) / 8;
			for (local456 = local279 - 1; local456 <= local329 + 1; local456++) {
				for (local438 = local385 - 1; local438 <= local374 + 1; local438++) {
					if (local279 > local456 || local456 > local329 || local385 > local438 || local438 > local374) {
						Static18.aClass56_Sub1_2.method1282(method1859(new Class25[] { Static61.aClass25_616, Static74.method1214(local456), aClass25_1302, Static74.method1214(local438) }));
						Static18.aClass56_Sub1_2.method1282(method1859(new Class25[] { Static47.aClass25_504, Static74.method1214(local456), aClass25_1302, Static74.method1214(local438) }));
					}
				}
			}
		}
		if (Static67.anInt1470 == -1) {
			Static99.method1645(30);
		} else {
			Static99.method1645(35);
		}
		Static106.method1722();
		Static122.method2019();
		Static68.aClass1_Sub5_Sub1_2.method688(146);
		Static111.method1793();
	}
}
