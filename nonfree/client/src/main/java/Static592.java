import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!pj;II)Lclient!jt;")
	public static Class161 method3933(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5797(arg1, arg2);
		return local5 == null ? null : new Class161(new Class6_Sub12(local5));
	}
}
