import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	public static int anInt9484 = -1;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[2];

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	public static void method7985() {
		Static566.anInt9416 = Static204.aClass6_Sub23_Sub1_1.method8343();
		@Pc(13) int local13 = Static204.aClass6_Sub23_Sub1_1.method8367();
		@Pc(22) boolean local22 = Static204.aClass6_Sub23_Sub1_1.method8337() == 1;
		@Pc(26) int local26 = Static204.aClass6_Sub23_Sub1_1.method8337();
		@Pc(30) int local30 = Static204.aClass6_Sub23_Sub1_1.method8363();
		Static336.method4910();
		Static56.method1077(local26);
		Static204.aClass6_Sub23_Sub1_1.method2877();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static491.anInt9856 >> 3; local46++) {
				for (local50 = 0; local50 < Static393.anInt6574 >> 3; local50++) {
					local57 = Static204.aClass6_Sub23_Sub1_1.method2878(1);
					if (local57 == 1) {
						Static149.anIntArrayArrayArray14[local42][local46][local50] = Static204.aClass6_Sub23_Sub1_1.method2878(26);
					} else {
						Static149.anIntArrayArrayArray14[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static204.aClass6_Sub23_Sub1_1.method2883();
		local46 = (Static655.anInt10505 - Static204.aClass6_Sub23_Sub1_1.anInt9901) / 16;
		Static66.anIntArrayArray6 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static66.anIntArrayArray6[local50][local57] = Static204.aClass6_Sub23_Sub1_1.method8369();
			}
		}
		Static300.anIntArray289 = new int[local46];
		Static43.aByteArrayArray6 = new byte[local46][];
		Static200.anIntArray192 = null;
		Static310.anIntArray310 = new int[local46];
		Static381.anIntArray516 = new int[local46];
		Static588.aByteArrayArray27 = new byte[local46][];
		Static280.anIntArray274 = new int[local46];
		Static137.aByteArrayArray8 = null;
		Static205.anIntArray198 = new int[local46];
		Static402.aByteArrayArray18 = new byte[local46][];
		Static339.aByteArrayArray15 = new byte[local46][];
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(193) int local193 = 0; local193 < Static491.anInt9856 >> 3; local193++) {
				for (@Pc(197) int local197 = 0; local197 < Static393.anInt6574 >> 3; local197++) {
					@Pc(207) int local207 = Static149.anIntArrayArrayArray14[local57][local193][local197];
					if (local207 != -1) {
						@Pc(216) int local216 = local207 >> 14 & 0x3FF;
						@Pc(222) int local222 = local207 >> 3 & 0x7FF;
						@Pc(232) int local232 = local222 / 8 + (local216 / 8 << 8);
						for (@Pc(234) int local234 = 0; local234 < local46; local234++) {
							if (Static300.anIntArray289[local234] == local232) {
								local232 = -1;
								break;
							}
						}
						if (local232 != -1) {
							Static300.anIntArray289[local46] = local232;
							@Pc(262) int local262 = local232 >> 8 & 0xFF;
							@Pc(266) int local266 = local232 & 0xFF;
							Static381.anIntArray516[local46] = Static187.aClass8_56.method252("m" + local262 + "_" + local266);
							Static280.anIntArray274[local46] = Static187.aClass8_56.method252("l" + local262 + "_" + local266);
							Static310.anIntArray310[local46] = Static187.aClass8_56.method252("um" + local262 + "_" + local266);
							Static205.anIntArray198[local46] = Static187.aClass8_56.method252("ul" + local262 + "_" + local266);
							local46++;
						}
					}
				}
			}
		}
		Static122.method1895(local30, local22, 11, local13);
	}
}
