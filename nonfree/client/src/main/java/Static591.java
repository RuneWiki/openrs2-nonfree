import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!pq;II)Lclient!ts;")
	public static Class6_Sub46 method6872(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5860(arg1, arg2);
		return local5 == null ? null : new Class6_Sub46(new Class6_Sub14(local5));
	}
}
