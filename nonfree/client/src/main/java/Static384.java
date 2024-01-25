import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
	public static int anInt6406 = 0;

	@OriginalMember(owner = "client!mu", name = "F", descriptor = "Z")
	public static volatile boolean aBoolean449 = true;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!nh;")
	public static RuntimeException_Sub1 method5379(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString83 = local9.aString83 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZIZ[I[IIII[III[IIB[II[[[BI)V")
	public static void method5384(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int[] arg9, @OriginalArg(12) int arg10, @OriginalArg(13) byte arg11, @OriginalArg(14) int[] arg12, @OriginalArg(15) int arg13, @OriginalArg(16) byte[][][] arg14, @OriginalArg(17) int arg15) {
		if (Static471.anInt7481 == -1) {
			return;
		}
		@Pc(13) int[] local13 = Static565.aClass95_13.Y();
		@Pc(17) int local17 = local13[0];
		@Pc(21) int local21 = local13[1];
		@Pc(25) int local25 = local13[2];
		@Pc(29) int local29 = local13[3];
		@Pc(31) int local31 = local25;
		@Pc(33) int local33 = local29;
		if (Static471.anInt7481 == 1) {
			local31 = (int) ((double) local25 * (double) Static516.anInt8123 / (double) Static320.anInt5358);
			local33 = (int) ((double) local29 * (double) Static516.anInt8123 / (double) Static320.anInt5358);
		}
		if (!Static182.aBoolean246) {
			if (Static471.anInt7481 == 1) {
				Static167.method2648();
			}
			@Pc(73) int local73 = arg4 - Static677.anInt10938;
			@Pc(78) int local78 = arg15 - Static489.anInt7789;
			@Pc(83) int local83 = arg13 - Static140.anInt2653;
			@Pc(105) int local105 = (int) ((double) local31 * ((double) local83 * Static157.aDouble11 + (double) local73 * Static562.aDouble23 + (double) local78 * Static255.aDouble14) / (double) arg1);
			@Pc(127) int local127 = (int) (((double) local78 * Static667.aDouble26 + (double) local73 * Static90.aDouble1 + Static130.aDouble25 * (double) local83) * (double) local33 / (double) arg1);
			@Pc(142) double local142 = (double) local83 * Static558.aDouble22 + (double) local73 * Static235.aDouble13 + (double) local78 * Static300.aDouble16;
			@Pc(150) int local150 = Static521.anInt8228 + local105 - Static528.anInt8315;
			@Pc(158) int local158 = Static152.anInt10399 + local127 - Static542.anInt8447;
			@Pc(162) int local162 = Static8.anInt105 + local150;
			@Pc(166) int local166 = local158 + Static516.anInt8123;
			if (local150 >= 0 && local158 >= 0 && local162 <= Static233.anInt4125 && Static320.anInt5358 >= local166 || Static471.anInt7481 == 2) {
				if (Static471.anInt7481 == 2) {
					Static348.aDouble17 = -local142;
				}
				Static117.anInt2122 = local150;
				Static212.anInt3685 = local158;
			} else if (local162 > 0 && local166 > 0 && Static233.anInt4125 > local150 && local158 < Static320.anInt5358) {
				@Pc(230) int local230 = local150 - Static521.anInt8228;
				@Pc(234) int local234 = local158 - Static152.anInt10399;
				@Pc(236) int local236 = 0;
				@Pc(238) int local238 = 0;
				@Pc(240) int local240 = 0;
				@Pc(242) int local242 = 0;
				@Pc(244) double local244 = 0.0D;
				if (Static471.anInt7481 == 0) {
					local238 = local234;
					local236 = local230;
					local244 = Static348.aDouble17 + local142;
				} else if (Static471.anInt7481 == 1) {
					local240 = local230 / Static141.anInt2656;
					local242 = local234 / Static456.anInt7325;
					local236 = local240 * Static141.anInt2656;
					local238 = Static456.anInt7325 * local242;
					local244 = (Static348.aDouble17 + local142) * (double) (local238 * local234 + local236 * local230) / (double) (local234 * local234 + local230 * local230);
				}
				local244 = -local244;
				@Pc(302) int local302 = 0;
				@Pc(304) int local304 = 0;
				@Pc(306) int local306 = 0;
				@Pc(308) int local308 = 0;
				@Pc(310) int local310 = 0;
				@Pc(312) int local312 = 0;
				@Pc(323) int local323;
				@Pc(320) int local320;
				@Pc(316) int local316;
				@Pc(333) int local333;
				if (local236 < 0) {
					local316 = 0;
					local320 = Static233.anInt4125 + local236;
					local323 = -local236;
					if (Static471.anInt7481 == 1) {
						local306 = 0;
						local310 = -local240;
					}
					local333 = local323;
				} else {
					local320 = Static233.anInt4125 - local236;
					local323 = 0;
					if (Static471.anInt7481 == 1) {
						local306 = Static620.anInt10280 - local240;
						local310 = local240;
					}
					local316 = local320;
					local333 = local236;
				}
				@Pc(368) int local368;
				@Pc(372) int local372;
				@Pc(365) int local365;
				@Pc(374) int local374;
				@Pc(376) int local376;
				if (local238 < 0) {
					local365 = 0;
					local368 = -local238;
					local372 = Static320.anInt5358 + local238;
					local374 = local368;
					local376 = local368;
					if (Static471.anInt7481 == 1) {
						local302 = 0;
						local304 = -local242;
						local308 = local304;
						local312 = Static358.anInt6116 + local242;
					}
				} else {
					local372 = Static320.anInt5358 - local238;
					local368 = 0;
					local374 = local238;
					if (Static471.anInt7481 == 1) {
						local304 = local242;
						local308 = 0;
						local302 = Static358.anInt6116 - local242;
						local312 = local302;
					}
					local365 = local372;
					local376 = 0;
				}
				@Pc(424) Class317 local424 = Static185.aClass255_1.aClass317_7;
				@Pc(438) int local438;
				for (@Pc(429) Class34_Sub8 local429 = (Class34_Sub8) local424.method6891(); local429 != null; local429 = (Class34_Sub8) local424.method6894()) {
					@Pc(434) Class34_Sub6[] local434 = local429.aClass34_Sub6Array1;
					@Pc(436) boolean local436 = true;
					for (local438 = 0; local438 < local434.length; local438++) {
						@Pc(444) Class34_Sub6 local444 = local434[local438];
						@Pc(447) int local447 = local444.anInt4989;
						@Pc(450) int local450 = local444.anInt4988;
						@Pc(453) int local453 = local444.anInt4990;
						@Pc(456) int local456 = local444.anInt4991;
						@Pc(463) int local463;
						local444.anInt4988 = local463 = local450 - local238;
						@Pc(467) int local467 = local444.anInt4992;
						@Pc(474) int local474;
						local444.anInt4990 = local474 = local453 - local236;
						@Pc(482) int local482;
						local444.anInt4991 = local482 = local456 - local238;
						@Pc(489) int local489;
						local444.anInt4989 = local489 = local447 - local236;
						if (local436) {
							@Pc(502) int local502 = (local489 < local474 ? local489 : local474) - local467;
							if (local502 <= Static233.anInt4125) {
								@Pc(519) int local519 = (local482 > local463 ? local463 : local482) - local467;
								if (local519 <= Static320.anInt5358) {
									@Pc(539) int local539 = local467 + (local489 < local474 ? local474 : local489);
									if (local539 >= 0) {
										@Pc(553) int local553 = local467 + (local463 >= local482 ? local463 : local482);
										if (local553 >= 0) {
											local436 = false;
										}
									}
								}
							}
						}
					}
					if (local436) {
						local429.method8764();
						Static363.method8905(local429);
					}
				}
				if (Static471.anInt7481 == 0) {
					Static565.aClass95_13.method8072(Static491.anInterface10_1);
				}
				Static565.aClass95_13.F(-local236, -local238);
				Static565.aClass95_13.b(local323, local368, local320, local372, local244);
				Static596.method5959(Static348.aDouble17 + local244);
				Static267.aDouble15 = local244 + Static348.aDouble17;
				if (Static471.anInt7481 == 1) {
					Static277.anInt4720 = local21 - Static542.anInt8447 - local238;
					Static24.anInt593 = local31;
					Static657.anInt10717 = local17 - Static528.anInt8315 - local236;
					Static150.anInt2796 = local33;
					Static565.aClass95_13.DA(Static657.anInt10717, Static277.anInt4720, Static24.anInt593, Static150.anInt2796);
				} else {
					Static657.anInt10717 = Static521.anInt8228 + local17 - local236 - Static528.anInt8315;
					Static277.anInt4720 = local21 + Static152.anInt10399 - Static542.anInt8447 - local238;
					Static150.anInt2796 = local33;
					Static24.anInt593 = local31;
					Static565.aClass95_13.DA(Static657.anInt10717, Static277.anInt4720, Static24.anInt593, Static150.anInt2796);
				}
				Static274.method4029(Static185.aClass255_1);
				if (local374 > 0) {
					Static565.aClass95_13.KA(0, local365, Static233.anInt4125, local365 + local374);
					Static565.aClass95_13.ya();
					Static565.aClass95_13.GA(Static374.anInt6314);
					Static642.method8648(arg10, arg4, arg15, arg13, arg14, arg9, arg2, arg12, arg7, arg3, arg8, arg11, arg6, arg5, arg0, arg1, 1, false);
				}
				if (local333 > 0) {
					Static565.aClass95_13.KA(local316, local376, local316 + local333, local372 + local376);
					Static565.aClass95_13.ya();
					Static565.aClass95_13.GA(Static374.anInt6314);
					Static642.method8648(arg10, arg4, arg15, arg13, arg14, arg9, arg2, arg12, arg7, arg3, arg8, arg11, arg6, arg5, arg0, arg1, 1, false);
				}
				Static565.aClass95_13.la();
				Static108.method1707();
				if (Static471.anInt7481 == 0) {
					Static565.aClass95_13.method8042();
				}
				Static528.anInt8315 += local236;
				Static542.anInt8447 += local238;
				Static348.aDouble17 += local244;
				Static212.anInt3685 = Static152.anInt10399 + local127 - Static542.anInt8447;
				Static117.anInt2122 = Static521.anInt8228 + local105 - Static528.anInt8315;
				if (Static471.anInt7481 == 1) {
					Static342.anInt5876 += local240;
					Static521.anInt8234 += local242;
					for (@Pc(792) int local792 = 0; local792 < Static358.anInt6116; local792++) {
						@Pc(803) int local803 = Static13.method352(Static521.anInt8234 + local792, Static358.anInt6116) * Static620.anInt10280;
						for (local438 = 0; local438 < Static620.anInt10280; local438++) {
							@Pc(819) int local819 = local803 + Static13.method352(Static342.anInt5876 + local438, Static620.anInt10280);
							@Pc(855) boolean local855 = local302 <= local792 && local304 + local302 > local792 || local792 >= local308 && local792 < local308 + local312 && local438 >= local306 && local306 + local310 > local438;
							Static354.anInterface10Array1[local819].method8745(Static141.anInt2656 * local438, local792 * Static456.anInt7325, Static141.anInt2656, Static456.anInt7325, local855);
						}
					}
				}
			} else {
				Static182.aBoolean246 = true;
			}
		}
		if (Static182.aBoolean246) {
			Static542.anInt8447 = 0;
			Static348.aDouble17 = 0.0D;
			Static677.anInt10938 = arg4;
			Static117.anInt2122 = Static521.anInt8228;
			Static489.anInt7789 = arg15;
			Static140.anInt2653 = arg13;
			Static528.anInt8315 = 0;
			Static212.anInt3685 = Static152.anInt10399;
			if (Static471.anInt7481 == 0) {
				Static565.aClass95_13.method8072(Static491.anInterface10_1);
			}
			Static565.aClass95_13.la();
			Static565.aClass95_13.ya();
			Static565.aClass95_13.GA(Static374.anInt6314);
			Static457.aClass17_6.method6240(Static677.anInt10938, Static489.anInt7789, Static140.anInt2653, Static212.anInt3677, Static111.anInt2049, Static276.anInt4714);
			Static565.aClass95_13.method8037(Static457.aClass17_6);
			if (Static471.anInt7481 == 1) {
				Static657.anInt10717 = local17;
				Static150.anInt2796 = local33;
				Static277.anInt4720 = local21;
				Static24.anInt593 = local31;
				Static565.aClass95_13.DA(Static657.anInt10717, Static277.anInt4720, Static24.anInt593, Static150.anInt2796);
			} else {
				Static657.anInt10717 = local17 + Static521.anInt8228;
				Static150.anInt2796 = local33;
				Static24.anInt593 = local31;
				Static277.anInt4720 = local21 + Static152.anInt10399;
				Static565.aClass95_13.DA(Static657.anInt10717, Static277.anInt4720, Static24.anInt593, Static150.anInt2796);
			}
			Static267.aDouble15 = 0.0D;
			Static185.aClass255_1.method5616();
			Static274.method4029(Static185.aClass255_1);
			Static642.method8648(arg10, arg4, arg15, arg13, arg14, arg9, arg2, arg12, arg7, arg3, arg8, arg11, arg6, arg5, arg0, arg1, 1, false);
			Static108.method1707();
			Static182.aBoolean246 = false;
			if (Static471.anInt7481 == 0) {
				Static565.aClass95_13.method8042();
			}
			if (Static471.anInt7481 == 1) {
				Static637.method1838();
			}
		}
		if (Static471.anInt7481 == 0) {
			Static491.anInterface10_1.method8746(Static117.anInt2122, Static212.anInt3685, Static8.anInt105, Static516.anInt8123, 0, 0);
		}
		Static170.anInt3112++;
		Static596.method5959(Static348.aDouble17);
		Static518.aDouble20 = Static348.aDouble17;
		if (Static471.anInt7481 == 0 || Static471.anInt7481 == 2) {
			if (Static471.anInt7481 == 2) {
				Static565.aClass95_13.GA(Static374.anInt6314);
				Static565.aClass95_13.ya();
			}
			Static376.anInt5866 = local31;
			Static75.anInt1479 = local17 + Static521.anInt8228 - Static528.anInt8315 - Static117.anInt2122;
			Static156.anInt2884 = local33;
			Static159.anInt2971 = local21 + Static152.anInt10399 - Static542.anInt8447 - Static212.anInt3685;
			Static565.aClass95_13.DA(Static75.anInt1479, Static159.anInt2971, Static376.anInt5866, Static156.anInt2884);
		} else if (Static471.anInt7481 == 1) {
			Static75.anInt1479 = local17 - Static528.anInt8315;
			Static159.anInt2971 = local21 - Static542.anInt8447;
			Static376.anInt5866 = local31;
			Static156.anInt2884 = local33;
			Static565.aClass95_13.DA(Static75.anInt1479, Static159.anInt2971, Static376.anInt5866, Static156.anInt2884);
			Static565.aClass95_13.KA(Static117.anInt2122, Static212.anInt3685, Static117.anInt2122 + Static8.anInt105, Static212.anInt3685 + Static516.anInt8123);
		}
		Static642.method8648(arg10, arg4, arg15, arg13, arg14, arg9, arg2, arg12, arg7, arg3, arg8, arg11, arg6, arg5, arg0, arg1, Static471.anInt7481 == 2 ? 0 : 2, Static471.anInt7481 == 1);
		Static565.aClass95_13.la();
		Static565.aClass95_13.DA(local17, local21, local25, local29);
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)Lclient!rd;")
	public static Class3_Sub41 method5387() {
		@Pc(7) Class312 local7 = null;
		@Pc(18) Class3_Sub41 local18 = new Class3_Sub41(Static227.aClass203_4, 0);
		try {
			@Pc(24) Class338 local24 = Static566.aClass92_6.method1880("");
			while (local24.anInt9321 == 0) {
				Static26.method592(1L);
			}
			if (local24.anInt9321 == 1) {
				local7 = (Class312) local24.anObject18;
				@Pc(46) byte[] local46 = new byte[(int) local7.method6844()];
				@Pc(61) int local61;
				for (@Pc(48) int local48 = 0; local48 < local46.length; local48 += local61) {
					local61 = local7.method6839(local46.length - local48, local48, local46);
					if (local61 == -1) {
						throw new IOException("EOF");
					}
				}
				local18 = new Class3_Sub41(new Class3_Sub4(local46), Static227.aClass203_4, 0);
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local7 != null) {
				local7.method6838();
			}
		} catch (@Pc(96) Exception local96) {
		}
		return local18;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIB)I")
	public static int method5388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static306.anInt5140 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static671.anInt9357;
		@Pc(26) int local26 = arg0 - Static671.anInt9358;
		for (@Pc(31) Class3_Sub46 local31 = (Class3_Sub46) Static671.aClass302_68.method6603(); local31 != null; local31 = (Class3_Sub46) Static671.aClass302_68.method6605()) {
			if (local31.anInt9112 == arg1) {
				@Pc(40) int local40 = local31.anInt9116;
				@Pc(43) int local43 = local31.anInt9118;
				@Pc(54) int local54 = Static671.anInt9357 + local40 << 14 | local43 + Static671.anInt9358;
				@Pc(75) int local75 = (local21 - local40) * (-local40 + local21) + (local26 - local43) * (-local43 + local26);
				if (local14 < 0 || local75 < local16) {
					local14 = local54;
					local16 = local75;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!lf;Ljava/lang/String;II)Lclient!ie;")
	public static Class160 method5389(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static456.anIntArray399, 0);
		if (Static456.anIntArray399[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class160(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
