import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt1206;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	public static int anInt1211 = 0;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_19 = new Class254(115, 7);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!oa;II)V")
	public static void method1090(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static240.anInt5412 == 0 || Static138.anInt2935 == 0) {
			return;
		}
		arg0.m(Static92.anInt9036, Static390.anInt7315, Static240.anInt5412, Static138.anInt2935);
		arg0.ca(Static430.anInt867, Static499.anInt8902, Static240.anInt5412, Static138.anInt2935);
		@Pc(38) Class8 local38 = arg0.method5446();
		local38.pa(Static318.anInt5995, Static197.anInt4268, Static294.anInt5604, Static367.anInt6944, Static570.anInt9637, Static10.anInt537);
		arg0.method5429(local38);
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(111) int[] local111;
		@Pc(143) int local143;
		@Pc(152) int local152;
		if (Static53.aClass62Array2 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			local58 = arg0.U();
			local66 = (arg1 - Static92.anInt9036) * local58 / Static240.anInt5412;
			local75 = (arg2 - Static390.anInt7315) * local58 / Static138.anInt2935;
			local78 = arg0.IA();
			local87 = (arg1 - Static92.anInt9036) * local78 / Static240.anInt5412;
			local96 = (arg2 - Static390.anInt7315) * local78 / Static138.anInt2935;
			local111 = new int[] { local66, local75, local58 };
			local38.O(local111);
			@Pc(129) int[] local129 = new int[] { local87, local96, local78 };
			local38.O(local129);
			@Pc(134) float local134 = 0.0F;
			local143 = local129[0] - local111[0];
			local152 = local129[1] - local111[1];
			@Pc(161) int local161 = local129[2] - local111[2];
			while (local134 < 1.0F) {
				@Pc(174) int local174 = (int) ((float) local111[0] + local134 * (float) local143);
				@Pc(178) int local178 = local174 >> 9;
				@Pc(189) int local189 = (int) ((float) local111[2] + (float) local161 * local134);
				@Pc(193) int local193 = local189 >> 9;
				if (local178 > 0 && local193 > 0 && local178 < Static228.anInt4746 && local193 < Static44.anInt1275) {
					@Pc(209) int local209 = Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77;
					if (local209 < 3 && (Static356.aByteArrayArrayArray17[1][local178][local193] & 0x2) != 0) {
						local209++;
					}
					if ((float) Static53.aClass62Array2[local209].sa(local174, local189) < local134 * (float) local152 + (float) local111[1]) {
						local53 = local174 + (Static350.aClass11_Sub1_Sub1_Sub2_4.method6212() - 1 << 8) >> 9;
						local55 = (Static350.aClass11_Sub1_Sub1_Sub2_4.method6212() - 1 << 8) + local189 >> 9;
						break;
					}
				}
				local134 = (float) ((double) local134 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static25.aBoolean80 && (Static429.anInt7864 & 0x40) != 0) {
					@Pc(300) Class93 local300 = Static100.method2145(Static150.anInt7378, Static244.anInt4934);
					if (local300 == null) {
						Static353.method5744();
					} else {
						Static232.method4112(false, -1, " ->", local53, true, local55, 0L, Static467.aString104, 18, Static567.anInt7672);
					}
				} else {
					if (Static38.aClass162_1 == Static303.aClass162_2) {
						Static232.method4112(false, -1, "", local53, true, local55, 0L, Static222.aClass152_72.method4002(Static286.anInt5468), 46, -1);
					}
					Static232.method4112(false, -1, "", local53, true, local55, 0L, Static427.aString115, 9, Static380.anInt7112);
				}
			}
		}
		@Pc(358) Class267 local358 = Static16.aClass267_1;
		for (@Pc(368) Class5_Sub5 local368 = (Class5_Sub5) local358.method6544(); local368 != null; local368 = (Class5_Sub5) local358.method6543()) {
			if ((Static526.aBoolean687 || local368.anInt7020 == Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77) && local368.method5927(arg0, arg1, arg2)) {
				@Pc(505) int local505;
				@Pc(517) int local517;
				if (local368.aClass11_1 instanceof Class11_Sub1_Sub1_Sub2) {
					@Pc(392) Class11_Sub1_Sub1_Sub2 local392 = (Class11_Sub1_Sub1_Sub2) local368.aClass11_1;
					local66 = local392.method6212();
					if ((local66 & 0x1) == 0 && (local392.anInt7347 & 0x1FF) == 0 && (local392.anInt7351 & 0x1FF) == 0 || (local66 & 0x1) == 1 && (local392.anInt7347 & 0x1FF) == 256 && (local392.anInt7351 & 0x1FF) == 256) {
						local75 = local392.anInt7347 - (local392.method6212() - 1 << 8);
						local78 = local392.anInt7351 - (local392.method6212() - 1 << 8);
						for (local87 = 0; local87 < Static208.anInt4409; local87++) {
							@Pc(479) Class6_Sub33 local479 = (Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local87]);
							if (local479 != null) {
								@Pc(484) Class11_Sub1_Sub1_Sub1 local484 = local479.aClass11_Sub1_Sub1_Sub1_2;
								if (Static508.anInt8998 != local484.anInt7404 && local484.aBoolean543) {
									local505 = local484.anInt7347 - (local484.aClass222_1.anInt6248 - 1 << 8);
									local517 = local484.anInt7351 - (local484.aClass222_1.anInt6248 - 1 << 8);
									if (local75 <= local505 && local484.aClass222_1.anInt6248 <= local392.method6212() - (local505 - local75 >> 9) && local517 >= local78 && local484.aClass222_1.anInt6248 <= local392.method6212() - (local517 - local78 >> 9)) {
										Static527.method7664(local368.anInt7020 != Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, local484);
										local484.anInt7404 = Static508.anInt8998;
									}
								}
							}
						}
						local96 = Static81.anInt1953;
						local111 = Static227.anIntArray309;
						for (local505 = 0; local505 < local96; local505++) {
							@Pc(594) Class11_Sub1_Sub1_Sub2 local594 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local111[local505]];
							if (local594 != null && Static508.anInt8998 != local594.anInt7404 && local594 != local392 && local594.aBoolean543) {
								local143 = local594.anInt7347 - (local594.method6212() - 1 << 8);
								local152 = local594.anInt7351 - (local594.method6212() - 1 << 8);
								if (local75 <= local143 && local594.method6212() <= local392.method6212() - (local143 - local75 >> 9) && local78 <= local152 && local594.method6212() <= local392.method6212() - (local152 - local78 >> 9)) {
									Static457.method7112(local594, Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 != local368.anInt7020);
									local594.anInt7404 = Static508.anInt8998;
								}
							}
						}
					}
					if (local392.anInt7404 == Static508.anInt8998) {
						continue;
					}
					Static457.method7112(local392, Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 != local368.anInt7020);
					local392.anInt7404 = Static508.anInt8998;
				}
				@Pc(832) int local832;
				if (local368.aClass11_1 instanceof Class11_Sub1_Sub1_Sub1) {
					@Pc(719) Class11_Sub1_Sub1_Sub1 local719 = (Class11_Sub1_Sub1_Sub1) local368.aClass11_1;
					if (local719.aClass222_1 != null) {
						if ((local719.aClass222_1.anInt6248 & 0x1) == 0 && (local719.anInt7347 & 0x1FF) == 0 && (local719.anInt7351 & 0x1FF) == 0 || (local719.aClass222_1.anInt6248 & 0x1) == 1 && (local719.anInt7347 & 0x1FF) == 256 && (local719.anInt7351 & 0x1FF) == 256) {
							local66 = local719.anInt7347 - (local719.aClass222_1.anInt6248 - 1 << 8);
							local75 = local719.anInt7351 - (local719.aClass222_1.anInt6248 - 1 << 8);
							for (local78 = 0; local78 < Static208.anInt4409; local78++) {
								@Pc(800) Class6_Sub33 local800 = (Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local78]);
								if (local800 != null) {
									@Pc(805) Class11_Sub1_Sub1_Sub1 local805 = local800.aClass11_Sub1_Sub1_Sub1_2;
									if (local805.anInt7404 != Static508.anInt8998 && local719 != local805 && local805.aBoolean543) {
										local832 = local805.anInt7347 - (local805.aClass222_1.anInt6248 - 1 << 8);
										local505 = local805.anInt7351 - (local805.aClass222_1.anInt6248 - 1 << 8);
										if (local832 >= local66 && local719.aClass222_1.anInt6248 - (local832 - local66 >> 9) >= local805.aClass222_1.anInt6248 && local75 <= local505 && local719.aClass222_1.anInt6248 - (local505 - local75 >> 9) >= local805.aClass222_1.anInt6248) {
											Static527.method7664(Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 != local368.anInt7020, local805);
											local805.anInt7404 = Static508.anInt8998;
										}
									}
								}
							}
							local87 = Static81.anInt1953;
							@Pc(911) int[] local911 = Static227.anIntArray309;
							for (local832 = 0; local832 < local87; local832++) {
								@Pc(921) Class11_Sub1_Sub1_Sub2 local921 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local911[local832]];
								if (local921 != null && local921.anInt7404 != Static508.anInt8998 && local921.aBoolean543) {
									local517 = local921.anInt7347 - (local921.method6212() - 1 << 8);
									local143 = local921.anInt7351 - (local921.method6212() - 1 << 8);
									if (local66 <= local517 && local921.method6212() <= local719.aClass222_1.anInt6248 - (local517 - local66 >> 9) && local75 <= local143 && local921.method6212() <= local719.aClass222_1.anInt6248 - (local143 - local75 >> 9)) {
										Static457.method7112(local921, Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 != local368.anInt7020);
										local921.anInt7404 = Static508.anInt8998;
									}
								}
							}
						}
						if (Static508.anInt8998 == local719.anInt7404) {
							continue;
						}
						Static527.method7664(local368.anInt7020 != Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, local719);
						local719.anInt7404 = Static508.anInt8998;
					}
				}
				if (local368.aClass11_1 instanceof Class11_Sub2_Sub1) {
					local58 = Static191.anInt4147 + local368.anInt7025;
					local66 = local368.anInt7024 + Static247.anInt5049;
					@Pc(1068) Class6_Sub35 local1068 = (Class6_Sub35) Static516.aClass305_37.method7447((long) (local66 << 14 | local368.anInt7020 << 28 | local58));
					if (local1068 != null) {
						for (@Pc(1076) Class6_Sub43 local1076 = (Class6_Sub43) local1068.aClass211_47.method5184(); local1076 != null; local1076 = (Class6_Sub43) local1068.aClass211_47.method5172()) {
							@Pc(1084) Class145 local1084 = Static98.aClass203_1.method4899(local1076.anInt8493);
							if (Static25.aBoolean80 && local368.anInt7020 == Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77) {
								@Pc(1105) Class99 local1105 = Static121.anInt2623 == -1 ? null : Static499.aClass118_2.method3497(Static121.anInt2623);
								if ((Static429.anInt7864 & 0x1) != 0 && (local1105 == null || local1084.method3852(local1105.anInt2851, Static121.anInt2623) != local1105.anInt2851)) {
									Static232.method4112(false, -1, Static568.aString113 + " -> <col=ff9040>" + local1084.aString52, local368.anInt7025, true, local368.anInt7024, (long) local1076.anInt8493, Static467.aString104, 44, Static567.anInt7672);
								}
							}
							if (local368.anInt7020 == Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77) {
								@Pc(1161) String[] local1161 = local1084.aStringArray27;
								for (local832 = 4; local832 >= 0; local832--) {
									if (local1161 != null && local1161[local832] != null) {
										@Pc(1173) byte local1173 = 0;
										local517 = Static553.anInt9423;
										if (local832 == 0) {
											local1173 = 6;
										}
										if (local832 == 1) {
											local1173 = 47;
										}
										if (local832 == 2) {
											local1173 = 59;
										}
										if (local832 == 3) {
											local1173 = 11;
										}
										if (local832 == local1084.anInt4436) {
											local517 = local1084.anInt4477;
										}
										if (local832 == 4) {
											local1173 = 51;
										}
										if (local1084.anInt4443 == local832) {
											local517 = local1084.anInt4447;
										}
										Static232.method4112(false, -1, "<col=ff9040>" + local1084.aString52, local368.anInt7025, true, local368.anInt7024, (long) local1076.anInt8493, local1161[local832], local1173, local517);
									}
								}
							}
							Static232.method4112(Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 != local368.anInt7020, -1, "<col=ff9040>" + local1084.aString52, local368.anInt7025, true, local368.anInt7024, (long) local1076.anInt8493, Static222.aClass152_67.method4002(Static286.anInt5468), 1004, Static557.anInt9493);
						}
					}
				}
				if (local368.aClass11_1 instanceof Interface17) {
					@Pc(1313) Interface17 local1313 = (Interface17) local368.aClass11_1;
					@Pc(1320) Class31 local1320 = Static480.aClass57_11.method1469(local1313.method8114());
					if (local1320.anIntArray69 != null) {
						local1320 = local1320.method1029(Static435.aClass234_1);
					}
					if (local1320 != null) {
						if (Static25.aBoolean80 && Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 == local368.anInt7020) {
							@Pc(1349) Class99 local1349 = Static121.anInt2623 == -1 ? null : Static499.aClass118_2.method3497(Static121.anInt2623);
							if ((Static429.anInt7864 & 0x4) != 0 && (local1349 == null || local1320.method1025(Static121.anInt2623, local1349.anInt2851) != local1349.anInt2851)) {
								Static232.method4112(false, -1, Static568.aString113 + " -> <col=00ffff>" + local1320.aString11, local368.anInt7025, true, local368.anInt7024, Static261.method4524(local1313, local368.anInt7025, local368.anInt7024), Static467.aString104, 30, Static567.anInt7672);
							}
						}
						if (local368.anInt7020 == Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77) {
							@Pc(1415) String[] local1415 = local1320.aStringArray6;
							if (local1415 != null) {
								for (local78 = 4; local78 >= 0; local78--) {
									if (local1415[local78] != null) {
										@Pc(1427) short local1427 = 0;
										if (local78 == 0) {
											local1427 = 3;
										}
										local96 = Static553.anInt9423;
										if (local78 == 1) {
											local1427 = 45;
										}
										if (local78 == 2) {
											local1427 = 58;
										}
										if (local78 == 3) {
											local1427 = 5;
										}
										if (local78 == 4) {
											local1427 = 1011;
										}
										if (local1320.anInt1057 == local78) {
											local96 = local1320.anInt1092;
										}
										if (local78 == local1320.anInt1064) {
											local96 = local1320.anInt1063;
										}
										Static232.method4112(false, -1, "<col=00ffff>" + local1320.aString11, local368.anInt7025, true, local368.anInt7024, Static261.method4524(local1313, local368.anInt7025, local368.anInt7024), local1415[local78], local1427, local96);
									}
								}
							}
						}
						Static232.method4112(local368.anInt7020 != Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, -1, "<col=00ffff>" + local1320.aString11, local368.anInt7025, true, local368.anInt7024, (long) local1320.anInt1060, Static222.aClass152_67.method4002(Static286.anInt5468), 1009, Static557.anInt9493);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
	public static void method1091(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static6.anInt302 != -1) {
				Static465.method7168(Static6.anInt302);
			}
			for (@Pc(14) Class6_Sub48 local14 = (Class6_Sub48) Static459.aClass305_24.method7445(); local14 != null; local14 = (Class6_Sub48) Static459.aClass305_24.method7449()) {
				if (!local14.method8152()) {
					local14 = (Class6_Sub48) Static459.aClass305_24.method7445();
					if (local14 == null) {
						break;
					}
				}
				Static551.method7862(true, false, local14);
			}
			Static6.anInt302 = -1;
			Static459.aClass305_24 = new Class305(8);
			Static380.method5987();
			Static6.anInt302 = Static538.anInt9264;
			Static171.method3490(false);
			Static101.method2148();
			Static89.method1984(Static6.anInt302);
		}
		Static390.aBoolean536 = false;
		Static148.aString116 = "";
		Static319.aString70 = "";
		Static242.method4248();
		Static530.anInt9191 = -1;
		Static8.method605(Static440.anInt8040);
		Static350.aClass11_Sub1_Sub1_Sub2_4 = new Class11_Sub1_Sub1_Sub2();
		Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] = Static228.anInt4746 / 2;
		Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 = Static228.anInt4746 * 512 / 2;
		Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 = Static44.anInt1275 * 512 / 2;
		Static390.anInt7318 = 0;
		Static86.anInt2132 = 0;
		Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0] = Static44.anInt1275 / 2;
		if (Static84.anInt1994 == 2) {
			Static86.anInt2132 = Static252.anInt5118 << 9;
			Static390.anInt7318 = Static503.anInt8950 << 9;
		} else {
			Static369.method5895();
		}
		Static200.method3771();
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public static void method1092() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static518.aBooleanArray39[local11] = false;
		}
		Static454.anInt8403 = -1;
		Static35.anInt1112 = -1;
		Static110.anInt2515 = 0;
		Static84.anInt1994 = 1;
		Static49.anInt1348 = 0;
	}
}
