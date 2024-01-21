import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array10;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "[I")
	public static final int[] anIntArray330 = new int[5];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method2296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg7 && arg3 == arg2 && arg8 == arg6 && arg0 == arg5) {
			Static106.method1719(arg5, arg6, arg3, arg7, arg4);
			return;
		}
		@Pc(23) int local23 = arg7;
		@Pc(25) int local25 = arg3;
		@Pc(29) int local29 = arg7 * 3;
		@Pc(33) int local33 = arg2 * 3;
		@Pc(37) int local37 = arg1 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(55) int local55 = local37 + arg6 - arg7 - local45;
		@Pc(59) int local59 = arg0 * 3;
		@Pc(68) int local68 = local33 + arg5 - local59 - arg3;
		@Pc(77) int local77 = local29 + local45 - local37 - local37;
		@Pc(85) int local85 = local41 + local59 - local33 - local33;
		@Pc(89) int local89 = local37 - local29;
		@Pc(94) int local94 = local33 - local41;
		for (@Pc(96) int local96 = 128; local96 <= 4096; local96 += 128) {
			@Pc(104) int local104 = local96 * local96 >> 12;
			@Pc(110) int local110 = local104 * local96 >> 12;
			@Pc(114) int local114 = local55 * local110;
			@Pc(118) int local118 = local68 * local110;
			@Pc(122) int local122 = local85 * local104;
			@Pc(126) int local126 = local104 * local77;
			@Pc(130) int local130 = local94 * local96;
			@Pc(134) int local134 = local89 * local96;
			@Pc(145) int local145 = (local118 + local122 + local130 >> 12) + arg3;
			@Pc(156) int local156 = arg7 + (local134 + local114 + local126 >> 12);
			Static106.method1719(local145, local156, local25, local23, arg4);
			local23 = local156;
			local25 = local145;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([Lclient!p;IZ)V")
	public static void method2297(@OriginalArg(0) Class76[] arg0) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		for (local21 = 0; local21 < 4; local21++) {
			for (local25 = 0; local25 < 104; local25++) {
				for (@Pc(29) int local29 = 0; local29 < 104; local29++) {
					if ((Static168.aByteArrayArrayArray13[local21][local25][local29] & 0x1) == 1) {
						@Pc(46) int local46 = local21;
						if ((Static168.aByteArrayArrayArray13[1][local25][local29] & 0x2) == 2) {
							local46 = local21 - 1;
						}
						if (local46 >= 0) {
							arg0[local46].method2217(local29, local25);
						}
					}
				}
			}
		}
		Static123.anInt2610 += (int) (Math.random() * 5.0D) - 2;
		Static68.anInt1481 += (int) (Math.random() * 5.0D) - 2;
		if (Static68.anInt1481 < -8) {
			Static68.anInt1481 = -8;
		}
		if (Static123.anInt2610 < -16) {
			Static123.anInt2610 = -16;
		}
		if (Static123.anInt2610 > 16) {
			Static123.anInt2610 = 16;
		}
		if (Static68.anInt1481 > 8) {
			Static68.anInt1481 = 8;
		}
		local21 = Static68.anInt1481 >> 2 << 10;
		local25 = Static123.anInt2610 >> 1;
		@Pc(142) int[][] local142 = new int[104][104];
		@Pc(146) int[][] local146 = new int[104][104];
		@Pc(162) int local162;
		@Pc(168) int local168;
		@Pc(170) int local170;
		@Pc(174) int local174;
		@Pc(266) int local266;
		@Pc(198) int local198;
		@Pc(219) int local219;
		@Pc(232) int local232;
		@Pc(242) int local242;
		@Pc(236) int local236;
		@Pc(248) int local248;
		@Pc(314) int local314;
		@Pc(524) int local524;
		@Pc(563) int local563;
		@Pc(819) int local819;
		for (@Pc(148) int local148 = 0; local148 < 4; local148++) {
			@Pc(154) byte[][] local154 = Static165.aByteArrayArrayArray9[local148];
			local162 = (int) Math.sqrt(5100.0D);
			local168 = local162 * 768 >> 8;
			for (local170 = 1; local170 < 103; local170++) {
				for (local174 = 1; local174 < 103; local174++) {
					local198 = Static37.anIntArrayArrayArray5[local148][local174 + 1][local170] - Static37.anIntArrayArrayArray5[local148][local174 - 1][local170];
					local219 = Static37.anIntArrayArrayArray5[local148][local174][local170 + 1] - Static37.anIntArrayArrayArray5[local148][local174][local170 - 1];
					local232 = (int) Math.sqrt((double) (local219 * local219 + local198 * local198 + 65536));
					local236 = -65536 / local232;
					local242 = (local198 << 8) / local232;
					local248 = (local219 << 8) / local232;
					local266 = (local242 * -50 + local236 * -10 + local248 * -50) / local168 + 74;
					local314 = (local154[local174][local170] >> 1) + (local154[local174][local170 + 1] >> 3) + (local154[local174 + 1][local170] >> 3) + (local154[local174 - 1][local170] >> 2) + (local154[local174][local170 - 1] >> 2);
					local146[local174][local170] = local266 - local314;
				}
			}
			for (local174 = 0; local174 < 104; local174++) {
				Static133.anIntArray302[local174] = 0;
				Static76.anIntArray149[local174] = 0;
				Static110.anIntArray256[local174] = 0;
				Static58.anIntArray126[local174] = 0;
				Static8.anIntArray15[local174] = 0;
			}
			for (local266 = -5; local266 < 104; local266++) {
				for (local198 = 0; local198 < 104; local198++) {
					local219 = local266 + 5;
					@Pc(428) int local428;
					if (local219 < 104) {
						local232 = Static93.aByteArrayArrayArray11[local148][local219][local198] & 0xFF;
						if (local232 > 0) {
							@Pc(392) Class5_Sub2_Sub24 local392 = Static52.method914(local232 - 1);
							Static133.anIntArray302[local198] += local392.anInt3823;
							Static76.anIntArray149[local198] += local392.anInt3829;
							Static110.anIntArray256[local198] += local392.anInt3824;
							Static58.anIntArray126[local198] += local392.anInt3827;
							local428 = Static8.anIntArray15[local198]++;
						}
					}
					local232 = local266 - 5;
					if (local232 >= 0) {
						local242 = Static93.aByteArrayArrayArray11[local148][local232][local198] & 0xFF;
						if (local242 > 0) {
							@Pc(458) Class5_Sub2_Sub24 local458 = Static52.method914(local242 - 1);
							Static133.anIntArray302[local198] -= local458.anInt3823;
							Static76.anIntArray149[local198] -= local458.anInt3829;
							Static110.anIntArray256[local198] -= local458.anInt3824;
							Static58.anIntArray126[local198] -= local458.anInt3827;
							local428 = Static8.anIntArray15[local198]--;
						}
					}
				}
				if (local266 >= 0) {
					local242 = 0;
					local232 = 0;
					local236 = 0;
					local219 = 0;
					local248 = 0;
					for (local314 = -5; local314 < 104; local314++) {
						local524 = local314 + 5;
						if (local524 < 104) {
							local232 += Static76.anIntArray149[local524];
							local242 += Static110.anIntArray256[local524];
							local236 += Static58.anIntArray126[local524];
							local219 += Static133.anIntArray302[local524];
							local248 += Static8.anIntArray15[local524];
						}
						local563 = local314 - 5;
						if (local563 >= 0) {
							local236 -= Static58.anIntArray126[local563];
							local219 -= Static133.anIntArray302[local563];
							local248 -= Static8.anIntArray15[local563];
							local232 -= Static76.anIntArray149[local563];
							local242 -= Static110.anIntArray256[local563];
						}
						if (local314 >= 0 && local248 > 0) {
							local142[local266][local314] = Static125.method1967(local242 / local248, local219 * 256 / local236, local232 / local248);
						}
					}
				}
			}
			for (local198 = 1; local198 < 103; local198++) {
				for (local219 = 1; local219 < 103; local219++) {
					if (!Static14.aBoolean14 || (Static168.aByteArrayArrayArray13[0][local198][local219] & 0x2) != 0 || (Static168.aByteArrayArrayArray13[local148][local198][local219] & 0x10) == 0 && Static35.method555(local219, local198, local148) == Static38.anInt829) {
						if (local148 < Static56.anInt1162) {
							Static56.anInt1162 = local148;
						}
						local232 = Static93.aByteArrayArrayArray11[local148][local198][local219] & 0xFF;
						local242 = Static83.aByteArrayArrayArray5[local148][local198][local219] & 0xFF;
						if (local232 > 0 || local242 > 0) {
							local236 = Static37.anIntArrayArrayArray5[local148][local198][local219];
							local248 = Static37.anIntArrayArrayArray5[local148][local198 + 1][local219];
							local524 = Static37.anIntArrayArrayArray5[local148][local198][local219 + 1];
							local314 = Static37.anIntArrayArrayArray5[local148][local198 + 1][local219 + 1];
							if (local148 > 0) {
								@Pc(755) boolean local755 = true;
								if (local232 == 0 && Static168.aByteArrayArrayArray14[local148][local198][local219] != 0) {
									local755 = false;
								}
								if (local242 > 0 && !Static114.method496(local242 - 1).aBoolean10) {
									local755 = false;
								}
								if (local755 && local248 == local236 && local236 == local314 && local236 == local524) {
									Static105.anIntArrayArrayArray8[local148][local198][local219] |= 0x924;
								}
							}
							@Pc(835) int local835;
							@Pc(860) int local860;
							if (local232 <= 0) {
								local819 = 0;
								local563 = -1;
							} else {
								local563 = local142[local198][local219];
								local835 = local25 + (local563 & 0x7F);
								if (local835 < 0) {
									local835 = 0;
								} else if (local835 > 127) {
									local835 = 127;
								}
								local860 = (local563 + local21 & 0xFC00) + (local563 & 0x380) + local835;
								local819 = Static149.anIntArray328[Static33.method546(96, local860)];
							}
							local860 = local146[local198 + 1][local219];
							local835 = local146[local198][local219];
							@Pc(893) int local893 = local146[local198 + 1][local219 + 1];
							@Pc(901) int local901 = local146[local198][local219 + 1];
							if (local242 == 0) {
								Static33.method543(local148, local198, local219, 0, 0, -1, local236, local248, local314, local524, Static33.method546(local835, local563), Static33.method546(local860, local563), Static33.method546(local893, local563), Static33.method546(local901, local563), 0, 0, 0, 0, local819, 0);
							} else {
								@Pc(916) int local916 = Static168.aByteArrayArrayArray14[local148][local198][local219] + 1;
								@Pc(924) byte local924 = Static128.aByteArrayArrayArray10[local148][local198][local219];
								@Pc(930) Class5_Sub2_Sub4 local930 = Static114.method496(local242 - 1);
								@Pc(933) int local933 = local930.anInt229;
								if (local933 >= 0 && !Static149.anInterface1_10.method2487(local933)) {
									local933 = -1;
								}
								@Pc(959) int local959;
								@Pc(957) int local957;
								@Pc(980) int local980;
								@Pc(1006) int local1006;
								if (local933 >= 0) {
									local957 = Static149.anIntArray328[Static64.method1047(96, Static149.anInterface1_10.method2489(local933))];
									local959 = -1;
								} else if (local930.anInt226 == -1) {
									local959 = -2;
									local957 = 0;
								} else {
									local959 = local930.anInt226;
									local980 = local25 + (local959 & 0x7F);
									if (local980 < 0) {
										local980 = 0;
									} else if (local980 > 127) {
										local980 = 127;
									}
									local1006 = local980 + (local21 + local959 & 0xFC00) + (local959 & 0x380);
									local957 = Static149.anIntArray328[Static64.method1047(96, local1006)];
								}
								if (local930.anInt230 >= 0) {
									local980 = local930.anInt230;
									local1006 = local25 + (local980 & 0x7F);
									if (local1006 < 0) {
										local1006 = 0;
									} else if (local1006 > 127) {
										local1006 = 127;
									}
									@Pc(1055) int local1055 = (local980 & 0x380) + (local980 + local21 & 0xFC00) + local1006;
									local957 = Static149.anIntArray328[Static64.method1047(96, local1055)];
								}
								Static33.method543(local148, local198, local219, local916, local924, local933, local236, local248, local314, local524, Static33.method546(local835, local563), Static33.method546(local860, local563), Static33.method546(local893, local563), Static33.method546(local901, local563), Static64.method1047(local835, local959), Static64.method1047(local860, local959), Static64.method1047(local893, local959), Static64.method1047(local901, local959), local819, local957);
							}
						}
					}
				}
			}
			for (local219 = 1; local219 < 103; local219++) {
				for (local232 = 1; local232 < 103; local232++) {
					Static154.method2333(local148, local232, local219, Static35.method555(local219, local232, local148));
				}
			}
			Static93.aByteArrayArrayArray11[local148] = null;
			Static83.aByteArrayArrayArray5[local148] = null;
			Static168.aByteArrayArrayArray14[local148] = null;
			Static128.aByteArrayArrayArray10[local148] = null;
			Static165.aByteArrayArrayArray9[local148] = null;
		}
		Static137.method2137();
		@Pc(1227) int local1227;
		for (@Pc(1223) int local1223 = 0; local1223 < 104; local1223++) {
			for (local1227 = 0; local1227 < 104; local1227++) {
				if ((Static168.aByteArrayArrayArray13[1][local1223][local1227] & 0x2) == 2) {
					Static180.method2722(local1223, local1227);
				}
			}
		}
		local1227 = 1;
		@Pc(1257) int local1257 = 2;
		local162 = 4;
		for (local168 = 0; local168 < 4; local168++) {
			if (local168 > 0) {
				local1257 <<= 0x3;
				local1227 <<= 0x3;
				local162 <<= 0x3;
			}
			for (local170 = 0; local170 <= local168; local170++) {
				for (local174 = 0; local174 <= 104; local174++) {
					for (local266 = 0; local266 <= 104; local266++) {
						if ((local1227 & Static105.anIntArrayArrayArray8[local170][local266][local174]) != 0) {
							for (local219 = local174; local219 < 104 && (local1227 & Static105.anIntArrayArrayArray8[local170][local266][local219 + 1]) != 0; local219++) {
							}
							for (local198 = local174; local198 > 0 && (Static105.anIntArrayArrayArray8[local170][local266][local198 - 1] & local1227) != 0; local198--) {
							}
							label351: for (local232 = local170; local232 > 0; local232--) {
								for (local236 = local198; local236 <= local219; local236++) {
									if ((local1227 & Static105.anIntArrayArrayArray8[local232 - 1][local266][local236]) == 0) {
										break label351;
									}
								}
							}
							label339: for (local242 = local170; local242 < local168; local242++) {
								for (local236 = local198; local236 <= local219; local236++) {
									if ((Static105.anIntArrayArrayArray8[local242 + 1][local266][local236] & local1227) == 0) {
										break label339;
									}
								}
							}
							local236 = (local242 + 1 - local232) * (local219 + 1 - local198);
							if (local236 >= 8) {
								local524 = Static37.anIntArrayArrayArray5[local232][local266][local198];
								local314 = Static37.anIntArrayArrayArray5[local242][local266][local198] - 240;
								Static204.method3019(local168, 1, local266 * 128, local266 * 128, local198 * 128, local219 * 128 + 128, local314, local524);
								for (local563 = local232; local563 <= local242; local563++) {
									for (local819 = local198; local819 <= local219; local819++) {
										Static105.anIntArrayArrayArray8[local563][local266][local819] &= ~local1227;
									}
								}
							}
						}
						if ((local1257 & Static105.anIntArrayArrayArray8[local170][local266][local174]) != 0) {
							for (local198 = local266; local198 > 0 && (local1257 & Static105.anIntArrayArrayArray8[local170][local198 - 1][local174]) != 0; local198--) {
							}
							local232 = local170;
							for (local219 = local266; local219 < 104 && (Static105.anIntArrayArrayArray8[local170][local219 + 1][local174] & local1257) != 0; local219++) {
							}
							local242 = local170;
							label406: while (local232 > 0) {
								for (local236 = local198; local236 <= local219; local236++) {
									if ((Static105.anIntArrayArrayArray8[local232 - 1][local236][local174] & local1257) == 0) {
										break label406;
									}
								}
								local232--;
							}
							label395: while (local168 > local242) {
								for (local236 = local198; local236 <= local219; local236++) {
									if ((local1257 & Static105.anIntArrayArrayArray8[local242 + 1][local236][local174]) == 0) {
										break label395;
									}
								}
								local242++;
							}
							local236 = (local242 + 1 - local232) * (local219 + 1 - local198);
							if (local236 >= 8) {
								local314 = Static37.anIntArrayArrayArray5[local242][local198][local174] - 240;
								local524 = Static37.anIntArrayArrayArray5[local232][local198][local174];
								Static204.method3019(local168, 2, local198 * 128, local219 * 128 + 128, local174 * 128, local174 * 128, local314, local524);
								for (local563 = local232; local563 <= local242; local563++) {
									for (local819 = local198; local819 <= local219; local819++) {
										Static105.anIntArrayArrayArray8[local563][local819][local174] &= ~local1257;
									}
								}
							}
						}
						if ((local162 & Static105.anIntArrayArrayArray8[local170][local266][local174]) != 0) {
							local198 = local266;
							local219 = local266;
							local232 = local174;
							for (local242 = local174; local242 < 104 && (local162 & Static105.anIntArrayArrayArray8[local170][local266][local242 + 1]) != 0; local242++) {
							}
							while (local232 > 0 && (Static105.anIntArrayArrayArray8[local170][local266][local232 - 1] & local162) != 0) {
								local232--;
							}
							label461: while (local198 > 0) {
								for (local236 = local232; local236 <= local242; local236++) {
									if ((Static105.anIntArrayArrayArray8[local170][local198 - 1][local236] & local162) == 0) {
										break label461;
									}
								}
								local198--;
							}
							label450: while (local219 < 104) {
								for (local236 = local232; local236 <= local242; local236++) {
									if ((Static105.anIntArrayArrayArray8[local170][local219 + 1][local236] & local162) == 0) {
										break label450;
									}
								}
								local219++;
							}
							if ((local242 + 1 - local232) * (local219 + 1 - local198) >= 4) {
								local236 = Static37.anIntArrayArrayArray5[local170][local198][local232];
								Static204.method3019(local168, 4, local198 * 128, local219 * 128 + 128, local232 * 128, local242 * 128 + 128, local236, local236);
								for (local248 = local198; local248 <= local219; local248++) {
									for (local314 = local232; local314 <= local242; local314++) {
										Static105.anIntArrayArrayArray8[local170][local248][local314] &= ~local162;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lclient!dc;")
	public static Class20 method2299(@OriginalArg(1) int arg0) {
		return Static70.method1166(new Class20[] { Static132.method2805(arg0 >> 24 & 0xFF), Static213.aClass20_1526, Static132.method2805(arg0 >> 16 & 0xFF), Static213.aClass20_1526, Static132.method2805(arg0 >> 8 & 0xFF), Static213.aClass20_1526, Static132.method2805(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public static void method2300() {
		try {
			if (Static47.aClass58_103 == null) {
				Static47.aClass58_103 = new Class58(Static8.aClass12_1, Static70.method1166(new Class20[] { Static71.aClass20_524, Static132.method2805(Static140.anInt2923), Static153.aClass20_1165 }).method564());
			} else {
				@Pc(44) byte[] local44 = Static47.aClass58_103.method1710();
				if (local44 != null) {
					@Pc(51) Class5_Sub6 local51 = new Class5_Sub6(local44);
					Static101.anInt2157 = local51.method3077();
					Static4.aClass85Array1 = new Class85[Static101.anInt2157];
					for (@Pc(60) int local60 = 0; local60 < Static101.anInt2157; local60++) {
						@Pc(70) Class85 local70 = Static4.aClass85Array1[local60] = new Class85();
						@Pc(74) int local74 = local51.method3077();
						local70.aBoolean142 = (local74 & 0x8000) != 0;
						local70.anInt3230 = local74 & 0x7FFF;
						local70.aClass20_1199 = local51.method3027();
						local70.anInt3228 = local51.method3075();
						local70.anInt3229 = local60;
						local70.anInt3224 = Static180.method2718(local51.method3077());
					}
					Static161.method2456(0, Static4.aClass85Array1, Static4.aClass85Array1.length - 1);
					Static47.aClass58_103 = null;
					Static158.aBoolean67 = true;
				}
			}
		} catch (@Pc(130) Exception local130) {
			local130.printStackTrace();
			Static47.aClass58_103 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIBII)V")
	public static void method2303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static27.anInt493 && Static72.anInt1572 >= arg3 && Static173.anInt3464 <= arg0 && arg1 <= Static174.anInt3493) {
			Static214.method3155(arg2, arg4, arg3, arg1, arg0);
		} else {
			Static204.method3020(arg0, arg2, arg4, arg1, arg3);
		}
	}
}
