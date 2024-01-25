import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!na", name = "Vb", descriptor = "Lclient!pj;")
	public static Class248 aClass248_53;

	@OriginalMember(owner = "client!na", name = "Bb", descriptor = "[B")
	public static final byte[] aByteArray82 = new byte[520];

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([BII)[B")
	public static byte[] method5109(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static596.method7719(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
