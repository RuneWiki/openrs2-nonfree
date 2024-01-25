import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!rk;II)Lclient!ud;")
	public static Class7_Sub38 method5112(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4560(arg2, arg1);
		return local5 == null ? null : new Class7_Sub38(new Class7_Sub3(local5));
	}
}
