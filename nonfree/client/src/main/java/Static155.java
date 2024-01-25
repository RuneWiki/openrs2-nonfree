import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!fda", name = "v", descriptor = "Lclient!in;")
	public static final Class169 aClass169_79 = new Class169(86, 7);

	@OriginalMember(owner = "client!fda", name = "y", descriptor = "I")
	public static int anInt3411 = 500;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)Z")
	public static boolean method3183(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(II)J")
	public static long method3184(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
