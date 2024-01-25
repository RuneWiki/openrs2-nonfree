import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "[J")
	public static long[] aLongArray15;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array19;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[[S")
	private static final short[][] aShortArrayArray12 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[[S")
	private static final short[][] aShortArrayArray13 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	public static int anInt7674 = 0;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "[[S")
	private static final short[][] aShortArrayArray14 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray3 = new short[][][] { aShortArrayArray13, aShortArrayArray14, aShortArrayArray12 };

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)Z")
	public static boolean method6692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static175.method2898(arg1, arg0) | Static225.method3900(arg0, arg1)) & Static519.method7558(arg1, arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!uv;ILclient!aa;IIBILclient!fd;)V")
	public static void method6694(@OriginalArg(0) Class344 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class103 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(20) int local20;
		if (Static471.anInt8064 == 4) {
			local20 = (int) Static170.aFloat71 & 0x3FFF;
		} else {
			local20 = (int) Static170.aFloat71 + Static579.anInt9458 & 0x3FFF;
		}
		@Pc(41) int local41 = Math.max(arg0.anInt9546 / 2, arg0.anInt9602 / 2) + 10;
		@Pc(50) int local50 = arg4 * arg4 + arg3 * arg3;
		if (local50 > local41 * local41) {
			return;
		}
		@Pc(60) int local60 = Class3_Sub13.anIntArray147[local20];
		@Pc(64) int local64 = Class3_Sub13.anIntArray146[local20];
		if (Static471.anInt8064 != 4) {
			local60 = local60 * 256 / (Static296.anInt5883 + 256);
			local64 = local64 * 256 / (Static296.anInt5883 + 256);
		}
		@Pc(96) int local96 = local60 * arg3 + arg4 * local64 >> 14;
		@Pc(107) int local107 = local64 * arg3 - local60 * arg4 >> 14;
		arg6.method7439(local96 + arg0.anInt9546 / 2 + arg1 - arg6.method7454() / 2, arg5 + arg0.anInt9602 / 2 - (local107 + arg6.method7451() / 2), arg2, arg1, arg5);
	}
}
