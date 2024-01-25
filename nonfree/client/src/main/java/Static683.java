import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!la;II)Lclient!hp;")
	public static Class5_Sub21 method3367(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4991(arg1, arg2, 115);
		return local5 == null ? null : new Class5_Sub21(new Class5_Sub23(local5));
	}
}
