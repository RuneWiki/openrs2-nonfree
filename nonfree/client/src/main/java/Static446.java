import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
	public static final int[] anIntArray493 = new int[2048];

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString85 = "";

	@OriginalMember(owner = "client!q", name = "f", descriptor = "[I")
	public static final int[] anIntArray494 = new int[5];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!jw;ZZ)V")
	public static void method6926(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean637 = arg1;
		if (Static557.aBoolean669) {
			Static280.aClass291Array1[Static280.aClass291Array1.length - 1].method7263(arg0);
		} else {
			Static618.method8555(arg0, Static119.aClass3_Sub16Array4);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method6927() {
		for (@Pc(3) int local3 = 0; local3 < Static393.anInt7276; local3++) {
			@Pc(14) Class371 local14 = Static508.aClass371Array1[local3];
			@Pc(16) boolean local16 = false;
			@Pc(150) int local150;
			if (local14.aClass3_Sub7_Sub3_4 == null) {
				local14.anInt10065--;
				if (local14.anInt10065 < (local14.method8629() ? -1500 : -10)) {
					local16 = true;
				} else {
					if (local14.aByte129 == 1 && local14.aClass217_1 == null) {
						local14.aClass217_1 = Static651.method5786(Static294.aClass196_53, local14.anInt10070, 0);
						if (local14.aClass217_1 == null) {
							continue;
						}
						local14.anInt10065 += local14.aClass217_1.method5784();
					} else if (local14.method8629() && (local14.aClass3_Sub43_3 == null || local14.aClass3_Sub30_Sub1_4 == null)) {
						if (local14.aClass3_Sub43_3 == null) {
							local14.aClass3_Sub43_3 = Static425.method6656(Static342.aClass196_67, local14.anInt10070);
						}
						if (local14.aClass3_Sub43_3 == null) {
							continue;
						}
						if (local14.aClass3_Sub30_Sub1_4 == null) {
							local14.aClass3_Sub30_Sub1_4 = local14.aClass3_Sub43_3.method6658(new int[] { 22050 });
							if (local14.aClass3_Sub30_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local14.anInt10065 < 0) {
						@Pc(127) int local127 = 8192;
						if (local14.anInt10066 == 0) {
							local150 = local14.anInt10069 * (local14.aByte129 == 3 ? Static262.aClass3_Sub27_12.aClass21_Sub14_1.method5405() : Static262.aClass3_Sub27_12.aClass21_Sub14_4.method5405()) >> 2;
						} else {
							@Pc(140) int local140 = local14.anInt10066 >> 24 & 0x3;
							if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 == local140) {
								@Pc(159) int local159 = (local14.anInt10066 & 0xFF) << 9;
								@Pc(165) int local165 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() << 8;
								@Pc(172) int local172 = local14.anInt10066 >> 16 & 0xFF;
								@Pc(184) int local184 = local165 + (local172 << 9) + 256 - Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916;
								@Pc(191) int local191 = local14.anInt10066 >> 8 & 0xFF;
								@Pc(202) int local202 = local165 + (local191 << 9) + 256 - Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911;
								@Pc(210) int local210 = Math.abs(local184) + Math.abs(local202) - 512;
								if (local210 > local159) {
									local14.anInt10065 = -99999;
									continue;
								}
								if (local210 < 0) {
									local210 = 0;
								}
								local150 = (local159 - local210) * Static262.aClass3_Sub27_12.aClass21_Sub14_5.method5405() * local14.anInt10069 / local159 >> 2;
								if (local14.aClass4_Sub1_3 != null && local14.aClass4_Sub1_3 instanceof Class4_Sub1_Sub2) {
									@Pc(253) Class4_Sub1_Sub2 local253 = (Class4_Sub1_Sub2) local14.aClass4_Sub1_3;
									@Pc(256) short local256 = local253.aShort116;
									@Pc(259) short local259 = local253.aShort118;
								}
								if (local184 != 0 || local202 != 0) {
									@Pc(283) int local283 = -Static185.anInt5215 - (int) (Math.atan2((double) local184, (double) local202) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local283 > 8192) {
										local283 = 16384 - local283;
									}
									@Pc(303) int local303;
									if (local210 <= 0) {
										local303 = 8192;
									} else if (local210 >= 4096) {
										local303 = 16384;
									} else {
										local303 = (8192 - local210) / 4096 + 8192;
									}
									local127 = local303 * local283 / 8192 + (16384 - local303 >> 1);
								}
							} else {
								local150 = 0;
							}
						}
						if (local150 > 0) {
							@Pc(357) Class3_Sub30_Sub1 local357 = null;
							if (local14.aByte129 == 1) {
								local357 = local14.aClass217_1.method5785().method4292(Static166.aClass97_1);
							} else if (local14.method8629()) {
								local357 = local14.aClass3_Sub30_Sub1_4;
							}
							@Pc(385) Class3_Sub7_Sub3 local385 = local14.aClass3_Sub7_Sub3_4 = Static647.method4058(local357, local14.anInt10067, local150, local127);
							local385.method4068(local14.anInt10071 - 1);
							Static204.aClass3_Sub7_Sub1_1.method1626(local385);
						}
					}
				}
			} else if (!local14.aClass3_Sub7_Sub3_4.method8770()) {
				local16 = true;
			}
			if (local16) {
				Static393.anInt7276--;
				for (local150 = local3; local150 < Static393.anInt7276; local150++) {
					Static508.aClass371Array1[local150] = Static508.aClass371Array1[local150 + 1];
				}
				local3--;
			}
		}
		if (Static120.aBoolean173 && !Static438.method6829()) {
			if (Static262.aClass3_Sub27_12.aClass21_Sub14_2.method5405() != 0 && Static472.anInt8274 != -1) {
				if (Static391.aClass3_Sub7_Sub2_2 == null) {
					Static189.method3227(Static472.anInt8274, Static336.aClass196_65, Static262.aClass3_Sub27_12.aClass21_Sub14_2.method5405());
				} else {
					Static277.method4507(Static472.anInt8274, Static336.aClass196_65, Static391.aClass3_Sub7_Sub2_2, Static262.aClass3_Sub27_12.aClass21_Sub14_2.method5405());
				}
			}
			Static391.aClass3_Sub7_Sub2_2 = null;
			Static120.aBoolean173 = false;
		} else if (Static262.aClass3_Sub27_12.aClass21_Sub14_2.method5405() != 0 && Static472.anInt8274 != -1 && !Static438.method6829()) {
			@Pc(462) Class3_Sub14 local462 = Static139.method2308(Static241.aClass130_71, Static24.aClass233_1);
			local462.aClass3_Sub3_Sub2_2.method4265(Static472.anInt8274);
			Static562.method8096(local462);
			Static472.anInt8274 = -1;
		}
	}
}
