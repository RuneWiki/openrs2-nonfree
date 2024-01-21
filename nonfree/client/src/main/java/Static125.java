import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!nb;II)Lclient!od;")
	public static Class50 method1284(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method679(arg1, 0);
		return local5 == null ? null : new Class50(new Class5_Sub11(local5));
	}
}
