import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static699 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!lga;II)Lclient!wi;")
	public static Class393 method8920(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5267(arg2, arg1);
		return local5 == null ? null : new Class393(new Class6_Sub15(local5));
	}
}
