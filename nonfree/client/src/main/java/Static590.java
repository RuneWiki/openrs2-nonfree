import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!pq;II)Lclient!tq;")
	public static Class309 method6852(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5860(arg1, arg2);
		return local5 == null ? null : new Class309(new Class6_Sub14(local5));
	}
}
