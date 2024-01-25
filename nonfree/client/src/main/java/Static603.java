import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!sea;II)Lclient!oba;")
	public static Class249 method5368(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method6569(arg1, arg2);
		return local5 == null ? null : new Class249(new Class1_Sub3(local5));
	}
}
