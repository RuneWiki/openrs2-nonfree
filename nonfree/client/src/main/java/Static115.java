import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!du", name = "O", descriptor = "I")
	public static int anInt2455 = 0;

	@OriginalMember(owner = "client!du", name = "ib", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_50 = new Class200(42, 1);

	@OriginalMember(owner = "client!du", name = "jb", descriptor = "I")
	public static int anInt2472 = -1;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method2081(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static650.method2274(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
