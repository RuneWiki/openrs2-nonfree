import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!lm;II)Lclient!io;")
	public static Class110 method2217(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3009(arg2, arg1);
		return local5 == null ? null : new Class110(new Class1_Sub21(local5));
	}
}
