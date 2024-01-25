import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!gp;II)Lclient!mn;")
	public static Class200 method5070(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2962(arg2, arg1);
		return local5 == null ? null : new Class200(new Class5_Sub3(local5));
	}
}
