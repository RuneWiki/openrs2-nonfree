import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!nv", name = "D", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_95 = new Class45(86, 8);

	@OriginalMember(owner = "client!nv", name = "I", descriptor = "[I")
	public static final int[] anIntArray450 = new int[13];

	@OriginalMember(owner = "client!nv", name = "J", descriptor = "Lclient!vaa;")
	public static final Class299 aClass299_3 = new Class299();

	@OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
	public static int anInt6470 = 0;

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
	public static int anInt6471 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5404(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static193.anInt4311 = 7;
		Static316.anInt6040 = 0x1 << Static193.anInt4311;
		Static225.anInt4810 = Static316.anInt6040 >> 1;
		Static429.anInt7946 = (int) Math.sqrt((double) (Static225.anInt4810 * Static225.anInt4810 + Static225.anInt4810 * Static225.anInt4810));
		Static14.anInt231 = Static316.anInt6040 >> 2;
		Static48.anInt893 = Static316.anInt6040;
		Static537.anInt9566 = arg0;
		Static509.anInt9164 = arg1;
		Static307.anInt5970 = arg2;
		Static284.aClass37ArrayArrayArray3 = new Class37[4][Static537.anInt9566][Static509.anInt9164];
		Static155.aClass215Array5 = new Class215[4];
		if (arg3) {
			Static287.anIntArrayArray52 = new int[Static537.anInt9566][Static509.anInt9164];
			Static51.aByteArrayArray28 = new byte[Static537.anInt9566][Static509.anInt9164];
			Static119.aShortArrayArray1 = new short[Static537.anInt9566][Static509.anInt9164];
			Static141.aClass37ArrayArrayArray2 = new Class37[1][Static537.anInt9566][Static509.anInt9164];
			Static67.aClass215Array2 = new Class215[1];
		} else {
			Static287.anIntArrayArray52 = null;
			Static51.aByteArrayArray28 = null;
			Static119.aShortArrayArray1 = null;
			Static141.aClass37ArrayArrayArray2 = null;
			Static67.aClass215Array2 = null;
		}
		if (arg4) {
			Static130.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static485.aClass97Array1 = new Class97[65535];
			Static449.aBooleanArray45 = new boolean[65535];
			Static423.anInt78 = 0;
		} else {
			Static130.aLongArrayArrayArray1 = null;
			Static485.aClass97Array1 = null;
			Static449.aBooleanArray45 = null;
			Static423.anInt78 = 0;
		}
		Static200.method3790(false);
		Static176.aClass103Array2 = new Class103[1000];
		Static127.anInt2935 = 0;
		Static79.aClass103Array1 = new Class103[1000];
		Static542.anInt9614 = 0;
		Static369.anIntArrayArrayArray7 = new int[4][Static537.anInt9566 + 1][Static509.anInt9164 + 1];
		Static9.aClass30_Sub1Array1 = new Class30_Sub1[5000];
		Static261.anInt5286 = 0;
		Static243.aBooleanArrayArray6 = new boolean[Static307.anInt5970 + Static307.anInt5970 + 1][Static307.anInt5970 + Static307.anInt5970 + 1];
		Static143.aBooleanArrayArray3 = new boolean[Static307.anInt5970 + Static307.anInt5970 + 2][Static307.anInt5970 + Static307.anInt5970 + 2];
		Static308.aClass126_1 = null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[BIIBI)V")
	public static void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(20) int local20 = arg3 - arg2 >> 2;
		arg0 += arg2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg3 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg0 = local39 + 1;
			arg1[local39] = 1;
		}
	}
}
