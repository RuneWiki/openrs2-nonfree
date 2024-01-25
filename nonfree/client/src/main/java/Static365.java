import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!nq;II)Lclient!ii;")
	public static Class102 method1992(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3896(arg2, arg1);
		return local5 == null ? null : new Class102(new Class11_Sub25(local5));
	}
}
