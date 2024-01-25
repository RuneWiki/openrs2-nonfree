import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!jk", name = "A", descriptor = "Lclient!gj;")
	public static Class143 aClass143_77;

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_72 = new Class376(52, 8);

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "Lclient!mo;")
	public static final Class239 aClass239_8 = new Class239("", 15);

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "[Lclient!qj;")
	public static final Class3_Sub44[] aClass3_Sub44Array1 = new Class3_Sub44[300];

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(CI)Z")
	public static boolean method4504(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
