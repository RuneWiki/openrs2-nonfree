import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!wt", name = "M", descriptor = "I")
	public static int anInt7844 = 0;

	@OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
	public static int anInt7845 = -1;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIII)V")
	public static void method6085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static389.aClass128_Sub1_1.anInt3565 != 0 && arg0 != 0 && Static442.anInt5016 < 50 && arg3 != -1) {
			Static254.aClass12Array1[Static442.anInt5016++] = new Class12((byte) 1, arg3, arg0, arg1, arg2, arg4);
		}
	}
}
