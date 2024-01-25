import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static38 {

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_17 = new Class73(64, 17);

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "[I")
	public static final int[] anIntArray44 = new int[4];

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	public static int anInt984 = -2;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z")
	public static boolean method1002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)B")
	public static byte method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
