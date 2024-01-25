import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!di;")
	public static final Class54 aClass54_80 = new Class54(62, -1);

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Lclient!di;")
	public static final Class54 aClass54_81 = new Class54(58, -1);

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Z")
	public static boolean aBoolean401 = true;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4563(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static408.method5373(Static346.method4767(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
