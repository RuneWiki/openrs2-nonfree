import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt4399;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	public static int anInt4404;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	public static int anInt4400 = -1;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public static int anInt4403 = -1;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static void method4052() {
		if (Static405.aClass75_15 != null) {
			Static405.aClass75_15.method6672();
			Static80.aClass67_2 = null;
			Static405.aClass75_15 = null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public static void method4054() {
		for (@Pc(11) int local11 = 0; local11 < Static74.anInt1034; local11++) {
			@Pc(17) Class124 local17 = Static534.aClass124Array6[local11];
			@Pc(19) boolean local19 = false;
			@Pc(174) int local174;
			if (local17.aClass6_Sub17_Sub2_1 == null) {
				local17.anInt3564--;
				if (local17.anInt3564 >= (local17.method3369() ? -1500 : -10)) {
					if (local17.aByte48 == 1 && local17.aClass393_1 == null) {
						local17.aClass393_1 = Static699.method8920(Static56.aClass223_9, local17.anInt3565, 0);
						if (local17.aClass393_1 == null) {
							continue;
						}
						local17.anInt3564 += local17.aClass393_1.method8919();
					} else if (local17.method3369() && (local17.aClass6_Sub16_1 == null || local17.aClass6_Sub54_Sub1_1 == null)) {
						if (local17.aClass6_Sub16_1 == null) {
							local17.aClass6_Sub16_1 = Static132.method2557(Static255.aClass223_58, local17.anInt3565);
						}
						if (local17.aClass6_Sub16_1 == null) {
							continue;
						}
						if (local17.aClass6_Sub54_Sub1_1 == null) {
							local17.aClass6_Sub54_Sub1_1 = local17.aClass6_Sub16_1.method2555(new int[] { 22050 });
							if (local17.aClass6_Sub54_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local17.anInt3564 < 0) {
						@Pc(158) int local158 = 8192;
						if (local17.anInt3563 == 0) {
							local174 = local17.anInt3568 * (local17.aByte48 == 3 ? Static687.aClass6_Sub44_33.aClass7_Sub13_3.method3338() : Static687.aClass6_Sub44_33.aClass7_Sub13_5.method3338()) >> 2;
						} else {
							@Pc(168) int local168 = local17.anInt3563 >> 24 & 0x3;
							if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 == local168) {
								@Pc(183) int local183 = (local17.anInt3563 & 0xFF) << 9;
								@Pc(189) int local189 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) << 8;
								@Pc(196) int local196 = local17.anInt3563 >> 16 & 0xFF;
								@Pc(208) int local208 = local189 + (local196 << 9) + 256 - Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048;
								@Pc(215) int local215 = local17.anInt3563 >> 8 & 0xFF;
								@Pc(226) int local226 = (local215 << 9) + (256 - Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057) + local189;
								@Pc(234) int local234 = Math.abs(local208) + Math.abs(local226) - 512;
								if (local234 > local183) {
									local17.anInt3564 = -99999;
									continue;
								}
								if (local234 < 0) {
									local234 = 0;
								}
								local174 = (local183 - local234) * Static687.aClass6_Sub44_33.aClass7_Sub13_1.method3338() * local17.anInt3568 / local183 >> 2;
								if (local17.aClass60_Sub1_9 != null && local17.aClass60_Sub1_9 instanceof Class60_Sub1_Sub1) {
									@Pc(280) Class60_Sub1_Sub1 local280 = (Class60_Sub1_Sub1) local17.aClass60_Sub1_9;
									@Pc(283) short local283 = local280.aShort102;
									@Pc(286) short local286 = local280.aShort100;
								}
								if (local208 != 0 || local226 != 0) {
									@Pc(311) int local311 = -Static21.anInt279 - (int) (Math.atan2((double) local208, (double) local226) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local311 > 8192) {
										local311 = 16384 - local311;
									}
									@Pc(325) int local325;
									if (local234 <= 0) {
										local325 = 8192;
									} else if (local234 >= 4096) {
										local325 = 16384;
									} else {
										local325 = (8192 - local234) / 4096 + 8192;
									}
									local158 = local311 * local325 / 8192 + (16384 - local325 >> 1);
								}
							} else {
								local174 = 0;
							}
						}
						if (local174 > 0) {
							@Pc(391) Class6_Sub54_Sub1 local391 = null;
							if (local17.aByte48 == 1) {
								local391 = local17.aClass393_1.method8922().method8673(Static39.aClass397_1);
							} else if (local17.method3369()) {
								local391 = local17.aClass6_Sub54_Sub1_1;
							}
							@Pc(423) Class6_Sub17_Sub2 local423 = local17.aClass6_Sub17_Sub2_1 = Static693.method3920(local391, local17.anInt3567, local174, local158);
							local423.method3937(local17.anInt3562 - 1);
							Static544.aClass6_Sub17_Sub3_2.method4661(local423);
						}
					}
				} else {
					local19 = true;
				}
			} else if (!local17.aClass6_Sub17_Sub2_1.method9050()) {
				local19 = true;
			}
			if (local19) {
				Static74.anInt1034--;
				for (local174 = local11; local174 < Static74.anInt1034; local174++) {
					Static534.aClass124Array6[local174] = Static534.aClass124Array6[local174 + 1];
				}
				local11--;
			}
		}
		if (Static588.aBoolean698 && !Static107.method2044()) {
			if (Static687.aClass6_Sub44_33.aClass7_Sub13_2.method3338() != 0 && Static478.anInt8119 != -1) {
				if (Static664.aClass6_Sub17_Sub4_4 == null) {
					Static551.method7805(Static478.anInt8119, Static209.aClass223_41, Static687.aClass6_Sub44_33.aClass7_Sub13_2.method3338());
				} else {
					Static603.method8320(Static478.anInt8119, Static687.aClass6_Sub44_33.aClass7_Sub13_2.method3338(), Static209.aClass223_41, Static664.aClass6_Sub17_Sub4_4);
				}
			}
			Static664.aClass6_Sub17_Sub4_4 = null;
			Static588.aBoolean698 = false;
		} else if (Static687.aClass6_Sub44_33.aClass7_Sub13_2.method3338() != 0 && Static478.anInt8119 != -1 && !Static107.method2044()) {
			@Pc(514) Class6_Sub13 local514 = Static30.method353(Static676.aClass241_123, Static525.aClass260_4.aClass270_2);
			local514.aClass6_Sub15_Sub1_1.method3029(Static478.anInt8119);
			Static525.aClass260_4.method6404(local514);
			Static478.anInt8119 = -1;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static36.method466(arg0, arg1) || Static165.method3263(arg0, arg1);
	}
}
