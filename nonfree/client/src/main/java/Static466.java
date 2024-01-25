import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!ok;II)Lclient!pu;")
	public static Class7_Sub36 method4116(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3838(arg2, arg1);
		return local5 == null ? null : new Class7_Sub36(new Class7_Sub14(local5));
	}
}
