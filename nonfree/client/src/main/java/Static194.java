import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
	public static int anInt3394;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
	public static int anInt3395 = -2;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	public static void method2929() {
		Static136.method2234();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2930(@OriginalArg(0) String arg0) {
		@Pc(18) String local18 = Static59.method732(Static22.method341(arg0));
		if (local18 == null) {
			local18 = "";
		}
		return local18;
	}
}
