import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static572 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_207 = new Class200(67, 1);

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Z")
	public static boolean method7950(@OriginalArg(0) int arg0) {
		if (arg0 == 46 || arg0 == 59 || arg0 == 9 || arg0 == 47 || arg0 == 8) {
			return true;
		} else {
			return arg0 == 15 || arg0 == 1009;
		}
	}
}
