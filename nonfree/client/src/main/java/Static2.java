import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
	public static int anInt115;

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "Lclient!vb;")
	public static Class120 aClass120_1 = new Class120();

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "Lclient!sc;")
	public static Class107 aClass107_37 = Static231.method3737(" loggt sich ein)3");

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "Lclient!sc;")
	public static Class107 aClass107_38 = Static231.method3737("Lade Sprites )2 ");

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "Lclient!jd;")
	public static Class61 aClass61_5 = new Class61(64);

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_41 = Static231.method3737("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!aa", name = "X", descriptor = "Lclient!sc;")
	public static Class107 aClass107_39 = aClass107_41;

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_40 = Static231.method3737(" GMT");

	@OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
	public static int anInt116 = 0;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	public static void method86() {
		Static36.aClass61_15.method1697();
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lclient!qa;")
	public static Class96 method88(@OriginalArg(0) int arg0) {
		@Pc(10) Class96 local10 = (Class96) aClass61_5.method1693((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static191.aClass28_66.method819(Static157.method2540(arg0), Static171.method2728(arg0));
		local10 = new Class96();
		if (local24 != null) {
			local10.method2698(new Class1_Sub26(local24));
		}
		local10.method2702();
		aClass61_5.method1694((long) arg0, local10);
		return local10;
	}
}
