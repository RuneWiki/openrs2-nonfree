import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!wo;II)Lclient!gl;")
	public static Class77 method2070(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5648(arg1, arg2);
		return local5 == null ? null : new Class77(new Class1_Sub8(local5));
	}
}
