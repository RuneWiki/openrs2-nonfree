import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public static int anInt5584;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "Lclient!km;")
	public static Class91 aClass91_204;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public static int anInt5585 = 0;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	public static int anInt5586 = -1;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Lclient!qc;")
	public static Class135 aClass135_41 = new Class135(64);

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	public static int anInt5589 = 0;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "[I")
	public static int[] anIntArray554 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLclient!in;)Lclient!in;")
	public static Class71 method4433(@OriginalArg(1) Class71 arg0) {
		@Pc(6) Class71 local6 = Static36.method766(arg0);
		if (local6 == null) {
			local6 = arg0.aClass71_13;
		}
		return local6;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
	public static void method4434(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static104.aBoolean169) {
			Static104.aBoolean169 = arg0;
			Static228.method3564();
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method4435() {
		Static216.aClass135_24.method3324();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([[I[[[I[[I[[F[[F[[B[[I[[II[[[B[[F[[I[[B[[BI[[B)[Lclient!tk;")
	public static Class1_Sub32[] method4436(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) int[][] arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) byte[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) byte[][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(62) byte local62;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local18 = 1; local18 <= 103; local18++) {
				local23 = 0;
				if (arg1 != null) {
					@Pc(38) int local38 = arg1[arg13][local11 >> 3][local18 >> 3];
					local23 = local38 >> 1 & 0x3;
				}
				if (local23 == 0) {
					local62 = arg14[local11][local18];
					if (local62 == 0) {
						local62 = arg14[local11 - 1][local18];
					}
					if (local62 == 0) {
						local62 = arg14[local11][local18 - 1];
					}
					if (local62 == 0) {
						local62 = arg14[local11 - 1][local18 - 1];
					}
				} else if (local23 == 1) {
					local62 = arg14[local11][local18 - 1];
					if (local62 == 0) {
						local62 = arg14[local11][local18];
					}
					if (local62 == 0) {
						local62 = arg14[local11 - 1][local18 - 1];
					}
					if (local62 == 0) {
						local62 = arg14[local11 - 1][local18];
					}
				} else if (local23 == 2) {
					local62 = arg14[local11 - 1][local18 - 1];
					if (local62 == 0) {
						local62 = arg14[local11][local18 - 1];
					}
					if (local62 == 0) {
						local62 = arg14[local11 - 1][local18];
					}
					if (local62 == 0) {
						local62 = arg14[local11][local18];
					}
				} else {
					local62 = arg14[local11 - 1][local18];
					if (local62 == 0) {
						local62 = arg14[local11 - 1][local18 - 1];
					}
					if (local62 == 0) {
						local62 = arg14[local11][local18];
					}
					if (local62 == 0) {
						local62 = arg14[local11][local18 - 1];
					}
				}
				if (local62 != 0) {
					@Pc(253) Class128 local253 = Static252.method3872((local62 & 0xFF) - 1);
					local9[local11][local18] = local253.anInt4076 + (local253.anInt4067 + 1 << 16);
				}
			}
		}
		@Pc(278) Class70 local278 = new Class70(128);
		@Pc(346) int local346;
		@Pc(340) int local340;
		@Pc(320) int local320;
		for (local18 = 1; local18 <= 102; local18++) {
			for (local23 = 1; local23 <= 102; local23++) {
				if (arg14[local18][local23] != 0) {
					@Pc(310) int[] local310;
					if (arg5[local18][local23] == 0) {
						local310 = Static200.anIntArrayArray21[0];
					} else {
						local310 = Static199.anIntArrayArray20[arg12[local18][local23]];
						if (local310.length == 0) {
							continue;
						}
					}
					local320 = 0;
					if (arg0 != null) {
						local320 = arg0[local18][local23] & 0xFFFFFF;
					}
					local340 = local9[local18 + 1][local23];
					local346 = local9[local18][local23];
					@Pc(356) int local356 = local9[local18 + 1][local23 + 1];
					@Pc(364) int local364 = local9[local18][local23 + 1];
					@Pc(372) long local372 = (long) local340 << 32 | (long) local320;
					@Pc(380) long local380 = (long) local320 | (long) local346 << 32;
					@Pc(388) long local388 = (long) local364 << 32 | (long) local320;
					@Pc(393) int local393 = local310.length / 2;
					@Pc(399) Class1_Sub32 local399 = (Class1_Sub32) local278.method2075(local380);
					if (local399 == null) {
						local399 = new Class1_Sub32((local346 >> 16) - 1, (float) (local346 & 0xFFFF), false, arg2 != null, local320);
						local278.method2084(local380, local399);
					}
					local399.anInt5036++;
					local399.anInt5040 += local393;
					if (local372 != local380) {
						local399 = (Class1_Sub32) local278.method2075(local372);
						if (local399 == null) {
							local399 = new Class1_Sub32((local340 >> 16) - 1, (float) (local340 & 0xFFFF), false, arg2 != null, local320);
							local278.method2084(local372, local399);
						}
						local399.anInt5036++;
						local399.anInt5040 += local393;
					}
					@Pc(497) long local497 = (long) local320 | (long) local356 << 32;
					if (local497 != local380 && local372 != local497) {
						local399 = (Class1_Sub32) local278.method2075(local497);
						if (local399 == null) {
							local399 = new Class1_Sub32((local356 >> 16) - 1, (float) (local356 & 0xFFFF), false, arg2 != null, local320);
							local278.method2084(local497, local399);
						}
						local399.anInt5040 += local393;
						local399.anInt5036++;
					}
					if (local380 != local388 && local372 != local388 && local388 != local497) {
						local399 = (Class1_Sub32) local278.method2075(local388);
						if (local399 == null) {
							local399 = new Class1_Sub32((local364 >> 16) - 1, (float) (local364 & 0xFFFF), false, arg2 != null, local320);
							local278.method2084(local388, local399);
						}
						local399.anInt5040 += local393;
						local399.anInt5036++;
					}
				}
			}
		}
		@Pc(648) Class1_Sub32 local648;
		for (local648 = (Class1_Sub32) local278.method2074(); local648 != null; local648 = (Class1_Sub32) local278.method2079()) {
			local648.method3950();
		}
		for (local18 = 1; local18 <= 102; local18++) {
			for (local23 = 1; local23 <= 102; local23++) {
				local62 = arg14[local18][local23];
				if (local62 != 0) {
					if ((arg8[arg13][local18][local23] & 0x8) != 0) {
						local320 = 0;
					} else if ((arg8[1][local18][local23] & 0x2) == 2 && arg13 > 0) {
						local320 = arg13 - 1;
					} else {
						local320 = arg13;
					}
					local340 = 128;
					local346 = 0;
					if (arg0 != null) {
						local346 = arg0[local18][local23] & 0xFFFFFF;
						local340 = arg0[local18][local23] >>> 24 << 3;
					}
					@Pc(748) boolean[] local748 = null;
					@Pc(784) int local784;
					@Pc(856) int local856;
					@Pc(763) int[] local763;
					@Pc(941) byte local941;
					@Pc(807) int local807;
					@Pc(824) int local824;
					if (arg5[local18][local23] == 0) {
						local763 = Static200.anIntArrayArray21[0];
						local784 = arg14[local18 - 1][local23 - 1] == local62 ? 1 : -1;
						local807 = local62 == arg14[local18 + 1][local23 - 1] ? 1 : -1;
						local824 = local62 == arg14[local18 - 1][local23 + 1] ? 1 : -1;
						if (arg14[local18][local23 - 1] == local62) {
							local807++;
							local784++;
						} else {
							local784--;
							local807--;
						}
						local856 = local62 == arg14[local18 + 1][local23 + 1] ? 1 : -1;
						if (local62 == arg14[local18 + 1][local23]) {
							local856++;
							local807++;
						} else {
							local807--;
							local856--;
						}
						if (arg14[local18][local23 + 1] == local62) {
							local824++;
							local856++;
						} else {
							local856--;
							local824--;
						}
						if (arg14[local18 - 1][local23] == local62) {
							local824++;
							local784++;
						} else {
							local784--;
							local824--;
						}
						@Pc(914) int local914 = local784 - local856;
						@Pc(919) int local919 = local807 - local824;
						if (local914 < 0) {
							local914 = -local914;
						}
						if (local919 < 0) {
							local919 = -local919;
						}
						local941 = (byte) (local914 < local919 ? 1 : 0);
						arg11[local18][local23] = local941;
					} else {
						local748 = Static185.aBooleanArrayArray5[arg12[local18][local23]];
						local763 = Static199.anIntArrayArray20[arg12[local18][local23]];
						local941 = arg11[local18][local23];
						if (local763.length == 0) {
							continue;
						}
					}
					local784 = local9[local18][local23];
					local856 = local9[local18 + 1][local23 + 1];
					local807 = local9[local18 + 1][local23];
					@Pc(1011) long local1011 = (long) local784 << 32 | (long) local346;
					local824 = local9[local18][local23 + 1];
					@Pc(1027) long local1027 = (long) local346 | (long) local807 << 32;
					@Pc(1035) long local1035 = (long) local856 << 32 | (long) local346;
					@Pc(1043) long local1043 = (long) local824 << 32 | (long) local346;
					@Pc(1049) int local1049 = arg7[local18][local23];
					@Pc(1057) int local1057 = arg7[local18 + 1][local23];
					@Pc(1067) int local1067 = arg7[local18 + 1][local23 + 1];
					@Pc(1073) int local1073 = arg10[local18][local23];
					@Pc(1081) int local1081 = arg10[local18 + 1][local23];
					@Pc(1089) int local1089 = arg7[local18][local23 + 1];
					@Pc(1095) int local1095 = (local784 >> 16) - 1;
					@Pc(1101) int local1101 = (local856 >> 16) - 1;
					@Pc(1109) int local1109 = arg10[local18][local23 + 1];
					@Pc(1119) int local1119 = arg10[local18 + 1][local23 + 1];
					@Pc(1125) int local1125 = (local807 >> 16) - 1;
					@Pc(1131) int local1131 = (local824 >> 16) - 1;
					@Pc(1137) Class1_Sub32 local1137 = (Class1_Sub32) local278.method2075(local1011);
					Static222.method3483(local748, local784 <= local856, Static102.method1904(local1095, local1089, local1109), local320, local763, local1137, arg4, arg9, local784 <= local784, local784 <= local807, Static102.method1904(local1095, local1057, local1081), arg6, local18, arg2, local23, Static102.method1904(local1095, local1067, local1119), arg3, Static102.method1904(local1095, local1049, local1073), local784 <= local824, local941, local340);
					if (local1027 != local1011) {
						local1137 = (Class1_Sub32) local278.method2075(local1027);
						Static222.method3483(local748, local856 >= local807, Static102.method1904(local1125, local1089, local1109), local320, local763, local1137, arg4, arg9, local784 >= local807, local807 <= local807, Static102.method1904(local1125, local1057, local1081), arg6, local18, arg2, local23, Static102.method1904(local1125, local1067, local1119), arg3, Static102.method1904(local1125, local1049, local1073), local824 >= local807, local941, local340);
					}
					if (local1035 != local1011 && local1027 != local1035) {
						local1137 = (Class1_Sub32) local278.method2075(local1035);
						Static222.method3483(local748, local856 >= local856, Static102.method1904(local1101, local1089, local1109), local320, local763, local1137, arg4, arg9, local856 <= local784, local856 <= local807, Static102.method1904(local1101, local1057, local1081), arg6, local18, arg2, local23, Static102.method1904(local1101, local1067, local1119), arg3, Static102.method1904(local1101, local1049, local1073), local824 >= local856, local941, local340);
					}
					if (local1043 != local1011 && local1027 != local1043 && local1035 != local1043) {
						local1137 = (Class1_Sub32) local278.method2075(local1043);
						Static222.method3483(local748, local856 >= local824, Static102.method1904(local1131, local1089, local1109), local320, local763, local1137, arg4, arg9, local784 >= local824, local807 >= local824, Static102.method1904(local1131, local1057, local1081), arg6, local18, arg2, local23, Static102.method1904(local1131, local1067, local1119), arg3, Static102.method1904(local1131, local1049, local1073), local824 <= local824, local941, local340);
					}
				}
			}
		}
		for (local648 = (Class1_Sub32) local278.method2074(); local648 != null; local648 = (Class1_Sub32) local278.method2079()) {
			if (local648.anInt5037 == 0) {
				local648.method4441();
			} else {
				local648.method3945();
			}
		}
		local18 = local278.method2078();
		@Pc(1498) long[] local1498 = new long[local18];
		@Pc(1501) Class1_Sub32[] local1501 = new Class1_Sub32[local18];
		local278.method2081(local1501);
		for (local320 = 0; local320 < local18; local320++) {
			local1498[local320] = local1501[local320].aLong205;
		}
		Static194.method3211(local1501, local1498);
		return local1501;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!km;II)[Lclient!tj;")
	public static Class12_Sub2[] method4437(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1) {
		return Static163.method2824(arg0, arg1) ? Static236.method3628() : null;
	}
}
