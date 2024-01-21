import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!q;II)Lclient!jf;")
	public static Class1_Sub10 method1115(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2008(arg2, arg1);
		return local5 == null ? null : new Class1_Sub10(new Class1_Sub18(local5));
	}
}
