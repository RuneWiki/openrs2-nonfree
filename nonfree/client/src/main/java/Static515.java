import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static515 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!vaa;")
	public static Class365 aClass365_4;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "Lclient!uja;")
	public static Class60 aClass60_2;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "[Lclient!jea;")
	public static Class178[] aClass178Array2 = new Class178[50];

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public static int anInt3720 = -1;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public static int anInt3721 = 0;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
	public static boolean aBoolean257 = false;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3297(@OriginalArg(1) Class143 arg0) {
		if (Static530.aBoolean635) {
			Static653.method8582(arg0);
		} else {
			Static317.method4825(arg0);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI)V")
	public static void method3299(@OriginalArg(0) boolean arg0) {
		if (Static459.aClass204_1 == null) {
			Static134.method1737();
		}
		if (arg0) {
			Static459.aClass204_1.method4776();
		}
	}
}
