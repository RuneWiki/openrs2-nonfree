import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!nd;II)Lclient!gp;")
	public static Class134 method3295(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5567(arg2, arg1);
		return local5 == null ? null : new Class134(new Class2_Sub17(local5));
	}
}
