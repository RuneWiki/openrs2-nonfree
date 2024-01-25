import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!b;")
	public static Class20 aClass20_56;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!b;")
	public static Class20 aClass20_57;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_59 = new Class244(3, -1);

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public static int anInt4420 = -1;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	public static int anInt4422 = 0;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public static int anInt4423 = -1;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(CI)Z")
	public static boolean method4034(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
