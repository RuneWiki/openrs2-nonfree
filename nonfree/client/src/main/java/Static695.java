import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static695 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!rg;II)Lclient!mn;")
	public static Class14_Sub28 method5901(@OriginalArg(0) Class310 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method7803(arg2, arg1);
		return local5 == null ? null : new Class14_Sub28(new Class14_Sub21(local5));
	}
}
