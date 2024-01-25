import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	public static void method5356() {
		if (Static388.anInt7599 > 1) {
			Static389.anInt9603 = Static422.anInt8117;
			Static388.anInt7599--;
		}
		if (Static24.aBoolean94) {
			Static24.aBoolean94 = false;
			Static114.method2103();
			return;
		}
		if (!Static117.aBoolean207) {
			Static486.method7075();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static347.method5293(); local27++) {
		}
		if (Static9.anInt758 != 10) {
			return;
		}
		@Pc(51) Class4_Sub39 local51;
		@Pc(60) int local60;
		while (Static191.method3142()) {
			local51 = Static32.method999(Static402.aClass356_1, Static315.aClass344_51);
			local51.aClass4_Sub13_Sub2_1.method7052(0);
			local60 = local51.aClass4_Sub13_Sub2_1.anInt9170;
			Static188.method3092(local51.aClass4_Sub13_Sub2_1);
			local51.aClass4_Sub13_Sub2_1.method6991(local51.aClass4_Sub13_Sub2_1.anInt9170 - local60);
			Static50.method1166(local51);
		}
		if (Static59.aClass4_Sub46_1 == null) {
			if (Static112.method2047() >= Static221.aLong20) {
				Static59.aClass4_Sub46_1 = Static587.aClass164_1.method3934(Static326.aClass271_2.aString164);
			}
		} else if (Static59.aClass4_Sub46_1.anInt9249 != -1) {
			local51 = Static32.method999(Static402.aClass356_1, Static324.aClass344_53);
			local51.aClass4_Sub13_Sub2_1.method7038(Static59.aClass4_Sub46_1.anInt9249);
			Static50.method1166(local51);
			Static59.aClass4_Sub46_1 = null;
			Static221.aLong20 = Static112.method2047() + 30000L;
		}
		@Pc(128) Class4_Sub24 local128 = (Class4_Sub24) Static36.aClass22_13.method895();
		@Pc(141) int local141;
		@Pc(166) int local166;
		@Pc(184) int local184;
		@Pc(234) int local234;
		@Pc(241) int local241;
		@Pc(253) int local253;
		@Pc(139) Class4_Sub39 local139;
		if (local128 != null || Static399.aLong205 < Static112.method2047() - 2000L) {
			local139 = null;
			local141 = 0;
			for (@Pc(146) Class4_Sub24 local146 = (Class4_Sub24) Static311.aClass22_41.method895(); local146 != null && (local139 == null || local139.aClass4_Sub13_Sub2_1.anInt9170 - local141 < 240); local146 = (Class4_Sub24) Static311.aClass22_41.method889()) {
				local146.method8193();
				local166 = local146.method6390();
				if (local166 < -1) {
					local166 = -1;
				} else if (local166 > 65534) {
					local166 = 65534;
				}
				local184 = local146.method6394();
				if (local184 < -1) {
					local184 = -1;
				} else if (local184 > 65534) {
					local184 = 65534;
				}
				if (local184 != Static361.anInt6989 || Static293.anInt5987 != local166) {
					if (local139 == null) {
						local139 = Static32.method999(Static402.aClass356_1, Static233.aClass344_34);
						local139.aClass4_Sub13_Sub2_1.method7052(0);
						local141 = local139.aClass4_Sub13_Sub2_1.anInt9170;
					}
					local234 = local184 - Static361.anInt6989;
					Static361.anInt6989 = local184;
					local241 = local166 - Static293.anInt5987;
					Static293.anInt5987 = local166;
					local253 = (int) ((local146.method6392() - Static399.aLong205) / 20L);
					if (local253 < 8 && local234 >= -32 && local234 <= 31 && local241 >= -32 && local241 <= 31) {
						local234 += 32;
						local241 += 32;
						local139.aClass4_Sub13_Sub2_1.method7038((local253 << 12) + (local234 << 6) + local241);
					} else if (local253 < 32 && local234 >= -128 && local234 <= 127 && local241 >= -128 && local241 <= 127) {
						local241 += 128;
						local139.aClass4_Sub13_Sub2_1.method7052(local253 + 128);
						local234 += 128;
						local139.aClass4_Sub13_Sub2_1.method7038(local241 + (local234 << 8));
					} else if (local253 >= 32) {
						local139.aClass4_Sub13_Sub2_1.method7038(local253 + 57344);
						if (local184 == 1 || local166 == -1) {
							local139.aClass4_Sub13_Sub2_1.method7032(Integer.MIN_VALUE);
						} else {
							local139.aClass4_Sub13_Sub2_1.method7032(local166 << 16 | local184);
						}
					} else {
						local139.aClass4_Sub13_Sub2_1.method7052(local253 + 192);
						if (local184 == 1 || local166 == -1) {
							local139.aClass4_Sub13_Sub2_1.method7032(Integer.MIN_VALUE);
						} else {
							local139.aClass4_Sub13_Sub2_1.method7032(local166 << 16 | local184);
						}
					}
					Static399.aLong205 = local146.method6392();
				}
			}
			if (local139 != null) {
				local139.aClass4_Sub13_Sub2_1.method6991(local139.aClass4_Sub13_Sub2_1.anInt9170 - local141);
				Static50.method1166(local139);
			}
		}
		@Pc(453) int local453;
		if (local128 != null) {
			@Pc(437) long local437 = (local128.method6392() - Static407.aLong207) / 50L;
			if (local437 > 32767L) {
				local437 = 32767L;
			}
			Static407.aLong207 = local128.method6392();
			local453 = local128.method6390();
			if (local453 < 0) {
				local453 = 0;
			} else if (local453 > 65535) {
				local453 = 65535;
			}
			local166 = local128.method6394();
			if (local166 < 0) {
				local166 = 0;
			} else if (local166 > 65535) {
				local166 = 65535;
			}
			@Pc(489) byte local489 = 0;
			if (local128.method6389() == 2) {
				local489 = 1;
			}
			local234 = (int) local437;
			@Pc(510) Class4_Sub39 local510 = Static32.method999(Static402.aClass356_1, Static324.aClass344_52);
			local510.aClass4_Sub13_Sub2_1.method7050(local453 << 16 | local166);
			local510.aClass4_Sub13_Sub2_1.method6999(local234 | local489 << 15);
			Static50.method1166(local510);
		}
		if (Static451.anInt8607 > 0) {
			local139 = Static32.method999(Static402.aClass356_1, Static430.aClass344_77);
			local139.aClass4_Sub13_Sub2_1.method7052(Static451.anInt8607 * 3);
			for (local141 = 0; local141 < Static451.anInt8607; local141++) {
				@Pc(557) Interface19 local557 = Static19.anInterface19Array1[local141];
				@Pc(565) long local565 = (local557.method5460() - Static68.aLong43) / 50L;
				Static68.aLong43 = local557.method5460();
				if (local565 > 65535L) {
					local565 = 65535L;
				}
				local139.aClass4_Sub13_Sub2_1.method7052(local557.method5458());
				local139.aClass4_Sub13_Sub2_1.method7038((int) local565);
			}
			Static50.method1166(local139);
		}
		if (Static150.anInt3207 > 0) {
			Static150.anInt3207--;
		}
		if (Static521.aBoolean651 && Static150.anInt3207 <= 0) {
			Static521.aBoolean651 = false;
			Static150.anInt3207 = 20;
			local139 = Static32.method999(Static402.aClass356_1, Static458.aClass344_83);
			local139.aClass4_Sub13_Sub2_1.method7001((int) Static189.aFloat83 >> 3);
			local139.aClass4_Sub13_Sub2_1.method7001((int) Static155.aFloat73 >> 3);
			Static50.method1166(local139);
		}
		if (Static164.aBoolean245 != Static475.aBoolean716) {
			Static475.aBoolean716 = Static164.aBoolean245;
			local139 = Static32.method999(Static402.aClass356_1, Static259.aClass344_39);
			local139.aClass4_Sub13_Sub2_1.method7052(Static164.aBoolean245 ? 1 : 0);
			Static50.method1166(local139);
		}
		if (!Static556.aBoolean698) {
			local139 = Static32.method999(Static402.aClass356_1, Static23.aClass344_5);
			local139.aClass4_Sub13_Sub2_1.method7052(0);
			local141 = local139.aClass4_Sub13_Sub2_1.anInt9170;
			@Pc(699) Class4_Sub13 local699 = new Class4_Sub13(Static239.method3894());
			Static455.aClass4_Sub35_Sub1_1.method7612(local699);
			local139.aClass4_Sub13_Sub2_1.method7030(local699.anInt9170, local699.aByteArray88);
			local139.aClass4_Sub13_Sub2_1.method6991(local139.aClass4_Sub13_Sub2_1.anInt9170 - local141);
			Static50.method1166(local139);
			Static556.aBoolean698 = true;
		}
		if (Static571.aClass182ArrayArrayArray3 != null) {
			if (Static300.anInt6053 == 2) {
				Static359.method5412();
			} else if (Static300.anInt6053 == 3) {
				Static23.method888();
			}
		}
		if (Static82.aBoolean174) {
			Static82.aBoolean174 = false;
		} else {
			Static1.aFloat107 /= 2.0F;
		}
		if (Static301.aBoolean426) {
			Static301.aBoolean426 = false;
		} else {
			Static15.aFloat37 /= 2.0F;
		}
		Static153.method2610();
		if (Static9.anInt758 != 10) {
			return;
		}
		Static201.method3281();
		Static179.method2957();
		Static305.method4820();
		Static531.anInt9752++;
		if (Static531.anInt9752 > 750) {
			Static114.method2103();
			return;
		}
		Static528.method7460();
		Static223.method3623();
		Static238.method3884();
		for (local60 = Static523.aClass173_1.method4074(true); local60 != -1; local60 = Static523.aClass173_1.method4074(false)) {
			Static281.method4484(local60);
			Static237.anIntArray270[Static160.anInt3344++ & 0x1F] = local60;
		}
		@Pc(875) Class155 local875;
		for (@Pc(828) Class4_Sub6_Sub5 local828 = Static384.method5950(); local828 != null; local828 = Static384.method5950()) {
			local453 = local828.method2304();
			local166 = local828.method2306();
			if (local453 == 1) {
				Static65.anIntArray67[local166] = local828.anInt2865;
				Static1.aBoolean353 |= Static188.aBooleanArray11[local166];
				Static562.anIntArray576[Static517.anInt10520++ & 0x1F] = local166;
			} else if (local453 == 2) {
				Static178.aStringArray15[local166] = local828.aString45;
				Static476.anIntArray527[Static499.anInt8421++ & 0x1F] = local166;
			} else if (local453 == 3) {
				local875 = Static558.method7916(local166);
				if (!local828.aString45.equals(local875.aString99)) {
					local875.aString99 = local828.aString45;
					Static368.method5060(local875);
				}
			} else if (local453 == 4) {
				local875 = Static558.method7916(local166);
				local234 = local828.anInt2865;
				local241 = local828.anInt2872;
				local253 = local828.anInt2871;
				if (local875.anInt4764 != local234 || local241 != local875.anInt4802 || local875.anInt4814 != local253) {
					local875.anInt4802 = local241;
					local875.anInt4814 = local253;
					local875.anInt4764 = local234;
					Static368.method5060(local875);
				}
			} else if (local453 == 5) {
				local875 = Static558.method7916(local166);
				if (local828.anInt2865 != local875.anInt4805 || local828.anInt2865 == -1) {
					local875.anInt4805 = local828.anInt2865;
					local875.anInt4773 = 0;
					local875.anInt4775 = 0;
					local875.anInt4747 = 1;
					@Pc(1329) Class111 local1329 = local875.anInt4805 == -1 ? null : Static17.aClass254_1.method5936(local875.anInt4805);
					if (local1329 != null) {
						Static435.method6470(local875.anInt4775, local1329);
					}
					Static368.method5060(local875);
				}
			} else if (local453 == 6) {
				local184 = local828.anInt2865;
				local234 = local184 >> 10 & 0x1F;
				local241 = local184 >> 5 & 0x1F;
				local253 = local184 & 0x1F;
				@Pc(1274) int local1274 = (local253 << 3) + (local241 << 11) + (local234 << 19);
				@Pc(1278) Class155 local1278 = Static558.method7916(local166);
				if (local1274 != local1278.anInt4794) {
					local1278.anInt4794 = local1274;
					Static368.method5060(local1278);
				}
			} else if (local453 == 7) {
				local875 = Static558.method7916(local166);
				@Pc(939) boolean local939 = local828.anInt2865 == 1;
				if (local939 != local875.aBoolean329) {
					local875.aBoolean329 = local939;
					Static368.method5060(local875);
				}
			} else if (local453 == 8) {
				local875 = Static558.method7916(local166);
				if (local828.anInt2865 != local875.anInt4789 || local828.anInt2872 != local875.anInt4809 || local875.anInt4797 != local828.anInt2871) {
					local875.anInt4797 = local828.anInt2871;
					local875.anInt4809 = local828.anInt2872;
					local875.anInt4789 = local828.anInt2865;
					if (local875.anInt4785 != -1) {
						if (local875.anInt4827 > 0) {
							local875.anInt4797 = local875.anInt4797 * 32 / local875.anInt4827;
						} else if (local875.anInt4780 > 0) {
							local875.anInt4797 = local875.anInt4797 * 32 / local875.anInt4780;
						}
					}
					Static368.method5060(local875);
				}
			} else if (local453 == 9) {
				local875 = Static558.method7916(local166);
				if (local828.anInt2865 != local875.anInt4785 || local875.anInt4742 != local828.anInt2872) {
					local875.anInt4742 = local828.anInt2872;
					local875.anInt4785 = local828.anInt2865;
					Static368.method5060(local875);
				}
			} else if (local453 == 10) {
				local875 = Static558.method7916(local166);
				if (local875.anInt4776 != local828.anInt2865 || local828.anInt2872 != local875.anInt4810 || local828.anInt2871 != local875.anInt4813) {
					local875.anInt4776 = local828.anInt2865;
					local875.anInt4813 = local828.anInt2871;
					local875.anInt4810 = local828.anInt2872;
					Static368.method5060(local875);
				}
			} else if (local453 == 11) {
				local875 = Static558.method7916(local166);
				local875.aByte76 = 0;
				local875.anInt4795 = local875.anInt4819 = local828.anInt2865;
				local875.aByte77 = 0;
				local875.anInt4799 = local875.anInt4770 = local828.anInt2872;
				Static368.method5060(local875);
			} else if (local453 == 12) {
				local875 = Static558.method7916(local166);
				local234 = local828.anInt2865;
				if (local875 != null && local875.anInt4796 == 0) {
					if (local875.anInt4801 - local875.anInt4831 < local234) {
						local234 = local875.anInt4801 - local875.anInt4831;
					}
					if (local234 < 0) {
						local234 = 0;
					}
					if (local875.anInt4762 != local234) {
						local875.anInt4762 = local234;
						Static368.method5060(local875);
					}
				}
			} else if (local453 == 14) {
				local875 = Static558.method7916(local166);
				local875.anInt4820 = local828.anInt2865;
			} else if (local453 == 15) {
				Static401.aBoolean564 = true;
				Static384.anInt7552 = local828.anInt2865;
				Static226.anInt4729 = local828.anInt2872;
			} else if (local453 == 16) {
				local875 = Static558.method7916(local166);
				local875.anInt4824 = local828.anInt2865;
			}
		}
		if (Static141.anInt10589 != 0) {
			Static517.anInt10518 += 20;
			if (Static517.anInt10518 >= 400) {
				Static141.anInt10589 = 0;
			}
		}
		Static92.anInt8628++;
		if (Static411.aClass155_12 != null) {
			Static169.anInt3497++;
			if (Static169.anInt3497 >= 15) {
				Static368.method5060(Static411.aClass155_12);
				Static411.aClass155_12 = null;
			}
		}
		Static525.aBoolean654 = false;
		Static204.aClass155_13 = null;
		Static325.aBoolean436 = false;
		Static571.aClass155_17 = null;
		Static212.method3437(-1, null, -1);
		Static398.method6103(-1, -1, null);
		if (!Static430.aBoolean586) {
			Static117.anInt2703 = -1;
		}
		Static6.method633();
		Static422.anInt8117++;
		if (Static437.aBoolean597) {
			@Pc(1456) Class4_Sub39 local1456 = Static32.method999(Static402.aClass356_1, Static187.aClass344_27);
			local1456.aClass4_Sub13_Sub2_1.method7034(Static83.anInt2224 << 14 | Static343.anInt6618 << 28 | Static559.anInt10555);
			Static50.method1166(local1456);
			Static437.aBoolean597 = false;
		}
		while (true) {
			@Pc(1479) Class4_Sub37 local1479;
			@Pc(1484) Class155 local1484;
			do {
				local1479 = (Class4_Sub37) Static360.aClass22_45.method896();
				if (local1479 == null) {
					while (true) {
						do {
							local1479 = (Class4_Sub37) Static72.aClass22_15.method896();
							if (local1479 == null) {
								while (true) {
									do {
										local1479 = (Class4_Sub37) Static197.aClass22_23.method896();
										if (local1479 == null) {
											if (Static571.aClass155_17 == null) {
												Static322.anInt6367 = 0;
											}
											if (Static292.aClass155_7 != null) {
												Static497.method7183();
											}
											if (Static100.anInt2432 > 0 && Static38.aClass174_1.method4090(82) && Static38.aClass174_1.method4090(81) && Static56.anInt1480 != 0) {
												local453 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 - Static56.anInt1480;
												if (local453 < 0) {
													local453 = 0;
												} else if (local453 > 3) {
													local453 = 3;
												}
												Static387.method5969(local453, Static242.anInt10133 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0], Static157.anInt3323 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0]);
											}
											Static5.method114();
											for (local453 = 0; local453 < 5; local453++) {
												@Pc(1676) int local1676 = Static446.anIntArray495[local453]++;
											}
											if (Static1.aBoolean353 && Static386.aLong199 < Static112.method2047() - 60000L) {
												Static573.method8080();
											}
											for (@Pc(1703) Class21_Sub3_Sub2 local1703 = (Class21_Sub3_Sub2) Static339.aClass158_15.method3726(); local1703 != null; local1703 = (Class21_Sub3_Sub2) Static339.aClass158_15.method3721()) {
												if ((long) local1703.anInt10591 < Static112.method2047() / 1000L - 5L) {
													if (local1703.aShort125 > 0) {
														Static84.method1791(5, "", "", local1703.aString234 + Static223.aClass152_23.method3624(Static142.anInt3088), 0, "");
													}
													if (local1703.aShort125 == 0) {
														Static84.method1791(5, "", "", local1703.aString234 + Static223.aClass152_24.method3624(Static142.anInt3088), 0, "");
													}
													local1703.method8246();
												}
											}
											Static190.anInt3974++;
											if (Static190.anInt3974 > 500) {
												Static190.anInt3974 = 0;
												local184 = (int) (Math.random() * 8.0D);
												if ((local184 & 0x2) == 2) {
													Static68.anInt1811 += Static33.anInt1197;
												}
												if ((local184 & 0x4) == 4) {
													Static42.anInt1292 += Static228.anInt4842;
												}
												if ((local184 & 0x1) == 1) {
													Static563.anInt10265 += Static443.anInt8428;
												}
											}
											if (Static563.anInt10265 < -50) {
												Static443.anInt8428 = 2;
											}
											if (Static563.anInt10265 > 50) {
												Static443.anInt8428 = -2;
											}
											if (Static68.anInt1811 < -55) {
												Static33.anInt1197 = 2;
											}
											if (Static42.anInt1292 < -40) {
												Static228.anInt4842 = 1;
											}
											if (Static68.anInt1811 > 55) {
												Static33.anInt1197 = -2;
											}
											if (Static42.anInt1292 > 40) {
												Static228.anInt4842 = -1;
											}
											Static205.anInt4320++;
											if (Static205.anInt4320 > 500) {
												Static205.anInt4320 = 0;
												local184 = (int) (Math.random() * 8.0D);
												if ((local184 & 0x2) == 2) {
													Static273.anInt5737 += Static448.anInt9587;
												}
												if ((local184 & 0x1) == 1) {
													Static136.anInt3033 += Static536.anInt9796;
												}
											}
											if (Static136.anInt3033 < -60) {
												Static536.anInt9796 = 2;
											}
											if (Static273.anInt5737 < -20) {
												Static448.anInt9587 = 1;
											}
											if (Static136.anInt3033 > 60) {
												Static536.anInt9796 = -2;
											}
											Static494.anInt9313++;
											if (Static273.anInt5737 > 10) {
												Static448.anInt9587 = -1;
											}
											if (Static494.anInt9313 > 50) {
												@Pc(1932) Class4_Sub39 local1932 = Static32.method999(Static402.aClass356_1, Static247.aClass344_35);
												Static50.method1166(local1932);
											}
											if (Static347.aBoolean457) {
												Static140.method2498();
												Static347.aBoolean457 = false;
											}
											try {
												Static446.method6581();
												return;
											} catch (@Pc(1945) IOException local1945) {
												Static114.method2103();
												return;
											}
										}
										local1484 = local1479.aClass155_10;
										if (local1484.anInt4765 < 0) {
											break;
										}
										local875 = Static558.method7916(local1484.anInt4769);
									} while (local875 == null || local875.aClass155Array2 == null || local875.aClass155Array2.length <= local1484.anInt4765 || local875.aClass155Array2[local1484.anInt4765] != local1484);
									Static471.method6884(local1479);
								}
							}
							local1484 = local1479.aClass155_10;
							if (local1484.anInt4765 < 0) {
								break;
							}
							local875 = Static558.method7916(local1484.anInt4769);
						} while (local875 == null || local875.aClass155Array2 == null || local875.aClass155Array2.length <= local1484.anInt4765 || local1484 != local875.aClass155Array2[local1484.anInt4765]);
						Static471.method6884(local1479);
					}
				}
				local1484 = local1479.aClass155_10;
				if (local1484.anInt4765 < 0) {
					break;
				}
				local875 = Static558.method7916(local1484.anInt4769);
			} while (local875 == null || local875.aClass155Array2 == null || local1484.anInt4765 >= local875.aClass155Array2.length || local875.aClass155Array2[local1484.anInt4765] != local1484);
			Static471.method6884(local1479);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZIZB)V")
	public static void method5357(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static72.method1551(0, arg2, Static353.aClass222_Sub1Array1.length - 1, arg0, arg3, arg1);
		Static357.anInt6909 = 0;
		Static363.aClass4_Sub46_2 = null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([BII)[B")
	public static byte[] method5358(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static599.method3060(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBI)V")
	public static void method5359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static503.aClass198_12.method4769(Static223.aClass152_28.method3624(Static142.anInt3088));
		@Pc(32) int local32;
		for (@Pc(18) Class4_Sub36 local18 = (Class4_Sub36) Static593.aClass22_65.method895(); local18 != null; local18 = (Class4_Sub36) Static593.aClass22_65.method889()) {
			local32 = Static67.method1483(local18);
			if (local32 > local13) {
				local13 = local32;
			}
		}
		local13 += 8;
		local32 = Static384.anInt7556 * 16 + 21;
		@Pc(58) int local58 = arg0 - local13 / 2;
		if (local58 + local13 > Static123.anInt9150) {
			local58 = Static123.anInt9150 - local13;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(75) int local75 = arg1;
		if (local32 + arg1 > Static71.anInt1872) {
			local75 = Static71.anInt1872 - local32;
		}
		Static593.anInt10604 = local58;
		if (local75 < 0) {
			local75 = 0;
		}
		Static303.anInt6098 = local13;
		Static117.aBoolean207 = true;
		Static469.anInt8895 = local75;
		Static340.anInt6537 = Static384.anInt7556 * 16 + (Static70.aBoolean150 ? 26 : 22);
	}
}
