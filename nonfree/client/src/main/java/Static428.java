import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static428 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!bd;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIB)B")
	public static byte method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
