import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ci;II)Lclient!in;")
	public static Class110 method3025(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1039(arg2, arg1);
		return local5 == null ? null : new Class110(new Class4_Sub20(local5));
	}
}
