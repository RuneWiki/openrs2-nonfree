import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "Lclient!bn;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "[[[Lclient!ut;")
	public static Class252[][][] aClass252ArrayArrayArray1;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "[I")
	public static int[] anIntArray133 = new int[2];

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V")
	public static void method992(@OriginalArg(0) int arg0) {
		if (Static165.anInt3454 == 1) {
			Static224.anInt7015 = arg0;
		} else if (Static165.anInt3454 == 2 || Static165.anInt3454 == 3) {
			Static168.anInt1709 = arg0;
		}
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V")
	public static void method993() {
		Static55.anInt1495 = 0;
		Static261.anInt5048 = 0;
		Static104.anInt2412 = 0;
		Static233.anInt4619 = 0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIZ)V")
	public static void method996(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static162.anInt3425++;
			Static32.method671();
		}
		if (arg0) {
			Static136.anInt3023++;
			Static297.method4301();
		}
	}
}
