import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "Lclient!ao;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
	public static int anInt1388;

	@OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
	public static int anInt1391;

	@OriginalMember(owner = "client!dk", name = "A", descriptor = "Lclient!uu;")
	public static final Class5_Sub15_Sub2 aClass5_Sub15_Sub2_1 = new Class5_Sub15_Sub2(5000);

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)V")
	public static void method1135() {
		if (Static51.anInt913 == 0 || Static51.anInt913 == 6) {
			return;
		}
		try {
			if (++Static35.anInt4182 > 2000) {
				if (Static14.aClass99_2 != null) {
					Static14.aClass99_2.method4963();
					Static14.aClass99_2 = null;
				}
				if (Static329.anInt5081 >= 1) {
					Static51.anInt913 = 0;
					Static363.method4695(-5);
					return;
				}
				if (Static226.anInt3761 == 2 || Static226.anInt3761 == 3) {
					Static239.aClass165_7.aBoolean279 = !Static239.aClass165_7.aBoolean279;
				} else {
					Static263.aClass165_5.aBoolean279 = !Static263.aClass165_5.aBoolean279;
				}
				Static329.anInt5081++;
				Static35.anInt4182 = 0;
				Static51.anInt913 = 1;
			}
			if (Static51.anInt913 == 1) {
				if (Static226.anInt3761 == 2 || Static226.anInt3761 == 3) {
					Static54.aClass268_2 = Static7.aClass93_1.method2088(Static239.aClass165_7.method3381(), Static239.aClass165_7.aString50);
				} else {
					Static54.aClass268_2 = Static7.aClass93_1.method2088(Static263.aClass165_5.method3381(), Static263.aClass165_5.aString50);
				}
				Static51.anInt913 = 2;
			}
			if (Static51.anInt913 == 2) {
				if (Static54.aClass268_2.anInt7420 == 2) {
					throw new IOException();
				}
				if (Static54.aClass268_2.anInt7420 != 1) {
					return;
				}
				Static14.aClass99_2 = Static379.method3489((Socket) Static54.aClass268_2.anObject10);
				Static54.aClass268_2 = null;
				@Pc(150) long local150 = Static269.aLong130 = Static83.method1230(Static342.aString60);
				@Pc(157) int local157 = (int) (local150 >> 16 & 0x1FL);
				Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
				Static281.aClass5_Sub15_Sub2_13.method5583(Static316.aClass210_1.anInt5855);
				Static281.aClass5_Sub15_Sub2_13.method5583(local157);
				Static14.aClass99_2.method4964(2, Static281.aClass5_Sub15_Sub2_13.aByteArray93);
				Static51.anInt913 = 3;
			}
			@Pc(206) int local206;
			if (Static51.anInt913 == 3) {
				if (!Static14.aClass99_2.method4961(1)) {
					return;
				}
				Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, 1);
				local206 = aClass5_Sub15_Sub2_1.aByteArray93[0] & 0xFF;
				if (local206 != 0) {
					Static51.anInt913 = 0;
					Static363.method4695(local206);
					Static14.aClass99_2.method4963();
					Static14.aClass99_2 = null;
					Static444.method5898();
					return;
				}
				Static51.anInt913 = 4;
			}
			if (Static51.anInt913 == 4) {
				if (!Static14.aClass99_2.method4961(8)) {
					return;
				}
				Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, 8);
				aClass5_Sub15_Sub2_1.anInt7013 = 0;
				Static62.aLong44 = aClass5_Sub15_Sub2_1.method5553();
				@Pc(259) Class5_Sub15 local259 = new Class5_Sub15(70);
				@Pc(262) int[] local262 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static62.aLong44 >> 32), (int) Static62.aLong44 };
				local259.method5583(10);
				local259.method5550(local262[0]);
				local259.method5550(local262[1]);
				local259.method5550(local262[2]);
				local259.method5550(local262[3]);
				local259.method5587(Static83.method1230(Static342.aString60));
				local259.method5545(Static390.aString67);
				local259.method5589(Static317.aBigInteger1, Static407.aBigInteger2);
				@Pc(335) Class5_Sub15_Sub2 local335 = Static281.aClass5_Sub15_Sub2_13;
				local335.anInt7013 = 0;
				@Pc(360) int local360;
				if (Static226.anInt3761 == 2 || Static226.anInt3761 == 3) {
					if (Static376.anInt6324 == 12) {
						local335.method5583(Static316.aClass210_5.anInt5855);
					} else {
						local335.method5583(Static316.aClass210_3.anInt5855);
					}
					local335.method5566(0);
					local360 = local335.anInt7013;
					local335.method5550(602);
					local335.method5583(Static93.anInt1623);
					local335.method5583(Static213.method2819());
					local335.method5566(Static178.anInt5792);
					local335.method5566(Static102.anInt1723);
					local335.method5583(Static216.aClass1_Sub1_1.anInt4518);
					Static61.method964(local335);
					local335.method5545(Static452.aString74);
					local335.method5550(Static250.anInt4070);
					@Pc(469) Class5_Sub15 local469 = Static216.aClass1_Sub1_1.method3594();
					local335.method5583(local469.anInt7013);
					local335.method5557(local469.anInt7013, local469.aByteArray93);
					Static81.aBoolean103 = true;
					local335.method5566(Static102.anInt1724);
					local335.method5566(Static31.anInt615);
					Static430.method5695();
					local335.method5557(local259.anInt7013, local259.aByteArray93);
					local335.method5584(local335.anInt7013 - local360);
				} else {
					local335.method5583(Static316.aClass210_6.anInt5855);
					local335.method5566(0);
					local360 = local335.anInt7013;
					local335.method5550(602);
					local335.method5583(Static217.aClass197_2.anInt5079);
					local335.method5583(Static38.anInt4834);
					Static61.method964(local335);
					local335.method5545(Static452.aString74);
					local335.method5550(Static250.anInt4070);
					Static430.method5695();
					local335.method5557(local259.anInt7013, local259.aByteArray93);
					local335.method5584(local335.anInt7013 - local360);
				}
				Static14.aClass99_2.method4964(local335.anInt7013, local335.aByteArray93);
				local335.method5613(local262);
				for (local360 = 0; local360 < 4; local360++) {
					local262[local360] += 50;
				}
				aClass5_Sub15_Sub2_1.method5613(local262);
				Static51.anInt913 = 5;
			}
			if (Static51.anInt913 == 5) {
				if (!Static14.aClass99_2.method4961(1)) {
					return;
				}
				Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, 1);
				local206 = aClass5_Sub15_Sub2_1.aByteArray93[0] & 0xFF;
				if (local206 == 21) {
					Static51.anInt913 = 8;
				} else if (local206 == 29) {
					Static51.anInt913 = 14;
				} else if (local206 == 1) {
					Static51.anInt913 = 6;
					Static363.method4695(local206);
					return;
				} else if (local206 == 2) {
					Static51.anInt913 = 9;
				} else if (local206 == 15) {
					Static128.anInt2223 = -2;
					Static51.anInt913 = 15;
				} else if (local206 == 23 && Static329.anInt5081 < 1) {
					Static329.anInt5081++;
					Static35.anInt4182 = 0;
					Static51.anInt913 = 1;
					Static14.aClass99_2.method4963();
					Static14.aClass99_2 = null;
					return;
				} else {
					Static51.anInt913 = 0;
					Static363.method4695(local206);
					Static14.aClass99_2.method4963();
					Static14.aClass99_2 = null;
					Static444.method5898();
					return;
				}
			}
			if (Static51.anInt913 == 7) {
				Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
				Static281.aClass5_Sub15_Sub2_13.method5614(Static316.aClass210_4.anInt5855);
				Static14.aClass99_2.method4964(Static281.aClass5_Sub15_Sub2_13.anInt7013, Static281.aClass5_Sub15_Sub2_13.aByteArray93);
				Static51.anInt913 = 5;
			} else if (Static51.anInt913 == 8) {
				if (Static14.aClass99_2.method4961(1)) {
					Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, 1);
					local206 = aClass5_Sub15_Sub2_1.aByteArray93[0] & 0xFF;
					Static51.anInt913 = 0;
					Static156.anInt2709 = (local206 + 3) * 60;
					Static363.method4695(21);
					Static14.aClass99_2.method4963();
					Static14.aClass99_2 = null;
					Static444.method5898();
				}
			} else if (Static51.anInt913 == 14) {
				if (Static14.aClass99_2.method4961(1)) {
					Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, 1);
					Static255.anInt4157 = aClass5_Sub15_Sub2_1.aByteArray93[0] & 0xFF;
					Static51.anInt913 = 0;
					Static363.method4695(29);
					Static14.aClass99_2.method4963();
					Static14.aClass99_2 = null;
					Static444.method5898();
				}
			} else if (Static51.anInt913 != 9) {
				@Pc(801) Class5_Sub15_Sub2 local801;
				if (Static51.anInt913 == 10) {
					local801 = aClass5_Sub15_Sub2_1;
					if (Static226.anInt3761 == 3) {
						Static118.aBoolean152 = true;
					} else {
						Static118.aBoolean152 = false;
					}
					if (Static226.anInt3761 == 2 || Static226.anInt3761 == 3) {
						if (!Static14.aClass99_2.method4961(Static344.anInt5626)) {
							return;
						}
						Static14.aClass99_2.method4959(0, local801.aByteArray93, Static344.anInt5626);
						local801.anInt7013 = 0;
						Static189.anInt3178 = local801.method5539();
						Static213.anInt3560 = local801.method5539();
						Static408.aBoolean459 = local801.method5539() == 1;
						Static337.aBoolean377 = local801.method5539() == 1;
						Static23.aBoolean42 = local801.method5539() == 1;
						Static146.aBoolean172 = local801.method5539() == 1;
						Static43.anInt5302 = local801.method5598();
						Static282.aBoolean288 = local801.method5539() == 1;
						Static115.anInt1963 = local801.method5558();
						Static150.aBoolean175 = local801.method5539() == 1;
						if (Static226.anInt3761 == 3) {
							@Pc(1101) boolean local1101 = local801.method5539() == 1;
							if (local1101) {
								@Pc(1107) long local1107 = local801.method5553();
								@Pc(1111) String local1111 = Static448.method5905(local1107);
								@Pc(1115) int local1115 = local801.method5539();
								@Pc(1118) byte[] local1118 = new byte[local1115];
								local801.method5604(local1118, local1115);
								@Pc(1128) String local1128 = Static396.method5145(local1118);
								@Pc(1130) Class139 local1130 = null;
								try {
									@Pc(1136) Class268 local1136 = Static7.aClass93_1.method2100("3", false);
									while (local1136.anInt7420 == 0) {
										Static140.method2004(1L);
									}
									if (local1136.anInt7420 == 1) {
										local1130 = (Class139) local1136.anObject10;
										@Pc(1167) int local1167 = local1111.length() + local1128.length() + 2 + 3 + 4;
										if (local1167 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1184) Class5_Sub15 local1184 = new Class5_Sub15(local1167 + 1);
										local1184.method5583(local1167);
										local1184.method5583(0);
										local1184.method5577(local1111);
										local1184.method5577(local1128);
										local1184.method5575();
										local1130.method2902(local1184.aByteArray93, 0, local1184.anInt7013);
									}
								} catch (@Pc(1214) Exception local1214) {
								}
								try {
									if (local1130 != null) {
										local1130.method2897();
									}
								} catch (@Pc(1221) Exception local1221) {
								}
							}
						}
						Static398.aClass256_4.method5776(Static150.aBoolean175);
						Static306.aClass67_3.method1445(Static150.aBoolean175);
						Static196.aClass180_1.method3715(Static150.aBoolean175);
					} else if (Static14.aClass99_2.method4961(Static344.anInt5626)) {
						Static14.aClass99_2.method4959(0, local801.aByteArray93, Static344.anInt5626);
						local801.anInt7013 = 0;
						Static189.anInt3178 = local801.method5539();
						Static213.anInt3560 = local801.method5539();
						Static408.aBoolean459 = local801.method5539() == 1;
						Static337.aBoolean377 = local801.method5539() == 1;
						Static23.aBoolean42 = local801.method5539() == 1;
						Static440.anInt7324 = local801.method5598();
						Static282.aBoolean288 = Static440.anInt7324 > 0;
						Static364.anInt5916 = local801.method5598();
						Static414.anInt6897 = local801.method5598();
						Static412.anInt6864 = local801.method5598();
						Static198.anInt3290 = local801.method5603();
						Static22.aClass268_1 = Static7.aClass93_1.method2072(Static198.anInt3290);
						Static405.anInt7261 = local801.method5539();
						Static458.anInt7497 = local801.method5598();
						Static240.anInt6958 = local801.method5598();
						Static213.aBoolean231 = local801.method5539() == 1;
						Static220.aClass2_Sub1_Sub3_Sub2_1.aString65 = Static220.aClass2_Sub1_Sub3_Sub2_1.aString66 = local801.method5601();
						Static166.aClass165_3 = new Class165();
						Static166.aClass165_3.anInt4240 = local801.method5598();
						if (Static166.aClass165_3.anInt4240 == 65535) {
							Static166.aClass165_3.anInt4240 = -1;
						}
						Static166.aClass165_3.aString50 = local801.method5601();
						if (Static289.aClass170_8 != Static350.aClass170_10) {
							Static166.aClass165_3.anInt4244 = Static166.aClass165_3.anInt4240 + 40000;
							Static166.aClass165_3.anInt4241 = Static166.aClass165_3.anInt4240 + 50000;
						}
						if (Static346.aClass170_9 != Static350.aClass170_10 && (Static239.aClass165_7.method3382(Static12.aClass165_1) || Static239.aClass165_7.method3382(Static104.aClass165_2))) {
							Static239.aClass165_7 = Static166.aClass165_3;
						}
					} else {
						return;
					}
					if (Static408.aBoolean459 && !Static23.aBoolean42 || Static282.aBoolean288) {
						try {
							Static471.method4680("zap", Static7.aClass93_1.anApplet1);
						} catch (@Pc(1260) Throwable local1260) {
							if (Static313.aBoolean402) {
								try {
									Static7.aClass93_1.anApplet1.getAppletContext().showDocument(new URL(Static7.aClass93_1.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1276) Exception local1276) {
								}
							}
						}
					} else {
						try {
							Static471.method4680("unzap", Static7.aClass93_1.anApplet1);
						} catch (@Pc(1250) Throwable local1250) {
						}
					}
					if (Static350.aClass170_10 == Static289.aClass170_8) {
						try {
							Static471.method4680("loggedin", Static7.aClass93_1.anApplet1);
						} catch (@Pc(1288) Throwable local1288) {
						}
					}
					if (Static226.anInt3761 != 2 && Static226.anInt3761 != 3) {
						Static51.anInt913 = 0;
						Static363.method4695(2);
						Static56.method924();
						Static407.method5394(6);
						Static445.aClass129_65 = null;
						return;
					}
					Static51.anInt913 = 12;
				}
				if (Static51.anInt913 == 12) {
					if (!Static14.aClass99_2.method4961(3)) {
						return;
					}
					Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, 3);
					Static51.anInt913 = 13;
				}
				if (Static51.anInt913 == 13) {
					local801 = aClass5_Sub15_Sub2_1;
					local801.anInt7013 = 0;
					if (local801.method5615()) {
						if (!Static14.aClass99_2.method4961(1)) {
							return;
						}
						Static14.aClass99_2.method4959(3, local801.aByteArray93, 1);
					}
					Static445.aClass129_65 = Static49.method794()[local801.method5611()];
					Static128.anInt2223 = local801.method5598();
					Static51.anInt913 = 11;
				}
				if (Static51.anInt913 == 11) {
					if (Static14.aClass99_2.method4961(Static128.anInt2223)) {
						Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, Static128.anInt2223);
						aClass5_Sub15_Sub2_1.anInt7013 = 0;
						Static51.anInt913 = 0;
						local206 = Static128.anInt2223;
						Static363.method4695(2);
						Static433.method5725();
						Static439.method5802(aClass5_Sub15_Sub2_1);
						Static345.anInt5641 = -1;
						Static332.method4112();
						if (local206 != aClass5_Sub15_Sub2_1.anInt7013) {
							throw new RuntimeException("lswp pos:" + aClass5_Sub15_Sub2_1.anInt7013 + " psize:" + local206);
						}
						Static445.aClass129_65 = null;
					}
				} else if (Static51.anInt913 == 15) {
					if (Static128.anInt2223 == -2) {
						if (!Static14.aClass99_2.method4961(2)) {
							return;
						}
						Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, 2);
						aClass5_Sub15_Sub2_1.anInt7013 = 0;
						Static128.anInt2223 = aClass5_Sub15_Sub2_1.method5598();
					}
					if (Static14.aClass99_2.method4961(Static128.anInt2223)) {
						Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, Static128.anInt2223);
						aClass5_Sub15_Sub2_1.anInt7013 = 0;
						Static51.anInt913 = 0;
						local206 = Static128.anInt2223;
						Static363.method4695(15);
						Static111.method1527();
						Static439.method5802(aClass5_Sub15_Sub2_1);
						if (aClass5_Sub15_Sub2_1.anInt7013 != local206) {
							throw new RuntimeException("lswpr pos:" + aClass5_Sub15_Sub2_1.anInt7013 + " psize:" + local206);
						}
						Static445.aClass129_65 = null;
					}
				}
			} else if (Static14.aClass99_2.method4961(1)) {
				Static14.aClass99_2.method4959(0, aClass5_Sub15_Sub2_1.aByteArray93, 1);
				Static344.anInt5626 = aClass5_Sub15_Sub2_1.aByteArray93[0] & 0xFF;
				Static51.anInt913 = 10;
			}
		} catch (@Pc(1527) IOException local1527) {
			if (Static14.aClass99_2 != null) {
				Static14.aClass99_2.method4963();
				Static14.aClass99_2 = null;
			}
			if (Static329.anInt5081 >= 1) {
				Static51.anInt913 = 0;
				Static363.method4695(-4);
				Static444.method5898();
			} else {
				Static35.anInt4182 = 0;
				if (Static226.anInt3761 == 2 || Static226.anInt3761 == 3) {
					Static239.aClass165_7.aBoolean279 = !Static239.aClass165_7.aBoolean279;
				} else {
					Static263.aClass165_5.aBoolean279 = !Static263.aClass165_5.aBoolean279;
				}
				Static329.anInt5081++;
				Static51.anInt913 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)I")
	public static int method1136(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)Z")
	public static boolean method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static243.method3145(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static419.anInt6980;
			@Pc(14) int local14 = arg2 << Static419.anInt6980;
			return Static408.method5397(local10 + 1, Static410.aClass125Array3[arg0].ua(arg1, arg2) + arg3, local14 + 1) && Static408.method5397(local10 + Static92.anInt1592 - 1, Static410.aClass125Array3[arg0].ua(arg1 + 1, arg2) + arg3, local14 + 1) && Static408.method5397(local10 + Static92.anInt1592 - 1, Static410.aClass125Array3[arg0].ua(arg1 + 1, arg2 + 1) + arg3, local14 + Static92.anInt1592 - 1) && Static408.method5397(local10 + 1, Static410.aClass125Array3[arg0].ua(arg1, arg2 + 1) + arg3, local14 + Static92.anInt1592 - 1);
		} else {
			return false;
		}
	}
}
