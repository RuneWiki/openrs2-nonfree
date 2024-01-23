import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "Lclient!nm;")
	public static Class119 aClass119_74;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!nm;")
	public static Class119 aClass119_75;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[8];

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	public static int anInt4086 = 100;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	public static void method3528() {
		Static273.aClass175_41.method4288(5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method3529(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(20) byte[] local20 = (byte[]) arg0;
			return arg1 ? Static195.method3366(local20) : local20;
		} else if (arg0 instanceof Class114) {
			@Pc(34) Class114 local34 = (Class114) arg0;
			return local34.method3131();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method3530() {
		Static145.aClass175_22.method4294();
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I")
	public static int method3531(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(31) int local31 = local21 | local21 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return arg0 & ~local37;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)V")
	public static void method3533(@OriginalArg(0) int arg0) {
		Static73.anInt1575 = 100;
		Static48.anInt1079 = arg0;
		Static225.anInt4217 = -1;
		Static145.anInt2809 = 3;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
	public static void method3534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class1_Sub5_Sub21 local17 = Static278.method4266(4, arg3);
		local17.method4062();
		local17.anInt4864 = arg2;
		local17.anInt4863 = arg0;
		local17.anInt4862 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([[B[[F[[I[[I[[I[[B[[[I[[F[[[BZ[[II[[B[[F[[I[[B)[Lclient!jb;")
	public static Class1_Sub15[] method3535(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[][][] arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) byte[][][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int[][] arg13, @OriginalArg(15) byte[][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(16) int local16;
		@Pc(23) int local23;
		@Pc(61) byte local61;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local16 = 1; local16 <= 103; local16++) {
				local23 = 0;
				if (arg6 != null) {
					@Pc(39) int local39 = arg6[arg10][local11 >> 3][local16 >> 3];
					local23 = local39 >> 1 & 0x3;
				}
				if (local23 == 0) {
					local61 = arg5[local11][local16];
					if (local61 == 0) {
						local61 = arg5[local11 - 1][local16];
					}
					if (local61 == 0) {
						local61 = arg5[local11][local16 - 1];
					}
					if (local61 == 0) {
						local61 = arg5[local11 - 1][local16 - 1];
					}
				} else if (local23 == 1) {
					local61 = arg5[local11][local16 - 1];
					if (local61 == 0) {
						local61 = arg5[local11][local16];
					}
					if (local61 == 0) {
						local61 = arg5[local11 - 1][local16 - 1];
					}
					if (local61 == 0) {
						local61 = arg5[local11 - 1][local16];
					}
				} else if (local23 == 2) {
					local61 = arg5[local11 - 1][local16 - 1];
					if (local61 == 0) {
						local61 = arg5[local11][local16 - 1];
					}
					if (local61 == 0) {
						local61 = arg5[local11 - 1][local16];
					}
					if (local61 == 0) {
						local61 = arg5[local11][local16];
					}
				} else {
					local61 = arg5[local11 - 1][local16];
					if (local61 == 0) {
						local61 = arg5[local11 - 1][local16 - 1];
					}
					if (local61 == 0) {
						local61 = arg5[local11][local16];
					}
					if (local61 == 0) {
						local61 = arg5[local11][local16 - 1];
					}
				}
				if (local61 != 0) {
					@Pc(257) Class65 local257 = Static233.method3753((local61 & 0xFF) - 1);
					local9[local11][local16] = local257.anInt1882 + (local257.anInt1881 + 1 << 16);
				}
			}
		}
		@Pc(282) Class86 local282 = new Class86(128);
		@Pc(357) int local357;
		@Pc(351) int local351;
		@Pc(333) int local333;
		for (local16 = 1; local16 <= 102; local16++) {
			for (local23 = 1; local23 <= 102; local23++) {
				if (arg5[local16][local23] != 0) {
					@Pc(316) int[] local316;
					if (arg11[local16][local23] == 0) {
						local316 = Static47.anIntArrayArray8[0];
					} else {
						local316 = Static181.anIntArrayArray25[arg14[local16][local23]];
						if (local316.length == 0) {
							continue;
						}
					}
					local333 = 0;
					if (arg9 != null) {
						local333 = arg9[local16][local23] & 0xFFFFFF;
					}
					local351 = local9[local16 + 1][local23];
					local357 = local9[local16][local23];
					@Pc(367) int local367 = local9[local16 + 1][local23 + 1];
					@Pc(375) int local375 = local9[local16][local23 + 1];
					@Pc(383) long local383 = (long) local333 | (long) local357 << 32;
					@Pc(391) long local391 = (long) local367 << 32 | (long) local333;
					@Pc(399) long local399 = (long) local333 | (long) local351 << 32;
					@Pc(404) int local404 = local316.length / 2;
					@Pc(412) long local412 = (long) local375 << 32 | (long) local333;
					@Pc(418) Class1_Sub15 local418 = (Class1_Sub15) local282.method2136(local383);
					if (local418 == null) {
						local418 = new Class1_Sub15((local357 >> 16) - 1, (float) (local357 & 0xFFFF), false, arg4 != null, local333);
						local282.method2144(local418, local383);
					}
					local418.anInt2506++;
					local418.anInt2504 += local404;
					if (local383 != local399) {
						local418 = (Class1_Sub15) local282.method2136(local399);
						if (local418 == null) {
							local418 = new Class1_Sub15((local351 >> 16) - 1, (float) (local351 & 0xFFFF), false, arg4 != null, local333);
							local282.method2144(local418, local399);
						}
						local418.anInt2504 += local404;
						local418.anInt2506++;
					}
					if (local391 != local383 && local391 != local399) {
						local418 = (Class1_Sub15) local282.method2136(local391);
						if (local418 == null) {
							local418 = new Class1_Sub15((local367 >> 16) - 1, (float) (local367 & 0xFFFF), false, arg4 != null, local333);
							local282.method2144(local418, local391);
						}
						local418.anInt2506++;
						local418.anInt2504 += local404;
					}
					if (local383 != local412 && local412 != local399 && local412 != local391) {
						local418 = (Class1_Sub15) local282.method2136(local412);
						if (local418 == null) {
							local418 = new Class1_Sub15((local375 >> 16) - 1, (float) (local375 & 0xFFFF), false, arg4 != null, local333);
							local282.method2144(local418, local412);
						}
						local418.anInt2504 += local404;
						local418.anInt2506++;
					}
				}
			}
		}
		@Pc(642) Class1_Sub15 local642;
		for (local642 = (Class1_Sub15) local282.method2134(); local642 != null; local642 = (Class1_Sub15) local282.method2141()) {
			local642.method2223();
		}
		for (local16 = 1; local16 <= 102; local16++) {
			for (local23 = 1; local23 <= 102; local23++) {
				local61 = arg5[local16][local23];
				if (local61 != 0) {
					if ((arg8[arg10][local16][local23] & 0x8) != 0) {
						local333 = 0;
					} else if ((arg8[1][local16][local23] & 0x2) == 2 && arg10 > 0) {
						local333 = arg10 - 1;
					} else {
						local333 = arg10;
					}
					local357 = 0;
					local351 = 128;
					if (arg9 != null) {
						local357 = arg9[local16][local23] & 0xFFFFFF;
						local351 = arg9[local16][local23] >>> 24 << 3;
					}
					@Pc(737) boolean[] local737 = null;
					@Pc(821) int local821;
					@Pc(804) int local804;
					@Pc(768) int[] local768;
					@Pc(752) byte local752;
					@Pc(863) int local863;
					@Pc(842) int local842;
					if (arg11[local16][local23] == 0) {
						local768 = Static47.anIntArrayArray8[0];
						local804 = local61 == arg5[local16 + 1][local23 + 1] ? 1 : -1;
						local821 = arg5[local16 - 1][local23 - 1] == local61 ? 1 : -1;
						local842 = local61 == arg5[local16 - 1][local23 + 1] ? 1 : -1;
						local863 = arg5[local16 + 1][local23 - 1] == local61 ? 1 : -1;
						if (local61 == arg5[local16][local23 - 1]) {
							local863++;
							local821++;
						} else {
							local821--;
							local863--;
						}
						if (local61 == arg5[local16 + 1][local23]) {
							local804++;
							local863++;
						} else {
							local863--;
							local804--;
						}
						if (local61 == arg5[local16][local23 + 1]) {
							local804++;
							local842++;
						} else {
							local804--;
							local842--;
						}
						if (arg5[local16 - 1][local23] == local61) {
							local821++;
							local842++;
						} else {
							local821--;
							local842--;
						}
						@Pc(928) int local928 = local821 - local804;
						if (local928 < 0) {
							local928 = -local928;
						}
						@Pc(942) int local942 = local863 - local842;
						if (local942 < 0) {
							local942 = -local942;
						}
						local752 = (byte) (local928 < local942 ? 1 : 0);
						arg0[local16][local23] = local752;
					} else {
						local752 = arg0[local16][local23];
						local737 = Static310.aBooleanArrayArray4[arg14[local16][local23]];
						local768 = Static181.anIntArrayArray25[arg14[local16][local23]];
						if (local768.length == 0) {
							continue;
						}
					}
					local821 = local9[local16][local23];
					local804 = local9[local16 + 1][local23 + 1];
					local842 = local9[local16][local23 + 1];
					local863 = local9[local16 + 1][local23];
					@Pc(1004) long local1004 = (long) local357 | (long) local863 << 32;
					@Pc(1012) long local1012 = (long) local357 | (long) local821 << 32;
					@Pc(1020) long local1020 = (long) local357 | (long) local804 << 32;
					@Pc(1028) long local1028 = (long) local357 | (long) local842 << 32;
					@Pc(1034) int local1034 = arg13[local16][local23];
					@Pc(1042) int local1042 = arg13[local16 + 1][local23];
					@Pc(1050) int local1050 = arg13[local16][local23 + 1];
					@Pc(1060) int local1060 = arg13[local16 + 1][local23 + 1];
					@Pc(1066) int local1066 = arg3[local16][local23];
					@Pc(1074) int local1074 = arg3[local16 + 1][local23];
					@Pc(1084) int local1084 = arg3[local16 + 1][local23 + 1];
					@Pc(1092) int local1092 = arg3[local16][local23 + 1];
					@Pc(1098) int local1098 = (local821 >> 16) - 1;
					@Pc(1104) int local1104 = (local863 >> 16) - 1;
					@Pc(1110) int local1110 = (local842 >> 16) - 1;
					@Pc(1116) Class1_Sub15 local1116 = (Class1_Sub15) local282.method2136(local1012);
					Static103.method1980(arg2, arg1, local821 <= local821, local351, local333, Static272.method4180(local1098, local1050, local1092), local768, Static272.method4180(local1098, local1034, local1066), local1116, local821 <= local863, local23, local752, local16, Static272.method4180(local1098, local1060, local1084), Static272.method4180(local1098, local1042, local1074), local737, local821 <= local804, arg7, arg4, arg12, local842 >= local821);
					@Pc(1197) int local1197 = (local804 >> 16) - 1;
					if (local1004 != local1012) {
						local1116 = (Class1_Sub15) local282.method2136(local1004);
						Static103.method1980(arg2, arg1, local821 >= local863, local351, local333, Static272.method4180(local1104, local1050, local1092), local768, Static272.method4180(local1104, local1034, local1066), local1116, local863 <= local863, local23, local752, local16, Static272.method4180(local1104, local1060, local1084), Static272.method4180(local1104, local1042, local1074), local737, local804 >= local863, arg7, arg4, arg12, local863 <= local842);
					}
					if (local1020 != local1012 && local1020 != local1004) {
						local1116 = (Class1_Sub15) local282.method2136(local1020);
						Static103.method1980(arg2, arg1, local804 <= local821, local351, local333, Static272.method4180(local1197, local1050, local1092), local768, Static272.method4180(local1197, local1034, local1066), local1116, local863 >= local804, local23, local752, local16, Static272.method4180(local1197, local1060, local1084), Static272.method4180(local1197, local1042, local1074), local737, local804 <= local804, arg7, arg4, arg12, local842 >= local804);
					}
					if (local1028 != local1012 && local1028 != local1004 && local1020 != local1028) {
						local1116 = (Class1_Sub15) local282.method2136(local1028);
						Static103.method1980(arg2, arg1, local821 >= local842, local351, local333, Static272.method4180(local1110, local1050, local1092), local768, Static272.method4180(local1110, local1034, local1066), local1116, local863 >= local842, local23, local752, local16, Static272.method4180(local1110, local1060, local1084), Static272.method4180(local1110, local1042, local1074), local737, local842 <= local804, arg7, arg4, arg12, local842 >= local842);
					}
				}
			}
		}
		for (local642 = (Class1_Sub15) local282.method2134(); local642 != null; local642 = (Class1_Sub15) local282.method2141()) {
			if (local642.anInt2501 == 0) {
				local642.method4573();
			} else {
				local642.method2224();
			}
		}
		local16 = local282.method2135();
		@Pc(1494) Class1_Sub15[] local1494 = new Class1_Sub15[local16];
		@Pc(1497) long[] local1497 = new long[local16];
		local282.method2137(local1494);
		for (local333 = 0; local333 < local16; local333++) {
			local1497[local333] = local1494[local333].aLong210;
		}
		Static270.method4172(local1497, local1494);
		return local1494;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	public static void method3536() {
		if (Static97.aClass49_2 != null) {
			Static97.aClass49_2.method1307();
			Static97.aClass49_2 = null;
		}
		Static76.method3988();
		Static203.method2967();
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			Static122.aClass60Array1[local17].method1700();
		}
		Static261.method4039(false);
		System.gc();
		Static24.method473();
		Static226.anInt4236 = -1;
		Static197.aBoolean347 = false;
		Static66.method1154(true);
		Static135.anInt2659 = 0;
		Static133.anInt2638 = 0;
		Static222.aBoolean378 = false;
		Static130.anInt2581 = 0;
		Static38.anInt714 = 0;
		for (local17 = 0; local17 < Static160.aClass80Array1.length; local17++) {
			Static160.aClass80Array1[local17] = null;
		}
		Static275.anInt5043 = 0;
		Static1.anInt48 = 0;
		for (local17 = 0; local17 < 2048; local17++) {
			Static14.aClass11_Sub4_Sub1Array1[local17] = null;
			Static197.aClass1_Sub13Array1[local17] = null;
		}
		for (local17 = 0; local17 < 32768; local17++) {
			Static138.aClass11_Sub4_Sub2Array2[local17] = null;
		}
		for (local17 = 0; local17 < 4; local17++) {
			for (@Pc(116) int local116 = 0; local116 < 104; local116++) {
				for (@Pc(121) int local121 = 0; local121 < 104; local121++) {
					Static203.aClass96ArrayArrayArray5[local17][local116][local121] = null;
				}
			}
		}
		Static296.method716();
		Static82.anInt1827 = 0;
		Static265.method4105();
		Static124.method563(true);
		try {
			Static320.method2266("loggedout", Static222.aClass176_3.anApplet1);
		} catch (@Pc(158) Throwable local158) {
		}
	}
}
