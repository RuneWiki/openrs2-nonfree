import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	public static int anInt2752;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method1884(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
	public static void method1885() {
		@Pc(1) Object local1 = Static101.anObject4;
		synchronized (Static101.anObject4) {
			if (Static39.anInt1073 != 0) {
				Static39.anInt1073 = 1;
				try {
					Static101.anObject4.wait();
				} catch (@Pc(11) InterruptedException local11) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I")
	public static int method1886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local11 ^ local11 << 13;
		@Pc(35) int local35 = local21 * (local21 * local21 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}
}
