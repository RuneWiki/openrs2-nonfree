import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	public static int anInt5789 = 0;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
	public static int anInt5790 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BC)Z")
	public static boolean method4532(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
