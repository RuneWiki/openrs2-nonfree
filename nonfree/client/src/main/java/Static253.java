import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	public static int anInt4653;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	public static int anInt4655;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public static int anInt4650 = 127;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public static int anInt4651 = 0;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "[I")
	public static int[] anIntArray519 = new int[1000];

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray21 = new boolean[8];

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Lclient!ui;")
	public static Class175 aClass175_37 = new Class175(500);

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	public static int anInt4654 = 50;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString167 = "Use";

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray36 = new int[5][5000];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)I")
	public static int method3960(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method3962(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static109.method2025(0, arg1, arg0.length - 1, arg0);
	}
}
