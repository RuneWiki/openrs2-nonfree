import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
	public static int anInt4938;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
	public static int anInt4944;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString312 = "Choose Option";

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	public static int anInt4935 = 0;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
	public static int anInt4937 = 0;

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "[I")
	public static final int[] anIntArray647 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[50][];

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
	public static int anInt4941 = 0;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
	public static int anInt4943 = 255;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;ILclient!ap;)I")
	public static int method4307(@OriginalArg(0) String arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		@Pc(6) int local6 = arg1.anInt3005;
		@Pc(10) byte[] local10 = Static172.method2484(arg0);
		arg1.method2734(local10.length);
		arg1.anInt3005 += Static169.aClass101_1.method2645(local10, 0, arg1.aByteArray33, arg1.anInt3005, local10.length);
		return arg1.anInt3005 - local6;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	public static void method4309() {
		@Pc(1) Class191[] local1 = Class125.aClass191Array1;
		synchronized (Class125.aClass191Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class125.aClass191Array1.length; local11++) {
				Class125.aClass191Array1[local11] = new Class191();
				Static325.anIntArray783[local11] = 0;
			}
		}
	}
}
