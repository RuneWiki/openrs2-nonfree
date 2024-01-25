import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fu", name = "G", descriptor = "I")
	public static int anInt2808;

	@OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
	public static int anInt2811;

	@OriginalMember(owner = "client!fu", name = "I", descriptor = "Lclient!kj;")
	public static final Class86 aClass86_1 = Static27.method6641();

	@OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
	public static int anInt2810 = 0;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
	public static void method2387() {
		for (@Pc(11) int local11 = 0; local11 < Static505.anInt8479; local11++) {
			@Pc(17) Class243 local17 = Static461.aClass243Array1[local11];
			@Pc(19) boolean local19 = false;
			@Pc(152) int local152;
			if (local17.aClass6_Sub8_Sub5_4 == null) {
				local17.anInt6783--;
				if (local17.anInt6783 >= (local17.method5814() ? -1500 : -10)) {
					if (local17.aByte108 == 1 && local17.aClass133_1 == null) {
						local17.aClass133_1 = Static682.method3029(Static98.aClass8_123, local17.anInt6780, 0);
						if (local17.aClass133_1 == null) {
							continue;
						}
						local17.anInt6783 += local17.aClass133_1.method3027();
					} else if (local17.method5814() && (local17.aClass6_Sub46_3 == null || local17.aClass6_Sub21_Sub1_4 == null)) {
						if (local17.aClass6_Sub46_3 == null) {
							local17.aClass6_Sub46_3 = Static495.method7152(Static465.aClass8_112, local17.anInt6780);
						}
						if (local17.aClass6_Sub46_3 == null) {
							continue;
						}
						if (local17.aClass6_Sub21_Sub1_4 == null) {
							local17.aClass6_Sub21_Sub1_4 = local17.aClass6_Sub46_3.method7154(new int[] { 22050 });
							if (local17.aClass6_Sub21_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local17.anInt6783 < 0) {
						@Pc(128) int local128 = 8192;
						if (local17.anInt6785 == 0) {
							local152 = local17.anInt6778 * (local17.aByte108 == 3 ? Static96.aClass6_Sub22_7.aClass29_Sub5_4.method1502() : Static96.aClass6_Sub22_7.aClass29_Sub5_5.method1502()) >> 2;
						} else {
							@Pc(161) int local161 = local17.anInt6785 >> 24 & 0x3;
							if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 == local161) {
								@Pc(180) int local180 = (local17.anInt6785 & 0xFF) << 9;
								@Pc(186) int local186 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() << 8;
								@Pc(193) int local193 = local17.anInt6785 >> 16 & 0xFF;
								@Pc(206) int local206 = (local193 << 9) - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 - (-local186 - 256);
								@Pc(213) int local213 = local17.anInt6785 >> 8 & 0xFF;
								@Pc(225) int local225 = local186 + (local213 << 9) + 256 - Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001;
								@Pc(234) int local234 = Math.abs(local206) + Math.abs(local225) - 512;
								if (local234 > local180) {
									local17.anInt6783 = -99999;
									continue;
								}
								if (local234 < 0) {
									local234 = 0;
								}
								local152 = (local180 - local234) * Static96.aClass6_Sub22_7.aClass29_Sub5_1.method1502() * local17.anInt6778 / local180 >> 2;
								if (local17.aClass2_Sub1_18 != null && local17.aClass2_Sub1_18 instanceof Class2_Sub1_Sub1) {
									@Pc(278) Class2_Sub1_Sub1 local278 = (Class2_Sub1_Sub1) local17.aClass2_Sub1_18;
									@Pc(281) short local281 = local278.aShort121;
									@Pc(284) short local284 = local278.aShort118;
								}
								if (local206 != 0 || local225 != 0) {
									@Pc(304) int local304 = -Static672.anInt10375 - (int) (Math.atan2((double) local206, (double) local225) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local304 > 8192) {
										local304 = 16384 - local304;
									}
									@Pc(318) int local318;
									if (local234 <= 0) {
										local318 = 8192;
									} else if (local234 >= 4096) {
										local318 = 16384;
									} else {
										local318 = (8192 - local234) / 4096 + 8192;
									}
									local128 = (16384 - local318 >> 1) + local318 * local304 / 8192;
								}
							} else {
								local152 = 0;
							}
						}
						if (local152 > 0) {
							@Pc(356) Class6_Sub21_Sub1 local356 = null;
							if (local17.aByte108 == 1) {
								local356 = local17.aClass133_1.method3026().method2289(Static20.aClass101_1);
							} else if (local17.method5814()) {
								local356 = local17.aClass6_Sub21_Sub1_4;
							}
							@Pc(384) Class6_Sub8_Sub5 local384 = local17.aClass6_Sub8_Sub5_4 = Static687.method9151(local356, local17.anInt6784, local152, local128);
							local384.method9131(local17.anInt6779 - 1);
							Static106.aClass6_Sub8_Sub3_2.method4256(local384);
						}
					}
				} else {
					local19 = true;
				}
			} else if (!local17.aClass6_Sub8_Sub5_4.method9176()) {
				local19 = true;
			}
			if (local19) {
				Static505.anInt8479--;
				for (local152 = local11; local152 < Static505.anInt8479; local152++) {
					Static461.aClass243Array1[local152] = Static461.aClass243Array1[local152 + 1];
				}
				local11--;
			}
		}
		if (Static416.aBoolean483 && !Static551.method7234()) {
			if (Static96.aClass6_Sub22_7.aClass29_Sub5_2.method1502() != 0 && Static278.anInt9800 != -1) {
				if (Static262.aClass6_Sub8_Sub4_8 == null) {
					Static276.method4067(Static96.aClass6_Sub22_7.aClass29_Sub5_2.method1502(), Static278.anInt9800, Static365.aClass8_98);
				} else {
					Static304.method4368(Static96.aClass6_Sub22_7.aClass29_Sub5_2.method1502(), Static365.aClass8_98, Static278.anInt9800, Static262.aClass6_Sub8_Sub4_8);
				}
			}
			Static416.aBoolean483 = false;
			Static262.aClass6_Sub8_Sub4_8 = null;
		} else if (Static96.aClass6_Sub22_7.aClass29_Sub5_2.method1502() != 0 && Static278.anInt9800 != -1 && !Static551.method7234()) {
			@Pc(490) Class6_Sub26 local490 = Static268.method3981(Static377.aClass15_2, Static197.aClass289_53);
			local490.aClass6_Sub23_Sub1_2.method8364(Static278.anInt9800);
			Static670.method9077(local490);
			Static278.anInt9800 = -1;
		}
	}
}
