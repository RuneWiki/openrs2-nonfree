import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
	public static boolean aBoolean59;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Lclient!je;")
	private static Class40 aClass40_476 = Static69.method1231("glow3:");

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_470 = aClass40_476;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	public static int anInt804 = 0;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!ob;")
	public static Class55 aClass55_31 = new Class55(100);

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "Lclient!je;")
	public static Class40 aClass40_471 = null;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_472 = aClass40_476;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!je;")
	private static Class40 aClass40_474 = Static69.method1231("Checking for updates )2 ");

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_473 = aClass40_474;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	public static int anInt812 = 0;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Lclient!je;")
	public static Class40 aClass40_475 = Static69.method1231("p12_full");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method520() {
		aClass40_476 = null;
		anIntArray94 = null;
		aClass40_471 = null;
		aClass40_472 = null;
		aClass40_474 = null;
		aClass40_473 = null;
		aClass40_475 = null;
		aClass55_31 = null;
		aClass40_470 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lclient!je;")
	public static Class40 method521(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static40.method722(new Class40[] { Static68.aClass40_912, Static49.method886(arg0), Static94.aClass40_1243 });
		} else if (arg0 < 10000000) {
			return Static40.method722(new Class40[] { Static92.aClass40_1217, Static49.method886(arg0 / 1000), Static117.aClass40_1475, Static94.aClass40_1243 });
		} else {
			return Static40.method722(new Class40[] { Static85.aClass40_1167, Static49.method886(arg0 / 1000000), Static67.aClass40_889, Static94.aClass40_1243 });
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
	public static void method522(@OriginalArg(0) boolean arg0) {
		Static55.method990();
		Static50.anInt1322++;
		if (Static50.anInt1322 < 50 && !arg0) {
			return;
		}
		Static50.anInt1322 = 0;
		if (Static119.aBoolean231 || Static85.aClass57_2 == null) {
			return;
		}
		Static57.aClass2_Sub9_Sub1_2.method673(7);
		try {
			Static85.aClass57_2.method1591(Static57.aClass2_Sub9_Sub1_2.aByteArray16, Static57.aClass2_Sub9_Sub1_2.anInt976);
			Static57.aClass2_Sub9_Sub1_2.anInt976 = 0;
		} catch (@Pc(44) IOException local44) {
			Static119.aBoolean231 = true;
		}
	}
}
