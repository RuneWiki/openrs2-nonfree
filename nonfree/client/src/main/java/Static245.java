import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "Lclient!ci;")
	public static Class21 aClass21_7;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString193 = "purple:";

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIIILclient!ie;BIII)Z")
	public static boolean method4327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class91 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg0 - 64;
		Static259.anIntArrayArray52[64][64] = 99;
		@Pc(29) int local29 = arg8 - 64;
		Static162.anIntArrayArray29[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static10.anIntArray30[0] = arg0;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local37 + 1;
		Static54.anIntArray415[0] = arg8;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray27;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(82) int local82;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(248) int local248;
				@Pc(291) int local291;
				do {
					do {
						do {
							label259: do {
								if (local48 == local51) {
									Static115.anInt2302 = local9;
									Static4.anInt86 = local7;
									return false;
								}
								local9 = Static54.anIntArray415[local48];
								local7 = Static10.anIntArray30[local48];
								local71 = local7 - local18;
								local48 = local48 + 1 & 0xFFF;
								local82 = local9 - local29;
								local88 = local7 - arg7.anInt2692;
								local94 = local9 - arg7.anInt2685;
								if (arg9 == -4) {
									if (arg4 == local7 && arg1 == local9) {
										Static115.anInt2302 = local9;
										Static4.anInt86 = local7;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static69.method1393(arg6, local7, arg1, arg5, arg3, arg4, local9, arg5)) {
										Static115.anInt2302 = local9;
										Static4.anInt86 = local7;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg7.method2596(local7, arg4, arg5, arg3, local9, arg5, arg10, arg6, arg1)) {
										Static4.anInt86 = local7;
										Static115.anInt2302 = local9;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg7.method2595(local7, arg3, local9, arg6, arg10, arg5, arg4, arg1)) {
										Static4.anInt86 = local7;
										Static115.anInt2302 = local9;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg7.method2607(local9, arg9, arg1, local7, arg2, arg5, arg4)) {
										Static4.anInt86 = local7;
										Static115.anInt2302 = local9;
										return true;
									}
								} else if (arg7.method2604(arg5, local9, arg9, arg4, arg1, arg2, local7)) {
									Static4.anInt86 = local7;
									Static115.anInt2302 = local9;
									return true;
								}
								local248 = Static162.anIntArrayArray29[local71][local82] + 1;
								if (local71 > 0 && Static259.anIntArrayArray52[local71 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + arg5 - 1] & 0x4E240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg5 - 1 <= local291) {
											Static10.anIntArray30[local51] = local7 - 1;
											Static54.anIntArray415[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static259.anIntArrayArray52[local71 - 1][local82] = 2;
											Static162.anIntArrayArray29[local71 - 1][local82] = local248;
											break;
										}
										if ((local56[local88 - 1][local94 + local291] & 0x4FA40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg5 > local71 && Static259.anIntArrayArray52[local71 + 1][local82] == 0 && (local56[arg5 + local88][local94] & 0x60E40000) == 0 && (local56[arg5 + local88][arg5 + local94 - 1] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg5 - 1 <= local291) {
											Static10.anIntArray30[local51] = local7 + 1;
											Static54.anIntArray415[local51] = local9;
											Static259.anIntArrayArray52[local71 + 1][local82] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static162.anIntArrayArray29[local71 + 1][local82] = local248;
											break;
										}
										if ((local56[arg5 + local88][local291 + local94] & 0x78E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local82 > 0 && Static259.anIntArrayArray52[local71][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[arg5 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg5 - 1 <= local291) {
											Static10.anIntArray30[local51] = local7;
											Static54.anIntArray415[local51] = local9 - 1;
											Static259.anIntArrayArray52[local71][local82 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static162.anIntArrayArray29[local71][local82 - 1] = local248;
											break;
										}
										if ((local56[local88 + local291][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local82 < 128 - arg5 && Static259.anIntArrayArray52[local71][local82 + 1] == 0 && (local56[local88][arg5 + local94] & 0x4E240000) == 0 && (local56[local88 + arg5 - 1][local94 + arg5] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg5 - 1) {
											Static10.anIntArray30[local51] = local7;
											Static54.anIntArray415[local51] = local9 + 1;
											Static259.anIntArrayArray52[local71][local82 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static162.anIntArrayArray29[local71][local82 + 1] = local248;
											break;
										}
										if ((local56[local291 + local88][arg5 + local94] & 0x7E240000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local71 > 0 && local82 > 0 && Static259.anIntArrayArray52[local71 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg5) {
											Static10.anIntArray30[local51] = local7 - 1;
											Static54.anIntArray415[local51] = local9 - 1;
											Static259.anIntArrayArray52[local71 - 1][local82 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static162.anIntArrayArray29[local71 - 1][local82 - 1] = local248;
											break;
										}
										if ((local56[local88 - 1][local291 + local94 - 1] & 0x4FA40000) != 0 || (local56[local291 + local88 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg5 > local71 && local82 > 0 && Static259.anIntArrayArray52[local71 + 1][local82 - 1] == 0 && (local56[arg5 + local88][local94 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg5) {
											Static10.anIntArray30[local51] = local7 + 1;
											Static54.anIntArray415[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static259.anIntArrayArray52[local71 + 1][local82 - 1] = 9;
											Static162.anIntArrayArray29[local71 + 1][local82 - 1] = local248;
											break;
										}
										if ((local56[local88 + arg5][local94 + local291 - 1] & 0x78E40000) != 0 || (local56[local291 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local71 > 0 && 128 - arg5 > local82 && Static259.anIntArrayArray52[local71 - 1][local82 + 1] == 0 && (local56[local88 - 1][arg5 + local94] & 0x4E240000) == 0) {
									for (local291 = 1; local291 < arg5; local291++) {
										if ((local56[local88 - 1][local94 + local291] & 0x4FA40000) != 0 || (local56[local291 + local88 - 1][local94 + arg5] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static10.anIntArray30[local51] = local7 - 1;
									Static54.anIntArray415[local51] = local9 + 1;
									Static259.anIntArrayArray52[local71 - 1][local82 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static162.anIntArrayArray29[local71 - 1][local82 + 1] = local248;
								}
							} while (128 - arg5 <= local71);
						} while (128 - arg5 <= local82);
					} while (Static259.anIntArrayArray52[local71 + 1][local82 + 1] != 0);
				} while ((local56[local88 + arg5][local94 + arg5] & 0x78240000) != 0);
				for (local291 = 1; local291 < arg5; local291++) {
					if ((local56[local88 + local291][arg5 + local94] & 0x7E240000) != 0 || (local56[arg5 + local88][local291 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static10.anIntArray30[local51] = local7 + 1;
				Static54.anIntArray415[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static259.anIntArrayArray52[local71 + 1][local82 + 1] = 12;
				Static162.anIntArrayArray29[local71 + 1][local82 + 1] = local248;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)I")
	public static int method4328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static23.anIntArrayArray1 == null ? 0 : Static23.anIntArrayArray1[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	public static void method4331() {
		if (Static304.anInt5854 == -1 || Static112.anInt4021 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static72.anInt1505 - Static296.anInt5749) * Static141.anInt867 >> 16) + Static296.anInt5749;
		Static141.anInt867 += local23;
		if (Static141.anInt867 >= 65535) {
			Static141.anInt867 = 65535;
			if (Static48.aBoolean107) {
				Static186.aBoolean329 = false;
			} else {
				Static186.aBoolean329 = true;
			}
			Static48.aBoolean107 = true;
		} else {
			Static186.aBoolean329 = false;
			Static48.aBoolean107 = false;
		}
		@Pc(55) float local55 = (float) Static141.anInt867 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static147.anInt2892 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(143) int local143;
		@Pc(161) int local161;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static133.anIntArrayArrayArray8[Static304.anInt5854][local62][local64] * 3;
			local88 = Static133.anIntArrayArrayArray8[Static304.anInt5854][local62 + 1][local64] * 3;
			local121 = (Static133.anIntArrayArrayArray8[Static304.anInt5854][local62 + 2][local64] + Static133.anIntArrayArrayArray8[Static304.anInt5854][local62 + 2][local64] - Static133.anIntArrayArrayArray8[Static304.anInt5854][local62 + 3][local64]) * 3;
			local129 = Static133.anIntArrayArrayArray8[Static304.anInt5854][local62][local64];
			local134 = local88 - local76;
			local143 = local121 + local76 - local88 * 2;
			local161 = Static133.anIntArrayArrayArray8[Static304.anInt5854][local62 + 2][local64] + local88 - local121 - local129;
			local58[local64] = (float) local129 + ((float) local134 + local55 * (local55 * (float) local161 + (float) local143)) * local55;
		}
		Static164.anInt3425 = (int) local58[2] - Static161.anInt3315 * 128;
		Static194.anInt3958 = (int) local58[1] * -1;
		Static221.anInt4363 = (int) local58[0] - Static182.anInt3775 * 128;
		@Pc(215) float[] local215 = new float[3];
		local88 = Static47.anInt1090 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static133.anIntArrayArrayArray8[Static112.anInt4021][local88][local121] * 3;
			local134 = Static133.anIntArrayArrayArray8[Static112.anInt4021][local88 + 1][local121] * 3;
			local143 = (Static133.anIntArrayArrayArray8[Static112.anInt4021][local88 + 2][local121] + Static133.anIntArrayArrayArray8[Static112.anInt4021][local88 + 2][local121] - Static133.anIntArrayArrayArray8[Static112.anInt4021][local88 + 3][local121]) * 3;
			local161 = Static133.anIntArrayArrayArray8[Static112.anInt4021][local88][local121];
			@Pc(291) int local291 = local134 - local129;
			@Pc(300) int local300 = local129 + local143 - local134 * 2;
			@Pc(317) int local317 = Static133.anIntArrayArrayArray8[Static112.anInt4021][local88 + 2][local121] + local134 - local161 - local143;
			local215[local121] = local55 * ((float) local291 + local55 * (local55 * (float) local317 + (float) local300)) + (float) local161;
		}
		@Pc(351) float local351 = local215[0] - local58[0];
		@Pc(361) float local361 = (local215[1] - local58[1]) * -1.0F;
		@Pc(370) float local370 = local215[2] - local58[2];
		@Pc(380) double local380 = Math.sqrt((double) (local351 * local351 + local370 * local370));
		Static107.anInt2183 = (int) (Math.atan2((double) local361, local380) * 2607.5945876176133D) & 0x3FFF;
		Static5.anInt99 = (int) (-Math.atan2((double) local351, (double) local370) * 2607.5945876176133D) & 0x3FFF;
		Static54.anInt3491 = Static133.anIntArrayArrayArray8[Static304.anInt5854][local62][3] + (Static141.anInt867 * (Static133.anIntArrayArrayArray8[Static304.anInt5854][local62 + 2][3] - Static133.anIntArrayArrayArray8[Static304.anInt5854][local62][3]) >> 16);
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
	public static void method4332() {
		if (Static269.method4691() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static108.anInt2197 - 4 & 0xFF);
		@Pc(23) int local23 = Static108.anInt2197 % Static48.anInt1107;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static337.anInt6402; local29++) {
				Static186.aByteArrayArrayArray8[local25][local23][local29] = local19;
			}
		}
		if (Static285.anInt5511 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static37.anIntArray110[local29] = -1000000;
			Static117.anIntArray286[local29] = 1000000;
			Static210.anIntArray500[local29] = 0;
			Static82.anIntArray192[local29] = 1000000;
			Static314.anIntArray759[local29] = 0;
		}
		@Pc(99) int local99;
		if (Static81.anInt1609 != 1) {
			local99 = Static16.method362(Static221.anInt4363, Static164.anInt3425, Static285.anInt5511);
			if (local99 - Static194.anInt3958 < 800 && (Static183.aByteArrayArrayArray7[Static285.anInt5511][Static221.anInt4363 >> 7][Static164.anInt3425 >> 7] & 0x4) != 0) {
				Static177.method3480(Static164.anInt3425 >> 7, false, 1, Static221.anInt4363 >> 7, Static138.aClass204ArrayArrayArray1);
				return;
			}
			return;
		}
		if ((Static183.aByteArrayArrayArray7[Static285.anInt5511][Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7][Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7] & 0x4) != 0) {
			Static177.method3480(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7, false, 0, Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7, Static138.aClass204ArrayArrayArray1);
		}
		if (Static107.anInt2183 >= 2560) {
			return;
		}
		local99 = Static221.anInt4363 >> 7;
		@Pc(181) int local181 = Static164.anInt3425 >> 7;
		@Pc(186) int local186 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7;
		@Pc(191) int local191 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7;
		@Pc(203) int local203;
		if (local186 <= local99) {
			local203 = local99 - local186;
		} else {
			local203 = local186 - local99;
		}
		@Pc(221) int local221;
		if (local191 <= local181) {
			local221 = local181 - local191;
		} else {
			local221 = local191 - local181;
		}
		if (local203 == 0 && local221 == 0 || local203 <= -Static48.anInt1107 || local203 >= Static48.anInt1107 || -Static337.anInt6402 >= local221 || Static337.anInt6402 <= local221) {
			Static152.method2899("RC: " + local99 + "," + local181 + " " + local186 + "," + local191 + " " + Static182.anInt3775 + "," + Static161.anInt3315, null);
			return;
		}
		@Pc(300) int local300;
		@Pc(302) int local302;
		if (local203 <= local221) {
			local300 = local203 * 65536 / local221;
			local302 = 32768;
			while (local191 != local181) {
				if (local181 < local191) {
					local181++;
				} else if (local181 > local191) {
					local181--;
				}
				if ((Static183.aByteArrayArrayArray7[Static285.anInt5511][local99][local181] & 0x4) != 0) {
					Static177.method3480(local181, false, 1, local99, Static138.aClass204ArrayArrayArray1);
					return;
				}
				local302 += local300;
				if (local302 >= 65536) {
					local302 -= 65536;
					if (local99 < local186) {
						local99++;
					} else if (local186 < local99) {
						local99--;
					}
					if ((Static183.aByteArrayArrayArray7[Static285.anInt5511][local99][local181] & 0x4) != 0) {
						Static177.method3480(local181, false, 1, local99, Static138.aClass204ArrayArrayArray1);
						return;
					}
				}
			}
			return;
		}
		local300 = local221 * 65536 / local203;
		local302 = 32768;
		while (local186 != local99) {
			if (local99 < local186) {
				local99++;
			} else if (local99 > local186) {
				local99--;
			}
			if ((Static183.aByteArrayArrayArray7[Static285.anInt5511][local99][local181] & 0x4) != 0) {
				Static177.method3480(local181, false, 1, local99, Static138.aClass204ArrayArrayArray1);
				return;
			}
			local302 += local300;
			if (local302 >= 65536) {
				local302 -= 65536;
				if (local181 < local191) {
					local181++;
				} else if (local181 > local191) {
					local181--;
				}
				if ((Static183.aByteArrayArrayArray7[Static285.anInt5511][local99][local181] & 0x4) != 0) {
					Static177.method3480(local181, false, 1, local99, Static138.aClass204ArrayArrayArray1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)V")
	public static void method4333(@OriginalArg(0) int arg0) {
		Static177.anInt3677 = 3;
		Static327.anInt6270 = arg0;
		Static23.anInt530 = 100;
		Static239.anInt4658 = -1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(CI)Z")
	public static boolean method4335(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIILclient!aa;Lclient!hc;IIIII)Lclient!hc;")
	public static Class78 method4338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) Class78 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) long local11 = (long) arg2;
		@Pc(17) Class78 local17 = (Class78) Static310.aClass140_157.method3816(local11);
		if (local17 == null) {
			@Pc(27) Class12 local27 = Static328.method5503(Static28.aClass165_10, arg2);
			if (local27 == null) {
				return null;
			}
			local17 = arg4.method3251(local27, 1031, Static145.anInt2845, 64, 768);
			Static310.aClass140_157.method3817(local11, local17);
		}
		local17 = local17.method4394((byte) 2, 1031, true);
		if (arg3 != 0) {
			local17.method4372(arg3);
		}
		if (arg1 != 0) {
			local17.method4369(arg1);
		}
		if (arg9 != 0) {
			local17.method4389(arg9);
		}
		if (arg7 != 0) {
			local17.method4399(0, arg7, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)Z")
	public static boolean method4340() {
		@Pc(5) Class79 local5 = Static61.aClass79_1;
		synchronized (Static61.aClass79_1) {
			if (Static84.anInt1650 == Static97.anInt1919) {
				return false;
			} else {
				Static320.anInt6137 = Static265.anIntArray644[Static97.anInt1919];
				Static316.aChar3 = Static304.aCharArray7[Static97.anInt1919];
				Static97.anInt1919 = Static97.anInt1919 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!sr;I)Lclient!aa;")
	public static Class2 method4341(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2) {
		return new Class2_Sub2(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!aa;Z)V")
	public static void method4342(@OriginalArg(0) Class2 arg0) {
		@Pc(7) int local7 = Static13.anInt269;
		@Pc(9) int local9 = Static288.anInt6178;
		@Pc(11) int local11 = Static139.anInt2759;
		@Pc(15) int local15 = Static115.anInt2299 - 3;
		if (Static175.aClass90_12 == null || Static44.aClass90_4 == null) {
			if (Static297.aClass165_88.method4486(Static239.anInt4651) && Static297.aClass165_88.method4486(Static30.anInt777)) {
				Static175.aClass90_12 = arg0.method3322(Static363.method3785(Static297.aClass165_88, Static239.anInt4651, 0));
				@Pc(61) Class138 local61 = Static363.method3785(Static297.aClass165_88, Static30.anInt777, 0);
				Static44.aClass90_4 = arg0.method3322(local61);
				local61.method3781();
				Static156.aClass90_11 = arg0.method3322(local61);
			} else {
				arg0.method3300(local7, local9, local11, 20, Static37.anInt891 | 255 - Static73.anInt1506 << 24, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static175.aClass90_12 != null && Static44.aClass90_4 != null) {
			local87 = (local11 - Static44.aClass90_4.method5471() * 2) / Static175.aClass90_12.method5471();
			for (local89 = 0; local89 < local87; local89++) {
				Static175.aClass90_12.method5454(Static44.aClass90_4.method5471() + local7 + Static175.aClass90_12.method5471() * local89, local9);
			}
			Static44.aClass90_4.method5454(local7, local9);
			Static156.aClass90_11.method5454(local11 + local7 - Static156.aClass90_11.method5471(), local9);
		}
		Static302.aClass13_7.method4456(Static16.anInt313 | 0xFF000000, local9 + 14, -1, Static205.aString166, local7 + 3);
		arg0.method3300(local7, local9 + 20, local11, local15 - 20, Static37.anInt891 | 255 - Static73.anInt1506 << 24, 1);
		local87 = Static179.anInt3693;
		local89 = Static295.anInt5742;
		@Pc(182) int local182;
		for (@Pc(165) int local165 = 0; local165 < Static277.anInt6207; local165++) {
			local182 = local9 + (Static277.anInt6207 + -1 + -local165) * 16 + 13 + 20;
			if (local7 < local87 && local87 < local7 + local11 && local89 > local182 - 13 && local182 + 4 > local89) {
				arg0.method3300(local7, local182 - 12, local11, 16, 255 - Static39.anInt903 << 24 | Static254.anInt4895, 1);
			}
		}
		if ((Static190.aClass90_13 == null || Static88.aClass90_8 == null || Static155.aClass90_10 == null) && Static297.aClass165_88.method4486(Static32.anInt791) && Static297.aClass165_88.method4486(Static185.anInt1051) && Static297.aClass165_88.method4486(Static158.anInt3146)) {
			@Pc(262) Class138 local262 = Static363.method3785(Static297.aClass165_88, Static185.anInt1051, 0);
			Static88.aClass90_8 = arg0.method3322(local262);
			local262.method3781();
			Static50.aClass90_7 = arg0.method3322(local262);
			Static190.aClass90_13 = arg0.method3322(Static363.method3785(Static297.aClass165_88, Static32.anInt791, 0));
			@Pc(287) Class138 local287 = Static363.method3785(Static297.aClass165_88, Static158.anInt3146, 0);
			Static155.aClass90_10 = arg0.method3322(local287);
			local287.method3781();
			Static306.aClass90_17 = arg0.method3322(local287);
		}
		@Pc(358) int local358;
		@Pc(360) int local360;
		if (Static190.aClass90_13 != null && Static88.aClass90_8 != null && Static155.aClass90_10 != null) {
			local182 = (local11 - Static155.aClass90_10.method5471() * 2) / Static190.aClass90_13.method5471();
			for (@Pc(318) int local318 = 0; local318 < local182; local318++) {
				Static190.aClass90_13.method5454(Static155.aClass90_10.method5471() + local7 + local318 * Static190.aClass90_13.method5471(), -Static190.aClass90_13.method5466() + local9 + local15);
			}
			local358 = (local15 - Static155.aClass90_10.method5466() - 20) / Static88.aClass90_8.method5466();
			for (local360 = 0; local360 < local358; local360++) {
				Static88.aClass90_8.method5454(local7, Static88.aClass90_8.method5466() * local360 + local9 + 20);
				Static50.aClass90_7.method5454(local7 + local11 - Static50.aClass90_7.method5471(), local360 * Static88.aClass90_8.method5466() + (local9 - -20));
			}
			Static155.aClass90_10.method5454(local7, local9 + local15 - Static155.aClass90_10.method5466());
			Static306.aClass90_17.method5454(local11 + local7 - Static155.aClass90_10.method5471(), -Static155.aClass90_10.method5466() + local15 + local9);
		}
		local182 = 0;
		for (@Pc(429) Class1_Sub41 local429 = (Class1_Sub41) Static175.aClass195_36.method5029(); local429 != null; local429 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
			local358 = local9 + (Static277.anInt6207 - (1 - -local182)) * 16 + 13 + 20;
			local360 = Static16.anInt313 | 0xFF000000;
			if (local7 < local87 && local87 < local11 + local7 && local358 - 13 < local89 && local89 < local358 + 4) {
				local360 = Static54.anInt3494 | 0xFF000000;
			}
			@Pc(483) int[] local483 = null;
			if (Static295.method5059(local429.anInt6339)) {
				local483 = Static241.method4285((int) local429.aLong206).anIntArray228;
			} else if (Static171.method3408(local429.anInt6339)) {
				@Pc(499) Class5_Sub3_Sub3_Sub2 local499 = Static169.aClass5_Sub3_Sub3_Sub2Array2[(int) local429.aLong206];
				if (local499 != null) {
					local483 = local499.aClass122_1.anIntArray452;
				}
			} else if (Static210.method3850(local429.anInt6339)) {
				if (local429.anInt6339 == 1008) {
					local483 = Static126.method2405((int) local429.aLong206).anIntArray695;
				} else {
					local483 = Static126.method2405((int) (local429.aLong206 >>> 32 & 0x7FFFFFFFL)).anIntArray695;
				}
			}
			@Pc(548) String local548 = Static137.method2638(local429);
			if (local483 != null) {
				local548 = local548 + Static195.method3685(local483);
			}
			local182++;
			Static302.aClass13_7.method4451(0, local7 + 3, local548, local360, local358, Static335.aClass90Array16, Static6.anIntArray20);
		}
		Static36.method3156(Static288.anInt6178, Static115.anInt2299, Static13.anInt269, Static139.anInt2759);
	}
}
