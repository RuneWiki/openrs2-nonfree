import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!jd;II)Lclient!rb;")
	public static Class56 method1668(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1761(arg1, 0);
		return local5 == null ? null : new Class56(new Class2_Sub5(local5));
	}
}
