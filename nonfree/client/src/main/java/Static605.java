import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!pfa;II)Lclient!id;")
	public static Class141 method3635(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5772(arg2, arg1);
		return local5 == null ? null : new Class141(new Class6_Sub21(local5));
	}
}
