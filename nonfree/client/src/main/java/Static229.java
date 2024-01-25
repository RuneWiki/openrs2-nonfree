import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Lclient!dda;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient!dda;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	public static int anInt4615;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Lclient!hl;")
	public static final Class148 aClass148_11 = new Class148(9, 2);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBIIIII)I")
	public static int method4169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(24) int local24 = arg1;
			arg1 = arg4;
			arg4 = local24;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 + 1 - arg5 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg4;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public static void method4170(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static299.anInt5460 == 2) {
				Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[0]);
				Static549.aClass314Array1[1].method7996(Static647.aClass119Array1[1]);
			} else if (Static299.anInt5460 == 3) {
				Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[0]);
				Static549.aClass314Array1[1].method7996(Static647.aClass119Array1[1]);
				Static549.aClass314Array1[2].method7996(Static647.aClass119Array1[2]);
			} else {
				Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[0]);
				Static549.aClass314Array1[1].method7996(Static647.aClass119Array1[1]);
				Static549.aClass314Array1[2].method7996(Static647.aClass119Array1[2]);
				Static549.aClass314Array1[3].method7996(Static647.aClass119Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static299.anInt5460 == 2) {
				Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[2]);
			} else if (Static299.anInt5460 == 3) {
				Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[3]);
				Static549.aClass314Array1[1].method7996(Static647.aClass119Array1[4]);
			} else {
				Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[4]);
				Static549.aClass314Array1[1].method7996(Static647.aClass119Array1[5]);
				Static549.aClass314Array1[2].method7996(Static647.aClass119Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static299.anInt5460 == 2) {
				Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[3]);
				return;
			}
			if (Static299.anInt5460 == 3) {
				Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[5]);
				return;
			}
			Static549.aClass314Array1[0].method7996(Static647.aClass119Array1[7]);
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public static void method4171() {
		if (Static316.anInt5770 == 0 || Static316.anInt5770 == 5) {
			return;
		}
		try {
			@Pc(15) short local15;
			if (Static24.anInt451 == 0) {
				local15 = 250;
			} else {
				local15 = 2000;
			}
			if (++Static608.anInt10692 > local15) {
				if (Static395.aClass207_2 != null) {
					Static395.aClass207_2.method5436();
					Static395.aClass207_2 = null;
				}
				if (Static24.anInt451 >= 3) {
					Static316.anInt5770 = 0;
					Static173.method3384(-5);
					return;
				}
				if (Static605.anInt10580 == 2) {
					Static524.aClass66_4.method1681();
				} else {
					aClass66_3.method1681();
				}
				Static608.anInt10692 = 0;
				Static316.anInt5770 = 1;
				Static24.anInt451++;
			}
			if (Static316.anInt5770 == 1) {
				if (Static605.anInt10580 == 2) {
					Static668.aClass268_9 = Static524.aClass66_4.method1684(Static96.aClass48_5);
				} else {
					Static668.aClass268_9 = aClass66_3.method1684(Static96.aClass48_5);
				}
				Static316.anInt5770 = 2;
			}
			@Pc(125) Class2_Sub52 local125;
			if (Static316.anInt5770 == 2) {
				if (Static668.aClass268_9.anInt8008 == 2) {
					throw new IOException();
				}
				if (Static668.aClass268_9.anInt8008 != 1) {
					return;
				}
				Static395.aClass207_2 = Static644.method9522((Socket) Static668.aClass268_9.anObject19);
				Static668.aClass268_9 = null;
				Static237.method4264();
				local125 = Static550.method8448();
				local125.aClass2_Sub8_Sub2_2.method5170(Static527.aClass361_1.anInt10749);
				Static38.method791(local125);
				Static355.method6354();
				Static316.anInt5770 = 3;
			}
			@Pc(164) int local164;
			if (Static316.anInt5770 == 3) {
				if (!Static395.aClass207_2.method5439(1)) {
					return;
				}
				Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 0);
				local164 = Static206.aClass2_Sub8_Sub2_1.lb[0] & 0xFF;
				if (local164 != 0) {
					Static316.anInt5770 = 0;
					Static173.method3384(local164);
					Static395.aClass207_2.method5436();
					Static395.aClass207_2 = null;
					Static642.method9492();
					return;
				}
				Static206.aClass2_Sub8_Sub2_1.anInt5725 = 0;
				@Pc(189) Class2_Sub8 local189 = new Class2_Sub8(518);
				@Pc(192) int[] local192 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local189.method5170(10);
				local189.method5194(local192[0]);
				local189.method5194(local192[1]);
				local189.method5194(local192[2]);
				local189.method5194(local192[3]);
				local189.method5209(0L);
				local189.method5212(Static332.aString71);
				local189.method5209(Static613.aLong289);
				local189.method5209(Static42.aLong31);
				local189.method5200(Static669.aBigInteger6, Static632.aBigInteger3);
				Static237.method4264();
				@Pc(274) Class2_Sub52 local274 = Static550.method8448();
				@Pc(277) Class2_Sub8_Sub2 local277 = local274.aClass2_Sub8_Sub2_2;
				@Pc(306) int local306;
				@Pc(321) int local321;
				if (Static605.anInt10580 == 2) {
					if (Static579.anInt10049 == 13) {
						local277.method5170(Static527.aClass361_5.anInt10749);
					} else {
						local277.method5170(Static527.aClass361_3.anInt10749);
					}
					local277.method5192(0);
					local306 = local277.anInt5725;
					local277.method5194(643);
					local277.method5160(local189.lb, local189.anInt5725, 0);
					local321 = local277.anInt5725;
					local277.method5212(Static470.aString67);
					local277.method5170(Static353.anInt6795);
					local277.method5170(Static255.method4444());
					local277.method5192(Static406.anInt7570);
					local277.method5192(Static19.anInt352);
					local277.method5170(Static230.aClass2_Sub54_15.aClass4_Sub19_1.method6178());
					Static551.method8454(local277);
					local277.method5212(Static188.aString98);
					local277.method5194(Static568.anInt9915);
					@Pc(368) Class2_Sub8 local368 = Static230.aClass2_Sub54_15.method9554();
					local277.method5170(local368.anInt5725);
					local277.method5160(local368.lb, local368.anInt5725, 0);
					Static388.aBoolean551 = true;
					@Pc(390) Class2_Sub8 local390 = new Class2_Sub8(Static466.aClass2_Sub55_1.method9814());
					Static466.aClass2_Sub55_1.method9816(local390);
					local277.method5160(local390.lb, local390.lb.length, 0);
					local277.method5192(Static432.anInt7901);
					local277.method5209(Static113.aLong66);
					local277.method5170(Static185.aString42 == null ? 0 : 1);
					if (Static185.aString42 != null) {
						local277.method5212(Static185.aString42);
					}
					local277.method5170(Static193.method3740("jagtheora") ? 1 : 0);
					local277.method5170(Static280.aBoolean388 ? 1 : 0);
					Static113.method2011(local277);
					local277.method5229(local277.anInt5725, local192, local321);
					local277.method5162(local277.anInt5725 - local306);
				} else {
					local277.method5170(Static527.aClass361_6.anInt10749);
					local277.method5192(0);
					local306 = local277.anInt5725;
					local277.method5194(643);
					local277.method5160(local189.lb, local189.anInt5725, 0);
					local321 = local277.anInt5725;
					local277.method5212(Static470.aString67);
					local277.method5170(Static551.aClass229_15.anInt6908);
					local277.method5170(Static204.anInt8130);
					Static551.method8454(local277);
					local277.method5212(Static188.aString98);
					local277.method5194(Static568.anInt9915);
					Static113.method2011(local277);
					local277.method5229(local277.anInt5725, local192, local321);
					local277.method5162(local277.anInt5725 - local306);
				}
				Static38.method791(local274);
				Static355.method6354();
				Static125.aClass179_1 = new Class179(local192);
				for (local306 = 0; local306 < 4; local306++) {
					local192[local306] += 50;
				}
				Static206.aClass2_Sub8_Sub2_1.method5236(local192);
				Static316.anInt5770 = 4;
			}
			if (Static316.anInt5770 == 4) {
				if (!Static395.aClass207_2.method5439(1)) {
					return;
				}
				Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 0);
				local164 = Static206.aClass2_Sub8_Sub2_1.lb[0] & 0xFF;
				if (local164 == 21) {
					Static316.anInt5770 = 7;
				} else if (local164 == 29) {
					Static316.anInt5770 = 13;
				} else if (local164 == 1) {
					Static316.anInt5770 = 5;
					Static173.method3384(local164);
					return;
				} else if (local164 == 2) {
					Static316.anInt5770 = 8;
				} else if (local164 == 15) {
					Static316.anInt5770 = 14;
					Static538.anInt9383 = -2;
				} else if (local164 == 23 && Static24.anInt451 < 3) {
					Static316.anInt5770 = 1;
					Static24.anInt451++;
					Static608.anInt10692 = 0;
					Static395.aClass207_2.method5436();
					Static395.aClass207_2 = null;
					return;
				} else {
					Static316.anInt5770 = 0;
					Static173.method3384(local164);
					Static395.aClass207_2.method5436();
					Static395.aClass207_2 = null;
					Static642.method9492();
					return;
				}
			}
			if (Static316.anInt5770 == 6) {
				Static237.method4264();
				local125 = Static550.method8448();
				@Pc(692) Class2_Sub8_Sub2 local692 = local125.aClass2_Sub8_Sub2_2;
				local692.method5232(Static125.aClass179_1);
				local692.method5241(Static527.aClass361_10.anInt10749);
				Static38.method791(local125);
				Static355.method6354();
				Static316.anInt5770 = 4;
			} else if (Static316.anInt5770 == 7) {
				if (Static395.aClass207_2.method5439(1)) {
					Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 0);
					local164 = Static206.aClass2_Sub8_Sub2_1.lb[0] & 0xFF;
					Static316.anInt5770 = 0;
					Static566.anInt9812 = local164 * 50;
					Static173.method3384(21);
					Static395.aClass207_2.method5436();
					Static395.aClass207_2 = null;
					Static642.method9492();
				}
			} else if (Static316.anInt5770 == 13) {
				if (Static395.aClass207_2.method5439(1)) {
					Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 0);
					Static373.anInt7100 = Static206.aClass2_Sub8_Sub2_1.lb[0] & 0xFF;
					Static316.anInt5770 = 0;
					Static173.method3384(29);
					Static395.aClass207_2.method5436();
					Static395.aClass207_2 = null;
					Static642.method9492();
				}
			} else if (Static316.anInt5770 != 8) {
				@Pc(829) Class2_Sub8_Sub2 local829;
				if (Static316.anInt5770 == 9) {
					local829 = Static206.aClass2_Sub8_Sub2_1;
					if (Static605.anInt10580 == 2) {
						if (!Static395.aClass207_2.method5439(Static372.anInt7093)) {
							return;
						}
						Static395.aClass207_2.method5438(Static372.anInt7093, local829.lb, 0);
						local829.anInt5725 = 0;
						Static31.anInt530 = local829.method5203();
						Static488.anInt8753 = local829.method5203();
						Static145.aBoolean199 = local829.method5203() == 1;
						Static501.aBoolean678 = local829.method5203() == 1;
						Static606.aBoolean772 = local829.method5203() == 1;
						Static530.aBoolean716 = local829.method5203() == 1;
						Static659.anInt11273 = local829.method5211();
						Static64.aBoolean69 = local829.method5203() == 1;
						Static534.anInt9700 = local829.method5193();
						Static100.aBoolean97 = local829.method5203() == 1;
						Static251.aClass328_1.method8260(Static100.aBoolean97);
						Static372.aClass343_1.method8548(Static100.aBoolean97);
						Static522.aClass272_2.method7201(Static100.aBoolean97);
					} else if (Static395.aClass207_2.method5439(Static372.anInt7093)) {
						Static395.aClass207_2.method5438(Static372.anInt7093, local829.lb, 0);
						local829.anInt5725 = 0;
						Static31.anInt530 = local829.method5203();
						Static488.anInt8753 = local829.method5203();
						Static145.aBoolean199 = local829.method5203() == 1;
						Static501.aBoolean678 = local829.method5203() == 1;
						Static606.aBoolean772 = local829.method5203() == 1;
						Static41.aLong30 = local829.method5213();
						Static201.aLong107 = Static41.aLong30 - Static99.method1701() - local829.method5166();
						@Pc(912) int local912 = local829.method5203();
						Static64.aBoolean69 = (local912 & 0x1) != 0;
						Static629.aBoolean787 = (local912 & 0x2) != 0;
						Static553.anInt9674 = local829.method5172();
						Static510.anInt9054 = local829.method5211();
						Static335.anInt6094 = local829.method5211();
						Static199.anInt4198 = local829.method5211();
						Static87.anInt1631 = local829.method5172();
						Static185.aClass268_5 = Static96.aClass48_5.method1320(Static87.anInt1631);
						Static287.anInt5261 = local829.method5203();
						Static260.anInt4987 = local829.method5211();
						Static151.anInt2801 = local829.method5211();
						Static137.aBoolean194 = local829.method5203() == 1;
						Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString30 = Static541.aString111 = local829.method5183();
						Static404.anInt7482 = local829.method5203();
						Static101.anInt1791 = local829.method5172();
						Static274.aBoolean382 = local829.method5203() == 1;
						Static186.aClass66_1 = new Class66();
						Static186.aClass66_1.anInt1756 = local829.method5211();
						if (Static186.aClass66_1.anInt1756 == 65535) {
							Static186.aClass66_1.anInt1756 = -1;
						}
						Static186.aClass66_1.aString22 = local829.method5183();
						if (Static235.aClass37_5 != Static314.aClass37_6) {
							Static186.aClass66_1.anInt1757 = Static186.aClass66_1.anInt1756 + 50000;
							Static186.aClass66_1.anInt1755 = Static186.aClass66_1.anInt1756 + 40000;
						}
						if (Static235.aClass37_5 != Static466.aClass37_9 && (Static415.aClass37_3 != Static235.aClass37_5 || Static31.anInt530 < 2) && (Static524.aClass66_4.method1683(Static609.aClass66_5) || Static524.aClass66_4.method1683(aClass66_2))) {
							Static634.method9354();
						}
					} else {
						return;
					}
					if (Static145.aBoolean199 && !Static606.aBoolean772 || Static64.aBoolean69) {
						try {
							Static675.method1325(Static637.anApplet2, "zap");
						} catch (@Pc(1199) Throwable local1199) {
							if (Static422.aBoolean577) {
								try {
									Static637.anApplet2.getAppletContext().showDocument(new URL(Static637.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1213) Exception local1213) {
								}
							}
						}
					} else {
						try {
							Static675.method1325(Static637.anApplet2, "unzap");
						} catch (@Pc(1222) Throwable local1222) {
						}
					}
					if (Static314.aClass37_6 == Static235.aClass37_5) {
						try {
							Static675.method1325(Static637.anApplet2, "loggedin");
						} catch (@Pc(1233) Throwable local1233) {
						}
					}
					if (Static605.anInt10580 != 2) {
						Static316.anInt5770 = 0;
						Static173.method3384(2);
						Static99.method1700();
						Static248.method4408(7);
						Static14.aClass169_207 = null;
						return;
					}
					Static316.anInt5770 = 11;
				}
				if (Static316.anInt5770 == 11) {
					if (!Static395.aClass207_2.method5439(3)) {
						return;
					}
					Static395.aClass207_2.method5438(3, Static206.aClass2_Sub8_Sub2_1.lb, 0);
					Static316.anInt5770 = 12;
				}
				if (Static316.anInt5770 == 12) {
					local829 = Static206.aClass2_Sub8_Sub2_1;
					local829.anInt5725 = 0;
					if (local829.method5235()) {
						if (!Static395.aClass207_2.method5439(1)) {
							return;
						}
						Static395.aClass207_2.method5438(1, local829.lb, 3);
					}
					Static14.aClass169_207 = Static127.method2287()[local829.method5239()];
					Static538.anInt9383 = local829.method5211();
					Static316.anInt5770 = 10;
				}
				if (Static316.anInt5770 == 10) {
					if (Static395.aClass207_2.method5439(Static538.anInt9383)) {
						Static395.aClass207_2.method5438(Static538.anInt9383, Static206.aClass2_Sub8_Sub2_1.lb, 0);
						Static206.aClass2_Sub8_Sub2_1.anInt5725 = 0;
						local164 = Static538.anInt9383;
						Static316.anInt5770 = 0;
						Static173.method3384(2);
						Static266.method4571();
						Static45.method945(Static206.aClass2_Sub8_Sub2_1);
						Static194.anInt4134 = -1;
						if (Static535.aClass169_223 == Static14.aClass169_207) {
							Static452.method7287();
						} else {
							Static340.method5714();
						}
						if (Static206.aClass2_Sub8_Sub2_1.anInt5725 != local164) {
							throw new RuntimeException("lswp pos:" + Static206.aClass2_Sub8_Sub2_1.anInt5725 + " psize:" + local164);
						}
						Static14.aClass169_207 = null;
					}
				} else if (Static316.anInt5770 == 14) {
					if (Static538.anInt9383 == -2) {
						if (!Static395.aClass207_2.method5439(2)) {
							return;
						}
						Static395.aClass207_2.method5438(2, Static206.aClass2_Sub8_Sub2_1.lb, 0);
						Static206.aClass2_Sub8_Sub2_1.anInt5725 = 0;
						Static538.anInt9383 = Static206.aClass2_Sub8_Sub2_1.method5211();
					}
					if (Static395.aClass207_2.method5439(Static538.anInt9383)) {
						Static395.aClass207_2.method5438(Static538.anInt9383, Static206.aClass2_Sub8_Sub2_1.lb, 0);
						Static206.aClass2_Sub8_Sub2_1.anInt5725 = 0;
						Static316.anInt5770 = 0;
						local164 = Static538.anInt9383;
						Static173.method3384(15);
						Static577.method8739();
						Static45.method945(Static206.aClass2_Sub8_Sub2_1);
						if (Static206.aClass2_Sub8_Sub2_1.anInt5725 != local164) {
							throw new RuntimeException("lswpr pos:" + Static206.aClass2_Sub8_Sub2_1.anInt5725 + " psize:" + local164);
						}
						Static14.aClass169_207 = null;
					}
				}
			} else if (Static395.aClass207_2.method5439(1)) {
				Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 0);
				Static372.anInt7093 = Static206.aClass2_Sub8_Sub2_1.lb[0] & 0xFF;
				Static316.anInt5770 = 9;
			}
		} catch (@Pc(1478) IOException local1478) {
			if (Static395.aClass207_2 != null) {
				Static395.aClass207_2.method5436();
				Static395.aClass207_2 = null;
			}
			if (Static24.anInt451 >= 3) {
				Static316.anInt5770 = 0;
				Static173.method3384(-4);
				Static642.method9492();
			} else {
				if (Static605.anInt10580 == 2) {
					Static524.aClass66_4.method1681();
				} else {
					aClass66_3.method1681();
				}
				Static608.anInt10692 = 0;
				Static316.anInt5770 = 1;
				Static24.anInt451++;
			}
		}
	}
}
