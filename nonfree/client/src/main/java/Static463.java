import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ic;II)Lclient!ur;")
	public static Class1_Sub43 method5186(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2274(arg1, arg2);
		return local5 == null ? null : new Class1_Sub43(new Class1_Sub11(local5));
	}
}
