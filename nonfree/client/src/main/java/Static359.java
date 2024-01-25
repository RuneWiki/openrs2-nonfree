import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!rk;II)Lclient!es;")
	public static Class68 method1607(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4560(arg2, arg1);
		return local5 == null ? null : new Class68(new Class7_Sub3(local5));
	}
}
