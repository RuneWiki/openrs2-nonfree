import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static424 {

	@OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
	public static int anInt7403 = -1;

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "Z")
	public static boolean aBoolean633 = false;

	@OriginalMember(owner = "client!vg", name = "L", descriptor = "[I")
	public static final int[] anIntArray559 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!ak;)V")
	public static void method5716(@OriginalArg(1) Class1_Sub3 arg0) {
		if (!Static378.aBoolean549) {
			arg0.method5965();
			Static119.anInt2296--;
		}
	}
}
