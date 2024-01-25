import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!fba", name = "K", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!fba", name = "F", descriptor = "Lclient!em;")
	public static final Class83 aClass83_56 = new Class83(64, 2);

	@OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
	public static int anInt2623 = 2;

	@OriginalMember(owner = "client!fba", name = "J", descriptor = "I")
	public static int anInt2625 = 0;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method2298(@OriginalArg(0) Class78 arg0) {
		Static446.aClass144Array1 = new Class144[Static411.anIntArray437.length];
		for (@Pc(16) int local16 = 0; local16 < Static411.anIntArray437.length; local16++) {
			@Pc(22) int local22 = Static411.anIntArray437[local16];
			@Pc(27) Class352 local27 = Static342.method5100(local22, Static284.aClass308_177);
			@Pc(35) Class96 local35 = arg0.method6837(local27, Static604.method6024(Static247.aClass308_96, local22));
			Static446.aClass144Array1[local16] = new Class144(local35, local27);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method2300(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)I")
	public static int method2301(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local27 >> 12) + 40960;
		return local35 * local21 >> 12;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)V")
	public static void method2303(@OriginalArg(1) int arg0) {
		if (arg0 == Static152.anInt2864) {
			return;
		}
		Static458.anInt9736 = Static378.anInt6747 = Static77.anIntArray573[arg0];
		Static193.method3075();
		Static448.anIntArrayArray44 = new int[Static458.anInt9736][Static378.anInt6747];
		Static313.anIntArrayArray26 = new int[Static458.anInt9736][Static378.anInt6747];
		Static593.anIntArrayArrayArray20 = new int[4][Static458.anInt9736 >> 3][Static378.anInt6747 >> 3];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static590.aClass240Array1[local36] = Static403.method5806(Static458.anInt9736, Static378.anInt6747);
		}
		Static368.aByteArrayArrayArray12 = new byte[4][Static458.anInt9736][Static378.anInt6747];
		Static459.method6434(Static458.anInt9736, Static378.anInt6747);
		Static470.method2480(Static378.anInt6747 >> 3, Static31.aClass78_18, Static458.anInt9736 >> 3);
		Static152.anInt2864 = arg0;
	}
}
