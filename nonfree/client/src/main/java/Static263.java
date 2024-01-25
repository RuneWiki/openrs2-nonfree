import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public static int anInt4190 = -1;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
	public static final int[] anIntArray223 = new int[100];

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	public static void method3375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static336.aClass106_Sub1_1.anInt5696 != 0 && arg2 != 0 && Static353.anInt5858 < 50 && arg1 != -1) {
			Static104.aClass98Array2[Static353.anInt5858++] = new Class98((byte) 1, arg1, arg2, arg3, arg0, 0);
		}
	}
}
