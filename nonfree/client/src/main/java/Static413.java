import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_243 = new Class123(90, 6);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI[BI)[B")
	public static byte[] method5789(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static604.method6225(arg0, arg1, local11, 0, 32768);
		return local11;
	}
}
