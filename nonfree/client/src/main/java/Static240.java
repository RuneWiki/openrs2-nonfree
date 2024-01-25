import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_11;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Lclient!ug;")
	public static final Class372 aClass372_6 = new Class372();

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method6914(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static689.aString129 = Static689.aString129 + arg0[0];
			Static685.anInt6069 += arg0[0].length();
			return;
		}
		for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
			if (arg0[local38].startsWith("pause")) {
				@Pc(63) int local63 = 5;
				try {
					local63 = Integer.parseInt(arg0[local38].substring(6));
				} catch (@Pc(72) Exception local72) {
				}
				Static369.method5071("Pausing for " + local63 + " seconds...");
				Static497.aStringArray33 = arg0;
				Static59.anInt1492 = local38 + 1;
				Static32.aLong30 = Static517.method6965() + (long) (local63 * 1000);
				return;
			}
			Static689.aString129 = arg0[local38];
			Static567.method7365(false);
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public static void method6915() {
		for (@Pc(12) int local12 = 0; local12 < Static385.anInt5974; local12++) {
			@Pc(18) Class398 local18 = Static149.aClass398Array1[local12];
			@Pc(20) boolean local20 = false;
			@Pc(272) int local272;
			if (local18.aClass3_Sub33_Sub5_3 == null) {
				local18.anInt10981--;
				if (local18.anInt10981 < (local18.method9310() ? -1500 : -10)) {
					local20 = true;
				} else {
					if (local18.aByte142 == 1 && local18.aClass402_1 == null) {
						local18.aClass402_1 = Static738.method9472(Static692.aClass182_126, local18.anInt10986, 0);
						if (local18.aClass402_1 == null) {
							continue;
						}
						local18.anInt10981 += local18.aClass402_1.method9471();
					} else if (local18.method9310() && (local18.aClass3_Sub27_3 == null || local18.aClass3_Sub34_Sub1_3 == null)) {
						if (local18.aClass3_Sub27_3 == null) {
							local18.aClass3_Sub27_3 = Static230.method3366(Static388.aClass182_81, local18.anInt10986);
						}
						if (local18.aClass3_Sub27_3 == null) {
							continue;
						}
						if (local18.aClass3_Sub34_Sub1_3 == null) {
							local18.aClass3_Sub34_Sub1_3 = local18.aClass3_Sub27_3.method3362(new int[] { 22050 });
							if (local18.aClass3_Sub34_Sub1_3 == null) {
								continue;
							}
						}
					}
					if (local18.anInt10981 < 0) {
						@Pc(160) int local160 = 8192;
						if (local18.anInt10984 == 0) {
							local272 = local18.anInt10985 * (local18.aByte142 == 3 ? Static580.aClass3_Sub22_24.aClass21_Sub16_5.method5404() : Static580.aClass3_Sub22_24.aClass21_Sub16_1.method5404()) >> 2;
						} else {
							@Pc(170) int local170 = local18.anInt10984 >> 24 & 0x3;
							if (local170 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139) {
								@Pc(185) int local185 = (local18.anInt10984 & 0xFF) << 9;
								@Pc(191) int local191 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() << 8;
								@Pc(198) int local198 = local18.anInt10984 >> 16 & 0xFF;
								@Pc(210) int local210 = local191 + (local198 << 9) + 256 - Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694;
								@Pc(217) int local217 = local18.anInt10984 >> 8 & 0xFF;
								@Pc(228) int local228 = local191 + (local217 << 9) + 256 - Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695;
								@Pc(237) int local237 = Math.abs(local210) + Math.abs(local228) - 512;
								if (local185 < local237) {
									local18.anInt10981 = -99999;
									continue;
								}
								if (local237 < 0) {
									local237 = 0;
								}
								local272 = (local185 - local237) * Static580.aClass3_Sub22_24.aClass21_Sub16_2.method5404() * local18.anInt10985 / local185 >> 2;
								if (local18.aClass9_Sub1_25 != null && local18.aClass9_Sub1_25 instanceof Class9_Sub1_Sub1) {
									@Pc(285) Class9_Sub1_Sub1 local285 = (Class9_Sub1_Sub1) local18.aClass9_Sub1_25;
									@Pc(288) short local288 = local285.aShort120;
									@Pc(291) short local291 = local285.aShort123;
								}
								if (local210 != 0 || local228 != 0) {
									@Pc(314) int local314 = -Static46.anInt1301 - (int) (Math.atan2((double) local210, (double) local228) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local314 > 8192) {
										local314 = 16384 - local314;
									}
									@Pc(333) int local333;
									if (local237 <= 0) {
										local333 = 8192;
									} else if (local237 >= 4096) {
										local333 = 16384;
									} else {
										local333 = (8192 - local237) / 4096 + 8192;
									}
									local160 = local314 * local333 / 8192 + (16384 - local333 >> 1);
								}
							} else {
								local272 = 0;
							}
						}
						if (local272 > 0) {
							@Pc(398) Class3_Sub34_Sub1 local398 = null;
							if (local18.aByte142 == 1) {
								local398 = local18.aClass402_1.method9474().method9470(Static53.aClass359_1);
							} else if (local18.method9310()) {
								local398 = local18.aClass3_Sub34_Sub1_3;
							}
							@Pc(428) Class3_Sub33_Sub5 local428 = local18.aClass3_Sub33_Sub5_3 = Static737.method8739(local398, local18.anInt10988, local272, local160);
							local428.method8730(local18.anInt10987 - 1);
							Static391.aClass3_Sub33_Sub4_1.method8545(local428);
						}
					}
				}
			} else if (!local18.aClass3_Sub33_Sub5_3.method9597()) {
				local20 = true;
			}
			if (local20) {
				Static385.anInt5974--;
				for (local272 = local12; local272 < Static385.anInt5974; local272++) {
					Static149.aClass398Array1[local272] = Static149.aClass398Array1[local272 + 1];
				}
				local12--;
			}
		}
		if (Static627.aBoolean651 && !Static38.method1145()) {
			if (Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404() != 0 && Static659.anInt10097 != -1) {
				if (Static638.aClass3_Sub33_Sub3_3 == null) {
					Static356.method4981(Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404(), Static185.aClass182_50, Static659.anInt10097);
				} else {
					Static620.method7952(Static659.anInt10097, Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404(), Static638.aClass3_Sub33_Sub3_3, Static185.aClass182_50);
				}
			}
			Static638.aClass3_Sub33_Sub3_3 = null;
			Static627.aBoolean651 = false;
		} else if (Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404() != 0 && Static659.anInt10097 != -1 && !Static38.method1145()) {
			@Pc(558) Class3_Sub29 local558 = Static507.method6901(Static522.aClass144_79, Static95.aClass292_2.aClass88_2);
			local558.aClass3_Sub2_Sub1_1.method2018(Static659.anInt10097);
			Static95.aClass292_2.method6855(local558);
			Static659.anInt10097 = -1;
		}
	}
}
