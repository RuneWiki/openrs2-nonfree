import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static685 {

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lclient!gda;II)Lclient!fia;")
	public static Class115 method2837(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3086(arg2, arg1);
		return local5 == null ? null : new Class115(new Class5_Sub36(local5));
	}
}
