import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!ria", name = "w", descriptor = "Lclient!fa;")
	public static Class107 aClass107_2;

	@OriginalMember(owner = "client!ria", name = "r", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_79 = new Class187(80, 2);

	@OriginalMember(owner = "client!ria", name = "s", descriptor = "[Lclient!jw;")
	public static final Class5_Sub3[] aClass5_Sub3Array5 = new Class5_Sub3[8];

	@OriginalMember(owner = "client!ria", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray69 = new int[128][128];

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method7310(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return Static159.method2400(arg1, local18);
		} else if (arg0 instanceof Class35) {
			@Pc(32) Class35 local32 = (Class35) arg0;
			return local32.method573(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7311(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static685.method8328(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
