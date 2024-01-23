import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!rn;II)Lclient!ej;")
	public static Class45 method1046(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4121(arg1, arg2);
		return local5 == null ? null : new Class45(new Class3_Sub26(local5));
	}
}
