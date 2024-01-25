import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_49 = new Class112(128, 4);

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
	public static final int[] anIntArray502 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
	public static int anInt8015 = 100;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public static void method6705() {
		for (@Pc(3) int local3 = 0; local3 < Static224.anInt5125; local3++) {
			@Pc(9) Class208 local9 = Static620.aClass208Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(137) int local137;
			if (local9.aClass3_Sub7_Sub1_4 == null) {
				local9.anInt6569--;
				if (local9.anInt6569 < (local9.method5501() ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte88 == 1 && local9.aClass64_1 == null) {
						local9.aClass64_1 = Static652.method2497(Static462.aClass181_92, local9.anInt6574, 0);
						if (local9.aClass64_1 == null) {
							continue;
						}
						local9.anInt6569 += local9.aClass64_1.method2496();
					} else if (local9.method5501() && (local9.aClass3_Sub47_3 == null || local9.aClass3_Sub12_Sub1_4 == null)) {
						if (local9.aClass3_Sub47_3 == null) {
							local9.aClass3_Sub47_3 = Static538.method7653(Static349.aClass181_64, local9.anInt6574);
						}
						if (local9.aClass3_Sub47_3 == null) {
							continue;
						}
						if (local9.aClass3_Sub12_Sub1_4 == null) {
							local9.aClass3_Sub12_Sub1_4 = local9.aClass3_Sub47_3.method7648(new int[] { 22050 });
							if (local9.aClass3_Sub12_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local9.anInt6569 < 0) {
						@Pc(113) int local113 = 8192;
						if (local9.anInt6571 == 0) {
							local137 = local9.anInt6573 * (local9.aByte88 == 3 ? Static552.aClass3_Sub48_30.aClass23_Sub8_5.method3378() : Static552.aClass3_Sub48_30.aClass23_Sub8_2.method3378()) >> 2;
						} else {
							@Pc(146) int local146 = local9.anInt6571 >> 24 & 0x3;
							if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 == local146) {
								@Pc(165) int local165 = (local9.anInt6571 & 0xFF) << 9;
								@Pc(171) int local171 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308() << 8;
								@Pc(178) int local178 = local9.anInt6571 >> 16 & 0xFF;
								@Pc(190) int local190 = local171 + (local178 << 9) + 256 - Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428;
								@Pc(197) int local197 = local9.anInt6571 >> 8 & 0xFF;
								@Pc(208) int local208 = local171 + (local197 << 9) - (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 - 256);
								@Pc(216) int local216 = Math.abs(local190) + Math.abs(local208) - 512;
								if (local165 < local216) {
									local9.anInt6569 = -99999;
									continue;
								}
								if (local216 < 0) {
									local216 = 0;
								}
								local137 = (local165 - local216) * Static552.aClass3_Sub48_30.aClass23_Sub8_3.method3378() * local9.anInt6573 / local165 >> 2;
								if (local9.aClass2_Sub3_16 != null && local9.aClass2_Sub3_16 instanceof Class2_Sub3_Sub1) {
									@Pc(263) Class2_Sub3_Sub1 local263 = (Class2_Sub3_Sub1) local9.aClass2_Sub3_16;
									@Pc(266) short local266 = local263.aShort124;
									@Pc(269) short local269 = local263.aShort121;
								}
								if (local190 != 0 || local208 != 0) {
									@Pc(292) int local292 = -Static166.anInt3989 - (int) (Math.atan2((double) local190, (double) local208) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local292 > 8192) {
										local292 = 16384 - local292;
									}
									@Pc(316) int local316;
									if (local216 <= 0) {
										local316 = 8192;
									} else if (local216 < 4096) {
										local316 = (8192 - local216) / 4096 + 8192;
									} else {
										local316 = 16384;
									}
									local113 = local316 * local292 / 8192 + (16384 - local316 >> 1);
								}
							} else {
								local137 = 0;
							}
						}
						if (local137 > 0) {
							@Pc(345) Class3_Sub12_Sub1 local345 = null;
							if (local9.aByte88 == 1) {
								local345 = local9.aClass64_1.method2494().method5544(Static487.aClass381_2);
							} else if (local9.method5501()) {
								local345 = local9.aClass3_Sub12_Sub1_4;
							}
							@Pc(373) Class3_Sub7_Sub1 local373 = local9.aClass3_Sub7_Sub1_4 = Static650.method680(local345, local9.anInt6570, local137, local113);
							local373.method650(local9.anInt6575 - 1);
							Static581.aClass3_Sub7_Sub3_2.method2209(local373);
						}
					}
				}
			} else if (!local9.aClass3_Sub7_Sub1_4.method8670()) {
				local11 = true;
			}
			if (local11) {
				Static224.anInt5125--;
				for (local137 = local3; local137 < Static224.anInt5125; local137++) {
					Static620.aClass208Array1[local137] = Static620.aClass208Array1[local137 + 1];
				}
				local3--;
			}
		}
		if (Static48.aBoolean89 && !Static161.method3405()) {
			if (Static552.aClass3_Sub48_30.aClass23_Sub8_1.method3378() != 0 && Static148.anInt3680 != -1) {
				if (Static408.aClass3_Sub7_Sub5_3 == null) {
					Static195.method6190(Static399.aClass181_75, Static552.aClass3_Sub48_30.aClass23_Sub8_1.method3378(), Static148.anInt3680);
				} else {
					Static95.method2483(Static552.aClass3_Sub48_30.aClass23_Sub8_1.method3378(), Static148.anInt3680, Static399.aClass181_75, Static408.aClass3_Sub7_Sub5_3);
				}
			}
			Static48.aBoolean89 = false;
			Static408.aClass3_Sub7_Sub5_3 = null;
		} else if (Static552.aClass3_Sub48_30.aClass23_Sub8_1.method3378() != 0 && Static148.anInt3680 != -1 && !Static161.method3405()) {
			@Pc(463) Class3_Sub26 local463 = Static640.method8636(Static478.aClass344_120, Static403.aClass294_3);
			local463.aClass3_Sub15_Sub1_3.method8419(Static148.anInt3680);
			Static472.method5189(local463);
			Static148.anInt3680 = -1;
		}
	}
}
