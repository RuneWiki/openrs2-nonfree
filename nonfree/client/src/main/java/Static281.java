import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!hf;")
	public static Class103 aClass103_4;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Z")
	public static boolean method4242(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public static void method4243() {
		for (@Pc(6) Class6_Sub33 local6 = (Class6_Sub33) Static307.aClass88_23.method1882(); local6 != null; local6 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
			if (Static450.method5989(local6.anInt5954)) {
				Static356.method5013(local6);
			}
		}
		if (Static228.anInt3878 == 1) {
			Static206.aBoolean239 = false;
			Static87.method1534(Static236.anInt4059, Static122.anInt2156, Static265.anInt4552, Static203.anInt3581);
			return;
		}
		Static87.method1534(Static236.anInt4059, Static122.anInt2156, Static265.anInt4552, Static203.anInt3581);
		@Pc(60) int local60 = Static252.aClass201_5.method4452(Static329.aClass231_95.method5138(Static382.anInt6289));
		for (@Pc(65) Class6_Sub33 local65 = (Class6_Sub33) Static307.aClass88_23.method1882(); local65 != null; local65 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
			@Pc(71) int local71 = Static360.method5069(local65);
			if (local60 < local71) {
				local60 = local71;
			}
		}
		Static122.anInt2156 = Static228.anInt3878 * 16 + (Static312.aBoolean355 ? 26 : 22);
		Static265.anInt4552 = local60 + 8;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([[BBLclient!q;)V")
	public static void method4245(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class204_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt5181; local18++) {
			Static88.method1553();
			for (@Pc(24) int local24 = 0; local24 < Static84.anInt1632 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static261.anInt4480 >> 3; local28++) {
					@Pc(32) boolean local32 = false;
					@Pc(40) int local40 = Static1.anIntArrayArrayArray1[local18][local24][local28];
					if (local40 != -1) {
						@Pc(49) int local49 = local40 >> 24 & 0x3;
						if (!arg1.aBoolean359 || local49 == 0) {
							@Pc(63) int local63 = local40 >> 1 & 0x3;
							@Pc(69) int local69 = local40 >> 14 & 0x3FF;
							@Pc(75) int local75 = local40 >> 3 & 0x7FF;
							@Pc(85) int local85 = local75 / 8 + (local69 / 8 << 8);
							for (@Pc(87) int local87 = 0; local87 < Static175.anIntArray282.length; local87++) {
								if (local85 == Static175.anIntArray282[local87] && arg0[local87] != null) {
									@Pc(109) Class6_Sub15 local109 = new Class6_Sub15(arg0[local87]);
									arg1.method4528(local28 * 8, local109, local75, local63, local18, local49, local69, local24 * 8, Static254.aClass61Array2);
									local32 = true;
									arg1.method4546(local69, local109, local28 * 8, Static44.aClass28_14, local12[0] == -1 ? local12 : null, local75, local63, local24 * 8, local18, local49);
									break;
								}
							}
						}
					}
					if (!local32) {
						arg1.method4540(local24 * 8, 8, local18, 8, local28 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static243.aClass46_1 = Static187.aClass217_1.method4849(local12[3], Static251.aClass147_1, local12[1], local12[2], local12[0]);
			Static262.anInt4486 = local12[4];
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BFFF)F")
	public static float method4246(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + (arg1 - arg2) * arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ia;B)V")
	public static void method4248(@OriginalArg(0) Class6_Sub15_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method2607();
		@Pc(23) int local23;
		@Pc(51) int local51;
		for (@Pc(17) int local17 = 0; local17 < Static416.anInt4773; local17++) {
			local23 = Static5.anIntArray3[local17];
			if ((Static278.aByteArray62[local23] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static278.aByteArray62[local23] = (byte) (Static278.aByteArray62[local23] | 0x2);
				} else {
					local51 = arg0.method2604(1);
					if (local51 == 0) {
						local7 = Static22.method313(arg0);
						Static278.aByteArray62[local23] = (byte) (Static278.aByteArray62[local23] | 0x2);
					} else {
						Static164.method2687(arg0, local23);
					}
				}
			}
		}
		arg0.method2613();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2607();
		@Pc(131) int local131;
		for (local23 = 0; local23 < Static416.anInt4773; local23++) {
			local51 = Static5.anIntArray3[local23];
			if ((Static278.aByteArray62[local51] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static278.aByteArray62[local51] = (byte) (Static278.aByteArray62[local51] | 0x2);
				} else {
					local131 = arg0.method2604(1);
					if (local131 == 0) {
						local7 = Static22.method313(arg0);
						Static278.aByteArray62[local51] = (byte) (Static278.aByteArray62[local51] | 0x2);
					} else {
						Static164.method2687(arg0, local51);
					}
				}
			}
		}
		arg0.method2613();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2607();
		@Pc(208) int local208;
		for (local51 = 0; local51 < Static396.anInt6555; local51++) {
			local131 = Static167.anIntArray275[local51];
			if ((Static278.aByteArray62[local131] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static278.aByteArray62[local131] = (byte) (Static278.aByteArray62[local131] | 0x2);
				} else {
					local208 = arg0.method2604(1);
					if (local208 == 0) {
						local7 = Static22.method313(arg0);
						Static278.aByteArray62[local131] = (byte) (Static278.aByteArray62[local131] | 0x2);
					} else if (Static265.method4064(arg0, local131)) {
						Static278.aByteArray62[local131] = (byte) (Static278.aByteArray62[local131] | 0x2);
					}
				}
			}
		}
		arg0.method2613();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2607();
		for (local131 = 0; local131 < Static396.anInt6555; local131++) {
			local208 = Static167.anIntArray275[local131];
			if ((Static278.aByteArray62[local208] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static278.aByteArray62[local208] = (byte) (Static278.aByteArray62[local208] | 0x2);
				} else {
					@Pc(302) int local302 = arg0.method2604(1);
					if (local302 == 0) {
						local7 = Static22.method313(arg0);
						Static278.aByteArray62[local208] = (byte) (Static278.aByteArray62[local208] | 0x2);
					} else if (Static265.method4064(arg0, local208)) {
						Static278.aByteArray62[local208] = (byte) (Static278.aByteArray62[local208] | 0x2);
					}
				}
			}
		}
		arg0.method2613();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static396.anInt6555 = 0;
		Static416.anInt4773 = 0;
		for (local208 = 1; local208 < 2048; local208++) {
			Static278.aByteArray62[local208] = (byte) (Static278.aByteArray62[local208] >> 1);
			@Pc(373) Class3_Sub3_Sub6_Sub1 local373 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local208];
			if (local373 == null) {
				Static167.anIntArray275[Static396.anInt6555++] = local208;
			} else {
				Static5.anIntArray3[Static416.anInt4773++] = local208;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!bl;IIIB)Lclient!js;")
	public static Class40_Sub3_Sub1 method4250(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.aBoolean47 || Static220.method3379(arg3) && Static220.method3379(arg0)) {
			return new Class40_Sub3_Sub1(arg1, 3553, arg4, arg2, arg3, arg0, true);
		} else if (arg1.aBoolean40) {
			return new Class40_Sub3_Sub1(arg1, 34037, arg4, arg2, arg3, arg0, true);
		} else {
			return new Class40_Sub3_Sub1(arg1, arg4, arg2, arg3, arg0, Static420.method5696(arg3), Static420.method5696(arg0), true);
		}
	}
}
