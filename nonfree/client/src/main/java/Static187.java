import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!u;II)Lclient!lf;")
	public static Class47 method2174(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3316(arg2, arg1);
		return local5 == null ? null : new Class47(new Class1_Sub9(local5));
	}
}
