import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[Lclient!q;")
	public static Class80[] aClass80Array2;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!nb;")
	public static Class15 aClass15_34;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!id;")
	public static Class43 aClass43_17 = new Class43(64);

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
	public static int[] anIntArray398 = new int[25];

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_1002 = Static184.method2923("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Lclient!q;")
	public static Class80 aClass80_13 = null;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BZ)[B")
	public static byte[] method2588(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static225.method1839(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V")
	public static void method2589() {
		Static13.aClass2_Sub7ArrayArrayArray1 = new Class2_Sub7[4][104][104];
		Static130.anIntArrayArrayArray19 = new int[4][105][105];
		Static22.method433();
		Static44.anInt1331 = 104;
		Static59.anInt1642 = 104;
		Static211.anIntArrayArrayArray21 = new int[4][105][105];
		Static74.method1382();
		Static135.anInt3149 = 25;
		Static17.aBooleanArrayArray1 = new boolean[Static135.anInt3149 + Static135.anInt3149 + 1][Static135.anInt3149 + Static135.anInt3149 + 1];
		Static44.aBooleanArrayArray2 = new boolean[Static135.anInt3149 + Static135.anInt3149 + 2][Static135.anInt3149 + Static135.anInt3149 + 2];
	}
}
