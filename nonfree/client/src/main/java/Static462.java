import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!mg;II)Lclient!ne;")
	public static Class2_Sub27 method3893(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3696(arg2, arg1);
		return local5 == null ? null : new Class2_Sub27(new Class2_Sub23(local5));
	}
}
