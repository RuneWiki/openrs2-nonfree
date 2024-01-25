import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
	public static int anInt4753;

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
	public static int anInt4754;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "J")
	public static long aLong129 = 0L;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "[B")
	public static final byte[] aByteArray97 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	public static void method3833() {
		for (@Pc(11) int local11 = 0; local11 < Static66.anInt133; local11++) {
			@Pc(17) Class218 local17 = Static62.aClass218Array1[local11];
			@Pc(19) boolean local19 = false;
			@Pc(144) int local144;
			if (local17.aClass2_Sub3_Sub3_4 == null) {
				local17.anInt5948--;
				if (local17.anInt5948 < (local17.aByte87 == 2 ? -1500 : -10)) {
					local19 = true;
				} else {
					if (local17.aByte87 == 1 && local17.aClass222_1 == null) {
						local17.aClass222_1 = Static464.method4830(Static285.aClass160_58, local17.anInt5946, 0);
						if (local17.aClass222_1 == null) {
							continue;
						}
						local17.anInt5948 += local17.aClass222_1.method4832();
					} else if (local17.aByte87 == 2 && (local17.aClass2_Sub41_1 == null || local17.aClass2_Sub10_Sub1_2 == null)) {
						if (local17.aClass2_Sub41_1 == null) {
							local17.aClass2_Sub41_1 = Static403.method5302(Static167.aClass160_28, local17.anInt5946);
						}
						if (local17.aClass2_Sub41_1 == null) {
							continue;
						}
						if (local17.aClass2_Sub10_Sub1_2 == null) {
							local17.aClass2_Sub10_Sub1_2 = local17.aClass2_Sub41_1.method5304(new int[] { 22050 });
							if (local17.aClass2_Sub10_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local17.anInt5948 < 0) {
						if (local17.anInt5950 == 0) {
							local144 = Static12.aClass79_Sub1_1.anInt4920 * local17.anInt5947 >> 8;
						} else {
							@Pc(134) int local134 = local17.anInt5950 >> 24 & 0x3;
							if (Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 == local134) {
								@Pc(153) int local153 = (local17.anInt5950 & 0xFF) << 7;
								@Pc(160) int local160 = local17.anInt5950 >> 16 & 0xFF;
								@Pc(170) int local170 = (local160 << 7) + 64 - Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119;
								if (local170 < 0) {
									local170 = -local170;
								}
								@Pc(182) int local182 = local17.anInt5950 >> 8 & 0xFF;
								@Pc(192) int local192 = (local182 << 7) + 64 - Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121;
								if (local192 < 0) {
									local192 = -local192;
								}
								@Pc(203) int local203 = local192 + local170 - 128;
								if (local203 > local153) {
									local17.anInt5948 = -99999;
									continue;
								}
								if (local203 < 0) {
									local203 = 0;
								}
								local144 = local17.anInt5947 * (local153 - local203) * Static12.aClass79_Sub1_1.anInt4915 / local153 >> 8;
							} else {
								local144 = 0;
							}
						}
						if (local144 > 0) {
							@Pc(244) Class2_Sub10_Sub1 local244 = null;
							if (local17.aByte87 == 1) {
								local244 = local17.aClass222_1.method4829().method728(Static380.aClass63_1);
							} else if (local17.aByte87 == 2) {
								local244 = local17.aClass2_Sub10_Sub1_2;
							}
							@Pc(272) Class2_Sub3_Sub3 local272 = local17.aClass2_Sub3_Sub3_4 = Static460.method2485(local244, local144);
							local272.method2497(local17.anInt5951 - 1);
							Static260.aClass2_Sub3_Sub1_2.method1827(local272);
						}
					}
				}
			} else if (!local17.aClass2_Sub3_Sub3_4.method5865()) {
				local19 = true;
			}
			if (local19) {
				Static66.anInt133--;
				for (local144 = local11; local144 < Static66.anInt133; local144++) {
					Static62.aClass218Array1[local144] = Static62.aClass218Array1[local144 + 1];
				}
				local11--;
			}
		}
		if (Static144.aBoolean238 && !Static283.method1317()) {
			if (Static12.aClass79_Sub1_1.anInt4931 != 0 && Static342.anInt5851 != -1) {
				Static59.method1150(Static186.aClass160_34, Static342.anInt5851, Static12.aClass79_Sub1_1.anInt4931);
			}
			Static144.aBoolean238 = false;
		} else if (Static12.aClass79_Sub1_1.anInt4931 != 0 && Static342.anInt5851 != -1 && !Static283.method1317()) {
			Static159.method2586(Static80.aClass54_104);
			Static424.aClass2_Sub23_Sub2_1.method5506(Static342.anInt5851);
			Static342.anInt5851 = -1;
		}
	}
}
