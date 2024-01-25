import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "Lclient!rg;")
	public static Class27 aClass27_13;

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
	public static int anInt4146;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "Lclient!lc;")
	public static final Class136 aClass136_5 = new Class136("", 13);

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_57 = new Class183(40, -1);

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
	public static int anInt4144 = 0;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)I")
	public static int method3687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static129.method2253(arg1 - 1, arg0 + -1) + Static129.method2253(arg1 + 1, arg0 + -1) + Static129.method2253(arg1 - 1, arg0 - -1) + Static129.method2253(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static129.method2253(arg1 - 1, arg0) + Static129.method2253(arg1 + 1, arg0) + Static129.method2253(arg1, arg0 - 1) + Static129.method2253(arg1, arg0 + 1);
		@Pc(81) int local81 = Static129.method2253(arg1, arg0);
		return local81 / 4 + local46 / 16 + local76 / 8;
	}
}
