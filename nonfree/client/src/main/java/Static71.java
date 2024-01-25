import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!df", name = "g", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt3034 = 0;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "I")
	public static int anInt3035 = 1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!uq;)Lclient!uq;")
	public static Class251 method2636(@OriginalArg(1) Class251 arg0) {
		if (arg0.anInt6722 != -1) {
			return Static378.method3544(arg0.anInt6722);
		}
		@Pc(17) int local17 = arg0.anInt6689 >>> 16;
		@Pc(22) Class163 local22 = new Class163(Static101.aClass96_16);
		for (@Pc(27) Class1_Sub23 local27 = (Class1_Sub23) local22.method3765(); local27 != null; local27 = (Class1_Sub23) local22.method3759()) {
			if (local27.anInt3059 == local17) {
				return Static378.method3544((int) local27.aLong222);
			}
		}
		return null;
	}
}
