import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!fd;II)Lclient!rf;")
	public static Class66 method1806(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1931(arg2, arg1);
		return local5 == null ? null : new Class66(new Class2_Sub9(local5));
	}
}
