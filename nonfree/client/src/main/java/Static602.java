import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!om;II)Lclient!mc;")
	public static Class3_Sub32 method4960(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5653(arg1, arg2);
		return local5 == null ? null : new Class3_Sub32(new Class3_Sub11(local5));
	}
}
