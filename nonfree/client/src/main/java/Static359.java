import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!qj;II)Lclient!hi;")
	public static Class81 method2199(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4508(arg2, arg1);
		return local5 == null ? null : new Class81(new Class1_Sub7(local5));
	}
}
