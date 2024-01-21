import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!h", name = "V", descriptor = "I")
	public static int anInt1118;

	@OriginalMember(owner = "client!h", name = "W", descriptor = "Lclient!o;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
	public static int anInt1120;

	@OriginalMember(owner = "client!h", name = "db", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array3;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "Lclient!af;")
	public static Class5 aClass5_571 = Static45.method1937("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!h", name = "U", descriptor = "Lclient!af;")
	public static Class5 aClass5_572 = Static45.method1937("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "Lclient!af;")
	public static Class5 aClass5_573 = Static45.method1937("Welt");

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "Lclient!gd;")
	public static Class28 aClass28_29 = new Class28(64);

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "Lclient!af;")
	private static Class5 aClass5_575 = Static45.method1937("Attack");

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "Lclient!af;")
	public static Class5 aClass5_574 = aClass5_575;

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "[I")
	public static int[] anIntArray193 = new int[2000];

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
	public static volatile int anInt1123 = -1;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lclient!cc;")
	public static Class1_Sub3_Sub5 method825(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub5 local8 = (Class1_Sub3_Sub5) Static90.aClass28_62.method796((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static82.aClass41_18.method1710(4, arg0);
		local8 = new Class1_Sub3_Sub5();
		if (local22 != null) {
			local8.method421(arg0, new Class1_Sub20(local22));
		}
		local8.method422();
		Static90.aClass28_62.method789(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	public static void method827() {
		aClass54_1 = null;
		anIntArray193 = null;
		aClass5_575 = null;
		aClass5_573 = null;
		aClass1_Sub3_Sub1_Sub2Array3 = null;
		aClass28_29 = null;
		aClass5_574 = null;
		aClass5_572 = null;
		aClass5_571 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(JB)V")
	public static void method828(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static92.anInt2321 >= 100) {
			Static50.method893(Static126.aClass5_1444, 0, Static49.aClass5_612);
			return;
		}
		@Pc(31) Class5 local31 = Static76.method1314(arg0).method219();
		for (@Pc(38) int local38 = 0; local38 < Static92.anInt2321; local38++) {
			if (arg0 == Static38.aLongArray1[local38]) {
				Static50.method893(Static100.method1696(new Class5[] { local31, Static42.aClass5_509 }), 0, Static49.aClass5_612);
				return;
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static20.anInt658; local75++) {
			if (Static86.aLongArray3[local75] == arg0) {
				Static50.method893(Static100.method1696(new Class5[] { Static48.aClass5_587, local31, Static62.aClass5_1183 }), 0, Static49.aClass5_612);
				return;
			}
		}
		if (local31.method199(Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass5_985)) {
			Static50.method893(Static51.aClass5_651, 0, Static49.aClass5_612);
		} else {
			Static38.aLongArray1[Static92.anInt2321++] = arg0;
			Static83.anInt2119 = Static60.anInt1441;
			Static44.aClass1_Sub20_Sub1_1.method2108(91);
			Static44.aClass1_Sub20_Sub1_1.method2078(arg0);
		}
	}
}
