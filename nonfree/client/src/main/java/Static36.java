import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_35 = new Class18(3, 7);

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_37 = new Class21(4);

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "[I")
	public static final int[] anIntArray59 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Lclient!vg;")
	public static Class212 method908(@OriginalArg(0) int arg0) {
		@Pc(10) Class212 local10 = (Class212) Static48.aClass21_84.method854((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static65.aClass30_86.method1161(arg0, 31);
		local10 = new Class212();
		if (local20 != null) {
			local10.method5701(new Class1_Sub7(local20), arg0);
		}
		Static48.aClass21_84.method843(local10, (long) arg0);
		return local10;
	}
}
