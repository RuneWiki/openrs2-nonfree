import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!cc;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!uq;")
	public static Class251 aClass251_11 = null;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[I")
	public static final int[] anIntArray593 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
	public static int anInt6417 = -1;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(BI)I")
	private static int method5333(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ma;IIILclient!uq;IILclient!ya;)V")
	public static void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class251 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class39 arg7) {
		@Pc(10) Class202 local10 = Static17.aClass78_3.method2110(arg0);
		if (local10 == null || !local10.aBoolean400 || !local10.method4655(Static394.aClass23_1)) {
			return;
		}
		@Pc(32) int local32;
		if (local10.anIntArray517 != null) {
			@Pc(30) int[] local30 = new int[local10.anIntArray517.length];
			@Pc(46) int local46;
			for (local32 = 0; local32 < local30.length / 2; local32++) {
				if (Static345.anInt5797 == 4) {
					local46 = (int) Static142.aFloat89 & 0x3FFF;
				} else {
					local46 = Static82.anInt1815 + (int) Static142.aFloat89 & 0x3FFF;
				}
				@Pc(57) int local57 = Class183.anIntArray433[local46];
				@Pc(61) int local61 = Class183.anIntArray434[local46];
				if (Static345.anInt5797 != 4) {
					local57 = local57 * 256 / (Static119.anInt840 + 256);
					local61 = local61 * 256 / (Static119.anInt840 + 256);
				}
				local30[local32 * 2] = ((arg6 + local10.anIntArray517[local32 * 2] * 4) * local61 + local57 * (arg4 + local10.anIntArray517[local32 * 2 + 1] * 4) >> 15) + arg5.anInt6687 / 2 + arg2;
				local30[local32 * 2 + 1] = arg3 + arg5.anInt6677 / 2 - (local61 * (arg4 + local10.anIntArray517[local32 * 2 + 1] * 4) - (arg6 + local10.anIntArray517[local32 * 2] * 4) * local57 >> 15);
			}
			Static103.method1867(arg7, local30, local10.anInt5591, arg5.anIntArray603, arg5.anIntArray604);
			for (local46 = 0; local46 < local30.length / 2 - 1; local46++) {
				arg7.method4494(local30[local46 * 2], local30[local46 * 2 + 1], local30[(local46 + 1) * 2], local30[local46 * 2 + 1 + 2], local10.anInt5596, arg1, arg2, arg3);
			}
			arg7.method4494(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local10.anInt5596, arg1, arg2, arg3);
		}
		@Pc(262) Class143 local262 = null;
		if (local10.anInt5576 != -1) {
			local262 = local10.method4658(arg7, false);
			if (local262 != null) {
				Static451.method5929(local262, arg2, arg3, arg4, arg6, arg5, arg1);
			}
		}
		if (local10.aString52 == null) {
			return;
		}
		local32 = 0;
		if (local262 != null) {
			local32 = local262.ma();
		}
		@Pc(295) Class71 local295 = Static26.aClass71_1;
		@Pc(297) Class151 local297 = Static51.aClass151_137;
		if (local10.anInt5592 == 1) {
			local297 = Static325.aClass151_103;
			local295 = Static312.aClass71_7;
		}
		if (local10.anInt5592 == 2) {
			local297 = Static3.aClass151_6;
			local295 = Static178.aClass71_5;
		}
		Static162.method2631(local10.anInt5565, local295, local10.aString52, arg5, arg4, local297, local32, arg2, arg1, arg6, arg3);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIIII)V")
	public static void method5336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static28.anInt644 <= arg3 && Static125.anInt2545 >= arg3) {
			@Pc(19) int local19 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg1);
			@Pc(25) int local25 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg0);
			Static157.method3068(arg2, arg3, local19, local25);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Z")
	public static boolean method5337(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI[[[Lclient!fq;III)Z")
	public static boolean method5338(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) byte local12 = arg0 ? 1 : (byte) (Static244.anInt4494 & 0xFF);
		if (Static22.aByteArrayArrayArray10[Static357.anInt5881][arg4][arg3] == local12) {
			return false;
		} else if ((Static2.aByteArrayArrayArray1[Static357.anInt5881][arg4][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(37) byte local37 = 0;
			Static75.anIntArray127[0] = arg4;
			@Pc(43) int local43 = 0;
			@Pc(46) int local46 = local37 + 1;
			Static304.anIntArray453[0] = arg3;
			Static22.aByteArrayArrayArray10[Static357.anInt5881][arg4][arg3] = local12;
			while (local46 != local43) {
				@Pc(63) int local63 = Static75.anIntArray127[local43] & 0xFFFF;
				@Pc(71) int local71 = Static75.anIntArray127[local43] >> 16 & 0xFF;
				@Pc(79) int local79 = Static75.anIntArray127[local43] >> 24 & 0xFF;
				@Pc(85) int local85 = Static304.anIntArray453[local43] & 0xFFFF;
				@Pc(93) int local93 = Static304.anIntArray453[local43] >> 16 & 0xFF;
				local43 = local43 + 1 & 0xFFF;
				@Pc(101) boolean local101 = false;
				if ((Static2.aByteArrayArrayArray1[Static357.anInt5881][local63][local85] & 0x4) == 0) {
					local101 = true;
				}
				@Pc(118) boolean local118 = false;
				@Pc(156) int local156;
				@Pc(201) int local201;
				label231: for (@Pc(122) int local122 = Static357.anInt5881 + 1; local122 <= 3; local122++) {
					if ((Static2.aByteArrayArrayArray1[local122][local63][local85] & 0x8) == 0) {
						@Pc(300) Class31_Sub2 local300;
						@Pc(310) int local310;
						@Pc(290) Class80 local290;
						@Pc(296) Class22 local296;
						if (local101 && arg2[local122][local63][local85] != null) {
							if (arg2[local122][local63][local85].aClass31_Sub3_3 != null) {
								local156 = method5333(local71);
								if (local156 == arg2[local122][local63][local85].aClass31_Sub3_3.anInt2831 || arg2[local122][local63][local85].aClass31_Sub3_2 != null && local156 == arg2[local122][local63][local85].aClass31_Sub3_2.anInt2831) {
									continue;
								}
								if (local79 != 0) {
									local201 = method5333(local79);
									if (arg2[local122][local63][local85].aClass31_Sub3_3.anInt2831 == local201 || arg2[local122][local63][local85].aClass31_Sub3_2 != null && arg2[local122][local63][local85].aClass31_Sub3_2.anInt2831 == local201) {
										continue;
									}
								}
								if (local93 != 0) {
									local201 = method5333(local93);
									if (local201 == arg2[local122][local63][local85].aClass31_Sub3_3.anInt2831 || arg2[local122][local63][local85].aClass31_Sub3_2 != null && arg2[local122][local63][local85].aClass31_Sub3_2.anInt2831 == local201) {
										continue;
									}
								}
							}
							local290 = arg2[local122][local63][local85];
							if (local290.aClass22_2 != null) {
								for (local296 = local290.aClass22_2; local296 != null; local296 = local296.aClass22_1) {
									local300 = local296.aClass31_Sub2_1;
									if (local300 instanceof Interface5) {
										@Pc(306) Interface5 local306 = (Interface5) local300;
										local310 = local306.method5172();
										@Pc(314) int local314 = local306.method5169();
										if (local310 == 21) {
											local310 = 19;
										}
										@Pc(325) int local325 = local310 | local314 << 6;
										if (local71 == local325 || local79 != 0 && local325 == local79 || local93 != 0 && local93 == local325) {
											continue label231;
										}
									}
								}
							}
						}
						local290 = arg2[local122][local63][local85];
						if (local290 != null && local290.aClass22_2 != null) {
							for (local296 = local290.aClass22_2; local296 != null; local296 = local296.aClass22_1) {
								local300 = local296.aClass31_Sub2_1;
								if (local300.aShort100 != local300.aShort103 || local300.aShort102 != local300.aShort101) {
									for (@Pc(385) int local385 = local300.aShort103; local385 <= local300.aShort100; local385++) {
										for (local310 = local300.aShort102; local310 <= local300.aShort101; local310++) {
											Static22.aByteArrayArrayArray10[local122][local385][local310] = local12;
										}
									}
								}
							}
						}
						Static22.aByteArrayArrayArray10[local122][local63][local85] = local12;
						local118 = true;
					}
				}
				if (local118) {
					local156 = Static105.aClass149Array1[Static357.anInt5881 + 1].l(local63, local85);
					if (Static257.anIntArray392[arg1] < local156) {
						Static257.anIntArray392[arg1] = local156;
					}
					local201 = local63 << 7;
					if (Static24.anIntArray48[arg1] > local201) {
						Static24.anIntArray48[arg1] = local201;
					} else if (Static397.anIntArray590[arg1] < local201) {
						Static397.anIntArray590[arg1] = local201;
					}
					@Pc(488) int local488 = local85 << 7;
					if (Static188.anIntArray301[arg1] > local488) {
						Static188.anIntArray301[arg1] = local488;
					} else if (Static19.anIntArray42[arg1] < local488) {
						Static19.anIntArray42[arg1] = local488;
					}
				}
				if (!local101) {
					if (local63 >= 1 && local12 != Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 - 1][local85]) {
						Static75.anIntArray127[local46] = 0xD3000000 | 0x120000 | local63 - 1;
						Static304.anIntArray453[local46] = local85 | 0x130000;
						local46 = local46 + 1 & 0xFFF;
						Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 - 1][local85] = local12;
					}
					local85++;
					if (local85 < Static118.anInt2419) {
						if (local63 - 1 >= 0 && local12 != Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 - 1][local85] && (Static2.aByteArrayArrayArray1[Static357.anInt5881][local63][local85] & 0x4) == 0 && (Static2.aByteArrayArrayArray1[Static357.anInt5881][local63 - 1][local85 - 1] & 0x4) == 0) {
							Static75.anIntArray127[local46] = local63 - 1 | 0x52000000 | 0x120000;
							Static304.anIntArray453[local46] = local85 | 0x130000;
							Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 - 1][local85] = local12;
							local46 = local46 + 1 & 0xFFF;
						}
						if (local12 != Static22.aByteArrayArrayArray10[Static357.anInt5881][local63][local85]) {
							Static75.anIntArray127[local46] = local63 | 0x520000 | 0x13000000;
							Static304.anIntArray453[local46] = local85 | 0x530000;
							local46 = local46 + 1 & 0xFFF;
							Static22.aByteArrayArrayArray10[Static357.anInt5881][local63][local85] = local12;
						}
						if (local63 + 1 < Static195.anInt3537 && local12 != Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 + 1][local85] && (Static2.aByteArrayArrayArray1[Static357.anInt5881][local63][local85] & 0x4) == 0 && (Static2.aByteArrayArrayArray1[Static357.anInt5881][local63 + 1][local85 - 1] & 0x4) == 0) {
							Static75.anIntArray127[local46] = 0x92000000 | 0x520000 | local63 + 1;
							Static304.anIntArray453[local46] = local85 | 0x530000;
							Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 + 1][local85] = local12;
							local46 = local46 + 1 & 0xFFF;
						}
					}
					local85--;
					if (Static195.anInt3537 > local63 + 1 && Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 + 1][local85] != local12) {
						Static75.anIntArray127[local46] = local63 + 1 | 0x920000 | 0x53000000;
						Static304.anIntArray453[local46] = local85 | 0x930000;
						Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 + 1][local85] = local12;
						local46 = local46 + 1 & 0xFFF;
					}
					local85--;
					if (local85 >= 0) {
						if (local63 - 1 >= 0 && local12 != Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 - 1][local85] && (Static2.aByteArrayArrayArray1[Static357.anInt5881][local63][local85] & 0x4) == 0 && (Static2.aByteArrayArrayArray1[Static357.anInt5881][local63 - 1][local85 + 1] & 0x4) == 0) {
							Static75.anIntArray127[local46] = local63 - 1 | 0xD20000 | 0x12000000;
							Static304.anIntArray453[local46] = local85 | 0xD30000;
							local46 = local46 + 1 & 0xFFF;
							Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 - 1][local85] = local12;
						}
						if (Static22.aByteArrayArrayArray10[Static357.anInt5881][local63][local85] != local12) {
							Static75.anIntArray127[local46] = 0x93000000 | 0xD20000 | local63;
							Static304.anIntArray453[local46] = local85 | 0xD30000;
							local46 = local46 + 1 & 0xFFF;
							Static22.aByteArrayArrayArray10[Static357.anInt5881][local63][local85] = local12;
						}
						if (Static195.anInt3537 > local63 + 1 && Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 + 1][local85] != local12 && (Static2.aByteArrayArrayArray1[Static357.anInt5881][local63][local85] & 0x4) == 0 && (Static2.aByteArrayArrayArray1[Static357.anInt5881][local63 + 1][local85 + 1] & 0x4) == 0) {
							Static75.anIntArray127[local46] = local63 + 1 | 0xD2000000 | 0x920000;
							Static304.anIntArray453[local46] = local85 | 0x930000;
							Static22.aByteArrayArrayArray10[Static357.anInt5881][local63 + 1][local85] = local12;
							local46 = local46 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static257.anIntArray392[arg1] != -1000000) {
				Static257.anIntArray392[arg1] += 10;
				Static24.anIntArray48[arg1] -= 50;
				Static397.anIntArray590[arg1] += 50;
				Static19.anIntArray42[arg1] += 50;
				Static188.anIntArray301[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method5339() {
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			Static62.aBooleanArray8[local5] = false;
		}
		Static440.anInt7082 = 0;
		Static139.anInt2726 = 0;
		Static77.anInt1741 = -1;
		Static222.anInt4041 = -1;
		Static345.anInt5797 = 1;
	}
}
