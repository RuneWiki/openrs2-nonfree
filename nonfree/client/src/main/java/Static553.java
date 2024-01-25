import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!an;II)Lclient!gj;")
	public static Class116 method3274(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method408(arg1, arg2);
		return local5 == null ? null : new Class116(new Class12_Sub8(local5));
	}
}
