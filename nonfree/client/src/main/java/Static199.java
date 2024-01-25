import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_5 = new Class83(260);

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_2 = new Class49(2, 4);

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[Lclient!rw;")
	public static final Class4_Sub1_Sub17[] aClass4_Sub1_Sub17Array2 = new Class4_Sub1_Sub17[14];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZLclient!ki;)V")
	public static void method175(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class11_Sub5_Sub2_Sub1 arg1) {
		if (Static352.anInt6233 >= 400) {
			return;
		}
		if (arg1 != Static52.aClass11_Sub5_Sub2_Sub1_2) {
			@Pc(81) String local81;
			@Pc(131) int local131;
			if (arg1.anInt4169 == 0) {
				@Pc(85) boolean local85 = true;
				if (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4183 != -1 && arg1.anInt4183 != -1) {
					@Pc(108) int local108 = arg1.anInt4174 >= Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174 ? arg1.anInt4174 : Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174;
					@Pc(119) int local119 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4183 >= arg1.anInt4183 ? arg1.anInt4183 : Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4183;
					local131 = local108 * 10 / 100 + local119 + 5;
					@Pc(138) int local138 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174 - arg1.anInt4174;
					if (local138 < 0) {
						local138 = -local138;
					}
					if (local131 < local138) {
						local85 = false;
					}
				}
				@Pc(164) String local164 = Static332.aClass235_6 == Static323.aClass235_5 ? Static206.aClass21_57.method362(Static168.anInt3290) : Static282.aClass21_81.method362(Static168.anInt3290);
				if (arg1.anInt4174 >= arg1.anInt4160) {
					local81 = arg1.method3625() + (local85 ? Static442.method6057(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174, arg1.anInt4174) : "<col=ffffff>") + " (" + local164 + arg1.anInt4174 + ")";
				} else {
					local81 = arg1.method3625() + (local85 ? Static442.method6057(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174, arg1.anInt4174) : "<col=ffffff>") + " (" + local164 + arg1.anInt4174 + "+" + (arg1.anInt4160 - arg1.anInt4174) + ")";
				}
			} else {
				local81 = arg1.method3625() + " (" + Static411.aClass21_106.method362(Static168.anInt3290) + arg1.anInt4169 + ")";
			}
			if (Static449.aBoolean564) {
				if (!arg0 && (Static353.anInt6237 & 0x8) != 0) {
					Static12.method4708(2, (long) arg1.anInt6518, 0, false, true, Static281.anInt5275, Static168.aString24 + " -> <col=ffffff>" + local81, Static198.aString26, -1, 0);
				}
			} else if (arg0) {
				Static12.method4708(-1, 0L, 0, true, false, -1, "", "<col=cccccc>" + local81, 0, 0);
			} else {
				for (@Pc(257) int local257 = 7; local257 >= 0; local257--) {
					if (Static342.aStringArray31[local257] != null) {
						@Pc(265) short local265 = 0;
						if (Static332.aClass235_6 == Static50.aClass235_4 && Static342.aStringArray31[local257].equalsIgnoreCase(Static91.aClass21_23.method362(Static168.anInt3290))) {
							if (arg1.anInt4174 > Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174) {
								local265 = 2000;
							}
							if (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4189 != 0 && arg1.anInt4189 != 0) {
								if (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4189 == arg1.anInt4189) {
									local265 = 2000;
								} else {
									local265 = 0;
								}
							}
						} else if (Static390.aBooleanArray134[local257]) {
							local265 = 2000;
						}
						@Pc(327) short local327 = (short) (Static459.aShortArray106[local257] + local265);
						local131 = Static182.anIntArray287[local257] == -1 ? Static51.anInt1208 : Static182.anIntArray287[local257];
						Static12.method4708(local327, (long) arg1.anInt6518, 0, false, true, local131, "<col=ffffff>" + local81, Static342.aStringArray31[local257], -1, 0);
					}
				}
			}
			if (!arg0) {
				for (@Pc(436) Class4_Sub14 local436 = (Class4_Sub14) Static289.aClass91_31.method2584(); local436 != null; local436 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
					if (local436.anInt2132 == 21) {
						local436.aString13 = "<col=ffffff>" + local81;
						return;
					}
				}
			}
		} else if (Static449.aBoolean564 && (Static353.anInt6237 & 0x10) != 0) {
			Static12.method4708(5, 0L, 0, false, true, Static281.anInt5275, Static168.aString24 + " -> <col=ffffff>" + Static184.aClass21_47.method362(Static168.anInt3290), Static198.aString26, -1, 0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
	public static void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg1 > arg3) {
			for (local14 = arg3; local14 < arg1; local14++) {
				Static400.anIntArrayArray54[local14][arg2] = arg0;
			}
		} else {
			for (local14 = arg1; local14 < arg3; local14++) {
				Static400.anIntArrayArray54[local14][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	public static void method178() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static287.aBooleanArray109[local7] = false;
		}
		Static69.anInt1698 = Static277.anInt2834;
		Static67.anInt1637 = 0;
		Static401.anInt7078 = Static200.anInt3936;
		Static447.anInt7665 = Static439.anInt7477;
		Static412.anInt7174 = 0;
		Static67.anInt1638 = Static235.anInt4645;
		Static148.anInt6290 = -1;
		Static340.anInt6019 = Static108.anInt2350;
		Static275.anInt5173 = 5;
		Static418.anInt3024 = -1;
		Static56.anInt1345 = Static405.anInt7103;
	}
}
