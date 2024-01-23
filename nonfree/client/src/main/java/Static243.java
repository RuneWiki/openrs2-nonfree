import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!ho;")
	public static Class3_Sub4_Sub12 aClass3_Sub4_Sub12_5;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Lclient!rg;")
	public static Class151 aClass151_16;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString172 = "glow2:";

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "[I")
	public static int[] anIntArray534 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public static void method4111() {
		Static287.anInt5742 = 0;
		Static108.anInt2014 = -1;
		Static144.anInt4823 = 0;
		Static118.aBoolean169 = false;
		Static252.anInt5210 = -1;
		Static152.anInt2876 = 0;
		Static179.anInt3342 = -1;
		Static255.anInt5252 = -1;
		Static222.anInt4338 = 0;
		Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
		Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
		Static295.method4153();
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static52.aClass10_Sub5_Sub1Array1.length; local33++) {
			if (Static52.aClass10_Sub5_Sub1Array1[local33] != null) {
				Static52.aClass10_Sub5_Sub1Array1[local33].anInt5076 = -1;
			}
		}
		for (local33 = 0; local33 < Static110.aClass10_Sub5_Sub2Array1.length; local33++) {
			if (Static110.aClass10_Sub5_Sub2Array1[local33] != null) {
				Static110.aClass10_Sub5_Sub2Array1[local33].anInt5076 = -1;
			}
		}
		Static52.method821();
		Static25.anInt467 = 1;
		Static264.method4398(30);
		for (local33 = 0; local33 < 100; local33++) {
			Static292.aBooleanArray129[local33] = true;
		}
		Static191.method3186();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIZIII[Lclient!rg;)V")
	public static void method4112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class151[] arg8) {
		if (Static283.aBoolean393) {
			Static234.method3975(arg6, arg5, arg7, arg1);
		} else {
			Static143.method2449(arg6, arg5, arg7, arg1);
			Static16.method272();
		}
		for (@Pc(22) int local22 = 0; local22 < arg8.length; local22++) {
			@Pc(36) Class151 local36 = arg8[local22];
			if (local36 != null && (arg2 == local36.anInt4727 || arg2 == -1412584499 && Static191.aClass151_10 == local36)) {
				@Pc(60) int local60;
				if (arg0 == -1) {
					Static150.anIntArray329[Static123.anInt2326] = arg3 + local36.anInt4756;
					Static73.anIntArray134[Static123.anInt2326] = arg4 + local36.anInt4730;
					Static125.anIntArray288[Static123.anInt2326] = local36.anInt4773;
					Static278.anIntArray540[Static123.anInt2326] = local36.anInt4751;
					local60 = Static123.anInt2326++;
				} else {
					local60 = arg0;
				}
				local36.anInt4716 = local60;
				local36.anInt4733 = Static124.anInt2371;
				if (!local36.aBoolean328 || !Static42.method629(local36)) {
					if (local36.anInt4797 > 0) {
						Static125.method2164(local36);
					}
					@Pc(119) int local119 = local36.anInt4756 + arg3;
					@Pc(124) int local124 = local36.anInt4730 + arg4;
					@Pc(127) int local127 = local36.anInt4758;
					if (Static244.aBoolean346 && (Static42.method612(local36).anInt5831 != 0 || local36.anInt4721 == 0) && local127 > 127) {
						local127 = 127;
					}
					@Pc(175) int local175;
					@Pc(173) int local173;
					if (Static191.aClass151_10 == local36) {
						if (arg2 != -1412584499 && !local36.aBoolean335) {
							Static190.aClass151Array1 = arg8;
							Static109.anInt2943 = arg3;
							Static146.anInt5854 = arg4;
							continue;
						}
						if (Static255.aBoolean363 && Static306.aBoolean429) {
							local173 = Static153.anInt2892;
							local175 = Static167.anInt3153;
							local173 -= Static39.anInt682;
							if (Static49.anInt947 > local173) {
								local173 = Static49.anInt947;
							}
							if (local173 + local36.anInt4751 > Static168.aClass151_6.anInt4751 + Static49.anInt947) {
								local173 = Static168.aClass151_6.anInt4751 + Static49.anInt947 - local36.anInt4751;
							}
							local175 -= Static152.anInt2868;
							if (Static276.anInt5570 > local175) {
								local175 = Static276.anInt5570;
							}
							if (Static276.anInt5570 + Static168.aClass151_6.anInt4773 < local175 - -local36.anInt4773) {
								local175 = Static276.anInt5570 + Static168.aClass151_6.anInt4773 - local36.anInt4773;
							}
							local119 = local175;
							local124 = local173;
						}
						if (!local36.aBoolean335) {
							local127 = 128;
						}
					}
					@Pc(253) int local253;
					@Pc(251) int local251;
					@Pc(283) int local283;
					@Pc(271) int local271;
					if (local36.anInt4721 == 2) {
						local251 = arg1;
						local253 = arg7;
						local175 = arg6;
						local173 = arg5;
					} else {
						local173 = arg5 >= local124 ? arg5 : local124;
						local271 = local36.anInt4751 + local124;
						local175 = arg6 >= local119 ? arg6 : local119;
						local283 = local119 + local36.anInt4773;
						if (local36.anInt4721 == 9) {
							local283++;
							local271++;
						}
						local251 = local271 < arg1 ? local271 : arg1;
						local253 = arg7 <= local283 ? arg7 : local283;
					}
					if (!local36.aBoolean328 || local175 < local253 && local251 > local173) {
						@Pc(451) int local451;
						@Pc(487) int local487;
						@Pc(512) int local512;
						@Pc(574) int local574;
						@Pc(591) int local591;
						@Pc(516) int local516;
						@Pc(545) int local545;
						@Pc(556) int local556;
						if (local36.anInt4797 != 0) {
							if (local36.anInt4797 == 1337 || local36.anInt4797 == 1403) {
								Static93.anInt1704 = local119;
								Static186.aClass151_9 = local36;
								Static38.anInt673 = local124;
								Static241.method4088(local36.anInt4797 == 1403, local36.anInt4751, local119, local124, local36.anInt4773);
								Static292.aBooleanArray129[local60] = true;
								if (Static283.aBoolean393) {
									Static234.method3975(arg6, arg5, arg7, arg1);
								} else {
									Static143.method2449(arg6, arg5, arg7, arg1);
								}
								continue;
							}
							if (local36.anInt4797 == 1338) {
								if (!local36.method4005()) {
									continue;
								}
								Static107.method1714(local119, local36, local60, local124);
								if (Static283.aBoolean393) {
									Static234.method3975(arg6, arg5, arg7, arg1);
								} else {
									Static143.method2449(arg6, arg5, arg7, arg1);
								}
								if (Static230.anInt4489 != 0 && Static230.anInt4489 != 3 || Static118.aBoolean169 || local175 > Static216.anInt4245 || local173 > Static79.anInt1910 || local253 <= Static216.anInt4245 || local251 <= Static79.anInt1910) {
									continue;
								}
								local271 = Static79.anInt1910 - local124;
								local451 = local36.anIntArray509[local271];
								local283 = Static216.anInt4245 - local119;
								if (local283 < local451 || local36.anIntArray523[local271] + local451 < local283) {
									continue;
								}
								if (Static25.anInt467 == 4) {
									local487 = (int) Static84.aFloat21 & 0x7FF;
								} else {
									local487 = Static241.anInt4889 + (int) Static84.aFloat21 & 0x7FF;
								}
								local271 -= local36.anInt4751 / 2;
								local283 -= local36.anInt4773 / 2;
								local512 = Class11.anIntArray26[local487];
								local516 = Class11.anIntArray27[local487];
								if (Static25.anInt467 != 4) {
									local516 = (Static125.anInt2421 + 256) * local516 >> 8;
									local512 = (Static125.anInt2421 + 256) * local512 >> 8;
								}
								local545 = local512 * local271 + local283 * local516 >> 11;
								local556 = local516 * local271 - local512 * local283 >> 11;
								if (Static25.anInt467 == 4) {
									local591 = Static306.anInt6010 - local556 >> 7;
									local574 = Static224.anInt6078 + local545 >> 7;
								} else {
									local574 = local545 + Static136.aClass10_Sub5_Sub1_1.anInt5073 - (Static136.aClass10_Sub5_Sub1_1.method4186() - 1) * 64 >> 7;
									local591 = Static136.aClass10_Sub5_Sub1_1.anInt5016 + 64 - local556 - Static136.aClass10_Sub5_Sub1_1.method4186() * 64 >> 7;
								}
								if (Static39.aBoolean56 && (Static75.anInt1408 & 0x40) != 0) {
									@Pc(619) Class151 local619 = Static114.method5019(Static296.anInt5869, Static63.anInt1200);
									if (local619 == null) {
										Static178.method2939();
									} else {
										Static167.method2784((short) 32, " ->", local591, Static269.anInt5498, Static26.aString14, 1L, local574);
									}
									continue;
								}
								if (Static47.anInt5990 == 1) {
									Static167.method2784((short) 33, "", local591, -1, Static183.aString130, 1L, local574);
								}
								Static167.method2784((short) 49, "", local591, -1, Static54.aString40, 1L, local574);
								continue;
							}
							if (local36.anInt4797 == 1339) {
								if (local36.method4005()) {
									Static251.method4234(local36, local60, local119, local124);
									if (Static283.aBoolean393) {
										Static234.method3975(arg6, arg5, arg7, arg1);
									} else {
										Static143.method2449(arg6, arg5, arg7, arg1);
									}
								}
								continue;
							}
							if (local36.anInt4797 == 1400) {
								Static7.method134(local36.anInt4773, local36.anInt4751, local119, local124);
								Static292.aBooleanArray129[local60] = true;
								Static223.aBooleanArray102[local60] = true;
								if (Static283.aBoolean393) {
									Static234.method3975(arg6, arg5, arg7, arg1);
								} else {
									Static143.method2449(arg6, arg5, arg7, arg1);
								}
								continue;
							}
							if (local36.anInt4797 == 1401) {
								Static69.method1050(local119, local36.anInt4773, local124, local36.anInt4751);
								Static292.aBooleanArray129[local60] = true;
								Static223.aBooleanArray102[local60] = true;
								if (Static283.aBoolean393) {
									Static234.method3975(arg6, arg5, arg7, arg1);
								} else {
									Static143.method2449(arg6, arg5, arg7, arg1);
								}
								continue;
							}
							if (local36.anInt4797 == 1402) {
								if (!Static283.aBoolean393) {
									Static250.method4228(local119, local124);
									Static292.aBooleanArray129[local60] = true;
									Static223.aBooleanArray102[local60] = true;
								}
								continue;
							}
							if (local36.anInt4797 == 1405) {
								if (!Static95.aBoolean141) {
									continue;
								}
								local283 = local36.anInt4773 + local119;
								local271 = local124 + 15;
								Static248.aClass3_Sub4_Sub2_11.method3699("Fps:" + Static199.anInt3877, local283, local271, 16776960, -1);
								local271 += 15;
								@Pc(818) Runtime local818 = Runtime.getRuntime();
								local512 = 16776960;
								local487 = (int) ((local818.totalMemory() - local818.freeMemory()) / 1024L);
								if (local487 > 65536) {
									local512 = 16711680;
								}
								Static248.aClass3_Sub4_Sub2_11.method3699("Mem:" + local487 + "k", local283, local271, local512, -1);
								local271 += 15;
								if (Static283.aBoolean393) {
									local512 = 16776960;
									local516 = (Static189.anInt3720 + Static189.anInt3718 + Static189.anInt3721) / 1024;
									if (local516 > 65536) {
										local512 = 16711680;
									}
									Static248.aClass3_Sub4_Sub2_11.method3699("Card:" + local516 + "k", local283, local271, local512, -1);
									local271 += 15;
								}
								local516 = 0;
								local545 = 0;
								local556 = 0;
								for (local574 = 0; local574 < 29; local574++) {
									local516 += Static196.aClass4_Sub1Array1[local574].method3435();
									local545 += Static196.aClass4_Sub1Array1[local574].method3431();
									local556 += Static196.aClass4_Sub1Array1[local574].method3429();
								}
								local574 = local556 * 100 / local516;
								local591 = local545 * 10000 / local516;
								@Pc(966) String local966 = "Cache:" + Static305.method4916(0, (long) local591, 2, true) + "% (" + local574 + "%)";
								Static25.aClass3_Sub4_Sub2_4.method3699(local966, local283, local271, 16776960, -1);
								local271 += 12;
								if (Static71.anInt1300 > 0) {
									Static25.aClass3_Sub4_Sub2_4.method3699("Particles: " + Static71.anInt1299 + " / " + Static71.anInt1300, local283, local271, 16776960, -1);
								}
								local271 += 12;
								Static292.aBooleanArray129[local60] = true;
								Static223.aBooleanArray102[local60] = true;
								continue;
							}
							if (local36.anInt4797 == 1406) {
								Static148.anInt2815 = local119;
								Static146.anInt5855 = local124;
								Static278.aClass151_17 = local36;
								continue;
							}
						}
						if (!Static118.aBoolean169) {
							if (local36.anInt4721 == 0 && local36.aBoolean327 && local175 <= Static216.anInt4245 && local173 <= Static79.anInt1910 && local253 > Static216.anInt4245 && local251 > Static79.anInt1910 && !Static244.aBoolean346) {
								Static153.anIntArray332[0] = Static144.anInt4821;
								Static152.anInt2876 = 1;
								Static259.aShortArray87[0] = 1011;
								Static73.aStringArray13[0] = Static255.aString186;
								Static103.aStringArray19[0] = "";
							}
							if (local175 <= Static216.anInt4245 && Static79.anInt1910 >= local173 && local253 > Static216.anInt4245 && Static79.anInt1910 < local251) {
								Static40.method4956(Static216.anInt4245 - local119, local36, Static79.anInt1910 - local124);
							}
						}
						if (local36.anInt4721 == 0) {
							if (!local36.aBoolean328 && Static42.method629(local36) && Static166.aClass151_5 != local36) {
								continue;
							}
							if (!local36.aBoolean328) {
								if (local36.anInt4713 - local36.anInt4751 < local36.anInt4747) {
									local36.anInt4747 = local36.anInt4713 - local36.anInt4751;
								}
								if (local36.anInt4747 < 0) {
									local36.anInt4747 = 0;
								}
							}
							if (Static283.aBoolean393 && local36.anInt4797 == 1407) {
								Static30.method464(local119, local124, local36.anInt4773, local36.anInt4751);
							}
							method4112(local60, local251, local36.anInt4800, local119 - local36.anInt4757, local124 - local36.anInt4747, local173, local175, local253, arg8);
							if (local36.aClass151Array2 != null) {
								method4112(local60, local251, local36.anInt4800, local119 - local36.anInt4757, local124 - local36.anInt4747, local173, local175, local253, local36.aClass151Array2);
							}
							@Pc(1202) Class3_Sub3 local1202 = (Class3_Sub3) Static205.aClass30_23.method663((long) local36.anInt4800);
							if (local1202 != null) {
								if (local1202.anInt186 == 0 && !Static118.aBoolean169 && local175 <= Static216.anInt4245 && Static79.anInt1910 >= local173 && Static216.anInt4245 < local253 && Static79.anInt1910 < local251 && !Static244.aBoolean346) {
									Static259.aShortArray87[0] = 1011;
									Static152.anInt2876 = 1;
									Static153.anIntArray332[0] = Static144.anInt4821;
									Static73.aStringArray13[0] = Static255.aString186;
									Static103.aStringArray19[0] = "";
								}
								Static285.method4732(local119, local175, local173, local124, local1202.anInt183, local60, local251, local253);
							}
							if (Static283.aBoolean393 && local36.anInt4797 == 1407) {
								Static30.method460();
								Static28.aBoolean42 = true;
							}
							if (Static283.aBoolean393) {
								Static234.method3975(arg6, arg5, arg7, arg1);
							} else {
								Static143.method2449(arg6, arg5, arg7, arg1);
								Static16.method272();
							}
						}
						if (Static308.aBooleanArray134[local60] || Static111.anInt2048 > 1) {
							if (local36.anInt4721 == 0 && !local36.aBoolean328 && local36.anInt4713 > local36.anInt4751) {
								Static307.method4929(local36.anInt4747, local124, local36.anInt4751, local36.anInt4773 + local119, local36.anInt4713);
							}
							if (local36.anInt4721 != 1) {
								if (local36.anInt4721 == 2) {
									local283 = 0;
									for (local271 = 0; local271 < local36.anInt4792; local271++) {
										for (local451 = 0; local451 < local36.anInt4761; local451++) {
											local487 = local119 + local451 * (local36.anInt4723 + 32);
											local512 = local124 + (local36.anInt4771 + 32) * local271;
											if (local283 < 20) {
												local487 += local36.anIntArray513[local283];
												local512 += local36.anIntArray514[local283];
											}
											if (local36.anIntArray511[local283] > 0) {
												local556 = local36.anIntArray511[local283] - 1;
												if (local487 + 32 > arg6 && arg7 > local487 && arg5 < local512 + 32 && local512 < arg1 || local36 == Static73.aClass151_1 && Static94.anInt1708 == local283) {
													@Pc(1503) Class3_Sub4_Sub12 local1503;
													if (Static153.anInt2895 == 1 && Static17.anInt332 == local283 && Static265.anInt5507 == local36.anInt4800) {
														local1503 = Static61.method975(local36.anIntArray515[local283], local556, 0, 2, local36.aBoolean326, null);
													} else {
														local1503 = Static61.method975(local36.anIntArray515[local283], local556, 3153952, 1, local36.aBoolean326, null);
													}
													if (Static16.aBoolean27) {
														Static292.aBooleanArray129[local60] = true;
													}
													if (local1503 == null) {
														Static134.method3639(local36);
													} else if (Static73.aClass151_1 == local36 && local283 == Static94.anInt1708) {
														local516 = Static167.anInt3153 - Static235.anInt4700;
														if (local516 < 5 && local516 > -5) {
															local516 = 0;
														}
														local545 = Static153.anInt2892 - Static4.anInt4060;
														if (local545 < 5 && local545 > -5) {
															local545 = 0;
														}
														if (Static100.anInt1840 < 5) {
															local545 = 0;
															local516 = 0;
														}
														local1503.method4700(local516 + local487, local512 + local545, 128);
														if (arg2 != -1) {
															@Pc(1595) Class151 local1595 = arg8[arg2 & 0xFFFF];
															@Pc(1599) int local1599;
															@Pc(1601) int local1601;
															if (Static283.aBoolean393) {
																local1599 = Static234.anInt4687;
																local1601 = Static234.anInt4684;
															} else {
																local1599 = Static143.anInt2746;
																local1601 = Static143.anInt2744;
															}
															@Pc(1634) int local1634;
															if (local545 + local512 < local1599 && local1595.anInt4747 > 0) {
																local1634 = Static140.anInt2709 * (local1599 - local545 - local512) / 3;
																if (Static140.anInt2709 * 10 < local1634) {
																	local1634 = Static140.anInt2709 * 10;
																}
																if (local1634 > local1595.anInt4747) {
																	local1634 = local1595.anInt4747;
																}
																local1595.anInt4747 -= local1634;
																Static4.anInt4060 += local1634;
																Static134.method3639(local1595);
															}
															if (local1601 < local545 + local512 + 32 && local1595.anInt4747 < local1595.anInt4713 - local1595.anInt4751) {
																local1634 = Static140.anInt2709 * (local545 + local512 + 32 - local1601) / 3;
																if (local1634 > Static140.anInt2709 * 10) {
																	local1634 = Static140.anInt2709 * 10;
																}
																if (local1595.anInt4713 - local1595.anInt4747 - local1595.anInt4751 < local1634) {
																	local1634 = local1595.anInt4713 - local1595.anInt4747 - local1595.anInt4751;
																}
																Static4.anInt4060 -= local1634;
																local1595.anInt4747 += local1634;
																Static134.method3639(local1595);
															}
														}
													} else if (local36 == Static204.aClass151_11 && local283 == Static225.anInt4367) {
														local1503.method4700(local487, local512, 128);
													} else {
														local1503.method4697(local487, local512);
													}
												}
											} else if (local36.anIntArray517 != null && local283 < 20) {
												@Pc(1409) Class3_Sub4_Sub12 local1409 = local36.method4001(local283);
												if (local1409 != null) {
													local1409.method4697(local487, local512);
												} else if (Static292.aBoolean416) {
													Static134.method3639(local36);
												}
											}
											local283++;
										}
									}
								} else if (local36.anInt4721 == 3) {
									if (Static146.method4806(local36)) {
										local283 = local36.anInt4795;
										if (local36 == Static166.aClass151_5 && local36.anInt4752 != 0) {
											local283 = local36.anInt4752;
										}
									} else {
										local283 = local36.anInt4719;
										if (local36 == Static166.aClass151_5 && local36.anInt4754 != 0) {
											local283 = local36.anInt4754;
										}
									}
									if (local127 == 0) {
										if (local36.aBoolean330) {
											if (Static283.aBoolean393) {
												Static234.method3973(local119, local124, local36.anInt4773, local36.anInt4751, local283);
											} else {
												Static143.method2462(local119, local124, local36.anInt4773, local36.anInt4751, local283);
											}
										} else if (Static283.aBoolean393) {
											Static234.method3979(local119, local124, local36.anInt4773, local36.anInt4751, local283);
										} else {
											Static143.method2455(local119, local124, local36.anInt4773, local36.anInt4751, local283);
										}
									} else if (local36.aBoolean330) {
										if (Static283.aBoolean393) {
											Static234.method3974(local119, local124, local36.anInt4773, local36.anInt4751, local283, 256 - (local127 & 0xFF));
										} else {
											Static143.method2452(local119, local124, local36.anInt4773, local36.anInt4751, local283, 256 - (local127 & 0xFF));
										}
									} else if (Static283.aBoolean393) {
										Static234.method3972(local119, local124, local36.anInt4773, local36.anInt4751, local283, 256 - (local127 & 0xFF));
									} else {
										Static143.method2445(local119, local124, local36.anInt4773, local36.anInt4751, local283, 256 - (local127 & 0xFF));
									}
								} else {
									@Pc(1951) Class3_Sub4_Sub2 local1951;
									if (local36.anInt4721 == 4) {
										local1951 = local36.method4014(Static96.aClass81Array2);
										if (local1951 != null) {
											@Pc(1965) String local1965 = local36.aString163;
											if (Static146.method4806(local36)) {
												local271 = local36.anInt4795;
												if (Static166.aClass151_5 == local36 && local36.anInt4752 != 0) {
													local271 = local36.anInt4752;
												}
												if (local36.aString164.length() > 0) {
													local1965 = local36.aString164;
												}
											} else {
												local271 = local36.anInt4719;
												if (local36 == Static166.aClass151_5 && local36.anInt4754 != 0) {
													local271 = local36.anInt4754;
												}
											}
											if (local36.aBoolean328 && local36.anInt4786 != -1) {
												@Pc(2021) Class21 local2021 = Static133.method2309(local36.anInt4786);
												local1965 = local2021.aString18;
												if (local1965 == null) {
													local1965 = "null";
												}
												if ((local2021.anInt501 == 1 || local36.anInt4796 != 1) && local36.anInt4796 != -1) {
													local1965 = "<col=ff9040>" + local1965 + "</col> x" + Static244.method4129(local36.anInt4796);
												}
											}
											if (local36 == Static259.aClass151_18) {
												local271 = local36.anInt4719;
												local1965 = Static50.aString36;
											}
											if (!local36.aBoolean328) {
												local1965 = Static118.method1923(local1965, local36);
											}
											local1951.method3694(local1965, local119, local124, local36.anInt4773, local36.anInt4751, local271, local36.aBoolean321 ? 0 : -1, local36.anInt4802, local36.anInt4785, local36.anInt4766);
										} else if (Static292.aBoolean416) {
											Static134.method3639(local36);
										}
									} else if (local36.anInt4721 == 5) {
										@Pc(2125) Class3_Sub4_Sub12 local2125;
										if (!local36.aBoolean328) {
											local2125 = local36.method4000(Static146.method4806(local36));
											if (local2125 != null) {
												local2125.method4697(local119, local124);
											} else if (Static292.aBoolean416) {
												Static134.method3639(local36);
											}
										} else if (local36.anInt4769 >= 0) {
											@Pc(2603) Class167 local2603 = local36.method4015();
											if (Static283.aBoolean393) {
												local2603.method4354(0, local119, local124, local36.anInt4773, local36.anInt4751, local36.anInt4780, local36.anInt4755, 0);
											} else {
												local2603.method4353(0, local119, local124, local36.anInt4773, local36.anInt4751, local36.anInt4780, local36.anInt4755);
											}
										} else {
											if (local36.anInt4786 == -1) {
												local2125 = local36.method4000(false);
											} else if (local36.aBoolean324 && Static136.aClass10_Sub5_Sub1_1.aClass131_2 != null) {
												local2125 = Static61.method975(local36.anInt4796, local36.anInt4786, local36.anInt4793, local36.anInt4784, local36.aBoolean326, Static136.aClass10_Sub5_Sub1_1.aClass131_2);
											} else {
												local2125 = Static61.method975(local36.anInt4796, local36.anInt4786, local36.anInt4793, local36.anInt4784, local36.aBoolean326, null);
											}
											if (local2125 != null) {
												local271 = local2125.anInt5723;
												local451 = local2125.anInt5731;
												if (local36.aBoolean333) {
													local487 = (local36.anInt4773 + local271 - 1) / local271;
													local512 = (local36.anInt4751 + local451 - 1) / local451;
													if (Static283.aBoolean393) {
														Static234.method3980(local119, local124, local119 + local36.anInt4773, local124 + local36.anInt4751);
														@Pc(2405) boolean local2405 = Static171.method2841(local2125.anInt5728);
														@Pc(2410) boolean local2410 = Static171.method2841(local2125.anInt5729);
														@Pc(2413) Class3_Sub4_Sub12_Sub1 local2413 = (Class3_Sub4_Sub12_Sub1) local2125;
														if (local2405 && local2410) {
															if (local127 == 0) {
																local2413.method2278(local119, local124, local487, local512);
															} else {
																local2413.method2277(local119, local124, 256 - (local127 & 0xFF), local487, local512);
															}
														} else if (local2405) {
															for (local574 = 0; local574 < local512; local574++) {
																if (local127 == 0) {
																	local2413.method2278(local119, local124 + local574 * local451, local487, 1);
																} else {
																	local2413.method2277(local119, local124 + local574 * local451, -(local127 & 0xFF) + 256, local487, 1);
																}
															}
														} else if (local2410) {
															for (local574 = 0; local574 < local487; local574++) {
																if (local127 == 0) {
																	local2413.method2278(local271 * local574 + local119, local124, 1, local512);
																} else {
																	local2413.method2277(local271 * local574 + local119, local124, 256 - (local127 & 0xFF), 1, local512);
																}
															}
														} else {
															for (local574 = 0; local574 < local487; local574++) {
																for (local591 = 0; local591 < local512; local591++) {
																	if (local127 == 0) {
																		local2125.method4697(local574 * local271 + local119, local124 - -(local451 * local591));
																	} else {
																		local2125.method4700(local271 * local574 + local119, local591 * local451 + local124, 256 - (local127 & 0xFF));
																	}
																}
															}
														}
														Static234.method3975(arg6, arg5, arg7, arg1);
													} else {
														Static143.method2440(local119, local124, local119 + local36.anInt4773, local124 - -local36.anInt4751);
														for (local516 = 0; local516 < local487; local516++) {
															for (local545 = 0; local545 < local512; local545++) {
																if (local36.anInt4743 != 0) {
																	local2125.method4701(4096, local36.anInt4743, local451 * local545 + local124 + local451 / 2, local271 * local516 + (local119 - -(local271 / 2)));
																} else if (local127 == 0) {
																	local2125.method4697(local119 + local516 * local271, local451 * local545 + local124);
																} else {
																	local2125.method4700(local119 + local271 * local516, local124 - -(local545 * local451), 256 - (local127 & 0xFF));
																}
															}
														}
														Static143.method2449(arg6, arg5, arg7, arg1);
													}
												} else {
													local487 = local36.anInt4773 * 4096 / local271;
													if (local36.anInt4743 != 0) {
														local2125.method4701(local487, local36.anInt4743, local36.anInt4751 / 2 + local124, local119 - -(local36.anInt4773 / 2));
													} else if (local127 != 0) {
														local2125.method4706(local119, local124, local36.anInt4773, local36.anInt4751, 256 - (local127 & 0xFF));
													} else if (local36.anInt4773 == local271 && local36.anInt4751 == local451) {
														local2125.method4697(local119, local124);
													} else {
														local2125.method4703(local119, local124, local36.anInt4773, local36.anInt4751);
													}
												}
											} else if (Static292.aBoolean416) {
												Static134.method3639(local36);
											}
										}
									} else {
										@Pc(2831) Class21 local2831;
										if (local36.anInt4721 == 6) {
											@Pc(2667) Class10_Sub4 local2667 = null;
											@Pc(2671) boolean local2671 = Static146.method4806(local36);
											if (local2671) {
												local271 = local36.anInt4718;
											} else {
												local271 = local36.anInt4805;
											}
											local487 = 0;
											if (local36.anInt4786 != -1) {
												local2831 = Static133.method2309(local36.anInt4786);
												if (local2831 != null) {
													local2831 = local2831.method444(local36.anInt4796);
													@Pc(2850) Class15 local2850 = local271 == -1 ? null : Static253.method4288(local271);
													if (local36.aBoolean324 && Static136.aClass10_Sub5_Sub1_1.aClass131_2 != null) {
														local2667 = local2831.method446(local36.anInt4768, local36.anInt4736, 1, local2850, Static136.aClass10_Sub5_Sub1_1.aClass131_2, local36.anInt4765);
													} else {
														local2667 = local2831.method446(local36.anInt4768, local36.anInt4736, 1, local2850, null, local36.anInt4765);
													}
													if (local2667 == null) {
														Static134.method3639(local36);
													} else {
														local487 = -local2667.method4973() / 2;
													}
												}
											} else if (local36.anInt4737 == 5) {
												if (local36.anInt4806 == -1) {
													local2667 = Static44.aClass131_1.method3351(null, false, null, true, null, -1, -1, 0, 0, -1, -1);
												} else {
													local512 = local36.anInt4806;
													@Pc(2707) Class10_Sub5_Sub1 local2707;
													if (Static273.anInt5556 == local512) {
														local2707 = Static136.aClass10_Sub5_Sub1_1;
													} else {
														local2707 = Static52.aClass10_Sub5_Sub1Array1[local512];
													}
													@Pc(2722) Class15 local2722 = local271 == -1 ? null : Static253.method4288(local271);
													if (local2707 != null && (local512 == 2047 || Static113.method1827(local2707.aString124) == local36.anInt4767)) {
														local2667 = local2707.aClass131_2.method3351(null, false, local2722, true, null, -1, -1, 0, 0, local36.anInt4765, 0);
													}
												}
											} else if (local271 == -1) {
												local2667 = local36.method4012(-1, 0, null, Static136.aClass10_Sub5_Sub1_1.aClass131_2, -1, local2671);
												if (local2667 == null && Static292.aBoolean416) {
													Static134.method3639(local36);
												}
											} else {
												@Pc(2803) Class15 local2803 = Static253.method4288(local271);
												local2667 = local36.method4012(local36.anInt4765, local36.anInt4736, local2803, Static136.aClass10_Sub5_Sub1_1.aClass131_2, local36.anInt4768, local2671);
												if (local2667 == null && Static292.aBoolean416) {
													Static134.method3639(local36);
												}
											}
											if (local2667 != null) {
												if (local36.anInt4807 > 0) {
													local512 = (local36.anInt4773 << 8) / local36.anInt4807;
												} else {
													local512 = 256;
												}
												local545 = local119 + local36.anInt4773 / 2 + (local36.anInt4790 * local512 >> 8);
												if (local36.anInt4735 > 0) {
													local516 = (local36.anInt4751 << 8) / local36.anInt4735;
												} else {
													local516 = 256;
												}
												local556 = local36.anInt4751 / 2 + local124 + (local36.anInt4722 * local516 >> 8);
												if (Static283.aBoolean393) {
													if (local36.aBoolean323) {
														Static283.method4639(local545, local556, local36.anInt4724, local36.aShort38, local512, local516);
													} else {
														Static283.method4635(local545, local556, local512, local516);
														Static283.method4628((float) local36.aShort39, (float) local36.aShort38 * 1.5F);
													}
													Static283.method4662();
													Static283.method4657(true);
													Static283.method4665(false);
													Static230.method3782(Static251.anInt5174);
													if (Static28.aBoolean42) {
														Static234.method3976();
														Static283.method4646();
														Static234.method3975(arg6, arg5, arg7, arg1);
														Static28.aBoolean42 = false;
													}
													if (local36.aBoolean336) {
														Static283.method4641();
													}
													local591 = local36.anInt4724 * Class11.anIntArray27[local36.anInt4729] >> 16;
													local574 = Class11.anIntArray26[local36.anInt4729] * local36.anInt4724 >> 16;
													if (local36.aBoolean328) {
														local2667.method1939(local36.anInt4801, local36.anInt4777, local36.anInt4729, local36.anInt4725, local574 + local487 + local36.anInt4732, local36.anInt4732 + local591, -1L);
													} else {
														local2667.method1939(local36.anInt4801, 0, local36.anInt4729, 0, local574, local591, -1L);
													}
													if (local36.aBoolean336) {
														Static283.method4653();
													}
												} else {
													Static16.method269(local545, local556);
													local574 = local36.anInt4724 * Class11.anIntArray26[local36.anInt4729] >> 16;
													local591 = local36.anInt4724 * Class11.anIntArray27[local36.anInt4729] >> 16;
													if (!local36.aBoolean328) {
														local2667.method1939(local36.anInt4801, 0, local36.anInt4729, 0, local574, local591, -1L);
													} else if (local36.aBoolean323) {
														((Class10_Sub4_Sub2) local2667).method1981(local36.anInt4801, local36.anInt4777, local36.anInt4729, local36.anInt4725, local487 + local574 + local36.anInt4732, local591 + local36.anInt4732, local36.anInt4724);
													} else {
														local2667.method1939(local36.anInt4801, local36.anInt4777, local36.anInt4729, local36.anInt4725, local36.anInt4732 + local574 + local487, local591 - -local36.anInt4732, -1L);
													}
													Static16.method276();
												}
											}
										} else {
											if (local36.anInt4721 == 7) {
												local1951 = local36.method4014(Static96.aClass81Array2);
												if (local1951 == null) {
													if (Static292.aBoolean416) {
														Static134.method3639(local36);
													}
													continue;
												}
												local271 = 0;
												for (local451 = 0; local451 < local36.anInt4792; local451++) {
													for (local487 = 0; local487 < local36.anInt4761; local487++) {
														if (local36.anIntArray511[local271] > 0) {
															local2831 = Static133.method2309(local36.anIntArray511[local271] - 1);
															@Pc(3266) String local3266;
															if (local2831.anInt501 != 1 && local36.anIntArray515[local271] == 1) {
																local3266 = "<col=ff9040>" + local2831.aString18 + "</col>";
															} else {
																local3266 = "<col=ff9040>" + local2831.aString18 + "</col> x" + Static244.method4129(local36.anIntArray515[local271]);
															}
															local545 = local487 * (local36.anInt4723 + 115) + local119;
															local556 = local124 + (local36.anInt4771 + 12) * local451;
															if (local36.anInt4802 == 0) {
																local1951.method3685(local3266, local545, local556, local36.anInt4719, local36.aBoolean321 ? 0 : -1);
															} else if (local36.anInt4802 == 1) {
																local1951.method3684(local3266, local545 + 57, local556, local36.anInt4719, local36.aBoolean321 ? 0 : -1);
															} else {
																local1951.method3699(local3266, local545 + 114, local556, local36.anInt4719, local36.aBoolean321 ? 0 : -1);
															}
														}
														local271++;
													}
												}
											}
											if (local36.anInt4721 == 8 && aClass151_16 == local36 && Static39.anInt680 == Static171.anInt3222) {
												local271 = 0;
												@Pc(3382) Class3_Sub4_Sub2 local3382 = Static248.aClass3_Sub4_Sub2_11;
												local283 = 0;
												@Pc(3387) String local3387 = local36.aString163;
												local3387 = Static118.method1923(local3387, local36);
												@Pc(3404) String local3404;
												while (local3387.length() > 0) {
													local516 = local3387.indexOf("<br>");
													if (local516 == -1) {
														local3404 = local3387;
														local3387 = "";
													} else {
														local3404 = local3387.substring(0, local516);
														local3387 = local3387.substring(local516 + 4);
													}
													local545 = local3382.method3690(local3404);
													local271 += local3382.anInt4400 + 1;
													if (local545 > local283) {
														local283 = local545;
													}
												}
												local283 += 6;
												local271 += 7;
												local516 = local36.anInt4773 + local119 - local283 - 5;
												if (local516 < local119 + 5) {
													local516 = local119 + 5;
												}
												local545 = local124 + local36.anInt4751 + 5;
												if (arg1 < local545 + local271) {
													local545 = arg1 - local271;
												}
												if (local283 + local516 > arg7) {
													local516 = arg7 - local283;
												}
												if (Static283.aBoolean393) {
													Static234.method3973(local516, local545, local283, local271, 16777120);
													Static234.method3979(local516, local545, local283, local271, 0);
												} else {
													Static143.method2462(local516, local545, local283, local271, 16777120);
													Static143.method2455(local516, local545, local283, local271, 0);
												}
												local556 = local545 + local3382.anInt4400 + 2;
												local3387 = local36.aString163;
												local3387 = Static118.method1923(local3387, local36);
												while (local3387.length() > 0) {
													local574 = local3387.indexOf("<br>");
													if (local574 == -1) {
														local3404 = local3387;
														local3387 = "";
													} else {
														local3404 = local3387.substring(0, local574);
														local3387 = local3387.substring(local574 + 4);
													}
													local3382.method3685(local3404, local516 + 3, local556, 0, -1);
													local556 += local3382.anInt4400 + 1;
												}
											}
											if (local36.anInt4721 == 9) {
												if (local36.aBoolean337) {
													local451 = local119 + local36.anInt4773;
													local487 = local124;
													local271 = local36.anInt4751 + local124;
												} else {
													local487 = local124 + local36.anInt4751;
													local451 = local119 + local36.anInt4773;
													local271 = local124;
												}
												if (local36.anInt4726 == 1) {
													if (Static283.aBoolean393) {
														Static234.method3965(local119, local271, local451, local487, local36.anInt4719);
													} else {
														Static143.method2461(local119, local271, local451, local487, local36.anInt4719);
													}
												} else if (Static283.aBoolean393) {
													Static234.method3970(local119, local271, local451, local487, local36.anInt4719, local36.anInt4726);
												} else {
													Static143.method2457(local119, local271, local451, local487, local36.anInt4719, local36.anInt4726);
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

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	public static void method4113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg0, 1);
		local8.method971();
		local8.anInt1132 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Lclient!rg;")
	public static Class151 method4115(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static96.aClass151ArrayArray1[local7] == null || Static96.aClass151ArrayArray1[local7][local16] == null) {
			@Pc(34) boolean local34 = Static245.method4932(local7);
			if (!local34) {
				return null;
			}
		}
		return Static96.aClass151ArrayArray1[local7][local16];
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
	public static void method4116() {
		@Pc(18) Class3_Sub20 local18;
		for (local18 = (Class3_Sub20) Static150.aClass56_9.method1281(); local18 != null; local18 = (Class3_Sub20) Static150.aClass56_9.method1278()) {
			if (local18.aBoolean214) {
				local18.method2657();
			}
		}
		for (local18 = (Class3_Sub20) Static39.aClass56_4.method1281(); local18 != null; local18 = (Class3_Sub20) Static39.aClass56_4.method1278()) {
			if (local18.aBoolean214) {
				local18.method2657();
			}
		}
	}
}
