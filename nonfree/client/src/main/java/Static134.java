import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!q;II)Lclient!nc;")
	public static Class51 method1393(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2008(arg2, arg1);
		return local5 == null ? null : new Class51(new Class1_Sub18(local5));
	}
}
