import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!nw", name = "J", descriptor = "Lclient!vd;")
	public static Class353 aClass353_78;

	@OriginalMember(owner = "client!nw", name = "B", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_137 = new Class268(104, 4);

	@OriginalMember(owner = "client!nw", name = "E", descriptor = "[[S")
	private static final short[][] aShortArrayArray13 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!nw", name = "G", descriptor = "[[S")
	public static final short[][] aShortArrayArray14 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nw", name = "I", descriptor = "[[S")
	public static final short[][] aShortArrayArray15 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nw", name = "F", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray4 = new short[][][] { aShortArrayArray13, aShortArrayArray14, aShortArrayArray15 };

	@OriginalMember(owner = "client!nw", name = "K", descriptor = "I")
	public static int anInt7657 = 0;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZIIIIII)V")
	public static void method6595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static101.method1629(arg2);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg2 - arg5;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg2;
		@Pc(26) int local26 = -arg2;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(39) int[] local39 = Static484.anIntArrayArray41[arg0];
		@Pc(48) int local48 = arg3 - local14;
		Static312.method5228(arg1, local39, local48, arg3 - arg2);
		@Pc(61) int local61 = local14 + arg3;
		Static312.method5228(arg4, local39, local61, local48);
		Static312.method5228(arg1, local39, arg2 + arg3, local61);
		while (local23 > local10) {
			local35 += 2;
			local33 += 2;
			local26 += local33;
			local31 += local35;
			if (local31 >= 0 && local28 >= 1) {
				Static399.anIntArray446[local28] = local10;
				local28--;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(118) int[] local118;
			@Pc(125) int[] local125;
			@Pc(129) int local129;
			@Pc(134) int local134;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(147) int local147;
			if (local26 >= 0) {
				local23--;
				if (local14 > local23) {
					local118 = Static484.anIntArrayArray41[local23 + arg0];
					local125 = Static484.anIntArrayArray41[arg0 - local23];
					local129 = Static399.anIntArray446[local23];
					local134 = arg3 + local10;
					local138 = arg3 - local10;
					local142 = local129 + arg3;
					local147 = arg3 - local129;
					Static312.method5228(arg1, local118, local147, local138);
					Static312.method5228(arg4, local118, local142, local147);
					Static312.method5228(arg1, local118, local134, local142);
					Static312.method5228(arg1, local125, local147, local138);
					Static312.method5228(arg4, local125, local142, local147);
					Static312.method5228(arg1, local125, local134, local142);
				} else {
					local118 = Static484.anIntArrayArray41[arg0 + local23];
					local125 = Static484.anIntArrayArray41[arg0 - local23];
					local129 = arg3 + local10;
					local134 = arg3 - local10;
					Static312.method5228(arg1, local118, local129, local134);
					Static312.method5228(arg1, local125, local129, local134);
				}
				local26 -= local23 << 1;
			}
			local118 = Static484.anIntArrayArray41[local10 + arg0];
			local125 = Static484.anIntArrayArray41[arg0 - local10];
			local129 = arg3 + local23;
			local134 = arg3 - local23;
			if (local14 <= local10) {
				Static312.method5228(arg1, local118, local129, local134);
				Static312.method5228(arg1, local125, local129, local134);
			} else {
				local138 = local10 > local28 ? Static399.anIntArray446[local10] : local28;
				local142 = arg3 + local138;
				local147 = arg3 - local138;
				Static312.method5228(arg1, local118, local147, local134);
				Static312.method5228(arg4, local118, local142, local147);
				Static312.method5228(arg1, local118, local129, local142);
				Static312.method5228(arg1, local125, local147, local134);
				Static312.method5228(arg4, local125, local142, local147);
				Static312.method5228(arg1, local125, local129, local142);
			}
		}
	}
}
