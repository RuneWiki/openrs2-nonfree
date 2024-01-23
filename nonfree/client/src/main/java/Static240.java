import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!pa;II)Lclient!lk;")
	public static Class71 method2006(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3325(arg1, arg2);
		return local5 == null ? null : new Class71(new Class1_Sub17(local5));
	}
}
