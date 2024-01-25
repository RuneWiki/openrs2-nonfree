import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
	public static int anInt2842;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public static int anInt2839 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
	public static void method2641(@OriginalArg(1) int arg0) {
		Static135.anInt2897 = arg0;
		Static313.anInt4728 = 2;
		if (Static590.aString106 == null) {
			Static6.method139(35);
		} else {
			@Pc(28) Class4_Sub11 local28 = new Class4_Sub11(Static228.method3614(Static199.method3402(Static590.aString106)));
			@Pc(32) long local32 = local28.method4903();
			Static129.aLong67 = local28.method4903();
			Static263.method4439("", true, Static315.method5297(local32));
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BZLclient!kfa;)V")
	public static void method2642(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub4_Sub2_Sub1_Sub1 arg1) {
		if (Static339.anInt6583 >= 400) {
			return;
		}
		@Pc(15) Class283 local15 = arg1.aClass283_1;
		if (local15.anIntArray453 != null) {
			local15 = local15.method6834(Static45.aClass148_1);
			if (local15 == null) {
				return;
			}
		}
		if (!local15.aBoolean575) {
			return;
		}
		@Pc(33) String local33 = local15.aString75;
		if (local15.anInt8249 != 0) {
			@Pc(52) String local52 = Static264.aClass92_3 == Static438.aClass92_4 ? Static590.aClass364_34.method8334(Static154.anInt3181) : Static590.aClass364_32.method8334(Static154.anInt3181);
			local33 = local33 + Static459.method6996(local15.anInt8249, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465) + " (" + local52 + local15.anInt8249 + ")";
		}
		if (Static418.aBoolean541 && !arg0) {
			@Pc(89) Class106 local89 = Static52.anInt768 == -1 ? null : Static484.aClass313_2.method7381(Static52.anInt768);
			if ((Static163.anInt3317 & 0x2) != 0 && (local89 == null || local15.method6830(Static52.anInt768, local89.anInt3103) != local89.anInt3103)) {
				Static369.method5938((long) arg1.anInt8435, 20, false, -1, Static397.anInt7611, 0, Static152.aString28, 0, true, Static551.aString95 + " -> <col=ffff00>" + local33);
			}
		}
		if (!arg0) {
			@Pc(139) String[] local139 = local15.aStringArray60;
			if (Static451.aBoolean602) {
				local139 = Static60.method1007(local139);
			}
			@Pc(149) int local149;
			if (local139 != null) {
				for (local149 = 4; local149 >= 0; local149--) {
					if (local139[local149] != null && (local15.aByte89 == 0 || !local139[local149].equalsIgnoreCase(Static590.aClass364_27.method8334(Static154.anInt3181)))) {
						@Pc(172) byte local172 = 0;
						@Pc(174) int local174 = Static114.anInt9773;
						if (local149 == 0) {
							local172 = 48;
						}
						if (local149 == 1) {
							local172 = 21;
						}
						if (local149 == 2) {
							local172 = 30;
						}
						if (local149 == 3) {
							local172 = 8;
						}
						if (local149 == 4) {
							local172 = 18;
						}
						if (local149 == local15.anInt8260) {
							local174 = local15.anInt8265;
						}
						if (local15.anInt8239 == local149) {
							local174 = local15.anInt8240;
						}
						Static369.method5938((long) arg1.anInt8435, local172, false, -1, local139[local149].equalsIgnoreCase(Static590.aClass364_27.method8334(Static154.anInt3181)) ? local15.anInt8252 : local174, 0, local139[local149], 0, true, "<col=ffff00>" + local33);
					}
				}
			}
			if (local15.aByte89 == 1 && local139 != null) {
				for (local149 = 4; local149 >= 0; local149--) {
					if (local139[local149] != null && local139[local149].equalsIgnoreCase(Static590.aClass364_27.method8334(Static154.anInt3181))) {
						@Pc(291) short local291 = 0;
						if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465 < local15.anInt8249) {
							local291 = 2000;
						}
						@Pc(300) short local300 = 0;
						if (local149 == 0) {
							local300 = 48;
						}
						if (local149 == 1) {
							local300 = 21;
						}
						if (local149 == 2) {
							local300 = 30;
						}
						if (local149 == 3) {
							local300 = 8;
						}
						if (local149 == 4) {
							local300 = 18;
						}
						if (local300 != 0) {
							local300 += local291;
						}
						Static369.method5938((long) arg1.anInt8435, local300, false, -1, local15.anInt8252, 0, local139[local149], 0, true, "<col=ffff00>" + local33);
					}
				}
			}
		}
		Static369.method5938((long) arg1.anInt8435, 1006, arg0, -1, Static357.anInt6970, 0, Static590.aClass364_26.method8334(Static154.anInt3181), 0, true, "<col=ffff00>" + local33);
	}
}
