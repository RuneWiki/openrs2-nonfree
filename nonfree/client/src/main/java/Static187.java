import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!jg;II)Lclient!sa;")
	public static Class3_Sub21 method2402(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1624(arg1, arg2);
		return local5 == null ? null : new Class3_Sub21(new Class3_Sub4(local5));
	}
}
