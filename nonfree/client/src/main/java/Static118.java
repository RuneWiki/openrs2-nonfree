import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Lclient!pq;")
	public static Class251 aClass251_40;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(II)I")
	public static int method1802(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BC)Z")
	public static boolean method1803(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
