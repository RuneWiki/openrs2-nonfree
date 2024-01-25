import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!kb;")
	public static final Class133 aClass133_2 = new Class133(1);

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_141 = new Class102(25, -1);

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)B")
	public static byte method3787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
