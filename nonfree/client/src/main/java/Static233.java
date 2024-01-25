import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static233 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_26 = new Class330(4);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)Z")
	public static boolean method3600(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
