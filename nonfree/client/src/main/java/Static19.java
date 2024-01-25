import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Lclient!q;")
	public static Class8 aClass8_2;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!hk;)Z")
	public static boolean method1016(@OriginalArg(1) Class137 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean350) {
			return false;
		} else if (!arg0.method3765(Static461.anInterface15_2)) {
			return false;
		} else if (Static52.aClass305_9.method7447((long) arg0.anInt4333) == null) {
			return Static121.aClass305_16.method7447((long) arg0.anInt4326) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "([FII)[F")
	public static float[] method1019(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static589.method5381(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
