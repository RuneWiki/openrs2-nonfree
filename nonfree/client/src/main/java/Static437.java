import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "I")
	public static int anInt7796;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Lclient!wia;")
	public static Class386 aClass386_99;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString79 = null;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V")
	public static void method6437() {
		@Pc(7) int local7 = 0;
		if (Static56.aClass14_Sub22_5 != null) {
			local7 = Static56.aClass14_Sub22_5.aClass21_Sub23_1.method7768();
		}
		@Pc(41) int local41;
		@Pc(57) int local57;
		if (local7 == 2) {
			local41 = Static69.anInt1570 > 800 ? 800 : Static69.anInt1570;
			local57 = Static572.anInt9840 > 600 ? 600 : Static572.anInt9840;
			Static561.anInt9759 = local41;
			Static535.anInt9235 = (Static69.anInt1570 - local41) / 2;
			Static639.anInt10685 = local57;
			Static406.anInt7435 = 0;
		} else if (local7 == 1) {
			local41 = Static69.anInt1570 <= 1024 ? Static69.anInt1570 : 1024;
			Static535.anInt9235 = (Static69.anInt1570 - local41) / 2;
			Static561.anInt9759 = local41;
			local57 = Static572.anInt9840 <= 768 ? Static572.anInt9840 : 768;
			Static639.anInt10685 = local57;
			Static406.anInt7435 = 0;
		} else {
			Static639.anInt10685 = Static572.anInt9840;
			Static561.anInt9759 = Static69.anInt1570;
			Static535.anInt9235 = 0;
			Static406.anInt7435 = 0;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIZI)V")
	public static void method6438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static102.method1817();
		Static559.aLong253 = 0L;
		@Pc(15) int local15 = Static482.method7137();
		if (arg3 == 3 || local15 == 3) {
			arg2 = true;
		}
		if (!Static677.aClass137_47.method7911()) {
			arg2 = true;
		}
		Static658.method9121(arg1, arg0, arg2, arg3, local15);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public static void method6439() {
		if (Static565.aString94.toLowerCase().indexOf("microsoft") != -1) {
			Static464.anIntArray616[187] = 27;
			Static464.anIntArray616[190] = 72;
			Static464.anIntArray616[223] = 28;
			Static464.anIntArray616[192] = 58;
			Static464.anIntArray616[219] = 42;
			Static464.anIntArray616[188] = 71;
			Static464.anIntArray616[222] = 59;
			Static464.anIntArray616[221] = 43;
			Static464.anIntArray616[189] = 26;
			Static464.anIntArray616[220] = 74;
			Static464.anIntArray616[191] = 73;
			Static464.anIntArray616[186] = 57;
			return;
		}
		Static464.anIntArray616[47] = 73;
		Static464.anIntArray616[46] = 72;
		Static464.anIntArray616[44] = 71;
		Static464.anIntArray616[91] = 42;
		Static464.anIntArray616[61] = 27;
		Static464.anIntArray616[59] = 57;
		Static464.anIntArray616[45] = 26;
		Static464.anIntArray616[93] = 43;
		if (Static565.aMethod2 == null) {
			Static464.anIntArray616[222] = 59;
			Static464.anIntArray616[192] = 58;
		} else {
			Static464.anIntArray616[520] = 59;
			Static464.anIntArray616[192] = 28;
			Static464.anIntArray616[222] = 58;
		}
		Static464.anIntArray616[92] = 74;
	}
}
