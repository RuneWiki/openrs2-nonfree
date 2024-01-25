import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	public static int anInt136 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!e;II)Z")
	public static boolean method131(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static195.anInt3965 - 104) / 2;
		@Pc(17) int local17 = (Static298.anInt5716 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static112.method2401(local21, arg1, local29, local25)) {
						local40 = local29;
						if (method132(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static275.method4676(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(82) int[] local82 = new int[262144];
		for (local29 = 0; local29 < local82.length; local29++) {
			local82[local29] = -16777216;
		}
		Static254.aClass2_18 = arg0.method5167(local82, 512, 512, 512);
		Static312.method5392();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
		@Pc(153) int local153 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(172) int local172 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(176) boolean[][] local176 = new boolean[Static318.anInt6131][Static318.anInt6131];
		@Pc(182) int local182;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(261) int local261;
		@Pc(268) int local268;
		@Pc(273) int local273;
		@Pc(288) int local288;
		for (@Pc(178) int local178 = local11; local178 < local11 + 104; local178 += Static318.anInt6131) {
			for (local182 = local17; local182 < local17 + 104; local182 += Static318.anInt6131) {
				arg0.method5172(0, 0, Static318.anInt6131 * 4, Static318.anInt6131 * 4);
				arg0.method5100(-16777216);
				for (local199 = arg1; local199 <= 3; local199++) {
					for (local203 = 0; local203 < Static318.anInt6131; local203++) {
						for (local207 = 0; local207 < Static318.anInt6131; local207++) {
							local176[local203][local207] = Static112.method2401(local203 + local178, arg1, local199, local207 + local182);
						}
					}
					Static18.aClass114Array1[local199].method3597(local178, local182, local178 + Static318.anInt6131, local182 + Static318.anInt6131, local176);
					if (!Static316.aBoolean225) {
						for (local207 = -4; local207 < Static318.anInt6131; local207++) {
							for (local261 = -4; local261 < Static318.anInt6131; local261++) {
								local268 = local178 + local207;
								local273 = local182 + local261;
								if (local11 <= local268 && local17 <= local273 && Static112.method2401(local268, arg1, local199, local273)) {
									local288 = local199;
									if (method132(local273, local268)) {
										local288 = local199 - 1;
									}
									if (local288 >= 0) {
										Static193.method3665(local288, local273, local268, local207 * 4, (Static318.anInt6131 - local261) * 4 - 4, local153, arg0, local40);
									}
								}
							}
						}
					}
				}
				if (Static316.aBoolean225) {
					@Pc(336) Class65 local336 = Static75.aClass65Array1[arg1];
					for (local207 = 0; local207 < Static318.anInt6131; local207++) {
						for (local261 = 0; local261 < Static318.anInt6131; local261++) {
							local268 = local207 + local178;
							local273 = local261 + local182;
							local288 = local336.anIntArrayArray29[local268 - local336.anInt2120][local273 - local336.anInt2134];
							if ((local288 & 0x40240000) != 0) {
								arg0.method5108(4, local207 * 4, 4, -1713569622, (Static318.anInt6131 - local261) * 4 - 4);
							} else if ((local288 & 0x800000) != 0) {
								arg0.method5113(-1713569622, (Static318.anInt6131 - local261) * 4 - 4, local207 * 4, 4);
							} else if ((local288 & 0x2000000) != 0) {
								arg0.method5099(local207 * 4 + 3, 4, (Static318.anInt6131 - local261) * 4 - 4, -1713569622);
							} else if ((local288 & 0x8000000) != 0) {
								arg0.method5113(-1713569622, (Static318.anInt6131 - local261) * 4 + 3 - 4, local207 * 4, 4);
							} else if ((local288 & 0x20000000) != 0) {
								arg0.method5099(local207 * 4, 4, (Static318.anInt6131 - local261) * 4 - 4, -1713569622);
							}
						}
					}
				}
				arg0.method5110(0, 0, Static318.anInt6131 * 4, Static318.anInt6131 * 4, local172, 2);
				Static254.aClass2_18.method2644((local178 - local11) * 4 + 48, -((-local17 + local182) * 4) + 464 + -(Static318.anInt6131 * 4), Static318.anInt6131 * 4, Static318.anInt6131 * 4);
			}
		}
		arg0.method5139();
		arg0.method5100(-16777215);
		Static7.method206();
		Static3.anInt111 = 0;
		Static326.aClass18_43.method461();
		if (!Static316.aBoolean225) {
			for (local182 = local11; local182 < local11 + 104; local182++) {
				for (local199 = local17; local199 < local17 + 104; local199++) {
					for (local203 = arg1; local203 <= arg1 + 1 && local203 <= 3; local203++) {
						if (Static112.method2401(local182, arg1, local203, local199)) {
							@Pc(598) Interface7 local598 = (Interface7) Static274.method4660(local203, local182, local199);
							if (local598 == null) {
								local598 = (Interface7) Static263.method4514(local203, local182, local199, up.class);
							}
							if (local598 == null) {
								local598 = (Interface7) Static242.method4277(local203, local182, local199);
							}
							if (local598 == null) {
								local598 = (Interface7) Static216.method3896(local203, local182, local199);
							}
							if (local598 != null) {
								@Pc(638) Class59 local638 = Static232.method2200(local598.method4070());
								if (!local638.aBoolean130 || Static15.aBoolean420) {
									local268 = local638.anInt1944;
									if (local638.anIntArray176 != null) {
										for (local273 = 0; local273 < local638.anIntArray176.length; local273++) {
											if (local638.anIntArray176[local273] != -1) {
												@Pc(668) Class59 local668 = Static232.method2200(local638.anIntArray176[local273]);
												if (local668.anInt1944 >= 0) {
													local268 = local668.anInt1944;
												}
											}
										}
									}
									if (local268 >= 0) {
										@Pc(690) boolean local690 = false;
										if (local268 >= 0) {
											@Pc(699) Class52 local699 = Static247.method4306(local268);
											if (local699 != null && local699.aBoolean112) {
												local690 = true;
											}
										}
										local288 = local182;
										@Pc(710) int local710 = local199;
										if (local690) {
											@Pc(717) int[][] local717 = Static75.aClass65Array1[local203].anIntArrayArray29;
											@Pc(722) int local722 = Static75.aClass65Array1[local203].anInt2120;
											@Pc(727) int local727 = Static75.aClass65Array1[local203].anInt2134;
											for (@Pc(729) int local729 = 0; local729 < 10; local729++) {
												@Pc(736) int local736 = (int) (Math.random() * 4.0D);
												if (local736 == 0 && local288 > local11 && local288 > local182 - 3 && (local717[local288 - local722 - 1][local710 - local727] & 0x2C0108) == 0) {
													local288--;
												}
												if (local736 == 1 && local11 + 104 - 1 > local288 && local182 + 3 > local288 && (local717[local288 + 1 - local722][local710 - local727] & 0x2C0180) == 0) {
													local288++;
												}
												if (local736 == 2 && local710 > local17 && local710 > local199 - 3 && (local717[local288 - local722][local710 - local727 - 1] & 0x2C0102) == 0) {
													local710--;
												}
												if (local736 == 3 && local710 < local17 + 104 - 1 && local710 < local199 + 3 && (local717[local288 - local722][local710 + 1 - local727] & 0x2C0120) == 0) {
													local710++;
												}
											}
										}
										Static74.anIntArray483[Static3.anInt111] = local638.anInt1951;
										Static84.anIntArray189[Static3.anInt111] = local288;
										Static31.anIntArray47[Static3.anInt111] = local710;
										Static3.anInt111++;
									}
								}
							}
						}
					}
				}
			}
			if (Static112.aClass163_1 != null) {
				Static185.aClass143_75.anInt4082 = 1;
				Static147.method2549(64, 1024);
				for (local199 = 0; local199 < Static112.aClass163_1.anInt4750; local199++) {
					local203 = Static112.aClass163_1.anIntArray429[local199];
					if (local203 >> 28 == Static219.anInt4400) {
						local207 = (local203 >> 14 & 0x3FFF) - Static151.anInt3234;
						local261 = (local203 & 0x3FFF) - Static251.anInt3170;
						if (local207 >= 0 && local207 < Static195.anInt3965 && local261 >= 0 && local261 < Static298.anInt5716) {
							Static326.aClass18_43.method451(new Class14_Sub34(local199));
						} else {
							@Pc(990) Class52 local990 = Static247.method4306(Static112.aClass163_1.anIntArray428[local199]);
							if (local990.anIntArray128 != null && local207 + local990.anInt1733 >= 0 && Static195.anInt3965 > local207 + local990.anInt1749 && local261 + local990.anInt1758 >= 0 && Static298.anInt5716 > local990.anInt1736 + local261) {
								Static326.aClass18_43.method451(new Class14_Sub34(local199));
							}
						}
					}
				}
				Static147.method2549(64, 128);
				Static185.aClass143_75.anInt4082 = 2;
				Static185.aClass143_75.method3748();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBI)Z")
	public static boolean method132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static108.aByteArrayArrayArray5[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!e;Z[[B[[B[[IBLclient!lf;[[B[[BILclient!lf;II)V")
	public static void method134(@OriginalArg(0) Class46 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(6) Class114 arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class114 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg10; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg11; local7++) {
				if (Static96.method2208() || Static112.method2401(local3, Static125.anInt2720, arg8, local7)) {
					@Pc(27) byte local27 = arg3[local3][local7];
					@Pc(33) byte local33 = arg7[local3][local7];
					@Pc(41) int local41 = arg2[local3][local7] & 0xFF;
					@Pc(49) int local49 = arg6[local3][local7] & 0xFF;
					@Pc(59) Class69 local59 = local41 == 0 ? null : Static327.method5626(local41 - 1);
					@Pc(69) Class48 local69 = local49 == 0 ? null : Static354.method5983(local49 - 1);
					@Pc(71) int local71 = 0;
					@Pc(73) int local73 = 0;
					if (local27 != 0) {
						local71 = local69 == null ? 0 : Static212.anIntArray379[local27];
						local73 = local59 == null ? 0 : Static181.anIntArray325[local27];
					} else if (local59 != null) {
						local73 = Static181.anIntArray325[local27];
					} else if (local69 != null) {
						local71 = Static181.anIntArray325[local27];
					}
					@Pc(112) int local112 = local73 + local71;
					@Pc(114) int local114 = 0;
					if (local112 != 0) {
						@Pc(122) int[] local122 = new int[local112];
						@Pc(125) int[] local125 = new int[local112];
						@Pc(128) int[] local128 = new int[local112];
						@Pc(131) int[] local131 = new int[local112];
						@Pc(133) boolean local133 = false;
						@Pc(151) int local151;
						@Pc(179) int local179;
						if (local59 == null || local59.anInt2182 == -1 && local59.anInt2179 == -1 && local59.anInt2172 == -1) {
							for (local151 = 0; local151 < local73; local151++) {
								local122[local114] = -1;
								local114++;
							}
						} else {
							local151 = arg0.method5160() ? local59.anInt2172 : local59.anInt2178;
							if (!Static27.aBoolean30) {
								local151 = -1;
							}
							for (local179 = 0; local179 < local73; local179++) {
								local128[local114] = local151;
								local131[local114] = local59.anInt2186;
								if (local59.anInt2182 == -1) {
									local122[local114] = -1;
								} else {
									local122[local114] = local59.anInt2182;
								}
								if (local59.anInt2179 == -1) {
									local125[local114] = -1;
								} else {
									local125[local114] = local59.anInt2179;
									local133 = true;
								}
								local114++;
							}
							if (!arg1 && arg8 == 0) {
								Static117.method4691(local3, local7, local59.anInt2175, local59.anInt2177 * 8);
							}
						}
						if (!local133) {
							local125 = null;
						}
						if (local69 == null) {
							for (local151 = 0; local151 < local71; local151++) {
								local122[local114] = -1;
								local114++;
							}
						} else {
							local151 = local69.anInt1634;
							if (!Static27.aBoolean30) {
								local151 = -1;
							}
							for (local179 = 0; local179 < local71; local179++) {
								local128[local114] = local151;
								local131[local114] = local69.anInt1630;
								local122[local114] = arg4[local3][local7];
								if (local125 != null) {
									local125[local114] = -1;
								}
								local114++;
							}
						}
						local151 = Static69.anIntArray119.length;
						@Pc(315) int[] local315 = arg1 ? new int[local151] : null;
						@Pc(318) int[] local318 = new int[local151];
						@Pc(321) int[] local321 = new int[local151];
						@Pc(329) int local329;
						@Pc(333) int local333;
						@Pc(418) int local418;
						@Pc(427) int local427;
						for (@Pc(323) int local323 = 0; local323 < local151; local323++) {
							local329 = Static69.anIntArray119[local323];
							local333 = Static291.anIntArray508[local323];
							if (local33 == 0) {
								local318[local323] = local329;
								local321[local323] = local333;
							} else if (local33 == 1) {
								local318[local323] = local333;
								local321[local323] = 128 - local329;
							} else if (local33 == 2) {
								local318[local323] = 128 - local329;
								local321[local323] = 128 - local333;
							} else if (local33 == 3) {
								local318[local323] = 128 - local333;
								local321[local323] = local329;
							}
							if (arg1 && Static249.aBooleanArrayArray3[local27][local323]) {
								local418 = (local3 << 7) + local318[local323];
								local427 = (local7 << 7) + local321[local323];
								local315[local323] = arg5.method3607(local418, local427) - arg9.method3607(local418, local427);
							}
						}
						local329 = arg9.method3610(local3, local7);
						local333 = arg9.method3610(local3 + 1, local7);
						local418 = arg9.method3610(local3 + 1, local7 + 1);
						local427 = arg9.method3610(local3, local7 + 1);
						if (arg8 > 0) {
							@Pc(475) boolean local475 = true;
							if (local49 == 0 && local27 != 0) {
								local475 = false;
							}
							if (local41 > 0 && local59 != null && !local59.aBoolean151) {
								local475 = false;
							}
							if (local475 && local329 == local333 && local418 == local329 && local427 == local329) {
								Static294.aByteArrayArrayArray12[arg8][local3][local7] = (byte) (Static294.aByteArrayArrayArray12[arg8][local3][local7] | 0x4);
							}
						}
						@Pc(528) int local528 = 0;
						@Pc(530) int local530 = 0;
						if (arg1) {
							local528 = Static2.method105(local3, local7);
							local530 = Static104.method2279(local3, local7);
						}
						arg9.method3612(local3, local7, local318, local315, local321, Static214.anIntArrayArray71[local27], Static355.anIntArrayArray99[local27], Static284.anIntArrayArray82[local27], local122, local125, local128, local131, local528, local530);
						Static243.method4280(arg8, local3, local7);
					}
				}
			}
		}
	}
}
