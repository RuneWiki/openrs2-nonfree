import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!he", name = "W", descriptor = "[I")
	public static int[] anIntArray125 = new int[128];

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "Lclient!pb;")
	public static Class61 aClass61_8 = new Class61();

	@OriginalMember(owner = "client!he", name = "yc", descriptor = "Lclient!ja;")
	private static Class39 aClass39_726 = Static28.method504("Service unavailable)3");

	@OriginalMember(owner = "client!he", name = "vc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_725 = aClass39_726;

	@OriginalMember(owner = "client!he", name = "Ac", descriptor = "I")
	public static int anInt1254 = 0;

	@OriginalMember(owner = "client!he", name = "Dc", descriptor = "Lclient!ja;")
	private static Class39 aClass39_727 = Static28.method504("Loading config )2 ");

	@OriginalMember(owner = "client!he", name = "Ec", descriptor = "Lclient!ja;")
	public static Class39 aClass39_728 = aClass39_727;

	@OriginalMember(owner = "client!he", name = "Mc", descriptor = "I")
	public static int anInt1260 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!he", name = "Xc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_729 = Static28.method504("Lade)3)3)3");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Z")
	public static boolean method783() {
		@Pc(5) Class65 local5 = Static11.aClass65_1;
		synchronized (Static11.aClass65_1) {
			if (Static59.anInt1556 == Static73.anInt1768) {
				return false;
			} else {
				Static35.anInt904 = Static101.anIntArray280[Static73.anInt1768];
				Static55.anInt1496 = anIntArray125[Static73.anInt1768];
				Static73.anInt1768 = Static73.anInt1768 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZII)I")
	public static int method784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static22.method425(arg1 - 1, arg0 - 1) + Static22.method425(arg1 + 1, arg0 + -1) + Static22.method425(arg1 + -1, arg0 - -1) + Static22.method425(arg1 + 1, arg0 + 1);
		@Pc(73) int local73 = Static22.method425(arg1 - 1, arg0) + Static22.method425(arg1 + 1, arg0) + Static22.method425(arg1, arg0 + -1) + Static22.method425(arg1, arg0 + 1);
		@Pc(78) int local78 = Static22.method425(arg1, arg0);
		return local78 / 4 + local45 / 16 + local73 / 8;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public static void method789() {
		if (Static37.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static26.anIntArray67[220] = 74;
			Static26.anIntArray67[190] = 72;
			Static26.anIntArray67[187] = 27;
			Static26.anIntArray67[188] = 71;
			Static26.anIntArray67[186] = 57;
			Static26.anIntArray67[192] = 58;
			Static26.anIntArray67[191] = 73;
			Static26.anIntArray67[189] = 26;
			Static26.anIntArray67[221] = 43;
			Static26.anIntArray67[223] = 28;
			Static26.anIntArray67[219] = 42;
			Static26.anIntArray67[222] = 59;
			return;
		}
		Static26.anIntArray67[61] = 27;
		Static26.anIntArray67[46] = 72;
		Static26.anIntArray67[47] = 73;
		Static26.anIntArray67[59] = 57;
		Static26.anIntArray67[93] = 43;
		Static26.anIntArray67[44] = 71;
		Static26.anIntArray67[45] = 26;
		Static26.anIntArray67[92] = 74;
		if (Static37.aMethod2 == null) {
			Static26.anIntArray67[192] = 58;
			Static26.anIntArray67[222] = 59;
		} else {
			Static26.anIntArray67[192] = 28;
			Static26.anIntArray67[520] = 59;
			Static26.anIntArray67[222] = 58;
		}
		Static26.anIntArray67[91] = 42;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!pd;ILclient!pd;)V")
	public static void method790(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		Static25.aClass20_62 = arg1;
		Static106.aClass20_53 = arg0;
		Static72.anInt801 = Static106.aClass20_53.method471(3);
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	public static void method794() {
		aClass39_728 = null;
		anIntArray125 = null;
		aClass39_726 = null;
		aClass39_727 = null;
		aClass39_729 = null;
		aClass39_725 = null;
		aClass61_8 = null;
	}
}
