import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static524 {

	@OriginalMember(owner = "client!ufa", name = "C", descriptor = "Lclient!kh;")
	public static final Class172 aClass172_8 = new Class172();

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IC)Z")
	public static boolean method7200(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
