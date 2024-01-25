import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!vb;")
	public static Class371 aClass371_14;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!nu;")
	public static final Class74 aClass74_5 = Static495.method297();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
	public static boolean aBoolean749 = true;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I")
	public static int method8842(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
