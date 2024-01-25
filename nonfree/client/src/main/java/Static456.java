import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!lt;II)Lclient!hq;")
	public static Class109 method2473(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3672(arg2, arg1);
		return local5 == null ? null : new Class109(new Class6_Sub15(local5));
	}
}
