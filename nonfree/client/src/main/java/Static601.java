import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!mv;II)Lclient!mca;")
	public static Class2_Sub31 method4678(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4980(arg1, arg2);
		return local5 == null ? null : new Class2_Sub31(new Class2_Sub7(local5));
	}
}
