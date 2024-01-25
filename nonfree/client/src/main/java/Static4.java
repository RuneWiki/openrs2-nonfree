import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public static int anInt60;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_3 = new Class77(8);

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
	public static int anInt58 = 0;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_4 = new Class67(63, 16);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
	public static void method43(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static241.method3467(arg4, Static142.anInt2163, Static182.anInt3402);
		@Pc(17) int local17 = Static241.method3467(arg3, Static142.anInt2163, Static182.anInt3402);
		@Pc(23) int local23 = Static241.method3467(arg1, Static281.anInt4757, Static457.anInt7264);
		@Pc(29) int local29 = Static241.method3467(arg0, Static281.anInt4757, Static457.anInt7264);
		@Pc(37) int local37 = Static241.method3467(arg4 + arg5, Static142.anInt2163, Static182.anInt3402);
		@Pc(46) int local46 = Static241.method3467(arg3 - arg5, Static142.anInt2163, Static182.anInt3402);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static298.method3977(local23, arg2, local29, Static194.anIntArrayArray28[local48]);
		}
		for (@Pc(76) int local76 = local17; local76 > local46; local76--) {
			Static298.method3977(local23, arg2, local29, Static194.anIntArrayArray28[local76]);
		}
		@Pc(103) int local103 = Static241.method3467(arg1 + arg5, Static281.anInt4757, Static457.anInt7264);
		@Pc(112) int local112 = Static241.method3467(arg0 - arg5, Static281.anInt4757, Static457.anInt7264);
		for (@Pc(114) int local114 = local37; local114 <= local46; local114++) {
			@Pc(120) int[] local120 = Static194.anIntArrayArray28[local114];
			Static298.method3977(local23, arg2, local103, local120);
			Static298.method3977(local112, arg2, local29, local120);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method45(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
