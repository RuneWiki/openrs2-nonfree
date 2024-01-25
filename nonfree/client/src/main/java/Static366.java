import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!dp;II)Lclient!ms;")
	public static Class6_Sub27 method3651(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1033(arg2, arg1);
		return local5 == null ? null : new Class6_Sub27(new Class6_Sub10(local5));
	}
}
