import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "Lclient!wd;")
	public static Class8_Sub1_Sub7 aClass8_Sub1_Sub7_6;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	public static int anInt3465 = 0;

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
	public static int anInt3468 = -1;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString121 = "scroll:";

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public static void method2706() {
		if (Static137.anInt1765 > 0) {
			Static137.anInt1765--;
		}
		if (Static147.anInt2993 > 1) {
			Static147.anInt2993--;
			Static41.anInt879 = Static157.anInt5706;
		}
		if (Static286.aBoolean461) {
			Static286.aBoolean461 = false;
			Static134.method2184();
			return;
		}
		@Pc(34) int local34;
		for (local34 = 0; local34 < 100 && Static257.method3870(); local34++) {
		}
		if (Static23.anInt618 != 30) {
			return;
		}
		Static91.method1472(Static66.aClass8_Sub2_Sub1_4);
		@Pc(59) Object local59 = Static272.aClass87_1.anObject1;
		@Pc(88) int local88;
		@Pc(90) int local90;
		@Pc(132) int local132;
		@Pc(110) int local110;
		@Pc(192) int local192;
		@Pc(187) int local187;
		synchronized (Static272.aClass87_1.anObject1) {
			if (!Static159.aBoolean273) {
				Static272.aClass87_1.anInt2481 = 0;
			} else if (Static157.anInt5714 != 0 || Static272.aClass87_1.anInt2481 >= 40) {
				Static66.aClass8_Sub2_Sub1_4.method2398(212);
				Static66.aClass8_Sub2_Sub1_4.method2340(0);
				@Pc(86) int local86 = Static66.aClass8_Sub2_Sub1_4.anInt2955;
				local88 = 0;
				for (local90 = 0; Static272.aClass87_1.anInt2481 > local90 && Static66.aClass8_Sub2_Sub1_4.anInt2955 - local86 < 240; local90++) {
					local88++;
					local110 = Static272.aClass87_1.anIntArray196[local90];
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > 65534) {
						local110 = 65534;
					}
					@Pc(127) boolean local127 = false;
					local132 = Static272.aClass87_1.anIntArray195[local90];
					if (local132 < 0) {
						local132 = 0;
					} else if (local132 > 65534) {
						local132 = 65534;
					}
					if (Static272.aClass87_1.anIntArray195[local90] == -1 && Static272.aClass87_1.anIntArray196[local90] == -1) {
						local132 = -1;
						local110 = -1;
						local127 = true;
					}
					if (Static269.anInt4970 != local110 || Static10.anInt114 != local132) {
						local187 = local132 - Static10.anInt114;
						local192 = local110 - Static269.anInt4970;
						Static10.anInt114 = local132;
						Static269.anInt4970 = local110;
						if (Static245.anInt4879 < 8 && local192 >= -32 && local192 <= 31 && local187 >= -32 && local187 <= 31) {
							local192 += 32;
							local187 += 32;
							Static66.aClass8_Sub2_Sub1_4.method2333((Static245.anInt4879 << 12) + (local192 << 6) + local187);
							Static245.anInt4879 = 0;
						} else if (Static245.anInt4879 < 32 && local192 >= -128 && local192 <= 127 && local187 >= -128 && local187 <= 127) {
							Static66.aClass8_Sub2_Sub1_4.method2340(Static245.anInt4879 + 128);
							local187 += 128;
							local192 += 128;
							Static66.aClass8_Sub2_Sub1_4.method2333(local187 + (local192 << 8));
							Static245.anInt4879 = 0;
						} else if (Static245.anInt4879 < 32) {
							Static66.aClass8_Sub2_Sub1_4.method2340(Static245.anInt4879 + 192);
							if (local127) {
								Static66.aClass8_Sub2_Sub1_4.method2330(Integer.MIN_VALUE);
							} else {
								Static66.aClass8_Sub2_Sub1_4.method2330(local110 | local132 << 16);
							}
							Static245.anInt4879 = 0;
						} else {
							Static66.aClass8_Sub2_Sub1_4.method2333(Static245.anInt4879 + 57344);
							if (local127) {
								Static66.aClass8_Sub2_Sub1_4.method2330(Integer.MIN_VALUE);
							} else {
								Static66.aClass8_Sub2_Sub1_4.method2330(local110 | local132 << 16);
							}
							Static245.anInt4879 = 0;
						}
					} else if (Static245.anInt4879 < 2047) {
						Static245.anInt4879++;
					}
				}
				Static66.aClass8_Sub2_Sub1_4.method2321(Static66.aClass8_Sub2_Sub1_4.anInt2955 - local86);
				if (local88 >= Static272.aClass87_1.anInt2481) {
					Static272.aClass87_1.anInt2481 = 0;
				} else {
					Static272.aClass87_1.anInt2481 -= local88;
					for (local90 = 0; local90 < Static272.aClass87_1.anInt2481; local90++) {
						Static272.aClass87_1.anIntArray196[local90] = Static272.aClass87_1.anIntArray196[local88 + local90];
						Static272.aClass87_1.anIntArray195[local90] = Static272.aClass87_1.anIntArray195[local90 + local88];
					}
				}
			}
		}
		@Pc(449) byte local449;
		if (Static157.anInt5714 != 0) {
			local88 = Static89.anInt1907;
			if (local88 < 0) {
				local88 = 0;
			} else if (local88 > 65535) {
				local88 = 65535;
			}
			@Pc(433) long local433 = (Static95.aLong77 - Static107.aLong83) / 50L;
			if (local433 > 32767L) {
				local433 = 32767L;
			}
			local90 = Static59.anInt1292;
			local110 = (int) local433;
			local449 = 0;
			if (Static157.anInt5714 == 2) {
				local449 = 1;
			}
			Static107.aLong83 = Static95.aLong77;
			if (local90 < 0) {
				local90 = 0;
			} else if (local90 > 65535) {
				local90 = 65535;
			}
			Static66.aClass8_Sub2_Sub1_4.method2398(51);
			Static66.aClass8_Sub2_Sub1_4.method2345(local449 << 15 | local110);
			Static66.aClass8_Sub2_Sub1_4.method2329(local88 << 16 | local90);
		}
		if (Static240.anInt4799 > 0) {
			Static240.anInt4799--;
		}
		if (Static93.aBoolean139 && Static240.anInt4799 <= 0) {
			Static93.aBoolean139 = false;
			Static240.anInt4799 = 20;
			Static66.aClass8_Sub2_Sub1_4.method2398(113);
			Static66.aClass8_Sub2_Sub1_4.method2366((int) Static82.aFloat20);
			Static66.aClass8_Sub2_Sub1_4.method2363((int) Static201.aFloat36);
		}
		if (Static269.aBoolean400 && !Static256.aBoolean408) {
			Static256.aBoolean408 = true;
			Static66.aClass8_Sub2_Sub1_4.method2398(244);
			Static66.aClass8_Sub2_Sub1_4.method2340(1);
		}
		if (!Static269.aBoolean400 && Static256.aBoolean408) {
			Static256.aBoolean408 = false;
			Static66.aClass8_Sub2_Sub1_4.method2398(244);
			Static66.aClass8_Sub2_Sub1_4.method2340(0);
		}
		if (!Static49.aBoolean75) {
			Static66.aClass8_Sub2_Sub1_4.method2398(205);
			Static66.aClass8_Sub2_Sub1_4.method2326(Static248.method3685());
			Static49.aBoolean75 = true;
		}
		if (Static192.aBoolean316) {
			Static192.aBoolean316 = false;
		} else {
			Static228.aFloat48 /= 2.0F;
		}
		if (Static68.aBoolean120) {
			Static68.aBoolean120 = false;
		} else {
			Static60.aFloat13 /= 2.0F;
		}
		Static56.method899();
		if (Static23.anInt618 != 30) {
			return;
		}
		Static124.method1981();
		Static215.method3367();
		Static214.method3351();
		Static17.anInt477++;
		if (Static17.anInt477 > 750) {
			Static134.method2184();
			return;
		}
		Static228.method3520();
		Static199.method3086();
		Static38.method605();
		if (Static130.aClass159_11 != null) {
			Static49.method771();
		}
		for (local34 = Static295.method2909(true); local34 != -1; local34 = Static295.method2909(false)) {
			Static20.method357(local34);
			Static49.anIntArray76[Static261.anInt5241++ & 0x1F] = local34;
		}
		@Pc(736) Class159 local736;
		@Pc(745) int local745;
		for (@Pc(686) Class8_Sub1_Sub6 local686 = Static258.method3883(); local686 != null; local686 = Static258.method3883()) {
			local88 = local686.method928();
			local90 = local686.method933();
			if (local88 == 1) {
				Static199.anIntArray305[local90] = local686.anInt1284;
				Static34.anIntArray54[Static150.anInt4580++ & 0x1F] = local90;
			} else if (local88 == 2) {
				Static270.aStringArray76[local90] = local686.aString50;
				Static234.anIntArray354[Static151.anInt4147++ & 0x1F] = local90;
			} else if (local88 == 3) {
				local736 = Static82.method1361(local90);
				if (!local686.aString50.equals(local736.aString177)) {
					local736.aString177 = local686.aString50;
					Static128.method2075(local736);
				}
			} else if (local88 == 4) {
				local736 = Static82.method1361(local90);
				local192 = local686.anInt1289;
				local110 = local686.anInt1284;
				local745 = local686.anInt1286;
				if (local110 != local736.anInt5151 || local745 != local736.anInt5153 || local736.anInt5168 != local192) {
					local736.anInt5153 = local745;
					local736.anInt5168 = local192;
					local736.anInt5151 = local110;
					Static128.method2075(local736);
				}
			} else if (local88 == 5) {
				local736 = Static82.method1361(local90);
				if (local686.anInt1284 != local736.anInt5141 || local686.anInt1284 == -1) {
					local736.anInt5175 = 0;
					local736.anInt5194 = 0;
					local736.anInt5137 = 1;
					local736.anInt5141 = local686.anInt1284;
					Static128.method2075(local736);
				}
			} else if (local88 == 6) {
				local132 = local686.anInt1284;
				local192 = local132 & 0x1F;
				local745 = local132 >> 5 & 0x1F;
				@Pc(1101) Class159 local1101 = Static82.method1361(local90);
				local110 = local132 >> 10 & 0x1F;
				local187 = (local192 << 3) + (local745 << 11) + (local110 << 19);
				if (local1101.anInt5193 != local187) {
					local1101.anInt5193 = local187;
					Static128.method2075(local1101);
				}
			} else if (local88 == 7) {
				local736 = Static82.method1361(local90);
				@Pc(1068) boolean local1068 = local686.anInt1284 == 1;
				if (local1068 != local736.aBoolean424) {
					local736.aBoolean424 = local1068;
					Static128.method2075(local736);
				}
			} else if (local88 == 8) {
				local736 = Static82.method1361(local90);
				if (local736.anInt5163 != local686.anInt1284 || local686.anInt1286 != local736.anInt5138 || local686.anInt1289 != local736.anInt5209) {
					local736.anInt5209 = local686.anInt1289;
					local736.anInt5163 = local686.anInt1284;
					local736.anInt5138 = local686.anInt1286;
					if (local736.anInt5125 != -1) {
						if (local736.anInt5201 > 0) {
							local736.anInt5209 = local736.anInt5209 * 32 / local736.anInt5201;
						} else if (local736.anInt5145 > 0) {
							local736.anInt5209 = local736.anInt5209 * 32 / local736.anInt5145;
						}
					}
					Static128.method2075(local736);
				}
			} else if (local88 == 9) {
				local736 = Static82.method1361(local90);
				if (local686.anInt1284 != local736.anInt5125 || local736.anInt5160 != local686.anInt1286) {
					local736.anInt5160 = local686.anInt1286;
					local736.anInt5125 = local686.anInt1284;
					Static128.method2075(local736);
				}
			} else if (local88 == 10) {
				local736 = Static82.method1361(local90);
				if (local686.anInt1284 != local736.anInt5184 || local686.anInt1286 != local736.anInt5134 || local686.anInt1289 != local736.anInt5120) {
					local736.anInt5184 = local686.anInt1284;
					local736.anInt5120 = local686.anInt1289;
					local736.anInt5134 = local686.anInt1286;
					Static128.method2075(local736);
				}
			} else if (local88 == 11) {
				local736 = Static82.method1361(local90);
				local736.aByte17 = 0;
				local736.anInt5208 = local736.anInt5158 = local686.anInt1284;
				local736.anInt5198 = local736.anInt5172 = local686.anInt1286;
				local736.aByte19 = 0;
				Static128.method2075(local736);
			} else if (local88 == 12) {
				local736 = Static82.method1361(local90);
				local110 = local686.anInt1284;
				if (local736 != null && local736.anInt5197 == 0) {
					if (local110 > local736.anInt5207 - local736.anInt5121) {
						local110 = local736.anInt5207 - local736.anInt5121;
					}
					if (local110 < 0) {
						local110 = 0;
					}
					if (local736.anInt5176 != local110) {
						local736.anInt5176 = local110;
						Static128.method2075(local736);
					}
				}
			} else if (local88 == 13) {
				local736 = Static82.method1361(local90);
				local736.anInt5191 = local686.anInt1284;
			}
		}
		if (Static173.anInt3443 != 0) {
			Static187.anInt3758 += 20;
			if (Static187.anInt3758 >= 400) {
				Static173.anInt3443 = 0;
			}
		}
		Static185.anInt3691++;
		if (Static293.aClass159_20 != null) {
			Static139.anInt2774++;
			if (Static139.anInt2774 >= 15) {
				Static128.method2075(Static293.aClass159_20);
				Static293.aClass159_20 = null;
			}
		}
		@Pc(1326) Class159 local1326;
		if (Static198.aClass159_14 != null) {
			Static128.method2075(Static198.aClass159_14);
			if (Static182.anInt3572 > Static288.anInt1351 + 5 || Static182.anInt3572 < Static288.anInt1351 - 5 || Static106.anInt2198 > Static195.anInt2790 + 5 || Static195.anInt2790 - 5 > Static106.anInt2198) {
				Static90.aBoolean138 = true;
			}
			Static87.anInt1864++;
			if (Static47.anInt1046 == 0) {
				if (Static90.aBoolean138 && Static87.anInt1864 >= 5) {
					if (Static198.aClass159_14 == Static177.aClass159_8 && Static138.anInt2765 != Static65.anInt5538) {
						local1326 = Static198.aClass159_14;
						local449 = 0;
						if (Static258.anInt5182 == 1 && local1326.anInt5188 == 206) {
							local449 = 1;
						}
						if (local1326.anIntArray394[Static65.anInt5538] <= 0) {
							local449 = 0;
						}
						if (Static42.method668(local1326).method3359()) {
							local110 = Static138.anInt2765;
							local745 = Static65.anInt5538;
							local1326.anIntArray394[local745] = local1326.anIntArray394[local110];
							local1326.anIntArray399[local745] = local1326.anIntArray399[local110];
							local1326.anIntArray394[local110] = -1;
							local1326.anIntArray399[local110] = 0;
						} else if (local449 == 1) {
							local110 = Static138.anInt2765;
							local745 = Static65.anInt5538;
							while (local110 != local745) {
								if (local110 > local745) {
									local1326.method3882(local110 - 1, local110);
									local110--;
								} else if (local110 < local745) {
									local1326.method3882(local110 + 1, local110);
									local110++;
								}
							}
						} else {
							local1326.method3882(Static65.anInt5538, Static138.anInt2765);
						}
						Static66.aClass8_Sub2_Sub1_4.method2398(252);
						Static66.aClass8_Sub2_Sub1_4.method2326(Static198.aClass159_14.anInt5199);
						Static66.aClass8_Sub2_Sub1_4.method2366(Static65.anInt5538);
						Static66.aClass8_Sub2_Sub1_4.method2366(Static138.anInt2765);
						Static66.aClass8_Sub2_Sub1_4.method2340(local449);
					}
				} else if ((Static236.anInt4770 == 1 || Static181.method2773(Static185.anInt3679 - 1)) && Static185.anInt3679 > 2) {
					Static246.method3670();
				} else if (Static185.anInt3679 > 0) {
					Static21.method393();
				}
				Static157.anInt5714 = 0;
				Static139.anInt2774 = 10;
				Static198.aClass159_14 = null;
			}
		}
		Static15.aBoolean28 = false;
		Static20.aBoolean36 = false;
		Static68.aClass159_7 = null;
		Static97.anInt2003 = 0;
		local1326 = Static164.aClass159_13;
		local736 = Static30.aClass159_2;
		Static30.aClass159_2 = null;
		Static164.aClass159_13 = null;
		while (Static45.method4136() && Static97.anInt2003 < 128) {
			Static156.anIntArray251[Static97.anInt2003] = Static60.anInt1301;
			Static13.anIntArray14[Static97.anInt2003] = Static27.aChar1;
			Static97.anInt2003++;
		}
		Static130.aClass159_11 = null;
		if (Static248.anInt4917 != -1) {
			Static189.method2949(Static250.anInt4959, Static248.anInt4917, 0, 0, 0, 0, Static13.anInt356);
		}
		Static157.anInt5706++;
		while (true) {
			@Pc(1555) Class159 local1555;
			@Pc(1566) Class159 local1566;
			@Pc(1550) Class8_Sub14 local1550;
			do {
				local1550 = (Class8_Sub14) Static167.aClass182_20.method4326();
				if (local1550 == null) {
					while (true) {
						do {
							local1550 = (Class8_Sub14) Static190.aClass182_23.method4326();
							if (local1550 == null) {
								while (true) {
									do {
										local1550 = (Class8_Sub14) Static180.aClass182_22.method4326();
										if (local1550 == null) {
											if (Static130.aClass159_11 == null) {
												Static118.anInt2383 = 0;
											}
											if (Static201.aClass159_15 != null) {
												Static163.method3406();
											}
											if (Static94.anInt1962 > 0 && Static36.aBooleanArray2[82] && Static36.aBooleanArray2[81] && Static183.anInt3587 != 0) {
												local110 = Static34.anInt770 - Static183.anInt3587;
												if (local110 < 0) {
													local110 = 0;
												} else if (local110 > 3) {
													local110 = 3;
												}
												Static105.method1701(Static21.aClass36_Sub3_Sub1_1.anIntArray310[0] + Static49.anInt1089, local110, Static21.aClass36_Sub3_Sub1_1.anIntArray308[0] + Static130.anInt2601);
											}
											if (Static94.anInt1962 > 0 && Static36.aBooleanArray2[82] && Static36.aBooleanArray2[81]) {
												if (Static23.anInt621 != -1) {
													Static105.method1701(Static49.anInt1089 + Static23.anInt621, Static34.anInt770, Static101.anInt2132 + Static130.anInt2601);
												}
												Static92.anInt1948 = 0;
												Static55.anInt1229 = 0;
											} else if (Static55.anInt1229 == 2) {
												if (Static23.anInt621 != -1) {
													Static66.aClass8_Sub2_Sub1_4.method2398(229);
													Static66.aClass8_Sub2_Sub1_4.method2345(Static23.anInt621 + Static49.anInt1089);
													Static66.aClass8_Sub2_Sub1_4.method2330(Static106.anInt2200);
													Static66.aClass8_Sub2_Sub1_4.method2363(Static101.anInt2132 + Static130.anInt2601);
													Static66.aClass8_Sub2_Sub1_4.method2366(Static132.anInt2621);
													Static187.anInt3758 = 0;
													Static180.anInt3530 = Static89.anInt1907;
													Static234.anInt4715 = Static59.anInt1292;
													Static173.anInt3443 = 1;
												}
												Static55.anInt1229 = 0;
											} else if (Static92.anInt1948 == 2) {
												if (Static23.anInt621 != -1) {
													Static66.aClass8_Sub2_Sub1_4.method2398(226);
													Static66.aClass8_Sub2_Sub1_4.method2363(Static101.anInt2132 + Static130.anInt2601);
													Static66.aClass8_Sub2_Sub1_4.method2345(Static23.anInt621 + Static49.anInt1089);
													Static173.anInt3443 = 1;
													Static187.anInt3758 = 0;
													Static234.anInt4715 = Static59.anInt1292;
													Static180.anInt3530 = Static89.anInt1907;
												}
												Static92.anInt1948 = 0;
											} else if (Static23.anInt621 != -1 && Static55.anInt1229 == 0 && Static92.anInt1948 == 0) {
												Static93.method1494((Static101.anInt2132 << 1) + 1 - Static21.aClass36_Sub3_Sub1_1.method3110() >> 1, (Static23.anInt621 << 1) + 1 - Static21.aClass36_Sub3_Sub1_1.method3110() >> 1, 0);
												Static180.anInt3530 = Static89.anInt1907;
												Static173.anInt3443 = 1;
												Static234.anInt4715 = Static59.anInt1292;
												Static187.anInt3758 = 0;
											}
											Static23.anInt621 = -1;
											Static286.method4127();
											if (Static164.aClass159_13 != local1326) {
												if (local1326 != null) {
													Static128.method2075(local1326);
												}
												if (Static164.aClass159_13 != null) {
													Static128.method2075(Static164.aClass159_13);
												}
											}
											if (Static30.aClass159_2 != local736 && Static108.anInt2270 == Static85.anInt1820) {
												if (local736 != null) {
													Static128.method2075(local736);
												}
												if (Static30.aClass159_2 != null) {
													Static128.method2075(Static30.aClass159_2);
												}
											}
											if (Static30.aClass159_2 == null) {
												if (Static108.anInt2270 > 0) {
													Static108.anInt2270--;
												}
											} else if (Static85.anInt1820 > Static108.anInt2270) {
												Static108.anInt2270++;
												if (Static108.anInt2270 == Static85.anInt1820) {
													Static128.method2075(Static30.aClass159_2);
												}
											}
											for (local110 = 0; local110 < 5; local110++) {
												@Pc(1990) int local1990 = Static39.anIntArray60[local110]++;
											}
											local110 = Static235.method3581();
											local745 = Static193.method3019();
											if (local110 > 15000 && local745 > 15000) {
												Static137.anInt1765 = 250;
												Static229.method3524(14500);
												Static66.aClass8_Sub2_Sub1_4.method2398(192);
											}
											if (Static3.aClass163_10 != null && Static3.aClass163_10.anInt5259 == 1) {
												if (Static3.aClass163_10.anObject7 != null) {
													Static37.method3008(Static79.aString65, Static102.aBoolean168);
												}
												Static3.aClass163_10 = null;
												Static102.aBoolean168 = false;
												Static79.aString65 = null;
											}
											Static27.anInt670++;
											Static215.anInt4430++;
											if (Static27.anInt670 > 500) {
												Static27.anInt670 = 0;
												local192 = (int) (Math.random() * 8.0D);
												if ((local192 & 0x4) == 4) {
													Static28.anInt690 += Static101.anInt2124;
												}
												if ((local192 & 0x1) == 1) {
													Static151.anInt4138 += Static282.anInt929;
												}
												if ((local192 & 0x2) == 2) {
													Static279.anInt5452 += Static11.anInt2976;
												}
											}
											Static255.anInt5026++;
											if (Static151.anInt4138 < -50) {
												Static282.anInt929 = 2;
											}
											if (Static28.anInt690 < -40) {
												Static101.anInt2124 = 1;
											}
											if (Static151.anInt4138 > 50) {
												Static282.anInt929 = -2;
											}
											if (Static28.anInt690 > 40) {
												Static101.anInt2124 = -1;
											}
											if (Static255.anInt5026 > 500) {
												Static255.anInt5026 = 0;
												local192 = (int) (Math.random() * 8.0D);
												if ((local192 & 0x2) == 2) {
													Static2.anInt12 += Static152.anInt3118;
												}
												if ((local192 & 0x1) == 1) {
													Static121.anInt2437 += Static228.anInt4639;
												}
											}
											if (Static121.anInt2437 < -60) {
												Static228.anInt4639 = 2;
											}
											if (Static279.anInt5452 < -55) {
												Static11.anInt2976 = 2;
											}
											if (Static121.anInt2437 > 60) {
												Static228.anInt4639 = -2;
											}
											if (Static2.anInt12 < -20) {
												Static152.anInt3118 = 1;
											}
											if (Static2.anInt12 > 10) {
												Static152.anInt3118 = -1;
											}
											if (Static279.anInt5452 > 55) {
												Static11.anInt2976 = -2;
											}
											if (Static215.anInt4430 > 50) {
												Static66.aClass8_Sub2_Sub1_4.method2398(219);
											}
											if (Static141.aBoolean231) {
												Static151.method3106();
												Static141.aBoolean231 = false;
											}
											try {
												if (Static95.aClass92_4 != null && Static66.aClass8_Sub2_Sub1_4.anInt2955 > 0) {
													Static95.aClass92_4.method2178(Static66.aClass8_Sub2_Sub1_4.aByteArray24, Static66.aClass8_Sub2_Sub1_4.anInt2955);
													Static215.anInt4430 = 0;
													Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
												}
											} catch (@Pc(2244) IOException local2244) {
												Static134.method2184();
											}
											return;
										}
										local1555 = local1550.aClass159_10;
										if (local1555.anInt5133 < 0) {
											break;
										}
										local1566 = Static82.method1361(local1555.anInt5116);
									} while (local1566 == null || local1566.aClass159Array1 == null || local1555.anInt5133 >= local1566.aClass159Array1.length || local1566.aClass159Array1[local1555.anInt5133] != local1555);
									Static173.method2688(local1550);
								}
							}
							local1555 = local1550.aClass159_10;
							if (local1555.anInt5133 < 0) {
								break;
							}
							local1566 = Static82.method1361(local1555.anInt5116);
						} while (local1566 == null || local1566.aClass159Array1 == null || local1566.aClass159Array1.length <= local1555.anInt5133 || local1555 != local1566.aClass159Array1[local1555.anInt5133]);
						Static173.method2688(local1550);
					}
				}
				local1555 = local1550.aClass159_10;
				if (local1555.anInt5133 < 0) {
					break;
				}
				local1566 = Static82.method1361(local1555.anInt5116);
			} while (local1566 == null || local1566.aClass159Array1 == null || local1566.aClass159Array1.length <= local1555.anInt5133 || local1555 != local1566.aClass159Array1[local1555.anInt5133]);
			Static173.method2688(local1550);
		}
	}
}
