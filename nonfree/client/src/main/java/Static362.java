import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
	public static int anInt6348;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt6349;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public static int anInt6352 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!pp;Z)V")
	public static void method5433(@OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static421.anInt7365 >= 400) {
			return;
		}
		if (arg0 != Static328.aClass4_Sub1_Sub1_Sub2_2) {
			@Pc(176) String local176;
			@Pc(107) int local107;
			if (arg0.anInt7154 == 0) {
				@Pc(57) boolean local57 = true;
				if (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7159 != -1 && arg0.anInt7159 != -1) {
					@Pc(81) int local81 = arg0.anInt7139 < Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139 ? Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139 : arg0.anInt7139;
					@Pc(96) int local96 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7159 < arg0.anInt7159 ? Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7159 : arg0.anInt7159;
					local107 = local96 + local81 * 10 / 100 + 5;
					@Pc(114) int local114 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139 - arg0.anInt7139;
					if (local114 < 0) {
						local114 = -local114;
					}
					if (local114 > local107) {
						local57 = false;
					}
				}
				@Pc(137) String local137 = Static317.aClass37_3 == Static255.aClass37_2 ? Static230.aClass156_29.method4065(Static25.anInt769) : Static230.aClass156_27.method4065(Static25.anInt769);
				if (arg0.anInt7140 <= arg0.anInt7139) {
					local176 = arg0.method5922() + (local57 ? Static130.method2585(arg0.anInt7139, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139) : "<col=ffffff>") + " (" + local137 + arg0.anInt7139 + ")";
				} else {
					local176 = arg0.method5922() + (local57 ? Static130.method2585(arg0.anInt7139, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139) : "<col=ffffff>") + " (" + local137 + arg0.anInt7139 + "+" + (arg0.anInt7140 - arg0.anInt7139) + ")";
				}
			} else if (arg0.anInt7154 == -1) {
				local176 = arg0.method5922();
			} else {
				local176 = arg0.method5922() + " (" + Static230.aClass156_28.method4065(Static25.anInt769) + arg0.anInt7154 + ")";
			}
			if (Static199.aBoolean458 && !arg1 && (Static348.anInt6222 & 0x8) != 0) {
				Static142.method7766(false, true, -1, 57, Static104.aString16, (long) arg0.anInt7126, Static22.aString33 + " -> <col=ffffff>" + local176, 0, Static209.anInt4228, 0);
			}
			if (arg1) {
				Static142.method7766(true, false, 0, -1, "<col=cccccc>" + local176, 0L, "", 0, -1, 0);
			} else {
				for (@Pc(300) int local300 = 7; local300 >= 0; local300--) {
					if (Static115.aStringArray5[local300] != null) {
						@Pc(308) short local308 = 0;
						if (Static317.aClass37_3 == Static336.aClass37_4 && Static115.aStringArray5[local300].equalsIgnoreCase(Static230.aClass156_22.method4065(Static25.anInt769))) {
							if (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139 < arg0.anInt7139) {
								local308 = 2000;
							}
							if (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7137 != 0 && arg0.anInt7137 != 0) {
								if (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7137 == arg0.anInt7137) {
									local308 = 2000;
								} else {
									local308 = 0;
								}
							}
						} else if (Static584.aBooleanArray42[local300]) {
							local308 = 2000;
						}
						@Pc(365) short local365 = (short) (local308 + Static428.aShortArray115[local300]);
						local107 = Static142.anIntArray712[local300] == -1 ? Static482.anInt8150 : Static142.anIntArray712[local300];
						Static142.method7766(false, true, -1, local365, Static115.aStringArray5[local300], (long) arg0.anInt7126, "<col=ffffff>" + local176, 0, local107, 0);
					}
				}
			}
			if (!arg1) {
				for (@Pc(436) Class6_Sub45 local436 = (Class6_Sub45) Static182.aClass361_23.method7838(); local436 != null; local436 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
					if (local436.anInt8730 == 9) {
						local436.aString97 = "<col=ffffff>" + local176;
						return;
					}
				}
			}
		} else if (Static199.aBoolean458 && (Static348.anInt6222 & 0x10) != 0) {
			Static142.method7766(false, true, -1, 5, Static104.aString16, 0L, Static22.aString33 + " -> <col=ffffff>" + Static230.aClass156_36.method4065(Static25.anInt769), 0, Static209.anInt4228, 0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!rr;I)I")
	public static int method5434(@OriginalArg(0) int arg0, @OriginalArg(1) Class292 arg1) {
		if (!Static67.method1354(arg1).method244(arg0) && arg1.anObjectArray6 == null) {
			return -1;
		} else if (arg1.anIntArray570 == null || arg1.anIntArray570.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray570[arg0];
		}
	}
}
