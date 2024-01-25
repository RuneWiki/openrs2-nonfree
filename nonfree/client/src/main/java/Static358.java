import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!nq;II)Lclient!ar;")
	public static Class11_Sub3 method200(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3896(arg2, arg1);
		return local5 == null ? null : new Class11_Sub3(new Class11_Sub25(local5));
	}
}
