import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!id", name = "M", descriptor = "[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_6;

	@OriginalMember(owner = "client!id", name = "pb", descriptor = "Lclient!uc;")
	public static Class77 aClass77_4;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!id", name = "P", descriptor = "I")
	public static int anInt1257 = 0;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_536 = Static78.method1313("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_544 = Static78.method1313("Login");

	@OriginalMember(owner = "client!id", name = "S", descriptor = "Lclient!fc;")
	public static Class25 aClass25_537 = aClass25_544;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "Lclient!fc;")
	public static Class25 aClass25_538 = Static78.method1313("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!id", name = "X", descriptor = "I")
	public static int anInt1260 = -1;

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "Lclient!fc;")
	public static Class25 aClass25_539 = Static78.method1313("null");

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
	public static int anInt1262 = 0;

	@OriginalMember(owner = "client!id", name = "jb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_542 = Static78.method1313("Public chat");

	@OriginalMember(owner = "client!id", name = "db", descriptor = "Lclient!fc;")
	public static Class25 aClass25_540 = aClass25_542;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_541 = Static78.method1313("Freunde");

	@OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
	public static int anInt1267 = 0;

	@OriginalMember(owner = "client!id", name = "lb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_543 = Static78.method1313("swe");

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_545 = Static78.method1313("An");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method1005() {
		if (Static105.anInt2386 > 1) {
			Static105.anInt2386--;
		}
		if (Static88.anInt1970 > 0) {
			Static88.anInt1970--;
		}
		if (Static25.aBoolean22) {
			Static25.aBoolean22 = false;
			method1008();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static53.method1779(); local29++) {
		}
		if (Static48.anInt1227 != 30 && Static48.anInt1227 != 35) {
			return;
		}
		if (Static92.aBoolean101 && Static48.anInt1227 == 30) {
			Static11.anInt277 = 0;
			Static42.anInt1139 = 0;
			while (Static25.method585()) {
			}
			for (@Pc(64) int local64 = 0; local64 < Static99.aBooleanArray11.length; local64++) {
				Static99.aBooleanArray11[local64] = false;
			}
		}
		Static18.method432(Static68.aClass1_Sub5_Sub1_2);
		@Pc(82) Object local82 = Static126.aClass22_1.anObject1;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(133) int local133;
		synchronized (Static126.aClass22_1.anObject1) {
			if (!Static87.aBoolean64) {
				Static126.aClass22_1.anInt747 = 0;
			} else if (Static11.anInt277 != 0 || Static126.aClass22_1.anInt747 >= 40) {
				Static68.aClass1_Sub5_Sub1_2.method688(181);
				Static68.aClass1_Sub5_Sub1_2.method676(0);
				local112 = Static68.aClass1_Sub5_Sub1_2.anInt792;
				local114 = 0;
				@Pc(151) int local151;
				for (local116 = 0; local116 < Static126.aClass22_1.anInt747 && Static68.aClass1_Sub5_Sub1_2.anInt792 - local112 < 240; local116++) {
					local114++;
					local133 = Static126.aClass22_1.anIntArray153[local116];
					if (local133 < 0) {
						local133 = 0;
					} else if (local133 > 764) {
						local133 = 764;
					}
					local151 = Static126.aClass22_1.anIntArray152[local116];
					if (local151 < 0) {
						local151 = 0;
					} else if (local151 > 502) {
						local151 = 502;
					}
					@Pc(174) int local174 = local151 * 765 + local133;
					if (Static126.aClass22_1.anIntArray152[local116] == -1 && Static126.aClass22_1.anIntArray153[local116] == -1) {
						local151 = -1;
						local133 = -1;
						local174 = 524287;
					}
					if (Static1.anInt25 != local133 || Static124.anInt2905 != local151) {
						@Pc(216) int local216 = local151 - Static124.anInt2905;
						Static124.anInt2905 = local151;
						@Pc(223) int local223 = local133 - Static1.anInt25;
						Static1.anInt25 = local133;
						if (Static96.anInt2830 < 8 && local223 >= -32 && local223 <= 31 && local216 >= -32 && local216 <= 31) {
							local216 += 32;
							local223 += 32;
							Static68.aClass1_Sub5_Sub1_2.method675(local216 + (Static96.anInt2830 << 12) + (local223 << 6));
							Static96.anInt2830 = 0;
						} else if (Static96.anInt2830 < 8) {
							Static68.aClass1_Sub5_Sub1_2.method659((Static96.anInt2830 << 19) + local174 + 8388608);
							Static96.anInt2830 = 0;
						} else {
							Static68.aClass1_Sub5_Sub1_2.method633((Static96.anInt2830 << 19) + local174 - 1073741824);
							Static96.anInt2830 = 0;
						}
					} else if (Static96.anInt2830 < 2047) {
						Static96.anInt2830++;
					}
				}
				Static68.aClass1_Sub5_Sub1_2.method638(Static68.aClass1_Sub5_Sub1_2.anInt792 - local112);
				if (Static126.aClass22_1.anInt747 <= local114) {
					Static126.aClass22_1.anInt747 = 0;
				} else {
					Static126.aClass22_1.anInt747 -= local114;
					for (local151 = 0; local151 < Static126.aClass22_1.anInt747; local151++) {
						Static126.aClass22_1.anIntArray153[local151] = Static126.aClass22_1.anIntArray153[local114 + local151];
						Static126.aClass22_1.anIntArray152[local151] = Static126.aClass22_1.anIntArray152[local151 + local114];
					}
				}
			}
		}
		if (Static11.anInt277 != 0) {
			@Pc(375) long local375 = (Static40.aLong79 - Static122.aLong183) / 50L;
			Static122.aLong183 = Static40.aLong79;
			if (local375 > 4095L) {
				local375 = 4095L;
			}
			local114 = Static30.anInt815;
			local112 = Static23.anInt675;
			if (local112 < 0) {
				local112 = 0;
			} else if (local112 > 502) {
				local112 = 502;
			}
			@Pc(402) byte local402 = 0;
			if (local114 < 0) {
				local114 = 0;
			} else if (local114 > 764) {
				local114 = 764;
			}
			local116 = local112 * 765 + local114;
			if (Static11.anInt277 == 2) {
				local402 = 1;
			}
			Static68.aClass1_Sub5_Sub1_2.method688(160);
			local133 = (int) local375;
			Static68.aClass1_Sub5_Sub1_2.method633(local116 + (local402 << 19) + (local133 << 20));
		}
		if (Static99.aBooleanArray11[96] || Static99.aBooleanArray11[97] || Static99.aBooleanArray11[98] || Static99.aBooleanArray11[99]) {
			Static35.aBoolean39 = true;
		}
		if (Static18.anInt523 > 0) {
			Static18.anInt523--;
		}
		if (Static35.aBoolean39 && Static18.anInt523 <= 0) {
			Static35.aBoolean39 = false;
			Static18.anInt523 = 20;
			Static68.aClass1_Sub5_Sub1_2.method688(204);
			Static68.aClass1_Sub5_Sub1_2.method650(Static99.anInt2311);
			Static68.aClass1_Sub5_Sub1_2.method675(Static54.anInt1298);
		}
		if (Static47.aBoolean50 && !Static58.aBoolean53) {
			Static58.aBoolean53 = true;
			Static68.aClass1_Sub5_Sub1_2.method688(76);
			Static68.aClass1_Sub5_Sub1_2.method676(1);
		}
		if (!Static47.aBoolean50 && Static58.aBoolean53) {
			Static58.aBoolean53 = false;
			Static68.aClass1_Sub5_Sub1_2.method688(76);
			Static68.aClass1_Sub5_Sub1_2.method676(0);
		}
		Static6.method103();
		if (Static48.anInt1227 != 30 && Static48.anInt1227 != 35) {
			return;
		}
		Static105.method1687();
		Static109.method1750();
		Static39.anInt1101++;
		if (Static39.anInt1101 > 750) {
			method1008();
			return;
		}
		Static97.method1643();
		Static109.method1746();
		Static96.method1976();
		if (Static108.anInt2494 != 0) {
			Static9.anInt249 += 20;
			if (Static9.anInt249 >= 400) {
				Static108.anInt2494 = 0;
			}
		}
		if (Static25.anInt723 != 0) {
			Static129.anInt2956++;
			if (Static129.anInt2956 >= 15) {
				if (Static25.anInt723 == 3) {
					Static110.aBoolean113 = true;
				}
				if (Static25.anInt723 == 2) {
					Static90.aBoolean98 = true;
				}
				Static25.anInt723 = 0;
			}
		}
		Static18.anInt522++;
		if (anInt1267 != 0) {
			Static3.anInt52++;
			if (Static10.anInt269 + 5 < Static10.anInt264 || Static10.anInt269 - 5 > Static10.anInt264 || Static111.anInt2597 > Static103.anInt2773 + 5 || Static103.anInt2773 - 5 > Static111.anInt2597) {
				Static30.aBoolean28 = true;
			}
			if (Static42.anInt1139 == 0) {
				if (anInt1267 == 2) {
					Static90.aBoolean98 = true;
				}
				if (anInt1267 == 3) {
					Static110.aBoolean113 = true;
				}
				anInt1267 = 0;
				if (Static30.aBoolean28 && Static3.anInt52 >= 5) {
					Static64.anInt1437 = -1;
					Static110.method1776();
					if (Static92.anInt2072 == Static64.anInt1437 && Static115.anInt2667 != Static35.anInt962) {
						@Pc(735) Class1_Sub2_Sub14 local735 = Static46.method968(Static92.anInt2072);
						@Pc(741) byte local741 = 0;
						if (Static71.anInt1492 == 1 && local735.anInt1934 == 206) {
							local741 = 1;
						}
						if (local735.anIntArray341[Static35.anInt962] <= 0) {
							local741 = 0;
						}
						if (Static42.method938(Static77.method1300(local735))) {
							local112 = Static115.anInt2667;
							local114 = Static35.anInt962;
							local735.anIntArray341[local114] = local735.anIntArray341[local112];
							local735.anIntArray344[local114] = local735.anIntArray344[local112];
							local735.anIntArray341[local112] = -1;
							local735.anIntArray344[local112] = 0;
						} else if (local741 == 1) {
							local112 = Static115.anInt2667;
							local114 = Static35.anInt962;
							while (local112 != local114) {
								if (local112 > local114) {
									local735.method1437(local112 - 1, local112);
									local112--;
								} else if (local114 > local112) {
									local735.method1437(local112 + 1, local112);
									local112++;
								}
							}
						} else {
							local735.method1437(Static35.anInt962, Static115.anInt2667);
						}
						Static68.aClass1_Sub5_Sub1_2.method688(172);
						Static68.aClass1_Sub5_Sub1_2.method631(Static115.anInt2667);
						Static68.aClass1_Sub5_Sub1_2.method635(Static92.anInt2072);
						Static68.aClass1_Sub5_Sub1_2.method676(local741);
						Static68.aClass1_Sub5_Sub1_2.method650(Static35.anInt962);
					}
				} else if ((Static78.anInt1705 == 1 || Static88.method1445(Static108.anInt2503 - 1)) && Static108.anInt2503 > 2) {
					Static60.method1071();
				} else if (Static108.anInt2503 > 0) {
					Static78.method1316(Static108.anInt2503 - 1);
				}
				Static11.anInt277 = 0;
				Static129.anInt2956 = 10;
			}
		}
		if (Static67.anInt1470 == -1) {
			if (Static108.anInt2497 != -1) {
				Static124.method2001(338, 34, 0, Static108.anInt2497, 516, 4, 4);
			} else if (Static2.anInt29 != -1) {
				Static124.method2001(338, 34, 0, Static2.anInt29, 516, 4, 4);
			}
			if (Static33.anInt922 != -1) {
				Static124.method2001(466, 34, 1, Static33.anInt922, 743, 205, 553);
			} else if (Static22.anIntArray162[Static90.anInt2027] != -1) {
				Static124.method2001(466, 34, 1, Static22.anIntArray162[Static90.anInt2027], 743, 205, 553);
			}
			if (Static33.anInt916 != -1) {
				Static124.method2001(453, 34, 2, Static33.anInt916, 496, 357, 17);
			} else if (Static108.anInt2502 != -1) {
				Static124.method2001(453, 34, 2, Static108.anInt2502, 496, 357, 17);
			}
		} else {
			Static124.method2001(503, 34, 3, Static67.anInt1470, 765, 0, 0);
			if (Static93.anInt2098 != -1) {
				Static124.method2001(503, 34, 3, Static93.anInt2098, 765, 0, 0);
			}
		}
		if (Static67.anInt1470 == -1) {
			if (Static108.anInt2497 != -1) {
				Static124.method2001(338, -35, 0, Static108.anInt2497, 516, 4, 4);
			} else if (Static2.anInt29 != -1) {
				Static124.method2001(338, -35, 0, Static2.anInt29, 516, 4, 4);
			}
			if (Static33.anInt922 != -1) {
				Static124.method2001(466, -35, 1, Static33.anInt922, 743, 205, 553);
			} else if (Static22.anIntArray162[Static90.anInt2027] != -1) {
				Static124.method2001(466, -35, 1, Static22.anIntArray162[Static90.anInt2027], 743, 205, 553);
			}
			if (Static33.anInt916 != -1) {
				Static124.method2001(453, -35, 2, Static33.anInt916, 496, 357, 17);
			} else if (Static108.anInt2502 != -1) {
				Static124.method2001(453, -35, 2, Static108.anInt2502, 496, 357, 17);
			}
		} else {
			Static124.method2001(503, -35, 3, Static67.anInt1470, 765, 0, 0);
			if (Static93.anInt2098 != -1) {
				Static124.method2001(503, -35, 3, Static93.anInt2098, 765, 0, 0);
			}
		}
		Static54.method1026();
		@Pc(1123) int local1123;
		if (Static4.anInt70 != -1) {
			local1123 = Static4.anInt70;
			local112 = Static4.anInt68;
			@Pc(1145) boolean local1145 = Static81.method1376(true, 0, 0, 0, 0, local112, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local1123);
			Static4.anInt70 = -1;
			if (local1145) {
				Static9.anInt249 = 0;
				Static10.anInt270 = Static30.anInt815;
				Static65.anInt1451 = Static23.anInt675;
				Static108.anInt2494 = 1;
			}
		}
		if (Static11.anInt277 == 1 && Static53.aClass25_1240 != null) {
			Static11.anInt277 = 0;
			Static53.aClass25_1240 = null;
			Static110.aBoolean113 = true;
		}
		Static126.method2034();
		if (Static67.anInt1470 == -1) {
			Static46.method970();
			Static123.method1996();
			Static59.method1059();
		}
		if (Static99.anInt2315 == -1 && Static126.anInt2933 == -1 && Static28.anInt746 == -1) {
			if (Static24.anInt701 > 0) {
				Static24.anInt701--;
			}
		} else if (Static78.anInt1706 > Static24.anInt701) {
			Static24.anInt701++;
			if (Static78.anInt1706 == Static24.anInt701) {
				if (Static126.anInt2933 != -1) {
					Static90.aBoolean98 = true;
				}
				if (Static99.anInt2315 != -1) {
					Static110.aBoolean113 = true;
				}
			}
		}
		if (Static42.anInt1139 == 1 || Static11.anInt277 == 1) {
			Static88.anInt1975++;
		}
		Static99.method1646();
		if (Static84.aBoolean82) {
			Static16.method382();
		}
		for (local1123 = 0; local1123 < 5; local1123++) {
			@Pc(1252) int local1252 = Static11.anIntArray46[local1123]++;
		}
		Static97.method1644();
		local112 = Static2.method24();
		local114 = Static129.method2050();
		if (local112 > 4500 && local114 > 4500) {
			Static88.anInt1970 = 250;
			Static32.method732(4000);
			Static68.aClass1_Sub5_Sub1_2.method688(47);
		}
		Static101.anInt2361++;
		Static3.anInt56++;
		Static21.anInt597++;
		if (Static21.anInt597 > 500) {
			Static21.anInt597 = 0;
			local116 = (int) (Math.random() * 8.0D);
			if ((local116 & 0x2) == 2) {
				Static108.anInt2501 += Static11.anInt278;
			}
			if ((local116 & 0x4) == 4) {
				Static101.anInt2360 += Static8.anInt234;
			}
			if ((local116 & 0x1) == 1) {
				Static64.anInt1439 += Static83.anInt1861;
			}
		}
		if (Static108.anInt2501 < -55) {
			Static11.anInt278 = 2;
		}
		if (Static64.anInt1439 < -50) {
			Static83.anInt1861 = 2;
		}
		if (Static101.anInt2360 < -40) {
			Static8.anInt234 = 1;
		}
		if (Static108.anInt2501 > 55) {
			Static11.anInt278 = -2;
		}
		if (Static101.anInt2360 > 40) {
			Static8.anInt234 = -1;
		}
		if (Static64.anInt1439 > 50) {
			Static83.anInt1861 = -2;
		}
		if (Static101.anInt2361 > 500) {
			Static101.anInt2361 = 0;
			local116 = (int) (Math.random() * 8.0D);
			if ((local116 & 0x1) == 1) {
				Static23.anInt673 += Static111.anInt2588;
			}
			if ((local116 & 0x2) == 2) {
				Static129.anInt2953 += Static8.anInt231;
			}
		}
		if (Static23.anInt673 < -60) {
			Static111.anInt2588 = 2;
		}
		if (Static129.anInt2953 < -20) {
			Static8.anInt231 = 1;
		}
		if (Static23.anInt673 > 60) {
			Static111.anInt2588 = -2;
		}
		if (Static129.anInt2953 > 10) {
			Static8.anInt231 = -1;
		}
		if (Static3.anInt56 > 50) {
			Static68.aClass1_Sub5_Sub1_2.method688(10);
		}
		try {
			if (Static100.aClass77_5 != null && Static68.aClass1_Sub5_Sub1_2.anInt792 > 0) {
				Static100.aClass77_5.method1904(Static68.aClass1_Sub5_Sub1_2.anInt792, Static68.aClass1_Sub5_Sub1_2.aByteArray13);
				Static3.anInt56 = 0;
				Static68.aClass1_Sub5_Sub1_2.anInt792 = 0;
			}
		} catch (@Pc(1477) IOException local1477) {
			method1008();
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
	public static void method1006() {
		aClass25_544 = null;
		aClass25_543 = null;
		aClass25_545 = null;
		aClass25_538 = null;
		aClass25_537 = null;
		aClass77_4 = null;
		aClass25_542 = null;
		aClass25_539 = null;
		aClass25_540 = null;
		aClass1_Sub2_Sub2_Sub4_6 = null;
		aClass25_536 = null;
		aClass1_Sub2_Sub2_Sub4Array3 = null;
		aByteArrayArray4 = null;
		aClass1_Sub2_Sub2_Sub4Array2 = null;
		aClass25_541 = null;
		aString1 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)I")
	public static int method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) ((arg1 << 16) + arg0);
		return Static14.aClass1_Sub2_Sub12_1 != null && Static14.aClass1_Sub2_Sub12_1.aLong184 == local6 ? Static56.aClass1_Sub5_31.anInt792 * 99 / (Static56.aClass1_Sub5_31.aByteArray13.length - Static14.aClass1_Sub2_Sub12_1.aByte4) + 1 : 0;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
	public static void method1008() {
		if (Static88.anInt1970 > 0) {
			Static62.method1092();
		} else {
			Static99.method1645(40);
			Static89.aClass77_2 = Static100.aClass77_5;
			Static100.aClass77_5 = null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lclient!pc;")
	public static Class1_Sub2_Sub15 method1009(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub15 local10 = (Class1_Sub2_Sub15) Static116.aClass63_24.method1517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static122.aClass56_92.method1269(13, arg0);
		local10 = new Class1_Sub2_Sub15();
		local10.anInt2074 = arg0;
		if (local20 != null) {
			local10.method1557(new Class1_Sub5(local20));
		}
		Static116.aClass63_24.method1520(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILclient!oc;)Lclient!ma;")
	public static Class1_Sub2_Sub2_Sub3 method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class56 arg2) {
		return Static109.method1749(arg1, arg0, arg2) ? Static46.method969() : null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!c;Lclient!oc;ILclient!oc;Lclient!oc;)Z")
	public static boolean method1012(@OriginalArg(0) Class1_Sub3_Sub1 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) Class56 arg2, @OriginalArg(4) Class56 arg3) {
		Static53.aClass56_79 = arg3;
		Static27.aClass56_26 = arg2;
		Static89.aClass1_Sub3_Sub1_2 = arg0;
		Static39.aClass56_37 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	public static void method1013() {
		Static106.method1722();
		Static32.method729();
		@Pc(23) int local23;
		@Pc(25) int local25;
		if (Static61.anInt1383 == 2 || Static61.anInt1383 == 5) {
			@Pc(18) byte[] local18 = Static3.aClass1_Sub2_Sub2_Sub4_1.aByteArray39;
			@Pc(20) int[] local20 = Static128.anIntArray476;
			local23 = local18.length;
			for (local25 = 0; local25 < local23; local25++) {
				if (local18[local25] == 0) {
					local20[local25] = 0;
				}
			}
			if (Static61.anInt1383 < 3) {
				Static84.aClass1_Sub2_Sub2_Sub1_8.method215(0, 0, 33, 33, 25, 25, Static54.anInt1298, 256, Static119.anIntArray472, Static45.anIntArray238);
			}
			Static66.method1134();
			return;
		}
		@Pc(70) int local70 = Static23.anInt673 + Static54.anInt1298 & 0x7FF;
		local23 = 464 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
		@Pc(85) int local85 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32 + 48;
		Static60.aClass1_Sub2_Sub2_Sub1_6.method215(25, 5, 146, 151, local85, local23, local70, Static129.anInt2953 + 256, Static80.anIntArray320, Static108.anIntArray424);
		for (local25 = 0; local25 < Static24.anInt692; local25++) {
			local23 = Static105.anIntArray414[local25] * 4 + 2 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
			local85 = Static9.anIntArray45[local25] * 4 + 2 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32;
			Static106.method1721(local23, Static9.aClass1_Sub2_Sub2_Sub1Array1[local25], local85);
		}
		@Pc(156) int local156;
		for (@Pc(152) int local152 = 0; local152 < 104; local152++) {
			for (local156 = 0; local156 < 104; local156++) {
				@Pc(166) Class2 local166 = Static7.aClass2ArrayArrayArray1[Static21.anInt596][local152][local156];
				if (local166 != null) {
					local23 = local156 * 4 + 2 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
					local85 = local152 * 4 + 2 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32;
					Static106.method1721(local23, Static30.aClass1_Sub2_Sub2_Sub1Array3[0], local85);
				}
			}
		}
		for (local156 = 0; local156 < Static13.anInt383; local156++) {
			@Pc(215) Class1_Sub2_Sub3_Sub4_Sub1 local215 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[Static106.anIntArray423[local156]];
			if (local215 != null && local215.method1977()) {
				@Pc(224) Class1_Sub2_Sub13 local224 = local215.aClass1_Sub2_Sub13_1;
				if (local224 != null && local224.anIntArray332 != null) {
					local224 = local224.method1408();
				}
				if (local224 != null && local224.aBoolean79 && local224.aBoolean78) {
					local85 = local215.anInt2832 / 32 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32;
					local23 = local215.anInt2827 / 32 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
					Static106.method1721(local23, Static30.aClass1_Sub2_Sub2_Sub1Array3[1], local85);
				}
			}
		}
		@Pc(325) int local325;
		@Pc(288) Class1_Sub2_Sub3_Sub4_Sub2 local288;
		for (@Pc(280) int local280 = 0; local280 < Static96.anInt2797; local280++) {
			local288 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[Static28.anIntArray150[local280]];
			if (local288 != null && local288.method1977()) {
				local85 = local288.anInt2832 / 32 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32;
				local23 = local288.anInt2827 / 32 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
				@Pc(318) boolean local318 = false;
				@Pc(323) long local323 = local288.aClass25_1384.method770();
				for (local325 = 0; local325 < Static80.anInt1786; local325++) {
					if (Static129.aLongArray6[local325] == local323 && Static47.anIntArray241[local325] != 0) {
						local318 = true;
						break;
					}
				}
				@Pc(355) boolean local355 = false;
				if (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2858 != 0 && local288.anInt2858 != 0 && Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2858 == local288.anInt2858) {
					local355 = true;
				}
				if (local318) {
					Static106.method1721(local23, Static30.aClass1_Sub2_Sub2_Sub1Array3[3], local85);
				} else if (local355) {
					Static106.method1721(local23, Static30.aClass1_Sub2_Sub2_Sub1Array3[4], local85);
				} else {
					Static106.method1721(local23, Static30.aClass1_Sub2_Sub2_Sub1Array3[2], local85);
				}
			}
		}
		if (Static3.anInt59 != 0 && Static60.anInt1366 % 20 < 10) {
			if (Static3.anInt59 == 1 && Static114.anInt2636 >= 0 && Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32.length > Static114.anInt2636) {
				@Pc(441) Class1_Sub2_Sub3_Sub4_Sub1 local441 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[Static114.anInt2636];
				if (local441 != null) {
					local23 = local441.anInt2827 / 32 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
					local85 = local441.anInt2832 / 32 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32;
					Static123.method1999(Static123.aClass1_Sub2_Sub2_Sub1Array10[1], local85, local23);
				}
			}
			if (Static3.anInt59 == 2) {
				local85 = (-Static46.anInt1190 + Static92.anInt2075) * 4 + 2 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32;
				local23 = (Static69.anInt1480 - Static47.anInt1211) * 4 + 2 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
				Static123.method1999(Static123.aClass1_Sub2_Sub2_Sub1Array10[1], local85, local23);
			}
			if (Static3.anInt59 == 10 && Static65.anInt1452 >= 0 && Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1.length > Static65.anInt1452) {
				local288 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[Static65.anInt1452];
				if (local288 != null) {
					local23 = local288.anInt2827 / 32 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
					local85 = local288.anInt2832 / 32 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32;
					Static123.method1999(Static123.aClass1_Sub2_Sub2_Sub1Array10[1], local85, local23);
				}
			}
		}
		if (Static62.anInt1391 != 0) {
			local23 = Static110.anInt2547 * 4 + 2 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 / 32;
			local85 = Static62.anInt1391 * 4 + 2 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 / 32;
			Static106.method1721(local23, Static123.aClass1_Sub2_Sub2_Sub1Array10[0], local85);
		}
		Static128.method1935(97, 78, 3, 3, 16777215);
		if (Static61.anInt1383 < 3) {
			Static84.aClass1_Sub2_Sub2_Sub1_8.method215(0, 0, 33, 33, 25, 25, Static54.anInt1298, 256, Static119.anIntArray472, Static45.anIntArray238);
		} else {
			@Pc(620) byte[] local620 = Static3.aClass1_Sub2_Sub2_Sub4_1.aByteArray39;
			@Pc(622) int[] local622 = Static128.anIntArray476;
			for (@Pc(624) int local624 = 0; local624 <= 33; local624++) {
				@Pc(631) int local631 = Static3.aClass1_Sub2_Sub2_Sub4_1.anInt2756 * local624;
				for (local325 = 0; local325 <= 33; local325++) {
					if (local620[local631 + local325] == 0) {
						local622[local631 + local325] = 0;
					}
				}
			}
		}
		Static66.method1134();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)I")
	public static int method1014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
