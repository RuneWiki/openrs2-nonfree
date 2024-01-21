import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!f", name = "y", descriptor = "Lclient!aa;")
	public static Class2 aClass2_2;

	@OriginalMember(owner = "client!f", name = "V", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_281 = Static122.method531("<img=0>");

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!sd;")
	private static Class73 aClass73_282 = Static122.method531("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!f", name = "M", descriptor = "Lclient!sd;")
	private static Class73 aClass73_285 = Static122.method531("Walk here");

	@OriginalMember(owner = "client!f", name = "C", descriptor = "Lclient!sd;")
	public static Class73 aClass73_283 = aClass73_285;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "Lclient!sd;")
	public static Class73 aClass73_284 = aClass73_282;

	@OriginalMember(owner = "client!f", name = "P", descriptor = "Lclient!sd;")
	public static Class73 aClass73_286 = Static122.method531("_");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static void method356() {
		aClass73_283 = null;
		aClass73_284 = null;
		aClass73_282 = null;
		aClass73_285 = null;
		aClass73_281 = null;
		aClass73_286 = null;
		anIntArray46 = null;
		aClass2_2 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!sd;)V")
	public static void method360(@OriginalArg(1) Class73 arg0) {
		if (Static91.anInt2031 >= 2) {
			if (arg0.method2438(Static83.aClass73_990)) {
				System.gc();
			}
			if (arg0.method2438(Static104.aClass73_1347)) {
				Static10.method177();
			}
			if (arg0.method2438(Static3.aClass73_47)) {
				Static115.aBoolean182 = true;
			}
			if (arg0.method2438(Static131.aClass73_1662)) {
				Static115.aBoolean182 = false;
			}
			if (arg0.method2438(Static169.aClass73_1980)) {
				for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
					for (@Pc(48) int local48 = 1; local48 < 103; local48++) {
						for (@Pc(52) int local52 = 1; local52 < 103; local52++) {
							Static41.aClass60Array1[local44].anIntArrayArray34[local48][local52] = 0;
						}
					}
				}
			}
			if (arg0.method2438(Static118.aClass73_2102) && Static90.anInt2026 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2434(Static179.aClass73_2077)) {
				Static20.anInt540 = arg0.method2447(12).method2442().method2431();
				Static135.method2234(0, Static19.method372(new Class73[] { Static107.aClass73_1427, Static154.method2485(Static20.anInt540) }), null);
			}
			if (arg0.method2438(Static45.aClass73_621)) {
				Static8.aBoolean16 = true;
			}
		}
		Static139.aClass3_Sub12_Sub1_3.method1400(194);
		Static139.aClass3_Sub12_Sub1_3.method1383(arg0.method2435() - 1);
		Static139.aClass3_Sub12_Sub1_3.method1350(arg0.method2447(2));
	}
}
