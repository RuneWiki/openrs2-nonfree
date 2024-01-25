import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static254 {

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	public static int anInt5709;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	public static int anInt5710;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!ps;")
	public static Class193 aClass193_57 = new Class193();

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public static int anInt5708 = 2;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIBI)V")
	public static void method4736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static39.aClass79_Sub1_1.anInt2158 != 0 && arg3 != 0 && Static139.anInt2476 < 50 && arg0 != -1) {
			Static342.aClass216Array1[Static139.anInt2476++] = new Class216((byte) 2, arg0, arg3, arg1, arg2, 0);
		}
	}
}
