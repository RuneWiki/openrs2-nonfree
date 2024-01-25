import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static503 {

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_217 = new Class160(43, 3);

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "[I")
	public static int[] anIntArray454 = new int[2];

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZIIII)V")
	public static void method7576(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 0) {
			Static467.method6886(false);
		} else {
			Static267.anInt4944 = Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801();
			Static459.method8986(true, 0);
		}
		Static256.anInt4826 = arg3;
		Static33.anInt531 = arg1;
		Static229.aBoolean338 = arg0;
		Static224.method1311(arg2);
	}
}
