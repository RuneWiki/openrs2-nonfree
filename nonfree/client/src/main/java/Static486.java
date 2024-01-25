import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public static int anInt9004;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!ria;")
	public static final Class298 aClass298_10 = new Class298();

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
	public static boolean aBoolean654 = false;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
	public static int anInt9019 = 0;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
	public static void method7563() {
		for (@Pc(11) int local11 = 0; local11 < Static395.anInt7569; local11++) {
			@Pc(17) Class125 local17 = Static443.aClass125Array1[local11];
			@Pc(19) boolean local19 = false;
			@Pc(151) int local151;
			if (local17.aClass2_Sub8_Sub5_1 == null) {
				local17.anInt4519--;
				if (local17.anInt4519 >= (local17.method3953() ? -1500 : -10)) {
					if (local17.aByte72 == 1 && local17.aClass61_1 == null) {
						local17.aClass61_1 = Static647.method2140(Static377.aClass157_192, local17.anInt4518, 0);
						if (local17.aClass61_1 == null) {
							continue;
						}
						local17.anInt4519 += local17.aClass61_1.method2138();
					} else if (local17.method3953() && (local17.aClass2_Sub22_1 == null || local17.aClass2_Sub29_Sub1_1 == null)) {
						if (local17.aClass2_Sub22_1 == null) {
							local17.aClass2_Sub22_1 = Static220.method4252(Static282.aClass157_139, local17.anInt4518);
						}
						if (local17.aClass2_Sub22_1 == null) {
							continue;
						}
						if (local17.aClass2_Sub29_Sub1_1 == null) {
							local17.aClass2_Sub29_Sub1_1 = local17.aClass2_Sub22_1.method4250(new int[] { 22050 });
							if (local17.aClass2_Sub29_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local17.anInt4519 < 0) {
						@Pc(129) int local129 = 8192;
						if (local17.anInt4514 == 0) {
							local151 = local17.anInt4517 * (local17.aByte72 == 3 ? Static74.aClass2_Sub13_5.aClass14_Sub6_1.method3223() : Static74.aClass2_Sub13_5.aClass14_Sub6_5.method3223()) >> 2;
						} else {
							@Pc(160) int local160 = local17.anInt4514 >> 24 & 0x3;
							if (local160 == Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132) {
								@Pc(175) int local175 = (local17.anInt4514 & 0xFF) << 9;
								@Pc(181) int local181 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() << 8;
								@Pc(188) int local188 = local17.anInt4514 >> 16 & 0xFF;
								@Pc(200) int local200 = (local188 << 9) + local181 + 256 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303;
								@Pc(207) int local207 = local17.anInt4514 >> 8 & 0xFF;
								@Pc(218) int local218 = (local207 << 9) + local181 + 256 - Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310;
								@Pc(226) int local226 = Math.abs(local200) + Math.abs(local218) - 512;
								if (local226 > local175) {
									local17.anInt4519 = -99999;
									continue;
								}
								if (local226 < 0) {
									local226 = 0;
								}
								local151 = (local175 - local226) * Static74.aClass2_Sub13_5.aClass14_Sub6_2.method3223() * local17.anInt4517 / local175 >> 2;
								if (local17.aClass3_Sub1_14 != null && local17.aClass3_Sub1_14 instanceof Class3_Sub1_Sub3) {
									@Pc(270) Class3_Sub1_Sub3 local270 = (Class3_Sub1_Sub3) local17.aClass3_Sub1_14;
									@Pc(273) short local273 = local270.aShort118;
									@Pc(276) short local276 = local270.aShort120;
								}
								if (local200 != 0 || local218 != 0) {
									@Pc(297) int local297 = -Static189.anInt11070 - (int) (Math.atan2((double) local200, (double) local218) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local297 > 8192) {
										local297 = 16384 - local297;
									}
									@Pc(314) int local314;
									if (local226 <= 0) {
										local314 = 8192;
									} else if (local226 >= 4096) {
										local314 = 16384;
									} else {
										local314 = (8192 - local226) / 4096 + 8192;
									}
									local129 = (16384 - local314 >> 1) + local314 * local297 / 8192;
								}
							} else {
								local151 = 0;
							}
						}
						if (local151 > 0) {
							@Pc(358) Class2_Sub29_Sub1 local358 = null;
							if (local17.aByte72 == 1) {
								local358 = local17.aClass61_1.method2137().method6418(Static28.aClass257_1);
							} else if (local17.method3953()) {
								local358 = local17.aClass2_Sub29_Sub1_1;
							}
							@Pc(388) Class2_Sub8_Sub5 local388 = local17.aClass2_Sub8_Sub5_1 = Static654.method8844(local358, local17.anInt4511, local151, local129);
							local388.method8850(local17.anInt4513 - 1);
							Static614.aClass2_Sub8_Sub4_2.method7928(local388);
						}
					}
				} else {
					local19 = true;
				}
			} else if (!local17.aClass2_Sub8_Sub5_1.method9250()) {
				local19 = true;
			}
			if (local19) {
				Static395.anInt7569--;
				for (local151 = local11; local151 < Static395.anInt7569; local151++) {
					Static443.aClass125Array1[local151] = Static443.aClass125Array1[local151 + 1];
				}
				local11--;
			}
		}
		if (Static301.aBoolean468 && !Static425.method6833()) {
			if (Static74.aClass2_Sub13_5.aClass14_Sub6_4.method3223() != 0 && Static580.anInt10350 != -1) {
				if (Static490.aClass2_Sub8_Sub3_6 == null) {
					Static196.method3971(Static580.anInt10350, Static100.aClass157_64, Static74.aClass2_Sub13_5.aClass14_Sub6_4.method3223());
				} else {
					Static417.method6752(Static490.aClass2_Sub8_Sub3_6, Static74.aClass2_Sub13_5.aClass14_Sub6_4.method3223(), Static100.aClass157_64, Static580.anInt10350);
				}
			}
			Static301.aBoolean468 = false;
			Static490.aClass2_Sub8_Sub3_6 = null;
		} else if (Static74.aClass2_Sub13_5.aClass14_Sub6_4.method3223() != 0 && Static580.anInt10350 != -1 && !Static425.method6833()) {
			@Pc(506) Class2_Sub52 local506 = Static130.method3019(Class20_Sub3.lb, Static361.aClass183_1);
			local506.aClass2_Sub11_Sub2_7.method8387(Static580.anInt10350);
			Static96.method2563(local506);
			Static580.anInt10350 = -1;
		}
	}
}
