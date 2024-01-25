import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static687 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bt;II)Lclient!tb;")
	public static Class341 method7487(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1239(arg1, arg2);
		return local5 == null ? null : new Class341(new Class4_Sub11(local5));
	}
}
