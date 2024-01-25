import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	public static int anInt3010;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
	public static int anInt3019;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)V")
	public static void method2588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub1_Sub5 local16 = Static77.method1176(arg0, 6);
		local16.method776();
		local16.anInt972 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLclient!ud;I)V")
	public static void method2596(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class29_Sub2_Sub1_Sub2 arg1) {
		if (Static374.anInt6451 >= 400) {
			return;
		}
		if (Static426.aClass29_Sub2_Sub1_Sub2_2 != arg1) {
			@Pc(87) String local87;
			@Pc(139) int local139;
			if (arg1.anInt8602 == 0) {
				@Pc(98) boolean local98 = true;
				if (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8614 != -1 && arg1.anInt8614 != -1) {
					@Pc(118) int local118 = arg1.anInt8623 >= Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623 ? arg1.anInt8623 : Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623;
					@Pc(129) int local129 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8614 < arg1.anInt8614 ? Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8614 : arg1.anInt8614;
					local139 = local129 + local118 * 10 / 100 + 5;
					@Pc(145) int local145 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623 - arg1.anInt8623;
					if (local145 < 0) {
						local145 = -local145;
					}
					if (local139 < local145) {
						local98 = false;
					}
				}
				@Pc(175) String local175 = Static533.aClass314_4 == Static57.aClass314_1 ? Static141.aClass104_75.method2145(Static470.anInt7957) : Static141.aClass104_73.method2145(Static470.anInt7957);
				if (arg1.anInt8623 < arg1.anInt8604) {
					local87 = arg1.method7018() + (local98 ? Static418.method6133(arg1.anInt8623, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623) : "<col=ffffff>") + " (" + local175 + arg1.anInt8623 + "+" + (arg1.anInt8604 - arg1.anInt8623) + ")";
				} else {
					local87 = arg1.method7018() + (local98 ? Static418.method6133(arg1.anInt8623, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623) : "<col=ffffff>") + " (" + local175 + arg1.anInt8623 + ")";
				}
			} else if (arg1.anInt8602 == -1) {
				local87 = arg1.method7018();
			} else {
				local87 = arg1.method7018() + " (" + Static141.aClass104_74.method2145(Static470.anInt7957) + arg1.anInt8602 + ")";
			}
			if (Static492.aBoolean560 && !arg0 && (Static217.anInt3710 & 0x8) != 0) {
				Static246.method3528(0, (long) arg1.anInt8541, 0, Static516.aString112, Static324.anInt5830, 20, Static474.aString98 + " -> <col=ffffff>" + local87, -1, true, false);
			}
			if (arg0) {
				Static246.method3528(0, 0L, 0, "<col=cccccc>" + local87, -1, -1, "", 0, false, true);
			} else {
				for (@Pc(313) int local313 = 7; local313 >= 0; local313--) {
					if (Static293.aStringArray20[local313] != null) {
						@Pc(321) short local321 = 0;
						if (Static57.aClass314_1 == Static140.aClass314_2 && Static293.aStringArray20[local313].equalsIgnoreCase(Static141.aClass104_68.method2145(Static470.anInt7957))) {
							if (arg1.anInt8623 > Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623) {
								local321 = 2000;
							}
							if (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8595 != 0 && arg1.anInt8595 != 0) {
								if (arg1.anInt8595 == Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8595) {
									local321 = 2000;
								} else {
									local321 = 0;
								}
							}
						} else if (Static24.aBooleanArray28[local313]) {
							local321 = 2000;
						}
						@Pc(382) short local382 = (short) (local321 + Static284.aShortArray79[local313]);
						local139 = Static556.anIntArray698[local313] == -1 ? Static569.anInt9540 : Static556.anIntArray698[local313];
						Static246.method3528(0, (long) arg1.anInt8541, 0, Static293.aStringArray20[local313], local139, local382, "<col=ffffff>" + local87, -1, true, false);
					}
				}
			}
			if (!arg0) {
				for (@Pc(430) Class6_Sub48 local430 = (Class6_Sub48) Static445.aClass275_162.method6366(); local430 != null; local430 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
					if (local430.anInt8333 == 58) {
						local430.aString104 = "<col=ffffff>" + local87;
						return;
					}
				}
			}
		} else if (Static492.aBoolean560 && (Static217.anInt3710 & 0x10) != 0) {
			Static246.method3528(0, 0L, 0, Static516.aString112, Static324.anInt5830, 50, Static474.aString98 + " -> <col=ffffff>" + Static141.aClass104_82.method2145(Static470.anInt7957), -1, true, false);
		}
	}
}
