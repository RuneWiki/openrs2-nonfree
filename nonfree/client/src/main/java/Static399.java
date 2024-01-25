import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!fc;II)Lclient!mi;")
	public static Class2_Sub25 method3674(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1555(arg1, arg2);
		return local5 == null ? null : new Class2_Sub25(new Class2_Sub13(local5));
	}
}
