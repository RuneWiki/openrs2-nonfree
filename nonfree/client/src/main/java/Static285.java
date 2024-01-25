import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!vu;")
	public static final Class363 aClass363_42 = new Class363();

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	public static int anInt7798 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)I")
	public static int method6790(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dc;I)Lclient!ao;")
	public static Class18_Sub1 method6793(@OriginalArg(0) Class3_Sub9 arg0) {
		return new Class18_Sub1(arg0.method5624(), arg0.method5624(), arg0.method5624(), arg0.method5624(), arg0.method5604(), arg0.method5633());
	}
}
