import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
	public static int anInt4110;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!maa;")
	public static final Class195 aClass195_4 = new Class195("", 12);

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
	public static int anInt4111 = 0;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method3519() {
		if (Static503.anInt8751 > 1) {
			Static503.anInt8751--;
			Static390.anInt7115 = Static124.anInt2133;
		}
		if (Static476.aBoolean540) {
			Static476.aBoolean540 = false;
			Static164.method2621();
			return;
		}
		if (!Static266.aBoolean351) {
			Static187.method3214();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static230.method3593(); local29++) {
		}
		if (Static375.anInt9162 != 10) {
			return;
		}
		Static349.method5299(Static340.aClass6_Sub12_Sub2_1, Static264.aClass316_56.method7072());
		if (Static566.aClass6_Sub16_2 == null) {
			if (Static126.aLong42 <= Static416.method5922()) {
				Static566.aClass6_Sub16_2 = Static201.aClass344_1.method7837(Static65.aClass297_1.aString70);
			}
		} else if (Static566.aClass6_Sub16_2.anInt2906 != -1) {
			Static534.method7063(Static144.aClass316_114);
			Static340.aClass6_Sub12_Sub2_1.method6032(Static566.aClass6_Sub16_2.anInt2906);
			Static566.aClass6_Sub16_2 = null;
			Static126.aLong42 = Static416.method5922() + 30000L;
		}
		@Pc(99) Class6_Sub41 local99 = (Class6_Sub41) Static43.aClass298_22.method6809();
		@Pc(143) int local143;
		@Pc(161) int local161;
		@Pc(208) int local208;
		@Pc(215) int local215;
		@Pc(226) int local226;
		if (local99 != null || Static416.method5922() - 2000L > Static227.aLong90) {
			@Pc(116) boolean local116 = false;
			@Pc(119) int local119 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
			for (@Pc(124) Class6_Sub41 local124 = (Class6_Sub41) Static192.aClass298_81.method6809(); local124 != null && Static340.aClass6_Sub12_Sub2_1.anInt7556 - local119 < 240; local124 = (Class6_Sub41) Static192.aClass298_81.method6821()) {
				local124.method7948();
				local143 = local124.method6480();
				if (local143 < -1) {
					local143 = -1;
				} else if (local143 > 65534) {
					local143 = 65534;
				}
				local161 = local124.method6487();
				if (local161 < -1) {
					local161 = -1;
				} else if (local161 > 65534) {
					local161 = 65534;
				}
				if (local161 != Static24.anInt427 || local143 != Static31.anInt577) {
					if (!local116) {
						Static534.method7063(Static348.aClass316_81);
						Static340.aClass6_Sub12_Sub2_1.method6047(0);
						local116 = true;
						local119 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
					}
					local208 = local161 - Static24.anInt427;
					Static24.anInt427 = local161;
					local215 = local143 - Static31.anInt577;
					Static31.anInt577 = local143;
					local226 = (int) ((local124.method6483() - Static227.aLong90) / 20L);
					if (local226 < 8 && local208 >= -32 && local208 <= 31 && local215 >= -32 && local215 <= 31) {
						local208 += 32;
						local215 += 32;
						Static340.aClass6_Sub12_Sub2_1.method6032((local208 << 6) + (local226 << 12) + local215);
					} else if (local226 < 32 && local208 >= -128 && local208 <= 127 && local215 >= -128 && local215 <= 127) {
						local215 += 128;
						local208 += 128;
						Static340.aClass6_Sub12_Sub2_1.method6047(local226 + 128);
						Static340.aClass6_Sub12_Sub2_1.method6032((local208 << 8) + local215);
					} else if (local226 < 32) {
						Static340.aClass6_Sub12_Sub2_1.method6047(local226 + 192);
						if (local161 == 1 || local143 == -1) {
							Static340.aClass6_Sub12_Sub2_1.method6042(Integer.MIN_VALUE);
						} else {
							Static340.aClass6_Sub12_Sub2_1.method6042(local161 | local143 << 16);
						}
					} else {
						Static340.aClass6_Sub12_Sub2_1.method6032(local226 + 57344);
						if (local161 == 1 || local143 == -1) {
							Static340.aClass6_Sub12_Sub2_1.method6042(Integer.MIN_VALUE);
						} else {
							Static340.aClass6_Sub12_Sub2_1.method6042(local143 << 16 | local161);
						}
					}
					Static227.aLong90 = local124.method6483();
				}
			}
			if (local116) {
				Static340.aClass6_Sub12_Sub2_1.method6056(Static340.aClass6_Sub12_Sub2_1.anInt7556 - local119);
			}
		}
		@Pc(412) int local412;
		if (local99 != null) {
			@Pc(398) long local398 = (local99.method6483() - Static317.aLong149) / 50L;
			if (local398 > 32767L) {
				local398 = 32767L;
			}
			Static317.aLong149 = local99.method6483();
			local412 = local99.method6480();
			if (local412 < 0) {
				local412 = 0;
			} else if (local412 > 65535) {
				local412 = 65535;
			}
			local143 = local99.method6487();
			if (local143 < 0) {
				local143 = 0;
			} else if (local143 > 65535) {
				local143 = 65535;
			}
			@Pc(442) byte local442 = 0;
			if (local99.method6484() == 2) {
				local442 = 1;
			}
			Static534.method7063(Static239.aClass316_50);
			local208 = (int) local398;
			Static340.aClass6_Sub12_Sub2_1.method6006(local412 << 16 | local143);
			Static340.aClass6_Sub12_Sub2_1.method6058(local442 << 15 | local208);
		}
		@Pc(492) int local492;
		if (Static21.anInt380 > 0) {
			Static534.method7063(Static537.aClass316_115);
			Static340.aClass6_Sub12_Sub2_1.method6047(Static21.anInt380 * 3);
			for (local492 = 0; local492 < Static21.anInt380; local492++) {
				@Pc(498) Interface5 local498 = Static352.anInterface5Array2[local492];
				@Pc(507) long local507 = (local498.method6892() - Static150.aLong51) / 50L;
				if (local507 > 65535L) {
					local507 = 65535L;
				}
				Static150.aLong51 = local498.method6892();
				Static340.aClass6_Sub12_Sub2_1.method6047(local498.method6889());
				Static340.aClass6_Sub12_Sub2_1.method6032((int) local507);
			}
		}
		if (Static555.anInt9652 > 0) {
			Static555.anInt9652--;
		}
		if (Static380.aBoolean478 && Static555.anInt9652 <= 0) {
			Static555.anInt9652 = 20;
			Static380.aBoolean478 = false;
			Static534.method7063(Static226.aClass316_49);
			Static340.aClass6_Sub12_Sub2_1.method6032((int) Static562.aFloat14 >> 3);
			Static340.aClass6_Sub12_Sub2_1.method6053((int) Static532.aFloat185 >> 3);
		}
		if (Static162.aBoolean225 && !Static580.aBoolean671) {
			Static580.aBoolean671 = true;
			Static534.method7063(Static12.aClass316_5);
			Static340.aClass6_Sub12_Sub2_1.method6047(1);
		}
		if (!Static162.aBoolean225 && Static580.aBoolean671) {
			Static580.aBoolean671 = false;
			Static534.method7063(Static12.aClass316_5);
			Static340.aClass6_Sub12_Sub2_1.method6047(0);
		}
		if (!Static252.aBoolean341) {
			Static534.method7063(Static120.aClass316_26);
			Static340.aClass6_Sub12_Sub2_1.method6047(0);
			local492 = Static340.aClass6_Sub12_Sub2_1.anInt7556;
			@Pc(657) Class6_Sub12 local657 = new Class6_Sub12(Static457.method6387());
			Static58.aClass6_Sub17_Sub1_1.method7352(local657);
			Static340.aClass6_Sub12_Sub2_1.method6025(local657.anInt7556, local657.aByteArray97);
			Static340.aClass6_Sub12_Sub2_1.method6056(Static340.aClass6_Sub12_Sub2_1.anInt7556 - local492);
			Static252.aBoolean341 = true;
		}
		if (Static113.aClass133ArrayArrayArray1 != null) {
			if (Static60.anInt1008 == 2) {
				Static167.method2650();
			} else if (Static60.anInt1008 == 3) {
				Static213.method3439();
			}
		}
		if (Static492.aBoolean563) {
			Static492.aBoolean563 = false;
		} else {
			Static7.aFloat12 /= 2.0F;
		}
		if (Static154.aBoolean217) {
			Static154.aBoolean217 = false;
		} else {
			Static256.aFloat120 /= 2.0F;
		}
		Static530.method4939();
		if (Static375.anInt9162 != 10) {
			return;
		}
		Static378.method5548();
		Static269.method4027();
		Static352.method5319();
		Static410.method5897();
		Static221.anInt4092++;
		if (Static221.anInt4092 > 750) {
			Static164.method2621();
			return;
		}
		Static469.method6536();
		Static497.method6880();
		Static340.method5216();
		for (local492 = Static65.aClass51_1.method961(true); local492 != -1; local492 = Static65.aClass51_1.method961(false)) {
			Static501.method6932(local492);
			Static354.anIntArray462[Static383.anInt7015++ & 0x1F] = local492;
		}
		@Pc(832) Class97 local832;
		for (@Pc(785) Class6_Sub5_Sub8 local785 = Static164.method2622(); local785 != null; local785 = Static164.method2622()) {
			local412 = local785.method3255();
			local143 = local785.method3259();
			if (local412 == 1) {
				Static2.anIntArray4[local143] = local785.anInt3740;
				Static492.aBoolean562 |= Static224.aBooleanArray14[local143];
				Static219.anIntArray345[Static73.anInt1194++ & 0x1F] = local143;
			} else if (local412 == 2) {
				Static280.aStringArray24[local143] = local785.aString35;
				Static525.anIntArray641[Static551.anInt9633++ & 0x1F] = local143;
			} else if (local412 == 3) {
				local832 = Static495.method7281(local143);
				if (!local785.aString35.equals(local832.aString18)) {
					local832.aString18 = local785.aString35;
					Static479.method6666(local832);
				}
			} else if (local412 == 4) {
				local832 = Static495.method7281(local143);
				local208 = local785.anInt3740;
				local215 = local785.anInt3739;
				local226 = local785.anInt3734;
				if (local832.anInt2681 != local208 || local832.anInt2636 != local215 || local832.anInt2682 != local226) {
					local832.anInt2636 = local215;
					local832.anInt2681 = local208;
					local832.anInt2682 = local226;
					Static479.method6666(local832);
				}
			} else if (local412 == 5) {
				local832 = Static495.method7281(local143);
				if (local832.anInt2620 != local785.anInt3740 || local785.anInt3740 == -1) {
					local832.anInt2601 = 0;
					local832.anInt2626 = 1;
					local832.anInt2685 = 0;
					local832.anInt2620 = local785.anInt3740;
					Static479.method6666(local832);
				}
			} else if (local412 == 6) {
				local161 = local785.anInt3740;
				local208 = local161 >> 10 & 0x1F;
				local215 = local161 >> 5 & 0x1F;
				local226 = local161 & 0x1F;
				@Pc(1237) int local1237 = (local226 << 3) + ((local208 << 19) + (local215 << 11));
				@Pc(1241) Class97 local1241 = Static495.method7281(local143);
				if (local1237 != local1241.anInt2606) {
					local1241.anInt2606 = local1237;
					Static479.method6666(local1241);
				}
			} else if (local412 == 7) {
				local832 = Static495.method7281(local143);
				@Pc(1189) boolean local1189 = local785.anInt3740 == 1;
				if (local832.aBoolean200 != local1189) {
					local832.aBoolean200 = local1189;
					Static479.method6666(local832);
				}
			} else if (local412 == 8) {
				local832 = Static495.method7281(local143);
				if (local785.anInt3740 != local832.anInt2687 || local785.anInt3739 != local832.anInt2639 || local785.anInt3734 != local832.anInt2683) {
					local832.anInt2683 = local785.anInt3734;
					local832.anInt2639 = local785.anInt3739;
					local832.anInt2687 = local785.anInt3740;
					if (local832.anInt2607 != -1) {
						if (local832.anInt2633 > 0) {
							local832.anInt2683 = local832.anInt2683 * 32 / local832.anInt2633;
						} else if (local832.anInt2616 > 0) {
							local832.anInt2683 = local832.anInt2683 * 32 / local832.anInt2616;
						}
					}
					Static479.method6666(local832);
				}
			} else if (local412 == 9) {
				local832 = Static495.method7281(local143);
				if (local785.anInt3740 != local832.anInt2607 || local785.anInt3739 != local832.anInt2660) {
					local832.anInt2607 = local785.anInt3740;
					local832.anInt2660 = local785.anInt3739;
					Static479.method6666(local832);
				}
			} else if (local412 == 10) {
				local832 = Static495.method7281(local143);
				if (local832.anInt2630 != local785.anInt3740 || local832.anInt2614 != local785.anInt3739 || local785.anInt3734 != local832.anInt2661) {
					local832.anInt2630 = local785.anInt3740;
					local832.anInt2661 = local785.anInt3734;
					local832.anInt2614 = local785.anInt3739;
					Static479.method6666(local832);
				}
			} else if (local412 == 11) {
				local832 = Static495.method7281(local143);
				local832.aByte29 = 0;
				local832.anInt2642 = local832.anInt2650 = local785.anInt3740;
				local832.aByte28 = 0;
				local832.anInt2641 = local832.anInt2618 = local785.anInt3739;
				Static479.method6666(local832);
			} else if (local412 == 12) {
				local832 = Static495.method7281(local143);
				local208 = local785.anInt3740;
				if (local832 != null && local832.anInt2637 == 0) {
					if (local832.anInt2603 - local832.anInt2670 < local208) {
						local208 = local832.anInt2603 - local832.anInt2670;
					}
					if (local208 < 0) {
						local208 = 0;
					}
					if (local208 != local832.anInt2665) {
						local832.anInt2665 = local208;
						Static479.method6666(local832);
					}
				}
			} else if (local412 == 14) {
				local832 = Static495.method7281(local143);
				local832.anInt2632 = local785.anInt3740;
			} else if (local412 == 15) {
				Static567.anInt9818 = local785.anInt3740;
				Static542.anInt9320 = local785.anInt3739;
				Static243.aBoolean327 = true;
			} else if (local412 == 16) {
				local832 = Static495.method7281(local143);
				local832.anInt2651 = local785.anInt3740;
			}
		}
		if (Static82.anInt1373 != 0) {
			Static496.anInt9106 += 20;
			if (Static496.anInt9106 >= 400) {
				Static82.anInt1373 = 0;
			}
		}
		Static415.anInt7409++;
		if (Static69.aClass97_6 != null) {
			Static141.anInt2741++;
			if (Static141.anInt2741 >= 15) {
				Static479.method6666(Static69.aClass97_6);
				Static69.aClass97_6 = null;
			}
		}
		Static471.aBoolean538 = false;
		Static496.aClass97_24 = null;
		Static307.aBoolean405 = false;
		Static3.aClass97_17 = null;
		Static51.method778(-1, null, -1);
		Static138.method2967(-1, -1, null);
		if (!Static540.aBoolean580) {
			Static427.anInt7590 = -1;
		}
		Static439.method6210();
		Static124.anInt2133++;
		if (Static295.aBoolean375) {
			Static534.method7063(Static538.aClass316_116);
			Static340.aClass6_Sub12_Sub2_1.method6042(Static33.anInt607 << 28 | Static82.anInt1380 << 14 | Static133.anInt2534);
			Static295.aBoolean375 = false;
		}
		while (true) {
			@Pc(1431) Class6_Sub1 local1431;
			@Pc(1436) Class97 local1436;
			do {
				local1431 = (Class6_Sub1) Static161.aClass298_66.method6811();
				if (local1431 == null) {
					while (true) {
						do {
							local1431 = (Class6_Sub1) Static346.aClass298_129.method6811();
							if (local1431 == null) {
								while (true) {
									do {
										local1431 = (Class6_Sub1) Static534.aClass298_190.method6811();
										if (local1431 == null) {
											if (Static496.aClass97_24 == null) {
												Static437.anInt7773 = 0;
											}
											if (Static165.aClass97_8 != null) {
												Static337.method5189();
											}
											if (Static113.anInt1927 > 0 && Static184.aClass262_1.method6381(82) && Static184.aClass262_1.method6381(81) && Static502.anInt8744 != 0) {
												local412 = Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 - Static502.anInt8744;
												if (local412 < 0) {
													local412 = 0;
												} else if (local412 > 3) {
													local412 = 3;
												}
												Static103.method1603(local412, Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] + Static154.anInt2878, Static150.anInt2792 + Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0]);
											}
											Static577.method7886();
											for (local412 = 0; local412 < 5; local412++) {
												@Pc(1641) int local1641 = Static12.anIntArray11[local412]++;
											}
											if (Static492.aBoolean562 && Static416.method5922() - 60000L > Static322.aLong150) {
												Static112.method1708();
											}
											for (@Pc(1670) Class60_Sub1_Sub2 local1670 = (Class60_Sub1_Sub2) Static308.aClass349_10.method7890(); local1670 != null; local1670 = (Class60_Sub1_Sub2) Static308.aClass349_10.method7896()) {
												if (Static416.method5922() / 1000L - 5L > (long) local1670.anInt4490) {
													if (local1670.aShort71 > 0) {
														Static170.method2697("", "", "", 5, local1670.aString37 + Static146.aClass103_66.method2355(Static188.anInt28), 0);
													}
													if (local1670.aShort71 == 0) {
														Static170.method2697("", "", "", 5, local1670.aString37 + Static146.aClass103_67.method2355(Static188.anInt28), 0);
													}
													local1670.method7802();
												}
											}
											Static516.anInt8877++;
											if (Static516.anInt8877 > 500) {
												Static516.anInt8877 = 0;
												local161 = (int) (Math.random() * 8.0D);
												if ((local161 & 0x2) == 2) {
													Static288.anInt8064 += Static350.anInt6571;
												}
												if ((local161 & 0x4) == 4) {
													Static270.anInt4763 += Static29.anInt9326;
												}
												if ((local161 & 0x1) == 1) {
													Static157.anInt6625 += Static28.anInt486;
												}
											}
											if (Static157.anInt6625 < -50) {
												Static28.anInt486 = 2;
											}
											if (Static157.anInt6625 > 50) {
												Static28.anInt486 = -2;
											}
											if (Static288.anInt8064 < -55) {
												Static350.anInt6571 = 2;
											}
											if (Static288.anInt8064 > 55) {
												Static350.anInt6571 = -2;
											}
											if (Static270.anInt4763 < -40) {
												Static29.anInt9326 = 1;
											}
											if (Static270.anInt4763 > 40) {
												Static29.anInt9326 = -1;
											}
											Static395.anInt7184++;
											if (Static395.anInt7184 > 500) {
												Static395.anInt7184 = 0;
												local161 = (int) (Math.random() * 8.0D);
												if ((local161 & 0x2) == 2) {
													Static213.anInt4015 += Static12.anInt190;
												}
												if ((local161 & 0x1) == 1) {
													Static63.anInt1086 += Static122.anInt2115;
												}
											}
											if (Static63.anInt1086 < -60) {
												Static122.anInt2115 = 2;
											}
											if (Static63.anInt1086 > 60) {
												Static122.anInt2115 = -2;
											}
											if (Static213.anInt4015 < -20) {
												Static12.anInt190 = 1;
											}
											Static75.anInt1265++;
											if (Static213.anInt4015 > 10) {
												Static12.anInt190 = -1;
											}
											if (Static75.anInt1265 > 50) {
												Static534.method7063(Static83.aClass316_19);
											}
											if (Static356.aBoolean460) {
												Static9.method130();
												Static356.aBoolean460 = false;
											}
											try {
												if (Static354.aClass1_1 != null && Static340.aClass6_Sub12_Sub2_1.anInt7556 > 0) {
													Static438.anInt7792 += Static340.aClass6_Sub12_Sub2_1.anInt7556;
													Static354.aClass1_1.method53(Static340.aClass6_Sub12_Sub2_1.aByteArray97, Static340.aClass6_Sub12_Sub2_1.anInt7556);
													Static75.anInt1265 = 0;
													Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
													return;
												}
												return;
											} catch (@Pc(1943) IOException local1943) {
												Static164.method2621();
												return;
											}
										}
										local1436 = local1431.aClass97_2;
										if (local1436.anInt2675 < 0) {
											break;
										}
										local832 = Static495.method7281(local1436.anInt2655);
									} while (local832 == null || local832.aClass97Array2 == null || local832.aClass97Array2.length <= local1436.anInt2675 || local1436 != local832.aClass97Array2[local1436.anInt2675]);
									Static199.method3316(local1431);
								}
							}
							local1436 = local1431.aClass97_2;
							if (local1436.anInt2675 < 0) {
								break;
							}
							local832 = Static495.method7281(local1436.anInt2655);
						} while (local832 == null || local832.aClass97Array2 == null || local832.aClass97Array2.length <= local1436.anInt2675 || local832.aClass97Array2[local1436.anInt2675] != local1436);
						Static199.method3316(local1431);
					}
				}
				local1436 = local1431.aClass97_2;
				if (local1436.anInt2675 < 0) {
					break;
				}
				local832 = Static495.method7281(local1436.anInt2655);
			} while (local832 == null || local832.aClass97Array2 == null || local1436.anInt2675 >= local832.aClass97Array2.length || local1436 != local832.aClass97Array2[local1436.anInt2675]);
			Static199.method3316(local1431);
		}
	}
}
