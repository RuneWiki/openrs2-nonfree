import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ek;II)Lclient!tb;")
	public static Class2_Sub27 method4188(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1256(arg1, arg2);
		return local5 == null ? null : new Class2_Sub27(new Class2_Sub16(local5));
	}
}
