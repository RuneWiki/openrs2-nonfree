import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!c", name = "U", descriptor = "I")
	public static int anInt369;

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array2;

	@OriginalMember(owner = "client!c", name = "eb", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_3;

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "Lclient!fe;")
	public static Class17 aClass17_15 = new Class17(50);

	@OriginalMember(owner = "client!c", name = "V", descriptor = "Lclient!lc;")
	public static Class31 aClass31_131 = Static56.method1206("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!c", name = "W", descriptor = "I")
	public static int anInt370 = 0;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "Lclient!lc;")
	public static Class31 aClass31_132 = Static56.method1206("Use ");

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "Lclient!lc;")
	public static Class31 aClass31_133 = Static56.method1206("To switch to a members)2only world:*6n1(Y Logout and return to the world selection page)3*6n2(Y Choose one of the members world with a gold star next to it(Ws name)3*6n*6nIf you prefer you can continue to use this world)1*6nbut members only features will be unavailable here)3");

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "Lclient!lc;")
	private static Class31 aClass31_136 = Static56.method1206("Members object");

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "Lclient!lc;")
	public static Class31 aClass31_134 = aClass31_136;

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!c", name = "db", descriptor = "Lclient!lc;")
	public static Class31 aClass31_135 = Static56.method1206("@or3@");

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
	public static int anInt372 = -1;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	public static void method229() {
		aClass17_15 = null;
		aClass31_136 = null;
		aClass31_135 = null;
		aClass31_133 = null;
		aClass31_131 = null;
		aClass2_Sub1_Sub3_Sub2Array2 = null;
		aClass31_134 = null;
		aClass2_Sub1_Sub3_Sub1_3 = null;
		aClass31_132 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lclient!lc;")
	public static Class31 method230(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static89.method1499(arg0) : Static14.aClass31_193;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
	public static void method231() {
		if (Static56.aClass34_1 != null) {
			@Pc(8) Class34 local8 = Static56.aClass34_1;
			synchronized (Static56.aClass34_1) {
				Static56.aClass34_1 = null;
			}
		}
	}
}
