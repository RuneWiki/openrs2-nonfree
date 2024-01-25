import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!fc;II)Lclient!vh;")
	public static Class236 method5537(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1555(arg1, arg2);
		return local5 == null ? null : new Class236(new Class2_Sub13(local5));
	}
}
