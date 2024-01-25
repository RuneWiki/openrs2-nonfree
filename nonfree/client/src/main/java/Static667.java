import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static667 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBI)V")
	public static void method8903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1004) {
			Static237.method3386(Static522.aClass268_31, arg0, arg1);
		} else if (arg2 == 1009) {
			Static237.method3386(Static587.aClass268_38, arg0, arg1);
		} else if (arg2 == 1002) {
			Static237.method3386(Static560.aClass268_36, arg0, arg1);
		} else if (arg2 == 1001) {
			Static237.method3386(Static139.aClass268_44, arg0, arg1);
		} else if (arg2 == 1006) {
			Static237.method3386(Static608.aClass268_39, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z")
	public static boolean method8904() {
		return Static678.method8984("jaclib") ? Static678.method8984("hw3d") : false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!s;)V")
	public static void method8905(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1) {
		Static140.aClass42Array4[arg0] = arg1;
	}
}
