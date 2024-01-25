import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!pc;II)Lclient!wq;")
	public static Class267 method6066(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4283(arg1, arg2);
		return local5 == null ? null : new Class267(new Class2_Sub20(local5));
	}
}
