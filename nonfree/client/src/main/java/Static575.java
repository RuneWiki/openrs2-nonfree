import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[8];

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[32];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZ)Lclient!wca;")
	public static Class41_Sub9 method7722(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static302.anInt5115 == Static265.anInt4662) {
			return new Class41_Sub9(arg0, arg1);
		} else {
			@Pc(6) Class41_Sub9 local6 = Static151.aClass41_Sub9Array1[Static265.anInt4662];
			Static265.anInt4662 = Static265.anInt4662 + 1 & Static555.anIntArray579[Static411.anInt7039];
			local6.method7729(arg0, arg1);
			return local6;
		}
	}
}
