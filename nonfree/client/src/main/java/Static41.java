import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static41 {

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "Lclient!he;")
	public static Class26 aClass26_668 = Static6.method100("Freie Welt");

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "Lclient!he;")
	private static Class26 aClass26_669 = Static6.method100("Select a world");

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!he;")
	private static Class26 aClass26_670 = Static6.method100("Username: ");

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "Lclient!he;")
	public static Class26 aClass26_671 = Static6.method100("<col=ffffff>");

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "Lclient!sf;")
	public static Class66 aClass66_13 = new Class66(30);

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lclient!he;")
	public static Class26 aClass26_672 = aClass26_669;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!he;")
	public static Class26 aClass26_674 = Static6.method100("Hierhin gehen");

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "Lclient!he;")
	public static Class26 aClass26_675 = aClass26_670;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "[I")
	public static int[] anIntArray138 = new int[1000];

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "[I")
	public static int[] anIntArray139 = new int[128];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public static void method791(@OriginalArg(1) int arg0) {
		if (Static46.aClass3_Sub9Array1 != null && arg0 >= 0 && Static46.aClass3_Sub9Array1.length > arg0 && Static46.aClass3_Sub9Array1[arg0] != null) {
			Static107.aClass3_Sub11_Sub1_3.method1029(161);
			Static107.aClass3_Sub11_Sub1_3.method1020(Static46.aClass3_Sub9Array1[arg0].aLong100);
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method792() {
		aClass26_668 = null;
		anIntArray139 = null;
		aClass26_672 = null;
		aClass66_13 = null;
		aClass26_674 = null;
		aClass26_675 = null;
		aClass26_669 = null;
		aClass26_671 = null;
		anIntArray138 = null;
		aClass26_670 = null;
	}
}
