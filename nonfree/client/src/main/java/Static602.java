import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ri;II)Lclient!mc;")
	public static Class199 method4799(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6331(arg1, arg2);
		return local5 == null ? null : new Class199(new Class3_Sub26(local5));
	}
}
