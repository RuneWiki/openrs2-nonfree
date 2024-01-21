import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lclient!t;")
	public static Class68 aClass68_9;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "Lclient!f;")
	public static Class4_Sub9 aClass4_Sub9_1;

	@OriginalMember(owner = "client!lf", name = "ib", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_16;

	@OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
	public static int anInt1765;

	@OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lclient!fd;")
	public static Class4_Sub10_Sub1 aClass4_Sub10_Sub1_2 = new Class4_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "Lclient!v;")
	public static Class76 aClass76_742 = Static134.method2017("(U0a )2 in: ");

	@OriginalMember(owner = "client!lf", name = "ob", descriptor = "[I")
	public static int[] anIntArray238 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lf", name = "yb", descriptor = "Lclient!v;")
	private static Class76 aClass76_745 = Static134.method2017("yellow:");

	@OriginalMember(owner = "client!lf", name = "ub", descriptor = "Lclient!v;")
	public static Class76 aClass76_743 = aClass76_745;

	@OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
	public static int anInt1764 = 0;

	@OriginalMember(owner = "client!lf", name = "xb", descriptor = "Lclient!v;")
	public static Class76 aClass76_744 = aClass76_745;

	@OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
	public static int anInt1766 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)V")
	public static void method1156(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static45.anInt1192; local14++) {
			if (Static31.aLongArray17[local14] == arg0) {
				Static45.anInt1192--;
				for (@Pc(38) int local38 = local14; local38 < Static45.anInt1192; local38++) {
					Static31.aLongArray17[local38] = Static31.aLongArray17[local38 + 1];
					Static75.aClass76Array20[local38] = Static75.aClass76Array20[local38 + 1];
				}
				Static72.anInt1883 = Static36.anInt1031;
				aClass4_Sub10_Sub1_2.method611(126);
				aClass4_Sub10_Sub1_2.method555(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	public static void method1157() {
		aClass76_745 = null;
		aClass4_Sub10_Sub1_2 = null;
		aClass76_744 = null;
		aClass68_9 = null;
		anIntArray238 = null;
		aClass4_Sub9_1 = null;
		aClass17_Sub1_16 = null;
		aClass76_742 = null;
		aClass76_743 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!la;)V")
	public static void method1158(@OriginalArg(1) Class17 arg0) {
		Static48.aClass17_17 = arg0;
	}
}
