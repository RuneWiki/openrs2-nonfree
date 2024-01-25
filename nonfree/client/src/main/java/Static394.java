import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static394 {

	@OriginalMember(owner = "client!pi", name = "Rc", descriptor = "F")
	public static float aFloat173;

	@OriginalMember(owner = "client!pi", name = "hd", descriptor = "Lclient!jo;")
	public static Class168 aClass168_92;

	@OriginalMember(owner = "client!pi", name = "jd", descriptor = "J")
	public static long aLong167 = 20000000L;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)Z")
	public static boolean method6227(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 47 || arg0 == 59 || arg0 == 11 || arg0 == 51) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1004;
		}
	}
}
