import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!mo;II)Lclient!ld;")
	public static Class14_Sub21 method3412(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3745(arg1, arg2);
		return local5 == null ? null : new Class14_Sub21(new Class14_Sub4(local5));
	}
}
