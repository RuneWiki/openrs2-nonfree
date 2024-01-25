import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "Lclient!cia;")
	public static Class53 aClass53_34;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Lclient!cn;")
	public static final Class58 aClass58_12 = new Class58();

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	public static int anInt9743 = -1;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "Lclient!gp;")
	public static final Class133 aClass133_17 = new Class133("stellardawn", 1);

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "Lclient!cda;")
	public static final Class3_Sub12 aClass3_Sub12_12 = new Class3_Sub12(0, 0);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
	public static void method8276() {
		for (@Pc(3) int local3 = 0; local3 < Static154.anInt3152; local3++) {
			@Pc(9) Class130 local9 = Static110.aClass130Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(134) int local134;
			if (local9.aClass3_Sub3_Sub5_2 == null) {
				local9.anInt3531--;
				if (local9.anInt3531 < (local9.method3039() ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte59 == 1 && local9.aClass120_1 == null) {
						local9.aClass120_1 = Static654.method2849(Static155.aClass343_77, local9.anInt3528, 0);
						if (local9.aClass120_1 == null) {
							continue;
						}
						local9.anInt3531 += local9.aClass120_1.method2847();
					} else if (local9.method3039() && (local9.aClass3_Sub28_1 == null || local9.aClass3_Sub18_Sub1_2 == null)) {
						if (local9.aClass3_Sub28_1 == null) {
							local9.aClass3_Sub28_1 = Static288.method4662(Static311.aClass343_155, local9.anInt3528);
						}
						if (local9.aClass3_Sub28_1 == null) {
							continue;
						}
						if (local9.aClass3_Sub18_Sub1_2 == null) {
							local9.aClass3_Sub18_Sub1_2 = local9.aClass3_Sub28_1.method4672(new int[] { 22050 });
							if (local9.aClass3_Sub18_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local9.anInt3531 < 0) {
						@Pc(118) int local118 = 8192;
						if (local9.anInt3530 == 0) {
							local134 = local9.anInt3526 * (local9.aByte59 == 3 ? Static32.aClass3_Sub41_3.aClass7_Sub15_3.method5663() : Static32.aClass3_Sub41_3.aClass7_Sub15_2.method5663()) >> 2;
						} else {
							@Pc(128) int local128 = local9.anInt3530 >> 24 & 0x3;
							if (local128 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) {
								@Pc(143) int local143 = (local9.anInt3530 & 0xFF) << 9;
								@Pc(149) int local149 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() << 8;
								@Pc(156) int local156 = local9.anInt3530 >> 16 & 0xFF;
								@Pc(168) int local168 = (local156 << 9) + (256 - (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 - local149));
								@Pc(175) int local175 = local9.anInt3530 >> 8 & 0xFF;
								@Pc(188) int local188 = (local175 << 9) + local149 + 256 - Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158;
								@Pc(196) int local196 = Math.abs(local168) + Math.abs(local188) - 512;
								if (local196 > local143) {
									local9.anInt3531 = -99999;
									continue;
								}
								if (local196 < 0) {
									local196 = 0;
								}
								local134 = (local143 - local196) * Static32.aClass3_Sub41_3.aClass7_Sub15_5.method5663() * local9.anInt3526 / local143 >> 2;
								if (local9.aClass9_Sub2_12 != null && local9.aClass9_Sub2_12 instanceof Class9_Sub2_Sub1) {
									@Pc(243) Class9_Sub2_Sub1 local243 = (Class9_Sub2_Sub1) local9.aClass9_Sub2_12;
									@Pc(246) short local246 = local243.aShort126;
									@Pc(249) short local249 = local243.aShort124;
								}
								if (local168 != 0 || local188 != 0) {
									@Pc(276) int local276 = -Static35.anInt545 - (int) (Math.atan2((double) local168, (double) local188) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local276 > 8192) {
										local276 = 16384 - local276;
									}
									@Pc(295) int local295;
									if (local196 <= 0) {
										local295 = 8192;
									} else if (local196 >= 4096) {
										local295 = 16384;
									} else {
										local295 = (8192 - local196) / 4096 + 8192;
									}
									local118 = local276 * local295 / 8192 + (16384 - local295 >> 1);
								}
							} else {
								local134 = 0;
							}
						}
						if (local134 > 0) {
							@Pc(352) Class3_Sub18_Sub1 local352 = null;
							if (local9.aByte59 == 1) {
								local352 = local9.aClass120_1.method2850().method8589(Static415.aClass208_2);
							} else if (local9.method3039()) {
								local352 = local9.aClass3_Sub18_Sub1_2;
							}
							@Pc(382) Class3_Sub3_Sub5 local382 = local9.aClass3_Sub3_Sub5_2 = Static655.method4686(local352, local9.anInt3532, local134, local118);
							local382.method4716(local9.anInt3529 - 1);
							Static304.aClass3_Sub3_Sub3_3.method2975(local382);
						}
					}
				}
			} else if (!local9.aClass3_Sub3_Sub5_2.method8683()) {
				local11 = true;
			}
			if (local11) {
				Static154.anInt3152--;
				for (local134 = local3; local134 < Static154.anInt3152; local134++) {
					Static110.aClass130Array1[local134] = Static110.aClass130Array1[local134 + 1];
				}
				local3--;
			}
		}
		if (Static145.aBoolean263 && !Static291.method4809()) {
			if (Static32.aClass3_Sub41_3.aClass7_Sub15_1.method5663() != 0 && Static573.anInt6752 != -1) {
				if (Static267.aClass3_Sub3_Sub1_2 == null) {
					Static471.method6966(Static32.aClass3_Sub41_3.aClass7_Sub15_1.method5663(), Static521.aClass343_238, Static573.anInt6752);
				} else {
					Static641.method8590(Static573.anInt6752, Static521.aClass343_238, Static32.aClass3_Sub41_3.aClass7_Sub15_1.method5663(), Static267.aClass3_Sub3_Sub1_2);
				}
			}
			Static267.aClass3_Sub3_Sub1_2 = null;
			Static145.aBoolean263 = false;
		} else if (Static32.aClass3_Sub41_3.aClass7_Sub15_1.method5663() != 0 && Static573.anInt6752 != -1 && !Static291.method4809()) {
			@Pc(472) Class3_Sub27 local472 = Static59.method1040(Static325.aClass20_2, Static44.aClass314_14);
			local472.aClass3_Sub9_Sub2_2.method5601(Static573.anInt6752);
			Static148.method2572(local472);
			Static573.anInt6752 = -1;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	public static void method8280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(7, arg0);
		local8.method1474();
		local8.anInt1728 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZIZIB)I")
	public static int method8283(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class3_Sub52 local10 = Static504.method7331(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray653.length; local18++) {
			if (local10.anIntArray653[local18] >= 0 && Static298.aClass132_1.anInt3568 > local10.anIntArray653[local18]) {
				@Pc(43) Class259 local43 = Static298.aClass132_1.method3062(local10.anIntArray653[local18]);
				@Pc(53) int local53 = local43.method6450(Static220.aClass214_2.method5419(arg0).anInt3158, arg0);
				if (arg1) {
					local16 += local10.anIntArray654[local18] * local53;
				} else {
					local16 += local53;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8285(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)[I")
	public static int[] method8287() {
		return new int[] { Static8.anInt127, Static162.anInt3230, Static511.anInt8579 };
	}
}
