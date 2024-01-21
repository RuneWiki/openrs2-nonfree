import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_14;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_15;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1233 = Static59.method1195("Add friend");

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1234 = Static59.method1195("null");

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1235 = Static59.method1195("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1236 = Static59.method1195("Loaded textures");

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1237 = Static59.method1195(" <col=00ff80>");

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
	public static int anInt2951 = 0;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1238 = aClass60_1236;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1239 = Static59.method1195("huffman");

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1240 = Static59.method1195("Script error in: ");

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public static int anInt2953 = 0;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1241 = aClass60_1233;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public static int anInt2954 = 0;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
	public static int anInt2955 = -1;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1983() {
		if (Static73.aClass34_1 != null) {
			Static73.aClass34_1.method1727();
		}
		if (Static99.aClass34_2 != null) {
			Static99.aClass34_2.method1727();
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method1984() {
		aClass25_Sub1_15 = null;
		aClass60_1241 = null;
		aClass60_1237 = null;
		aClass60_1240 = null;
		aClass3_Sub1_Sub2_Sub4_14 = null;
		aClass60_1236 = null;
		aClass60_1238 = null;
		aClass25_Sub1_14 = null;
		aClass60_1239 = null;
		aClass60_1233 = null;
		aClass60_1235 = null;
		anIntArray309 = null;
		aClass60_1234 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method1985() {
		if (Static11.anInt345 > 1) {
			Static11.anInt345--;
		}
		if (Static32.anInt1114 > 0) {
			Static32.anInt1114--;
		}
		if (Static62.aBoolean67) {
			Static62.aBoolean67 = false;
			Static51.method921();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static33.method753(); local30++) {
		}
		if (Static39.anInt1303 != 30 && Static39.anInt1303 != 35) {
			return;
		}
		if (Static96.aBoolean101 && Static39.anInt1303 == 30) {
			Static129.anInt3467 = 0;
			Static112.anInt3110 = 0;
			while (Static68.method1388()) {
			}
			for (@Pc(65) int local65 = 0; local65 < Static109.aBooleanArray65.length; local65++) {
				Static109.aBooleanArray65[local65] = false;
			}
		}
		Static15.method433(Static81.aClass3_Sub12_Sub1_2);
		@Pc(87) Object local87 = Static21.aClass79_1.anObject4;
		@Pc(115) int local115;
		@Pc(108) int local108;
		@Pc(117) int local117;
		@Pc(137) int local137;
		synchronized (Static21.aClass79_1.anObject4) {
			if (!Static61.aBoolean63) {
				Static21.aClass79_1.anInt3385 = 0;
			} else if (Static112.anInt3110 != 0 || Static21.aClass79_1.anInt3385 >= 40) {
				Static81.aClass3_Sub12_Sub1_2.method1980(203);
				local108 = 0;
				Static81.aClass3_Sub12_Sub1_2.method1937(0);
				local115 = Static81.aClass3_Sub12_Sub1_2.anInt2886;
				@Pc(132) int local132;
				for (local117 = 0; local117 < Static21.aClass79_1.anInt3385 && Static81.aClass3_Sub12_Sub1_2.anInt2886 - local115 < 240; local117++) {
					local108++;
					local132 = Static21.aClass79_1.anIntArray382[local117];
					local137 = Static21.aClass79_1.anIntArray383[local117];
					if (local137 < 0) {
						local137 = 0;
					} else if (local137 > 764) {
						local137 = 764;
					}
					if (local132 < 0) {
						local132 = 0;
					} else if (local132 > 502) {
						local132 = 502;
					}
					@Pc(170) int local170 = local132 * 765 + local137;
					if (Static21.aClass79_1.anIntArray382[local117] == -1 && Static21.aClass79_1.anIntArray383[local117] == -1) {
						local170 = 524287;
						local137 = -1;
						local132 = -1;
					}
					if (local137 != Static26.anInt984 || local132 != Static52.anInt1721) {
						@Pc(210) int local210 = local132 - Static52.anInt1721;
						@Pc(215) int local215 = local137 - Static26.anInt984;
						Static52.anInt1721 = local132;
						Static26.anInt984 = local137;
						if (Static29.anInt1001 < 8 && local215 >= -32 && local215 <= 31 && local210 >= -32 && local210 <= 31) {
							local210 += 32;
							local215 += 32;
							Static81.aClass3_Sub12_Sub1_2.method1922(local210 + (Static29.anInt1001 << 12) + (local215 << 6));
							Static29.anInt1001 = 0;
						} else if (Static29.anInt1001 < 8) {
							Static81.aClass3_Sub12_Sub1_2.method1934((Static29.anInt1001 << 19) + local170 + 8388608);
							Static29.anInt1001 = 0;
						} else {
							Static81.aClass3_Sub12_Sub1_2.method1966(local170 + (Static29.anInt1001 << 19) - 1073741824);
							Static29.anInt1001 = 0;
						}
					} else if (Static29.anInt1001 < 2047) {
						Static29.anInt1001++;
					}
				}
				Static81.aClass3_Sub12_Sub1_2.method1935(Static81.aClass3_Sub12_Sub1_2.anInt2886 - local115);
				if (local108 < Static21.aClass79_1.anInt3385) {
					Static21.aClass79_1.anInt3385 -= local108;
					for (local132 = 0; local132 < Static21.aClass79_1.anInt3385; local132++) {
						Static21.aClass79_1.anIntArray383[local132] = Static21.aClass79_1.anIntArray383[local132 + local108];
						Static21.aClass79_1.anIntArray382[local132] = Static21.aClass79_1.anIntArray382[local108 + local132];
					}
				} else {
					Static21.aClass79_1.anInt3385 = 0;
				}
			}
		}
		if (Static112.anInt3110 != 0) {
			@Pc(380) long local380 = (Static28.aLong106 - Static129.aLong108) / 50L;
			Static129.aLong108 = Static28.aLong106;
			local115 = Static84.anInt2576;
			@Pc(386) byte local386 = 0;
			if (local380 > 4095L) {
				local380 = 4095L;
			}
			if (Static112.anInt3110 == 2) {
				local386 = 1;
			}
			local108 = Static130.anInt3486;
			local137 = (int) local380;
			Static81.aClass3_Sub12_Sub1_2.method1980(127);
			if (local115 < 0) {
				local115 = 0;
			} else if (local115 > 502) {
				local115 = 502;
			}
			if (local108 < 0) {
				local108 = 0;
			} else if (local108 > 764) {
				local108 = 764;
			}
			local117 = local115 * 765 + local108;
			Static81.aClass3_Sub12_Sub1_2.method1951(local117 + (local137 << 20) + (local386 << 19));
		}
		if (Static109.aBooleanArray65[96] || Static109.aBooleanArray65[97] || Static109.aBooleanArray65[98] || Static109.aBooleanArray65[99]) {
			Static97.aBoolean102 = true;
		}
		if (Static130.anInt3481 > 0) {
			Static130.anInt3481--;
		}
		if (Static97.aBoolean102 && Static130.anInt3481 <= 0) {
			Static130.anInt3481 = 20;
			Static97.aBoolean102 = false;
			Static81.aClass3_Sub12_Sub1_2.method1980(162);
			Static81.aClass3_Sub12_Sub1_2.method1924(Static107.anInt3040);
			Static81.aClass3_Sub12_Sub1_2.method1924(Static52.anInt1724);
		}
		if (Static12.aBoolean14 && !Static112.aBoolean108) {
			Static112.aBoolean108 = true;
			Static81.aClass3_Sub12_Sub1_2.method1980(101);
			Static81.aClass3_Sub12_Sub1_2.method1937(1);
		}
		if (!Static12.aBoolean14 && Static112.aBoolean108) {
			Static112.aBoolean108 = false;
			Static81.aClass3_Sub12_Sub1_2.method1980(101);
			Static81.aClass3_Sub12_Sub1_2.method1937(0);
		}
		Static42.method966();
		if (Static39.anInt1303 != 30 && Static39.anInt1303 != 35) {
			return;
		}
		Static29.method664();
		Static79.method1600();
		Static31.anInt1105++;
		if (Static31.anInt1105 > 750) {
			Static51.method921();
			return;
		}
		Static124.method2144();
		Static111.method2065();
		Static109.method2056();
		if (Static28.anInt3336 != 0) {
			Static93.anInt2677++;
			if (Static93.anInt2677 >= 15) {
				if (Static28.anInt3336 == 2) {
					Static118.aBoolean115 = true;
				}
				if (Static28.anInt3336 == 3) {
					Static71.aBoolean49 = true;
				}
				Static28.anInt3336 = 0;
			}
		}
		Static69.anInt2153++;
		if (Static49.anInt1594 != 0) {
			Static11.anInt354 += 20;
			if (Static11.anInt354 >= 400) {
				Static49.anInt1594 = 0;
			}
		}
		if (Static101.anInt2962 != 0) {
			if (Static89.anInt2622 + 5 < Static122.anInt720 || Static122.anInt720 < Static89.anInt2622 - 5 || Static11.anInt350 + 5 < Static12.anInt374 || Static11.anInt350 - 5 > Static12.anInt374) {
				Static91.aBoolean97 = true;
			}
			Static52.anInt1715++;
			if (Static129.anInt3467 == 0) {
				if (Static101.anInt2962 == 3) {
					Static71.aBoolean49 = true;
				}
				if (Static101.anInt2962 == 2) {
					Static118.aBoolean115 = true;
				}
				Static101.anInt2962 = 0;
				if (Static91.aBoolean97 && Static52.anInt1715 >= 5) {
					Static70.anInt2202 = -1;
					Static114.method2112();
					if (Static69.anInt2144 == Static70.anInt2202 && Static35.anInt1193 != Static69.anInt2150) {
						@Pc(720) byte local720 = 0;
						@Pc(724) Class3_Sub15 local724 = Static86.method1067(Static69.anInt2144);
						if (Static109.anInt3080 == 1 && local724.anInt2293 == 206) {
							local720 = 1;
						}
						if (local724.anIntArray235[Static35.anInt1193] <= 0) {
							local720 = 0;
						}
						if (Static115.method2118(Static33.method751(local724))) {
							local115 = Static69.anInt2150;
							local108 = Static35.anInt1193;
							local724.anIntArray235[local108] = local724.anIntArray235[local115];
							local724.anIntArray230[local108] = local724.anIntArray230[local115];
							local724.anIntArray235[local115] = -1;
							local724.anIntArray230[local115] = 0;
						} else if (local720 == 1) {
							local115 = Static69.anInt2150;
							local108 = Static35.anInt1193;
							while (local108 != local115) {
								if (local108 < local115) {
									local724.method1493(local115 - 1, local115);
									local115--;
								} else if (local108 > local115) {
									local724.method1493(local115 + 1, local115);
									local115++;
								}
							}
						} else {
							local724.method1493(Static35.anInt1193, Static69.anInt2150);
						}
						Static81.aClass3_Sub12_Sub1_2.method1980(55);
						Static81.aClass3_Sub12_Sub1_2.method1967(Static35.anInt1193);
						Static81.aClass3_Sub12_Sub1_2.method1961(Static69.anInt2144);
						Static81.aClass3_Sub12_Sub1_2.method1949(local720);
						Static81.aClass3_Sub12_Sub1_2.method1922(Static69.anInt2150);
					}
				} else if ((Static36.anInt1213 == 1 || Static89.method1693(Static22.anInt872 - 1)) && Static22.anInt872 > 2) {
					Static73.method1527();
				} else if (Static22.anInt872 > 0) {
					Static73.method1528(Static22.anInt872 - 1);
				}
				Static93.anInt2677 = 10;
				Static112.anInt3110 = 0;
			}
		}
		if (Static114.anInt3185 == -1) {
			if (Static79.anInt2467 != -1) {
				Static35.method781(0, 4, 338, 4, Static79.anInt2467, 516, 34);
			} else if (Static46.anInt1446 != -1) {
				Static35.method781(0, 4, 338, 4, Static46.anInt1446, 516, 34);
			}
			if (Static119.anInt3242 != -1) {
				Static35.method781(1, 205, 466, 553, Static119.anInt3242, 743, 34);
			} else if (Static22.anIntArray87[Static51.anInt1340] != -1) {
				Static35.method781(1, 205, 466, 553, Static22.anIntArray87[Static51.anInt1340], 743, 34);
			}
			if (Static78.anInt2429 != -1) {
				Static35.method781(2, 357, 453, 17, Static78.anInt2429, 496, 34);
			} else if (Static129.anInt3460 != -1) {
				Static35.method781(2, 357, 453, 17, Static129.anInt3460, 496, 34);
			}
		} else {
			Static35.method781(3, 0, 503, 0, Static114.anInt3185, 765, 34);
			if (Static57.anInt3397 != -1) {
				Static35.method781(3, 0, 503, 0, Static57.anInt3397, 765, 34);
			}
		}
		if (Static114.anInt3185 == -1) {
			if (Static79.anInt2467 != -1) {
				Static35.method781(0, 4, 338, 4, Static79.anInt2467, 516, -35);
			} else if (Static46.anInt1446 != -1) {
				Static35.method781(0, 4, 338, 4, Static46.anInt1446, 516, -35);
			}
			if (Static119.anInt3242 != -1) {
				Static35.method781(1, 205, 466, 553, Static119.anInt3242, 743, -35);
			} else if (Static22.anIntArray87[Static51.anInt1340] != -1) {
				Static35.method781(1, 205, 466, 553, Static22.anIntArray87[Static51.anInt1340], 743, -35);
			}
			if (Static78.anInt2429 != -1) {
				Static35.method781(2, 357, 453, 17, Static78.anInt2429, 496, -35);
			} else if (Static129.anInt3460 != -1) {
				Static35.method781(2, 357, 453, 17, Static129.anInt3460, 496, -35);
			}
		} else {
			Static35.method781(3, 0, 503, 0, Static114.anInt3185, 765, -35);
			if (Static57.anInt3397 != -1) {
				Static35.method781(3, 0, 503, 0, Static57.anInt3397, 765, -35);
			}
		}
		Static10.method309();
		@Pc(1135) int local1135;
		if (Static94.anInt2701 != -1) {
			local1135 = Static94.anInt2701;
			local115 = Static94.anInt2706;
			@Pc(1157) boolean local1157 = Static67.method1378(local1135, true, 0, 0, 0, 0, 0, 0, local115, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			Static94.anInt2701 = -1;
			if (local1157) {
				Static3.anInt127 = Static84.anInt2576;
				Static103.anInt2993 = Static130.anInt3486;
				Static11.anInt354 = 0;
				Static49.anInt1594 = 1;
			}
		}
		if (Static112.anInt3110 == 1 && Static127.aClass60_1156 != null) {
			Static112.anInt3110 = 0;
			Static127.aClass60_1156 = null;
			Static71.aBoolean49 = true;
		}
		Static102.method1994();
		if (Static114.anInt3185 == -1) {
			Static80.method1622();
			Static55.method1141();
			Static45.method987();
		}
		if (Static89.anInt2619 == -1 && Static73.anInt2370 == -1 && Static97.anInt2778 == -1) {
			if (Static89.anInt2620 > 0) {
				Static89.anInt2620--;
			}
		} else if (Static4.anInt136 > Static89.anInt2620) {
			Static89.anInt2620++;
			if (Static4.anInt136 == Static89.anInt2620) {
				if (Static89.anInt2619 != -1) {
					Static71.aBoolean49 = true;
				}
				if (Static73.anInt2370 != -1) {
					Static118.aBoolean115 = true;
				}
			}
		}
		if (Static129.anInt3467 == 1 || Static112.anInt3110 == 1) {
			Static102.anInt2964++;
		}
		Static14.method369();
		if (Static62.aBoolean66) {
			Static57.method2263();
		}
		for (local1135 = 0; local1135 < 5; local1135++) {
			@Pc(1263) int local1263 = Static55.anIntArray197[local1135]++;
		}
		Static51.method926();
		local115 = Static70.method1461();
		local108 = Static122.method480();
		if (local115 > 4500 && local108 > 4500) {
			Static32.anInt1114 = 250;
			Static15.method432(4000);
			Static81.aClass3_Sub12_Sub1_2.method1980(68);
		}
		Static17.anInt758++;
		Static34.anInt1181++;
		Static96.anInt2746++;
		if (Static96.anInt2746 > 500) {
			local117 = (int) (Math.random() * 8.0D);
			if ((local117 & 0x4) == 4) {
				Static19.anInt3409 += Static118.anInt3217;
			}
			if ((local117 & 0x1) == 1) {
				Static128.anInt3458 += Static119.anInt3241;
			}
			if ((local117 & 0x2) == 2) {
				Static125.anInt3376 += Static55.anInt1755;
			}
			Static96.anInt2746 = 0;
		}
		if (Static34.anInt1181 > 500) {
			local117 = (int) (Math.random() * 8.0D);
			Static34.anInt1181 = 0;
			if ((local117 & 0x2) == 2) {
				Static43.anInt1424 += Static86.anInt1613;
			}
			if ((local117 & 0x1) == 1) {
				Static39.anInt1294 += Static97.anInt2779;
			}
		}
		if (Static39.anInt1294 < -60) {
			Static97.anInt2779 = 2;
		}
		if (Static19.anInt3409 < -40) {
			Static118.anInt3217 = 1;
		}
		if (Static128.anInt3458 < -50) {
			Static119.anInt3241 = 2;
		}
		if (Static39.anInt1294 > 60) {
			Static97.anInt2779 = -2;
		}
		if (Static19.anInt3409 > 40) {
			Static118.anInt3217 = -1;
		}
		if (Static43.anInt1424 < -20) {
			Static86.anInt1613 = 1;
		}
		if (Static125.anInt3376 < -55) {
			Static55.anInt1755 = 2;
		}
		if (Static125.anInt3376 > 55) {
			Static55.anInt1755 = -2;
		}
		if (Static43.anInt1424 > 10) {
			Static86.anInt1613 = -1;
		}
		if (Static128.anInt3458 > 50) {
			Static119.anInt3241 = -2;
		}
		if (Static17.anInt758 > 50) {
			Static81.aClass3_Sub12_Sub1_2.method1980(183);
		}
		try {
			if (Static104.aClass47_3 != null && Static81.aClass3_Sub12_Sub1_2.anInt2886 > 0) {
				Static104.aClass47_3.method1562(Static81.aClass3_Sub12_Sub1_2.aByteArray77, Static81.aClass3_Sub12_Sub1_2.anInt2886);
				Static81.aClass3_Sub12_Sub1_2.anInt2886 = 0;
				Static17.anInt758 = 0;
			}
		} catch (@Pc(1471) IOException local1471) {
			Static51.method921();
		}
	}
}
