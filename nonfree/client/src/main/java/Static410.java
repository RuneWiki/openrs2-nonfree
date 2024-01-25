import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static410 {

	@OriginalMember(owner = "client!os", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!os", name = "n", descriptor = "[Lclient!vh;")
	public static final Class363[] aClass363Array1 = new Class363[37];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method6311(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static241.method4011(arg0, arg1) : Integer.toString(arg0);
	}
}
