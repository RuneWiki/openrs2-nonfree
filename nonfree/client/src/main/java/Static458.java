import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!lt;II)Lclient!tj;")
	public static Class6_Sub37 method5286(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3672(arg2, arg1);
		return local5 == null ? null : new Class6_Sub37(new Class6_Sub15(local5));
	}
}
