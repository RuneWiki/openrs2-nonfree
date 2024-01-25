import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
	public static int anInt3174;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_53 = new Class397(130, 1);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z")
	public static boolean method2902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!nt;IB)Ljava/lang/String;")
	public static String method2903(@OriginalArg(0) Class270 arg0, @OriginalArg(1) int arg1) {
		if (!Static85.method1871(arg0).method6628(arg1) && arg0.anObjectArray30 == null) {
			return null;
		} else if (arg0.aStringArray28 == null || arg0.aStringArray28.length <= arg1 || arg0.aStringArray28[arg1] == null || arg0.aStringArray28[arg1].trim().length() == 0) {
			return Static571.aBoolean583 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray28[arg1];
		}
	}
}
