import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!qn;II)Lclient!hr;")
	public static Class4_Sub17 method2248(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4377(arg1, arg2);
		return local5 == null ? null : new Class4_Sub17(new Class4_Sub9(local5));
	}
}
