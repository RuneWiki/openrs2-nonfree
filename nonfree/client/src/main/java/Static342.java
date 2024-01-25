import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public static int anInt6219;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "[I")
	public static int[] anIntArray707;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString301 = "red:";

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "[I")
	public static final int[] anIntArray708 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BILclient!rc;ILclient!ja;Lclient!bq;IIIIIZIII)Lclient!rc;")
	public static Class78 method5629(@OriginalArg(1) int arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class81 arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg4 != null) {
			local11 = arg4.method493(-1, arg11, false) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg12 << 32) + (long) ((arg6 << 24) + (arg0 << 16) + arg5) + ((long) arg7 << 48);
		@Pc(58) Class70 local58 = Static319.aClass70_101;
		@Pc(66) Class78 local66;
		synchronized (Static319.aClass70_101) {
			local66 = (Class78) Static319.aClass70_101.method1396(local48);
		}
		@Pc(163) int local163;
		@Pc(169) int local169;
		@Pc(175) int local175;
		@Pc(179) int local179;
		if (local66 == null || arg3.method2958(local66.method4652(), local11) != 0) {
			if (local66 != null) {
				local11 = arg3.method2994(local11, local66.method4652());
			}
			@Pc(100) byte local100;
			if (arg5 == 1) {
				local100 = 9;
			} else if (arg5 == 2) {
				local100 = 12;
			} else if (arg5 == 3) {
				local100 = 15;
			} else if (arg5 == 4) {
				local100 = 18;
			} else {
				local100 = 21;
			}
			@Pc(137) int[] local137 = new int[] { 64, 96, 128 };
			@Pc(156) Class57 local156 = new Class57(local100 * 3 + 1, -local100 + local100 * 3 * 2, 0);
			local163 = local156.method1138(0, 0, 0);
			@Pc(167) int[][] local167 = new int[3][local100];
			@Pc(181) int local181;
			@Pc(205) int local205;
			for (local169 = 0; local169 < 3; local169++) {
				local175 = local137[local169];
				local179 = local137[local169];
				for (local181 = 0; local181 < local100; local181++) {
					@Pc(189) int local189 = (local181 << 14) / local100;
					@Pc(197) int local197 = local175 * Class207.anIntArray697[local189] >> 15;
					local205 = local179 * Class207.anIntArray698[local189] >> 15;
					local167[local169][local181] = local156.method1138(local205, local197, 0);
				}
			}
			for (local175 = 0; local175 < 3; local175++) {
				local179 = (local175 * 256 + 128) / 3;
				local181 = 256 - local179;
				@Pc(256) byte local256 = (byte) (local179 * arg6 + local181 * arg0 >> 8);
				@Pc(301) short local301 = (short) ((local179 * (arg7 & 0xFC00) + (arg12 & 0xFC00) * local181 & 0xFC0000) + (local179 * (arg7 & 0x380) + local181 * (arg12 & 0x380) & 0x38000) + ((arg7 & 0x7F) * local179 + local181 * (arg12 & 0x7F) & 0x7F00) >> 8);
				for (local205 = 0; local205 < local100; local205++) {
					if (local175 == 0) {
						local156.method1141((byte) 1, local167[0][local205], local256, local167[0][(local205 + 1) % local100], local163, (byte) -1, local301, (short) -1);
					} else {
						local156.method1141((byte) 1, local167[local175][(local205 + 1) % local100], local256, local167[local175 - 1][(local205 + 1) % local100], local167[local175 - 1][local205], (byte) -1, local301, (short) -1);
						local156.method1141((byte) 1, local167[local175][local205], local256, local167[local175][(local205 + 1) % local100], local167[local175 - 1][local205], (byte) -1, local301, (short) -1);
					}
				}
			}
			local66 = arg3.method3016(local156, local11, Static287.anInt5401, 64, 768);
			@Pc(428) Class70 local428 = Static319.aClass70_101;
			synchronized (Static319.aClass70_101) {
				Static319.aClass70_101.method1406(local66, local48);
			}
		}
		@Pc(447) int local447 = arg5 * 64 - 1;
		@Pc(450) int local450 = -local447;
		@Pc(453) int local453 = -local447;
		@Pc(455) int local455 = local447;
		local163 = local447;
		if (arg10) {
			if (arg8 > 9216 && arg8 < 15360) {
				local455 = local447 + 128;
			}
			if (arg8 > 1024 && arg8 < 7168) {
				local450 -= 128;
			}
			if (arg8 > 13312 || arg8 < 3072) {
				local453 -= 128;
			}
			if (arg8 > 5120 && arg8 < 11264) {
				local163 = local447 + 128;
			}
		}
		@Pc(496) int local496 = arg1.method4640();
		local169 = arg1.method4630();
		local175 = arg1.method4621();
		if (local169 > local455) {
			local169 = local455;
		}
		local179 = arg1.method4636();
		if (local175 < local453) {
			local175 = local453;
		}
		if (local496 < local450) {
			local496 = local450;
		}
		if (local179 > local163) {
			local179 = local163;
		}
		@Pc(535) Class6_Sub2_Sub9 local535 = null;
		if (arg4 != null) {
			@Pc(542) int local542 = arg4.anIntArray64[arg11];
			local535 = Static109.method2198(local542 >> 16);
			arg11 = local542 & 0xFFFF;
		}
		if (local535 == null) {
			local66 = local66.method4661((byte) 3, local11, true);
			local66.method4657((local169 - local496) / 2, 128, (local179 - local175) / 2);
			local66.method4641((local496 + local169) / 2, 0, (local175 + local179) / 2);
		} else {
			local66 = local66.method4661((byte) 3, local11, true);
			local66.method4657((local169 - local496) / 2, 128, (local179 - local175) / 2);
			local66.method4641((local169 + local496) / 2, 0, (local175 + local179) / 2);
			local66.method4647(local535, arg11);
		}
		if (arg9 != 0) {
			local66.method4651(arg9);
		}
		if (arg13 != 0) {
			local66.method4658(arg13);
		}
		if (arg2 != 0) {
			local66.method4641(0, arg2, 0);
		}
		return local66;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!ja;IIIIIII)V")
	public static void method5630(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface7 local11 = (Interface7) Static9.method161(arg7, arg0, arg5);
		@Pc(19) Class66 local19;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (local11 != null) {
			local19 = Static196.method3622(local11.method5799());
			local25 = local11.method5793() & 0x3;
			local31 = local11.method5795();
			if (local19.anInt1478 == -1) {
				local37 = arg3;
				if (local19.anInt1476 > 0) {
					local37 = arg6;
				}
				if (local31 == 0 || local31 == 2) {
					if (local25 == 0) {
						arg1.method2973(arg2, arg4, 4, local37);
					} else if (local25 == 1) {
						arg1.method2999(4, arg2, arg4, local37);
					} else if (local25 == 2) {
						arg1.method2973(arg2, arg4 + 3, 4, local37);
					} else if (local25 == 3) {
						arg1.method2999(4, arg2 + 3, arg4, local37);
					}
				}
				if (local31 == 3) {
					if (local25 == 0) {
						arg1.method3017(1, local37, 1, arg4, arg2);
					} else if (local25 == 1) {
						arg1.method3017(1, local37, 1, arg4 + 3, arg2);
					} else if (local25 == 2) {
						arg1.method3017(1, local37, 1, arg4 + 3, arg2 + 3);
					} else if (local25 == 3) {
						arg1.method3017(1, local37, 1, arg4, arg2 + 3);
					}
				}
				if (local31 == 2) {
					if (local25 == 0) {
						arg1.method2999(4, arg2, arg4, local37);
					} else if (local25 == 1) {
						arg1.method2973(arg2, arg4 + 3, 4, local37);
					} else if (local25 == 2) {
						arg1.method2999(4, arg2 + 3, arg4, local37);
					} else if (local25 == 3) {
						arg1.method2973(arg2, arg4, 4, local37);
					}
				}
			} else {
				Static46.method771(arg2, arg4, arg1, local19, local25);
			}
		}
		local11 = (Interface7) Static162.method3236(arg7, arg0, arg5, sc.class);
		if (local11 != null) {
			local19 = Static196.method3622(local11.method5799());
			local25 = local11.method5793() & 0x3;
			local31 = local11.method5795();
			if (local19.anInt1478 != -1) {
				Static46.method771(arg2, arg4, arg1, local19, local25);
			} else if (local31 == 9) {
				local37 = -1118482;
				if (local19.anInt1476 > 0) {
					local37 = -1179648;
				}
				if (local25 == 0 || local25 == 2) {
					arg1.method3004(arg2, arg2 + 3, arg4, arg4 + 3, local37);
				} else {
					arg1.method3004(arg2 + 3, arg2, arg4, arg4 + 3, local37);
				}
			}
		}
		local11 = (Interface7) Static68.method4012(arg7, arg0, arg5);
		if (local11 == null) {
			return;
		}
		local19 = Static196.method3622(local11.method5799());
		local25 = local11.method5793() & 0x3;
		if (local19.anInt1478 != -1) {
			Static46.method771(arg2, arg4, arg1, local19, local25);
			return;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZIIIII)V")
	public static void method5631(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static105.anInt1947 = arg5;
		Static281.anInt5316 = arg1;
		Static102.anInt5256 = arg3;
		Static268.anInt5000 = arg4;
		Static179.anInt3361 = arg2;
		if (arg0 && Static102.anInt5256 >= 100) {
			Static287.anInt5405 = Static179.anInt3361 * 128 + 64;
			Static11.anInt197 = Static268.anInt5000 * 128 + 64;
			Static217.anInt4016 = Static306.method5249(Static11.anInt197, Static287.anInt5405, Static343.anInt6225) - Static105.anInt1947;
		}
		Static334.anInt6112 = 2;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZI)I")
	public static int method5632(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub38 local12 = (Class6_Sub38) Static297.aClass108_31.method2900((long) arg2);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local12.anIntArray653.length; local20++) {
			if (local12.anIntArray653[local20] >= 0 && local12.anIntArray653[local20] < Static269.anInt5047) {
				@Pc(52) Class147 local52 = Static211.method3762(local12.anIntArray653[local20]);
				@Pc(61) int local61 = local52.method3848(arg0, Static219.method3902(arg0).anInt3777);
				if (arg1) {
					local18 += local12.anIntArray652[local20] * local61;
				} else {
					local18 += local61;
				}
			}
		}
		return local18;
	}
}
