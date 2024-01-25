import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "Lclient!hfa;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	public static int anInt913 = 1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([[BZLclient!jda;)V")
	public static void method859(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class96_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt5123; local14++) {
			Static54.method911();
			for (local20 = 0; local20 < Static442.anInt7975 >> 3; local20++) {
				for (local24 = 0; local24 < Static284.anInt7916 >> 3; local24++) {
					local34 = Static246.anIntArrayArrayArray2[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean353 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(79) int local79 = local69 / 8 + (local63 / 8 << 8);
							for (@Pc(81) int local81 = 0; local81 < Static480.anIntArray523.length; local81++) {
								if (local79 == Static480.anIntArray523[local81] && arg0[local81] != null) {
									@Pc(103) Class6_Sub40 local103 = new Class6_Sub40(arg0[local81]);
									arg1.method4567(Static619.aClass319Array1, local103, local14, local43, local24 * 8, local69, local57, local63, local20 * 8);
									arg1.method4581(local24 * 8, local57, local69, local103, local63, local20 * 8, local43, local12[0] == -1 ? local12 : null, local14, Static162.aClass100_7);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg1.anInt5123; local20++) {
			Static54.method911();
			for (local24 = 0; local24 < Static442.anInt7975 >> 3; local24++) {
				for (local34 = 0; local34 < Static284.anInt7916 >> 3; local34++) {
					local43 = Static246.anIntArrayArrayArray2[local20][local24][local34];
					if (local43 == -1) {
						arg1.method4569(local20, local24 * 8, 8, 8, local34 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static382.aClass264_1 = Static25.aClass355_1.method8459(Static22.aClass354_1, local12[1], local12[3], local12[0], local12[2]);
			Static507.anInt8745 = local12[4];
		}
	}
}
