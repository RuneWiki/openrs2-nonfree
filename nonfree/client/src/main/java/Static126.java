import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!sd;II)Lclient!gf;")
	public static Class5_Sub8 method785(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method733(arg2, arg1);
		return local5 == null ? null : new Class5_Sub8(new Class5_Sub9(local5));
	}
}
