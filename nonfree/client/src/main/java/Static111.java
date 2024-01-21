import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!he;II)Lclient!lb;")
	public static Class36 method827(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method203(arg1, 0);
		return local5 == null ? null : new Class36(new Class10_Sub10(local5));
	}
}
