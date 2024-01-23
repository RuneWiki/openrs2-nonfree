import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!qj", name = "cb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1298 = Static64.method1101("(Udns");

	@OriginalMember(owner = "client!qj", name = "kb", descriptor = "I")
	public static int anInt3805 = 0;

	@OriginalMember(owner = "client!qj", name = "nb", descriptor = "[[B")
	public static byte[][] aByteArrayArray11 = new byte[1000][];

	@OriginalMember(owner = "client!qj", name = "qb", descriptor = "I")
	public static volatile int anInt3809 = 0;

	@OriginalMember(owner = "client!qj", name = "sb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1299 = Static64.method1101("<col=40ff00>");

	@OriginalMember(owner = "client!qj", name = "ub", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1300 = Static64.method1101("Cabbage");

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method2895(@OriginalArg(1) Class70 arg0) {
		Static195.aClass70_28 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)Z")
	public static boolean method2896(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
	public static void method2897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static230.anIntArray379[arg0] = arg1;
		@Pc(14) Class1_Sub24 local14 = (Class1_Sub24) Static22.aClass102_2.method3093((long) arg0);
		if (local14 == null) {
			local14 = new Class1_Sub24(4611686018427387905L);
			Static22.aClass102_2.method3083(local14, (long) arg0);
		} else if (local14.aLong145 != 4611686018427387905L) {
			local14.aLong145 = Static144.method2489() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!q;IZIBIIIIIZ)V")
	public static void method2898(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 && !Static112.method1883() && (Static150.aByteArrayArrayArray9[0][arg4][arg5] & 0x2) == 0) {
			if ((Static150.aByteArrayArrayArray9[arg3][arg4][arg5] & 0x10) != 0) {
				return;
			}
			if (Static200.method3304(arg3, arg5, arg4) != Static158.anInt3438) {
				return;
			}
		}
		if (arg3 < Static185.anInt4013) {
			Static185.anInt4013 = arg3;
		}
		@Pc(60) Class82 local60 = Static9.method132(arg8);
		@Pc(73) int local73;
		@Pc(76) int local76;
		if (arg1 == 1 || arg1 == 3) {
			local73 = local60.anInt3279;
			local76 = local60.anInt3258;
		} else {
			local73 = local60.anInt3258;
			local76 = local60.anInt3279;
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (arg5 + local76 > 104) {
			local94 = arg5;
			local98 = arg5 + 1;
		} else {
			local98 = arg5 + (local76 + 1 >> 1);
			local94 = arg5 + (local76 >> 1);
		}
		@Pc(125) int local125;
		@Pc(129) int local129;
		if (arg4 + local73 > 104) {
			local125 = arg4;
			local129 = arg4 + 1;
		} else {
			local129 = (local73 + 1 >> 1) + arg4;
			local125 = (local73 >> 1) + arg4;
		}
		@Pc(149) int[][] local149 = Static20.anIntArrayArrayArray2[arg6];
		@Pc(157) int local157 = (local76 << 6) + (arg5 << 7);
		@Pc(184) int local184 = local149[local129][local98] + local149[local125][local98] + local149[local125][local94] + local149[local129][local94] >> 2;
		@Pc(192) int local192 = (arg4 << 7) + (local73 << 6);
		@Pc(194) int[][] local194 = null;
		@Pc(211) long local211 = (long) (arg1 << 20 | arg5 << 7 | arg4 | arg7 << 14 | 0x40000000);
		if (arg6 < 3) {
			local194 = Static20.anIntArrayArrayArray2[arg6 + 1];
		}
		if (local60.anInt3288 == 0) {
			local211 |= Long.MIN_VALUE;
		}
		if (local60.anInt3290 == 1) {
			local211 |= 0x400000L;
		}
		if (local60.aBoolean147) {
			local211 |= 0xFFFFFFFF80000000L;
		}
		local211 |= (long) arg8 << 32;
		if (local60.method2570()) {
			Static187.method3123(null, arg4, local60, arg3, null, arg1, arg5);
		}
		@Pc(283) boolean local283 = local60.aBoolean145 & true;
		@Pc(326) Class5 local326;
		@Pc(342) Class120 local342;
		if (arg7 == 22) {
			if (Static107.aBoolean98 || local60.anInt3288 != 0 || local60.anInt3294 == 1 || local60.aBoolean148) {
				if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
					local342 = local60.method2577(arg2, null, 22, local283, local192, arg1, local149, local184, local157, local194);
					local326 = local342.aClass5_10;
				} else {
					local326 = new Class5_Sub5(arg8, 22, arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
				}
				Static194.method3243(arg3, arg4, arg5, local184, local326, local211, local60.aBoolean153);
				if (local60.anInt3294 == 1 && arg0 != null) {
					arg0.method2707(arg5, arg4);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
				local342 = local60.method2577(arg2, null, 10, local283, local192, arg7 == 11 ? arg1 + 4 : arg1, local149, local184, local157, local194);
				local326 = local342.aClass5_10;
			} else {
				local326 = new Class5_Sub5(arg8, 10, arg7 == 11 ? arg1 + 4 : arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
			}
			if (local326 != null) {
				@Pc(446) boolean local446 = Static83.method1458(arg3, arg4, arg5, local184, local73, local76, local326, local211);
				if (local60.aBoolean144 && local446 && arg2) {
					@Pc(455) int local455 = 15;
					if (local326 instanceof Class5_Sub2) {
						local455 = ((Class5_Sub2) local326).method2920() / 4;
						if (local455 > 30) {
							local455 = 30;
						}
					}
					for (@Pc(473) int local473 = 0; local473 <= local73; local473++) {
						for (@Pc(477) int local477 = 0; local477 <= local76; local477++) {
							if (local455 > Static18.aByteArrayArrayArray4[arg3][arg4 + local473][local477 + arg5]) {
								Static18.aByteArrayArrayArray4[arg3][arg4 + local473][local477 + arg5] = (byte) local455;
							}
						}
					}
				}
			}
			if (local60.anInt3294 != 0 && arg0 != null) {
				arg0.method2709(local76, local73, arg4, arg5, local60.aBoolean155);
			}
		} else if (arg7 >= 12) {
			if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
				local342 = local60.method2577(arg2, null, arg7, local283, local192, arg1, local149, local184, local157, local194);
				local326 = local342.aClass5_10;
			} else {
				local326 = new Class5_Sub5(arg8, arg7, arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
			}
			Static83.method1458(arg3, arg4, arg5, local184, 1, 1, local326, local211);
			if (arg2 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
				Static140.anIntArrayArrayArray6[arg3][arg4][arg5] |= 0x924;
			}
			if (local60.anInt3294 != 0 && arg0 != null) {
				arg0.method2709(local76, local73, arg4, arg5, local60.aBoolean155);
			}
		} else if (arg7 == 0) {
			if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
				local342 = local60.method2577(arg2, null, 0, local283, local192, arg1, local149, local184, local157, local194);
				local326 = local342.aClass5_10;
			} else {
				local326 = new Class5_Sub5(arg8, 0, arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
			}
			Static20.method442(arg3, arg4, arg5, local184, local326, null, Static153.anIntArray226[arg1], 0, local211);
			if (arg2) {
				if (arg1 == 0) {
					if (local60.aBoolean144) {
						Static18.aByteArrayArrayArray4[arg3][arg4][arg5] = 50;
						Static18.aByteArrayArrayArray4[arg3][arg4][arg5 + 1] = 50;
					}
					if (local60.aBoolean149) {
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5] |= 0x249;
					}
				} else if (arg1 == 1) {
					if (local60.aBoolean144) {
						Static18.aByteArrayArrayArray4[arg3][arg4][arg5 + 1] = 50;
						Static18.aByteArrayArrayArray4[arg3][arg4 + 1][arg5 + 1] = 50;
					}
					if (local60.aBoolean149) {
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5 + 1] |= 0x492;
					}
				} else if (arg1 == 2) {
					if (local60.aBoolean144) {
						Static18.aByteArrayArrayArray4[arg3][arg4 + 1][arg5] = 50;
						Static18.aByteArrayArrayArray4[arg3][arg4 + 1][arg5 + 1] = 50;
					}
					if (local60.aBoolean149) {
						Static140.anIntArrayArrayArray6[arg3][arg4 + 1][arg5] |= 0x249;
					}
				} else if (arg1 == 3) {
					if (local60.aBoolean144) {
						Static18.aByteArrayArrayArray4[arg3][arg4][arg5] = 50;
						Static18.aByteArrayArrayArray4[arg3][arg4 + 1][arg5] = 50;
					}
					if (local60.aBoolean149) {
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5] |= 0x492;
					}
				}
			}
			if (local60.anInt3294 != 0 && arg0 != null) {
				arg0.method2710(local60.aBoolean155, arg4, arg1, arg7, arg5);
			}
			if (local60.anInt3255 != 16) {
				Static88.method1508(arg3, arg4, arg5, local60.anInt3255);
			}
		} else if (arg7 == 1) {
			if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
				local342 = local60.method2577(arg2, null, 1, local283, local192, arg1, local149, local184, local157, local194);
				local326 = local342.aClass5_10;
			} else {
				local326 = new Class5_Sub5(arg8, 1, arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
			}
			Static20.method442(arg3, arg4, arg5, local184, local326, null, Static161.anIntArray227[arg1], 0, local211);
			if (local60.aBoolean144 && arg2) {
				if (arg1 == 0) {
					Static18.aByteArrayArrayArray4[arg3][arg4][arg5 + 1] = 50;
				} else if (arg1 == 1) {
					Static18.aByteArrayArrayArray4[arg3][arg4 + 1][arg5 + 1] = 50;
				} else if (arg1 == 2) {
					Static18.aByteArrayArrayArray4[arg3][arg4 + 1][arg5] = 50;
				} else if (arg1 == 3) {
					Static18.aByteArrayArrayArray4[arg3][arg4][arg5] = 50;
				}
			}
			if (local60.anInt3294 != 0 && arg0 != null) {
				arg0.method2710(local60.aBoolean155, arg4, arg1, arg7, arg5);
			}
		} else {
			@Pc(1081) int local1081;
			if (arg7 == 2) {
				local1081 = arg1 + 1 & 0x3;
				@Pc(1122) Class5 local1122;
				@Pc(1107) Class5 local1107;
				if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
					@Pc(1141) Class120 local1141 = local60.method2577(arg2, null, 2, local283, local192, arg1 + 4, local149, local184, local157, local194);
					local1107 = local1141.aClass5_10;
					@Pc(1158) Class120 local1158 = local60.method2577(arg2, null, 2, local283, local192, local1081, local149, local184, local157, local194);
					local1122 = local1158.aClass5_10;
				} else {
					local1107 = new Class5_Sub5(arg8, 2, arg1 + 4, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
					local1122 = new Class5_Sub5(arg8, 2, local1081, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
				}
				Static20.method442(arg3, arg4, arg5, local184, local1107, local1122, Static153.anIntArray226[arg1], Static153.anIntArray226[local1081], local211);
				if (local60.aBoolean149 && arg2) {
					if (arg1 == 0) {
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5] |= 0x249;
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5 + 1] |= 0x492;
					} else if (arg1 == 1) {
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5 + 1] |= 0x492;
						Static140.anIntArrayArrayArray6[arg3][arg4 + 1][arg5] |= 0x249;
					} else if (arg1 == 2) {
						Static140.anIntArrayArrayArray6[arg3][arg4 + 1][arg5] |= 0x249;
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5] |= 0x492;
					} else if (arg1 == 3) {
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5] |= 0x492;
						Static140.anIntArrayArrayArray6[arg3][arg4][arg5] |= 0x249;
					}
				}
				if (local60.anInt3294 != 0 && arg0 != null) {
					arg0.method2710(local60.aBoolean155, arg4, arg1, arg7, arg5);
				}
				if (local60.anInt3255 != 16) {
					Static88.method1508(arg3, arg4, arg5, local60.anInt3255);
				}
			} else if (arg7 == 3) {
				if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
					local342 = local60.method2577(arg2, null, 3, local283, local192, arg1, local149, local184, local157, local194);
					local326 = local342.aClass5_10;
				} else {
					local326 = new Class5_Sub5(arg8, 3, arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
				}
				Static20.method442(arg3, arg4, arg5, local184, local326, null, Static161.anIntArray227[arg1], 0, local211);
				if (local60.aBoolean144 && arg2) {
					if (arg1 == 0) {
						Static18.aByteArrayArrayArray4[arg3][arg4][arg5 + 1] = 50;
					} else if (arg1 == 1) {
						Static18.aByteArrayArrayArray4[arg3][arg4 + 1][arg5 + 1] = 50;
					} else if (arg1 == 2) {
						Static18.aByteArrayArrayArray4[arg3][arg4 + 1][arg5] = 50;
					} else if (arg1 == 3) {
						Static18.aByteArrayArrayArray4[arg3][arg4][arg5] = 50;
					}
				}
				if (local60.anInt3294 != 0 && arg0 != null) {
					arg0.method2710(local60.aBoolean155, arg4, arg1, arg7, arg5);
				}
			} else if (arg7 == 9) {
				if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
					local342 = local60.method2577(arg2, null, arg7, local283, local192, arg1, local149, local184, local157, local194);
					local326 = local342.aClass5_10;
				} else {
					local326 = new Class5_Sub5(arg8, arg7, arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
				}
				Static83.method1458(arg3, arg4, arg5, local184, 1, 1, local326, local211);
				if (local60.anInt3294 != 0 && arg0 != null) {
					arg0.method2709(local76, local73, arg4, arg5, local60.aBoolean155);
				}
				if (local60.anInt3255 != 16) {
					Static88.method1508(arg3, arg4, arg5, local60.anInt3255);
				}
			} else if (arg7 == 4) {
				if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
					local342 = local60.method2577(arg2, null, 4, local283, local192, arg1, local149, local184, local157, local194);
					local326 = local342.aClass5_10;
				} else {
					local326 = new Class5_Sub5(arg8, 4, arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
				}
				Static149.method2567(arg3, arg4, arg5, local184, local326, null, Static153.anIntArray226[arg1], 0, 0, 0, local211);
			} else {
				@Pc(1678) long local1678;
				@Pc(1717) Class5 local1717;
				@Pc(1733) Class120 local1733;
				if (arg7 == 5) {
					local1678 = Static225.method3687(arg3, arg4, arg5);
					local1081 = 16;
					if (local1678 != 0L) {
						local1081 = Static9.method132(Integer.MAX_VALUE & (int) (local1678 >>> 32)).anInt3255;
					}
					if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
						local1733 = local60.method2577(arg2, null, 4, local283, local192, arg1, local149, local184, local157, local194);
						local1717 = local1733.aClass5_10;
					} else {
						local1717 = new Class5_Sub5(arg8, 4, arg1, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
					}
					Static149.method2567(arg3, arg4, arg5, local184, local1717, null, Static153.anIntArray226[arg1], 0, local1081 * Static32.anIntArray45[arg1], local1081 * Static209.anIntArray332[arg1], local211);
				} else if (arg7 == 6) {
					local1081 = 8;
					local1678 = Static225.method3687(arg3, arg4, arg5);
					if (local1678 != 0L) {
						local1081 = Static9.method132((int) (local1678 >>> 32) & Integer.MAX_VALUE).anInt3255 / 2;
					}
					if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
						local1733 = local60.method2577(arg2, null, 4, local283, local192, arg1 + 4, local149, local184, local157, local194);
						local1717 = local1733.aClass5_10;
					} else {
						local1717 = new Class5_Sub5(arg8, 4, arg1 + 4, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
					}
					Static149.method2567(arg3, arg4, arg5, local184, local1717, null, 256, arg1, local1081 * Static209.anIntArray333[arg1], Static163.anIntArray231[arg1] * local1081, local211);
				} else if (arg7 == 7) {
					@Pc(1860) int local1860 = arg1 + 2 & 0x3;
					if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
						@Pc(1903) Class120 local1903 = local60.method2577(arg2, null, 4, local283, local192, local1860 + 4, local149, local184, local157, local194);
						local326 = local1903.aClass5_10;
					} else {
						local326 = new Class5_Sub5(arg8, 4, local1860 + 4, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
					}
					Static149.method2567(arg3, arg4, arg5, local184, local326, null, 256, local1860, 0, 0, local211);
				} else if (arg7 == 8) {
					local1081 = 8;
					local1678 = Static225.method3687(arg3, arg4, arg5);
					if (local1678 != 0L) {
						local1081 = Static9.method132(Integer.MAX_VALUE & (int) (local1678 >>> 32)).anInt3255 / 2;
					}
					@Pc(1951) int local1951 = arg1 + 2 & 0x3;
					@Pc(1996) Class5 local1996;
					if (local60.anInt3289 == -1 && local60.anIntArray221 == null) {
						@Pc(1974) Class120 local1974 = local60.method2577(arg2, null, 4, local283, local192, arg1 + 4, local149, local184, local157, local194);
						local1717 = local1974.aClass5_10;
						@Pc(1993) Class120 local1993 = local60.method2577(arg2, null, 4, local283, local192, local1951 + 4, local149, local184, local157, local194);
						local1996 = local1993.aClass5_10;
					} else {
						local1717 = new Class5_Sub5(arg8, 4, arg1 + 4, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
						local1996 = new Class5_Sub5(arg8, 4, local1951 + 4, arg6, arg4, arg5, local60.anInt3289, local60.aBoolean152, null);
					}
					Static149.method2567(arg3, arg4, arg5, local184, local1717, local1996, 256, arg1, Static209.anIntArray333[arg1] * local1081, local1081 * Static163.anIntArray231[arg1], local211);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!k;)V")
	public static void method2899(@OriginalArg(1) Class1_Sub16 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static114.aClass112_4 != null) {
			@Pc(16) int local16;
			try {
				local16 = 0;
				Static114.aClass112_4.method3298(0L);
				Static114.aClass112_4.method3294(local12);
				while (local16 < 24 && local12[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local16 = 0; local16 < 24; local16++) {
					local12[local16] = -1;
				}
			}
		}
		arg0.method3774(24, local12);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([BI)V")
	public static void method2901(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = Static104.anInt2296 >> 2 << 10;
		@Pc(11) int local11 = Static150.anInt3259 >> 1;
		@Pc(19) byte[][] local19 = new byte[Static3.anInt75][Static87.anInt2017];
		@Pc(21) int local21 = 0;
		while (true) {
			@Pc(35) int local35;
			@Pc(47) int local47;
			while (arg0.length > local21) {
				local35 = (arg0[local21++] & 0xFF) * 64 - Static200.anInt4248;
				local47 = (arg0[local21++] & 0xFF) * 64 - Static108.anInt2405;
				if (local35 > 0 && local47 > 0 && Static3.anInt75 > local35 + 64 && Static87.anInt2017 > local47 + 64) {
					for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
						@Pc(82) byte[] local82 = local19[local74 + local35];
						@Pc(89) int local89 = Static87.anInt2017 - local47 - 1;
						for (@Pc(91) int local91 = -64; local91 < 0; local91++) {
							local82[local89--] = arg0[local21++];
						}
					}
				} else {
					local21 += 4096;
				}
			}
			local47 = Static87.anInt2017;
			local35 = Static3.anInt75;
			@Pc(131) int[] local131 = new int[local47];
			@Pc(141) int[] local141 = new int[local47];
			@Pc(144) int[] local144 = new int[local47];
			@Pc(147) int[] local147 = new int[local47];
			@Pc(150) int[] local150 = new int[local47];
			for (@Pc(152) int local152 = -5; local152 < local35; local152++) {
				@Pc(177) int local177;
				@Pc(241) int local241;
				for (@Pc(156) int local156 = 0; local156 < local47; local156++) {
					@Pc(162) int local162 = local152 + 5;
					@Pc(224) int local224;
					if (local162 < local35) {
						local177 = local19[local162][local156] & 0xFF;
						if (local177 > 0) {
							@Pc(188) Class60 local188 = Static79.method1376(local177 - 1);
							local131[local156] += local188.anInt2137;
							local144[local156] += local188.anInt2145;
							local141[local156] += local188.anInt2151;
							local147[local156] += local188.anInt2147;
							local224 = local150[local156]++;
						}
					}
					local177 = local152 - 5;
					if (local177 >= 0) {
						local241 = local19[local177][local156] & 0xFF;
						if (local241 > 0) {
							@Pc(251) Class60 local251 = Static79.method1376(local241 - 1);
							local131[local156] -= local251.anInt2137;
							local144[local156] -= local251.anInt2145;
							local141[local156] -= local251.anInt2151;
							local147[local156] -= local251.anInt2147;
							local224 = local150[local156]--;
						}
					}
				}
				if (local152 >= 0) {
					@Pc(309) int[][] local309 = Static198.anIntArrayArrayArray10[local152 >> 6];
					@Pc(311) int local311 = 0;
					local177 = 0;
					@Pc(315) int local315 = 0;
					@Pc(317) int local317 = 0;
					local241 = 0;
					for (@Pc(321) int local321 = -5; local321 < local47; local321++) {
						@Pc(327) int local327 = local321 + 5;
						if (local327 < local47) {
							local241 += local144[local327];
							local177 += local131[local327];
							local315 += local150[local327];
							local311 += local147[local327];
							local317 += local141[local327];
						}
						@Pc(364) int local364 = local321 - 5;
						if (local364 >= 0) {
							local317 -= local141[local364];
							local177 -= local131[local364];
							local311 -= local147[local364];
							local241 -= local144[local364];
							local315 -= local150[local364];
						}
						if (local321 >= 0 && local315 > 0) {
							@Pc(404) int local404 = local321 >> 6;
							@Pc(422) int local422 = local311 == 0 ? 0 : Static139.method2458(local241 / local315, local177 * 256 / local311, local317 / local315);
							if (local19[local152][local321] != 0) {
								if (local309[local404] == null) {
									local309[local404] = Static198.anIntArrayArrayArray10[local152 >> 6][local404] = new int[4096];
								}
								@Pc(454) int local454 = local11 + (local422 & 0x7F);
								if (local454 < 0) {
									local454 = 0;
								} else if (local454 > 127) {
									local454 = 127;
								}
								@Pc(482) int local482 = local454 + (local422 & 0x380) + (local422 + local7 & 0xFC00);
								local309[local404][(local152 & 0x3F) + ((local321 & 0x3F) << 6)] = Static171.anIntArray279[Static75.method887(local482, 96)];
							} else if (local309[local404] != null) {
								local309[local404][(local152 & 0x3F) + ((local321 & 0x3F) << 6)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}
}
