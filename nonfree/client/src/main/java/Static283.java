import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!ro;")
	public static Class217 aClass217_4;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "I")
	public static int anInt4621;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "Lclient!ml;")
	public static Class160 aClass160_2;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_138 = new Class102(1, -1);

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_139 = new Class102(35, 4);

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_140 = new Class102(75, 3);

	@OriginalMember(owner = "client!of", name = "v", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_105 = new Class211(101, 7);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	public static void method3763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static78.anInt1491 == 1) {
			Static315.method4296(Static61.aClass2_Sub46_1, arg0, arg1);
		} else if (Static78.anInt1491 == 2) {
			Static176.method71(arg1, arg0);
		}
		Static61.aClass2_Sub46_1 = null;
		Static78.anInt1491 = 0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZIB)Ljava/lang/String;")
	public static String method3764(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(43) int local43 = arg0 / 10;
		while (local43 != 0) {
			local43 /= 10;
			local34++;
		}
		@Pc(55) char[] local55 = new char[local34];
		local55[0] = '+';
		for (@Pc(63) int local63 = local34 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(77) int local77 = local67 - arg0 * 10;
			if (local77 >= 10) {
				local55[local63] = (char) (local77 + 87);
			} else {
				local55[local63] = (char) (local77 + 48);
			}
		}
		return new String(local55);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method3765() {
		Static176.method70(Static336.aClass16_18);
		Static366.anInt6161++;
		if (Static32.aBoolean60 && Static392.aBoolean460) {
			@Pc(31) int local31 = Static376.aClass203_1.method4918();
			@Pc(35) int local35 = Static376.aClass203_1.method4925();
			local35 -= Static209.anInt3498;
			local31 -= Static143.anInt2549;
			if (local31 < Static379.anInt6862) {
				local31 = Static379.anInt6862;
			}
			if (local35 < Static25.anInt451) {
				local35 = Static25.anInt451;
			}
			if (Static190.aClass16_9.anInt294 + Static379.anInt6862 < Static336.aClass16_18.anInt294 + local31) {
				local31 = Static379.anInt6862 + Static190.aClass16_9.anInt294 - Static336.aClass16_18.anInt294;
			}
			if (local35 + Static336.aClass16_18.anInt285 > Static190.aClass16_9.anInt285 + Static25.anInt451) {
				local35 = Static190.aClass16_9.anInt285 + Static25.anInt451 - Static336.aClass16_18.anInt285;
			}
			@Pc(105) int local105 = Static190.aClass16_9.anInt279 + local31 - Static379.anInt6862;
			@Pc(114) int local114 = local35 + Static190.aClass16_9.anInt284 - Static25.anInt451;
			@Pc(129) Class2_Sub44 local129;
			if (Static376.aClass203_1.method4923()) {
				if (Static336.aClass16_18.anInt313 < Static366.anInt6161) {
					@Pc(208) int local208 = local31 - Static272.anInt4438;
					@Pc(213) int local213 = local35 - Static391.anInt6436;
					if (Static336.aClass16_18.anInt287 < local208 || local208 < -Static336.aClass16_18.anInt287 || local213 > Static336.aClass16_18.anInt287 || -Static336.aClass16_18.anInt287 > local213) {
						Static284.aBoolean328 = true;
					}
				}
				if (Static336.aClass16_18.anObjectArray1 != null && Static284.aBoolean328) {
					local129 = new Class2_Sub44();
					local129.anObjectArray36 = Static336.aClass16_18.anObjectArray1;
					local129.aClass16_20 = Static336.aClass16_18;
					local129.anInt7161 = local114;
					local129.anInt7160 = local105;
					Static191.method2562(local129);
				}
			} else {
				if (Static284.aBoolean328) {
					Static377.method3604();
					if (Static336.aClass16_18.anObjectArray31 != null) {
						local129 = new Class2_Sub44();
						local129.aClass16_20 = Static336.aClass16_18;
						local129.aClass16_21 = Static176.aClass16_2;
						local129.anInt7160 = local105;
						local129.anObjectArray36 = Static336.aClass16_18.anObjectArray31;
						local129.anInt7161 = local114;
						Static191.method2562(local129);
					}
					if (Static176.aClass16_2 != null && Static55.method809(Static336.aClass16_18) != null) {
						Static380.method357(Static176.aClass16_2, Static336.aClass16_18);
					}
				} else if ((Static30.anInt587 == 1 || Static242.method3086()) && Static137.anInt6647 > 2) {
					method3763(Static391.anInt6436 + Static209.anInt3498, Static272.anInt4438 + Static143.anInt2549);
				} else if (Static449.method5645()) {
					method3763(Static391.anInt6436 + Static209.anInt3498, Static272.anInt4438 + Static143.anInt2549);
				}
				Static336.aClass16_18 = null;
			}
		} else if (Static366.anInt6161 > 1) {
			Static336.aClass16_18 = null;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII[Lclient!at;ZIIII)V")
	public static void method3766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class16[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
		for (@Pc(13) int local13 = 0; local13 < arg4.length; local13++) {
			@Pc(21) Class16 local21 = arg4[local13];
			if (local21 != null && (arg0 == local21.anInt324 || arg0 == -1412584499 && Static336.aClass16_18 == local21)) {
				@Pc(63) int local63;
				if (arg3 == -1) {
					Class2_Sub15.aRectangleArray1[Static398.anInt6535].setBounds(arg1 + local21.anInt316, arg2 + local21.anInt269, local21.anInt294, local21.anInt285);
					local63 = Static398.anInt6535++;
				} else {
					local63 = arg3;
				}
				local21.anInt258 = local63;
				local21.anInt302 = Static266.anInt4392;
				if (!Static55.method802(local21)) {
					if (local21.anInt252 != 0) {
						Static49.method690(local21);
					}
					@Pc(90) int local90 = arg1 + local21.anInt316;
					@Pc(95) int local95 = local21.anInt269 + arg2;
					@Pc(98) int local98 = local21.anInt257;
					if (Static95.aBoolean158 && (Static55.method815(local21).anInt1904 != 0 || local21.anInt298 == 0) && local98 > 127) {
						local98 = 127;
					}
					@Pc(158) int local158;
					@Pc(162) int local162;
					if (local21 == Static336.aClass16_18) {
						if (arg0 != -1412584499 && (local21.anInt311 == Static352.anInt5988 || local21.anInt311 == Static207.anInt3363)) {
							Static428.anInt6929 = arg1;
							Static43.anInt805 = arg2;
							Static212.aClass16Array2 = arg4;
							continue;
						}
						if (Static284.aBoolean328 && Static392.aBoolean460) {
							local158 = Static376.aClass203_1.method4918();
							local162 = Static376.aClass203_1.method4925();
							local158 -= Static143.anInt2549;
							local162 -= Static209.anInt3498;
							if (Static379.anInt6862 > local158) {
								local158 = Static379.anInt6862;
							}
							if (local21.anInt294 + local158 > Static379.anInt6862 + Static190.aClass16_9.anInt294) {
								local158 = Static190.aClass16_9.anInt294 + Static379.anInt6862 - local21.anInt294;
							}
							if (Static25.anInt451 > local162) {
								local162 = Static25.anInt451;
							}
							if (Static25.anInt451 + Static190.aClass16_9.anInt285 < local21.anInt285 + local162) {
								local162 = Static25.anInt451 + Static190.aClass16_9.anInt285 - local21.anInt285;
							}
							local90 = local158;
							local95 = local162;
						}
						if (local21.anInt311 == Static207.anInt3363) {
							local98 = 128;
						}
					}
					@Pc(246) int local246;
					@Pc(240) int local240;
					@Pc(254) int local254;
					@Pc(259) int local259;
					if (local21.anInt298 == 2) {
						local240 = arg8;
						local158 = arg7;
						local162 = arg5;
						local246 = arg6;
					} else {
						local254 = local90 + local21.anInt294;
						local259 = local21.anInt285 + local95;
						local162 = local95 > arg5 ? local95 : arg5;
						local158 = arg7 < local90 ? local90 : arg7;
						if (local21.anInt298 == 9) {
							local254++;
							local259++;
						}
						local246 = arg6 <= local254 ? arg6 : local254;
						local240 = arg8 <= local259 ? arg8 : local259;
					}
					if (local246 > local158 && local162 < local240) {
						@Pc(540) int local540;
						@Pc(590) int local590;
						@Pc(616) int local616;
						@Pc(505) int local505;
						@Pc(538) int local538;
						if (local21.anInt252 != 0) {
							if (local21.anInt252 == Static129.anInt2329 || Static453.anInt7272 == local21.anInt252) {
								Static416.method5253(local21.anInt294, local90, local95, Static453.anInt7272 == local21.anInt252, local21.anInt285);
								Static101.aBooleanArray9[local63] = true;
								Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
								continue;
							}
							if (local21.anInt252 == Static336.anInt5713) {
								if (local21.method239(Static82.aClass163_1) != null) {
									Static123.method5625();
									Static362.method4758(Static82.aClass163_1, local95, local21, local90);
									Static442.aBooleanArray27[local63] = true;
									Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
								}
								continue;
							}
							if (local21.anInt252 == Static246.anInt3969) {
								if (local21.method239(Static82.aClass163_1) != null) {
									Static47.method676(local90, local95, local21);
									Static442.aBooleanArray27[local63] = true;
									Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
								}
								continue;
							}
							if (local21.anInt252 == Static390.anInt6838) {
								Static48.method679(local90, local95, local21.anInt294, local21.anInt285, Static82.aClass163_1, Static65.anInterface9_6);
								Static101.aBooleanArray9[local63] = true;
								Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
								continue;
							}
							if (local21.anInt252 == Static219.anInt6121) {
								Static458.method5730(local21.anInt294, local90, local95, local21.anInt285, Static82.aClass163_1);
								Static101.aBooleanArray9[local63] = true;
								Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
								continue;
							}
							if (Static347.anInt5914 == local21.anInt252) {
								if (!Static199.aBoolean203 && !Static190.aBoolean188) {
									continue;
								}
								local254 = local90 + local21.anInt294;
								local259 = local95 + 15;
								if (Static199.aBoolean203) {
									local505 = -256;
									if (Static394.anInt6483 < 20) {
										local505 = -65536;
									}
									Static43.aClass92_1.method4519("Fps:" + Static394.anInt6483, local254, local259, local505);
									local259 += 15;
									@Pc(529) Runtime local529 = Runtime.getRuntime();
									local538 = (int) ((local529.totalMemory() - local529.freeMemory()) / 1024L);
									local540 = -256;
									if (local538 > 65536) {
										local540 = -65536;
									}
									Static43.aClass92_1.method4519("Mem:" + local538 + "k", local254, local259, local540);
									local259 += 15;
									Static43.aClass92_1.method4519("In:" + Static333.anInt5635 + "B/s Out:" + Static420.anInt6868 + "B/s", local254, local259, -256);
									local259 += 15;
									local590 = Static82.aClass163_1.pa() / 1024;
									Static43.aClass92_1.method4519("Offheap:" + local590 + "k", local254, local259, local590 > 65536 ? -65536 : -256);
									local259 += 15;
									local616 = 0;
									@Pc(618) int local618 = 0;
									@Pc(620) int local620 = 0;
									for (@Pc(622) int local622 = 0; local622 < 30; local622++) {
										local616 += Static87.aClass14_Sub1Array5[local622].method2740();
										local618 += Static87.aClass14_Sub1Array5[local622].method2741();
										local620 += Static87.aClass14_Sub1Array5[local622].method2735();
									}
									@Pc(660) int local660 = local620 * 100 / local616;
									@Pc(666) int local666 = local618 * 10000 / local616;
									@Pc(686) String local686 = "Cache:" + Static84.method1211(0, true, 2, (long) local666) + "% (" + local660 + "%)";
									Static46.aClass92_2.method4519(local686, local254, local259, -256);
									local259 += 12;
								}
								if (Static164.anInt4842 > 0) {
									Static46.aClass92_2.method4519("Particles: " + Static420.anInt6869 + " / " + Static164.anInt4842, local254, local259, -256);
								}
								local259 += 12;
								if (Static190.aBoolean188) {
									Static46.aClass92_2.method4519("Polys: " + Static82.aClass163_1.OA() + " Models: " + Static82.aClass163_1.Y(), local254, local259, -256);
									local259 += 12;
									Static46.aClass92_2.method4519("Ls: " + Static107.anInt2026 + " La: " + Static269.anInt4417 + " NPC: " + Static165.anInt2824 + " Pl: " + Static327.anInt5553, local254, local259, -256);
									local259 += 12;
									Static164.method3947();
								}
								Static101.aBooleanArray9[local63] = true;
								continue;
							}
						}
						if (local21.anInt298 == 0) {
							if (local21.anInt252 == Static356.anInt6055 && Static82.aClass163_1.method5555()) {
								Static82.aClass163_1.method5529(local90, local95, local21.anInt294, local21.anInt285);
							}
							method3766(local21.anInt293, local90 - local21.anInt279, local95 + -local21.anInt284, local63, arg4, local162, local246, local158, local240);
							if (local21.aClass16Array1 != null) {
								method3766(local21.anInt293, local90 - local21.anInt279, local95 + -local21.anInt284, local63, local21.aClass16Array1, local162, local246, local158, local240);
							}
							@Pc(849) Class2_Sub21 local849 = (Class2_Sub21) Static418.aClass72_44.method1659((long) local21.anInt293);
							if (local849 != null) {
								Static442.method5597(local246, local240, local849.anInt2585, local90, local63, local162, local95, local158);
							}
							if (local21.anInt252 == Static356.anInt6055 && Static82.aClass163_1.method5555()) {
								Static82.aClass163_1.method5505();
								Static457.aBoolean533 = true;
							}
							Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
						}
						if (Static263.aBooleanArray14[local63] || Static340.anInt6976 > 1) {
							if (local21.anInt298 == 3) {
								if (local98 == 0) {
									if (local21.aBoolean28) {
										Static82.aClass163_1.P(local90, local95, local21.anInt294, local21.anInt285, local21.anInt300, 0);
									} else {
										Static82.aClass163_1.method5565(local90, local95, local21.anInt294, local21.anInt285, local21.anInt300, 0);
									}
								} else if (local21.aBoolean28) {
									Static82.aClass163_1.P(local90, local95, local21.anInt294, local21.anInt285, local21.anInt300 & 0xFFFFFF | 255 - (local98 & 0xFF) << 24, 1);
								} else {
									Static82.aClass163_1.method5565(local90, local95, local21.anInt294, local21.anInt285, 255 - (local98 & 0xFF) << 24 | local21.anInt300 & 0xFFFFFF, 1);
								}
							} else if (local21.anInt298 == 4) {
								@Pc(992) Class92 local992 = local21.method249(Static82.aClass163_1);
								if (local992 != null) {
									local259 = local21.anInt300;
									@Pc(1007) String local1007 = local21.aString16;
									if (local21.anInt301 != -1) {
										@Pc(1018) Class208 local1018 = Static384.aClass164_2.method3458(local21.anInt301);
										local1007 = local1018.lb;
										if (local1007 == null) {
											local1007 = "null";
										}
										if ((local1018.anInt5678 == 1 || local21.anInt297 != 1) && local21.anInt297 != -1) {
											local1007 = "<col=ff9040>" + local1007 + "</col> x" + Static242.method3082(local21.anInt297);
										}
									}
									if (local21 == Static324.aClass16_16) {
										local1007 = Static417.aClass134_99.method2720(Static331.anInt5597);
										local259 = local21.anInt300;
									}
									if (Static453.aBoolean526) {
										Static82.aClass163_1.HA(local90, local95, local21.anInt294 + local90, local21.anInt285 + local95);
									}
									local992.method4505(0, Static108.aClass13Array5, local1007, local21.aBoolean36 ? 255 - (local98 & 0xFF) << 24 : -1, local21.anInt270, null, 255 - (local98 & 0xFF) << 24 | local259, local90, local21.anInt312, null, local21.anInt285, local95, local21.anInt275, local21.anInt263, local21.anInt294, 0);
									if (Static453.aBoolean526) {
										Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
									}
								} else if (Static341.aBoolean423) {
									Static176.method70(local21);
								}
							} else {
								@Pc(1238) int local1238;
								if (local21.anInt298 == 5) {
									if (local21.anInt336 >= 0) {
										local21.method235(Static91.aClass180_1, Static231.aClass129_1).method3165(local90, local95, local21.anInt283 << 3, Static82.aClass163_1, local21.anInt322 << 3, 0, local21.anInt294, 0, local21.anInt285);
									} else {
										@Pc(1201) Class13 local1201;
										if (local21.anInt301 == -1) {
											local1201 = local21.method245(Static82.aClass163_1);
										} else {
											@Pc(1183) Class249 local1183 = local21.aBoolean33 ? Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1 : null;
											local1201 = Static384.aClass164_2.method3453(Static82.aClass163_1, local1183, local21.anInt292, local21.anInt291, local21.anInt297, local21.anInt301, local21.anInt260 | 0xFF000000);
										}
										if (local1201 != null) {
											local259 = local1201.RA();
											local505 = local1201.Q();
											local1238 = 255 - (local98 & 0xFF) << 24 | (local21.anInt300 == 0 ? 16777215 : local21.anInt300 & 0xFFFFFF);
											if (local21.aBoolean34) {
												Static82.aClass163_1.HA(local90, local95, local21.anInt294 + local90, local95 + local21.anInt285);
												if (local21.anInt281 != 0) {
													local538 = (local259 + local21.anInt294 - 1) / local259;
													local540 = (local505 + local21.anInt285 - 1) / local505;
													for (local590 = 0; local590 < local538; local590++) {
														for (local616 = 0; local616 < local540; local616++) {
															if (local21.anInt300 == 0) {
																local1201.method5672((float) local259 / 2.0F + (float) (local259 * local590 + local90), (float) local505 / 2.0F + (float) (local505 * local616 + local95), 4096, local21.anInt281);
															} else {
																local1201.method5669((float) (local90 + local590 * local259) + (float) local259 / 2.0F, (float) local505 / 2.0F + (float) (local95 + local616 * local505), 4096, local21.anInt281, local1238);
															}
														}
													}
												} else if (local21.anInt300 == 0 && local98 == 0) {
													local1201.method5667(local90, local95, local21.anInt294, local21.anInt285);
												} else {
													local1201.la(local90, local95, local21.anInt294, local21.anInt285, 0, local1238, 1);
												}
												Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
											} else if (local21.anInt300 == 0 && local98 == 0) {
												if (local21.anInt281 != 0) {
													local1201.method5672((float) local21.anInt294 / 2.0F + (float) local90, (float) local95 + (float) local21.anInt285 / 2.0F, local21.anInt294 * 4096 / local259, local21.anInt281);
												} else if (local21.anInt294 == local259 && local21.anInt285 == local505) {
													local1201.method5668(local90, local95);
												} else {
													local1201.method5665(local90, local95, local21.anInt294, local21.anInt285);
												}
											} else if (local21.anInt281 != 0) {
												local1201.method5669((float) local21.anInt294 / 2.0F + (float) local90, (float) local95 + (float) local21.anInt285 / 2.0F, local21.anInt294 * 4096 / local259, local21.anInt281, local1238);
											} else if (local259 == local21.anInt294 && local505 == local21.anInt285) {
												local1201.W(local90, local95, 0, local1238, 1);
											} else {
												local1201.ya(local90, local95, local21.anInt294, local21.anInt285, 0, local1238, 1);
											}
										} else if (Static341.aBoolean423) {
											Static176.method70(local21);
										}
									}
								} else if (local21.anInt298 == 6) {
									Static250.method3191();
									@Pc(1555) Class59 local1555 = null;
									local259 = 0;
									@Pc(1587) Class128 local1587;
									@Pc(1595) Class249 local1595;
									if (local21.anInt301 != -1) {
										@Pc(1567) Class208 local1567 = Static384.aClass164_2.method3458(local21.anInt301);
										if (local1567 != null) {
											local1567 = local1567.method4482(local21.anInt297);
											local1587 = local21.anInt278 == -1 ? null : Static334.aClass62_2.method1418(local21.anInt278);
											local1595 = local21.aBoolean33 ? Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1 : null;
											local1555 = local1567.method4470(2048, local21.anInt309, Static82.aClass163_1, local1595, local21.anInt304, local21.anInt299, 1, local1587);
											if (local1555 == null) {
												Static176.method70(local21);
											} else {
												local259 = -local1555.B() >> 1;
											}
										}
									} else if (local21.anInt310 == 5) {
										local505 = local21.anInt305;
										if (local505 >= 0 && local505 < 2048) {
											@Pc(1645) Class3_Sub4_Sub1_Sub2 local1645 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local505];
											@Pc(1657) Class128 local1657 = local21.anInt278 == -1 ? null : Static334.aClass62_2.method1418(local21.anInt278);
											if (local1645 != null && (local505 == Static201.anInt3383 || Static58.method837(local1645.aString148) == local21.anInt267)) {
												local1555 = local1645.aClass249_1.method5247(Static394.aClass47_2, local21.anInt309, 2048, null, 0, local1657, Static138.aClass268_1, null, local21.anInt299, Static56.aClass150_1, Static155.aClass263_1, -1, 0, Static334.aClass62_2, Static82.aClass163_1, Static384.aClass164_2, local21.anInt304);
											}
										}
									} else if (local21.anInt310 == 8 || local21.anInt310 == 9) {
										@Pc(1722) Class2_Sub36 local1722 = Static382.method4911(false, local21.anInt305);
										local1587 = local21.anInt278 == -1 ? null : Static334.aClass62_2.method1418(local21.anInt278);
										if (local1722 != null) {
											local1595 = local21.aBoolean33 ? Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1 : null;
											local1555 = local1722.method3769(local1587, local1595, local21.anInt304, local21.anInt309, Static82.aClass163_1, local21.anInt310 == 9, local21.anInt299, local21.anInt267);
										}
									} else if (local21.anInt278 == -1) {
										local1555 = local21.method248(Static384.aClass164_2, 0, null, Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1, Static155.aClass263_1, Static334.aClass62_2, 2048, Static394.aClass47_2, -1, Static56.aClass150_1, -1, Static82.aClass163_1, Static138.aClass268_1);
										if (local1555 == null && Static341.aBoolean423) {
											Static176.method70(local21);
										}
									} else {
										@Pc(1780) Class128 local1780 = Static334.aClass62_2.method1418(local21.anInt278);
										local1555 = local21.method248(Static384.aClass164_2, local21.anInt309, local1780, Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1, Static155.aClass263_1, Static334.aClass62_2, 2048, Static394.aClass47_2, local21.anInt299, Static56.aClass150_1, local21.anInt304, Static82.aClass163_1, Static138.aClass268_1);
										if (local1555 == null && Static341.aBoolean423) {
											Static176.method70(local21);
										}
									}
									if (local1555 != null) {
										if (local21.anInt264 <= 0) {
											local505 = 512;
										} else {
											local505 = (local21.anInt294 << 9) / local21.anInt264;
										}
										if (local21.anInt273 <= 0) {
											local1238 = 512;
										} else {
											local1238 = (local21.anInt285 << 9) / local21.anInt273;
										}
										local538 = local90 + local21.anInt294 / 2 + (local21.anInt314 * local505 >> 9);
										local540 = (local1238 * local21.anInt315 >> 9) + local95 + local21.anInt285 / 2;
										Static57.aClass31_2.v();
										Static82.aClass163_1.SA(Static57.aClass31_2);
										Static82.aClass163_1.GA(local538, local540, local505, local1238);
										Static82.aClass163_1.da((float) (local21.anInt334 << 0), local21.aBoolean37 ? (float) (local21.anInt337 << 0) : (float) (local21.anInt337 << 0) * 1.5F);
										if (arg0 == -1412584499 || Static457.aBoolean533) {
											Static82.aClass163_1.va();
											Static82.aClass163_1.method5559();
											Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
											Static457.aBoolean533 = false;
										}
										if (local21.aBoolean24) {
											Static82.aClass163_1.method5534(false);
										}
										local590 = (local21.anInt330 << 0) * Class155.anIntArray342[local21.anInt335 << 3] >> 15;
										local616 = (local21.anInt330 << 0) * Class155.anIntArray341[local21.anInt335 << 3] >> 15;
										Static276.aClass31_3.A(-local21.anInt295 << 3);
										Static276.aClass31_3.EA(local21.anInt308 << 3);
										Static276.aClass31_3.W(local21.lb << 0, local259 + (local21.anInt271 << 0) + local590, local616 - -(local21.anInt271 << 0));
										Static276.aClass31_3.ea(local21.anInt335 << 3);
										if (Static453.aBoolean526) {
											Static82.aClass163_1.HA(local90, local95, local21.anInt294 + local90, local95 - -local21.anInt285);
										}
										if (local21.aBoolean37) {
											local1555.method5751(Static276.aClass31_3, null, local21.anInt330 << 0);
										} else {
											local1555.method5736(Static276.aClass31_3, null, 1);
										}
										if (Static453.aBoolean526) {
											Static82.aClass163_1.ba(arg7, arg5, arg6, arg8);
										}
										if (local21.aBoolean24) {
											Static82.aClass163_1.method5534(true);
										}
										Static82.aClass163_1.da(0.0F, 0.0F);
									}
								} else if (local21.anInt298 == 9) {
									if (local21.aBoolean25) {
										local1238 = local95;
										local259 = local21.anInt285 + local95;
										local505 = local90 + local21.anInt294;
									} else {
										local259 = local95;
										local505 = local90 + local21.anInt294;
										local1238 = local95 + local21.anInt285;
									}
									if (local21.anInt286 == 1) {
										Static82.aClass163_1.method5526(local90, local259, local505, local1238, local21.anInt300, 0);
									} else {
										Static82.aClass163_1.method5512(local90, local259, local505, local1238, local21.anInt300, local21.anInt286);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(III)Z")
	public static boolean method3768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static104.method1553(arg1, arg0) | (arg1 & 0x40000) != 0 || Static261.method1844(arg1, arg0);
	}
}
