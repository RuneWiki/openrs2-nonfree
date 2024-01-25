import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "Lclient!ga;")
	public static Class111 aClass111_34;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Z")
	public static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)B")
	public static byte method2405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
