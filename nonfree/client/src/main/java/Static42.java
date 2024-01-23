import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!qh;")
	public static Class1_Sub5_Sub18 aClass1_Sub5_Sub18_3;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	public static int anInt956 = 1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[Lclient!e;")
	public static Class38[] aClass38Array1 = new Class38[29];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	public static int anInt967 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	public static int method768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static280.anIntArrayArrayArray13 == null) {
			return 0;
		}
		@Pc(13) int local13 = arg2 >> 7;
		@Pc(17) int local17 = arg0 >> 7;
		if (local17 < 0 || local13 < 0 || local17 > 103 || local13 > 103) {
			return 0;
		}
		@Pc(38) int local38 = arg1;
		if (arg1 < 3 && (Static17.aByteArrayArrayArray1[1][local17][local13] & 0x2) == 2) {
			local38 = arg1 + 1;
		}
		@Pc(62) int local62 = arg0 & 0x7F;
		@Pc(66) int local66 = arg2 & 0x7F;
		@Pc(99) int local99 = local62 * Static280.anIntArrayArrayArray13[local38][local17 + 1][local13] + Static280.anIntArrayArrayArray13[local38][local17][local13] * (128 - local62) >> 7;
		@Pc(130) int local130 = local62 * Static280.anIntArrayArrayArray13[local38][local17 + 1][local13 + 1] + (128 - local62) * Static280.anIntArrayArrayArray13[local38][local17][local13 + 1] >> 7;
		return local130 * local66 + local99 * (128 - local66) >> 7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!si;)Z")
	public static boolean method770(@OriginalArg(0) Class157 arg0) {
		if (Static26.aBoolean54) {
			if (method777(arg0).anInt1322 != 0) {
				return false;
			}
			if (arg0.anInt4748 == 0) {
				return false;
			}
		}
		return arg0.aBoolean435;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method774(@OriginalArg(0) int arg0) {
		return Static246.aStringArray28[arg0].length() <= 0 ? Static146.aStringArray19[arg0] : Static146.aStringArray19[arg0] + Static265.aString187 + Static246.aStringArray28[arg0];
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!si;)Lclient!ei;")
	public static Class1_Sub11 method777(@OriginalArg(0) Class157 arg0) {
		@Pc(13) Class1_Sub11 local13 = (Class1_Sub11) Static94.aClass86_12.method2136(((long) arg0.anInt4672 << 32) + (long) arg0.anInt4692);
		return local13 == null ? arg0.aClass1_Sub11_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIZIIIILclient!gd;)V")
	public static void method778(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class60 arg9) {
		if (arg0 && !Static115.method2108() && (Static17.aByteArrayArrayArray1[0][arg6][arg8] & 0x2) == 0) {
			if ((Static17.aByteArrayArrayArray1[arg7][arg6][arg8] & 0x10) != 0) {
				return;
			}
			if (Static307.method4584(arg6, arg7, arg8) != Static247.anInt1590) {
				return;
			}
		}
		if (arg7 < Static187.anInt3579) {
			Static187.anInt3579 = arg7;
		}
		@Pc(63) Class150 local63 = Static160.method2744(arg2);
		if (Static71.aBoolean165 && local63.aBoolean420) {
			return;
		}
		@Pc(83) int local83;
		@Pc(80) int local80;
		if (arg1 == 1 || arg1 == 3) {
			local80 = local63.anInt4532;
			local83 = local63.anInt4562;
		} else {
			local80 = local63.anInt4562;
			local83 = local63.anInt4532;
		}
		@Pc(100) int local100;
		@Pc(104) int local104;
		if (local83 + arg6 > 104) {
			local100 = arg6;
			local104 = arg6 + 1;
		} else {
			local104 = arg6 + (local83 + 1 >> 1);
			local100 = arg6 + (local83 >> 1);
		}
		@Pc(134) int local134;
		@Pc(132) int local132;
		if (arg8 + local80 > 104) {
			local132 = arg8 + 1;
			local134 = arg8;
		} else {
			local134 = (local80 >> 1) + arg8;
			local132 = (local80 + 1 >> 1) + arg8;
		}
		@Pc(154) int[][] local154 = Static280.anIntArrayArrayArray13[arg3];
		@Pc(180) int local180 = local154[local104][local132] + local154[local100][local132] + local154[local104][local134] + local154[local100][local134] >> 2;
		@Pc(188) int local188 = (local80 << 6) + (arg8 << 7);
		@Pc(190) int local190 = 0;
		@Pc(198) int local198 = (local83 << 6) + (arg6 << 7);
		@Pc(208) int[][] local208;
		if (Static71.aBoolean165 && arg3 != 0) {
			local208 = Static280.anIntArrayArrayArray13[0];
			local190 = local180 - (local208[local100][local132] + local208[local100][local134] + local208[local104][local134] + local208[local104][local132] >> 2);
		}
		local208 = null;
		if (arg5) {
			local208 = Static24.anIntArrayArrayArray3[0];
		} else if (arg3 < 3) {
			local208 = Static280.anIntArrayArrayArray13[arg3 + 1];
		}
		@Pc(274) long local274 = (long) ((arg1 | 0x400) << 20 | arg6 | arg8 << 7 | arg4 << 14);
		if (local63.anInt4576 == 0 || arg5) {
			local274 |= Long.MIN_VALUE;
		}
		if (local63.anInt4528 == 1) {
			local274 |= 0x400000L;
		}
		if (local63.aBoolean409) {
			local274 |= 0x80000000L;
		}
		local274 |= (long) arg2 << 32;
		if (local63.method3878()) {
			Static219.method3547(arg8, arg6, null, arg7, arg1, null, local63);
		}
		@Pc(335) boolean local335 = local63.aBoolean421 & !arg5;
		@Pc(399) Class11 local399;
		@Pc(385) Class88 local385;
		if (arg4 == 22) {
			if (Static41.aBoolean79 || local63.anInt4576 != 0 || local63.anInt4560 == 1 || local63.aBoolean424) {
				if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
					local385 = local63.method3892(local198, arg0, local180, arg1, local335, null, 22, local188, local154, local208);
					if (Static71.aBoolean165 && local335) {
						Static15.method217(local385.aClass57_Sub1_24, local198, local190, local188);
					}
					local399 = local385.aClass11_9;
				} else {
					local399 = new Class11_Sub6(arg2, 22, arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
				}
				Static160.method2742(arg7, arg6, arg8, local180, local399, local274, local63.aBoolean413);
				if (local63.anInt4560 == 1 && arg9 != null) {
					arg9.method1688(arg6, arg8);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
				local385 = local63.method3892(local198, arg0, local180, arg4 == 11 ? arg1 + 4 : arg1, local335, null, 10, local188, local154, local208);
				if (Static71.aBoolean165 && local335) {
					Static15.method217(local385.aClass57_Sub1_24, local198, local190, local188);
				}
				local399 = local385.aClass11_9;
			} else {
				local399 = new Class11_Sub6(arg2, 10, arg4 == 11 ? arg1 + 4 : arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
			}
			if (local399 != null) {
				@Pc(538) boolean local538 = Static143.method2512(arg7, arg6, arg8, local180, local83, local80, local399, local274);
				if (local63.aBoolean418 && local538 && arg0) {
					@Pc(548) int local548 = 15;
					if (local399 instanceof Class11_Sub1) {
						local548 = ((Class11_Sub1) local399).method2908() / 4;
						if (local548 > 30) {
							local548 = 30;
						}
					}
					for (@Pc(565) int local565 = 0; local565 <= local83; local565++) {
						for (@Pc(574) int local574 = 0; local574 <= local80; local574++) {
							if (Static312.aByteArrayArrayArray21[arg7][arg6 + local565][arg8 + local574] < local548) {
								Static312.aByteArrayArrayArray21[arg7][local565 + arg6][local574 + arg8] = (byte) local548;
							}
						}
					}
				}
			}
			if (local63.anInt4560 != 0 && arg9 != null) {
				arg9.method1698(arg8, local83, arg6, local80, !local63.aBoolean412, local63.aBoolean417);
			}
		} else if (arg4 >= 12) {
			if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
				local385 = local63.method3892(local198, arg0, local180, arg1, local335, null, arg4, local188, local154, local208);
				if (Static71.aBoolean165 && local335) {
					Static15.method217(local385.aClass57_Sub1_24, local198, local190, local188);
				}
				local399 = local385.aClass11_9;
			} else {
				local399 = new Class11_Sub6(arg2, arg4, arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
			}
			Static143.method2512(arg7, arg6, arg8, local180, 1, 1, local399, local274);
			if (arg0 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0 && local63.anInt4534 != 0) {
				Static4.anIntArrayArrayArray1[arg7][arg6][arg8] |= 0x4;
			}
			if (local63.anInt4560 != 0 && arg9 != null) {
				arg9.method1698(arg8, local83, arg6, local80, !local63.aBoolean412, local63.aBoolean417);
			}
		} else if (arg4 == 0) {
			if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
				local385 = local63.method3892(local198, arg0, local180, arg1, local335, null, 0, local188, local154, local208);
				if (Static71.aBoolean165 && local335) {
					Static15.method217(local385.aClass57_Sub1_24, local198, local190, local188);
				}
				local399 = local385.aClass11_9;
			} else {
				local399 = new Class11_Sub6(arg2, 0, arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
			}
			Static264.method4078(arg7, arg6, arg8, local180, local399, null, Static16.anIntArray29[arg1], 0, local274);
			if (arg0) {
				if (arg1 == 0) {
					if (local63.aBoolean418) {
						Static312.aByteArrayArrayArray21[arg7][arg6][arg8] = 50;
						Static312.aByteArrayArrayArray21[arg7][arg6][arg8 + 1] = 50;
					}
					if (local63.anInt4534 == 1) {
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8] |= 0x1;
					}
				} else if (arg1 == 1) {
					if (local63.aBoolean418) {
						Static312.aByteArrayArrayArray21[arg7][arg6][arg8 + 1] = 50;
						Static312.aByteArrayArrayArray21[arg7][arg6 + 1][arg8 + 1] = 50;
					}
					if (local63.anInt4534 == 1) {
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8 + 1] |= 0x2;
					}
				} else if (arg1 == 2) {
					if (local63.aBoolean418) {
						Static312.aByteArrayArrayArray21[arg7][arg6 + 1][arg8] = 50;
						Static312.aByteArrayArrayArray21[arg7][arg6 + 1][arg8 + 1] = 50;
					}
					if (local63.anInt4534 == 1) {
						Static4.anIntArrayArrayArray1[arg7][arg6 + 1][arg8] |= 0x1;
					}
				} else if (arg1 == 3) {
					if (local63.aBoolean418) {
						Static312.aByteArrayArrayArray21[arg7][arg6][arg8] = 50;
						Static312.aByteArrayArrayArray21[arg7][arg6 + 1][arg8] = 50;
					}
					if (local63.anInt4534 == 1) {
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8] |= 0x2;
					}
				}
			}
			if (local63.anInt4560 != 0 && arg9 != null) {
				arg9.method1692(arg1, !local63.aBoolean412, arg6, arg4, arg8, local63.aBoolean417);
			}
			if (local63.anInt4543 != 16) {
				Static225.method3629(arg7, arg6, arg8, local63.anInt4543);
			}
		} else if (arg4 == 1) {
			if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
				local385 = local63.method3892(local198, arg0, local180, arg1, local335, null, 1, local188, local154, local208);
				if (Static71.aBoolean165 && local335) {
					Static15.method217(local385.aClass57_Sub1_24, local198, local190, local188);
				}
				local399 = local385.aClass11_9;
			} else {
				local399 = new Class11_Sub6(arg2, 1, arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
			}
			Static264.method4078(arg7, arg6, arg8, local180, local399, null, Static25.anIntArray545[arg1], 0, local274);
			if (local63.aBoolean418 && arg0) {
				if (arg1 == 0) {
					Static312.aByteArrayArrayArray21[arg7][arg6][arg8 + 1] = 50;
				} else if (arg1 == 1) {
					Static312.aByteArrayArrayArray21[arg7][arg6 + 1][arg8 + 1] = 50;
				} else if (arg1 == 2) {
					Static312.aByteArrayArrayArray21[arg7][arg6 + 1][arg8] = 50;
				} else if (arg1 == 3) {
					Static312.aByteArrayArrayArray21[arg7][arg6][arg8] = 50;
				}
			}
			if (local63.anInt4560 != 0 && arg9 != null) {
				arg9.method1692(arg1, !local63.aBoolean412, arg6, arg4, arg8, local63.aBoolean417);
			}
		} else {
			@Pc(1277) int local1277;
			if (arg4 == 2) {
				local1277 = arg1 + 1 & 0x3;
				@Pc(1349) Class11 local1349;
				@Pc(1322) Class11 local1322;
				if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
					@Pc(1309) Class88 local1309 = local63.method3892(local198, arg0, local180, arg1 + 4, local335, null, 2, local188, local154, local208);
					if (Static71.aBoolean165 && local335) {
						Static15.method217(local1309.aClass57_Sub1_24, local198, local190, local188);
					}
					local1322 = local1309.aClass11_9;
					local1309 = local63.method3892(local198, arg0, local180, local1277, local335, null, 2, local188, local154, local208);
					if (Static71.aBoolean165 && local335) {
						Static15.method217(local1309.aClass57_Sub1_24, local198, local190, local188);
					}
					local1349 = local1309.aClass11_9;
				} else {
					local1322 = new Class11_Sub6(arg2, 2, arg1 + 4, arg3, arg6, arg8, -1, local63.aBoolean411, null);
					local1349 = new Class11_Sub6(arg2, 2, local1277, arg3, arg6, arg8, -1, local63.aBoolean411, null);
				}
				Static264.method4078(arg7, arg6, arg8, local180, local1322, local1349, Static16.anIntArray29[arg1], Static16.anIntArray29[local1277], local274);
				if (local63.anInt4534 == 1 && arg0) {
					if (arg1 == 0) {
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8] |= 0x1;
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8 + 1] |= 0x2;
					} else if (arg1 == 1) {
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8 + 1] |= 0x2;
						Static4.anIntArrayArrayArray1[arg7][arg6 + 1][arg8] |= 0x1;
					} else if (arg1 == 2) {
						Static4.anIntArrayArrayArray1[arg7][arg6 + 1][arg8] |= 0x1;
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8] |= 0x2;
					} else if (arg1 == 3) {
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8] |= 0x2;
						Static4.anIntArrayArrayArray1[arg7][arg6][arg8] |= 0x1;
					}
				}
				if (local63.anInt4560 != 0 && arg9 != null) {
					arg9.method1692(arg1, !local63.aBoolean412, arg6, arg4, arg8, local63.aBoolean417);
				}
				if (local63.anInt4543 != 16) {
					Static225.method3629(arg7, arg6, arg8, local63.anInt4543);
				}
			} else if (arg4 == 3) {
				if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
					local385 = local63.method3892(local198, arg0, local180, arg1, local335, null, 3, local188, local154, local208);
					if (Static71.aBoolean165 && local335) {
						Static15.method217(local385.aClass57_Sub1_24, local198, local190, local188);
					}
					local399 = local385.aClass11_9;
				} else {
					local399 = new Class11_Sub6(arg2, 3, arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
				}
				Static264.method4078(arg7, arg6, arg8, local180, local399, null, Static25.anIntArray545[arg1], 0, local274);
				if (local63.aBoolean418 && arg0) {
					if (arg1 == 0) {
						Static312.aByteArrayArrayArray21[arg7][arg6][arg8 + 1] = 50;
					} else if (arg1 == 1) {
						Static312.aByteArrayArrayArray21[arg7][arg6 + 1][arg8 + 1] = 50;
					} else if (arg1 == 2) {
						Static312.aByteArrayArrayArray21[arg7][arg6 + 1][arg8] = 50;
					} else if (arg1 == 3) {
						Static312.aByteArrayArrayArray21[arg7][arg6][arg8] = 50;
					}
				}
				if (local63.anInt4560 != 0 && arg9 != null) {
					arg9.method1692(arg1, !local63.aBoolean412, arg6, arg4, arg8, local63.aBoolean417);
				}
			} else if (arg4 == 9) {
				if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
					local385 = local63.method3892(local198, arg0, local180, arg1, local335, null, arg4, local188, local154, local208);
					if (Static71.aBoolean165 && local335) {
						Static15.method217(local385.aClass57_Sub1_24, local198, local190, local188);
					}
					local399 = local385.aClass11_9;
				} else {
					local399 = new Class11_Sub6(arg2, arg4, arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
				}
				Static143.method2512(arg7, arg6, arg8, local180, 1, 1, local399, local274);
				if (local63.anInt4560 != 0 && arg9 != null) {
					arg9.method1698(arg8, local83, arg6, local80, !local63.aBoolean412, local63.aBoolean417);
				}
				if (local63.anInt4543 != 16) {
					Static225.method3629(arg7, arg6, arg8, local63.anInt4543);
				}
			} else if (arg4 == 4) {
				if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
					local385 = local63.method3892(local198, arg0, local180, arg1, local335, null, 4, local188, local154, local208);
					if (Static71.aBoolean165 && local335) {
						Static15.method217(local385.aClass57_Sub1_24, local198, local190, local188);
					}
					local399 = local385.aClass11_9;
				} else {
					local399 = new Class11_Sub6(arg2, 4, arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
				}
				Static73.method1440(arg7, arg6, arg8, local180, local399, null, Static16.anIntArray29[arg1], 0, 0, 0, local274);
			} else {
				@Pc(1966) long local1966;
				@Pc(2011) Class11 local2011;
				@Pc(2027) Class88 local2027;
				if (arg4 == 5) {
					local1277 = 16;
					local1966 = Static234.method3768(arg7, arg6, arg8);
					if (local1966 != 0L) {
						local1277 = Static160.method2744(Integer.MAX_VALUE & (int) (local1966 >>> 32)).anInt4543;
					}
					if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
						local2027 = local63.method3892(local198, arg0, local180, arg1, local335, null, 4, local188, local154, local208);
						if (Static71.aBoolean165 && local335) {
							Static15.method217(local2027.aClass57_Sub1_24, local198 - Static140.anIntArray239[arg1] * 8, local190, local188 - Static236.anIntArray494[arg1] * 8);
						}
						local2011 = local2027.aClass11_9;
					} else {
						local2011 = new Class11_Sub6(arg2, 4, arg1, arg3, arg6, arg8, -1, local63.aBoolean411, null);
					}
					Static73.method1440(arg7, arg6, arg8, local180, local2011, null, Static16.anIntArray29[arg1], 0, local1277 * Static140.anIntArray239[arg1], Static236.anIntArray494[arg1] * local1277, local274);
				} else if (arg4 == 6) {
					local1277 = 8;
					local1966 = Static234.method3768(arg7, arg6, arg8);
					if (local1966 != 0L) {
						local1277 = Static160.method2744(Integer.MAX_VALUE & (int) (local1966 >>> 32)).anInt4543 / 2;
					}
					if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
						local2027 = local63.method3892(local198, arg0, local180, arg1 + 4, local335, null, 4, local188, local154, local208);
						if (Static71.aBoolean165 && local335) {
							Static15.method217(local2027.aClass57_Sub1_24, local198 - Static57.anIntArray95[arg1] * 8, local190, local188 - Static73.anIntArray128[arg1] * 8);
						}
						local2011 = local2027.aClass11_9;
					} else {
						local2011 = new Class11_Sub6(arg2, 4, arg1 + 4, arg3, arg6, arg8, -1, local63.aBoolean411, null);
					}
					Static73.method1440(arg7, arg6, arg8, local180, local2011, null, 256, arg1, Static57.anIntArray95[arg1] * local1277, local1277 * Static73.anIntArray128[arg1], local274);
				} else if (arg4 == 7) {
					@Pc(2210) int local2210 = arg1 + 2 & 0x3;
					if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
						@Pc(2241) Class88 local2241 = local63.method3892(local198, arg0, local180, local2210 + 4, local335, null, 4, local188, local154, local208);
						if (Static71.aBoolean165 && local335) {
							Static15.method217(local2241.aClass57_Sub1_24, local198, local190, local188);
						}
						local399 = local2241.aClass11_9;
					} else {
						local399 = new Class11_Sub6(arg2, 4, local2210 + 4, arg3, arg6, arg8, -1, local63.aBoolean411, null);
					}
					Static73.method1440(arg7, arg6, arg8, local180, local399, null, 256, local2210, 0, 0, local274);
				} else if (arg4 == 8) {
					local1277 = 8;
					local1966 = Static234.method3768(arg7, arg6, arg8);
					if (local1966 != 0L) {
						local1277 = Static160.method2744(Integer.MAX_VALUE & (int) (local1966 >>> 32)).anInt4543 / 2;
					}
					@Pc(2319) int local2319 = arg1 + 2 & 0x3;
					@Pc(2364) Class11 local2364;
					if (local63.anInt4571 == -1 && local63.anIntArray502 == null && local63.anIntArray507 == null && !local63.aBoolean416) {
						@Pc(2372) int local2372 = Static73.anIntArray128[arg1] * 8;
						@Pc(2378) int local2378 = Static57.anIntArray95[arg1] * 8;
						@Pc(2394) Class88 local2394 = local63.method3892(local198, arg0, local180, arg1 + 4, local335, null, 4, local188, local154, local208);
						if (Static71.aBoolean165 && local335) {
							Static15.method217(local2394.aClass57_Sub1_24, local198 - local2378, local190, local188 - local2372);
						}
						local2011 = local2394.aClass11_9;
						local2394 = local63.method3892(local198, arg0, local180, local2319 + 4, local335, null, 4, local188, local154, local208);
						if (Static71.aBoolean165 && local335) {
							Static15.method217(local2394.aClass57_Sub1_24, local198 - local2378, local190, local188 - local2372);
						}
						local2364 = local2394.aClass11_9;
					} else {
						local2011 = new Class11_Sub6(arg2, 4, arg1 + 4, arg3, arg6, arg8, -1, local63.aBoolean411, null);
						local2364 = new Class11_Sub6(arg2, 4, local2319 + 4, arg3, arg6, arg8, -1, local63.aBoolean411, null);
					}
					Static73.method1440(arg7, arg6, arg8, local180, local2011, local2364, 256, arg1, Static57.anIntArray95[arg1] * local1277, Static73.anIntArray128[arg1] * local1277, local274);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!si;)Lclient!si;")
	public static Class157 method779(@OriginalArg(0) Class157 arg0) {
		@Pc(4) int local4 = method777(arg0).method1130();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static206.method3444(arg0.anInt4671);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([[II)V")
	public static void method781(@OriginalArg(0) int[][] arg0) {
		Static40.anIntArrayArray6 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!si;IIIIIII)V")
	public static void method782(@OriginalArg(0) Class157[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class157 local9 = arg0[local1];
			if (local9 != null && local9.anInt4671 == arg1 && (!local9.aBoolean445 || local9.anInt4748 == 0 || local9.aBoolean442 || method777(local9).anInt1322 != 0 || local9 == Static252.aClass157_15 || local9.anInt4686 == 1338) && (!local9.aBoolean445 || !method770(local9))) {
				@Pc(50) int local50 = local9.anInt4729 + arg6;
				@Pc(55) int local55 = local9.anInt4715 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt4748 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt4680;
					@Pc(78) int local78 = local55 + local9.anInt4689;
					if (local9.anInt4748 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static64.aClass157_5) {
					Static64.aBoolean131 = true;
					Static286.anInt5174 = local50;
					Static305.anInt5486 = local55;
				}
				if (!local9.aBoolean445 || local61 < local65 && local63 < local67) {
					if (local9.anInt4748 == 0) {
						if (!local9.aBoolean445 && method770(local9) && Static271.aClass157_17 != local9) {
							continue;
						}
						if (local9.aBoolean450 && Static89.anInt1899 >= local61 && Static14.anInt309 >= local63 && Static89.anInt1899 < local65 && Static14.anInt309 < local67) {
							for (@Pc(164) Class1_Sub29 local164 = (Class1_Sub29) Static145.aClass96_8.method2340(); local164 != null; local164 = (Class1_Sub29) Static145.aClass96_8.method2342()) {
								if (local164.aBoolean407) {
									local164.method4573();
									local164.aClass157_13.aBoolean447 = false;
								}
							}
							if (Static183.anInt3513 == 0) {
								Static64.aClass157_5 = null;
								Static252.aClass157_15 = null;
							}
							Static226.anInt4234 = 0;
							Static195.aBoolean339 = false;
						}
					}
					if (local9.aBoolean445) {
						@Pc(209) boolean local209;
						if (Static89.anInt1899 >= local61 && Static14.anInt309 >= local63 && Static89.anInt1899 < local65 && Static14.anInt309 < local67) {
							local209 = true;
						} else {
							local209 = false;
						}
						@Pc(214) boolean local214 = false;
						if (Static3.anInt114 == 1 && local209) {
							local214 = true;
						}
						@Pc(223) boolean local223 = false;
						if (Static235.anInt4408 == 1 && Static186.anInt3549 >= local61 && Static45.anInt1043 >= local63 && Static186.anInt3549 < local65 && Static45.anInt1043 < local67) {
							local223 = true;
						}
						@Pc(245) int local245;
						@Pc(341) int local341;
						if (local9.aByteArray163 != null) {
							for (local245 = 0; local245 < local9.aByteArray163.length; local245++) {
								if (Static1.aBooleanArray1[local9.aByteArray163[local245]]) {
									if (local9.anIntArray541 == null || Static167.anInt637 >= local9.anIntArray541[local245]) {
										@Pc(281) byte local281 = local9.aByteArray162[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Static1.aBooleanArray1[86] && !Static1.aBooleanArray1[82] && !Static1.aBooleanArray1[81]) && ((local281 & 0x2) == 0 || Static1.aBooleanArray1[86]) && ((local281 & 0x1) == 0 || Static1.aBooleanArray1[82]) && ((local281 & 0x4) == 0 || Static1.aBooleanArray1[81])) {
											Static68.method1295(local245 + 1, "", local9.anInt4672, -1);
											local341 = local9.anIntArray529[local245];
											if (local9.anIntArray541 == null) {
												local9.anIntArray541 = new int[local9.aByteArray163.length];
											}
											if (local341 == 0) {
												local9.anIntArray541[local245] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray541[local245] = Static167.anInt637 + local341;
											}
										}
									}
								} else if (local9.anIntArray541 != null) {
									local9.anIntArray541[local245] = 0;
								}
							}
						}
						if (local223) {
							Static302.method4520(Static186.anInt3549 - local50, Static45.anInt1043 - local55, local9);
						}
						if (Static64.aClass157_5 != null && Static64.aClass157_5 != local9 && local209 && method777(local9).method1121()) {
							Static4.aClass157_1 = local9;
						}
						if (local9 == Static252.aClass157_15) {
							Static143.aBoolean244 = true;
							Static46.anInt1050 = local50;
							Static311.anInt5589 = local55;
						}
						if (local9.aBoolean442 || local9.anInt4686 != 0) {
							@Pc(418) Class1_Sub29 local418;
							if (local209 && Static205.anInt3960 != 0 && local9.anObjectArray25 != null) {
								local418 = new Class1_Sub29();
								local418.aBoolean407 = true;
								local418.aClass157_13 = local9;
								local418.anInt4522 = Static205.anInt3960;
								local418.anObjectArray2 = local9.anObjectArray25;
								Static145.aClass96_8.method2336(local418);
							}
							if (Static64.aClass157_5 != null || Static126.aClass157_7 != null || Static91.aBoolean183 || local9.anInt4686 != 1400 && Static226.anInt4234 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt4686 != 0) {
								if (local9.anInt4686 == 1337) {
									Static273.aClass157_18 = local9;
									continue;
								}
								if (local9.anInt4686 == 1338) {
									if (local223) {
										Static122.anInt2492 = Static186.anInt3549 - local50;
										Static206.anInt3971 = Static45.anInt1043 - local55;
									}
									continue;
								}
								if (local9.anInt4686 == 1400) {
									Static73.aClass157_8 = local9;
									if (local209) {
										Static195.aBoolean339 = true;
									}
									if (local223) {
										local245 = (int) ((double) (Static186.anInt3549 - local50 - local9.anInt4680 / 2) * 2.0D / (double) Static249.aFloat100);
										local522 = (int) ((double) (Static45.anInt1043 - local55 - local9.anInt4689 / 2) * 2.0D / (double) Static249.aFloat100);
										local341 = Static54.anInt1167 + local245;
										@Pc(530) int local530 = Static175.anInt3415 + local522;
										@Pc(534) int local534 = local341 + Static249.anInt5573;
										@Pc(542) int local542 = Static249.anInt5574 + Static249.anInt5571 - local530 - 1;
										@Pc(545) Class1_Sub5_Sub14 local545 = Static273.method4200();
										@Pc(548) int[] local548 = new int[3];
										local545.method3124(local534, local548, local542);
										if (local548 != null) {
											if (Static1.aBooleanArray1[82] && Static142.anInt2785 > 0) {
												Static44.method871(local548[2], local548[0], local548[1]);
												Static256.method4004();
												continue;
											}
											Static116.aClass1_Sub13_Sub1_48.method1887(165);
											Static116.aClass1_Sub13_Sub1_48.method1858(local548[0] << 28 | local548[1] << 14 | local548[2]);
										}
										Static226.anInt4234 = 1;
										Static201.aBoolean349 = false;
										Static203.anInt3368 = Static89.anInt1899;
										Static136.anInt2664 = Static14.anInt309;
										continue;
									}
									if (local214 && Static226.anInt4234 > 0) {
										if (Static226.anInt4234 == 1 && (Static203.anInt3368 != Static89.anInt1899 || Static136.anInt2664 != Static14.anInt309)) {
											Static124.anInt600 = Static54.anInt1167;
											Static2.anInt82 = Static175.anInt3415;
											Static226.anInt4234 = 2;
										}
										if (Static226.anInt4234 == 2) {
											Static201.aBoolean349 = true;
											Static231.method3709(Static124.anInt600 + (int) ((double) (Static203.anInt3368 - Static89.anInt1899) * 2.0D / (double) Static249.aFloat101));
											Static247.method1454(Static2.anInt82 + (int) ((double) (Static136.anInt2664 - Static14.anInt309) * 2.0D / (double) Static249.aFloat101));
										}
										continue;
									}
									if (Static226.anInt4234 > 0 && !Static201.aBoolean349) {
										if ((Static239.anInt4459 == 1 || Static310.method4599(Static241.anInt4470 - 1)) && Static241.anInt4470 > 2) {
											Static138.method3843();
										} else if (Static241.anInt4470 > 0) {
											Static8.method142();
										}
									}
									Static226.anInt4234 = 0;
									continue;
								}
								if (local9.anInt4686 == 1401) {
									if (local214) {
										Static274.method4208(Static89.anInt1899 - local50, Static14.anInt309 - local55, local9.anInt4689, local9.anInt4680);
									}
									continue;
								}
								if (local9.anInt4686 == 1402) {
									if (!Static71.aBoolean165) {
										Static224.method3621(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean448 && local223) {
								local9.aBoolean448 = true;
								if (local9.anObjectArray6 != null) {
									local418 = new Class1_Sub29();
									local418.aBoolean407 = true;
									local418.aClass157_13 = local9;
									local418.anInt4523 = Static186.anInt3549 - local50;
									local418.anInt4522 = Static45.anInt1043 - local55;
									local418.anObjectArray2 = local9.anObjectArray6;
									Static145.aClass96_8.method2336(local418);
								}
							}
							if (local9.aBoolean448 && local214 && local9.anObjectArray15 != null) {
								local418 = new Class1_Sub29();
								local418.aBoolean407 = true;
								local418.aClass157_13 = local9;
								local418.anInt4523 = Static89.anInt1899 - local50;
								local418.anInt4522 = Static14.anInt309 - local55;
								local418.anObjectArray2 = local9.anObjectArray15;
								Static145.aClass96_8.method2336(local418);
							}
							if (local9.aBoolean448 && !local214) {
								local9.aBoolean448 = false;
								if (local9.anObjectArray5 != null) {
									local418 = new Class1_Sub29();
									local418.aBoolean407 = true;
									local418.aClass157_13 = local9;
									local418.anInt4523 = Static89.anInt1899 - local50;
									local418.anInt4522 = Static14.anInt309 - local55;
									local418.anObjectArray2 = local9.anObjectArray5;
									Static76.aClass96_23.method2336(local418);
								}
							}
							if (local214 && local9.anObjectArray23 != null) {
								local418 = new Class1_Sub29();
								local418.aBoolean407 = true;
								local418.aClass157_13 = local9;
								local418.anInt4523 = Static89.anInt1899 - local50;
								local418.anInt4522 = Static14.anInt309 - local55;
								local418.anObjectArray2 = local9.anObjectArray23;
								Static145.aClass96_8.method2336(local418);
							}
							if (!local9.aBoolean447 && local209) {
								local9.aBoolean447 = true;
								if (local9.anObjectArray32 != null) {
									local418 = new Class1_Sub29();
									local418.aBoolean407 = true;
									local418.aClass157_13 = local9;
									local418.anInt4523 = Static89.anInt1899 - local50;
									local418.anInt4522 = Static14.anInt309 - local55;
									local418.anObjectArray2 = local9.anObjectArray32;
									Static145.aClass96_8.method2336(local418);
								}
							}
							if (local9.aBoolean447 && local209 && local9.anObjectArray24 != null) {
								local418 = new Class1_Sub29();
								local418.aBoolean407 = true;
								local418.aClass157_13 = local9;
								local418.anInt4523 = Static89.anInt1899 - local50;
								local418.anInt4522 = Static14.anInt309 - local55;
								local418.anObjectArray2 = local9.anObjectArray24;
								Static145.aClass96_8.method2336(local418);
							}
							if (local9.aBoolean447 && !local209) {
								local9.aBoolean447 = false;
								if (local9.anObjectArray11 != null) {
									local418 = new Class1_Sub29();
									local418.aBoolean407 = true;
									local418.aClass157_13 = local9;
									local418.anInt4523 = Static89.anInt1899 - local50;
									local418.anInt4522 = Static14.anInt309 - local55;
									local418.anObjectArray2 = local9.anObjectArray11;
									Static76.aClass96_23.method2336(local418);
								}
							}
							if (local9.anObjectArray9 != null) {
								local418 = new Class1_Sub29();
								local418.aClass157_13 = local9;
								local418.anObjectArray2 = local9.anObjectArray9;
								Static128.aClass96_7.method2336(local418);
							}
							@Pc(1060) Class1_Sub29 local1060;
							if (local9.anObjectArray19 != null && Static5.anInt206 > local9.anInt4674) {
								if (local9.anIntArray531 == null || Static5.anInt206 - local9.anInt4674 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass157_13 = local9;
									local418.anObjectArray2 = local9.anObjectArray19;
									Static145.aClass96_8.method2336(local418);
								} else {
									label595: for (local245 = local9.anInt4674; local245 < Static5.anInt206; local245++) {
										local522 = Static205.anIntArray417[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray531.length; local341++) {
											if (local9.anIntArray531[local341] == local522) {
												local1060 = new Class1_Sub29();
												local1060.aClass157_13 = local9;
												local1060.anObjectArray2 = local9.anObjectArray19;
												Static145.aClass96_8.method2336(local1060);
												break label595;
											}
										}
									}
								}
								local9.anInt4674 = Static5.anInt206;
							}
							if (local9.anObjectArray31 != null && Static35.anInt658 > local9.anInt4712) {
								if (local9.anIntArray525 == null || Static35.anInt658 - local9.anInt4712 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass157_13 = local9;
									local418.anObjectArray2 = local9.anObjectArray31;
									Static145.aClass96_8.method2336(local418);
								} else {
									label571: for (local245 = local9.anInt4712; local245 < Static35.anInt658; local245++) {
										local522 = Static293.anIntArray582[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray525.length; local341++) {
											if (local9.anIntArray525[local341] == local522) {
												local1060 = new Class1_Sub29();
												local1060.aClass157_13 = local9;
												local1060.anObjectArray2 = local9.anObjectArray31;
												Static145.aClass96_8.method2336(local1060);
												break label571;
											}
										}
									}
								}
								local9.anInt4712 = Static35.anInt658;
							}
							if (local9.anObjectArray18 != null && Static263.anInt4858 > local9.anInt4699) {
								if (local9.anIntArray535 == null || Static263.anInt4858 - local9.anInt4699 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass157_13 = local9;
									local418.anObjectArray2 = local9.anObjectArray18;
									Static145.aClass96_8.method2336(local418);
								} else {
									label547: for (local245 = local9.anInt4699; local245 < Static263.anInt4858; local245++) {
										local522 = Static179.anIntArray358[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray535.length; local341++) {
											if (local9.anIntArray535[local341] == local522) {
												local1060 = new Class1_Sub29();
												local1060.aClass157_13 = local9;
												local1060.anObjectArray2 = local9.anObjectArray18;
												Static145.aClass96_8.method2336(local1060);
												break label547;
											}
										}
									}
								}
								local9.anInt4699 = Static263.anInt4858;
							}
							if (local9.anObjectArray10 != null && Static272.anInt5002 > local9.anInt4700) {
								if (local9.anIntArray540 == null || Static272.anInt5002 - local9.anInt4700 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass157_13 = local9;
									local418.anObjectArray2 = local9.anObjectArray10;
									Static145.aClass96_8.method2336(local418);
								} else {
									label523: for (local245 = local9.anInt4700; local245 < Static272.anInt5002; local245++) {
										local522 = Static186.anIntArray387[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray540.length; local341++) {
											if (local9.anIntArray540[local341] == local522) {
												local1060 = new Class1_Sub29();
												local1060.aClass157_13 = local9;
												local1060.anObjectArray2 = local9.anObjectArray10;
												Static145.aClass96_8.method2336(local1060);
												break label523;
											}
										}
									}
								}
								local9.anInt4700 = Static272.anInt5002;
							}
							if (local9.anObjectArray27 != null && Static96.anInt2062 > local9.anInt4749) {
								if (local9.anIntArray523 == null || Static96.anInt2062 - local9.anInt4749 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass157_13 = local9;
									local418.anObjectArray2 = local9.anObjectArray27;
									Static145.aClass96_8.method2336(local418);
								} else {
									label499: for (local245 = local9.anInt4749; local245 < Static96.anInt2062; local245++) {
										local522 = Static213.anIntArray605[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray523.length; local341++) {
											if (local9.anIntArray523[local341] == local522) {
												local1060 = new Class1_Sub29();
												local1060.aClass157_13 = local9;
												local1060.anObjectArray2 = local9.anObjectArray27;
												Static145.aClass96_8.method2336(local1060);
												break label499;
											}
										}
									}
								}
								local9.anInt4749 = Static96.anInt2062;
							}
							if (Static28.anInt552 > local9.anInt4725 && local9.anObjectArray20 != null) {
								local418 = new Class1_Sub29();
								local418.aClass157_13 = local9;
								local418.anObjectArray2 = local9.anObjectArray20;
								Static145.aClass96_8.method2336(local418);
							}
							if (Static105.anInt2227 > local9.anInt4725 && local9.anObjectArray26 != null) {
								local418 = new Class1_Sub29();
								local418.aClass157_13 = local9;
								local418.anObjectArray2 = local9.anObjectArray26;
								Static145.aClass96_8.method2336(local418);
							}
							if (Static106.anInt3752 > local9.anInt4725 && local9.anObjectArray14 != null) {
								local418 = new Class1_Sub29();
								local418.aClass157_13 = local9;
								local418.anObjectArray2 = local9.anObjectArray14;
								Static145.aClass96_8.method2336(local418);
							}
							if (Static172.anInt3362 > local9.anInt4725 && local9.anObjectArray30 != null) {
								local418 = new Class1_Sub29();
								local418.aClass157_13 = local9;
								local418.anObjectArray2 = local9.anObjectArray30;
								Static145.aClass96_8.method2336(local418);
							}
							if (Static243.anInt4497 > local9.anInt4725 && local9.anObjectArray21 != null) {
								local418 = new Class1_Sub29();
								local418.aClass157_13 = local9;
								local418.anObjectArray2 = local9.anObjectArray21;
								Static145.aClass96_8.method2336(local418);
							}
							local9.anInt4725 = Static149.anInt950;
							if (local9.anObjectArray4 != null) {
								for (local245 = 0; local245 < Static23.anInt483; local245++) {
									@Pc(1524) Class1_Sub29 local1524 = new Class1_Sub29();
									local1524.aClass157_13 = local9;
									local1524.anInt4518 = Static293.anIntArray583[local245];
									local1524.anInt4525 = Static254.anIntArray536[local245];
									local1524.anObjectArray2 = local9.anObjectArray4;
									Static145.aClass96_8.method2336(local1524);
								}
							}
							if (Static133.aBoolean233 && local9.anObjectArray13 != null) {
								local418 = new Class1_Sub29();
								local418.aClass157_13 = local9;
								local418.anObjectArray2 = local9.anObjectArray13;
								Static145.aClass96_8.method2336(local418);
							}
						}
					}
					if (!local9.aBoolean445 && Static64.aClass157_5 == null && Static126.aClass157_7 == null && !Static91.aBoolean183) {
						if ((local9.anInt4707 >= 0 || local9.anInt4746 != 0) && Static89.anInt1899 >= local61 && Static14.anInt309 >= local63 && Static89.anInt1899 < local65 && Static14.anInt309 < local67) {
							if (local9.anInt4707 >= 0) {
								Static271.aClass157_17 = arg0[local9.anInt4707];
							} else {
								Static271.aClass157_17 = local9;
							}
						}
						if (local9.anInt4748 == 8 && Static89.anInt1899 >= local61 && Static14.anInt309 >= local63 && Static89.anInt1899 < local65 && Static14.anInt309 < local67) {
							Static115.aClass157_10 = local9;
						}
						if (local9.anInt4683 > local9.anInt4689) {
							Static46.method878(Static89.anInt1899, local9, Static14.anInt309, local55, local9.anInt4683, local50 + local9.anInt4680, local9.anInt4689);
						}
					}
					if (local9.anInt4748 == 0) {
						method782(arg0, local9.anInt4672, local61, local63, local65, local67, local50 - local9.anInt4679, local55 - local9.anInt4693);
						if (local9.aClass157Array2 != null) {
							method782(local9.aClass157Array2, local9.anInt4672, local61, local63, local65, local67, local50 - local9.anInt4679, local55 - local9.anInt4693);
						}
						@Pc(1689) Class1_Sub20 local1689 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local9.anInt4672);
						if (local1689 != null) {
							Static23.method462(local1689.anInt3422, local63, local67, local65, local61, local55, local50);
						}
					}
				}
			}
		}
	}
}
