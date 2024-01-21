import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ge", name = "xb", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_3;

	@OriginalMember(owner = "client!ge", name = "Sb", descriptor = "Lclient!je;")
	private static Class40 aClass40_556 = Static69.method1231("Loading)3)3)3");

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Lclient!je;")
	public static Class40 aClass40_547 = aClass40_556;

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "Lclient!je;")
	private static Class40 aClass40_548 = Static69.method1231("Continue");

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
	public static int anInt1035 = 0;

	@OriginalMember(owner = "client!ge", name = "gb", descriptor = "Lclient!je;")
	public static Class40 aClass40_549 = aClass40_548;

	@OriginalMember(owner = "client!ge", name = "qb", descriptor = "Lclient!je;")
	public static Class40 aClass40_550 = Static69.method1231("Untersuchen");

	@OriginalMember(owner = "client!ge", name = "wb", descriptor = "Lclient!je;")
	public static Class40 aClass40_552 = Static69.method1231("blinken1:");

	@OriginalMember(owner = "client!ge", name = "yb", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!ge", name = "Ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_553 = Static69.method1231(" <col=00ff80>");

	@OriginalMember(owner = "client!ge", name = "Ib", descriptor = "Lclient!je;")
	public static Class40 aClass40_554 = Static69.method1231("Ausw-=hlen");

	@OriginalMember(owner = "client!ge", name = "Lb", descriptor = "I")
	public static int anInt1057 = 0;

	@OriginalMember(owner = "client!ge", name = "Mb", descriptor = "I")
	public static int anInt1058 = 0;

	@OriginalMember(owner = "client!ge", name = "Nb", descriptor = "Lclient!je;")
	public static Class40 aClass40_555 = Static69.method1231(":trade:");

	@OriginalMember(owner = "client!ge", name = "Wb", descriptor = "[I")
	public static int[] anIntArray104 = new int[200];

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public static void method706() {
		aClass40_548 = null;
		aClass40_552 = null;
		aClass40_547 = null;
		aClass40_553 = null;
		aClass40_555 = null;
		aClass40_554 = null;
		anIntArray104 = null;
		aClass40_550 = null;
		aClass24_Sub1_3 = null;
		aClass40_556 = null;
		aClass40_549 = null;
		anIntArrayArray11 = null;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
	public static void method709() {
		if (Static11.aClass57_1 != null) {
			Static11.aClass57_1.method1596();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!je;)Z")
	public static boolean method710(@OriginalArg(1) Class40 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static114.anInt2621; local11++) {
			if (arg0.method984(Static85.aClass40Array17[local11])) {
				return true;
			}
		}
		return arg0.method984(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass40_892);
	}
}
