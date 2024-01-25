import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
	public static int anInt7776 = 1;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5982(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static185.method2957(Static112.method1763(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
