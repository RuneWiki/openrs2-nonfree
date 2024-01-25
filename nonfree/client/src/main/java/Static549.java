import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!kr;II)Lclient!gf;")
	public static Class1_Sub21 method2481(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4339(arg1, arg2);
		return local5 == null ? null : new Class1_Sub21(new Class1_Sub6(local5));
	}
}
