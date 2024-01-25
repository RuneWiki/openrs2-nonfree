import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	public static int anInt5463;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!l;")
	public static Class95 aClass95_18;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
	public static int anInt5464 = 0;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_205 = new Class56(73, 6);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V")
	public static void method4428(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static182.anInt3346 != -1) {
				Static107.method1600(Static182.anInt3346);
			}
			for (@Pc(23) Class4_Sub8 local23 = (Class4_Sub8) Static449.aClass67_37.method1428(); local23 != null; local23 = (Class4_Sub8) Static449.aClass67_37.method1424()) {
				if (!local23.method6060()) {
					local23 = (Class4_Sub8) Static449.aClass67_37.method1428();
					if (local23 == null) {
						break;
					}
				}
				Static242.method3223(local23, true, false);
			}
			Static182.anInt3346 = -1;
			Static449.aClass67_37 = new Class67(8);
			Static129.method1849();
			Static182.anInt3346 = Static40.anInt665;
			Static31.method434(false);
			Static194.method5772();
			Static80.method1283(Static182.anInt3346);
		}
		Static261.aBoolean316 = true;
	}
}
