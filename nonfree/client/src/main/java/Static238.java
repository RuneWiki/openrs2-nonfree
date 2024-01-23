import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mb;II)Lclient!qa;")
	public static Class91 method2725(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3509(arg2, arg1);
		return local5 == null ? null : new Class91(new Class1_Sub16(local5));
	}
}
