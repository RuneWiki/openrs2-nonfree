import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt2748;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!wf;")
	public static Class189 aClass189_9;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public static int[] anIntArray242 = new int[] { 0, -2, -2, 0, 1, 0, 0, 0, 1, 0, 6, 8, 0, 0, 0, 0, 0, 15, 8, 20, 0, 0, 0, 3, 0, -2, 4, 0, 0, 0, -1, 12, 0, 3, -2, 9, 0, 0, 3, 0, 7, 0, 6, -2, -1, 0, 8, 7, 0, -2, 0, 0, 2, -2, -1, 1, 0, 0, 0, -1, 5, 0, 0, 7, 0, 10, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 8, 0, 10, 12, 0, 0, 8, 0, 2, 0, 2, 0, -1, 3, 0, 0, 4, -1, 15, 0, 0, 0, 0, 0, 17, 0, 12, 7, 3, -2, 0, 0, 0, 3, 0, 0, 0, 0, 0, -1, 0, 0, 6, 3, 4, 0, 14, 0, 6, -2, 3, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 8, 0, 5, 8, 10, 6, 0, -2, 2, 0, 6, 0, 0, 0, 14, 0, 6, 0, 28, 0, 2, 0, 0, 0, 8, -2, -1, 0, 5, 11, 0, 4, 0, 0, -1, 12, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 3, 8, 0, 0, -1, 0, 0, 0, 0, 0, -1, -2, 0, 0 };

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public static int anInt2747 = 0;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V")
	public static void method2193(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static239.anInt4517; local18++) {
			if (arg0 == Static132.aLongArray16[local18]) {
				Static239.anInt4517--;
				for (@Pc(38) int local38 = local18; local38 < Static239.anInt4517; local38++) {
					Static132.aLongArray16[local38] = Static132.aLongArray16[local38 + 1];
					Static130.aStringArray18[local38] = Static130.aStringArray18[local38 + 1];
					Static60.aBooleanArray5[local38] = Static60.aBooleanArray5[local38 + 1];
				}
				Static98.anInt2102 = Static261.anInt4980;
				Static110.aClass4_Sub10_Sub1_1.method4687(142);
				Static110.aClass4_Sub10_Sub1_1.method4619(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIZILclient!ch;ZI)V")
	public static void method2194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class30 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg8 && !Static29.method456() && (Static174.aByteArrayArrayArray17[0][arg4][arg6] & 0x2) == 0) {
			if ((Static174.aByteArrayArrayArray17[arg1][arg4][arg6] & 0x10) != 0) {
				return;
			}
			if (Static284.method4364(arg6, arg1, arg4) != Static60.anInt1216) {
				return;
			}
		}
		if (Static202.anInt3896 > arg1) {
			Static202.anInt3896 = arg1;
		}
		@Pc(60) Class184 local60 = Static6.method99(arg2);
		if (Static94.aBoolean138 && local60.aBoolean384) {
			return;
		}
		@Pc(78) int local78;
		@Pc(81) int local81;
		if (arg0 == 1 || arg0 == 3) {
			local78 = local60.anInt5517;
			local81 = local60.anInt5528;
		} else {
			local81 = local60.anInt5517;
			local78 = local60.anInt5528;
		}
		@Pc(102) int local102;
		@Pc(100) int local100;
		if (local78 + arg4 > 104) {
			local100 = arg4 + 1;
			local102 = arg4;
		} else {
			local100 = arg4 + (local78 + 1 >> 1);
			local102 = (local78 >> 1) + arg4;
		}
		@Pc(130) int local130;
		@Pc(128) int local128;
		if (arg6 + local81 > 104) {
			local128 = arg6 + 1;
			local130 = arg6;
		} else {
			local130 = (local81 >> 1) + arg6;
			local128 = arg6 + (local81 + 1 >> 1);
		}
		@Pc(151) int[][] local151 = Static243.anIntArrayArrayArray13[arg3];
		@Pc(159) int local159 = (local78 << 6) + (arg4 << 7);
		@Pc(167) int local167 = (local81 << 6) + (arg6 << 7);
		@Pc(193) int local193 = local151[local100][local130] + local151[local102][local130] + local151[local102][local128] + local151[local100][local128] >> 2;
		@Pc(195) int local195 = 0;
		@Pc(203) int[][] local203;
		if (Static94.aBoolean138 && arg3 != 0) {
			local203 = Static243.anIntArrayArrayArray13[0];
			local195 = local193 - (local203[local102][local128] + local203[local102][local130] + local203[local100][local130] + local203[local100][local128] >> 2);
		}
		@Pc(250) long local250 = (long) (arg4 | arg6 << 7 | arg9 << 14 | arg0 << 20 | 0x40000000);
		local203 = null;
		if (arg5) {
			local203 = Static259.anIntArrayArrayArray14[0];
		} else if (arg3 < 3) {
			local203 = Static243.anIntArrayArrayArray13[arg3 + 1];
		}
		if (local60.anInt5523 == 0 || arg5) {
			local250 |= Long.MIN_VALUE;
		}
		if (local60.anInt5518 == 1) {
			local250 |= 0x400000L;
		}
		if (local60.aBoolean385) {
			local250 |= 0x80000000L;
		}
		if (local60.method4500()) {
			Static7.method109(local60, arg4, null, arg6, null, arg0, arg1);
		}
		local250 |= (long) arg2 << 32;
		@Pc(330) boolean local330 = local60.aBoolean373 & !arg5;
		@Pc(377) Class53 local377;
		@Pc(393) Class97 local393;
		if (arg9 == 22) {
			if (Static117.aBoolean159 || local60.anInt5523 != 0 || local60.anInt5510 == 1 || local60.aBoolean377) {
				if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
					local393 = local60.method4487(local159, arg8, 22, local193, local151, local203, local330, arg0, local167, null);
					if (Static94.aBoolean138 && local330) {
						Static74.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
					}
					local377 = local393.aClass53_3;
				} else {
					local377 = new Class53_Sub7(arg2, 22, arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
				}
				Static315.method4863(arg1, arg4, arg6, local193, local377, local250, local60.aBoolean372);
				if (local60.anInt5510 == 1 && arg7 != null) {
					arg7.method566(arg6, arg4);
				}
			}
		} else if (arg9 == 10 || arg9 == 11) {
			if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
				local393 = local60.method4487(local159, arg8, 10, local193, local151, local203, local330, arg9 == 11 ? arg0 + 4 : arg0, local167, null);
				if (Static94.aBoolean138 && local330) {
					Static74.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
				}
				local377 = local393.aClass53_3;
			} else {
				local377 = new Class53_Sub7(arg2, 10, arg9 == 11 ? arg0 + 4 : arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
			}
			if (local377 != null) {
				@Pc(532) boolean local532 = method2197(arg1, arg4, arg6, local193, local78, local81, local377, local250);
				if (local60.aBoolean378 && local532 && arg8) {
					@Pc(542) int local542 = 15;
					if (local377 instanceof Class53_Sub4) {
						local542 = ((Class53_Sub4) local377).method3863() / 4;
						if (local542 > 30) {
							local542 = 30;
						}
					}
					for (@Pc(561) int local561 = 0; local561 <= local78; local561++) {
						for (@Pc(566) int local566 = 0; local566 <= local81; local566++) {
							if (Static206.aByteArrayArrayArray18[arg1][local561 + arg4][arg6 + local566] < local542) {
								Static206.aByteArrayArrayArray18[arg1][arg4 + local561][local566 + arg6] = (byte) local542;
							}
						}
					}
				}
			}
			if (local60.anInt5510 != 0 && arg7 != null) {
				arg7.method567(local60.aBoolean375, !local60.aBoolean386, local81, local78, arg6, arg4);
			}
		} else if (arg9 >= 12) {
			if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
				local393 = local60.method4487(local159, arg8, arg9, local193, local151, local203, local330, arg0, local167, null);
				if (Static94.aBoolean138 && local330) {
					Static74.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
				}
				local377 = local393.aClass53_3;
			} else {
				local377 = new Class53_Sub7(arg2, arg9, arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
			}
			method2197(arg1, arg4, arg6, local193, 1, 1, local377, local250);
			if (arg8 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg1 > 0 && local60.anInt5545 != 0) {
				Static170.anIntArrayArrayArray9[arg1][arg4][arg6] |= 0x4;
			}
			if (local60.anInt5510 != 0 && arg7 != null) {
				arg7.method567(local60.aBoolean375, !local60.aBoolean386, local81, local78, arg6, arg4);
			}
		} else if (arg9 == 0) {
			if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
				local393 = local60.method4487(local159, arg8, 0, local193, local151, local203, local330, arg0, local167, null);
				if (Static94.aBoolean138 && local330) {
					Static74.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
				}
				local377 = local393.aClass53_3;
			} else {
				local377 = new Class53_Sub7(arg2, 0, arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
			}
			Static24.method320(arg1, arg4, arg6, local193, local377, null, Static87.anIntArray651[arg0], 0, local250);
			if (arg8) {
				if (arg0 == 0) {
					if (local60.aBoolean378) {
						Static206.aByteArrayArrayArray18[arg1][arg4][arg6] = 50;
						Static206.aByteArrayArrayArray18[arg1][arg4][arg6 + 1] = 50;
					}
					if (local60.anInt5545 == 1) {
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6] |= 0x1;
					}
				} else if (arg0 == 1) {
					if (local60.aBoolean378) {
						Static206.aByteArrayArrayArray18[arg1][arg4][arg6 + 1] = 50;
						Static206.aByteArrayArrayArray18[arg1][arg4 + 1][arg6 + 1] = 50;
					}
					if (local60.anInt5545 == 1) {
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6 + 1] |= 0x2;
					}
				} else if (arg0 == 2) {
					if (local60.aBoolean378) {
						Static206.aByteArrayArrayArray18[arg1][arg4 + 1][arg6] = 50;
						Static206.aByteArrayArrayArray18[arg1][arg4 + 1][arg6 + 1] = 50;
					}
					if (local60.anInt5545 == 1) {
						Static170.anIntArrayArrayArray9[arg1][arg4 + 1][arg6] |= 0x1;
					}
				} else if (arg0 == 3) {
					if (local60.aBoolean378) {
						Static206.aByteArrayArrayArray18[arg1][arg4][arg6] = 50;
						Static206.aByteArrayArrayArray18[arg1][arg4 + 1][arg6] = 50;
					}
					if (local60.anInt5545 == 1) {
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6] |= 0x2;
					}
				}
			}
			if (local60.anInt5510 != 0 && arg7 != null) {
				arg7.method573(arg6, local60.aBoolean375, !local60.aBoolean386, arg4, arg9, arg0);
			}
			if (local60.anInt5508 != 16) {
				Static25.method344(arg1, arg4, arg6, local60.anInt5508);
			}
		} else if (arg9 == 1) {
			if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
				local393 = local60.method4487(local159, arg8, 1, local193, local151, local203, local330, arg0, local167, null);
				if (Static94.aBoolean138 && local330) {
					Static74.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
				}
				local377 = local393.aClass53_3;
			} else {
				local377 = new Class53_Sub7(arg2, 1, arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
			}
			Static24.method320(arg1, arg4, arg6, local193, local377, null, Static252.anIntArray519[arg0], 0, local250);
			if (local60.aBoolean378 && arg8) {
				if (arg0 == 0) {
					Static206.aByteArrayArrayArray18[arg1][arg4][arg6 + 1] = 50;
				} else if (arg0 == 1) {
					Static206.aByteArrayArrayArray18[arg1][arg4 + 1][arg6 + 1] = 50;
				} else if (arg0 == 2) {
					Static206.aByteArrayArrayArray18[arg1][arg4 + 1][arg6] = 50;
				} else if (arg0 == 3) {
					Static206.aByteArrayArrayArray18[arg1][arg4][arg6] = 50;
				}
			}
			if (local60.anInt5510 != 0 && arg7 != null) {
				arg7.method573(arg6, local60.aBoolean375, !local60.aBoolean386, arg4, arg9, arg0);
			}
		} else {
			@Pc(1265) int local1265;
			if (arg9 == 2) {
				local1265 = arg0 + 1 & 0x3;
				@Pc(1309) Class53 local1309;
				@Pc(1295) Class53 local1295;
				if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
					@Pc(1329) Class97 local1329 = local60.method4487(local159, arg8, 2, local193, local151, local203, local330, arg0 + 4, local167, null);
					if (Static94.aBoolean138 && local330) {
						Static74.method1212(local1329.aClass56_Sub1_3, local159, local195, local167);
					}
					local1295 = local1329.aClass53_3;
					local1329 = local60.method4487(local159, arg8, 2, local193, local151, local203, local330, local1265, local167, null);
					if (Static94.aBoolean138 && local330) {
						Static74.method1212(local1329.aClass56_Sub1_3, local159, local195, local167);
					}
					local1309 = local1329.aClass53_3;
				} else {
					local1295 = new Class53_Sub7(arg2, 2, arg0 + 4, arg3, arg4, arg6, -1, local60.aBoolean381, null);
					local1309 = new Class53_Sub7(arg2, 2, local1265, arg3, arg4, arg6, -1, local60.aBoolean381, null);
				}
				Static24.method320(arg1, arg4, arg6, local193, local1295, local1309, Static87.anIntArray651[arg0], Static87.anIntArray651[local1265], local250);
				if (local60.anInt5545 == 1 && arg8) {
					if (arg0 == 0) {
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6] |= 0x1;
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6 + 1] |= 0x2;
					} else if (arg0 == 1) {
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6 + 1] |= 0x2;
						Static170.anIntArrayArrayArray9[arg1][arg4 + 1][arg6] |= 0x1;
					} else if (arg0 == 2) {
						Static170.anIntArrayArrayArray9[arg1][arg4 + 1][arg6] |= 0x1;
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6] |= 0x2;
					} else if (arg0 == 3) {
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6] |= 0x2;
						Static170.anIntArrayArrayArray9[arg1][arg4][arg6] |= 0x1;
					}
				}
				if (local60.anInt5510 != 0 && arg7 != null) {
					arg7.method573(arg6, local60.aBoolean375, !local60.aBoolean386, arg4, arg9, arg0);
				}
				if (local60.anInt5508 != 16) {
					Static25.method344(arg1, arg4, arg6, local60.anInt5508);
				}
			} else if (arg9 == 3) {
				if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
					local393 = local60.method4487(local159, arg8, 3, local193, local151, local203, local330, arg0, local167, null);
					if (Static94.aBoolean138 && local330) {
						Static74.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
					}
					local377 = local393.aClass53_3;
				} else {
					local377 = new Class53_Sub7(arg2, 3, arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
				}
				Static24.method320(arg1, arg4, arg6, local193, local377, null, Static252.anIntArray519[arg0], 0, local250);
				if (local60.aBoolean378 && arg8) {
					if (arg0 == 0) {
						Static206.aByteArrayArrayArray18[arg1][arg4][arg6 + 1] = 50;
					} else if (arg0 == 1) {
						Static206.aByteArrayArrayArray18[arg1][arg4 + 1][arg6 + 1] = 50;
					} else if (arg0 == 2) {
						Static206.aByteArrayArrayArray18[arg1][arg4 + 1][arg6] = 50;
					} else if (arg0 == 3) {
						Static206.aByteArrayArrayArray18[arg1][arg4][arg6] = 50;
					}
				}
				if (local60.anInt5510 != 0 && arg7 != null) {
					arg7.method573(arg6, local60.aBoolean375, !local60.aBoolean386, arg4, arg9, arg0);
				}
			} else if (arg9 == 9) {
				if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
					local393 = local60.method4487(local159, arg8, arg9, local193, local151, local203, local330, arg0, local167, null);
					if (Static94.aBoolean138 && local330) {
						Static74.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
					}
					local377 = local393.aClass53_3;
				} else {
					local377 = new Class53_Sub7(arg2, arg9, arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
				}
				method2197(arg1, arg4, arg6, local193, 1, 1, local377, local250);
				if (local60.anInt5510 != 0 && arg7 != null) {
					arg7.method567(local60.aBoolean375, !local60.aBoolean386, local81, local78, arg6, arg4);
				}
				if (local60.anInt5508 != 16) {
					Static25.method344(arg1, arg4, arg6, local60.anInt5508);
				}
			} else if (arg9 == 4) {
				if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
					local393 = local60.method4487(local159, arg8, 4, local193, local151, local203, local330, arg0, local167, null);
					if (Static94.aBoolean138 && local330) {
						Static74.method1212(local393.aClass56_Sub1_3, local159, local195, local167);
					}
					local377 = local393.aClass53_3;
				} else {
					local377 = new Class53_Sub7(arg2, 4, arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
				}
				Static13.method203(arg1, arg4, arg6, local193, local377, null, Static87.anIntArray651[arg0], 0, 0, 0, local250);
			} else {
				@Pc(1967) long local1967;
				@Pc(2040) Class53 local2040;
				@Pc(2013) Class97 local2013;
				if (arg9 == 5) {
					local1967 = Static174.method2739(arg1, arg4, arg6);
					local1265 = 16;
					if (local1967 != 0L) {
						local1265 = Static6.method99((int) (local1967 >>> 32) & Integer.MAX_VALUE).anInt5508;
					}
					if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
						local2013 = local60.method4487(local159, arg8, 4, local193, local151, local203, local330, arg0, local167, null);
						if (Static94.aBoolean138 && local330) {
							Static74.method1212(local2013.aClass56_Sub1_3, local159 - Static169.anIntArray315[arg0] * 8, local195, local167 - Static235.anIntArray475[arg0] * 8);
						}
						local2040 = local2013.aClass53_3;
					} else {
						local2040 = new Class53_Sub7(arg2, 4, arg0, arg3, arg4, arg6, -1, local60.aBoolean381, null);
					}
					Static13.method203(arg1, arg4, arg6, local193, local2040, null, Static87.anIntArray651[arg0], 0, Static169.anIntArray315[arg0] * local1265, Static235.anIntArray475[arg0] * local1265, local250);
				} else if (arg9 == 6) {
					local1967 = Static174.method2739(arg1, arg4, arg6);
					local1265 = 8;
					if (local1967 != 0L) {
						local1265 = Static6.method99(Integer.MAX_VALUE & (int) (local1967 >>> 32)).anInt5508 / 2;
					}
					if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
						local2013 = local60.method4487(local159, arg8, 4, local193, local151, local203, local330, arg0 + 4, local167, null);
						if (Static94.aBoolean138 && local330) {
							Static74.method1212(local2013.aClass56_Sub1_3, local159 - Static90.anIntArray166[arg0] * 8, local195, local167 - Static302.anIntArray646[arg0] * 8);
						}
						local2040 = local2013.aClass53_3;
					} else {
						local2040 = new Class53_Sub7(arg2, 4, arg0 + 4, arg3, arg4, arg6, -1, local60.aBoolean381, null);
					}
					Static13.method203(arg1, arg4, arg6, local193, local2040, null, 256, arg0, Static90.anIntArray166[arg0] * local1265, Static302.anIntArray646[arg0] * local1265, local250);
				} else if (arg9 == 7) {
					@Pc(2219) int local2219 = arg0 + 2 & 0x3;
					if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
						@Pc(2266) Class97 local2266 = local60.method4487(local159, arg8, 4, local193, local151, local203, local330, local2219 + 4, local167, null);
						if (Static94.aBoolean138 && local330) {
							Static74.method1212(local2266.aClass56_Sub1_3, local159, local195, local167);
						}
						local377 = local2266.aClass53_3;
					} else {
						local377 = new Class53_Sub7(arg2, 4, local2219 + 4, arg3, arg4, arg6, -1, local60.aBoolean381, null);
					}
					Static13.method203(arg1, arg4, arg6, local193, local377, null, 256, local2219, 0, 0, local250);
				} else if (arg9 == 8) {
					local1265 = 8;
					local1967 = Static174.method2739(arg1, arg4, arg6);
					if (local1967 != 0L) {
						local1265 = Static6.method99((int) (local1967 >>> 32) & Integer.MAX_VALUE).anInt5508 / 2;
					}
					@Pc(2328) int local2328 = arg0 + 2 & 0x3;
					@Pc(2429) Class53 local2429;
					if (local60.anInt5524 == -1 && local60.anIntArray633 == null && local60.anIntArray631 == null && !local60.aBoolean380) {
						@Pc(2350) int local2350 = Static90.anIntArray166[arg0] * 8;
						@Pc(2356) int local2356 = Static302.anIntArray646[arg0] * 8;
						@Pc(2372) Class97 local2372 = local60.method4487(local159, arg8, 4, local193, local151, local203, local330, arg0 + 4, local167, null);
						if (Static94.aBoolean138 && local330) {
							Static74.method1212(local2372.aClass56_Sub1_3, local159 - local2350, local195, local167 - local2356);
						}
						local2040 = local2372.aClass53_3;
						local2372 = local60.method4487(local159, arg8, 4, local193, local151, local203, local330, local2328 + 4, local167, null);
						if (Static94.aBoolean138 && local330) {
							Static74.method1212(local2372.aClass56_Sub1_3, local159 - local2350, local195, local167 - local2356);
						}
						local2429 = local2372.aClass53_3;
					} else {
						local2040 = new Class53_Sub7(arg2, 4, arg0 + 4, arg3, arg4, arg6, -1, local60.aBoolean381, null);
						local2429 = new Class53_Sub7(arg2, 4, local2328 + 4, arg3, arg4, arg6, -1, local60.aBoolean381, null);
					}
					Static13.method203(arg1, arg4, arg6, local193, local2040, local2429, 256, arg0, local1265 * Static90.anIntArray166[arg0], local1265 * Static302.anIntArray646[arg0], local250);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!fh;ILclient!fh;I)Lclient!ke;")
	public static Class4_Sub3_Sub5_Sub2 method2195(@OriginalArg(1) Class58 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class58 arg2) {
		return Static12.method197(arg2, arg1, 0) ? Static87.method4695(arg0.method1372(arg1, 0)) : null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILclient!vc;IJ)Z")
	private static boolean method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class53 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static152.method2431(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIIIIIIII)V")
	public static void method2198(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		@Pc(7) int local7;
		@Pc(14) int local14;
		for (local7 = 0; local7 < 104; local7++) {
			for (local14 = 0; local14 < 104; local14++) {
				Static292.anIntArrayArray48[local7][local14] = 0;
				Static16.anIntArrayArray9[local7][local14] = 99999999;
			}
		}
		local7 = arg6;
		local14 = arg0;
		@Pc(41) byte local41 = 0;
		Static292.anIntArrayArray48[arg6][arg0] = 99;
		@Pc(49) int local49 = 0;
		Static16.anIntArrayArray9[arg6][arg0] = 0;
		Static237.anIntArray479[0] = arg6;
		@Pc(62) int local62 = local41 + 1;
		Static141.anIntArray653[0] = arg0;
		@Pc(66) boolean local66 = false;
		@Pc(71) int[][] local71 = Static296.aClass30Array1[Static281.anInt5335].anIntArrayArray6;
		@Pc(192) int local192;
		while (local62 != local49) {
			local14 = Static141.anIntArray653[local49];
			local7 = Static237.anIntArray479[local49];
			local49 = local49 + 1 & 0xFFF;
			if (local7 == arg1 && arg4 == local14) {
				local66 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && Static296.aClass30Array1[Static281.anInt5335].method574(arg4, arg3, local14, local7, arg1, 1, arg5 - 1)) {
					local66 = true;
					break;
				}
				if (arg5 < 10 && Static296.aClass30Array1[Static281.anInt5335].method577(arg1, local7, arg4, local14, arg5 - 1, arg3, 1)) {
					local66 = true;
					break;
				}
			}
			if (arg8 != 0 && arg2 != 0 && Static296.aClass30Array1[Static281.anInt5335].method570(local14, arg7, 1, arg4, arg1, arg2, arg8, local7)) {
				local66 = true;
				break;
			}
			local192 = Static16.anIntArrayArray9[local7][local14] + 1;
			if (local7 > 0 && Static292.anIntArrayArray48[local7 - 1][local14] == 0 && (local71[local7 - 1][local14] & 0x2C0108) == 0) {
				Static237.anIntArray479[local62] = local7 - 1;
				Static141.anIntArray653[local62] = local14;
				local62 = local62 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7 - 1][local14] = 2;
				Static16.anIntArrayArray9[local7 - 1][local14] = local192;
			}
			if (local7 < 103 && Static292.anIntArrayArray48[local7 + 1][local14] == 0 && (local71[local7 + 1][local14] & 0x2C0180) == 0) {
				Static237.anIntArray479[local62] = local7 + 1;
				Static141.anIntArray653[local62] = local14;
				Static292.anIntArrayArray48[local7 + 1][local14] = 8;
				local62 = local62 + 1 & 0xFFF;
				Static16.anIntArrayArray9[local7 + 1][local14] = local192;
			}
			if (local14 > 0 && Static292.anIntArrayArray48[local7][local14 - 1] == 0 && (local71[local7][local14 - 1] & 0x2C0102) == 0) {
				Static237.anIntArray479[local62] = local7;
				Static141.anIntArray653[local62] = local14 - 1;
				Static292.anIntArrayArray48[local7][local14 - 1] = 1;
				local62 = local62 + 1 & 0xFFF;
				Static16.anIntArrayArray9[local7][local14 - 1] = local192;
			}
			if (local14 < 103 && Static292.anIntArrayArray48[local7][local14 + 1] == 0 && (local71[local7][local14 + 1] & 0x2C0120) == 0) {
				Static237.anIntArray479[local62] = local7;
				Static141.anIntArray653[local62] = local14 + 1;
				Static292.anIntArrayArray48[local7][local14 + 1] = 4;
				local62 = local62 + 1 & 0xFFF;
				Static16.anIntArrayArray9[local7][local14 + 1] = local192;
			}
			if (local7 > 0 && local14 > 0 && Static292.anIntArrayArray48[local7 - 1][local14 - 1] == 0 && (local71[local7 - 1][local14 - 1] & 0x2C010E) == 0 && (local71[local7 - 1][local14] & 0x2C0108) == 0 && (local71[local7][local14 - 1] & 0x2C0102) == 0) {
				Static237.anIntArray479[local62] = local7 - 1;
				Static141.anIntArray653[local62] = local14 - 1;
				Static292.anIntArrayArray48[local7 - 1][local14 - 1] = 3;
				local62 = local62 + 1 & 0xFFF;
				Static16.anIntArrayArray9[local7 - 1][local14 - 1] = local192;
			}
			if (local7 < 103 && local14 > 0 && Static292.anIntArrayArray48[local7 + 1][local14 - 1] == 0 && (local71[local7 + 1][local14 - 1] & 0x2C0183) == 0 && (local71[local7 + 1][local14] & 0x2C0180) == 0 && (local71[local7][local14 - 1] & 0x2C0102) == 0) {
				Static237.anIntArray479[local62] = local7 + 1;
				Static141.anIntArray653[local62] = local14 - 1;
				local62 = local62 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7 + 1][local14 - 1] = 9;
				Static16.anIntArrayArray9[local7 + 1][local14 - 1] = local192;
			}
			if (local7 > 0 && local14 < 103 && Static292.anIntArrayArray48[local7 - 1][local14 + 1] == 0 && (local71[local7 - 1][local14 + 1] & 0x2C0138) == 0 && (local71[local7 - 1][local14] & 0x2C0108) == 0 && (local71[local7][local14 + 1] & 0x2C0120) == 0) {
				Static237.anIntArray479[local62] = local7 - 1;
				Static141.anIntArray653[local62] = local14 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7 - 1][local14 + 1] = 6;
				Static16.anIntArrayArray9[local7 - 1][local14 + 1] = local192;
			}
			if (local7 < 103 && local14 < 103 && Static292.anIntArrayArray48[local7 + 1][local14 + 1] == 0 && (local71[local7 + 1][local14 + 1] & 0x2C01E0) == 0 && (local71[local7 + 1][local14] & 0x2C0180) == 0 && (local71[local7][local14 + 1] & 0x2C0120) == 0) {
				Static237.anIntArray479[local62] = local7 + 1;
				Static141.anIntArray653[local62] = local14 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static292.anIntArrayArray48[local7 + 1][local14 + 1] = 12;
				Static16.anIntArrayArray9[local7 + 1][local14 + 1] = local192;
			}
		}
		if (!local66) {
			local192 = 1000;
			@Pc(809) int local809 = 100;
			for (@Pc(814) int local814 = arg1 - 10; local814 <= arg1 + 10; local814++) {
				for (@Pc(827) int local827 = arg4 - 10; local827 <= arg4 + 10; local827++) {
					if (local814 >= 0 && local827 >= 0 && local814 < 104 && local827 < 104 && Static16.anIntArrayArray9[local814][local827] < 100) {
						@Pc(858) int local858 = 0;
						if (arg1 > local814) {
							local858 = arg1 - local814;
						} else if (arg8 + arg1 - 1 < local814) {
							local858 = local814 + 1 - arg8 - arg1;
						}
						@Pc(889) int local889 = 0;
						if (arg4 > local827) {
							local889 = arg4 - local827;
						} else if (arg4 + arg2 - 1 < local827) {
							local889 = local827 + 1 - arg4 - arg2;
						}
						@Pc(930) int local930 = local889 * local889 + local858 * local858;
						if (local192 > local930 || local192 == local930 && local809 > Static16.anIntArrayArray9[local814][local827]) {
							local14 = local827;
							local809 = Static16.anIntArrayArray9[local814][local827];
							local192 = local930;
							local7 = local814;
						}
					}
				}
			}
			if (local192 == 1000) {
				return;
			}
			if (local7 == arg6 && local14 == arg0) {
				return;
			}
		}
		Static239.anInt4507 = local7;
		Static105.aBoolean147 = false;
		Static102.anInt2140 = local14;
	}
}
