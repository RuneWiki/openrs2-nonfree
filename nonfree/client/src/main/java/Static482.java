import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
	public static int anInt8295;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!wq;II)Ljava/lang/String;")
	public static String method7043(@OriginalArg(0) Class394 arg0, @OriginalArg(1) int arg1) {
		if (!Static81.method1268(arg0).method6630(arg1) && arg0.anObjectArray5 == null) {
			return null;
		} else if (arg0.aStringArray43 == null || arg1 >= arg0.aStringArray43.length || arg0.aStringArray43[arg1] == null || arg0.aStringArray43[arg1].trim().length() == 0) {
			return Static292.aBoolean301 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray43[arg1];
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public static void method7054(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub2_Sub4 local14 = Static257.method3597(11, (long) arg0);
		local14.method2440();
	}
}
