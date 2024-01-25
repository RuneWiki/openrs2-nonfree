import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "Lclient!of;")
	public static final Class174 aClass174_128 = new Class174("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "[I")
	public static final int[] anIntArray289 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([BIB)[B")
	public static byte[] method3686(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static466.method205(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZZLclient!wk;)V")
	public static void method3688(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub2_Sub6_Sub2 arg1) {
		if (Static276.anInt4608 >= 400) {
			return;
		}
		if (Static203.aClass1_Sub2_Sub6_Sub2_1 != arg1) {
			@Pc(169) String local169;
			@Pc(96) int local96;
			if (arg1.anInt7650 == 0) {
				@Pc(55) boolean local55 = true;
				if (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7654 != -1 && arg1.anInt7654 != -1) {
					@Pc(75) int local75 = Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651 <= arg1.anInt7651 ? arg1.anInt7651 : Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651;
					@Pc(86) int local86 = arg1.anInt7654 > Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7654 ? Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7654 : arg1.anInt7654;
					local96 = local86 + local75 * 10 / 100 + 5;
					@Pc(103) int local103 = Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651 - arg1.anInt7651;
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local103 > local96) {
						local55 = false;
					}
				}
				@Pc(126) String local126 = Static427.aClass113_4 == Static154.aClass113_3 ? Static391.aClass174_187.method4208(Static300.anInt5192) : Static300.aClass174_146.method4208(Static300.anInt5192);
				if (arg1.anInt7676 > arg1.anInt7651) {
					local169 = arg1.method6213() + (local55 ? Static248.method3545(arg1.anInt7651, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651) : "<col=ffffff>") + " (" + local126 + arg1.anInt7651 + "+" + (arg1.anInt7676 - arg1.anInt7651) + ")";
				} else {
					local169 = arg1.method6213() + (local55 ? Static248.method3545(arg1.anInt7651, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651) : "<col=ffffff>") + " (" + local126 + arg1.anInt7651 + ")";
				}
			} else {
				local169 = arg1.method6213() + " (" + Static317.aClass174_153.method4208(Static300.anInt5192) + arg1.anInt7650 + ")";
			}
			if (Static73.aBoolean88) {
				if (!arg0 && (Static385.anInt6504 & 0x8) != 0) {
					Static359.method5021(false, 4, 0, true, Static296.aString56 + " -> <col=ffffff>" + local169, -1, Static336.anInt5620, Static320.aString12, (long) arg1.anInt7621, 0);
				}
			} else if (arg0) {
				Static359.method5021(true, -1, 0, false, "", 0, -1, "<col=cccccc>" + local169, 0L, 0);
			} else {
				for (@Pc(251) int local251 = 7; local251 >= 0; local251--) {
					if (Static100.aStringArray11[local251] != null) {
						@Pc(259) short local259 = 0;
						if (Static154.aClass113_3 == Static145.aClass113_2 && Static100.aStringArray11[local251].equalsIgnoreCase(Static59.aClass174_37.method4208(Static300.anInt5192))) {
							if (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7651 < arg1.anInt7651) {
								local259 = 2000;
							}
							if (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7655 != 0 && arg1.anInt7655 != 0) {
								if (arg1.anInt7655 == Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7655) {
									local259 = 2000;
								} else {
									local259 = 0;
								}
							}
						} else if (Static142.aBooleanArray10[local251]) {
							local259 = 2000;
						}
						@Pc(321) short local321 = (short) (local259 + Static236.aShortArray53[local251]);
						local96 = Static314.anIntArray336[local251] == -1 ? Static387.anInt6515 : Static314.anIntArray336[local251];
						Static359.method5021(false, local321, 0, true, "<col=ffffff>" + local169, -1, local96, Static100.aStringArray11[local251], (long) arg1.anInt7621, 0);
					}
				}
			}
			if (!arg0) {
				for (@Pc(412) Class3_Sub38 local412 = (Class3_Sub38) Static325.aClass193_54.method4519(); local412 != null; local412 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
					if (local412.anInt5875 == 8) {
						local412.aString57 = "<col=ffffff>" + local169;
						return;
					}
				}
			}
		} else if (Static73.aBoolean88 && (Static385.anInt6504 & 0x10) != 0) {
			Static359.method5021(false, 20, 0, true, Static296.aString56 + " -> <col=ffffff>" + Static11.aClass174_8.method4208(Static300.anInt5192), -1, Static336.anInt5620, Static320.aString12, 0L, 0);
		}
	}
}
