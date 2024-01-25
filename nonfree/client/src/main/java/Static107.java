import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!di", name = "u", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "Lclient!el;")
	public static final Class109 aClass109_43 = new Class109(83, 6);

	@OriginalMember(owner = "client!di", name = "z", descriptor = "I")
	public static int anInt1746 = 0;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(Z)V")
	public static void method1555() {
		if (Static142.anInt2314 > 1) {
			Static142.anInt2314--;
			Static45.anInt10277 = Static261.anInt4525;
		}
		if (Static246.aBoolean334) {
			Static246.aBoolean334 = false;
			Static579.method8316();
			return;
		}
		if (!Static526.aBoolean669) {
			Static397.method5811();
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static317.method4807(); local32++) {
		}
		if (anInt1746 != 10) {
			return;
		}
		@Pc(61) Class5_Sub50 local61;
		@Pc(70) int local70;
		while (Static62.method870()) {
			local61 = Static457.method6722(Static206.aClass387_39, Static80.aClass313_1);
			local61.aClass5_Sub23_Sub2_2.method8502(0);
			local70 = local61.aClass5_Sub23_Sub2_2.anInt9869;
			Static262.method7571(local61.aClass5_Sub23_Sub2_2);
			local61.aClass5_Sub23_Sub2_2.method8541(local61.aClass5_Sub23_Sub2_2.anInt9869 - local70);
			Static494.method7120(local61);
		}
		if (Static347.aClass5_Sub7_3 == null) {
			if (Static662.aLong309 <= Static515.method7499(71)) {
				Static347.aClass5_Sub7_3 = Static303.aClass254_1.method5900(Static197.aClass54_35.aString15);
			}
		} else if (Static347.aClass5_Sub7_3.anInt969 != -1) {
			local61 = Static457.method6722(Static557.aClass387_104, Static80.aClass313_1);
			local61.aClass5_Sub23_Sub2_2.method8480(Static347.aClass5_Sub7_3.anInt969);
			Static494.method7120(local61);
			Static347.aClass5_Sub7_3 = null;
			Static662.aLong309 = Static515.method7499(76) + 30000L;
		}
		@Pc(147) Class5_Sub6 local147 = (Class5_Sub6) Static536.aClass102_65.method1916();
		@Pc(162) int local162;
		@Pc(185) int local185;
		@Pc(204) int local204;
		@Pc(260) int local260;
		@Pc(267) int local267;
		@Pc(278) int local278;
		@Pc(160) Class5_Sub50 local160;
		if (local147 != null || Static515.method7499(92) - 2000L > Static329.aLong182) {
			local160 = null;
			local162 = 0;
			for (@Pc(167) Class5_Sub6 local167 = (Class5_Sub6) Static135.aClass102_16.method1916(); local167 != null && (local160 == null || local160.aClass5_Sub23_Sub2_2.anInt9869 - local162 < 240); local167 = (Class5_Sub6) Static135.aClass102_16.method1915()) {
				local167.method9327(1);
				local185 = local167.method5804();
				if (local185 < -1) {
					local185 = -1;
				} else if (local185 > 65534) {
					local185 = 65534;
				}
				local204 = local167.method5803();
				if (local204 < -1) {
					local204 = -1;
				} else if (local204 > 65534) {
					local204 = 65534;
				}
				if (Static223.anInt3642 != local204 || local185 != Static630.anInt10252) {
					if (local160 == null) {
						local160 = Static457.method6722(Static478.aClass387_87, Static80.aClass313_1);
						local160.aClass5_Sub23_Sub2_2.method8502(0);
						local162 = local160.aClass5_Sub23_Sub2_2.anInt9869;
					}
					local260 = local204 - Static223.anInt3642;
					Static223.anInt3642 = local204;
					local267 = local185 - Static630.anInt10252;
					Static630.anInt10252 = local185;
					local278 = (int) ((local167.method5802() - Static329.aLong182) / 20L);
					if (local278 < 8 && local260 >= -32 && local260 <= 31 && local267 >= -32 && local267 <= 31) {
						local267 += 32;
						local260 += 32;
						local160.aClass5_Sub23_Sub2_2.method8480((local278 << 12) + (local260 << 6) + local267);
					} else if (local278 < 32 && local260 >= -128 && local260 <= 127 && local267 >= -128 && local267 <= 127) {
						local260 += 128;
						local160.aClass5_Sub23_Sub2_2.method8502(local278 + 128);
						local267 += 128;
						local160.aClass5_Sub23_Sub2_2.method8480(local267 + (local260 << 8));
					} else if (local278 >= 32) {
						local160.aClass5_Sub23_Sub2_2.method8480(local278 + 57344);
						if (local204 == 1 || local185 == -1) {
							local160.aClass5_Sub23_Sub2_2.method8486(Integer.MIN_VALUE);
						} else {
							local160.aClass5_Sub23_Sub2_2.method8486(local204 | local185 << 16);
						}
					} else {
						local160.aClass5_Sub23_Sub2_2.method8502(local278 + 192);
						if (local204 == 1 || local185 == -1) {
							local160.aClass5_Sub23_Sub2_2.method8486(Integer.MIN_VALUE);
						} else {
							local160.aClass5_Sub23_Sub2_2.method8486(local185 << 16 | local204);
						}
					}
					Static329.aLong182 = local167.method5802();
				}
			}
			if (local160 != null) {
				local160.aClass5_Sub23_Sub2_2.method8541(local160.aClass5_Sub23_Sub2_2.anInt9869 - local162);
				Static494.method7120(local160);
			}
		}
		@Pc(520) int local520;
		if (local147 != null) {
			@Pc(506) long local506 = (local147.method5802() - Static12.aLong6) / 50L;
			if (local506 > 32767L) {
				local506 = 32767L;
			}
			Static12.aLong6 = local147.method5802();
			local520 = local147.method5804();
			if (local520 < 0) {
				local520 = 0;
			} else if (local520 > 65535) {
				local520 = 65535;
			}
			local185 = local147.method5803();
			if (local185 < 0) {
				local185 = 0;
			} else if (local185 > 65535) {
				local185 = 65535;
			}
			@Pc(557) byte local557 = 0;
			if (local147.method5806() == 2) {
				local557 = 1;
			}
			local260 = (int) local506;
			@Pc(578) Class5_Sub50 local578 = Static457.method6722(Static455.aClass387_82, Static80.aClass313_1);
			local578.aClass5_Sub23_Sub2_2.method8492(local557 << 15 | local260);
			local578.aClass5_Sub23_Sub2_2.method8490(local520 << 16 | local185);
			Static494.method7120(local578);
		}
		@Pc(634) long local634;
		if (Static357.anInt6272 > 0) {
			local160 = Static457.method6722(Static114.aClass387_26, Static80.aClass313_1);
			local160.aClass5_Sub23_Sub2_2.method8502(Static357.anInt6272 * 3);
			for (local162 = 0; local162 < Static357.anInt6272; local162++) {
				@Pc(625) Interface12 local625 = Static475.anInterface12Array1[local162];
				local634 = (local625.method6717() - Static254.aLong132) / 50L;
				Static254.aLong132 = local625.method6717();
				if (local634 > 65535L) {
					local634 = 65535L;
				}
				local160.aClass5_Sub23_Sub2_2.method8502(local625.method6718());
				local160.aClass5_Sub23_Sub2_2.method8480((int) local634);
			}
			Static494.method7120(local160);
		}
		if (Static492.anInt8226 > 0) {
			Static492.anInt8226--;
		}
		if (Static258.aBoolean347 && Static492.anInt8226 <= 0) {
			Static492.anInt8226 = 20;
			Static258.aBoolean347 = false;
			local160 = Static457.method6722(Static267.aClass387_53, Static80.aClass313_1);
			local160.aClass5_Sub23_Sub2_2.method8520((int) Static429.aFloat132 >> 3);
			local160.aClass5_Sub23_Sub2_2.method8514((int) Static138.aFloat18 >> 3);
			Static494.method7120(local160);
		}
		if (Static429.aBoolean567 != Static232.aBoolean302) {
			Static232.aBoolean302 = Static429.aBoolean567;
			local160 = Static457.method6722(Static12.aClass387_5, Static80.aClass313_1);
			local160.aClass5_Sub23_Sub2_2.method8502(Static429.aBoolean567 ? 1 : 0);
			Static494.method7120(local160);
		}
		if (!Static261.aBoolean355) {
			local160 = Static457.method6722(Static434.aClass387_78, Static80.aClass313_1);
			local160.aClass5_Sub23_Sub2_2.method8502(0);
			local162 = local160.aClass5_Sub23_Sub2_2.anInt9869;
			@Pc(777) Class5_Sub23 local777 = Static637.aClass5_Sub20_31.method3197();
			local160.aClass5_Sub23_Sub2_2.method8528(local777.anInt9869, 0, local777.aByteArray102);
			local160.aClass5_Sub23_Sub2_2.method8541(local160.aClass5_Sub23_Sub2_2.anInt9869 - local162);
			Static494.method7120(local160);
			Static261.aBoolean355 = true;
		}
		if (Static260.aClass174ArrayArrayArray2 != null) {
			if (Static79.anInt1216 == 2) {
				Static324.method8982();
			} else if (Static79.anInt1216 == 3) {
				Static159.method2170();
			}
		}
		if (Static672.aBoolean792) {
			Static672.aBoolean792 = false;
		} else {
			Static10.aFloat3 /= 2.0F;
		}
		if (Static201.aBoolean265) {
			Static201.aBoolean265 = false;
		} else {
			Static149.aFloat23 /= 2.0F;
		}
		Static661.method9152();
		if (anInt1746 != 10) {
			return;
		}
		Static102.method8912();
		Static498.method7156();
		Static642.method8952();
		Static333.anInt5937++;
		if (Static333.anInt5937 > 750) {
			Static579.method8316();
			return;
		}
		Static647.method9027();
		Static218.method3125();
		Static74.method1186();
		for (local70 = Static413.aClass118_1.method2148(true); local70 != -1; local70 = Static413.aClass118_1.method2148(false)) {
			Static314.method4782(local70);
			Static455.anIntArray468[Static649.anInt5975++ & 0x1F] = local70;
		}
		for (@Pc(926) Class5_Sub5_Sub6 local926 = Static259.method3830(); local926 != null; local926 = Static259.method3830()) {
			local520 = local926.method2688();
			local634 = local926.method2689();
			if (local520 == 1) {
				Static21.anIntArray24[(int) local634] = local926.anInt3058;
				Static593.aBoolean754 |= Static433.aBooleanArray17[(int) local634];
				Static83.anIntArray64[Static338.anInt6023++ & 0x1F] = (int) local634;
			} else if (local520 == 2) {
				Static580.aStringArray69[(int) local634] = local926.aString48;
				Static80.anIntArray59[Static598.anInt10029++ & 0x1F] = (int) local634;
			} else {
				@Pc(986) Class73 local986;
				if (local520 == 3) {
					local986 = Static259.method3831((int) local634);
					if (!local926.aString48.equals(local986.aString25)) {
						local986.aString25 = local926.aString48;
						Static298.method4399(local986);
					}
				} else {
					@Pc(1100) int local1100;
					if (local520 == 4) {
						local986 = Static259.method3831((int) local634);
						local267 = local926.anInt3058;
						local278 = local926.anInt3064;
						local1100 = local926.anInt3059;
						if (local986.anInt1374 != local267 || local278 != local986.anInt1352 || local1100 != local986.anInt1353) {
							local986.anInt1352 = local278;
							local986.anInt1374 = local267;
							local986.anInt1353 = local1100;
							Static298.method4399(local986);
						}
					} else if (local520 == 5) {
						local986 = Static259.method3831((int) local634);
						if (local986.anInt1401 != local926.anInt3058 || local926.anInt3058 == -1) {
							local986.anInt1373 = 1;
							local986.anInt1338 = 0;
							local986.anInt1401 = local926.anInt3058;
							local986.anInt1335 = 0;
							@Pc(1062) Class165 local1062 = local986.anInt1401 == -1 ? null : Static158.aClass317_1.method7882(local986.anInt1401, 100);
							if (local1062 != null) {
								Static388.method5661(local986.anInt1335, local1062);
							}
							Static298.method4399(local986);
						}
					} else if (local520 == 6) {
						local260 = local926.anInt3058;
						local267 = local260 >> 10 & 0x1F;
						local278 = local260 >> 5 & 0x1F;
						local1100 = local260 & 0x1F;
						@Pc(1113) int local1113 = (local278 << 11) + ((local267 << 19) + (local1100 << 3));
						@Pc(1118) Class73 local1118 = Static259.method3831((int) local634);
						if (local1118.anInt1382 != local1113) {
							local1118.anInt1382 = local1113;
							Static298.method4399(local1118);
						}
					} else if (local520 == 7) {
						local986 = Static259.method3831((int) local634);
						@Pc(1157) boolean local1157 = local926.anInt3058 == 1;
						if (local986.aBoolean130 != local1157) {
							local986.aBoolean130 = local1157;
							Static298.method4399(local986);
						}
					} else if (local520 == 8) {
						local986 = Static259.method3831((int) local634);
						if (local986.anInt1408 != local926.anInt3058 || local986.anInt1392 != local926.anInt3064 || local926.anInt3059 != local986.anInt1371) {
							local986.anInt1408 = local926.anInt3058;
							local986.anInt1371 = local926.anInt3059;
							local986.anInt1392 = local926.anInt3064;
							if (local986.anInt1419 != -1) {
								if (local986.anInt1389 > 0) {
									local986.anInt1371 = local986.anInt1371 * 32 / local986.anInt1389;
								} else if (local986.anInt1417 > 0) {
									local986.anInt1371 = local986.anInt1371 * 32 / local986.anInt1417;
								}
							}
							Static298.method4399(local986);
						}
					} else if (local520 == 9) {
						local986 = Static259.method3831((int) local634);
						if (local986.anInt1419 != local926.anInt3058 || local926.anInt3064 != local986.anInt1369) {
							local986.anInt1419 = local926.anInt3058;
							local986.anInt1369 = local926.anInt3064;
							Static298.method4399(local986);
						}
					} else if (local520 == 10) {
						local986 = Static259.method3831((int) local634);
						if (local926.anInt3058 != local986.anInt1346 || local926.anInt3064 != local986.anInt1328 || local926.anInt3059 != local986.anInt1344) {
							local986.anInt1346 = local926.anInt3058;
							local986.anInt1344 = local926.anInt3059;
							local986.anInt1328 = local926.anInt3064;
							Static298.method4399(local986);
						}
					} else if (local520 == 11) {
						local986 = Static259.method3831((int) local634);
						local986.aByte24 = 0;
						local986.anInt1375 = local986.anInt1400 = local926.anInt3064;
						local986.anInt1378 = local986.anInt1377 = local926.anInt3058;
						local986.aByte26 = 0;
						Static298.method4399(local986);
					} else if (local520 == 12) {
						local986 = Static259.method3831((int) local634);
						local267 = local926.anInt3058;
						if (local986 != null && local986.anInt1391 == 0) {
							if (local267 > local986.anInt1414 - local986.anInt1394) {
								local267 = local986.anInt1414 - local986.anInt1394;
							}
							if (local267 < 0) {
								local267 = 0;
							}
							if (local267 != local986.anInt1340) {
								local986.anInt1340 = local267;
								Static298.method4399(local986);
							}
						}
					} else if (local520 == 14) {
						local986 = Static259.method3831((int) local634);
						local986.anInt1403 = local926.anInt3058;
					} else if (local520 == 15) {
						Static86.anInt1451 = local926.anInt3058;
						Static437.aBoolean584 = true;
						Static669.anInt10711 = local926.anInt3064;
					} else if (local520 == 16) {
						local986 = Static259.method3831((int) local634);
						local986.anInt1358 = local926.anInt3058;
					} else if (local520 == 17) {
						local986 = Static259.method3831((int) local634);
						local986.anInt1345 = local926.anInt3058;
					} else if (local520 == 18) {
						local986 = Static259.method3831((int) local634);
						local267 = (int) (local634 >> 32);
						local986.method1282((short) local926.anInt3064, local267, (short) local926.anInt3058);
					} else if (local520 == 19) {
						local986 = Static259.method3831((int) local634);
						local267 = (int) (local634 >> 32);
						local986.method1292((short) local926.anInt3058, local267, (short) local926.anInt3064);
					}
				}
			}
		}
		Static315.anInt5591++;
		if (Static108.anInt1751 != 0) {
			Static618.anInt10171 += 20;
			if (Static618.anInt10171 >= 400) {
				Static108.anInt1751 = 0;
			}
		}
		if (Static207.aClass73_13 != null) {
			Static318.anInt5634++;
			if (Static318.anInt5634 >= 15) {
				Static298.method4399(Static207.aClass73_13);
				Static207.aClass73_13 = null;
			}
		}
		Static168.aClass73_8 = null;
		Static93.aClass73_21 = null;
		Static50.aBoolean68 = false;
		Static433.aBoolean571 = false;
		Static89.method1350(-1, (Class73) null, -1);
		Static530.method7641(-1, -1, (Class73) null);
		if (!Static199.aBoolean706) {
			Static446.anInt7686 = -1;
		}
		Static642.method8951();
		Static261.anInt4525++;
		if (Static591.aBoolean753) {
			@Pc(1775) Class5_Sub50 local1775 = Static457.method6722(Static350.aClass387_63, Static80.aClass313_1);
			local1775.aClass5_Sub23_Sub2_2.method8490(Static432.anInt7423 | Static360.anInt6281 << 14 | Static105.anInt1715 << 28);
			Static494.method7120(local1775);
			Static591.aBoolean753 = false;
		}
		while (true) {
			@Pc(1798) Class5_Sub3 local1798;
			@Pc(1815) Class73 local1815;
			@Pc(1803) Class73 local1803;
			do {
				local1798 = (Class5_Sub3) Static626.aClass102_74.method1928();
				if (local1798 == null) {
					while (true) {
						do {
							local1798 = (Class5_Sub3) Static457.aClass102_50.method1928();
							if (local1798 == null) {
								while (true) {
									do {
										local1798 = (Class5_Sub3) Static118.aClass102_3.method1928();
										if (local1798 == null) {
											if (Static93.aClass73_21 == null) {
												Static288.anInt5464 = 0;
											}
											if (Static370.aClass73_22 != null) {
												Static598.method8618();
											}
											if (Static539.anInt9221 > 0 && Static258.aClass89_1.method1617(82) && Static258.aClass89_1.method1617(81) && Static659.anInt10600 != 0) {
												local520 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 - Static659.anInt10600;
												if (local520 < 0) {
													local520 = 0;
												} else if (local520 > 3) {
													local520 = 3;
												}
												Static374.method5468(local520, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0] + Static668.anInt10683, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] + Static622.anInt10188);
											}
											Static217.method3110();
											for (local520 = 0; local520 < 5; local520++) {
												@Pc(2032) int local2032 = Static547.anIntArray521[local520]++;
											}
											if (Static593.aBoolean754 && Static489.aLong249 < Static515.method7499(92) - 60000L) {
												Static553.method8002();
											}
											for (@Pc(2069) Class8_Sub8_Sub2 local2069 = (Class8_Sub8_Sub2) Static140.aClass98_4.method1777(); local2069 != null; local2069 = (Class8_Sub8_Sub2) Static140.aClass98_4.method1782()) {
												if ((long) local2069.anInt8113 < Static515.method7499(88) / 1000L - 5L) {
													if (local2069.aShort98 > 0) {
														Static177.method2584("", local2069.aString106 + Static582.aClass335_20.method8349(Static323.anInt5795), "", 0, 5, "");
													}
													if (local2069.aShort98 == 0) {
														Static177.method2584("", local2069.aString106 + Static582.aClass335_21.method8349(Static323.anInt5795), "", 0, 5, "");
													}
													local2069.method8893();
												}
											}
											Static201.anInt3256++;
											if (Static201.anInt3256 > 500) {
												Static201.anInt3256 = 0;
												local204 = (int) (Math.random() * 8.0D);
												if ((local204 & 0x2) == 2) {
													Static275.anInt4791 += Static5.anInt9542;
												}
												if ((local204 & 0x4) == 4) {
													Static6.anInt81 += Static645.anInt10498;
												}
												if ((local204 & 0x1) == 1) {
													Static274.anInt4832 += Static110.anInt1784;
												}
											}
											if (Static274.anInt4832 < -50) {
												Static110.anInt1784 = 2;
											}
											if (Static274.anInt4832 > 50) {
												Static110.anInt1784 = -2;
											}
											if (Static275.anInt4791 < -55) {
												Static5.anInt9542 = 2;
											}
											if (Static275.anInt4791 > 55) {
												Static5.anInt9542 = -2;
											}
											if (Static6.anInt81 < -40) {
												Static645.anInt10498 = 1;
											}
											if (Static6.anInt81 > 40) {
												Static645.anInt10498 = -1;
											}
											Static656.anInt10566++;
											if (Static656.anInt10566 > 500) {
												Static656.anInt10566 = 0;
												local204 = (int) (Math.random() * 8.0D);
												if ((local204 & 0x2) == 2) {
													Static438.anInt7509 += Static119.anInt1892;
												}
												if ((local204 & 0x1) == 1) {
													Static609.anInt10107 += Static75.anInt1198;
												}
											}
											if (Static609.anInt10107 < -60) {
												Static75.anInt1198 = 2;
											}
											if (Static438.anInt7509 < -20) {
												Static119.anInt1892 = 1;
											}
											if (Static609.anInt10107 > 60) {
												Static75.anInt1198 = -2;
											}
											if (Static438.anInt7509 > 10) {
												Static119.anInt1892 = -1;
											}
											Static453.anInt7762++;
											if (Static453.anInt7762 > 50) {
												@Pc(2335) Class5_Sub50 local2335 = Static457.method6722(Static70.aClass387_18, Static80.aClass313_1);
												Static494.method7120(local2335);
											}
											if (Static377.aBoolean500) {
												Static162.method2199();
												Static377.aBoolean500 = false;
											}
											try {
												Static253.method3720();
												return;
											} catch (@Pc(2350) IOException local2350) {
												Static579.method8316();
												return;
											}
										}
										local1803 = local1798.aClass73_1;
										if (local1803.anInt1364 < 0) {
											break;
										}
										local1815 = Static259.method3831(local1803.anInt1410);
									} while (local1815 == null || local1815.aClass73Array1 == null || local1815.aClass73Array1.length <= local1803.anInt1364 || local1803 != local1815.aClass73Array1[local1803.anInt1364]);
									Static173.method2520(local1798);
								}
							}
							local1803 = local1798.aClass73_1;
							if (local1803.anInt1364 < 0) {
								break;
							}
							local1815 = Static259.method3831(local1803.anInt1410);
						} while (local1815 == null || local1815.aClass73Array1 == null || local1815.aClass73Array1.length <= local1803.anInt1364 || local1803 != local1815.aClass73Array1[local1803.anInt1364]);
						Static173.method2520(local1798);
					}
				}
				local1803 = local1798.aClass73_1;
				if (local1803.anInt1364 < 0) {
					break;
				}
				local1815 = Static259.method3831(local1803.anInt1410);
			} while (local1815 == null || local1815.aClass73Array1 == null || local1815.aClass73Array1.length <= local1803.anInt1364 || local1803 != local1815.aClass73Array1[local1803.anInt1364]);
			Static173.method2520(local1798);
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(II)Lclient!nl;")
	public static Class251 method1556(@OriginalArg(0) int arg0) {
		@Pc(10) Class251 local10 = (Class251) Static472.aClass391_44.method9275((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static462.aClass208_106.method4991(0, arg0, -119);
		local10 = new Class251();
		if (local27 != null) {
			local10.method5816(arg0, new Class5_Sub23(local27));
		}
		Static472.aClass391_44.method9273((long) arg0, local10, 1);
		return local10;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!d;IILjava/awt/Canvas;I)Lclient!ha;")
	public static Class57 method1560(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		return new Class57_Sub1(arg2, arg0, arg3, arg1);
	}
}
