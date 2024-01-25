import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!fo;II)Lclient!m;")
	public static Class1_Sub31 method3480(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1817(arg1, arg2);
		return local5 == null ? null : new Class1_Sub31(new Class1_Sub28(local5));
	}
}
