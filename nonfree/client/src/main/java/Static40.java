import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!c;")
	public static Class10 aClass10_14;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!pb;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
	public static int anInt1059;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array4;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_395 = Static41.method597("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[Lclient!bf;")
	public static Class9[] aClass9Array1 = new Class9[50];

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	public static int anInt1056 = 2;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public static int anInt1058 = 0;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!od;")
	public static Class60 aClass60_396 = Static41.method597("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_397 = Static41.method597("http:)4)4");

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
	public static int[] anIntArray109 = new int[128];

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public static int anInt1063 = 1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
	public static void method583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static12.anInt2553 = 0;
		@Pc(163) int local163;
		for (@Pc(5) int local5 = -1; local5 < Static36.anInt1010 + Static125.anInt2830; local5++) {
			@Pc(22) Class4_Sub3_Sub1_Sub2 local22;
			if (local5 == -1) {
				local22 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1;
			} else if (Static125.anInt2830 <= local5) {
				local22 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[Static59.anIntArray173[local5 - Static125.anInt2830]];
			} else {
				local22 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[Static118.anIntArray336[local5]];
			}
			if (local22 != null && local22.method852()) {
				@Pc(49) Class4_Sub3_Sub13 local49;
				if (local22 instanceof Class4_Sub3_Sub1_Sub2_Sub2) {
					local49 = ((Class4_Sub3_Sub1_Sub2_Sub2) local22).aClass4_Sub3_Sub13_1;
					if (local49.anIntArray282 != null) {
						local49 = local49.method1526();
					}
					if (local49 == null) {
						continue;
					}
				}
				if (Static125.anInt2830 <= local5) {
					local49 = ((Class4_Sub3_Sub1_Sub2_Sub2) local22).aClass4_Sub3_Sub13_1;
					if (local49.anIntArray282 != null) {
						local49 = local49.method1526();
					}
					if (local49.anInt2211 >= 0 && Static41.aClass4_Sub3_Sub6_Sub3Array2.length > local49.anInt2211) {
						Static24.method440(local22, local22.anInt1419 + 15);
						if (Static99.anInt611 > -1) {
							Static41.aClass4_Sub3_Sub6_Sub3Array2[local49.anInt2211].method1632(Static99.anInt611 + arg1 - 12, Static125.anInt2827 + arg3 + -30);
						}
					}
					if (Static28.anInt2006 == 1 && Static6.anInt72 == Static59.anIntArray173[local5 - Static125.anInt2830] && Static118.anInt2741 % 20 < 10) {
						Static24.method440(local22, local22.anInt1419 + 15);
						if (Static99.anInt611 > -1) {
							Static129.aClass4_Sub3_Sub6_Sub3Array4[0].method1632(Static99.anInt611 + arg1 - 12, arg3 + -28 + Static125.anInt2827);
						}
					}
				} else {
					local163 = 30;
					@Pc(166) Class4_Sub3_Sub1_Sub2_Sub1 local166 = (Class4_Sub3_Sub1_Sub2_Sub1) local22;
					if (local166.anInt414 != -1 || local166.anInt410 != -1) {
						Static24.method440(local22, local22.anInt1419 + 15);
						if (Static99.anInt611 > -1) {
							if (local166.anInt414 != -1) {
								Static33.aClass4_Sub3_Sub6_Sub3Array1[local166.anInt414].method1632(arg1 + Static99.anInt611 - 12, Static125.anInt2827 + arg3 + -30);
								local163 += 25;
							}
							if (local166.anInt410 != -1) {
								Static41.aClass4_Sub3_Sub6_Sub3Array2[local166.anInt410].method1632(arg1 + Static99.anInt611 - 12, Static125.anInt2827 + arg3 + -local163);
								local163 += 25;
							}
						}
					}
					if (local5 >= 0 && Static28.anInt2006 == 10 && Static118.anIntArray336[local5] == Static117.anInt2723) {
						Static24.method440(local22, local22.anInt1419 + 15);
						if (Static99.anInt611 > -1) {
							Static129.aClass4_Sub3_Sub6_Sub3Array4[1].method1632(Static99.anInt611 + arg1 - 12, -local163 + arg3 + Static125.anInt2827);
						}
					}
				}
				if (local22.aClass60_506 != null && (Static125.anInt2830 <= local5 || Static62.anInt1588 == 0 || Static62.anInt1588 == 3 || Static62.anInt1588 == 1 && Static129.method680(((Class4_Sub3_Sub1_Sub2_Sub1) local22).aClass60_139))) {
					Static24.method440(local22, local22.anInt1419);
					if (Static99.anInt611 > -1 && Static12.anInt2553 < Static38.anInt1038) {
						Static38.anIntArray104[Static12.anInt2553] = Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1218(local22.aClass60_506) / 2;
						Static38.anIntArray105[Static12.anInt2553] = Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.anInt1808;
						Static38.anIntArray101[Static12.anInt2553] = Static99.anInt611;
						Static38.anIntArray106[Static12.anInt2553] = Static125.anInt2827;
						Static38.anIntArray100[Static12.anInt2553] = local22.anInt1430;
						Static38.anIntArray102[Static12.anInt2553] = local22.anInt1444;
						Static38.anIntArray103[Static12.anInt2553] = local22.anInt1393;
						Static38.aClass60Array6[Static12.anInt2553] = local22.aClass60_506;
						Static12.anInt2553++;
					}
				}
				if (local22.anInt1392 > Static118.anInt2741) {
					Static24.method440(local22, local22.anInt1419 + 15);
					if (Static99.anInt611 > -1) {
						local163 = local22.anInt1412 * 30 / local22.anInt1443;
						if (local163 > 30) {
							local163 = 30;
						}
						Static34.method1649(Static99.anInt611 + arg1 - 15, arg3 + (Static125.anInt2827 - 3), local163, 5, 65280);
						Static34.method1649(arg1 + Static99.anInt611 + local163 - 15, arg3 - (-Static125.anInt2827 + 3), 30 - local163, 5, 16711680);
					}
				}
				for (local163 = 0; local163 < 4; local163++) {
					if (local22.anIntArray136[local163] > Static118.anInt2741) {
						Static24.method440(local22, local22.anInt1419 / 2);
						if (Static99.anInt611 > -1) {
							if (local163 == 1) {
								Static125.anInt2827 -= 20;
							}
							if (local163 == 2) {
								Static99.anInt611 -= 15;
								Static125.anInt2827 -= 10;
							}
							if (local163 == 3) {
								Static99.anInt611 += 15;
								Static125.anInt2827 -= 10;
							}
							Static76.aClass4_Sub3_Sub6_Sub3Array8[local22.anIntArray140[local163]].method1632(Static99.anInt611 + arg1 - 12, arg3 + -12 + Static125.anInt2827);
							Static96.aClass4_Sub3_Sub6_Sub1_Sub1_5.method1202(Static65.method1051(local22.anIntArray138[local163]), arg1 + Static99.anInt611 - 1, arg3 - -Static125.anInt2827 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(528) int local528 = 0; local528 < Static12.anInt2553; local528++) {
			local163 = Static38.anIntArray101[local528];
			@Pc(543) int local543 = Static38.anIntArray104[local528];
			@Pc(547) int local547 = Static38.anIntArray106[local528];
			@Pc(551) int local551 = Static38.anIntArray105[local528];
			@Pc(553) boolean local553 = true;
			while (local553) {
				local553 = false;
				for (@Pc(559) int local559 = 0; local559 < local528; local559++) {
					if (local547 + 2 > Static38.anIntArray106[local559] + -Static38.anIntArray105[local559] && Static38.anIntArray106[local559] + 2 > -local551 + local547 && local163 - local543 < Static38.anIntArray104[local559] + Static38.anIntArray101[local559] && local543 + local163 > -Static38.anIntArray104[local559] + Static38.anIntArray101[local559] && local547 > Static38.anIntArray106[local559] - Static38.anIntArray105[local559]) {
						local547 = Static38.anIntArray106[local559] - Static38.anIntArray105[local559];
						local553 = true;
					}
				}
			}
			Static99.anInt611 = Static38.anIntArray101[local528];
			Static125.anInt2827 = Static38.anIntArray106[local528] = local547;
			@Pc(659) Class60 local659 = Static38.aClass60Array6[local528];
			if (Static119.anInt2752 == 0) {
				@Pc(680) int local680 = 16776960;
				if (Static38.anIntArray100[local528] < 6) {
					local680 = Static113.anIntArray134[Static38.anIntArray100[local528]];
				}
				if (Static38.anIntArray100[local528] == 6) {
					local680 = Static125.anInt2831 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static38.anIntArray100[local528] == 7) {
					local680 = Static125.anInt2831 % 20 < 10 ? 255 : 65535;
				}
				if (Static38.anIntArray100[local528] == 8) {
					local680 = Static125.anInt2831 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(753) int local753;
				if (Static38.anIntArray100[local528] == 9) {
					local753 = 150 - Static38.anIntArray103[local528];
					if (local753 < 50) {
						local680 = local753 * 1280 + 16711680;
					} else if (local753 < 100) {
						local680 = 16384000 + 16776960 - local753 * 327680;
					} else if (local753 < 150) {
						local680 = local753 * 5 + 65280 - 500;
					}
				}
				if (Static38.anIntArray100[local528] == 10) {
					local753 = 150 - Static38.anIntArray103[local528];
					if (local753 < 50) {
						local680 = local753 * 5 + 16711680;
					} else if (local753 < 100) {
						local680 = 16711935 - (local753 - 50) * 327680;
					} else if (local753 < 150) {
						local680 = (local753 - 100) * 327680 + 255 + 500 - local753 * 5;
					}
				}
				if (Static38.anIntArray100[local528] == 11) {
					local753 = 150 - Static38.anIntArray103[local528];
					if (local753 < 50) {
						local680 = 16777215 - local753 * 327685;
					} else if (local753 < 100) {
						local680 = (local753 - 50) * 327685 + 65280;
					} else if (local753 < 150) {
						local680 = 32768000 + 16777215 - local753 * 327680;
					}
				}
				if (Static38.anIntArray102[local528] == 0) {
					Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1202(local659, Static99.anInt611 + arg1, arg3 + Static125.anInt2827, local680, 0);
				}
				if (Static38.anIntArray102[local528] == 1) {
					Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1207(local659, Static99.anInt611 + arg1, Static125.anInt2827 + arg3, local680, Static125.anInt2831);
				}
				if (Static38.anIntArray102[local528] == 2) {
					Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1219(local659, arg1 + Static99.anInt611, arg3 - -Static125.anInt2827, local680, Static125.anInt2831);
				}
				if (Static38.anIntArray102[local528] == 3) {
					Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1205(local659, arg1 + Static99.anInt611, Static125.anInt2827 + arg3, local680, Static125.anInt2831, 150 - Static38.anIntArray103[local528]);
				}
				if (Static38.anIntArray102[local528] == 4) {
					local753 = (150 - Static38.anIntArray103[local528]) * (Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1218(local659) + 100) / 150;
					Static34.method1661(Static99.anInt611 + arg1 - 50, arg3, Static99.anInt611 + arg1 + 50, arg0 + arg3);
					Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1204(local659, arg1 + Static99.anInt611 + 50 - local753, Static125.anInt2827 + arg3, local680, 0);
					Static34.method1652(arg1, arg3, arg1 + arg2, arg3 + arg0);
				}
				if (Static38.anIntArray102[local528] == 5) {
					local753 = 150 - Static38.anIntArray103[local528];
					Static34.method1661(arg1, Static125.anInt2827 + arg3 - Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.anInt1808 - 1, arg2 + arg1, arg3 + Static125.anInt2827 + 5);
					@Pc(1079) int local1079 = 0;
					if (local753 < 25) {
						local1079 = local753 - 25;
					} else if (local753 > 125) {
						local1079 = local753 - 125;
					}
					Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1202(local659, arg1 + Static99.anInt611, Static125.anInt2827 + (arg3 - -local1079), local680, 0);
					Static34.method1652(arg1, arg3, arg2 + arg1, arg0 + arg3);
				}
			} else {
				Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1202(local659, Static99.anInt611 + arg1, arg3 - -Static125.anInt2827, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
	public static boolean method584(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method585(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static108.aClass40_1);
		arg0.removeFocusListener(Static108.aClass40_1);
		Static120.anInt2759 = -1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method586() {
		aClass60_397 = null;
		aClass63_1 = null;
		aClass9Array1 = null;
		aClass4_Sub3_Sub6_Sub2Array4 = null;
		anIntArray109 = null;
		aClass60_396 = null;
		aClass60_395 = null;
		aClass10_14 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!sa;I)Z")
	public static boolean method587(@OriginalArg(0) Class4_Sub14 arg0) {
		@Pc(2) int local2 = arg0.anInt2432;
		if (local2 == 205) {
			Static48.anInt1175 = 250;
			return true;
		}
		@Pc(35) int local35;
		@Pc(29) int local29;
		if (local2 >= 300 && local2 <= 313) {
			local29 = local2 & 0x1;
			local35 = (local2 - 300) / 2;
			Static71.aClass49_2.method1060(local35, local29 == 1);
		}
		if (local2 >= 314 && local2 <= 323) {
			local35 = (local2 - 314) / 2;
			local29 = local2 & 0x1;
			Static71.aClass49_2.method1061(local35, local29 == 1);
		}
		if (local2 == 324) {
			Static71.aClass49_2.method1059(false);
		}
		if (local2 == 325) {
			Static71.aClass49_2.method1059(true);
		}
		if (local2 == 326) {
			Static14.aClass4_Sub9_Sub1_1.method826(158);
			Static71.aClass49_2.method1052(Static14.aClass4_Sub9_Sub1_1);
			return true;
		} else {
			return false;
		}
	}
}
