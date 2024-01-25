import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array10;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "I")
	public static int anInt4330 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	public static void method3917() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static433.aBooleanArray22[local3] = false;
		}
		Static118.anInt2182 = 0;
		Static563.anInt9475 = 0;
		Static438.anInt10553 = -1;
		Static254.anInt4612 = 1;
		Static642.anInt10098 = -1;
		Static396.anInt6606 = -1;
		Static304.anInt5319 = -1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIBZIII)V")
	public static void method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static97.aClass5_Sub25_8.aClass6_Sub18_5.method5120() != 0 && arg1 != 0 && Static44.anInt945 < 50 && arg3 != -1) {
			Static13.aClass166Array1[Static44.anInt945++] = new Class166((byte) 2, arg3, arg1, arg2, arg4, arg0, arg5, null);
		}
	}
}
