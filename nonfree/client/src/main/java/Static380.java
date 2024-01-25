import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
	public static int anInt10435;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lclient!ha;")
	public static Class13 aClass13_86;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_181 = new Class145(71, 1);

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "[F")
	public static final float[] aFloatArray109 = new float[4];

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_228 = new Class200(20, -2);

	@OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
	public static int anInt10437 = 0;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "(I)V")
	public static void method8875() {
		for (@Pc(3) int local3 = 0; local3 < Static110.anInt2383; local3++) {
			@Pc(9) Class301 local9 = Static301.aClass301Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(142) int local142;
			if (local9.aClass2_Sub11_Sub4_4 == null) {
				local9.anInt7906--;
				if (local9.anInt7906 < (local9.method6928() ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte102 == 1 && local9.aClass134_1 == null) {
						local9.aClass134_1 = Static652.method3295(Static75.aClass238_236, local9.anInt7903, 0);
						if (local9.aClass134_1 == null) {
							continue;
						}
						local9.anInt7906 += local9.aClass134_1.method3297();
					} else if (local9.method6928() && (local9.aClass2_Sub38_3 == null || local9.aClass2_Sub14_Sub1_4 == null)) {
						if (local9.aClass2_Sub38_3 == null) {
							local9.aClass2_Sub38_3 = Static504.method7034(Static441.aClass238_203, local9.anInt7903);
						}
						if (local9.aClass2_Sub38_3 == null) {
							continue;
						}
						if (local9.aClass2_Sub14_Sub1_4 == null) {
							local9.aClass2_Sub14_Sub1_4 = local9.aClass2_Sub38_3.method7032(new int[] { 22050 });
							if (local9.aClass2_Sub14_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local9.anInt7906 < 0) {
						@Pc(118) int local118 = 8192;
						if (local9.anInt7902 == 0) {
							local142 = local9.anInt7908 * (local9.aByte102 == 3 ? Static305.aClass2_Sub49_15.aClass33_Sub9_4.method3103() : Static305.aClass2_Sub49_15.aClass33_Sub9_5.method3103()) >> 2;
						} else {
							@Pc(151) int local151 = local9.anInt7902 >> 24 & 0x3;
							if (local151 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109) {
								@Pc(166) int local166 = (local9.anInt7902 & 0xFF) << 9;
								@Pc(172) int local172 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() << 8;
								@Pc(179) int local179 = local9.anInt7902 >> 16 & 0xFF;
								@Pc(191) int local191 = (local179 << 9) + local172 + 256 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037;
								@Pc(198) int local198 = local9.anInt7902 >> 8 & 0xFF;
								@Pc(211) int local211 = (local198 << 9) + local172 + 256 - Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034;
								@Pc(220) int local220 = Math.abs(local191) + Math.abs(local211) - 512;
								if (local220 > local166) {
									local9.anInt7906 = -99999;
									continue;
								}
								if (local220 < 0) {
									local220 = 0;
								}
								local142 = (local166 - local220) * Static305.aClass2_Sub49_15.aClass33_Sub9_1.method3103() * local9.anInt7908 / local166 >> 2;
								if (local9.aClass16_Sub1_22 != null && local9.aClass16_Sub1_22 instanceof Class16_Sub1_Sub1) {
									@Pc(259) Class16_Sub1_Sub1 local259 = (Class16_Sub1_Sub1) local9.aClass16_Sub1_22;
									@Pc(262) short local262 = local259.aShort106;
									@Pc(265) short local265 = local259.aShort103;
								}
								if (local191 != 0 || local211 != 0) {
									@Pc(288) int local288 = -Static400.anInt7896 - (int) (Math.atan2((double) local191, (double) local211) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local288 > 8192) {
										local288 = 16384 - local288;
									}
									@Pc(301) int local301;
									if (local220 <= 0) {
										local301 = 8192;
									} else if (local220 < 4096) {
										local301 = (8192 - local220) / 4096 + 8192;
									} else {
										local301 = 16384;
									}
									local118 = local288 * local301 / 8192 + (16384 - local301 >> 1);
								}
							} else {
								local142 = 0;
							}
						}
						if (local142 > 0) {
							@Pc(338) Class2_Sub14_Sub1 local338 = null;
							if (local9.aByte102 == 1) {
								local338 = local9.aClass134_1.method3296().method1819(Static311.aClass276_3);
							} else if (local9.method6928()) {
								local338 = local9.aClass2_Sub14_Sub1_4;
							}
							@Pc(366) Class2_Sub11_Sub4 local366 = local9.aClass2_Sub11_Sub4_4 = Static653.method3343(local338, local9.anInt7905, local142, local118);
							local366.method3341(local9.anInt7899 - 1);
							Static622.aClass2_Sub11_Sub2_2.method2952(local366);
						}
					}
				}
			} else if (!local9.aClass2_Sub11_Sub4_4.method8921()) {
				local11 = true;
			}
			if (local11) {
				Static110.anInt2383--;
				for (local142 = local3; local142 < Static110.anInt2383; local142++) {
					Static301.aClass301Array1[local142] = Static301.aClass301Array1[local142 + 1];
				}
				local3--;
			}
		}
		if (Static609.aBoolean725 && !Static260.method4309()) {
			if (Static305.aClass2_Sub49_15.aClass33_Sub9_3.method3103() != 0 && Static57.anInt1427 != -1) {
				if (Static262.aClass2_Sub11_Sub1_3 == null) {
					Static555.method7833(Static609.aClass238_284, Static305.aClass2_Sub49_15.aClass33_Sub9_3.method3103(), Static57.anInt1427);
				} else {
					Static467.method8861(Static609.aClass238_284, Static305.aClass2_Sub49_15.aClass33_Sub9_3.method3103(), Static57.anInt1427, Static262.aClass2_Sub11_Sub1_3);
				}
			}
			Static262.aClass2_Sub11_Sub1_3 = null;
			Static609.aBoolean725 = false;
		} else if (Static305.aClass2_Sub49_15.aClass33_Sub9_3.method3103() != 0 && Static57.anInt1427 != -1 && !Static260.method4309()) {
			@Pc(440) Class2_Sub31 local440 = Static275.method4480(Static640.aClass314_2, Static470.aClass145_136);
			local440.aClass2_Sub17_Sub1_2.method2827(Static57.anInt1427);
			Static526.method7309(local440);
			Static57.anInt1427 = -1;
		}
	}
}
