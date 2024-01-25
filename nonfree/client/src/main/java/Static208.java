import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!gha", name = "v", descriptor = "I")
	public static int anInt3445 = 0;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZILclient!afa;)V")
	public static void method3142(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class9_Sub1_Sub1_Sub2_Sub1 arg1) {
		if (Static716.anInt11158 >= 400) {
			return;
		}
		if (arg1 != Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2) {
			@Pc(88) String local88;
			if (arg1.anInt530 == 0) {
				@Pc(118) boolean local118 = true;
				if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt526 != -1 && arg1.anInt526 != -1) {
					@Pc(143) int local143 = arg1.anInt526 <= Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt526 ? arg1.anInt526 : Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt526;
					@Pc(150) int local150 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt552 - arg1.anInt552;
					if (local150 < 0) {
						local150 = -local150;
					}
					if (local150 > local143) {
						local118 = false;
					}
				}
				@Pc(181) String local181 = Static346.aClass309_6 == Static422.aClass309_8 ? Static430.aClass257_29.method5699(Static456.anInt7118) : Static430.aClass257_27.method5699(Static456.anInt7118);
				if (arg1.anInt552 >= arg1.anInt546) {
					local88 = arg1.method475() + (local118 ? Static694.method9187(arg1.anInt552, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt552) : "<col=ffffff>") + " (" + local181 + arg1.anInt552 + ")";
				} else {
					local88 = arg1.method475() + (local118 ? Static694.method9187(arg1.anInt552, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt552) : "<col=ffffff>") + " (" + local181 + arg1.anInt552 + "+" + (arg1.anInt546 - arg1.anInt552) + ")";
				}
			} else if (arg1.anInt530 == -1) {
				local88 = arg1.method475();
			} else {
				local88 = arg1.method475() + " (" + Static430.aClass257_28.method5699(Static456.anInt7118) + arg1.anInt530 + ")";
			}
			if (Static474.aBoolean505 && !arg0 && (Static723.anInt11214 & 0x8) != 0) {
				Static283.method4000(0, Static261.aString59, true, (long) arg1.anInt8783, -1, Static302.anInt4875, false, 0, Static96.aString130 + " -> <col=ffffff>" + local88, 15, (long) arg1.anInt8783, false);
			}
			if (arg0) {
				Static283.method4000(0, "<col=cccccc>" + local88, false, (long) arg1.anInt8783, 0, -1, false, 0, "", -1, 0L, true);
			} else {
				for (@Pc(357) int local357 = 7; local357 >= 0; local357--) {
					if (Static410.aStringArray14[local357] != null) {
						@Pc(367) short local367 = 0;
						if (Static346.aClass309_6 == Static326.aClass309_5 && Static410.aStringArray14[local357].equalsIgnoreCase(Static430.aClass257_23.method5699(Static456.anInt7118))) {
							if (Static57.aBoolean103 && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt552 < arg1.anInt552) {
								local367 = 2000;
							}
							if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt548 == 0 || arg1.anInt548 == 0) {
								if (arg1.aBoolean37) {
									local367 = 2000;
								}
							} else if (arg1.anInt548 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt548) {
								local367 = 2000;
							} else {
								local367 = 0;
							}
						} else if (Static433.aBooleanArray15[local357]) {
							local367 = 2000;
						}
						@Pc(455) short local455 = (short) (Static49.aShortArray11[local357] + local367);
						@Pc(467) int local467 = Static3.anIntArray4[local357] == -1 ? Static337.anInt5410 : Static3.anIntArray4[local357];
						Static283.method4000(0, Static410.aStringArray14[local357], true, (long) arg1.anInt8783, -1, local467, false, 0, "<col=ffffff>" + local88, local455, (long) arg1.anInt8783, false);
					}
				}
			}
			if (!arg0) {
				for (@Pc(514) Class3_Sub7_Sub10 local514 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local514 != null; local514 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
					if (local514.anInt3913 == 17) {
						local514.aString57 = "<col=ffffff>" + local88;
						return;
					}
				}
			}
		} else if (Static474.aBoolean505 && (Static723.anInt11214 & 0x10) != 0) {
			Static283.method4000(0, Static261.aString59, true, (long) arg1.anInt8783, -1, Static302.anInt4875, false, 0, Static96.aString130 + " -> <col=ffffff>" + Static430.aClass257_36.method5699(Static456.anInt7118), 45, 0L, false);
		}
	}
}
