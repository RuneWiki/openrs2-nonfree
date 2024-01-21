import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public static int anInt3510 = 0;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public static int anInt3512 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIB)V")
	public static void method2665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 > Static133.anInt3309 || Static206.anInt4385 > arg1) {
			return;
		}
		@Pc(27) boolean local27;
		if (arg2 < Static71.anInt1744) {
			arg2 = Static71.anInt1744;
			local27 = false;
		} else if (Static23.anInt685 >= arg2) {
			local27 = true;
		} else {
			local27 = false;
			arg2 = Static23.anInt685;
		}
		@Pc(47) boolean local47;
		if (arg0 < Static71.anInt1744) {
			arg0 = Static71.anInt1744;
			local47 = false;
		} else if (Static23.anInt685 >= arg0) {
			local47 = true;
		} else {
			local47 = false;
			arg0 = Static23.anInt685;
		}
		if (Static206.anInt4385 <= arg3) {
			Static51.method893(arg4, Static40.anIntArrayArray11[arg3++], arg2, arg0);
		} else {
			arg3 = Static206.anInt4385;
		}
		if (arg1 <= Static133.anInt3309) {
			Static51.method893(arg4, Static40.anIntArrayArray11[arg1--], arg2, arg0);
		} else {
			arg1 = Static133.anInt3309;
		}
		@Pc(99) int local99;
		if (local47 && local27) {
			for (local99 = arg3; local99 <= arg1; local99++) {
				@Pc(105) int[] local105 = Static40.anIntArrayArray11[local99];
				local105[arg0] = local105[arg2] = arg4;
			}
		} else if (local47) {
			for (local99 = arg3; local99 <= arg1; local99++) {
				Static40.anIntArrayArray11[local99][arg0] = arg4;
			}
		} else if (local27) {
			for (local99 = arg3; local99 <= arg1; local99++) {
				Static40.anIntArrayArray11[local99][arg2] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!vg;IIIIIII)V")
	public static void method2666(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static1.anInt4460;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static66.anInt1691;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static206.anIntArrayArrayArray10[arg1][arg6][arg7] - Static100.anInt2513;
		@Pc(49) int local49 = Static206.anIntArrayArrayArray10[arg1][arg6 + 1][arg7] - Static100.anInt2513;
		@Pc(63) int local63 = Static206.anIntArrayArrayArray10[arg1][arg6 + 1][arg7 + 1] - Static100.anInt2513;
		@Pc(75) int local75 = Static206.anIntArrayArrayArray10[arg1][arg6][arg7 + 1] - Static100.anInt2513;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(269) int local269 = Static56.anInt1519;
		@Pc(271) int local271 = Static56.anInt1525;
		@Pc(279) int local279 = local269 + (local97 << 9) / local117;
		@Pc(287) int local287 = local271 + (local119 << 9) / local117;
		@Pc(295) int local295 = local269 + (local21 << 9) / local165;
		@Pc(303) int local303 = local271 + (local49 << 9) / local165;
		@Pc(311) int local311 = local269 + (local193 << 9) / local27;
		@Pc(319) int local319 = local271 + (local63 << 9) / local27;
		@Pc(327) int local327 = local269 + (local241 << 9) / local261;
		@Pc(335) int local335 = local271 + (local85 << 9) / local261;
		Static56.anInt1522 = 0;
		@Pc(471) int local471;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			if (Static119.aBoolean120 && Static204.method3261(Static2.anInt73, Static15.anInt416, local319, local335, local303, local311, local327, local295)) {
				Static108.anInt2645 = arg6;
				Static11.anInt260 = arg7;
			}
			Static56.aBoolean61 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static56.anInt1524 || local327 > Static56.anInt1524 || local295 > Static56.anInt1524) {
				Static56.aBoolean61 = true;
			}
			if (arg0.anInt4260 == -1) {
				if (arg0.anInt4267 != 12345678) {
					Static56.method1026(local319, local335, local303, local311, local327, local295, arg0.anInt4267, arg0.anInt4262, arg0.anInt4259);
				}
			} else if (Static16.aBoolean20) {
				local471 = Static56.anInterface2_1.method1092(arg0.anInt4260);
				Static56.method1026(local319, local335, local303, local311, local327, local295, Static106.method1971(local471, arg0.anInt4267), Static106.method1971(local471, arg0.anInt4262), Static106.method1971(local471, arg0.anInt4259));
			} else if (arg0.aBoolean169) {
				Static56.method1033(local319, local335, local303, local311, local327, local295, arg0.anInt4267, arg0.anInt4262, arg0.anInt4259, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4260);
			} else {
				Static56.method1033(local319, local335, local303, local311, local327, local295, arg0.anInt4267, arg0.anInt4262, arg0.anInt4259, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4260);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		if (Static119.aBoolean120 && Static204.method3261(Static2.anInt73, Static15.anInt416, local287, local303, local335, local279, local295, local327)) {
			Static108.anInt2645 = arg6;
			Static11.anInt260 = arg7;
		}
		Static56.aBoolean61 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static56.anInt1524 || local295 > Static56.anInt1524 || local327 > Static56.anInt1524) {
			Static56.aBoolean61 = true;
		}
		if (arg0.anInt4260 != -1) {
			if (!Static16.aBoolean20) {
				Static56.method1033(local287, local303, local335, local279, local295, local327, arg0.anInt4266, arg0.anInt4259, arg0.anInt4262, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4260);
				return;
			}
			local471 = Static56.anInterface2_1.method1092(arg0.anInt4260);
			Static56.method1026(local287, local303, local335, local279, local295, local327, Static106.method1971(local471, arg0.anInt4266), Static106.method1971(local471, arg0.anInt4259), Static106.method1971(local471, arg0.anInt4262));
		} else if (arg0.anInt4266 != 12345678) {
			Static56.method1026(local287, local303, local335, local279, local295, local327, arg0.anInt4266, arg0.anInt4259, arg0.anInt4262);
			return;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public static void method2667() {
		try {
			if (Static33.anInt965 == 0) {
				if (Static123.aClass23_4 != null) {
					Static123.aClass23_4.method731();
					Static123.aClass23_4 = null;
				}
				Static198.aClass34_8 = null;
				Static33.anInt965 = 1;
				Static153.anInt3525 = 0;
				Static190.aBoolean165 = false;
			}
			if (Static33.anInt965 == 1) {
				if (Static198.aClass34_8 == null) {
					Static198.aClass34_8 = Static153.aClass14_3.method620(Static33.anInt969, Static167.aString5);
				}
				if (Static198.aClass34_8.anInt1727 == 2) {
					throw new IOException();
				}
				if (Static198.aClass34_8.anInt1727 == 1) {
					Static123.aClass23_4 = new Class23((Socket) Static198.aClass34_8.anObject1, Static153.aClass14_3);
					Static198.aClass34_8 = null;
					Static33.anInt965 = 2;
				}
			}
			if (Static33.anInt965 == 2) {
				@Pc(68) long local68 = Static141.aLong108 = Static139.aClass65_1958.method2475();
				Static45.aClass1_Sub14_Sub1_8.anInt2306 = 0;
				@Pc(78) int local78 = (int) (local68 >> 16 & 0x1FL);
				Static45.aClass1_Sub14_Sub1_8.method1710(14);
				Static45.aClass1_Sub14_Sub1_8.method1710(local78);
				Static123.aClass23_4.method726(2, Static45.aClass1_Sub14_Sub1_8.aByteArray29);
				Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
				Static33.anInt965 = 3;
			}
			@Pc(115) int local115;
			if (Static33.anInt965 == 3) {
				if (Static58.aClass4_1 != null) {
					Static58.aClass4_1.method2776();
				}
				if (Static118.aClass4_2 != null) {
					Static118.aClass4_2.method2776();
				}
				local115 = Static123.aClass23_4.method734();
				if (Static58.aClass4_1 != null) {
					Static58.aClass4_1.method2776();
				}
				if (Static118.aClass4_2 != null) {
					Static118.aClass4_2.method2776();
				}
				if (local115 != 0) {
					Static70.method1204(local115);
					return;
				}
				Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
				Static33.anInt965 = 4;
			}
			if (Static33.anInt965 == 4) {
				if (Static1.aClass1_Sub14_Sub1_43.anInt2306 < 8) {
					local115 = Static123.aClass23_4.method732();
					if (local115 > 8 - Static1.aClass1_Sub14_Sub1_43.anInt2306) {
						local115 = 8 - Static1.aClass1_Sub14_Sub1_43.anInt2306;
					}
					if (local115 > 0) {
						Static123.aClass23_4.method729(Static1.aClass1_Sub14_Sub1_43.aByteArray29, Static1.aClass1_Sub14_Sub1_43.anInt2306, local115);
						Static1.aClass1_Sub14_Sub1_43.anInt2306 += local115;
					}
				}
				if (Static1.aClass1_Sub14_Sub1_43.anInt2306 == 8) {
					Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
					Static176.aLong134 = Static1.aClass1_Sub14_Sub1_43.method1732();
					Static33.anInt965 = 5;
				}
			}
			if (Static33.anInt965 == 5) {
				@Pc(205) int[] local205 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static176.aLong134 >> 32), (int) Static176.aLong134 };
				Static45.aClass1_Sub14_Sub1_8.anInt2306 = 0;
				Static45.aClass1_Sub14_Sub1_8.method1710(10);
				Static45.aClass1_Sub14_Sub1_8.method1724(local205[0]);
				Static45.aClass1_Sub14_Sub1_8.method1724(local205[1]);
				Static45.aClass1_Sub14_Sub1_8.method1724(local205[2]);
				Static45.aClass1_Sub14_Sub1_8.method1724(local205[3]);
				Static45.aClass1_Sub14_Sub1_8.method1721(Static139.aClass65_1958.method2475());
				Static45.aClass1_Sub14_Sub1_8.method1742(Static139.aClass65_1951);
				Static45.aClass1_Sub14_Sub1_8.method1723(Static37.aBigInteger1, Static135.aBigInteger2);
				Static142.aClass1_Sub14_Sub1_33.anInt2306 = 0;
				if (Static174.anInt3884 == 40) {
					Static142.aClass1_Sub14_Sub1_33.method1710(18);
				} else {
					Static142.aClass1_Sub14_Sub1_33.method1710(16);
				}
				Static142.aClass1_Sub14_Sub1_33.method1710(Static45.aClass1_Sub14_Sub1_8.anInt2306 + Static59.method1052(Static188.aClass65_2456) + 129);
				Static142.aClass1_Sub14_Sub1_33.method1724(493);
				Static142.aClass1_Sub14_Sub1_33.method1710(Static13.aBoolean36 ? 1 : 0);
				Static104.method1926(Static142.aClass1_Sub14_Sub1_33);
				Static142.aClass1_Sub14_Sub1_33.method1742(Static188.aClass65_2456);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static154.anInt3548);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static134.aClass60_Sub1_124.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static201.aClass60_Sub1_149.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static154.aClass60_Sub1_133.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static157.aClass60_Sub1_165.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static52.aClass60_Sub1_55.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static121.aClass60_Sub1_115.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static16.aClass60_Sub1_15.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static155.aClass60_Sub1_135.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static143.aClass60_Sub1_64.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static33.aClass60_Sub1_34.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static22.aClass60_Sub1_20.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static90.aClass60_Sub1_168.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static195.aClass60_Sub1_160.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static33.aClass60_Sub1_35.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static174.aClass60_Sub1_148.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static45.aClass60_Sub1_45.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static143.aClass60_Sub1_65.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static79.aClass60_Sub1_80.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static209.aClass60_Sub1_167.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static79.aClass60_Sub1_81.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static52.aClass60_Sub1_56.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static34.aClass60_Sub1_38.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static37.aClass60_Sub1_39.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1724(Static54.aClass60_Sub1_137.anInt3049);
				Static142.aClass1_Sub14_Sub1_33.method1731(Static45.aClass1_Sub14_Sub1_8.anInt2306, Static45.aClass1_Sub14_Sub1_8.aByteArray29);
				Static123.aClass23_4.method726(Static142.aClass1_Sub14_Sub1_33.anInt2306, Static142.aClass1_Sub14_Sub1_33.aByteArray29);
				Static45.aClass1_Sub14_Sub1_8.method1766(local205);
				for (@Pc(481) int local481 = 0; local481 < 4; local481++) {
					local205[local481] += 50;
				}
				Static1.aClass1_Sub14_Sub1_43.method1766(local205);
				Static33.anInt965 = 6;
			}
			if (Static33.anInt965 == 6 && Static123.aClass23_4.method732() > 0) {
				local115 = Static123.aClass23_4.method734();
				if (local115 == 21 && Static174.anInt3884 == 20) {
					Static33.anInt965 = 7;
				} else if (local115 == 2) {
					Static33.anInt965 = 9;
				} else if (local115 == 15 && Static174.anInt3884 == 40) {
					Static44.method728();
					return;
				} else if (local115 == 23 && Static7.anInt173 < 1) {
					Static7.anInt173++;
					Static33.anInt965 = 0;
				} else {
					Static70.method1204(local115);
					return;
				}
			}
			if (Static33.anInt965 == 7 && Static123.aClass23_4.method732() > 0) {
				Static136.anInt3358 = Static123.aClass23_4.method734() * 60 + 180;
				Static33.anInt965 = 8;
			}
			if (Static33.anInt965 == 8) {
				Static153.anInt3525 = 0;
				Static177.method2998(Static161.aClass65_2157, Static109.method2004(new Class65[] { Static118.method2250(Static136.anInt3358 / 60), Static198.aClass65_2540 }), Static72.aClass65_1097);
				if (--Static136.anInt3358 <= 0) {
					Static33.anInt965 = 0;
				}
			} else {
				if (Static33.anInt965 == 9 && Static123.aClass23_4.method732() >= 9) {
					Static129.anInt3184 = Static123.aClass23_4.method734();
					Static201.anInt3957 = Static123.aClass23_4.method734();
					Static3.aBoolean3 = Static123.aClass23_4.method734() == 1;
					Static142.anInt3429 = Static123.aClass23_4.method734();
					Static142.anInt3429 <<= 0x8;
					Static142.anInt3429 += Static123.aClass23_4.method734();
					Static58.anInt1537 = Static123.aClass23_4.method734();
					Static123.aClass23_4.method729(Static1.aClass1_Sub14_Sub1_43.aByteArray29, 0, 1);
					Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
					Static192.anInt4177 = Static1.aClass1_Sub14_Sub1_43.method1765();
					Static123.aClass23_4.method729(Static1.aClass1_Sub14_Sub1_43.aByteArray29, 0, 2);
					Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
					Static62.anInt1604 = Static1.aClass1_Sub14_Sub1_43.method1753();
					Static33.anInt965 = 10;
				}
				if (Static33.anInt965 != 10) {
					Static153.anInt3525++;
					if (Static153.anInt3525 > 2000) {
						if (Static7.anInt173 < 1) {
							Static33.anInt965 = 0;
							if (Static33.anInt969 == Static180.anInt3910) {
								Static33.anInt969 = Static177.anInt3987;
							} else {
								Static33.anInt969 = Static180.anInt3910;
							}
							Static7.anInt173++;
						} else {
							Static70.method1204(-3);
						}
					}
				} else if (Static123.aClass23_4.method732() >= Static62.anInt1604) {
					Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
					Static123.aClass23_4.method729(Static1.aClass1_Sub14_Sub1_43.aByteArray29, 0, Static62.anInt1604);
					Static186.method3083();
					Static148.anInt3494 = -1;
					Static185.method3077(false);
					Static192.anInt4177 = -1;
				}
			}
		} catch (@Pc(762) IOException local762) {
			if (Static7.anInt173 < 1) {
				Static33.anInt965 = 0;
				Static7.anInt173++;
				if (Static180.anInt3910 == Static33.anInt969) {
					Static33.anInt969 = Static177.anInt3987;
				} else {
					Static33.anInt969 = Static180.anInt3910;
				}
			} else {
				Static70.method1204(-2);
			}
		}
	}
}
