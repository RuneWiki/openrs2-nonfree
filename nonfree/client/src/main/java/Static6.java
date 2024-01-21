import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!b", name = "H", descriptor = "Lclient!pd;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Lclient!u;")
	private static Class74 aClass74_122 = Static72.method1077("white:");

	@OriginalMember(owner = "client!b", name = "B", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];

	@OriginalMember(owner = "client!b", name = "D", descriptor = "Lclient!u;")
	public static Class74 aClass74_123 = aClass74_122;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "Lclient!u;")
	public static Class74 aClass74_124 = Static72.method1077("p11_full");

	@OriginalMember(owner = "client!b", name = "G", descriptor = "Lclient!u;")
	public static Class74 aClass74_125 = aClass74_122;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "Lclient!u;")
	public static Class74 aClass74_126 = Static72.method1077("Offline");

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void method111() {
		aClass74_126 = null;
		aClass74_125 = null;
		aClass74_124 = null;
		aClass74_122 = null;
		aClass62_1 = null;
		aClass74_123 = null;
		aLongArray2 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)I")
	public static int method112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)Z")
	public static boolean method113(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static57.anIntArray159[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 13;
	}
}
