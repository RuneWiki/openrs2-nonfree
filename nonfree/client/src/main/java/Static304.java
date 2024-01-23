import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!lc;II)Lclient!kb;")
	public static Class4_Sub18 method2171(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2396(arg2, arg1);
		return local5 == null ? null : new Class4_Sub18(new Class4_Sub17(local5));
	}
}
