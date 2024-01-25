import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
	public static int anInt3921;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
	public static int anInt3920 = 0;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
	public static int anInt3925 = 500;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "Lclient!jk;")
	public static Class124 aClass124_5 = null;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method3201(@OriginalArg(1) String arg0) {
		return Static126.method2010(10, arg0);
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V")
	public static void method3202() {
		@Pc(5) Class102 local5 = Static218.aClass102_26;
		synchronized (Static218.aClass102_26) {
			Static218.aClass102_26.method2260();
		}
		local5 = Static311.aClass102_42;
		synchronized (Static311.aClass102_42) {
			Static311.aClass102_42.method2260();
		}
	}
}
