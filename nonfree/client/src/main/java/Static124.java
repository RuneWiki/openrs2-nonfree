import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[Lclient!f;")
	public static Class23_Sub5[] aClass23_Sub5Array1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(CI)Z")
	public static boolean method2202(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
