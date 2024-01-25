import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array12;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "Lclient!mi;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "[[S")
	private static final short[][] aShortArrayArray12 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "[[S")
	private static final short[][] aShortArrayArray13 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "[[S")
	private static final short[][] aShortArrayArray14 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray3 = new short[][][] { aShortArrayArray12, aShortArrayArray13, aShortArrayArray14 };

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII[I)V")
	public static void method7640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		arg1--;
		@Pc(17) int local17 = arg2 - 1;
		@Pc(20) int local20 = local17 - 7;
		while (local20 > arg1) {
			@Pc(24) int local24 = arg1 + 1;
			arg3[local24] = arg0;
			@Pc(29) int local29 = local24 + 1;
			arg3[local29] = arg0;
			@Pc(34) int local34 = local29 + 1;
			arg3[local34] = arg0;
			@Pc(39) int local39 = local34 + 1;
			arg3[local39] = arg0;
			@Pc(44) int local44 = local39 + 1;
			arg3[local44] = arg0;
			@Pc(49) int local49 = local44 + 1;
			arg3[local49] = arg0;
			@Pc(54) int local54 = local49 + 1;
			arg3[local54] = arg0;
			arg1 = local54 + 1;
			arg3[arg1] = arg0;
		}
		while (arg1 < local17) {
			arg1++;
			arg3[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZI)V")
	public static void method7642(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub21 local10 = Static586.method7782(arg1, arg0);
		if (local10 != null) {
			local10.method9034();
		}
	}
}
