import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static694 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!lga;II)Lclient!jk;")
	public static Class6_Sub27 method4713(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5267(arg2, arg1);
		return local5 == null ? null : new Class6_Sub27(new Class6_Sub15(local5));
	}
}
