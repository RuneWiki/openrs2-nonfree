import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
	public static int anInt7706 = -1;

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_49 = new Class70();

	@OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
	public static int anInt7715 = 0;

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
	public static int anInt7716 = -1;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!lr;I)V")
	public static void method6234(@OriginalArg(1) Class2_Sub7_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) boolean local17 = arg0.method4535(1) == 1;
		if (local17) {
			Static302.anIntArray350[Static179.anInt2668++] = arg1;
		}
		@Pc(32) int local32 = arg0.method4535(2);
		@Pc(36) Class12_Sub2_Sub1_Sub4_Sub1 local36 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[arg1];
		if (local32 != 0) {
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local32 == 1) {
				local146 = arg0.method4535(3);
				local151 = local36.anIntArray566[0];
				local156 = local36.anIntArray565[0];
				if (local146 == 0) {
					local156--;
					local151--;
				} else if (local146 == 1) {
					local156--;
				} else if (local146 == 2) {
					local151++;
					local156--;
				} else if (local146 == 3) {
					local151--;
				} else if (local146 == 4) {
					local151++;
				} else if (local146 == 5) {
					local156++;
					local151--;
				} else if (local146 == 6) {
					local156++;
				} else if (local146 == 7) {
					local156++;
					local151++;
				}
				if (local17) {
					local36.aBoolean459 = true;
					local36.anInt5830 = local151;
					local36.anInt5833 = local156;
				} else {
					local36.method4910(local156, local151, Static12.aByteArray5[arg1]);
				}
			} else if (local32 == 2) {
				local146 = arg0.method4535(4);
				local151 = local36.anIntArray566[0];
				local156 = local36.anIntArray565[0];
				if (local146 == 0) {
					local156 -= 2;
					local151 -= 2;
				} else if (local146 == 1) {
					local151--;
					local156 -= 2;
				} else if (local146 == 2) {
					local156 -= 2;
				} else if (local146 == 3) {
					local156 -= 2;
					local151++;
				} else if (local146 == 4) {
					local151 += 2;
					local156 -= 2;
				} else if (local146 == 5) {
					local156--;
					local151 -= 2;
				} else if (local146 == 6) {
					local151 += 2;
					local156--;
				} else if (local146 == 7) {
					local151 -= 2;
				} else if (local146 == 8) {
					local151 += 2;
				} else if (local146 == 9) {
					local151 -= 2;
					local156++;
				} else if (local146 == 10) {
					local151 += 2;
					local156++;
				} else if (local146 == 11) {
					local156 += 2;
					local151 -= 2;
				} else if (local146 == 12) {
					local151--;
					local156 += 2;
				} else if (local146 == 13) {
					local156 += 2;
				} else if (local146 == 14) {
					local156 += 2;
					local151++;
				} else if (local146 == 15) {
					local156 += 2;
					local151 += 2;
				}
				if (local17) {
					local36.anInt5830 = local151;
					local36.aBoolean459 = true;
					local36.anInt5833 = local156;
				} else {
					local36.method4910(local156, local151, Static12.aByteArray5[arg1]);
				}
			} else {
				local146 = arg0.method4535(1);
				@Pc(420) int local420;
				@Pc(430) int local430;
				@Pc(441) int local441;
				@Pc(448) int local448;
				if (local146 == 0) {
					local151 = arg0.method4535(12);
					local156 = local151 >> 10;
					local420 = local151 >> 5 & 0x1F;
					if (local420 > 15) {
						local420 -= 32;
					}
					local430 = local151 & 0x1F;
					if (local430 > 15) {
						local430 -= 32;
					}
					local441 = local36.anIntArray566[0] + local420;
					local448 = local36.anIntArray565[0] + local430;
					if (local17) {
						local36.anInt5830 = local441;
						local36.anInt5833 = local448;
						local36.aBoolean459 = true;
					} else {
						local36.method4910(local448, local441, Static12.aByteArray5[arg1]);
					}
					local36.aByte128 = local36.aByte127 = (byte) (local156 + local36.aByte128 & 0x3);
					if (Static562.method7350(local441, local448)) {
						local36.aByte127++;
					}
					if (arg1 == Static18.anInt4109) {
						Static402.anInt6620 = local36.aByte128;
					}
				} else {
					local151 = arg0.method4535(30);
					local156 = local151 >> 28;
					local420 = local151 >> 14 & 0x3FFF;
					local430 = local151 & 0x3FFF;
					local441 = (local36.anIntArray566[0] + Static485.anInt7725 + local420 & 0x3FFF) - Static485.anInt7725;
					local448 = (Static310.anInt5129 + local36.anIntArray565[0] + local430 & 0x3FFF) - Static310.anInt5129;
					if (local17) {
						local36.anInt5830 = local441;
						local36.anInt5833 = local448;
						local36.aBoolean459 = true;
					} else {
						local36.method4910(local448, local441, Static12.aByteArray5[arg1]);
					}
					local36.aByte128 = local36.aByte127 = (byte) (local156 + local36.aByte128 & 0x3);
					if (Static562.method7350(local441, local448)) {
						local36.aByte127++;
					}
					if (Static18.anInt4109 == arg1) {
						Static402.anInt6620 = local36.aByte128;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean459 = false;
		} else if (arg1 == Static18.anInt4109) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(63) Class20 local63 = Static261.aClass20Array1[arg1] = new Class20();
			local63.anInt388 = (Static310.anInt5129 + local36.anIntArray565[0] >> 6) + (local36.aByte128 << 28) + (Static485.anInt7725 + local36.anIntArray566[0] >> 6 << 14);
			if (local36.anInt5815 == -1) {
				local63.anInt387 = local36.aClass352_7.method7410();
			} else {
				local63.anInt387 = local36.anInt5815;
			}
			local63.aBoolean27 = local36.aBoolean462;
			local63.anInt386 = local36.anInt8424;
			if (local36.anInt5821 > 0) {
				Static331.method4762(local36);
			}
			Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[arg1] = null;
			if (arg0.method4535(1) != 0) {
				Static42.method726(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!r;II)Z")
	public static boolean method6235(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static281.anInt4822 - 104) / 2;
		@Pc(17) int local17 = (Static29.anInt491 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(42) int local42;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static470.method6060(local25, arg1, local21, local29)) {
						local42 = local29;
						if (Static562.method7350(local21, local25)) {
							local42 = local29 - 1;
						}
						if (local42 >= 0) {
							local19 &= Static548.method7164(local42, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local29 = 0; local29 < local90.length; local29++) {
			local90[local29] = -16777216;
		}
		Static64.aClass38_7 = arg0.method6879(local90, 512, 512, 512);
		Static332.method7661();
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (238 - (-((int) (Math.random() * 20.0D)) - -10) << 16) + 238 - 10 | 0xFF000000;
		@Pc(160) int local160 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(184) int local184 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(196) boolean[][] local196 = new boolean[Static347.anInt5971 + 1 + 2][Static347.anInt5971 + 2 + 1];
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(208) int local208;
		@Pc(210) int local210;
		@Pc(219) int local219;
		@Pc(226) int local226;
		@Pc(236) int local236;
		@Pc(263) int local263;
		@Pc(267) int local267;
		@Pc(322) int local322;
		@Pc(328) int local328;
		@Pc(332) int local332;
		@Pc(347) int local347;
		for (@Pc(198) int local198 = local11; local198 < local11 + 104; local198 += Static347.anInt5971) {
			for (local202 = local17; local202 < local17 + 104; local202 += Static347.anInt5971) {
				local206 = 0;
				local208 = 0;
				local210 = local198;
				if (local198 > 0) {
					local206 += 4;
					local210 = local198 - 1;
				}
				local219 = local202;
				if (local202 > 0) {
					local219 = local202 - 1;
				}
				local226 = Static347.anInt5971 + local198;
				if (local226 < 104) {
					local226++;
				}
				local236 = local202 + Static347.anInt5971;
				if (local236 < 104) {
					local208 += 4;
					local236++;
				}
				arg0.da(0, 0, local206 + Static347.anInt5971 * 4, local208 + Static347.anInt5971 * 4);
				arg0.ja(-16777216);
				@Pc(271) int local271;
				for (local263 = arg1; local263 <= 3; local263++) {
					for (local267 = 0; local267 <= Static347.anInt5971; local267++) {
						for (local271 = 0; local271 <= Static347.anInt5971; local271++) {
							local196[local267][local271] = Static470.method6060(local219 + local271, arg1, local267 + local210, local263);
						}
					}
					Static261.aClass151Array2[local263].method7677(local210, local219, local226, local236, local196);
					if (!Static458.aBoolean617) {
						for (local271 = -4; local271 < Static347.anInt5971; local271++) {
							for (local322 = -4; local322 < Static347.anInt5971; local322++) {
								local328 = local198 + local271;
								local332 = local322 + local202;
								if (local328 >= local11 && local332 >= local17 && Static470.method6060(local332, arg1, local328, local263)) {
									local347 = local263;
									if (Static562.method7350(local328, local332)) {
										local347 = local263 - 1;
									}
									if (local347 >= 0) {
										Static442.method5790(local42, local208 + (Static347.anInt5971 - local322) * 4 - 4, local160, local206 + local271 * 4, local347, arg0, local332, local328);
									}
								}
							}
						}
					}
				}
				if (Static458.aBoolean617) {
					@Pc(403) Class362 local403 = Static87.aClass362Array3[arg1];
					for (local271 = 0; local271 < Static347.anInt5971; local271++) {
						for (local322 = 0; local322 < Static347.anInt5971; local322++) {
							local328 = local198 + local271;
							local332 = local202 + local322;
							local347 = local403.anIntArrayArray64[local328 - local403.anInt9517][local332 - local403.anInt9521];
							if ((local347 & 0x40240000) != 0) {
								arg0.method6885((Static347.anInt5971 - local322) * 4 + local208 - 4, -1713569622, 4, local271 * 4 + local206, 4);
							} else if ((local347 & 0x800000) != 0) {
								arg0.method6873(-1713569622, (Static347.anInt5971 - local322) * 4 + local208 - 4, local206 - -(local271 * 4), 4);
							} else if ((local347 & 0x2000000) != 0) {
								arg0.method6834(-1713569622, 4, local208 + (Static347.anInt5971 - local322) * 4 - 4, local271 * 4 + local206 - -3);
							} else if ((local347 & 0x8000000) != 0) {
								arg0.method6873(-1713569622, local208 + (Static347.anInt5971 - local322) * 4 + 3 - 4, local271 * 4 + local206, 4);
							} else if ((local347 & 0x20000000) != 0) {
								arg0.method6834(-1713569622, 4, (Static347.anInt5971 - local322) * 4 + local208 - 4, local206 + local271 * 4);
							}
						}
					}
				}
				arg0.J(local206, local208, Static347.anInt5971 * 4, Static347.anInt5971 * 4, local184, 2);
				Static64.aClass38_7.da((local198 - local11) * 4 + 48, -((local202 - local17) * 4) + 464 - Static347.anInt5971 * 4, Static347.anInt5971 * 4, Static347.anInt5971 * 4, local206, local208);
			}
		}
		arg0.JA();
		arg0.ja(-16777215);
		Static549.method7175();
		Static314.anInt7787 = 0;
		Static232.aClass70_24.method1265();
		if (!Static458.aBoolean617) {
			for (local202 = local11; local202 < local11 + 104; local202++) {
				for (local206 = local17; local206 < local17 + 104; local206++) {
					for (local208 = arg1; local208 <= arg1 + 1 && local208 <= 3; local208++) {
						if (Static470.method6060(local206, arg1, local202, local208)) {
							@Pc(699) Interface14 local699 = (Interface14) Static347.method5019(local208, local202, local206);
							if (local699 == null) {
								local699 = (Interface14) Static32.method551(local208, local202, local206, je.class);
							}
							if (local699 == null) {
								local699 = (Interface14) Static389.method5373(local208, local202, local206);
							}
							if (local699 == null) {
								local699 = (Interface14) Static552.method7232(local208, local202, local206);
							}
							if (local699 != null) {
								@Pc(742) Class216 local742 = Static362.aClass290_2.method5799(local699.method7094());
								if (!local742.aBoolean414 || Static524.aBoolean704) {
									local226 = local742.anInt5284;
									if (local742.anIntArray362 != null) {
										for (local236 = 0; local236 < local742.anIntArray362.length; local236++) {
											if (local742.anIntArray362[local236] != -1) {
												@Pc(771) Class216 local771 = Static362.aClass290_2.method5799(local742.anIntArray362[local236]);
												if (local771.anInt5284 >= 0) {
													local226 = local771.anInt5284;
												}
											}
										}
									}
									if (local226 >= 0) {
										@Pc(790) boolean local790 = false;
										if (local226 >= 0) {
											@Pc(797) Class142 local797 = Static8.aClass360_1.method7576(local226);
											if (local797 != null && local797.aBoolean212) {
												local790 = true;
											}
										}
										local263 = local202;
										local267 = local206;
										if (local790) {
											@Pc(815) int[][] local815 = Static87.aClass362Array3[local208].anIntArrayArray64;
											local322 = Static87.aClass362Array3[local208].anInt9517;
											local328 = Static87.aClass362Array3[local208].anInt9521;
											for (local332 = 0; local332 < 10; local332++) {
												local347 = (int) (Math.random() * 4.0D);
												if (local347 == 0 && local263 > local11 && local263 > local202 - 3 && (local815[local263 - local322 - 1][local267 - local328] & 0x2C0108) == 0) {
													local263--;
												}
												if (local347 == 1 && local263 < local11 + 104 - 1 && local263 < local202 + 3 && (local815[local263 + 1 - local322][local267 - local328] & 0x2C0180) == 0) {
													local263++;
												}
												if (local347 == 2 && local17 < local267 && local206 - 3 < local267 && (local815[local263 - local322][local267 - local328 - 1] & 0x2C0102) == 0) {
													local267--;
												}
												if (local347 == 3 && local267 < local17 + 104 - 1 && local267 < local206 + 3 && (local815[local263 - local322][local267 + 1 - local328] & 0x2C0120) == 0) {
													local267++;
												}
											}
										}
										Static459.anIntArray494[Static314.anInt7787] = local742.anInt5259;
										Static237.anIntArray289[Static314.anInt7787] = local263;
										Static108.anIntArray163[Static314.anInt7787] = local267;
										Static314.anInt7787++;
									}
								}
							}
						}
					}
				}
			}
			if (Static170.aClass214_1 != null) {
				Static248.aClass229_57.anInt5920 = 1;
				Static8.aClass360_1.method7571(1024, 64);
				for (local206 = 0; local206 < Static170.aClass214_1.anInt5134; local206++) {
					local208 = Static170.aClass214_1.anIntArray357[local206];
					if (local208 >> 28 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128) {
						local210 = (local208 >> 14 & 0x3FFF) - Static485.anInt7725;
						local219 = (local208 & 0x3FFF) - Static310.anInt5129;
						if (local210 >= 0 && local210 < Static281.anInt4822 && local219 >= 0 && Static29.anInt491 > local219) {
							Static232.aClass70_24.method1269(new Class2_Sub44(local206));
						} else {
							@Pc(1100) Class142 local1100 = Static8.aClass360_1.method7576(Static170.aClass214_1.anIntArray356[local206]);
							if (local1100.anIntArray244 != null && local210 + local1100.anInt2934 >= 0 && Static281.anInt4822 > local210 + local1100.anInt2957 && local1100.anInt2944 + local219 >= 0 && local1100.anInt2958 + local219 < Static29.anInt491) {
								Static232.aClass70_24.method1269(new Class2_Sub44(local206));
							}
						}
					}
				}
				Static8.aClass360_1.method7571(128, 64);
				Static248.aClass229_57.anInt5920 = 2;
				Static248.aClass229_57.method4965();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z")
	public static boolean method6236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
	public static void method6237() {
		Static442.aClass70_45.method1265();
		Static94.anInt1654 = 0;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IFI[FZIIIFII)V")
	public static void method6238(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg9 - arg0;
		@Pc(9) int local9 = arg6 - arg5;
		@Pc(13) int local13 = arg4 - arg2;
		@Pc(38) float local38 = (float) local13 * arg3[2] + arg3[1] * (float) local5 + arg3[0] * (float) local9;
		@Pc(59) float local59 = (float) local13 * arg3[5] + (float) local9 * arg3[3] + arg3[4] * (float) local5;
		@Pc(80) float local80 = (float) local5 * arg3[7] + (float) local9 * arg3[6] + (float) local13 * arg3[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local91 *= arg7;
		}
		@Pc(105) float local105 = arg1 + local59 + 0.5F;
		@Pc(114) float local114;
		if (arg8 == 1) {
			local114 = local91;
			local91 = -local105;
			local105 = local114;
		} else if (arg8 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg8 == 3) {
			local114 = local91;
			local91 = local105;
			local105 = -local114;
		}
		Static212.aFloat66 = local105;
		Static157.aFloat57 = local91;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIII)V")
	public static void method6239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static48.anInt898 || Static275.anInt4756 > arg3) {
			return;
		}
		@Pc(39) boolean local39;
		if (Static130.anInt2131 > arg2) {
			local39 = false;
			arg2 = Static130.anInt2131;
		} else if (arg2 <= Static89.anInt1576) {
			local39 = true;
		} else {
			arg2 = Static89.anInt1576;
			local39 = false;
		}
		@Pc(65) boolean local65;
		if (Static130.anInt2131 > arg0) {
			arg0 = Static130.anInt2131;
			local65 = false;
		} else if (Static89.anInt1576 >= arg0) {
			local65 = true;
		} else {
			local65 = false;
			arg0 = Static89.anInt1576;
		}
		if (arg4 >= Static275.anInt4756) {
			Static437.method5735(arg2, Static238.anIntArrayArray36[arg4++], arg0, arg1);
		} else {
			arg4 = Static275.anInt4756;
		}
		if (arg3 > Static48.anInt898) {
			arg3 = Static48.anInt898;
		} else {
			Static437.method5735(arg2, Static238.anIntArrayArray36[arg3--], arg0, arg1);
		}
		@Pc(126) int local126;
		if (local39 && local65) {
			for (local126 = arg4; local126 <= arg3; local126++) {
				@Pc(132) int[] local132 = Static238.anIntArrayArray36[local126];
				local132[arg2] = local132[arg0] = arg1;
			}
			return;
		}
		if (local39) {
			for (local126 = arg4; local126 <= arg3; local126++) {
				Static238.anIntArrayArray36[local126][arg2] = arg1;
			}
			return;
		}
		if (local65) {
			for (local126 = arg4; local126 <= arg3; local126++) {
				Static238.anIntArrayArray36[local126][arg0] = arg1;
			}
			return;
		}
	}
}
