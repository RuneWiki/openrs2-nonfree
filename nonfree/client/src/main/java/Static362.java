import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!tq;II)Lclient!ic;")
	public static Class2_Sub21 method2643(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5459(arg1, arg2);
		return local5 == null ? null : new Class2_Sub21(new Class2_Sub10(local5));
	}
}
