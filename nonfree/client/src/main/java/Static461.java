import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ok;II)Lclient!bf;")
	public static Class23 method295(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3838(arg2, arg1);
		return local5 == null ? null : new Class23(new Class7_Sub14(local5));
	}
}
