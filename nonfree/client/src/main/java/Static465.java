import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!um;II)Lclient!gm;")
	public static Class90 method1968(@OriginalArg(0) Class243 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5455(arg2, arg1);
		return local5 == null ? null : new Class90(new Class5_Sub15(local5));
	}
}
