import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!iaa;")
	public static Class130 aClass130_7;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public static int anInt7310;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public static int anInt7308 = 0;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_99 = new Class186(60, 7);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)Lclient!mb;")
	public static Class1_Sub1_Sub13 method6225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) Class1_Sub1_Sub13 local23 = (Class1_Sub1_Sub13) Static411.aClass174_28.method4422((long) arg0 << 32 | (long) arg1);
		if (local23 == null) {
			local23 = new Class1_Sub1_Sub13(arg0, arg1);
			Static411.aClass174_28.method4420(local23, local23.aLong244);
		}
		return local23;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6226(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = arg0.charAt(local10) + (local8 << 5) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method6227() {
		if (Static546.anInt9466 == 0 || Static546.anInt9466 == 6) {
			return;
		}
		try {
			if (++Static547.anInt9476 > 2000) {
				if (Static453.aClass154_1 != null) {
					Static453.aClass154_1.method4020();
					Static453.aClass154_1 = null;
				}
				if (Static138.anInt9428 >= 1) {
					Static546.anInt9466 = 0;
					Static110.method2414(-5);
					return;
				}
				Static547.anInt9476 = 0;
				Static546.anInt9466 = 1;
				if (Static41.anInt1359 == 2 || Static41.anInt1359 == 3) {
					Static153.aClass130_5.aBoolean248 = !Static153.aClass130_5.aBoolean248;
				} else {
					Static269.aClass130_6.aBoolean248 = !Static269.aClass130_6.aBoolean248;
				}
				Static138.anInt9428++;
			}
			if (Static546.anInt9466 == 1) {
				if (Static41.anInt1359 == 2 || Static41.anInt1359 == 3) {
					Static317.aClass243_5 = Static91.aClass182_2.method4818(Static153.aClass130_5.aString26, Static153.aClass130_5.method3628());
				} else {
					Static317.aClass243_5 = Static91.aClass182_2.method4818(Static269.aClass130_6.aString26, Static269.aClass130_6.method3628());
				}
				Static546.anInt9466 = 2;
			}
			if (Static546.anInt9466 == 2) {
				if (Static317.aClass243_5.anInt6905 == 2) {
					throw new IOException();
				}
				if (Static317.aClass243_5.anInt6905 != 1) {
					return;
				}
				Static453.aClass154_1 = Static252.method4282((Socket) Static317.aClass243_5.anObject12);
				Static317.aClass243_5 = null;
				@Pc(156) long local156 = Static14.aLong11 = Static314.method5172(Static29.aString5);
				Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
				@Pc(166) int local166 = (int) (local156 >> 16 & 0x1FL);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static203.aClass143_1.anInt4449);
				Static192.aClass1_Sub13_Sub2_1.method3060(local166);
				Static453.aClass154_1.method4023(2, Static192.aClass1_Sub13_Sub2_1.aByteArray45);
				Static546.anInt9466 = 3;
			}
			@Pc(210) int local210;
			if (Static546.anInt9466 == 3) {
				if (!Static453.aClass154_1.method4019(1)) {
					return;
				}
				Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
				local210 = Static255.aClass1_Sub13_Sub2_2.aByteArray45[0] & 0xFF;
				if (local210 != 0) {
					Static546.anInt9466 = 0;
					Static110.method2414(local210);
					Static453.aClass154_1.method4020();
					Static453.aClass154_1 = null;
					Static430.method6344();
					return;
				}
				Static546.anInt9466 = 4;
			}
			if (Static546.anInt9466 == 4) {
				if (!Static453.aClass154_1.method4019(8)) {
					return;
				}
				Static453.aClass154_1.method4022(8, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
				Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
				Static95.aLong58 = Static255.aClass1_Sub13_Sub2_2.method3015();
				@Pc(258) Class1_Sub13 local258 = new Class1_Sub13(518);
				@Pc(261) int[] local261 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static95.aLong58 >> 32), (int) Static95.aLong58 };
				local258.method3060(10);
				local258.method3069(local261[0]);
				local258.method3069(local261[1]);
				local258.method3069(local261[2]);
				local258.method3069(local261[3]);
				local258.method3036(Static314.method5172(Static29.aString5));
				local258.method3061(Static469.aString68);
				local258.method3036(Static265.aLong134);
				local258.method3036(Static63.aLong46);
				local258.method3031(Static87.aBigInteger4, Static170.aBigInteger3);
				@Pc(342) Class1_Sub13_Sub2 local342 = Static192.aClass1_Sub13_Sub2_1;
				local342.anInt3400 = 0;
				@Pc(378) int local378;
				if (Static41.anInt1359 == 2 || Static41.anInt1359 == 3) {
					if (Static51.anInt7926 == 12) {
						local342.method3060(Static203.aClass143_5.anInt4449);
					} else {
						local342.method3060(Static203.aClass143_3.anInt4449);
					}
					local342.method3038(0);
					local378 = local342.anInt3400;
					local342.method3069(609);
					local342.method3060(Static15.anInt836);
					local342.method3060(Static155.method3122());
					local342.method3038(Static290.anInt6867);
					local342.method3038(Static90.anInt2326);
					local342.method3060(Static89.aClass1_Sub28_Sub1_1.anInt4890);
					Static355.method1737(local342);
					local342.method3061(Static120.aString18);
					local342.method3069(Static143.anInt3316);
					@Pc(427) Class1_Sub13 local427 = new Class1_Sub13(Static81.method2029());
					Static89.aClass1_Sub28_Sub1_1.method4263(local427);
					local342.method3060(local427.anInt3400);
					local342.method3041(local427.aByteArray45, local427.anInt3400);
					Static521.aBoolean614 = true;
					@Pc(452) Class1_Sub13 local452 = new Class1_Sub13(Static410.method6140());
					(new Class1_Sub46(true, Static91.aClass182_2)).method6819(local452);
					local342.method3041(local452.aByteArray45, local452.aByteArray45.length);
					local342.method3038(Static242.anInt1986);
					Static57.method1559();
					local342.method3041(local258.aByteArray45, local258.anInt3400);
					local342.method3020(local342.anInt3400 - local378);
				} else {
					local342.method3060(Static203.aClass143_6.anInt4449);
					local342.method3038(0);
					local378 = local342.anInt3400;
					local342.method3069(609);
					local342.method3060(Static538.aClass37_4.anInt1407);
					local342.method3060(Static315.anInt5993);
					Static355.method1737(local342);
					local342.method3061(Static120.aString18);
					local342.method3069(Static143.anInt3316);
					Static57.method1559();
					local342.method3041(local258.aByteArray45, local258.anInt3400);
					local342.method3020(local342.anInt3400 - local378);
				}
				Static453.aClass154_1.method4023(local342.anInt3400, local342.aByteArray45);
				local342.method3089(local261);
				for (local378 = 0; local378 < 4; local378++) {
					local261[local378] += 50;
				}
				Static255.aClass1_Sub13_Sub2_2.method3089(local261);
				Static546.anInt9466 = 5;
			}
			if (Static546.anInt9466 == 5) {
				if (!Static453.aClass154_1.method4019(1)) {
					return;
				}
				Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
				local210 = Static255.aClass1_Sub13_Sub2_2.aByteArray45[0] & 0xFF;
				if (local210 == 21) {
					Static546.anInt9466 = 8;
				} else if (local210 == 29) {
					Static546.anInt9466 = 14;
				} else if (local210 == 1) {
					Static546.anInt9466 = 6;
					Static110.method2414(local210);
					return;
				} else if (local210 == 2) {
					Static546.anInt9466 = 9;
				} else if (local210 == 15) {
					Static546.anInt9466 = 15;
					Static45.anInt1403 = -2;
				} else if (local210 == 23 && Static138.anInt9428 < 1) {
					Static547.anInt9476 = 0;
					Static546.anInt9466 = 1;
					Static138.anInt9428++;
					Static453.aClass154_1.method4020();
					Static453.aClass154_1 = null;
					return;
				} else {
					Static546.anInt9466 = 0;
					Static110.method2414(local210);
					Static453.aClass154_1.method4020();
					Static453.aClass154_1 = null;
					Static430.method6344();
					return;
				}
			}
			if (Static546.anInt9466 == 7) {
				Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
				Static192.aClass1_Sub13_Sub2_1.method3083(Static203.aClass143_13.anInt4449);
				Static453.aClass154_1.method4023(Static192.aClass1_Sub13_Sub2_1.anInt3400, Static192.aClass1_Sub13_Sub2_1.aByteArray45);
				Static546.anInt9466 = 5;
			} else if (Static546.anInt9466 == 8) {
				if (Static453.aClass154_1.method4019(1)) {
					Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
					local210 = Static255.aClass1_Sub13_Sub2_2.aByteArray45[0] & 0xFF;
					Static546.anInt9466 = 0;
					Static357.anInt6477 = (local210 + 3) * 60;
					Static110.method2414(21);
					Static453.aClass154_1.method4020();
					Static453.aClass154_1 = null;
					Static430.method6344();
				}
			} else if (Static546.anInt9466 == 14) {
				if (Static453.aClass154_1.method4019(1)) {
					Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
					Static106.anInt2476 = Static255.aClass1_Sub13_Sub2_2.aByteArray45[0] & 0xFF;
					Static546.anInt9466 = 0;
					Static110.method2414(29);
					Static453.aClass154_1.method4020();
					Static453.aClass154_1 = null;
					Static430.method6344();
				}
			} else if (Static546.anInt9466 != 9) {
				@Pc(833) Class1_Sub13_Sub2 local833;
				if (Static546.anInt9466 == 10) {
					if (Static41.anInt1359 == 3) {
						Static122.aBoolean190 = true;
					} else {
						Static122.aBoolean190 = false;
					}
					local833 = Static255.aClass1_Sub13_Sub2_2;
					if (Static41.anInt1359 == 2 || Static41.anInt1359 == 3) {
						if (!Static453.aClass154_1.method4019(Static396.anInt6909)) {
							return;
						}
						Static453.aClass154_1.method4022(Static396.anInt6909, local833.aByteArray45, 0);
						local833.anInt3400 = 0;
						Static351.anInt6430 = local833.method3043();
						Static160.anInt3513 = local833.method3043();
						Static320.aBoolean413 = local833.method3043() == 1;
						Static258.aBoolean339 = local833.method3043() == 1;
						Static170.aBoolean234 = local833.method3043() == 1;
						Static231.aBoolean483 = local833.method3043() == 1;
						Static150.anInt3353 = local833.method3056();
						Static341.aBoolean425 = local833.method3043() == 1;
						Static154.anInt3465 = local833.method3040();
						Static163.aBoolean222 = local833.method3043() == 1;
						if (Static41.anInt1359 == 3) {
							@Pc(950) boolean local950 = local833.method3043() == 1;
							if (local950) {
								@Pc(956) long local956 = local833.method3015();
								@Pc(960) String local960 = Static433.method6988(local956);
								@Pc(964) int local964 = local833.method3043();
								@Pc(967) byte[] local967 = new byte[local964];
								local833.method3088(local967, local964);
								@Pc(977) String local977 = Static75.method1966(local967);
								@Pc(979) Class116 local979 = null;
								try {
									@Pc(985) Class243 local985 = Static91.aClass182_2.method4814("3", false);
									while (local985.anInt6905 == 0) {
										Static505.method7295(1L);
									}
									if (local985.anInt6905 == 1) {
										local979 = (Class116) local985.anObject12;
										@Pc(1018) int local1018 = local960.length() + local977.length() + 4 + 3 + 2 + 2;
										if (local1018 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(1034) Class1_Sub13 local1034 = new Class1_Sub13(local1018 + 1);
										local1034.method3060(local1018);
										local1034.method3060(1);
										local1034.method3030(local960);
										local1034.method3030(local977);
										local1034.method3038(Static143.anInt3316);
										local1034.method3081();
										local979.method3368(local1034.aByteArray45, local1034.anInt3400, 0);
									}
								} catch (@Pc(1068) Exception local1068) {
								}
								try {
									if (local979 != null) {
										local979.method3371();
									}
								} catch (@Pc(1077) Exception local1077) {
								}
								try {
									Static554.method4839(Static91.aClass182_2.anApplet1, "demoaccountcreated");
								} catch (@Pc(1085) Throwable local1085) {
								}
							}
						}
						Static365.aClass194_6.method5074(Static163.aBoolean222);
						Static454.aClass153_2.method4000(Static163.aBoolean222);
						Static345.aClass222_1.method5586(Static163.aBoolean222);
					} else if (Static453.aClass154_1.method4019(Static396.anInt6909)) {
						Static453.aClass154_1.method4022(Static396.anInt6909, local833.aByteArray45, 0);
						local833.anInt3400 = 0;
						Static351.anInt6430 = local833.method3043();
						Static160.anInt3513 = local833.method3043();
						Static320.aBoolean413 = local833.method3043() == 1;
						Static258.aBoolean339 = local833.method3043() == 1;
						Static170.aBoolean234 = local833.method3043() == 1;
						Static343.anInt6398 = local833.method3056();
						Static341.aBoolean425 = Static343.anInt6398 > 0;
						Static443.anInt7506 = local833.method3056();
						Static534.anInt9240 = local833.method3056();
						Static140.anInt3287 = local833.method3056();
						Static9.anInt115 = local833.method3037();
						Static410.aClass243_7 = Static91.aClass182_2.method4819(Static9.anInt115);
						Static183.anInt3919 = local833.method3043();
						Static61.anInt1713 = local833.method3056();
						Static126.anInt3036 = local833.method3056();
						Static297.aBoolean394 = local833.method3043() == 1;
						Static16.aClass47_Sub2_Sub3_Sub2_1.aString36 = Static16.aClass47_Sub2_Sub3_Sub2_1.aString37 = local833.method3050();
						Static36.aClass130_1 = new Class130();
						Static36.aClass130_1.anInt4072 = local833.method3056();
						if (Static36.aClass130_1.anInt4072 == 65535) {
							Static36.aClass130_1.anInt4072 = -1;
						}
						Static36.aClass130_1.aString26 = local833.method3050();
						if (Static359.aClass199_13 != Static363.aClass199_14) {
							Static36.aClass130_1.anInt4074 = Static36.aClass130_1.anInt4072 + 50000;
							Static36.aClass130_1.anInt4073 = Static36.aClass130_1.anInt4072 + 40000;
						}
						if (Static363.aClass199_14 != Static544.aClass199_15 && (Static153.aClass130_5.method3631(aClass130_7) || Static153.aClass130_5.method3631(Static422.aClass130_8))) {
							Static362.method5648();
						}
					} else {
						return;
					}
					if (Static320.aBoolean413 && !Static170.aBoolean234 || Static341.aBoolean425) {
						try {
							Static554.method4839(Static91.aClass182_2.anApplet1, "zap");
						} catch (@Pc(1291) Throwable local1291) {
							if (Static290.aBoolean461) {
								try {
									Static91.aClass182_2.anApplet1.getAppletContext().showDocument(new URL(Static91.aClass182_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1307) Exception local1307) {
								}
							}
						}
					} else {
						try {
							Static554.method4839(Static91.aClass182_2.anApplet1, "unzap");
						} catch (@Pc(1316) Throwable local1316) {
						}
					}
					if (Static363.aClass199_14 == Static359.aClass199_13) {
						try {
							Static554.method4839(Static91.aClass182_2.anApplet1, "loggedin");
						} catch (@Pc(1328) Throwable local1328) {
						}
					}
					if (Static41.anInt1359 != 2 && Static41.anInt1359 != 3) {
						Static546.anInt9466 = 0;
						Static110.method2414(2);
						Static184.method3502();
						Static265.method4401(6);
						Static304.aClass6_92 = null;
						return;
					}
					Static546.anInt9466 = 12;
				}
				if (Static546.anInt9466 == 12) {
					if (!Static453.aClass154_1.method4019(3)) {
						return;
					}
					Static453.aClass154_1.method4022(3, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
					Static546.anInt9466 = 13;
				}
				if (Static546.anInt9466 == 13) {
					local833 = Static255.aClass1_Sub13_Sub2_2;
					local833.anInt3400 = 0;
					if (local833.method3085()) {
						if (!Static453.aClass154_1.method4019(1)) {
							return;
						}
						Static453.aClass154_1.method4022(1, local833.aByteArray45, 3);
					}
					Static304.aClass6_92 = Static33.method1302()[local833.method3092()];
					Static45.anInt1403 = local833.method3056();
					Static546.anInt9466 = 11;
				}
				if (Static546.anInt9466 == 11) {
					if (Static453.aClass154_1.method4019(Static45.anInt1403)) {
						Static453.aClass154_1.method4022(Static45.anInt1403, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
						Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
						Static546.anInt9466 = 0;
						local210 = Static45.anInt1403;
						Static110.method2414(2);
						Static385.method6074();
						Static289.method4884(Static255.aClass1_Sub13_Sub2_2);
						Static184.anInt3932 = -1;
						Static125.method2767();
						if (Static255.aClass1_Sub13_Sub2_2.anInt3400 != local210) {
							throw new RuntimeException("lswp pos:" + Static255.aClass1_Sub13_Sub2_2.anInt3400 + " psize:" + local210);
						}
						Static304.aClass6_92 = null;
					}
				} else if (Static546.anInt9466 == 15) {
					if (Static45.anInt1403 == -2) {
						if (!Static453.aClass154_1.method4019(2)) {
							return;
						}
						Static453.aClass154_1.method4022(2, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
						Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
						Static45.anInt1403 = Static255.aClass1_Sub13_Sub2_2.method3056();
					}
					if (Static453.aClass154_1.method4019(Static45.anInt1403)) {
						Static453.aClass154_1.method4022(Static45.anInt1403, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
						Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
						local210 = Static45.anInt1403;
						Static546.anInt9466 = 0;
						Static110.method2414(15);
						Static288.method4855();
						Static289.method4884(Static255.aClass1_Sub13_Sub2_2);
						if (Static255.aClass1_Sub13_Sub2_2.anInt3400 != local210) {
							throw new RuntimeException("lswpr pos:" + Static255.aClass1_Sub13_Sub2_2.anInt3400 + " psize:" + local210);
						}
						Static304.aClass6_92 = null;
					}
				}
			} else if (Static453.aClass154_1.method4019(1)) {
				Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
				Static546.anInt9466 = 10;
				Static396.anInt6909 = Static255.aClass1_Sub13_Sub2_2.aByteArray45[0] & 0xFF;
			}
		} catch (@Pc(1563) IOException local1563) {
			if (Static453.aClass154_1 != null) {
				Static453.aClass154_1.method4020();
				Static453.aClass154_1 = null;
			}
			if (Static138.anInt9428 >= 1) {
				Static546.anInt9466 = 0;
				Static110.method2414(-4);
				Static430.method6344();
			} else {
				Static547.anInt9476 = 0;
				if (Static41.anInt1359 == 2 || Static41.anInt1359 == 3) {
					Static153.aClass130_5.aBoolean248 = !Static153.aClass130_5.aBoolean248;
				} else {
					Static269.aClass130_6.aBoolean248 = !Static269.aClass130_6.aBoolean248;
				}
				Static546.anInt9466 = 1;
				Static138.anInt9428++;
			}
		}
	}
}
