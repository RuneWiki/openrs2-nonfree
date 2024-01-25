import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!qn;II)Lclient!cd;")
	public static Class38 method614(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4377(arg1, arg2);
		return local5 == null ? null : new Class38(new Class4_Sub9(local5));
	}
}
