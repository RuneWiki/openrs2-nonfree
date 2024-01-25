import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!gp;")
	public static Class117 aClass117_175;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "F")
	public static float aFloat314;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
	public static void method6027(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg0, 16);
		local8.method1324();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method6030() {
		for (@Pc(12) int local12 = 0; local12 < Static469.anInt8085; local12++) {
			@Pc(18) Class217 local18 = Static310.aClass217Array1[local12];
			@Pc(20) boolean local20 = false;
			@Pc(126) int local126;
			if (local18.aClass5_Sub15_Sub1_3 == null) {
				local18.anInt6476--;
				if ((local18.aByte62 == 2 ? -1500 : -10) <= local18.anInt6476) {
					if (local18.aByte62 == 1 && local18.aClass200_1 == null) {
						local18.aClass200_1 = Static554.method5070(Static371.aClass117_157, local18.anInt6478, 0);
						if (local18.aClass200_1 == null) {
							continue;
						}
						local18.anInt6476 += local18.aClass200_1.method5069();
					} else if (local18.aByte62 == 2 && (local18.aClass5_Sub33_1 == null || local18.aClass5_Sub5_Sub1_1 == null)) {
						if (local18.aClass5_Sub33_1 == null) {
							local18.aClass5_Sub33_1 = Static333.method5229(Static476.aClass117_204, local18.anInt6478);
						}
						if (local18.aClass5_Sub33_1 == null) {
							continue;
						}
						if (local18.aClass5_Sub5_Sub1_1 == null) {
							local18.aClass5_Sub5_Sub1_1 = local18.aClass5_Sub33_1.method5232(new int[] { 22050 });
							if (local18.aClass5_Sub5_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local18.anInt6476 < 0) {
						if (local18.anInt6480 == 0) {
							local126 = Static300.aClass5_Sub28_Sub1_1.anInt4871 * local18.anInt6479 >> 8;
						} else {
							@Pc(135) int local135 = local18.anInt6480 >> 24 & 0x3;
							if (Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 == local135) {
								@Pc(150) int local150 = (local18.anInt6480 & 0xFF) << 7;
								@Pc(157) int local157 = local18.anInt6480 >> 16 & 0xFF;
								@Pc(167) int local167 = (local157 << 7) + 64 - Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492;
								if (local167 < 0) {
									local167 = -local167;
								}
								@Pc(182) int local182 = local18.anInt6480 >> 8 & 0xFF;
								@Pc(192) int local192 = (local182 << 7) + 64 - Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493;
								if (local192 < 0) {
									local192 = -local192;
								}
								@Pc(206) int local206 = local192 + local167 - 128;
								if (local150 < local206) {
									local18.anInt6476 = -99999;
									continue;
								}
								if (local206 < 0) {
									local206 = 0;
								}
								local126 = local18.anInt6479 * Static300.aClass5_Sub28_Sub1_1.anInt4870 * (local150 - local206) / local150 >> 8;
							} else {
								local126 = 0;
							}
						}
						if (local126 > 0) {
							@Pc(244) Class5_Sub5_Sub1 local244 = null;
							if (local18.aByte62 == 1) {
								local244 = local18.aClass200_1.method5068().method616(Static151.aClass157_1);
							} else if (local18.aByte62 == 2) {
								local244 = local18.aClass5_Sub5_Sub1_1;
							}
							@Pc(270) Class5_Sub15_Sub1 local270 = local18.aClass5_Sub15_Sub1_3 = Static552.method2476(local244, local126);
							local270.method2472(local18.anInt6475 - 1);
							Static373.aClass5_Sub15_Sub2_1.method4866(local270);
						}
					}
				} else {
					local20 = true;
				}
			} else if (!local18.aClass5_Sub15_Sub1_3.method7426()) {
				local20 = true;
			}
			if (local20) {
				Static469.anInt8085--;
				for (local126 = local12; local126 < Static469.anInt8085; local126++) {
					Static310.aClass217Array1[local126] = Static310.aClass217Array1[local126 + 1];
				}
				local12--;
			}
		}
		if (Static359.aBoolean477 && !Static133.method2508()) {
			if (Static300.aClass5_Sub28_Sub1_1.anInt4889 != 0 && Static161.anInt3277 != -1) {
				Static19.method6150(Static161.anInt3277, Static108.aClass117_61, Static300.aClass5_Sub28_Sub1_1.anInt4889);
			}
			Static359.aBoolean477 = false;
		} else if (Static300.aClass5_Sub28_Sub1_1.anInt4889 != 0 && Static161.anInt3277 != -1 && !Static133.method2508()) {
			Static415.method5995(Static305.aClass236_51);
			Static164.aClass5_Sub3_Sub1_2.method4184(Static161.anInt3277);
			Static161.anInt3277 = -1;
		}
	}
}
