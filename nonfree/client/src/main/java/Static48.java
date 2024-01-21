import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
	public static int anInt1329 = 0;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "Lclient!kb;")
	private static Class46 aClass46_435 = Static65.method1172("Loaded textures");

	@OriginalMember(owner = "client!g", name = "R", descriptor = "Lclient!kb;")
	public static Class46 aClass46_433 = aClass46_435;

	@OriginalMember(owner = "client!g", name = "S", descriptor = "Lclient!kb;")
	public static Class46 aClass46_434 = Static65.method1172(")3runescape)3com");

	@OriginalMember(owner = "client!g", name = "V", descriptor = "Lclient!kb;")
	public static Class46 aClass46_436 = Static65.method1172("<col=00ff00>");

	@OriginalMember(owner = "client!g", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_437 = Static65.method1172("Weiter");

	@OriginalMember(owner = "client!g", name = "X", descriptor = "Lclient!kb;")
	public static Class46 aClass46_438 = Static65.method1172("Registrierter Benutzer");

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
	public static int anInt1331 = 0;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(ZI)Lclient!ha;")
	public static Class3_Sub2_Sub7 method963(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub2_Sub7 local6 = (Class3_Sub2_Sub7) Static150.aClass57_24.method1719((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static149.aClass44_29.method1624(1, arg0);
		local6 = new Class3_Sub2_Sub7();
		if (local25 != null) {
			local6.method1050(new Class3_Sub4(local25), arg0);
		}
		Static150.aClass57_24.method1717(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	public static void method965() {
		aClass46_437 = null;
		aClass46_436 = null;
		aClass46_433 = null;
		aClass46_435 = null;
		aClass46_434 = null;
		aClass46_438 = null;
	}
}
