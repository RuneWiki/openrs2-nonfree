import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "mb", descriptor = "Lclient!of;")
	public static final Class70 aClass70_1 = new Class70();

	@OriginalMember(owner = "client!ac", name = "tb", descriptor = "I")
	public static int anInt153 = 0;

	@OriginalMember(owner = "client!ac", name = "Qb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_37 = Static120.method1824("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!ac", name = "Sb", descriptor = "[I")
	public static final int[] anIntArray24 = new int[2048];

	@OriginalMember(owner = "client!ac", name = "Tb", descriptor = "[I")
	public static final int[] anIntArray25 = new int[128];

	@OriginalMember(owner = "client!ac", name = "Ub", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_38 = Static120.method1824(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIZ)V")
	public static void method112(@OriginalArg(3) boolean arg0) {
		Static112.aBoolean97 = arg0;
		Static182.anInt4069 = 2;
		Static47.anInt1073 = 22050;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
	public static void method119() {
		if (Static13.aClass37_1 != null) {
			@Pc(7) Class37 local7 = Static13.aClass37_1;
			synchronized (Static13.aClass37_1) {
				Static13.aClass37_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	public static void method122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static173.anInt3892 < 2 && Static7.anInt221 == 0 && !Static162.aBoolean147) {
			return;
		}
		@Pc(38) Class80 local38;
		if (Static7.anInt221 == 1 && Static173.anInt3892 < 2) {
			local38 = Static154.method2467(new Class80[] { Static17.aClass80_131, Static135.aClass80_1132, Static134.aClass80_1289, Static130.aClass80_1103 });
		} else if (Static162.aBoolean147 && Static173.anInt3892 < 2) {
			local38 = Static154.method2467(new Class80[] { Static44.aClass80_376, Static135.aClass80_1132, Static38.aClass80_309, Static130.aClass80_1103 });
		} else {
			local38 = Static12.method47(Static173.anInt3892 - 1);
		}
		if (Static173.anInt3892 > 2) {
			local38 = Static154.method2467(new Class80[] { local38, Static98.aClass80_836, Static83.method1219(Static173.anInt3892 - 2), Static168.aClass80_1460 });
		}
		@Pc(128) int local128 = Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2254(local38, arg0 + 4, arg1 + 15, Static113.aRandom1, Static66.anInt1443);
		Static89.method1311(arg1, arg0 + 4, Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2269(local38) - -local128, 15);
	}
}
