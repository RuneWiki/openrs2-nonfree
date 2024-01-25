import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!mn;II)Lclient!hn;")
	public static Class2_Sub15 method2355(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3658(arg1, arg2);
		return local5 == null ? null : new Class2_Sub15(new Class2_Sub17(local5));
	}
}
