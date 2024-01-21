import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!cc;")
	public static Class3_Sub2_Sub1 aClass3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	private static final int anInt8 = 50;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
	private static int[] anIntArray1 = new int[anInt8];

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
	private static int[] anIntArray2 = new int[anInt8];

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	public static int anInt7 = 0;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1 = Static56.method972("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!a", name = "l", descriptor = "[Lclient!ae;")
	private static Class5[] aClass5Array1 = new Class5[anInt8];

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
	private static int[] anIntArray3 = new int[anInt8];

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
	private static int[] anIntArray4 = new int[anInt8];

	@OriginalMember(owner = "client!a", name = "q", descriptor = "[I")
	private static int[] anIntArray5 = new int[anInt8];

	@OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
	public static int[] anIntArray6 = new int[2048];

	@OriginalMember(owner = "client!a", name = "t", descriptor = "[I")
	private static int[] anIntArray7 = new int[anInt8];

	@OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
	private static int[] anIntArray8 = new int[anInt8];

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_2 = Static56.method972("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_3 = aClass5_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V")
	public static void method1(@OriginalArg(1) boolean arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static115.anInt2977; local11++) {
			@Pc(19) Class3_Sub1_Sub1_Sub1_Sub1 local19 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[Static36.anIntArray320[local11]];
			@Pc(27) int local27 = (Static36.anIntArray320[local11] << 14) + 536870912;
			if (local19 != null && local19.method993() && local19.aClass3_Sub1_Sub13_1.aBoolean105 == arg0 && local19.aClass3_Sub1_Sub13_1.method1475()) {
				@Pc(56) int local56 = local19.anInt1567 >> 7;
				@Pc(61) int local61 = local19.anInt1543 >> 7;
				if (local56 >= 0 && local56 < 104 && local61 >= 0 && local61 < 104) {
					if (local19.anInt1562 == 1 && (local19.anInt1567 & 0x7F) == 64 && (local19.anInt1543 & 0x7F) == 64) {
						if (Static33.anIntArrayArray8[local56][local61] == Static72.anInt1857) {
							continue;
						}
						Static33.anIntArrayArray8[local56][local61] = Static72.anInt1857;
					}
					if (!local19.aClass3_Sub1_Sub13_1.aBoolean106) {
						local27 += Integer.MIN_VALUE;
					}
					Static73.aClass42_1.method1031(Static12.anInt480, local19.anInt1567, local19.anInt1543, Static15.method358((local19.anInt1562 - 1) * 64 + local19.anInt1543, Static12.anInt480, local19.anInt1567 + (local19.anInt1562 - 1) * 64), local19.anInt1562 * 64 - 4, local19, local19.anInt1517, local27, local19.aBoolean72);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lclient!ee;")
	public static Class3_Sub1_Sub4 method2(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub4 local12 = (Class3_Sub1_Sub4) Static74.aClass9_18.method282((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static49.aClass11_Sub1_50.method1882(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class3_Sub1_Sub4();
		@Pc(35) Class3_Sub6 local35 = new Class3_Sub6(local22);
		local35.anInt2416 = local35.aByteArray17.length - 12;
		@Pc(46) int local46 = local35.method1614();
		local12.anInt823 = local35.method1603();
		local12.anInt822 = local35.method1603();
		local12.anInt821 = local35.method1603();
		@Pc(68) int local68 = 0;
		local12.anInt816 = local35.method1603();
		local12.aClass5Array6 = new Class5[local46];
		local12.anIntArray104 = new int[local46];
		local12.anIntArray105 = new int[local46];
		local35.anInt2416 = 0;
		while (local35.anInt2416 < local35.aByteArray17.length - 12) {
			@Pc(96) int local96 = local35.method1603();
			if (local96 == 3) {
				local12.aClass5Array6[local68] = local35.method1627();
			} else if (local96 >= 100 || local96 == 21 || local96 == 38 || local96 == 39) {
				local12.anIntArray105[local68] = local35.method1587();
			} else {
				local12.anIntArray105[local68] = local35.method1614();
			}
			local12.anIntArray104[local68++] = local96;
		}
		Static74.aClass9_18.method284(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method3() {
		aClass5_1 = null;
		anIntArray8 = null;
		aClass3_Sub2_Sub1_1 = null;
		anIntArray2 = null;
		anIntArray6 = null;
		aClass5_2 = null;
		anIntArray7 = null;
		aClass5_3 = null;
		anIntArray5 = null;
		anIntArray1 = null;
		aClass5Array1 = null;
		anIntArray4 = null;
		anIntArray3 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method4() {
		Static70.anInt1838 = 0;
		@Pc(76) int local76;
		for (@Pc(9) int local9 = -1; local9 < Static115.anInt2977 + Static38.anInt1056; local9++) {
			@Pc(16) Class3_Sub1_Sub1_Sub1 local16;
			if (local9 == -1) {
				local16 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1;
			} else if (Static38.anInt1056 > local9) {
				local16 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[anIntArray6[local9]];
			} else {
				local16 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[Static36.anIntArray320[local9 - Static38.anInt1056]];
			}
			if (local16 != null && local16.method993()) {
				@Pc(53) Class3_Sub1_Sub13 local53;
				if (local16 instanceof Class3_Sub1_Sub1_Sub1_Sub1) {
					local53 = ((Class3_Sub1_Sub1_Sub1_Sub1) local16).aClass3_Sub1_Sub13_1;
					if (local53.anIntArray251 != null) {
						local53 = local53.method1480();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (Static38.anInt1056 <= local9) {
					local53 = ((Class3_Sub1_Sub1_Sub1_Sub1) local16).aClass3_Sub1_Sub13_1;
					if (local53.anInt2204 >= 0 && Static104.aClass3_Sub1_Sub2_Sub3Array10.length > local53.anInt2204) {
						Static52.method917(local16.anInt1572 + 15, local16);
						if (Static15.anInt519 > -1) {
							Static104.aClass3_Sub1_Sub2_Sub3Array10[local53.anInt2204].method1437(Static15.anInt519 - 12, Static91.anInt2350 + -30);
						}
					}
					if (Static64.anInt1692 == 1 && Static36.anIntArray320[local9 - Static38.anInt1056] == Static46.anInt1283 && Static3.anInt289 % 20 < 10) {
						Static52.method917(local16.anInt1572 + 15, local16);
						if (Static15.anInt519 > -1) {
							Static24.aClass3_Sub1_Sub2_Sub3Array1[0].method1437(Static15.anInt519 - 12, Static91.anInt2350 + -28);
						}
					}
				} else {
					@Pc(74) Class3_Sub1_Sub1_Sub1_Sub2 local74 = (Class3_Sub1_Sub1_Sub1_Sub2) local16;
					local76 = 30;
					if (local74.anInt1584 != -1 || local74.anInt1582 != -1) {
						Static52.method917(local16.anInt1572 + 15, local16);
						if (Static15.anInt519 > -1) {
							if (local74.anInt1584 != -1) {
								Static47.aClass3_Sub1_Sub2_Sub3Array8[local74.anInt1584].method1437(Static15.anInt519 - 12, Static91.anInt2350 + -30);
								local76 += 25;
							}
							if (local74.anInt1582 != -1) {
								Static104.aClass3_Sub1_Sub2_Sub3Array10[local74.anInt1582].method1437(Static15.anInt519 - 12, -local76 + Static91.anInt2350);
								local76 += 25;
							}
						}
					}
					if (local9 >= 0 && Static64.anInt1692 == 10 && Static51.anInt2382 == anIntArray6[local9]) {
						Static52.method917(local16.anInt1572 + 15, local16);
						if (Static15.anInt519 > -1) {
							Static24.aClass3_Sub1_Sub2_Sub3Array1[1].method1437(Static15.anInt519 - 12, Static91.anInt2350 + -local76);
						}
					}
				}
				if (local16.aClass5_758 != null && (local9 >= Static38.anInt1056 || Static99.anInt2488 == 0 || Static99.anInt2488 == 3 || Static99.anInt2488 == 1 && Static4.method134(((Class3_Sub1_Sub1_Sub1_Sub2) local16).aClass5_765))) {
					Static52.method917(local16.anInt1572, local16);
					if (Static15.anInt519 > -1 && anInt8 > Static70.anInt1838) {
						anIntArray5[Static70.anInt1838] = Static48.aClass3_Sub1_Sub2_Sub1_2.method267(local16.aClass5_758) / 2;
						anIntArray4[Static70.anInt1838] = Static48.aClass3_Sub1_Sub2_Sub1_2.anInt417;
						anIntArray1[Static70.anInt1838] = Static15.anInt519;
						anIntArray7[Static70.anInt1838] = Static91.anInt2350;
						anIntArray8[Static70.anInt1838] = local16.anInt1561;
						anIntArray3[Static70.anInt1838] = local16.anInt1539;
						anIntArray2[Static70.anInt1838] = local16.anInt1522;
						aClass5Array1[Static70.anInt1838] = local16.aClass5_758;
						Static70.anInt1838++;
					}
				}
				if (Static3.anInt289 < local16.anInt1518) {
					Static52.method917(local16.anInt1572 + 15, local16);
					if (Static15.anInt519 > -1) {
						local76 = local16.anInt1580 * 30 / local16.anInt1537;
						if (local76 > 30) {
							local76 = 30;
						}
						Static66.method1839(Static15.anInt519 - 15, Static91.anInt2350 - 3, local76, 5, 65280);
						Static66.method1839(Static15.anInt519 + local76 - 15, Static91.anInt2350 + -3, 30 - local76, 5, 16711680);
					}
				}
				for (local76 = 0; local76 < 4; local76++) {
					if (local16.anIntArray180[local76] > Static3.anInt289) {
						Static52.method917(local16.anInt1572 / 2, local16);
						if (Static15.anInt519 > -1) {
							if (local76 == 1) {
								Static91.anInt2350 -= 20;
							}
							if (local76 == 2) {
								Static91.anInt2350 -= 10;
								Static15.anInt519 -= 15;
							}
							if (local76 == 3) {
								Static15.anInt519 += 15;
								Static91.anInt2350 -= 10;
							}
							Static101.aClass3_Sub1_Sub2_Sub3Array13[local16.anIntArray178[local76]].method1437(Static15.anInt519 - 12, Static91.anInt2350 + -12);
							Static2.aClass3_Sub1_Sub2_Sub1_1.method259(Static96.method1319(local16.anIntArray179[local76]), Static15.anInt519, Static91.anInt2350 + 4, 0);
							Static2.aClass3_Sub1_Sub2_Sub1_1.method259(Static96.method1319(local16.anIntArray179[local76]), Static15.anInt519 - 1, Static91.anInt2350 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(500) int local500 = 0; local500 < Static70.anInt1838; local500++) {
			@Pc(506) int local506 = anIntArray7[local500];
			@Pc(510) int local510 = anIntArray4[local500];
			local76 = anIntArray1[local500];
			@Pc(518) int local518 = anIntArray5[local500];
			@Pc(520) boolean local520 = true;
			while (local520) {
				local520 = false;
				for (@Pc(526) int local526 = 0; local526 < local500; local526++) {
					if (local506 + 2 > anIntArray7[local526] + -anIntArray4[local526] && local506 - local510 < anIntArray7[local526] + 2 && anIntArray5[local526] + anIntArray1[local526] > local76 + -local518 && anIntArray1[local526] - anIntArray5[local526] < local518 + local76 && anIntArray7[local526] - anIntArray4[local526] < local506) {
						local520 = true;
						local506 = anIntArray7[local526] - anIntArray4[local526];
					}
				}
			}
			Static15.anInt519 = anIntArray1[local500];
			Static91.anInt2350 = anIntArray7[local500] = local506;
			@Pc(630) Class5 local630 = aClass5Array1[local500];
			if (Static113.anInt2946 == 0) {
				@Pc(637) int local637 = 16776960;
				if (anIntArray8[local500] < 6) {
					local637 = Static63.anIntArray374[anIntArray8[local500]];
				}
				if (anIntArray8[local500] == 6) {
					local637 = Static72.anInt1857 % 20 < 10 ? 16711680 : 16776960;
				}
				if (anIntArray8[local500] == 7) {
					local637 = Static72.anInt1857 % 20 >= 10 ? 65535 : 255;
				}
				if (anIntArray8[local500] == 8) {
					local637 = Static72.anInt1857 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(713) int local713;
				if (anIntArray8[local500] == 9) {
					local713 = 150 - anIntArray2[local500];
					if (local713 < 50) {
						local637 = local713 * 1280 + 16711680;
					} else if (local713 < 100) {
						local637 = 16776960 - (local713 - 50) * 327680;
					} else if (local713 < 150) {
						local637 = (local713 - 100) * 5 + 65280;
					}
				}
				if (anIntArray8[local500] == 10) {
					local713 = 150 - anIntArray2[local500];
					if (local713 < 50) {
						local637 = local713 * 5 + 16711680;
					} else if (local713 < 100) {
						local637 = 16711935 + 16384000 - local713 * 327680;
					} else if (local713 < 150) {
						local637 = local713 * 327680 + 500 + 255 - local713 * 5 - 32768000;
					}
				}
				if (anIntArray8[local500] == 11) {
					local713 = 150 - anIntArray2[local500];
					if (local713 < 50) {
						local637 = 16777215 - local713 * 327685;
					} else if (local713 < 100) {
						local637 = local713 * 327685 + 65280 - 16384250;
					} else if (local713 < 150) {
						local637 = 16777215 - (local713 - 100) * 327680;
					}
				}
				if (anIntArray3[local500] == 0) {
					Static48.aClass3_Sub1_Sub2_Sub1_2.method259(local630, Static15.anInt519, Static91.anInt2350 + 1, 0);
					Static48.aClass3_Sub1_Sub2_Sub1_2.method259(local630, Static15.anInt519, Static91.anInt2350, local637);
				}
				if (anIntArray3[local500] == 1) {
					Static48.aClass3_Sub1_Sub2_Sub1_2.method268(local630, Static15.anInt519, Static91.anInt2350 + 1, 0, Static72.anInt1857);
					Static48.aClass3_Sub1_Sub2_Sub1_2.method268(local630, Static15.anInt519, Static91.anInt2350, local637, Static72.anInt1857);
				}
				if (anIntArray3[local500] == 2) {
					Static48.aClass3_Sub1_Sub2_Sub1_2.method274(local630, Static15.anInt519, Static91.anInt2350 + 1, 0, Static72.anInt1857);
					Static48.aClass3_Sub1_Sub2_Sub1_2.method274(local630, Static15.anInt519, Static91.anInt2350, local637, Static72.anInt1857);
				}
				if (anIntArray3[local500] == 3) {
					Static48.aClass3_Sub1_Sub2_Sub1_2.method256(local630, Static15.anInt519, Static91.anInt2350 + 1, 0, Static72.anInt1857, 150 - anIntArray2[local500]);
					Static48.aClass3_Sub1_Sub2_Sub1_2.method256(local630, Static15.anInt519, Static91.anInt2350, local637, Static72.anInt1857, 150 - anIntArray2[local500]);
				}
				@Pc(977) int local977;
				if (anIntArray3[local500] == 4) {
					local713 = Static48.aClass3_Sub1_Sub2_Sub1_2.method267(local630);
					local977 = (150 - anIntArray2[local500]) * (local713 + 100) / 150;
					Static66.method1847(Static15.anInt519 - 50, 0, Static15.anInt519 + 50, 334);
					Static48.aClass3_Sub1_Sub2_Sub1_2.method277(local630, Static15.anInt519 + 50 - local977, Static91.anInt2350 + 1, 0);
					Static48.aClass3_Sub1_Sub2_Sub1_2.method277(local630, Static15.anInt519 + 50 - local977, Static91.anInt2350, local637);
					Static66.method1843();
				}
				if (anIntArray3[local500] == 5) {
					local977 = 0;
					local713 = 150 - anIntArray2[local500];
					Static66.method1847(0, Static91.anInt2350 - Static48.aClass3_Sub1_Sub2_Sub1_2.anInt417 - 1, 512, Static91.anInt2350 + 5);
					if (local713 < 25) {
						local977 = local713 - 25;
					} else if (local713 > 125) {
						local977 = local713 - 125;
					}
					Static48.aClass3_Sub1_Sub2_Sub1_2.method259(local630, Static15.anInt519, Static91.anInt2350 + local977 + 1, 0);
					Static48.aClass3_Sub1_Sub2_Sub1_2.method259(local630, Static15.anInt519, Static91.anInt2350 + local977, local637);
					Static66.method1843();
				}
			} else {
				Static48.aClass3_Sub1_Sub2_Sub1_2.method259(local630, Static15.anInt519, Static91.anInt2350 + 1, 0);
				Static48.aClass3_Sub1_Sub2_Sub1_2.method259(local630, Static15.anInt519, Static91.anInt2350, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method5() {
		@Pc(7) int local7 = Static53.anInt1408;
		@Pc(9) int local9 = Static15.anInt520;
		@Pc(11) int local11 = Static102.anInt2635;
		@Pc(15) int local15 = Static61.anInt1656;
		Static66.method1839(local11, local7, local9, local15, 6116423);
		Static66.method1839(local11 + 1, local7 + 1, local9 - 2, 16, 0);
		Static66.method1842(local11 + 1, local7 + 18, local9 - 2, local15 + -19, 0);
		Static48.aClass3_Sub1_Sub2_Sub1_2.method277(Static54.aClass5_710, local11 + 3, local7 - -14, 6116423);
		@Pc(67) int local67 = Static49.anInt1325;
		@Pc(69) int local69 = Static100.anInt2512;
		if (Static58.anInt1603 == 0) {
			local67 -= 4;
			local69 -= 4;
		}
		if (Static58.anInt1603 == 1) {
			local69 -= 553;
			local67 -= 205;
		}
		if (Static58.anInt1603 == 2) {
			local69 -= 17;
			local67 -= 357;
		}
		for (@Pc(87) int local87 = 0; local87 < Static75.anInt1934; local87++) {
			@Pc(91) int local91 = 16777215;
			@Pc(105) int local105 = local7 + (-local87 + -1 + Static75.anInt1934) * 15 + 31;
			if (local11 < local69 && local11 + local9 > local69 && local67 > local105 - 13 && local67 < local105 + 3) {
				local91 = 16776960;
			}
			Static48.aClass3_Sub1_Sub2_Sub1_2.method265(Static49.aClass5Array9[local87], local11 + 3, local105, local91, true);
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public static void method6() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static115.anIntArray381[local9 + 32512] = 255;
			}
		}
		@Pc(56) int local56;
		@Pc(49) int local49;
		@Pc(62) int local62;
		for (local16 = 0; local16 < 100; local16++) {
			local49 = (int) (Math.random() * 128.0D) + 128;
			local56 = (int) (Math.random() * 124.0D) + 2;
			local62 = (local49 << 7) + local56;
			Static115.anIntArray381[local62] = 192;
		}
		for (local56 = 1; local56 < 255; local56++) {
			for (local49 = 1; local49 < 127; local49++) {
				local62 = local49 + (local56 << 7);
				Static91.anIntArray267[local62] = (Static115.anIntArray381[local62 - 128] + Static115.anIntArray381[local62 - 1] + Static115.anIntArray381[local62 + 1] + Static115.anIntArray381[local62 - -128]) / 4;
			}
		}
		Static53.anInt1407 += 128;
		if (Static53.anInt1407 > Static9.anIntArray51.length) {
			local49 = (int) (Math.random() * 12.0D);
			Static53.anInt1407 -= Static9.anIntArray51.length;
			Static99.method1661(Static96.aClass3_Sub1_Sub2_Sub4Array4[local49]);
		}
		@Pc(159) int local159;
		for (local49 = 1; local49 < 255; local49++) {
			for (local62 = 1; local62 < 127; local62++) {
				local159 = (local49 << 7) + local62;
				@Pc(179) int local179 = Static91.anIntArray267[local159 + 128] - Static9.anIntArray51[Static53.anInt1407 + local159 & Static9.anIntArray51.length + -1] / 5;
				if (local179 < 0) {
					local179 = 0;
				}
				Static115.anIntArray381[local159] = local179;
			}
		}
		for (local62 = 0; local62 < 255; local62++) {
			Static61.anIntArray200[local62] = Static61.anIntArray200[local62 + 1];
		}
		Static61.anIntArray200[255] = (int) (Math.sin((double) Static3.anInt289 / 14.0D) * 16.0D + Math.sin((double) Static3.anInt289 / 15.0D) * 14.0D + Math.sin((double) Static3.anInt289 / 16.0D) * 12.0D);
		if (Static24.anInt741 > 0) {
			Static24.anInt741 -= 4;
		}
		if (Static72.anInt1864 > 0) {
			Static72.anInt1864 -= 4;
		}
		if (Static24.anInt741 != 0 || Static72.anInt1864 != 0) {
			return;
		}
		local159 = (int) (Math.random() * 2000.0D);
		if (local159 == 0) {
			Static24.anInt741 = 1024;
		}
		if (local159 == 1) {
			Static72.anInt1864 = 1024;
			return;
		}
	}
}
