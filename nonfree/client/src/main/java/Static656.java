import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!vd;II)Lclient!pn;")
	public static Class258 method6812(@OriginalArg(0) Class353 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8404(arg1, arg2);
		return local5 == null ? null : new Class258(new Class6_Sub40(local5));
	}
}
