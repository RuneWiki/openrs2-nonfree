import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!jc;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_26;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array3;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public static int anInt1010;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!kd;")
	private static Class39 aClass39_471 = Static108.method1915("Bad session id)3");

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_472 = Static108.method1915("(X100(U(Y");

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_473 = aClass39_471;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public static int anInt1008 = 1;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_474 = Static108.method1915("Name eingeben:");

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
	public static final boolean aBoolean91 = false;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Lclient!kd;")
	public static Class39 method604(@OriginalArg(0) int arg0) {
		@Pc(5) Class39 local5 = Static69.method1226(arg0);
		for (@Pc(20) int local20 = local5.method1175() - 3; local20 > 0; local20 -= 3) {
			local5 = Static30.method601(new Class39[] { local5.method1173(local20, 0), Static29.aClass39_452, local5.method1181(local20) });
		}
		if (local5.method1175() > 8) {
			local5 = Static30.method601(new Class39[] { Static75.aClass39_924, local5.method1173(local5.method1175() - 8, 0), Static11.aClass39_226, Static21.aClass39_356, local5, Static54.aClass39_731 });
		} else if (local5.method1175() > 4) {
			local5 = Static30.method601(new Class39[] { Static122.aClass39_1431, local5.method1173(local5.method1175() - 4, 0), Static123.aClass39_1481, Static21.aClass39_356, local5, Static54.aClass39_731 });
		}
		return Static30.method601(new Class39[] { Static114.aClass39_1359, local5 });
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method605() {
		aClass39_472 = null;
		aClass1_Sub1_Sub4_Sub1Array3 = null;
		aClass39_473 = null;
		aClass39_471 = null;
		aClass34_1 = null;
		aClass62_Sub1_26 = null;
		aClass39_474 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILclient!pb;)V")
	public static void method606(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub4_Sub4 arg2) {
		if (arg2 == null) {
			return;
		}
		@Pc(14) int local14 = arg1 * arg1 + arg0 * arg0;
		@Pc(25) int local25 = Static75.anInt1879 + Static51.anInt1408 & 0x7FF;
		if (local14 > 6400) {
			return;
		}
		@Pc(35) int local35 = Class1_Sub1_Sub4_Sub2.anIntArray138[local25];
		@Pc(43) int local43 = local35 * 256 / (Static39.anInt1165 + 256);
		@Pc(47) int local47 = Class1_Sub1_Sub4_Sub2.anIntArray142[local25];
		@Pc(55) int local55 = local47 * 256 / (Static39.anInt1165 + 256);
		@Pc(65) int local65 = arg0 * local55 + arg1 * local43 >> 16;
		@Pc(76) int local76 = arg1 * local55 - arg0 * local43 >> 16;
		if (local14 > 2500) {
			arg2.method1536(Static70.aClass1_Sub1_Sub4_Sub1_33, local65 + 4 + 94 - arg2.anInt2158 / 2, -local76 + 83 + -(arg2.anInt2161 / 2) + -4);
		} else {
			arg2.method1539(local65 + 4 + 94 - arg2.anInt2158 / 2, -(arg2.anInt2161 / 2) + 83 - (local76 + 4));
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public static void method607() {
		Static104.anInt2645 = 0;
		@Pc(171) int local171;
		for (@Pc(9) int local9 = -1; local9 < Static20.anInt731 + Static57.anInt1547; local9++) {
			@Pc(17) Class1_Sub1_Sub2_Sub1 local17;
			if (local9 == -1) {
				local17 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1;
			} else if (local9 < Static57.anInt1547) {
				local17 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[Static12.anIntArray91[local9]];
			} else {
				local17 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static51.anIntArray192[local9 - Static57.anInt1547]];
			}
			if (local17 != null && local17.method1797()) {
				@Pc(58) Class1_Sub1_Sub5 local58;
				if (local17 instanceof Class1_Sub1_Sub2_Sub1_Sub1) {
					local58 = ((Class1_Sub1_Sub2_Sub1_Sub1) local17).aClass1_Sub1_Sub5_1;
					if (local58.anIntArray130 != null) {
						local58 = local58.method514();
					}
					if (local58 == null) {
						continue;
					}
				}
				if (Static57.anInt1547 <= local9) {
					local58 = ((Class1_Sub1_Sub2_Sub1_Sub1) local17).aClass1_Sub1_Sub5_1;
					if (local58.anIntArray130 != null) {
						local58 = local58.method514();
					}
					if (local58.anInt919 >= 0 && local58.anInt919 < Static75.aClass1_Sub1_Sub4_Sub4Array9.length) {
						Static34.method641(local17, local17.anInt2488 + 15);
						if (Static9.anInt2985 > -1) {
							Static75.aClass1_Sub1_Sub4_Sub4Array9[local58.anInt919].method1539(Static9.anInt2985 - 12, Static38.anInt1158 + -30);
						}
					}
					if (Static58.anInt1564 == 1 && Static51.anIntArray192[local9 - Static57.anInt1547] == Static100.anInt2549 && Static45.anInt1256 % 20 < 10) {
						Static34.method641(local17, local17.anInt2488 + 15);
						if (Static9.anInt2985 > -1) {
							Static29.aClass1_Sub1_Sub4_Sub4Array5[0].method1539(Static9.anInt2985 - 12, Static38.anInt1158 - 28);
						}
					}
				} else {
					@Pc(169) Class1_Sub1_Sub2_Sub1_Sub2 local169 = (Class1_Sub1_Sub2_Sub1_Sub2) local17;
					local171 = 30;
					if (local169.anInt2542 != -1 || local169.anInt2536 != -1) {
						Static34.method641(local17, local17.anInt2488 + 15);
						if (Static9.anInt2985 > -1) {
							if (local169.anInt2542 != -1) {
								Static98.aClass1_Sub1_Sub4_Sub4Array10[local169.anInt2542].method1539(Static9.anInt2985 - 12, Static38.anInt1158 + -30);
								local171 += 25;
							}
							if (local169.anInt2536 != -1) {
								Static75.aClass1_Sub1_Sub4_Sub4Array9[local169.anInt2536].method1539(Static9.anInt2985 - 12, Static38.anInt1158 + -local171);
								local171 += 25;
							}
						}
					}
					if (local9 >= 0 && Static58.anInt1564 == 10 && Static113.anInt2832 == Static12.anIntArray91[local9]) {
						Static34.method641(local17, local17.anInt2488 + 15);
						if (Static9.anInt2985 > -1) {
							Static29.aClass1_Sub1_Sub4_Sub4Array5[1].method1539(Static9.anInt2985 - 12, -local171 + Static38.anInt1158);
						}
					}
				}
				if (local17.aClass39_1226 != null && (local9 >= Static57.anInt1547 || Static114.anInt2845 == 0 || Static114.anInt2845 == 3 || Static114.anInt2845 == 1 && Static98.method1718(((Class1_Sub1_Sub2_Sub1_Sub2) local17).aClass39_1234))) {
					Static34.method641(local17, local17.anInt2488);
					if (Static9.anInt2985 > -1 && Static96.anInt2281 > Static104.anInt2645) {
						Static96.anIntArray348[Static104.anInt2645] = Static53.aClass1_Sub1_Sub4_Sub3_1.method755(local17.aClass39_1226) / 2;
						Static96.anIntArray346[Static104.anInt2645] = Static53.aClass1_Sub1_Sub4_Sub3_1.anInt1203;
						Static96.anIntArray347[Static104.anInt2645] = Static9.anInt2985;
						Static96.anIntArray351[Static104.anInt2645] = Static38.anInt1158;
						Static96.anIntArray352[Static104.anInt2645] = local17.anInt2501;
						Static96.anIntArray349[Static104.anInt2645] = local17.anInt2513;
						Static96.anIntArray350[Static104.anInt2645] = local17.anInt2498;
						Static96.aClass39Array23[Static104.anInt2645] = local17.aClass39_1226;
						Static104.anInt2645++;
					}
				}
				if (local17.anInt2477 > Static45.anInt1256) {
					Static34.method641(local17, local17.anInt2488 + 15);
					if (Static9.anInt2985 > -1) {
						local171 = local17.anInt2484 * 30 / local17.anInt2476;
						if (local171 > 30) {
							local171 = 30;
						}
						Static15.method1503(Static9.anInt2985 - 15, Static38.anInt1158 + -3, local171, 5, 65280);
						Static15.method1503(Static9.anInt2985 + local171 - 15, Static38.anInt1158 + -3, 30 - local171, 5, 16711680);
					}
				}
				for (local171 = 0; local171 < 4; local171++) {
					if (local17.anIntArray386[local171] > Static45.anInt1256) {
						Static34.method641(local17, local17.anInt2488 / 2);
						if (Static9.anInt2985 > -1) {
							if (local171 == 1) {
								Static38.anInt1158 -= 20;
							}
							if (local171 == 2) {
								Static9.anInt2985 -= 15;
								Static38.anInt1158 -= 10;
							}
							if (local171 == 3) {
								Static9.anInt2985 += 15;
								Static38.anInt1158 -= 10;
							}
							Static73.aClass1_Sub1_Sub4_Sub4Array8[local17.anIntArray388[local171]].method1539(Static9.anInt2985 - 12, Static38.anInt1158 + -12);
							Static97.aClass1_Sub1_Sub4_Sub3_5.method741(Static69.method1226(local17.anIntArray385[local171]), Static9.anInt2985 - 1, Static38.anInt1158 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(503) int local503 = 0; local503 < Static104.anInt2645; local503++) {
			local171 = Static96.anIntArray347[local503];
			@Pc(515) int local515 = Static96.anIntArray351[local503];
			@Pc(519) int local519 = Static96.anIntArray348[local503];
			@Pc(523) int local523 = Static96.anIntArray346[local503];
			@Pc(525) boolean local525 = true;
			while (local525) {
				local525 = false;
				for (@Pc(531) int local531 = 0; local531 < local503; local531++) {
					if (Static96.anIntArray351[local531] - Static96.anIntArray346[local531] < local515 + 2 && Static96.anIntArray351[local531] + 2 > local515 + -local523 && Static96.anIntArray347[local531] + Static96.anIntArray348[local531] > local171 + -local519 && local171 + local519 > Static96.anIntArray347[local531] + -Static96.anIntArray348[local531] && local515 > Static96.anIntArray351[local531] - Static96.anIntArray346[local531]) {
						local515 = Static96.anIntArray351[local531] - Static96.anIntArray346[local531];
						local525 = true;
					}
				}
			}
			Static9.anInt2985 = Static96.anIntArray347[local503];
			Static38.anInt1158 = Static96.anIntArray351[local503] = local515;
			@Pc(625) Class39 local625 = Static96.aClass39Array23[local503];
			if (Static121.anInt2968 == 0) {
				@Pc(629) int local629 = 16776960;
				if (Static96.anIntArray352[local503] < 6) {
					local629 = Static93.anIntArray333[Static96.anIntArray352[local503]];
				}
				if (Static96.anIntArray352[local503] == 6) {
					local629 = Static38.anInt1159 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static96.anIntArray352[local503] == 7) {
					local629 = Static38.anInt1159 % 20 >= 10 ? 65535 : 255;
				}
				if (Static96.anIntArray352[local503] == 8) {
					local629 = Static38.anInt1159 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(698) int local698;
				if (Static96.anIntArray352[local503] == 9) {
					local698 = 150 - Static96.anIntArray350[local503];
					if (local698 < 50) {
						local629 = local698 * 1280 + 16711680;
					} else if (local698 < 100) {
						local629 = 16776960 - (local698 - 50) * 327680;
					} else if (local698 < 150) {
						local629 = (local698 - 100) * 5 + 65280;
					}
				}
				if (Static96.anIntArray352[local503] == 10) {
					local698 = 150 - Static96.anIntArray350[local503];
					if (local698 < 50) {
						local629 = local698 * 5 + 16711680;
					} else if (local698 < 100) {
						local629 = 16384000 + 16711935 - local698 * 327680;
					} else if (local698 < 150) {
						local629 = local698 * 327680 + 255 - (local698 - 100) * 5 - 32768000;
					}
				}
				if (Static96.anIntArray352[local503] == 11) {
					local698 = 150 - Static96.anIntArray350[local503];
					if (local698 < 50) {
						local629 = 16777215 - local698 * 327685;
					} else if (local698 < 100) {
						local629 = (local698 - 50) * 327685 + 65280;
					} else if (local698 < 150) {
						local629 = 16777215 + 32768000 - local698 * 327680;
					}
				}
				if (Static96.anIntArray349[local503] == 0) {
					Static53.aClass1_Sub1_Sub4_Sub3_1.method741(local625, Static9.anInt2985, Static38.anInt1158, local629, 0);
				}
				if (Static96.anIntArray349[local503] == 1) {
					Static53.aClass1_Sub1_Sub4_Sub3_1.method738(local625, Static9.anInt2985, Static38.anInt1158, local629, Static38.anInt1159);
				}
				if (Static96.anIntArray349[local503] == 2) {
					Static53.aClass1_Sub1_Sub4_Sub3_1.method742(local625, Static9.anInt2985, Static38.anInt1158, local629, Static38.anInt1159);
				}
				if (Static96.anIntArray349[local503] == 3) {
					Static53.aClass1_Sub1_Sub4_Sub3_1.method748(local625, Static9.anInt2985, Static38.anInt1158, local629, Static38.anInt1159, 150 - Static96.anIntArray350[local503]);
				}
				@Pc(932) int local932;
				if (Static96.anIntArray349[local503] == 4) {
					local698 = Static53.aClass1_Sub1_Sub4_Sub3_1.method755(local625);
					local932 = (150 - Static96.anIntArray350[local503]) * (local698 + 100) / 150;
					Static15.method1513(Static9.anInt2985 - 50, 0, Static9.anInt2985 + 50, 334);
					Static53.aClass1_Sub1_Sub4_Sub3_1.method753(local625, Static9.anInt2985 + 50 - local932, Static38.anInt1158, local629, 0);
					Static15.method1505();
				}
				if (Static96.anIntArray349[local503] == 5) {
					local698 = 150 - Static96.anIntArray350[local503];
					Static15.method1513(0, Static38.anInt1158 - Static53.aClass1_Sub1_Sub4_Sub3_1.anInt1203 - 1, 512, Static38.anInt1158 + 5);
					local932 = 0;
					if (local698 < 25) {
						local932 = local698 - 25;
					} else if (local698 > 125) {
						local932 = local698 - 125;
					}
					Static53.aClass1_Sub1_Sub4_Sub3_1.method741(local625, Static9.anInt2985, local932 + Static38.anInt1158, local629, 0);
					Static15.method1505();
				}
			} else {
				Static53.aClass1_Sub1_Sub4_Sub3_1.method741(local625, Static9.anInt2985, Static38.anInt1158, 16776960, 0);
			}
		}
	}
}
