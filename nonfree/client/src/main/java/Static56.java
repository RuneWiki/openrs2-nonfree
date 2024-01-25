import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!br", name = "z", descriptor = "Lclient!tf;")
	public static Class310_Sub1 aClass310_Sub1_1;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_59 = new Class179(53, 2);

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method1076(@OriginalArg(1) Class8 arg0) {
		Static664.aClass8_147 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V")
	public static void method1077(@OriginalArg(1) int arg0) {
		if (Static353.anInt6020 == arg0) {
			return;
		}
		Static491.anInt9856 = Static393.anInt6574 = Static498.anIntArray548[arg0];
		Static665.method9027();
		Static149.anIntArrayArrayArray14 = new int[4][Static491.anInt9856 >> 3][Static393.anInt6574 >> 3];
		Static52.anIntArrayArray4 = new int[Static491.anInt9856][Static393.anInt6574];
		Static121.anIntArrayArray11 = new int[Static491.anInt9856][Static393.anInt6574];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static83.aClass324Array1[local40] = Static611.method8416(Static491.anInt9856, Static393.anInt6574);
		}
		Static75.aByteArrayArrayArray1 = new byte[4][Static491.anInt9856][Static393.anInt6574];
		Static205.method3061(Static491.anInt9856, Static393.anInt6574);
		Static213.method3112(Static546.aClass132_13, Static393.anInt6574 >> 3, Static491.anInt9856 >> 3);
		Static353.anInt6020 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)I")
	public static int method1078(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
