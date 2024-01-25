import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public static int anInt6766;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public static int anInt6769;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "I")
	public static int anInt6774;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "I")
	public static int anInt6770 = 1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!ms;)Ljava/lang/String;")
	public static String method5713(@OriginalArg(1) Class137 arg0) {
		if (Static42.method634(arg0).method4727() == 0) {
			return null;
		} else if (arg0.aString34 == null || arg0.aString34.trim().length() == 0) {
			return Static332.aBoolean414 ? "Hidden-use" : null;
		} else {
			return arg0.aString34;
		}
	}
}
