import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "J")
	public static long aLong307;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[5];

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Z")
	public static boolean aBoolean421 = false;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray145 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!za;BIII)V")
	public static void method4745(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.ba(arg2, arg0, arg2 + arg3, arg4 + arg0);
		arg1.method5996(arg4, arg0, -16777216, arg2, arg3);
		if (Static382.anInt6617 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static5.anInt6726 / (float) Static5.anInt6725;
		@Pc(36) int local36 = arg3;
		@Pc(38) int local38 = arg4;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg3);
		} else {
			local36 = (int) ((float) arg4 / local34);
		}
		@Pc(73) int local73 = arg0 + (arg4 - local38) / 2;
		@Pc(82) int local82 = arg2 + (arg3 - local36) / 2;
		if (Static247.aClass41_11 == null || arg3 != Static247.aClass41_11.YA() || arg4 != Static247.aClass41_11.ZA()) {
			Static5.method5405(Static5.anInt6721, Static5.anInt6726 + Static5.anInt6729, Static5.anInt6725 + Static5.anInt6721, Static5.anInt6729, local82, local73, local82 + local36, local73 - -local38);
			Static5.method5397(arg1);
			Static247.aClass41_11 = arg1.method5973(local82, local73, local36, local38, false);
		}
		Static247.aClass41_11.method6090(local82, local73);
		@Pc(134) int local134 = Static279.anInt5040 * local36 / Static5.anInt6725;
		@Pc(140) int local140 = Static410.anInt7046 * local38 / Static5.anInt6726;
		@Pc(148) int local148 = local36 * Static337.anInt6013 / Static5.anInt6725 + local82;
		@Pc(161) int local161 = local73 + local38 - Static250.anInt4304 * local38 / Static5.anInt6726 - local140;
		@Pc(163) int local163 = -1996554240;
		if (Static201.aClass200_4 == Static10.aClass200_1) {
			local163 = -1996488705;
		}
		arg1.P(local148, local161, local134, local140, local163, 1);
		arg1.method5979(local148, local161, local134, local140, local163, 0);
		if (Static340.anInt6086 <= 0) {
			return;
		}
		@Pc(196) int local196;
		if (Static37.anInt611 <= 50) {
			local196 = Static37.anInt611 * 5;
		} else {
			local196 = (100 - Static37.anInt611) * 5;
		}
		for (@Pc(210) Class2_Sub16 local210 = (Class2_Sub16) Static5.aClass181_45.method3972(); local210 != null; local210 = (Class2_Sub16) Static5.aClass181_45.method3975()) {
			@Pc(218) Class203 local218 = Static5.aClass84_4.method1953(local210.anInt2880);
			if (Static228.method4879(local218)) {
				@Pc(247) int local247;
				@Pc(259) int local259;
				if (local210.anInt2880 == Static377.anInt6587) {
					local247 = local210.anInt2879 * local36 / Static5.anInt6725 + local82;
					local259 = local38 * (Static5.anInt6726 - local210.anInt2882) / Static5.anInt6726 + local73;
					arg1.method5996(4, local259 - 2, local196 << 24 | 0xFFFF00, local247 - 2, 4);
				} else if (Static139.anInt2570 != -1 && Static139.anInt2570 == local218.anInt5975) {
					local247 = local82 + local36 * local210.anInt2879 / Static5.anInt6725;
					local259 = local73 + (Static5.anInt6726 - local210.anInt2882) * local38 / Static5.anInt6726;
					arg1.method5996(4, local259 - 2, local196 << 24 | 0xFFFF00, local247 - 2, 4);
				}
			}
		}
	}
}
