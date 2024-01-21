import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!jf", name = "Oc", descriptor = "Lclient!na;")
	public static Class53 aClass53_667 = Static109.method1737(")1j");

	@OriginalMember(owner = "client!jf", name = "Uc", descriptor = "I")
	public static int anInt1488 = 0;

	@OriginalMember(owner = "client!jf", name = "ad", descriptor = "I")
	public static int anInt1493 = 0;

	@OriginalMember(owner = "client!jf", name = "md", descriptor = "Lclient!ud;")
	public static Class77 aClass77_7 = new Class77(4096);

	@OriginalMember(owner = "client!jf", name = "nd", descriptor = "I")
	public static int anInt1504 = 0;

	@OriginalMember(owner = "client!jf", name = "rd", descriptor = "I")
	public static int anInt1508 = 127;

	@OriginalMember(owner = "client!jf", name = "ud", descriptor = "Lclient!na;")
	private static Class53 aClass53_671 = Static109.method1737("You have only just left another world)3");

	@OriginalMember(owner = "client!jf", name = "sd", descriptor = "Lclient!na;")
	public static Class53 aClass53_669 = aClass53_671;

	@OriginalMember(owner = "client!jf", name = "td", descriptor = "Lclient!na;")
	public static Class53 aClass53_670 = Static109.method1737("Name eingeben:");

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "(I)V")
	public static void method1038() {
		Static70.aByteArrayArrayArray15 = new byte[4][104][104];
		Static85.anIntArray270 = new int[104];
		Static73.anIntArrayArray15 = new int[105][105];
		Static82.aByteArrayArrayArray6 = new byte[4][105][105];
		Static40.aByteArrayArrayArray9 = new byte[4][104][104];
		Static46.anIntArray415 = new int[104];
		Static104.aByteArrayArrayArray19 = new byte[4][104][104];
		Static107.aByteArrayArrayArray18 = new byte[4][104][104];
		Static122.anIntArray411 = new int[104];
		Static27.anIntArrayArrayArray1 = new int[4][105][105];
		Static124.anIntArray416 = new int[104];
		Static108.anIntArray328 = new int[104];
		Static21.anInt706 = 99;
	}

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "(I)V")
	public static void method1039() {
		Static42.anInt1217 = 0;
		@Pc(77) int local77;
		for (@Pc(9) int local9 = -1; local9 < Static72.anInt1820 + Static20.anInt693; local9++) {
			@Pc(23) Class3_Sub1_Sub4_Sub1 local23;
			if (local9 == -1) {
				local23 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1;
			} else if (local9 < Static72.anInt1820) {
				local23 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[Static71.anIntArray228[local9]];
			} else {
				local23 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[Static18.anIntArray49[local9 - Static72.anInt1820]];
			}
			if (local23 != null && local23.method1036()) {
				@Pc(52) Class3_Sub1_Sub1 local52;
				if (local23 instanceof Class3_Sub1_Sub4_Sub1_Sub1) {
					local52 = ((Class3_Sub1_Sub4_Sub1_Sub1) local23).aClass3_Sub1_Sub1_1;
					if (local52.anIntArray11 != null) {
						local52 = local52.method77();
					}
					if (local52 == null) {
						continue;
					}
				}
				if (local9 >= Static72.anInt1820) {
					local52 = ((Class3_Sub1_Sub4_Sub1_Sub1) local23).aClass3_Sub1_Sub1_1;
					if (local52.anIntArray11 != null) {
						local52 = local52.method77();
					}
					if (local52.anInt117 >= 0 && Static12.aClass3_Sub1_Sub5_Sub4Array4.length > local52.anInt117) {
						Static78.method1364(local23.anInt1465 + 15, local23);
						if (Static96.anInt1433 > -1) {
							Static12.aClass3_Sub1_Sub5_Sub4Array4[local52.anInt117].method1347(Static96.anInt1433 - 12, Static108.anInt2484 + -30);
						}
					}
					if (Static15.anInt335 == 1 && Static18.anIntArray49[local9 - Static72.anInt1820] == Static79.anInt1982 && Static27.anInt843 % 20 < 10) {
						Static78.method1364(local23.anInt1465 + 15, local23);
						if (Static96.anInt1433 > -1) {
							Static45.aClass3_Sub1_Sub5_Sub4Array8[0].method1347(Static96.anInt1433 - 12, Static108.anInt2484 + -28);
						}
					}
				} else {
					@Pc(75) Class3_Sub1_Sub4_Sub1_Sub2 local75 = (Class3_Sub1_Sub4_Sub1_Sub2) local23;
					local77 = 30;
					if (local75.anInt1481 != -1 || local75.anInt1483 != -1) {
						Static78.method1364(local23.anInt1465 + 15, local23);
						if (Static96.anInt1433 > -1) {
							if (local75.anInt1481 != -1) {
								Static9.aClass3_Sub1_Sub5_Sub4Array3[local75.anInt1481].method1347(Static96.anInt1433 - 12, Static108.anInt2484 - 30);
								local77 += 25;
							}
							if (local75.anInt1483 != -1) {
								Static12.aClass3_Sub1_Sub5_Sub4Array4[local75.anInt1483].method1347(Static96.anInt1433 - 12, -local77 + Static108.anInt2484);
								local77 += 25;
							}
						}
					}
					if (local9 >= 0 && Static15.anInt335 == 10 && Static71.anIntArray228[local9] == Static41.anInt1203) {
						Static78.method1364(local23.anInt1465 + 15, local23);
						if (Static96.anInt1433 > -1) {
							Static45.aClass3_Sub1_Sub5_Sub4Array8[1].method1347(Static96.anInt1433 - 12, -local77 + Static108.anInt2484);
						}
					}
				}
				if (local23.aClass53_662 != null && (Static72.anInt1820 <= local9 || Static68.anInt1720 == 0 || Static68.anInt1720 == 3 || Static68.anInt1720 == 1 && Static125.method1973(((Class3_Sub1_Sub4_Sub1_Sub2) local23).aClass53_668))) {
					Static78.method1364(local23.anInt1465, local23);
					if (Static96.anInt1433 > -1 && Static42.anInt1217 < Static39.anInt1180) {
						Static39.anIntArray136[Static42.anInt1217] = Static43.aClass3_Sub1_Sub5_Sub2_1.method745(local23.aClass53_662) / 2;
						Static39.anIntArray135[Static42.anInt1217] = Static43.aClass3_Sub1_Sub5_Sub2_1.anInt1102;
						Static39.anIntArray139[Static42.anInt1217] = Static96.anInt1433;
						Static39.anIntArray134[Static42.anInt1217] = Static108.anInt2484;
						Static39.anIntArray140[Static42.anInt1217] = local23.anInt1470;
						Static39.anIntArray138[Static42.anInt1217] = local23.anInt1444;
						Static39.anIntArray137[Static42.anInt1217] = local23.anInt1450;
						Static39.aClass53Array9[Static42.anInt1217] = local23.aClass53_662;
						Static42.anInt1217++;
					}
				}
				if (Static27.anInt843 < local23.anInt1432) {
					Static78.method1364(local23.anInt1465 + 15, local23);
					if (Static96.anInt1433 > -1) {
						local77 = local23.anInt1458 * 30 / local23.anInt1457;
						if (local77 > 30) {
							local77 = 30;
						}
						Static84.method1316(Static96.anInt1433 - 15, Static108.anInt2484 + -3, local77, 5, 65280);
						Static84.method1316(local77 + Static96.anInt1433 - 15, Static108.anInt2484 + -3, 30 - local77, 5, 16711680);
					}
				}
				for (local77 = 0; local77 < 4; local77++) {
					if (local23.anIntArray180[local77] > Static27.anInt843) {
						Static78.method1364(local23.anInt1465 / 2, local23);
						if (Static96.anInt1433 > -1) {
							if (local77 == 1) {
								Static108.anInt2484 -= 20;
							}
							if (local77 == 2) {
								Static108.anInt2484 -= 10;
								Static96.anInt1433 -= 15;
							}
							if (local77 == 3) {
								Static96.anInt1433 += 15;
								Static108.anInt2484 -= 10;
							}
							Static96.aClass3_Sub1_Sub5_Sub4Array9[local23.anIntArray184[local77]].method1347(Static96.anInt1433 - 12, Static108.anInt2484 + -12);
							Static90.aClass3_Sub1_Sub5_Sub2_4.method735(Static108.method1725(local23.anIntArray183[local77]), Static96.anInt1433, Static108.anInt2484 + 4, 0);
							Static90.aClass3_Sub1_Sub5_Sub2_4.method735(Static108.method1725(local23.anIntArray183[local77]), Static96.anInt1433 - 1, Static108.anInt2484 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(499) int local499 = 0; local499 < Static42.anInt1217; local499++) {
			local77 = Static39.anIntArray139[local499];
			@Pc(509) int local509 = Static39.anIntArray134[local499];
			@Pc(513) int local513 = Static39.anIntArray136[local499];
			@Pc(515) boolean local515 = true;
			@Pc(519) int local519 = Static39.anIntArray135[local499];
			while (local515) {
				local515 = false;
				for (@Pc(525) int local525 = 0; local525 < local499; local525++) {
					if (Static39.anIntArray134[local525] - Static39.anIntArray135[local525] < local509 + 2 && Static39.anIntArray134[local525] + 2 > local509 + -local519 && local77 - local513 < Static39.anIntArray139[local525] - -Static39.anIntArray136[local525] && local513 + local77 > Static39.anIntArray139[local525] + -Static39.anIntArray136[local525] && local509 > Static39.anIntArray134[local525] - Static39.anIntArray135[local525]) {
						local509 = Static39.anIntArray134[local525] - Static39.anIntArray135[local525];
						local515 = true;
					}
				}
			}
			Static96.anInt1433 = Static39.anIntArray139[local499];
			Static108.anInt2484 = Static39.anIntArray134[local499] = local509;
			@Pc(626) Class53 local626 = Static39.aClass53Array9[local499];
			if (Static107.anInt2468 == 0) {
				@Pc(649) int local649 = 16776960;
				if (Static39.anIntArray140[local499] < 6) {
					local649 = Static108.anIntArray330[Static39.anIntArray140[local499]];
				}
				if (Static39.anIntArray140[local499] == 6) {
					local649 = Static43.anInt1233 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static39.anIntArray140[local499] == 7) {
					local649 = Static43.anInt1233 % 20 >= 10 ? 65535 : 255;
				}
				if (Static39.anIntArray140[local499] == 8) {
					local649 = Static43.anInt1233 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(723) int local723;
				if (Static39.anIntArray140[local499] == 9) {
					local723 = 150 - Static39.anIntArray137[local499];
					if (local723 < 50) {
						local649 = local723 * 1280 + 16711680;
					} else if (local723 < 100) {
						local649 = 33160960 - local723 * 327680;
					} else if (local723 < 150) {
						local649 = (local723 - 100) * 5 + 65280;
					}
				}
				if (Static39.anIntArray140[local499] == 10) {
					local723 = 150 - Static39.anIntArray137[local499];
					if (local723 < 50) {
						local649 = local723 * 5 + 16711680;
					} else if (local723 < 100) {
						local649 = 16711935 - (local723 - 50) * 327680;
					} else if (local723 < 150) {
						local649 = local723 * 327680 + 255 - (local723 + -100) * 5 - 32768000;
					}
				}
				if (Static39.anIntArray140[local499] == 11) {
					local723 = 150 - Static39.anIntArray137[local499];
					if (local723 < 50) {
						local649 = 16777215 - local723 * 327685;
					} else if (local723 < 100) {
						local649 = (local723 - 50) * 327685 + 65280;
					} else if (local723 < 150) {
						local649 = 16777215 - (local723 - 100) * 327680;
					}
				}
				if (Static39.anIntArray138[local499] == 0) {
					Static43.aClass3_Sub1_Sub5_Sub2_1.method735(local626, Static96.anInt1433, Static108.anInt2484 + 1, 0);
					Static43.aClass3_Sub1_Sub5_Sub2_1.method735(local626, Static96.anInt1433, Static108.anInt2484, local649);
				}
				if (Static39.anIntArray138[local499] == 1) {
					Static43.aClass3_Sub1_Sub5_Sub2_1.method753(local626, Static96.anInt1433, Static108.anInt2484 + 1, 0, Static43.anInt1233);
					Static43.aClass3_Sub1_Sub5_Sub2_1.method753(local626, Static96.anInt1433, Static108.anInt2484, local649, Static43.anInt1233);
				}
				if (Static39.anIntArray138[local499] == 2) {
					Static43.aClass3_Sub1_Sub5_Sub2_1.method743(local626, Static96.anInt1433, Static108.anInt2484 + 1, 0, Static43.anInt1233);
					Static43.aClass3_Sub1_Sub5_Sub2_1.method743(local626, Static96.anInt1433, Static108.anInt2484, local649, Static43.anInt1233);
				}
				if (Static39.anIntArray138[local499] == 3) {
					Static43.aClass3_Sub1_Sub5_Sub2_1.method752(local626, Static96.anInt1433, Static108.anInt2484 + 1, 0, Static43.anInt1233, 150 - Static39.anIntArray137[local499]);
					Static43.aClass3_Sub1_Sub5_Sub2_1.method752(local626, Static96.anInt1433, Static108.anInt2484, local649, Static43.anInt1233, 150 - Static39.anIntArray137[local499]);
				}
				@Pc(992) int local992;
				if (Static39.anIntArray138[local499] == 4) {
					local723 = Static43.aClass3_Sub1_Sub5_Sub2_1.method745(local626);
					local992 = (local723 + 100) * (-Static39.anIntArray137[local499] + 150) / 150;
					Static84.method1317(Static96.anInt1433 - 50, 0, Static96.anInt1433 + 50, 334);
					Static43.aClass3_Sub1_Sub5_Sub2_1.method746(local626, Static96.anInt1433 + 50 - local992, Static108.anInt2484 + 1, 0);
					Static43.aClass3_Sub1_Sub5_Sub2_1.method746(local626, Static96.anInt1433 + 50 - local992, Static108.anInt2484, local649);
					Static84.method1321();
				}
				if (Static39.anIntArray138[local499] == 5) {
					local723 = 150 - Static39.anIntArray137[local499];
					Static84.method1317(0, Static108.anInt2484 - Static43.aClass3_Sub1_Sub5_Sub2_1.anInt1102 - 1, 512, Static108.anInt2484 + 5);
					local992 = 0;
					if (local723 < 25) {
						local992 = local723 - 25;
					} else if (local723 > 125) {
						local992 = local723 - 125;
					}
					Static43.aClass3_Sub1_Sub5_Sub2_1.method735(local626, Static96.anInt1433, Static108.anInt2484 + local992 + 1, 0);
					Static43.aClass3_Sub1_Sub5_Sub2_1.method735(local626, Static96.anInt1433, local992 + Static108.anInt2484, local649);
					Static84.method1321();
				}
			} else {
				Static43.aClass3_Sub1_Sub5_Sub2_1.method735(local626, Static96.anInt1433, Static108.anInt2484 + 1, 0);
				Static43.aClass3_Sub1_Sub5_Sub2_1.method735(local626, Static96.anInt1433, Static108.anInt2484, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Z")
	public static boolean method1040(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!m;")
	public static RuntimeException_Sub1 method1041(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString4 = local9.aString4 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ob;II)Lclient!na;")
	public static Class53 method1042(@OriginalArg(0) Class3_Sub7 arg0) {
		try {
			@Pc(12) Class53 local12 = new Class53();
			local12.anInt1890 = arg0.method619();
			if (local12.anInt1890 > 32767) {
				local12.anInt1890 = 32767;
			}
			local12.aByteArray43 = new byte[local12.anInt1890];
			arg0.anInt964 += Static95.aClass57_1.method1438(arg0.anInt964, arg0.aByteArray15, 0, local12.aByteArray43, local12.anInt1890);
			return local12;
		} catch (@Pc(55) Exception local55) {
			return Static29.aClass53_389;
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V")
	public static void method1043() {
		aClass53_667 = null;
		aClass53_671 = null;
		aClass77_7 = null;
		aClass53_670 = null;
		aClass53_669 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ff;Lclient!ff;I)V")
	public static void method1045(@OriginalArg(0) Class3_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub2 arg1) {
		if (Static72.aClass3_Sub1_Sub5_Sub4Array10 == null) {
			Static72.aClass3_Sub1_Sub5_Sub4Array10 = Static89.method1460(Static62.aClass53_717, Static122.aClass53_1407, Static58.aClass62_Sub1_9);
		}
		if (Static106.aClass3_Sub1_Sub5_Sub3Array10 == null) {
			Static106.aClass3_Sub1_Sub5_Sub3Array10 = Static90.method1466(Static81.aClass53_929, Static58.aClass62_Sub1_9, Static122.aClass53_1407);
		}
		if (Static2.aClass3_Sub1_Sub5_Sub3Array1 == null) {
			Static2.aClass3_Sub1_Sub5_Sub3Array1 = Static90.method1466(Static85.aClass53_941, Static58.aClass62_Sub1_9, Static122.aClass53_1407);
		}
		if (Static68.aClass3_Sub1_Sub5_Sub3Array6 == null) {
			Static68.aClass3_Sub1_Sub5_Sub3Array6 = Static90.method1466(Static104.aClass53_1277, Static58.aClass62_Sub1_9, Static122.aClass53_1407);
		}
		Static84.method1316(0, 23, 765, 480, 0);
		Static84.method1314(0, 0, 125, 23, 12425273, 9135624);
		Static84.method1314(125, 0, 640, 23, 5197647, 2697513);
		arg0.method735(Static82.aClass53_382, 62, 15, 0);
		if (Static68.aClass3_Sub1_Sub5_Sub3Array6 != null) {
			Static68.aClass3_Sub1_Sub5_Sub3Array6[1].method813(140, 1);
			arg1.method746(Static118.aClass53_1364, 152, 10, 16777215);
			Static68.aClass3_Sub1_Sub5_Sub3Array6[0].method813(140, 12);
			arg1.method746(Static123.aClass53_1427, 152, 21, 16777215);
		}
		if (Static2.aClass3_Sub1_Sub5_Sub3Array1 != null) {
			if (Static93.anIntArray300[0] == 0 && Static77.anIntArray259[0] == 0) {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[2].method813(280, 4);
			} else {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[0].method813(280, 4);
			}
			if (Static93.anIntArray300[0] == 0 && Static77.anIntArray259[0] == 1) {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[3].method813(295, 4);
			} else {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[1].method813(295, 4);
			}
			arg0.method746(Static108.aClass53_1240, 312, 17, 16777215);
			if (Static93.anIntArray300[0] == 1 && Static77.anIntArray259[0] == 0) {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[2].method813(390, 4);
			} else {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[0].method813(390, 4);
			}
			if (Static93.anIntArray300[0] == 1 && Static77.anIntArray259[0] == 1) {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[3].method813(405, 4);
			} else {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[1].method813(405, 4);
			}
			arg0.method746(Static52.aClass53_634, 422, 17, 16777215);
			if (Static93.anIntArray300[0] == 2 && Static77.anIntArray259[0] == 0) {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[2].method813(500, 4);
			} else {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[0].method813(500, 4);
			}
			if (Static93.anIntArray300[0] == 2 && Static77.anIntArray259[0] == 1) {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[3].method813(515, 4);
			} else {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[1].method813(515, 4);
			}
			arg0.method746(Static45.aClass53_578, 532, 17, 16777215);
			if (Static93.anIntArray300[0] == 3 && Static77.anIntArray259[0] == 0) {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[2].method813(610, 4);
			} else {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[0].method813(610, 4);
			}
			if (Static93.anIntArray300[0] == 3 && Static77.anIntArray259[0] == 1) {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[3].method813(625, 4);
			} else {
				Static2.aClass3_Sub1_Sub5_Sub3Array1[1].method813(625, 4);
			}
			arg0.method746(Static88.aClass53_1016, 642, 17, 16777215);
		}
		Static84.method1316(708, 4, 50, 16, 0);
		arg1.method735(Static95.aClass53_1096, 733, 16, 16777215);
		Static97.anInt2312 = -1;
		if (Static72.aClass3_Sub1_Sub5_Sub4Array10 != null) {
			@Pc(377) int local377 = 8;
			@Pc(383) int local383 = 24;
			@Pc(399) int local399;
			@Pc(385) int local385;
			do {
				local385 = local377;
				if (Static42.anInt1219 <= local383 * (local377 - 1)) {
					local377--;
				}
				local399 = local383;
				if (Static42.anInt1219 <= local377 * (local383 - 1)) {
					local383--;
				}
				if (local377 * (local383 - 1) >= Static42.anInt1219) {
					local383--;
				}
			} while (local383 != local399 || local385 != local377);
			local399 = (765 - local377 * 88) / (local377 + 1);
			if (local399 > 5) {
				local399 = 5;
			}
			@Pc(467) int local467 = (765 - local399 * (local377 - 1) - local377 * 88) / 2;
			local385 = (480 - local383 * 19) / (local383 + 1);
			if (local385 > 5) {
				local385 = 5;
			}
			@Pc(500) int local500 = (480 - (local383 - 1) * local385 - local383 * 19) / 2;
			@Pc(504) int local504 = local500 + 23;
			@Pc(506) int local506 = local467;
			@Pc(508) int local508 = 0;
			for (@Pc(510) int local510 = 0; local510 < Static42.anInt1219; local510++) {
				@Pc(516) Class49 local516 = Static10.aClass49Array1[local510];
				@Pc(518) boolean local518 = true;
				@Pc(523) Class53 local523 = Static108.method1725(local516.anInt1834);
				if (local516.anInt1834 == -1) {
					local518 = false;
					local523 = Static44.aClass53_556;
				} else if (local516.anInt1834 > 1980) {
					local523 = Static77.aClass53_867;
					local518 = false;
				}
				if (local506 <= Static99.anInt2348 && Static105.anInt2433 >= local504 && Static99.anInt2348 < local506 + 88 && local504 + 19 > Static105.anInt2433 && local518) {
					Static97.anInt2312 = local510;
					Static72.aClass3_Sub1_Sub5_Sub4Array10[local516.aBoolean68 ? 1 : 0].method1339(local506, local504);
				} else {
					Static72.aClass3_Sub1_Sub5_Sub4Array10[local516.aBoolean68 ? 1 : 0].method1330(local506, local504);
				}
				if (Static106.aClass3_Sub1_Sub5_Sub3Array10 != null) {
					Static106.aClass3_Sub1_Sub5_Sub3Array10[local516.anInt1828 + (local516.aBoolean68 ? 8 : 0)].method813(local506 + 29, local504);
				}
				arg0.method735(Static108.method1725(local516.anInt1831), local506 + 15, local504 + 14, 0);
				arg1.method735(local523, local506 + 60, local504 + 9 - -5, 268435455);
				local504 += local385 + 19;
				local508++;
				if (local383 <= local508) {
					local504 = local500 + 23;
					local506 += local399 + 88;
					local508 = 0;
				}
			}
		}
		try {
			@Pc(677) Graphics local677 = Static87.aCanvas1.getGraphics();
			Static122.aClass27_47.method1536(0, local677, 0);
		} catch (@Pc(685) Exception local685) {
			Static87.aCanvas1.repaint();
		}
	}
}
