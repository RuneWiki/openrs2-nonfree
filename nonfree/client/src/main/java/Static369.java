import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_96 = new Class2(34, 4);

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
	public static int anInt5897 = 0;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	public static void method4728() {
		Static226.aClass126_26.method2821();
		Static303.aClass126_42.method2821();
		Static364.aClass126_18.method2821();
		Static68.aClass126_11.method2821();
		Static57.aClass126_8.method2821();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!vi;ZI)V")
	public static void method4729(@OriginalArg(0) Class26_Sub2_Sub4_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static102.anInt2085 >= 400) {
			return;
		}
		if (Static104.aClass26_Sub2_Sub4_Sub2_2 != arg0) {
			@Pc(186) String local186;
			@Pc(111) int local111;
			if (arg0.anInt7158 == 0) {
				@Pc(60) boolean local60 = true;
				if (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7130 != -1 && arg0.anInt7130 != -1) {
					@Pc(85) int local85 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143 <= arg0.anInt7143 ? arg0.anInt7143 : Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143;
					@Pc(100) int local100 = arg0.anInt7130 > Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7130 ? Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7130 : arg0.anInt7130;
					local111 = local100 + local85 * 10 / 100 + 5;
					@Pc(118) int local118 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143 - arg0.anInt7143;
					if (local118 < 0) {
						local118 = -local118;
					}
					if (local118 > local111) {
						local60 = false;
					}
				}
				@Pc(145) String local145 = Static191.aClass137_3 == Static55.aClass137_1 ? Static236.aClass55_90.method1205(Static5.anInt20) : Static373.aClass55_124.method1205(Static5.anInt20);
				if (arg0.anInt7136 <= arg0.anInt7143) {
					local186 = arg0.method5527() + (local60 ? Static7.method42(arg0.anInt7143, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143) : "<col=ffffff>") + " (" + local145 + arg0.anInt7143 + ")";
				} else {
					local186 = arg0.method5527() + (local60 ? Static7.method42(arg0.anInt7143, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143) : "<col=ffffff>") + " (" + local145 + arg0.anInt7143 + "+" + (arg0.anInt7136 - arg0.anInt7143) + ")";
				}
			} else {
				local186 = arg0.method5527() + " (" + Static453.aClass55_150.method1205(Static5.anInt20) + arg0.anInt7158 + ")";
			}
			if (Static402.aBoolean412) {
				if (!arg1 && (Static180.anInt3240 & 0x8) != 0) {
					Static181.method2635(0, Static139.aString32, Static250.anInt4255, false, -1, Static73.aString7 + " -> <col=ffffff>" + local186, 0, (long) arg0.anInt7080, true, 25);
				}
			} else if (arg1) {
				Static181.method2635(0, "<col=cccccc>" + local186, -1, true, 0, "", 0, 0L, false, -1);
			} else {
				for (@Pc(314) int local314 = 7; local314 >= 0; local314--) {
					if (Static191.aStringArray29[local314] != null) {
						@Pc(322) short local322 = 0;
						if (Static419.aClass137_4 == Static191.aClass137_3 && Static191.aStringArray29[local314].equalsIgnoreCase(Static183.aClass55_71.method1205(Static5.anInt20))) {
							if (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143 < arg0.anInt7143) {
								local322 = 2000;
							}
							if (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7131 != 0 && arg0.anInt7131 != 0) {
								if (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7131 == arg0.anInt7131) {
									local322 = 2000;
								} else {
									local322 = 0;
								}
							}
						} else if (Static157.aBooleanArray14[local314]) {
							local322 = 2000;
						}
						@Pc(377) short local377 = (short) (Static168.aShortArray52[local314] + local322);
						local111 = Static233.anIntArray489[local314] == -1 ? Static357.anInt5687 : Static233.anIntArray489[local314];
						Static181.method2635(0, Static191.aStringArray29[local314], local111, false, -1, "<col=ffffff>" + local186, 0, (long) arg0.anInt7080, true, local377);
					}
				}
			}
			if (!arg1) {
				for (@Pc(430) Class7_Sub39 local430 = (Class7_Sub39) Static237.aClass85_26.method2010(); local430 != null; local430 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
					if (local430.anInt5893 == 4) {
						local430.aString60 = "<col=ffffff>" + local186;
						return;
					}
				}
			}
		} else if (Static402.aBoolean412 && (Static180.anInt3240 & 0x10) != 0) {
			Static181.method2635(0, Static139.aString32, Static250.anInt4255, false, -1, Static73.aString7 + " -> <col=ffffff>" + Static330.aClass55_117.method1205(Static5.anInt20), 0, 0L, true, 2);
		}
	}
}
