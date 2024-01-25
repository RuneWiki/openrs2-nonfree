import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "Lclient!ha;")
	public static Class12 aClass12_16;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "[I")
	public static int[] anIntArray524 = new int[1];

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
	public static int anInt6976 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method6009(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static246.anInt4759 = 7;
		Static40.anInt1354 = 0x1 << Static246.anInt4759;
		Static444.anInt7507 = Static40.anInt1354 >> 1;
		Static229.anInt4560 = (int) Math.sqrt((double) (Static444.anInt7507 * Static444.anInt7507 + Static444.anInt7507 * Static444.anInt7507));
		Static165.anInt3649 = Static40.anInt1354 >> 2;
		Static120.anInt2885 = Static40.anInt1354;
		Static488.anInt8353 = arg0;
		Static60.anInt1677 = arg1;
		Static278.anInt5506 = arg2;
		Static171.aClass206ArrayArrayArray1 = new Class206[4][Static488.anInt8353][Static60.anInt1677];
		Static53.aClass10Array3 = new Class10[4];
		if (arg3) {
			Static184.anIntArrayArray32 = new int[Static488.anInt8353][Static60.anInt1677];
			Static39.aByteArrayArray7 = new byte[Static488.anInt8353][Static60.anInt1677];
			Static184.aShortArrayArray3 = new short[Static488.anInt8353][Static60.anInt1677];
			Static406.aClass206ArrayArrayArray3 = new Class206[1][Static488.anInt8353][Static60.anInt1677];
			Static106.aClass10Array5 = new Class10[1];
		} else {
			Static184.anIntArrayArray32 = null;
			Static39.aByteArrayArray7 = null;
			Static184.aShortArrayArray3 = null;
			Static406.aClass206ArrayArrayArray3 = null;
			Static106.aClass10Array5 = null;
		}
		if (arg4) {
			Static17.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static172.aClass201Array3 = new Class201[65535];
			Static78.aBooleanArray9 = new boolean[65535];
			Static321.anInt6084 = 0;
		} else {
			Static17.aLongArrayArrayArray1 = null;
			Static172.aClass201Array3 = null;
			Static78.aBooleanArray9 = null;
			Static321.anInt6084 = 0;
		}
		Static368.method5690(false);
		Static327.aClass138Array3 = new Class138[1000];
		Static64.anInt1870 = 0;
		Static50.aClass138Array4 = new Class138[1000];
		Static296.anInt5741 = 0;
		Static145.anIntArrayArrayArray4 = new int[4][Static488.anInt8353 + 1][Static60.anInt1677 + 1];
		Static530.aClass47_Sub2Array3 = new Class47_Sub2[5000];
		Static375.anInt6600 = 0;
		Static339.aBooleanArrayArray4 = new boolean[Static278.anInt5506 + Static278.anInt5506 + 1][Static278.anInt5506 + Static278.anInt5506 + 1];
		Static213.aBooleanArrayArray2 = new boolean[Static278.anInt5506 + Static278.anInt5506 + 2][Static278.anInt5506 + Static278.anInt5506 + 2];
		Static128.aClass43_1 = null;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BII)Lclient!vba;")
	public static Class299 method6010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class299 local12 = new Class299();
		local12.anInt8549 = arg0 + 5 + 1;
		local12.anInt8569 = -1;
		local12.anInt8548 = -1;
		local12.anInt8559 = arg1 + 6;
		local12.anIntArrayArray84 = new int[local12.anInt8549][local12.anInt8559];
		local12.method7230();
		return local12;
	}
}
