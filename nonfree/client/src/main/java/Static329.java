import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Lclient!bi;")
	public static Class31 aClass31_70;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!bi;III)Lclient!pf;")
	public static Class266 method4945(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = arg0.method667(arg1, 0);
		return local14 == null ? null : new Class266(local14);
	}
}
