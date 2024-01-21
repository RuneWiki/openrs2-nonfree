import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_13;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lclient!rc;")
	public static Class65[] aClass65Array1 = new Class65[16];

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_168 = Static33.method650("(U2");

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_169 = Static33.method650("leuchten2:");

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_170 = Static33.method650("backvmid3");

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_171 = Static33.method650(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_172 = Static33.method650("title)3jpg");

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt297 = 0;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_173 = Static33.method650("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "Lclient!oa;")
	public static Class56 aClass56_174 = Static33.method650("mapfunction");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public static void method234(@OriginalArg(1) int arg0) {
		Static110.method1839();
		@Pc(12) int local12 = Static119.method1924(arg0).anInt1123;
		if (local12 == 0) {
			return;
		}
		@Pc(22) int local22 = Static115.anIntArray292[arg0];
		if (local12 == 1) {
			if (local22 == 1) {
				Static55.method1047(0.9D);
				((Class21) Static55.anInterface2_1).method573(0.9D);
			}
			if (local22 == 2) {
				Static55.method1047(0.8D);
				((Class21) Static55.anInterface2_1).method573(0.8D);
			}
			if (local22 == 3) {
				Static55.method1047(0.7D);
				((Class21) Static55.anInterface2_1).method573(0.7D);
			}
			if (local22 == 4) {
				Static55.method1047(0.6D);
				((Class21) Static55.anInterface2_1).method573(0.6D);
			}
			Static30.method631();
			Static80.aBoolean98 = true;
		}
		if (local12 == 3) {
			@Pc(84) short local84 = 0;
			if (local22 == 0) {
				local84 = 255;
			}
			if (local22 == 1) {
				local84 = 192;
			}
			if (local22 == 2) {
				local84 = 128;
			}
			if (local22 == 3) {
				local84 = 64;
			}
			if (local22 == 4) {
				local84 = 0;
			}
			if (Static24.anInt703 != local84) {
				if (Static24.anInt703 == 0 && Static69.anInt1913 != -1) {
					Static81.method1430(Static69.anInt1913, 0, local84, Static100.aClass44_Sub1_65);
					Static7.aBoolean18 = false;
				} else if (local84 == 0) {
					Static44.method807();
					Static7.aBoolean18 = false;
				} else {
					Static97.method1710(local84);
				}
				Static24.anInt703 = local84;
			}
		}
		if (local12 == 8) {
			Static52.anInt1510 = local22;
			Static12.aBoolean17 = true;
		}
		if (local12 == 10) {
			if (local22 == 0) {
				Static126.anInt3091 = 127;
			}
			if (local22 == 1) {
				Static126.anInt3091 = 96;
			}
			if (local22 == 2) {
				Static126.anInt3091 = 64;
			}
			if (local22 == 3) {
				Static126.anInt3091 = 32;
			}
			if (local22 == 4) {
				Static126.anInt3091 = 0;
			}
		}
		if (local12 == 4) {
			if (local22 == 0) {
				Static28.anInt840 = 127;
			}
			if (local22 == 1) {
				Static28.anInt840 = 96;
			}
			if (local22 == 2) {
				Static28.anInt840 = 64;
			}
			if (local22 == 3) {
				Static28.anInt840 = 32;
			}
			if (local22 == 4) {
				Static28.anInt840 = 0;
			}
		}
		if (local12 == 9) {
			Static105.anInt2613 = local22;
		}
		if (local12 == 6) {
			Static79.anInt2114 = local22;
		}
		if (local12 == 5) {
			Static92.anInt2426 = local22;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!md;")
	public static Class30 method235(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class30_Sub1");
			@Pc(15) Class30 local15 = (Class30) local11.getDeclaredConstructor().newInstance();
			local15.method814(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class30_Sub2 local28 = new Class30_Sub2();
			local28.method814(arg1, arg2, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method236() {
		aClass56_169 = null;
		aClass56_172 = null;
		aClass56_173 = null;
		aClass65Array1 = null;
		aClass44_Sub1_13 = null;
		aClass56_170 = null;
		aClass56_168 = null;
		aClass56_174 = null;
		aClass56_171 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method237() {
		while (Static48.method883()) {
			if (Static57.anInt1607 != -1 && Static43.anInt1143 == Static57.anInt1607) {
				if (Static36.anInt1019 == 85 && Static122.aClass56_1631.method1426() > 0) {
					Static122.aClass56_1631 = Static122.aClass56_1631.method1451(Static122.aClass56_1631.method1426() - 1, 0);
				}
				if ((Static43.method805(Static3.anInt3130) || Static3.anInt3130 == 32) && Static122.aClass56_1631.method1426() < 12) {
					Static122.aClass56_1631 = Static122.aClass56_1631.method1446(Static3.anInt3130);
				}
			} else {
				@Pc(158) int local158;
				if (Static105.aBoolean121) {
					if (Static36.anInt1019 == 85 && Static122.aClass56_1632.method1426() > 0) {
						Static122.aClass56_1632 = Static122.aClass56_1632.method1451(Static122.aClass56_1632.method1426() - 1, 0);
						Static12.aBoolean17 = true;
					}
					if (Static30.method633(Static3.anInt3130) && Static122.aClass56_1632.method1426() < 80) {
						Static122.aClass56_1632 = Static122.aClass56_1632.method1446(Static3.anInt3130);
						Static12.aBoolean17 = true;
					}
					if (Static36.anInt1019 == 84) {
						Static105.aBoolean121 = false;
						Static12.aBoolean17 = true;
						@Pc(119) long local119;
						if (Static76.anInt2064 == 1) {
							local119 = Static122.aClass56_1632.method1445();
							Static51.method980(local119);
						}
						if (Static76.anInt2064 == 2 && Static42.anInt1124 > 0) {
							local119 = Static122.aClass56_1632.method1445();
							Static97.method1707(local119);
						}
						if (Static76.anInt2064 == 3 && Static122.aClass56_1632.method1426() > 0) {
							Static111.aClass3_Sub2_Sub1_4.method325(113);
							Static111.aClass3_Sub2_Sub1_4.method303(0);
							local158 = Static111.aClass3_Sub2_Sub1_4.anInt413;
							Static111.aClass3_Sub2_Sub1_4.method300(Static28.aLong21);
							Static31.method634(Static111.aClass3_Sub2_Sub1_4, Static122.aClass56_1632);
							Static111.aClass3_Sub2_Sub1_4.method275(Static111.aClass3_Sub2_Sub1_4.anInt413 - local158);
							if (Static46.anInt2266 == 2) {
								Static46.anInt2266 = 1;
								Static105.aBoolean120 = true;
								Static111.aClass3_Sub2_Sub1_4.method325(214);
								Static111.aClass3_Sub2_Sub1_4.method303(Static66.anInt541);
								Static111.aClass3_Sub2_Sub1_4.method303(Static46.anInt2266);
								Static111.aClass3_Sub2_Sub1_4.method303(Static56.anInt1592);
							}
						}
						if (Static76.anInt2064 == 4 && Static63.anInt1820 < 100) {
							local119 = Static122.aClass56_1632.method1445();
							Static46.method1521(local119);
						}
						if (Static76.anInt2064 == 5 && Static63.anInt1820 > 0) {
							local119 = Static122.aClass56_1632.method1445();
							Static17.method348(local119);
						}
					}
				} else if (Static126.anInt3105 == 1) {
					if (Static36.anInt1019 == 85 && Static122.aClass56_1646.method1426() > 0) {
						Static122.aClass56_1646 = Static122.aClass56_1646.method1451(Static122.aClass56_1646.method1426() - 1, 0);
						Static12.aBoolean17 = true;
					}
					if (Static102.method2053(Static3.anInt3130) && Static122.aClass56_1646.method1426() < 10) {
						Static122.aClass56_1646 = Static122.aClass56_1646.method1446(Static3.anInt3130);
						Static12.aBoolean17 = true;
					}
					if (Static36.anInt1019 == 84) {
						if (Static122.aClass56_1646.method1426() > 0) {
							local158 = 0;
							if (Static122.aClass56_1646.method1453()) {
								local158 = Static122.aClass56_1646.method1429();
							}
							Static111.aClass3_Sub2_Sub1_4.method325(148);
							Static111.aClass3_Sub2_Sub1_4.method280(local158);
						}
						Static12.aBoolean17 = true;
						Static126.anInt3105 = 0;
					}
				} else if (Static126.anInt3105 == 2) {
					if (Static36.anInt1019 == 85 && Static122.aClass56_1646.method1426() > 0) {
						Static122.aClass56_1646 = Static122.aClass56_1646.method1451(Static122.aClass56_1646.method1426() - 1, 0);
						Static12.aBoolean17 = true;
					}
					if ((Static43.method805(Static3.anInt3130) || Static3.anInt3130 == 32) && Static122.aClass56_1646.method1426() < 12) {
						Static122.aClass56_1646 = Static122.aClass56_1646.method1446(Static3.anInt3130);
						Static12.aBoolean17 = true;
					}
					if (Static36.anInt1019 == 84) {
						if (Static122.aClass56_1646.method1426() > 0) {
							Static111.aClass3_Sub2_Sub1_4.method325(236);
							Static111.aClass3_Sub2_Sub1_4.method300(Static122.aClass56_1646.method1445());
						}
						Static12.aBoolean17 = true;
						Static126.anInt3105 = 0;
					}
				} else if (Static126.anInt3105 == 3) {
					if (Static36.anInt1019 == 85 && Static122.aClass56_1646.method1426() > 0) {
						Static122.aClass56_1646 = Static122.aClass56_1646.method1451(Static122.aClass56_1646.method1426() - 1, 0);
						Static12.aBoolean17 = true;
					}
					if (Static30.method633(Static3.anInt3130) && Static122.aClass56_1646.method1426() < 40) {
						Static122.aClass56_1646 = Static122.aClass56_1646.method1446(Static3.anInt3130);
						Static12.aBoolean17 = true;
					}
				} else if (Static126.anInt3105 == 4) {
					if (Static36.anInt1019 == 85 && Static122.aClass56_1646.method1426() > 0) {
						Static122.aClass56_1646 = Static122.aClass56_1646.method1451(Static122.aClass56_1646.method1426() - 1, 0);
						Static12.aBoolean17 = true;
					}
					if ((Static30.method633(Static3.anInt3130) || Static3.anInt3130 == 32) && Static122.aClass56_1646.method1426() < 80) {
						Static122.aClass56_1646 = Static122.aClass56_1646.method1446(Static3.anInt3130);
						Static12.aBoolean17 = true;
					}
					if (Static36.anInt1019 == 84) {
						if (Static122.aClass56_1646.method1426() > 0) {
							Static111.aClass3_Sub2_Sub1_4.method325(76);
							Static111.aClass3_Sub2_Sub1_4.method303(Static122.aClass56_1646.method1426() + 1);
							Static111.aClass3_Sub2_Sub1_4.method293(Static122.aClass56_1646);
						}
						Static12.aBoolean17 = true;
						Static126.anInt3105 = 0;
					}
				} else if (Static57.anInt1609 == -1 && Static63.anInt1818 == -1) {
					if (Static95.anInt2480 != 0 || Static29.anInt868 > 1) {
						Static124.method1998();
					}
					if (Static36.anInt1019 == 85 && Static122.aClass56_1629.method1426() > 0) {
						Static122.aClass56_1629 = Static122.aClass56_1629.method1451(Static122.aClass56_1629.method1426() - 1, 0);
						Static12.aBoolean17 = true;
					}
					if (Static30.method633(Static3.anInt3130) && Static122.aClass56_1629.method1426() < 80) {
						Static122.aClass56_1629 = Static122.aClass56_1629.method1446(Static3.anInt3130);
						Static12.aBoolean17 = true;
					}
					if (Static36.anInt1019 == 84 && Static122.aClass56_1629.method1426() > 0) {
						if (Static95.anInt2480 != 0 || Static29.anInt868 > 1) {
							Static22.aClass56Array1[Static77.anInt3134++] = Static122.aClass56_1629;
							if (Static77.anInt3134 >= 20) {
								Static77.anInt3134 = 0;
							}
							Static35.anInt996 = -1;
						}
						if (Static29.anInt868 == 2) {
							if (Static122.aClass56_1629.method1437(Static13.aClass56_181)) {
								System.gc();
							}
							if (Static122.aClass56_1629.method1437(Static72.aClass56_704)) {
								Static97.method1706();
							}
							if (Static122.aClass56_1629.method1437(Static51.aClass56_846)) {
								Static50.aBoolean63 = true;
							}
							if (Static122.aClass56_1629.method1437(Static24.aClass56_352)) {
								Static50.aBoolean63 = false;
							}
							if (Static122.aClass56_1629.method1437(Static28.aClass56_411)) {
								for (local158 = 0; local158 < 4; local158++) {
									for (@Pc(392) int local392 = 1; local392 < 103; local392++) {
										for (@Pc(396) int local396 = 1; local396 < 103; local396++) {
											Static115.aClass81Array1[local158].anIntArrayArray29[local392][local396] = 0;
										}
									}
								}
							}
							if (Static122.aClass56_1629.method1437(Static22.aClass56_329) && Static95.anInt2480 == 2) {
								throw new RuntimeException();
							}
							if (Static122.aClass56_1629.method1437(Static125.aClass56_1731)) {
								Static67.aBoolean105 = true;
							}
						}
						if (Static122.aClass56_1629.method1428(Static9.aClass56_121)) {
							Static111.aClass3_Sub2_Sub1_4.method325(78);
							Static111.aClass3_Sub2_Sub1_4.method303(Static122.aClass56_1629.method1426() - 1);
							Static111.aClass3_Sub2_Sub1_4.method293(Static122.aClass56_1629.method1417(2));
						} else {
							@Pc(486) Class56 local486 = Static122.aClass56_1629.method1422();
							@Pc(488) byte local488 = 0;
							@Pc(490) byte local490 = 0;
							if (local486.method1428(Static23.aClass56_346)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static23.aClass56_346.method1426());
								local488 = 0;
							} else if (local486.method1428(Static38.aClass56_578)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static38.aClass56_578.method1426());
								local488 = 1;
							} else if (local486.method1428(Static93.aClass56_1301)) {
								local488 = 2;
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static93.aClass56_1301.method1426());
							} else if (local486.method1428(Static122.aClass56_1636)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static122.aClass56_1636.method1426());
								local488 = 3;
							} else if (local486.method1428(Static63.aClass56_968)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static63.aClass56_968.method1426());
								local488 = 4;
							} else if (local486.method1428(Static113.aClass56_1560)) {
								local488 = 5;
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static113.aClass56_1560.method1426());
							} else if (local486.method1428(Static79.aClass56_1139)) {
								local488 = 6;
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static79.aClass56_1139.method1426());
							} else if (local486.method1428(Static102.aClass56_1747)) {
								local488 = 7;
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static102.aClass56_1747.method1426());
							} else if (local486.method1428(Static66.aClass56_275)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static66.aClass56_275.method1426());
								local488 = 8;
							} else if (local486.method1428(Static98.aClass56_1408)) {
								local488 = 9;
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static98.aClass56_1408.method1426());
							} else if (local486.method1428(Static19.aClass56_279)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static19.aClass56_279.method1426());
								local488 = 10;
							} else if (local486.method1428(Static2.aClass56_19)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static2.aClass56_19.method1426());
								local488 = 11;
							} else if (Static117.anInt2965 != 0) {
								if (local486.method1428(Static23.aClass56_343)) {
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static23.aClass56_343.method1426());
									local488 = 0;
								} else if (local486.method1428(Static38.aClass56_575)) {
									local488 = 1;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static38.aClass56_575.method1426());
								} else if (local486.method1428(Static93.aClass56_1300)) {
									local488 = 2;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static93.aClass56_1300.method1426());
								} else if (local486.method1428(Static122.aClass56_1637)) {
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static122.aClass56_1637.method1426());
									local488 = 3;
								} else if (local486.method1428(Static63.aClass56_970)) {
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static63.aClass56_970.method1426());
									local488 = 4;
								} else if (local486.method1428(Static113.aClass56_1559)) {
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static113.aClass56_1559.method1426());
									local488 = 5;
								} else if (local486.method1428(Static79.aClass56_1134)) {
									local488 = 6;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static79.aClass56_1134.method1426());
								} else if (local486.method1428(Static102.aClass56_1746)) {
									local488 = 7;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static102.aClass56_1746.method1426());
								} else if (local486.method1428(Static66.aClass56_268)) {
									local488 = 8;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static66.aClass56_268.method1426());
								} else if (local486.method1428(Static98.aClass56_1405)) {
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static98.aClass56_1405.method1426());
									local488 = 9;
								} else if (local486.method1428(Static19.aClass56_280)) {
									local488 = 10;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static19.aClass56_280.method1426());
								} else if (local486.method1428(Static2.aClass56_13)) {
									local488 = 11;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static2.aClass56_13.method1426());
								}
							}
							local486 = Static122.aClass56_1629.method1422();
							if (local486.method1428(Static28.aClass56_410)) {
								local490 = 1;
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static28.aClass56_410.method1426());
							} else if (local486.method1428(Static92.aClass56_1289)) {
								local490 = 2;
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static92.aClass56_1289.method1426());
							} else if (local486.method1428(Static93.aClass56_1303)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static93.aClass56_1303.method1426());
								local490 = 3;
							} else if (local486.method1428(Static79.aClass56_1140)) {
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static79.aClass56_1140.method1426());
								local490 = 4;
							} else if (local486.method1428(Static18.aClass56_243)) {
								local490 = 5;
								Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static18.aClass56_243.method1426());
							} else if (Static117.anInt2965 != 0) {
								if (local486.method1428(Static28.aClass56_408)) {
									local490 = 1;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static28.aClass56_408.method1426());
								} else if (local486.method1428(Static92.aClass56_1292)) {
									local490 = 2;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static92.aClass56_1292.method1426());
								} else if (local486.method1428(Static93.aClass56_1298)) {
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static93.aClass56_1298.method1426());
									local490 = 3;
								} else if (local486.method1428(Static79.aClass56_1138)) {
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static79.aClass56_1138.method1426());
									local490 = 4;
								} else if (local486.method1428(Static18.aClass56_241)) {
									local490 = 5;
									Static122.aClass56_1629 = Static122.aClass56_1629.method1417(Static18.aClass56_241.method1426());
								}
							}
							Static111.aClass3_Sub2_Sub1_4.method325(143);
							Static111.aClass3_Sub2_Sub1_4.method303(0);
							@Pc(1100) int local1100 = Static111.aClass3_Sub2_Sub1_4.anInt413;
							Static111.aClass3_Sub2_Sub1_4.method303(local488);
							Static111.aClass3_Sub2_Sub1_4.method303(local490);
							Static31.method634(Static111.aClass3_Sub2_Sub1_4, Static122.aClass56_1629);
							Static111.aClass3_Sub2_Sub1_4.method275(Static111.aClass3_Sub2_Sub1_4.anInt413 - local1100);
							if (Static66.anInt541 == 2) {
								Static66.anInt541 = 3;
								Static105.aBoolean120 = true;
								Static111.aClass3_Sub2_Sub1_4.method325(214);
								Static111.aClass3_Sub2_Sub1_4.method303(Static66.anInt541);
								Static111.aClass3_Sub2_Sub1_4.method303(Static46.anInt2266);
								Static111.aClass3_Sub2_Sub1_4.method303(Static56.anInt1592);
							}
						}
						Static122.aClass56_1629 = Static122.aClass56_1633;
						Static12.aBoolean17 = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIII)I")
	public static int method238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}
}
