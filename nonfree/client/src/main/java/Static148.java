import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "Lclient!bt;")
	public static Class34 aClass34_35;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	public static int anInt2698;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
	public static int anInt2693 = -1;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_17 = new Class163();

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	public static int anInt2697 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)I")
	public static int method2573(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(III)I")
	public static int method2575(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}
}
