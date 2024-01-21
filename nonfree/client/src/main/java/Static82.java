import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!na", name = "dc", descriptor = "Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 aClass5_Sub2_Sub1_Sub3_5;

	@OriginalMember(owner = "client!na", name = "lc", descriptor = "I")
	public static int anInt2265;

	@OriginalMember(owner = "client!na", name = "qc", descriptor = "Lclient!ba;")
	public static Class8 aClass8_5;

	@OriginalMember(owner = "client!na", name = "sc", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_15;

	@OriginalMember(owner = "client!na", name = "Wb", descriptor = "Lclient!ge;")
	public static Class29 aClass29_20 = new Class29(64);

	@OriginalMember(owner = "client!na", name = "Xb", descriptor = "Lclient!r;")
	public static Class61 aClass61_649 = Static129.method2060("0(U");

	@OriginalMember(owner = "client!na", name = "hc", descriptor = "I")
	public static int anInt2264 = 127;

	@OriginalMember(owner = "client!na", name = "jc", descriptor = "Lclient!r;")
	public static Class61 aClass61_650 = Static129.method2060("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!na", name = "kc", descriptor = "Lclient!r;")
	public static Class61 aClass61_651 = Static129.method2060("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!na", name = "mc", descriptor = "[I")
	public static int[] anIntArray288 = new int[100];

	@OriginalMember(owner = "client!na", name = "nc", descriptor = "Lclient!r;")
	public static Class61 aClass61_652 = Static129.method2060("<col=ff9040>");

	@OriginalMember(owner = "client!na", name = "oc", descriptor = "Lclient!r;")
	private static Class61 aClass61_653 = Static129.method2060("glow2:");

	@OriginalMember(owner = "client!na", name = "pc", descriptor = "Lclient!r;")
	public static Class61 aClass61_654 = aClass61_653;

	@OriginalMember(owner = "client!na", name = "rc", descriptor = "Lclient!r;")
	public static Class61 aClass61_655 = aClass61_653;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIII)V")
	public static void method1488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static65.anIntArrayArrayArray3[arg0][local3 + arg1][local7 + arg2] = 0;
			}
		}
		if (arg1 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static65.anIntArrayArrayArray3[arg0][arg1][arg2 + local7] = Static65.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 + local7];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static65.anIntArrayArrayArray3[arg0][arg1 + local7][arg2] = Static65.anIntArrayArrayArray3[arg0][arg1 + local7][arg2 - 1];
			}
		}
		if (arg1 > 0 && Static65.anIntArrayArrayArray3[arg0][arg1 - 1][arg2] != 0) {
			Static65.anIntArrayArrayArray3[arg0][arg1][arg2] = Static65.anIntArrayArrayArray3[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && Static65.anIntArrayArrayArray3[arg0][arg1][arg2 - 1] != 0) {
			Static65.anIntArrayArrayArray3[arg0][arg1][arg2] = Static65.anIntArrayArrayArray3[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && Static65.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1] != 0) {
			Static65.anIntArrayArrayArray3[arg0][arg1][arg2] = Static65.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!ff;)Lclient!ka;")
	public static Class5_Sub10 method1494(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(8) byte[] local8 = arg1.method1034(arg0);
		return local8 == null ? null : new Class5_Sub10(local8);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[Lclient!ke;IIIIIII)V")
	public static void method1496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub11[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static46.method1989(arg6, arg4, arg5, arg0);
		Static51.method935();
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(21) Class5_Sub11 local21 = arg2[local13];
			if (local21 != null && (local21.anInt1681 == arg7 || arg7 == -1412584499 && local21 == Static86.aClass5_Sub11_8)) {
				@Pc(42) int local42;
				if (arg3 == -1) {
					anIntArray288[Static129.anInt3251] = arg8 + local21.anInt1665;
					Static40.anIntArray176[Static129.anInt3251] = arg1 + local21.anInt1661;
					Static56.anIntArray209[Static129.anInt3251] = local21.anInt1653;
					Static81.anIntArray444[Static129.anInt3251] = local21.anInt1636;
					local42 = Static129.anInt3251++;
				} else {
					local42 = arg3;
				}
				local21.anInt1638 = local42;
				local21.anInt1637 = Static58.anInt1422;
				if (!local21.aBoolean66 || !Static79.method1300(local21)) {
					if (local21.anInt1627 > 0) {
						Static107.method1794(local21);
					}
					@Pc(101) int local101 = arg8 + local21.anInt1665;
					@Pc(106) int local106 = arg1 + local21.anInt1661;
					@Pc(109) int local109 = local21.anInt1678;
					@Pc(137) int local137;
					@Pc(152) int local152;
					if (Static86.aClass5_Sub11_8 == local21) {
						if (arg7 != -1412584499 && !local21.aBoolean69) {
							Static32.anInt958 = arg1;
							Static113.anInt2958 = arg8;
							Static132.aClass5_Sub11Array2 = arg2;
							continue;
						}
						if (!local21.aBoolean69) {
							local109 = 128;
						}
						if (Static91.aBoolean84 && Static99.aBoolean95) {
							local137 = Static30.anInt917;
							local137 -= Static132.anInt3373;
							if (Static30.anInt926 > local137) {
								local137 = Static30.anInt926;
							}
							local152 = Static40.anInt1073;
							local152 -= Static129.anInt3233;
							if (local152 < Static118.anInt3021) {
								local152 = Static118.anInt3021;
							}
							if (Static30.anInt926 + Static68.aClass5_Sub11_6.anInt1653 < local137 + local21.anInt1653) {
								local137 = Static30.anInt926 + Static68.aClass5_Sub11_6.anInt1653 - local21.anInt1653;
							}
							if (local21.anInt1636 + local152 > Static118.anInt3021 + Static68.aClass5_Sub11_6.anInt1636) {
								local152 = Static68.aClass5_Sub11_6.anInt1636 + Static118.anInt3021 - local21.anInt1636;
							}
							local106 = local152;
							local101 = local137;
						}
					}
					@Pc(266) int local266;
					@Pc(258) int local258;
					@Pc(216) int local216;
					@Pc(223) int local223;
					@Pc(221) int local221;
					@Pc(228) int local228;
					if (local21.anInt1669 == 2) {
						local266 = arg5;
						local258 = arg0;
						local137 = arg6;
						local152 = arg4;
					} else if (local21.anInt1669 == 9) {
						local216 = local101;
						local221 = local101 + local21.anInt1653;
						local223 = local106;
						local228 = local21.anInt1636 + local106;
						if (local221 < local101) {
							local216 = local221;
							local221 = local101;
						}
						if (local106 > local228) {
							local223 = local228;
							local228 = local106;
						}
						local228++;
						local258 = arg0 <= local228 ? arg0 : local228;
						local221++;
						local266 = local221 < arg5 ? local221 : arg5;
						local137 = local216 > arg6 ? local216 : arg6;
						local152 = arg4 < local223 ? local223 : arg4;
					} else {
						local137 = arg6 >= local101 ? arg6 : local101;
						local152 = arg4 >= local106 ? arg4 : local106;
						local216 = local21.anInt1653 + local101;
						local223 = local106 + local21.anInt1636;
						local258 = arg0 <= local223 ? arg0 : local223;
						local266 = arg5 <= local216 ? arg5 : local216;
					}
					if (!local21.aBoolean66 || local266 > local137 && local152 < local258) {
						if (local21.anInt1627 != 0) {
							if (local21.anInt1627 == 1337) {
								Static72.anInt1990 = local101;
								Static13.anInt369 = local106;
								Static39.method734(local21.anInt1653, local106, local21.anInt1636, local101);
								Static46.method1989(arg6, arg4, arg5, arg0);
								continue;
							}
							if (local21.anInt1627 == 1338) {
								Static17.method397(local101, local42, local106);
								Static46.method1989(arg6, arg4, arg5, arg0);
								continue;
							}
						}
						local223 = Static40.anInt1073;
						local216 = Static30.anInt917;
						if (!Static117.aBoolean105 && local216 >= local137 && local223 >= local152 && local216 < local266 && local223 < local258) {
							Static31.method642(local216 - local101, local223 - local106, local21);
						}
						if (local21.anInt1669 == 0) {
							if (!local21.aBoolean66 && Static79.method1300(local21) && local21 != Static127.aClass5_Sub11_14) {
								continue;
							}
							if (!local21.aBoolean66) {
								if (local21.anInt1662 - local21.anInt1636 < local21.anInt1660) {
									local21.anInt1660 = local21.anInt1662 - local21.anInt1636;
								}
								if (local21.anInt1660 < 0) {
									local21.anInt1660 = 0;
								}
							}
							method1496(local258, local106 - local21.anInt1660, arg2, local42, local152, local266, local137, local21.anInt1614, local101 - local21.anInt1640);
							if (local21.aClass5_Sub11Array1 != null) {
								method1496(local258, local106 - local21.anInt1660, local21.aClass5_Sub11Array1, local42, local152, local266, local137, local21.anInt1614, local101 - local21.anInt1640);
							}
							@Pc(533) Class5_Sub13 local533 = (Class5_Sub13) Static28.aClass20_3.method656((long) local21.anInt1614);
							if (local533 != null) {
								if (local533.anInt2011 == 0 && local137 <= Static30.anInt917 && local152 <= Static40.anInt1073 && Static30.anInt917 < local266 && local258 > Static40.anInt1073 && !Static117.aBoolean105 && !Static30.aBoolean26) {
									Static38.anIntArray223[0] = 1005;
									Static123.aClass61Array23[0] = Static76.aClass61_572;
									Static36.anInt1015 = 1;
									Static107.aClass61Array19[0] = Static96.aClass61_746;
								}
								Static76.method1229(local266, local533.anInt2013, local152, local258, local101, local106, local137, local42);
							}
							Static46.method1989(arg6, arg4, arg5, arg0);
							Static51.method935();
						}
						if (Static36.aBooleanArray4[local42] || Static66.anInt1591 > 1) {
							if (local21.anInt1669 == 0 && !local21.aBoolean66 && local21.anInt1662 > local21.anInt1636) {
								Static23.method494(local106, local21.anInt1660, local101 + local21.anInt1653, local21.anInt1662, local21.anInt1636);
							}
							if (local21.anInt1669 != 1) {
								@Pc(647) int local647;
								@Pc(668) int local668;
								@Pc(822) int local822;
								@Pc(730) int local730;
								@Pc(874) int local874;
								@Pc(872) int local872;
								@Pc(901) int local901;
								@Pc(659) int local659;
								@Pc(835) int local835;
								if (local21.anInt1669 == 2) {
									local221 = 0;
									for (local228 = 0; local228 < local21.anInt1636; local228++) {
										for (local647 = 0; local647 < local21.anInt1653; local647++) {
											local659 = local106 + local228 * (local21.anInt1616 + 32);
											local668 = (local21.anInt1635 + 32) * local647 + local101;
											if (local221 < 20) {
												local659 += local21.anIntArray245[local221];
												local668 += local21.anIntArray239[local221];
											}
											if (local21.anIntArray246[local221] > 0) {
												local730 = local21.anIntArray246[local221] - 1;
												if (local668 + 32 > arg6 && arg5 > local668 && arg4 < local659 + 32 && local659 < arg0 || local21 == Static115.aClass5_Sub11_13 && Static80.anInt2052 == local221) {
													@Pc(787) Class5_Sub2_Sub1_Sub4 local787;
													if (Static123.anInt3071 == 1 && local221 == Static112.anInt2933 && local21.anInt1614 == Static86.anInt2322) {
														local787 = Static47.method861(local730, 2, 0, false, local21.anIntArray241[local221]);
													} else {
														local787 = Static47.method861(local730, 1, 3153952, false, local21.anIntArray241[local221]);
													}
													if (local787 == null) {
														Static24.method505(local21);
													} else if (Static115.aClass5_Sub11_13 == local21 && Static80.anInt2052 == local221) {
														local822 = Static40.anInt1073 - Static12.anInt323;
														if (local822 < 5 && local822 > -5) {
															local822 = 0;
														}
														local835 = Static30.anInt917 - Static73.anInt1745;
														if (local835 < 5 && local835 > -5) {
															local835 = 0;
														}
														if (Static28.anInt894 < 5) {
															local835 = 0;
															local822 = 0;
														}
														local787.method2027(local668 + local835, local659 + local822, 128);
														if (arg7 != -1) {
															@Pc(870) Class5_Sub11 local870 = arg2[arg7 & 0xFFFF];
															local872 = Static46.anInt3190;
															local874 = Static46.anInt3189;
															if (local874 > local659 + local822 && local870.anInt1660 > 0) {
																local901 = (local874 - local659 - local822) * Static8.anInt198 / 3;
																if (Static8.anInt198 * 10 < local901) {
																	local901 = Static8.anInt198 * 10;
																}
																if (local901 > local870.anInt1660) {
																	local901 = local870.anInt1660;
																}
																Static12.anInt323 += local901;
																local870.anInt1660 -= local901;
																Static24.method505(local870);
															}
															if (local872 < local822 + local659 + 32 && local870.anInt1662 - local870.anInt1636 > local870.anInt1660) {
																local901 = (local822 + local659 + 32 - local872) * Static8.anInt198 / 3;
																if (Static8.anInt198 * 10 < local901) {
																	local901 = Static8.anInt198 * 10;
																}
																if (local870.anInt1662 - local870.anInt1636 - local870.anInt1660 < local901) {
																	local901 = local870.anInt1662 - local870.anInt1636 - local870.anInt1660;
																}
																local870.anInt1660 += local901;
																Static12.anInt323 -= local901;
																Static24.method505(local870);
															}
														}
													} else if (Static29.aClass5_Sub11_3 == local21 && Static32.anInt964 == local221) {
														local787.method2027(local668, local659, 128);
													} else {
														local787.method2021(local668, local659);
													}
												}
											} else if (local21.anIntArray242 != null && local221 < 20) {
												@Pc(704) Class5_Sub2_Sub1_Sub4 local704 = local21.method1119(local221);
												if (local704 != null) {
													local704.method2021(local668, local659);
												} else if (Static134.aBoolean122) {
													Static24.method505(local21);
												}
											}
											local221++;
										}
									}
								} else if (local21.anInt1669 == 3) {
									if (Static105.method2171(local21)) {
										local221 = local21.anInt1641;
										if (local21 == Static127.aClass5_Sub11_14 && local21.anInt1655 != 0) {
											local221 = local21.anInt1655;
										}
									} else {
										local221 = local21.anInt1611;
										if (Static127.aClass5_Sub11_14 == local21 && local21.anInt1644 != 0) {
											local221 = local21.anInt1644;
										}
									}
									if (local109 == 0) {
										if (local21.aBoolean68) {
											Static46.method2001(local101, local106, local21.anInt1653, local21.anInt1636, local221);
										} else {
											Static46.method2006(local101, local106, local21.anInt1653, local21.anInt1636, local221);
										}
									} else if (local21.aBoolean68) {
										Static46.method1993(local101, local106, local21.anInt1653, local21.anInt1636, local221, 256 - (local109 & 0xFF));
									} else {
										Static46.method1991(local101, local106, local21.anInt1653, local21.anInt1636, local221, 256 - (local109 & 0xFF));
									}
								} else {
									@Pc(1160) Class5_Sub2_Sub1_Sub1_Sub1 local1160;
									if (local21.anInt1669 == 4) {
										local1160 = local21.method1124();
										if (local1160 != null) {
											@Pc(1172) Class61 local1172 = local21.aClass61_506;
											if (Static105.method2171(local21)) {
												local228 = local21.anInt1641;
												if (local21 == Static127.aClass5_Sub11_14 && local21.anInt1655 != 0) {
													local228 = local21.anInt1655;
												}
												if (local21.aClass61_511.method1733() > 0) {
													local1172 = local21.aClass61_511;
												}
											} else {
												local228 = local21.anInt1611;
												if (local21 == Static127.aClass5_Sub11_14 && local21.anInt1644 != 0) {
													local228 = local21.anInt1644;
												}
											}
											if (local21.aBoolean66 && local21.anInt1618 != -1) {
												@Pc(1229) Class5_Sub2_Sub11 local1229 = Static111.method1830(local21.anInt1618);
												local1172 = local1229.aClass61_597;
												if (local1172 == null) {
													local1172 = Static121.aClass61_962;
												}
												if ((local1229.anInt1940 == 1 || local21.anInt1630 != 1) && local21.anInt1630 != -1) {
													local1172 = Static123.method1929(new Class61[] { aClass61_652, local1172, Static87.aClass61_684, Static104.method1756(local21.anInt1630) });
												}
											}
											if (Static90.aClass5_Sub11_9 == local21) {
												local1172 = Static102.aClass61_799;
												local228 = local21.anInt1611;
											}
											if (!local21.aBoolean66) {
												local1172 = Static78.method1278(local21, local1172);
											}
											local1160.method561(local1172, local101, local106, local21.anInt1653, local21.anInt1636, local228, local21.aBoolean63 ? 0 : -1, local21.anInt1642, local21.anInt1610, local21.anInt1633);
										} else if (Static134.aBoolean122) {
											Static24.method505(local21);
										}
									} else if (local21.anInt1669 == 5) {
										@Pc(1341) Class5_Sub2_Sub1_Sub4 local1341;
										if (local21.aBoolean66) {
											if (local21.anInt1618 == -1) {
												local1341 = local21.method1129(false);
											} else {
												local1341 = Static47.method861(local21.anInt1618, local21.anInt1648, local21.anInt1652, false, local21.anInt1630);
											}
											if (local1341 != null) {
												local228 = local1341.anInt3195;
												local647 = local1341.anInt3196;
												if (local21.aBoolean67) {
													Static46.method2002(local101, local106, local21.anInt1653 + local101, local21.anInt1636 + local106);
													local668 = (local21.anInt1653 + local228 - 1) / local228;
													local659 = (local647 + local21.anInt1636 - 1) / local647;
													for (local835 = 0; local835 < local668; local835++) {
														for (local822 = 0; local822 < local659; local822++) {
															if (local21.anInt1666 != 0) {
																local1341.method2024(local835 * local228 + local101 + local228 / 2, local647 * local822 + local106 - -(local647 / 2), local21.anInt1666, 4096);
															} else if (local109 == 0) {
																local1341.method2021(local835 * local228 + local101, local106 + local822 * local647);
															} else {
																local1341.method2027(local835 * local228 + local101, local106 + local822 * local647, 256 - (local109 & 0xFF));
															}
														}
													}
													Static46.method1989(arg6, arg4, arg5, arg0);
												} else {
													local668 = local21.anInt1653 * 4096 / local228;
													if (local21.anInt1666 != 0) {
														local1341.method2024(local101 + local21.anInt1653 / 2, local106 - -(local21.anInt1636 / 2), local21.anInt1666, local668);
													} else if (local109 != 0) {
														local1341.method2014(local101, local106, local21.anInt1653, local21.anInt1636, 256 - (local109 & 0xFF));
													} else if (local21.anInt1653 == local228 && local21.anInt1636 == local647) {
														local1341.method2021(local101, local106);
													} else {
														local1341.method2032(local101, local106, local21.anInt1653, local21.anInt1636);
													}
												}
											} else if (Static134.aBoolean122) {
												Static24.method505(local21);
											}
										} else {
											local1341 = local21.method1129(Static105.method2171(local21));
											if (local1341 != null) {
												local1341.method2021(local101, local106);
											} else if (Static134.aBoolean122) {
												Static24.method505(local21);
											}
										}
									} else {
										@Pc(1625) Class5_Sub2_Sub11 local1625;
										if (local21.anInt1669 == 6) {
											@Pc(1600) boolean local1600 = Static105.method2171(local21);
											if (local1600) {
												local228 = local21.anInt1629;
											} else {
												local228 = local21.anInt1625;
											}
											@Pc(1612) Class5_Sub2_Sub2_Sub6 local1612 = null;
											local668 = 0;
											if (local21.anInt1618 != -1) {
												local1625 = Static111.method1830(local21.anInt1618);
												if (local1625 != null) {
													local1625 = local1625.method1276(local21.anInt1630);
													local1612 = local1625.method1274(1);
													if (local1612 == null) {
														Static24.method505(local21);
													} else {
														local1612.method2141();
														local668 = local1612.anInt3358 / 2;
													}
												}
											} else if (local21.anInt1649 == 5) {
												if (local21.anInt1679 == 0) {
													local1612 = Static110.aClass37_1.method997(-1, null, -1, null);
												} else {
													local1612 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.method2178();
												}
											} else if (local228 == -1) {
												local1612 = local21.method1117(-1, null, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass37_2, local1600);
												if (local1612 == null && Static134.aBoolean122) {
													Static24.method505(local21);
												}
											} else {
												@Pc(1688) Class5_Sub2_Sub17 local1688 = Static106.method1769(local228);
												local1612 = local21.method1117(local21.anInt1617, local1688, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass37_2, local1600);
												if (local1612 == null && Static134.aBoolean122) {
													Static24.method505(local21);
												}
											}
											Static51.method931(local101 + local21.anInt1653 / 2, local21.anInt1636 / 2 + local106);
											local659 = local21.anInt1668 * Class5_Sub2_Sub1_Sub2.anIntArray198[local21.anInt1647] >> 16;
											local835 = local21.anInt1668 * Class5_Sub2_Sub1_Sub2.anIntArray197[local21.anInt1647] >> 16;
											if (local1612 != null) {
												if (local21.aBoolean66) {
													local1612.method2141();
													if (local21.aBoolean61) {
														local1612.method2154(local21.anInt1671, local21.anInt1670, local21.anInt1647, local21.anInt1673, local21.anInt1664 + local668 + local659, local835 + local21.anInt1664, local21.anInt1668);
													} else {
														local1612.method2142(local21.anInt1671, local21.anInt1670, local21.anInt1647, local21.anInt1673, local21.anInt1664 + local659 + local668, local835 + local21.anInt1664);
													}
												} else {
													local1612.method2142(local21.anInt1671, 0, local21.anInt1647, 0, local659, local835);
												}
											}
											Static51.method933();
										} else {
											if (local21.anInt1669 == 7) {
												local1160 = local21.method1124();
												if (local1160 == null) {
													if (Static134.aBoolean122) {
														Static24.method505(local21);
													}
													continue;
												}
												local228 = 0;
												for (local647 = 0; local647 < local21.anInt1636; local647++) {
													for (local668 = 0; local668 < local21.anInt1653; local668++) {
														if (local21.anIntArray246[local228] > 0) {
															local1625 = Static111.method1830(local21.anIntArray246[local228] - 1);
															@Pc(1904) Class61 local1904;
															if (local1625.anInt1940 != 1 && local21.anIntArray241[local228] == 1) {
																local1904 = Static123.method1929(new Class61[] { aClass61_652, local1625.aClass61_597, Static56.aClass61_442 });
															} else {
																local1904 = Static123.method1929(new Class61[] { aClass61_652, local1625.aClass61_597, Static87.aClass61_684, Static104.method1756(local21.anIntArray241[local228]) });
															}
															local822 = local101 + local668 * (local21.anInt1635 + 115);
															local730 = local106 + (local21.anInt1616 + 12) * local647;
															if (local21.anInt1642 == 0) {
																local1160.method558(local1904, local822, local730, local21.anInt1611, local21.aBoolean63 ? 0 : -1);
															} else if (local21.anInt1642 == 1) {
																local1160.method555(local1904, local21.anInt1653 / 2 + local822, local730, local21.anInt1611, local21.aBoolean63 ? 0 : -1);
															} else {
																local1160.method568(local1904, local822 + local21.anInt1653 - 1, local730, local21.anInt1611, local21.aBoolean63 ? 0 : -1);
															}
														}
														local228++;
													}
												}
											}
											@Pc(2204) int local2204;
											if (local21.anInt1669 == 8 && Static132.aClass5_Sub11_15 == local21 && Static85.anInt2311 == Static95.anInt2446) {
												local228 = 0;
												@Pc(2050) Class61 local2050 = local21.aClass61_506;
												@Pc(2052) Class5_Sub2_Sub1_Sub1_Sub1 local2052 = Static9.aClass5_Sub2_Sub1_Sub1_Sub1_1;
												local2050 = Static78.method1278(local21, local2050);
												local221 = 0;
												@Pc(2076) Class61 local2076;
												while (local2050.method1733() > 0) {
													local835 = local2050.method1731(Static40.aClass61_321);
													if (local835 == -1) {
														local2076 = local2050;
														local2050 = Static96.aClass61_746;
													} else {
														local2076 = local2050.method1730(local835, 0);
														local2050 = local2050.method1724(local835 + 4);
													}
													local822 = local2052.method544(local2076);
													if (local221 < local822) {
														local221 = local822;
													}
													local228 += local2052.anInt773 + 1;
												}
												local228 += 7;
												local221 += 6;
												local835 = local101 + local21.anInt1653 - local221 - 5;
												if (local101 + 5 > local835) {
													local835 = local101 + 5;
												}
												if (arg5 < local221 + local835) {
													local835 = arg5 - local221;
												}
												local822 = local21.anInt1636 + local106 + 5;
												if (local228 + local822 > arg0) {
													local822 = arg0 - local228;
												}
												Static46.method2001(local835, local822, local221, local228, 16777120);
												Static46.method2006(local835, local822, local221, local228, 0);
												local2050 = local21.aClass61_506;
												local730 = local2052.anInt773 + local822 + 2;
												local2050 = Static78.method1278(local21, local2050);
												while (local2050.method1733() > 0) {
													local2204 = local2050.method1731(Static40.aClass61_321);
													if (local2204 == -1) {
														local2076 = local2050;
														local2050 = Static96.aClass61_746;
													} else {
														local2076 = local2050.method1730(local2204, 0);
														local2050 = local2050.method1724(local2204 + 4);
													}
													local2052.method558(local2076, local835 + 3, local730, 0, -1);
													local730 += local2052.anInt773 + 1;
												}
											}
											if (local21.anInt1669 == 9) {
												if (local21.anInt1680 == 1) {
													Static46.method2004(local101, local106, local101 + local21.anInt1653, local106 - -local21.anInt1636, local21.anInt1611);
												} else {
													local228 = local21.anInt1636 < 0 ? -local21.anInt1636 : local21.anInt1636;
													local221 = local21.anInt1653 < 0 ? -local21.anInt1653 : local21.anInt1653;
													local647 = local221;
													if (local228 > local221) {
														local647 = local228;
													}
													if (local647 != 0) {
														local659 = (local21.anInt1636 << 16) / local647;
														local668 = (local21.anInt1653 << 16) / local647;
														if (local659 > local668) {
															local659 = -local659;
														} else {
															local668 = -local668;
														}
														local835 = local659 * local21.anInt1680 >> 17;
														local730 = local668 * local21.anInt1680 >> 17;
														local822 = local21.anInt1680 * local659 + 1 >> 17;
														local2204 = local668 * local21.anInt1680 + 1 >> 17;
														@Pc(2361) int local2361 = local101 - arg6;
														local872 = local2361 + local835;
														local874 = local106 - arg4;
														@Pc(2378) int local2378 = local21.anInt1653 + local2361 - local822;
														@Pc(2385) int local2385 = local835 + local21.anInt1653 + local2361;
														local901 = local2361 - local822;
														@Pc(2394) int local2394 = local874 + local730;
														@Pc(2399) int local2399 = local874 - local2204;
														@Pc(2406) int local2406 = local730 + local21.anInt1636 + local874;
														@Pc(2414) int local2414 = local874 + local21.anInt1636 - local2204;
														Static51.method940(local872, local901, local2378);
														Static51.method936(local2394, local2399, local2414, local872, local901, local2378, local21.anInt1611);
														Static51.method940(local872, local2378, local2385);
														Static51.method936(local2394, local2414, local2406, local872, local2378, local2385, local21.anInt1611);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "u", descriptor = "(I)V")
	public static void method1497() {
		aClass61_655 = null;
		aClass61_651 = null;
		aClass61_649 = null;
		anIntArray288 = null;
		aClass5_Sub2_Sub1_Sub3_5 = null;
		aClass61_652 = null;
		aClass61_653 = null;
		aClass61_654 = null;
		aClass26_Sub1_15 = null;
		aClass8_5 = null;
		aClass29_20 = null;
		aClass61_650 = null;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(ZI)Lclient!se;")
	public static Class5_Sub2_Sub14 method1498(@OriginalArg(1) int arg0) {
		@Pc(6) Class5_Sub2_Sub14 local6 = (Class5_Sub2_Sub14) Static55.aClass29_13.method766((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static25.aClass26_3.method1038(16, arg0);
		local6 = new Class5_Sub2_Sub14();
		if (local25 != null) {
			local6.method1826(new Class5_Sub14(local25));
		}
		Static55.aClass29_13.method762(local6, (long) arg0);
		return local6;
	}
}
