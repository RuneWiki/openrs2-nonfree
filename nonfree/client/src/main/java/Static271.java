import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean365 = true;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
	public static void method4798() {
		for (@Pc(12) int local12 = 0; local12 < Static277.anInt5443; local12++) {
			@Pc(18) Class224 local18 = Static280.aClass224Array1[local12];
			@Pc(20) boolean local20 = false;
			@Pc(138) int local138;
			if (local18.aClass6_Sub3_Sub3_1 == null) {
				local18.anInt6904--;
				if (local18.anInt6904 < (local18.method5926() ? -1500 : -10)) {
					local20 = true;
				} else {
					if (local18.aByte78 == 1 && local18.aClass258_1 == null) {
						local18.aClass258_1 = Static656.method6812(Static323.aClass353_55, local18.anInt6910, 0);
						if (local18.aClass258_1 == null) {
							continue;
						}
						local18.anInt6904 += local18.aClass258_1.method6811();
					} else if (local18.method5926() && (local18.aClass6_Sub7_1 == null || local18.aClass6_Sub37_Sub1_1 == null)) {
						if (local18.aClass6_Sub7_1 == null) {
							local18.aClass6_Sub7_1 = Static63.method1143(Static237.aClass353_44, local18.anInt6910);
						}
						if (local18.aClass6_Sub7_1 == null) {
							continue;
						}
						if (local18.aClass6_Sub37_Sub1_1 == null) {
							local18.aClass6_Sub37_Sub1_1 = local18.aClass6_Sub7_1.method1142(new int[] { 22050 });
							if (local18.aClass6_Sub37_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local18.anInt6904 < 0) {
						@Pc(118) int local118 = 8192;
						if (local18.anInt6909 == 0) {
							local138 = local18.anInt6911 * (local18.aByte78 == 3 ? Static348.aClass6_Sub22_19.aClass15_Sub18_4.method5678() : Static348.aClass6_Sub22_19.aClass15_Sub18_3.method5678()) >> 2;
						} else {
							@Pc(128) int local128 = local18.anInt6909 >> 24 & 0x3;
							if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 == local128) {
								@Pc(147) int local147 = (local18.anInt6909 & 0xFF) << 9;
								@Pc(153) int local153 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() << 8;
								@Pc(160) int local160 = local18.anInt6909 >> 16 & 0xFF;
								@Pc(171) int local171 = local153 + (local160 << 9) + 256 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725;
								@Pc(178) int local178 = local18.anInt6909 >> 8 & 0xFF;
								@Pc(191) int local191 = (local178 << 9) + local153 + 256 - Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729;
								@Pc(200) int local200 = Math.abs(local171) + Math.abs(local191) - 512;
								if (local147 < local200) {
									local18.anInt6904 = -99999;
									continue;
								}
								if (local200 < 0) {
									local200 = 0;
								}
								local138 = Static348.aClass6_Sub22_19.lb.method5678() * (local147 - local200) * local18.anInt6911 / local147 >> 2;
								if (local18.aClass20_Sub2_17 != null && local18.aClass20_Sub2_17 instanceof Class20_Sub2_Sub2) {
									@Pc(242) Class20_Sub2_Sub2 local242 = (Class20_Sub2_Sub2) local18.aClass20_Sub2_17;
									@Pc(245) short local245 = local242.aShort124;
									@Pc(248) short local248 = local242.aShort123;
								}
								if (local171 != 0 || local191 != 0) {
									@Pc(272) int local272 = -Static470.anInt8261 - (int) (Math.atan2((double) local171, (double) local191) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local272 > 8192) {
										local272 = 16384 - local272;
									}
									@Pc(284) int local284;
									if (local200 <= 0) {
										local284 = 8192;
									} else if (local200 >= 4096) {
										local284 = 16384;
									} else {
										local284 = (8192 - local200) / 4096 + 8192;
									}
									local118 = (16384 - local284 >> 1) + local272 * local284 / 8192;
								}
							} else {
								local138 = 0;
							}
						}
						if (local138 > 0) {
							@Pc(340) Class6_Sub37_Sub1 local340 = null;
							if (local18.aByte78 == 1) {
								local340 = local18.aClass258_1.method6813().method8306(Static17.aClass194_1);
							} else if (local18.method5926()) {
								local340 = local18.aClass6_Sub37_Sub1_1;
							}
							@Pc(370) Class6_Sub3_Sub3 local370 = local18.aClass6_Sub3_Sub3_1 = Static653.method3866(local340, local18.anInt6907, local138, local118);
							local370.method3841(local18.anInt6908 - 1);
							Static196.aClass6_Sub3_Sub1_1.method271(local370);
						}
					}
				}
			} else if (!local18.aClass6_Sub3_Sub3_1.method9042()) {
				local20 = true;
			}
			if (local20) {
				Static277.anInt5443--;
				for (local138 = local12; local138 < Static277.anInt5443; local138++) {
					Static280.aClass224Array1[local138] = Static280.aClass224Array1[local138 + 1];
				}
				local12--;
			}
		}
		if (Static166.aBoolean250 && !Static7.method145()) {
			if (Static348.aClass6_Sub22_19.aClass15_Sub18_2.method5678() != 0 && Static152.anInt5128 != -1) {
				if (Static452.aClass6_Sub3_Sub4_2 == null) {
					Static61.method1084(Static348.aClass6_Sub22_19.aClass15_Sub18_2.method5678(), Static364.aClass353_60, Static152.anInt5128);
				} else {
					Static321.method5341(Static452.aClass6_Sub3_Sub4_2, Static152.anInt5128, Static364.aClass353_60, Static348.aClass6_Sub22_19.aClass15_Sub18_2.method5678());
				}
			}
			Static452.aClass6_Sub3_Sub4_2 = null;
			Static166.aBoolean250 = false;
		} else if (Static348.aClass6_Sub22_19.aClass15_Sub18_2.method5678() != 0 && Static152.anInt5128 != -1 && !Static7.method145()) {
			@Pc(441) Class6_Sub9 local441 = Static560.method8089(Static391.aClass126_1, Static586.aClass208_88);
			local441.aClass6_Sub40_Sub2_1.method8554(Static152.anInt5128);
			Static263.method4681(local441);
			Static152.anInt5128 = -1;
		}
	}
}
