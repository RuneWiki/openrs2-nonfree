import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_196 = new Class81(34, -2);

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_55 = new Class265();

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_197 = new Class81(101, 6);

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
	public static int anInt7590 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public static void method5884() {
		if (Static182.anInt7663 > 1) {
			Static432.anInt7520 = Static331.anInt5891;
			Static182.anInt7663--;
		}
		if (Static125.anInt2472 > 0) {
			Static125.anInt2472--;
		}
		if (Static414.aBoolean377) {
			Static414.aBoolean377 = false;
			Static83.method1461();
			return;
		}
		if (!Static237.aBoolean384) {
			Static303.method4368();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static193.method3019(); local35++) {
		}
		if (Static297.anInt5339 != 30) {
			return;
		}
		Static262.method3938(Static98.aClass2_Sub20_Sub1_1, Static47.aClass44_18.method1215());
		if (Static310.aClass2_Sub29_2 == null) {
			if (Static208.method3182() >= Static267.aLong147) {
				Static310.aClass2_Sub29_2 = Static316.aClass153_1.method3557(Static373.aString7);
			}
		} else if (Static310.aClass2_Sub29_2.anInt4816 != -1) {
			Static448.method6059(Static301.aClass44_69);
			Static98.aClass2_Sub20_Sub1_1.method3745(Static310.aClass2_Sub29_2.anInt4816);
			Static310.aClass2_Sub29_2 = null;
			Static267.aLong147 = Static208.method3182() + 30000L;
		}
		@Pc(96) Class2_Sub6 local96 = (Class2_Sub6) Static36.aClass265_2.method6005();
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(154) int local154;
		@Pc(169) boolean local169;
		@Pc(224) int local224;
		@Pc(231) int local231;
		@Pc(242) int local242;
		if (local96 != null || Static120.aLong68 < Static208.method3182() - 2000L) {
			@Pc(111) boolean local111 = false;
			local114 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
			for (@Pc(119) Class2_Sub6 local119 = (Class2_Sub6) Static384.aClass265_47.method6005(); local119 != null && Static98.aClass2_Sub20_Sub1_1.anInt4608 - local114 < 240; local119 = (Class2_Sub6) Static384.aClass265_47.method6001()) {
				local119.method6072();
				local137 = local119.method771();
				if (local137 < 0) {
					local137 = 0;
				} else if (local137 > 65534) {
					local137 = 65534;
				}
				local154 = local119.method772();
				if (local154 < 0) {
					local154 = 0;
				} else if (local154 > 65534) {
					local154 = 65534;
				}
				local169 = false;
				if (local119.method771() == -1 && local119.method772() == -1) {
					local154 = -1;
					local137 = -1;
					local169 = true;
				}
				if (local154 != Static282.anInt5155 || Static213.anInt4107 != local137) {
					if (!local111) {
						Static448.method6059(Static318.aClass44_75);
						Static98.aClass2_Sub20_Sub1_1.method3699(0);
						local114 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
						local111 = true;
					}
					local224 = local154 - Static282.anInt5155;
					Static282.anInt5155 = local154;
					local231 = local137 - Static213.anInt4107;
					Static213.anInt4107 = local137;
					local242 = (int) ((local119.method770() - Static120.aLong68) / 20L);
					if (local242 < 8 && local224 >= -32 && local224 <= 31 && local231 >= -32 && local231 <= 31) {
						local231 += 32;
						local224 += 32;
						Static98.aClass2_Sub20_Sub1_1.method3745(local231 + (local242 << 12) + (local224 << 6));
					} else if (local242 < 32 && local224 >= -128 && local224 <= 127 && local231 >= -128 && local231 <= 127) {
						local224 += 128;
						local231 += 128;
						Static98.aClass2_Sub20_Sub1_1.method3699(local242 + 128);
						Static98.aClass2_Sub20_Sub1_1.method3745((local224 << 8) + local231);
					} else if (local242 >= 32) {
						Static98.aClass2_Sub20_Sub1_1.method3745(local242 + 57344);
						if (local169) {
							Static98.aClass2_Sub20_Sub1_1.method3713(Integer.MIN_VALUE);
						} else {
							Static98.aClass2_Sub20_Sub1_1.method3713(local154 | local137 << 16);
						}
					} else {
						Static98.aClass2_Sub20_Sub1_1.method3699(local242 + 192);
						if (local169) {
							Static98.aClass2_Sub20_Sub1_1.method3713(Integer.MIN_VALUE);
						} else {
							Static98.aClass2_Sub20_Sub1_1.method3713(local154 | local137 << 16);
						}
					}
					Static120.aLong68 = local119.method770();
				}
			}
			if (local111) {
				Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local114);
			}
		}
		@Pc(417) int local417;
		@Pc(468) int local468;
		if (local96 != null) {
			@Pc(403) long local403 = (local96.method770() - Static11.aLong13) / 50L;
			Static11.aLong13 = local96.method770();
			if (local403 > 32767L) {
				local403 = 32767L;
			}
			local417 = local96.method771();
			if (local417 < 0) {
				local417 = 0;
			} else if (local417 > 65535) {
				local417 = 65535;
			}
			local137 = local96.method772();
			if (local137 < 0) {
				local137 = 0;
			} else if (local137 > 65535) {
				local137 = 65535;
			}
			@Pc(452) byte local452 = 0;
			if (local96.method774() == 2) {
				local452 = 1;
			}
			local468 = (int) local403;
			Static448.method6059(Static1.aClass44_2);
			Static98.aClass2_Sub20_Sub1_1.method3705(local417 << 16 | local137);
			Static98.aClass2_Sub20_Sub1_1.method3745(local452 << 15 | local468);
		}
		@Pc(493) int local493;
		if (Static357.anInt3690 > 0) {
			local493 = 0;
			for (local114 = 0; local114 < Static357.anInt3690; local114++) {
				if (Static347.aClass42Array1[local114].method1204()) {
					local493++;
				}
			}
			if (local493 > 0) {
				Static448.method6059(Static4.aClass44_3);
				if (local493 > 75) {
					local493 = 75;
				}
				Static98.aClass2_Sub20_Sub1_1.method3699(local493 * 3);
				for (local417 = 0; local417 < Static357.anInt3690; local417++) {
					@Pc(546) Class42 local546 = Static347.aClass42Array1[local417];
					if (local546.method1204()) {
						@Pc(559) long local559 = (local546.method1199() - Static182.aLong224) / 50L;
						Static182.aLong224 = local546.method1199();
						if (local559 > 65535L) {
							local559 = 65535L;
						}
						Static98.aClass2_Sub20_Sub1_1.method3699(local546.method1202());
						Static98.aClass2_Sub20_Sub1_1.method3745((int) local559);
					}
				}
			}
		}
		if (Static166.anInt3210 > 0) {
			Static166.anInt3210--;
		}
		if (Static18.aBoolean33 && Static166.anInt3210 <= 0) {
			Static166.anInt3210 = 20;
			Static18.aBoolean33 = false;
			Static448.method6059(Static153.aClass44_39);
			Static98.aClass2_Sub20_Sub1_1.method3697((int) Static203.aFloat130 >> 3);
			Static98.aClass2_Sub20_Sub1_1.method3697((int) Static328.aFloat179 >> 3);
		}
		if (Static30.aBoolean591 && !Static310.aBoolean472) {
			Static310.aBoolean472 = true;
			Static448.method6059(Static279.aClass44_65);
			Static98.aClass2_Sub20_Sub1_1.method3699(1);
		}
		if (!Static30.aBoolean591 && Static310.aBoolean472) {
			Static310.aBoolean472 = false;
			Static448.method6059(Static279.aClass44_65);
			Static98.aClass2_Sub20_Sub1_1.method3699(0);
		}
		if (!Static45.aBoolean626) {
			Static448.method6059(Static242.aClass44_58);
			Static98.aClass2_Sub20_Sub1_1.method3699(0);
			local493 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
			@Pc(681) Class2_Sub20 local681 = Static399.aClass167_Sub1_1.method4526();
			Static98.aClass2_Sub20_Sub1_1.method3710(local681.anInt4608, local681.aByteArray136);
			Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local493);
			Static45.aBoolean626 = true;
		}
		if (Static176.aClass113ArrayArrayArray3 != null) {
			if (Static65.anInt7824 == 2) {
				Static317.method4543();
			} else if (Static65.anInt7824 == 3) {
				Static180.method2819();
			}
		}
		if (Static72.aBoolean290) {
			Static72.aBoolean290 = false;
		} else {
			Static83.aFloat67 /= 2.0F;
		}
		if (Static34.aBoolean56) {
			Static34.aBoolean56 = false;
		} else {
			Static317.aFloat171 /= 2.0F;
		}
		Static382.method5308();
		if (Static297.anInt5339 != 30) {
			return;
		}
		Static136.method1991();
		Static79.method1389();
		Static193.method3018();
		Static339.method4781();
		Static325.anInt5840++;
		if (Static325.anInt5840 > 750) {
			Static83.method1461();
			return;
		}
		Static40.method735();
		Static313.method4438();
		Static354.method4964();
		for (local493 = Static215.aClass225_1.method5151(true); local493 != -1; local493 = Static215.aClass225_1.method5151(false)) {
			Static253.method3876(local493);
			Static441.anIntArray506[Static358.anInt6319++ & 0x1F] = local493;
		}
		@Pc(841) Class41 local841;
		for (@Pc(807) Class2_Sub2_Sub2 local807 = Static424.method5742(); local807 != null; local807 = Static424.method5742()) {
			local417 = local807.method439();
			local137 = local807.method438();
			if (local417 == 1) {
				Static299.anIntArray357[local137] = local807.anInt657;
				Static442.aBoolean663 |= Static381.aBooleanArray48[local137];
				Static385.anIntArray454[Static96.anInt2174++ & 0x1F] = local137;
			} else if (local417 == 2) {
				Static227.aStringArray21[local137] = local807.aString2;
				Static203.anIntArray260[Static64.anInt1758++ & 0x1F] = local137;
			} else if (local417 == 3) {
				local841 = Static160.method2564(local137);
				if (!local807.aString2.equals(local841.aString11)) {
					local841.aString11 = local807.aString2;
					Static168.method2616(local841);
				}
			} else if (local417 == 4) {
				local841 = Static160.method2564(local137);
				local468 = local807.anInt657;
				local224 = local807.anInt656;
				local231 = local807.anInt659;
				if (local841.anInt1662 != local468 || local841.anInt1659 != local224 || local231 != local841.anInt1608) {
					local841.anInt1662 = local468;
					local841.anInt1608 = local231;
					local841.anInt1659 = local224;
					Static168.method2616(local841);
				}
			} else if (local417 == 5) {
				local841 = Static160.method2564(local137);
				if (local807.anInt657 != local841.anInt1605 || local807.anInt657 == -1) {
					local841.anInt1645 = 1;
					local841.anInt1680 = 0;
					local841.anInt1605 = local807.anInt657;
					local841.anInt1640 = 0;
					Static168.method2616(local841);
				}
			} else if (local417 == 6) {
				local154 = local807.anInt657;
				local468 = local154 >> 10 & 0x1F;
				local224 = local154 >> 5 & 0x1F;
				local231 = local154 & 0x1F;
				local242 = (local224 << 11) + ((local468 << 19) + (local231 << 3));
				@Pc(937) Class41 local937 = Static160.method2564(local137);
				if (local242 != local937.anInt1617) {
					local937.anInt1617 = local242;
					Static168.method2616(local937);
				}
			} else if (local417 == 7) {
				local841 = Static160.method2564(local137);
				local169 = local807.anInt657 == 1;
				if (local169 != local841.aBoolean139) {
					local841.aBoolean139 = local169;
					Static168.method2616(local841);
				}
			} else if (local417 == 8) {
				local841 = Static160.method2564(local137);
				if (local841.anInt1684 != local807.anInt657 || local807.anInt656 != local841.anInt1681 || local841.anInt1615 != local807.anInt659) {
					local841.anInt1615 = local807.anInt659;
					local841.anInt1681 = local807.anInt656;
					local841.anInt1684 = local807.anInt657;
					if (local841.anInt1671 != -1) {
						if (local841.anInt1649 > 0) {
							local841.anInt1615 = local841.anInt1615 * 32 / local841.anInt1649;
						} else if (local841.anInt1674 > 0) {
							local841.anInt1615 = local841.anInt1615 * 32 / local841.anInt1674;
						}
					}
					Static168.method2616(local841);
				}
			} else if (local417 == 9) {
				local841 = Static160.method2564(local137);
				if (local841.anInt1671 != local807.anInt657 || local841.anInt1678 != local807.anInt656) {
					local841.anInt1671 = local807.anInt657;
					local841.anInt1678 = local807.anInt656;
					Static168.method2616(local841);
				}
			} else if (local417 == 10) {
				local841 = Static160.method2564(local137);
				if (local841.anInt1600 != local807.anInt657 || local841.anInt1668 != local807.anInt656 || local807.anInt659 != local841.anInt1627) {
					local841.anInt1600 = local807.anInt657;
					local841.anInt1668 = local807.anInt656;
					local841.anInt1627 = local807.anInt659;
					Static168.method2616(local841);
				}
			} else if (local417 == 11) {
				local841 = Static160.method2564(local137);
				local841.aByte11 = 0;
				local841.aByte10 = 0;
				local841.anInt1675 = local841.anInt1638 = local807.anInt656;
				local841.anInt1618 = local841.anInt1633 = local807.anInt657;
				Static168.method2616(local841);
			} else if (local417 == 12) {
				local841 = Static160.method2564(local137);
				local468 = local807.anInt657;
				if (local841 != null && local841.anInt1642 == 0) {
					if (local468 > local841.anInt1635 - local841.anInt1599) {
						local468 = local841.anInt1635 - local841.anInt1599;
					}
					if (local468 < 0) {
						local468 = 0;
					}
					if (local841.anInt1620 != local468) {
						local841.anInt1620 = local468;
						Static168.method2616(local841);
					}
				}
			} else if (local417 == 14) {
				local841 = Static160.method2564(local137);
				local841.anInt1612 = local807.anInt657;
			} else if (local417 == 15) {
				Static425.anInt5530 = local807.anInt657;
				Static176.anInt3417 = local807.anInt656;
				Static226.aBoolean362 = true;
			} else if (local417 == 16) {
				local841 = Static160.method2564(local137);
				local841.anInt1672 = local807.anInt657;
			}
		}
		Static305.anInt1351++;
		if (Static243.anInt4531 != 0) {
			Static342.anInt6039 += 20;
			if (Static342.anInt6039 >= 400) {
				Static243.anInt4531 = 0;
			}
		}
		if (Static201.aClass41_8 != null) {
			Static430.anInt7474++;
			if (Static430.anInt7474 >= 15) {
				Static168.method2616(Static201.aClass41_8);
				Static201.aClass41_8 = null;
			}
		}
		Static238.aBoolean374 = false;
		Static153.aClass41_6 = null;
		Static22.aClass41_1 = null;
		Static30.aBoolean590 = false;
		Static112.method1693(null, -1, -1);
		Static189.method2982(-1, null, -1);
		if (!Static428.aBoolean637) {
			Static217.anInt490 = -1;
		}
		Static320.method6027();
		Static331.anInt5891++;
		if (Static112.aBoolean194) {
			Static448.method6059(Static108.aClass44_30);
			Static98.aClass2_Sub20_Sub1_1.method3726(Static342.anInt6040 << 14 | Static211.anInt4063 << 28 | Static419.anInt7350);
			Static112.aBoolean194 = false;
		}
		while (true) {
			@Pc(1457) Class2_Sub14 local1457;
			@Pc(1462) Class41 local1462;
			do {
				local1457 = (Class2_Sub14) Static237.aClass265_37.method5995();
				if (local1457 == null) {
					while (true) {
						do {
							local1457 = (Class2_Sub14) Static275.aClass265_52.method5995();
							if (local1457 == null) {
								while (true) {
									do {
										local1457 = (Class2_Sub14) aClass265_55.method5995();
										if (local1457 == null) {
											if (Static22.aClass41_1 == null) {
												Static93.anInt2136 = 0;
											}
											if (Static191.aClass41_7 != null) {
												Static119.method1743();
											}
											if (Static255.anInt4802 > 0 && Static428.aClass52_1.method1347(82) && Static428.aClass52_1.method1347(81) && Static89.anInt2016 != 0) {
												local417 = Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 - Static89.anInt2016;
												if (local417 < 0) {
													local417 = 0;
												} else if (local417 > 3) {
													local417 = 3;
												}
												Static39.method725(Static379.anInt6721 + Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray437[0], local417, Static173.anInt3340 + Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray436[0]);
											}
											Static168.method2620();
											for (local417 = 0; local417 < 5; local417++) {
												@Pc(1665) int local1665 = Static38.anIntArray45[local417]++;
											}
											if (Static442.aBoolean663 && Static256.aLong143 < Static208.method3182() - 60000L) {
												Static211.method3261();
											}
											Static43.anInt1147++;
											if (Static43.anInt1147 > 500) {
												Static43.anInt1147 = 0;
												local137 = (int) (Math.random() * 8.0D);
												if ((local137 & 0x1) == 1) {
													Static261.anInt5570 += Static357.anInt3689;
												}
												if ((local137 & 0x2) == 2) {
													Static390.anInt6847 += Static310.anInt5450;
												}
												if ((local137 & 0x4) == 4) {
													Static90.anInt2061 += Static102.anInt2185;
												}
											}
											if (Static261.anInt5570 < -50) {
												Static357.anInt3689 = 2;
											}
											if (Static261.anInt5570 > 50) {
												Static357.anInt3689 = -2;
											}
											if (Static390.anInt6847 < -55) {
												Static310.anInt5450 = 2;
											}
											if (Static90.anInt2061 < -40) {
												Static102.anInt2185 = 1;
											}
											if (Static390.anInt6847 > 55) {
												Static310.anInt5450 = -2;
											}
											Static77.anInt7113++;
											if (Static90.anInt2061 > 40) {
												Static102.anInt2185 = -1;
											}
											if (Static77.anInt7113 > 500) {
												Static77.anInt7113 = 0;
												local137 = (int) (Math.random() * 8.0D);
												if ((local137 & 0x1) == 1) {
													Static357.anInt3686 += Static172.anInt3305;
												}
												if ((local137 & 0x2) == 2) {
													Static119.anInt2384 += Static36.anInt813;
												}
											}
											if (Static357.anInt3686 < -60) {
												Static172.anInt3305 = 2;
											}
											if (Static357.anInt3686 > 60) {
												Static172.anInt3305 = -2;
											}
											if (Static119.anInt2384 < -20) {
												Static36.anInt813 = 1;
											}
											Static265.anInt7238++;
											if (Static119.anInt2384 > 10) {
												Static36.anInt813 = -1;
											}
											if (Static265.anInt7238 > 50) {
												Static448.method6059(Static37.aClass44_12);
											}
											if (Static277.aBoolean431) {
												Static19.method264();
												Static277.aBoolean431 = false;
											}
											try {
												if (Static423.aClass199_11 != null && Static98.aClass2_Sub20_Sub1_1.anInt4608 > 0) {
													Static300.anInt5373 += Static98.aClass2_Sub20_Sub1_1.anInt4608;
													Static423.aClass199_11.method4484(Static98.aClass2_Sub20_Sub1_1.aByteArray136, Static98.aClass2_Sub20_Sub1_1.anInt4608);
													Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
													Static265.anInt7238 = 0;
													return;
												}
												return;
											} catch (@Pc(1876) IOException local1876) {
												Static83.method1461();
												return;
											}
										}
										local1462 = local1457.aClass41_5;
										if (local1462.anInt1683 < 0) {
											break;
										}
										local841 = Static160.method2564(local1462.anInt1663);
									} while (local841 == null || local841.aClass41Array1 == null || local1462.anInt1683 >= local841.aClass41Array1.length || local1462 != local841.aClass41Array1[local1462.anInt1683]);
									Static290.method4227(local1457);
								}
							}
							local1462 = local1457.aClass41_5;
							if (local1462.anInt1683 < 0) {
								break;
							}
							local841 = Static160.method2564(local1462.anInt1663);
						} while (local841 == null || local841.aClass41Array1 == null || local1462.anInt1683 >= local841.aClass41Array1.length || local1462 != local841.aClass41Array1[local1462.anInt1683]);
						Static290.method4227(local1457);
					}
				}
				local1462 = local1457.aClass41_5;
				if (local1462.anInt1683 < 0) {
					break;
				}
				local841 = Static160.method2564(local1462.anInt1663);
			} while (local841 == null || local841.aClass41Array1 == null || local1462.anInt1683 >= local841.aClass41Array1.length || local1462 != local841.aClass41Array1[local1462.anInt1683]);
			Static290.method4227(local1457);
		}
	}
}
