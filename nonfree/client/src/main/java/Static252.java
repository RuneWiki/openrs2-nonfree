import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
	public static int anInt9487;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "Lclient!ht;")
	public static final Class144 aClass144_2 = new Class144();

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "[[B")
	public static final byte[][] aByteArrayArray29 = new byte[50][];

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[128][128];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[BI)I")
	public static int method7833(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static60.method1382(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ga;IB)Lclient!aga;")
	public static Class13 method7834(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2449(arg1);
		return local8 == null ? null : new Class13(local8);
	}
}
