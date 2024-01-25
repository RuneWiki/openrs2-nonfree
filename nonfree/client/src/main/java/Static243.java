import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public static int anInt4807;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
	public static void method4098() {
		Static365.aClass136_42.method3138();
		Static552.aClass136_63.method3138();
		Static238.aClass136_65.method3138();
		Static84.aClass136_61.method3138();
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public static void method4100() {
		@Pc(9) int local9 = Static47.aClass3_Sub9_Sub2_1.method5583();
		@Pc(13) int local13 = Static47.aClass3_Sub9_Sub2_1.method5633();
		@Pc(24) boolean local24 = Static47.aClass3_Sub9_Sub2_1.method5633() == 1;
		@Pc(28) int local28 = Static47.aClass3_Sub9_Sub2_1.method5583();
		Static41.anInt768 = Static47.aClass3_Sub9_Sub2_1.method5633();
		Static84.method7778();
		Static136.method2361(local13);
		Static47.aClass3_Sub9_Sub2_1.method5645();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static399.anInt7121 >> 3; local46++) {
				for (local50 = 0; local50 < Static24.anInt345 >> 3; local50++) {
					local57 = Static47.aClass3_Sub9_Sub2_1.method5642(1);
					if (local57 == 1) {
						Static65.anIntArrayArrayArray6[local42][local46][local50] = Static47.aClass3_Sub9_Sub2_1.method5642(26);
					} else {
						Static65.anIntArrayArrayArray6[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static47.aClass3_Sub9_Sub2_1.method5649();
		local46 = (Static94.anInt1852 - Static47.aClass3_Sub9_Sub2_1.anInt6453) / 16;
		Static543.anIntArrayArray54 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static543.anIntArrayArray54[local50][local57] = Static47.aClass3_Sub9_Sub2_1.method5585();
			}
		}
		Static544.anIntArray571 = new int[local46];
		Static289.aByteArrayArray13 = new byte[local46][];
		Static247.anIntArray268 = new int[local46];
		Static50.aByteArrayArray1 = new byte[local46][];
		Static252.anIntArray273 = new int[local46];
		Static316.aByteArrayArray16 = new byte[local46][];
		Static427.anIntArray447 = null;
		Static606.aByteArrayArray28 = null;
		Static454.anIntArray476 = new int[local46];
		anIntArray265 = new int[local46];
		Static151.aByteArrayArray10 = new byte[local46][];
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(186) int local186 = 0; local186 < Static399.anInt7121 >> 3; local186++) {
				for (@Pc(190) int local190 = 0; local190 < Static24.anInt345 >> 3; local190++) {
					@Pc(200) int local200 = Static65.anIntArrayArrayArray6[local57][local186][local190];
					if (local200 != -1) {
						@Pc(210) int local210 = local200 >> 14 & 0x3FF;
						@Pc(216) int local216 = local200 >> 3 & 0x7FF;
						@Pc(227) int local227 = (local210 / 8 << 8) + (local216 / 8);
						for (@Pc(229) int local229 = 0; local229 < local46; local229++) {
							if (local227 == Static454.anIntArray476[local229]) {
								local227 = -1;
								break;
							}
						}
						if (local227 != -1) {
							Static454.anIntArray476[local46] = local227;
							@Pc(258) int local258 = local227 >> 8 & 0xFF;
							@Pc(262) int local262 = local227 & 0xFF;
							Static544.anIntArray571[local46] = Static235.aClass343_118.method8158("m" + local258 + "_" + local262);
							Static247.anIntArray268[local46] = Static235.aClass343_118.method8158("l" + local258 + "_" + local262);
							anIntArray265[local46] = Static235.aClass343_118.method8158("um" + local258 + "_" + local262);
							Static252.anIntArray273[local46] = Static235.aClass343_118.method8158("ul" + local258 + "_" + local262);
							local46++;
						}
					}
				}
			}
		}
		Static442.method6636(local9, local28, 11, local24);
	}
}
