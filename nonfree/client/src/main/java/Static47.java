import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_8;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!da;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!pa;")
	public static Class5_Sub14 aClass5_Sub14_4;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!na;")
	public static Class5_Sub14_Sub1 aClass5_Sub14_Sub1_2 = new Class5_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_366 = Static129.method2060("<col=00ffff>");

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_367 = Static129.method2060("Wordpack geladen)3");

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_368 = Static129.method2060(")4l");

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!r;")
	private static Class61 aClass61_372 = Static129.method2060("Loading)3)3)3");

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!r;")
	public static Class61 aClass61_369 = aClass61_372;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_370 = Static129.method2060("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public static int anInt1221 = 0;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!r;")
	private static Class61 aClass61_373 = Static129.method2060("Choose Option");

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!r;")
	public static Class61 aClass61_371 = aClass61_373;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method856() {
		aClass61_368 = null;
		aClass61_367 = null;
		aClass26_Sub1_8 = null;
		aClass61_372 = null;
		aClass15_1 = null;
		aClass5_Sub14_4 = null;
		aClass61_369 = null;
		aClass61_370 = null;
		aClass61_371 = null;
		aClass5_Sub14_Sub1_2 = null;
		aClass61_373 = null;
		aClass61_366 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!r;ILclient!r;BLclient!r;)V")
	public static void method857(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(4) Class61 arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static121.anIntArray362[local7] = Static121.anIntArray362[local7 - 1];
			Static21.aClass61Array4[local7] = Static21.aClass61Array4[local7 - 1];
			Static70.aClass61Array12[local7] = Static70.aClass61Array12[local7 - 1];
			Static68.aClass61Array11[local7] = Static68.aClass61Array11[local7 - 1];
		}
		Static30.anInt921 = Static66.anInt1592;
		Static121.anIntArray362[0] = arg1;
		Static21.aClass61Array4[0] = arg2;
		Static4.anInt2613++;
		Static70.aClass61Array12[0] = arg3;
		Static68.aClass61Array11[0] = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBI)I")
	public static int method859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg2 /= 2;
		}
		if (arg0 > 192) {
			arg2 /= 2;
		}
		if (arg0 > 217) {
			arg2 /= 2;
		}
		if (arg0 > 243) {
			arg2 /= 2;
		}
		return (arg1 / 4 << 10) + ((arg2 / 32 << 7) + (arg0 / 2));
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBII[Lclient!ke;II)V")
	public static void method860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub11[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(16) int local16 = 0; local16 < arg5.length; local16++) {
			@Pc(22) Class5_Sub11 local22 = arg5[local16];
			if (local22 != null && (!local22.aBoolean66 || local22.anInt1669 == 0 || local22.aBoolean64 || Static42.method755(local22) != 0 || Static68.aClass5_Sub11_6 == local22) && local22.anInt1681 == arg0 && (!local22.aBoolean66 || !Static79.method1300(local22))) {
				@Pc(63) int local63 = local22.anInt1665 + arg6;
				@Pc(69) int local69 = local22.anInt1661 + arg4;
				if (Static86.aClass5_Sub11_8 == local22) {
					Static114.aBoolean104 = true;
					Static74.anInt1769 = local63;
					Static2.anInt19 = local69;
				}
				@Pc(97) int local97;
				@Pc(108) int local108;
				@Pc(138) int local138;
				@Pc(131) int local131;
				@Pc(169) int local169;
				if (local22.anInt1669 == 2) {
					local108 = arg2;
					local131 = arg1;
					local97 = arg3;
					local138 = arg7;
				} else {
					@Pc(114) int local114;
					@Pc(120) int local120;
					if (local22.anInt1669 == 9) {
						local114 = local63;
						local120 = local69;
						@Pc(149) int local149 = local22.anInt1653 + local63;
						if (local149 < local63) {
							local114 = local149;
							local149 = local63;
						}
						local149++;
						local169 = local69 + local22.anInt1636;
						local138 = local149 < arg7 ? local149 : arg7;
						local97 = local114 <= arg3 ? arg3 : local114;
						if (local69 > local169) {
							local120 = local169;
							local169 = local69;
						}
						local169++;
						local131 = arg1 <= local169 ? arg1 : local169;
						local108 = local120 <= arg2 ? arg2 : local120;
					} else {
						local97 = arg3 >= local63 ? arg3 : local63;
						local108 = local69 > arg2 ? local69 : arg2;
						local114 = local63 + local22.anInt1653;
						local120 = local69 + local22.anInt1636;
						local131 = arg1 > local120 ? local120 : arg1;
						local138 = arg7 <= local114 ? arg7 : local114;
					}
				}
				if (!local22.aBoolean66 || local97 < local138 && local108 < local131) {
					if (local22.anInt1627 == 1337) {
						Static24.method505(local22);
					} else if (local22.anInt1627 == 1338) {
						Static70.method1157(local63, local69);
					} else {
						if (local22.anInt1669 == 0) {
							if (!local22.aBoolean66 && Static79.method1300(local22) && Static127.aClass5_Sub11_14 != local22) {
								continue;
							}
							method860(local22.anInt1614, local131, local108, local97, local69 - local22.anInt1660, arg5, local63 - local22.anInt1640, local138);
							if (local22.aClass5_Sub11Array1 != null) {
								method860(local22.anInt1614, local131, local108, local97, local69 - local22.anInt1660, local22.aClass5_Sub11Array1, local63 - local22.anInt1640, local138);
							}
							@Pc(325) Class5_Sub13 local325 = (Class5_Sub13) Static28.aClass20_3.method656((long) local22.anInt1614);
							if (local325 != null) {
								Static17.method404(local325.anInt2013, local63, local108, local138, local131, local97, local69);
							}
						}
						if (local22.aBoolean66) {
							@Pc(342) boolean local342 = false;
							@Pc(360) boolean local360;
							if (local97 <= Static30.anInt917 && local108 <= Static40.anInt1073 && Static30.anInt917 < local138 && Static40.anInt1073 < local131) {
								local360 = true;
							} else {
								local360 = false;
							}
							if (Static8.anInt190 == 1 && local360) {
								local342 = true;
							}
							@Pc(375) boolean local375 = false;
							if (Static75.anInt1772 == 1 && Static26.anInt613 >= local97 && Static12.anInt308 >= local108 && local138 > Static26.anInt613 && Static12.anInt308 < local131) {
								local375 = true;
							}
							if (local375) {
								Static27.method1853(local22, Static26.anInt613 - local63, -local69 + Static12.anInt308);
							}
							if (Static86.aClass5_Sub11_8 != null && local22 != Static86.aClass5_Sub11_8 && local360 && Static21.method463(Static42.method755(local22))) {
								Static4.aClass5_Sub11_10 = local22;
							}
							if (local22 == Static68.aClass5_Sub11_6) {
								Static30.anInt926 = local63;
								Static118.anInt3021 = local69;
								Static99.aBoolean95 = true;
							}
							if (local22.aBoolean64) {
								@Pc(448) Class5_Sub22 local448;
								if (local360 && Static90.anInt2381 != 0 && local22.anObjectArray7 != null) {
									local448 = new Class5_Sub22();
									local448.anObjectArray28 = local22.anObjectArray7;
									local448.anInt2980 = Static90.anInt2381;
									local448.aClass5_Sub11_12 = local22;
									Static1.aClass58_1.method1663(local448);
								}
								if (Static86.aClass5_Sub11_8 != null || Static115.aClass5_Sub11_13 != null || Static117.aBoolean105) {
									local342 = false;
									local375 = false;
									local360 = false;
								}
								if (!local22.aBoolean60 && local375) {
									local22.aBoolean60 = true;
									if (local22.anObjectArray11 != null) {
										local448 = new Class5_Sub22();
										local448.anInt2981 = Static26.anInt613 - local63;
										local448.aClass5_Sub11_12 = local22;
										local448.anObjectArray28 = local22.anObjectArray11;
										local448.anInt2980 = Static12.anInt308 - local69;
										Static1.aClass58_1.method1663(local448);
									}
								}
								if (local22.aBoolean60 && local342 && local22.anObjectArray9 != null) {
									local448 = new Class5_Sub22();
									local448.aClass5_Sub11_12 = local22;
									local448.anObjectArray28 = local22.anObjectArray9;
									local448.anInt2981 = Static30.anInt917 - local63;
									local448.anInt2980 = Static40.anInt1073 - local69;
									Static1.aClass58_1.method1663(local448);
								}
								if (local22.aBoolean60 && !local342) {
									local22.aBoolean60 = false;
									if (local22.anObjectArray24 != null) {
										local448 = new Class5_Sub22();
										local448.aClass5_Sub11_12 = local22;
										local448.anObjectArray28 = local22.anObjectArray24;
										local448.anInt2981 = Static30.anInt917 - local63;
										local448.anInt2980 = Static40.anInt1073 - local69;
										Static101.aClass58_60.method1663(local448);
									}
								}
								if (local342 && local22.anObjectArray18 != null) {
									local448 = new Class5_Sub22();
									local448.anObjectArray28 = local22.anObjectArray18;
									local448.aClass5_Sub11_12 = local22;
									local448.anInt2981 = Static30.anInt917 - local63;
									local448.anInt2980 = Static40.anInt1073 - local69;
									Static1.aClass58_1.method1663(local448);
								}
								if (!local22.aBoolean62 && local360) {
									local22.aBoolean62 = true;
									if (local22.anObjectArray27 != null) {
										local448 = new Class5_Sub22();
										local448.anInt2980 = Static40.anInt1073 - local69;
										local448.aClass5_Sub11_12 = local22;
										local448.anObjectArray28 = local22.anObjectArray27;
										local448.anInt2981 = Static30.anInt917 - local63;
										Static1.aClass58_1.method1663(local448);
									}
								}
								if (local22.aBoolean62 && local360 && local22.anObjectArray16 != null) {
									local448 = new Class5_Sub22();
									local448.anInt2980 = Static40.anInt1073 - local69;
									local448.aClass5_Sub11_12 = local22;
									local448.anInt2981 = Static30.anInt917 - local63;
									local448.anObjectArray28 = local22.anObjectArray16;
									Static1.aClass58_1.method1663(local448);
								}
								if (local22.aBoolean62 && !local360) {
									local22.aBoolean62 = false;
									if (local22.anObjectArray13 != null) {
										local448 = new Class5_Sub22();
										local448.anInt2981 = Static30.anInt917 - local63;
										local448.aClass5_Sub11_12 = local22;
										local448.anInt2980 = Static40.anInt1073 - local69;
										local448.anObjectArray28 = local22.anObjectArray13;
										Static101.aClass58_60.method1663(local448);
									}
								}
								if (local22.anObjectArray21 != null) {
									local448 = new Class5_Sub22();
									local448.anObjectArray28 = local22.anObjectArray21;
									local448.aClass5_Sub11_12 = local22;
									Static80.aClass58_43.method1663(local448);
								}
								@Pc(779) int local779;
								@Pc(781) int local781;
								@Pc(797) Class5_Sub22 local797;
								if (local22.anObjectArray6 != null && Static89.anInt2365 > local22.anInt1622) {
									if (local22.anIntArray243 == null || Static89.anInt2365 - local22.anInt1622 > 32) {
										local448 = new Class5_Sub22();
										local448.anObjectArray28 = local22.anObjectArray6;
										local448.aClass5_Sub11_12 = local22;
										Static1.aClass58_1.method1663(local448);
									} else {
										label369: for (local169 = local22.anInt1622; local169 < Static89.anInt2365; local169++) {
											local779 = Static65.anIntArray235[local169 & 0x1F];
											for (local781 = 0; local781 < local22.anIntArray243.length; local781++) {
												if (local779 == local22.anIntArray243[local781]) {
													local797 = new Class5_Sub22();
													local797.aClass5_Sub11_12 = local22;
													local797.anObjectArray28 = local22.anObjectArray6;
													Static1.aClass58_1.method1663(local797);
													break label369;
												}
											}
										}
									}
									local22.anInt1622 = Static89.anInt2365;
								}
								if (local22.anObjectArray10 != null && Static24.anInt725 > local22.anInt1682) {
									if (local22.anIntArray247 == null || Static24.anInt725 - local22.anInt1682 > 32) {
										local448 = new Class5_Sub22();
										local448.anObjectArray28 = local22.anObjectArray10;
										local448.aClass5_Sub11_12 = local22;
										Static1.aClass58_1.method1663(local448);
									} else {
										label349: for (local169 = local22.anInt1682; local169 < Static24.anInt725; local169++) {
											local779 = Static13.anIntArray74[local169 & 0x1F];
											for (local781 = 0; local781 < local22.anIntArray247.length; local781++) {
												if (local22.anIntArray247[local781] == local779) {
													local797 = new Class5_Sub22();
													local797.aClass5_Sub11_12 = local22;
													local797.anObjectArray28 = local22.anObjectArray10;
													Static1.aClass58_1.method1663(local797);
													break label349;
												}
											}
										}
									}
									local22.anInt1682 = Static24.anInt725;
								}
								if (local22.anObjectArray12 != null && local22.anInt1623 < Static101.anInt2695) {
									if (local22.anIntArray244 == null || Static101.anInt2695 - local22.anInt1623 > 32) {
										local448 = new Class5_Sub22();
										local448.aClass5_Sub11_12 = local22;
										local448.anObjectArray28 = local22.anObjectArray12;
										Static1.aClass58_1.method1663(local448);
									} else {
										label329: for (local169 = local22.anInt1623; local169 < Static101.anInt2695; local169++) {
											local779 = Static74.anIntArray257[local169 & 0x1F];
											for (local781 = 0; local781 < local22.anIntArray244.length; local781++) {
												if (local779 == local22.anIntArray244[local781]) {
													local797 = new Class5_Sub22();
													local797.aClass5_Sub11_12 = local22;
													local797.anObjectArray28 = local22.anObjectArray12;
													Static1.aClass58_1.method1663(local797);
													break label329;
												}
											}
										}
									}
									local22.anInt1623 = Static101.anInt2695;
								}
								if (Static30.anInt921 > local22.anInt1676 && local22.anObjectArray23 != null) {
									local448 = new Class5_Sub22();
									local448.anObjectArray28 = local22.anObjectArray23;
									local448.aClass5_Sub11_12 = local22;
									Static1.aClass58_1.method1663(local448);
								}
								if (local22.anInt1676 < Static95.anInt2443 && local22.anObjectArray17 != null) {
									local448 = new Class5_Sub22();
									local448.anObjectArray28 = local22.anObjectArray17;
									local448.aClass5_Sub11_12 = local22;
									Static1.aClass58_1.method1663(local448);
								}
								if (Static45.anInt1202 > local22.anInt1676 && local22.anObjectArray25 != null) {
									local448 = new Class5_Sub22();
									local448.aClass5_Sub11_12 = local22;
									local448.anObjectArray28 = local22.anObjectArray25;
									Static1.aClass58_1.method1663(local448);
								}
								if (Static77.anInt1910 > local22.anInt1676 && local22.anObjectArray20 != null) {
									local448 = new Class5_Sub22();
									local448.anObjectArray28 = local22.anObjectArray20;
									local448.aClass5_Sub11_12 = local22;
									Static1.aClass58_1.method1663(local448);
								}
								local22.anInt1676 = Static66.anInt1592;
								if (local22.anObjectArray14 != null) {
									for (local169 = 0; local169 < Static78.anInt1987; local169++) {
										@Pc(1140) Class5_Sub22 local1140 = new Class5_Sub22();
										local1140.aClass5_Sub11_12 = local22;
										local1140.anInt2979 = Static60.anIntArray217[local169];
										local1140.anInt2987 = Static126.anIntArray381[local169];
										local1140.anObjectArray28 = local22.anObjectArray14;
										Static1.aClass58_1.method1663(local1140);
									}
								}
							}
						}
						if (!local22.aBoolean66) {
							if (Static86.aClass5_Sub11_8 != null || Static115.aClass5_Sub11_13 != null || Static117.aBoolean105) {
								return;
							}
							if ((local22.anInt1621 >= 0 || local22.anInt1644 != 0) && Static30.anInt917 >= local97 && local108 <= Static40.anInt1073 && Static30.anInt917 < local138 && local131 > Static40.anInt1073) {
								if (local22.anInt1621 >= 0) {
									Static127.aClass5_Sub11_14 = arg5[local22.anInt1621];
								} else {
									Static127.aClass5_Sub11_14 = local22;
								}
							}
							if (local22.anInt1669 == 8 && local97 <= Static30.anInt917 && Static40.anInt1073 >= local108 && local138 > Static30.anInt917 && local131 > Static40.anInt1073) {
								Static132.aClass5_Sub11_15 = local22;
							}
							if (local22.anInt1636 < local22.anInt1662) {
								Static60.method1020(local69, Static30.anInt917, local22.anInt1662, Static40.anInt1073, local22.anInt1636, local22.anInt1653 + local63, local22);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBZI)Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 method861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(24) long local24 = ((long) arg2 << 40) + (long) arg0 + ((long) arg4 << 16) + ((long) arg1 << 38);
		@Pc(32) Class5_Sub2_Sub1_Sub4 local32;
		if (!arg3) {
			local32 = (Class5_Sub2_Sub1_Sub4) Static60.aClass29_15.method766(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class5_Sub2_Sub11 local40 = Static111.method1830(arg0);
		if (arg4 > 1 && local40.anIntArray275 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (local40.anIntArray276[local52] <= arg4 && local40.anIntArray276[local52] != 0) {
					local50 = local40.anIntArray275[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static111.method1830(local50);
			}
		}
		@Pc(92) Class5_Sub2_Sub2_Sub6 local92 = local40.method1274(1);
		if (local92 == null) {
			return null;
		}
		@Pc(98) Class5_Sub2_Sub1_Sub4 local98 = null;
		if (local40.anInt1943 != -1) {
			local98 = method861(local40.anInt1968, 1, 0, true, 10);
			if (local98 == null) {
				return null;
			}
		}
		@Pc(117) int[] local117 = Static46.anIntArray385;
		@Pc(119) int local119 = Static46.anInt3187;
		@Pc(122) int[] local122 = new int[4];
		@Pc(124) int local124 = Static46.anInt3188;
		Static46.method1998(local122);
		local32 = new Class5_Sub2_Sub1_Sub4(36, 32);
		Static46.method2003(local32.anIntArray386, 36, 32);
		Static46.method1994();
		Static51.method935();
		Static51.method931(16, 16);
		Static51.aBoolean43 = false;
		@Pc(147) int local147 = local40.anInt1960;
		if (arg3) {
			local147 = (int) ((double) local147 * 1.5D);
		} else if (arg1 == 2) {
			local147 = (int) ((double) local147 * 1.04D);
		}
		@Pc(175) int local175 = Class5_Sub2_Sub1_Sub2.anIntArray198[local40.anInt1950] * local147 >> 16;
		@Pc(184) int local184 = local147 * Class5_Sub2_Sub1_Sub2.anIntArray197[local40.anInt1950] >> 16;
		local92.method2141();
		local92.method2142(local40.anInt1967, local40.anInt1954, local40.anInt1950, local40.anInt1959, local175 + local92.anInt3358 / 2 + local40.anInt1956, local184 + local40.anInt1956);
		if (arg1 >= 1) {
			local32.method2019(1);
		}
		if (arg1 >= 2) {
			local32.method2019(16777215);
		}
		if (arg2 != 0) {
			local32.method2010(arg2);
		}
		Static46.method2003(local32.anIntArray386, 36, 32);
		if (local40.anInt1943 != -1) {
			local98.method2021(0, 0);
		}
		if (!arg3 && (local40.anInt1940 == 1 || arg4 != 1) && arg4 != -1) {
			Static57.aClass5_Sub2_Sub1_Sub1_Sub1_2.method558(Static52.method966(arg4), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static60.aClass29_15.method762(local32, local24);
		}
		Static46.method2003(local117, local124, local119);
		Static46.method1988(local122);
		Static51.method935();
		Static51.aBoolean43 = true;
		return local32;
	}
}
