import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!he;II)Lclient!je;")
	public static Class127 method3004(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2520(arg2, arg1);
		return local5 == null ? null : new Class127(new Class6_Sub1(local5));
	}
}
