import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!wa;II)Lclient!m;")
	public static Class5_Sub18 method1853(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method738(arg2, arg1);
		return local5 == null ? null : new Class5_Sub18(new Class5_Sub6(local5));
	}
}
