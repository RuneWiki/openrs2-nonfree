import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static420 {

	@OriginalMember(owner = "client!us", name = "K", descriptor = "Lclient!nq;")
	public static Class175 aClass175_2;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(III)B")
	public static byte method1206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
