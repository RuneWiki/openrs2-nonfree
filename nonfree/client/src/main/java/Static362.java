import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!am;II)Lclient!ki;")
	public static Class112 method3033(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method288(arg2, arg1);
		return local5 == null ? null : new Class112(new Class4_Sub7(local5));
	}
}
