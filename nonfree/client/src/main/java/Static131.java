import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!gb;")
	public static Class1_Sub2_Sub8_Sub1_Sub1 aClass1_Sub2_Sub8_Sub1_Sub1_5;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_878 = Static81.method1507("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_882 = Static81.method1507("Loaded interfaces");

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Lclient!dj;")
	public static Class24 aClass24_879 = aClass24_882;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_880 = Static81.method1507("gr-Un:");

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_884 = Static81.method1507("Loading)3)3)3");

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Lclient!dj;")
	public static Class24 aClass24_881 = aClass24_884;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_883 = Static81.method1507(" (X");

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
	public static final int anInt2940 = 5063219;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_885 = Static81.method1507(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!mi;B)V")
	public static void method2258(@OriginalArg(0) Class1_Sub16 arg0) {
		Static5.method104(200000, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ua;B)V")
	public static void method2260(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static170.anInt3792 != 1) {
			return;
		}
		if (Static157.anInt3462 >= 280 && Static157.anInt3462 <= 294 && Static92.anInt2141 >= 4 && Static92.anInt2141 <= 18) {
			Static65.method1312(0, 0);
			return;
		}
		if (Static157.anInt3462 >= 295 && Static157.anInt3462 <= 360 && Static92.anInt2141 >= 4 && Static92.anInt2141 <= 18) {
			Static65.method1312(1, 0);
			return;
		}
		if (Static157.anInt3462 >= 390 && Static157.anInt3462 <= 404 && Static92.anInt2141 >= 4 && Static92.anInt2141 <= 18) {
			Static65.method1312(0, 1);
			return;
		}
		if (Static157.anInt3462 >= 405 && Static157.anInt3462 <= 470 && Static92.anInt2141 >= 4 && Static92.anInt2141 <= 18) {
			Static65.method1312(1, 1);
			return;
		}
		if (Static157.anInt3462 >= 500 && Static157.anInt3462 <= 514 && Static92.anInt2141 >= 4 && Static92.anInt2141 <= 18) {
			Static65.method1312(0, 2);
			return;
		}
		if (Static157.anInt3462 >= 515 && Static157.anInt3462 <= 580 && Static92.anInt2141 >= 4 && Static92.anInt2141 <= 18) {
			Static65.method1312(1, 2);
			return;
		}
		if (Static157.anInt3462 >= 610 && Static157.anInt3462 <= 624 && Static92.anInt2141 >= 4 && Static92.anInt2141 <= 18) {
			Static65.method1312(0, 3);
			return;
		}
		if (Static157.anInt3462 >= 625 && Static157.anInt3462 <= 690 && Static92.anInt2141 >= 4 && Static92.anInt2141 <= 18) {
			Static65.method1312(1, 3);
			return;
		}
		if (Static157.anInt3462 >= 700 && Static92.anInt2141 >= 4 && Static157.anInt3462 <= 758 && Static92.anInt2141 <= 20) {
			Static122.aBoolean123 = false;
			Static13.method304();
			return;
		}
		if (Static89.anInt2080 == -1) {
			return;
		}
		@Pc(244) Class63 local244 = Static160.aClass63Array105[Static89.anInt2080];
		if (local244.aBoolean121 == Static155.aBoolean139) {
			@Pc(264) byte[] local264 = Static63.method1281(new Class24[] { local244.aClass24_789, Static99.aClass24_662 }).method768();
			Static2.aString1 = new String(local264, 0, local264.length);
			Static122.aBoolean123 = false;
			if (Static212.anInt4707 != 0) {
				Static73.anInt1755 = 43594;
				Static147.anInt3278 = 43594;
				Static93.anInt2157 = 443;
				Static212.anInt4707 = 0;
			}
			Static162.anInt3573 = local244.anInt2671;
			Static13.method304();
			return;
		}
		@Pc(351) Class24 local351 = Static63.method1281(new Class24[] { Static18.aClass24_1115, local244.aClass24_789, aClass24_885, Static175.method3020(Static107.anInt2426), Static208.aClass24_1310, Static175.method3020(Static30.aBoolean35 ? 1 : 0), Static142.aClass24_940, Static175.method3020(Static83.anInt2000), Static133.aClass24_895, Static175.method3020(Static87.anInt2058) });
		try {
			arg0.getAppletContext().showDocument(local351.method749(), "_self");
			return;
		} catch (@Pc(360) Exception local360) {
			return;
		}
	}
}
