import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1530 = Static51.method932("sl_arrows");

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1532 = Static51.method932(" ");

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1533 = Static51.method932("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1534 = Static51.method932("leuchten2:");

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)Z")
	public static boolean method2483(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([Lclient!fh;Lclient!ob;I)V")
	public static void method2484(@OriginalArg(0) Class27[] arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static50.aByteArrayArrayArray3[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static50.aByteArrayArrayArray3[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method936(local11, local15);
						}
					}
				}
			}
		}
		Static89.anInt2101 += (int) (Math.random() * 5.0D) - 2;
		Static141.anInt3138 += (int) (Math.random() * 5.0D) - 2;
		if (Static89.anInt2101 < -8) {
			Static89.anInt2101 = -8;
		}
		if (Static141.anInt3138 < -16) {
			Static141.anInt3138 = -16;
		}
		if (Static141.anInt3138 > 16) {
			Static141.anInt3138 = 16;
		}
		if (Static89.anInt2101 > 8) {
			Static89.anInt2101 = 8;
		}
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(176) int local176;
		@Pc(155) int local155;
		@Pc(189) int local189;
		@Pc(249) int local249;
		@Pc(253) int local253;
		@Pc(195) int local195;
		@Pc(269) int local269;
		@Pc(243) int local243;
		@Pc(490) int local490;
		@Pc(529) int local529;
		@Pc(626) int local626;
		@Pc(636) int local636;
		@Pc(651) int local651;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(117) byte[][] local117 = Static99.aByteArrayArrayArray8[local11];
			local32 = (int) Math.sqrt(5100.0D);
			local127 = local32 * 768 >> 8;
			for (local129 = 1; local129 < 103; local129++) {
				for (local133 = 1; local133 < 103; local133++) {
					local155 = Static162.anIntArrayArrayArray8[local11][local133][local129 + 1] - Static162.anIntArrayArrayArray8[local11][local133][local129 - 1];
					local176 = Static162.anIntArrayArrayArray8[local11][local133 + 1][local129] - Static162.anIntArrayArrayArray8[local11][local133 - 1][local129];
					local189 = (int) Math.sqrt((double) (local155 * local155 + local176 * local176 + 65536));
					local195 = (local155 << 8) / local189;
					local243 = (local117[local133][local129] >> 1) + (local117[local133 - 1][local129] >> 2) + (local117[local133 + 1][local129] >> 3) + (local117[local133][local129 + -1] >> 2) + (local117[local133][local129 + 1] >> 3);
					local249 = (local176 << 8) / local189;
					local253 = 65536 / local189;
					local269 = (local195 * -50 + local249 * -50 + local253 * -10) / local127 + 96;
					Static18.anIntArrayArray5[local133][local129] = local269 - local243;
				}
			}
			for (local133 = 0; local133 < 104; local133++) {
				Static36.anIntArray74[local133] = 0;
				Static121.anIntArray296[local133] = 0;
				Static150.anIntArray379[local133] = 0;
				Static100.anIntArray243[local133] = 0;
				Static95.anIntArray237[local133] = 0;
			}
			for (local176 = -5; local176 < 109; local176++) {
				for (local155 = 0; local155 < 104; local155++) {
					local189 = local176 + 5;
					@Pc(393) int local393;
					if (local189 >= 0 && local189 < 104) {
						local249 = Static9.aByteArrayArrayArray1[local11][local189][local155] & 0xFF;
						if (local249 > 0) {
							@Pc(357) Class2_Sub1_Sub8 local357 = Static78.method574(local249 - 1);
							Static36.anIntArray74[local155] += local357.anInt1825;
							Static121.anIntArray296[local155] += local357.anInt1815;
							Static150.anIntArray379[local155] += local357.anInt1814;
							Static100.anIntArray243[local155] += local357.anInt1816;
							local393 = Static95.anIntArray237[local155]++;
						}
					}
					local249 = local176 - 5;
					if (local249 >= 0 && local249 < 104) {
						local253 = Static9.aByteArrayArrayArray1[local11][local249][local155] & 0xFF;
						if (local253 > 0) {
							@Pc(423) Class2_Sub1_Sub8 local423 = Static78.method574(local253 - 1);
							Static36.anIntArray74[local155] -= local423.anInt1825;
							Static121.anIntArray296[local155] -= local423.anInt1815;
							Static150.anIntArray379[local155] -= local423.anInt1814;
							Static100.anIntArray243[local155] -= local423.anInt1816;
							local393 = Static95.anIntArray237[local155]--;
						}
					}
				}
				if (local176 >= 1 && local176 < 103) {
					local249 = 0;
					local189 = 0;
					local253 = 0;
					local195 = 0;
					local269 = 0;
					for (local243 = -5; local243 < 109; local243++) {
						local490 = local243 + 5;
						if (local490 >= 0 && local490 < 104) {
							local253 += Static150.anIntArray379[local490];
							local269 += Static95.anIntArray237[local490];
							local249 += Static121.anIntArray296[local490];
							local195 += Static100.anIntArray243[local490];
							local189 += Static36.anIntArray74[local490];
						}
						local529 = local243 - 5;
						if (local529 >= 0 && local529 < 104) {
							local253 -= Static150.anIntArray379[local529];
							local189 -= Static36.anIntArray74[local529];
							local195 -= Static100.anIntArray243[local529];
							local269 -= Static95.anIntArray237[local529];
							local249 -= Static121.anIntArray296[local529];
						}
						if (local243 >= 1 && local243 < 103 && (!Static170.aBoolean163 || (Static50.aByteArrayArrayArray3[0][local176][local243] & 0x2) != 0 || (Static50.aByteArrayArrayArray3[local11][local176][local243] & 0x10) == 0 && Static150.method2543(local176, local11, local243) == Static27.anInt760)) {
							if (local11 < Static20.anInt500) {
								Static20.anInt500 = local11;
							}
							local626 = Static9.aByteArrayArrayArray1[local11][local176][local243] & 0xFF;
							local636 = Static145.aByteArrayArrayArray9[local11][local176][local243] & 0xFF;
							if (local626 > 0 || local636 > 0) {
								local651 = Static162.anIntArrayArrayArray8[local11][local176][local243];
								@Pc(663) int local663 = Static162.anIntArrayArrayArray8[local11][local176 + 1][local243 + 1];
								@Pc(673) int local673 = Static162.anIntArrayArrayArray8[local11][local176 + 1][local243];
								@Pc(683) int local683 = Static162.anIntArrayArrayArray8[local11][local176][local243 + 1];
								@Pc(689) int local689 = Static18.anIntArrayArray5[local176][local243];
								@Pc(699) int local699 = Static18.anIntArrayArray5[local176 + 1][local243 + 1];
								@Pc(707) int local707 = Static18.anIntArrayArray5[local176 + 1][local243];
								@Pc(715) int local715 = Static18.anIntArrayArray5[local176][local243 + 1];
								@Pc(717) int local717 = -1;
								@Pc(719) int local719 = -1;
								@Pc(730) int local730;
								@Pc(734) int local734;
								if (local626 > 0) {
									local730 = local189 * 256 / local195;
									local734 = local249 / local269;
									@Pc(738) int local738 = local253 / local269;
									local717 = Static37.method771(local730, local734, local738);
									@Pc(750) int local750 = Static89.anInt2101 + local730 & 0xFF;
									local738 += Static141.anInt3138;
									if (local738 < 0) {
										local738 = 0;
									} else if (local738 > 255) {
										local738 = 255;
									}
									local719 = Static37.method771(local750, local734, local738);
								}
								if (local11 > 0) {
									@Pc(780) boolean local780 = true;
									if (local626 == 0 && Static57.aByteArrayArrayArray5[local11][local176][local243] != 0) {
										local780 = false;
									}
									if (local636 > 0 && !Static16.method259(local636 - 1).aBoolean139) {
										local780 = false;
									}
									if (local780 && local673 == local651 && local663 == local651 && local651 == local683) {
										Static37.anIntArrayArrayArray3[local11][local176][local243] |= 0x924;
									}
								}
								local730 = 0;
								if (local719 != -1) {
									local730 = Static125.anIntArray303[Static34.method680(local719, 96)];
								}
								if (local636 == 0) {
									arg1.method1786(local11, local176, local243, 0, 0, -1, local651, local673, local663, local683, Static34.method680(local717, local689), Static34.method680(local717, local707), Static34.method680(local717, local699), Static34.method680(local717, local715), 0, 0, 0, 0, local730, 0);
								} else {
									@Pc(900) byte local900 = Static11.aByteArrayArrayArray11[local11][local176][local243];
									local734 = Static57.aByteArrayArrayArray5[local11][local176][local243] + 1;
									@Pc(916) Class2_Sub1_Sub16 local916 = Static16.method259(local636 - 1);
									@Pc(919) int local919 = local916.anInt3131;
									if (local919 >= 0 && !Static125.anInterface2_1.method255(local919)) {
										local919 = -1;
									}
									@Pc(948) int local948;
									@Pc(980) int local980;
									@Pc(955) int local955;
									@Pc(960) int local960;
									if (local919 >= 0) {
										local980 = Static125.anInterface2_1.method257(local919);
										local948 = -1;
									} else if (local916.anInt3129 == 16711935) {
										local948 = -2;
										local980 = -2;
										local919 = -1;
									} else {
										local948 = Static37.method771(local916.anInt3128, local916.anInt3130, local916.anInt3123);
										local955 = Static89.anInt2101 + local916.anInt3128 & 0xFF;
										local960 = local916.anInt3123 + Static141.anInt3138;
										if (local960 < 0) {
											local960 = 0;
										} else if (local960 > 255) {
											local960 = 255;
										}
										local980 = Static37.method771(local955, local916.anInt3130, local960);
									}
									local955 = 0;
									if (local980 != -2) {
										local955 = Static125.anIntArray303[Static142.method2248(96, local980)];
									}
									if (local916.anInt3132 != -1) {
										local960 = Static89.anInt2101 + local916.anInt3135 & 0xFF;
										@Pc(1025) int local1025 = Static141.anInt3138 + local916.anInt3124;
										if (local1025 < 0) {
											local1025 = 0;
										} else if (local1025 > 255) {
											local1025 = 255;
										}
										local980 = Static37.method771(local960, local916.anInt3127, local1025);
										local955 = Static125.anIntArray303[Static142.method2248(96, local980)];
									}
									arg1.method1786(local11, local176, local243, local734, local900, local919, local651, local673, local663, local683, Static34.method680(local717, local689), Static34.method680(local717, local707), Static34.method680(local717, local699), Static34.method680(local717, local715), Static142.method2248(local689, local948), Static142.method2248(local707, local948), Static142.method2248(local699, local948), Static142.method2248(local715, local948), local730, local955);
								}
							}
						}
					}
				}
			}
			for (local155 = 1; local155 < 103; local155++) {
				for (local189 = 1; local189 < 103; local189++) {
					arg1.method1800(local11, local189, local155, Static150.method2543(local189, local11, local155));
				}
			}
			Static9.aByteArrayArrayArray1[local11] = null;
			Static145.aByteArrayArrayArray9[local11] = null;
			Static57.aByteArrayArrayArray5[local11] = null;
			Static11.aByteArrayArrayArray11[local11] = null;
			Static99.aByteArrayArrayArray8[local11] = null;
		}
		arg1.method1826();
		for (local15 = 0; local15 < 104; local15++) {
			for (local32 = 0; local32 < 104; local32++) {
				if ((Static50.aByteArrayArrayArray3[1][local15][local32] & 0x2) == 2) {
					arg1.method1806(local15, local32);
				}
			}
		}
		local32 = 1;
		local129 = 4;
		local127 = 2;
		for (local133 = 0; local133 < 4; local133++) {
			if (local133 > 0) {
				local129 <<= 0x3;
				local127 <<= 0x3;
				local32 <<= 0x3;
			}
			for (local176 = 0; local176 <= local133; local176++) {
				for (local155 = 0; local155 <= 104; local155++) {
					for (local189 = 0; local189 <= 104; local189++) {
						if ((local32 & Static37.anIntArrayArrayArray3[local176][local189][local155]) != 0) {
							for (local249 = local155; local249 > 0 && (local32 & Static37.anIntArrayArrayArray3[local176][local189][local249 - 1]) != 0; local249--) {
							}
							local195 = local176;
							local269 = local176;
							for (local253 = local155; local253 < 104 && (local32 & Static37.anIntArrayArrayArray3[local176][local189][local253 + 1]) != 0; local253++) {
							}
							label353: while (local195 > 0) {
								for (local243 = local249; local243 <= local253; local243++) {
									if ((Static37.anIntArrayArrayArray3[local195 - 1][local189][local243] & local32) == 0) {
										break label353;
									}
								}
								local195--;
							}
							label342: while (local269 < local133) {
								for (local243 = local249; local243 <= local253; local243++) {
									if ((local32 & Static37.anIntArrayArrayArray3[local269 + 1][local189][local243]) == 0) {
										break label342;
									}
								}
								local269++;
							}
							local243 = (local253 + 1 - local249) * (local269 + 1 - local195);
							if (local243 >= 8) {
								local626 = Static162.anIntArrayArrayArray8[local195][local189][local249];
								local529 = Static162.anIntArrayArrayArray8[local269][local189][local249] - 240;
								Static113.method1783(local133, 1, local189 * 128, local189 * 128, local249 * 128, local253 * 128 + 128, local529, local626);
								for (local636 = local195; local636 <= local269; local636++) {
									for (local651 = local249; local651 <= local253; local651++) {
										Static37.anIntArrayArrayArray3[local636][local189][local651] &= ~local32;
									}
								}
							}
						}
						if ((Static37.anIntArrayArrayArray3[local176][local189][local155] & local127) != 0) {
							for (local249 = local189; local249 > 0 && (local127 & Static37.anIntArrayArrayArray3[local176][local249 - 1][local155]) != 0; local249--) {
							}
							local253 = local189;
							local195 = local176;
							while (local253 < 104 && (Static37.anIntArrayArrayArray3[local176][local253 + 1][local155] & local127) != 0) {
								local253++;
							}
							local269 = local176;
							label407: while (local195 > 0) {
								for (local243 = local249; local243 <= local253; local243++) {
									if ((Static37.anIntArrayArrayArray3[local195 - 1][local243][local155] & local127) == 0) {
										break label407;
									}
								}
								local195--;
							}
							label396: while (local269 < local133) {
								for (local243 = local249; local243 <= local253; local243++) {
									if ((Static37.anIntArrayArrayArray3[local269 + 1][local243][local155] & local127) == 0) {
										break label396;
									}
								}
								local269++;
							}
							local243 = (local269 + 1 - local195) * (local253 + 1 - local249);
							if (local243 >= 8) {
								local626 = Static162.anIntArrayArrayArray8[local195][local249][local155];
								local529 = Static162.anIntArrayArrayArray8[local269][local249][local155] - 240;
								Static113.method1783(local133, 2, local249 * 128, local253 * 128 + 128, local155 * 128, local155 * 128, local529, local626);
								for (local636 = local195; local636 <= local269; local636++) {
									for (local651 = local249; local651 <= local253; local651++) {
										Static37.anIntArrayArrayArray3[local636][local651][local155] &= ~local127;
									}
								}
							}
						}
						if ((local129 & Static37.anIntArrayArrayArray3[local176][local189][local155]) != 0) {
							local253 = local189;
							local195 = local155;
							local269 = local155;
							while (local195 > 0 && (Static37.anIntArrayArrayArray3[local176][local189][local195 - 1] & local129) != 0) {
								local195--;
							}
							while (local269 < 104 && (local129 & Static37.anIntArrayArrayArray3[local176][local189][local269 + 1]) != 0) {
								local269++;
							}
							label462: for (local249 = local189; local249 > 0; local249--) {
								for (local243 = local195; local243 <= local269; local243++) {
									if ((local129 & Static37.anIntArrayArrayArray3[local176][local249 - 1][local243]) == 0) {
										break label462;
									}
								}
							}
							label451: while (local253 < 104) {
								for (local243 = local195; local243 <= local269; local243++) {
									if ((Static37.anIntArrayArrayArray3[local176][local253 + 1][local243] & local129) == 0) {
										break label451;
									}
								}
								local253++;
							}
							if ((local253 + 1 - local249) * (local269 + 1 - local195) >= 4) {
								local243 = Static162.anIntArrayArrayArray8[local176][local249][local195];
								Static113.method1783(local133, 4, local249 * 128, local253 * 128 + 128, local195 * 128, local269 * 128 + 128, local243, local243);
								for (local490 = local249; local490 <= local253; local490++) {
									for (local529 = local195; local529 <= local269; local529++) {
										Static37.anIntArrayArrayArray3[local176][local490][local529] &= ~local129;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lclient!cd;")
	public static Class10 method2485(@OriginalArg(1) int arg0) {
		return Static138.method2178(arg0, false);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!gd;)V")
	public static void method2486(@OriginalArg(0) int arg0, @OriginalArg(2) Class29_Sub1 arg1) {
		if (Static41.aClass2_Sub11_3 == null) {
			Static143.method2252(255, (byte) 0, 255, true, null, 0);
			Static7.aClass29_Sub1Array1[arg0] = arg1;
		} else {
			Static41.aClass2_Sub11_3.anInt2077 = arg0 * 8 + 5;
			@Pc(21) int local21 = Static41.aClass2_Sub11_3.method1449();
			@Pc(25) int local25 = Static41.aClass2_Sub11_3.method1449();
			arg1.method1042(local21, local25);
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method2487() {
		aClass10_1533 = null;
		aClass10_1532 = null;
		aClass10_1534 = null;
		aClass10_1530 = null;
	}
}
