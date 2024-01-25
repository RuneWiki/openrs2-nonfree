import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!wt;")
	public static Class271 aClass271_10;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!ul;")
	public static Class246 aClass246_209;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	public static int anInt6575;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!uq;)V")
	public static void method5469(@OriginalArg(1) Class251 arg0) {
		if (arg0.anInt6742 == Static27.anInt601) {
			Static71.aBooleanArray25[arg0.anInt6731] = true;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)Z")
	public static boolean method5470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static159.method2576(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static439.method5780(arg1, arg0) | Static157.method3073(arg0, arg1) ? true : (Static428.method5677(arg0, arg1) | Static24.method548(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
