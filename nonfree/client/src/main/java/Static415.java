import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
	public static int anInt7773;

	@OriginalMember(owner = "client!qfa", name = "I", descriptor = "[I")
	public static int[] anIntArray558;

	@OriginalMember(owner = "client!qfa", name = "L", descriptor = "I")
	public static int anInt7775;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method6494(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static494.anInt8859 = 9;
		Static364.anInt7313 = 0x1 << Static494.anInt8859;
		Static406.anInt9843 = Static364.anInt7313 >> 1;
		Static109.anInt2480 = (int) Math.sqrt((double) (Static406.anInt9843 * Static406.anInt9843 + Static406.anInt9843 * Static406.anInt9843));
		Static581.anInt9823 = Static364.anInt7313 >> 2;
		Static107.anInt2436 = Static364.anInt7313;
		Static396.anInt7505 = arg0;
		Static54.anInt1441 = arg1;
		Static203.anInt4358 = arg2;
		Static398.aClass224ArrayArrayArray3 = new Class224[4][Static396.anInt7505][Static54.anInt1441];
		Static53.aClass62Array2 = new Class62[4];
		if (arg3) {
			Static448.anIntArrayArray53 = new int[Static396.anInt7505][Static54.anInt1441];
			Static270.aByteArrayArray18 = new byte[Static396.anInt7505][Static54.anInt1441];
			Static571.aShortArrayArray11 = new short[Static396.anInt7505][Static54.anInt1441];
			Static263.aClass224ArrayArrayArray2 = new Class224[1][Static396.anInt7505][Static54.anInt1441];
			Static369.aClass62Array3 = new Class62[1];
		} else {
			Static448.anIntArrayArray53 = null;
			Static270.aByteArrayArray18 = null;
			Static571.aShortArrayArray11 = null;
			Static263.aClass224ArrayArrayArray2 = null;
			Static369.aClass62Array3 = null;
		}
		if (arg4) {
			Static447.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static470.aClass342Array1 = new Class342[65535];
			Static262.aBooleanArray17 = new boolean[65535];
			Static258.anInt5217 = 0;
		} else {
			Static447.aLongArrayArrayArray1 = null;
			Static470.aClass342Array1 = null;
			Static262.aBooleanArray17 = null;
			Static258.anInt5217 = 0;
		}
		Static498.method7455(false);
		Static456.aClass350Array2 = new Class350[1000];
		Static499.anInt8899 = 0;
		Static346.aClass350Array1 = new Class350[1000];
		Static279.anInt5384 = 0;
		Static173.anIntArrayArrayArray4 = new int[4][Static396.anInt7505 + 1][Static54.anInt1441 + 1];
		Static374.aClass11_Sub1Array1 = new Class11_Sub1[5000];
		Static209.anInt4411 = 0;
		Static487.aBooleanArrayArray9 = new boolean[Static203.anInt4358 + Static203.anInt4358 + 1][Static203.anInt4358 + Static203.anInt4358 + 1];
		Static277.aBooleanArrayArray3 = new boolean[Static203.anInt4358 + Static203.anInt4358 + 2][Static203.anInt4358 + Static203.anInt4358 + 2];
		Static83.aClass58_2 = null;
	}
}
