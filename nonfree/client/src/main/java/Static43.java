import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
	public static int anInt969;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
	public static int anInt967 = 0;

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_9 = new Class269(46, 3);

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method860(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static649.method4863(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
