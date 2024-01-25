import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!jn;II)Lclient!tu;")
	public static Class321 method7590(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3994(arg2, arg1);
		return local5 == null ? null : new Class321(new Class4_Sub11(local5));
	}
}
