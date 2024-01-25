import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ph;II)Lclient!ve;")
	public static Class10_Sub43 method5642(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4300(arg1, arg2);
		return local5 == null ? null : new Class10_Sub43(new Class10_Sub8(local5));
	}
}
