import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
	public static int[] anIntArray348;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
	public static boolean aBoolean455 = false;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_165 = new Class189(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)Lclient!op;")
	public static Class182 method4035(@OriginalArg(0) int arg0) {
		@Pc(6) Class182[] local6 = Static174.method2793();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(17) Class182 local17 = local6[local8];
			if (local17.anInt5274 == arg0) {
				return local17;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Z")
	public static boolean method4036(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
