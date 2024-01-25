import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!iv", name = "R", descriptor = "Lclient!qn;")
	public static Class211 aClass211_48;

	@OriginalMember(owner = "client!iv", name = "S", descriptor = "Lclient!qn;")
	public static Class211 aClass211_49;

	@OriginalMember(owner = "client!iv", name = "U", descriptor = "I")
	public static int anInt3224 = 0;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(II)V")
	public static void method2484(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub17 local10 = Static34.method1709(5, arg0);
		local10.method5523();
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(IZ)Lclient!h;")
	public static Class108 method2489(@OriginalArg(0) int arg0) {
		@Pc(10) Class108 local10 = (Class108) Static168.aClass137_20.method2744((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static433.aClass211_94.method4377(0, arg0);
		local10 = new Class108();
		if (local25 != null) {
			local10.method2012(arg0, new Class4_Sub9(local25));
		}
		Static168.aClass137_20.method2732((long) arg0, local10);
		return local10;
	}
}
