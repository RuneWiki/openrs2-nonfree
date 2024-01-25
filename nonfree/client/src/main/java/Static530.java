import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public static int anInt8770;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Z")
	public static boolean aBoolean635 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!wq;)Lclient!wq;")
	public static Class394 method7400(@OriginalArg(1) Class394 arg0) {
		@Pc(13) Class394 local13 = Static81.method1272(arg0);
		if (local13 == null) {
			local13 = arg0.aClass394_13;
		}
		return local13;
	}
}
