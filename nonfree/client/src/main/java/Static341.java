import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!km", name = "H", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_106 = new Class186(70, 4);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(CI)Z")
	public static boolean method5020(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
