import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public static int anInt6856;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "Lclient!ql;")
	public static Class277 aClass277_2;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	public static int anInt6857;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_131 = new Class56(4, -2);

	@OriginalMember(owner = "client!os", name = "d", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "[S")
	public static final short[] aShortArray100 = new short[] { 30, 58, 49, 5, 21, 44, 51, 4 };

	@OriginalMember(owner = "client!os", name = "l", descriptor = "I")
	public static int anInt6858 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII)V")
	public static void method5747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static416.anInt7068 == 1) {
			Static580.aClass14Array16[Static235.anInt4157 / 100].method7680(Static541.anInt8167 - 8, Static158.anInt3267 + -8);
		}
		if (Static416.anInt7068 == 2) {
			Static580.aClass14Array16[Static235.anInt4157 / 100 + 4].method7680(Static541.anInt8167 - 8, Static158.anInt3267 + -8);
		}
		Static251.method3878();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([SI)[S")
	public static short[] method5749(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static601.method2815(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
