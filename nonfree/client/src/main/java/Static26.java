import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
	public static int anInt478;

	@OriginalMember(owner = "client!bn", name = "M", descriptor = "Lclient!lc;")
	public static Class98 aClass98_14;

	@OriginalMember(owner = "client!bn", name = "O", descriptor = "Lclient!oe;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
	public static int anInt481;

	@OriginalMember(owner = "client!bn", name = "H", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)V")
	public static void method406() {
		aClass119_1 = null;
		aClass98_14 = null;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(IB)Lclient!im;")
	public static Class72 method408(@OriginalArg(0) int arg0) {
		@Pc(10) Class72 local10 = (Class72) Static105.aClass33_17.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static48.aClass98_30.method2396(arg0, 32);
		local10 = new Class72();
		if (local20 != null) {
			local10.method2002(new Class4_Sub17(local20));
		}
		local10.method1998();
		Static105.aClass33_17.method845(local10, (long) arg0);
		return local10;
	}
}
