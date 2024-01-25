import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!tj;II)Lclient!um;")
	public static Class4_Sub43 method5290(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5047(arg1, arg2);
		return local5 == null ? null : new Class4_Sub43(new Class4_Sub11(local5));
	}
}
