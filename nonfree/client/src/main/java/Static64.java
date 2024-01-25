import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "[S")
	public static short[] aShortArray43;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)V")
	public static void method1479() {
		Static257.aClass119_160.method3315(5);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B[S)[S")
	public static short[] method1480(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static359.method690(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
