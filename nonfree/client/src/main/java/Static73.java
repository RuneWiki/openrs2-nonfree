import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_11;

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_531 = Static181.method2795("<br>(X100(U(Y");

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_532 = Static181.method2795("Loading)3)3)3");

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_533 = Static181.method2795(":assist:");

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "Lclient!ae;")
	public static Class5 aClass5_9 = null;

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_534 = Static181.method2795(" )2> ");

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "Lclient!qe;")
	public static Class83 aClass83_535 = aClass83_532;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1398(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static200.method3032(local18) : local18;
		} else if (arg1 instanceof Class11) {
			@Pc(32) Class11 local32 = (Class11) arg1;
			return local32.method1827();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)Lclient!va;")
	public static Class2_Sub2_Sub25 method1399(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub25 local10 = (Class2_Sub2_Sub25) Static7.aClass86_4.method2643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static113.aClass28_121.method852(arg0, 5);
		local10 = new Class2_Sub2_Sub25();
		if (local20 != null) {
			local10.method3017(new Class2_Sub3(local20));
		}
		Static7.aClass86_4.method2647(local10, (long) arg0);
		return local10;
	}
}
