import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static688 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!gj;II)Lclient!sh;")
	public static Class3_Sub48 method7521(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3125(arg2, arg1);
		return local5 == null ? null : new Class3_Sub48(new Class3_Sub17(local5));
	}
}
