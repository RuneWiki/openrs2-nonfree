import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
	public static int anInt3464 = -1;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_111 = new Class123(30, -1);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[S)[S")
	public static short[] method2825(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static604.method6226(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
