import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!dp;II)Lclient!ao;")
	public static Class12 method221(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1033(arg2, arg1);
		return local5 == null ? null : new Class12(new Class6_Sub10(local5));
	}
}
