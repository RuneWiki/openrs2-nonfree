import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!wm;")
	public static Class390 aClass390_79;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[Lclient!s;")
	public static Class109[] aClass109Array3;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)Z")
	public static boolean method4954(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!tn;)I")
	public static int method4956(@OriginalArg(1) Class339 arg0) {
		if (Static626.aClass339_16 == arg0) {
			return 6407;
		} else if (Static435.aClass339_15 == arg0) {
			return 6408;
		} else if (arg0 == Static67.aClass339_4) {
			return 6406;
		} else if (Static115.aClass339_5 == arg0) {
			return 6409;
		} else if (Static676.aClass339_17 == arg0) {
			return 6410;
		} else if (arg0 == Static241.aClass339_6) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
