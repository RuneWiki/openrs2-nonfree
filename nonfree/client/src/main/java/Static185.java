import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	public static int anInt3915;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1370 = Static120.method2057("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1372 = Static120.method2057("wishes to trade with you)3");

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1371 = aClass81_1372;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1373 = Static120.method2057("mapdots");

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1374 = Static120.method2057("Walk here");

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Lclient!r;")
	public static Applet_Sub1 anApplet_Sub1_3 = null;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1375 = aClass81_1374;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIB)V")
	public static void method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = 0;
		@Pc(12) Class80[] local12 = Static2.aClass80Array1;
		while (local10 < local12.length) {
			@Pc(18) Class80 local18 = local12[local10];
			if (local18 != null && local18.anInt3569 == 2) {
				Static43.method818(local18.anInt3568 + (local18.anInt3563 - Static51.anInt1219 << 7), local18.anInt3565 * 2, (local18.anInt3561 - Static114.anInt2140 << 7) + local18.anInt3566);
				if (Static20.anInt507 > -1 && Static142.anInt3104 % 20 < 10) {
					Static107.aClass1_Sub2_Sub2_Sub3Array8[local18.anInt3567].method2130(Static20.anInt507 + arg1 - 12, arg0 - (-Static78.anInt1832 + 28));
				}
			}
			local10++;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)Lclient!tg;")
	public static Class81 method2991(@OriginalArg(1) int arg0) {
		return Static152.aClass81Array19[arg0].method2820() > 0 ? Static127.method2169(new Class81[] { Static35.aClass81Array2[arg0], Static69.aClass81_583, Static152.aClass81Array19[arg0] }) : Static35.aClass81Array2[arg0];
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public static void method2997() {
		aClass81_1371 = null;
		aClass81_1373 = null;
		aClass81_1375 = null;
		aClass81_1370 = null;
		aClass81_1372 = null;
		aClass81_1374 = null;
	}
}
