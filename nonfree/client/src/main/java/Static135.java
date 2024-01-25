import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static135 {

	@OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
	public static int anInt2653;

	@OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
	public static int anInt2654;

	@OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BC)Z")
	public static boolean method1967(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
