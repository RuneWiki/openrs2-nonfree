import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!fc;")
	public static Class21 aClass21_18;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "[Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array36;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Lclient!pb;")
	public static Class40 aClass40_27;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!pe;")
	public static Class6_Sub1_Sub1 aClass6_Sub1_Sub1_4 = new Class6_Sub1_Sub1(5000);

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!rc;")
	public static Class55 aClass55_893 = Static34.method846(" )2> @lre@");

	@OriginalMember(owner = "client!q", name = "q", descriptor = "[I")
	public static int[] anIntArray215 = new int[25];

	@OriginalMember(owner = "client!q", name = "r", descriptor = "I")
	public static int anInt2239 = 0;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "Lclient!te;")
	public static Class6_Sub2_Sub14 aClass6_Sub2_Sub14_37 = null;

	@OriginalMember(owner = "client!q", name = "t", descriptor = "[I")
	public static int[] anIntArray216 = new int[500];

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_894 = Static34.method846("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method1525() {
		aClass55_894 = null;
		aClass55_893 = null;
		aClass6_Sub1_Sub1_4 = null;
		anIntArray215 = null;
		aClass6_Sub2_Sub14_37 = null;
		aClass40_27 = null;
		aClass21_18 = null;
		aClass6_Sub2_Sub2_Sub1Array36 = null;
		anIntArray216 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZILclient!pb;IIII)V")
	public static synchronized void method1526(@OriginalArg(2) int arg0, @OriginalArg(3) Class40 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3) {
		if (!Static58.method1197()) {
			return;
		}
		Static98.anInt2838 = arg0;
		Static7.aBoolean17 = false;
		Static55.anInt1701 = -1;
		Static61.anInt1875 = arg2;
		Static99.aClass40_37 = arg1;
		Static55.anInt1710 = 10;
		Static102.anInt3020 = arg3;
		Static22.aBoolean44 = true;
		Static27.anInt1356 = 0;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static synchronized void method1527() {
		Static29.method744();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method1528() {
		Static65.anInt1935 = 0;
		for (@Pc(9) int local9 = -1; local9 < Static111.anInt3173 + Static78.anInt2246; local9++) {
			@Pc(24) Class6_Sub2_Sub3_Sub1 local24;
			if (local9 == -1) {
				local24 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1;
			} else if (local9 < Static78.anInt2246) {
				local24 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[Static101.anIntArray283[local9]];
			} else {
				local24 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[Static19.anIntArray60[local9 - Static78.anInt2246]];
			}
			if (local24 != null && local24.method1826()) {
				@Pc(54) Class6_Sub2_Sub4 local54;
				if (local24 instanceof Class6_Sub2_Sub3_Sub1_Sub2) {
					local54 = ((Class6_Sub2_Sub3_Sub1_Sub2) local24).aClass6_Sub2_Sub4_1;
					if (local54.anIntArray48 != null) {
						local54 = local54.method542();
					}
					if (local54 == null) {
						continue;
					}
				}
				@Pc(156) int local156;
				if (Static78.anInt2246 <= local9) {
					local54 = ((Class6_Sub2_Sub3_Sub1_Sub2) local24).aClass6_Sub2_Sub4_1;
					if (local54.anInt871 >= 0 && local54.anInt871 < Static58.aClass6_Sub2_Sub2_Sub2Array10.length) {
						Static45.method994(local24.anInt2723 + 15, local24);
						if (Static96.anInt2812 > -1) {
							Static58.aClass6_Sub2_Sub2_Sub2Array10[local54.anInt871].method646(Static96.anInt2812 - 12, Static74.anInt1809 - 30);
						}
					}
					if (Static110.anInt3147 == 1 && Static19.anIntArray60[local9 - Static78.anInt2246] == Static65.anInt1945 && Static85.anInt2389 % 20 < 10) {
						Static45.method994(local24.anInt2723 + 15, local24);
						if (Static96.anInt2812 > -1) {
							Static5.aClass6_Sub2_Sub2_Sub2Array12[0].method646(Static96.anInt2812 - 12, Static74.anInt1809 + -28);
						}
					}
				} else {
					local156 = 30;
					@Pc(159) Class6_Sub2_Sub3_Sub1_Sub1 local159 = (Class6_Sub2_Sub3_Sub1_Sub1) local24;
					if (local159.anInt682 != -1 || local159.anInt670 != -1) {
						Static45.method994(local24.anInt2723 + 15, local24);
						if (Static96.anInt2812 > -1) {
							if (local159.anInt682 != -1) {
								Static21.aClass6_Sub2_Sub2_Sub2Array4[local159.anInt682].method646(Static96.anInt2812 - 12, Static74.anInt1809 - 30);
								local156 += 25;
							}
							if (local159.anInt670 != -1) {
								Static58.aClass6_Sub2_Sub2_Sub2Array10[local159.anInt670].method646(Static96.anInt2812 - 12, Static74.anInt1809 + -local156);
								local156 += 25;
							}
						}
					}
					if (local9 >= 0 && Static110.anInt3147 == 10 && Static110.anInt3152 == Static101.anIntArray283[local9]) {
						Static45.method994(local24.anInt2723 + 15, local24);
						if (Static96.anInt2812 > -1) {
							Static5.aClass6_Sub2_Sub2_Sub2Array12[1].method646(Static96.anInt2812 - 12, Static74.anInt1809 + -local156);
						}
					}
				}
				if (local24.aClass55_1155 != null && (local9 >= Static78.anInt2246 || Static12.anInt717 == 0 || Static12.anInt717 == 3 || Static12.anInt717 == 1 && Static57.method1186(((Class6_Sub2_Sub3_Sub1_Sub1) local24).aClass55_245))) {
					Static45.method994(local24.anInt2723, local24);
					if (Static96.anInt2812 > -1 && Static6.anInt259 > Static65.anInt1935) {
						Static6.anIntArray16[Static65.anInt1935] = Static81.aClass6_Sub2_Sub2_Sub4_4.method1301(local24.aClass55_1155) / 2;
						Static6.anIntArray14[Static65.anInt1935] = Static81.aClass6_Sub2_Sub2_Sub4_4.anInt1866;
						Static6.anIntArray12[Static65.anInt1935] = Static96.anInt2812;
						Static6.anIntArray15[Static65.anInt1935] = Static74.anInt1809;
						Static6.anIntArray17[Static65.anInt1935] = local24.anInt2706;
						Static6.anIntArray13[Static65.anInt1935] = local24.anInt2757;
						Static6.anIntArray18[Static65.anInt1935] = local24.anInt2733;
						Static6.aClass55Array3[Static65.anInt1935] = local24.aClass55_1155;
						Static65.anInt1935++;
					}
				}
				if (Static85.anInt2389 < local24.anInt2703) {
					Static45.method994(local24.anInt2723 + 15, local24);
					if (Static96.anInt2812 > -1) {
						local156 = local24.anInt2704 * 30 / local24.anInt2725;
						if (local156 > 30) {
							local156 = 30;
						}
						Static53.method1276(Static96.anInt2812 - 15, Static74.anInt1809 + -3, local156, 5, 65280);
						Static53.method1276(local156 + Static96.anInt2812 - 15, Static74.anInt1809 + -3, 30 - local156, 5, 16711680);
					}
				}
				for (local156 = 0; local156 < 4; local156++) {
					if (local24.anIntArray252[local156] > Static85.anInt2389) {
						Static45.method994(local24.anInt2723 / 2, local24);
						if (Static96.anInt2812 > -1) {
							if (local156 == 1) {
								Static74.anInt1809 -= 20;
							}
							if (local156 == 2) {
								Static74.anInt1809 -= 10;
								Static96.anInt2812 -= 15;
							}
							if (local156 == 3) {
								Static96.anInt2812 += 15;
								Static74.anInt1809 -= 10;
							}
							Static38.aClass6_Sub2_Sub2_Sub2Array7[local24.anIntArray253[local156]].method646(Static96.anInt2812 - 12, Static74.anInt1809 + -12);
							Static57.aClass6_Sub2_Sub2_Sub4_2.method1307(Static58.method1196(local24.anIntArray254[local156]), Static96.anInt2812, Static74.anInt1809 + 4, 0);
							Static57.aClass6_Sub2_Sub2_Sub4_2.method1307(Static58.method1196(local24.anIntArray254[local156]), Static96.anInt2812 - 1, Static74.anInt1809 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(512) int local512 = 0; local512 < Static65.anInt1935; local512++) {
			@Pc(518) int local518 = Static6.anIntArray12[local512];
			@Pc(522) int local522 = Static6.anIntArray15[local512];
			@Pc(526) int local526 = Static6.anIntArray16[local512];
			@Pc(530) int local530 = Static6.anIntArray14[local512];
			@Pc(532) boolean local532 = true;
			while (local532) {
				local532 = false;
				for (@Pc(538) int local538 = 0; local538 < local512; local538++) {
					if (local522 + 2 > -Static6.anIntArray14[local538] + Static6.anIntArray15[local538] && Static6.anIntArray15[local538] + 2 > -local530 + local522 && local518 - local526 < Static6.anIntArray12[local538] - -Static6.anIntArray16[local538] && Static6.anIntArray12[local538] - Static6.anIntArray16[local538] < local526 + local518 && Static6.anIntArray15[local538] - Static6.anIntArray14[local538] < local522) {
						local522 = Static6.anIntArray15[local538] - Static6.anIntArray14[local538];
						local532 = true;
					}
				}
			}
			Static96.anInt2812 = Static6.anIntArray12[local512];
			Static74.anInt1809 = Static6.anIntArray15[local512] = local522;
			@Pc(636) Class55 local636 = Static6.aClass55Array3[local512];
			if (Static68.anInt2017 == 0) {
				@Pc(640) int local640 = 16776960;
				if (Static6.anIntArray17[local512] < 6) {
					local640 = Static92.anIntArray246[Static6.anIntArray17[local512]];
				}
				if (Static6.anIntArray17[local512] == 6) {
					local640 = Static86.anInt2443 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static6.anIntArray17[local512] == 7) {
					local640 = Static86.anInt2443 % 20 < 10 ? 255 : 65535;
				}
				if (Static6.anIntArray17[local512] == 8) {
					local640 = Static86.anInt2443 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(713) int local713;
				if (Static6.anIntArray17[local512] == 9) {
					local713 = 150 - Static6.anIntArray18[local512];
					if (local713 < 50) {
						local640 = local713 * 1280 + 16711680;
					} else if (local713 < 100) {
						local640 = 16776960 + 16384000 - local713 * 327680;
					} else if (local713 < 150) {
						local640 = (local713 - 100) * 5 + 65280;
					}
				}
				if (Static6.anIntArray17[local512] == 10) {
					local713 = 150 - Static6.anIntArray18[local512];
					if (local713 < 50) {
						local640 = local713 * 5 + 16711680;
					} else if (local713 < 100) {
						local640 = 33095935 - local713 * 327680;
					} else if (local713 < 150) {
						local640 = local713 * 327680 + 255 - (local713 + -100) * 5 - 32768000;
					}
				}
				if (Static6.anIntArray17[local512] == 11) {
					local713 = 150 - Static6.anIntArray18[local512];
					if (local713 < 50) {
						local640 = 16777215 - local713 * 327685;
					} else if (local713 < 100) {
						local640 = (local713 - 50) * 327685 + 65280;
					} else if (local713 < 150) {
						local640 = 16777215 + 32768000 - local713 * 327680;
					}
				}
				if (Static6.anIntArray13[local512] == 0) {
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(local636, Static96.anInt2812, Static74.anInt1809 + 1, 0);
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(local636, Static96.anInt2812, Static74.anInt1809, local640);
				}
				if (Static6.anIntArray13[local512] == 1) {
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1299(local636, Static96.anInt2812, Static74.anInt1809 + 1, 0, Static86.anInt2443);
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1299(local636, Static96.anInt2812, Static74.anInt1809, local640, Static86.anInt2443);
				}
				if (Static6.anIntArray13[local512] == 2) {
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1296(local636, Static96.anInt2812, Static74.anInt1809 + 1, 0, Static86.anInt2443);
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1296(local636, Static96.anInt2812, Static74.anInt1809, local640, Static86.anInt2443);
				}
				if (Static6.anIntArray13[local512] == 3) {
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1309(local636, Static96.anInt2812, Static74.anInt1809 + 1, 0, Static86.anInt2443, 150 - Static6.anIntArray18[local512]);
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1309(local636, Static96.anInt2812, Static74.anInt1809, local640, Static86.anInt2443, 150 - Static6.anIntArray18[local512]);
				}
				@Pc(984) int local984;
				if (Static6.anIntArray13[local512] == 4) {
					local713 = Static81.aClass6_Sub2_Sub2_Sub4_4.method1301(local636);
					local984 = (150 - Static6.anIntArray18[local512]) * (local713 + 100) / 150;
					Static53.method1277(Static96.anInt2812 - 50, 0, Static96.anInt2812 + 50, 334);
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1303(local636, Static96.anInt2812 + 50 - local984, Static74.anInt1809 + 1, 0);
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1303(local636, Static96.anInt2812 + 50 - local984, Static74.anInt1809, local640);
					Static53.method1289();
				}
				if (Static6.anIntArray13[local512] == 5) {
					local713 = 150 - Static6.anIntArray18[local512];
					Static53.method1277(0, Static74.anInt1809 - Static81.aClass6_Sub2_Sub2_Sub4_4.anInt1866 - 1, 512, Static74.anInt1809 + 5);
					local984 = 0;
					if (local713 < 25) {
						local984 = local713 - 25;
					} else if (local713 > 125) {
						local984 = local713 - 125;
					}
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(local636, Static96.anInt2812, local984 + Static74.anInt1809 + 1, 0);
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(local636, Static96.anInt2812, local984 + Static74.anInt1809, local640);
					Static53.method1289();
				}
			} else {
				Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(local636, Static96.anInt2812, Static74.anInt1809 + 1, 0);
				Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(local636, Static96.anInt2812, Static74.anInt1809, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method1529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class6_Sub12 local3 = null;
		for (@Pc(17) Class6_Sub12 local17 = (Class6_Sub12) Static109.aClass3_12.method31(); local17 != null; local17 = (Class6_Sub12) Static109.aClass3_12.method26()) {
			if (local17.anInt2393 == arg4 && arg0 == local17.anInt2388 && arg6 == local17.anInt2385 && arg7 == local17.anInt2381) {
				local3 = local17;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class6_Sub12();
			local3.anInt2381 = arg7;
			local3.anInt2385 = arg6;
			local3.anInt2388 = arg0;
			local3.anInt2393 = arg4;
			Static67.method1364(local3);
			Static109.aClass3_12.method23(local3);
		}
		local3.anInt2396 = arg8;
		local3.anInt2380 = arg1;
		local3.anInt2382 = arg2;
		local3.anInt2395 = arg5;
		local3.anInt2397 = arg3;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public static synchronized void method1530() {
		if (!Static58.method1197()) {
			return;
		}
		if (Static22.aBoolean44) {
			@Pc(18) byte[] local18 = Static3.method33(Static61.anInt1875, Static99.aClass40_37, Static98.anInt2838, Static27.anInt1356);
			if (local18 != null) {
				if (Static55.anInt1710 >= 0) {
					Static13.method503(Static55.anInt1710, Static7.aBoolean17, Static102.anInt3020, local18);
				} else if (Static55.anInt1701 < 0) {
					Static50.method2079(local18, Static7.aBoolean17, Static102.anInt3020);
				} else {
					Static13.method497(Static102.anInt3020, Static55.anInt1701, Static7.aBoolean17, local18);
				}
				Static99.aClass40_37 = null;
				Static22.aBoolean44 = false;
			}
		}
		Static94.method1792();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZIIIILclient!pb;)V")
	public static synchronized void method1531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class40 arg3) {
		if (!Static58.method1197()) {
			return;
		}
		Static98.anInt2838 = 0;
		Static61.anInt1875 = arg2;
		Static102.anInt3020 = arg0;
		Static7.aBoolean17 = false;
		Static27.anInt1356 = arg1;
		Static22.aBoolean44 = true;
		Static55.anInt1710 = -1;
		Static99.aClass40_37 = arg3;
		Static55.anInt1701 = -1;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
	public static synchronized void method1532() {
		if (Static58.method1197()) {
			Static32.method800();
			Static22.aBoolean44 = false;
			Static99.aClass40_37 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[Lclient!rc;)[Lclient!rc;")
	public static Class55[] method1533(@OriginalArg(1) Class55[] arg0) {
		@Pc(8) Class55[] local8 = new Class55[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static89.method1698(new Class55[] { Static58.method1196(local10), Static47.aClass55_587 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static89.method1698(new Class55[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZIILclient!rc;Lclient!rc;ILclient!pb;I)V")
	public static synchronized void method1534(@OriginalArg(3) Class55 arg0, @OriginalArg(4) Class55 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class40 arg3) {
		if (Static58.method1197()) {
			@Pc(16) int local16 = arg3.method1229(arg0);
			@Pc(22) int local22 = arg3.method1242(local16, arg1);
			method1526(local22, arg3, local16, arg2);
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)I")
	public static int method1535() {
		@Pc(7) int local7 = 3;
		if (Static81.anInt2299 < 310) {
			@Pc(14) int local14 = Static94.anInt2650 >> 7;
			@Pc(19) int local19 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 >> 7;
			@Pc(24) int local24 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 >> 7;
			@Pc(28) int local28 = Static61.anInt1876 >> 7;
			@Pc(36) int local36;
			if (local24 <= local14) {
				local36 = local14 - local24;
			} else {
				local36 = local24 - local14;
			}
			if ((Static43.aByteArrayArrayArray8[Static56.anInt1718][local14][local28] & 0x4) != 0) {
				local7 = Static56.anInt1718;
			}
			@Pc(70) int local70;
			if (local28 >= local19) {
				local70 = local28 - local19;
			} else {
				local70 = local19 - local28;
			}
			@Pc(86) int local86;
			@Pc(88) int local88;
			if (local36 <= local70) {
				local86 = local36 * 65536 / local70;
				local88 = 32768;
				while (local19 != local28) {
					local88 += local86;
					if (local28 < local19) {
						local28++;
					} else if (local28 > local19) {
						local28--;
					}
					if ((Static43.aByteArrayArrayArray8[Static56.anInt1718][local14][local28] & 0x4) != 0) {
						local7 = Static56.anInt1718;
					}
					if (local88 >= 65536) {
						local88 -= 65536;
						if (local14 < local24) {
							local14++;
						} else if (local24 < local14) {
							local14--;
						}
						if ((Static43.aByteArrayArrayArray8[Static56.anInt1718][local14][local28] & 0x4) != 0) {
							local7 = Static56.anInt1718;
						}
					}
				}
			} else {
				local88 = 32768;
				local86 = local70 * 65536 / local36;
				while (local14 != local24) {
					local88 += local86;
					if (local24 > local14) {
						local14++;
					} else if (local14 > local24) {
						local14--;
					}
					if ((Static43.aByteArrayArrayArray8[Static56.anInt1718][local14][local28] & 0x4) != 0) {
						local7 = Static56.anInt1718;
					}
					if (local88 >= 65536) {
						local88 -= 65536;
						if (local19 > local28) {
							local28++;
						} else if (local19 < local28) {
							local28--;
						}
						if ((Static43.aByteArrayArrayArray8[Static56.anInt1718][local14][local28] & 0x4) != 0) {
							local7 = Static56.anInt1718;
						}
					}
				}
			}
		}
		if ((Static43.aByteArrayArrayArray8[Static56.anInt1718][Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 >> 7][Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 >> 7] & 0x4) != 0) {
			local7 = Static56.anInt1718;
		}
		return local7;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)V")
	public static synchronized void method1536() {
		if (Static58.method1197()) {
			Static35.method864();
			Static99.aClass40_37 = null;
			Static22.aBoolean44 = false;
		}
	}
}
