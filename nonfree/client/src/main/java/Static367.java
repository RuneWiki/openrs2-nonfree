import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!tq;II)Lclient!ne;")
	public static Class134 method3758(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5459(arg1, arg2);
		return local5 == null ? null : new Class134(new Class2_Sub10(local5));
	}
}
