import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
	public static int anInt2616;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "Lclient!tc;")
	public static Class305 aClass305_5;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
	public static int anInt2623 = -1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!tc;)Ljava/lang/String;")
	public static String method2314(@OriginalArg(0) int arg0, @OriginalArg(2) Class305 arg1) {
		if (!Static68.method1694(arg1).method1758(arg0) && arg1.anObjectArray15 == null) {
			return null;
		} else if (arg1.aStringArray32 == null || arg0 >= arg1.aStringArray32.length || arg1.aStringArray32[arg0] == null || arg1.aStringArray32[arg0].trim().length() == 0) {
			return Static230.aBoolean352 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray32[arg0];
		}
	}
}
