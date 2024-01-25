import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	public static int anInt6382;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public static void method5278() {
		for (@Pc(7) int local7 = 0; local7 < Static4.anInt29; local7++) {
			@Pc(13) Class393 local13 = Static178.aClass393Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(143) int local143;
			if (local13.aClass14_Sub5_Sub4_4 == null) {
				local13.anInt11164--;
				if (local13.anInt11164 < (local13.method9276() ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte150 == 1 && local13.aClass354_1 == null) {
						local13.aClass354_1 = Static687.method8490(Static391.aClass386_88, local13.anInt11158, 0);
						if (local13.aClass354_1 == null) {
							continue;
						}
						local13.anInt11164 += local13.aClass354_1.method8491();
					} else if (local13.method9276() && (local13.aClass14_Sub13_3 == null || local13.aClass14_Sub14_Sub1_4 == null)) {
						if (local13.aClass14_Sub13_3 == null) {
							local13.aClass14_Sub13_3 = Static99.method1796(Static479.aClass386_106, local13.anInt11158);
						}
						if (local13.aClass14_Sub13_3 == null) {
							continue;
						}
						if (local13.aClass14_Sub14_Sub1_4 == null) {
							local13.aClass14_Sub14_Sub1_4 = local13.aClass14_Sub13_3.method1794(new int[] { 22050 });
							if (local13.aClass14_Sub14_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local13.anInt11164 < 0) {
						@Pc(120) int local120 = 8192;
						if (local13.anInt11165 == 0) {
							local143 = local13.anInt11159 * (local13.aByte150 == 3 ? Static56.aClass14_Sub22_5.aClass21_Sub20_4.method7115() : Static56.aClass14_Sub22_5.aClass21_Sub20_1.method7115()) >> 2;
						} else {
							@Pc(133) int local133 = local13.anInt11165 >> 24 & 0x3;
							if (local133 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146) {
								@Pc(152) int local152 = (local13.anInt11165 & 0xFF) << 9;
								@Pc(158) int local158 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() << 8;
								@Pc(165) int local165 = local13.anInt11165 >> 16 & 0xFF;
								@Pc(177) int local177 = local158 + (local165 << 9) + 256 - Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998;
								@Pc(184) int local184 = local13.anInt11165 >> 8 & 0xFF;
								@Pc(197) int local197 = (local184 << 9) + local158 + 256 - Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002;
								@Pc(205) int local205 = Math.abs(local177) + Math.abs(local197) - 512;
								if (local152 < local205) {
									local13.anInt11164 = -99999;
									continue;
								}
								if (local205 < 0) {
									local205 = 0;
								}
								local143 = Static56.aClass14_Sub22_5.aClass21_Sub20_5.method7115() * (local152 - local205) * local13.anInt11159 / local152 >> 2;
								if (local13.aClass12_Sub2_23 != null && local13.aClass12_Sub2_23 instanceof Class12_Sub2_Sub2) {
									@Pc(247) Class12_Sub2_Sub2 local247 = (Class12_Sub2_Sub2) local13.aClass12_Sub2_23;
									@Pc(250) short local250 = local247.aShort111;
									@Pc(253) short local253 = local247.aShort110;
								}
								if (local177 != 0 || local197 != 0) {
									@Pc(277) int local277 = -Static219.anInt4123 - (int) (Math.atan2((double) local177, (double) local197) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local277 > 8192) {
										local277 = 16384 - local277;
									}
									@Pc(289) int local289;
									if (local205 <= 0) {
										local289 = 8192;
									} else if (local205 >= 4096) {
										local289 = 16384;
									} else {
										local289 = (8192 - local205) / 4096 + 8192;
									}
									local120 = (16384 - local289 >> 1) + local289 * local277 / 8192;
								}
							} else {
								local143 = 0;
							}
						}
						if (local143 > 0) {
							@Pc(348) Class14_Sub14_Sub1 local348 = null;
							if (local13.aByte150 == 1) {
								local348 = local13.aClass354_1.method8493().method1814(Static360.aClass147_1);
							} else if (local13.method9276()) {
								local348 = local13.aClass14_Sub14_Sub1_4;
							}
							@Pc(378) Class14_Sub5_Sub4 local378 = local13.aClass14_Sub5_Sub4_4 = Static684.method7205(local348, local13.anInt11160, local143, local120);
							local378.method7192(local13.anInt11163 - 1);
							Static217.aClass14_Sub5_Sub3_1.method6027(local378);
						}
					}
				}
			} else if (!local13.aClass14_Sub5_Sub4_4.method9314()) {
				local15 = true;
			}
			if (local15) {
				Static4.anInt29--;
				for (local143 = local7; local143 < Static4.anInt29; local143++) {
					Static178.aClass393Array1[local143] = Static178.aClass393Array1[local143 + 1];
				}
				local7--;
			}
		}
		if (Static275.aBoolean329 && !Static427.method6300()) {
			if (Static56.aClass14_Sub22_5.aClass21_Sub20_2.method7115() != 0 && Static344.anInt11217 != -1) {
				if (Static177.aClass14_Sub5_Sub2_1 == null) {
					Static522.method7501(Static56.aClass14_Sub22_5.aClass21_Sub20_2.method7115(), Static40.aClass386_19, Static344.anInt11217);
				} else {
					Static410.method6060(Static344.anInt11217, Static40.aClass386_19, Static56.aClass14_Sub22_5.aClass21_Sub20_2.method7115(), Static177.aClass14_Sub5_Sub2_1);
				}
			}
			Static177.aClass14_Sub5_Sub2_1 = null;
			Static275.aBoolean329 = false;
		} else if (Static56.aClass14_Sub22_5.aClass21_Sub20_2.method7115() != 0 && Static344.anInt11217 != -1 && !Static427.method6300()) {
			@Pc(453) Class14_Sub19 local453 = Static286.method4081(Static205.aClass394_1, Static536.aClass100_115);
			local453.aClass14_Sub29_Sub1_1.method5861(Static344.anInt11217);
			Static576.method8234(local453);
			Static344.anInt11217 = -1;
		}
	}
}
