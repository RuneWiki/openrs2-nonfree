import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_89 = new Class151(86, 2);

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "[[S")
	private static final short[][] aShortArrayArray7 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "[I")
	public static final int[] anIntArray294 = new int[1000];

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray4 = new short[][][] { aShortArrayArray8, aShortArrayArray9, aShortArrayArray7 };

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
	public static int anInt4001 = 0;

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "Lclient!dj;")
	public static Class66 aClass66_17 = new Class66(8);

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
	public static void method3572(@OriginalArg(1) int arg0) {
		if (!Static583.method7687(arg0)) {
			return;
		}
		@Pc(19) Class199[] local19 = Static392.aClass199ArrayArray2[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class199 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt4985 = 0;
				local27.anInt4960 = 0;
				local27.anInt5014 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)Z")
	public static boolean method3573() {
		return Static91.anInt1809 == 0 ? Static570.aClass4_Sub3_Sub4_6.method6751() : true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFII[FFIII[FII)V")
	public static void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg10 - arg6;
		@Pc(13) int local13 = arg7 - arg5;
		@Pc(17) int local17 = arg0 - arg2;
		@Pc(38) float local38 = (float) local13 * arg3[2] + arg3[0] * (float) local5 + (float) local17 * arg3[1];
		@Pc(59) float local59 = arg3[5] * (float) local13 + arg3[4] * (float) local17 + (float) local5 * arg3[3];
		@Pc(80) float local80 = (float) local5 * arg3[6] + arg3[7] * (float) local17 + (float) local13 * arg3[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local91 *= arg1;
		}
		@Pc(105) float local105 = local59 + arg4 + 0.5F;
		@Pc(112) float local112;
		if (arg9 == 1) {
			local112 = local91;
			local91 = -local105;
			local105 = local112;
		} else if (arg9 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg9 == 3) {
			local112 = local91;
			local91 = local105;
			local105 = -local112;
		}
		arg8[1] = local105;
		arg8[0] = local91;
	}
}
