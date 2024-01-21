import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!g", name = "U", descriptor = "Lclient!ef;")
	public static Class16 aClass16_53;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "I")
	public static int anInt1134 = 0;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "[I")
	public static int[] anIntArray130 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "Lclient!he;")
	private static Class26 aClass26_584 = Static6.method100("skill)2");

	@OriginalMember(owner = "client!g", name = "L", descriptor = "Lclient!he;")
	public static Class26 aClass26_582 = aClass26_584;

	@OriginalMember(owner = "client!g", name = "V", descriptor = "Lclient!he;")
	public static Class26 aClass26_583 = Static6.method100(" (X");

	@OriginalMember(owner = "client!g", name = "cb", descriptor = "Lclient!he;")
	public static Class26 aClass26_585 = Static6.method100("b12_full");

	@OriginalMember(owner = "client!g", name = "db", descriptor = "Lclient!he;")
	public static Class26 aClass26_586 = Static6.method100("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!de;")
	public static Class3_Sub1_Sub6 method704(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub6 local10 = (Class3_Sub1_Sub6) Static12.aClass66_2.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static106.aClass16_131.method566(14, arg0);
		local10 = new Class3_Sub1_Sub6();
		if (local20 != null) {
			local10.method513(new Class3_Sub11(local20));
		}
		Static12.aClass66_2.method1969((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method705() {
		aClass16_53 = null;
		aClass26_586 = null;
		aClass26_584 = null;
		aClass26_583 = null;
		aClass26_585 = null;
		anIntArray130 = null;
		aClass26_582 = null;
	}
}
