import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aea", name = "E", descriptor = "Lclient!n;")
	public static Interface12 anInterface12_10;

	@OriginalMember(owner = "client!aea", name = "A", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_98 = new Class239(36, 0);

	@OriginalMember(owner = "client!aea", name = "C", descriptor = "[Lclient!aba;")
	public static final Class4[] aClass4Array3 = new Class4[14];

	@OriginalMember(owner = "client!aea", name = "F", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_99 = new Class239(16, -1);

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II[F)[F")
	public static float[] method3916(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static553.method3374(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method3918(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static175.anInt3259 = 7;
		Static136.anInt2574 = 0x1 << Static175.anInt3259;
		Static392.anInt7455 = Static136.anInt2574 >> 1;
		Static297.anInt5466 = (int) Math.sqrt((double) (Static392.anInt7455 * Static392.anInt7455 + Static392.anInt7455 * Static392.anInt7455));
		Static74.anInt1556 = Static136.anInt2574 >> 2;
		Static136.anInt2575 = Static136.anInt2574;
		Static515.anInt3809 = arg0;
		Static315.anInt5693 = arg1;
		Static207.anInt3723 = arg2;
		Static546.aClass262ArrayArrayArray4 = new Class262[4][Static515.anInt3809][Static315.anInt5693];
		Static164.aClass75Array1 = new Class75[4];
		if (arg3) {
			Static63.anIntArrayArray6 = new int[Static515.anInt3809][Static315.anInt5693];
			Static206.aByteArrayArray15 = new byte[Static515.anInt3809][Static315.anInt5693];
			Static127.aShortArrayArray2 = new short[Static515.anInt3809][Static315.anInt5693];
			Static274.aClass262ArrayArrayArray3 = new Class262[1][Static515.anInt3809][Static315.anInt5693];
			Static427.aClass75Array2 = new Class75[1];
		} else {
			Static63.anIntArrayArray6 = null;
			Static206.aByteArrayArray15 = null;
			Static127.aShortArrayArray2 = null;
			Static274.aClass262ArrayArrayArray3 = null;
			Static427.aClass75Array2 = null;
		}
		if (arg4) {
			Static139.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static410.aClass83Array1 = new Class83[65535];
			Static230.aBooleanArray22 = new boolean[65535];
			Static361.anInt6824 = 0;
		} else {
			Static139.aLongArrayArrayArray1 = null;
			Static410.aClass83Array1 = null;
			Static230.aBooleanArray22 = null;
			Static361.anInt6824 = 0;
		}
		Static202.method3263(false);
		Static432.aClass266Array2 = new Class266[1000];
		Static511.anInt8888 = 0;
		Static250.aClass266Array1 = new Class266[1000];
		Static64.anInt1241 = 0;
		Static156.anIntArrayArrayArray8 = new int[4][Static515.anInt3809 + 1][Static315.anInt5693 + 1];
		Static126.aClass1_Sub1Array5 = new Class1_Sub1[5000];
		Static112.anInt2255 = 0;
		Static533.aBooleanArrayArray6 = new boolean[Static207.anInt3723 + Static207.anInt3723 + 1][Static207.anInt3723 + Static207.anInt3723 + 1];
		Static138.aBooleanArrayArray1 = new boolean[Static207.anInt3723 + Static207.anInt3723 + 2][Static207.anInt3723 + Static207.anInt3723 + 2];
		Static41.aClass137_1 = null;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(III)V")
	public static void method3919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static399.aClass262ArrayArrayArray2[0][arg1][arg2] != null && Static399.aClass262ArrayArrayArray2[0][arg1][arg2].aClass262_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static399.aClass262ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class262 local46 = Static399.aClass262ArrayArrayArray2[local22][arg1][arg2] = new Class262(local22, arg1, arg2);
				if (local20) {
					local46.aByte96++;
				}
			}
		}
	}
}
