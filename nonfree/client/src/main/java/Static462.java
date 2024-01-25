import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!vh;II)Lclient!um;")
	public static Class241 method5504(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5667(arg2, arg1);
		return local5 == null ? null : new Class241(new Class1_Sub1(local5));
	}
}
