import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!vd;II)Lclient!bl;")
	public static Class6_Sub5 method869(@OriginalArg(0) Class353 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method8404(arg1, arg2);
		return local5 == null ? null : new Class6_Sub5(new Class6_Sub40(local5));
	}
}
