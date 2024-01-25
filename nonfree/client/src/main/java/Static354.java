import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wm", name = "U", descriptor = "Lclient!ij;")
	public static Class93 aClass93_136;

	@OriginalMember(owner = "client!wm", name = "X", descriptor = "Lclient!wn;")
	public static Class95 aClass95_18;

	@OriginalMember(owner = "client!wm", name = "R", descriptor = "[I")
	public static final int[] anIntArray642 = new int[32];

	@OriginalMember(owner = "client!wm", name = "V", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_148 = new Class85("wave2:", "", "", "");

	@OriginalMember(owner = "client!wm", name = "W", descriptor = "S")
	public static short aShort94 = 32767;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
	public static void method6024(@OriginalArg(0) int arg0) {
		if (arg0 == Static29.anInt592) {
			return;
		}
		Static22.anInt481 = Static269.anInt5281 = Static133.anIntArray263[arg0];
		Static236.aClass55_9.method5200(50, (int) ((double) Static22.anInt481 * 34.46D));
		Static109.anIntArrayArray36 = new int[Static22.anInt481][Static269.anInt5281];
		Static141.anIntArrayArray48 = new int[Static22.anInt481][Static269.anInt5281];
		Static342.anIntArrayArrayArray13 = new int[4][Static22.anInt481 >> 3][Static269.anInt5281 >> 3];
		for (@Pc(51) int local51 = 0; local51 < 4; local51++) {
			Static152.aClass24Array3[local51] = Static45.method712(Static22.anInt481, Static269.anInt5281);
		}
		Static167.aByteArrayArrayArray8 = new byte[4][Static22.anInt481][Static269.anInt5281];
		Static137.method2434(Static22.anInt481, Static269.anInt5281);
		Static64.method1605(Static269.anInt5281 >> 3, Static22.anInt481 >> 3, Static236.aClass55_9);
		Static29.anInt592 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6025(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static44.anInt750; local9++) {
			if (arg0.equalsIgnoreCase(Static85.aStringArray14[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static192.aClass4_Sub5_Sub2_Sub1_2.aString40);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZLclient!ij;IB)V")
	public static void method6026(@OriginalArg(1) int arg0, @OriginalArg(3) Class93 arg1, @OriginalArg(4) int arg2) {
		Static250.anInt4969 = 1;
		Static56.aClass93_22 = arg1;
		Static5.anInt95 = 10000;
		Static249.aBoolean518 = false;
		Static115.anInt2139 = 0;
		Static51.anInt966 = arg2;
		Static297.anInt5809 = arg0;
	}
}
