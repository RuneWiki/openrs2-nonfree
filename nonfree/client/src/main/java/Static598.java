import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!tf;II)Lclient!caa;")
	public static Class43 method996(@OriginalArg(0) Class322 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6802(arg1, arg2);
		return local5 == null ? null : new Class43(new Class3_Sub11(local5));
	}
}
