import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!v", name = "S", descriptor = "Lclient!jg;")
	public static Class44 aClass44_30;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "I")
	public static int anInt3754;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1346 = Static65.method1172("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!v", name = "T", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1347 = Static65.method1172("as it was used to break our rules)3");

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1348 = aClass46_1347;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method2710() {
		aClass46_1348 = null;
		aClass44_30 = null;
		aClass46_1346 = null;
		aClass46_1347 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
	public static void method2711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static57.method1063(arg0)) {
			Static36.method654(Static26.aClass33ArrayArray1[arg0], arg1);
		}
	}
}
