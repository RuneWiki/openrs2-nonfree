import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!oa;")
	private static Class56 aClass56_363 = Static33.method650("Loaded title screen");

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!oa;")
	private static Class56 aClass56_365 = Static33.method650("Ok");

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_364 = aClass56_365;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "I")
	public static int anInt756 = -1;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!oa;")
	private static Class56 aClass56_373 = Static33.method650(" has logged out)3");

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_366 = aClass56_373;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_367 = aClass56_363;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_368 = Static33.method650("Entfernen");

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_369 = Static33.method650("@yel@*V");

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Lclient!oa;")
	private static Class56 aClass56_375 = Static33.method650("Loaded input handler");

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_370 = aClass56_375;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_371 = Static33.method650("Fertigkeit)2");

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_372 = Static33.method650("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!oa;")
	public static Class56 aClass56_374 = Static33.method650("mapmarker");

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	private static int anInt762 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V")
	public static void method531(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class3_Sub12 local14 = (Class3_Sub12) Static41.aClass2_1.method10(); local14 != null; local14 = (Class3_Sub12) Static41.aClass2_1.method14()) {
			if ((local14.aLong94 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method2055();
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	public static void method532(@OriginalArg(0) int arg0) {
		Static27.method558(arg0);
		method531(arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILclient!ta;II)V")
	public static void method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub15 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub16 local7 = new Class3_Sub16();
		local7.anInt2611 = arg0 * 128;
		local7.anInt2620 = arg1 * 128;
		local7.anIntArray224 = arg3.anIntArray261;
		local7.anInt2621 = arg3.anInt2734 * 128;
		local7.anInt2608 = arg2;
		local7.anInt2610 = arg3.anInt2733;
		local7.anInt2619 = arg3.anInt2735;
		local7.anInt2616 = arg3.anInt2744;
		@Pc(45) int local45 = arg3.anInt2745;
		@Pc(48) int local48 = arg3.anInt2743;
		if (arg4 == 1 || arg4 == 3) {
			local48 = arg3.anInt2745;
			local45 = arg3.anInt2743;
		}
		local7.anInt2623 = (local45 + arg0) * 128;
		local7.anInt2624 = (local48 + arg1) * 128;
		if (arg3.anIntArray259 != null) {
			local7.aClass3_Sub1_Sub15_1 = arg3;
			local7.method1750();
		}
		Static98.aClass37_12.method985(local7);
		if (local7.anIntArray224 != null) {
			local7.anInt2618 = local7.anInt2619 + (int) (Math.random() * (double) (local7.anInt2610 - local7.anInt2619));
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method534() {
		@Pc(5) int local5 = Static57.aClass3_Sub1_Sub1_Sub1_3.method745(Static114.aClass56_1569);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static66.anInt559; local11++) {
			local19 = Static57.aClass3_Sub1_Sub1_Sub1_3.method731(Static28.aClass56Array2[local11]);
			if (local5 < local19) {
				local5 = local19;
			}
		}
		local5 += 8;
		local19 = Static66.anInt559 * 15 + 21;
		@Pc(79) int local79;
		@Pc(70) int local70;
		if (Static63.anInt1818 != -1) {
			Static57.anInt1610 = Static66.anInt559 * 15 + 22;
			local79 = Static127.anInt3209 - local5 / 2;
			Static14.anInt319 = local5;
			Static42.anInt1117 = 0;
			if (local79 + local5 > 765) {
				local79 = 765 - local5;
			}
			Static122.aBoolean163 = true;
			if (local79 < 0) {
				local79 = 0;
			}
			local70 = Static71.anInt1970;
			Static115.anInt2940 = local79;
			if (local70 + local19 > 503) {
				local70 = 503 - local19;
			}
			if (local70 < 0) {
				local70 = 0;
			}
			Static23.anInt690 = local70;
			return;
		}
		if (Static127.anInt3209 > 4 && Static71.anInt1970 > 4 && Static127.anInt3209 < 516 && Static71.anInt1970 < 338) {
			Static14.anInt319 = local5;
			Static42.anInt1117 = 0;
			Static122.aBoolean163 = true;
			local70 = Static71.anInt1970 - 4;
			local79 = Static127.anInt3209 - local5 / 2 - 4;
			Static57.anInt1610 = Static66.anInt559 * 15 + 22;
			if (local79 + local5 > 512) {
				local79 = 512 - local5;
			}
			if (local70 + local19 > 334) {
				local70 = 334 - local19;
			}
			if (local79 < 0) {
				local79 = 0;
			}
			Static115.anInt2940 = local79;
			if (local70 < 0) {
				local70 = 0;
			}
			Static23.anInt690 = local70;
			return;
		}
		if (Static127.anInt3209 > 553 && Static71.anInt1970 > 205 && Static127.anInt3209 < 743 && Static71.anInt1970 < 466) {
			Static57.anInt1610 = Static66.anInt559 * 15 + 22;
			Static14.anInt319 = local5;
			Static122.aBoolean163 = true;
			local79 = Static127.anInt3209 - local5 / 2 - 553;
			Static42.anInt1117 = 1;
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 + local5 > 190) {
				local79 = 190 - local5;
			}
			Static115.anInt2940 = local79;
			local70 = Static71.anInt1970 - 205;
			if (local70 < 0) {
				local70 = 0;
			} else if (local19 + local70 > 261) {
				local70 = 261 - local19;
			}
			Static23.anInt690 = local70;
			return;
		}
		if (Static127.anInt3209 <= 17 || Static71.anInt1970 <= 357 || Static127.anInt3209 >= 496 || Static71.anInt1970 >= 453) {
			return;
		}
		Static57.anInt1610 = Static66.anInt559 * 15 + 22;
		Static14.anInt319 = local5;
		Static42.anInt1117 = 2;
		Static122.aBoolean163 = true;
		local79 = Static127.anInt3209 - local5 / 2 - 17;
		local70 = Static71.anInt1970 - 357;
		if (local70 < 0) {
			local70 = 0;
		} else if (local70 + local19 > 96) {
			local70 = 96 - local19;
		}
		if (local79 < 0) {
			local79 = 0;
		} else if (local5 + local79 > 479) {
			local79 = 479 - local5;
		}
		Static23.anInt690 = local70;
		Static115.anInt2940 = local79;
		return;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
	public static void method535() {
		aClass56_363 = null;
		aClass56_365 = null;
		aClass56_366 = null;
		aClass56_367 = null;
		aClass56_374 = null;
		aClass56_372 = null;
		aClass56_371 = null;
		aClass56_369 = null;
		aClass56_364 = null;
		aClass56_375 = null;
		aClass56_368 = null;
		aClass56_373 = null;
		aClass56_370 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B[Lclient!wc;Lclient!d;)V")
	public static void method536(@OriginalArg(1) Class81[] arg0, @OriginalArg(2) Class14 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static66.aByteArrayArrayArray3[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static66.aByteArrayArrayArray3[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method2002(local15, local11);
						}
					}
				}
			}
		}
		anInt762 += (int) (Math.random() * 5.0D) - 2;
		if (anInt762 < -8) {
			anInt762 = -8;
		}
		Static102.anInt3217 += (int) (Math.random() * 5.0D) - 2;
		if (Static102.anInt3217 < -16) {
			Static102.anInt3217 = -16;
		}
		if (anInt762 > 8) {
			anInt762 = 8;
		}
		if (Static102.anInt3217 > 16) {
			Static102.anInt3217 = 16;
		}
		@Pc(131) int local131;
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(179) int local179;
		@Pc(159) int local159;
		@Pc(193) int local193;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(209) int local209;
		@Pc(226) int local226;
		@Pc(274) int local274;
		@Pc(504) int local504;
		@Pc(548) int local548;
		@Pc(645) int local645;
		@Pc(655) int local655;
		@Pc(670) int local670;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(121) byte[][] local121 = Static117.aByteArrayArrayArray8[local11];
			local32 = (int) Math.sqrt(5100.0D);
			local131 = local32 * 768 >> 8;
			for (local133 = 1; local133 < 103; local133++) {
				for (local137 = 1; local137 < 103; local137++) {
					local159 = Static22.anIntArrayArrayArray4[local11][local137][local133 + 1] - Static22.anIntArrayArrayArray4[local11][local137][local133 - 1];
					local179 = Static22.anIntArrayArrayArray4[local11][local137 + 1][local133] - Static22.anIntArrayArrayArray4[local11][local137 - 1][local133];
					local193 = (int) Math.sqrt((double) (local179 * local179 + local159 * local159 + 65536));
					local199 = (local179 << 8) / local193;
					local203 = 65536 / local193;
					local209 = (local159 << 8) / local193;
					local226 = (local209 * -50 + local203 * -10 + local199 * -50) / local131 + 96;
					local274 = (local121[local137][local133] >> 1) + (local121[local137][local133 + 1] >> 3) + (local121[local137 + 1][local133] >> 3) + (local121[local137 - 1][local133] >> 2) + (local121[local137][local133 + -1] >> 2);
					Static38.anIntArrayArray8[local137][local133] = local226 - local274;
				}
			}
			for (local137 = 0; local137 < 104; local137++) {
				Static106.anIntArray226[local137] = 0;
				Static15.anIntArray29[local137] = 0;
				Static38.anIntArray63[local137] = 0;
				Static64.anIntArray141[local137] = 0;
				Static54.anIntArray109[local137] = 0;
			}
			for (local179 = -5; local179 < 109; local179++) {
				for (local159 = 0; local159 < 104; local159++) {
					local193 = local179 + 5;
					@Pc(401) int local401;
					if (local193 >= 0 && local193 < 104) {
						local199 = Static43.aByteArrayArrayArray6[local11][local193][local159] & 0xFF;
						if (local199 > 0) {
							@Pc(365) Class3_Sub1_Sub10 local365 = Static2.method16(local199 - 1);
							Static106.anIntArray226[local159] += local365.anInt2139;
							Static15.anIntArray29[local159] += local365.anInt2135;
							Static38.anIntArray63[local159] += local365.anInt2141;
							Static64.anIntArray141[local159] += local365.anInt2147;
							local401 = Static54.anIntArray109[local159]++;
						}
					}
					local199 = local179 - 5;
					if (local199 >= 0 && local199 < 104) {
						local203 = Static43.aByteArrayArrayArray6[local11][local199][local159] & 0xFF;
						if (local203 > 0) {
							@Pc(437) Class3_Sub1_Sub10 local437 = Static2.method16(local203 - 1);
							Static106.anIntArray226[local159] -= local437.anInt2139;
							Static15.anIntArray29[local159] -= local437.anInt2135;
							Static38.anIntArray63[local159] -= local437.anInt2141;
							Static64.anIntArray141[local159] -= local437.anInt2147;
							local401 = Static54.anIntArray109[local159]--;
						}
					}
				}
				if (local179 >= 1 && local179 < 103) {
					local199 = 0;
					local193 = 0;
					local209 = 0;
					local203 = 0;
					local226 = 0;
					for (local274 = -5; local274 < 109; local274++) {
						local504 = local274 + 5;
						if (local504 >= 0 && local504 < 104) {
							local199 += Static15.anIntArray29[local504];
							local226 += Static54.anIntArray109[local504];
							local209 += Static64.anIntArray141[local504];
							local203 += Static38.anIntArray63[local504];
							local193 += Static106.anIntArray226[local504];
						}
						local548 = local274 - 5;
						if (local548 >= 0 && local548 < 104) {
							local226 -= Static54.anIntArray109[local548];
							local199 -= Static15.anIntArray29[local548];
							local209 -= Static64.anIntArray141[local548];
							local193 -= Static106.anIntArray226[local548];
							local203 -= Static38.anIntArray63[local548];
						}
						if (local274 >= 1 && local274 < 103 && (!Static77.aBoolean169 || (Static66.aByteArrayArrayArray3[0][local179][local274] & 0x2) != 0 || (Static66.aByteArrayArrayArray3[local11][local179][local274] & 0x10) == 0 && Static84.method1525(local274, local11, local179) == Static14.anInt326)) {
							if (local11 < Static66.anInt569) {
								Static66.anInt569 = local11;
							}
							local645 = Static43.aByteArrayArrayArray6[local11][local179][local274] & 0xFF;
							local655 = Static18.aByteArrayArrayArray1[local11][local179][local274] & 0xFF;
							if (local645 > 0 || local655 > 0) {
								local670 = Static22.anIntArrayArrayArray4[local11][local179][local274];
								@Pc(682) int local682 = Static22.anIntArrayArrayArray4[local11][local179 + 1][local274 + 1];
								@Pc(692) int local692 = Static22.anIntArrayArrayArray4[local11][local179 + 1][local274];
								@Pc(702) int local702 = Static22.anIntArrayArrayArray4[local11][local179][local274 + 1];
								@Pc(708) int local708 = Static38.anIntArrayArray8[local179][local274];
								@Pc(716) int local716 = Static38.anIntArrayArray8[local179 + 1][local274];
								@Pc(726) int local726 = Static38.anIntArrayArray8[local179 + 1][local274 + 1];
								@Pc(734) int local734 = Static38.anIntArrayArray8[local179][local274 + 1];
								@Pc(736) int local736 = -1;
								@Pc(738) int local738 = -1;
								@Pc(746) int local746;
								@Pc(754) int local754;
								if (local645 > 0) {
									local746 = local193 * 256 / local209;
									@Pc(750) int local750 = local203 / local226;
									local754 = local199 / local226;
									local736 = Static72.method812(local746, local750, local754);
									local750 += Static102.anInt3217;
									@Pc(770) int local770 = local746 + anInt762 & 0xFF;
									if (local750 < 0) {
										local750 = 0;
									} else if (local750 > 255) {
										local750 = 255;
									}
									local738 = Static72.method812(local770, local750, local754);
								}
								if (local11 > 0) {
									@Pc(791) boolean local791 = true;
									if (local645 == 0 && Static116.aByteArrayArrayArray7[local11][local179][local274] != 0) {
										local791 = false;
									}
									if (local655 > 0 && !Static72.method810(local655 - 1).aBoolean62) {
										local791 = false;
									}
									if (local791 && local692 == local670 && local670 == local682 && local670 == local702) {
										Static73.anIntArrayArrayArray5[local11][local179][local274] |= 0x924;
									}
								}
								local746 = 0;
								if (local738 != -1) {
									local746 = Static55.anIntArray113[Static119.method1929(local738, 96)];
								}
								if (local655 == 0) {
									arg1.method409(local11, local179, local274, 0, 0, -1, local670, local692, local682, local702, Static119.method1929(local736, local708), Static119.method1929(local736, local716), Static119.method1929(local736, local726), Static119.method1929(local736, local734), 0, 0, 0, 0, local746, 0);
								} else {
									local754 = Static116.aByteArrayArrayArray7[local11][local179][local274] + 1;
									@Pc(888) byte local888 = Static43.aByteArrayArrayArray5[local11][local179][local274];
									@Pc(894) Class3_Sub1_Sub7 local894 = Static72.method810(local655 - 1);
									@Pc(897) int local897 = local894.anInt1439;
									@Pc(909) int local909;
									@Pc(907) int local907;
									@Pc(948) int local948;
									@Pc(930) int local930;
									if (local897 >= 0) {
										local907 = Static55.anInterface2_1.method570(local897);
										local909 = -1;
									} else if (local894.anInt1433 == 16711935) {
										local907 = -2;
										local897 = -1;
										local909 = -2;
									} else {
										local909 = Static72.method812(local894.anInt1427, local894.anInt1435, local894.anInt1431);
										local930 = local894.anInt1435 + Static102.anInt3217;
										if (local930 < 0) {
											local930 = 0;
										} else if (local930 > 255) {
											local930 = 255;
										}
										local948 = local894.anInt1427 + anInt762 & 0xFF;
										local907 = Static72.method812(local948, local930, local894.anInt1431);
									}
									local948 = 0;
									if (local907 != -2) {
										local948 = Static55.anIntArray113[Static79.method1394(local907, 96)];
									}
									if (local894.anInt1430 != -1) {
										local930 = local894.anInt1434 + anInt762 & 0xFF;
										@Pc(994) int local994 = Static102.anInt3217 + local894.anInt1436;
										if (local994 < 0) {
											local994 = 0;
										} else if (local994 > 255) {
											local994 = 255;
										}
										local907 = Static72.method812(local930, local994, local894.anInt1442);
										local948 = Static55.anIntArray113[Static79.method1394(local907, 96)];
									}
									arg1.method409(local11, local179, local274, local754, local888, local897, local670, local692, local682, local702, Static119.method1929(local736, local708), Static119.method1929(local736, local716), Static119.method1929(local736, local726), Static119.method1929(local736, local734), Static79.method1394(local909, local708), Static79.method1394(local909, local716), Static79.method1394(local909, local726), Static79.method1394(local909, local734), local746, local948);
								}
							}
						}
					}
				}
			}
			for (local159 = 1; local159 < 103; local159++) {
				for (local193 = 1; local193 < 103; local193++) {
					arg1.method428(local11, local193, local159, Static84.method1525(local159, local11, local193));
				}
			}
			Static43.aByteArrayArrayArray6[local11] = null;
			Static18.aByteArrayArrayArray1[local11] = null;
			Static116.aByteArrayArrayArray7[local11] = null;
			Static43.aByteArrayArrayArray5[local11] = null;
			Static117.aByteArrayArrayArray8[local11] = null;
		}
		arg1.method452();
		for (local15 = 0; local15 < 104; local15++) {
			for (local32 = 0; local32 < 104; local32++) {
				if ((Static66.aByteArrayArrayArray3[1][local15][local32] & 0x2) == 2) {
					arg1.method410(local15, local32);
				}
			}
		}
		local32 = 1;
		local133 = 4;
		local131 = 2;
		for (local137 = 0; local137 < 4; local137++) {
			if (local137 > 0) {
				local133 <<= 0x3;
				local131 <<= 0x3;
				local32 <<= 0x3;
			}
			for (local179 = 0; local179 <= local137; local179++) {
				for (local159 = 0; local159 <= 104; local159++) {
					for (local193 = 0; local193 <= 104; local193++) {
						if ((Static73.anIntArrayArrayArray5[local179][local193][local159] & local32) != 0) {
							for (local199 = local159; local199 > 0 && (local32 & Static73.anIntArrayArrayArray5[local179][local193][local199 - 1]) != 0; local199--) {
							}
							for (local203 = local159; local203 < 104 && (Static73.anIntArrayArrayArray5[local179][local193][local203 + 1] & local32) != 0; local203++) {
							}
							label348: for (local209 = local179; local209 > 0; local209--) {
								for (local274 = local199; local274 <= local203; local274++) {
									if ((local32 & Static73.anIntArrayArrayArray5[local209 - 1][local193][local274]) == 0) {
										break label348;
									}
								}
							}
							label336: for (local226 = local179; local226 < local137; local226++) {
								for (local274 = local199; local274 <= local203; local274++) {
									if ((Static73.anIntArrayArrayArray5[local226 + 1][local193][local274] & local32) == 0) {
										break label336;
									}
								}
							}
							local274 = (local226 + 1 - local209) * (local203 + 1 - local199);
							if (local274 >= 8) {
								local548 = Static22.anIntArrayArrayArray4[local226][local193][local199] - 240;
								local645 = Static22.anIntArrayArrayArray4[local209][local193][local199];
								Static20.method422(local137, 1, local193 * 128, local193 * 128, local199 * 128, local203 * 128 + 128, local548, local645);
								for (local655 = local209; local655 <= local226; local655++) {
									for (local670 = local199; local670 <= local203; local670++) {
										Static73.anIntArrayArrayArray5[local655][local193][local670] &= ~local32;
									}
								}
							}
						}
						if ((Static73.anIntArrayArrayArray5[local179][local193][local159] & local131) != 0) {
							local199 = local193;
							local209 = local179;
							for (local203 = local193; local203 < 104 && (Static73.anIntArrayArrayArray5[local179][local203 + 1][local159] & local131) != 0; local203++) {
							}
							while (local199 > 0 && (Static73.anIntArrayArrayArray5[local179][local199 - 1][local159] & local131) != 0) {
								local199--;
							}
							local226 = local179;
							label403: while (local209 > 0) {
								for (local274 = local199; local274 <= local203; local274++) {
									if ((Static73.anIntArrayArrayArray5[local209 - 1][local274][local159] & local131) == 0) {
										break label403;
									}
								}
								local209--;
							}
							label392: while (local137 > local226) {
								for (local274 = local199; local274 <= local203; local274++) {
									if ((Static73.anIntArrayArrayArray5[local226 + 1][local274][local159] & local131) == 0) {
										break label392;
									}
								}
								local226++;
							}
							local274 = (local226 + 1 - local209) * (local203 + 1 - local199);
							if (local274 >= 8) {
								local548 = Static22.anIntArrayArrayArray4[local226][local199][local159] - 240;
								local645 = Static22.anIntArrayArrayArray4[local209][local199][local159];
								Static20.method422(local137, 2, local199 * 128, local203 * 128 + 128, local159 * 128, local159 * 128, local548, local645);
								for (local655 = local209; local655 <= local226; local655++) {
									for (local670 = local199; local670 <= local203; local670++) {
										Static73.anIntArrayArrayArray5[local655][local670][local159] &= ~local131;
									}
								}
							}
						}
						if ((Static73.anIntArrayArrayArray5[local179][local193][local159] & local133) != 0) {
							local203 = local193;
							for (local209 = local159; local209 > 0 && (Static73.anIntArrayArrayArray5[local179][local193][local209 - 1] & local133) != 0; local209--) {
							}
							for (local226 = local159; local226 < 104 && (Static73.anIntArrayArrayArray5[local179][local193][local226 + 1] & local133) != 0; local226++) {
							}
							label457: for (local199 = local193; local199 > 0; local199--) {
								for (local274 = local209; local274 <= local226; local274++) {
									if ((local133 & Static73.anIntArrayArrayArray5[local179][local199 - 1][local274]) == 0) {
										break label457;
									}
								}
							}
							label446: while (local203 < 104) {
								for (local274 = local209; local274 <= local226; local274++) {
									if ((local133 & Static73.anIntArrayArrayArray5[local179][local203 + 1][local274]) == 0) {
										break label446;
									}
								}
								local203++;
							}
							if ((local226 + 1 - local209) * (local203 + 1 - local199) >= 4) {
								local274 = Static22.anIntArrayArrayArray4[local179][local199][local209];
								Static20.method422(local137, 4, local199 * 128, local203 * 128 + 128, local209 * 128, local226 * 128 + 128, local274, local274);
								for (local504 = local199; local504 <= local203; local504++) {
									for (local548 = local209; local548 <= local226; local548++) {
										Static73.anIntArrayArrayArray5[local179][local504][local548] &= ~local133;
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
