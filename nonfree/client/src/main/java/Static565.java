import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static565 {

	@OriginalMember(owner = "client!uda", name = "K", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
	public static int anInt9337 = 0;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)V")
	public static void method7810(@OriginalArg(0) int arg0) {
		Static382.anIntArray457 = new int[arg0];
		Static118.anIntArray207 = new int[arg0];
		Static386.anIntArray467 = new int[arg0];
		Static611.anIntArray695 = new int[arg0];
		Static498.anIntArray582 = new int[arg0];
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)V")
	public static void method7811() {
		Static391.aClass233_31.method5664(5);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Z")
	public static boolean method7812(@OriginalArg(0) int arg0) {
		if (arg0 == 45 || arg0 == 48 || arg0 == 9 || arg0 == 58 || arg0 == 3) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1002;
		}
	}
}
