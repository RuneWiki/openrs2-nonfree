import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "Lclient!sh;")
	public static final Class213 aClass213_11 = new Class213("LIVE", 0);

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "[I")
	public static final int[] anIntArray370 = new int[200];

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
	public static int anInt3266 = 0;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "[S")
	public static final short[] aShortArray60 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIILclient!ok;IZ)V")
	public static void method2911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class177 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (Static117.anInt2227 >= 50 || (arg3 == null || arg3.anIntArrayArray43 == null || arg3.anIntArrayArray43.length <= arg2 || arg3.anIntArrayArray43[arg2] == null)) {
			return;
		}
		@Pc(30) int local30 = arg3.anIntArrayArray43[arg2][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(44) int local44 = local30 & 0x1F;
		if (arg3.anIntArrayArray43[arg2].length > 1) {
			@Pc(61) int local61 = (int) (Math.random() * (double) arg3.anIntArrayArray43[arg2].length);
			if (local61 > 0) {
				local34 = arg3.anIntArrayArray43[arg2][local61];
			}
		}
		if (local44 == 0) {
			if (arg5) {
				Static12.method161(local34, local40, 0, 255);
			}
		} else if (Static164.aClass154_Sub1_1.anInt6055 != 0) {
			Static127.anIntArray245[Static117.anInt2227] = local34;
			Static138.anIntArray276[Static117.anInt2227] = local40;
			Static336.anIntArray236[Static117.anInt2227] = 0;
			Static205.aClass71Array2[Static117.anInt2227] = null;
			Static289.anIntArray561[Static117.anInt2227] = 255;
			@Pc(122) int local122 = (arg1 - 64) / 128;
			@Pc(128) int local128 = (arg4 - 64) / 128;
			Static250.anIntArray578[Static117.anInt2227] = local44 + (arg0 << 24) + (local122 << 16) + (local128 << 8);
			Static117.anInt2227++;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([BI)[B")
	public static byte[] method2912(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub5 local8 = new Class3_Sub5(arg0);
		@Pc(17) int local17 = local8.method2739();
		@Pc(21) int local21 = local8.method2726();
		if (local21 < 0 || Static63.anInt1280 != 0 && local21 > Static63.anInt1280) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(96) byte[] local96 = new byte[local21];
			local8.method2744(local96, local21);
			return local96;
		} else {
			@Pc(48) int local48 = local8.method2726();
			if (local48 < 0 || Static63.anInt1280 != 0 && local48 > Static63.anInt1280) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local48];
			if (local17 == 1) {
				Static237.method3907(local72, local48, arg0, local21);
			} else {
				Static118.aClass215_1.method4843(local8, local72);
			}
			return local72;
		}
	}
}
