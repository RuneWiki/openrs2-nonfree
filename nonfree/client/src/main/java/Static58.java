import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!co", name = "U", descriptor = "Lclient!nv;")
	public static Class183 aClass183_2;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_30 = new Class158("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!co", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!co", name = "y", descriptor = "[I")
	public static final int[] anIntArray136 = new int[4];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZ)Lclient!vj;")
	public static Class257 method1083(@OriginalArg(0) int arg0) {
		@Pc(10) Class257 local10 = (Class257) Static37.aClass91_8.method1988((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static14.aClass211_7.method4758(arg0, 0);
		local10 = new Class257();
		if (local20 != null) {
			local10.method5769(new Class1_Sub3(local20));
		}
		local10.method5766();
		Static37.aClass91_8.method1990(local10, (long) arg0);
		return local10;
	}
}
