import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lclient!tu;")
	public static Class324 aClass324_1;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_10 = new Class342(7, 0, 1, 1);

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "[I")
	public static final int[] anIntArray447 = new int[1];

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!oa;Lclient!vi;B)I")
	public static int method5247(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class345 arg1) {
		if (arg1.anInt9270 != -1) {
			return arg1.anInt9270;
		}
		if (arg1.anInt9268 != -1) {
			@Pc(28) Class313 local28 = arg0.anInterface4_15.method4234(arg0.method6876() ? arg1.anInt9268 : arg1.anInt9269);
			if (!local28.aBoolean593) {
				return local28.aShort105;
			}
		}
		return arg1.anInt9279;
	}
}
