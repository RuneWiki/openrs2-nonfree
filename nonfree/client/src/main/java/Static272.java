import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!rk", name = "S", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Lclient!de;")
	public static Class36 method4749(@OriginalArg(0) int arg0) {
		@Pc(10) Class36 local10 = (Class36) Static7.aClass140_6.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static33.aClass165_12.method4508(arg0, 31);
		local10 = new Class36();
		if (local20 != null) {
			local10.method1259(new Class1_Sub7(local20), arg0);
		}
		Static7.aClass140_6.method3817((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)V")
	public static void method4751(@OriginalArg(1) boolean arg0) {
		if (Static340.aBoolean337 != arg0) {
			Static340.aBoolean337 = arg0;
			Static108.method2029();
		}
	}
}
