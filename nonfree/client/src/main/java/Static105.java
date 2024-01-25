import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!du", name = "m", descriptor = "[I")
	public static final int[] anIntArray86 = new int[250];

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIII)V")
	public static void method2177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static516.anIntArrayArray92 != null) {
			Static516.anIntArrayArray92[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static155.aShortArrayArray2 != null) {
			Static155.aShortArrayArray2[arg0][arg1] = (short) arg3;
		}
		if (Static143.aByteArrayArray14 != null) {
			Static143.aByteArrayArray14[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZI)Lclient!pca;")
	public static Class251 method2180(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static449.aClass251ArrayArray1[local12] == null || Static449.aClass251ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static160.method2927(local12);
			if (!local30) {
				return null;
			}
		}
		return Static449.aClass251ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public static void method2181() {
		for (@Pc(11) int local11 = 0; local11 < Static345.anInt6219; local11++) {
			@Pc(17) Class367 local17 = Static73.aClass367Array4[local11];
			@Pc(19) boolean local19 = false;
			@Pc(225) int local225;
			if (local17.aClass3_Sub16_Sub2_4 == null) {
				local17.anInt10343--;
				if (local17.anInt10343 >= (local17.method8184() ? -1500 : -10)) {
					if (local17.aByte128 == 1 && local17.aClass199_1 == null) {
						local17.aClass199_1 = Static602.method4799(Static118.aClass284_39, local17.anInt10342, 0);
						if (local17.aClass199_1 == null) {
							continue;
						}
						local17.anInt10343 += local17.aClass199_1.method4796();
					} else if (local17.method8184() && (local17.aClass3_Sub32_3 == null || local17.aClass3_Sub17_Sub1_4 == null)) {
						if (local17.aClass3_Sub32_3 == null) {
							local17.aClass3_Sub32_3 = Static281.method4248(Static537.aClass284_153, local17.anInt10342);
						}
						if (local17.aClass3_Sub32_3 == null) {
							continue;
						}
						if (local17.aClass3_Sub17_Sub1_4 == null) {
							local17.aClass3_Sub17_Sub1_4 = local17.aClass3_Sub32_3.method4239(new int[] { 22050 });
							if (local17.aClass3_Sub17_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local17.anInt10343 < 0) {
						@Pc(121) int local121 = 8192;
						if (local17.anInt10341 == 0) {
							local225 = local17.anInt10337 * (local17.aByte128 == 3 ? Static348.aClass3_Sub51_Sub1_5.anInt9958 : Static348.aClass3_Sub51_Sub1_5.anInt9949) >> 2;
						} else {
							@Pc(131) int local131 = local17.anInt10341 >> 24 & 0x3;
							if (local131 == Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117) {
								@Pc(146) int local146 = (local17.anInt10341 & 0xFF) << 9;
								@Pc(152) int local152 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() << 8;
								@Pc(159) int local159 = local17.anInt10341 >> 16 & 0xFF;
								@Pc(171) int local171 = local152 + (local159 << 9) + 256 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476;
								@Pc(178) int local178 = local17.anInt10341 >> 8 & 0xFF;
								@Pc(190) int local190 = local152 + (local178 << 9) + 256 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482;
								@Pc(198) int local198 = Math.abs(local171) + Math.abs(local190) - 512;
								if (local198 > local146) {
									local17.anInt10343 = -99999;
									continue;
								}
								if (local198 < 0) {
									local198 = 0;
								}
								local225 = local17.anInt10337 * Static348.aClass3_Sub51_Sub1_5.anInt9942 * (local146 - local198) / local146 >> 2;
								if (local17.aClass25_Sub2_3 != null && local17.aClass25_Sub2_3 instanceof Class25_Sub2_Sub2) {
									@Pc(236) Class25_Sub2_Sub2 local236 = (Class25_Sub2_Sub2) local17.aClass25_Sub2_3;
									@Pc(239) short local239 = local236.aShort107;
									@Pc(242) short local242 = local236.aShort106;
								}
								if (local171 != 0 || local190 != 0) {
									@Pc(263) int local263 = -Static421.anInt7497 - (int) (Math.atan2((double) local171, (double) local190) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local263 > 8192) {
										local263 = 16384 - local263;
									}
									@Pc(281) int local281;
									if (local198 <= 0) {
										local281 = 8192;
									} else if (local198 >= 4096) {
										local281 = 16384;
									} else {
										local281 = (8192 - local198) / 4096 + 8192;
									}
									local121 = local263 * local281 / 8192 + (16384 - local281 >> 1);
								}
							} else {
								local225 = 0;
							}
						}
						if (local225 > 0) {
							@Pc(339) Class3_Sub17_Sub1 local339 = null;
							if (local17.aByte128 == 1) {
								local339 = local17.aClass199_1.method4797().method6183(Static362.aClass59_1);
							} else if (local17.method8184()) {
								local339 = local17.aClass3_Sub17_Sub1_4;
							}
							@Pc(367) Class3_Sub16_Sub2 local367 = local17.aClass3_Sub16_Sub2_4 = Static603.method6055(local339, local17.anInt10339, local225, local121);
							local367.method6045(local17.anInt10340 - 1);
							Static354.aClass3_Sub16_Sub4_2.method7762(local367);
						}
					}
				} else {
					local19 = true;
				}
			} else if (!local17.aClass3_Sub16_Sub2_4.method8129()) {
				local19 = true;
			}
			if (local19) {
				Static345.anInt6219--;
				for (local225 = local11; local225 < Static345.anInt6219; local225++) {
					Static73.aClass367Array4[local225] = Static73.aClass367Array4[local225 + 1];
				}
				local11--;
			}
		}
		if (Static168.aBoolean262 && !Static369.method5225()) {
			if (Static348.aClass3_Sub51_Sub1_5.anInt9952 != 0 && Static526.anInt9227 != -1) {
				if (Static483.aClass3_Sub16_Sub3_2 == null) {
					Static293.method4412(Static320.aClass284_98, Static348.aClass3_Sub51_Sub1_5.anInt9952, Static526.anInt9227);
				} else {
					Static423.method5875(Static348.aClass3_Sub51_Sub1_5.anInt9952, Static526.anInt9227, Static320.aClass284_98, Static483.aClass3_Sub16_Sub3_2);
				}
			}
			Static483.aClass3_Sub16_Sub3_2 = null;
			Static168.aBoolean262 = false;
		} else if (Static348.aClass3_Sub51_Sub1_5.anInt9952 != 0 && Static526.anInt9227 != -1 && !Static369.method5225()) {
			@Pc(469) Class3_Sub10 local469 = Static129.method2403(Static452.aClass353_2, Static10.aClass287_1);
			local469.aClass3_Sub26_Sub1_1.method6826(Static526.anInt9227);
			Static193.method3398(local469);
			Static526.anInt9227 = -1;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZ)V")
	public static void method2182(@OriginalArg(3) boolean arg0) {
		Static180.anInt3952 = 22050;
		Static102.aBoolean181 = arg0;
		Static62.anInt1682 = 2;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III[B[BIIII)V")
	public static void method2184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -(arg7 >> 2);
		@Pc(21) int local21 = -(arg7 & 0x3);
		for (@Pc(24) int local24 = -arg0; local24 < 0; local24++) {
			@Pc(32) int local32;
			for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
				local32 = arg2++;
				arg3[local32] = (byte) (arg3[local32] - arg4[arg5++]);
				@Pc(45) int local45 = arg2++;
				arg3[local45] = (byte) (arg3[local45] - arg4[arg5++]);
				@Pc(58) int local58 = arg2++;
				arg3[local58] = (byte) (arg3[local58] - arg4[arg5++]);
				@Pc(71) int local71 = arg2++;
				arg3[local71] = (byte) (arg3[local71] - arg4[arg5++]);
			}
			for (@Pc(90) int local90 = local21; local90 < 0; local90++) {
				local32 = arg2++;
				arg3[local32] = (byte) (arg3[local32] - arg4[arg5++]);
			}
			arg5 += arg1;
			arg2 += arg6;
		}
	}
}
