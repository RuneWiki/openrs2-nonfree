import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ga;II)Lclient!jq;")
	public static Class176 method4024(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2441(arg2, arg1);
		return local5 == null ? null : new Class176(new Class1_Sub20(local5));
	}
}
