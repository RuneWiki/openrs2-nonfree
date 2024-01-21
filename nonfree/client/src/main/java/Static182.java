import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1436 = Static120.method2057("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1437 = Static120.method2057("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array24 = new Class81[100];

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1438 = Static120.method2057("leuchten2:");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method3113() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!tg;I)V")
	public static void method3115(@OriginalArg(0) Class81 arg0) {
		if (Static51.anInt1221 >= 2) {
			if (arg0.method2811(Static103.aClass81_798)) {
				System.gc();
			}
			if (arg0.method2811(Static34.aClass81_321)) {
				Static146.method2499();
			}
			if (arg0.method2811(Static181.aClass81_1433)) {
				Static67.aBoolean65 = true;
			}
			if (arg0.method2811(Static153.aClass81_1261)) {
				Static67.aBoolean65 = false;
			}
			arg0.method2811(Static29.aClass81_255);
			arg0.method2811(Static70.aClass81_588);
			if (arg0.method2811(Static78.aClass81_629)) {
				for (@Pc(65) int local65 = 0; local65 < 4; local65++) {
					for (@Pc(69) int local69 = 1; local69 < 103; local69++) {
						for (@Pc(73) int local73 = 1; local73 < 103; local73++) {
							Static141.aClass28Array2[local65].anIntArrayArray8[local69][local73] = 0;
						}
					}
				}
			}
			if (arg0.method2796(Static73.aClass81_608) && Static59.anInt1402 != 0) {
				Static47.method850(arg0.method2801(6).method2807());
			}
			if (arg0.method2811(Static12.aClass81_1447) && Static59.anInt1402 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2796(Static111.aClass81_915)) {
				Static161.anInt3668 = arg0.method2801(12).method2809().method2807();
				Static131.method2247(0, Static127.method2169(new Class81[] { Static107.aClass81_834, Static149.method2548(Static161.anInt3668) }), null);
			}
			if (arg0.method2811(Static141.aClass81_244)) {
				Static74.aBoolean69 = true;
			}
		}
		Static104.aClass1_Sub8_Sub1_2.method366(129);
		Static104.aClass1_Sub8_Sub1_2.method331(arg0.method2820() - 1);
		Static104.aClass1_Sub8_Sub1_2.method348(arg0.method2801(2));
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public static void method3119() {
		aClass81_1436 = null;
		aClass81Array24 = null;
		aClass81_1438 = null;
		aClass81_1437 = null;
	}
}
