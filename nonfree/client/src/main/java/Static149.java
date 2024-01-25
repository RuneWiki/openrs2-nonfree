import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hg", name = "ab", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "[I")
	public static final int[] anIntArray174 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "[I")
	public static final int[] anIntArray175 = new int[4096];

	@OriginalMember(owner = "client!hg", name = "Z", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_79 = new Class12(40, 1);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!fo;I)Lclient!pq;")
	public static Class193 method2219(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(9) byte[] local9 = arg1.method1817(arg0, 0);
		return local9 == null ? null : new Class193(local9);
	}
}
