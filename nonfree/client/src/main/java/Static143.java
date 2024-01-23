import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
	public static int anInt3147;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public static int anInt3135 = 0;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!sc;")
	private static Class107 aClass107_850 = Static231.method3737("Loading sprites )2 ");

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public static int anInt3140 = -2;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!sc;")
	public static Class107 aClass107_851 = aClass107_850;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!sc;")
	public static Class107 aClass107_852 = Static231.method3737("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Lclient!md;")
	public static Class78 method2370(@OriginalArg(1) int arg0) {
		@Pc(6) Class78 local6 = (Class78) Static120.aClass61_50.method1693((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static96.aClass28_36.method819(arg0, 16);
		local6 = new Class78();
		if (local25 != null) {
			local6.method2193(new Class1_Sub26(local25));
		}
		Static120.aClass61_50.method1694((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public static void method2371() {
		if (Static137.aClass82_2 != null) {
			Static137.aClass82_2.method2395();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method2372() {
		Static105.aFontMetrics1 = null;
		Static26.aFont1 = null;
		Static109.anImage3 = null;
	}
}
