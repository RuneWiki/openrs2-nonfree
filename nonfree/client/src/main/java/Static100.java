import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!es", name = "H", descriptor = "I")
	public static int anInt2033;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "[I")
	public static final int[] anIntArray134 = new int[50];

	@OriginalMember(owner = "client!es", name = "E", descriptor = "I")
	public static int anInt2032 = -1;

	@OriginalMember(owner = "client!es", name = "F", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_39 = new Class253(55, 0);

	@OriginalMember(owner = "client!es", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)I")
	public static int method1733(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BC)Z")
	public static boolean method1742(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V")
	public static void method1743(@OriginalArg(0) int arg0) {
		if (arg0 == Static124.anInt2429) {
			return;
		}
		Static333.anInt3375 = Static102.anInt2086 = Static286.anIntArray356[arg0];
		Static156.method2332();
		Static118.anIntArrayArray16 = new int[Static333.anInt3375][Static102.anInt2086];
		Static150.anIntArrayArray23 = new int[Static333.anInt3375][Static102.anInt2086];
		Static17.anIntArrayArrayArray1 = new int[4][Static333.anInt3375 >> 3][Static102.anInt2086 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static179.aClass70Array3[local40] = Static183.method2670(Static102.anInt2086, Static333.anInt3375);
		}
		Static351.aByteArrayArrayArray17 = new byte[4][Static333.anInt3375][Static102.anInt2086];
		Static49.method626(Static333.anInt3375, Static102.anInt2086);
		Static312.method4085(Static269.aClass51_9, Static102.anInt2086 >> 3, Static333.anInt3375 >> 3);
		Static124.anInt2429 = arg0;
	}
}
