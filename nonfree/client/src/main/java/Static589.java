import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static589 {

	@OriginalMember(owner = "client!vaa", name = "I", descriptor = "I")
	public static int anInt10431;

	@OriginalMember(owner = "client!vaa", name = "K", descriptor = "Lclient!ec;")
	public static final Class86 aClass86_11 = new Class86();

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(CI)Z")
	public static boolean method8710(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
