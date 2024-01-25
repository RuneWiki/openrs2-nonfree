import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!cc;")
	public static final Class45 aClass45_4 = new Class45("LIVE", 0);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z")
	public static boolean method2476(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
