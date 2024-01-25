import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_224 = new Class305(73, 0);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4200(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static556.method7044(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
