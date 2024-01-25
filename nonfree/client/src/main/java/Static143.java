import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[5];

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public static final int anInt1880 = 1400;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	public static void method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass7_Sub4_2 != null) {
			local7.aClass7_Sub4_2 = null;
		}
		if (local7.aClass7_Sub4_1 != null) {
			local7.aClass7_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
	public static void method1464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) Class3_Sub12 local8 = (Class3_Sub12) Static17.aClass243_1.method5208(); local8 != null; local8 = (Class3_Sub12) Static17.aClass243_1.method5203()) {
			Static326.method4409(local8, arg3, arg2, arg1, arg0);
		}
		for (@Pc(35) Class3_Sub12 local35 = (Class3_Sub12) Static54.aClass243_11.method5208(); local35 != null; local35 = (Class3_Sub12) Static54.aClass243_11.method5203()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class1 local44 = local35.aClass7_Sub2_Sub3_Sub1_1.method3514();
			if (local35.aClass7_Sub2_Sub3_Sub1_1.aBoolean378) {
				local39 = 0;
			} else if (local44.anInt14 == local35.aClass7_Sub2_Sub3_Sub1_1.anInt4389 || local44.anInt48 == local35.aClass7_Sub2_Sub3_Sub1_1.anInt4389 || local35.aClass7_Sub2_Sub3_Sub1_1.anInt4389 == local44.anInt45 || local44.anInt43 == local35.aClass7_Sub2_Sub3_Sub1_1.anInt4389) {
				local39 = 2;
			} else if (local44.anInt11 == local35.aClass7_Sub2_Sub3_Sub1_1.anInt4389 || local44.anInt9 == local35.aClass7_Sub2_Sub3_Sub1_1.anInt4389 || local44.anInt32 == local35.aClass7_Sub2_Sub3_Sub1_1.anInt4389 || local44.anInt20 == local35.aClass7_Sub2_Sub3_Sub1_1.anInt4389) {
				local39 = 3;
			}
			if (local39 != local35.anInt2116) {
				@Pc(123) int local123 = Static265.method3845(local35.aClass7_Sub2_Sub3_Sub1_1);
				if (local123 != local35.anInt2118) {
					if (local35.aClass3_Sub5_Sub2_1 != null) {
						Static331.aClass3_Sub5_Sub1_42.method886(local35.aClass3_Sub5_Sub2_1);
						local35.aClass3_Sub5_Sub2_1 = null;
					}
					local35.anInt2118 = local123;
				}
				local35.anInt2116 = local39;
			}
			local35.anInt2117 = local35.aClass7_Sub2_Sub3_Sub1_1.anInt4318;
			local35.anInt2114 = local35.aClass7_Sub2_Sub3_Sub1_1.anInt4318 + (local35.aClass7_Sub2_Sub3_Sub1_1.method3499() << 6);
			local35.anInt2125 = local35.aClass7_Sub2_Sub3_Sub1_1.anInt4321;
			local35.anInt2126 = local35.aClass7_Sub2_Sub3_Sub1_1.anInt4321 + (local35.aClass7_Sub2_Sub3_Sub1_1.method3499() << 6);
			Static326.method4409(local35, arg3, arg2, arg1, arg0);
		}
		for (@Pc(209) Class3_Sub12 local209 = (Class3_Sub12) Static272.aClass11_36.method313(); local209 != null; local209 = (Class3_Sub12) Static272.aClass11_36.method316()) {
			@Pc(213) byte local213 = 1;
			@Pc(218) Class1 local218 = local209.aClass7_Sub2_Sub3_Sub2_1.method3514();
			if (local209.aClass7_Sub2_Sub3_Sub2_1.aBoolean378) {
				local213 = 0;
			} else if (local209.aClass7_Sub2_Sub3_Sub2_1.anInt4389 == local218.anInt14 || local209.aClass7_Sub2_Sub3_Sub2_1.anInt4389 == local218.anInt48 || local209.aClass7_Sub2_Sub3_Sub2_1.anInt4389 == local218.anInt45 || local218.anInt43 == local209.aClass7_Sub2_Sub3_Sub2_1.anInt4389) {
				local213 = 2;
			} else if (local209.aClass7_Sub2_Sub3_Sub2_1.anInt4389 == local218.anInt11 || local218.anInt9 == local209.aClass7_Sub2_Sub3_Sub2_1.anInt4389 || local218.anInt32 == local209.aClass7_Sub2_Sub3_Sub2_1.anInt4389 || local218.anInt20 == local209.aClass7_Sub2_Sub3_Sub2_1.anInt4389) {
				local213 = 3;
			}
			if (local209.anInt2116 != local213) {
				@Pc(293) int local293 = Static108.method1847(local209.aClass7_Sub2_Sub3_Sub2_1);
				if (local209.anInt2118 != local293) {
					if (local209.aClass3_Sub5_Sub2_1 != null) {
						Static331.aClass3_Sub5_Sub1_42.method886(local209.aClass3_Sub5_Sub2_1);
						local209.aClass3_Sub5_Sub2_1 = null;
					}
					local209.anInt2118 = local293;
				}
				local209.anInt2116 = local213;
			}
			local209.anInt2117 = local209.aClass7_Sub2_Sub3_Sub2_1.anInt4318;
			local209.anInt2114 = local209.aClass7_Sub2_Sub3_Sub2_1.anInt4318 + (local209.aClass7_Sub2_Sub3_Sub2_1.method3499() << 6);
			local209.anInt2125 = local209.aClass7_Sub2_Sub3_Sub2_1.anInt4321;
			local209.anInt2126 = local209.aClass7_Sub2_Sub3_Sub2_1.anInt4321 + (local209.aClass7_Sub2_Sub3_Sub2_1.method3499() << 6);
			Static326.method4409(local209, arg3, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public static void method1465() {
		if (Static254.anInt4793 == 0 || Static254.anInt4793 == 5) {
			return;
		}
		try {
			if (++Static65.anInt1688 > 2000) {
				if (Static88.aClass251_2 != null) {
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
				}
				if (Static362.anInt6126 >= 1) {
					Static97.anInt2201 = -5;
					Static254.anInt4793 = 0;
					return;
				}
				Static362.anInt6126++;
				if (Static306.anInt5453 == Static417.anInt6845) {
					Static417.anInt6845 = Static219.anInt4144;
				} else {
					Static417.anInt6845 = Static306.anInt5453;
				}
				Static254.anInt4793 = 1;
				Static65.anInt1688 = 0;
			}
			if (Static254.anInt4793 == 1) {
				Static274.aClass43_8 = Static66.aClass143_2.method3390(Static417.anInt6845, Static452.aString67);
				Static254.anInt4793 = 2;
			}
			@Pc(111) int local111;
			if (Static254.anInt4793 == 2) {
				if (Static274.aClass43_8.anInt1521 == 2) {
					throw new IOException();
				}
				if (Static274.aClass43_8.anInt1521 != 1) {
					return;
				}
				Static88.aClass251_2 = new Class251((Socket) Static274.aClass43_8.anObject3, Static66.aClass143_2);
				Static274.aClass43_8 = null;
				@Pc(101) long local101 = Static455.aLong235 = Static14.method321(Static2.aString1);
				Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
				local111 = (int) (local101 >> 16 & 0x1FL);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static184.aClass187_1.anInt5402);
				Static302.aClass3_Sub7_Sub1_2.method2628(local111);
				Static88.aClass251_2.method5344(Static302.aClass3_Sub7_Sub1_2.aByteArray46, 2);
				Static349.method4648();
				@Pc(133) int local133 = Static88.aClass251_2.method5349();
				Static349.method4648();
				if (local133 != 0) {
					Static254.anInt4793 = 0;
					Static97.anInt2201 = local133;
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
					return;
				}
				Static254.anInt4793 = 3;
			}
			if (Static254.anInt4793 == 3) {
				if (Static88.aClass251_2.method5348() < 8) {
					return;
				}
				Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, 8);
				Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
				Static262.aLong148 = Static237.aClass3_Sub7_Sub1_1.method2610();
				@Pc(181) Class3_Sub7 local181 = new Class3_Sub7(70);
				@Pc(184) int[] local184 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static262.aLong148 >> 32), (int) Static262.aLong148 };
				local181.method2628(10);
				local181.method2636(local184[0]);
				local181.method2636(local184[1]);
				local181.method2636(local184[2]);
				local181.method2636(local184[3]);
				local181.method2603(Static14.method321(Static2.aString1));
				local181.method2608(Static276.aString46);
				local181.method2581(Static3.aBigInteger1, Static134.aBigInteger2);
				Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
				if (Static120.anInt2584 == 40) {
					Static302.aClass3_Sub7_Sub1_2.method2628(Static184.aClass187_5.anInt5402);
				} else {
					Static302.aClass3_Sub7_Sub1_2.method2628(Static184.aClass187_3.anInt5402);
				}
				Static302.aClass3_Sub7_Sub1_2.method2613(0);
				local111 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
				Static302.aClass3_Sub7_Sub1_2.method2636(590);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static5.anInt76);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static391.method5269());
				Static302.aClass3_Sub7_Sub1_2.method2613(Static333.anInt5712);
				Static302.aClass3_Sub7_Sub1_2.method2613(Static123.anInt2625);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static374.aClass20_Sub1_1.anInt2350);
				Static163.method4905(Static302.aClass3_Sub7_Sub1_2);
				Static302.aClass3_Sub7_Sub1_2.method2608(Static152.aString21);
				Static302.aClass3_Sub7_Sub1_2.method2636(Static17.anInt475);
				@Pc(321) Class3_Sub7 local321 = Static374.aClass20_Sub1_1.method1815();
				Static302.aClass3_Sub7_Sub1_2.method2628(local321.anInt3235);
				Static302.aClass3_Sub7_Sub1_2.method2595(local321.anInt3235, local321.aByteArray46);
				Static196.aBoolean336 = true;
				Static302.aClass3_Sub7_Sub1_2.method2613(Static2.anInt51);
				Static302.aClass3_Sub7_Sub1_2.method2636(Static305.aClass32_70.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static416.aClass32_83.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static13.aClass32_4.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static295.aClass32_67.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static69.aClass32_30.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static64.aClass32_28.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static149.aClass32_43.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static104.aClass32_35.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static405.aClass32_82.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static188.aClass32_46.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static38.aClass32_13.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static280.aClass32_65.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static46.aClass32_17.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static56.aClass32_26.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static9.aClass32_3.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static316.aClass32_71.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static172.aClass32_45.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static5.aClass32_1.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static333.aClass32_72.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static50.aClass32_20.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static14.aClass32_5.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static66.aClass32_29.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static71.aClass32_31.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static419.aClass32_84.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static141.aClass32_41.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static286.aClass32_23.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static99.aClass32_34.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static346.aClass32_76.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static246.aClass32_56.method806());
				Static302.aClass3_Sub7_Sub1_2.method2636(Static62.aClass32_27.method806());
				Static302.aClass3_Sub7_Sub1_2.method2595(local181.anInt3235, local181.aByteArray46);
				Static302.aClass3_Sub7_Sub1_2.method2618(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local111);
				Static88.aClass251_2.method5344(Static302.aClass3_Sub7_Sub1_2.aByteArray46, Static302.aClass3_Sub7_Sub1_2.anInt3235);
				Static302.aClass3_Sub7_Sub1_2.method1054(local184);
				for (@Pc(550) int local550 = 0; local550 < 4; local550++) {
					local184[local550] += 50;
				}
				Static237.aClass3_Sub7_Sub1_1.method1054(local184);
				Static254.anInt4793 = 4;
			}
			if (Static254.anInt4793 == 4) {
				if (Static88.aClass251_2.method5348() < 1) {
					return;
				}
				@Pc(584) int local584 = Static88.aClass251_2.method5349();
				if (local584 == 21) {
					Static254.anInt4793 = 7;
				} else if (local584 == 29) {
					Static254.anInt4793 = 11;
				} else if (local584 == 1) {
					Static97.anInt2201 = local584;
					Static254.anInt4793 = 5;
					return;
				} else if (local584 == 2) {
					Static254.anInt4793 = 8;
				} else if (local584 == 15) {
					Static139.anInt7585 = -2;
					Static254.anInt4793 = 12;
				} else if (local584 == 23 && Static362.anInt6126 < 1) {
					Static65.anInt1688 = 0;
					Static254.anInt4793 = 1;
					Static362.anInt6126++;
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
					return;
				} else {
					Static254.anInt4793 = 0;
					Static97.anInt2201 = local584;
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
					return;
				}
			}
			if (Static254.anInt4793 == 6) {
				Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
				Static302.aClass3_Sub7_Sub1_2.method1057(Static184.aClass187_4.anInt5402);
				Static88.aClass251_2.method5344(Static302.aClass3_Sub7_Sub1_2.aByteArray46, Static302.aClass3_Sub7_Sub1_2.anInt3235);
				Static254.anInt4793 = 4;
			} else if (Static254.anInt4793 == 7) {
				if (Static88.aClass251_2.method5348() >= 1) {
					Static80.anInt2007 = Static88.aClass251_2.method5349() * 60 + 180;
					Static254.anInt4793 = 0;
					Static97.anInt2201 = 21;
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
				}
			} else if (Static254.anInt4793 != 11) {
				if (Static254.anInt4793 == 8) {
					if (Static88.aClass251_2.method5348() < 13) {
						return;
					}
					Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, 13);
					Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
					Static190.anInt3803 = Static237.aClass3_Sub7_Sub1_1.method2582();
					Static301.anInt2464 = Static237.aClass3_Sub7_Sub1_1.method2582();
					Static388.aBoolean561 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
					Static331.aBoolean651 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
					Static283.aBoolean455 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
					Static338.aBoolean492 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
					Static319.anInt1936 = Static237.aClass3_Sub7_Sub1_1.method2588();
					Static17.aBoolean33 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
					Static187.aBoolean320 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
					Static435.aClass30_4.method768(Static187.aBoolean320);
					Static314.aClass12_2.method328(Static187.aBoolean320);
					Static364.aClass96_2.method2193(Static187.aBoolean320);
					if (Static388.aBoolean561 && !Static283.aBoolean455 || Static17.aBoolean33) {
						try {
							Static456.method852("zap", Static66.aClass143_2.anApplet1);
						} catch (@Pc(869) Throwable local869) {
							if (Static233.aBoolean386) {
								try {
									Static66.aClass143_2.anApplet1.getAppletContext().showDocument(new URL(Static66.aClass143_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(885) Exception local885) {
								}
							}
						}
					} else {
						try {
							Static456.method852("unzap", Static66.aClass143_2.anApplet1);
						} catch (@Pc(895) Throwable local895) {
						}
					}
					if (Static10.aClass182_1 == Static191.aClass182_6) {
						try {
							Static456.method852("loggedin", Static66.aClass143_2.anApplet1);
						} catch (@Pc(907) Throwable local907) {
						}
					}
					Static254.anInt4793 = 10;
				}
				if (Static254.anInt4793 == 10) {
					if (Static237.aClass3_Sub7_Sub1_1.method1060()) {
						if (Static88.aClass251_2.method5348() < 1) {
							return;
						}
						Static88.aClass251_2.method5346(Static237.aClass3_Sub7_Sub1_1.anInt3235 + 2, Static237.aClass3_Sub7_Sub1_1.aByteArray46, 1);
					}
					Static277.aClass119_110 = Static185.method2977()[Static237.aClass3_Sub7_Sub1_1.method1062()];
					Static139.anInt7585 = Static237.aClass3_Sub7_Sub1_1.method2588();
					Static254.anInt4793 = 9;
				}
				@Pc(977) int local977;
				if (Static254.anInt4793 == 9) {
					if (Static88.aClass251_2.method5348() >= Static139.anInt7585) {
						Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, Static139.anInt7585);
						Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
						Static97.anInt2201 = 2;
						Static254.anInt4793 = 0;
						local977 = Static139.anInt7585;
						Static40.method779();
						Static73.method1424(Static237.aClass3_Sub7_Sub1_1);
						Static373.anInt6270 = -1;
						Static413.method5297();
						if (Static237.aClass3_Sub7_Sub1_1.anInt3235 != local977) {
							throw new RuntimeException("lswp pos:" + Static237.aClass3_Sub7_Sub1_1.anInt3235 + " psize:" + local977);
						}
						Static277.aClass119_110 = null;
					}
				} else if (Static254.anInt4793 == 12) {
					if (Static139.anInt7585 == -2) {
						if (Static88.aClass251_2.method5348() < 2) {
							return;
						}
						Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, 2);
						Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
						Static139.anInt7585 = Static237.aClass3_Sub7_Sub1_1.method2588();
					}
					if (Static88.aClass251_2.method5348() >= Static139.anInt7585) {
						Static88.aClass251_2.method5346(0, Static237.aClass3_Sub7_Sub1_1.aByteArray46, Static139.anInt7585);
						Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
						Static97.anInt2201 = 15;
						Static254.anInt4793 = 0;
						local977 = Static139.anInt7585;
						Static48.method868();
						Static73.method1424(Static237.aClass3_Sub7_Sub1_1);
						if (local977 != Static237.aClass3_Sub7_Sub1_1.anInt3235) {
							throw new RuntimeException("lswpr pos:" + Static237.aClass3_Sub7_Sub1_1.anInt3235 + " psize:" + local977);
						}
						Static277.aClass119_110 = null;
					}
				}
			} else if (Static88.aClass251_2.method5348() >= 1) {
				Static124.anInt7629 = Static88.aClass251_2.method5349();
				Static254.anInt4793 = 0;
				Static97.anInt2201 = 29;
				Static88.aClass251_2.method5345();
				Static88.aClass251_2 = null;
			}
		} catch (@Pc(1096) IOException local1096) {
			if (Static88.aClass251_2 != null) {
				Static88.aClass251_2.method5345();
				Static88.aClass251_2 = null;
			}
			if (Static362.anInt6126 >= 1) {
				Static254.anInt4793 = 0;
				Static97.anInt2201 = -4;
			} else {
				Static362.anInt6126++;
				Static65.anInt1688 = 0;
				Static254.anInt4793 = 1;
				if (Static417.anInt6845 == Static306.anInt5453) {
					Static417.anInt6845 = Static219.anInt4144;
				} else {
					Static417.anInt6845 = Static306.anInt5453;
				}
			}
		}
	}
}
