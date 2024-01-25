import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!wn;")
	public static Class269 aClass269_36;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Lclient!mu;")
	public static Class165 aClass165_5;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_74 = new Class194(71, 8);

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "[I")
	public static final int[] anIntArray331 = new int[32];

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)Z")
	public static boolean method3355(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
	public static int method3356(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
