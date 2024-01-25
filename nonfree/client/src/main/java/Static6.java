import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_3 = new Class298(1, 7);

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString2 = "";

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
	public static int anInt101 = 0;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)Z")
	public static boolean method101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static76.method1689(arg0, arg1) & Static440.method3644(arg1, arg0);
	}
}
