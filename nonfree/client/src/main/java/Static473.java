import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!oi;II)Lclient!p;")
	public static Class194 method4118(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4002(arg1, arg2);
		return local5 == null ? null : new Class194(new Class1_Sub19(local5));
	}
}
