import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!de;")
	public static Class42 aClass42_4;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "J")
	public static long aLong64 = 0L;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString52 = "Loaded wordpack";

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I")
	public static int method1272() {
		return 2;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)I")
	public static int method1273(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIII)I")
	public static int method1276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}
