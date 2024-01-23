import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!pk;")
	public static Class132 aClass132_42;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public static int anInt2415;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!gd;")
	public static Class61 aClass61_20 = new Class61(64);

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Z")
	public static volatile boolean aBoolean205 = false;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!pk;Lclient!pk;IBI)Lclient!jj;")
	public static Class8_Sub1_Sub5_Sub2 method1936(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) int arg2) {
		return Static247.method4168(arg1, 0, arg2) ? Static19.method345(arg0.method3194(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method1938() {
		if (Static20.aBoolean35) {
			Static235.aClass43_1 = null;
			Static93.aClass8_Sub1_Sub7_4 = null;
			Static20.aBoolean35 = false;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	public static void method1939(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static47.aBoolean71) {
			Static47.aBoolean71 = arg0;
			Static231.method3535();
		}
	}
}
