import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!pd;II)Lclient!pe;")
	public static Class62 method1653(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method474(arg1, arg2);
		return local5 == null ? null : new Class62(new Class4_Sub16(local5));
	}
}
