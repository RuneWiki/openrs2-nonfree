import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!jc;II)Lclient!j;")
	public static Class38 method1411(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1771(arg1, arg2);
		return local5 == null ? null : new Class38(new Class2_Sub2(local5));
	}
}
