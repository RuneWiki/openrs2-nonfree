import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_20;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
	public static int anInt2811 = 0;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1304 = Static193.method3027("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
	public static int anInt2823 = 0;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
	public static int anInt2827 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIIIIII)V")
	public static void method1972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 + arg3;
		@Pc(14) int local14 = arg0 - arg5;
		@Pc(18) int local18 = arg5 + arg1;
		for (@Pc(25) int local25 = arg3; local25 < local9; local25++) {
			Static16.method302(arg2, arg1, arg4, Static157.anIntArrayArray24[local25]);
		}
		for (@Pc(41) int local41 = arg0; local41 > local14; local41--) {
			Static16.method302(arg2, arg1, arg4, Static157.anIntArrayArray24[local41]);
		}
		@Pc(60) int local60 = arg4 - arg5;
		for (@Pc(62) int local62 = local9; local62 <= local14; local62++) {
			@Pc(68) int[] local68 = Static157.anIntArrayArray24[local62];
			Static16.method302(arg2, arg1, local18, local68);
			Static16.method302(arg2, local60, arg4, local68);
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public static void method1973() {
		if (Static178.aDouble94 > Static87.aDouble115) {
			Static87.aDouble115 += Static87.aDouble115 / 30.0D;
			if (Static178.aDouble94 < Static87.aDouble115) {
				Static87.aDouble115 = Static178.aDouble94;
			}
			Static149.method2172();
		} else if (Static87.aDouble115 > Static178.aDouble94) {
			Static87.aDouble115 -= Static87.aDouble115 / 30.0D;
			if (Static178.aDouble94 > Static87.aDouble115) {
				Static87.aDouble115 = Static178.aDouble94;
			}
			Static149.method2172();
		}
		if (Static136.anInt2777 == -1 || Static54.anInt1162 == -1) {
			return;
		}
		@Pc(48) int local48 = Static136.anInt2777 - Static156.anInt3196;
		if (local48 < 2 || local48 > 2) {
			local48 >>= 0x4;
		}
		Static156.anInt3196 -= -local48;
		@Pc(70) int local70 = Static54.anInt1162 - Static1.anInt1794;
		if (local70 < 2 || local70 > 2) {
			local70 >>= 0x4;
		}
		Static1.anInt1794 -= -local70;
		if (local48 == 0 && local70 == 0) {
			Static54.anInt1162 = -1;
			Static136.anInt2777 = -1;
		}
		Static149.method2172();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!pd;BIZIIIIZ)V")
	public static void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (arg9 && (Static17.aByteArrayArrayArray2[0][arg5][arg1] & 0x2) == 0) {
			if ((Static17.aByteArrayArrayArray2[arg0][arg5][arg1] & 0x10) != 0) {
				return;
			}
			if (Static83.method1195(arg1, arg5, arg0) != Static182.anInt3727) {
				return;
			}
		}
		if (arg0 < Static160.anInt3303) {
			Static160.anInt3303 = arg0;
		}
		@Pc(52) Class3_Sub3_Sub9 local52 = Static161.method2421(arg3);
		@Pc(65) int local65;
		@Pc(68) int local68;
		if (arg6 == 1 || arg6 == 3) {
			local65 = local52.anInt1002;
			local68 = local52.anInt1010;
		} else {
			local65 = local52.anInt1010;
			local68 = local52.anInt1002;
		}
		@Pc(95) int local95;
		@Pc(89) int local89;
		if (local65 + arg5 <= 104) {
			local89 = (local65 + 1 >> 1) + arg5;
			local95 = (local65 >> 1) + arg5;
		} else {
			local89 = arg5 + 1;
			local95 = arg5;
		}
		@Pc(107) int[][] local107 = Static23.anIntArrayArrayArray4[arg7];
		@Pc(121) int local121;
		@Pc(129) int local129;
		if (arg1 + local68 <= 104) {
			local121 = (local68 >> 1) + arg1;
			local129 = (local68 + 1 >> 1) + arg1;
		} else {
			local121 = arg1;
			local129 = arg1 + 1;
		}
		@Pc(145) int local145 = (arg5 << 7) + (local65 << 6);
		@Pc(172) int local172 = local107[local89][local121] + local107[local95][local121] + local107[local95][local129] + local107[local89][local129] >> 2;
		@Pc(181) int local181 = (arg1 << 7) + (local68 << 6);
		@Pc(198) long local198 = (long) ((arg6 | 0x400) << 20 | arg5 | arg1 << 7 | arg8 << 14);
		if (local52.anInt989 == 0) {
			local198 |= Long.MIN_VALUE;
		}
		if (local52.anInt1026 == 1) {
			local198 |= 0x400000L;
		}
		local198 |= (long) arg3 << 32;
		@Pc(235) Object local235 = null;
		if (arg4 && local52.method765()) {
			Static152.method2242(arg5, arg0, local52, arg1, arg6);
		}
		@Pc(285) Class26 local285;
		@Pc(282) Class3_Sub3_Sub25 local282;
		if (arg8 == 22) {
			if (!arg9 || local52.anInt989 != 0 || local52.anInt1014 == 1 || local52.aBoolean60) {
				if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
					local282 = local52.method763(local181, local145, local172, 22, arg4, arg6, local107);
					local285 = local282.aClass26_10;
				} else {
					local285 = new Class26_Sub1(arg3, 22, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
				}
				Static120.method1723(arg0, arg5, arg1, local172, local285, local198, local52.aBoolean62);
				if (local52.anInt1014 == 1 && arg2 != null) {
					arg2.method2179(arg1, arg5);
				}
			}
		} else if (arg8 == 10 || arg8 == 11) {
			if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
				local282 = local52.method763(local181, local145, local172, 10, arg4, arg6, local107);
				local285 = local282.aClass26_10;
			} else {
				local285 = new Class26_Sub1(arg3, 10, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
			}
			if (local285 != null) {
				@Pc(390) boolean local390 = Static192.method3014(arg0, arg5, arg1, local172, local65, local68, local285, arg8 == 11 ? 256 : 0, local198);
				if (local52.aBoolean59 && local390 && arg4) {
					@Pc(399) int local399 = 15;
					if (local285 instanceof Class26_Sub6) {
						local399 = ((Class26_Sub6) local285).method2538() / 4;
						if (local399 > 30) {
							local399 = 30;
						}
					}
					for (@Pc(415) int local415 = 0; local415 <= local65; local415++) {
						for (@Pc(419) int local419 = 0; local419 <= local68; local419++) {
							if (local399 > Static119.aByteArrayArrayArray12[arg0][local415 + arg5][arg1 + local419]) {
								Static119.aByteArrayArrayArray12[arg0][arg5 + local415][arg1 + local419] = (byte) local399;
							}
						}
					}
				}
			}
			if (local52.anInt1014 != 0 && arg2 != null) {
				arg2.method2163(arg5, local65, local52.aBoolean61, local68, arg1);
			}
		} else if (arg8 >= 12) {
			if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
				local282 = local52.method763(local181, local145, local172, arg8, arg4, arg6, local107);
				local285 = local282.aClass26_10;
			} else {
				local285 = new Class26_Sub1(arg3, arg8, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
			}
			Static192.method3014(arg0, arg5, arg1, local172, 1, 1, local285, 0, local198);
			if (arg4 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg0 > 0) {
				Static41.anIntArrayArrayArray5[arg0][arg5][arg1] |= 0x924;
			}
			if (local52.anInt1014 != 0 && arg2 != null) {
				arg2.method2163(arg5, local65, local52.aBoolean61, local68, arg1);
			}
		} else if (arg8 == 0) {
			if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
				local282 = local52.method763(local181, local145, local172, 0, arg4, arg6, local107);
				local285 = local282.aClass26_10;
			} else {
				local285 = new Class26_Sub1(arg3, 0, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
			}
			Static31.method567(arg0, arg5, arg1, local172, local285, null, Static187.anIntArray327[arg6], 0, local198);
			if (arg4) {
				if (arg6 == 0) {
					if (local52.aBoolean59) {
						Static119.aByteArrayArrayArray12[arg0][arg5][arg1] = 50;
						Static119.aByteArrayArrayArray12[arg0][arg5][arg1 + 1] = 50;
					}
					if (local52.aBoolean64) {
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1] |= 0x249;
					}
				} else if (arg6 == 1) {
					if (local52.aBoolean59) {
						Static119.aByteArrayArrayArray12[arg0][arg5][arg1 + 1] = 50;
						Static119.aByteArrayArrayArray12[arg0][arg5 + 1][arg1 + 1] = 50;
					}
					if (local52.aBoolean64) {
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1 + 1] |= 0x492;
					}
				} else if (arg6 == 2) {
					if (local52.aBoolean59) {
						Static119.aByteArrayArrayArray12[arg0][arg5 + 1][arg1] = 50;
						Static119.aByteArrayArrayArray12[arg0][arg5 + 1][arg1 + 1] = 50;
					}
					if (local52.aBoolean64) {
						Static41.anIntArrayArrayArray5[arg0][arg5 + 1][arg1] |= 0x249;
					}
				} else if (arg6 == 3) {
					if (local52.aBoolean59) {
						Static119.aByteArrayArrayArray12[arg0][arg5][arg1] = 50;
						Static119.aByteArrayArrayArray12[arg0][arg5 + 1][arg1] = 50;
					}
					if (local52.aBoolean64) {
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1] |= 0x492;
					}
				}
			}
			if (local52.anInt1014 != 0 && arg2 != null) {
				arg2.method2165(arg8, arg1, local52.aBoolean61, arg5, arg6);
			}
			if (local52.anInt1019 != 16) {
				Static121.method1744(arg0, arg5, arg1, local52.anInt1019);
			}
		} else if (arg8 == 1) {
			if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
				local282 = local52.method763(local181, local145, local172, 1, arg4, arg6, local107);
				local285 = local282.aClass26_10;
			} else {
				local285 = new Class26_Sub1(arg3, 1, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
			}
			Static31.method567(arg0, arg5, arg1, local172, local285, null, Static152.anIntArray227[arg6], 0, local198);
			if (local52.aBoolean59 && arg4) {
				if (arg6 == 0) {
					Static119.aByteArrayArrayArray12[arg0][arg5][arg1 + 1] = 50;
				} else if (arg6 == 1) {
					Static119.aByteArrayArrayArray12[arg0][arg5 + 1][arg1 + 1] = 50;
				} else if (arg6 == 2) {
					Static119.aByteArrayArrayArray12[arg0][arg5 + 1][arg1] = 50;
				} else if (arg6 == 3) {
					Static119.aByteArrayArrayArray12[arg0][arg5][arg1] = 50;
				}
			}
			if (local52.anInt1014 != 0 && arg2 != null) {
				arg2.method2165(arg8, arg1, local52.aBoolean61, arg5, arg6);
			}
		} else {
			@Pc(1016) int local1016;
			if (arg8 == 2) {
				local1016 = arg6 + 1 & 0x3;
				@Pc(1056) Class26 local1056;
				@Pc(1041) Class26 local1041;
				if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
					@Pc(1071) Class3_Sub3_Sub25 local1071 = local52.method763(local181, local145, local172, 2, arg4, arg6 + 4, local107);
					local1041 = local1071.aClass26_10;
					@Pc(1085) Class3_Sub3_Sub25 local1085 = local52.method763(local181, local145, local172, 2, arg4, local1016, local107);
					local1056 = local1085.aClass26_10;
				} else {
					local1041 = new Class26_Sub1(arg3, 2, arg6 + 4, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
					local1056 = new Class26_Sub1(arg3, 2, local1016, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
				}
				Static31.method567(arg0, arg5, arg1, local172, local1041, local1056, Static187.anIntArray327[arg6], Static187.anIntArray327[local1016], local198);
				if (local52.aBoolean64 && arg4) {
					if (arg6 == 0) {
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1] |= 0x249;
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1 + 1] |= 0x492;
					} else if (arg6 == 1) {
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1 + 1] |= 0x492;
						Static41.anIntArrayArrayArray5[arg0][arg5 + 1][arg1] |= 0x249;
					} else if (arg6 == 2) {
						Static41.anIntArrayArrayArray5[arg0][arg5 + 1][arg1] |= 0x249;
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1] |= 0x492;
					} else if (arg6 == 3) {
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1] |= 0x492;
						Static41.anIntArrayArrayArray5[arg0][arg5][arg1] |= 0x249;
					}
				}
				if (local52.anInt1014 != 0 && arg2 != null) {
					arg2.method2165(arg8, arg1, local52.aBoolean61, arg5, arg6);
				}
				if (local52.anInt1019 != 16) {
					Static121.method1744(arg0, arg5, arg1, local52.anInt1019);
				}
			} else if (arg8 == 3) {
				if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
					local282 = local52.method763(local181, local145, local172, 3, arg4, arg6, local107);
					local285 = local282.aClass26_10;
				} else {
					local285 = new Class26_Sub1(arg3, 3, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
				}
				Static31.method567(arg0, arg5, arg1, local172, local285, null, Static152.anIntArray227[arg6], 0, local198);
				if (local52.aBoolean59 && arg4) {
					if (arg6 == 0) {
						Static119.aByteArrayArrayArray12[arg0][arg5][arg1 + 1] = 50;
					} else if (arg6 == 1) {
						Static119.aByteArrayArrayArray12[arg0][arg5 + 1][arg1 + 1] = 50;
					} else if (arg6 == 2) {
						Static119.aByteArrayArrayArray12[arg0][arg5 + 1][arg1] = 50;
					} else if (arg6 == 3) {
						Static119.aByteArrayArrayArray12[arg0][arg5][arg1] = 50;
					}
				}
				if (local52.anInt1014 != 0 && arg2 != null) {
					arg2.method2165(arg8, arg1, local52.aBoolean61, arg5, arg6);
				}
			} else if (arg8 == 9) {
				if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
					local282 = local52.method763(local181, local145, local172, arg8, arg4, arg6, local107);
					local285 = local282.aClass26_10;
				} else {
					local285 = new Class26_Sub1(arg3, arg8, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
				}
				Static192.method3014(arg0, arg5, arg1, local172, 1, 1, local285, 0, local198);
				if (local52.anInt1014 != 0 && arg2 != null) {
					arg2.method2163(arg5, local65, local52.aBoolean61, local68, arg1);
				}
				if (local52.anInt1019 != 16) {
					Static121.method1744(arg0, arg5, arg1, local52.anInt1019);
				}
			} else if (arg8 == 4) {
				if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
					local282 = local52.method763(local181, local145, local172, 4, arg4, arg6, local107);
					local285 = local282.aClass26_10;
				} else {
					local285 = new Class26_Sub1(arg3, 4, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
				}
				Static69.method1009(arg0, arg5, arg1, local172, local285, null, Static187.anIntArray327[arg6], 0, 0, 0, local198, (Class59) local235);
			} else {
				@Pc(1586) long local1586;
				@Pc(1625) Class26 local1625;
				@Pc(1638) Class3_Sub3_Sub25 local1638;
				if (arg8 == 5) {
					local1586 = Static41.method681(arg0, arg5, arg1);
					local1016 = 16;
					if (local1586 != 0L) {
						local1016 = Static161.method2421((int) (local1586 >>> 32) & Integer.MAX_VALUE).anInt1019;
					}
					if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
						local1638 = local52.method763(local181, local145, local172, 4, arg4, arg6, local107);
						local1625 = local1638.aClass26_10;
					} else {
						local1625 = new Class26_Sub1(arg3, 4, arg6, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
					}
					Static69.method1009(arg0, arg5, arg1, local172, local1625, null, Static187.anIntArray327[arg6], 0, local1016 * Static159.anIntArray243[arg6], local1016 * Static135.anIntArray194[arg6], local198, (Class59) local235);
				} else if (arg8 == 6) {
					local1016 = 8;
					local1586 = Static41.method681(arg0, arg5, arg1);
					if (local1586 != 0L) {
						local1016 = Static161.method2421(Integer.MAX_VALUE & (int) (local1586 >>> 32)).anInt1019 / 2;
					}
					if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
						local1638 = local52.method763(local181, local145, local172, 4, arg4, arg6 + 4, local107);
						local1625 = local1638.aClass26_10;
					} else {
						local1625 = new Class26_Sub1(arg3, 4, arg6 + 4, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
					}
					Static69.method1009(arg0, arg5, arg1, local172, local1625, null, 256, arg6, Static200.anIntArray356[arg6] * local1016, local1016 * Static205.anIntArray361[arg6], local198, (Class59) local235);
				} else if (arg8 == 7) {
					@Pc(1768) int local1768 = arg6 + 2 & 0x3;
					if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
						@Pc(1788) Class3_Sub3_Sub25 local1788 = local52.method763(local181, local145, local172, 4, arg4, local1768 + 4, local107);
						local285 = local1788.aClass26_10;
					} else {
						local285 = new Class26_Sub1(arg3, 4, local1768 + 4, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
					}
					Static69.method1009(arg0, arg5, arg1, local172, local285, null, 256, local1768, 0, 0, local198, (Class59) local235);
				} else if (arg8 == 8) {
					local1016 = 8;
					local1586 = Static41.method681(arg0, arg5, arg1);
					if (local1586 != 0L) {
						local1016 = Static161.method2421(Integer.MAX_VALUE & (int) (local1586 >>> 32)).anInt1019 / 2;
					}
					@Pc(1858) int local1858 = arg6 + 2 & 0x3;
					@Pc(1898) Class26 local1898;
					if (local52.anInt1003 == -1 && local52.anIntArray52 == null) {
						@Pc(1879) Class3_Sub3_Sub25 local1879 = local52.method763(local181, local145, local172, 4, arg4, arg6 + 4, local107);
						local1625 = local1879.aClass26_10;
						@Pc(1895) Class3_Sub3_Sub25 local1895 = local52.method763(local181, local145, local172, 4, arg4, local1858 + 4, local107);
						local1898 = local1895.aClass26_10;
					} else {
						local1625 = new Class26_Sub1(arg3, 4, arg6 + 4, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
						local1898 = new Class26_Sub1(arg3, 4, local1858 + 4, arg7, arg5, arg1, local52.anInt1003, local52.aBoolean58, null);
					}
					Static69.method1009(arg0, arg5, arg1, local172, local1625, local1898, 256, arg6, local1016 * Static200.anIntArray356[arg6], local1016 * Static205.anIntArray361[arg6], local198, (Class59) local235);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
	public static void method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static93.aClass3_Sub4_Sub1_18.method1298(130);
		Static93.aClass3_Sub4_Sub1_18.method1273(arg1);
		Static93.aClass3_Sub4_Sub1_18.method1283(arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	public static void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static126.method1762(arg1)) {
			Static69.method1011(arg0, Static49.aClass6ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[BIIIB[Lclient!pd;II)V")
	public static void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class77[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) Class3_Sub4 local10 = new Class3_Sub4(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method1266();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method1266();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(43) int local43 = local24 & 0x3F;
				@Pc(49) int local49 = local24 >> 6 & 0x3F;
				@Pc(53) int local53 = local24 >> 12;
				@Pc(57) int local57 = local10.method1278();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (arg1 == local53 && arg7 <= local49 && local49 < arg7 + 8 && arg0 <= local43 && local43 < arg0 + 8) {
					@Pc(102) Class3_Sub3_Sub9 local102 = Static161.method2421(local12);
					@Pc(119) int local119 = Static54.method866(local102.anInt1010, local49 & 0x7, local65, arg5, local43 & 0x7, local102.anInt1002) + arg3;
					@Pc(136) int local136 = Static204.method3231(local65, local43 & 0x7, local102.anInt1002, local49 & 0x7, arg5, local102.anInt1010) + arg8;
					if (local119 > 0 && local136 > 0 && local119 < 103 && local136 < 103) {
						@Pc(155) Class77 local155 = null;
						@Pc(157) int local157 = arg4;
						if ((Static17.aByteArrayArrayArray2[1][local119][local136] & 0x2) == 2) {
							local157 = arg4 - 1;
						}
						if (local157 >= 0) {
							local155 = arg6[local157];
						}
						method1976(arg4, local136, local155, local12, true, local119, local65 + arg5 & 0x3, arg4, local61, Static50.aBoolean66);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)Z")
	public static boolean method1981() {
		@Pc(5) Class44 local5 = Static52.aClass44_1;
		synchronized (Static52.aClass44_1) {
			if (Static11.anInt301 == Static118.anInt2399) {
				return false;
			} else {
				Static175.anInt3547 = Static40.anIntArray43[Static118.anInt2399];
				Static38.anInt824 = Static122.anIntArray146[Static118.anInt2399];
				Static118.anInt2399 = Static118.anInt2399 + 1 & 0x7F;
				return true;
			}
		}
	}
}
