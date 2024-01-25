import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static426 {

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "Lclient!lb;")
	public static Class149 aClass149_2;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	public static int anInt7595;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_150 = new Class92(26, -1);

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	public static int anInt7593 = -1;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
	public static int method6222(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIZI)Z")
	public static boolean method6223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static203.aByteArrayArrayArray11[0][arg1][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static203.aByteArrayArrayArray11[arg2][arg1][arg3] & 0x10) == 0) {
			return arg0 == Static229.method3548(arg2, arg1, arg3);
		} else {
			return false;
		}
	}
}
