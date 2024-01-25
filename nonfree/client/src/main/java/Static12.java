import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!aga", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5;

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "Lclient!uu;")
	public static Class343 aClass343_14;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class105 local13 = local7.aClass105_3; local13 != null; local13 = local13.aClass105_1) {
			@Pc(17) Class9_Sub2_Sub1 local17 = local13.aClass9_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort126 == arg1 && local17.aShort124 == arg2) {
				Static256.method4295(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILclient!mfa;)V")
	public static void method218(@OriginalArg(1) Class3_Sub9_Sub2 arg0) {
		arg0.method5645();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static174.anInt3362; local12++) {
			local18 = Static495.anIntArray529[local12];
			if ((Static118.aByteArray23[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static118.aByteArray23[local18] = (byte) (Static118.aByteArray23[local18] | 0x2);
				} else {
					local43 = arg0.method5642(1);
					if (local43 == 0) {
						local10 = Static380.method5990(arg0);
						Static118.aByteArray23[local18] = (byte) (Static118.aByteArray23[local18] | 0x2);
					} else {
						Static590.method8193(local18, arg0);
					}
				}
			}
		}
		arg0.method5649();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5645();
		@Pc(121) int local121;
		for (local18 = 0; local18 < Static174.anInt3362; local18++) {
			local43 = Static495.anIntArray529[local18];
			if ((Static118.aByteArray23[local43] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static118.aByteArray23[local43] = (byte) (Static118.aByteArray23[local43] | 0x2);
				} else {
					local121 = arg0.method5642(1);
					if (local121 == 0) {
						local10 = Static380.method5990(arg0);
						Static118.aByteArray23[local43] = (byte) (Static118.aByteArray23[local43] | 0x2);
					} else {
						Static590.method8193(local43, arg0);
					}
				}
			}
		}
		arg0.method5649();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5645();
		@Pc(205) int local205;
		for (local43 = 0; local43 < Static216.anInt7753; local43++) {
			local121 = Static38.anIntArray46[local43];
			if ((Static118.aByteArray23[local121] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static118.aByteArray23[local121] = (byte) (Static118.aByteArray23[local121] | 0x2);
				} else {
					local205 = arg0.method5642(1);
					if (local205 == 0) {
						local10 = Static380.method5990(arg0);
						Static118.aByteArray23[local121] = (byte) (Static118.aByteArray23[local121] | 0x2);
					} else if (Static153.method2722(arg0, local121)) {
						Static118.aByteArray23[local121] = (byte) (Static118.aByteArray23[local121] | 0x2);
					}
				}
			}
		}
		arg0.method5649();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5645();
		for (local121 = 0; local121 < Static216.anInt7753; local121++) {
			local205 = Static38.anIntArray46[local121];
			if ((Static118.aByteArray23[local205] & 0x1) == 0) {
				if (local10 > 0) {
					Static118.aByteArray23[local205] = (byte) (Static118.aByteArray23[local205] | 0x2);
					local10--;
				} else {
					@Pc(296) int local296 = arg0.method5642(1);
					if (local296 == 0) {
						local10 = Static380.method5990(arg0);
						Static118.aByteArray23[local205] = (byte) (Static118.aByteArray23[local205] | 0x2);
					} else if (Static153.method2722(arg0, local205)) {
						Static118.aByteArray23[local205] = (byte) (Static118.aByteArray23[local205] | 0x2);
					}
				}
			}
		}
		arg0.method5649();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static174.anInt3362 = 0;
		Static216.anInt7753 = 0;
		for (local205 = 1; local205 < 2048; local205++) {
			Static118.aByteArray23[local205] = (byte) (Static118.aByteArray23[local205] >> 1);
			@Pc(371) Class9_Sub2_Sub1_Sub2_Sub1 local371 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local205];
			if (local371 == null) {
				Static38.anIntArray46[Static216.anInt7753++] = local205;
			} else {
				Static495.anIntArray529[Static174.anInt3362++] = local205;
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIBIIII)V")
	public static void method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg5 >= Static474.anInt8118 && arg4 + arg5 <= Static576.anInt9425 && Static298.anInt5919 <= arg3 - arg5 && Static596.anInt9703 >= arg5 + arg3) {
			Static584.method8114(arg0, arg3, arg4, arg5, arg1, arg2);
		} else {
			Static209.method3274(arg1, arg0, arg5, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IZLjava/lang/String;Z)V")
	public static void method220(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		Static311.method5227();
		Static512.method7420();
		Static523.method7604();
		Static525.method7638(arg2, arg0, arg1);
		Static59.method1043();
		Static625.method8479(Static266.aClass82_8);
		Static624.method8473(Static266.aClass82_8);
		Static388.method6070(Static419.aClass343_200, Static266.aClass82_8);
		Static473.method7003();
		Static576.method8078(Static427.aClass103Array16);
		Static647.method8677();
		Static408.method6354();
		if (Static82.anInt1653 == 3) {
			Static206.method3226(4);
		} else if (Static82.anInt1653 == 7) {
			Static206.method3226(8);
		} else if (Static82.anInt1653 == 10) {
			Static206.method3226(11);
		} else if (Static82.anInt1653 == 1 || Static82.anInt1653 == 2) {
			Static424.method6725();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
	public static void method221() {
		Static468.aClass136_55.method3132(50);
	}
}
