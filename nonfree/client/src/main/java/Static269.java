import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static269 {

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIIIII)V")
	public static void method4946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static74.aClass2_Sub13_5.aClass14_Sub6_5.method3223() != 0 && arg2 != 0 && Static395.anInt7569 < 50 && arg1 != -1) {
			Static443.aClass125Array1[Static395.anInt7569++] = new Class125((byte) 1, arg1, arg2, arg3, arg0, 0, arg4, null);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public static void method4952() {
		if (Static529.anInt9623 == 3) {
			Static66.method8375(4);
		} else if (Static529.anInt9623 == 7) {
			Static66.method8375(8);
		} else if (Static529.anInt9623 == 10) {
			Static66.method8375(11);
			return;
		}
	}
}
