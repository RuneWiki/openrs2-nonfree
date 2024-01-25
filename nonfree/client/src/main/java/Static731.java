import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static731 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!lb;II)Lclient!pr;")
	public static Class292 method7197(@OriginalArg(0) Class221 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5089(arg2, arg1);
		return local5 == null ? null : new Class292(new Class3_Sub28(local5));
	}
}
