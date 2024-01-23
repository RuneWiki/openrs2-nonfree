import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!jd;II)Lclient!rl;")
	public static Class2_Sub24 method3882(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2127(arg2, arg1);
		return local5 == null ? null : new Class2_Sub24(new Class2_Sub26(local5));
	}
}
