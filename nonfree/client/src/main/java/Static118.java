import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!ij;")
	public static Class93 aClass93_47;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "[I")
	public static final int[] anIntArray208 = new int[5];

	@OriginalMember(owner = "client!he", name = "O", descriptor = "I")
	public static int anInt2193 = 0;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "[I")
	public static final int[] anIntArray209 = new int[4096];

	@OriginalMember(owner = "client!he", name = "U", descriptor = "Lclient!tn;")
	public static final Class190 aClass190_11 = new Class190(32);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ea;III)V")
	public static void method2070(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static259.anInt5094 == 0 || Static15.anInt315 == 0) {
			return;
		}
		arg0.method5161(Static346.anInt6672, Static134.anInt2038, Static259.anInt5094, Static15.anInt315);
		arg0.method5258(Static163.anInt3237, Static10.anInt201, Static259.anInt5094, Static15.anInt315);
		@Pc(38) Class66 local38 = arg0.method5173();
		local38.method5828(Static258.anInt5090, Static128.anInt3752, Static69.anInt1349, Static221.anInt4357, Static138.anInt2673, Static249.anInt6207);
		arg0.method5252(local38);
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (Static56.aClass51Array2 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			@Pc(58) int local58 = arg0.method5217();
			local67 = (arg1 - Static346.anInt6672) * local58 / Static259.anInt5094;
			local76 = local58 * (arg2 - Static134.anInt2038) / Static15.anInt315;
			local79 = arg0.method5213();
			local88 = (arg1 - Static346.anInt6672) * local79 / Static259.anInt5094;
			local97 = (arg2 - Static134.anInt2038) * local79 / Static15.anInt315;
			@Pc(112) int[] local112 = new int[] { local67, local76, local58 };
			local38.method5813(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local79 };
			local38.method5813(local130);
			@Pc(135) float local135 = 0.0F;
			@Pc(144) int local144 = local130[0] - local112[0];
			@Pc(153) int local153 = local130[1] - local112[1];
			@Pc(161) int local161 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(174) int local174 = (int) ((float) local112[0] + local135 * (float) local144);
				@Pc(178) int local178 = local174 >> 7;
				@Pc(189) int local189 = (int) ((float) local112[2] + (float) local161 * local135);
				@Pc(193) int local193 = local189 >> 7;
				if (local178 > 0 && local193 > 0 && local178 < Static22.anInt481 && Static269.anInt5281 > local193) {
					@Pc(213) int local213 = Static239.anInt4811;
					if (local213 < 3 && (Static255.aByteArrayArrayArray13[1][local178][local193] & 0x2) != 0) {
						local213++;
					}
					if ((float) Static56.aClass51Array2[local213].method1844(local174, local189) < (float) local112[1] + local135 * (float) local153) {
						local53 = local174 + (Static192.aClass4_Sub5_Sub2_Sub1_2.method4807() - 1) * 64 >> 7;
						local55 = (Static192.aClass4_Sub5_Sub2_Sub1_2.method4807() - 1) * 64 + local189 >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static54.aBoolean72 && (Static5.anInt93 & 0x40) != 0) {
					@Pc(334) Class201 local334 = Static297.method5150(Static166.anInt3318, Static240.anInt4828);
					if (local334 == null) {
						Static113.method1983();
					} else {
						Static30.method540(Static255.aString49, 30, local53, 0L, local55, Static169.anInt6216, " ->");
					}
				} else {
					if (Static111.anInt2077 == 1) {
						Static30.method540(Static298.aClass85_45.method2020(Static41.anInt726), 50, local53, 0L, local55, -1, "");
					}
					Static30.method540(Static255.aString50, 13, local53, 0L, local55, -1, "");
				}
			}
		}
		@Pc(351) Class39 local351 = Static70.aClass39_1;
		for (@Pc(356) Class32_Sub4 local356 = (Class32_Sub4) local351.method806(); local356 != null; local356 = (Class32_Sub4) local351.method808()) {
			if (local356.method3780(arg2, arg1, arg0) && Static239.anInt4811 == local356.anInt4089) {
				@Pc(485) int local485;
				@Pc(497) int local497;
				if (local356.aClass4_1 instanceof Class4_Sub5_Sub2_Sub1) {
					@Pc(384) Class4_Sub5_Sub2_Sub1 local384 = (Class4_Sub5_Sub2_Sub1) local356.aClass4_1;
					local67 = local384.method4807();
					if ((local67 & 0x1) == 0 && (local384.anInt6631 & 0x7F) == 0 && (local384.anInt6632 & 0x7F) == 0 || (local67 & 0x1) == 1 && (local384.anInt6631 & 0x7F) == 64 && (local384.anInt6632 & 0x7F) == 64) {
						local76 = local384.anInt6631 - (local384.method4807() - 1) * 64;
						local79 = local384.anInt6632 - (local384.method4807() - 1) * 64;
						for (local88 = 0; local88 < Static133.anInt2579; local88++) {
							@Pc(458) Class4_Sub5_Sub2_Sub2 local458 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local88]];
							if (local458 != null && local458.anInt5364 != Static283.anInt5563 && local458.aBoolean447) {
								local485 = local458.anInt6631 + 64 - local458.aClass106_1.anInt3135 * 64;
								local497 = local458.anInt6632 + 64 - local458.aClass106_1.anInt3135 * 64;
								if (local76 <= local485 && local458.aClass106_1.anInt3135 <= local384.method4807() - (local485 - local76 >> 7) && local497 >= local79 && local458.aClass106_1.anInt3135 <= local384.method4807() - (local497 - local79 >> 7)) {
									Static167.method3040(local458);
									local458.anInt5364 = Static283.anInt5563;
								}
							}
						}
						for (local97 = 0; local97 < Static22.anInt472; local97++) {
							@Pc(560) Class4_Sub5_Sub2_Sub1 local560 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local97]];
							if (local560 != null && Static283.anInt5563 != local560.anInt5364 && local384 != local560 && local560.aBoolean447) {
								local497 = local560.anInt6631 + 64 - local560.method4807() * 64;
								@Pc(601) int local601 = local560.anInt6632 + 64 - local560.method4807() * 64;
								if (local497 >= local76 && local560.method4807() <= local384.method4807() - (local497 - local76 >> 7) && local601 >= local79 && local560.method4807() <= local384.method4807() - (local601 - local79 >> 7)) {
									Static262.method4617(local560);
									local560.anInt5364 = Static283.anInt5563;
								}
							}
						}
					}
					if (Static283.anInt5563 == local384.anInt5364) {
						continue;
					}
					Static262.method4617(local384);
					local384.anInt5364 = Static283.anInt5563;
				}
				if (local356.aClass4_1 instanceof Class4_Sub5_Sub2_Sub2) {
					@Pc(678) Class4_Sub5_Sub2_Sub2 local678 = (Class4_Sub5_Sub2_Sub2) local356.aClass4_1;
					if (local678.aClass106_1 != null) {
						if ((local678.aClass106_1.anInt3135 & 0x1) == 0 && (local678.anInt6631 & 0x7F) == 0 && (local678.anInt6632 & 0x7F) == 0 || (local678.aClass106_1.anInt3135 & 0x1) == 1 && (local678.anInt6631 & 0x7F) == 64 && (local678.anInt6632 & 0x7F) == 64) {
							local67 = local678.anInt6631 - (local678.aClass106_1.anInt3135 - 1) * 64;
							local76 = local678.anInt6632 - (local678.aClass106_1.anInt3135 - 1) * 64;
							for (local79 = 0; local79 < Static133.anInt2579; local79++) {
								@Pc(757) Class4_Sub5_Sub2_Sub2 local757 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local79]];
								if (local757 != null && Static283.anInt5563 != local757.anInt5364 && local757 != local678 && local757.aBoolean447) {
									local97 = local757.anInt6631 + 64 - local757.aClass106_1.anInt3135 * 64;
									local485 = local757.anInt6632 + 64 - local757.aClass106_1.anInt3135 * 64;
									if (local67 <= local97 && local678.aClass106_1.anInt3135 - (local97 - local67 >> 7) >= local757.aClass106_1.anInt3135 && local76 <= local485 && local757.aClass106_1.anInt3135 <= local678.aClass106_1.anInt3135 - (local485 - local76 >> 7)) {
										Static167.method3040(local757);
										local757.anInt5364 = Static283.anInt5563;
									}
								}
							}
							for (local88 = 0; local88 < Static22.anInt472; local88++) {
								@Pc(857) Class4_Sub5_Sub2_Sub1 local857 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local88]];
								if (local857 != null && local857.anInt5364 != Static283.anInt5563 && local857.aBoolean447) {
									local485 = local857.anInt6631 - (local857.method4807() - 1) * 64;
									local497 = local857.anInt6632 + 64 - local857.method4807() * 64;
									if (local67 <= local485 && local857.method4807() <= local678.aClass106_1.anInt3135 - (local485 - local67 >> 7) && local76 <= local497 && local857.method4807() <= local678.aClass106_1.anInt3135 - (local497 - local76 >> 7)) {
										Static262.method4617(local857);
										local857.anInt5364 = Static283.anInt5563;
									}
								}
							}
						}
						if (Static283.anInt5563 == local678.anInt5364) {
							continue;
						}
						Static167.method3040(local678);
						local678.anInt5364 = Static283.anInt5563;
					}
				}
				if (local356.aClass4_1 instanceof Class4_Sub2_Sub1) {
					@Pc(991) Class5_Sub29 local991 = (Class5_Sub29) Static343.aClass190_33.method5466((long) (local356.anInt4088 | local356.anInt4089 << 28 | local356.anInt4091 << 14));
					if (local991 != null) {
						for (@Pc(999) Class5_Sub27 local999 = (Class5_Sub27) local991.aClass103_113.method2746(); local999 != null; local999 = (Class5_Sub27) local991.aClass103_113.method2754()) {
							@Pc(1006) Class130 local1006 = Static322.method544(local999.anInt4335);
							if (Static54.aBoolean72) {
								@Pc(1139) Class5_Sub1_Sub17 local1139 = Static280.anInt5514 == -1 ? null : Static86.method1559(Static280.anInt5514);
								if ((Static5.anInt93 & 0x1) != 0 && (local1139 == null || local1006.method3444(Static280.anInt5514, local1139.anInt5597) != local1139.anInt5597)) {
									Static30.method540(Static255.aString49, 9, local356.anInt4088, (long) local999.anInt4335, local356.anInt4091, Static169.anInt6216, Static230.aString42 + " -> <col=ff9040>" + local1006.aString26);
								}
							} else {
								@Pc(1011) String[] local1011 = local1006.aStringArray46;
								for (local88 = 4; local88 >= 0; local88--) {
									if (local1011 != null && local1011[local88] != null) {
										@Pc(1023) byte local1023 = 0;
										local485 = Static314.anInt6099;
										if (local88 == 0) {
											local1023 = 11;
										}
										if (local88 == 1) {
											local1023 = 45;
										}
										if (local88 == 2) {
											local1023 = 22;
										}
										if (local88 == 3) {
											local1023 = 51;
										}
										if (local88 == local1006.anInt3858) {
											local485 = local1006.anInt3869;
										}
										if (local88 == 4) {
											local1023 = 12;
										}
										if (local1006.anInt3855 == local88) {
											local485 = local1006.anInt3853;
										}
										Static30.method540(local1011[local88], local1023, local356.anInt4088, (long) local999.anInt4335, local356.anInt4091, local485, "<col=ff9040>" + local1006.aString26);
									}
								}
								Static30.method540(Static138.aClass85_66.method2020(Static41.anInt726), 1008, local356.anInt4088, (long) local999.anInt4335, local356.anInt4091, Static51.anInt965, "<col=ff9040>" + local1006.aString26);
							}
						}
					}
				}
				if (local356.aClass4_1 instanceof Interface5) {
					@Pc(1202) Interface5 local1202 = (Interface5) local356.aClass4_1;
					@Pc(1208) Class156 local1208 = Static111.method1967(local1202.method5910());
					if (local1208.anIntArray437 != null) {
						local1208 = local1208.method4232();
					}
					if (local1208 != null) {
						if (Static54.aBoolean72) {
							@Pc(1229) Class5_Sub1_Sub17 local1229 = Static280.anInt5514 == -1 ? null : Static86.method1559(Static280.anInt5514);
							if ((Static5.anInt93 & 0x4) != 0 && (local1229 == null || local1208.method4223(Static280.anInt5514, local1229.anInt5597) != local1229.anInt5597)) {
								Static30.method540(Static255.aString49, 59, local356.anInt4088, Static221.method4025(local356.anInt4088, local1202, local356.anInt4091), local356.anInt4091, Static169.anInt6216, Static230.aString42 + " -> <col=00ffff>" + local1208.aString43);
							}
						} else {
							@Pc(1283) String[] local1283 = local1208.aStringArray50;
							if (local1283 != null) {
								for (local79 = 4; local79 >= 0; local79--) {
									if (local1283[local79] != null) {
										@Pc(1295) short local1295 = 0;
										if (local79 == 0) {
											local1295 = 21;
										}
										local97 = Static314.anInt6099;
										if (local79 == 1) {
											local1295 = 60;
										}
										if (local79 == 2) {
											local1295 = 58;
										}
										if (local79 == 3) {
											local1295 = 3;
										}
										if (local1208.anInt4734 == local79) {
											local97 = local1208.anInt4740;
										}
										if (local79 == 4) {
											local1295 = 1001;
										}
										if (local1208.anInt4758 == local79) {
											local97 = local1208.anInt4770;
										}
										Static30.method540(local1283[local79], local1295, local356.anInt4088, Static221.method4025(local356.anInt4088, local1202, local356.anInt4091), local356.anInt4091, local97, "<col=00ffff>" + local1208.aString43);
									}
								}
							}
							Static30.method540(Static138.aClass85_66.method2020(Static41.anInt726), 1011, local356.anInt4088, (long) local1208.lb, local356.anInt4091, Static51.anInt965, "<col=00ffff>" + local1208.aString43);
						}
					}
				}
			}
		}
	}
}
