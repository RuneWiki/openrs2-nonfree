import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static681 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!gj;II)Lclient!bh;")
	public static Class36 method1237(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3125(arg2, arg1);
		return local5 == null ? null : new Class36(new Class3_Sub17(local5));
	}
}
