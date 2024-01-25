import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_61 = new Class265(101, 0);

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	public static int anInt3171 = 0;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IC)Z")
	public static boolean method2548(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
