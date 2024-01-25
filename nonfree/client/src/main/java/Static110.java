import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "J")
	public static long aLong61 = 0L;

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method1958(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIII)I")
	public static int method1959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
