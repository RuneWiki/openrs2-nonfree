import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_9 = new Class158(15, 0, 1, 0);

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_118 = new Class322(131, 2);

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Z")
	public static boolean aBoolean503 = false;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_86 = new Class241(9, 16);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method5967(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static695.method5648(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
