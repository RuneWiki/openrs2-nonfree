import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!r;II)Lclient!wk;", line = 96)
	public static Class247 method6436(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5090(arg2, arg1);
		return local5 == null ? null : new Class247(new Class2_Sub4(local5));
	}
}
