import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!gt", name = "R", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_43 = new Class11(43, -1);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ae;)Ljava/lang/String;")
	public static String method2440(@OriginalArg(1) Class4 arg0) {
		if (Static45.method784(arg0).method642() == 0) {
			return null;
		} else if (arg0.aString5 == null || arg0.aString5.trim().length() == 0) {
			return Static226.aBoolean445 ? "Hidden-use" : null;
		} else {
			return arg0.aString5;
		}
	}
}
