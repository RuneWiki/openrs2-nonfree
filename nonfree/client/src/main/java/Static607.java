import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!om;II)Lclient!wc;")
	public static Class358 method7640(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5653(arg1, arg2);
		return local5 == null ? null : new Class358(new Class3_Sub11(local5));
	}
}
