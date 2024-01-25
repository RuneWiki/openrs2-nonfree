import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "Lclient!hj;")
	public static Class142 aClass142_1;

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V")
	public static void method400() {
		for (@Pc(3) int local3 = 0; local3 < Static406.anInt7043; local3++) {
			@Pc(9) Class22 local9 = Static479.aClass22Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(226) int local226;
			if (local9.aClass4_Sub13_Sub2_1 == null) {
				local9.anInt466--;
				if (local9.anInt466 >= (local9.method446() ? -1500 : -10)) {
					if (local9.aByte5 == 1 && local9.aClass277_1 == null) {
						local9.aClass277_1 = Static609.method6077(Static329.aClass31_70, local9.anInt463, 0);
						if (local9.aClass277_1 == null) {
							continue;
						}
						local9.anInt466 += local9.aClass277_1.method6078();
					} else if (local9.method446() && (local9.aClass4_Sub24_1 == null || local9.aClass4_Sub16_Sub1_1 == null)) {
						if (local9.aClass4_Sub24_1 == null) {
							local9.aClass4_Sub24_1 = Static239.method4066(Static226.aClass31_51, local9.anInt463);
						}
						if (local9.aClass4_Sub24_1 == null) {
							continue;
						}
						if (local9.aClass4_Sub16_Sub1_1 == null) {
							local9.aClass4_Sub16_Sub1_1 = local9.aClass4_Sub24_1.method4063(new int[] { 22050 });
							if (local9.aClass4_Sub16_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local9.anInt466 < 0) {
						if (local9.anInt464 == 0) {
							local226 = local9.anInt458 * (local9.aByte5 == 3 ? Static189.aClass4_Sub2_Sub1_1.anInt9282 : Static189.aClass4_Sub2_Sub1_1.anInt9298) >> 8;
						} else {
							@Pc(125) int local125 = local9.anInt464 >> 24 & 0x3;
							if (Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 == local125) {
								@Pc(140) int local140 = (local9.anInt464 & 0xFF) << 9;
								@Pc(147) int local147 = local9.anInt464 >> 16 & 0xFF;
								@Pc(156) int local156 = (local147 << 9) + 256 - Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934;
								if (local156 < 0) {
									local156 = -local156;
								}
								@Pc(168) int local168 = local9.anInt464 >> 8 & 0xFF;
								@Pc(178) int local178 = (local168 << 9) + 256 - Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929;
								if (local178 < 0) {
									local178 = -local178;
								}
								@Pc(192) int local192 = local178 + local156 - 512;
								if (local192 > local140) {
									local9.anInt466 = -99999;
									continue;
								}
								if (local192 < 0) {
									local192 = 0;
								}
								local226 = local9.anInt458 * Static189.aClass4_Sub2_Sub1_1.anInt9277 * (local140 - local192) / local140 >> 8;
							} else {
								local226 = 0;
							}
						}
						if (local226 > 0) {
							@Pc(253) Class4_Sub16_Sub1 local253 = null;
							if (local9.aByte5 == 1) {
								local253 = local9.aClass277_1.method6080().method2817(Static27.aClass342_1);
							} else if (local9.method446()) {
								local253 = local9.aClass4_Sub16_Sub1_1;
							}
							@Pc(281) Class4_Sub13_Sub2 local281 = local9.aClass4_Sub13_Sub2_1 = Static604.method3905(local253, local226);
							local281.method3914(local9.anInt467 - 1);
							Static430.aClass4_Sub13_Sub1_1.method2272(local281);
						}
					}
				} else {
					local11 = true;
				}
			} else if (!local9.aClass4_Sub13_Sub2_1.method8014()) {
				local11 = true;
			}
			if (local11) {
				Static406.anInt7043--;
				for (local226 = local3; local226 < Static406.anInt7043; local226++) {
					Static479.aClass22Array1[local226] = Static479.aClass22Array1[local226 + 1];
				}
				local3--;
			}
		}
		if (Static327.aBoolean615 && !Static295.method4625()) {
			if (Static189.aClass4_Sub2_Sub1_1.anInt9295 != 0 && Static416.anInt7187 != -1) {
				Static565.method7768(Static416.anInt7187, Static189.aClass4_Sub2_Sub1_1.anInt9295, Static291.aClass31_66);
			}
			Static327.aBoolean615 = false;
		} else if (Static189.aClass4_Sub2_Sub1_1.anInt9295 != 0 && Static416.anInt7187 != -1 && !Static295.method4625()) {
			@Pc(370) Class4_Sub41 local370 = Static128.method2707(Static478.aClass61_111, Class16_Sub3.lb);
			local370.aClass4_Sub9_Sub1_3.method5963(Static416.anInt7187);
			Static551.method7603(local370);
			Static416.anInt7187 = -1;
		}
	}
}
