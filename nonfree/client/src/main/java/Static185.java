import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
	public static int anInt3263 = -1;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLclient!paa;)I")
	public static int method2594(@OriginalArg(1) Class8_Sub3_Sub3_Sub1_Sub2 arg0) {
		@Pc(8) Class20 local8 = arg0.aClass20_1;
		if (local8.anIntArray40 != null) {
			local8 = local8.method284(Static430.aClass321_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt315;
		@Pc(32) Class140 local32 = arg0.method5425();
		if (arg0.aBoolean553) {
			local28 = local8.anInt348;
		} else if (local32.anInt3597 == arg0.anInt6829 || local32.anInt3625 == arg0.anInt6829 || arg0.anInt6829 == local32.anInt3610 || arg0.anInt6829 == local32.anInt3616) {
			local28 = local8.anInt357;
		} else if (arg0.anInt6829 == local32.anInt3593 || arg0.anInt6829 == local32.anInt3636 || local32.anInt3628 == arg0.anInt6829 || local32.anInt3602 == arg0.anInt6829) {
			local28 = local8.anInt327;
		}
		return local28;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V")
	public static void method2595(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub6_Sub16 local13 = Static212.method3332(7, arg0);
		local13.method6593();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZBLclient!de;)V")
	public static void method2597(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class8_Sub3_Sub3_Sub1_Sub1 arg1) {
		if (Static337.anInt8004 >= 400) {
			return;
		}
		if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 != arg1) {
			@Pc(93) String local93;
			@Pc(154) int local154;
			if (arg1.anInt1741 == 0) {
				@Pc(104) boolean local104 = true;
				if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1746 != -1 && arg1.anInt1746 != -1) {
					@Pc(129) int local129 = arg1.anInt1736 >= Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736 ? arg1.anInt1736 : Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736;
					@Pc(144) int local144 = arg1.anInt1746 <= Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1746 ? arg1.anInt1746 : Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1746;
					local154 = local129 * 10 / 100 + local144 + 5;
					@Pc(161) int local161 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736 - arg1.anInt1736;
					if (local161 < 0) {
						local161 = -local161;
					}
					if (local154 < local161) {
						local104 = false;
					}
				}
				@Pc(184) String local184 = Static246.aClass195_2 == Static586.aClass195_4 ? Static568.aClass351_34.method7651(Static307.anInt5279) : Static568.aClass351_32.method7651(Static307.anInt5279);
				if (arg1.anInt1736 >= arg1.anInt1731) {
					local93 = arg1.method1438() + (local104 ? Static251.method7515(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736, arg1.anInt1736) : "<col=ffffff>") + " (" + local184 + arg1.anInt1736 + ")";
				} else {
					local93 = arg1.method1438() + (local104 ? Static251.method7515(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736, arg1.anInt1736) : "<col=ffffff>") + " (" + local184 + arg1.anInt1736 + "+" + (arg1.anInt1731 - arg1.anInt1736) + ")";
				}
			} else if (arg1.anInt1741 == -1) {
				local93 = arg1.method1438();
			} else {
				local93 = arg1.method1438() + " (" + Static568.aClass351_33.method7651(Static307.anInt5279) + arg1.anInt1741 + ")";
			}
			if (Static573.aBoolean740 && !arg0 && (Static258.anInt4645 & 0x8) != 0) {
				Static140.method7612(0, Static593.aString101 + " -> <col=ffffff>" + local93, 0, true, 59, -1, false, Static534.anInt8944, (long) arg1.anInt6821, Static302.aString46);
			}
			if (arg0) {
				Static140.method7612(0, "", 0, false, -1, 0, true, -1, 0L, "<col=cccccc>" + local93);
			} else {
				for (@Pc(332) int local332 = 7; local332 >= 0; local332--) {
					if (Static66.aStringArray7[local332] != null) {
						@Pc(340) short local340 = 0;
						if (Static246.aClass195_2 == Static184.aClass195_1 && Static66.aStringArray7[local332].equalsIgnoreCase(Static568.aClass351_27.method7651(Static307.anInt5279))) {
							if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736 < arg1.anInt1736) {
								local340 = 2000;
							}
							if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1735 != 0 && arg1.anInt1735 != 0) {
								if (arg1.anInt1735 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1735) {
									local340 = 2000;
								} else {
									local340 = 0;
								}
							}
						} else if (Static260.aBooleanArray7[local332]) {
							local340 = 2000;
						}
						@Pc(396) short local396 = (short) (Static537.aShortArray141[local332] + local340);
						local154 = Static381.anIntArray509[local332] == -1 ? Static374.anInt6269 : Static381.anIntArray509[local332];
						Static140.method7612(0, "<col=ffffff>" + local93, 0, true, local396, -1, false, local154, (long) arg1.anInt6821, Static66.aStringArray7[local332]);
					}
				}
			}
			if (!arg0) {
				for (@Pc(449) Class1_Sub51 local449 = (Class1_Sub51) Static310.aClass353_32.method7677(); local449 != null; local449 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
					if (local449.anInt9638 == 48) {
						local449.aString99 = "<col=ffffff>" + local93;
						return;
					}
				}
			}
		} else if (Static573.aBoolean740 && (Static258.anInt4645 & 0x10) != 0) {
			Static140.method7612(0, Static593.aString101 + " -> <col=ffffff>" + Static568.aClass351_41.method7651(Static307.anInt5279), 0, true, 22, -1, false, Static534.anInt8944, 0L, Static302.aString46);
		}
	}
}
