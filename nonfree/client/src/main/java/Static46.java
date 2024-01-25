import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_23 = new Class7("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_37 = new Class107(22, 2);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
	public static void method819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static28.anInt644 <= arg0 - arg5 && Static125.anInt2545 >= arg5 + arg0 && arg4 - arg5 >= Static108.anInt2276 && arg4 + arg5 <= Static173.anInt3208) {
			Static79.method1540(arg3, arg4, arg1, arg0, arg2, arg5);
		} else {
			Static202.method3278(arg4, arg2, arg0, arg3, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method820(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static31.anInt665 = 7;
		Static186.anInt3374 = 0x1 << Static31.anInt665;
		Static69.anInt1593 = Static186.anInt3374 >> 1;
		Static224.anInt4084 = (int) Math.sqrt((double) (Static69.anInt1593 * Static69.anInt1593 + Static69.anInt1593 * Static69.anInt1593));
		Static160.anInt3003 = Static186.anInt3374 >> 2;
		Static332.anInt5657 = Static186.anInt3374;
		Static132.anInt2639 = arg0;
		Static87.anInt1875 = arg1;
		Static75.anInt1695 = arg2;
		Static18.aClass80ArrayArrayArray2 = new Class80[4][Static132.anInt2639][Static87.anInt1875];
		Static269.aClass149Array2 = new Class149[4];
		if (arg3) {
			Static222.anIntArrayArray41 = new int[Static132.anInt2639][Static87.anInt1875];
			Static443.aByteArrayArray21 = new byte[Static132.anInt2639][Static87.anInt1875];
			Static34.aShortArrayArray1 = new short[Static132.anInt2639][Static87.anInt1875];
			Static346.aClass80ArrayArrayArray3 = new Class80[1][Static132.anInt2639][Static87.anInt1875];
			Static277.aClass149Array3 = new Class149[1];
		} else {
			Static222.anIntArrayArray41 = null;
			Static443.aByteArrayArray21 = null;
			Static34.aShortArrayArray1 = null;
			Static346.aClass80ArrayArrayArray3 = null;
			Static277.aClass149Array3 = null;
		}
		if (arg4) {
			Static61.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static124.aClass243Array5 = new Class243[65535];
			Static294.aBooleanArray49 = new boolean[65535];
			Static54.anInt1001 = 0;
		} else {
			Static61.aLongArrayArrayArray1 = null;
			Static124.aClass243Array5 = null;
			Static294.aBooleanArray49 = null;
			Static54.anInt1001 = 0;
		}
		Static211.method3342(false);
		Static85.aClass128Array1 = new Class128[1000];
		Static397.anInt6372 = 0;
		Static303.aClass128Array2 = new Class128[1000];
		Static212.anInt3976 = 0;
		Static254.anIntArrayArrayArray13 = new int[4][Static132.anInt2639 + 1][Static87.anInt1875 + 1];
		Static429.aClass31_Sub2Array3 = new Class31_Sub2[5000];
		Static4.anInt121 = 0;
		Static23.aBooleanArrayArray4 = new boolean[Static75.anInt1695 + Static75.anInt1695 + 1][Static75.anInt1695 + Static75.anInt1695 + 1];
		Static390.aBooleanArrayArray8 = new boolean[Static75.anInt1695 + Static75.anInt1695 + 2][Static75.anInt1695 + Static75.anInt1695 + 2];
		Static135.aClass6_1 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method821() {
		Static437.aClass251ArrayArray2 = new Class251[Static359.aClass246_194.method5502()][];
		Static451.aClass251ArrayArray3 = new Class251[Static359.aClass246_194.method5502()][];
		Static209.aBooleanArray29 = new boolean[Static359.aClass246_194.method5502()];
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method824(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static263.method3885(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)Z")
	public static boolean method825(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
