import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ns;II)Lclient!cl;")
	public static Class4_Sub7 method1079(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3696(arg2, arg1);
		return local5 == null ? null : new Class4_Sub7(new Class4_Sub30(local5));
	}
}
