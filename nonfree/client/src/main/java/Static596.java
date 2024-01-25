import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!mv;II)Lclient!fb;")
	public static Class100 method1807(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4980(arg1, arg2);
		return local5 == null ? null : new Class100(new Class2_Sub7(local5));
	}
}
