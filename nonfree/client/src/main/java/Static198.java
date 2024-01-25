import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static198 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "[B")
	public static final byte[] aByteArray44 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "[I")
	public static final int[] anIntArray321 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method3313(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static23.anInt420 = 9;
		Static113.anInt1928 = 0x1 << Static23.anInt420;
		Static259.anInt4703 = Static113.anInt1928 >> 1;
		Static200.anInt3841 = (int) Math.sqrt((double) (Static259.anInt4703 * Static259.anInt4703 + Static259.anInt4703 * Static259.anInt4703));
		Static342.anInt6507 = Static113.anInt1928 >> 2;
		Static31.anInt582 = Static113.anInt1928;
		Static547.anInt9363 = arg0;
		Static20.anInt358 = arg1;
		Static2.anInt40 = arg2;
		Static162.aClass133ArrayArrayArray2 = new Class133[4][Static547.anInt9363][Static20.anInt358];
		Static496.aClass46Array4 = new Class46[4];
		if (arg3) {
			Static582.anIntArrayArray69 = new int[Static547.anInt9363][Static20.anInt358];
			Static464.aByteArrayArray25 = new byte[Static547.anInt9363][Static20.anInt358];
			Static205.aShortArrayArray15 = new short[Static547.anInt9363][Static20.anInt358];
			Static299.aClass133ArrayArrayArray3 = new Class133[1][Static547.anInt9363][Static20.anInt358];
			Static480.aClass46Array2 = new Class46[1];
		} else {
			Static582.anIntArrayArray69 = null;
			Static464.aByteArrayArray25 = null;
			Static205.aShortArrayArray15 = null;
			Static299.aClass133ArrayArrayArray3 = null;
			Static480.aClass46Array2 = null;
		}
		if (arg4) {
			Static511.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static111.aClass255Array1 = new Class255[65535];
			Static170.aBooleanArray12 = new boolean[65535];
			Static28.anInt487 = 0;
		} else {
			Static511.aLongArrayArrayArray1 = null;
			Static111.aClass255Array1 = null;
			Static170.aBooleanArray12 = null;
			Static28.anInt487 = 0;
		}
		Static54.method805(false);
		Static182.aClass89Array1 = new Class89[1000];
		Static91.anInt1494 = 0;
		Static244.aClass89Array2 = new Class89[1000];
		Static523.anInt9056 = 0;
		Static484.anIntArrayArrayArray20 = new int[4][Static547.anInt9363 + 1][Static20.anInt358 + 1];
		Static158.aClass15_Sub2Array1 = new Class15_Sub2[5000];
		Static398.anInt7207 = 0;
		Static528.aBooleanArrayArray9 = new boolean[Static2.anInt40 + Static2.anInt40 + 1][Static2.anInt40 + Static2.anInt40 + 1];
		Static467.aBooleanArrayArray7 = new boolean[Static2.anInt40 + Static2.anInt40 + 2][Static2.anInt40 + Static2.anInt40 + 2];
		Static221.aClass175_1 = null;
	}
}
