import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!nk;II)Lclient!tf;")
	public static Class169 method4205(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3115(arg1, arg2);
		return local5 == null ? null : new Class169(new Class1_Sub14(local5));
	}
}
