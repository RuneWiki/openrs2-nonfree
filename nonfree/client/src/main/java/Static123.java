import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
	public static int anInt2360 = 0;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "J")
	public static long aLong74 = -1L;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_69 = new Class77(8, 4);

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
	public static int anInt2363 = 0;

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)I")
	public static int method2247(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
