import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "J")
	public static long aLong35;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	public static int anInt1214;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!mc;")
	public static Class42 aClass42_662 = Static23.method501("Passwort: ");

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_663 = Static23.method501("l");

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!mc;")
	private static Class42 aClass42_665 = Static23.method501("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_664 = aClass42_665;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	public static int anInt1209 = -1;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	public static int anInt1212 = 0;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_666 = Static23.method501("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_667 = Static23.method501(" )2>");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method853() {
		Static16.aBoolean26 = true;
		Static89.method1645();
		@Pc(31) boolean local31;
		if (Static29.anInt819 != -1) {
			local31 = Static106.method1848(-1, Static29.anInt819, 0, 1, 0, 0, 261, 190);
			if (!local31) {
				Static89.aBoolean132 = true;
			}
		} else if (Static10.anIntArray33[Static108.anInt2748] != -1) {
			local31 = Static106.method1848(-1, Static10.anIntArray33[Static108.anInt2748], 0, 1, 0, 0, 261, 190);
			if (!local31) {
				Static89.aBoolean132 = true;
			}
		}
		if (Static10.aBoolean13 && Static73.anInt1891 == 1) {
			if (Static5.anInt134 == 1) {
				Static12.method275();
			} else {
				Static97.method1699();
			}
		}
		Static58.method1005();
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public static void method854() {
		anIntArray181 = null;
		aClass42_664 = null;
		aClass42_667 = null;
		aClass42_662 = null;
		aClass42_665 = null;
		aClass42_666 = null;
		aClass42_663 = null;
		anIntArray184 = null;
	}
}
