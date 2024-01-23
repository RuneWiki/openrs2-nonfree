import java.io.IOException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "Lclient!hi;")
	public static Class66 aClass66_31;

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "Lclient!tl;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "[I")
	public static int[] anIntArray297 = new int[100];

	@OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
	public static int anInt3592 = 0;

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
	public static int anInt3594 = 0;

	@OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
	public static int anInt3597 = 0;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
	public static void method3080() {
		if (Static163.anInt3253 > 1) {
			Static163.anInt3253--;
			Static310.anInt5667 = Static86.anInt1698;
		}
		if (Static57.anInt1090 > 0) {
			Static57.anInt1090--;
		}
		if (Static232.aBoolean292) {
			Static232.aBoolean292 = false;
			Static105.method1211();
			return;
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < 100 && Static146.method2489(); local31++) {
		}
		if (Static37.anInt773 != 30) {
			return;
		}
		Static296.method4521(Static127.aClass1_Sub14_Sub1_3);
		@Pc(57) Object local57 = Static136.aClass88_1.anObject3;
		@Pc(89) int local89;
		@Pc(98) int local98;
		@Pc(115) int local115;
		@Pc(120) int local120;
		@Pc(193) int local193;
		@Pc(199) int local199;
		synchronized (Static136.aClass88_1.anObject3) {
			if (!Static227.aBoolean287) {
				Static136.aClass88_1.anInt2837 = 0;
			} else if (Static83.anInt1652 != 0 || Static136.aClass88_1.anInt2837 >= 40) {
				Static127.aClass1_Sub14_Sub1_3.method1408(165);
				Static127.aClass1_Sub14_Sub1_3.method1390(0);
				local89 = 0;
				@Pc(92) int local92 = Static127.aClass1_Sub14_Sub1_3.anInt1480;
				for (local98 = 0; Static136.aClass88_1.anInt2837 > local98 && Static127.aClass1_Sub14_Sub1_3.anInt1480 - local92 < 240; local98++) {
					local89++;
					local115 = Static136.aClass88_1.anIntArray238[local98];
					local120 = Static136.aClass88_1.anIntArray237[local98];
					if (local120 < 0) {
						local120 = 0;
					} else if (local120 > 65534) {
						local120 = 65534;
					}
					if (local115 < 0) {
						local115 = 0;
					} else if (local115 > 65534) {
						local115 = 65534;
					}
					@Pc(152) boolean local152 = false;
					if (Static136.aClass88_1.anIntArray238[local98] == -1 && Static136.aClass88_1.anIntArray237[local98] == -1) {
						local120 = -1;
						local115 = -1;
						local152 = true;
					}
					if (Static21.anInt386 != local120 || local115 != Static26.anInt449) {
						local193 = local120 - Static21.anInt386;
						Static21.anInt386 = local120;
						local199 = local115 - Static26.anInt449;
						Static26.anInt449 = local115;
						if (Static236.anInt4290 < 8 && local193 >= -32 && local193 <= 31 && local199 >= -32 && local199 <= 31) {
							local199 += 32;
							local193 += 32;
							Static127.aClass1_Sub14_Sub1_3.method1338(local199 + (Static236.anInt4290 << 12) + (local193 << 6));
							Static236.anInt4290 = 0;
						} else if (Static236.anInt4290 < 32 && local193 >= -128 && local193 <= 127 && local199 >= -128 && local199 <= 127) {
							Static127.aClass1_Sub14_Sub1_3.method1390(Static236.anInt4290 + 128);
							local193 += 128;
							local199 += 128;
							Static127.aClass1_Sub14_Sub1_3.method1338(local199 + (local193 << 8));
							Static236.anInt4290 = 0;
						} else if (Static236.anInt4290 >= 32) {
							Static127.aClass1_Sub14_Sub1_3.method1338(Static236.anInt4290 + 57344);
							if (local152) {
								Static127.aClass1_Sub14_Sub1_3.method1387(Integer.MIN_VALUE);
							} else {
								Static127.aClass1_Sub14_Sub1_3.method1387(local115 << 16 | local120);
							}
							Static236.anInt4290 = 0;
						} else {
							Static127.aClass1_Sub14_Sub1_3.method1390(Static236.anInt4290 + 192);
							if (local152) {
								Static127.aClass1_Sub14_Sub1_3.method1387(Integer.MIN_VALUE);
							} else {
								Static127.aClass1_Sub14_Sub1_3.method1387(local120 | local115 << 16);
							}
							Static236.anInt4290 = 0;
						}
					} else if (Static236.anInt4290 < 2047) {
						Static236.anInt4290++;
					}
				}
				Static127.aClass1_Sub14_Sub1_3.method1379(Static127.aClass1_Sub14_Sub1_3.anInt1480 - local92);
				if (local89 < Static136.aClass88_1.anInt2837) {
					Static136.aClass88_1.anInt2837 -= local89;
					for (local98 = 0; local98 < Static136.aClass88_1.anInt2837; local98++) {
						Static136.aClass88_1.anIntArray237[local98] = Static136.aClass88_1.anIntArray237[local89 + local98];
						Static136.aClass88_1.anIntArray238[local98] = Static136.aClass88_1.anIntArray238[local89 + local98];
					}
				} else {
					Static136.aClass88_1.anInt2837 = 0;
				}
			}
		}
		if (Static83.anInt1652 != 0) {
			@Pc(417) long local417 = (Static307.aLong206 - Static7.aLong10) / 50L;
			if (local417 > 32767L) {
				local417 = 32767L;
			}
			Static7.aLong10 = Static307.aLong206;
			local89 = Static282.anInt5092;
			if (local89 < 0) {
				local89 = 0;
			} else if (local89 > 65535) {
				local89 = 65535;
			}
			@Pc(449) byte local449 = 0;
			local98 = Static238.anInt4321;
			if (Static83.anInt1652 == 2) {
				local449 = 1;
			}
			Static127.aClass1_Sub14_Sub1_3.method1408(172);
			local120 = (int) local417;
			if (local98 < 0) {
				local98 = 0;
			} else if (local98 > 65535) {
				local98 = 65535;
			}
			Static127.aClass1_Sub14_Sub1_3.method1342(local98 | local89 << 16);
			Static127.aClass1_Sub14_Sub1_3.method1341(local120 | local449 << 15);
		}
		if (Static275.anInt4968 > 0) {
			Static275.anInt4968--;
		}
		if (Static114.aBoolean142 && Static275.anInt4968 <= 0) {
			Static114.aBoolean142 = false;
			Static275.anInt4968 = 20;
			Static127.aClass1_Sub14_Sub1_3.method1408(132);
			Static127.aClass1_Sub14_Sub1_3.method1341((int) Static278.aFloat154);
			Static127.aClass1_Sub14_Sub1_3.method1341((int) Static49.aFloat32);
		}
		if (Static13.aBoolean6 && !Static286.aBoolean352) {
			Static286.aBoolean352 = true;
			Static127.aClass1_Sub14_Sub1_3.method1408(236);
			Static127.aClass1_Sub14_Sub1_3.method1390(1);
		}
		if (!Static13.aBoolean6 && Static286.aBoolean352) {
			Static286.aBoolean352 = false;
			Static127.aClass1_Sub14_Sub1_3.method1408(236);
			Static127.aClass1_Sub14_Sub1_3.method1390(0);
		}
		if (!Static75.aBoolean88) {
			Static127.aClass1_Sub14_Sub1_3.method1408(130);
			Static127.aClass1_Sub14_Sub1_3.method1376(Static269.method2118());
			Static75.aBoolean88 = true;
		}
		if (Static285.aBoolean351) {
			Static285.aBoolean351 = false;
		} else {
			Static168.aFloat100 /= 2.0F;
		}
		if (Static35.aBoolean269) {
			Static35.aBoolean269 = false;
		} else {
			Static85.aFloat56 /= 2.0F;
		}
		Static52.method4715();
		if (Static37.anInt773 != 30) {
			return;
		}
		Static272.method4764();
		Static141.method2440();
		Static37.method685();
		Static92.anInt5532++;
		if (Static92.anInt5532 > 750) {
			Static105.method1211();
			return;
		}
		Static279.method4319();
		Static102.method1860();
		Static60.method1103();
		for (local31 = Static93.method1707(true); local31 != -1; local31 = Static93.method1707(false)) {
			Static229.method3546(local31);
			Static106.anIntArray179[Static197.anInt3803++ & 0x1F] = local31;
		}
		@Pc(748) int local748;
		for (@Pc(692) Class1_Sub2_Sub11 local692 = Static213.method3843(); local692 != null; local692 = Static213.method3843()) {
			local89 = local692.method2872();
			local98 = local692.method2868();
			if (local89 == 1) {
				Static168.anIntArray281[local98] = local692.anInt3315;
				Static288.anIntArray458[Static224.anInt4117++ & 0x1F] = local98;
			} else if (local89 == 2) {
				Static84.aStringArray12[local98] = local692.aString190;
				Static182.anIntArray294[Static203.anInt3903++ & 0x1F] = local98;
			} else {
				@Pc(742) Class66 local742;
				if (local89 == 3) {
					local742 = Static53.method968(local98);
					if (!local692.aString190.equals(local742.aString122)) {
						local742.aString122 = local692.aString190;
						Static103.method1865(local742);
					}
				} else if (local89 == 4) {
					local742 = Static53.method968(local98);
					local120 = local692.anInt3315;
					local748 = local692.anInt3320;
					local193 = local692.anInt3323;
					if (local742.anInt2198 != local120 || local748 != local742.anInt2130 || local742.anInt2189 != local193) {
						local742.anInt2189 = local193;
						local742.anInt2198 = local120;
						local742.anInt2130 = local748;
						Static103.method1865(local742);
					}
				} else if (local89 == 5) {
					local742 = Static53.method968(local98);
					if (local742.anInt2134 != local692.anInt3315 || local692.anInt3315 == -1) {
						local742.anInt2134 = local692.anInt3315;
						local742.anInt2182 = 1;
						local742.anInt2149 = 0;
						local742.anInt2131 = 0;
						Static103.method1865(local742);
					}
				} else if (local89 == 6) {
					local115 = local692.anInt3315;
					local193 = local115 & 0x1F;
					local120 = local115 >> 10 & 0x1F;
					local748 = local115 >> 5 & 0x1F;
					local199 = (local748 << 11) + (local120 << 19) + (local193 << 3);
					@Pc(1176) Class66 local1176 = Static53.method968(local98);
					if (local1176.anInt2145 != local199) {
						local1176.anInt2145 = local199;
						Static103.method1865(local1176);
					}
				} else if (local89 == 7) {
					local742 = Static53.method968(local98);
					@Pc(1128) boolean local1128 = local692.anInt3315 == 1;
					if (local742.aBoolean129 != local1128) {
						local742.aBoolean129 = local1128;
						Static103.method1865(local742);
					}
				} else if (local89 == 8) {
					local742 = Static53.method968(local98);
					if (local742.anInt2136 != local692.anInt3315 || local742.anInt2156 != local692.anInt3320 || local742.anInt2181 != local692.anInt3323) {
						local742.anInt2181 = local692.anInt3323;
						local742.anInt2136 = local692.anInt3315;
						if (local742.anInt2220 != -1) {
							if (local742.anInt2203 > 0) {
								local742.anInt2181 = local742.anInt2181 * 32 / local742.anInt2203;
							} else if (local742.anInt2169 > 0) {
								local742.anInt2181 = local742.anInt2181 * 32 / local742.anInt2169;
							}
						}
						local742.anInt2156 = local692.anInt3320;
						Static103.method1865(local742);
					}
				} else if (local89 == 9) {
					local742 = Static53.method968(local98);
					if (local742.anInt2220 != local692.anInt3315 || local742.anInt2151 != local692.anInt3320) {
						local742.anInt2220 = local692.anInt3315;
						local742.anInt2151 = local692.anInt3320;
						Static103.method1865(local742);
					}
				} else if (local89 == 10) {
					local742 = Static53.method968(local98);
					if (local742.anInt2133 != local692.anInt3315 || local742.anInt2163 != local692.anInt3320 || local742.anInt2167 != local692.anInt3323) {
						local742.anInt2167 = local692.anInt3323;
						local742.anInt2163 = local692.anInt3320;
						local742.anInt2133 = local692.anInt3315;
						Static103.method1865(local742);
					}
				} else if (local89 == 11) {
					local742 = Static53.method968(local98);
					local742.aByte12 = 0;
					local742.anInt2174 = local742.anInt2148 = local692.anInt3320;
					local742.anInt2135 = local742.anInt2192 = local692.anInt3315;
					local742.aByte9 = 0;
					Static103.method1865(local742);
				} else if (local89 == 12) {
					local742 = Static53.method968(local98);
					local120 = local692.anInt3315;
					if (local742 != null && local742.anInt2176 == 0) {
						if (local120 > local742.anInt2215 - local742.anInt2207) {
							local120 = local742.anInt2215 - local742.anInt2207;
						}
						if (local120 < 0) {
							local120 = 0;
						}
						if (local742.anInt2216 != local120) {
							local742.anInt2216 = local120;
							Static103.method1865(local742);
						}
					}
				} else if (local89 == 13) {
					local742 = Static53.method968(local98);
					local742.anInt2183 = local692.anInt3315;
				}
			}
		}
		if (Static205.anInt3910 != 0) {
			Static262.anInt4774 += 20;
			if (Static262.anInt4774 >= 400) {
				Static205.anInt3910 = 0;
			}
		}
		Static81.anInt1635++;
		if (Static281.aClass66_45 != null) {
			Static250.anInt4518++;
			if (Static250.anInt4518 >= 15) {
				Static103.method1865(Static281.aClass66_45);
				Static281.aClass66_45 = null;
			}
		}
		@Pc(1325) Class66 local1325;
		if (Static168.aClass66_28 != null) {
			Static103.method1865(Static168.aClass66_28);
			if (Static247.anInt4467 > Static244.anInt4432 + 5 || Static244.anInt4432 - 5 > Static247.anInt4467 || Static222.anInt4105 > Static229.anInt4206 + 5 || Static222.anInt4105 < Static229.anInt4206 - 5) {
				Static55.aBoolean58 = true;
			}
			Static258.anInt4702++;
			if (Static281.anInt5089 == 0) {
				if (Static55.aBoolean58 && Static258.anInt4702 >= 5) {
					if (Static168.aClass66_28 == Static82.aClass66_18 && Static51.anInt1013 != Static33.anInt579) {
						local1325 = Static168.aClass66_28;
						@Pc(1327) byte local1327 = 0;
						if (Static199.anInt3822 == 1 && local1325.anInt2210 == 206) {
							local1327 = 1;
						}
						if (local1325.anIntArray192[Static51.anInt1013] <= 0) {
							local1327 = 0;
						}
						if (Static37.method679(local1325).method3061()) {
							local120 = Static51.anInt1013;
							local115 = Static33.anInt579;
							local1325.anIntArray192[local120] = local1325.anIntArray192[local115];
							local1325.anIntArray195[local120] = local1325.anIntArray195[local115];
							local1325.anIntArray192[local115] = -1;
							local1325.anIntArray195[local115] = 0;
						} else if (local1327 == 1) {
							local115 = Static33.anInt579;
							local120 = Static51.anInt1013;
							while (local115 != local120) {
								if (local115 > local120) {
									local1325.method1923(local115, local115 - 1);
									local115--;
								} else if (local115 < local120) {
									local1325.method1923(local115, local115 + 1);
									local115++;
								}
							}
						} else {
							local1325.method1923(Static33.anInt579, Static51.anInt1013);
						}
						Static127.aClass1_Sub14_Sub1_3.method1408(74);
						Static127.aClass1_Sub14_Sub1_3.method1384(Static33.anInt579);
						Static127.aClass1_Sub14_Sub1_3.method1390(local1327);
						Static127.aClass1_Sub14_Sub1_3.method1376(Static168.aClass66_28.anInt2157);
						Static127.aClass1_Sub14_Sub1_3.method1384(Static51.anInt1013);
					}
				} else if ((Static287.anInt5144 == 1 || Static214.method3358(Static110.anInt2281 - 1)) && Static110.anInt2281 > 2) {
					Static301.method4557();
				} else if (Static110.anInt2281 > 0) {
					Static258.method4086();
				}
				Static250.anInt4518 = 10;
				Static168.aClass66_28 = null;
				Static83.anInt1652 = 0;
			}
		}
		Static227.aClass66_35 = null;
		Static112.anInt2331 = 0;
		Static232.aBoolean291 = false;
		Static221.aBoolean283 = false;
		local1325 = Static7.aClass66_6;
		@Pc(1498) Class66 local1498 = aClass66_31;
		Static7.aClass66_6 = null;
		aClass66_31 = null;
		while (Static123.method2169() && Static112.anInt2331 < 128) {
			Static162.anIntArray274[Static112.anInt2331] = Static142.anInt2853;
			Static152.anIntArray43[Static112.anInt2331] = Static117.aChar3;
			Static112.anInt2331++;
		}
		Static74.aClass66_16 = null;
		if (Static270.anInt4897 != -1) {
			Static162.method2785(Static270.anInt4897, 0, Static292.anInt5236, 0, Static120.anInt2505, 0, 0);
		}
		Static86.anInt1698++;
		if (Static74.aClass66_16 != null) {
			Static287.method4402();
		}
		while (true) {
			@Pc(1577) Class66 local1577;
			@Pc(1565) Class66 local1565;
			@Pc(1557) Class1_Sub10 local1557;
			do {
				local1557 = (Class1_Sub10) Static257.aClass59_35.method1700();
				if (local1557 == null) {
					while (true) {
						do {
							local1557 = (Class1_Sub10) Static173.aClass59_27.method1700();
							if (local1557 == null) {
								while (true) {
									do {
										local1557 = (Class1_Sub10) Static13.aClass59_8.method1700();
										if (local1557 == null) {
											if (Static74.aClass66_16 == null) {
												Static303.anInt5384 = 0;
											}
											if (Static5.aClass66_1 != null) {
												Static235.method4488();
											}
											if (Static137.anInt2751 > 0 && Static32.aBooleanArray9[82] && Static32.aBooleanArray9[81] && Static20.anInt382 != 0) {
												local115 = Static65.anInt1300 - Static20.anInt382;
												if (local115 < 0) {
													local115 = 0;
												} else if (local115 > 3) {
													local115 = 3;
												}
												Static255.method4050(local115, Static192.anInt3637 + Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] + Static199.anInt3817);
											}
											if (Static137.anInt2751 > 0 && Static32.aBooleanArray9[82] && Static32.aBooleanArray9[81]) {
												if (Static66.anInt4309 != -1) {
													Static255.method4050(Static65.anInt1300, Static183.anInt3499 + Static192.anInt3637, Static66.anInt4309 + Static199.anInt3817);
												}
												Static200.anInt3852 = 0;
												Static134.anInt5660 = 0;
											} else if (Static134.anInt5660 == 2) {
												if (Static66.anInt4309 != -1) {
													Static127.aClass1_Sub14_Sub1_3.method1408(235);
													Static127.aClass1_Sub14_Sub1_3.method1384(Static183.anInt3499 + Static192.anInt3637);
													Static127.aClass1_Sub14_Sub1_3.method1338(Static199.anInt3817 + Static66.anInt4309);
													Static127.aClass1_Sub14_Sub1_3.method1341(Static312.anInt5732);
													Static127.aClass1_Sub14_Sub1_3.method1387(Static104.anInt2090);
													Static303.anInt5390 = Static238.anInt4321;
													Static262.anInt4774 = 0;
													Static205.anInt3910 = 1;
													Static92.anInt5525 = Static282.anInt5092;
												}
												Static134.anInt5660 = 0;
											} else if (Static200.anInt3852 == 2) {
												if (Static66.anInt4309 != -1) {
													Static127.aClass1_Sub14_Sub1_3.method1408(212);
													Static127.aClass1_Sub14_Sub1_3.method1338(Static66.anInt4309 + Static199.anInt3817);
													Static127.aClass1_Sub14_Sub1_3.method1384(Static192.anInt3637 + Static183.anInt3499);
													Static92.anInt5525 = Static282.anInt5092;
													Static262.anInt4774 = 0;
													Static303.anInt5390 = Static238.anInt4321;
													Static205.anInt3910 = 1;
												}
												Static200.anInt3852 = 0;
											} else if (Static66.anInt4309 != -1 && Static134.anInt5660 == 0 && Static200.anInt3852 == 0) {
												local115 = (Static66.anInt4309 << 1) + 1 - Static90.aClass15_Sub5_Sub2_2.method4702() >> 1;
												local120 = (Static183.anInt3499 << 1) + 1 - Static90.aClass15_Sub5_Sub2_2.method4702() >> 1;
												Static182.method2995(local115, 0, local120);
												Static262.anInt4774 = 0;
												Static303.anInt5390 = Static238.anInt4321;
												Static92.anInt5525 = Static282.anInt5092;
												Static205.anInt3910 = 1;
												Static45.method886(local120, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, local115, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, 0, 0);
											}
											Static66.anInt4309 = -1;
											Static169.method2869();
											if (Static7.aClass66_6 != local1325) {
												if (local1325 != null) {
													Static103.method1865(local1325);
												}
												if (Static7.aClass66_6 != null) {
													Static103.method1865(Static7.aClass66_6);
												}
											}
											if (local1498 != aClass66_31 && Static192.anInt3646 == Static206.anInt3932) {
												if (local1498 != null) {
													Static103.method1865(local1498);
												}
												if (aClass66_31 != null) {
													Static103.method1865(aClass66_31);
												}
											}
											if (aClass66_31 == null) {
												if (Static192.anInt3646 > 0) {
													Static192.anInt3646--;
												}
											} else if (Static206.anInt3932 > Static192.anInt3646) {
												Static192.anInt3646++;
												if (Static192.anInt3646 == Static206.anInt3932) {
													Static103.method1865(aClass66_31);
												}
											}
											for (local115 = 0; local115 < 5; local115++) {
												@Pc(2039) int local2039 = Static244.anIntArray388[local115]++;
											}
											local115 = Static209.method3328();
											local120 = Static155.method2650();
											if (local115 > 15000 && local120 > 15000) {
												Static57.anInt1090 = 250;
												Static180.method2984(14500);
												Static127.aClass1_Sub14_Sub1_3.method1408(103);
											}
											if (Static107.aClass185_2 != null && Static107.aClass185_2.anInt5276 == 1) {
												if (Static107.aClass185_2.anObject6 != null) {
													Static56.method983(Static88.aString107, Static200.aBoolean260);
												}
												Static88.aString107 = null;
												Static200.aBoolean260 = false;
												Static107.aClass185_2 = null;
											}
											Static225.anInt4138++;
											Static196.anInt3702++;
											Static132.anInt3686++;
											if (Static196.anInt3702 > 500) {
												Static196.anInt3702 = 0;
												local748 = (int) (Math.random() * 8.0D);
												if ((local748 & 0x2) == 2) {
													Static95.anInt1922 += Static1.anInt10;
												}
												if ((local748 & 0x4) == 4) {
													Static23.anInt403 += Static226.anInt4161;
												}
												if ((local748 & 0x1) == 1) {
													Static94.anInt3442 += Static41.anInt846;
												}
											}
											if (Static95.anInt1922 < -55) {
												Static1.anInt10 = 2;
											}
											if (Static23.anInt403 < -40) {
												Static226.anInt4161 = 1;
											}
											if (Static94.anInt3442 < -50) {
												Static41.anInt846 = 2;
											}
											if (Static94.anInt3442 > 50) {
												Static41.anInt846 = -2;
											}
											if (Static95.anInt1922 > 55) {
												Static1.anInt10 = -2;
											}
											if (Static23.anInt403 > 40) {
												Static226.anInt4161 = -1;
											}
											if (Static225.anInt4138 > 500) {
												Static225.anInt4138 = 0;
												local748 = (int) (Math.random() * 8.0D);
												if ((local748 & 0x1) == 1) {
													Static189.anInt3613 += Static189.anInt3609;
												}
												if ((local748 & 0x2) == 2) {
													Static309.anInt5618 += Static91.anInt1784;
												}
											}
											if (Static309.anInt5618 < -20) {
												Static91.anInt1784 = 1;
											}
											if (Static189.anInt3613 < -60) {
												Static189.anInt3609 = 2;
											}
											if (Static309.anInt5618 > 10) {
												Static91.anInt1784 = -1;
											}
											if (Static189.anInt3613 > 60) {
												Static189.anInt3609 = -2;
											}
											if (Static132.anInt3686 > 50) {
												Static127.aClass1_Sub14_Sub1_3.method1408(206);
											}
											if (Static301.aBoolean361) {
												Static245.method3873();
												Static301.aBoolean361 = false;
											}
											try {
												if (Static5.aClass97_1 != null && Static127.aClass1_Sub14_Sub1_3.anInt1480 > 0) {
													Static5.aClass97_1.method2552(Static127.aClass1_Sub14_Sub1_3.anInt1480, Static127.aClass1_Sub14_Sub1_3.aByteArray17);
													Static132.anInt3686 = 0;
													Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
												}
											} catch (@Pc(2291) IOException local2291) {
												Static105.method1211();
											}
											return;
										}
										local1565 = local1557.aClass66_10;
										if (local1565.anInt2178 < 0) {
											break;
										}
										local1577 = Static53.method968(local1565.anInt2221);
									} while (local1577 == null || local1577.aClass66Array3 == null || local1577.aClass66Array3.length <= local1565.anInt2178 || local1577.aClass66Array3[local1565.anInt2178] != local1565);
									Static194.method3152(local1557);
								}
							}
							local1565 = local1557.aClass66_10;
							if (local1565.anInt2178 < 0) {
								break;
							}
							local1577 = Static53.method968(local1565.anInt2221);
						} while (local1577 == null || local1577.aClass66Array3 == null || local1565.anInt2178 >= local1577.aClass66Array3.length || local1577.aClass66Array3[local1565.anInt2178] != local1565);
						Static194.method3152(local1557);
					}
				}
				local1565 = local1557.aClass66_10;
				if (local1565.anInt2178 < 0) {
					break;
				}
				local1577 = Static53.method968(local1565.anInt2221);
			} while (local1577 == null || local1577.aClass66Array3 == null || local1577.aClass66Array3.length <= local1565.anInt2178 || local1565 != local1577.aClass66Array3[local1565.anInt2178]);
			Static194.method3152(local1557);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
	public static void method3081() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glDisableClientState(32886);
		Static156.method2675(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static156.method2656();
		for (@Pc(19) int local19 = 0; local19 < Static297.aClass1_Sub31ArrayArray3[0].length; local19++) {
			@Pc(31) Class1_Sub31 local31 = Static297.aClass1_Sub31ArrayArray3[0][local19];
			if (local31.anInt5411 >= 0 && Static245.method3877(Static215.anInterface5_1.method791(local31.anInt5411))) {
				local1.glColor4fv(Static286.method4395(local31.anInt5410), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean365 ? 1.0F : 0.5F);
				local31.method4606(Static105.aClass1_Sub33ArrayArrayArray2, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static156.method2672();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static156.method2676();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIZIZIII)V")
	public static void method3082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(7) int local7;
		@Pc(14) int local14;
		for (local7 = 0; local7 < 104; local7++) {
			for (local14 = 0; local14 < 104; local14++) {
				Static57.anIntArrayArray8[local7][local14] = 0;
				Static123.anIntArrayArray18[local7][local14] = 99999999;
			}
		}
		Static57.anIntArrayArray8[arg4][arg5] = 99;
		Static123.anIntArrayArray18[arg4][arg5] = 0;
		local7 = arg4;
		@Pc(51) byte local51 = 0;
		Static296.anIntArray469[0] = arg4;
		@Pc(58) int local58 = local51 + 1;
		Static293.anIntArray466[0] = arg5;
		local14 = arg5;
		@Pc(64) boolean local64 = false;
		@Pc(66) int local66 = 0;
		@Pc(71) int[][] local71 = Static240.aClass118Array1[Static65.anInt1300].anIntArrayArray28;
		@Pc(183) int local183;
		while (local58 != local66) {
			local14 = Static293.anIntArray466[local66];
			local7 = Static296.anIntArray469[local66];
			local66 = local66 + 1 & 0xFFF;
			if (local7 == arg0 && arg7 == local14) {
				local64 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static240.aClass118Array1[Static65.anInt1300].method3043(2, arg7, local7, arg6 - 1, arg3, local14, arg0)) {
					local64 = true;
					break;
				}
				if (arg6 < 10 && Static240.aClass118Array1[Static65.anInt1300].method3039(arg6 - 1, arg3, arg7, local14, 2, local7, arg0)) {
					local64 = true;
					break;
				}
			}
			if (arg2 != 0 && arg1 != 0 && Static240.aClass118Array1[Static65.anInt1300].method3034(arg8, arg7, local7, arg2, local14, arg1, arg0, 2)) {
				local64 = true;
				break;
			}
			local183 = Static123.anIntArrayArray18[local7][local14] + 1;
			if (local7 > 0 && Static57.anIntArrayArray8[local7 - 1][local14] == 0 && (local71[local7 - 1][local14] & 0x2C010E) == 0 && (local71[local7 - 1][local14 + 1] & 0x2C0138) == 0) {
				Static296.anIntArray469[local58] = local7 - 1;
				Static293.anIntArray466[local58] = local14;
				local58 = local58 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7 - 1][local14] = 2;
				Static123.anIntArrayArray18[local7 - 1][local14] = local183;
			}
			if (local7 < 102 && Static57.anIntArrayArray8[local7 + 1][local14] == 0 && (local71[local7 + 2][local14] & 0x2C0183) == 0 && (local71[local7 + 2][local14 + 1] & 0x2C01E0) == 0) {
				Static296.anIntArray469[local58] = local7 + 1;
				Static293.anIntArray466[local58] = local14;
				Static57.anIntArrayArray8[local7 + 1][local14] = 8;
				local58 = local58 + 1 & 0xFFF;
				Static123.anIntArrayArray18[local7 + 1][local14] = local183;
			}
			if (local14 > 0 && Static57.anIntArrayArray8[local7][local14 - 1] == 0 && (local71[local7][local14 - 1] & 0x2C010E) == 0 && (local71[local7 + 1][local14 - 1] & 0x2C0183) == 0) {
				Static296.anIntArray469[local58] = local7;
				Static293.anIntArray466[local58] = local14 - 1;
				Static57.anIntArrayArray8[local7][local14 - 1] = 1;
				local58 = local58 + 1 & 0xFFF;
				Static123.anIntArrayArray18[local7][local14 - 1] = local183;
			}
			if (local14 < 102 && Static57.anIntArrayArray8[local7][local14 + 1] == 0 && (local71[local7][local14 + 2] & 0x2C0138) == 0 && (local71[local7 + 1][local14 + 2] & 0x2C01E0) == 0) {
				Static296.anIntArray469[local58] = local7;
				Static293.anIntArray466[local58] = local14 + 1;
				local58 = local58 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7][local14 + 1] = 4;
				Static123.anIntArrayArray18[local7][local14 + 1] = local183;
			}
			if (local7 > 0 && local14 > 0 && Static57.anIntArrayArray8[local7 - 1][local14 - 1] == 0 && (local71[local7 - 1][local14] & 0x2C013E) == 0 && (local71[local7 - 1][local14 - 1] & 0x2C010E) == 0 && (local71[local7][local14 - 1] & 0x2C018F) == 0) {
				Static296.anIntArray469[local58] = local7 - 1;
				Static293.anIntArray466[local58] = local14 - 1;
				local58 = local58 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7 - 1][local14 - 1] = 3;
				Static123.anIntArrayArray18[local7 - 1][local14 - 1] = local183;
			}
			if (local7 < 102 && local14 > 0 && Static57.anIntArrayArray8[local7 + 1][local14 - 1] == 0 && (local71[local7 + 1][local14 - 1] & 0x2C018F) == 0 && (local71[local7 + 2][local14 - 1] & 0x2C0183) == 0 && (local71[local7 + 2][local14] & 0x2C01E3) == 0) {
				Static296.anIntArray469[local58] = local7 + 1;
				Static293.anIntArray466[local58] = local14 - 1;
				local58 = local58 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7 + 1][local14 - 1] = 9;
				Static123.anIntArrayArray18[local7 + 1][local14 - 1] = local183;
			}
			if (local7 > 0 && local14 < 102 && Static57.anIntArrayArray8[local7 - 1][local14 + 1] == 0 && (local71[local7 - 1][local14 + 1] & 0x2C013E) == 0 && (local71[local7 - 1][local14 + 2] & 0x2C0138) == 0 && (local71[local7][local14 + 2] & 0x2C01F8) == 0) {
				Static296.anIntArray469[local58] = local7 - 1;
				Static293.anIntArray466[local58] = local14 + 1;
				Static57.anIntArrayArray8[local7 - 1][local14 + 1] = 6;
				Static123.anIntArrayArray18[local7 - 1][local14 + 1] = local183;
				local58 = local58 + 1 & 0xFFF;
			}
			if (local7 < 102 && local14 < 102 && Static57.anIntArrayArray8[local7 + 1][local14 + 1] == 0 && (local71[local7 + 1][local14 + 2] & 0x2C01F8) == 0 && (local71[local7 + 2][local14 + 2] & 0x2C01E0) == 0 && (local71[local7 + 2][local14 + 1] & 0x2C01E3) == 0) {
				Static296.anIntArray469[local58] = local7 + 1;
				Static293.anIntArray466[local58] = local14 + 1;
				local58 = local58 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7 + 1][local14 + 1] = 12;
				Static123.anIntArrayArray18[local7 + 1][local14 + 1] = local183;
			}
		}
		if (!local64) {
			@Pc(887) int local887 = 100;
			local183 = 1000;
			for (@Pc(896) int local896 = arg0 - 10; local896 <= arg0 + 10; local896++) {
				for (@Pc(905) int local905 = arg7 - 10; local905 <= arg7 + 10; local905++) {
					if (local896 >= 0 && local905 >= 0 && local896 < 104 && local905 < 104 && Static123.anIntArrayArray18[local896][local905] < 100) {
						@Pc(935) int local935 = 0;
						@Pc(937) int local937 = 0;
						if (local905 < arg7) {
							local935 = arg7 - local905;
						} else if (local905 > arg1 + arg7 - 1) {
							local935 = local905 + 1 - arg1 - arg7;
						}
						if (local896 < arg0) {
							local937 = arg0 - local896;
						} else if (arg0 + arg2 - 1 < local896) {
							local937 = local896 + 1 - arg0 - arg2;
						}
						@Pc(999) int local999 = local935 * local935 + local937 * local937;
						if (local999 < local183 || local183 == local999 && Static123.anIntArrayArray18[local896][local905] < local887) {
							local887 = Static123.anIntArrayArray18[local896][local905];
							local14 = local905;
							local183 = local999;
							local7 = local896;
						}
					}
				}
			}
			if (local183 == 1000) {
				return;
			}
			if (arg4 == local7 && local14 == arg5) {
				return;
			}
		}
		Static196.anInt3703 = local14;
		Static52.aBoolean381 = false;
		Static162.anInt3171 = local7;
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V")
	public static void method3083() {
		Static13.aClass1_Sub14_Sub1_1.method1405();
		@Pc(13) int local13 = Static13.aClass1_Sub14_Sub1_1.method1411(8);
		if (local13 < Static85.anInt1689) {
			for (@Pc(19) int local19 = local13; local19 < Static85.anInt1689; local19++) {
				Static206.anIntArray315[Static256.anInt4632++] = Static104.anIntArray178[local19];
			}
		}
		if (Static85.anInt1689 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static85.anInt1689 = 0;
		for (@Pc(63) int local63 = 0; local63 < local13; local63++) {
			@Pc(70) int local70 = Static104.anIntArray178[local63];
			@Pc(74) Class15_Sub5_Sub1 local74 = Static83.aClass15_Sub5_Sub1Array1[local70];
			@Pc(79) int local79 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
			if (local79 == 0) {
				Static104.anIntArray178[Static85.anInt1689++] = local70;
				local74.anInt5563 = Static313.anInt2966;
			} else {
				@Pc(100) int local100 = Static13.aClass1_Sub14_Sub1_1.method1411(2);
				if (local100 == 0) {
					Static104.anIntArray178[Static85.anInt1689++] = local70;
					local74.anInt5563 = Static313.anInt2966;
					Static263.anIntArray425[Static224.anInt4118++] = local70;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local100 == 1) {
						Static104.anIntArray178[Static85.anInt1689++] = local70;
						local74.anInt5563 = Static313.anInt2966;
						local145 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
						local74.method4689(local145, 1);
						local155 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
						if (local155 == 1) {
							Static263.anIntArray425[Static224.anInt4118++] = local70;
						}
					} else if (local100 == 2) {
						Static104.anIntArray178[Static85.anInt1689++] = local70;
						local74.anInt5563 = Static313.anInt2966;
						if (Static13.aClass1_Sub14_Sub1_1.method1411(1) == 1) {
							local145 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
							local74.method4689(local145, 2);
							local155 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
							local74.method4689(local155, 2);
						} else {
							local145 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
							local74.method4689(local145, 0);
						}
						local145 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
						if (local145 == 1) {
							Static263.anIntArray425[Static224.anInt4118++] = local70;
						}
					} else if (local100 == 3) {
						Static206.anIntArray315[Static256.anInt4632++] = local70;
					}
				}
			}
		}
	}
}
