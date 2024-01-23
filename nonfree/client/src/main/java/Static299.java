import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "[[Lclient!tk;")
	public static Class1_Sub32[][] aClass1_Sub32ArrayArray3;

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
	public static int anInt5641 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4468(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static58.method817(arg0);
		if (local7 != -1) {
			@Pc(38) int[] local38 = Static20.aClass1_Sub2_Sub21_1.method4288(Static53.aClass82_13.anIntArray262[local7] >> 14 & 0x3FFF, Static53.aClass82_13.anIntArray262[local7] & 0x3FFF, Static53.aClass82_13.anIntArray262[local7] >> 28 & 0x3);
			Static283.method4250(local38[1], local38[2]);
		}
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(III)I")
	public static int method4469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static40.method831(4, arg1 + 91923, arg0 + 45365) + (Static40.method831(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static40.method831(1, arg1, arg0) - 128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)V")
	public static void method4470(@OriginalArg(1) boolean arg0) {
		@Pc(7) byte[][] local7;
		if (Static277.aBoolean412 && arg0) {
			local7 = Static270.aByteArrayArray14;
		} else {
			local7 = Static16.aByteArrayArray2;
		}
		@Pc(14) int local14 = Static39.aByteArrayArray5.length;
		for (@Pc(24) int local24 = 0; local24 < local14; local24++) {
			@Pc(35) byte[] local35 = local7[local24];
			if (local35 != null) {
				@Pc(48) int local48 = (Static24.anIntArray414[local24] >> 8) * 64 - Static53.anInt5288;
				@Pc(59) int local59 = (Static24.anIntArray414[local24] & 0xFF) * 64 - Static83.anInt1875;
				Static105.method1947();
				Static162.method2796(local48, local59, Static88.aClass92Array1, arg0, local35);
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(ILjava/lang/String;)I")
	public static int method4471(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static49.anInt1128; local12++) {
			if (arg0.equalsIgnoreCase(Static149.aStringArray43[local12])) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!q;IIIIIIIZIIILclient!om;)Lclient!q;")
	public static Class14_Sub6 method4472(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class125 arg12) {
		@Pc(28) long local28 = ((long) arg9 << 48) + (long) ((arg3 << 24) + arg10 + (arg0 << 16)) + ((long) arg7 << 32);
		@Pc(34) Class14_Sub6 local34 = (Class14_Sub6) Static183.aClass135_25.method3316(local28);
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(155) int local155;
		if (local34 == null) {
			@Pc(52) byte local52;
			if (arg10 == 1) {
				local52 = 9;
			} else if (arg10 == 2) {
				local52 = 12;
			} else if (arg10 == 3) {
				local52 = 15;
			} else if (arg10 == 4) {
				local52 = 18;
			} else {
				local52 = 21;
			}
			@Pc(88) Class14_Sub3 local88 = new Class14_Sub3(local52 * 3 + 1, -local52 + local52 * 6, 0);
			@Pc(103) int[] local103 = new int[] { 64, 96, 128 };
			local109 = local88.method983(0, 0);
			@Pc(113) int[][] local113 = new int[3][local52];
			for (local115 = 0; local115 < 3; local115++) {
				local126 = local103[local115];
				local130 = local103[local115];
				for (@Pc(132) int local132 = 0; local132 < local52; local132++) {
					@Pc(145) int local145 = (local132 << 11) / local52;
					local155 = Class68.anIntArray229[local145] * local126 + arg5 >> 16;
					@Pc(165) int local165 = Class68.anIntArray226[local145] * local130 + arg2 >> 16;
					local113[local115][local132] = local88.method983(local155, local165);
				}
			}
			for (local115 = 0; local115 < 3; local115++) {
				local126 = (local115 * 256 + 128) / 3;
				local130 = 256 - local126;
				@Pc(243) short local243 = (short) ((local130 * (arg7 & 0x7F) + local126 * (arg9 & 0x7F) & 0x7F00) + ((arg9 & 0x380) * local126 + local130 * (arg7 & 0x380) & 0x38000) + ((arg9 & 0xFC00) * local126 + local130 * (arg7 & 0xFC00) & 0xFC0000) >> 8);
				@Pc(254) byte local254 = (byte) (arg0 * local130 + local126 * arg3 >> 8);
				for (local155 = 0; local155 < local52; local155++) {
					if (local115 == 0) {
						local88.method990(local109, local113[0][(local155 + 1) % local52], local113[0][local155], local243, local254);
					} else {
						local88.method990(local113[local115 - 1][local155], local113[local115 - 1][(local155 + 1) % local52], local113[local115][(local155 + 1) % local52], local243, local254);
						local88.method990(local113[local115 - 1][local155], local113[local115][(local155 + 1) % local52], local113[local115][local155], local243, local254);
					}
				}
			}
			local34 = local88.method984(64, 768, -50, -10, -50);
			Static183.aClass135_25.method3321(local28, local34);
		}
		@Pc(378) int local378 = arg10 * 64 - 1;
		@Pc(381) int local381 = -local378;
		@Pc(383) int local383 = local378;
		@Pc(386) int local386 = -local378;
		@Pc(389) int local389 = arg1.method4122();
		local109 = local378;
		if (arg8) {
			if (arg11 > 1152 && arg11 < 1920) {
				local383 = local378 + 128;
			}
			if (arg11 > 1664 || arg11 < 384) {
				local386 -= 128;
			}
			if (arg11 > 640 && arg11 < 1408) {
				local109 = local378 + 128;
			}
			if (arg11 > 128 && arg11 < 896) {
				local381 -= 128;
			}
		}
		local115 = arg1.method4098();
		if (local383 < local115) {
			local115 = local383;
		}
		local126 = arg1.method4102();
		local130 = arg1.method4119();
		if (local389 < local381) {
			local389 = local381;
		}
		if (local130 > local109) {
			local130 = local109;
		}
		@Pc(465) Class1_Sub2_Sub10 local465 = null;
		if (local126 < local386) {
			local126 = local386;
		}
		if (arg12 != null) {
			@Pc(483) int local483 = arg12.anIntArray357[arg6];
			local465 = Static274.method4179(local483 >> 16);
			arg6 = local483 & 0xFFFF;
		}
		if (local465 == null) {
			local34 = local34.method4118(true, true, true);
			local34.method4121((local115 - local389) / 2, 128, (local130 - local126) / 2);
			local34.method4107((local115 + local389) / 2, 0, (local126 + local130) / 2);
		} else {
			local34 = local34.method4118(!local465.method1589(arg6), !local465.method1587(arg6), true);
			local34.method4121((local115 - local389) / 2, 128, (local130 - local126) / 2);
			local34.method4107((local389 + local115) / 2, 0, (local130 + local126) / 2);
			local34.method4127(local465, arg6);
		}
		if (arg11 != 0) {
			local34.method4115(arg11);
		}
		if (Static277.aBoolean412) {
			@Pc(596) Class14_Sub6_Sub1 local596 = (Class14_Sub6_Sub1) local34;
			if (arg4 != Static20.method383(arg2 + local126, Static140.anInt3034, local389 + arg5) || Static20.method383(local130 + arg2, Static140.anInt3034, local115 + arg5) != arg4) {
				for (local155 = 0; local155 < local596.anInt3103; local155++) {
					local596.anIntArray288[local155] += Static20.method383(arg2 + local596.anIntArray284[local155], Static140.anInt3034, local596.anIntArray287[local155] + arg5) - arg4;
				}
				local596.aClass127_1.aBoolean309 = false;
				local596.aClass35_1.aBoolean89 = false;
			}
		} else {
			@Pc(680) Class14_Sub6_Sub2 local680 = (Class14_Sub6_Sub2) local34;
			if (Static20.method383(arg2 + local126, Static140.anInt3034, arg5 + local389) != arg4 || arg4 != Static20.method383(local130 + arg2, Static140.anInt3034, local115 + arg5)) {
				for (local155 = 0; local155 < local680.anInt5291; local155++) {
					local680.anIntArray475[local155] += Static20.method383(arg2 + local680.anIntArray466[local155], Static140.anInt3034, local680.anIntArray473[local155] + arg5) - arg4;
				}
				local680.aBoolean395 = false;
			}
		}
		return local34;
	}
}
