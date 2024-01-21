import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "J")
	public static long aLong107;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "Lclient!pb;")
	public static Class71 aClass71_32;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!hh;")
	public static Class42 aClass42_4;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1204 = Static151.method2243("");

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1205 = Static151.method2243("wave2:");

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1206 = aClass62_1205;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1207 = Static151.method2243("rect_debug=");

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1208 = aClass62_1205;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1209 = Static151.method2243("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)I")
	public static int method2350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!pb;ILclient!pb;)V")
	public static void method2353(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class71 arg1) {
		aClass71_32 = arg1;
		Static74.aClass71_15 = arg0;
	}
}
