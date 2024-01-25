import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_58 = new Class81(85, -1);

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "Lclient!ff;")
	public static Class81 aClass81_59 = null;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
	public static int anInt2705 = -1;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2017(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static459.method3348(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
