import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!fs;II)Lclient!um;")
	public static Class241 method5244(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2104(arg2, arg1);
		return local5 == null ? null : new Class241(new Class4_Sub12(local5));
	}
}
