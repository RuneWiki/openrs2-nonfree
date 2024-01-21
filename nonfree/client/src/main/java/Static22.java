import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_17;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_9;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!v;")
	private static Class62 aClass62_306 = Static45.method753("Loaded input handler");

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!jb;")
	public static Class34 aClass34_10 = new Class34(30);

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!v;")
	public static Class62 aClass62_307 = aClass62_306;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_308 = Static45.method753("\u001c1berpr\u001c1fen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
	public static int[] anIntArray56 = new int[50];

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public static int anInt745 = 0;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
	public static int anInt746 = 0;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!v;")
	private static Class62 aClass62_309 = Static45.method753("flash1:");

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	private static int anInt747 = 0;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!v;")
	public static Class62 aClass62_310 = aClass62_309;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_311 = Static45.method753("@lre@");

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Lclient!ld;")
	public static Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public static int anInt748 = 0;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
	public static int[] anIntArray57 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "J")
	public static long aLong26 = 0L;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!mb;I)Lclient!rc;")
	public static Class3_Sub1_Sub1_Sub3 method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2) {
		return Static16.method442(arg2, arg1, arg0) ? Static40.method695() : null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method493() {
		if (Static41.anInt1209 < 2 && Static102.anInt2653 == 0 && Static77.anInt2067 == 0) {
			return;
		}
		@Pc(39) Class62 local39;
		if (Static102.anInt2653 == 1 && Static41.anInt1209 < 2) {
			local39 = Static49.method782(new Class62[] { Static83.aClass62_209, Static16.aClass62_269, Static51.aClass62_1035, Static41.aClass62_521 });
		} else if (Static77.anInt2067 == 1 && Static41.anInt1209 < 2) {
			local39 = Static49.method782(new Class62[] { Static16.aClass62_266, Static16.aClass62_269, Static59.aClass62_704, Static41.aClass62_521 });
		} else {
			local39 = Static18.aClass62Array6[Static41.anInt1209 - 1];
		}
		if (Static41.anInt1209 > 2) {
			local39 = Static49.method782(new Class62[] { local39, Static93.aClass62_1128, Static99.method1662(Static41.anInt1209 - 2), Static24.aClass62_321 });
		}
		Static86.aClass3_Sub1_Sub1_Sub3_11.method1482(local39, 4, 16777215, Static12.anInt451 / 1000);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)Lclient!v;")
	public static Class62 method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return Static63.aClass62_1079;
		} else if (local13 < -6) {
			return Static102.aClass62_1215;
		} else if (local13 < -3) {
			return Static38.aClass62_487;
		} else if (local13 < 0) {
			return Static71.aClass62_852;
		} else if (local13 > 9) {
			return Static64.aClass62_769;
		} else if (local13 > 6) {
			return Static19.aClass62_1288;
		} else if (local13 > 3) {
			return Static63.aClass62_1065;
		} else if (local13 > 0) {
			return Static71.aClass62_855;
		} else {
			return Static40.aClass62_502;
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method495() {
		anIntArray57 = null;
		aClass62_311 = null;
		aClass62_309 = null;
		aClass40_1 = null;
		anIntArray56 = null;
		aClass62_306 = null;
		aClass62_308 = null;
		aClass42_Sub1_17 = null;
		aClass34_10 = null;
		aClass62_310 = null;
		aClass62_307 = null;
		aClass3_Sub1_Sub1_Sub1_9 = null;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public static void method496() {
		if (Static63.anInt2365 > 0) {
			Static63.anInt2365--;
		}
		if (Static13.anInt465 > 1) {
			Static13.anInt465--;
		}
		if (Static62.aBoolean96) {
			Static62.aBoolean96 = false;
			Static40.method694();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static17.method1872(); local27++) {
		}
		if (Static35.anInt1104 != 30 && Static35.anInt1104 != 35) {
			return;
		}
		@Pc(62) int local62;
		if (Static51.aBoolean140 && Static35.anInt1104 == 30) {
			Static79.anInt2109 = 0;
			Static3.anInt158 = 0;
			while (Static46.method766()) {
			}
			for (local62 = 0; local62 < Static109.aBooleanArray13.length; local62++) {
				Static109.aBooleanArray13[local62] = false;
			}
		}
		Static86.method1413(Static63.aClass3_Sub8_Sub1_6);
		@Pc(84) Object local84 = Static89.aClass37_1.anObject1;
		@Pc(116) int local116;
		@Pc(113) int local113;
		@Pc(118) int local118;
		@Pc(156) int local156;
		synchronized (Static89.aClass37_1.anObject1) {
			if (!Static70.aBoolean114) {
				Static89.aClass37_1.anInt1386 = 0;
			} else if (Static79.anInt2109 != 0 || Static89.aClass37_1.anInt1386 >= 40) {
				Static63.aClass3_Sub8_Sub1_6.method1824(201);
				Static63.aClass3_Sub8_Sub1_6.method1806(0);
				local113 = 0;
				local116 = Static63.aClass3_Sub8_Sub1_6.anInt2704;
				@Pc(135) int local135;
				for (local118 = 0; local118 < Static89.aClass37_1.anInt1386 && Static63.aClass3_Sub8_Sub1_6.anInt2704 - local116 < 240; local118++) {
					local113++;
					local135 = Static89.aClass37_1.anIntArray112[local118];
					if (local135 < 0) {
						local135 = 0;
					} else if (local135 > 502) {
						local135 = 502;
					}
					local156 = Static89.aClass37_1.anIntArray113[local118];
					if (local156 < 0) {
						local156 = 0;
					} else if (local156 > 764) {
						local156 = 764;
					}
					@Pc(177) int local177 = local135 * 765 + local156;
					if (Static89.aClass37_1.anIntArray112[local118] == -1 && Static89.aClass37_1.anIntArray113[local118] == -1) {
						local156 = -1;
						local177 = 524287;
						local135 = -1;
					}
					if (Static91.anInt2435 != local156 || local135 != Static15.anInt568) {
						@Pc(223) int local223 = local156 - Static91.anInt2435;
						@Pc(228) int local228 = local135 - Static15.anInt568;
						Static91.anInt2435 = local156;
						Static15.anInt568 = local135;
						if (Static4.anInt185 < 8 && local223 >= -32 && local223 <= 31 && local228 >= -32 && local228 <= 31) {
							local228 += 32;
							local223 += 32;
							Static63.aClass3_Sub8_Sub1_6.method1762((local223 << 6) + (Static4.anInt185 << 12) + local228);
							Static4.anInt185 = 0;
						} else if (Static4.anInt185 < 8) {
							Static63.aClass3_Sub8_Sub1_6.method1794((Static4.anInt185 << 19) + local177 + 8388608);
							Static4.anInt185 = 0;
						} else {
							Static63.aClass3_Sub8_Sub1_6.method1792(local177 + (Static4.anInt185 << 19) - 1073741824);
							Static4.anInt185 = 0;
						}
					} else if (Static4.anInt185 < 2047) {
						Static4.anInt185++;
					}
				}
				Static63.aClass3_Sub8_Sub1_6.method1771(Static63.aClass3_Sub8_Sub1_6.anInt2704 - local116);
				if (Static89.aClass37_1.anInt1386 > local113) {
					Static89.aClass37_1.anInt1386 -= local113;
					for (local135 = 0; local135 < Static89.aClass37_1.anInt1386; local135++) {
						Static89.aClass37_1.anIntArray113[local135] = Static89.aClass37_1.anIntArray113[local135 + local113];
						Static89.aClass37_1.anIntArray112[local135] = Static89.aClass37_1.anIntArray112[local113 + local135];
					}
				} else {
					Static89.aClass37_1.anInt1386 = 0;
				}
			}
		}
		if (Static79.anInt2109 != 0) {
			@Pc(380) long local380 = (Static15.aLong19 - Static65.aLong52) / 50L;
			if (local380 > 4095L) {
				local380 = 4095L;
			}
			local116 = Static27.anInt825;
			if (local116 < 0) {
				local116 = 0;
			} else if (local116 > 502) {
				local116 = 502;
			}
			Static65.aLong52 = Static15.aLong19;
			local113 = Static104.anInt2769;
			if (local113 < 0) {
				local113 = 0;
			} else if (local113 > 764) {
				local113 = 764;
			}
			@Pc(426) byte local426 = 0;
			local156 = (int) local380;
			local118 = local116 * 765 + local113;
			if (Static79.anInt2109 == 2) {
				local426 = 1;
			}
			Static63.aClass3_Sub8_Sub1_6.method1824(173);
			Static63.aClass3_Sub8_Sub1_6.method1801((local426 << 19) + (local156 << 20) + local118);
		}
		if (anInt747 > 0) {
			anInt747--;
		}
		if (Static109.aBooleanArray13[96] || Static109.aBooleanArray13[97] || Static109.aBooleanArray13[98] || Static109.aBooleanArray13[99]) {
			Static102.aBoolean163 = true;
		}
		if (Static102.aBoolean163 && anInt747 <= 0) {
			Static102.aBoolean163 = false;
			anInt747 = 20;
			Static63.aClass3_Sub8_Sub1_6.method1824(95);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static53.anInt1432);
			Static63.aClass3_Sub8_Sub1_6.method1762(Static71.anInt1947);
		}
		if (Static45.aBoolean75 && !Static80.aBoolean126) {
			Static80.aBoolean126 = true;
			Static63.aClass3_Sub8_Sub1_6.method1824(141);
			Static63.aClass3_Sub8_Sub1_6.method1806(1);
		}
		if (!Static45.aBoolean75 && Static80.aBoolean126) {
			Static80.aBoolean126 = false;
			Static63.aClass3_Sub8_Sub1_6.method1824(141);
			Static63.aClass3_Sub8_Sub1_6.method1806(0);
		}
		Static62.method1044();
		if (Static35.anInt1104 != 30 && Static35.anInt1104 != 35) {
			return;
		}
		Static19.method1857();
		Static102.method1705();
		Static68.anInt1891++;
		if (Static68.anInt1891 > 750) {
			Static40.method694();
			return;
		}
		Static37.method670();
		Static13.method323();
		Static6.method173();
		Static54.anInt2739++;
		if (Static14.anInt554 != 0) {
			Static38.anInt1137 += 20;
			if (Static38.anInt1137 >= 400) {
				Static14.anInt554 = 0;
			}
		}
		if (Static38.anInt1139 != 0) {
			anInt748++;
			if (anInt748 >= 15) {
				if (Static38.anInt1139 == 3) {
					Static86.aBoolean137 = true;
				}
				if (Static38.anInt1139 == 2) {
					Static52.aBoolean64 = true;
				}
				Static38.anInt1139 = 0;
			}
		}
		if (Static77.anInt2065 != 0) {
			Static39.anInt1164++;
			if (Static6.anInt208 > Static93.anInt2486 + 5 || Static6.anInt208 < Static93.anInt2486 - 5 || Static61.anInt1672 > Static102.anInt2652 + 5 || Static61.anInt1672 < Static102.anInt2652 - 5) {
				Static99.aBoolean161 = true;
			}
			if (Static3.anInt158 == 0) {
				if (Static77.anInt2065 == 2) {
					Static52.aBoolean64 = true;
				}
				if (Static77.anInt2065 == 3) {
					Static86.aBoolean137 = true;
				}
				Static77.anInt2065 = 0;
				if (Static99.aBoolean161 && Static39.anInt1164 >= 5) {
					Static58.anInt1618 = -1;
					Static33.method657();
					if (Static81.anInt2180 == Static58.anInt1618 && Static93.anInt2488 != Static75.anInt2010) {
						@Pc(729) Class3_Sub1_Sub6 local729 = Static3.method147(Static81.anInt2180);
						@Pc(731) byte local731 = 0;
						if (Static42.anInt1220 == 1 && local729.anInt917 == 206) {
							local731 = 1;
						}
						if (local729.anIntArray64[Static93.anInt2488] <= 0) {
							local731 = 0;
						}
						if (local729.aBoolean41) {
							local113 = Static93.anInt2488;
							local116 = Static75.anInt2010;
							local729.anIntArray64[local113] = local729.anIntArray64[local116];
							local729.anIntArray68[local113] = local729.anIntArray68[local116];
							local729.anIntArray64[local116] = -1;
							local729.anIntArray68[local116] = 0;
						} else if (local731 == 1) {
							local116 = Static75.anInt2010;
							local113 = Static93.anInt2488;
							while (local116 != local113) {
								if (local113 < local116) {
									local729.method568(local116, local116 - 1);
									local116--;
								} else if (local116 < local113) {
									local729.method568(local116, local116 + 1);
									local116++;
								}
							}
						} else {
							local729.method568(Static75.anInt2010, Static93.anInt2488);
						}
						Static63.aClass3_Sub8_Sub1_6.method1824(235);
						Static63.aClass3_Sub8_Sub1_6.method1808(Static93.anInt2488);
						Static63.aClass3_Sub8_Sub1_6.method1808(Static75.anInt2010);
						Static63.aClass3_Sub8_Sub1_6.method1806(local731);
						Static63.aClass3_Sub8_Sub1_6.method1792(Static81.anInt2180);
					}
				} else if ((Static3.anInt156 == 1 || Static70.method1175(Static41.anInt1209 - 1)) && Static41.anInt1209 > 2) {
					Static10.method1323();
				} else if (Static41.anInt1209 > 0) {
					Static51.method1442(Static41.anInt1209 - 1);
				}
				anInt748 = 10;
				Static79.anInt2109 = 0;
			}
		}
		@Pc(892) int local892;
		if (Static1.anInt10 != -1) {
			local62 = Static1.anInt10;
			local892 = Static1.anInt14;
			@Pc(912) boolean local912 = Static81.method1319(0, true, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local62, 0, local892, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 0);
			Static1.anInt10 = -1;
			if (local912) {
				Static46.anInt1370 = Static27.anInt825;
				Static38.anInt1137 = 0;
				Static33.anInt1048 = Static104.anInt2769;
				Static14.anInt554 = 1;
			}
		}
		if (Static79.anInt2109 == 1 && Static63.aClass62_1076 != null) {
			Static79.anInt2109 = 0;
			Static86.aBoolean137 = true;
			Static63.aClass62_1076 = null;
		}
		Static24.method508();
		if (Static91.anInt2434 == -1) {
			Static74.method1199();
			Static38.method678();
			Static24.method502();
		}
		if (Static3.anInt158 == 1 || Static79.anInt2109 == 1) {
			Static80.anInt2161++;
		}
		if (Static92.anInt2449 == -1 && Static51.anInt2323 == -1 && Static39.anInt1162 == -1) {
			if (Static99.anInt2604 > 0) {
				Static99.anInt2604--;
			}
		} else if (Static96.anInt2554 > Static99.anInt2604) {
			Static99.anInt2604++;
			if (Static99.anInt2604 == Static96.anInt2554) {
				if (Static92.anInt2449 != -1) {
					Static86.aBoolean137 = true;
				}
				if (Static51.anInt2323 != -1) {
					Static52.aBoolean64 = true;
				}
			}
		}
		Static32.method628();
		if (Static63.aBoolean147) {
			Static69.method1162();
		}
		for (local62 = 0; local62 < 5; local62++) {
			@Pc(1022) int local1022 = Static63.anIntArray264[local62]++;
		}
		Static109.method1878();
		local892 = Static68.method1157();
		local116 = Static45.method750();
		if (local892 > 4500 && local116 > 4500) {
			Static63.anInt2365 = 250;
			Static80.method1306(4000);
			Static63.aClass3_Sub8_Sub1_6.method1824(88);
		}
		Static104.anInt2765++;
		if (Static104.anInt2765 > 500) {
			Static104.anInt2765 = 0;
			local113 = (int) (Math.random() * 8.0D);
			if ((local113 & 0x1) == 1) {
				Static39.anInt1161 += Static98.anInt2588;
			}
			if ((local113 & 0x2) == 2) {
				Static50.anInt2800 += Static41.anInt1211;
			}
			if ((local113 & 0x4) == 4) {
				Static35.anInt1106 += Static35.anInt1100;
			}
		}
		if (Static39.anInt1161 < -50) {
			Static98.anInt2588 = 2;
		}
		Static15.anInt569++;
		if (Static35.anInt1106 < -40) {
			Static35.anInt1100 = 1;
		}
		if (Static39.anInt1161 > 50) {
			Static98.anInt2588 = -2;
		}
		if (Static35.anInt1106 > 40) {
			Static35.anInt1100 = -1;
		}
		if (Static15.anInt569 > 500) {
			local113 = (int) (Math.random() * 8.0D);
			if ((local113 & 0x2) == 2) {
				Static42.anInt1215 += Static85.anInt2271;
			}
			Static15.anInt569 = 0;
			if ((local113 & 0x1) == 1) {
				Static99.anInt2602 += Static89.anInt2404;
			}
		}
		if (Static42.anInt1215 < -20) {
			Static85.anInt2271 = 1;
		}
		Static74.anInt1975++;
		if (Static42.anInt1215 > 10) {
			Static85.anInt2271 = -1;
		}
		if (Static99.anInt2602 < -60) {
			Static89.anInt2404 = 2;
		}
		if (Static50.anInt2800 < -55) {
			Static41.anInt1211 = 2;
		}
		if (Static50.anInt2800 > 55) {
			Static41.anInt1211 = -2;
		}
		if (Static99.anInt2602 > 60) {
			Static89.anInt2404 = -2;
		}
		if (Static74.anInt1975 > 50) {
			Static63.aClass3_Sub8_Sub1_6.method1824(6);
		}
		try {
			if (Static55.aClass41_2 != null && Static63.aClass3_Sub8_Sub1_6.anInt2704 > 0) {
				Static55.aClass41_2.method1033(Static63.aClass3_Sub8_Sub1_6.aByteArray26, Static63.aClass3_Sub8_Sub1_6.anInt2704);
				Static63.aClass3_Sub8_Sub1_6.anInt2704 = 0;
				Static74.anInt1975 = 0;
			}
		} catch (@Pc(1243) IOException local1243) {
			Static40.method694();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method497() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}
}
