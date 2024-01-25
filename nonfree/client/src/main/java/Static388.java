import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static388 {

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	public static int anInt4032;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	public static int anInt4033 = 0;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public static void method3687() {
		Static222.anIntArray502 = null;
		Static193.anIntArray807 = null;
		Static366.anIntArray778 = null;
		Static275.anIntArray603 = null;
		Static99.aBoolean151 = false;
		Static344.anIntArray764 = null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!km;)V")
	public static void method3688(@OriginalArg(1) Class82 arg0) {
		if (Static48.aBoolean87) {
			Static230.method3804(arg0);
		} else {
			Static288.method4413(arg0);
		}
	}
}
