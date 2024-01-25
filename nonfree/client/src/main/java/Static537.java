import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static537 {

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "Lclient!sc;")
	public static Class281 aClass281_3;

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "Lclient!bd;")
	public static final Class27 aClass27_6 = new Class27();

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(CB)Z")
	public static boolean method7762(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
