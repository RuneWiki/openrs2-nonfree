import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bu;II)Lclient!tb;")
	public static Class3_Sub40 method4955(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method785(arg2, arg1);
		return local5 == null ? null : new Class3_Sub40(new Class3_Sub7(local5));
	}
}
