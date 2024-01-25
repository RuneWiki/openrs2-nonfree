import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "[I")
	public static int[] anIntArray61;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "I")
	public static int anInt1032;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
	public static int anInt1033;

	@OriginalMember(owner = "client!cda", name = "l", descriptor = "I")
	public static int anInt1034;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_22 = new Class187(31, -1);

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_23 = new Class187(69, 11);

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "Lclient!tga;")
	public static final Class335 aClass335_8 = new Class335(512);

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "Lclient!fda;")
	public static final Class112 aClass112_2 = new Class112();

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "Lclient!pb;")
	public static final Class267 aClass267_1 = new Class267("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
	public static void method958() {
		for (@Pc(15) int local15 = 0; local15 < Static331.anInt6013; local15++) {
			@Pc(21) Class178 local21 = Static515.aClass178Array2[local15];
			@Pc(23) boolean local23 = false;
			@Pc(154) int local154;
			if (local21.aClass5_Sub14_Sub1_1 == null) {
				local21.anInt4274--;
				if (local21.anInt4274 >= (local21.method3796() ? -1500 : -10)) {
					if (local21.aByte47 == 1 && local21.aClass259_1 == null) {
						local21.aClass259_1 = Static682.method6432(Static647.aClass50_113, local21.anInt4271, 0);
						if (local21.aClass259_1 == null) {
							continue;
						}
						local21.anInt4274 += local21.aClass259_1.method6431();
					} else if (local21.method3796() && (local21.aClass5_Sub54_1 == null || local21.aClass5_Sub9_Sub1_1 == null)) {
						if (local21.aClass5_Sub54_1 == null) {
							local21.aClass5_Sub54_1 = Static638.method8461(Static2.aClass50_3, local21.anInt4271);
						}
						if (local21.aClass5_Sub54_1 == null) {
							continue;
						}
						if (local21.aClass5_Sub9_Sub1_1 == null) {
							local21.aClass5_Sub9_Sub1_1 = local21.aClass5_Sub54_1.method8463(new int[] { 22050 });
							if (local21.aClass5_Sub9_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local21.anInt4274 < 0) {
						@Pc(130) int local130 = 8192;
						if (local21.anInt4282 == 0) {
							local154 = local21.anInt4277 * (local21.aByte47 == 3 ? Static655.aClass5_Sub36_29.aClass2_Sub6_2.method3364() : Static655.aClass5_Sub36_29.aClass2_Sub6_5.method3364()) >> 2;
						} else {
							@Pc(163) int local163 = local21.anInt4282 >> 24 & 0x3;
							if (local163 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149) {
								@Pc(174) int local174 = (local21.anInt4282 & 0xFF) << 9;
								@Pc(180) int local180 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() << 8;
								@Pc(187) int local187 = local21.anInt4282 >> 16 & 0xFF;
								@Pc(198) int local198 = (local187 << 9) + local180 + 256 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366;
								@Pc(205) int local205 = local21.anInt4282 >> 8 & 0xFF;
								@Pc(217) int local217 = (local205 << 9) + local180 + 256 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367;
								@Pc(226) int local226 = Math.abs(local198) + Math.abs(local217) - 512;
								if (local226 > local174) {
									local21.anInt4274 = -99999;
									continue;
								}
								if (local226 < 0) {
									local226 = 0;
								}
								local154 = (local174 - local226) * Static655.aClass5_Sub36_29.aClass2_Sub6_1.method3364() * local21.anInt4277 / local174 >> 2;
								if (local21.aClass41_Sub1_11 != null && local21.aClass41_Sub1_11 instanceof Class41_Sub1_Sub1) {
									@Pc(269) Class41_Sub1_Sub1 local269 = (Class41_Sub1_Sub1) local21.aClass41_Sub1_11;
									@Pc(272) short local272 = local269.aShort109;
									@Pc(275) short local275 = local269.aShort108;
								}
								if (local198 != 0 || local217 != 0) {
									@Pc(298) int local298 = -Static493.anInt8442 - (int) (Math.atan2((double) local198, (double) local217) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local298 > 8192) {
										local298 = 16384 - local298;
									}
									@Pc(322) int local322;
									if (local226 <= 0) {
										local322 = 8192;
									} else if (local226 < 4096) {
										local322 = (8192 - local226) / 4096 + 8192;
									} else {
										local322 = 16384;
									}
									local130 = local322 * local298 / 8192 + (16384 - local322 >> 1);
								}
							} else {
								local154 = 0;
							}
						}
						if (local154 > 0) {
							@Pc(351) Class5_Sub9_Sub1 local351 = null;
							if (local21.aByte47 == 1) {
								local351 = local21.aClass259_1.method6434().method462(Static123.aClass158_1);
							} else if (local21.method3796()) {
								local351 = local21.aClass5_Sub9_Sub1_1;
							}
							@Pc(379) Class5_Sub14_Sub1 local379 = local21.aClass5_Sub14_Sub1_1 = Static678.method1349(local351, local21.anInt4273, local154, local130);
							local379.method1361(local21.anInt4275 - 1);
							Static229.aClass5_Sub14_Sub3_1.method2298(local379);
						}
					}
				} else {
					local23 = true;
				}
			} else if (!local21.aClass5_Sub14_Sub1_1.method8826()) {
				local23 = true;
			}
			if (local23) {
				Static331.anInt6013--;
				for (local154 = local15; local154 < Static331.anInt6013; local154++) {
					Static515.aClass178Array2[local154] = Static515.aClass178Array2[local154 + 1];
				}
				local15--;
			}
		}
		if (Static26.aBoolean13 && !Static70.method1031()) {
			if (Static655.aClass5_Sub36_29.aClass2_Sub6_3.method3364() != 0 && Static367.anInt6416 != -1) {
				if (Static409.aClass5_Sub14_Sub4_22 == null) {
					Static550.method7596(Static449.aClass50_129, Static655.aClass5_Sub36_29.aClass2_Sub6_3.method3364(), Static367.anInt6416);
				} else {
					Static662.method8641(Static449.aClass50_129, Static409.aClass5_Sub14_Sub4_22, Static367.anInt6416, Static655.aClass5_Sub36_29.aClass2_Sub6_3.method3364());
				}
			}
			Static409.aClass5_Sub14_Sub4_22 = null;
			Static26.aBoolean13 = false;
		} else if (Static655.aClass5_Sub36_29.aClass2_Sub6_3.method3364() != 0 && Static367.anInt6416 != -1 && !Static70.method1031()) {
			@Pc(494) Class5_Sub16 local494 = Static455.method6717(Static265.aClass187_52, Static16.aClass332_8);
			local494.aClass5_Sub15_Sub2_1.method3679(Static367.anInt6416);
			Static479.method7038(local494);
			Static367.anInt6416 = -1;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
	public static boolean method959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static443.method6611(arg0, arg1) || Static235.method3368(arg0, arg1);
	}
}
