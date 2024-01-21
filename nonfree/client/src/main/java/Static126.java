import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pb;II)Lclient!ia;")
	public static Class34 method820(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1062(arg1, 0);
		return local5 == null ? null : new Class34(new Class1_Sub6(local5));
	}
}
