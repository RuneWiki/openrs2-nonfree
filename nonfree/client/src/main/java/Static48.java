import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fa", name = "hb", descriptor = "Lclient!bg;")
	public static Class11 aClass11_45;

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!fa", name = "eb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_554 = Static32.method683("flash3:");

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "Lclient!lf;")
	public static Class49 aClass49_552 = aClass49_554;

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
	public static volatile int anInt1123 = 0;

	@OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
	public static volatile int anInt1129 = -1;

	@OriginalMember(owner = "client!fa", name = "db", descriptor = "Lclient!lf;")
	public static Class49 aClass49_553 = Static32.method683("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
	public static int anInt1131 = -1;

	@OriginalMember(owner = "client!fa", name = "ib", descriptor = "Lclient!lf;")
	public static Class49 aClass49_555 = aClass49_554;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
	public static void method881() {
		if (Static12.anInt220 > 0) {
			Static107.method1821();
		} else {
			Static33.method691(40);
			Static41.aClass57_2 = Static51.aClass57_3;
			Static51.aClass57_3 = null;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Lclient!lf;")
	public static Class49 method882(@OriginalArg(1) int arg0) {
		return Static146.method2398(false, arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(JZ)V")
	public static void method883(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static18.anInt381 >= 100) {
			Static88.method1475(Static154.aClass49_1489, Static45.aClass49_525, 0);
			return;
		}
		@Pc(27) Class49 local27 = Static120.method2046(arg0).method1677();
		for (@Pc(29) int local29 = 0; local29 < Static18.anInt381; local29++) {
			if (arg0 == Static76.aLongArray11[local29]) {
				Static88.method1475(Static154.aClass49_1489, Static33.method692(new Class49[] { local27, Static156.aClass49_1520 }), 0);
				return;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static175.anInt3799; local68++) {
			if (arg0 == Static96.aLongArray12[local68]) {
				Static88.method1475(Static154.aClass49_1489, Static33.method692(new Class49[] { Static185.aClass49_1758, local27, Static122.aClass49_1180 }), 0);
				return;
			}
		}
		if (local27.method1676(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass49_1606)) {
			Static88.method1475(Static154.aClass49_1489, Static74.aClass49_801, 0);
			return;
		}
		Static76.aLongArray11[Static18.anInt381] = arg0;
		Static30.aClass49Array4[Static18.anInt381++] = Static120.method2046(arg0);
		Static95.anInt2012 = Static69.anInt1431;
		Static176.aClass2_Sub13_Sub1_14.method2976(147);
		Static176.aClass2_Sub13_Sub1_14.method2956(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
	public static void method884() {
		aClass11_45 = null;
		aClass49_553 = null;
		aClass49_552 = null;
		aClass49_554 = null;
		aClass49_555 = null;
	}
}
