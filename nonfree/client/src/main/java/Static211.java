import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
	public static int anInt4179;

	@OriginalMember(owner = "client!uh", name = "M", descriptor = "[I")
	public static int[] anIntArray477;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1327 = Static186.method3527("Take");

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array80 = new Class50[500];

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1328 = Static186.method3527("::errortest");

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1329 = aClass50_1327;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1331 = Static186.method3527("Examine");

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1330 = aClass50_1331;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class69 method3291(@OriginalArg(1) int arg0) {
		@Pc(10) Class69 local10 = (Class69) Static73.aClass84_27.method2579((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static55.aClass86_18.method3325(4, arg0);
		local10 = new Class69();
		if (local20 != null) {
			local10.method1861(new Class1_Sub17(local20), arg0);
		}
		Static73.aClass84_27.method2582(local10, (long) arg0);
		return local10;
	}
}
