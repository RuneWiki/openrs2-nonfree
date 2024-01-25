import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ni;II)Lclient!cf;")
	public static Class6_Sub12 method2002(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5954(arg2, arg1);
		return local5 == null ? null : new Class6_Sub12(new Class6_Sub8(local5));
	}
}
