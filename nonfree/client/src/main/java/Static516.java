import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!rea", name = "S", descriptor = "Lclient!vl;")
	public static final Class371 aClass371_5 = new Class371();

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)V")
	public static void method7267() {
		for (@Pc(7) int local7 = 0; local7 < Static199.anInt3915; local7++) {
			@Pc(13) Class182 local13 = Static240.aClass182Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(151) int local151;
			if (local13.aClass3_Sub1_Sub1_3 == null) {
				local13.anInt4975--;
				if (local13.anInt4975 < (local13.method4576() ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte70 == 1 && local13.aClass209_1 == null) {
						local13.aClass209_1 = Static683.method5274(Static550.aClass15_138, local13.anInt4980, 0);
						if (local13.aClass209_1 == null) {
							continue;
						}
						local13.anInt4975 += local13.aClass209_1.method5275();
					} else if (local13.method4576() && (local13.aClass3_Sub41_3 == null || local13.aClass3_Sub35_Sub1_3 == null)) {
						if (local13.aClass3_Sub41_3 == null) {
							local13.aClass3_Sub41_3 = Static377.method5457(Static387.aClass15_101, local13.anInt4980);
						}
						if (local13.aClass3_Sub41_3 == null) {
							continue;
						}
						if (local13.aClass3_Sub35_Sub1_3 == null) {
							local13.aClass3_Sub35_Sub1_3 = local13.aClass3_Sub41_3.method5460(new int[] { 22050 });
							if (local13.aClass3_Sub35_Sub1_3 == null) {
								continue;
							}
						}
					}
					if (local13.anInt4975 < 0) {
						@Pc(127) int local127 = 8192;
						if (local13.anInt4976 == 0) {
							local151 = local13.anInt4977 * (local13.aByte70 == 3 ? Static24.aClass3_Sub22_4.aClass6_Sub28_5.method8690() : Static24.aClass3_Sub22_4.aClass6_Sub28_1.method8690()) >> 2;
						} else {
							@Pc(160) int local160 = local13.anInt4976 >> 24 & 0x3;
							if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 == local160) {
								@Pc(175) int local175 = (local13.anInt4976 & 0xFF) << 9;
								@Pc(181) int local181 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() << 8;
								@Pc(188) int local188 = local13.anInt4976 >> 16 & 0xFF;
								@Pc(201) int local201 = (local188 << 9) + local181 + 256 - Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729;
								@Pc(208) int local208 = local13.anInt4976 >> 8 & 0xFF;
								@Pc(221) int local221 = (local208 << 9) + local181 + 256 - Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731;
								@Pc(229) int local229 = Math.abs(local201) + Math.abs(local221) - 512;
								if (local175 < local229) {
									local13.anInt4975 = -99999;
									continue;
								}
								if (local229 < 0) {
									local229 = 0;
								}
								local151 = (local175 - local229) * Static24.aClass3_Sub22_4.aClass6_Sub28_2.method8690() * local13.anInt4977 / local175 >> 2;
								if (local13.aClass28_Sub1_11 != null && local13.aClass28_Sub1_11 instanceof Class28_Sub1_Sub1) {
									@Pc(273) Class28_Sub1_Sub1 local273 = (Class28_Sub1_Sub1) local13.aClass28_Sub1_11;
									@Pc(276) short local276 = local273.aShort123;
									@Pc(279) short local279 = local273.aShort125;
								}
								if (local201 != 0 || local221 != 0) {
									@Pc(302) int local302 = -Static57.anInt1188 - (int) (Math.atan2((double) local201, (double) local221) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local302 > 8192) {
										local302 = 16384 - local302;
									}
									@Pc(316) int local316;
									if (local229 <= 0) {
										local316 = 8192;
									} else if (local229 >= 4096) {
										local316 = 16384;
									} else {
										local316 = (8192 - local229) / 4096 + 8192;
									}
									local127 = local302 * local316 / 8192 + (16384 - local316 >> 1);
								}
							} else {
								local151 = 0;
							}
						}
						if (local151 > 0) {
							@Pc(352) Class3_Sub35_Sub1 local352 = null;
							if (local13.aByte70 == 1) {
								local352 = local13.aClass209_1.method5277().method4937(Static36.aClass225_1);
							} else if (local13.method4576()) {
								local352 = local13.aClass3_Sub35_Sub1_3;
							}
							@Pc(382) Class3_Sub1_Sub1 local382 = local13.aClass3_Sub1_Sub1_3 = Static679.method67(local352, local13.anInt4978, local151, local127);
							local382.method100(local13.anInt4982 - 1);
							Static313.aClass3_Sub1_Sub2_1.method934(local382);
						}
					}
				}
			} else if (!local13.aClass3_Sub1_Sub1_3.method9378()) {
				local15 = true;
			}
			if (local15) {
				Static199.anInt3915--;
				for (local151 = local7; local151 < Static199.anInt3915; local151++) {
					Static240.aClass182Array1[local151] = Static240.aClass182Array1[local151 + 1];
				}
				local7--;
			}
		}
		if (Static278.aBoolean253 && !Static610.method8669()) {
			if (Static24.aClass3_Sub22_4.aClass6_Sub28_3.method8690() != 0 && Static214.anInt4080 != -1) {
				if (Static73.aClass3_Sub1_Sub3_1 == null) {
					Static81.method1579(Static214.anInt4080, Static24.aClass3_Sub22_4.aClass6_Sub28_3.method8690(), Static604.aClass15_150);
				} else {
					Static473.method6845(Static604.aClass15_150, Static73.aClass3_Sub1_Sub3_1, Static214.anInt4080, Static24.aClass3_Sub22_4.aClass6_Sub28_3.method8690());
				}
			}
			Static278.aBoolean253 = false;
			Static73.aClass3_Sub1_Sub3_1 = null;
		} else if (Static24.aClass3_Sub22_4.aClass6_Sub28_3.method8690() != 0 && Static214.anInt4080 != -1 && !Static610.method8669()) {
			@Pc(485) Class3_Sub34 local485 = Static172.method3123(Static163.aClass375_1, Static117.aClass218_26);
			local485.aClass3_Sub25_Sub1_2.method8588(Static214.anInt4080);
			Static441.method6275(local485);
			Static214.anInt4080 = -1;
		}
	}
}
