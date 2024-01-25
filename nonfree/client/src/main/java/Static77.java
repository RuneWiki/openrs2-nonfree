import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static77 {

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[128][128];

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_44 = new Class12(28, 4);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!jk;B)Ljava/lang/String;")
	public static String method1272(@OriginalArg(0) Class124 arg0) {
		if (Static55.method970(arg0).method2820() == 0) {
			return null;
		} else if (arg0.aString44 == null || arg0.aString44.trim().length() == 0) {
			return Static239.aBoolean665 ? "Hidden-use" : null;
		} else {
			return arg0.aString44;
		}
	}
}
