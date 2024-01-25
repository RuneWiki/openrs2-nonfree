import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!qk", name = "V", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_13 = new Class62(9, 7);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public static void method4294() {
		Static378.aClass2_Sub26_2 = new Class2_Sub26(Static258.aClass32_65.method701(Static107.anInt2498), "", Static62.anInt1263, 1003, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
	public static void method4295() {
		Static140.aClass63_4.method1959(((float) Static3.anInt131 * 0.1F + 0.7F) * 1.1523438F);
		Static140.aClass63_4.method2038(Static110.anInt2329, 0.69921875F, 1.2F, -50.0F, (float) -60, -50.0F);
		Static140.aClass63_4.method1984(Static161.anInt3121, -1);
		Static140.aClass63_4.method1989(Static88.aClass21_1);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZIIZLclient!nl;II)V")
	public static void method4296(@OriginalArg(1) int arg0, @OriginalArg(4) Class171 arg1, @OriginalArg(6) int arg2) {
		Static356.anInt5999 = 0;
		Static391.anInt6626 = 1;
		Static304.anInt6543 = 2;
		Static198.aClass171_50 = arg1;
		Static192.aBoolean276 = false;
		Static361.anInt6051 = arg2;
		Static257.anInt4521 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZILclient!vc;I)V")
	public static void method4299(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static17.anInt396 == 0 || Static373.anInt6291 == 0) {
			return;
		}
		arg1.method2006(Static323.anInt5538, Static236.anInt2044, Static17.anInt396, Static373.anInt6291);
		arg1.method1958(Static31.anInt666, Static380.anInt6480, Static17.anInt396, Static373.anInt6291);
		@Pc(29) Class44 local29 = arg1.method1995();
		local29.method3528(Static77.anInt1460, Static284.anInt4912, Static283.anInt4897, Static275.anInt4735, Static113.anInt2425, Static371.anInt6284);
		arg1.method1961(local29);
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(92) int local92;
		@Pc(107) int[] local107;
		@Pc(139) int local139;
		@Pc(147) int local147;
		if (Static90.aClass107Array1 != null) {
			@Pc(49) int local49 = -1;
			@Pc(51) int local51 = -1;
			@Pc(54) int local54 = arg1.method2039();
			local62 = (arg2 - Static323.anInt5538) * local54 / Static17.anInt396;
			local71 = (arg0 - Static236.anInt2044) * local54 / Static373.anInt6291;
			local74 = arg1.method2003();
			local83 = local74 * (arg2 - Static323.anInt5538) / Static17.anInt396;
			local92 = (arg0 - Static236.anInt2044) * local74 / Static373.anInt6291;
			local107 = new int[] { local62, local71, local54 };
			local29.method3542(local107);
			@Pc(125) int[] local125 = new int[] { local83, local92, local74 };
			local29.method3542(local125);
			@Pc(130) float local130 = 0.0F;
			local139 = local125[0] - local107[0];
			local147 = local125[1] - local107[1];
			@Pc(156) int local156 = local125[2] - local107[2];
			while (local130 < 1.0F) {
				@Pc(169) int local169 = (int) ((float) local107[0] + local130 * (float) local139);
				@Pc(173) int local173 = local169 >> 7;
				@Pc(184) int local184 = (int) ((float) local107[2] + local130 * (float) local156);
				@Pc(188) int local188 = local184 >> 7;
				if (local173 > 0 && local188 > 0 && Static246.anInt4374 > local173 && Static185.anInt3485 > local188) {
					@Pc(215) int local215 = Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69;
					if (local215 < 3 && (Static96.aByteArrayArrayArray8[1][local173][local188] & 0x2) != 0) {
						local215++;
					}
					if ((float) Static90.aClass107Array1[local215].method4673(local169, local184) < (float) local107[1] + (float) local147 * local130) {
						local49 = Static206.aClass1_Sub5_Sub1_Sub1_1.method5547() * 64 + local169 - 64 >> 7;
						local51 = Static206.aClass1_Sub5_Sub1_Sub1_1.method5547() * 64 + local184 - 64 >> 7;
						break;
					}
				}
				local130 = (float) ((double) local130 + 0.01D);
			}
			if (local49 != -1 && local51 != -1) {
				if (Static110.aBoolean180 && (Static33.anInt698 & 0x40) != 0) {
					@Pc(303) Class4 local303 = Static164.method2913(Static309.anInt5189, Static23.anInt501);
					if (local303 == null) {
						Static259.method4010();
					} else {
						Static137.method4192(false, " ->", true, Static391.aString68, local49, 0L, 21, local51, -1, Static345.anInt6624);
					}
				} else {
					if (Static275.aClass150_3 == Static119.aClass150_1) {
						Static137.method4192(false, "", true, Static181.aClass32_96.method701(Static107.anInt2498), local49, 0L, 51, local51, -1, -1);
					}
					Static137.method4192(false, "", true, Static82.aString17, local49, 0L, 60, local51, -1, -1);
				}
			}
		}
		@Pc(359) Class154 local359 = Static200.aClass154_6;
		for (@Pc(364) Class10_Sub3 local364 = (Class10_Sub3) local359.method3479(); local364 != null; local364 = (Class10_Sub3) local359.method3483()) {
			if (Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 == local364.anInt1478 && local364.method1234(arg2, arg1, arg0)) {
				@Pc(485) int local485;
				if (local364.aClass1_1 instanceof Class1_Sub5_Sub1_Sub1) {
					@Pc(386) Class1_Sub5_Sub1_Sub1 local386 = (Class1_Sub5_Sub1_Sub1) local364.aClass1_1;
					local62 = local386.method5547();
					if ((local62 & 0x1) == 0 && (local386.anInt6390 & 0x7F) == 0 && (local386.anInt6386 & 0x7F) == 0 || (local62 & 0x1) == 1 && (local386.anInt6390 & 0x7F) == 64 && (local386.anInt6386 & 0x7F) == 64) {
						local71 = local386.anInt6390 - (local386.method5547() - 1) * 64;
						local74 = local386.anInt6386 - (local386.method5547() - 1) * 64;
						@Pc(496) int local496;
						for (local83 = 0; local83 < Static171.anInt3311; local83++) {
							@Pc(462) Class1_Sub5_Sub1_Sub2 local462 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local83]];
							if (local462 != null && local462.anInt6402 != Static253.anInt4469 && local462.aBoolean459) {
								local485 = local462.anInt6390 + 64 - local462.aClass133_1.anInt3332 * 64;
								local496 = local462.anInt6386 - (local462.aClass133_1.anInt3332 - 1) * 64;
								if (local485 >= local71 && local462.aClass133_1.anInt3332 <= local386.method5547() - (local485 - local71 >> 7) && local496 >= local74 && local462.aClass133_1.anInt3332 <= local386.method5547() - (local496 - local74 >> 7)) {
									Static390.method5662(local462, local364.anInt1478 != Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69);
									local462.anInt6402 = Static253.anInt4469;
								}
							}
						}
						local92 = Static335.anInt5738;
						local107 = Static242.anIntArray933;
						for (local496 = 0; local496 < local92; local496++) {
							@Pc(581) Class1_Sub5_Sub1_Sub1 local581 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local107[local496]];
							if (local581 != null && Static253.anInt4469 != local581.anInt6402 && local386 != local581 && local581.aBoolean459) {
								local139 = local581.anInt6390 - (local581.method5547() - 1) * 64;
								local147 = local581.anInt6386 - (local581.method5547() - 1) * 64;
								if (local139 >= local71 && local581.method5547() <= local386.method5547() - (local139 - local71 >> 7) && local147 >= local74 && local581.method5547() <= local386.method5547() - (local147 - local74 >> 7)) {
									Static260.method4023(Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 != local364.anInt1478, local581);
									local581.anInt6402 = Static253.anInt4469;
								}
							}
						}
					}
					if (Static253.anInt4469 == local386.anInt6402) {
						continue;
					}
					Static260.method4023(local364.anInt1478 != Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69, local386);
					local386.anInt6402 = Static253.anInt4469;
				}
				if (local364.aClass1_1 instanceof Class1_Sub5_Sub1_Sub2) {
					@Pc(714) Class1_Sub5_Sub1_Sub2 local714 = (Class1_Sub5_Sub1_Sub2) local364.aClass1_1;
					if (local714.aClass133_1 != null) {
						if ((local714.aClass133_1.anInt3332 & 0x1) == 0 && (local714.anInt6390 & 0x7F) == 0 && (local714.anInt6386 & 0x7F) == 0 || (local714.aClass133_1.anInt3332 & 0x1) == 1 && (local714.anInt6390 & 0x7F) == 64 && (local714.anInt6386 & 0x7F) == 64) {
							local62 = local714.anInt6390 + 64 - local714.aClass133_1.anInt3332 * 64;
							local71 = local714.anInt6386 - (local714.aClass133_1.anInt3332 - 1) * 64;
							for (local74 = 0; local74 < Static171.anInt3311; local74++) {
								@Pc(792) Class1_Sub5_Sub1_Sub2 local792 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local74]];
								if (local792 != null && Static253.anInt4469 != local792.anInt6402 && local714 != local792 && local792.aBoolean459) {
									local92 = local792.anInt6390 - (local792.aClass133_1.anInt3332 - 1) * 64;
									local485 = local792.anInt6386 - (local792.aClass133_1.anInt3332 - 1) * 64;
									if (local92 >= local62 && local714.aClass133_1.anInt3332 - (local92 - local62 >> 7) >= local792.aClass133_1.anInt3332 && local71 <= local485 && local792.aClass133_1.anInt3332 <= local714.aClass133_1.anInt3332 - (local485 - local71 >> 7)) {
										Static390.method5662(local792, local364.anInt1478 != Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69);
										local792.anInt6402 = Static253.anInt4469;
									}
								}
							}
							local83 = Static335.anInt5738;
							@Pc(899) int[] local899 = Static242.anIntArray933;
							for (local485 = 0; local485 < local83; local485++) {
								@Pc(909) Class1_Sub5_Sub1_Sub1 local909 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local899[local485]];
								if (local909 != null && local909.anInt6402 != Static253.anInt4469 && local909.aBoolean459) {
									@Pc(931) int local931 = local909.anInt6390 + 64 - local909.method5547() * 64;
									local139 = local909.anInt6386 + 64 - local909.method5547() * 64;
									if (local62 <= local931 && local909.method5547() <= local714.aClass133_1.anInt3332 - (local931 - local62 >> 7) && local71 <= local139 && local909.method5547() <= local714.aClass133_1.anInt3332 - (local139 - local71 >> 7)) {
										Static260.method4023(Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 != local364.anInt1478, local909);
										local909.anInt6402 = Static253.anInt4469;
									}
								}
							}
						}
						if (local714.anInt6402 == Static253.anInt4469) {
							continue;
						}
						Static390.method5662(local714, local364.anInt1478 != Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69);
						local714.anInt6402 = Static253.anInt4469;
					}
				}
				if (local364.aClass1_1 instanceof Class1_Sub4_Sub1) {
					@Pc(1061) Class2_Sub28 local1061 = (Class2_Sub28) Static94.aClass246_6.method5613((long) (local364.anInt1478 << 28 | local364.anInt1482 << 14 | local364.anInt1479));
					if (local1061 != null) {
						for (@Pc(1069) Class2_Sub40 local1069 = (Class2_Sub40) local1061.aClass30_31.method696(); local1069 != null; local1069 = (Class2_Sub40) local1061.aClass30_31.method686()) {
							@Pc(1077) Class179 local1077 = Static15.aClass81_1.method2175(local1069.anInt5732);
							if (!Static110.aBoolean180) {
								if (Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 == local364.anInt1478) {
									@Pc(1087) String[] local1087 = local1077.aStringArray110;
									for (local83 = 4; local83 >= 0; local83--) {
										if (local1087 != null && local1087[local83] != null) {
											@Pc(1099) byte local1099 = 0;
											if (local83 == 0) {
												local1099 = 58;
											}
											local485 = Static181.anInt6176;
											if (local83 == 1) {
												local1099 = 23;
											}
											if (local83 == 2) {
												local1099 = 57;
											}
											if (local83 == 3) {
												local1099 = 45;
											}
											if (local1077.anInt4425 == local83) {
												local485 = local1077.anInt4391;
											}
											if (local83 == 4) {
												local1099 = 4;
											}
											if (local83 == local1077.anInt4385) {
												local485 = local1077.anInt4416;
											}
											Static137.method4192(false, "<col=ff9040>" + local1077.aString51, true, local1087[local83], local364.anInt1479, (long) local1069.anInt5732, local1099, local364.anInt1482, -1, local485);
										}
									}
								}
								Static137.method4192(local364.anInt1478 != Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69, "<col=ff9040>" + local1077.aString51, true, Static298.aClass32_80.method701(Static107.anInt2498), local364.anInt1479, (long) local1069.anInt5732, 1007, local364.anInt1482, -1, Static316.anInt5408);
							} else if (Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 == local364.anInt1478) {
								@Pc(1239) Class144 local1239 = Static317.anInt5417 == -1 ? null : Static261.aClass125_2.method2922(Static317.anInt5417);
								if ((Static33.anInt698 & 0x1) != 0 && (local1239 == null || local1077.method3943(local1239.anInt3627, Static317.anInt5417) != local1239.anInt3627)) {
									Static137.method4192(false, Static217.aString47 + " -> <col=ff9040>" + local1077.aString51, true, Static391.aString68, local364.anInt1479, (long) local1069.anInt5732, 25, local364.anInt1482, -1, Static345.anInt6624);
								}
							}
						}
					}
				}
				if (local364.aClass1_1 instanceof Interface2) {
					@Pc(1304) Interface2 local1304 = (Interface2) local364.aClass1_1;
					@Pc(1311) Class172 local1311 = Static221.aClass118_6.method2858(local1304.method5651());
					if (local1311.anIntArray801 != null) {
						local1311 = local1311.method3775(Static321.aClass211_1);
					}
					if (local1311 != null) {
						if (!Static110.aBoolean180) {
							if (Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 == local364.anInt1478) {
								@Pc(1397) String[] local1397 = local1311.aStringArray103;
								if (local1397 != null) {
									for (local74 = 4; local74 >= 0; local74--) {
										if (local1397[local74] != null) {
											@Pc(1409) short local1409 = 0;
											if (local74 == 0) {
												local1409 = 19;
											}
											local92 = Static181.anInt6176;
											if (local74 == 1) {
												local1409 = 49;
											}
											if (local74 == 2) {
												local1409 = 15;
											}
											if (local74 == 3) {
												local1409 = 20;
											}
											if (local74 == 4) {
												local1409 = 1008;
											}
											if (local74 == local1311.anInt4146) {
												local92 = local1311.anInt4128;
											}
											if (local74 == local1311.anInt4135) {
												local92 = local1311.anInt4121;
											}
											Static137.method4192(false, "<col=00ffff>" + local1311.aString48, true, local1397[local74], local364.anInt1479, Static257.method4006(local364.anInt1482, local364.anInt1479, local1304), local1409, local364.anInt1482, -1, local92);
										}
									}
								}
							}
							Static137.method4192(local364.anInt1478 != Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69, "<col=00ffff>" + local1311.aString48, true, Static298.aClass32_80.method701(Static107.anInt2498), local364.anInt1479, (long) local1311.anInt4131, 1001, local364.anInt1482, -1, Static316.anInt5408);
						} else if (local364.anInt1478 == Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69) {
							@Pc(1338) Class144 local1338 = Static317.anInt5417 == -1 ? null : Static261.aClass125_2.method2922(Static317.anInt5417);
							if ((Static33.anInt698 & 0x4) != 0 && (local1338 == null || local1311.method3784(Static317.anInt5417, local1338.anInt3627) != local1338.anInt3627)) {
								Static137.method4192(false, Static217.aString47 + " -> <col=00ffff>" + local1311.aString48, true, Static391.aString68, local364.anInt1479, Static257.method4006(local364.anInt1482, local364.anInt1479, local1304), 22, local364.anInt1482, -1, Static345.anInt6624);
							}
						}
					}
				}
			}
		}
	}
}
