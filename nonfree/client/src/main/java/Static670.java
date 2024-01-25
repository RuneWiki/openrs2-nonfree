import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!wq", name = "xd", descriptor = "Lclient!ds;")
	public static Class83 aClass83_2;

	@OriginalMember(owner = "client!wq", name = "M", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_338 = new Class196(42, 3);

	@OriginalMember(owner = "client!wq", name = "vd", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_112 = new Class187(3, 16);

	@OriginalMember(owner = "client!wq", name = "yd", descriptor = "D")
	public static double aDouble29 = -1.0D;

	@OriginalMember(owner = "client!wq", name = "zd", descriptor = "[I")
	public static final int[] anIntArray612 = new int[2048];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II[S)[S")
	public static short[] method8729(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static685.method8327(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)Z")
	public static boolean method8733(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
