import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_213 = new Class150(67, 12);

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "Z")
	public static boolean aBoolean623 = false;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method6944(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static270.anInt5288 = 7;
		Static58.anInt1202 = 0x1 << Static270.anInt5288;
		Static261.anInt5167 = Static58.anInt1202 >> 1;
		Static495.anInt8488 = (int) Math.sqrt((double) (Static261.anInt5167 * Static261.anInt5167 + Static261.anInt5167 * Static261.anInt5167));
		Static335.anInt6316 = Static58.anInt1202 >> 2;
		Static280.anInt5466 = Static58.anInt1202;
		Static374.anInt6925 = arg0;
		Static430.anInt7565 = arg1;
		Static479.anInt8261 = arg2;
		Static408.aClass37ArrayArrayArray3 = new Class37[4][Static374.anInt6925][Static430.anInt7565];
		Static493.aClass131Array5 = new Class131[4];
		if (arg3) {
			Static2.anIntArrayArray1 = new int[Static374.anInt6925][Static430.anInt7565];
			Static60.aByteArrayArray48 = new byte[Static374.anInt6925][Static430.anInt7565];
			Static401.aShortArrayArray8 = new short[Static374.anInt6925][Static430.anInt7565];
			Static231.aClass37ArrayArrayArray2 = new Class37[1][Static374.anInt6925][Static430.anInt7565];
			Static511.aClass131Array6 = new Class131[1];
		} else {
			Static2.anIntArrayArray1 = null;
			Static60.aByteArrayArray48 = null;
			Static401.aShortArrayArray8 = null;
			Static231.aClass37ArrayArrayArray2 = null;
			Static511.aClass131Array6 = null;
		}
		if (arg4) {
			Static479.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static24.aClass250Array3 = new Class250[65535];
			Static161.aBooleanArray14 = new boolean[65535];
			Static511.anInt8700 = 0;
		} else {
			Static479.aLongArrayArrayArray1 = null;
			Static24.aClass250Array3 = null;
			Static161.aBooleanArray14 = null;
			Static511.anInt8700 = 0;
		}
		Static193.method3237(false);
		Static491.aClass160Array2 = new Class160[1000];
		Static88.anInt2110 = 0;
		Static325.aClass160Array1 = new Class160[1000];
		Static65.anInt1248 = 0;
		Static481.anIntArrayArrayArray12 = new int[4][Static374.anInt6925 + 1][Static430.anInt7565 + 1];
		Static448.aClass15_Sub2Array3 = new Class15_Sub2[5000];
		Static255.anInt5115 = 0;
		Static398.aBooleanArrayArray4 = new boolean[Static479.anInt8261 + Static479.anInt8261 + 1][Static479.anInt8261 + Static479.anInt8261 + 1];
		Static527.aBooleanArrayArray6 = new boolean[Static479.anInt8261 + Static479.anInt8261 + 2][Static479.anInt8261 + Static479.anInt8261 + 2];
		Static535.aClass2_1 = null;
	}
}
