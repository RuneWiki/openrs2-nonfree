import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!be", name = "K", descriptor = "I")
	public static int anInt442;

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!be", name = "T", descriptor = "Lclient!vj;")
	public static Class58 aClass58_3;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_18 = new Class198(200);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I")
	public static int method376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static189.method3601(arg1 - 1, arg0 + -1) + Static189.method3601(arg1 - 1, arg0 - -1) + Static189.method3601(arg1 + 1, arg0 + -1) + Static189.method3601(arg1 + 1, arg0 + 1);
		@Pc(77) int local77 = Static189.method3601(arg1, arg0 - 1) + Static189.method3601(arg1, arg0 + 1) + Static189.method3601(arg1 - 1, arg0) + Static189.method3601(arg1 + 1, arg0);
		@Pc(82) int local82 = Static189.method3601(arg1, arg0);
		return local82 / 4 + local77 / 8 + local46 / 16;
	}
}
