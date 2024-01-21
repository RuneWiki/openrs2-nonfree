import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ea;II)Lclient!re;")
	public static Class65 method1716(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method597(arg1, arg2);
		return local5 == null ? null : new Class65(new Class4_Sub11(local5));
	}
}
