import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	public static int anInt3357;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString113 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString114 = "glow1:";

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "J")
	public static long aLong123 = 0L;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	public static int anInt3359 = -1;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public static void method2643() {
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			Static134.aBooleanArray8[local15] = false;
		}
		Static176.anInt3474 = 0;
		Static172.anInt3428 = 1;
		Static30.anInt726 = -1;
		Static151.anInt4072 = 0;
		Static115.anInt2342 = -1;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method2644(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IJ)V")
	public static void method2645(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static182.method2787(arg0 - 1L);
			Static182.method2787(1L);
		} else {
			Static182.method2787(arg0);
		}
	}
}
