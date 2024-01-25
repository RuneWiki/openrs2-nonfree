import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!fd;")
	public static Class103 aClass103_31;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!st;")
	public static final Class314 aClass314_85 = new Class314(42, 3);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!uv;I)Ljava/lang/String;")
	public static String method5065(@OriginalArg(1) Class344 arg0, @OriginalArg(2) int arg1) {
		if (!Static76.method1311(arg0).method8091(arg1) && arg0.anObjectArray23 == null) {
			return null;
		} else if (arg0.aStringArray77 == null || arg0.aStringArray77.length <= arg1 || arg0.aStringArray77[arg1] == null || arg0.aStringArray77[arg1].trim().length() == 0) {
			return Static349.aBoolean768 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray77[arg1];
		}
	}
}
