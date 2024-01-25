import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ui;II)Lclient!mq;")
	public static Class159 method3166(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4985(arg2, arg1);
		return local5 == null ? null : new Class159(new Class1_Sub33(local5));
	}
}
