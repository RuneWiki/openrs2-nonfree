import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Z")
	public static final boolean aBoolean406 = false;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	public static int anInt5572 = -1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)I")
	public static int method5089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg1;
		@Pc(27) int local27 = arg1 * (arg2 & 0x7F) + (arg0 & 0x7F) * local13 >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * arg1 + local13 * (arg0 & 0x380) >> 7;
		@Pc(61) int local61 = local13 * (arg0 & 0xFC00) + arg1 * (arg2 & 0xFC00) >> 7;
		return local27 & 0x7F | local46 & 0x380 | local61 & 0xFC00;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I")
	public static int method5090(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method5091(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static62.method1300(arg1, arg0) : Integer.toString(arg0);
	}
}
