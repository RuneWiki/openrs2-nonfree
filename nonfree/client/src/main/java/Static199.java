import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!pe;II)Lclient!eg;")
	public static Class23 method1101(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method521(arg2, arg1);
		return local5 == null ? null : new Class23(new Class2_Sub3(local5));
	}
}
