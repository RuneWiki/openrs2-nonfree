import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!km;II)Lclient!ve;")
	public static Class169 method4228(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2495(arg1, arg2);
		return local5 == null ? null : new Class169(new Class1_Sub11(local5));
	}
}
