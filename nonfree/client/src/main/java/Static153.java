import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[[S")
	private static final short[][] aShortArrayArray5 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_24 = new Class124();

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "[[S")
	private static final short[][] aShortArrayArray6 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "[[S")
	private static final short[][] aShortArrayArray7 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray2 = new short[][][] { aShortArrayArray5, aShortArrayArray6, aShortArrayArray7 };

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "[I")
	public static final int[] anIntArray129 = new int[1000];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2274(@OriginalArg(0) String arg0) {
		@Pc(6) Class5_Sub16 local6 = Static444.method6617();
		local6.aClass5_Sub15_Sub2_1.method3651(Static304.aClass208_12.anInt5598);
		local6.aClass5_Sub15_Sub2_1.method3660(0);
		@Pc(21) int local21 = local6.aClass5_Sub15_Sub2_1.anInt4144;
		local6.aClass5_Sub15_Sub2_1.method3660(644);
		@Pc(30) int[] local30 = Static539.method7462(local6);
		@Pc(34) int local34 = local6.aClass5_Sub15_Sub2_1.anInt4144;
		local6.aClass5_Sub15_Sub2_1.method3680(arg0);
		local6.aClass5_Sub15_Sub2_1.method3651(Static259.anInt4113);
		local6.aClass5_Sub15_Sub2_1.anInt4144 += 7;
		local6.aClass5_Sub15_Sub2_1.method3687(local30, local34, local6.aClass5_Sub15_Sub2_1.anInt4144);
		local6.aClass5_Sub15_Sub2_1.method3644(local6.aClass5_Sub15_Sub2_1.anInt4144 - local21);
		Static479.method7038(local6);
		Static123.anInt2148 = 0;
		Static59.anInt6271 = -3;
		Static572.anInt9353 = 1;
		Static456.anInt7922 = 0;
	}
}
