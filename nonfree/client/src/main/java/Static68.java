import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "Lclient!pp;")
	public static Class233 aClass233_2;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "Lclient!lo;")
	public static final Class181 aClass181_1 = new Class181();

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_31 = new Class133(66, -1);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIZI)V")
	public static void method1376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static7.aClass3_Sub15_Sub1_1.anInt8362 != 0 && arg4 != 0 && Static128.anInt2675 < 50 && arg1 != -1) {
			Static360.aClass70Array1[Static128.anInt2675++] = new Class70((byte) 1, arg1, arg4, arg2, arg3, arg0);
		}
	}
}
