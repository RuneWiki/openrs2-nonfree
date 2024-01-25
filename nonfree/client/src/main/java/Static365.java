import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!tj;II)Lclient!or;")
	public static Class152 method4183(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5047(arg1, arg2);
		return local5 == null ? null : new Class152(new Class4_Sub11(local5));
	}
}
