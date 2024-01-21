import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!dd;II)Lclient!cg;")
	public static Class12 method383(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2254(arg2, arg1);
		return local5 == null ? null : new Class12(new Class1_Sub6(local5));
	}
}
