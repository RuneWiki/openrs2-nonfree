import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "[[Lclient!at;")
	public static Class24[][] aClass24ArrayArray1;

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "Lclient!in;")
	public static Class157 aClass157_211;

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
	public static int anInt7746 = 0;

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_159 = new Class215(58, 2);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZIBI)Lclient!in;")
	public static Class157 method6635(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class233 local10 = null;
		if (Static591.aClass184_4 != null) {
			local10 = new Class233(arg1, Static591.aClass184_4, Static343.aClass184Array1[arg1], 1000000);
		}
		Static18.aClass37_Sub1Array1[arg1] = Static437.aClass84_1.method2852(local10, arg1, Static593.aClass233_4);
		Static18.aClass37_Sub1Array1[arg1].method1668();
		return new Class157(Static18.aClass37_Sub1Array1[arg1], arg0, arg2);
	}
}
