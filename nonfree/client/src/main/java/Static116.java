import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	public static void method2398() {
		Static249.aClass66_9.ha(((float) Static189.aClass4_Sub2_Sub1_1.anInt9299 * 0.1F + 0.7F) * 1.1523438F);
		Static249.aClass66_9.YA(Static121.anInt7239, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static249.aClass66_9.X(Static436.anInt7484, -1, 0);
		Static249.aClass66_9.method6803(Static289.aClass75_2);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!st;Z)V")
	public static void method2400(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class10_Sub1_Sub2_Sub2 arg1) {
		if (Static300.anInt5730 >= 400) {
			return;
		}
		if (Static129.aClass10_Sub1_Sub2_Sub2_1 != arg1) {
			@Pc(189) String local189;
			@Pc(107) int local107;
			if (arg1.anInt8553 == 0) {
				@Pc(59) boolean local59 = true;
				if (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8566 != -1 && arg1.anInt8566 != -1) {
					@Pc(82) int local82 = arg1.anInt8575 < Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575 ? Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575 : arg1.anInt8575;
					@Pc(97) int local97 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8566 < arg1.anInt8566 ? Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8566 : arg1.anInt8566;
					local107 = local82 * 10 / 100 + local97 + 5;
					@Pc(114) int local114 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575 - arg1.anInt8575;
					if (local114 < 0) {
						local114 = -local114;
					}
					if (local107 < local114) {
						local59 = false;
					}
				}
				@Pc(141) String local141 = Static538.aClass263_5 == Static27.aClass263_1 ? Static275.aClass198_29.method4407(Static56.anInt953) : Static275.aClass198_27.method4407(Static56.anInt953);
				if (arg1.anInt8556 > arg1.anInt8575) {
					local189 = arg1.method7047() + (local59 ? Static498.method7097(arg1.anInt8575, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575) : "<col=ffffff>") + " (" + local141 + arg1.anInt8575 + "+" + (arg1.anInt8556 - arg1.anInt8575) + ")";
				} else {
					local189 = arg1.method7047() + (local59 ? Static498.method7097(arg1.anInt8575, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575) : "<col=ffffff>") + " (" + local141 + arg1.anInt8575 + ")";
				}
			} else if (arg1.anInt8553 == -1) {
				local189 = arg1.method7047();
			} else {
				local189 = arg1.method7047() + " (" + Static275.aClass198_28.method4407(Static56.anInt953) + arg1.anInt8553 + ")";
			}
			if (Static524.aBoolean617 && !arg0 && (Static360.anInt6361 & 0x8) != 0) {
				Static100.method7901(0, false, true, Static238.aString94 + " -> <col=ffffff>" + local189, (long) arg1.anInt8531, 47, 0, -1, Static178.anInt3780, Static404.aString82);
			}
			if (arg0) {
				Static100.method7901(0, true, false, "", 0L, -1, 0, 0, -1, "<col=cccccc>" + local189);
			} else {
				for (@Pc(319) int local319 = 7; local319 >= 0; local319--) {
					if (Static282.aStringArray24[local319] != null) {
						@Pc(327) short local327 = 0;
						if (Static379.aClass263_4 == Static538.aClass263_5 && Static282.aStringArray24[local319].equalsIgnoreCase(Static275.aClass198_22.method4407(Static56.anInt953))) {
							if (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575 < arg1.anInt8575) {
								local327 = 2000;
							}
							if (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8572 != 0 && arg1.anInt8572 != 0) {
								if (arg1.anInt8572 == Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8572) {
									local327 = 2000;
								} else {
									local327 = 0;
								}
							}
						} else if (Static157.aBooleanArray23[local319]) {
							local327 = 2000;
						}
						@Pc(392) short local392 = (short) (local327 + Static325.aShortArray109[local319]);
						local107 = Static338.anIntArray486[local319] == -1 ? Static349.anInt6115 : Static338.anIntArray486[local319];
						Static100.method7901(0, false, true, "<col=ffffff>" + local189, (long) arg1.anInt8531, local392, 0, -1, local107, Static282.aStringArray24[local319]);
					}
				}
			}
			if (!arg0) {
				for (@Pc(443) Class4_Sub18 local443 = (Class4_Sub18) Static354.aClass124_32.method3267(); local443 != null; local443 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
					if (local443.anInt3158 == 58) {
						local443.aString26 = "<col=ffffff>" + local189;
						return;
					}
				}
			}
		} else if (Static524.aBoolean617 && (Static360.anInt6361 & 0x10) != 0) {
			Static100.method7901(0, false, true, Static238.aString94 + " -> <col=ffffff>" + Static275.aClass198_36.method4407(Static56.anInt953), 0L, 23, 0, -1, Static178.anInt3780, Static404.aString82);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method2401() {
		if (Static580.aBoolean214) {
			return;
		}
		if (Static189.aClass4_Sub2_Sub1_1.aBoolean651) {
			Static330.aFloat102 = (int) Static330.aFloat102 + 47 & 0xFFFFFFF0;
		} else {
			Static189.aFloat90 += (12.0F - Static189.aFloat90) / 2.0F;
		}
		Static279.aBoolean393 = true;
		Static580.aBoolean214 = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
	public static int method2403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}
}
