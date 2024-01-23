import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ek;II)Lclient!u;")
	public static Class173 method4332(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1256(arg1, arg2);
		return local5 == null ? null : new Class173(new Class2_Sub16(local5));
	}
}
