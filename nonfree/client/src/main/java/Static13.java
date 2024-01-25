import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZZI)V")
	public static void method128(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static578.anInt9523--;
			if (Static578.anInt9523 == 0) {
				Static184.anIntArray303 = null;
			}
		}
		if (arg1) {
			Static344.anInt5739--;
			if (Static344.anInt5739 == 0) {
				Static379.anIntArray506 = null;
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIIZLclient!pu;)V")
	public static void method130(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class270 arg3) {
		if (arg1 <= 0) {
			Static381.method5109(arg0, arg3, arg2);
			return;
		}
		Static403.anInt7063 = arg0;
		Static500.aClass270_114 = arg3;
		Static11.anInt142 = 1;
		Static243.aBoolean335 = false;
		Static61.anInt1177 = arg2;
		Static24.anInt314 = 0;
		Static290.anInt5018 = Static97.aClass1_Sub7_Sub2_2.method531() / arg1;
		if (Static290.anInt5018 < 1) {
			Static290.anInt5018 = 1;
			return;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(FB)F")
	public static float method132(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "(I)V")
	public static void method139() {
		Static150.aClass104Array1 = new Class104[50];
		Static507.anInt8646 = 0;
	}
}
