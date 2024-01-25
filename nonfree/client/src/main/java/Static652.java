import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!la;II)Lclient!oba;")
	public static Class3_Sub39 method6337(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5102(arg1, arg2);
		return local5 == null ? null : new Class3_Sub39(new Class3_Sub3(local5));
	}
}
