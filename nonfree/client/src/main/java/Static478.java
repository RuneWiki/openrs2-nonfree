import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static478 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!ofa;")
	public static Class265 aClass265_12 = null;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)B")
	public static byte method6335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
