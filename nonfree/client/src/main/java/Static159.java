import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	public static int anInt3199;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!st;")
	public static final Class314 aClass314_52 = new Class314(32, -1);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z")
	public static boolean method2761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public static void method2762(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7_Sub5 local10 = Static138.method2377(14, arg0);
		local10.method1473();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ID)V")
	public static void method2763(@OriginalArg(1) double arg0) {
		Static122.aClass31_11.method7934(Static376.aClass31_44);
		Static122.aClass31_11.method7930(0, 0, (int) arg0);
		Static366.aClass82_11.method6160(Static122.aClass31_11);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)Z")
	public static boolean method2765(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
