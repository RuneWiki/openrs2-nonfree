import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Lclient!ta;")
	public static Class14 aClass14_7;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!bb;")
	public static Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_259 = Static14.method2017("");

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_260 = Static14.method2017("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public static int anInt498 = 0;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public static int anInt500 = 0;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_261 = Static14.method2017("@gre@");

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_262 = Static14.method2017("Lade Sprites )2 ");

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
	public static int anInt502 = 0;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_263 = Static14.method2017("blaugr-Un:");

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Z")
	public static final boolean aBoolean17 = false;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "Lclient!kc;")
	private static Class36 aClass36_264 = Static14.method2017("Report abuse");

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "Lclient!kc;")
	private static Class36 aClass36_265 = Static14.method2017("Loading config )2 ");

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_266 = Static14.method2017(" @whi@(X");

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!kc;")
	private static Class36 aClass36_270 = Static14.method2017("Enter your username (V password)3");

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "Lclient!kc;")
	public static Class36 aClass36_267 = aClass36_270;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Lclient!kc;")
	public static Class36 aClass36_268 = aClass36_264;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "Lclient!kc;")
	public static Class36 aClass36_269 = aClass36_265;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "Lclient!kc;")
	public static Class36 aClass36_271 = Static14.method2017("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method373() {
		@Pc(7) Class36 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static43.anInt1141; local9++) {
			if (Static90.aClass36Array40[local9].method1009(Static96.aClass36_1235) != -1) {
				local7 = Static90.aClass36Array40[local9].method1020(Static90.aClass36Array40[local9].method1009(Static96.aClass36_1235));
				break;
			}
		}
		if (local7 == null) {
			Static95.method1789();
			return;
		}
		@Pc(51) int local51 = Static61.anInt1612;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(60) int local60 = Static77.anInt2023;
		@Pc(62) int local62 = Static94.anInt2475;
		if (local62 > 190) {
			local62 = 190;
		}
		@Pc(69) int local69 = Static95.anInt2518;
		Static54.method1591(local51, local60, local62, local69, 6116423);
		Static54.method1591(local51 + 1, local60 - -1, local62 - 2, 16, 0);
		Static54.method1583(local51 + 1, local60 + 18, local62 - 2, local69 + -19, 0);
		Static97.aClass2_Sub1_Sub1_Sub2_4.method475(local7, local51 + 3, local60 + 14, 6116423, false);
		@Pc(116) int local116 = Static64.anInt1640;
		@Pc(118) int local118 = Static115.anInt1789;
		if (Static24.anInt620 == 0) {
			local116 -= 4;
			local118 -= 4;
		}
		if (Static24.anInt620 == 1) {
			local118 -= 553;
			local116 -= 205;
		}
		if (Static24.anInt620 == 2) {
			local118 -= 17;
			local116 -= 357;
		}
		for (@Pc(141) int local141 = 0; local141 < Static43.anInt1141; local141++) {
			@Pc(156) int local156 = local60 + (-local141 + Static43.anInt1141 + -1) * 15 + 31;
			@Pc(160) Class36 local160 = Static90.aClass36Array40[local141];
			if (local160.method1006(local7)) {
				local160 = local160.method1018(0, local160.method1028() - local7.method1028());
				if (local160.method1006(Static89.aClass36_1084)) {
					local160 = local160.method1018(0, local160.method1028() - Static89.aClass36_1084.method1028());
				}
			}
			@Pc(199) int local199 = 16777215;
			if (local118 > local51 && local118 < local62 + local51 && local116 > local156 - 13 && local156 + 3 > local116) {
				local199 = 16776960;
			}
			Static97.aClass2_Sub1_Sub1_Sub2_4.method475(local160, local51 + 3, local156, local199, true);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBLclient!ac;)Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 method374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2) {
		return Static14.method2024(arg2, arg1, arg0) ? Static49.method959() : null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method375() {
		aClass36_264 = null;
		aClass8_1 = null;
		aClass36_267 = null;
		aClass36_261 = null;
		aClass36_260 = null;
		anIntArray32 = null;
		aClass36_269 = null;
		aClass36_270 = null;
		aClass36_268 = null;
		aClass14_7 = null;
		aClass36_263 = null;
		anIntArrayArrayArray3 = null;
		aClass36_262 = null;
		aClass36_271 = null;
		aClass36_266 = null;
		aClass36_265 = null;
		aClass36_259 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!wd;Z)Lclient!kc;")
	public static Class36 method376(@OriginalArg(0) Class2_Sub12 arg0) {
		return Static96.method1810(arg0);
	}
}
