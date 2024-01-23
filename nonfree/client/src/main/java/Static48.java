import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!db", name = "G", descriptor = "Lclient!rn;")
	public static Class155 aClass155_26;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "[I")
	public static int[] anIntArray84;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method755() {
		Static39.method562(Static224.anInt6084);
		@Pc(17) int local17 = (Static43.anInt798 >> 3) + (Static173.anInt3251 >> 10);
		@Pc(28) int local28 = (Static230.anInt4492 >> 10) + (Static101.anInt1844 >> 3);
		Static205.anIntArray449 = new int[18];
		Static249.aByteArrayArray111 = new byte[18][];
		Static272.aByteArrayArray75 = new byte[18][];
		anIntArray84 = new int[18];
		Static50.aByteArrayArray22 = new byte[18][];
		Static168.anIntArray368 = new int[18];
		Static199.anIntArray442 = new int[18];
		Static114.anIntArrayArray81 = new int[18][4];
		Static302.aByteArrayArray126 = new byte[18][];
		Static44.aByteArrayArray18 = new byte[18][];
		Static124.anIntArray283 = new int[18];
		Static297.anIntArray220 = new int[18];
		@Pc(73) int local73 = 0;
		@Pc(79) int local79;
		for (local79 = (local28 - 6) / 8; local79 <= (local28 + 6) / 8; local79++) {
			for (@Pc(96) int local96 = (local17 - 6) / 8; local96 <= (local17 + 6) / 8; local96++) {
				@Pc(110) int local110 = (local79 << 8) + local96;
				Static297.anIntArray220[local73] = local110;
				Static124.anIntArray283[local73] = Static62.aClass155_30.method4120("m" + local79 + "_" + local96);
				Static205.anIntArray449[local73] = Static62.aClass155_30.method4120("l" + local79 + "_" + local96);
				anIntArray84[local73] = Static62.aClass155_30.method4120("n" + local79 + "_" + local96);
				Static199.anIntArray442[local73] = Static62.aClass155_30.method4120("um" + local79 + "_" + local96);
				Static168.anIntArray368[local73] = Static62.aClass155_30.method4120("ul" + local79 + "_" + local96);
				if (anIntArray84[local73] == -1) {
					Static124.anIntArray283[local73] = -1;
					Static205.anIntArray449[local73] = -1;
					Static199.anIntArray442[local73] = -1;
					Static168.anIntArray368[local73] = -1;
				}
				local73++;
			}
		}
		for (local79 = local73; local79 < anIntArray84.length; local79++) {
			anIntArray84[local79] = -1;
			Static124.anIntArray283[local79] = -1;
			Static205.anIntArray449[local79] = -1;
			Static199.anIntArray442[local79] = -1;
			Static168.anIntArray368[local79] = -1;
		}
		Static278.method4201(8, 0, local28, local17, true, 8, false);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)[F")
	public static float[] method759() {
		@Pc(7) float local7 = Static226.method3659() + Static226.method3651();
		@Pc(9) int local9 = Static226.method3657();
		@Pc(24) float local24 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		Static3.aFloatArray2[3] = 1.0F;
		@Pc(35) float local35 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(37) float local37 = 0.58823526F;
		@Pc(46) float local46 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		Static3.aFloatArray2[2] = local7 * local35 * Static296.aFloatArray29[2] * local37;
		Static3.aFloatArray2[0] = Static296.aFloatArray29[0] * local46 * local37 * local7;
		Static3.aFloatArray2[1] = local7 * Static296.aFloatArray29[1] * local24 * local37;
		return Static3.aFloatArray2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)V")
	public static void method761(@OriginalArg(0) boolean arg0) {
		Static104.aBoolean155 = arg0;
		Static6.aBoolean12 = !Static208.method3462();
	}
}
