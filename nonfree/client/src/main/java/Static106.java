import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
	public static int anInt2240;

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
	public static int anInt2249;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
	public static final int[] anIntArray131 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString80 = "Loaded fonts";

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V")
	public static void method1814(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static97.aBoolean104) {
			Static97.aBoolean104 = arg0;
			Static63.method1014();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)Lclient!pc;")
	public static Class155 method1817(@OriginalArg(0) int arg0) {
		@Pc(10) Class155 local10 = (Class155) Static243.aClass198_46.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static246.aClass100_99.method2319(1, arg0);
		local10 = new Class155();
		if (local20 != null) {
			local10.method4008(new Class3_Sub4(local20), arg0);
		}
		Static243.aClass198_46.method5231((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1818(@OriginalArg(1) String arg0) {
		return Static75.method1147(arg0);
	}
}
