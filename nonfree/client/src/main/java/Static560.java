import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!kea;II)Lclient!qh;")
	public static Class3_Sub39 method6028(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4243(arg2, arg1);
		return local5 == null ? null : new Class3_Sub39(new Class3_Sub27(local5));
	}
}
