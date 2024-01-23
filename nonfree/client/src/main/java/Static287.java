import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "F")
	public static float aFloat54 = 0.0F;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public static int anInt5449 = 3;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public static int anInt5450 = -1;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public static int anInt5451 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIB)I")
	public static int method4255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		} else {
			@Pc(23) int local23 = 128 - arg2;
			@Pc(41) int local41 = arg2 * (arg0 >>> 7 & 0x1FE01FE) + (arg1 >>> 7 & 0x1FE01FE) * local23 & 0xFF00FF00;
			@Pc(55) int local55 = (arg0 & 0xFF00FF) * arg2 + local23 * (arg1 & 0xFF00FF) & 0xFF00FF00;
			return (local55 >> 7) + local41;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)Z")
	public static boolean method4256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static140.method2233(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static271.method4002(local10 + 1, Static208.anIntArrayArrayArray11[arg0][arg1][arg2] + arg3, local14 + 1) && Static271.method4002(local10 + 128 - 1, Static208.anIntArrayArrayArray11[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static271.method4002(local10 + 128 - 1, Static208.anIntArrayArrayArray11[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static271.method4002(local10 + 1, Static208.anIntArrayArrayArray11[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!qf;I)Lclient!qf;")
	public static Class146 method4257(@OriginalArg(0) Class146 arg0) {
		if (arg0.anInt4416 != -1) {
			return Static259.method3908(arg0.anInt4416);
		}
		@Pc(20) int local20 = arg0.anInt4355 >>> 16;
		@Pc(31) Class137 local31 = new Class137(Static69.aClass156_6);
		for (@Pc(36) Class1_Sub32 local36 = (Class1_Sub32) local31.method3329(); local36 != null; local36 = (Class1_Sub32) local31.method3328()) {
			if (local36.anInt5722 == local20) {
				return Static259.method3908((int) local36.aLong223);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIILclient!qf;)V")
	public static void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class146 arg5) {
		@Pc(14) Class81 local14 = Static50.method874(arg1);
		if (local14 == null || !local14.aBoolean166 || !local14.method1800()) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray186 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray186.length];
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				@Pc(50) int local50;
				if (Static101.anInt1895 == 4) {
					local50 = (int) Static2.aFloat1 & 0x7FF;
				} else {
					local50 = Static39.anInt794 + (int) Static2.aFloat1 & 0x7FF;
				}
				@Pc(63) int local63 = Class17.anIntArray24[local50];
				@Pc(67) int local67 = Class17.anIntArray22[local50];
				if (Static101.anInt1895 != 4) {
					local67 = local67 * 256 / (Static54.anInt1055 + 256);
					local63 = local63 * 256 / (Static54.anInt1055 + 256);
				}
				local32[local34 * 2] = (local63 * (arg3 + local14.anIntArray186[local34 * 2] * 4) + (local14.anIntArray186[local34 * 2 + 1] * 4 + arg4) * local67 >> 16) + arg0 + arg5.anInt4345 / 2;
				local32[local34 * 2 + 1] = arg5.anInt4371 / 2 + arg2 - ((arg4 + local14.anIntArray186[local34 * 2 + 1] * 4) * local63 - local67 * (arg3 + local14.anIntArray186[local34 * 2] * 4) >> 16);
			}
			if (Static291.aBoolean404) {
				Static226.method3534(local32, local14.anInt2191, local14.anInt2191 >>> 24, arg5.anIntArray362, arg5.anIntArray363);
			} else {
				Static65.method1104(local32, local14.anInt2191, local14.anInt2191 >>> 24, arg5.anIntArray362, arg5.anIntArray363);
			}
			for (local34 = 0; local34 < local32.length / 2 - 1; local34++) {
				if (Static291.aBoolean404) {
					Static133.method2173(local32[local34 * 2], local32[local34 * 2 + 1], local32[local34 * 2 + 2], local32[local34 * 2 + 1 + 2], local14.anInt2203, local14.anInt2203 >>> 24, (Class1_Sub1_Sub3_Sub1) arg5.method3519(false));
				} else {
					Static41.method750(local32[local34 * 2], local32[local34 * 2 + 1], local32[(local34 + 1) * 2], local32[(local34 + 1) * 2 + 1], local14.anInt2203, local14.anInt2203 >>> 24, arg5.anIntArray362, arg5.anIntArray363);
				}
			}
			if (Static291.aBoolean404) {
				Static133.method2173(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt2203, local14.anInt2203 >>> 24, (Class1_Sub1_Sub3_Sub1) arg5.method3519(false));
			} else {
				Static41.method750(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt2203, local14.anInt2203 >>> 24, arg5.anIntArray362, arg5.anIntArray363);
			}
		}
		@Pc(369) Class103 local369 = null;
		if (local14.anInt2196 != -1) {
			local369 = local14.method1805(false, false);
			if (local369 != null) {
				Static132.method2157(arg4, arg3, arg5, arg2, arg0, local369);
			}
		}
		if (local14.aString84 == null) {
			return;
		}
		local34 = 0;
		if (local369 != null) {
			local34 = local369.anInt5858;
		}
		@Pc(408) Class1_Sub1_Sub12 local408 = Static289.aClass1_Sub1_Sub12_4;
		if (local14.anInt2200 == 1) {
			local408 = Static233.aClass1_Sub1_Sub12_3;
		}
		if (local14.anInt2200 == 2) {
			local408 = Static245.aClass1_Sub1_Sub12_2;
		}
		Static232.method2986(arg4, local14.anInt2208, local34, local14.aString84, arg0, local408, arg3, arg5, arg2);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!qf;IIIILclient!in;I)V")
	public static void method4260(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub3 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(20) int local20;
		if (Static101.anInt1895 == 4) {
			local20 = (int) Static2.aFloat1 & 0x7FF;
		} else {
			local20 = Static39.anInt794 + (int) Static2.aFloat1 & 0x7FF;
		}
		@Pc(41) int local41 = Math.max(arg0.anInt4345 / 2, arg0.anInt4371 / 2) + 10;
		@Pc(49) int local49 = arg5 * arg5 + arg2 * arg2;
		if (local41 * local41 < local49) {
			return;
		}
		@Pc(64) int local64 = Class17.anIntArray22[local20];
		@Pc(68) int local68 = Class17.anIntArray24[local20];
		if (Static101.anInt1895 != 4) {
			local64 = local64 * 256 / (Static54.anInt1055 + 256);
			local68 = local68 * 256 / (Static54.anInt1055 + 256);
		}
		@Pc(102) int local102 = arg2 * local64 + local68 * arg5 >> 16;
		@Pc(113) int local113 = arg2 * local68 - local64 * arg5 >> 16;
		if (Static291.aBoolean404) {
			((Class1_Sub1_Sub3_Sub1) arg4).method4638(arg3 + arg0.anInt4345 / 2 + local102 - arg4.anInt5889 / 2, -(arg4.anInt5884 / 2) + arg1 + arg0.anInt4371 / 2 + -local113, (Class1_Sub1_Sub3_Sub1) arg0.method3519(false));
		} else {
			((Class1_Sub1_Sub3_Sub2) arg4).method3479(arg3 + arg0.anInt4345 / 2 + local102 - arg4.anInt5889 / 2, -(arg4.anInt5884 / 2) + arg0.anInt4371 / 2 + arg1 - local113, arg0.anIntArray362, arg0.anIntArray363);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!mn;I)V")
	public static void method4261(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub14 arg1) {
		Static198.anInt3991 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray287;
		@Pc(19) int[] local19 = arg1.anIntArray288;
		@Pc(21) byte local21 = -1;
		@Pc(625) int local625;
		try {
			@Pc(32) int local32 = 0;
			label4541: while (true) {
				local32++;
				if (arg0 < local32) {
					throw new RuntimeException("slow");
				}
				local7++;
				@Pc(47) int local47 = local16[local7];
				@Pc(636) int local636;
				@Pc(479) int local479;
				@Pc(431) String local431;
				if (local47 < 100) {
					if (local47 == 0) {
						Static26.anIntArray42[local5++] = local19[local7];
						continue;
					}
					@Pc(73) int local73;
					if (local47 == 1) {
						local73 = local19[local7];
						Static26.anIntArray42[local5++] = Static46.anIntArray78[local73];
						continue;
					}
					if (local47 == 2) {
						local73 = local19[local7];
						local5--;
						Static307.method4559(Static26.anIntArray42[local5], local73);
						continue;
					}
					if (local47 == 3) {
						Static27.aStringArray5[local13++] = arg1.aStringArray32[local7];
						continue;
					}
					if (local47 == 6) {
						local7 += local19[local7];
						continue;
					}
					if (local47 == 7) {
						local5 -= 2;
						if (Static26.anIntArray42[local5 + 1] != Static26.anIntArray42[local5]) {
							local7 += local19[local7];
						}
						continue;
					}
					if (local47 == 8) {
						local5 -= 2;
						if (Static26.anIntArray42[local5] == Static26.anIntArray42[local5 + 1]) {
							local7 += local19[local7];
						}
						continue;
					}
					if (local47 == 9) {
						local5 -= 2;
						if (Static26.anIntArray42[local5] < Static26.anIntArray42[local5 + 1]) {
							local7 += local19[local7];
						}
						continue;
					}
					if (local47 == 10) {
						local5 -= 2;
						if (Static26.anIntArray42[local5] > Static26.anIntArray42[local5 + 1]) {
							local7 += local19[local7];
						}
						continue;
					}
					if (local47 == 21) {
						if (Static198.anInt3991 == 0) {
							return;
						}
						@Pc(247) Class85 local247 = Static159.aClass85Array1[--Static198.anInt3991];
						arg1 = local247.aClass1_Sub1_Sub14_1;
						Static144.anIntArray235 = local247.anIntArray193;
						Static297.aStringArray46 = local247.aStringArray22;
						local19 = arg1.anIntArray288;
						local7 = local247.anInt2311;
						local16 = arg1.anIntArray287;
						continue;
					}
					if (local47 == 25) {
						local73 = local19[local7];
						Static26.anIntArray42[local5++] = Static298.method4459(local73);
						continue;
					}
					if (local47 == 27) {
						local73 = local19[local7];
						local5--;
						Static267.method3980(local73, Static26.anIntArray42[local5]);
						continue;
					}
					if (local47 == 31) {
						local5 -= 2;
						if (Static26.anIntArray42[local5] <= Static26.anIntArray42[local5 + 1]) {
							local7 += local19[local7];
						}
						continue;
					}
					if (local47 == 32) {
						local5 -= 2;
						if (Static26.anIntArray42[local5] >= Static26.anIntArray42[local5 + 1]) {
							local7 += local19[local7];
						}
						continue;
					}
					if (local47 == 33) {
						Static26.anIntArray42[local5++] = Static144.anIntArray235[local19[local7]];
						continue;
					}
					@Pc(376) int local376;
					if (local47 == 34) {
						local376 = local19[local7];
						local5--;
						Static144.anIntArray235[local376] = Static26.anIntArray42[local5];
						continue;
					}
					if (local47 == 35) {
						Static27.aStringArray5[local13++] = Static297.aStringArray46[local19[local7]];
						continue;
					}
					if (local47 == 36) {
						local376 = local19[local7];
						local13--;
						Static297.aStringArray46[local376] = Static27.aStringArray5[local13];
						continue;
					}
					if (local47 == 37) {
						local73 = local19[local7];
						local13 -= local73;
						local431 = Static288.method4282(local73, Static27.aStringArray5, local13);
						Static27.aStringArray5[local13++] = local431;
						continue;
					}
					if (local47 == 38) {
						local5--;
						continue;
					}
					if (local47 == 39) {
						local13--;
						continue;
					}
					if (local47 == 40) {
						local73 = local19[local7];
						@Pc(469) Class1_Sub1_Sub14 local469 = Static262.method1884(local73);
						@Pc(473) String[] local473 = new String[local469.anInt3632];
						@Pc(477) int[] local477 = new int[local469.anInt3626];
						for (local479 = 0; local479 < local469.anInt3634; local479++) {
							local477[local479] = Static26.anIntArray42[local5 + local479 - local469.anInt3634];
						}
						for (local479 = 0; local479 < local469.anInt3631; local479++) {
							local473[local479] = Static27.aStringArray5[local479 + local13 - local469.anInt3631];
						}
						local13 -= local469.anInt3631;
						local5 -= local469.anInt3634;
						@Pc(537) Class85 local537 = new Class85();
						local537.aClass1_Sub1_Sub14_1 = arg1;
						local537.anIntArray193 = Static144.anIntArray235;
						local537.aStringArray22 = Static297.aStringArray46;
						local537.anInt2311 = local7;
						if (Static159.aClass85Array1.length <= Static198.anInt3991) {
							throw new RuntimeException();
						}
						local7 = -1;
						arg1 = local469;
						Static159.aClass85Array1[Static198.anInt3991++] = local537;
						local16 = local469.anIntArray287;
						Static297.aStringArray46 = local473;
						local19 = local469.anIntArray288;
						Static144.anIntArray235 = local477;
						continue;
					}
					if (local47 == 42) {
						Static26.anIntArray42[local5++] = Static246.anIntArray443[local19[local7]];
						continue;
					}
					if (local47 == 43) {
						local73 = local19[local7];
						local5--;
						Static246.anIntArray443[local73] = Static26.anIntArray42[local5];
						Static30.method535(local73);
						continue;
					}
					if (local47 == 44) {
						local625 = local19[local7] & 0xFFFF;
						local73 = local19[local7] >> 16;
						local5--;
						local636 = Static26.anIntArray42[local5];
						if (local636 >= 0 && local636 <= 5000) {
							Static200.anIntArray515[local73] = local636;
							@Pc(656) byte local656 = -1;
							if (local625 == 105) {
								local656 = 0;
							}
							local479 = 0;
							while (true) {
								if (local636 <= local479) {
									continue label4541;
								}
								Static176.anIntArrayArray50[local73][local479] = local656;
								local479++;
							}
						}
						throw new RuntimeException();
					}
					if (local47 == 45) {
						local5--;
						local625 = Static26.anIntArray42[local5];
						local73 = local19[local7];
						if (local625 >= 0 && local625 < Static200.anIntArray515[local73]) {
							Static26.anIntArray42[local5++] = Static176.anIntArrayArray50[local73][local625];
							continue;
						}
						throw new RuntimeException();
					}
					if (local47 == 46) {
						local5 -= 2;
						local625 = Static26.anIntArray42[local5];
						local73 = local19[local7];
						if (local625 >= 0 && Static200.anIntArray515[local73] > local625) {
							Static176.anIntArrayArray50[local73][local625] = Static26.anIntArray42[local5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local47 == 47) {
						@Pc(772) String local772 = Static161.aStringArray28[local19[local7]];
						if (local772 == null) {
							local772 = "null";
						}
						Static27.aStringArray5[local13++] = local772;
						continue;
					}
					if (local47 == 48) {
						local73 = local19[local7];
						local13--;
						Static161.aStringArray28[local73] = Static27.aStringArray5[local13];
						Static261.method3920(local73);
						continue;
					}
					if (local47 == 51) {
						@Pc(815) Class156 local815 = arg1.aClass156Array1[local19[local7]];
						local5--;
						@Pc(825) Class1_Sub13 local825 = (Class1_Sub13) local815.method3821((long) Static26.anIntArray42[local5]);
						if (local825 != null) {
							local7 += local825.anInt2852;
						}
						continue;
					}
				}
				@Pc(844) boolean local844;
				if (local19[local7] == 1) {
					local844 = true;
				} else {
					local844 = false;
				}
				@Pc(875) int local875;
				@Pc(916) int local916;
				@Pc(1009) Class146 local1009;
				@Pc(1090) Class146 local1090;
				@Pc(888) Class146 local888;
				if (local47 < 300) {
					if (local47 == 100) {
						local5 -= 3;
						local625 = Static26.anIntArray42[local5];
						local636 = Static26.anIntArray42[local5 + 1];
						local875 = Static26.anIntArray42[local5 + 2];
						if (local636 == 0) {
							throw new RuntimeException();
						}
						local888 = Static259.method3908(local625);
						if (local888.aClass146Array2 == null) {
							local888.aClass146Array2 = new Class146[local875 + 1];
						}
						if (local888.aClass146Array2.length <= local875) {
							@Pc(914) Class146[] local914 = new Class146[local875 + 1];
							for (local916 = 0; local916 < local888.aClass146Array2.length; local916++) {
								local914[local916] = local888.aClass146Array2[local916];
							}
							local888.aClass146Array2 = local914;
						}
						if (local875 > 0 && local888.aClass146Array2[local875 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local875 - 1));
						}
						@Pc(963) Class146 local963 = new Class146();
						local963.anInt4416 = local963.anInt4355 = local888.anInt4355;
						local963.aBoolean299 = true;
						local963.anInt4370 = local636;
						local963.anInt4407 = local875;
						local888.aClass146Array2[local875] = local963;
						if (local844) {
							Static148.aClass146_10 = local963;
						} else {
							Static47.aClass146_2 = local963;
						}
						Static237.method2927(local888);
						continue;
					}
					@Pc(1035) Class146 local1035;
					if (local47 == 101) {
						local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
						if (local1009.anInt4407 == -1) {
							if (!local844) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1035 = Static259.method3908(local1009.anInt4355);
						local1035.aClass146Array2[local1009.anInt4407] = null;
						Static237.method2927(local1035);
						continue;
					}
					if (local47 == 102) {
						local5--;
						local1009 = Static259.method3908(Static26.anIntArray42[local5]);
						local1009.aClass146Array2 = null;
						Static237.method2927(local1009);
						continue;
					}
					if (local47 == 200) {
						local5 -= 2;
						local636 = Static26.anIntArray42[local5 + 1];
						local625 = Static26.anIntArray42[local5];
						local1090 = Static300.method4492(local636, local625);
						if (local1090 != null && local636 != -1) {
							Static26.anIntArray42[local5++] = 1;
							if (local844) {
								Static148.aClass146_10 = local1090;
							} else {
								Static47.aClass146_2 = local1090;
							}
							continue;
						}
						Static26.anIntArray42[local5++] = 0;
						continue;
					}
					if (local47 == 201) {
						local5--;
						local625 = Static26.anIntArray42[local5];
						local1035 = Static259.method3908(local625);
						if (local1035 == null) {
							Static26.anIntArray42[local5++] = 0;
						} else {
							Static26.anIntArray42[local5++] = 1;
							if (local844) {
								Static148.aClass146_10 = local1035;
							} else {
								Static47.aClass146_2 = local1035;
							}
						}
						continue;
					}
				} else {
					@Pc(4364) boolean local4364;
					if (local47 < 500) {
						if (local47 == 403) {
							local5 -= 2;
							local625 = Static26.anIntArray42[local5];
							local636 = Static26.anIntArray42[local5 + 1];
							for (local875 = 0; local875 < Static241.anIntArray437.length; local875++) {
								if (Static241.anIntArray437[local875] == local625) {
									Static229.aClass22_Sub3_Sub2_2.aClass119_2.method3021(local636, local875);
									continue label4541;
								}
							}
							local875 = 0;
							while (true) {
								if (local875 >= Static247.anIntArray445.length) {
									continue label4541;
								}
								if (Static247.anIntArray445[local875] == local625) {
									Static229.aClass22_Sub3_Sub2_2.aClass119_2.method3021(local636, local875);
									continue label4541;
								}
								local875++;
							}
						}
						if (local47 == 404) {
							local5 -= 2;
							local636 = Static26.anIntArray42[local5 + 1];
							local625 = Static26.anIntArray42[local5];
							Static229.aClass22_Sub3_Sub2_2.aClass119_2.method3023(local625, local636);
							continue;
						}
						if (local47 == 410) {
							local5--;
							local4364 = Static26.anIntArray42[local5] != 0;
							Static229.aClass22_Sub3_Sub2_2.aClass119_2.method3028(local4364);
							continue;
						}
					} else {
						@Pc(6553) boolean local6553;
						if (local47 >= 1000 && local47 < 1100 || local47 >= 2000 && local47 < 2100) {
							if (local47 < 2000) {
								local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
							} else {
								local5--;
								local1009 = Static259.method3908(Static26.anIntArray42[local5]);
								local47 -= 1000;
							}
							if (local47 == 1000) {
								local5 -= 4;
								local1009.anInt4413 = Static26.anIntArray42[local5];
								local1009.anInt4382 = Static26.anIntArray42[local5 + 1];
								local875 = Static26.anIntArray42[local5 + 3];
								if (local875 < 0) {
									local875 = 0;
								} else if (local875 > 5) {
									local875 = 5;
								}
								local636 = Static26.anIntArray42[local5 + 2];
								local1009.aByte21 = (byte) local875;
								if (local636 < 0) {
									local636 = 0;
								} else if (local636 > 5) {
									local636 = 5;
								}
								local1009.aByte23 = (byte) local636;
								Static237.method2927(local1009);
								Static66.method1112(local1009);
								if (local1009.anInt4407 == -1) {
									Static204.method3261(local1009.anInt4355);
								}
								continue;
							}
							if (local47 == 1001) {
								local5 -= 4;
								local1009.anInt4357 = Static26.anIntArray42[local5];
								local1009.anInt4391 = Static26.anIntArray42[local5 + 1];
								local1009.anInt4402 = 0;
								local1009.anInt4347 = 0;
								local636 = Static26.anIntArray42[local5 + 2];
								local875 = Static26.anIntArray42[local5 + 3];
								if (local875 < 0) {
									local875 = 0;
								} else if (local875 > 4) {
									local875 = 4;
								}
								if (local636 < 0) {
									local636 = 0;
								} else if (local636 > 4) {
									local636 = 4;
								}
								local1009.aByte24 = (byte) local636;
								local1009.aByte22 = (byte) local875;
								Static237.method2927(local1009);
								Static66.method1112(local1009);
								if (local1009.anInt4370 == 0) {
									Static45.method813(false, local1009);
								}
								continue;
							}
							if (local47 == 1003) {
								local5--;
								local6553 = Static26.anIntArray42[local5] == 1;
								if (local1009.aBoolean312 != local6553) {
									local1009.aBoolean312 = local6553;
									Static237.method2927(local1009);
								}
								if (local1009.anInt4407 == -1) {
									Static295.method4393(local1009.anInt4355);
								}
								continue;
							}
							if (local47 == 1004) {
								local5 -= 2;
								local1009.anInt4395 = Static26.anIntArray42[local5];
								local1009.anInt4379 = Static26.anIntArray42[local5 + 1];
								Static237.method2927(local1009);
								Static66.method1112(local1009);
								if (local1009.anInt4370 == 0) {
									Static45.method813(false, local1009);
								}
								continue;
							}
							if (local47 == 1005) {
								local5--;
								local1009.aBoolean303 = Static26.anIntArray42[local5] == 1;
								continue;
							}
						} else {
							@Pc(1635) String local1635;
							if (local47 >= 1100 && local47 < 1200 || local47 >= 2100 && local47 < 2200) {
								if (local47 < 2000) {
									local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
								} else {
									local5--;
									local1009 = Static259.method3908(Static26.anIntArray42[local5]);
									local47 -= 1000;
								}
								if (local47 == 1100) {
									local5 -= 2;
									local1009.anInt4341 = Static26.anIntArray42[local5];
									if (local1009.anInt4419 - local1009.anInt4345 < local1009.anInt4341) {
										local1009.anInt4341 = local1009.anInt4419 - local1009.anInt4345;
									}
									if (local1009.anInt4341 < 0) {
										local1009.anInt4341 = 0;
									}
									local1009.anInt4418 = Static26.anIntArray42[local5 + 1];
									if (local1009.anInt4418 > local1009.anInt4383 - local1009.anInt4371) {
										local1009.anInt4418 = local1009.anInt4383 - local1009.anInt4371;
									}
									if (local1009.anInt4418 < 0) {
										local1009.anInt4418 = 0;
									}
									Static237.method2927(local1009);
									if (local1009.anInt4407 == -1) {
										Static279.method4126(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1101) {
									local5--;
									local1009.anInt4422 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									if (local1009.anInt4407 == -1) {
										Static230.method3630(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1102) {
									local5--;
									local1009.aBoolean302 = Static26.anIntArray42[local5] == 1;
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1103) {
									local5--;
									local1009.anInt4372 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1104) {
									local5--;
									local1009.anInt4434 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1105) {
									local5--;
									local636 = Static26.anIntArray42[local5];
									if (local636 != local1009.anInt4406) {
										local1009.anInt4406 = local636;
										Static237.method2927(local1009);
									}
									if (local1009.anInt4407 == -1) {
										Static67.method1133(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1106) {
									local5--;
									local1009.anInt4363 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1107) {
									local5--;
									local1009.aBoolean314 = Static26.anIntArray42[local5] == 1;
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1108) {
									local1009.anInt4409 = 1;
									local5--;
									local1009.anInt4389 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									if (local1009.anInt4407 == -1) {
										Static248.method3824(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1109) {
									local5 -= 6;
									local1009.anInt4343 = Static26.anIntArray42[local5];
									local1009.anInt4432 = Static26.anIntArray42[local5 + 1];
									local1009.anInt4351 = Static26.anIntArray42[local5 + 2];
									local1009.anInt4400 = Static26.anIntArray42[local5 + 3];
									local1009.anInt4427 = Static26.anIntArray42[local5 + 4];
									local1009.anInt4366 = Static26.anIntArray42[local5 + 5];
									Static237.method2927(local1009);
									if (local1009.anInt4407 == -1) {
										Static89.method1325(local1009.anInt4355);
										Static261.method3919(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1110) {
									local5--;
									local636 = Static26.anIntArray42[local5];
									if (local1009.anInt4367 != local636) {
										local1009.anInt4388 = 0;
										local1009.anInt4353 = 0;
										local1009.anInt4367 = local636;
										local1009.anInt4408 = 1;
										Static237.method2927(local1009);
									}
									if (local1009.anInt4407 == -1) {
										Static295.method4389(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1111) {
									local5--;
									local1009.aBoolean308 = Static26.anIntArray42[local5] == 1;
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1112) {
									local13--;
									local1635 = Static27.aStringArray5[local13];
									if (!local1635.equals(local1009.aString146)) {
										local1009.aString146 = local1635;
										Static237.method2927(local1009);
									}
									if (local1009.anInt4407 == -1) {
										Static115.method1838(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1113) {
									local5--;
									local1009.anInt4431 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1114) {
									local5 -= 3;
									local1009.anInt4429 = Static26.anIntArray42[local5];
									local1009.anInt4430 = Static26.anIntArray42[local5 + 1];
									local1009.anInt4403 = Static26.anIntArray42[local5 + 2];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1115) {
									local5--;
									local1009.aBoolean305 = Static26.anIntArray42[local5] == 1;
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1116) {
									local5--;
									local1009.anInt4358 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1117) {
									local5--;
									local1009.anInt4381 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1118) {
									local5--;
									local1009.aBoolean301 = Static26.anIntArray42[local5] == 1;
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1119) {
									local5--;
									local1009.aBoolean307 = Static26.anIntArray42[local5] == 1;
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1120) {
									local5 -= 2;
									local1009.anInt4419 = Static26.anIntArray42[local5];
									local1009.anInt4383 = Static26.anIntArray42[local5 + 1];
									Static237.method2927(local1009);
									if (local1009.anInt4370 == 0) {
										Static45.method813(false, local1009);
									}
									continue;
								}
								if (local47 == 1121) {
									local5 -= 2;
									local1009.aShort24 = (short) Static26.anIntArray42[local5];
									local1009.aShort25 = (short) Static26.anIntArray42[local5 + 1];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1122) {
									local5--;
									local1009.aBoolean310 = Static26.anIntArray42[local5] == 1;
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1123) {
									local5--;
									local1009.anInt4366 = Static26.anIntArray42[local5];
									Static237.method2927(local1009);
									if (local1009.anInt4407 == -1) {
										Static89.method1325(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1124) {
									local5--;
									local636 = Static26.anIntArray42[local5];
									local1009.aBoolean309 = local636 == 1;
									Static237.method2927(local1009);
									continue;
								}
							} else if (local47 >= 1200 && local47 < 1300 || !(local47 < 2200 || local47 >= 2300)) {
								if (local47 >= 2000) {
									local47 -= 1000;
									local5--;
									local1009 = Static259.method3908(Static26.anIntArray42[local5]);
								} else {
									local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
								}
								Static237.method2927(local1009);
								if (local47 == 1200 || local47 == 1205 || local47 == 1208 || local47 == 1209) {
									local5 -= 2;
									local875 = Static26.anIntArray42[local5 + 1];
									local636 = Static26.anIntArray42[local5];
									if (local1009.anInt4407 == -1) {
										Static253.method3722(local1009.anInt4355);
										Static89.method1325(local1009.anInt4355);
										Static261.method3919(local1009.anInt4355);
									}
									if (local636 == -1) {
										local1009.anInt4409 = 1;
										local1009.anInt4405 = -1;
										local1009.anInt4389 = -1;
										continue;
									}
									local1009.anInt4405 = local636;
									if (local47 == 1208 || local47 == 1209) {
										local1009.aBoolean304 = true;
									} else {
										local1009.aBoolean304 = false;
									}
									local1009.anInt4344 = local875;
									@Pc(1319) Class149 local1319 = Static271.method4006(local636);
									local1009.anInt4351 = local1319.anInt4778;
									if (local47 == 1205) {
										local1009.aBoolean297 = false;
									} else {
										local1009.aBoolean297 = true;
									}
									local1009.anInt4343 = local1319.anInt4795;
									local1009.anInt4366 = local1319.anInt4767;
									local1009.anInt4427 = local1319.anInt4774;
									local1009.anInt4400 = local1319.anInt4812;
									local1009.anInt4432 = local1319.anInt4820;
									if (local1009.anInt4402 > 0) {
										local1009.anInt4366 = local1009.anInt4366 * 32 / local1009.anInt4402;
									} else if (local1009.anInt4357 > 0) {
										local1009.anInt4366 = local1009.anInt4366 * 32 / local1009.anInt4357;
									}
									continue;
								}
								if (local47 == 1201) {
									local1009.anInt4409 = 2;
									local5--;
									local1009.anInt4389 = Static26.anIntArray42[local5];
									if (local1009.anInt4407 == -1) {
										Static248.method3824(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1202) {
									local1009.anInt4409 = 3;
									local1009.anInt4389 = Static229.aClass22_Sub3_Sub2_2.aClass119_2.method3024();
									if (local1009.anInt4407 == -1) {
										Static248.method3824(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1203) {
									local1009.anInt4409 = 6;
									local5--;
									local1009.anInt4389 = Static26.anIntArray42[local5];
									if (local1009.anInt4407 == -1) {
										Static248.method3824(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1204) {
									local1009.anInt4409 = 5;
									local5--;
									local1009.anInt4389 = Static26.anIntArray42[local5];
									if (local1009.anInt4407 == -1) {
										Static248.method3824(local1009.anInt4355);
									}
									continue;
								}
								if (local47 == 1206) {
									local5 -= 4;
									local1009.anInt4365 = Static26.anIntArray42[local5];
									local1009.anInt4374 = Static26.anIntArray42[local5 + 1];
									local1009.anInt4404 = Static26.anIntArray42[local5 + 2];
									local1009.anInt4393 = Static26.anIntArray42[local5 + 3];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1207) {
									local5 -= 2;
									local1009.anInt4378 = Static26.anIntArray42[local5];
									local1009.anInt4377 = Static26.anIntArray42[local5 + 1];
									Static237.method2927(local1009);
									continue;
								}
								if (local47 == 1211) {
									local1009.anInt4397 = 0;
									local1009.anInt4409 = 5;
									local1009.anInt4389 = 2047;
									if (local1009.anInt4407 == -1) {
										Static248.method3824(local1009.anInt4355);
									}
									continue;
								}
							} else if (local47 >= 1300 && local47 < 1400 || local47 >= 2300 && local47 < 2400) {
								if (local47 >= 2000) {
									local47 -= 1000;
									local5--;
									local1009 = Static259.method3908(Static26.anIntArray42[local5]);
								} else {
									local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
								}
								if (local47 == 1300) {
									local5--;
									local636 = Static26.anIntArray42[local5] - 1;
									if (local636 >= 0 && local636 <= 9) {
										local13--;
										local1009.method3522(Static27.aStringArray5[local13], local636);
										continue;
									}
									local13--;
									continue;
								}
								if (local47 == 1301) {
									local5 -= 2;
									local636 = Static26.anIntArray42[local5];
									local875 = Static26.anIntArray42[local5 + 1];
									local1009.aClass146_14 = Static300.method4492(local875, local636);
									continue;
								}
								if (local47 == 1302) {
									local5--;
									local1009.aBoolean306 = Static26.anIntArray42[local5] == 1;
									continue;
								}
								if (local47 == 1303) {
									local5--;
									local1009.anInt4399 = Static26.anIntArray42[local5];
									continue;
								}
								if (local47 == 1304) {
									local5--;
									local1009.anInt4368 = Static26.anIntArray42[local5];
									continue;
								}
								if (local47 == 1305) {
									local13--;
									local1009.aString144 = Static27.aStringArray5[local13];
									continue;
								}
								if (local47 == 1306) {
									local13--;
									local1009.aString142 = Static27.aStringArray5[local13];
									continue;
								}
								if (local47 == 1307) {
									local1009.aStringArray36 = null;
									continue;
								}
								if (local47 == 1308) {
									local5--;
									local1009.anInt4384 = Static26.anIntArray42[local5];
									local5--;
									local1009.anInt4394 = Static26.anIntArray42[local5];
									continue;
								}
								if (local47 == 1309) {
									local5--;
									local636 = Static26.anIntArray42[local5];
									local5--;
									local875 = Static26.anIntArray42[local5];
									if (local875 >= 1 && local875 <= 10) {
										local1009.method3525(local875 - 1, local636);
									}
									continue;
								}
								if (local47 == 1310) {
									local13--;
									local1009.aString145 = Static27.aStringArray5[local13];
									continue;
								}
							} else {
								@Pc(1698) int local1698;
								if (local47 >= 1400 && local47 < 1500 || local47 >= 2400 && local47 < 2500) {
									if (local47 >= 2000) {
										local47 -= 1000;
										local5--;
										local1009 = Static259.method3908(Static26.anIntArray42[local5]);
									} else {
										local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
									}
									local13--;
									local1635 = Static27.aStringArray5[local13];
									@Pc(1637) int[] local1637 = null;
									if (local1635.length() > 0 && local1635.charAt(local1635.length() - 1) == 'Y') {
										local5--;
										local479 = Static26.anIntArray42[local5];
										if (local479 > 0) {
											local1637 = new int[local479];
											while (local479-- > 0) {
												local5--;
												local1637[local479] = Static26.anIntArray42[local5];
											}
										}
										local1635 = local1635.substring(0, local1635.length() - 1);
									}
									@Pc(1693) Object[] local1693 = new Object[local1635.length() + 1];
									for (local1698 = local1693.length - 1; local1698 >= 1; local1698--) {
										if (local1635.charAt(local1698 - 1) == 's') {
											local13--;
											local1693[local1698] = Static27.aStringArray5[local13];
										} else {
											local5--;
											local1693[local1698] = Integer.valueOf(Static26.anIntArray42[local5]);
										}
									}
									local5--;
									local1698 = Static26.anIntArray42[local5];
									if (local1698 == -1) {
										local1693 = null;
									} else {
										local1693[0] = Integer.valueOf(local1698);
									}
									if (local47 == 1400) {
										local1009.anObjectArray22 = local1693;
									} else if (local47 == 1401) {
										local1009.anObjectArray19 = local1693;
									} else if (local47 == 1402) {
										local1009.anObjectArray31 = local1693;
									} else if (local47 == 1403) {
										local1009.anObjectArray2 = local1693;
									} else if (local47 == 1404) {
										local1009.anObjectArray17 = local1693;
									} else if (local47 == 1405) {
										local1009.anObjectArray6 = local1693;
									} else if (local47 == 1406) {
										local1009.anObjectArray30 = local1693;
									} else if (local47 == 1407) {
										local1009.anIntArray356 = local1637;
										local1009.anObjectArray15 = local1693;
									} else if (local47 == 1408) {
										local1009.anObjectArray11 = local1693;
									} else if (local47 == 1409) {
										local1009.anObjectArray29 = local1693;
									} else if (local47 == 1410) {
										local1009.anObjectArray18 = local1693;
									} else if (local47 == 1411) {
										local1009.anObjectArray5 = local1693;
									} else if (local47 == 1412) {
										local1009.anObjectArray25 = local1693;
									} else if (local47 == 1414) {
										local1009.anObjectArray7 = local1693;
										local1009.anIntArray369 = local1637;
									} else if (local47 == 1415) {
										local1009.anIntArray366 = local1637;
										local1009.anObjectArray9 = local1693;
									} else if (local47 == 1416) {
										local1009.anObjectArray26 = local1693;
									} else if (local47 == 1417) {
										local1009.anObjectArray3 = local1693;
									} else if (local47 == 1418) {
										local1009.anObjectArray27 = local1693;
									} else if (local47 == 1419) {
										local1009.anObjectArray24 = local1693;
									} else if (local47 == 1420) {
										local1009.anObjectArray21 = local1693;
									} else if (local47 == 1421) {
										local1009.anObjectArray13 = local1693;
									} else if (local47 == 1422) {
										local1009.anObjectArray4 = local1693;
									} else if (local47 == 1423) {
										local1009.anObjectArray10 = local1693;
									} else if (local47 == 1424) {
										local1009.anObjectArray20 = local1693;
									} else if (local47 == 1425) {
										local1009.anObjectArray28 = local1693;
									} else if (local47 == 1426) {
										local1009.anObjectArray16 = local1693;
									} else if (local47 == 1427) {
										local1009.anObjectArray14 = local1693;
									} else if (local47 == 1428) {
										local1009.anObjectArray12 = local1693;
										local1009.anIntArray367 = local1637;
									} else if (local47 == 1429) {
										local1009.anIntArray365 = local1637;
										local1009.anObjectArray23 = local1693;
									}
									local1009.aBoolean313 = true;
									continue;
								}
								if (local47 < 1600) {
									local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
									if (local47 == 1500) {
										Static26.anIntArray42[local5++] = local1009.anInt4340;
										continue;
									}
									if (local47 == 1501) {
										Static26.anIntArray42[local5++] = local1009.anInt4385;
										continue;
									}
									if (local47 == 1502) {
										Static26.anIntArray42[local5++] = local1009.anInt4345;
										continue;
									}
									if (local47 == 1503) {
										Static26.anIntArray42[local5++] = local1009.anInt4371;
										continue;
									}
									if (local47 == 1504) {
										Static26.anIntArray42[local5++] = local1009.aBoolean312 ? 1 : 0;
										continue;
									}
									if (local47 == 1505) {
										Static26.anIntArray42[local5++] = local1009.anInt4416;
										continue;
									}
								} else if (local47 < 1700) {
									local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
									if (local47 == 1600) {
										Static26.anIntArray42[local5++] = local1009.anInt4341;
										continue;
									}
									if (local47 == 1601) {
										Static26.anIntArray42[local5++] = local1009.anInt4418;
										continue;
									}
									if (local47 == 1602) {
										Static27.aStringArray5[local13++] = local1009.aString146;
										continue;
									}
									if (local47 == 1603) {
										Static26.anIntArray42[local5++] = local1009.anInt4419;
										continue;
									}
									if (local47 == 1604) {
										Static26.anIntArray42[local5++] = local1009.anInt4383;
										continue;
									}
									if (local47 == 1605) {
										Static26.anIntArray42[local5++] = local1009.anInt4366;
										continue;
									}
									if (local47 == 1606) {
										Static26.anIntArray42[local5++] = local1009.anInt4351;
										continue;
									}
									if (local47 == 1607) {
										Static26.anIntArray42[local5++] = local1009.anInt4427;
										continue;
									}
									if (local47 == 1608) {
										Static26.anIntArray42[local5++] = local1009.anInt4400;
										continue;
									}
									if (local47 == 1609) {
										Static26.anIntArray42[local5++] = local1009.anInt4372;
										continue;
									}
									if (local47 == 1610) {
										Static26.anIntArray42[local5++] = local1009.anInt4343;
										continue;
									}
									if (local47 == 1611) {
										Static26.anIntArray42[local5++] = local1009.anInt4432;
										continue;
									}
									if (local47 == 1612) {
										Static26.anIntArray42[local5++] = local1009.anInt4406;
										continue;
									}
								} else if (local47 < 1800) {
									local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
									if (local47 == 1700) {
										Static26.anIntArray42[local5++] = local1009.anInt4405;
										continue;
									}
									if (local47 == 1701) {
										if (local1009.anInt4405 == -1) {
											Static26.anIntArray42[local5++] = 0;
										} else {
											Static26.anIntArray42[local5++] = local1009.anInt4344;
										}
										continue;
									}
									if (local47 == 1702) {
										Static26.anIntArray42[local5++] = local1009.anInt4407;
										continue;
									}
								} else if (local47 < 1900) {
									local1009 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
									if (local47 == 1800) {
										Static26.anIntArray42[local5++] = Static36.method643(local1009).method3233();
										continue;
									}
									if (local47 == 1801) {
										local5--;
										local636 = Static26.anIntArray42[local5];
										local636--;
										if (local1009.aStringArray36 != null && local1009.aStringArray36.length > local636 && local1009.aStringArray36[local636] != null) {
											Static27.aStringArray5[local13++] = local1009.aStringArray36[local636];
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										continue;
									}
									if (local47 == 1802) {
										if (local1009.aString144 == null) {
											Static27.aStringArray5[local13++] = "";
										} else {
											Static27.aStringArray5[local13++] = local1009.aString144;
										}
										continue;
									}
								} else if (local47 < 2600) {
									local5--;
									local1009 = Static259.method3908(Static26.anIntArray42[local5]);
									if (local47 == 2500) {
										Static26.anIntArray42[local5++] = local1009.anInt4340;
										continue;
									}
									if (local47 == 2501) {
										Static26.anIntArray42[local5++] = local1009.anInt4385;
										continue;
									}
									if (local47 == 2502) {
										Static26.anIntArray42[local5++] = local1009.anInt4345;
										continue;
									}
									if (local47 == 2503) {
										Static26.anIntArray42[local5++] = local1009.anInt4371;
										continue;
									}
									if (local47 == 2504) {
										Static26.anIntArray42[local5++] = local1009.aBoolean312 ? 1 : 0;
										continue;
									}
									if (local47 == 2505) {
										Static26.anIntArray42[local5++] = local1009.anInt4416;
										continue;
									}
								} else if (local47 < 2700) {
									local5--;
									local1009 = Static259.method3908(Static26.anIntArray42[local5]);
									if (local47 == 2600) {
										Static26.anIntArray42[local5++] = local1009.anInt4341;
										continue;
									}
									if (local47 == 2601) {
										Static26.anIntArray42[local5++] = local1009.anInt4418;
										continue;
									}
									if (local47 == 2602) {
										Static27.aStringArray5[local13++] = local1009.aString146;
										continue;
									}
									if (local47 == 2603) {
										Static26.anIntArray42[local5++] = local1009.anInt4419;
										continue;
									}
									if (local47 == 2604) {
										Static26.anIntArray42[local5++] = local1009.anInt4383;
										continue;
									}
									if (local47 == 2605) {
										Static26.anIntArray42[local5++] = local1009.anInt4366;
										continue;
									}
									if (local47 == 2606) {
										Static26.anIntArray42[local5++] = local1009.anInt4351;
										continue;
									}
									if (local47 == 2607) {
										Static26.anIntArray42[local5++] = local1009.anInt4427;
										continue;
									}
									if (local47 == 2608) {
										Static26.anIntArray42[local5++] = local1009.anInt4400;
										continue;
									}
									if (local47 == 2609) {
										Static26.anIntArray42[local5++] = local1009.anInt4372;
										continue;
									}
									if (local47 == 2610) {
										Static26.anIntArray42[local5++] = local1009.anInt4343;
										continue;
									}
									if (local47 == 2611) {
										Static26.anIntArray42[local5++] = local1009.anInt4432;
										continue;
									}
									if (local47 == 2612) {
										Static26.anIntArray42[local5++] = local1009.anInt4406;
										continue;
									}
								} else if (local47 < 2800) {
									if (local47 == 2700) {
										local5--;
										local1009 = Static259.method3908(Static26.anIntArray42[local5]);
										Static26.anIntArray42[local5++] = local1009.anInt4405;
										continue;
									}
									if (local47 == 2701) {
										local5--;
										local1009 = Static259.method3908(Static26.anIntArray42[local5]);
										if (local1009.anInt4405 == -1) {
											Static26.anIntArray42[local5++] = 0;
										} else {
											Static26.anIntArray42[local5++] = local1009.anInt4344;
										}
										continue;
									}
									if (local47 == 2702) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										@Pc(13490) Class1_Sub32 local13490 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local625);
										if (local13490 == null) {
											Static26.anIntArray42[local5++] = 0;
										} else {
											Static26.anIntArray42[local5++] = 1;
										}
										continue;
									}
									if (local47 == 2703) {
										local5--;
										local1009 = Static259.method3908(Static26.anIntArray42[local5]);
										if (local1009.aClass146Array2 == null) {
											Static26.anIntArray42[local5++] = 0;
											continue;
										}
										local636 = local1009.aClass146Array2.length;
										for (local875 = 0; local875 < local1009.aClass146Array2.length; local875++) {
											if (local1009.aClass146Array2[local875] == null) {
												local636 = local875;
												break;
											}
										}
										Static26.anIntArray42[local5++] = local636;
										continue;
									}
									if (local47 == 2704 || local47 == 2705) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										@Pc(13589) Class1_Sub32 local13589 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local625);
										if (local13589 != null && local636 == local13589.anInt5722) {
											Static26.anIntArray42[local5++] = 1;
										} else {
											Static26.anIntArray42[local5++] = 0;
										}
										continue;
									}
								} else if (local47 < 2900) {
									local5--;
									local1009 = Static259.method3908(Static26.anIntArray42[local5]);
									if (local47 == 2800) {
										Static26.anIntArray42[local5++] = Static36.method643(local1009).method3233();
										continue;
									}
									if (local47 == 2801) {
										local5--;
										local636 = Static26.anIntArray42[local5];
										local636--;
										if (local1009.aStringArray36 != null && local1009.aStringArray36.length > local636 && local1009.aStringArray36[local636] != null) {
											Static27.aStringArray5[local13++] = local1009.aStringArray36[local636];
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										continue;
									}
									if (local47 == 2802) {
										if (local1009.aString144 == null) {
											Static27.aStringArray5[local13++] = "";
										} else {
											Static27.aStringArray5[local13++] = local1009.aString144;
										}
										continue;
									}
								} else if (local47 < 3200) {
									if (local47 == 3100) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static199.method3219(local431);
										continue;
									}
									if (local47 == 3101) {
										local5 -= 2;
										Static203.method3251(Static26.anIntArray42[local5 + 1], Static26.anIntArray42[local5], Static229.aClass22_Sub3_Sub2_2);
										continue;
									}
									if (local47 == 3103) {
										Static29.method526();
										continue;
									}
									if (local47 == 3104) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										local636 = 0;
										if (Static89.method1322(local431)) {
											local636 = Static199.method3218(local431);
										}
										Static137.aClass1_Sub14_Sub1_6.method2661(86);
										Static137.aClass1_Sub14_Sub1_6.method2630(local636);
										continue;
									}
									if (local47 == 3105) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static137.aClass1_Sub14_Sub1_6.method2661(123);
										Static137.aClass1_Sub14_Sub1_6.method2631(local431.length() + 1);
										Static137.aClass1_Sub14_Sub1_6.method2619(local431);
										continue;
									}
									if (local47 == 3106) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static137.aClass1_Sub14_Sub1_6.method2661(107);
										Static137.aClass1_Sub14_Sub1_6.method2631(local431.length() + 1);
										Static137.aClass1_Sub14_Sub1_6.method2619(local431);
										continue;
									}
									if (local47 == 3107) {
										local13--;
										local1635 = Static27.aStringArray5[local13];
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static144.method2293(local625, local1635);
										continue;
									}
									if (local47 == 3108) {
										local5 -= 3;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										local875 = Static26.anIntArray42[local5 + 2];
										local888 = Static259.method3908(local875);
										Static67.method1134(local888, local636, local625);
										continue;
									}
									if (local47 == 3109) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										local1090 = local844 ? Static148.aClass146_10 : Static47.aClass146_2;
										Static67.method1134(local1090, local636, local625);
										continue;
									}
									if (local47 == 3110) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static137.aClass1_Sub14_Sub1_6.method2661(191);
										Static137.aClass1_Sub14_Sub1_6.method2637(local625);
										continue;
									}
								} else if (local47 < 3300) {
									if (local47 == 3200) {
										local5 -= 3;
										Static81.method1230(Static26.anIntArray42[local5], Static26.anIntArray42[local5 + 2], 255, Static26.anIntArray42[local5 + 1]);
										continue;
									}
									if (local47 == 3201) {
										local5--;
										Static271.method4010(Static26.anIntArray42[local5], 255);
										continue;
									}
									if (local47 == 3202) {
										local5 -= 2;
										Static206.method3276(255, Static26.anIntArray42[local5], Static26.anIntArray42[local5 + 1]);
										continue;
									}
								} else if (local47 < 3400) {
									if (local47 == 3300) {
										Static26.anIntArray42[local5++] = Static37.anInt757;
										continue;
									}
									if (local47 == 3301) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = Static44.method782(local636, local625);
										continue;
									}
									if (local47 == 3302) {
										local5 -= 2;
										local636 = Static26.anIntArray42[local5 + 1];
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static171.method2884(local625, local636);
										continue;
									}
									if (local47 == 3303) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = Static20.method402(local636, local625);
										continue;
									}
									if (local47 == 3304) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static314.method4650(local625).anInt790;
										continue;
									}
									if (local47 == 3305) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static217.anIntArray342[local625];
										continue;
									}
									if (local47 == 3306) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static97.anIntArray146[local625];
										continue;
									}
									if (local47 == 3307) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static31.anIntArray48[local625];
										continue;
									}
									if (local47 == 3308) {
										local625 = Static295.anInt5586;
										local636 = (Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7) + Static290.anInt5497;
										local875 = Static118.anInt2409 + (Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7);
										Static26.anIntArray42[local5++] = local875 + (local636 << 14) + (local625 << 28);
										continue;
									}
									if (local47 == 3309) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = local625 >> 14 & 0x3FFF;
										continue;
									}
									if (local47 == 3310) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = local625 >> 28;
										continue;
									}
									if (local47 == 3311) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = local625 & 0x3FFF;
										continue;
									}
									if (local47 == 3312) {
										Static26.anIntArray42[local5++] = Static235.aBoolean341 ? 1 : 0;
										continue;
									}
									if (local47 == 3313) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5] + 32768;
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = Static44.method782(local636, local625);
										continue;
									}
									if (local47 == 3314) {
										local5 -= 2;
										local636 = Static26.anIntArray42[local5 + 1];
										local625 = Static26.anIntArray42[local5] + 32768;
										Static26.anIntArray42[local5++] = Static171.method2884(local625, local636);
										continue;
									}
									if (local47 == 3315) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5] + 32768;
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = Static20.method402(local636, local625);
										continue;
									}
									if (local47 == 3316) {
										if (Static95.anInt5251 >= 2) {
											Static26.anIntArray42[local5++] = Static95.anInt5251;
										} else {
											Static26.anIntArray42[local5++] = 0;
										}
										continue;
									}
									if (local47 == 3317) {
										Static26.anIntArray42[local5++] = Static122.anInt2466;
										continue;
									}
									if (local47 == 3318) {
										Static26.anIntArray42[local5++] = Static108.anInt2138;
										continue;
									}
									if (local47 == 3321) {
										Static26.anIntArray42[local5++] = Static54.anInt1049;
										continue;
									}
									if (local47 == 3322) {
										Static26.anIntArray42[local5++] = Static224.anInt4401;
										continue;
									}
									if (local47 == 3323) {
										if (Static296.anInt5596 >= 5 && Static296.anInt5596 <= 9) {
											Static26.anIntArray42[local5++] = 1;
											continue;
										}
										Static26.anIntArray42[local5++] = 0;
										continue;
									}
									if (local47 == 3324) {
										if (Static296.anInt5596 >= 5 && Static296.anInt5596 <= 9) {
											Static26.anIntArray42[local5++] = Static296.anInt5596;
											continue;
										}
										Static26.anIntArray42[local5++] = 0;
										continue;
									}
									if (local47 == 3325) {
										Static26.anIntArray42[local5++] = Static302.aBoolean420 ? 1 : 0;
										continue;
									}
									if (local47 == 3326) {
										Static26.anIntArray42[local5++] = Static229.aClass22_Sub3_Sub2_2.anInt4674;
										continue;
									}
									if (local47 == 3327) {
										Static26.anIntArray42[local5++] = Static229.aClass22_Sub3_Sub2_2.aClass119_2.aBoolean258 ? 1 : 0;
										continue;
									}
									if (local47 == 3328) {
										Static26.anIntArray42[local5++] = Static310.aBoolean108 && !Static241.aBoolean346 ? 1 : 0;
										continue;
									}
									if (local47 == 3329) {
										Static26.anIntArray42[local5++] = Static206.aBoolean280 ? 1 : 0;
										continue;
									}
									if (local47 == 3330) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static252.method3848(local625);
										continue;
									}
									if (local47 == 3331) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = Static257.method3897(local625, local636, false);
										continue;
									}
									if (local47 == 3332) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = Static257.method3897(local625, local636, true);
										continue;
									}
									if (local47 == 3333) {
										Static26.anIntArray42[local5++] = Static251.anInt4923;
										continue;
									}
									if (local47 == 3335) {
										Static26.anIntArray42[local5++] = Static117.anInt2307;
										continue;
									}
									if (local47 == 3336) {
										local5 -= 4;
										local636 = Static26.anIntArray42[local5 + 1];
										local479 = Static26.anIntArray42[local5 + 3];
										local625 = Static26.anIntArray42[local5];
										local875 = Static26.anIntArray42[local5 + 2];
										local625 += local636 << 14;
										local625 += local875 << 28;
										local625 += local479;
										Static26.anIntArray42[local5++] = local625;
										continue;
									}
									if (local47 == 3337) {
										Static26.anIntArray42[local5++] = Static119.anInt5881;
										continue;
									}
								} else if (local47 < 3500) {
									@Pc(13136) Class1_Sub1_Sub22 local13136;
									if (local47 == 3400) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										local13136 = Static130.method2050(local625);
										if (local13136.aChar5 == 's') {
										}
										Static27.aStringArray5[local13++] = local13136.method4177(local636);
										continue;
									}
									if (local47 == 3408) {
										local5 -= 4;
										local636 = Static26.anIntArray42[local5 + 1];
										local875 = Static26.anIntArray42[local5 + 2];
										local479 = Static26.anIntArray42[local5 + 3];
										local625 = Static26.anIntArray42[local5];
										@Pc(13182) Class1_Sub1_Sub22 local13182 = Static130.method2050(local875);
										if (local13182.aChar4 == local625 && local636 == local13182.aChar5) {
											if (local636 == 115) {
												Static27.aStringArray5[local13++] = local13182.method4177(local479);
											} else {
												Static26.anIntArray42[local5++] = local13182.method4173(local479);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local47 == 3409) {
										local5 -= 3;
										local625 = Static26.anIntArray42[local5];
										local875 = Static26.anIntArray42[local5 + 2];
										local636 = Static26.anIntArray42[local5 + 1];
										if (local636 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(13261) Class1_Sub1_Sub22 local13261 = Static130.method2050(local636);
										if (local13261.aChar5 != local625) {
											throw new RuntimeException("C3409-1");
										}
										Static26.anIntArray42[local5++] = local13261.method4176(local875) ? 1 : 0;
										continue;
									}
									if (local47 == 3410) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										local13--;
										local1635 = Static27.aStringArray5[local13];
										if (local625 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local13136 = Static130.method2050(local625);
										if (local13136.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static26.anIntArray42[local5++] = local13136.method4175(local1635) ? 1 : 0;
										continue;
									}
									if (local47 == 3411) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										@Pc(13352) Class1_Sub1_Sub22 local13352 = Static130.method2050(local625);
										Static26.anIntArray42[local5++] = local13352.aClass156_26.method3825();
										continue;
									}
								} else if (local47 < 3700) {
									if (local47 == 3600) {
										if (Static84.anInt1525 == 0) {
											Static26.anIntArray42[local5++] = -2;
										} else if (Static84.anInt1525 == 1) {
											Static26.anIntArray42[local5++] = -1;
										} else {
											Static26.anIntArray42[local5++] = Static175.anInt3635;
										}
										continue;
									}
									if (local47 == 3601) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static84.anInt1525 == 2 && Static175.anInt3635 > local625) {
											Static27.aStringArray5[local13++] = Static279.aStringArray44[local625];
											if (Static263.aStringArray43[local625] == null) {
												Static27.aStringArray5[local13++] = "";
											} else {
												Static27.aStringArray5[local13++] = Static263.aStringArray43[local625];
											}
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										Static27.aStringArray5[local13++] = "";
										continue;
									}
									if (local47 == 3602) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static84.anInt1525 == 2 && Static175.anInt3635 > local625) {
											Static26.anIntArray42[local5++] = Static112.anIntArray187[local625];
											continue;
										}
										Static26.anIntArray42[local5++] = 0;
										continue;
									}
									if (local47 == 3603) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static84.anInt1525 == 2 && Static175.anInt3635 > local625) {
											Static26.anIntArray42[local5++] = Static82.anIntArray124[local625];
											continue;
										}
										Static26.anIntArray42[local5++] = 0;
										continue;
									}
									if (local47 == 3604) {
										local5--;
										local636 = Static26.anIntArray42[local5];
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static251.method3841(local636, local431);
										continue;
									}
									if (local47 == 3605) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static45.method809(local431);
										continue;
									}
									if (local47 == 3606) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static93.method1374(local431);
										continue;
									}
									if (local47 == 3607) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static289.method4288(local431, false);
										continue;
									}
									if (local47 == 3608) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static257.method3900(local431);
										continue;
									}
									if (local47 == 3609) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										if (local431.startsWith("<img=0>") || local431.startsWith("<img=1>")) {
											local431 = local431.substring(7);
										}
										Static26.anIntArray42[local5++] = Static99.method1485(local431) ? 1 : 0;
										continue;
									}
									if (local47 == 3610) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static84.anInt1525 == 2 && Static175.anInt3635 > local625) {
											Static27.aStringArray5[local13++] = Static313.aStringArray47[local625];
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										continue;
									}
									if (local47 == 3611) {
										if (Static295.aString189 == null) {
											Static27.aStringArray5[local13++] = "";
										} else {
											Static27.aStringArray5[local13++] = Static197.method3204(Static295.aString189);
										}
										continue;
									}
									if (local47 == 3612) {
										if (Static295.aString189 == null) {
											Static26.anIntArray42[local5++] = 0;
										} else {
											Static26.anIntArray42[local5++] = Static183.anInt3703;
										}
										continue;
									}
									if (local47 == 3613) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static295.aString189 != null && Static183.anInt3703 > local625) {
											Static27.aStringArray5[local13++] = Static208.aClass31Array1[local625].aString21;
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										continue;
									}
									if (local47 == 3614) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static295.aString189 != null && Static183.anInt3703 > local625) {
											Static26.anIntArray42[local5++] = Static208.aClass31Array1[local625].anInt584;
											continue;
										}
										Static26.anIntArray42[local5++] = 0;
										continue;
									}
									if (local47 == 3615) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static295.aString189 != null && Static183.anInt3703 > local625) {
											Static26.anIntArray42[local5++] = Static208.aClass31Array1[local625].aByte1;
											continue;
										}
										Static26.anIntArray42[local5++] = 0;
										continue;
									}
									if (local47 == 3616) {
										Static26.anIntArray42[local5++] = Static210.aByte20;
										continue;
									}
									if (local47 == 3617) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static279.method4125(local431);
										continue;
									}
									if (local47 == 3618) {
										Static26.anIntArray42[local5++] = Static140.aByte9;
										continue;
									}
									if (local47 == 3619) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static162.method2754(local431);
										continue;
									}
									if (local47 == 3620) {
										Static106.method1769();
										continue;
									}
									if (local47 == 3621) {
										if (Static84.anInt1525 == 0) {
											Static26.anIntArray42[local5++] = -1;
										} else {
											Static26.anIntArray42[local5++] = Static268.anInt5931;
										}
										continue;
									}
									if (local47 == 3622) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static84.anInt1525 != 0 && Static268.anInt5931 > local625) {
											Static27.aStringArray5[local13++] = Static57.aStringArray8[local625];
											if (Static172.aStringArray3[local625] == null) {
												Static27.aStringArray5[local13++] = "";
											} else {
												Static27.aStringArray5[local13++] = Static172.aStringArray3[local625];
											}
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										Static27.aStringArray5[local13++] = "";
										continue;
									}
									if (local47 == 3623) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										if (local431.startsWith("<img=0>") || local431.startsWith("<img=1>")) {
											local431 = local431.substring(7);
										}
										Static26.anIntArray42[local5++] = Static15.method209(local431) ? 1 : 0;
										continue;
									}
									if (local47 == 3624) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static208.aClass31Array1 != null && Static183.anInt3703 > local625 && Static208.aClass31Array1[local625].aString20.equalsIgnoreCase(Static229.aClass22_Sub3_Sub2_2.aString153)) {
											Static26.anIntArray42[local5++] = 1;
											continue;
										}
										Static26.anIntArray42[local5++] = 0;
										continue;
									}
									if (local47 == 3625) {
										if (Static104.aString70 == null) {
											Static27.aStringArray5[local13++] = "";
										} else {
											Static27.aStringArray5[local13++] = Static104.aString70;
										}
										continue;
									}
									if (local47 == 3626) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static295.aString189 != null && Static183.anInt3703 > local625) {
											Static27.aStringArray5[local13++] = Static208.aClass31Array1[local625].aString19;
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										continue;
									}
									if (local47 == 3627) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static84.anInt1525 == 2 && local625 >= 0 && local625 < Static175.anInt3635) {
											Static26.anIntArray42[local5++] = Static67.aBooleanArray11[local625] ? 1 : 0;
											continue;
										}
										Static26.anIntArray42[local5++] = 0;
										continue;
									}
									if (local47 == 3628) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										if (local431.startsWith("<img=0>") || local431.startsWith("<img=1>")) {
											local431 = local431.substring(7);
										}
										Static26.anIntArray42[local5++] = Static213.method3383(local431);
										continue;
									}
									if (local47 == 3629) {
										Static26.anIntArray42[local5++] = Static141.anInt2761;
										continue;
									}
									if (local47 == 3630) {
										local13--;
										local431 = Static27.aStringArray5[local13];
										Static289.method4288(local431, true);
										continue;
									}
									if (local47 == 3631) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static90.aBooleanArray49[local625] ? 1 : 0;
										continue;
									}
									if (local47 == 3632) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static295.aString189 != null && Static183.anInt3703 > local625) {
											Static27.aStringArray5[local13++] = Static208.aClass31Array1[local625].aString20;
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										continue;
									}
									if (local47 == 3633) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										if (Static84.anInt1525 != 0 && local625 < Static268.anInt5931) {
											Static27.aStringArray5[local13++] = Static255.aStringArray42[local625];
											continue;
										}
										Static27.aStringArray5[local13++] = "";
										continue;
									}
								} else if (local47 < 4000) {
									if (local47 == 3903) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static122.aClass83Array1[local625].method1811();
										continue;
									}
									if (local47 == 3904) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static122.aClass83Array1[local625].anInt2226;
										continue;
									}
									if (local47 == 3905) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static122.aClass83Array1[local625].anInt2225;
										continue;
									}
									if (local47 == 3906) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static122.aClass83Array1[local625].anInt2227;
										continue;
									}
									if (local47 == 3907) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static122.aClass83Array1[local625].anInt2229;
										continue;
									}
									if (local47 == 3908) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = Static122.aClass83Array1[local625].anInt2223;
										continue;
									}
									if (local47 == 3910) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										local636 = Static122.aClass83Array1[local625].method1810();
										Static26.anIntArray42[local5++] = local636 == 0 ? 1 : 0;
										continue;
									}
									if (local47 == 3911) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										local636 = Static122.aClass83Array1[local625].method1810();
										Static26.anIntArray42[local5++] = local636 == 2 ? 1 : 0;
										continue;
									}
									if (local47 == 3912) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										local636 = Static122.aClass83Array1[local625].method1810();
										Static26.anIntArray42[local5++] = local636 == 5 ? 1 : 0;
										continue;
									}
									if (local47 == 3913) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										local636 = Static122.aClass83Array1[local625].method1810();
										Static26.anIntArray42[local5++] = local636 == 1 ? 1 : 0;
										continue;
									}
								} else if (local47 >= 4100) {
									@Pc(4202) boolean local4202;
									if (local47 < 4200) {
										if (local47 == 4100) {
											local5--;
											local636 = Static26.anIntArray42[local5];
											local13--;
											local431 = Static27.aStringArray5[local13];
											Static27.aStringArray5[local13++] = local431 + local636;
											continue;
										}
										if (local47 == 4101) {
											local13 -= 2;
											local431 = Static27.aStringArray5[local13];
											local1635 = Static27.aStringArray5[local13 + 1];
											Static27.aStringArray5[local13++] = local431 + local1635;
											continue;
										}
										if (local47 == 4102) {
											local13--;
											local431 = Static27.aStringArray5[local13];
											local5--;
											local636 = Static26.anIntArray42[local5];
											Static27.aStringArray5[local13++] = local431 + Static219.method3495(local636);
											continue;
										}
										if (local47 == 4103) {
											local13--;
											local431 = Static27.aStringArray5[local13];
											Static27.aStringArray5[local13++] = local431.toLowerCase();
											continue;
										}
										if (local47 == 4104) {
											local5--;
											local625 = Static26.anIntArray42[local5];
											@Pc(3758) long local3758 = (long) local625 * 86400000L + 1014768000000L;
											Static111.aCalendar2.setTime(new Date(local3758));
											local479 = Static111.aCalendar2.get(5);
											local1698 = Static111.aCalendar2.get(2);
											local916 = Static111.aCalendar2.get(1);
											Static27.aStringArray5[local13++] = local479 + "-" + Static143.aStringArray25[local1698] + "-" + local916;
											continue;
										}
										if (local47 == 4105) {
											local13 -= 2;
											local431 = Static27.aStringArray5[local13];
											local1635 = Static27.aStringArray5[local13 + 1];
											if (Static229.aClass22_Sub3_Sub2_2.aClass119_2 != null && Static229.aClass22_Sub3_Sub2_2.aClass119_2.aBoolean258) {
												Static27.aStringArray5[local13++] = local1635;
												continue;
											}
											Static27.aStringArray5[local13++] = local431;
											continue;
										}
										if (local47 == 4106) {
											local5--;
											local625 = Static26.anIntArray42[local5];
											Static27.aStringArray5[local13++] = Integer.toString(local625);
											continue;
										}
										if (local47 == 4107) {
											local13 -= 2;
											Static26.anIntArray42[local5++] = Static262.method1890(Static90.method3649(Static117.anInt2307, Static27.aStringArray5[local13], Static27.aStringArray5[local13 + 1]));
											continue;
										}
										if (local47 == 4108) {
											local5 -= 2;
											local875 = Static26.anIntArray42[local5 + 1];
											local636 = Static26.anIntArray42[local5];
											local13--;
											local431 = Static27.aStringArray5[local13];
											Static26.anIntArray42[local5++] = Static118.method1922(local875).method4442(local431, local636);
											continue;
										}
										if (local47 == 4109) {
											local5 -= 2;
											local13--;
											local431 = Static27.aStringArray5[local13];
											local636 = Static26.anIntArray42[local5];
											local875 = Static26.anIntArray42[local5 + 1];
											Static26.anIntArray42[local5++] = Static118.method1922(local875).method4420(local431, local636);
											continue;
										}
										if (local47 == 4110) {
											local13 -= 2;
											local431 = Static27.aStringArray5[local13];
											local1635 = Static27.aStringArray5[local13 + 1];
											local5--;
											if (Static26.anIntArray42[local5] == 1) {
												Static27.aStringArray5[local13++] = local431;
											} else {
												Static27.aStringArray5[local13++] = local1635;
											}
											continue;
										}
										if (local47 == 4111) {
											local13--;
											local431 = Static27.aStringArray5[local13];
											Static27.aStringArray5[local13++] = Static139.method4431(local431);
											continue;
										}
										if (local47 == 4112) {
											local13--;
											local431 = Static27.aStringArray5[local13];
											local5--;
											local636 = Static26.anIntArray42[local5];
											if (local636 == -1) {
												throw new RuntimeException("null char");
											}
											Static27.aStringArray5[local13++] = local431 + (char) local636;
											continue;
										}
										if (local47 == 4113) {
											local5--;
											local625 = Static26.anIntArray42[local5];
											Static26.anIntArray42[local5++] = Static105.method1694((char) local625) ? 1 : 0;
											continue;
										}
										if (local47 == 4114) {
											local5--;
											local625 = Static26.anIntArray42[local5];
											Static26.anIntArray42[local5++] = Static87.method1296((char) local625) ? 1 : 0;
											continue;
										}
										if (local47 == 4115) {
											local5--;
											local625 = Static26.anIntArray42[local5];
											Static26.anIntArray42[local5++] = Static248.method3830((char) local625) ? 1 : 0;
											continue;
										}
										if (local47 == 4116) {
											local5--;
											local625 = Static26.anIntArray42[local5];
											Static26.anIntArray42[local5++] = Static173.method2890((char) local625) ? 1 : 0;
											continue;
										}
										if (local47 == 4117) {
											local13--;
											local431 = Static27.aStringArray5[local13];
											if (local431 == null) {
												Static26.anIntArray42[local5++] = 0;
											} else {
												Static26.anIntArray42[local5++] = local431.length();
											}
											continue;
										}
										if (local47 == 4118) {
											local5 -= 2;
											local636 = Static26.anIntArray42[local5];
											local13--;
											local431 = Static27.aStringArray5[local13];
											local875 = Static26.anIntArray42[local5 + 1];
											Static27.aStringArray5[local13++] = local431.substring(local636, local875);
											continue;
										}
										if (local47 == 4119) {
											local13--;
											local431 = Static27.aStringArray5[local13];
											local4202 = false;
											@Pc(4208) StringBuffer local4208 = new StringBuffer(local431.length());
											for (local479 = 0; local479 < local431.length(); local479++) {
												@Pc(4218) char local4218 = local431.charAt(local479);
												if (local4218 == '<') {
													local4202 = true;
												} else if (local4218 == '>') {
													local4202 = false;
												} else if (!local4202) {
													local4208.append(local4218);
												}
											}
											Static27.aStringArray5[local13++] = local4208.toString();
											continue;
										}
										if (local47 == 4120) {
											local5 -= 2;
											local636 = Static26.anIntArray42[local5];
											local13--;
											local431 = Static27.aStringArray5[local13];
											local875 = Static26.anIntArray42[local5 + 1];
											Static26.anIntArray42[local5++] = local431.indexOf(local636, local875);
											continue;
										}
										if (local47 == 4121) {
											local13 -= 2;
											local431 = Static27.aStringArray5[local13];
											local1635 = Static27.aStringArray5[local13 + 1];
											local5--;
											local875 = Static26.anIntArray42[local5];
											Static26.anIntArray42[local5++] = local431.indexOf(local1635, local875);
											continue;
										}
										if (local47 == 4122) {
											local5--;
											local625 = Static26.anIntArray42[local5];
											Static26.anIntArray42[local5++] = Character.toLowerCase((char) local625);
											continue;
										}
										if (local47 == 4123) {
											local5--;
											local625 = Static26.anIntArray42[local5];
											Static26.anIntArray42[local5++] = Character.toUpperCase((char) local625);
											continue;
										}
										if (local47 == 4124) {
											local5--;
											local4364 = Static26.anIntArray42[local5] != 0;
											local5--;
											local636 = Static26.anIntArray42[local5];
											Static27.aStringArray5[local13++] = Static49.method865(local4364, 0, (long) local636, Static117.anInt2307);
											continue;
										}
									} else {
										@Pc(4692) Class1_Sub1_Sub15 local4692;
										if (local47 < 4300) {
											if (local47 == 4200) {
												local5--;
												local625 = Static26.anIntArray42[local5];
												Static27.aStringArray5[local13++] = Static271.method4006(local625).aString159;
												continue;
											}
											@Pc(4428) Class149 local4428;
											if (local47 == 4201) {
												local5 -= 2;
												local625 = Static26.anIntArray42[local5];
												local636 = Static26.anIntArray42[local5 + 1];
												local4428 = Static271.method4006(local625);
												if (local636 >= 1 && local636 <= 5 && local4428.aStringArray39[local636 - 1] != null) {
													Static27.aStringArray5[local13++] = local4428.aStringArray39[local636 - 1];
													continue;
												}
												Static27.aStringArray5[local13++] = "";
												continue;
											}
											if (local47 == 4202) {
												local5 -= 2;
												local636 = Static26.anIntArray42[local5 + 1];
												local625 = Static26.anIntArray42[local5];
												local4428 = Static271.method4006(local625);
												if (local636 >= 1 && local636 <= 5 && local4428.aStringArray38[local636 - 1] != null) {
													Static27.aStringArray5[local13++] = local4428.aStringArray38[local636 - 1];
													continue;
												}
												Static27.aStringArray5[local13++] = "";
												continue;
											}
											if (local47 == 4203) {
												local5--;
												local625 = Static26.anIntArray42[local5];
												Static26.anIntArray42[local5++] = Static271.method4006(local625).anInt4764;
												continue;
											}
											if (local47 == 4204) {
												local5--;
												local625 = Static26.anIntArray42[local5];
												Static26.anIntArray42[local5++] = Static271.method4006(local625).anInt4790 == 1 ? 1 : 0;
												continue;
											}
											@Pc(4580) Class149 local4580;
											if (local47 == 4205) {
												local5--;
												local625 = Static26.anIntArray42[local5];
												local4580 = Static271.method4006(local625);
												if (local4580.anInt4800 == -1 && local4580.anInt4787 >= 0) {
													Static26.anIntArray42[local5++] = local4580.anInt4787;
													continue;
												}
												Static26.anIntArray42[local5++] = local625;
												continue;
											}
											if (local47 == 4206) {
												local5--;
												local625 = Static26.anIntArray42[local5];
												local4580 = Static271.method4006(local625);
												if (local4580.anInt4800 >= 0 && local4580.anInt4787 >= 0) {
													Static26.anIntArray42[local5++] = local4580.anInt4787;
													continue;
												}
												Static26.anIntArray42[local5++] = local625;
												continue;
											}
											if (local47 == 4207) {
												local5--;
												local625 = Static26.anIntArray42[local5];
												Static26.anIntArray42[local5++] = Static271.method4006(local625).aBoolean343 ? 1 : 0;
												continue;
											}
											if (local47 == 4208) {
												local5 -= 2;
												local625 = Static26.anIntArray42[local5];
												local636 = Static26.anIntArray42[local5 + 1];
												local4692 = Static217.method3426(local636);
												if (local4692.method3170()) {
													Static27.aStringArray5[local13++] = Static271.method4006(local625).method3733(local636, local4692.aString133);
												} else {
													Static26.anIntArray42[local5++] = Static271.method4006(local625).method3740(local636, local4692.anInt3964);
												}
												continue;
											}
											if (local47 == 4210) {
												local13--;
												local431 = Static27.aStringArray5[local13];
												local5--;
												local636 = Static26.anIntArray42[local5];
												Static87.method1302(local431, local636 == 1);
												Static26.anIntArray42[local5++] = Static151.anInt3099;
												continue;
											}
											if (local47 == 4211) {
												if (Static93.aShortArray17 != null && Static8.anInt142 < Static151.anInt3099) {
													Static26.anIntArray42[local5++] = Static93.aShortArray17[Static8.anInt142++] & 0xFFFF;
													continue;
												}
												Static26.anIntArray42[local5++] = -1;
												continue;
											}
											if (local47 == 4212) {
												Static8.anInt142 = 0;
												continue;
											}
										} else if (local47 >= 4400) {
											if (local47 >= 4500) {
												if (local47 < 4600) {
													if (local47 == 4500) {
														local5 -= 2;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														local4692 = Static217.method3426(local636);
														if (local4692.method3170()) {
															Static27.aStringArray5[local13++] = Static122.method1960(local625).method597(local636, local4692.aString133);
														} else {
															Static26.anIntArray42[local5++] = Static122.method1960(local625).method601(local636, local4692.anInt3964);
														}
														continue;
													}
												} else if (local47 < 5100) {
													if (local47 == 5000) {
														Static26.anIntArray42[local5++] = Static24.anInt469;
														continue;
													}
													if (local47 == 5001) {
														local5 -= 3;
														Static24.anInt469 = Static26.anIntArray42[local5];
														Static210.anInt4145 = Static26.anIntArray42[local5 + 1];
														Static188.anInt3772 = Static26.anIntArray42[local5 + 2];
														Static137.aClass1_Sub14_Sub1_6.method2661(52);
														Static137.aClass1_Sub14_Sub1_6.method2631(Static24.anInt469);
														Static137.aClass1_Sub14_Sub1_6.method2631(Static210.anInt4145);
														Static137.aClass1_Sub14_Sub1_6.method2631(Static188.anInt3772);
														continue;
													}
													if (local47 == 5002) {
														local5 -= 2;
														local13--;
														local431 = Static27.aStringArray5[local13];
														local636 = Static26.anIntArray42[local5];
														local875 = Static26.anIntArray42[local5 + 1];
														Static137.aClass1_Sub14_Sub1_6.method2661(116);
														Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(local431) + 2);
														Static137.aClass1_Sub14_Sub1_6.method2619(local431);
														Static137.aClass1_Sub14_Sub1_6.method2631(local636 - 1);
														Static137.aClass1_Sub14_Sub1_6.method2631(local875);
														continue;
													}
													if (local47 == 5003) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														local1635 = null;
														if (local625 < 100) {
															local1635 = Static45.aStringArray6[local625];
														}
														if (local1635 == null) {
															local1635 = "";
														}
														Static27.aStringArray5[local13++] = local1635;
														continue;
													}
													if (local47 == 5004) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														local636 = -1;
														if (local625 < 100 && Static45.aStringArray6[local625] != null) {
															local636 = Static162.anIntArray274[local625];
														}
														Static26.anIntArray42[local5++] = local636;
														continue;
													}
													if (local47 == 5005) {
														Static26.anIntArray42[local5++] = Static210.anInt4145;
														continue;
													}
													if (local47 == 5008) {
														local13--;
														local431 = Static27.aStringArray5[local13];
														if (!local431.startsWith("::")) {
															if (Static95.anInt5251 == 0 && (Static310.aBoolean108 && !Static241.aBoolean346 || Static206.aBoolean280)) {
																continue;
															}
															local1635 = local431.toLowerCase();
															@Pc(5090) byte local5090 = 0;
															if (local1635.startsWith(Static56.aString32)) {
																local5090 = 0;
																local431 = local431.substring(Static56.aString32.length());
															} else if (local1635.startsWith(Static237.aString114)) {
																local5090 = 1;
																local431 = local431.substring(Static237.aString114.length());
															} else if (local1635.startsWith(Static274.aString172)) {
																local431 = local431.substring(Static274.aString172.length());
																local5090 = 2;
															} else if (local1635.startsWith(Static118.aString86)) {
																local431 = local431.substring(Static118.aString86.length());
																local5090 = 3;
															} else if (local1635.startsWith(Static260.aString167)) {
																local431 = local431.substring(Static260.aString167.length());
																local5090 = 4;
															} else if (local1635.startsWith(Static12.aString7)) {
																local5090 = 5;
																local431 = local431.substring(Static12.aString7.length());
															} else if (local1635.startsWith(Static187.aString123)) {
																local5090 = 6;
																local431 = local431.substring(Static187.aString123.length());
															} else if (local1635.startsWith(Static40.aString24)) {
																local431 = local431.substring(Static40.aString24.length());
																local5090 = 7;
															} else if (local1635.startsWith(Static127.aString89)) {
																local431 = local431.substring(Static127.aString89.length());
																local5090 = 8;
															} else if (local1635.startsWith(Static29.aString17)) {
																local5090 = 9;
																local431 = local431.substring(Static29.aString17.length());
															} else if (local1635.startsWith(Static90.aString149)) {
																local431 = local431.substring(Static90.aString149.length());
																local5090 = 10;
															} else if (local1635.startsWith(Static97.aString66)) {
																local5090 = 11;
																local431 = local431.substring(Static97.aString66.length());
															} else if (Static117.anInt2307 != 0) {
																if (local1635.startsWith(Static158.aString69)) {
																	local5090 = 0;
																	local431 = local431.substring(Static158.aString69.length());
																} else if (local1635.startsWith(Static131.aString93)) {
																	local431 = local431.substring(Static131.aString93.length());
																	local5090 = 1;
																} else if (local1635.startsWith(Static274.aString171)) {
																	local5090 = 2;
																	local431 = local431.substring(Static274.aString171.length());
																} else if (local1635.startsWith(Static288.aString182)) {
																	local5090 = 3;
																	local431 = local431.substring(Static288.aString182.length());
																} else if (local1635.startsWith(Static14.aString8)) {
																	local5090 = 4;
																	local431 = local431.substring(Static14.aString8.length());
																} else if (local1635.startsWith(Static10.aString6)) {
																	local5090 = 5;
																	local431 = local431.substring(Static10.aString6.length());
																} else if (local1635.startsWith(Static118.aString87)) {
																	local431 = local431.substring(Static118.aString87.length());
																	local5090 = 6;
																} else if (local1635.startsWith(Static304.aString192)) {
																	local431 = local431.substring(Static304.aString192.length());
																	local5090 = 7;
																} else if (local1635.startsWith(Static59.aString34)) {
																	local431 = local431.substring(Static59.aString34.length());
																	local5090 = 8;
																} else if (local1635.startsWith(Static57.aString33)) {
																	local5090 = 9;
																	local431 = local431.substring(Static57.aString33.length());
																} else if (local1635.startsWith(Static77.aString177)) {
																	local431 = local431.substring(Static77.aString177.length());
																	local5090 = 10;
																} else if (local1635.startsWith(Static87.aString55)) {
																	local431 = local431.substring(Static87.aString55.length());
																	local5090 = 11;
																}
															}
															@Pc(5412) byte local5412 = 0;
															local1635 = local431.toLowerCase();
															if (local1635.startsWith(Static78.aString47)) {
																local431 = local431.substring(Static78.aString47.length());
																local5412 = 1;
															} else if (local1635.startsWith(Static309.aString193)) {
																local5412 = 2;
																local431 = local431.substring(Static309.aString193.length());
															} else if (local1635.startsWith(Static87.aString54)) {
																local431 = local431.substring(Static87.aString54.length());
																local5412 = 3;
															} else if (local1635.startsWith(Static90.aString148)) {
																local5412 = 4;
																local431 = local431.substring(Static90.aString148.length());
															} else if (local1635.startsWith(Static89.aString59)) {
																local431 = local431.substring(Static89.aString59.length());
																local5412 = 5;
															} else if (Static117.anInt2307 != 0) {
																if (local1635.startsWith(Static279.aString174)) {
																	local5412 = 1;
																	local431 = local431.substring(Static279.aString174.length());
																} else if (local1635.startsWith(Static132.aString95)) {
																	local5412 = 2;
																	local431 = local431.substring(Static132.aString95.length());
																} else if (local1635.startsWith(Static252.aString164)) {
																	local431 = local431.substring(Static252.aString164.length());
																	local5412 = 3;
																} else if (local1635.startsWith(Static68.aString42)) {
																	local5412 = 4;
																	local431 = local431.substring(Static68.aString42.length());
																} else if (local1635.startsWith(Static142.aString97)) {
																	local5412 = 5;
																	local431 = local431.substring(Static142.aString97.length());
																}
															}
															Static137.aClass1_Sub14_Sub1_6.method2661(144);
															Static137.aClass1_Sub14_Sub1_6.method2631(0);
															local1698 = Static137.aClass1_Sub14_Sub1_6.anInt3290;
															Static137.aClass1_Sub14_Sub1_6.method2631(local5090);
															Static137.aClass1_Sub14_Sub1_6.method2631(local5412);
															Static117.method1864(local431, Static137.aClass1_Sub14_Sub1_6);
															Static137.aClass1_Sub14_Sub1_6.method2650(Static137.aClass1_Sub14_Sub1_6.anInt3290 - local1698);
															continue;
														}
														Static302.method4513(local431);
														continue;
													}
													if (local47 == 5009) {
														local13 -= 2;
														local431 = Static27.aStringArray5[local13];
														local1635 = Static27.aStringArray5[local13 + 1];
														if (Static95.anInt5251 != 0 || (!Static310.aBoolean108 || Static241.aBoolean346) && !Static206.aBoolean280) {
															Static137.aClass1_Sub14_Sub1_6.method2661(76);
															Static137.aClass1_Sub14_Sub1_6.method2631(0);
															local875 = Static137.aClass1_Sub14_Sub1_6.anInt3290;
															Static137.aClass1_Sub14_Sub1_6.method2619(local431);
															Static117.method1864(local1635, Static137.aClass1_Sub14_Sub1_6);
															Static137.aClass1_Sub14_Sub1_6.method2650(Static137.aClass1_Sub14_Sub1_6.anInt3290 - local875);
														}
														continue;
													}
													if (local47 == 5010) {
														local1635 = null;
														local5--;
														local625 = Static26.anIntArray42[local5];
														if (local625 < 100) {
															local1635 = Static178.aStringArray31[local625];
														}
														if (local1635 == null) {
															local1635 = "";
														}
														Static27.aStringArray5[local13++] = local1635;
														continue;
													}
													if (local47 == 5011) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														local1635 = null;
														if (local625 < 100) {
															local1635 = Static108.aStringArray20[local625];
														}
														if (local1635 == null) {
															local1635 = "";
														}
														Static27.aStringArray5[local13++] = local1635;
														continue;
													}
													if (local47 == 5012) {
														local636 = -1;
														local5--;
														local625 = Static26.anIntArray42[local5];
														if (local625 < 100) {
															local636 = Static299.anIntArray520[local625];
														}
														Static26.anIntArray42[local5++] = local636;
														continue;
													}
													if (local47 == 5015) {
														if (Static229.aClass22_Sub3_Sub2_2 == null || Static229.aClass22_Sub3_Sub2_2.aString152 == null) {
															local431 = Static82.aString50;
														} else {
															local431 = Static229.aClass22_Sub3_Sub2_2.method3667(true);
														}
														Static27.aStringArray5[local13++] = local431;
														continue;
													}
													if (local47 == 5018) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														local636 = 0;
														if (local625 < 100 && Static45.aStringArray6[local625] != null) {
															local636 = Static162.anIntArray274[local625];
														}
														Static26.anIntArray42[local5++] = local636;
														continue;
													}
													if (local47 == 5019) {
														local1635 = null;
														local5--;
														local625 = Static26.anIntArray42[local5];
														if (local625 < 100) {
															local1635 = Static97.aStringArray16[local625];
														}
														if (local1635 == null) {
															local1635 = "";
														}
														Static27.aStringArray5[local13++] = local1635;
														continue;
													}
													if (local47 == 5016) {
														Static26.anIntArray42[local5++] = Static188.anInt3772;
														continue;
													}
													if (local47 == 5017) {
														Static26.anIntArray42[local5++] = Static251.anInt4927;
														continue;
													}
													if (local47 == 5050) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														Static27.aStringArray5[local13++] = Static106.method1768(local625).aString170;
														continue;
													}
													@Pc(5887) Class1_Sub1_Sub21 local5887;
													if (local47 == 5051) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														local5887 = Static106.method1768(local625);
														if (local5887.anIntArray468 == null) {
															Static26.anIntArray42[local5++] = 0;
														} else {
															Static26.anIntArray42[local5++] = local5887.anIntArray468.length;
														}
														continue;
													}
													if (local47 == 5052) {
														local5 -= 2;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														@Pc(5927) Class1_Sub1_Sub21 local5927 = Static106.method1768(local625);
														local479 = local5927.anIntArray468[local636];
														Static26.anIntArray42[local5++] = local479;
														continue;
													}
													if (local47 == 5053) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														local5887 = Static106.method1768(local625);
														if (local5887.anIntArray467 == null) {
															Static26.anIntArray42[local5++] = 0;
														} else {
															Static26.anIntArray42[local5++] = local5887.anIntArray467.length;
														}
														continue;
													}
													if (local47 == 5054) {
														local5 -= 2;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														Static26.anIntArray42[local5++] = Static106.method1768(local625).anIntArray467[local636];
														continue;
													}
													if (local47 == 5055) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														Static27.aStringArray5[local13++] = Static57.method981(local625).method3800();
														continue;
													}
													if (local47 == 5056) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														@Pc(6035) Class1_Sub1_Sub20 local6035 = Static57.method981(local625);
														if (local6035.anIntArray442 == null) {
															Static26.anIntArray42[local5++] = 0;
														} else {
															Static26.anIntArray42[local5++] = local6035.anIntArray442.length;
														}
														continue;
													}
													if (local47 == 5057) {
														local5 -= 2;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														Static26.anIntArray42[local5++] = Static57.method981(local625).anIntArray442[local636];
														continue;
													}
													if (local47 == 5058) {
														Static263.aClass160_1 = new Class160();
														local5--;
														Static263.aClass160_1.anInt4975 = Static26.anIntArray42[local5];
														Static263.aClass160_1.aClass1_Sub1_Sub20_1 = Static57.method981(Static263.aClass160_1.anInt4975);
														Static263.aClass160_1.anIntArray448 = new int[Static263.aClass160_1.aClass1_Sub1_Sub20_1.method3803()];
														continue;
													}
													if (local47 == 5059) {
														Static137.aClass1_Sub14_Sub1_6.method2661(172);
														Static137.aClass1_Sub14_Sub1_6.method2631(0);
														local625 = Static137.aClass1_Sub14_Sub1_6.anInt3290;
														Static137.aClass1_Sub14_Sub1_6.method2631(0);
														Static137.aClass1_Sub14_Sub1_6.method2637(Static263.aClass160_1.anInt4975);
														Static263.aClass160_1.aClass1_Sub1_Sub20_1.method3807(Static263.aClass160_1.anIntArray448, Static137.aClass1_Sub14_Sub1_6);
														Static137.aClass1_Sub14_Sub1_6.method2650(Static137.aClass1_Sub14_Sub1_6.anInt3290 - local625);
														continue;
													}
													if (local47 == 5060) {
														local13--;
														local431 = Static27.aStringArray5[local13];
														Static137.aClass1_Sub14_Sub1_6.method2661(106);
														Static137.aClass1_Sub14_Sub1_6.method2631(0);
														local636 = Static137.aClass1_Sub14_Sub1_6.anInt3290;
														Static137.aClass1_Sub14_Sub1_6.method2619(local431);
														Static137.aClass1_Sub14_Sub1_6.method2637(Static263.aClass160_1.anInt4975);
														Static263.aClass160_1.aClass1_Sub1_Sub20_1.method3807(Static263.aClass160_1.anIntArray448, Static137.aClass1_Sub14_Sub1_6);
														Static137.aClass1_Sub14_Sub1_6.method2650(Static137.aClass1_Sub14_Sub1_6.anInt3290 - local636);
														continue;
													}
													if (local47 == 5061) {
														Static137.aClass1_Sub14_Sub1_6.method2661(172);
														Static137.aClass1_Sub14_Sub1_6.method2631(0);
														local625 = Static137.aClass1_Sub14_Sub1_6.anInt3290;
														Static137.aClass1_Sub14_Sub1_6.method2631(1);
														Static137.aClass1_Sub14_Sub1_6.method2637(Static263.aClass160_1.anInt4975);
														Static263.aClass160_1.aClass1_Sub1_Sub20_1.method3807(Static263.aClass160_1.anIntArray448, Static137.aClass1_Sub14_Sub1_6);
														Static137.aClass1_Sub14_Sub1_6.method2650(Static137.aClass1_Sub14_Sub1_6.anInt3290 - local625);
														continue;
													}
													if (local47 == 5062) {
														local5 -= 2;
														local636 = Static26.anIntArray42[local5 + 1];
														local625 = Static26.anIntArray42[local5];
														Static26.anIntArray42[local5++] = Static106.method1768(local625).aCharArray7[local636];
														continue;
													}
													if (local47 == 5063) {
														local5 -= 2;
														local636 = Static26.anIntArray42[local5 + 1];
														local625 = Static26.anIntArray42[local5];
														Static26.anIntArray42[local5++] = Static106.method1768(local625).aCharArray8[local636];
														continue;
													}
													if (local47 == 5064) {
														local5 -= 2;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														if (local636 == -1) {
															Static26.anIntArray42[local5++] = -1;
														} else {
															Static26.anIntArray42[local5++] = Static106.method1768(local625).method4008((char) local636);
														}
														continue;
													}
													if (local47 == 5065) {
														local5 -= 2;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														if (local636 == -1) {
															Static26.anIntArray42[local5++] = -1;
														} else {
															Static26.anIntArray42[local5++] = Static106.method1768(local625).method4009((char) local636);
														}
														continue;
													}
													if (local47 == 5066) {
														local5--;
														local625 = Static26.anIntArray42[local5];
														Static26.anIntArray42[local5++] = Static57.method981(local625).method3803();
														continue;
													}
													if (local47 == 5067) {
														local5 -= 2;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														local875 = Static57.method981(local625).method3799(local636);
														Static26.anIntArray42[local5++] = local875;
														continue;
													}
													if (local47 == 5068) {
														local5 -= 2;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														Static263.aClass160_1.anIntArray448[local625] = local636;
														continue;
													}
													if (local47 == 5069) {
														local5 -= 2;
														local636 = Static26.anIntArray42[local5 + 1];
														local625 = Static26.anIntArray42[local5];
														Static263.aClass160_1.anIntArray448[local625] = local636;
														continue;
													}
													if (local47 == 5070) {
														local5 -= 3;
														local625 = Static26.anIntArray42[local5];
														local636 = Static26.anIntArray42[local5 + 1];
														local875 = Static26.anIntArray42[local5 + 2];
														@Pc(6511) Class1_Sub1_Sub20 local6511 = Static57.method981(local625);
														if (local6511.method3799(local636) != 0) {
															throw new RuntimeException("bad command");
														}
														Static26.anIntArray42[local5++] = local6511.method3801(local875, local636);
														continue;
													}
													if (local47 == 5071) {
														local13--;
														local431 = Static27.aStringArray5[local13];
														local5--;
														local6553 = Static26.anIntArray42[local5] == 1;
														Static280.method4155(local6553, local431);
														Static26.anIntArray42[local5++] = Static151.anInt3099;
														continue;
													}
													if (local47 == 5072) {
														if (Static93.aShortArray17 != null && Static8.anInt142 < Static151.anInt3099) {
															Static26.anIntArray42[local5++] = Static93.aShortArray17[Static8.anInt142++] & 0xFFFF;
															continue;
														}
														Static26.anIntArray42[local5++] = -1;
														continue;
													}
													if (local47 == 5073) {
														Static8.anInt142 = 0;
														continue;
													}
												} else if (local47 >= 5200) {
													@Pc(7050) boolean local7050;
													if (local47 < 5300) {
														if (local47 == 5200) {
															local5--;
															Static88.method1304(Static26.anIntArray42[local5]);
															continue;
														}
														if (local47 == 5201) {
															Static26.anIntArray42[local5++] = Static184.method2452();
															continue;
														}
														if (local47 == 5205) {
															local5--;
															Static307.method4558(-1, -1, false, Static26.anIntArray42[local5]);
															continue;
														}
														@Pc(6676) Class1_Sub1_Sub8 local6676;
														if (local47 == 5206) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local6676 = Static58.method2038(local625 >> 14 & 0x3FFF, local625 & 0x3FFF);
															if (local6676 == null) {
																Static26.anIntArray42[local5++] = -1;
															} else {
																Static26.anIntArray42[local5++] = local6676.anInt1060;
															}
															continue;
														}
														@Pc(6702) Class1_Sub1_Sub8 local6702;
														if (local47 == 5207) {
															local5--;
															local6702 = Static58.method2045(Static26.anIntArray42[local5]);
															if (local6702 != null && local6702.aString29 != null) {
																Static27.aStringArray5[local13++] = local6702.aString29;
																continue;
															}
															Static27.aStringArray5[local13++] = "";
															continue;
														}
														if (local47 == 5208) {
															Static26.anIntArray42[local5++] = Static304.anInt5751;
															Static26.anIntArray42[local5++] = Static5.anInt66;
															continue;
														}
														if (local47 == 5209) {
															Static26.anIntArray42[local5++] = Static58.anInt2560 + Static72.anInt1374;
															Static26.anIntArray42[local5++] = Static58.anInt2559 + Static58.anInt2563 - Static75.anInt1427 - 1;
															continue;
														}
														if (local47 == 5210) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local6676 = Static58.method2045(local625);
															if (local6676 == null) {
																Static26.anIntArray42[local5++] = 0;
																Static26.anIntArray42[local5++] = 0;
															} else {
																Static26.anIntArray42[local5++] = local6676.anInt1043 >> 14 & 0x3FFF;
																Static26.anIntArray42[local5++] = local6676.anInt1043 & 0x3FFF;
															}
															continue;
														}
														if (local47 == 5211) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local6676 = Static58.method2045(local625);
															if (local6676 == null) {
																Static26.anIntArray42[local5++] = 0;
																Static26.anIntArray42[local5++] = 0;
															} else {
																Static26.anIntArray42[local5++] = local6676.anInt1044 - local6676.anInt1053;
																Static26.anIntArray42[local5++] = local6676.anInt1061 - local6676.anInt1050;
															}
															continue;
														}
														@Pc(6870) Class1_Sub1_Sub10 local6870;
														if (local47 == 5212) {
															local6870 = Static87.method1298();
															if (local6870 == null) {
																Static26.anIntArray42[local5++] = -1;
																Static26.anIntArray42[local5++] = -1;
															} else {
																Static26.anIntArray42[local5++] = local6870.anInt1638;
																local636 = local6870.anInt1635 << 28 | local6870.anInt1633 + Static58.anInt2560 << 14 | Static58.anInt2559 + Static58.anInt2563 - local6870.anInt1630 - 1;
																Static26.anIntArray42[local5++] = local636;
															}
															continue;
														}
														if (local47 == 5213) {
															local6870 = Static88.method1309();
															if (local6870 == null) {
																Static26.anIntArray42[local5++] = -1;
																Static26.anIntArray42[local5++] = -1;
															} else {
																Static26.anIntArray42[local5++] = local6870.anInt1638;
																local636 = Static58.anInt2559 + Static58.anInt2563 - local6870.anInt1630 - 1 | Static58.anInt2560 + local6870.anInt1633 << 14 | local6870.anInt1635 << 28;
																Static26.anIntArray42[local5++] = local636;
															}
															continue;
														}
														if (local47 == 5214) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local6676 = Static6.method97();
															if (local6676 != null) {
																local4202 = local6676.method940(local625 >> 14 & 0x3FFF, Static197.anIntArray324, local625 & 0x3FFF, local625 >> 28 & 0x3);
																if (local4202) {
																	Static203.method3256(Static197.anIntArray324[2], Static197.anIntArray324[1]);
																}
															}
															continue;
														}
														if (local47 == 5215) {
															local5 -= 2;
															local636 = Static26.anIntArray42[local5 + 1];
															local625 = Static26.anIntArray42[local5];
															@Pc(7048) Class5 local7048 = Static58.method2040(local625 >> 14 & 0x3FFF, local625 & 0x3FFF);
															local7050 = false;
															for (@Pc(7055) Class1_Sub1_Sub8 local7055 = (Class1_Sub1_Sub8) local7048.method49(); local7055 != null; local7055 = (Class1_Sub1_Sub8) local7048.method51()) {
																if (local636 == local7055.anInt1060) {
																	local7050 = true;
																	break;
																}
															}
															if (local7050) {
																Static26.anIntArray42[local5++] = 1;
															} else {
																Static26.anIntArray42[local5++] = 0;
															}
															continue;
														}
														if (local47 == 5218) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local6676 = Static58.method2045(local625);
															if (local6676 == null) {
																Static26.anIntArray42[local5++] = -1;
															} else {
																Static26.anIntArray42[local5++] = local6676.anInt1059;
															}
															continue;
														}
														if (local47 == 5220) {
															Static26.anIntArray42[local5++] = Static191.anInt3924 == 100 ? 1 : 0;
															continue;
														}
														if (local47 == 5221) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															Static203.method3256(local625 & 0x3FFF, local625 >> 14 & 0x3FFF);
															continue;
														}
														if (local47 == 5222) {
															local6702 = Static6.method97();
															if (local6702 == null) {
																Static26.anIntArray42[local5++] = -1;
																Static26.anIntArray42[local5++] = -1;
															} else {
																local6553 = local6702.method944(Static72.anInt1374 + Static58.anInt2560, Static197.anIntArray324, Static58.anInt2563 + Static58.anInt2559 - Static75.anInt1427 - 1);
																if (local6553) {
																	Static26.anIntArray42[local5++] = Static197.anIntArray324[1];
																	Static26.anIntArray42[local5++] = Static197.anIntArray324[2];
																} else {
																	Static26.anIntArray42[local5++] = -1;
																	Static26.anIntArray42[local5++] = -1;
																}
															}
															continue;
														}
														if (local47 == 5223) {
															local5 -= 2;
															local625 = Static26.anIntArray42[local5];
															local636 = Static26.anIntArray42[local5 + 1];
															Static307.method4558(local636 & 0x3FFF, local636 >> 14 & 0x3FFF, false, local625);
															continue;
														}
														if (local47 == 5224) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local6676 = Static6.method97();
															if (local6676 == null) {
																Static26.anIntArray42[local5++] = -1;
																Static26.anIntArray42[local5++] = -1;
															} else {
																local4202 = local6676.method940(local625 >> 14 & 0x3FFF, Static197.anIntArray324, local625 & 0x3FFF, local625 >> 28 & 0x3);
																if (local4202) {
																	Static26.anIntArray42[local5++] = Static197.anIntArray324[1];
																	Static26.anIntArray42[local5++] = Static197.anIntArray324[2];
																} else {
																	Static26.anIntArray42[local5++] = -1;
																	Static26.anIntArray42[local5++] = -1;
																}
															}
															continue;
														}
														if (local47 == 5225) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local6676 = Static6.method97();
															if (local6676 == null) {
																Static26.anIntArray42[local5++] = -1;
																Static26.anIntArray42[local5++] = -1;
															} else {
																local4202 = local6676.method944(local625 >> 14 & 0x3FFF, Static197.anIntArray324, local625 & 0x3FFF);
																if (local4202) {
																	Static26.anIntArray42[local5++] = Static197.anIntArray324[1];
																	Static26.anIntArray42[local5++] = Static197.anIntArray324[2];
																} else {
																	Static26.anIntArray42[local5++] = -1;
																	Static26.anIntArray42[local5++] = -1;
																}
															}
															continue;
														}
														if (local47 == 5226) {
															local5--;
															Static213.method3387(Static26.anIntArray42[local5]);
															continue;
														}
														if (local47 == 5227) {
															local5 -= 2;
															local625 = Static26.anIntArray42[local5];
															local636 = Static26.anIntArray42[local5 + 1];
															Static307.method4558(local636 & 0x3FFF, local636 >> 14 & 0x3FFF, true, local625);
															continue;
														}
														if (local47 == 5228) {
															local5--;
															Static222.aBoolean295 = Static26.anIntArray42[local5] == 1;
															continue;
														}
														if (local47 == 5229) {
															Static26.anIntArray42[local5++] = Static222.aBoolean295 ? 1 : 0;
															continue;
														}
														if (local47 == 5230) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															Static25.method470(local625);
															continue;
														}
														@Pc(7529) Class1 local7529;
														if (local47 == 5231) {
															local5 -= 2;
															local625 = Static26.anIntArray42[local5];
															local6553 = Static26.anIntArray42[local5 + 1] == 1;
															if (Static98.aClass156_8 == null) {
																continue;
															}
															local7529 = Static98.aClass156_8.method3821((long) local625);
															if (local7529 != null && !local6553) {
																local7529.method4616();
																continue;
															}
															if (local7529 == null && local6553) {
																local7529 = new Class1();
																Static98.aClass156_8.method3816((long) local625, local7529);
															}
															continue;
														}
														@Pc(7576) Class1 local7576;
														if (local47 == 5232) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (Static98.aClass156_8 == null) {
																Static26.anIntArray42[local5++] = 0;
															} else {
																local7576 = Static98.aClass156_8.method3821((long) local625);
																Static26.anIntArray42[local5++] = local7576 == null ? 0 : 1;
															}
															continue;
														}
														if (local47 == 5233) {
															local5 -= 2;
															local625 = Static26.anIntArray42[local5];
															local6553 = Static26.anIntArray42[local5 + 1] == 1;
															if (Static49.aClass156_3 == null) {
																continue;
															}
															local7529 = Static49.aClass156_3.method3821((long) local625);
															if (local7529 != null && !local6553) {
																local7529.method4616();
																continue;
															}
															if (local7529 == null && local6553) {
																local7529 = new Class1();
																Static49.aClass156_3.method3816((long) local625, local7529);
															}
															continue;
														}
														if (local47 == 5234) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (Static49.aClass156_3 == null) {
																Static26.anIntArray42[local5++] = 0;
															} else {
																local7576 = Static49.aClass156_3.method3821((long) local625);
																Static26.anIntArray42[local5++] = local7576 == null ? 0 : 1;
															}
															continue;
														}
														if (local47 == 5235) {
															Static26.anIntArray42[local5++] = Static58.aClass1_Sub1_Sub8_2 == null ? -1 : Static58.aClass1_Sub1_Sub8_2.anInt1060;
															continue;
														}
													} else if (local47 < 5400) {
														if (local47 == 5300) {
															local5 -= 2;
															local625 = Static26.anIntArray42[local5];
															local636 = Static26.anIntArray42[local5 + 1];
															Static214.method3390(local636, false, local625, 3);
															Static26.anIntArray42[local5++] = Static75.aFrame1 == null ? 0 : 1;
															continue;
														}
														if (local47 == 5301) {
															if (Static75.aFrame1 != null) {
																Static214.method3390(-1, false, -1, Static247.anInt4901);
															}
															continue;
														}
														if (local47 == 5302) {
															@Pc(11260) Class191[] local11260 = Static128.method2023();
															Static26.anIntArray42[local5++] = local11260.length;
															continue;
														}
														if (local47 == 5303) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															@Pc(11281) Class191[] local11281 = Static128.method2023();
															Static26.anIntArray42[local5++] = local11281[local625].anInt5845;
															Static26.anIntArray42[local5++] = local11281[local625].anInt5843;
															continue;
														}
														if (local47 == 5305) {
															local625 = Static191.anInt3925;
															local875 = -1;
															local636 = Static63.anInt1285;
															@Pc(11314) Class191[] local11314 = Static128.method2023();
															for (local1698 = 0; local1698 < local11314.length; local1698++) {
																@Pc(11328) Class191 local11328 = local11314[local1698];
																if (local625 == local11328.anInt5845 && local636 == local11328.anInt5843) {
																	local875 = local1698;
																	break;
																}
															}
															Static26.anIntArray42[local5++] = local875;
															continue;
														}
														if (local47 == 5306) {
															Static26.anIntArray42[local5++] = Static230.method3622();
															continue;
														}
														if (local47 == 5307) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0 || local625 > 2) {
																local625 = 0;
															}
															Static214.method3390(-1, false, -1, local625);
															continue;
														}
														if (local47 == 5308) {
															Static26.anIntArray42[local5++] = Static247.anInt4901;
															continue;
														}
														if (local47 == 5309) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0 || local625 > 2) {
																local625 = 0;
															}
															Static247.anInt4901 = local625;
															Static80.method1224(Static117.aClass117_3);
															continue;
														}
													} else if (local47 < 5500) {
														if (local47 == 5400) {
															local13 -= 2;
															local1635 = Static27.aStringArray5[local13 + 1];
															local5--;
															local875 = Static26.anIntArray42[local5];
															local431 = Static27.aStringArray5[local13];
															Static137.aClass1_Sub14_Sub1_6.method2661(201);
															Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(local431) + Static255.method3873(local1635) + 1);
															Static137.aClass1_Sub14_Sub1_6.method2619(local431);
															Static137.aClass1_Sub14_Sub1_6.method2619(local1635);
															Static137.aClass1_Sub14_Sub1_6.method2631(local875);
															continue;
														}
														if (local47 == 5401) {
															local5 -= 2;
															Static236.aShortArray72[Static26.anIntArray42[local5]] = (short) Static212.method3350(Static26.anIntArray42[local5 + 1]);
															Static36.method649();
															Static282.method4199();
															Static262.method1894();
															Static230.method3624();
															Static124.method1998();
															continue;
														}
														if (local47 == 5405) {
															local5 -= 2;
															local625 = Static26.anIntArray42[local5];
															local636 = Static26.anIntArray42[local5 + 1];
															if (local625 >= 0 && local625 < 2) {
																Static162.anIntArrayArrayArray10[local625] = new int[local636 << 1][4];
															}
															continue;
														}
														if (local47 == 5406) {
															local5 -= 7;
															local636 = Static26.anIntArray42[local5 + 1] << 1;
															local875 = Static26.anIntArray42[local5 + 2];
															local625 = Static26.anIntArray42[local5];
															local479 = Static26.anIntArray42[local5 + 3];
															local1698 = Static26.anIntArray42[local5 + 4];
															@Pc(7869) int local7869 = Static26.anIntArray42[local5 + 6];
															local916 = Static26.anIntArray42[local5 + 5];
															if (local625 >= 0 && local625 < 2 && Static162.anIntArrayArrayArray10[local625] != null && local636 >= 0 && local636 < Static162.anIntArrayArrayArray10[local625].length) {
																Static162.anIntArrayArrayArray10[local625][local636] = new int[] { (local875 >> 14 & 0x3FFF) * 128, local479, (local875 & 0x3FFF) * 128, local7869 };
																Static162.anIntArrayArrayArray10[local625][local636 + 1] = new int[] { (local1698 >> 14 & 0x3FFF) * 128, local916, (local1698 & 0x3FFF) * 128 };
															}
															continue;
														}
														if (local47 == 5407) {
															local5--;
															local625 = Static162.anIntArrayArrayArray10[Static26.anIntArray42[local5]].length >> 1;
															Static26.anIntArray42[local5++] = local625;
															continue;
														}
														if (local47 == 5411) {
															if (Static75.aFrame1 != null) {
																Static214.method3390(-1, false, -1, Static247.anInt4901);
															}
															if (Static78.aFrame2 == null) {
																Static183.method3027(Static256.method3896(), false);
															} else {
																System.exit(0);
															}
															continue;
														}
														if (local47 == 5419) {
															local431 = "";
															if (Static268.aClass10_12 != null) {
																if (Static268.aClass10_12.anObject1 == null) {
																	local431 = Static132.method2160(Static268.aClass10_12.anInt152);
																} else {
																	local431 = (String) Static268.aClass10_12.anObject1;
																}
															}
															Static27.aStringArray5[local13++] = local431;
															continue;
														}
														if (local47 == 5420) {
															Static26.anIntArray42[local5++] = Static181.anInt3691 == 3 ? 1 : 0;
															continue;
														}
														if (local47 == 5421) {
															if (Static75.aFrame1 != null) {
																Static214.method3390(-1, false, -1, Static247.anInt4901);
															}
															local13--;
															local431 = Static27.aStringArray5[local13];
															local5--;
															local6553 = Static26.anIntArray42[local5] == 1;
															@Pc(8098) String local8098 = Static256.method3896() + local431;
															if (Static78.aFrame2 != null || local6553 && Static181.anInt3691 != 3 && Static181.aString120.startsWith("win") && !Static280.aBoolean382) {
																Static207.aBoolean281 = local6553;
																Static68.aString43 = local8098;
																Static238.aClass10_10 = Static117.aClass117_3.method2990(local8098);
																continue;
															}
															Static183.method3027(local8098, local6553);
															continue;
														}
														if (local47 == 5422) {
															local13 -= 2;
															local431 = Static27.aStringArray5[local13];
															local1635 = Static27.aStringArray5[local13 + 1];
															local5--;
															local875 = Static26.anIntArray42[local5];
															if (local431.length() > 0) {
																if (Static88.aStringArray15 == null) {
																	Static88.aStringArray15 = new String[Static75.anIntArray115[Static35.anInt641]];
																}
																Static88.aStringArray15[local875] = local431;
															}
															if (local1635.length() > 0) {
																if (Static177.aStringArray19 == null) {
																	Static177.aStringArray19 = new String[Static75.anIntArray115[Static35.anInt641]];
																}
																Static177.aStringArray19[local875] = local1635;
															}
															continue;
														}
														if (local47 == 5423) {
															local13--;
															System.out.println(Static27.aStringArray5[local13]);
															continue;
														}
														if (local47 == 5424) {
															local5 -= 11;
															Static200.anInt5634 = Static26.anIntArray42[local5];
															Static46.anInt890 = Static26.anIntArray42[local5 + 1];
															Static94.anInt1781 = Static26.anIntArray42[local5 + 2];
															Static228.anInt709 = Static26.anIntArray42[local5 + 3];
															Static252.anInt4940 = Static26.anIntArray42[local5 + 4];
															Static122.anInt2470 = Static26.anIntArray42[local5 + 5];
															Static201.anInt4030 = Static26.anIntArray42[local5 + 6];
															Static120.anInt2416 = Static26.anIntArray42[local5 + 7];
															Static270.anInt5143 = Static26.anIntArray42[local5 + 8];
															Static148.anInt2980 = Static26.anIntArray42[local5 + 9];
															Static296.anInt5594 = Static26.anIntArray42[local5 + 10];
															Static241.aClass138_64.method3340(Static252.anInt4940);
															Static241.aClass138_64.method3340(Static122.anInt2470);
															Static241.aClass138_64.method3340(Static201.anInt4030);
															Static241.aClass138_64.method3340(Static120.anInt2416);
															Static241.aClass138_64.method3340(Static270.anInt5143);
															Static37.aBoolean62 = true;
															continue;
														}
														if (local47 == 5425) {
															Static54.method941();
															Static37.aBoolean62 = false;
															continue;
														}
														if (local47 == 5426) {
															local5--;
															Static175.anInt3637 = Static26.anIntArray42[local5];
															continue;
														}
														if (local47 == 5427) {
															local5 -= 2;
															Static108.anInt2142 = Static26.anIntArray42[local5];
															Static243.anInt5650 = Static26.anIntArray42[local5 + 1];
															continue;
														}
														if (local47 == 5428) {
															local5 -= 2;
															local636 = Static26.anIntArray42[local5 + 1];
															local625 = Static26.anIntArray42[local5];
															Static26.anIntArray42[local5++] = Static175.method2922(local625, local636) ? 1 : 0;
															continue;
														}
													} else if (local47 < 5600) {
														if (local47 == 5500) {
															local5 -= 4;
															local625 = Static26.anIntArray42[local5];
															local636 = Static26.anIntArray42[local5 + 1];
															local875 = Static26.anIntArray42[local5 + 2];
															local479 = Static26.anIntArray42[local5 + 3];
															Static27.method483((local625 & 0x3FFF) - Static118.anInt2409, local479, local636, false, local875, (local625 >> 14 & 0x3FFF) - Static290.anInt5497);
															continue;
														}
														if (local47 == 5501) {
															local5 -= 4;
															local625 = Static26.anIntArray42[local5];
															local636 = Static26.anIntArray42[local5 + 1];
															local875 = Static26.anIntArray42[local5 + 2];
															local479 = Static26.anIntArray42[local5 + 3];
															Static216.method3401(local875, local636, local479, (local625 >> 14 & 0x3FFF) - Static290.anInt5497, -Static118.anInt2409 + (local625 & 0x3FFF));
															continue;
														}
														if (local47 == 5502) {
															local5 -= 6;
															local625 = Static26.anIntArray42[local5];
															if (local625 >= 2) {
																throw new RuntimeException();
															}
															Static59.anInt1177 = local625;
															local636 = Static26.anIntArray42[local5 + 1];
															if (local636 + 1 >= Static162.anIntArrayArrayArray10[Static59.anInt1177].length >> 1) {
																throw new RuntimeException();
															}
															Static286.anInt5443 = local636;
															Static206.anInt4066 = 0;
															Static148.anInt2977 = Static26.anIntArray42[local5 + 2];
															Static119.anInt5874 = Static26.anIntArray42[local5 + 3];
															local875 = Static26.anIntArray42[local5 + 4];
															if (local875 >= 2) {
																throw new RuntimeException();
															}
															Static218.anInt4282 = local875;
															local479 = Static26.anIntArray42[local5 + 5];
															if (Static162.anIntArrayArrayArray10[Static218.anInt4282].length >> 1 <= local479 + 1) {
																throw new RuntimeException();
															}
															Static101.anInt1895 = 3;
															Static132.anInt2670 = local479;
															continue;
														}
														if (local47 == 5503) {
															Static119.method4630();
															continue;
														}
														if (local47 == 5504) {
															local5 -= 2;
															Static264.method3948(Static26.anIntArray42[local5], Static26.anIntArray42[local5 + 1]);
															continue;
														}
														if (local47 == 5505) {
															Static26.anIntArray42[local5++] = (int) Static15.aFloat2;
															continue;
														}
														if (local47 == 5506) {
															Static26.anIntArray42[local5++] = (int) Static2.aFloat1;
															continue;
														}
														if (local47 == 5507) {
															Static233.method3682();
															continue;
														}
														if (local47 == 5508) {
															Static189.method3078();
															continue;
														}
														if (local47 == 5509) {
															Static238.method3752();
															continue;
														}
														if (local47 == 5510) {
															Static157.method2680();
															continue;
														}
														if (local47 == 5511) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local636 = local625 >> 14 & 0x3FFF;
															local875 = local625 & 0x3FFF;
															local636 -= Static290.anInt5497;
															Static101.anInt1895 = 4;
															local875 -= Static118.anInt2409;
															if (local875 < 0) {
																local875 = 0;
															} else if (local875 >= 104) {
																local875 = 104;
															}
															if (local636 < 0) {
																local636 = 0;
															} else if (local636 >= 104) {
																local636 = 104;
															}
															Static258.anInt5019 = local875 * 128 + 64;
															Static97.anInt1806 = local636 * 128 + 64;
															continue;
														}
														if (local47 == 5512) {
															Static156.method2665();
															continue;
														}
													} else if (local47 < 5700) {
														if (local47 == 5600) {
															local13 -= 2;
															local431 = Static27.aStringArray5[local13];
															local1635 = Static27.aStringArray5[local13 + 1];
															local5--;
															local875 = Static26.anIntArray42[local5];
															if (Static258.anInt5016 == 10 && Static152.anInt3136 == 0 && Static92.anInt1758 == 0 && Static31.anInt560 == 0 && Static130.anInt2576 == 0) {
																Static27.method485(local1635, local431, local875);
															}
															continue;
														}
														if (local47 == 5601) {
															Static267.method3971();
															continue;
														}
														if (local47 == 5602) {
															if (Static92.anInt1758 == 0) {
																Static213.anInt4207 = -2;
															}
															continue;
														}
														if (local47 == 5603) {
															local5 -= 4;
															if (Static258.anInt5016 == 10 && Static152.anInt3136 == 0 && Static92.anInt1758 == 0 && Static31.anInt560 == 0 && Static130.anInt2576 == 0) {
																Static216.method3404(Static26.anIntArray42[local5], Static26.anIntArray42[local5 + 1], Static26.anIntArray42[local5 + 3], Static26.anIntArray42[local5 + 2]);
															}
															continue;
														}
														if (local47 == 5604) {
															local13--;
															if (Static258.anInt5016 == 10 && Static152.anInt3136 == 0 && Static92.anInt1758 == 0 && Static31.anInt560 == 0 && Static130.anInt2576 == 0) {
																Static117.method1861(Static267.method3977(Static27.aStringArray5[local13]));
															}
															continue;
														}
														if (local47 == 5605) {
															local5 -= 7;
															local13 -= 3;
															if (Static258.anInt5016 == 10 && Static152.anInt3136 == 0 && Static92.anInt1758 == 0 && Static31.anInt560 == 0 && Static130.anInt2576 == 0) {
																Static303.method4526(Static26.anIntArray42[local5], Static26.anIntArray42[local5 + 5] == 1, Static26.anIntArray42[local5 + 4] == 1, Static27.aStringArray5[local13 + 1], Static26.anIntArray42[local5 + 1], Static26.anIntArray42[local5 + 2], Static26.anIntArray42[local5 + 3], Static27.aStringArray5[local13 + 2], Static267.method3977(Static27.aStringArray5[local13]), Static26.anIntArray42[local5 + 6] == 1);
															}
															continue;
														}
														if (local47 == 5606) {
															if (Static31.anInt560 == 0) {
																Static282.anInt5385 = -2;
															}
															continue;
														}
														if (local47 == 5607) {
															Static26.anIntArray42[local5++] = Static213.anInt4207;
															continue;
														}
														if (local47 == 5608) {
															Static26.anIntArray42[local5++] = Static290.anInt5498;
															continue;
														}
														if (local47 == 5609) {
															Static26.anIntArray42[local5++] = Static282.anInt5385;
															continue;
														}
														if (local47 == 5610) {
															for (local625 = 0; local625 < 5; local625++) {
																Static27.aStringArray5[local13++] = Static27.aStringArray4.length <= local625 ? "" : Static197.method3204(Static27.aStringArray4[local625]);
															}
															Static27.aStringArray4 = null;
															continue;
														}
														if (local47 == 5611) {
															Static26.anIntArray42[local5++] = Static38.anInt771;
															continue;
														}
													} else if (local47 < 6100) {
														if (local47 == 6001) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 1) {
																local625 = 1;
															}
															if (local625 > 4) {
																local625 = 4;
															}
															anInt5449 = local625;
															if (!Static291.aBoolean404 || !Static302.aBoolean419) {
																if (anInt5449 == 1) {
																	Static18.method317(0.9F);
																}
																if (anInt5449 == 2) {
																	Static18.method317(0.8F);
																}
																if (anInt5449 == 3) {
																	Static18.method317(0.7F);
																}
																if (anInt5449 == 4) {
																	Static18.method317(0.6F);
																}
															}
															if (Static291.aBoolean404) {
																Static175.method2925();
																if (!Static302.aBoolean419) {
																	Static309.method4585();
																}
															}
															Static282.method4199();
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6002) {
															local5--;
															Static9.method2418(Static26.anIntArray42[local5] == 1);
															Static44.method781();
															Static309.method4585();
															Static296.method4401();
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6003) {
															local5--;
															Static106.aBoolean159 = Static26.anIntArray42[local5] == 1;
															Static296.method4401();
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6005) {
															local5--;
															Static289.aBoolean394 = Static26.anIntArray42[local5] == 1;
															Static309.method4585();
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6006) {
															local5--;
															Static280.aBoolean383 = Static26.anIntArray42[local5] == 1;
															((Class74_Sub1) Static18.anInterface1_1).method1652(!Static280.aBoolean383);
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6007) {
															local5--;
															Static101.aBoolean145 = Static26.anIntArray42[local5] == 1;
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6008) {
															local5--;
															Static244.aBoolean348 = Static26.anIntArray42[local5] == 1;
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6009) {
															local5--;
															Static215.aBoolean288 = Static26.anIntArray42[local5] == 1;
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6010) {
															local5--;
															Static285.aBoolean387 = Static26.anIntArray42[local5] == 1;
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6011) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0 || local625 > 2) {
																local625 = 0;
															}
															Static143.anInt2823 = local625;
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6012) {
															if (Static291.aBoolean404) {
																Static207.method3280(0, 0);
															}
															local5--;
															Static302.aBoolean419 = Static26.anIntArray42[local5] == 1;
															if (Static291.aBoolean404 && Static302.aBoolean419) {
																Static18.method317(0.7F);
															} else {
																if (anInt5449 == 1) {
																	Static18.method317(0.9F);
																}
																if (anInt5449 == 2) {
																	Static18.method317(0.8F);
																}
																if (anInt5449 == 3) {
																	Static18.method317(0.7F);
																}
																if (anInt5449 == 4) {
																	Static18.method317(0.6F);
																}
															}
															Static309.method4585();
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6014) {
															local5--;
															Static311.aBoolean427 = Static26.anIntArray42[local5] == 1;
															if (Static291.aBoolean404) {
																Static309.method4585();
															}
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6015) {
															local5--;
															Static269.aBoolean27 = Static26.anIntArray42[local5] == 1;
															if (Static291.aBoolean404) {
																Static175.method2925();
															}
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6016) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0 || local625 > 2) {
																local625 = 0;
															}
															if (Static291.aBoolean404) {
																Static85.aBoolean122 = true;
															}
															Static37.anInt756 = local625;
															continue;
														}
														if (local47 == 6017) {
															local5--;
															Static119.aBoolean428 = Static26.anIntArray42[local5] == 1;
															Static176.method4595();
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6018) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0) {
																local625 = 0;
															}
															if (local625 > 127) {
																local625 = 127;
															}
															Static223.anInt4334 = local625;
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6019) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0) {
																local625 = 0;
															}
															if (local625 > 255) {
																local625 = 255;
															}
															if (Static311.anInt5846 != local625) {
																if (Static311.anInt5846 == 0 && Static142.anInt2796 != -1) {
																	Static251.method3840(Static142.anInt2796, local625, Static132.aClass138_42);
																	Static113.aBoolean168 = false;
																} else if (local625 == 0) {
																	Static254.method3871();
																	Static113.aBoolean168 = false;
																} else {
																	Static16.method214(local625);
																}
																Static311.anInt5846 = local625;
															}
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6020) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0) {
																local625 = 0;
															}
															if (local625 > 127) {
																local625 = 127;
															}
															Static315.anInt5926 = local625;
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															continue;
														}
														if (local47 == 6021) {
															local5--;
															Static61.aBoolean100 = Static26.anIntArray42[local5] == 1;
															Static296.method4401();
															continue;
														}
														if (local47 == 6023) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0) {
																local625 = 0;
															}
															if (local625 > 2) {
																local625 = 2;
															}
															local6553 = false;
															if (Static83.anInt1516 < 96) {
																local6553 = true;
																local625 = 0;
															}
															Static149.method2407(local625);
															Static80.method1224(Static117.aClass117_3);
															Static152.aBoolean228 = false;
															Static26.anIntArray42[local5++] = local6553 ? 0 : 1;
															continue;
														}
														if (local47 == 6024) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0 || local625 > 2) {
																local625 = 0;
															}
															Static114.anInt2269 = local625;
															Static80.method1224(Static117.aClass117_3);
															continue;
														}
														if (local47 == 6027) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (!Static291.aBoolean404) {
																continue;
															}
															if (local625 < 0 || local625 > 1) {
																local625 = 0;
															}
															Static54.method932(local625 == 1);
															continue;
														}
														if (local47 == 6028) {
															local5--;
															Static131.aBoolean192 = Static26.anIntArray42[local5] != 0;
															Static80.method1224(Static117.aClass117_3);
															continue;
														}
													} else if (local47 < 6200) {
														if (local47 == 6101) {
															Static26.anIntArray42[local5++] = anInt5449;
															continue;
														}
														if (local47 == 6102) {
															Static26.anIntArray42[local5++] = Static62.method1046() ? 1 : 0;
															continue;
														}
														if (local47 == 6103) {
															Static26.anIntArray42[local5++] = Static106.aBoolean159 ? 1 : 0;
															continue;
														}
														if (local47 == 6105) {
															Static26.anIntArray42[local5++] = Static289.aBoolean394 ? 1 : 0;
															continue;
														}
														if (local47 == 6106) {
															Static26.anIntArray42[local5++] = Static280.aBoolean383 ? 1 : 0;
															continue;
														}
														if (local47 == 6107) {
															Static26.anIntArray42[local5++] = Static101.aBoolean145 ? 1 : 0;
															continue;
														}
														if (local47 == 6108) {
															Static26.anIntArray42[local5++] = Static244.aBoolean348 ? 1 : 0;
															continue;
														}
														if (local47 == 6109) {
															Static26.anIntArray42[local5++] = Static215.aBoolean288 ? 1 : 0;
															continue;
														}
														if (local47 == 6110) {
															Static26.anIntArray42[local5++] = Static285.aBoolean387 ? 1 : 0;
															continue;
														}
														if (local47 == 6111) {
															Static26.anIntArray42[local5++] = Static143.anInt2823;
															continue;
														}
														if (local47 == 6112) {
															Static26.anIntArray42[local5++] = Static302.aBoolean419 ? 1 : 0;
															continue;
														}
														if (local47 == 6114) {
															Static26.anIntArray42[local5++] = Static311.aBoolean427 ? 1 : 0;
															continue;
														}
														if (local47 == 6115) {
															Static26.anIntArray42[local5++] = Static269.aBoolean27 ? 1 : 0;
															continue;
														}
														if (local47 == 6116) {
															Static26.anIntArray42[local5++] = Static37.anInt756;
															continue;
														}
														if (local47 == 6117) {
															Static26.anIntArray42[local5++] = Static119.aBoolean428 ? 1 : 0;
															continue;
														}
														if (local47 == 6118) {
															Static26.anIntArray42[local5++] = Static223.anInt4334;
															continue;
														}
														if (local47 == 6119) {
															Static26.anIntArray42[local5++] = Static311.anInt5846;
															continue;
														}
														if (local47 == 6120) {
															Static26.anIntArray42[local5++] = Static315.anInt5926;
															continue;
														}
														if (local47 == 6121) {
															if (Static291.aBoolean404) {
																Static26.anIntArray42[local5++] = Static291.aBoolean409 ? 1 : 0;
															} else {
																Static26.anIntArray42[local5++] = 0;
															}
															continue;
														}
														if (local47 == 6123) {
															Static26.anIntArray42[local5++] = Static149.method2401();
															continue;
														}
														if (local47 == 6124) {
															Static26.anIntArray42[local5++] = Static114.anInt2269;
															continue;
														}
														if (local47 == 6126) {
															if (Static291.aBoolean404) {
																Static26.anIntArray42[local5++] = Static266.method3957() ? 1 : 0;
															} else {
																Static26.anIntArray42[local5++] = 0;
															}
															continue;
														}
														if (local47 == 6127) {
															Static26.anIntArray42[local5++] = Static5.aBoolean1 ? 1 : 0;
															continue;
														}
														if (local47 == 6128) {
															Static26.anIntArray42[local5++] = Static131.aBoolean192 ? 1 : 0;
															continue;
														}
													} else if (local47 < 6300) {
														if (local47 == 6200) {
															local5 -= 2;
															Static222.aShort23 = (short) Static26.anIntArray42[local5];
															if (Static222.aShort23 <= 0) {
																Static222.aShort23 = 256;
															}
															Static117.aShort12 = (short) Static26.anIntArray42[local5 + 1];
															if (Static117.aShort12 <= 0) {
																Static117.aShort12 = 205;
															}
															continue;
														}
														if (local47 == 6201) {
															local5 -= 2;
															Static256.aShort39 = (short) Static26.anIntArray42[local5];
															if (Static256.aShort39 <= 0) {
																Static256.aShort39 = 256;
															}
															Static230.aShort38 = (short) Static26.anIntArray42[local5 + 1];
															if (Static230.aShort38 <= 0) {
																Static230.aShort38 = 320;
															}
															continue;
														}
														if (local47 == 6202) {
															local5 -= 4;
															Static23.aShort1 = (short) Static26.anIntArray42[local5];
															if (Static23.aShort1 <= 0) {
																Static23.aShort1 = 1;
															}
															Static280.aShort48 = (short) Static26.anIntArray42[local5 + 1];
															if (Static280.aShort48 <= 0) {
																Static280.aShort48 = 32767;
															} else if (Static23.aShort1 > Static280.aShort48) {
																Static280.aShort48 = Static23.aShort1;
															}
															Static183.aShort21 = (short) Static26.anIntArray42[local5 + 2];
															if (Static183.aShort21 <= 0) {
																Static183.aShort21 = 1;
															}
															Static304.aShort49 = (short) Static26.anIntArray42[local5 + 3];
															if (Static304.aShort49 <= 0) {
																Static304.aShort49 = 32767;
															} else if (Static183.aShort21 > Static304.aShort49) {
																Static304.aShort49 = Static183.aShort21;
															}
															continue;
														}
														if (local47 == 6203) {
															Static159.method2694(0, Static235.aClass146_15.anInt4371, false, 0, Static235.aClass146_15.anInt4345);
															Static26.anIntArray42[local5++] = Static279.anInt5297;
															Static26.anIntArray42[local5++] = Static260.anInt5033;
															continue;
														}
														if (local47 == 6204) {
															Static26.anIntArray42[local5++] = Static256.aShort39;
															Static26.anIntArray42[local5++] = Static230.aShort38;
															continue;
														}
														if (local47 == 6205) {
															Static26.anIntArray42[local5++] = Static222.aShort23;
															Static26.anIntArray42[local5++] = Static117.aShort12;
															continue;
														}
													} else if (local47 < 6400) {
														if (local47 == 6300) {
															Static26.anIntArray42[local5++] = (int) (Static135.method2186() / 60000L);
															continue;
														}
														if (local47 == 6301) {
															Static26.anIntArray42[local5++] = (int) (Static135.method2186() / 86400000L) - 11745;
															continue;
														}
														if (local47 == 6302) {
															local5 -= 3;
															local625 = Static26.anIntArray42[local5];
															local636 = Static26.anIntArray42[local5 + 1];
															local875 = Static26.anIntArray42[local5 + 2];
															Static111.aCalendar2.clear();
															Static111.aCalendar2.set(11, 12);
															Static111.aCalendar2.set(local875, local636, local625);
															Static26.anIntArray42[local5++] = (int) (Static111.aCalendar2.getTime().getTime() / 86400000L) - 11745;
															continue;
														}
														if (local47 == 6303) {
															Static111.aCalendar2.clear();
															Static111.aCalendar2.setTime(new Date(Static135.method2186()));
															Static26.anIntArray42[local5++] = Static111.aCalendar2.get(1);
															continue;
														}
														if (local47 == 6304) {
															local6553 = true;
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (local625 < 0) {
																local6553 = (local625 + 1) % 4 == 0;
															} else if (local625 < 1582) {
																local6553 = local625 % 4 == 0;
															} else if (local625 % 4 != 0) {
																local6553 = false;
															} else if (local625 % 100 != 0) {
																local6553 = true;
															} else if (local625 % 400 != 0) {
																local6553 = false;
															}
															Static26.anIntArray42[local5++] = local6553 ? 1 : 0;
															continue;
														}
													} else if (local47 < 6500) {
														if (local47 == 6405) {
															Static26.anIntArray42[local5++] = Static278.method4121() ? 1 : 0;
															continue;
														}
														if (local47 == 6406) {
															Static26.anIntArray42[local5++] = Static217.method3429() ? 1 : 0;
															continue;
														}
													} else if (local47 < 6600) {
														if (local47 == 6500) {
															if (Static258.anInt5016 == 10 && Static152.anInt3136 == 0 && Static92.anInt1758 == 0 && Static31.anInt560 == 0) {
																Static26.anIntArray42[local5++] = Static6.method96() == -1 ? 0 : 1;
																continue;
															}
															Static26.anIntArray42[local5++] = 1;
															continue;
														}
														@Pc(9010) Class154 local9010;
														@Pc(8953) Class182_Sub1 local8953;
														if (local47 == 6501) {
															local8953 = Static190.method3115();
															if (local8953 == null) {
																Static26.anIntArray42[local5++] = -1;
																Static26.anIntArray42[local5++] = 0;
																Static27.aStringArray5[local13++] = "";
																Static26.anIntArray42[local5++] = 0;
																Static27.aStringArray5[local13++] = "";
																Static26.anIntArray42[local5++] = 0;
															} else {
																Static26.anIntArray42[local5++] = local8953.anInt5535;
																Static26.anIntArray42[local5++] = local8953.anInt5530;
																Static27.aStringArray5[local13++] = local8953.aString188;
																local9010 = local8953.method4346();
																Static26.anIntArray42[local5++] = local9010.anInt4867;
																Static27.aStringArray5[local13++] = local9010.aString162;
																Static26.anIntArray42[local5++] = local8953.anInt5529;
															}
															continue;
														}
														if (local47 == 6502) {
															local8953 = Static34.method581();
															if (local8953 == null) {
																Static26.anIntArray42[local5++] = -1;
																Static26.anIntArray42[local5++] = 0;
																Static27.aStringArray5[local13++] = "";
																Static26.anIntArray42[local5++] = 0;
																Static27.aStringArray5[local13++] = "";
																Static26.anIntArray42[local5++] = 0;
															} else {
																Static26.anIntArray42[local5++] = local8953.anInt5535;
																Static26.anIntArray42[local5++] = local8953.anInt5530;
																Static27.aStringArray5[local13++] = local8953.aString188;
																local9010 = local8953.method4346();
																Static26.anIntArray42[local5++] = local9010.anInt4867;
																Static27.aStringArray5[local13++] = local9010.aString162;
																Static26.anIntArray42[local5++] = local8953.anInt5529;
															}
															continue;
														}
														if (local47 == 6503) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															if (Static258.anInt5016 == 10 && Static152.anInt3136 == 0 && Static92.anInt1758 == 0 && Static31.anInt560 == 0) {
																Static26.anIntArray42[local5++] = Static23.method451(local625) ? 1 : 0;
																continue;
															}
															Static26.anIntArray42[local5++] = 0;
															continue;
														}
														if (local47 == 6504) {
															local5--;
															Static12.anInt192 = Static26.anIntArray42[local5];
															Static80.method1224(Static117.aClass117_3);
															continue;
														}
														if (local47 == 6505) {
															Static26.anIntArray42[local5++] = Static12.anInt192;
															continue;
														}
														if (local47 == 6506) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															@Pc(9199) Class182_Sub1 local9199 = Static40.method720(local625);
															if (local9199 == null) {
																Static26.anIntArray42[local5++] = -1;
																Static27.aStringArray5[local13++] = "";
																Static26.anIntArray42[local5++] = 0;
																Static27.aStringArray5[local13++] = "";
																Static26.anIntArray42[local5++] = 0;
															} else {
																Static26.anIntArray42[local5++] = local9199.anInt5530;
																Static27.aStringArray5[local13++] = local9199.aString188;
																@Pc(9218) Class154 local9218 = local9199.method4346();
																Static26.anIntArray42[local5++] = local9218.anInt4867;
																Static27.aStringArray5[local13++] = local9218.aString162;
																Static26.anIntArray42[local5++] = local9199.anInt5529;
															}
															continue;
														}
														if (local47 == 6507) {
															local5 -= 4;
															local875 = Static26.anIntArray42[local5 + 2];
															local625 = Static26.anIntArray42[local5];
															local6553 = Static26.anIntArray42[local5 + 1] == 1;
															local7050 = Static26.anIntArray42[local5 + 3] == 1;
															Static107.method1777(local6553, local875, local7050, local625);
															continue;
														}
													} else if (local47 < 6700) {
														if (local47 == 6600) {
															local5--;
															Static51.aBoolean77 = Static26.anIntArray42[local5] == 1;
															Static80.method1224(Static117.aClass117_3);
															continue;
														}
														if (local47 == 6601) {
															Static26.anIntArray42[local5++] = Static51.aBoolean77 ? 1 : 0;
															continue;
														}
													} else if (local47 < 6900) {
														@Pc(8816) Class81 local8816;
														if (local47 == 6800) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local8816 = Static50.method874(local625);
															if (local8816.aString84 == null) {
																Static27.aStringArray5[local13++] = "";
															} else {
																Static27.aStringArray5[local13++] = local8816.aString84;
															}
															continue;
														}
														if (local47 == 6801) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local8816 = Static50.method874(local625);
															Static26.anIntArray42[local5++] = local8816.anInt2196;
															continue;
														}
														if (local47 == 6802) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local8816 = Static50.method874(local625);
															Static26.anIntArray42[local5++] = local8816.anInt2200;
															continue;
														}
														if (local47 == 6803) {
															local5--;
															local625 = Static26.anIntArray42[local5];
															local8816 = Static50.method874(local625);
															Static26.anIntArray42[local5++] = local8816.anInt2195;
															continue;
														}
													}
												} else {
													if (local47 == 5100) {
														if (Static88.aBooleanArray16[86]) {
															Static26.anIntArray42[local5++] = 1;
														} else {
															Static26.anIntArray42[local5++] = 0;
														}
														continue;
													}
													if (local47 == 5101) {
														if (Static88.aBooleanArray16[82]) {
															Static26.anIntArray42[local5++] = 1;
														} else {
															Static26.anIntArray42[local5++] = 0;
														}
														continue;
													}
													if (local47 == 5102) {
														if (Static88.aBooleanArray16[81]) {
															Static26.anIntArray42[local5++] = 1;
														} else {
															Static26.anIntArray42[local5++] = 0;
														}
														continue;
													}
												}
											} else if (local47 == 4400) {
												local5 -= 2;
												local625 = Static26.anIntArray42[local5];
												local636 = Static26.anIntArray42[local5 + 1];
												local4692 = Static217.method3426(local636);
												if (local4692.method3170()) {
													Static27.aStringArray5[local13++] = Static189.method3080(local625).method1012(local4692.aString133, local636);
												} else {
													Static26.anIntArray42[local5++] = Static189.method3080(local625).method1006(local636, local4692.anInt3964);
												}
												continue;
											}
										} else if (local47 == 4300) {
											local5 -= 2;
											local636 = Static26.anIntArray42[local5 + 1];
											local625 = Static26.anIntArray42[local5];
											local4692 = Static217.method3426(local636);
											if (local4692.method3170()) {
												Static27.aStringArray5[local13++] = Static195.method3169(local625).method2825(local636, local4692.aString133);
											} else {
												Static26.anIntArray42[local5++] = Static195.method3169(local625).method2821(local636, local4692.anInt3964);
											}
											continue;
										}
									}
								} else {
									if (local47 == 4000) {
										local5 -= 2;
										local636 = Static26.anIntArray42[local5 + 1];
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = local636 + local625;
										continue;
									}
									if (local47 == 4001) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = local625 - local636;
										continue;
									}
									if (local47 == 4002) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = local636 * local625;
										continue;
									}
									if (local47 == 4003) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = local625 / local636;
										continue;
									}
									if (local47 == 4004) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = (int) (Math.random() * (double) local625);
										continue;
									}
									if (local47 == 4005) {
										local5--;
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = (int) ((double) (local625 + 1) * Math.random());
										continue;
									}
									if (local47 == 4006) {
										local5 -= 5;
										local625 = Static26.anIntArray42[local5];
										local875 = Static26.anIntArray42[local5 + 2];
										local636 = Static26.anIntArray42[local5 + 1];
										local479 = Static26.anIntArray42[local5 + 3];
										local1698 = Static26.anIntArray42[local5 + 4];
										Static26.anIntArray42[local5++] = (local636 - local625) * (local1698 - local875) / (local479 - local875) + local625;
										continue;
									}
									@Pc(11819) long local11819;
									@Pc(11824) long local11824;
									if (local47 == 4007) {
										local5 -= 2;
										local11819 = Static26.anIntArray42[local5 + 1];
										local11824 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = (int) (local11824 * local11819 / 100L + local11824);
										continue;
									}
									if (local47 == 4008) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = 0x1 << local636 | local625;
										continue;
									}
									if (local47 == 4009) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = -(0x1 << local636) - 1 & local625;
										continue;
									}
									if (local47 == 4010) {
										local5 -= 2;
										local636 = Static26.anIntArray42[local5 + 1];
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = (0x1 << local636 & local625) == 0 ? 0 : 1;
										continue;
									}
									if (local47 == 4011) {
										local5 -= 2;
										local636 = Static26.anIntArray42[local5 + 1];
										local625 = Static26.anIntArray42[local5];
										Static26.anIntArray42[local5++] = local625 % local636;
										continue;
									}
									if (local47 == 4012) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										if (local625 == 0) {
											Static26.anIntArray42[local5++] = 0;
										} else {
											Static26.anIntArray42[local5++] = (int) Math.pow((double) local625, (double) local636);
										}
										continue;
									}
									if (local47 == 4013) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										if (local625 == 0) {
											Static26.anIntArray42[local5++] = 0;
										} else if (local636 == 0) {
											Static26.anIntArray42[local5++] = Integer.MAX_VALUE;
										} else {
											Static26.anIntArray42[local5++] = (int) Math.pow((double) local625, 1.0D / (double) local636);
										}
										continue;
									}
									if (local47 == 4014) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = local636 & local625;
										continue;
									}
									if (local47 == 4015) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = local625 | local636;
										continue;
									}
									if (local47 == 4016) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = local625 < local636 ? local625 : local636;
										continue;
									}
									if (local47 == 4017) {
										local5 -= 2;
										local625 = Static26.anIntArray42[local5];
										local636 = Static26.anIntArray42[local5 + 1];
										Static26.anIntArray42[local5++] = local625 <= local636 ? local636 : local625;
										continue;
									}
									if (local47 == 4018) {
										local5 -= 3;
										local11819 = Static26.anIntArray42[local5 + 1];
										local11824 = Static26.anIntArray42[local5];
										@Pc(12177) long local12177 = (long) Static26.anIntArray42[local5 + 2];
										Static26.anIntArray42[local5++] = (int) (local12177 * local11824 / local11819);
										continue;
									}
								}
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15377) Exception local15377) {
			if (arg1.aString113 == null) {
				if (Static210.anInt4148 != 0) {
					Static199.method3219("Clientscript error - check log for details");
				}
				Static195.method3178("CS2 - scr:" + arg1.aLong223 + " op:" + local21, local15377);
			} else {
				@Pc(15410) StringBuffer local15410 = new StringBuffer(30);
				local15410.append("%0a - in: ").append(arg1.aString113);
				for (local625 = Static198.anInt3991 - 1; local625 >= 0; local625--) {
					local15410.append("%0a - via: ").append(Static159.aClass85Array1[local625].aClass1_Sub1_Sub14_1.aString113);
				}
				if (local21 == 40) {
					local625 = local19[local7];
					local15410.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local625));
				}
				if (Static210.anInt4148 != 0) {
					Static199.method3219("Clientscript error in: " + arg1.aString113);
				}
				Static195.method3178("CS2 - scr:" + arg1.aLong223 + " op:" + local21 + local15410.toString(), local15377);
			}
		}
	}
}
