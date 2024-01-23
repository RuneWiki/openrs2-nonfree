import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	public static int anInt3348;

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "[I")
	public static int[] anIntArray270 = new int[500];

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "[Lclient!ik;")
	public static Class85[] aClass85Array1 = new Class85[50];

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	public static void method2690() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (Static117.anInt2306 == 34) {
			local12 = Static237.aClass1_Sub14_Sub1_7.method2593();
			local16 = Static237.aClass1_Sub14_Sub1_7.method2595();
			Static189.method3080(local12).method1008(local16);
			return;
		}
		@Pc(45) int local45;
		@Pc(41) int local41;
		@Pc(49) int local49;
		@Pc(64) int local64;
		@Pc(55) int local55;
		if (Static117.anInt2306 == 91) {
			local12 = Static237.aClass1_Sub14_Sub1_7.method2595();
			local16 = local12 >> 2;
			local41 = Static15.anIntArray21[local16];
			local45 = local12 & 0x3;
			local49 = Static237.aClass1_Sub14_Sub1_7.method2627();
			local55 = Static5.anInt68 + (local49 & 0x7);
			local64 = Static146.anInt2885 + (local49 >> 4 & 0x7);
			if (local64 >= 0 && local55 >= 0 && local64 < 104 && local55 < 104) {
				Static271.method4005(local64, local16, local41, local55, -1, 0, local45, Static295.anInt5586, -1);
			}
			return;
		}
		@Pc(134) int local134;
		if (Static117.anInt2306 == 118) {
			local12 = Static237.aClass1_Sub14_Sub1_7.method2627();
			local45 = local12 & 0x3;
			local16 = local12 >> 2;
			local41 = Static15.anIntArray21[local16];
			local49 = Static237.aClass1_Sub14_Sub1_7.method2626();
			if (local49 == 65535) {
				local49 = -1;
			}
			local64 = Static237.aClass1_Sub14_Sub1_7.method2627();
			local134 = (local64 & 0x7) + Static5.anInt68;
			local55 = Static146.anInt2885 + (local64 >> 4 & 0x7);
			Static250.method2601(local55, local45, Static295.anInt5586, local41, local134, local49, local16);
		} else if (Static117.anInt2306 == 189) {
			local12 = Static237.aClass1_Sub14_Sub1_7.method2596();
			local16 = Static146.anInt2885 + (local12 >> 4 & 0x7);
			local45 = Static5.anInt68 + (local12 & 0x7);
			local41 = Static237.aClass1_Sub14_Sub1_7.method2638();
			local49 = Static237.aClass1_Sub14_Sub1_7.method2638();
			if (local16 >= 0 && local45 >= 0 && local16 < 104 && local45 < 104) {
				@Pc(202) Class22_Sub2 local202 = new Class22_Sub2();
				local202.anInt543 = local41;
				local202.anInt536 = local49;
				if (Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45] == null) {
					Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45] = new Class24();
				}
				Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45].method473(new Class1_Sub1_Sub18(local202));
				Static24.method458(local45, local16);
			}
		} else {
			@Pc(305) int local305;
			@Pc(313) int local313;
			@Pc(299) int local299;
			@Pc(309) int local309;
			@Pc(317) int local317;
			if (Static117.anInt2306 == 186) {
				local12 = Static237.aClass1_Sub14_Sub1_7.method2595();
				local16 = Static146.anInt2885 * 2 + (local12 >> 4 & 0xF);
				local45 = Static5.anInt68 * 2 + (local12 & 0xF);
				local41 = Static237.aClass1_Sub14_Sub1_7.method2598() + local16;
				local49 = Static237.aClass1_Sub14_Sub1_7.method2598() + local45;
				local64 = Static237.aClass1_Sub14_Sub1_7.method2623();
				local55 = Static237.aClass1_Sub14_Sub1_7.method2623();
				local134 = Static237.aClass1_Sub14_Sub1_7.method2593();
				local299 = Static237.aClass1_Sub14_Sub1_7.method2598();
				local305 = Static237.aClass1_Sub14_Sub1_7.method2595() * 4;
				local309 = Static237.aClass1_Sub14_Sub1_7.method2593();
				local313 = Static237.aClass1_Sub14_Sub1_7.method2593();
				local317 = Static237.aClass1_Sub14_Sub1_7.method2595();
				@Pc(321) int local321 = Static237.aClass1_Sub14_Sub1_7.method2595();
				if (local317 == 255) {
					local317 = -1;
				}
				if (local16 >= 0 && local45 >= 0 && local16 < 208 && local45 < 208 && local41 >= 0 && local49 >= 0 && local41 < 208 && local49 < 208 && local134 != 65535) {
					local49 = local49 * 64;
					local45 = local45 * 64;
					local41 *= 64;
					local16 *= 64;
					if (local64 != 0) {
						@Pc(417) int local417;
						@Pc(405) Class22_Sub3 local405;
						@Pc(392) int local392;
						@Pc(396) int local396;
						if (local64 < 0) {
							local392 = -local64 - 1;
							local396 = local392 & 0x7FF;
							if (local396 == Static117.anInt2308) {
								local405 = Static229.aClass22_Sub3_Sub2_2;
							} else {
								local405 = Static195.aClass22_Sub3_Sub2Array1[local396];
							}
							local417 = local392 >> 11 & 0xF;
						} else {
							local392 = local64 - 1;
							local396 = local392 & 0x7FF;
							local405 = Static265.aClass22_Sub3_Sub1Array1[local396];
							local417 = local392 >> 11 & 0xF;
						}
						if (local405 != null) {
							@Pc(445) Class78 local445 = local405.method3659();
							if (local445.anIntArrayArray13 != null && local445.anIntArrayArray13[local417] != null) {
								local299 -= local445.anIntArrayArray13[local417][1];
								local396 = local445.anIntArrayArray13[local417][0];
								@Pc(479) int local479 = local445.anIntArrayArray13[local417][2];
								@Pc(484) int local484 = Class17.anIntArray22[local405.anInt4649];
								@Pc(489) int local489 = Class17.anIntArray24[local405.anInt4649];
								@Pc(499) int local499 = local489 * local396 + local479 * local484 >> 16;
								@Pc(509) int local509 = local489 * local479 - local396 * local484 >> 16;
								local45 += local509;
								local16 += local499;
							}
						}
					}
					@Pc(546) Class22_Sub6 local546 = new Class22_Sub6(local134, Static295.anInt5586, local16, local45, Static104.method1648(Static295.anInt5586, local16, local45) - local299, local309 - -Static37.anInt757, Static37.anInt757 + local313, local317, local321, local55, local305);
					local546.method2156(Static104.method1648(Static295.anInt5586, local41, local49) - local305, Static37.anInt757 + local309, local41, local49);
					Static27.aClass24_1.method473(new Class1_Sub1_Sub13(local546));
				}
			} else if (Static117.anInt2306 == 137) {
				local12 = Static237.aClass1_Sub14_Sub1_7.method2595();
				local16 = (local12 >> 4 & 0x7) + Static146.anInt2885;
				local45 = Static5.anInt68 + (local12 & 0x7);
				local41 = Static237.aClass1_Sub14_Sub1_7.method2593();
				local49 = Static237.aClass1_Sub14_Sub1_7.method2593();
				local64 = Static237.aClass1_Sub14_Sub1_7.method2593();
				if (local16 >= 0 && local45 >= 0 && local16 < 104 && local45 < 104) {
					@Pc(628) Class24 local628 = Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45];
					if (local628 != null) {
						for (@Pc(636) Class1_Sub1_Sub18 local636 = (Class1_Sub1_Sub18) local628.method460(); local636 != null; local636 = (Class1_Sub1_Sub18) local628.method464()) {
							@Pc(641) Class22_Sub2 local641 = local636.aClass22_Sub2_1;
							if (local641.anInt543 == (local41 & 0x7FFF) && local49 == local641.anInt536) {
								local641.anInt536 = local64;
								break;
							}
						}
						Static24.method458(local45, local16);
					}
				}
			} else if (Static117.anInt2306 == 11) {
				local12 = Static237.aClass1_Sub14_Sub1_7.method2646();
				local16 = Static146.anInt2885 + (local12 >> 4 & 0x7);
				local45 = (local12 & 0x7) + Static5.anInt68;
				local41 = Static237.aClass1_Sub14_Sub1_7.method2646();
				local49 = local41 >> 2;
				local55 = Static15.anIntArray21[local49];
				local134 = Static237.aClass1_Sub14_Sub1_7.method2593();
				local64 = local41 & 0x3;
				if (local16 >= 0 && local45 >= 0 && local16 < 104 && local45 < 104) {
					Static271.method4005(local16, local49, local55, local45, local134, 0, local64, Static295.anInt5586, -1);
				}
			} else if (Static117.anInt2306 == 124) {
				local12 = Static237.aClass1_Sub14_Sub1_7.method2595();
				local16 = (local12 >> 4 & 0x7) + Static146.anInt2885;
				local45 = (local12 & 0x7) + Static5.anInt68;
				local41 = Static237.aClass1_Sub14_Sub1_7.method2593();
				if (local41 == 65535) {
					local41 = -1;
				}
				local49 = Static237.aClass1_Sub14_Sub1_7.method2595();
				local55 = local49 & 0x7;
				local64 = local49 >> 4 & 0xF;
				local134 = Static237.aClass1_Sub14_Sub1_7.method2595();
				local299 = Static237.aClass1_Sub14_Sub1_7.method2595();
				if (local16 >= 0 && local45 >= 0 && local16 < 104 && local45 < 104) {
					local305 = local64 + 1;
					if (local16 - local305 <= Static229.aClass22_Sub3_Sub2_2.anIntArray427[0] && local16 + local305 >= Static229.aClass22_Sub3_Sub2_2.anIntArray427[0] && Static229.aClass22_Sub3_Sub2_2.anIntArray424[0] >= local45 - local305 && local305 + local45 >= Static229.aClass22_Sub3_Sub2_2.anIntArray424[0] && Static315.anInt5926 != 0 && local55 > 0 && Static258.anInt5018 < 50 && local41 != -1) {
						Static307.anIntArray526[Static258.anInt5018] = local41;
						Static265.anIntArray459[Static258.anInt5018] = local55;
						Static167.anIntArray282[Static258.anInt5018] = local134;
						Static288.aClass184Array1[Static258.anInt5018] = null;
						Static255.anIntArray449[Static258.anInt5018] = local64 + (local45 << 8) + (local16 << 16);
						Static203.anIntArray329[Static258.anInt5018] = local299;
						Static258.anInt5018++;
					}
				}
			} else {
				if (Static117.anInt2306 == 158) {
					@Pc(923) byte local923 = Static237.aClass1_Sub14_Sub1_7.method2598();
					local16 = Static237.aClass1_Sub14_Sub1_7.method2626();
					local45 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local41 = (local45 >> 4 & 0x7) + Static146.anInt2885;
					local49 = Static5.anInt68 + (local45 & 0x7);
					local64 = Static237.aClass1_Sub14_Sub1_7.method2617();
					local55 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local134 = local55 >> 2;
					local299 = local55 & 0x3;
					local305 = Static237.aClass1_Sub14_Sub1_7.method2614();
					@Pc(969) byte local969 = Static237.aClass1_Sub14_Sub1_7.method2592();
					local313 = Static237.aClass1_Sub14_Sub1_7.method2638();
					@Pc(977) byte local977 = Static237.aClass1_Sub14_Sub1_7.method2629();
					@Pc(981) byte local981 = Static237.aClass1_Sub14_Sub1_7.method2629();
					if (!Static291.aBoolean404) {
						Static189.method3076(local981, local305, local977, local299, local313, local49, local969, local64, local41, local923, local16, local134);
					}
				}
				@Pc(1157) Class22_Sub6 local1157;
				if (Static117.anInt2306 == 150) {
					local12 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local45 = (local12 & 0xF) + Static5.anInt68 * 2;
					local16 = (local12 >> 4 & 0xF) + Static146.anInt2885 * 2;
					local41 = Static237.aClass1_Sub14_Sub1_7.method2598() + local16;
					local49 = Static237.aClass1_Sub14_Sub1_7.method2598() + local45;
					local64 = Static237.aClass1_Sub14_Sub1_7.method2623();
					local55 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local134 = Static237.aClass1_Sub14_Sub1_7.method2595() * 4;
					local299 = Static237.aClass1_Sub14_Sub1_7.method2595() * 4;
					local305 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local309 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local313 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local317 = Static237.aClass1_Sub14_Sub1_7.method2595();
					if (local313 == 255) {
						local313 = -1;
					}
					if (local16 >= 0 && local45 >= 0 && local16 < 208 && local45 < 208 && local41 >= 0 && local49 >= 0 && local41 < 208 && local49 < 208 && local55 != 65535) {
						local16 = local16 * 64;
						local49 *= 64;
						local41 = local41 * 64;
						local45 = local45 * 64;
						local1157 = new Class22_Sub6(local55, Static295.anInt5586, local16, local45, Static104.method1648(Static295.anInt5586, local16, local45) - local134, Static37.anInt757 + local305, local309 + Static37.anInt757, local313, local317, local64, local299);
						local1157.method2156(Static104.method1648(Static295.anInt5586, local41, local49) - local299, Static37.anInt757 + local305, local41, local49);
						Static27.aClass24_1.method473(new Class1_Sub1_Sub13(local1157));
					}
				} else if (Static117.anInt2306 == 66) {
					local12 = Static237.aClass1_Sub14_Sub1_7.method2646();
					local16 = (local12 >> 4 & 0x7) + Static146.anInt2885;
					local45 = Static5.anInt68 + (local12 & 0x7);
					local41 = Static237.aClass1_Sub14_Sub1_7.method2626();
					local49 = Static237.aClass1_Sub14_Sub1_7.method2638();
					local64 = Static237.aClass1_Sub14_Sub1_7.method2614();
					if (local16 >= 0 && local45 >= 0 && local16 < 104 && local45 < 104 && Static117.anInt2308 != local64) {
						@Pc(1242) Class22_Sub2 local1242 = new Class22_Sub2();
						local1242.anInt543 = local49;
						local1242.anInt536 = local41;
						if (Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45] == null) {
							Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45] = new Class24();
						}
						Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45].method473(new Class1_Sub1_Sub18(local1242));
						Static24.method458(local45, local16);
					}
				} else if (Static117.anInt2306 == 103) {
					local12 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local45 = (local12 & 0x7) + Static5.anInt68;
					local16 = (local12 >> 4 & 0x7) + Static146.anInt2885;
					local41 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local49 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local64 = Static237.aClass1_Sub14_Sub1_7.method2593();
					if (local16 >= 0 && local45 >= 0 && local16 < 104 && local45 < 104) {
						local45 = local45 * 128 + 64;
						local16 = local16 * 128 + 64;
						@Pc(1367) Class22_Sub1 local1367 = new Class22_Sub1(local41, Static295.anInt5586, local16, local45, Static104.method1648(Static295.anInt5586, local16, local45) - local49, local64, Static37.anInt757);
						Static185.aClass24_21.method473(new Class1_Sub1_Sub4(local1367));
					}
				} else if (Static117.anInt2306 == 235) {
					local12 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local45 = Static5.anInt68 + (local12 & 0x7);
					local16 = (local12 >> 4 & 0x7) + Static146.anInt2885;
					local41 = local16 + Static237.aClass1_Sub14_Sub1_7.method2598();
					local49 = Static237.aClass1_Sub14_Sub1_7.method2598() + local45;
					local64 = Static237.aClass1_Sub14_Sub1_7.method2623();
					local55 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local134 = Static237.aClass1_Sub14_Sub1_7.method2595() * 4;
					local299 = Static237.aClass1_Sub14_Sub1_7.method2595() * 4;
					local305 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local309 = Static237.aClass1_Sub14_Sub1_7.method2593();
					local313 = Static237.aClass1_Sub14_Sub1_7.method2595();
					local317 = Static237.aClass1_Sub14_Sub1_7.method2595();
					if (local313 == 255) {
						local313 = -1;
					}
					if (local16 >= 0 && local45 >= 0 && local16 < 104 && local45 < 104 && local41 >= 0 && local49 >= 0 && local41 < 104 && local49 < 104 && local55 != 65535) {
						local41 = local41 * 128 + 64;
						local49 = local49 * 128 + 64;
						local45 = local45 * 128 + 64;
						local16 = local16 * 128 + 64;
						local1157 = new Class22_Sub6(local55, Static295.anInt5586, local16, local45, Static104.method1648(Static295.anInt5586, local16, local45) - local134, Static37.anInt757 + local305, local309 + Static37.anInt757, local313, local317, local64, local299);
						local1157.method2156(Static104.method1648(Static295.anInt5586, local41, local49) - local299, local305 + Static37.anInt757, local41, local49);
						Static27.aClass24_1.method473(new Class1_Sub1_Sub13(local1157));
					}
				} else if (Static117.anInt2306 == 60) {
					local12 = Static237.aClass1_Sub14_Sub1_7.method2627();
					local45 = (local12 & 0x7) + Static5.anInt68;
					local16 = (local12 >> 4 & 0x7) + Static146.anInt2885;
					local41 = Static237.aClass1_Sub14_Sub1_7.method2626();
					if (local16 >= 0 && local45 >= 0 && local16 < 104 && local45 < 104) {
						@Pc(1622) Class24 local1622 = Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45];
						if (local1622 != null) {
							for (@Pc(1629) Class1_Sub1_Sub18 local1629 = (Class1_Sub1_Sub18) local1622.method460(); local1629 != null; local1629 = (Class1_Sub1_Sub18) local1622.method464()) {
								if ((local41 & 0x7FFF) == local1629.aClass22_Sub2_1.anInt543) {
									local1629.method4616();
									break;
								}
							}
							if (local1622.method460() == null) {
								Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local16][local45] = null;
							}
							Static24.method458(local45, local16);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method2691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 <= 0) {
			return "<col=ffff00>";
		} else {
			return "<col=c0ff00>";
		}
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V")
	public static void method2692() {
		Static274.aClass24_27 = new Class24();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method2693(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(40) long local40 = arg0; local40 != 0L; local40 /= 37L) {
				local30++;
			}
			@Pc(58) StringBuffer local58 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(66) long local66 = arg0;
				arg0 /= 37L;
				local58.append(Static119.aCharArray11[(int) (local66 - arg0 * 37L)]);
			}
			return local58.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZIII)V")
	public static void method2694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (Static291.aBoolean404) {
			@Pc(25) int local25 = arg1 - 334;
			if (local25 < 0) {
				local25 = 0;
			} else if (local25 > 100) {
				local25 = 100;
			}
			@Pc(50) int local50 = Static222.aShort23 + (Static117.aShort12 - Static222.aShort23) * local25 / 100;
			if (local50 < Static23.aShort1) {
				local50 = Static23.aShort1;
			} else if (local50 > Static280.aShort48) {
				local50 = Static280.aShort48;
			}
			@Pc(76) int local76 = arg1 * 512 * local50 / (arg4 * 334);
			@Pc(115) int local115;
			@Pc(121) int local121;
			@Pc(85) short local85;
			if (local76 < Static183.aShort21) {
				local85 = Static183.aShort21;
				local50 = arg4 * local85 * 334 / (arg1 * 512);
				if (local50 > Static280.aShort48) {
					local50 = Static280.aShort48;
					local115 = local50 * 512 * arg1 / (local85 * 334);
					local121 = (arg4 - local115) / 2;
					if (arg2) {
						Static133.method2166();
						Static133.method2176(arg3, arg0, local121, arg1, 0);
						Static133.method2176(arg4 + arg3 - local121, arg0, local121, arg1, 0);
					}
					arg3 += local121;
					arg4 -= local121 * 2;
				}
			} else if (Static304.aShort49 < local76) {
				local85 = Static304.aShort49;
				local50 = arg4 * local85 * 334 / (arg1 * 512);
				if (Static23.aShort1 > local50) {
					local50 = Static23.aShort1;
					local115 = local85 * 334 * arg4 / (local50 * 512);
					local121 = (arg1 - local115) / 2;
					if (arg2) {
						Static133.method2166();
						Static133.method2176(arg3, arg0, arg4, local121, 0);
						Static133.method2176(arg3, arg1 + arg0 - local121, arg4, local121, 0);
					}
					arg0 += local121;
					arg1 -= local121 * 2;
				}
			}
			Static164.anInt3456 = local50 * arg1 / 334;
		}
		Static279.anInt5297 = (short) arg4;
		Static260.anInt5033 = (short) arg1;
		Static48.anInt929 = arg0;
		Static210.anInt4141 = arg3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public static void method2695(@OriginalArg(1) int arg0) {
		Static262.anInt2348 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V")
	public static void method2696() {
		if (Static181.aString118.toLowerCase().indexOf("microsoft") != -1) {
			Static237.anIntArray289[188] = 71;
			Static237.anIntArray289[187] = 27;
			Static237.anIntArray289[191] = 73;
			Static237.anIntArray289[189] = 26;
			Static237.anIntArray289[186] = 57;
			Static237.anIntArray289[220] = 74;
			Static237.anIntArray289[222] = 59;
			Static237.anIntArray289[219] = 42;
			Static237.anIntArray289[221] = 43;
			Static237.anIntArray289[190] = 72;
			Static237.anIntArray289[223] = 28;
			Static237.anIntArray289[192] = 58;
			return;
		}
		if (Static181.aMethod2 == null) {
			Static237.anIntArray289[192] = 58;
			Static237.anIntArray289[222] = 59;
		} else {
			Static237.anIntArray289[192] = 28;
			Static237.anIntArray289[520] = 59;
			Static237.anIntArray289[222] = 58;
		}
		Static237.anIntArray289[59] = 57;
		Static237.anIntArray289[61] = 27;
		Static237.anIntArray289[91] = 42;
		Static237.anIntArray289[92] = 74;
		Static237.anIntArray289[47] = 73;
		Static237.anIntArray289[46] = 72;
		Static237.anIntArray289[93] = 43;
		Static237.anIntArray289[44] = 71;
		Static237.anIntArray289[45] = 26;
	}
}
