import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static173 {

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1418 = Static177.method3050("glow1:");

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1414 = aClass46_1418;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1415 = Static177.method3050("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	public static int anInt3884 = 2;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1416 = aClass46_1418;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1417 = aClass46_1415;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)Z")
	public static boolean method2988(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[II)I")
	public static int method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		return arg2[1] * arg0 + arg1 * arg2[0];
	}
}
