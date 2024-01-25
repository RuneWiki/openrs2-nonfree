import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!fc;")
	public static Class71 aClass71_34;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_102 = new Class221("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public static int anInt2702 = 999999;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIILclient!of;)V")
	public static void method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub5 arg3) {
		@Pc(4) Class227 local4 = Static115.method2162(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass12_Sub5_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void method2528() {
		if (Static284.anInt5040 < 0) {
			Static284.anInt5040 = 0;
			Static76.anInt1481 = -1;
			Static203.anInt3731 = -1;
		}
		if (Static284.anInt5040 > Static302.anInt393) {
			Static76.anInt1481 = -1;
			Static284.anInt5040 = Static302.anInt393;
			Static203.anInt3731 = -1;
		}
		if (Static318.anInt4656 < 0) {
			Static318.anInt4656 = 0;
			Static203.anInt3731 = -1;
			Static76.anInt1481 = -1;
		}
		if (Static302.anInt389 < Static318.anInt4656) {
			Static76.anInt1481 = -1;
			Static318.anInt4656 = Static302.anInt389;
			Static203.anInt3731 = -1;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZII[[[Lclient!ui;II)Z")
	public static boolean method2529(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class227[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static47.anInt936 & 0xFF);
		if (local14 == Static75.aByteArrayArrayArray5[Static331.anInt5804][arg3][arg4]) {
			return false;
		} else if ((Static244.aByteArrayArrayArray4[Static331.anInt5804][arg3][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			Static218.anIntArray498[0] = arg3;
			@Pc(50) int local50 = 0;
			@Pc(53) int local53 = local39 + 1;
			Static189.anIntArray642[0] = arg4;
			Static75.aByteArrayArrayArray5[Static331.anInt5804][arg3][arg4] = local14;
			while (local50 != local53) {
				@Pc(71) int local71 = Static218.anIntArray498[local50] & 0xFFFF;
				@Pc(79) int local79 = Static218.anIntArray498[local50] >> 16 & 0xFF;
				@Pc(87) int local87 = Static218.anIntArray498[local50] >> 24 & 0xFF;
				@Pc(93) int local93 = Static189.anIntArray642[local50] & 0xFFFF;
				@Pc(101) int local101 = Static189.anIntArray642[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static244.aByteArrayArrayArray4[Static331.anInt5804][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(165) int local165;
				@Pc(204) int local204;
				label231: for (@Pc(130) int local130 = Static331.anInt5804 + 1; local130 <= 3; local130++) {
					if ((Static244.aByteArrayArrayArray4[local130][local71][local93] & 0x8) == 0) {
						@Pc(299) Class12_Sub1 local299;
						@Pc(309) int local309;
						@Pc(288) Class227 local288;
						@Pc(294) Class164 local294;
						if (local109 && arg2[local130][local71][local93] != null) {
							if (arg2[local130][local71][local93].aClass12_Sub2_2 != null) {
								local165 = Static294.method4661(local79);
								if (local165 == arg2[local130][local71][local93].aClass12_Sub2_2.anInt1073 || arg2[local130][local71][local93].aClass12_Sub2_3 != null && local165 == arg2[local130][local71][local93].aClass12_Sub2_3.anInt1073) {
									continue;
								}
								if (local87 != 0) {
									local204 = Static294.method4661(local87);
									if (local204 == arg2[local130][local71][local93].aClass12_Sub2_2.anInt1073 || arg2[local130][local71][local93].aClass12_Sub2_3 != null && local204 == arg2[local130][local71][local93].aClass12_Sub2_3.anInt1073) {
										continue;
									}
								}
								if (local101 != 0) {
									local204 = Static294.method4661(local101);
									if (arg2[local130][local71][local93].aClass12_Sub2_2.anInt1073 == local204 || arg2[local130][local71][local93].aClass12_Sub2_3 != null && arg2[local130][local71][local93].aClass12_Sub2_3.anInt1073 == local204) {
										continue;
									}
								}
							}
							local288 = arg2[local130][local71][local93];
							if (local288.aClass164_25 != null) {
								for (local294 = local288.aClass164_25; local294 != null; local294 = local294.aClass164_19) {
									local299 = local294.aClass12_Sub1_2;
									if (local299 instanceof Interface11) {
										@Pc(305) Interface11 local305 = (Interface11) local299;
										local309 = local305.method5027();
										if (local309 == 21) {
											local309 = 19;
										}
										@Pc(318) int local318 = local305.method5024();
										@Pc(324) int local324 = local318 << 6 | local309;
										if (local324 == local79 || local87 != 0 && local87 == local324 || local101 != 0 && local324 == local101) {
											continue label231;
										}
									}
								}
							}
						}
						local288 = arg2[local130][local71][local93];
						if (local288 != null && local288.aClass164_25 != null) {
							for (local294 = local288.aClass164_25; local294 != null; local294 = local294.aClass164_19) {
								local299 = local294.aClass12_Sub1_2;
								if (local299.aShort97 != local299.aShort96 || local299.aShort95 != local299.aShort94) {
									for (@Pc(386) int local386 = local299.aShort97; local386 <= local299.aShort96; local386++) {
										for (local309 = local299.aShort94; local309 <= local299.aShort95; local309++) {
											Static75.aByteArrayArrayArray5[local130][local386][local309] = local14;
										}
									}
								}
							}
						}
						local126 = true;
						Static75.aByteArrayArrayArray5[local130][local71][local93] = local14;
					}
				}
				if (local126) {
					local165 = Static17.aClass33Array1[Static331.anInt5804 + 1].method4057(local71, local93);
					if (Static227.anIntArray515[arg1] < local165) {
						Static227.anIntArray515[arg1] = local165;
					}
					local204 = local71 << 7;
					@Pc(468) int local468 = local93 << 7;
					if (local204 < Static323.anIntArray696[arg1]) {
						Static323.anIntArray696[arg1] = local204;
					} else if (Static186.anIntArray763[arg1] < local204) {
						Static186.anIntArray763[arg1] = local204;
					}
					if (Static305.anIntArray250[arg1] > local468) {
						Static305.anIntArray250[arg1] = local468;
					} else if (Static54.anIntArray149[arg1] < local468) {
						Static54.anIntArray149[arg1] = local468;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 - 1][local93] != local14) {
						Static218.anIntArray498[local53] = 0xD3000000 | 0x120000 | local71 - 1;
						Static189.anIntArray642[local53] = local93 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 - 1][local93] = local14;
					}
					local93++;
					if (local93 < Static307.anInt5484) {
						if (local71 - 1 >= 0 && local14 != Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 - 1][local93] && (Static244.aByteArrayArrayArray4[Static331.anInt5804][local71][local93] & 0x4) == 0 && (Static244.aByteArrayArrayArray4[Static331.anInt5804][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static218.anIntArray498[local53] = local71 - 1 | 0x120000 | 0x52000000;
							Static189.anIntArray642[local53] = local93 | 0x130000;
							Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 - 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local14 != Static75.aByteArrayArrayArray5[Static331.anInt5804][local71][local93]) {
							Static218.anIntArray498[local53] = 0x13000000 | 0x520000 | local71;
							Static189.anIntArray642[local53] = local93 | 0x530000;
							Static75.aByteArrayArrayArray5[Static331.anInt5804][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (Static392.anInt6751 > local71 + 1 && local14 != Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 + 1][local93] && (Static244.aByteArrayArrayArray4[Static331.anInt5804][local71][local93] & 0x4) == 0 && (Static244.aByteArrayArrayArray4[Static331.anInt5804][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static218.anIntArray498[local53] = local71 + 1 | 0x520000 | 0x92000000;
							Static189.anIntArray642[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 + 1][local93] = local14;
						}
					}
					local93--;
					if (Static392.anInt6751 > local71 + 1 && local14 != Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 + 1][local93]) {
						Static218.anIntArray498[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static189.anIntArray642[local53] = local93 | 0x930000;
						Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 + 1][local93] = local14;
						local53 = local53 + 1 & 0xFFF;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local14 != Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 - 1][local93] && (Static244.aByteArrayArrayArray4[Static331.anInt5804][local71][local93] & 0x4) == 0 && (Static244.aByteArrayArrayArray4[Static331.anInt5804][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static218.anIntArray498[local53] = local71 - 1 | 0x12000000 | 0xD20000;
							Static189.anIntArray642[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 - 1][local93] = local14;
						}
						if (local14 != Static75.aByteArrayArrayArray5[Static331.anInt5804][local71][local93]) {
							Static218.anIntArray498[local53] = local71 | 0xD20000 | 0x93000000;
							Static189.anIntArray642[local53] = local93 | 0xD30000;
							Static75.aByteArrayArrayArray5[Static331.anInt5804][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local71 + 1 < Static392.anInt6751 && Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 + 1][local93] != local14 && (Static244.aByteArrayArrayArray4[Static331.anInt5804][local71][local93] & 0x4) == 0 && (Static244.aByteArrayArrayArray4[Static331.anInt5804][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static218.anIntArray498[local53] = local71 + 1 | 0xD2000000 | 0x920000;
							Static189.anIntArray642[local53] = local93 | 0x930000;
							Static75.aByteArrayArrayArray5[Static331.anInt5804][local71 + 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static227.anIntArray515[arg1] != -1000000) {
				Static227.anIntArray515[arg1] += 10;
				Static323.anIntArray696[arg1] -= 50;
				Static186.anIntArray763[arg1] += 50;
				Static54.anIntArray149[arg1] += 50;
				Static305.anIntArray250[arg1] -= 50;
			}
			return true;
		}
	}
}
