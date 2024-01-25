import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!dj;")
	public static final Class71 aClass71_2 = new Class71();

	@OriginalMember(owner = "client!nc", name = "ub", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_71 = new Class181(34, 7);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method5326() {
		if (Static291.anInt5565 > 1) {
			Static291.anInt5565--;
			Static409.anInt7646 = Static32.anInt1035;
		}
		if (Static519.aBoolean682) {
			Static519.aBoolean682 = false;
			Static439.method6698();
			return;
		}
		if (!Static218.aBoolean366) {
			Static463.method7155();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static365.method5841(); local27++) {
		}
		if (Static325.anInt6149 != 10) {
			return;
		}
		Static199.method3757(Static547.aClass6_Sub26_Sub2_2, Static180.aClass181_45.method4574());
		if (Static133.aClass6_Sub47_2 == null) {
			if (Static503.aLong217 <= Static174.method3502()) {
				Static133.aClass6_Sub47_2 = Static98.aClass236_1.method5844(Static293.aClass275_2.aString100);
			}
		} else if (Static133.aClass6_Sub47_2.anInt8980 != -1) {
			Static298.method4854(Static448.aClass181_93);
			Static547.aClass6_Sub26_Sub2_2.method4962(Static133.aClass6_Sub47_2.anInt8980);
			Static133.aClass6_Sub47_2 = null;
			Static503.aLong217 = Static174.method3502() + 30000L;
		}
		@Pc(95) Class6_Sub39 local95 = (Class6_Sub39) Static512.aClass211_67.method5183();
		@Pc(136) int local136;
		@Pc(157) int local157;
		@Pc(200) int local200;
		@Pc(207) int local207;
		@Pc(218) int local218;
		if (local95 != null || Static174.method3502() - 2000L > Static83.aLong43) {
			@Pc(110) boolean local110 = false;
			@Pc(113) int local113 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
			for (@Pc(118) Class6_Sub39 local118 = (Class6_Sub39) Static377.aClass211_71.method5183(); local118 != null && Static547.aClass6_Sub26_Sub2_2.anInt5769 - local113 < 240; local118 = (Class6_Sub39) Static377.aClass211_71.method5177()) {
				local118.method8151();
				local136 = local118.method8018();
				if (local136 < -1) {
					local136 = -1;
				} else if (local136 > 65534) {
					local136 = 65534;
				}
				local157 = local118.method8012();
				if (local157 < -1) {
					local157 = -1;
				} else if (local157 > 65534) {
					local157 = 65534;
				}
				if (local157 != Static131.anInt2845 || local136 != Static331.anInt9799) {
					if (!local110) {
						Static298.method4854(Static347.aClass181_74);
						Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
						local113 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
						local110 = true;
					}
					local200 = local157 - Static131.anInt2845;
					Static131.anInt2845 = local157;
					local207 = local136 - Static331.anInt9799;
					Static331.anInt9799 = local136;
					local218 = (int) ((local118.method8016() - Static83.aLong43) / 20L);
					if (local218 < 8 && local200 >= -32 && local200 <= 31 && local207 >= -32 && local207 <= 31) {
						local200 += 32;
						local207 += 32;
						Static547.aClass6_Sub26_Sub2_2.method4962(local207 + (local200 << 6) + (local218 << 12));
					} else if (local218 < 32 && local200 >= -128 && local200 <= 127 && local207 >= -128 && local207 <= 127) {
						Static547.aClass6_Sub26_Sub2_2.method4950(local218 + 128, -81849);
						local200 += 128;
						local207 += 128;
						Static547.aClass6_Sub26_Sub2_2.method4962(local207 + (local200 << 8));
					} else if (local218 >= 32) {
						Static547.aClass6_Sub26_Sub2_2.method4962(local218 + 57344);
						if (local157 == 1 || local136 == -1) {
							Static547.aClass6_Sub26_Sub2_2.method4979(Integer.MIN_VALUE);
						} else {
							Static547.aClass6_Sub26_Sub2_2.method4979(local157 | local136 << 16);
						}
					} else {
						Static547.aClass6_Sub26_Sub2_2.method4950(local218 + 192, -81849);
						if (local157 == 1 || local136 == -1) {
							Static547.aClass6_Sub26_Sub2_2.method4979(Integer.MIN_VALUE);
						} else {
							Static547.aClass6_Sub26_Sub2_2.method4979(local157 | local136 << 16);
						}
					}
					Static83.aLong43 = local118.method8016();
				}
			}
			if (local110) {
				Static547.aClass6_Sub26_Sub2_2.method4976(Static547.aClass6_Sub26_Sub2_2.anInt5769 - local113);
			}
		}
		@Pc(409) int local409;
		if (local95 != null) {
			@Pc(395) long local395 = (local95.method8016() - Static390.aLong165) / 50L;
			Static390.aLong165 = local95.method8016();
			if (local395 > 32767L) {
				local395 = 32767L;
			}
			local409 = local95.method8018();
			if (local409 < 0) {
				local409 = 0;
			} else if (local409 > 65535) {
				local409 = 65535;
			}
			local136 = local95.method8012();
			if (local136 < 0) {
				local136 = 0;
			} else if (local136 > 65535) {
				local136 = 65535;
			}
			@Pc(439) byte local439 = 0;
			if (local95.method8017() == 2) {
				local439 = 1;
			}
			Static298.method4854(Static198.aClass181_49);
			local200 = (int) local395;
			Static547.aClass6_Sub26_Sub2_2.method4991(local200 | local439 << 15);
			Static547.aClass6_Sub26_Sub2_2.method4960(local409 << 16 | local136);
		}
		@Pc(493) int local493;
		if (Static549.anInt9381 > 0) {
			Static298.method4854(Static292.aClass181_65);
			Static547.aClass6_Sub26_Sub2_2.method4950(Static549.anInt9381 * 3, -81849);
			for (local493 = 0; local493 < Static549.anInt9381; local493++) {
				@Pc(499) Interface13 local499 = Static492.anInterface13Array2[local493];
				@Pc(509) long local509 = (local499.method7431() - Static249.aLong112) / 50L;
				if (local509 > 65535L) {
					local509 = 65535L;
				}
				Static249.aLong112 = local499.method7431();
				Static547.aClass6_Sub26_Sub2_2.method4950(local499.method7433(), -81849);
				Static547.aClass6_Sub26_Sub2_2.method4962((int) local509);
			}
		}
		if (Static432.anInt7890 > 0) {
			Static432.anInt7890--;
		}
		if (Static399.aBoolean713 && Static432.anInt7890 <= 0) {
			Static399.aBoolean713 = false;
			Static432.anInt7890 = 20;
			Static298.method4854(Static541.aClass181_111);
			Static547.aClass6_Sub26_Sub2_2.method4965((int) Static412.aFloat175 >> 3);
			Static547.aClass6_Sub26_Sub2_2.method4962((int) Static200.aFloat100 >> 3);
		}
		if (Static510.aBoolean503 && !Static450.aBoolean604) {
			Static450.aBoolean604 = true;
			Static298.method4854(Static516.aClass181_102);
			Static547.aClass6_Sub26_Sub2_2.method4950(1, -81849);
		}
		if (!Static510.aBoolean503 && Static450.aBoolean604) {
			Static450.aBoolean604 = false;
			Static298.method4854(Static516.aClass181_102);
			Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
		}
		if (!Static54.aBoolean151) {
			Static298.method4854(Static363.aClass181_77);
			Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
			local493 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
			@Pc(656) Class6_Sub26 local656 = new Class6_Sub26(Static553.method7876());
			Static104.aClass6_Sub6_Sub1_4.method1060(local656);
			Static547.aClass6_Sub26_Sub2_2.method4939(local656.anInt5769, local656.aByteArray65);
			Static547.aClass6_Sub26_Sub2_2.method4976(Static547.aClass6_Sub26_Sub2_2.anInt5769 - local493);
			Static54.aBoolean151 = true;
		}
		if (Static256.aClass224ArrayArrayArray1 != null) {
			if (Static84.anInt1994 == 2) {
				Static294.method4817();
			} else if (Static84.anInt1994 == 3) {
				Static369.method5895();
			}
		}
		if (Static350.aBoolean441) {
			Static350.aBoolean441 = false;
		} else {
			Static471.aFloat184 /= 2.0F;
		}
		if (Static506.aBoolean678) {
			Static506.aBoolean678 = false;
		} else {
			Static342.aFloat131 /= 2.0F;
		}
		Static242.method4247();
		if (Static325.anInt6149 != 10) {
			return;
		}
		Static307.method1301();
		Static104.method6581();
		Static54.method1263();
		Static140.method2630();
		Static258.anInt5222++;
		if (Static258.anInt5222 > 750) {
			Static439.method6698();
			return;
		}
		Static548.method7831();
		Static388.method6097();
		Static148.method8102();
		for (local493 = Static435.aClass234_1.method5836(true); local493 != -1; local493 = Static435.aClass234_1.method5836(false)) {
			Static133.method2524(local493);
			Static172.anIntArray261[Static498.anInt8882++ & 0x1F] = local493;
		}
		@Pc(846) Class93 local846;
		for (@Pc(779) Class6_Sub4_Sub6 local779 = Static33.method1021(); local779 != null; local779 = Static33.method1021()) {
			local409 = local779.method3830();
			local136 = local779.method3825();
			if (local409 == 1) {
				Static67.anIntArray106[local136] = local779.anInt4403;
				Static321.aBoolean451 |= Static30.aBooleanArray4[local136];
				Static512.anIntArray753[Static399.anInt9629++ & 0x1F] = local136;
			} else if (local409 == 2) {
				Static157.aStringArray44[local136] = local779.aString50;
				Static226.anIntArray305[Static238.anInt4881++ & 0x1F] = local136;
			} else if (local409 == 3) {
				local846 = Static223.method4011(local136);
				if (!local779.aString50.equals(local846.aString33)) {
					local846.aString33 = local779.aString50;
					Static468.method7221(local846);
				}
			} else if (local409 == 4) {
				local846 = Static223.method4011(local136);
				local200 = local779.anInt4403;
				local207 = local779.anInt4399;
				local218 = local779.anInt4405;
				if (local200 != local846.anInt2779 || local207 != local846.anInt2805 || local218 != local846.anInt2773) {
					local846.anInt2805 = local207;
					local846.anInt2779 = local200;
					local846.anInt2773 = local218;
					Static468.method7221(local846);
				}
			} else if (local409 == 5) {
				local846 = Static223.method4011(local136);
				if (local846.anInt2786 != local779.anInt4403 || local779.anInt4403 == -1) {
					local846.anInt2772 = 0;
					local846.anInt2786 = local779.anInt4403;
					local846.anInt2795 = 1;
					local846.anInt2737 = 0;
					Static468.method7221(local846);
				}
			} else if (local409 == 6) {
				local157 = local779.anInt4403;
				local200 = local157 >> 10 & 0x1F;
				local207 = local157 >> 5 & 0x1F;
				local218 = local157 & 0x1F;
				@Pc(940) int local940 = (local200 << 19) - (-(local207 << 11) - (local218 << 3));
				@Pc(944) Class93 local944 = Static223.method4011(local136);
				if (local940 != local944.anInt2821) {
					local944.anInt2821 = local940;
					Static468.method7221(local944);
				}
			} else if (local409 == 7) {
				local846 = Static223.method4011(local136);
				@Pc(1263) boolean local1263 = local779.anInt4403 == 1;
				if (local846.aBoolean234 != local1263) {
					local846.aBoolean234 = local1263;
					Static468.method7221(local846);
				}
			} else if (local409 == 8) {
				local846 = Static223.method4011(local136);
				if (local779.anInt4403 != local846.anInt2758 || local779.anInt4399 != local846.anInt2783 || local846.anInt2800 != local779.anInt4405) {
					local846.anInt2800 = local779.anInt4405;
					local846.anInt2783 = local779.anInt4399;
					local846.anInt2758 = local779.anInt4403;
					if (local846.anInt2822 != -1) {
						if (local846.anInt2809 > 0) {
							local846.anInt2800 = local846.anInt2800 * 32 / local846.anInt2809;
						} else if (local846.anInt2818 > 0) {
							local846.anInt2800 = local846.anInt2800 * 32 / local846.anInt2818;
						}
					}
					Static468.method7221(local846);
				}
			} else if (local409 == 9) {
				local846 = Static223.method4011(local136);
				if (local779.anInt4403 != local846.anInt2822 || local846.anInt2739 != local779.anInt4399) {
					local846.anInt2822 = local779.anInt4403;
					local846.anInt2739 = local779.anInt4399;
					Static468.method7221(local846);
				}
			} else if (local409 == 10) {
				local846 = Static223.method4011(local136);
				if (local846.anInt2814 != local779.anInt4403 || local846.anInt2754 != local779.anInt4399 || local779.anInt4405 != local846.anInt2816) {
					local846.anInt2754 = local779.anInt4399;
					local846.anInt2816 = local779.anInt4405;
					local846.anInt2814 = local779.anInt4403;
					Static468.method7221(local846);
				}
			} else if (local409 == 11) {
				local846 = Static223.method4011(local136);
				local846.aByte35 = 0;
				local846.anInt2753 = local846.anInt2817 = local779.anInt4403;
				local846.anInt2750 = local846.anInt2774 = local779.anInt4399;
				local846.aByte36 = 0;
				Static468.method7221(local846);
			} else if (local409 == 12) {
				local846 = Static223.method4011(local136);
				local200 = local779.anInt4403;
				if (local846 != null && local846.anInt2823 == 0) {
					if (local846.anInt2744 - local846.anInt2738 < local200) {
						local200 = local846.anInt2744 - local846.anInt2738;
					}
					if (local200 < 0) {
						local200 = 0;
					}
					if (local200 != local846.anInt2789) {
						local846.anInt2789 = local200;
						Static468.method7221(local846);
					}
				}
			} else if (local409 == 14) {
				local846 = Static223.method4011(local136);
				local846.anInt2765 = local779.anInt4403;
			} else if (local409 == 15) {
				Static350.anInt5889 = local779.anInt4403;
				Static184.aBoolean327 = true;
				Static484.anInt8777 = local779.anInt4399;
			} else if (local409 == 16) {
				local846 = Static223.method4011(local136);
				local846.anInt2778 = local779.anInt4403;
			}
		}
		Static388.anInt7269++;
		if (Static460.anInt8492 != 0) {
			Static450.anInt8253 += 20;
			if (Static450.anInt8253 >= 400) {
				Static460.anInt8492 = 0;
			}
		}
		if (Static83.aClass93_3 != null) {
			Static576.anInt9761++;
			if (Static576.anInt9761 >= 15) {
				Static468.method7221(Static83.aClass93_3);
				Static83.aClass93_3 = null;
			}
		}
		Static141.aClass93_9 = null;
		Static27.aClass93_1 = null;
		Static545.aBoolean697 = false;
		Static107.aBoolean206 = false;
		Static178.method3534(null, -1, -1);
		Static7.method509(-1, null, -1);
		if (!Static25.aBoolean80) {
			Static530.anInt9191 = -1;
		}
		Static252.method4422();
		Static32.anInt1035++;
		if (Static556.aBoolean705) {
			Static298.method4854(Static282.aClass181_64);
			Static547.aClass6_Sub26_Sub2_2.method4979(Static148.anInt9737 << 28 | Static344.anInt6661 << 14 | Static456.anInt8435);
			Static556.aBoolean705 = false;
		}
		while (true) {
			@Pc(1413) Class6_Sub38 local1413;
			@Pc(1418) Class93 local1418;
			do {
				local1413 = (Class6_Sub38) Static272.aClass211_36.method5180();
				if (local1413 == null) {
					while (true) {
						do {
							local1413 = (Class6_Sub38) Static46.aClass211_15.method5180();
							if (local1413 == null) {
								while (true) {
									do {
										local1413 = (Class6_Sub38) Static226.aClass211_30.method5180();
										if (local1413 == null) {
											if (Static141.aClass93_9 == null) {
												Static119.anInt2418 = 0;
											}
											if (Static122.aClass93_7 != null) {
												Static167.method3390();
											}
											if (Static456.anInt8437 > 0 && Static387.aClass273_1.method6617(82) && Static387.aClass273_1.method6617(81) && Static136.anInt2884 != 0) {
												local409 = Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 - Static136.anInt2884;
												if (local409 < 0) {
													local409 = 0;
												} else if (local409 > 3) {
													local409 = 3;
												}
												Static480.method7890(local409, Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] + Static191.anInt4147, Static247.anInt5049 - -Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0]);
											}
											Static388.method6099();
											for (local409 = 0; local409 < 5; local409++) {
												@Pc(1629) int local1629 = Static314.anIntArray573[local409]++;
											}
											if (Static321.aBoolean451 && Static110.aLong56 < Static174.method3502() - 60000L) {
												Static277.method4599();
											}
											for (@Pc(1656) Class5_Sub1_Sub2 local1656 = (Class5_Sub1_Sub2) Static188.aClass267_3.method6544(); local1656 != null; local1656 = (Class5_Sub1_Sub2) Static188.aClass267_3.method6543()) {
												if (Static174.method3502() / 1000L - 5L > (long) local1656.anInt4745) {
													if (local1656.aShort43 > 0) {
														Static277.method4595("", 5, "", "", 0, local1656.aString53 + Static222.aClass152_64.method4002(Static286.anInt5468));
													}
													if (local1656.aShort43 == 0) {
														Static277.method4595("", 5, "", "", 0, local1656.aString53 + Static222.aClass152_65.method4002(Static286.anInt5468));
													}
													local1656.method7282();
												}
											}
											Static66.anInt1548++;
											if (Static66.anInt1548 > 500) {
												Static66.anInt1548 = 0;
												local157 = (int) (Math.random() * 8.0D);
												if ((local157 & 0x4) == 4) {
													Static416.anInt7786 += Static130.anInt2837;
												}
												if ((local157 & 0x1) == 1) {
													Static379.anInt7108 += Static43.anInt1260;
												}
												if ((local157 & 0x2) == 2) {
													Static433.anInt7916 += Static566.anInt9597;
												}
											}
											if (Static379.anInt7108 < -50) {
												Static43.anInt1260 = 2;
											}
											if (Static379.anInt7108 > 50) {
												Static43.anInt1260 = -2;
											}
											if (Static433.anInt7916 < -55) {
												Static566.anInt9597 = 2;
											}
											if (Static416.anInt7786 < -40) {
												Static130.anInt2837 = 1;
											}
											if (Static433.anInt7916 > 55) {
												Static566.anInt9597 = -2;
											}
											Static223.anInt4665++;
											if (Static416.anInt7786 > 40) {
												Static130.anInt2837 = -1;
											}
											if (Static223.anInt4665 > 500) {
												Static223.anInt4665 = 0;
												local157 = (int) (Math.random() * 8.0D);
												if ((local157 & 0x1) == 1) {
													Static47.anInt1291 += Static381.anInt7170;
												}
												if ((local157 & 0x2) == 2) {
													Static146.anInt8629 += Static546.anInt9345;
												}
											}
											if (Static47.anInt1291 < -60) {
												Static381.anInt7170 = 2;
											}
											if (Static146.anInt8629 < -20) {
												Static546.anInt9345 = 1;
											}
											if (Static47.anInt1291 > 60) {
												Static381.anInt7170 = -2;
											}
											Static42.anInt1241++;
											if (Static146.anInt8629 > 10) {
												Static546.anInt9345 = -1;
											}
											if (Static42.anInt1241 > 50) {
												Static298.method4854(Static84.aClass181_21);
											}
											if (Static245.aBoolean377) {
												Static105.method2178();
												Static245.aBoolean377 = false;
											}
											try {
												if (Static52.aClass64_1 != null && Static547.aClass6_Sub26_Sub2_2.anInt5769 > 0) {
													Static31.anInt1034 += Static547.aClass6_Sub26_Sub2_2.anInt5769;
													Static52.aClass64_1.method1819(Static547.aClass6_Sub26_Sub2_2.anInt5769, Static547.aClass6_Sub26_Sub2_2.aByteArray65);
													Static547.aClass6_Sub26_Sub2_2.anInt5769 = 0;
													Static42.anInt1241 = 0;
													return;
												}
												return;
											} catch (@Pc(1912) IOException local1912) {
												Static439.method6698();
												return;
											}
										}
										local1418 = local1413.aClass93_14;
										if (local1418.anInt2806 < 0) {
											break;
										}
										local846 = Static223.method4011(local1418.anInt2820);
									} while (local846 == null || local846.aClass93Array4 == null || local846.aClass93Array4.length <= local1418.anInt2806 || local1418 != local846.aClass93Array4[local1418.anInt2806]);
									Static89.method1979(local1413);
								}
							}
							local1418 = local1413.aClass93_14;
							if (local1418.anInt2806 < 0) {
								break;
							}
							local846 = Static223.method4011(local1418.anInt2820);
						} while (local846 == null || local846.aClass93Array4 == null || local846.aClass93Array4.length <= local1418.anInt2806 || local1418 != local846.aClass93Array4[local1418.anInt2806]);
						Static89.method1979(local1413);
					}
				}
				local1418 = local1413.aClass93_14;
				if (local1418.anInt2806 < 0) {
					break;
				}
				local846 = Static223.method4011(local1418.anInt2820);
			} while (local846 == null || local846.aClass93Array4 == null || local1418.anInt2806 >= local846.aClass93Array4.length || local1418 != local846.aClass93Array4[local1418.anInt2806]);
			Static89.method1979(local1413);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IFIIIII[FII)V")
	public static void method5333(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg3 - arg2;
		@Pc(13) int local13 = arg7 - arg1;
		@Pc(17) int local17 = arg5 - arg4;
		@Pc(38) float local38 = arg6[2] * (float) local13 + (float) local17 * arg6[0] + (float) local9 * arg6[1];
		@Pc(59) float local59 = arg6[4] * (float) local9 + (float) local17 * arg6[3] + (float) local13 * arg6[5];
		@Pc(80) float local80 = arg6[8] * (float) local13 + arg6[6] * (float) local17 + arg6[7] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(110) float local110 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg0 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(130) float local130;
		if (arg8 == 1) {
			local130 = local110;
			local110 = -local123;
			local123 = local130;
		} else if (arg8 == 2) {
			local110 = -local110;
			local123 = -local123;
		} else if (arg8 == 3) {
			local130 = local110;
			local110 = local123;
			local123 = -local130;
		}
		Static141.aFloat51 = local110;
		Static227.aFloat105 = local123;
	}
}
