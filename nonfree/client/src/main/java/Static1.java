import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!td;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!pc;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!fc;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array1;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public static volatile int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!hb;")
	private static Class27 aClass27_2 = Static87.method1648("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1 = aClass27_2;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public static int anInt3 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Lclient!hb;")
	private static Class27 aClass27_6 = Static87.method1648("Take");

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_3 = aClass27_6;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt8 = -1;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "I")
	public static int anInt13 = 0;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!hb;")
	private static Class27 aClass27_4 = Static87.method1648("Error connecting to server)3");

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_5 = aClass27_4;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static synchronized void method1() {
		if (!Static105.method1885()) {
			return;
		}
		if (Static98.aBoolean124) {
			@Pc(22) byte[] local22 = Static55.method1061(Static8.aClass54_3, Static66.anInt1705, Static109.anInt2067, Static15.anInt301);
			if (local22 != null) {
				if (Static101.anInt2626 >= 0) {
					Static43.method903(local22, Static78.anInt2171, Static73.aBoolean98, Static101.anInt2626);
				} else if (Static12.anInt282 < 0) {
					Static94.method1754(Static73.aBoolean98, Static78.anInt2171, local22);
				} else {
					Static2.method19(Static78.anInt2171, local22, Static12.anInt282, Static73.aBoolean98);
				}
				Static98.aBoolean124 = false;
				Static8.aClass54_3 = null;
			}
		}
		Static84.method1562();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIIZLclient!hb;Lclient!td;Lclient!hb;)V")
	public static synchronized void method2(@OriginalArg(0) int arg0, @OriginalArg(5) Class27 arg1, @OriginalArg(6) Class54 arg2, @OriginalArg(7) Class27 arg3) {
		if (Static105.method1885()) {
			@Pc(16) int local16 = arg2.method1620(arg1);
			@Pc(22) int local22 = arg2.method1613(arg3, local16);
			method13(local16, arg2, arg0, local22);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V")
	public static void method3(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static104.anInt2724; local3++) {
			@Pc(11) Class3_Sub3_Sub1_Sub4_Sub1 local11 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[Static85.anIntArray349[local3]];
			@Pc(19) int local19 = (Static85.anIntArray349[local3] << 14) + 536870912;
			if (local11 != null && local11.method1679() && arg0 == local11.aClass3_Sub3_Sub3_1.aBoolean50 && local11.aClass3_Sub3_Sub3_1.method722()) {
				@Pc(48) int local48 = local11.anInt2408 >> 7;
				@Pc(53) int local53 = local11.anInt2399 >> 7;
				if (local48 >= 0 && local48 < 104 && local53 >= 0 && local53 < 104) {
					if (local11.anInt2435 == 1 && (local11.anInt2408 & 0x7F) == 64 && (local11.anInt2399 & 0x7F) == 64) {
						if (Static62.anIntArrayArray45[local48][local53] == Static31.anInt803) {
							continue;
						}
						Static62.anIntArrayArray45[local48][local53] = Static31.anInt803;
					}
					if (!local11.aClass3_Sub3_Sub3_1.aBoolean49) {
						local19 += Integer.MIN_VALUE;
					}
					Static76.aClass18_1.method516(Static68.anInt1747, local11.anInt2408, local11.anInt2399, Static48.method1675(local11.anInt2435 * 64 + local11.anInt2399 - 64, Static68.anInt1747, local11.anInt2408 + local11.anInt2435 * 64 - 64), (local11.anInt2435 - 1) * 64 + 60, local11, local11.anInt2432, local19, local11.aBoolean118);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILclient!td;BIZ)V")
	public static synchronized void method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class54 arg2, @OriginalArg(5) int arg3) {
		if (!Static105.method1885()) {
			return;
		}
		Static101.anInt2626 = -1;
		Static73.aBoolean98 = false;
		Static12.anInt282 = -1;
		Static66.anInt1705 = 0;
		Static109.anInt2067 = arg3;
		Static78.anInt2171 = arg1;
		Static8.aClass54_3 = arg2;
		Static15.anInt301 = arg0;
		Static98.aBoolean124 = true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method5() {
		anIntArray1 = null;
		aClass3_Sub3_Sub2_Sub2Array1 = null;
		aClass27_3 = null;
		aClass54_1 = null;
		aClass21_1 = null;
		aClass27_2 = null;
		aClass27_4 = null;
		aClass27_6 = null;
		aClass27_5 = null;
		aClass12_1 = null;
		aClass27_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public static synchronized void method6() {
		if (Static105.method1885()) {
			Static70.method1274();
			Static98.aBoolean124 = false;
			Static8.aClass54_3 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)I")
	public static int method7() {
		@Pc(7) int local7 = 3;
		if (Static81.anInt2195 < 310) {
			@Pc(14) int local14 = Static108.anInt2777 >> 7;
			@Pc(18) int local18 = Static45.anInt371 >> 7;
			@Pc(23) int local23 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 >> 7;
			@Pc(28) int local28 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 >> 7;
			if ((Static89.aByteArrayArrayArray11[Static68.anInt1747][local14][local18] & 0x4) != 0) {
				local7 = Static68.anInt1747;
			}
			@Pc(52) int local52;
			if (local23 <= local18) {
				local52 = local18 - local23;
			} else {
				local52 = local23 - local18;
			}
			@Pc(70) int local70;
			if (local28 <= local14) {
				local70 = local14 - local28;
			} else {
				local70 = local28 - local14;
			}
			@Pc(90) int local90;
			@Pc(92) int local92;
			if (local70 > local52) {
				local90 = local52 * 65536 / local70;
				local92 = 32768;
				while (local14 != local28) {
					local92 += local90;
					if (local14 < local28) {
						local14++;
					} else if (local14 > local28) {
						local14--;
					}
					if ((Static89.aByteArrayArrayArray11[Static68.anInt1747][local14][local18] & 0x4) != 0) {
						local7 = Static68.anInt1747;
					}
					if (local92 >= 65536) {
						if (local18 < local23) {
							local18++;
						} else if (local23 < local18) {
							local18--;
						}
						local92 -= 65536;
						if ((Static89.aByteArrayArrayArray11[Static68.anInt1747][local14][local18] & 0x4) != 0) {
							local7 = Static68.anInt1747;
						}
					}
				}
			} else {
				local90 = local70 * 65536 / local52;
				local92 = 32768;
				while (local18 != local23) {
					local92 += local90;
					if (local23 > local18) {
						local18++;
					} else if (local18 > local23) {
						local18--;
					}
					if ((Static89.aByteArrayArrayArray11[Static68.anInt1747][local14][local18] & 0x4) != 0) {
						local7 = Static68.anInt1747;
					}
					if (local92 >= 65536) {
						if (local28 > local14) {
							local14++;
						} else if (local14 > local28) {
							local14--;
						}
						if ((Static89.aByteArrayArrayArray11[Static68.anInt1747][local14][local18] & 0x4) != 0) {
							local7 = Static68.anInt1747;
						}
						local92 -= 65536;
					}
				}
			}
		}
		if ((Static89.aByteArrayArrayArray11[Static68.anInt1747][Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 >> 7][Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 >> 7] & 0x4) != 0) {
			local7 = Static68.anInt1747;
		}
		return local7;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method8() {
		@Pc(16) int local16;
		if (Static10.anInt268 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static10.anInt268 > 768) {
					Static99.anIntArray386[local16] = Static105.method1886(Static55.anIntArray241[local16], 1024 - Static10.anInt268, Static38.anIntArray164[local16]);
				} else if (Static10.anInt268 <= 256) {
					Static99.anIntArray386[local16] = Static105.method1886(Static38.anIntArray164[local16], 256 - Static10.anInt268, Static55.anIntArray241[local16]);
				} else {
					Static99.anIntArray386[local16] = Static55.anIntArray241[local16];
				}
			}
		} else if (Static19.anInt445 <= 0) {
			for (local16 = 0; local16 < 256; local16++) {
				Static99.anIntArray386[local16] = Static38.anIntArray164[local16];
			}
		} else {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static19.anInt445 > 768) {
					Static99.anIntArray386[local16] = Static105.method1886(Static70.anIntArray307[local16], 1024 - Static19.anInt445, Static38.anIntArray164[local16]);
				} else if (Static19.anInt445 <= 256) {
					Static99.anIntArray386[local16] = Static105.method1886(Static38.anIntArray164[local16], 256 - Static19.anInt445, Static70.anIntArray307[local16]);
				} else {
					Static99.anIntArray386[local16] = Static70.anIntArray307[local16];
				}
			}
		}
		for (local16 = 0; local16 < 33920; local16++) {
			Static8.aClass12_8.anIntArray152[local16] = Static66.aClass3_Sub3_Sub2_Sub2_5.anIntArray172[local16];
		}
		@Pc(166) int local166 = 1152;
		@Pc(168) int local168 = 0;
		@Pc(183) int local183;
		@Pc(187) int local187;
		@Pc(200) int local200;
		@Pc(207) int local207;
		@Pc(214) int local214;
		@Pc(219) int local219;
		@Pc(228) int local228;
		for (@Pc(170) int local170 = 1; local170 < 255; local170++) {
			local183 = Static84.anIntArray337[local170] * (256 - local170) / 256;
			local187 = local183 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			local168 += local187;
			for (local200 = local187; local200 < 128; local200++) {
				local207 = Static7.anIntArray39[local168++];
				if (local207 == 0) {
					local166++;
				} else {
					local214 = local207;
					local219 = 256 - local207;
					local207 = Static99.anIntArray386[local207];
					local228 = Static8.aClass12_8.anIntArray152[local166];
					Static8.aClass12_8.anIntArray152[local166++] = ((local207 & 0xFF00) * local214 + (local228 & 0xFF00) * local219 & 0xFF0000) + ((local207 & 0xFF00FF) * local214 + (local219 * (local228 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local166 += local187;
		}
		local168 = 0;
		for (local183 = 0; local183 < 33920; local183++) {
			Static41.aClass12_32.anIntArray152[local183] = Static31.aClass3_Sub3_Sub2_Sub2_2.anIntArray172[local183];
		}
		local166 = 1176;
		for (local187 = 1; local187 < 255; local187++) {
			local200 = Static84.anIntArray337[local187] * (256 - local187) / 256;
			local207 = 103 - local200;
			local166 += local200;
			for (local214 = 0; local214 < local207; local214++) {
				local219 = Static7.anIntArray39[local168++];
				if (local219 == 0) {
					local166++;
				} else {
					local228 = local219;
					@Pc(350) int local350 = Static41.aClass12_32.anIntArray152[local166];
					@Pc(355) int local355 = 256 - local219;
					local219 = Static99.anIntArray386[local219];
					Static41.aClass12_32.anIntArray152[local166++] = ((local350 & 0xFF00) * local355 + local228 * (local219 & 0xFF00) & 0xFF0000) + ((local219 & 0xFF00FF) * local228 + local355 * (local350 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local166 += 128 - local207 - local200;
			local168 += 128 - local207;
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public static void method9() {
		if (Static104.anInt2721 > 0) {
			Static104.anInt2721--;
		}
		if (Static32.anInt809 > 1) {
			Static32.anInt809--;
		}
		if (Static41.aBoolean58) {
			Static41.aBoolean58 = false;
			Static98.method1777();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static37.method698(); local27++) {
		}
		if (Static59.anInt1508 != 30 && Static59.anInt1508 != 35) {
			return;
		}
		@Pc(64) int local64;
		if (Static80.aBoolean104 && Static59.anInt1508 == 30) {
			Static102.anInt2662 = 0;
			Static106.anInt834 = 0;
			while (Static107.method1898()) {
			}
			for (local64 = 0; local64 < Static10.aBooleanArray3.length; local64++) {
				Static10.aBooleanArray3[local64] = false;
			}
		}
		Static22.method445(Static78.aClass3_Sub11_Sub1_3);
		@Pc(82) Object local82 = Static86.aClass33_1.anObject4;
		@Pc(114) int local114;
		@Pc(103) int local103;
		@Pc(116) int local116;
		@Pc(151) int local151;
		synchronized (Static86.aClass33_1.anObject4) {
			if (!Static75.aBoolean100) {
				Static86.aClass33_1.anInt1426 = 0;
			} else if (Static106.anInt834 != 0 || Static86.aClass33_1.anInt1426 >= 40) {
				local103 = 0;
				Static78.aClass3_Sub11_Sub1_3.method1478(108);
				Static78.aClass3_Sub11_Sub1_3.method1443(0);
				local114 = Static78.aClass3_Sub11_Sub1_3.anInt2060;
				@Pc(133) int local133;
				for (local116 = 0; local116 < Static86.aClass33_1.anInt1426 && Static78.aClass3_Sub11_Sub1_3.anInt2060 - local114 < 240; local116++) {
					local103++;
					local133 = Static86.aClass33_1.anIntArray236[local116];
					if (local133 < 0) {
						local133 = 0;
					} else if (local133 > 502) {
						local133 = 502;
					}
					local151 = Static86.aClass33_1.anIntArray235[local116];
					if (local151 < 0) {
						local151 = 0;
					} else if (local151 > 764) {
						local151 = 764;
					}
					@Pc(171) int local171 = local133 * 765 + local151;
					if (Static86.aClass33_1.anIntArray236[local116] == -1 && Static86.aClass33_1.anIntArray235[local116] == -1) {
						local151 = -1;
						local171 = 524287;
						local133 = -1;
					}
					if (local151 != Static69.anInt1808 || local133 != Static20.anInt472) {
						@Pc(214) int local214 = local133 - Static20.anInt472;
						Static20.anInt472 = local133;
						@Pc(221) int local221 = local151 - Static69.anInt1808;
						Static69.anInt1808 = local151;
						if (Static32.anInt811 < 8 && local221 >= -32 && local221 <= 31 && local214 >= -32 && local214 <= 31) {
							local214 += 32;
							local221 += 32;
							Static78.aClass3_Sub11_Sub1_3.method1467(local214 + (local221 << 6) + (Static32.anInt811 << 12));
							Static32.anInt811 = 0;
						} else if (Static32.anInt811 < 8) {
							Static78.aClass3_Sub11_Sub1_3.method1427((Static32.anInt811 << 19) + (local171 + 8388608));
							Static32.anInt811 = 0;
						} else {
							Static78.aClass3_Sub11_Sub1_3.method1425((Static32.anInt811 << 19) + local171 - 1073741824);
							Static32.anInt811 = 0;
						}
					} else if (Static32.anInt811 < 2047) {
						Static32.anInt811++;
					}
				}
				Static78.aClass3_Sub11_Sub1_3.method1436(Static78.aClass3_Sub11_Sub1_3.anInt2060 - local114);
				if (local103 >= Static86.aClass33_1.anInt1426) {
					Static86.aClass33_1.anInt1426 = 0;
				} else {
					Static86.aClass33_1.anInt1426 -= local103;
					for (local133 = 0; local133 < Static86.aClass33_1.anInt1426; local133++) {
						Static86.aClass33_1.anIntArray235[local133] = Static86.aClass33_1.anIntArray235[local133 + local103];
						Static86.aClass33_1.anIntArray236[local133] = Static86.aClass33_1.anIntArray236[local133 + local103];
					}
				}
			}
		}
		if (Static106.anInt834 != 0) {
			@Pc(393) long local393 = (Static28.aLong30 - Static36.aLong33) / 50L;
			local114 = Static35.anInt850;
			Static36.aLong33 = Static28.aLong30;
			@Pc(403) byte local403 = 0;
			local103 = Static50.anInt1341;
			if (Static106.anInt834 == 2) {
				local403 = 1;
			}
			if (local114 < 0) {
				local114 = 0;
			} else if (local114 > 502) {
				local114 = 502;
			}
			if (local103 < 0) {
				local103 = 0;
			} else if (local103 > 764) {
				local103 = 764;
			}
			local116 = local114 * 765 + local103;
			Static78.aClass3_Sub11_Sub1_3.method1478(114);
			if (local393 > 4095L) {
				local393 = 4095L;
			}
			local151 = (int) local393;
			Static78.aClass3_Sub11_Sub1_3.method1433((local151 << 20) + (local403 << 19) + local116);
		}
		if (Static10.anInt262 > 0) {
			Static10.anInt262--;
		}
		if (Static10.aBooleanArray3[96] || Static10.aBooleanArray3[97] || Static10.aBooleanArray3[98] || Static10.aBooleanArray3[99]) {
			Static72.aBoolean97 = true;
		}
		if (Static72.aBoolean97 && Static10.anInt262 <= 0) {
			Static72.aBoolean97 = false;
			Static10.anInt262 = 20;
			Static78.aClass3_Sub11_Sub1_3.method1478(121);
			Static78.aClass3_Sub11_Sub1_3.method1461(Static97.anInt2292);
			Static78.aClass3_Sub11_Sub1_3.method1461(Static73.anInt1924);
		}
		if (Static64.aBoolean88 && !Static81.aBoolean105) {
			Static81.aBoolean105 = true;
			Static78.aClass3_Sub11_Sub1_3.method1478(174);
			Static78.aClass3_Sub11_Sub1_3.method1443(1);
		}
		if (!Static64.aBoolean88 && Static81.aBoolean105) {
			Static81.aBoolean105 = false;
			Static78.aClass3_Sub11_Sub1_3.method1478(174);
			Static78.aClass3_Sub11_Sub1_3.method1443(0);
		}
		Static70.method1276();
		if (Static59.anInt1508 != 30 && Static59.anInt1508 != 35) {
			return;
		}
		Static61.method1139();
		Static10.method233();
		Static97.anInt2261++;
		if (Static97.anInt2261 > 750) {
			Static98.method1777();
			return;
		}
		Static16.method292();
		Static15.method250();
		Static69.method1269();
		if (Static61.anInt1552 != 0) {
			Static94.anInt2554 += 20;
			if (Static94.anInt2554 >= 400) {
				Static61.anInt1552 = 0;
			}
		}
		Static39.anInt989++;
		if (Static87.anInt2334 != 0) {
			Static103.anInt2670++;
			if (Static103.anInt2670 >= 15) {
				if (Static87.anInt2334 == 3) {
					Static13.aBoolean40 = true;
				}
				if (Static87.anInt2334 == 2) {
					Static75.aBoolean101 = true;
				}
				Static87.anInt2334 = 0;
			}
		}
		if (Static31.anInt805 != 0) {
			Static16.anInt380++;
			if (Static90.anInt2497 + 5 < Static85.anInt2297 || Static90.anInt2497 - 5 > Static85.anInt2297 || Static76.anInt2143 + 5 < Static93.anInt2546 || Static76.anInt2143 - 5 > Static93.anInt2546) {
				Static66.aBoolean90 = true;
			}
			if (Static102.anInt2662 == 0) {
				if (Static31.anInt805 == 2) {
					Static75.aBoolean101 = true;
				}
				if (Static31.anInt805 == 3) {
					Static13.aBoolean40 = true;
				}
				Static31.anInt805 = 0;
				if (Static66.aBoolean90 && Static16.anInt380 >= 5) {
					Static54.anInt1429 = -1;
					Static39.method755();
					if (Static54.anInt1429 == Static52.anInt1407 && Static91.anInt2518 != Static4.anInt2757) {
						@Pc(726) Class3_Sub3_Sub6 local726 = Static77.method1516(Static52.anInt1407);
						@Pc(728) byte local728 = 0;
						if (Static24.anInt626 == 1 && local726.anInt1601 == 206) {
							local728 = 1;
						}
						if (local726.anIntArray274[Static91.anInt2518] <= 0) {
							local728 = 0;
						}
						if (local726.aBoolean80) {
							local114 = Static4.anInt2757;
							local103 = Static91.anInt2518;
							local726.anIntArray274[local103] = local726.anIntArray274[local114];
							local726.anIntArray275[local103] = local726.anIntArray275[local114];
							local726.anIntArray274[local114] = -1;
							local726.anIntArray275[local114] = 0;
						} else if (local728 == 1) {
							local103 = Static91.anInt2518;
							local114 = Static4.anInt2757;
							while (local103 != local114) {
								if (local103 < local114) {
									local726.method1161(local114 - 1, local114);
									local114--;
								} else if (local114 < local103) {
									local726.method1161(local114 + 1, local114);
									local114++;
								}
							}
						} else {
							local726.method1161(Static91.anInt2518, Static4.anInt2757);
						}
						Static78.aClass3_Sub11_Sub1_3.method1478(182);
						Static78.aClass3_Sub11_Sub1_3.method1437(Static52.anInt1407);
						Static78.aClass3_Sub11_Sub1_3.method1471(Static4.anInt2757);
						Static78.aClass3_Sub11_Sub1_3.method1467(Static91.anInt2518);
						Static78.aClass3_Sub11_Sub1_3.method1443(local728);
					}
				} else if ((Static85.anInt2313 == 1 || Static85.method1630(Static61.anInt1553 - 1)) && Static61.anInt1553 > 2) {
					Static4.method1891();
				} else if (Static61.anInt1553 > 0) {
					Static67.method1239(Static61.anInt1553 - 1);
				}
				Static106.anInt834 = 0;
				Static103.anInt2670 = 10;
			}
		}
		@Pc(892) int local892;
		if (Static26.anInt662 != -1) {
			local64 = Static26.anInt662;
			local892 = Static26.anInt678;
			@Pc(912) boolean local912 = Static15.method251(true, 0, 0, local892, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local64, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, 0);
			Static26.anInt662 = -1;
			if (local912) {
				Static30.anInt779 = Static50.anInt1341;
				Static61.anInt1552 = 1;
				Static94.anInt2554 = 0;
				Static52.anInt1416 = Static35.anInt850;
			}
		}
		if (Static106.anInt834 == 1 && Static109.aClass27_960 != null) {
			Static13.aBoolean40 = true;
			Static106.anInt834 = 0;
			Static109.aClass27_960 = null;
		}
		Static67.method1240();
		if (Static55.anInt1446 == -1) {
			Static59.method1106();
			Static101.method1817();
			Static97.method1614();
		}
		if (Static102.anInt2662 == 1 || Static106.anInt834 == 1) {
			Static18.anInt424++;
		}
		if (Static4.anInt2753 == -1 && Static109.anInt2068 == -1 && Static77.anInt2151 == -1) {
			if (Static10.anInt270 > 0) {
				Static10.anInt270--;
			}
		} else if (Static40.anInt1207 > Static10.anInt270) {
			Static10.anInt270++;
			if (Static40.anInt1207 == Static10.anInt270) {
				if (Static109.anInt2068 != -1) {
					Static75.aBoolean101 = true;
				}
				if (Static4.anInt2753 != -1) {
					Static13.aBoolean40 = true;
				}
			}
		}
		Static88.method1685();
		if (Static30.aBoolean45) {
			Static35.method686();
		}
		for (local64 = 0; local64 < 5; local64++) {
			@Pc(1018) int local1018 = Static77.anIntArray330[local64]++;
		}
		Static39.method760();
		local892 = Static85.method1635();
		local114 = Static30.method647();
		if (local892 > 4500 && local114 > 4500) {
			Static104.anInt2721 = 250;
			Static80.method1537(4000);
			Static78.aClass3_Sub11_Sub1_3.method1478(195);
		}
		Static61.anInt1555++;
		Static57.anInt1497++;
		if (Static57.anInt1497 > 500) {
			Static57.anInt1497 = 0;
			local103 = (int) (Math.random() * 8.0D);
			if ((local103 & 0x1) == 1) {
				Static12.anInt281 += Static17.anInt414;
			}
			if ((local103 & 0x4) == 4) {
				Static70.anInt1818 += Static56.anInt1464;
			}
			if ((local103 & 0x2) == 2) {
				Static107.anInt2771 += Static64.anInt1659;
			}
		}
		Static92.anInt2540++;
		if (Static92.anInt2540 > 500) {
			Static92.anInt2540 = 0;
			local103 = (int) (Math.random() * 8.0D);
			if ((local103 & 0x1) == 1) {
				Static46.anInt1251 += Static83.anInt2367;
			}
			if ((local103 & 0x2) == 2) {
				Static3.anInt91 += Static68.anInt1740;
			}
		}
		if (Static46.anInt1251 < -60) {
			Static83.anInt2367 = 2;
		}
		if (Static46.anInt1251 > 60) {
			Static83.anInt2367 = -2;
		}
		if (Static3.anInt91 < -20) {
			Static68.anInt1740 = 1;
		}
		if (Static107.anInt2771 < -55) {
			Static64.anInt1659 = 2;
		}
		if (Static70.anInt1818 < -40) {
			Static56.anInt1464 = 1;
		}
		if (Static3.anInt91 > 10) {
			Static68.anInt1740 = -1;
		}
		if (Static12.anInt281 < -50) {
			Static17.anInt414 = 2;
		}
		if (Static12.anInt281 > 50) {
			Static17.anInt414 = -2;
		}
		if (Static70.anInt1818 > 40) {
			Static56.anInt1464 = -1;
		}
		if (Static107.anInt2771 > 55) {
			Static64.anInt1659 = -2;
		}
		if (Static61.anInt1555 > 50) {
			Static78.aClass3_Sub11_Sub1_3.method1478(202);
		}
		try {
			if (Static91.aClass20_42 != null && Static78.aClass3_Sub11_Sub1_3.anInt2060 > 0) {
				Static91.aClass20_42.method651(Static78.aClass3_Sub11_Sub1_3.anInt2060, Static78.aClass3_Sub11_Sub1_3.aByteArray17);
				Static78.aClass3_Sub11_Sub1_3.anInt2060 = 0;
				Static61.anInt1555 = 0;
			}
		} catch (@Pc(1230) IOException local1230) {
			Static98.method1777();
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
	public static synchronized void method10() {
		if (Static105.method1885()) {
			Static57.method1103();
			Static8.aClass54_3 = null;
			Static98.aBoolean124 = false;
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	public static synchronized void method11() {
		Static83.method1664();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!td;I)V")
	public static void method12(@OriginalArg(0) Class54 arg0) {
		Static17.aClass54_9 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!td;BIZIII)V")
	public static synchronized void method13(@OriginalArg(0) int arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3) {
		if (!Static105.method1885()) {
			return;
		}
		Static15.anInt301 = 0;
		Static109.anInt2067 = arg0;
		Static8.aClass54_3 = arg1;
		Static101.anInt2626 = 10;
		Static12.anInt282 = -1;
		Static73.aBoolean98 = false;
		Static78.anInt2171 = arg2;
		Static98.aBoolean124 = true;
		Static66.anInt1705 = arg3;
	}
}
