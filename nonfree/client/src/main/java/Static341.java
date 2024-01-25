import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!rg;")
	public static Class310 aClass310_67;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_19 = new Class125(16);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([ILclient!rg;BLclient!rg;)V")
	public static void method5220(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(3) Class310 arg2) {
		Static588.aClass310_115 = arg2;
		if (arg0 != null) {
			Static421.anIntArray369 = arg0;
		}
		Static33.aClass310_9 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method5221(@OriginalArg(0) Class144 arg0) {
		if (Static575.aBoolean661) {
			Static175.method2583(arg0);
		} else {
			Static431.method6453(arg0);
		}
	}
}
