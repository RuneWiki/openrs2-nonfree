import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public static int anInt2446;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "J")
	public static long aLong79 = 0L;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!bd;")
	public static Class2_Sub7 aClass2_Sub7_2 = new Class2_Sub7(0, -1);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method1814() {
		for (@Pc(3) int local3 = -1; local3 < Static191.anInt4008; local3++) {
			@Pc(19) int local19;
			if (local3 == -1) {
				local19 = 2047;
			} else {
				local19 = Static246.anIntArray479[local3];
			}
			@Pc(29) Class15_Sub2_Sub2 local29 = Static188.aClass15_Sub2_Sub2Array41[local19];
			if (local29 != null) {
				Static269.method4264(local29, local29.method4286());
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!oe;)Lclient!b;")
	public static Class13_Sub1 method1816(@OriginalArg(1) Class2_Sub16 arg0) {
		return new Class13_Sub1(arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2166(), arg0.method2166(), arg0.method2146());
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[[F[[B[[F[[I[[BI[[B[[[B[[I[[I[[I[[F[[B[[I[[[I)[Lclient!wl;")
	public static Class2_Sub32[] method1818(@OriginalArg(0) int arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][][] arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) int[][] arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) byte[][] arg12, @OriginalArg(14) int[][] arg13, @OriginalArg(15) int[][][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(16) int local16;
		@Pc(23) int local23;
		@Pc(62) byte local62;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local16 = 1; local16 <= 103; local16++) {
				local23 = 0;
				if (arg14 != null) {
					@Pc(38) int local38 = arg14[arg0][local11 >> 3][local16 >> 3];
					local23 = local38 >> 1 & 0x3;
				}
				if (local23 == 0) {
					local62 = arg6[local11][local16];
					if (local62 == 0) {
						local62 = arg6[local11 - 1][local16];
					}
					if (local62 == 0) {
						local62 = arg6[local11][local16 - 1];
					}
					if (local62 == 0) {
						local62 = arg6[local11 - 1][local16 - 1];
					}
				} else if (local23 == 1) {
					local62 = arg6[local11][local16 - 1];
					if (local62 == 0) {
						local62 = arg6[local11][local16];
					}
					if (local62 == 0) {
						local62 = arg6[local11 - 1][local16 - 1];
					}
					if (local62 == 0) {
						local62 = arg6[local11 - 1][local16];
					}
				} else if (local23 == 2) {
					local62 = arg6[local11 - 1][local16 - 1];
					if (local62 == 0) {
						local62 = arg6[local11][local16 - 1];
					}
					if (local62 == 0) {
						local62 = arg6[local11 - 1][local16];
					}
					if (local62 == 0) {
						local62 = arg6[local11][local16];
					}
				} else {
					local62 = arg6[local11 - 1][local16];
					if (local62 == 0) {
						local62 = arg6[local11 - 1][local16 - 1];
					}
					if (local62 == 0) {
						local62 = arg6[local11][local16];
					}
					if (local62 == 0) {
						local62 = arg6[local11][local16 - 1];
					}
				}
				if (local62 != 0) {
					@Pc(253) Class172 local253 = Static173.method3143((local62 & 0xFF) - 1);
					local9[local11][local16] = (local253.anInt5457 + 1 << 16) + local253.anInt5456;
				}
			}
		}
		@Pc(278) Class101 local278 = new Class101(128);
		@Pc(340) int local340;
		@Pc(348) int local348;
		@Pc(322) int local322;
		for (local16 = 1; local16 <= 102; local16++) {
			for (local23 = 1; local23 <= 102; local23++) {
				if (arg6[local16][local23] != 0) {
					@Pc(307) int[] local307;
					if (arg12[local16][local23] == 0) {
						local307 = Static12.anIntArrayArray1[0];
					} else {
						local307 = Static189.anIntArrayArray27[arg2[local16][local23]];
						if (local307.length == 0) {
							continue;
						}
					}
					local322 = 0;
					if (arg8 != null) {
						local322 = arg8[local16][local23] & 0xFFFFFF;
					}
					local340 = local9[local16][local23];
					local348 = local9[local16 + 1][local23];
					@Pc(356) int local356 = local9[local16][local23 + 1];
					@Pc(366) int local366 = local9[local16 + 1][local23 + 1];
					@Pc(374) long local374 = (long) local322 | (long) local340 << 32;
					@Pc(382) long local382 = (long) local348 << 32 | (long) local322;
					@Pc(390) long local390 = (long) local356 << 32 | (long) local322;
					@Pc(398) long local398 = (long) local322 | (long) local366 << 32;
					@Pc(403) int local403 = local307.length / 2;
					@Pc(409) Class2_Sub32 local409 = (Class2_Sub32) local278.method2867(local374);
					if (local409 == null) {
						local409 = new Class2_Sub32((local340 >> 16) - 1, (float) (local340 & 0xFFFF), false, arg13 != null, local322);
						local278.method2860(local409, local374);
					}
					local409.anInt6053 += local403;
					local409.anInt6046++;
					if (local382 != local374) {
						local409 = (Class2_Sub32) local278.method2867(local382);
						if (local409 == null) {
							local409 = new Class2_Sub32((local348 >> 16) - 1, (float) (local348 & 0xFFFF), false, arg13 != null, local322);
							local278.method2860(local409, local382);
						}
						local409.anInt6053 += local403;
						local409.anInt6046++;
					}
					if (local398 != local374 && local398 != local382) {
						local409 = (Class2_Sub32) local278.method2867(local398);
						if (local409 == null) {
							local409 = new Class2_Sub32((local366 >> 16) - 1, (float) (local366 & 0xFFFF), false, arg13 != null, local322);
							local278.method2860(local409, local398);
						}
						local409.anInt6053 += local403;
						local409.anInt6046++;
					}
					if (local374 != local390 && local382 != local390 && local390 != local398) {
						local409 = (Class2_Sub32) local278.method2867(local390);
						if (local409 == null) {
							local409 = new Class2_Sub32((local356 >> 16) - 1, (float) (local356 & 0xFFFF), false, arg13 != null, local322);
							local278.method2860(local409, local390);
						}
						local409.anInt6053 += local403;
						local409.anInt6046++;
					}
				}
			}
		}
		@Pc(635) Class2_Sub32 local635;
		for (local635 = (Class2_Sub32) local278.method2868(); local635 != null; local635 = (Class2_Sub32) local278.method2859()) {
			local635.method4747();
		}
		for (local16 = 1; local16 <= 102; local16++) {
			for (local23 = 1; local23 <= 102; local23++) {
				local62 = arg6[local16][local23];
				if (local62 != 0) {
					if ((arg7[arg0][local16][local23] & 0x8) != 0) {
						local322 = 0;
					} else if ((arg7[1][local16][local23] & 0x2) == 2 && arg0 > 0) {
						local322 = arg0 - 1;
					} else {
						local322 = arg0;
					}
					local340 = 0;
					local348 = 128;
					if (arg8 != null) {
						local340 = arg8[local16][local23] & 0xFFFFFF;
						local348 = arg8[local16][local23] >>> 24 << 3;
					}
					@Pc(738) boolean[] local738 = null;
					@Pc(776) int local776;
					@Pc(827) int local827;
					@Pc(751) int[] local751;
					@Pc(931) byte local931;
					@Pc(793) int local793;
					@Pc(865) int local865;
					if (arg12[local16][local23] == 0) {
						local751 = Static12.anIntArrayArray1[0];
						local776 = arg6[local16 - 1][local23 - 1] == local62 ? 1 : -1;
						local793 = local62 == arg6[local16 + 1][local23 - 1] ? 1 : -1;
						if (arg6[local16][local23 - 1] == local62) {
							local776++;
							local793++;
						} else {
							local793--;
							local776--;
						}
						local827 = arg6[local16 + 1][local23 + 1] == local62 ? 1 : -1;
						if (local62 == arg6[local16 + 1][local23]) {
							local827++;
							local793++;
						} else {
							local827--;
							local793--;
						}
						local865 = local62 == arg6[local16 - 1][local23 + 1] ? 1 : -1;
						if (local62 == arg6[local16][local23 + 1]) {
							local827++;
							local865++;
						} else {
							local865--;
							local827--;
						}
						if (local62 == arg6[local16 - 1][local23]) {
							local865++;
							local776++;
						} else {
							local865--;
							local776--;
						}
						@Pc(904) int local904 = local793 - local865;
						@Pc(909) int local909 = local776 - local827;
						if (local909 < 0) {
							local909 = -local909;
						}
						if (local904 < 0) {
							local904 = -local904;
						}
						local931 = (byte) (local909 >= local904 ? 0 : 1);
						arg5[local16][local23] = local931;
					} else {
						local738 = Static74.aBooleanArrayArray3[arg2[local16][local23]];
						local751 = Static189.anIntArrayArray27[arg2[local16][local23]];
						local931 = arg5[local16][local23];
						if (local751.length == 0) {
							continue;
						}
					}
					local776 = local9[local16][local23];
					local793 = local9[local16 + 1][local23];
					local827 = local9[local16 + 1][local23 + 1];
					local865 = local9[local16][local23 + 1];
					@Pc(1007) long local1007 = (long) local340 | (long) local827 << 32;
					@Pc(1015) long local1015 = (long) local776 << 32 | (long) local340;
					@Pc(1023) long local1023 = (long) local865 << 32 | (long) local340;
					@Pc(1029) int local1029 = arg10[local16][local23];
					@Pc(1037) int local1037 = arg10[local16 + 1][local23];
					@Pc(1045) long local1045 = (long) local793 << 32 | (long) local340;
					@Pc(1055) int local1055 = arg10[local16 + 1][local23 + 1];
					@Pc(1063) int local1063 = arg9[local16][local23 + 1];
					@Pc(1071) int local1071 = arg9[local16 + 1][local23];
					@Pc(1081) int local1081 = arg9[local16 + 1][local23 + 1];
					@Pc(1087) int local1087 = arg9[local16][local23];
					@Pc(1095) int local1095 = arg10[local16][local23 + 1];
					@Pc(1101) int local1101 = (local776 >> 16) - 1;
					@Pc(1107) int local1107 = (local793 >> 16) - 1;
					@Pc(1113) int local1113 = (local827 >> 16) - 1;
					@Pc(1119) Class2_Sub32 local1119 = (Class2_Sub32) local278.method2867(local1015);
					@Pc(1125) int local1125 = (local865 >> 16) - 1;
					Static223.method3681(Static153.method2805(local1101, local1087, local1029), local793 >= local776, Static153.method2805(local1101, local1081, local1055), local322, arg1, arg11, local865 >= local776, arg3, local23, arg4, local751, local1119, Static153.method2805(local1101, local1071, local1037), local776 <= local776, local738, local16, arg13, local931, local348, local827 >= local776, Static153.method2805(local1101, local1063, local1095));
					if (local1015 != local1045) {
						local1119 = (Class2_Sub32) local278.method2867(local1045);
						Static223.method3681(Static153.method2805(local1107, local1087, local1029), local793 >= local793, Static153.method2805(local1107, local1081, local1055), local322, arg1, arg11, local865 >= local793, arg3, local23, arg4, local751, local1119, Static153.method2805(local1107, local1071, local1037), local793 <= local776, local738, local16, arg13, local931, local348, local793 <= local827, Static153.method2805(local1107, local1063, local1095));
					}
					if (local1015 != local1007 && local1045 != local1007) {
						local1119 = (Class2_Sub32) local278.method2867(local1007);
						Static223.method3681(Static153.method2805(local1113, local1087, local1029), local827 <= local793, Static153.method2805(local1113, local1081, local1055), local322, arg1, arg11, local827 <= local865, arg3, local23, arg4, local751, local1119, Static153.method2805(local1113, local1071, local1037), local827 <= local776, local738, local16, arg13, local931, local348, local827 >= local827, Static153.method2805(local1113, local1063, local1095));
					}
					if (local1023 != local1015 && local1023 != local1045 && local1007 != local1023) {
						local1119 = (Class2_Sub32) local278.method2867(local1023);
						Static223.method3681(Static153.method2805(local1125, local1087, local1029), local865 <= local793, Static153.method2805(local1125, local1081, local1055), local322, arg1, arg11, local865 >= local865, arg3, local23, arg4, local751, local1119, Static153.method2805(local1125, local1071, local1037), local865 <= local776, local738, local16, arg13, local931, local348, local865 <= local827, Static153.method2805(local1125, local1063, local1095));
					}
				}
			}
		}
		for (local635 = (Class2_Sub32) local278.method2868(); local635 != null; local635 = (Class2_Sub32) local278.method2859()) {
			if (local635.anInt6047 == 0) {
				local635.method4743();
			} else {
				local635.method4748();
			}
		}
		local16 = local278.method2863();
		@Pc(1474) long[] local1474 = new long[local16];
		@Pc(1477) Class2_Sub32[] local1477 = new Class2_Sub32[local16];
		local278.method2857(local1477);
		for (local322 = 0; local322 < local16; local322++) {
			local1474[local322] = local1477[local322].aLong214;
		}
		Static22.method441(local1474, local1477);
		return local1477;
	}
}
