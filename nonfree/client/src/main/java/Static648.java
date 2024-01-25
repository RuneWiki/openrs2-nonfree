import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ni;II)Lclient!cl;")
	public static Class51 method2092(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5954(arg2, arg1);
		return local5 == null ? null : new Class51(new Class6_Sub8(local5));
	}
}
