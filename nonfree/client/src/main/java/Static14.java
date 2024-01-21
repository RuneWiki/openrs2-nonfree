import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bd", name = "ub", descriptor = "I")
	public static int anInt475;

	@OriginalMember(owner = "client!bd", name = "xb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_227 = Static146.method2172("Checking for updates )2 ");

	@OriginalMember(owner = "client!bd", name = "tb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_225 = aClass77_227;

	@OriginalMember(owner = "client!bd", name = "vb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_226 = Static146.method2172("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!bd", name = "wb", descriptor = "I")
	public static int anInt476 = -1;

	@OriginalMember(owner = "client!bd", name = "Bb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_228 = Static146.method2172("Sprites geladen)3");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[Lclient!qf;IIIIBII)V")
	public static void method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static113.method1244(arg0, arg1, arg6, arg5);
		Static12.method256();
		for (@Pc(27) int local27 = 0; local27 < arg2.length; local27++) {
			@Pc(33) Class66 local33 = arg2[local27];
			if (local33 != null && (local33.anInt3237 == arg7 || arg7 == -1412584499 && Static34.aClass66_5 == local33)) {
				@Pc(59) int local59;
				if (arg4 == -1) {
					Static56.anIntArray233[Static176.anInt4482] = arg8 + local33.anInt3184;
					Static74.anIntArray330[Static176.anInt4482] = local33.anInt3242 + arg3;
					Static94.anIntArray385[Static176.anInt4482] = local33.anInt3227;
					Static98.anIntArray396[Static176.anInt4482] = local33.anInt3168;
					local59 = Static176.anInt4482++;
				} else {
					local59 = arg4;
				}
				local33.anInt3213 = local59;
				local33.anInt3180 = Static143.anInt3513;
				if (!local33.aBoolean131 || !Static164.method2754(local33)) {
					if (local33.anInt3224 > 0) {
						Static104.method1829(local33);
					}
					@Pc(120) int local120 = local33.anInt3184 + arg8;
					@Pc(123) int local123 = local33.anInt3241;
					@Pc(128) int local128 = local33.anInt3242 + arg3;
					@Pc(164) int local164;
					@Pc(158) int local158;
					if (Static34.aClass66_5 == local33) {
						if (arg7 != -1412584499 && !local33.aBoolean137) {
							Static167.anInt4137 = arg8;
							Static87.aClass66Array1 = arg2;
							Static8.anInt227 = arg3;
							continue;
						}
						if (!local33.aBoolean137) {
							local123 = 128;
						}
						if (Static7.aBoolean8 && Static50.aBoolean70) {
							local158 = Static132.anInt3185;
							local158 -= Static150.anInt3698;
							local164 = Static20.anInt631;
							local164 -= Static40.anInt1150;
							if (Static57.anInt4549 > local158) {
								local158 = Static57.anInt4549;
							}
							if (local164 < Static62.anInt1660) {
								local164 = Static62.anInt1660;
							}
							if (Static158.aClass66_13.anInt3168 + Static57.anInt4549 < local33.anInt3168 + local158) {
								local158 = Static158.aClass66_13.anInt3168 + Static57.anInt4549 - local33.anInt3168;
							}
							if (Static62.anInt1660 + Static158.aClass66_13.anInt3227 < local33.anInt3227 + local164) {
								local164 = Static62.anInt1660 + Static158.aClass66_13.anInt3227 - local33.anInt3227;
							}
							local128 = local158;
							local120 = local164;
						}
					}
					@Pc(297) int local297;
					@Pc(305) int local305;
					@Pc(237) int local237;
					@Pc(239) int local239;
					@Pc(244) int local244;
					@Pc(249) int local249;
					if (local33.anInt3230 == 2) {
						local297 = arg6;
						local158 = arg1;
						local305 = arg5;
						local164 = arg0;
					} else if (local33.anInt3230 == 9) {
						local237 = local120;
						local239 = local128;
						local244 = local33.anInt3227 + local120;
						local249 = local33.anInt3168 + local128;
						if (local244 < local120) {
							local237 = local244;
							local244 = local120;
						}
						local164 = local237 > arg0 ? local237 : arg0;
						local244++;
						if (local249 < local128) {
							local239 = local249;
							local249 = local128;
						}
						local158 = local239 <= arg1 ? arg1 : local239;
						local297 = local244 >= arg6 ? arg6 : local244;
						local249++;
						local305 = local249 >= arg5 ? arg5 : local249;
					} else {
						local158 = local128 <= arg1 ? arg1 : local128;
						local164 = arg0 < local120 ? local120 : arg0;
						local237 = local120 + local33.anInt3227;
						local297 = local237 >= arg6 ? arg6 : local237;
						local239 = local128 + local33.anInt3168;
						local305 = local239 >= arg5 ? arg5 : local239;
					}
					if (!local33.aBoolean131 || local164 < local297 && local158 < local305) {
						if (local33.anInt3224 != 0) {
							if (local33.anInt3224 == 1337) {
								Static152.anInt3725 = local128;
								Static160.anInt4574 = local120;
								Static128.method2195(local120, local128, local33.anInt3168, local33.anInt3227);
								Static113.method1244(arg0, arg1, arg6, arg5);
								continue;
							}
							if (local33.anInt3224 == 1338) {
								Static71.method1383(local120, local128, local59);
								Static113.method1244(arg0, arg1, arg6, arg5);
								continue;
							}
						}
						local237 = Static20.anInt631;
						local239 = Static132.anInt3185;
						if (!Static166.aBoolean181 && local237 >= local164 && local158 <= local239 && local297 > local237 && local239 < local305) {
							Static26.method524(local33, local239 - local128, local237 - local120);
						}
						if (local33.anInt3230 == 0) {
							if (!local33.aBoolean131 && Static164.method2754(local33) && local33 != Static112.aClass66_9) {
								continue;
							}
							if (!local33.aBoolean131) {
								if (local33.anInt3207 - local33.anInt3168 < local33.anInt3189) {
									local33.anInt3189 = local33.anInt3207 - local33.anInt3168;
								}
								if (local33.anInt3189 < 0) {
									local33.anInt3189 = 0;
								}
							}
							method324(local164, local158, arg2, local128 - local33.anInt3189, local59, local305, local297, local33.anInt3229, local120 - local33.anInt3218);
							if (local33.aClass66Array2 != null) {
								method324(local164, local158, local33.aClass66Array2, local128 - local33.anInt3189, local59, local305, local297, local33.anInt3229, local120 - local33.anInt3218);
							}
							@Pc(573) Class2_Sub10 local573 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local33.anInt3229);
							if (local573 != null) {
								if (local573.anInt1899 == 0 && local164 <= Static20.anInt631 && Static132.anInt3185 >= local158 && local297 > Static20.anInt631 && Static132.anInt3185 < local305 && !Static166.aBoolean181 && !Static150.aBoolean150) {
									Static131.anIntArray616[0] = 1007;
									Static18.anInt618 = 1;
									Static56.aClass77Array10[0] = Static181.aClass77_1563;
									Static136.aClass77Array20[0] = Static41.aClass77_468;
								}
								Static132.method2251(local297, local573.anInt1896, local120, local164, local158, local305, local59, local128);
							}
							Static113.method1244(arg0, arg1, arg6, arg5);
							Static12.method256();
						}
						if (Static152.aBooleanArray16[local59] || Static58.anInt1521 > 1) {
							if (local33.anInt3230 == 0 && !local33.aBoolean131 && local33.anInt3168 < local33.anInt3207) {
								Static103.method1800(local128, local33.anInt3168, local33.anInt3189, local33.anInt3207, local33.anInt3227 + local120);
							}
							if (local33.anInt3230 != 1) {
								@Pc(684) int local684;
								@Pc(696) int local696;
								@Pc(822) int local822;
								@Pc(740) int local740;
								@Pc(871) int local871;
								@Pc(869) int local869;
								@Pc(892) int local892;
								@Pc(705) int local705;
								@Pc(817) int local817;
								if (local33.anInt3230 == 2) {
									local244 = 0;
									for (local249 = 0; local249 < local33.anInt3168; local249++) {
										for (local684 = 0; local684 < local33.anInt3227; local684++) {
											local696 = (local33.anInt3236 + 32) * local684 + local120;
											local705 = (local33.anInt3172 + 32) * local249 + local128;
											if (local244 < 20) {
												local696 += local33.anIntArray470[local244];
												local705 += local33.anIntArray466[local244];
											}
											if (local33.anIntArray468[local244] > 0) {
												local740 = local33.anIntArray468[local244] - 1;
												if (local696 + 32 > arg0 && arg6 > local696 && local705 + 32 > arg1 && arg5 > local705 || local33 == Static149.aClass66_12 && local244 == Static124.anInt3033) {
													@Pc(791) Class2_Sub2_Sub3_Sub2 local791;
													if (Static124.anInt3041 == 1 && local244 == Static80.anInt2087 && Static154.anInt3837 == local33.anInt3229) {
														local791 = Static72.method1391(local740, local33.anIntArray474[local244], false, 0, 2);
													} else {
														local791 = Static72.method1391(local740, local33.anIntArray474[local244], false, 3153952, 1);
													}
													if (local791 == null) {
														Static57.method2994(local33);
													} else if (Static149.aClass66_12 == local33 && Static124.anInt3033 == local244) {
														local817 = Static20.anInt631 - Static132.anInt3177;
														local822 = Static132.anInt3185 - Static62.anInt1661;
														if (local822 < 5 && local822 > -5) {
															local822 = 0;
														}
														if (local817 < 5 && local817 > -5) {
															local817 = 0;
														}
														if (Static45.anInt1191 < 5) {
															local817 = 0;
															local822 = 0;
														}
														local791.method405(local817 + local696, local705 + local822, 128);
														if (arg7 != -1) {
															@Pc(867) Class66 local867 = arg2[arg7 & 0xFFFF];
															local869 = Static113.anInt1739;
															local871 = Static113.anInt1737;
															if (local705 + local822 < local871 && local867.anInt3189 > 0) {
																local892 = Static131.anInt4359 * (local871 - local705 - local822) / 3;
																if (local892 > Static131.anInt4359 * 10) {
																	local892 = Static131.anInt4359 * 10;
																}
																if (local867.anInt3189 < local892) {
																	local892 = local867.anInt3189;
																}
																Static62.anInt1661 += local892;
																local867.anInt3189 -= local892;
																Static57.method2994(local867);
															}
															if (local869 < local822 + local705 + 32 && local867.anInt3189 < local867.anInt3207 - local867.anInt3168) {
																local892 = Static131.anInt4359 * (local705 + local822 + 32 - local869) / 3;
																if (local892 > Static131.anInt4359 * 10) {
																	local892 = Static131.anInt4359 * 10;
																}
																if (local867.anInt3207 - local867.anInt3168 - local867.anInt3189 < local892) {
																	local892 = local867.anInt3207 - local867.anInt3168 - local867.anInt3189;
																}
																local867.anInt3189 += local892;
																Static62.anInt1661 -= local892;
																Static57.method2994(local867);
															}
														}
													} else if (local33 == Static111.aClass66_8 && Static64.anInt1796 == local244) {
														local791.method405(local696, local705, 128);
													} else {
														local791.method401(local696, local705);
													}
												}
											} else if (local33.anIntArray472 != null && local244 < 20) {
												@Pc(1037) Class2_Sub2_Sub3_Sub2 local1037 = local33.method2254(local244);
												if (local1037 != null) {
													local1037.method401(local696, local705);
												} else if (Static15.aBoolean20) {
													Static57.method2994(local33);
												}
											}
											local244++;
										}
									}
								} else if (local33.anInt3230 == 3) {
									if (Static17.method436(local33)) {
										local244 = local33.anInt3167;
										if (Static112.aClass66_9 == local33 && local33.anInt3215 != 0) {
											local244 = local33.anInt3215;
										}
									} else {
										local244 = local33.anInt3210;
										if (Static112.aClass66_9 == local33 && local33.anInt3214 != 0) {
											local244 = local33.anInt3214;
										}
									}
									if (local123 == 0) {
										if (local33.aBoolean134) {
											Static113.method1243(local120, local128, local33.anInt3227, local33.anInt3168, local244);
										} else {
											Static113.method1250(local120, local128, local33.anInt3227, local33.anInt3168, local244);
										}
									} else if (local33.aBoolean134) {
										Static113.method1246(local120, local128, local33.anInt3227, local33.anInt3168, local244, 256 - (local123 & 0xFF));
									} else {
										Static113.method1242(local120, local128, local33.anInt3227, local33.anInt3168, local244, 256 - (local123 & 0xFF));
									}
								} else {
									@Pc(1168) Class2_Sub2_Sub3_Sub4_Sub1 local1168;
									if (local33.anInt3230 == 4) {
										local1168 = local33.method2240();
										if (local1168 != null) {
											@Pc(1180) Class77 local1180 = local33.aClass77_1159;
											if (Static17.method436(local33)) {
												local249 = local33.anInt3167;
												if (Static112.aClass66_9 == local33 && local33.anInt3215 != 0) {
													local249 = local33.anInt3215;
												}
												if (local33.aClass77_1162.method2532() > 0) {
													local1180 = local33.aClass77_1162;
												}
											} else {
												local249 = local33.anInt3210;
												if (local33 == Static112.aClass66_9 && local33.anInt3214 != 0) {
													local249 = local33.anInt3214;
												}
											}
											if (local33.aBoolean131 && local33.anInt3240 != -1) {
												@Pc(1243) Class2_Sub2_Sub9 local1243 = Static158.method2689(local33.anInt3240);
												local1180 = local1243.aClass77_717;
												if (local1180 == null) {
													local1180 = Static56.aClass77_601;
												}
												if ((local1243.anInt1795 == 1 || local33.anInt3239 != 1) && local33.anInt3239 != -1) {
													local1180 = Static146.method2168(new Class77[] { Static98.aClass77_960, local1180, Static17.aClass77_266, Static92.method1679(local33.anInt3239) });
												}
											}
											if (Static49.aClass66_6 == local33) {
												local249 = local33.anInt3210;
												local1180 = Static30.aClass77_361;
											}
											if (!local33.aBoolean131) {
												local1180 = Static34.method704(local1180, local33);
											}
											local1168.method1272(local1180, local120, local128, local33.anInt3227, local33.anInt3168, local249, local33.aBoolean129 ? 0 : -1, local33.anInt3221, local33.anInt3198, local33.anInt3223);
										} else if (Static15.aBoolean20) {
											Static57.method2994(local33);
										}
									} else if (local33.anInt3230 == 5) {
										@Pc(1349) Class2_Sub2_Sub3_Sub2 local1349;
										if (local33.aBoolean131) {
											if (local33.anInt3240 == -1) {
												local1349 = local33.method2241(false);
											} else {
												local1349 = Static72.method1391(local33.anInt3240, local33.anInt3239, false, local33.anInt3176, local33.anInt3190);
											}
											if (local1349 != null) {
												local249 = local1349.anInt572;
												local684 = local1349.anInt569;
												if (local33.aBoolean136) {
													Static113.method1245(local120, local128, local120 + local33.anInt3227, local128 - -local33.anInt3168);
													local705 = (local684 + local33.anInt3168 - 1) / local684;
													local696 = (local249 + local33.anInt3227 - 1) / local249;
													for (local817 = 0; local817 < local696; local817++) {
														for (local822 = 0; local822 < local705; local822++) {
															if (local33.anInt3231 != 0) {
																local1349.method407(local120 + local249 * local817 + local249 / 2, local684 * local822 + local128 + local684 / 2, local33.anInt3231, 4096);
															} else if (local123 == 0) {
																local1349.method401(local120 + local817 * local249, local684 * local822 + local128);
															} else {
																local1349.method405(local120 + local817 * local249, local684 * local822 + local128, 256 - (local123 & 0xFF));
															}
														}
													}
													Static113.method1244(arg0, arg1, arg6, arg5);
												} else {
													local696 = local33.anInt3227 * 4096 / local249;
													if (local33.anInt3231 != 0) {
														local1349.method407(local33.anInt3227 / 2 + local120, local128 - -(local33.anInt3168 / 2), local33.anInt3231, local696);
													} else if (local123 != 0) {
														local1349.method395(local120, local128, local33.anInt3227, local33.anInt3168, 256 - (local123 & 0xFF));
													} else if (local249 == local33.anInt3227 && local684 == local33.anInt3168) {
														local1349.method401(local120, local128);
													} else {
														local1349.method386(local120, local128, local33.anInt3227, local33.anInt3168);
													}
												}
											} else if (Static15.aBoolean20) {
												Static57.method2994(local33);
											}
										} else {
											local1349 = local33.method2241(Static17.method436(local33));
											if (local1349 != null) {
												local1349.method401(local120, local128);
											} else if (Static15.aBoolean20) {
												Static57.method2994(local33);
											}
										}
									} else {
										@Pc(1643) Class2_Sub2_Sub9 local1643;
										if (local33.anInt3230 == 6) {
											@Pc(1618) Class2_Sub2_Sub1_Sub2 local1618 = null;
											@Pc(1622) boolean local1622 = Static17.method436(local33);
											if (local1622) {
												local249 = local33.anInt3238;
											} else {
												local249 = local33.anInt3206;
											}
											local696 = 0;
											if (local33.anInt3240 != -1) {
												local1643 = Static158.method2689(local33.anInt3240);
												if (local1643 != null) {
													local1643 = local1643.method1309(local33.anInt3239);
													local1618 = local1643.method1299(1, null, 0);
													if (local1618 == null) {
														Static57.method2994(local33);
													} else {
														local1618.method592();
														local696 = -local1618.aShort32 / 2;
													}
												}
											} else if (local33.anInt3187 == 5) {
												if (local33.anInt3183 == -1) {
													local1618 = Static56.aClass1_1.method9(-1, null, null, -1);
												} else {
													local705 = local33.anInt3183 & 0x7FF;
													if (Static181.anInt4599 == local705) {
														local705 = 2047;
													}
													@Pc(1710) Class2_Sub2_Sub1_Sub6_Sub1 local1710 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local705];
													@Pc(1720) Class2_Sub2_Sub15 local1720 = local249 == -1 ? null : Static140.method2333(local249);
													if (local1710 != null && (int) local1710.aClass77_1482.method2531() << 11 == (local33.anInt3183 & 0xFFFFF800)) {
														local1618 = local1710.aClass1_2.method9(local33.anInt3209, null, local1720, 0);
													}
												}
											} else if (local249 == -1) {
												local1618 = local33.method2249(null, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass1_2, -1, local1622);
												if (local1618 == null && Static15.aBoolean20) {
													Static57.method2994(local33);
												}
											} else {
												@Pc(1757) Class2_Sub2_Sub15 local1757 = Static140.method2333(local249);
												local1618 = local33.method2249(local1757, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass1_2, local33.anInt3209, local1622);
												if (local1618 == null && Static15.aBoolean20) {
													Static57.method2994(local33);
												}
											}
											if (local1618 != null) {
												Static12.method249(local33.anInt3244 + local120 + local33.anInt3227 / 2, local33.anInt3202 + (local128 - -(local33.anInt3168 / 2)));
												local705 = local33.anInt3243 * Class2_Sub2_Sub3_Sub1.anIntArray50[local33.anInt3235] >> 16;
												local817 = local33.anInt3243 * Class2_Sub2_Sub3_Sub1.anIntArray52[local33.anInt3235] >> 16;
												if (!local33.aBoolean131) {
													local1618.method591(local33.anInt3220, 0, local33.anInt3235, 0, local705, local817);
												} else if (local33.aBoolean138) {
													local1618.method588(local33.anInt3220, local33.anInt3205, local33.anInt3235, local33.anInt3196, local33.anInt3179 + local705 + local696, local33.anInt3179 + local817, local33.anInt3243);
												} else {
													local1618.method591(local33.anInt3220, local33.anInt3205, local33.anInt3235, local33.anInt3196, local33.anInt3179 + local705 + local696, local33.anInt3179 + local817);
												}
												Static12.method239();
											}
										} else {
											if (local33.anInt3230 == 7) {
												local1168 = local33.method2240();
												if (local1168 == null) {
													if (Static15.aBoolean20) {
														Static57.method2994(local33);
													}
													continue;
												}
												local249 = 0;
												for (local684 = 0; local684 < local33.anInt3168; local684++) {
													for (local696 = 0; local696 < local33.anInt3227; local696++) {
														if (local33.anIntArray468[local249] > 0) {
															local1643 = Static158.method2689(local33.anIntArray468[local249] - 1);
															@Pc(1991) Class77 local1991;
															if (local1643.anInt1795 != 1 && local33.anIntArray474[local249] == 1) {
																local1991 = Static146.method2168(new Class77[] { Static98.aClass77_960, local1643.aClass77_717, Static87.aClass77_893 });
															} else {
																local1991 = Static146.method2168(new Class77[] { Static98.aClass77_960, local1643.aClass77_717, Static17.aClass77_266, Static92.method1679(local33.anIntArray474[local249]) });
															}
															local740 = (local33.anInt3172 + 12) * local684 + local128;
															local822 = local696 * (local33.anInt3236 + 115) + local120;
															if (local33.anInt3221 == 0) {
																local1168.method1256(local1991, local822, local740, local33.anInt3210, local33.aBoolean129 ? 0 : -1);
															} else if (local33.anInt3221 == 1) {
																local1168.method1255(local1991, local33.anInt3227 / 2 + local822, local740, local33.anInt3210, local33.aBoolean129 ? 0 : -1);
															} else {
																local1168.method1266(local1991, local33.anInt3227 + local822 - 1, local740, local33.anInt3210, local33.aBoolean129 ? 0 : -1);
															}
														}
														local249++;
													}
												}
											}
											@Pc(2280) int local2280;
											if (local33.anInt3230 == 8 && local33 == Static9.aClass66_1 && Static112.anInt2797 == Static179.anInt4564) {
												local249 = 0;
												@Pc(2125) Class2_Sub2_Sub3_Sub4_Sub1 local2125 = Static85.aClass2_Sub2_Sub3_Sub4_Sub1_3;
												local244 = 0;
												@Pc(2130) Class77 local2130 = local33.aClass77_1159;
												local2130 = Static34.method704(local2130, local33);
												@Pc(2154) Class77 local2154;
												while (local2130.method2532() > 0) {
													local817 = local2130.method2514(Static163.aClass77_1366);
													if (local817 == -1) {
														local2154 = local2130;
														local2130 = Static41.aClass77_468;
													} else {
														local2154 = local2130.method2530(0, local817);
														local2130 = local2130.method2504(local817 + 4);
													}
													local822 = local2125.method1276(local2154);
													local249 += local2125.anInt1744 + 1;
													if (local244 < local822) {
														local244 = local822;
													}
												}
												local249 += 7;
												local822 = local33.anInt3168 + local128 + 5;
												local244 += 6;
												local817 = local120 + local33.anInt3227 - local244 - 5;
												if (arg5 < local822 + local249) {
													local822 = arg5 - local249;
												}
												if (local817 < local120 + 5) {
													local817 = local120 + 5;
												}
												if (local244 + local817 > arg6) {
													local817 = arg6 - local244;
												}
												Static113.method1243(local817, local822, local244, local249, 16777120);
												Static113.method1250(local817, local822, local244, local249, 0);
												local740 = local2125.anInt1744 + local822 + 2;
												local2130 = local33.aClass77_1159;
												local2130 = Static34.method704(local2130, local33);
												while (local2130.method2532() > 0) {
													local2280 = local2130.method2514(Static163.aClass77_1366);
													if (local2280 == -1) {
														local2154 = local2130;
														local2130 = Static41.aClass77_468;
													} else {
														local2154 = local2130.method2530(0, local2280);
														local2130 = local2130.method2504(local2280 + 4);
													}
													local2125.method1256(local2154, local817 + 3, local740, 0, -1);
													local740 += local2125.anInt1744 + 1;
												}
											}
											if (local33.anInt3230 == 9) {
												if (local33.anInt3192 == 1) {
													Static113.method1249(local120, local128, local120 + local33.anInt3227, local33.anInt3168 + local128, local33.anInt3210);
												} else {
													local249 = local33.anInt3168 >= 0 ? local33.anInt3168 : -local33.anInt3168;
													local244 = local33.anInt3227 < 0 ? -local33.anInt3227 : local33.anInt3227;
													local684 = local244;
													if (local244 < local249) {
														local684 = local249;
													}
													if (local684 != 0) {
														local705 = (local33.anInt3168 << 16) / local684;
														local696 = (local33.anInt3227 << 16) / local684;
														if (local696 >= local705) {
															local696 = -local696;
														} else {
															local705 = -local705;
														}
														local817 = local33.anInt3192 * local705 >> 17;
														local822 = local33.anInt3192 * local705 + 1 >> 17;
														local740 = local33.anInt3192 * local696 >> 17;
														local2280 = local33.anInt3192 * local696 + 1 >> 17;
														@Pc(2442) int local2442 = local120 - arg0;
														local869 = local2442 + local817;
														local871 = local128 - arg1;
														local892 = local2442 - local822;
														@Pc(2464) int local2464 = local2442 + local33.anInt3227 - local822;
														@Pc(2469) int local2469 = local871 - local2280;
														@Pc(2473) int local2473 = local740 + local871;
														@Pc(2482) int local2482 = local2442 + local33.anInt3227 + local817;
														@Pc(2490) int local2490 = local33.anInt3168 + local871 - local2280;
														@Pc(2497) int local2497 = local871 + local33.anInt3168 + local740;
														Static12.method255(local869, local892, local2464);
														Static12.method250(local2473, local2469, local2490, local869, local892, local2464, local33.anInt3210);
														Static12.method255(local869, local2464, local2482);
														Static12.method250(local2473, local2490, local2497, local869, local2464, local2482, local33.anInt3210);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZILclient!ih;)V")
	public static void method325(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		@Pc(10) int local10 = arg1.anInt1896;
		@Pc(14) int local14 = (int) arg1.aLong134;
		arg1.method3004();
		if (arg0) {
			Static110.method2347(local10);
		}
		Static54.method1032(local10);
		@Pc(29) Class66 local29 = Static55.method1034(local14);
		if (local29 != null) {
			Static57.method2994(local29);
		}
		Static18.anInt618 = 0;
		Static166.aBoolean181 = false;
		Static5.method100(Static156.anInt3881, Static64.anInt1811, Static17.anInt608, Static147.anInt3576);
		if (Static93.anInt2394 != -1) {
			Static175.method2950(Static93.anInt2394, 1);
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
	public static void method326() {
		aClass77_226 = null;
		aClass77_228 = null;
		aClass77_227 = null;
		aClass77_225 = null;
	}
}
