import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!gg;")
	public static Class4_Sub3_Sub3_Sub3_Sub2 aClass4_Sub3_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "Z")
	public static boolean aBoolean396 = false;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZB)I")
	public static int method4853(@OriginalArg(0) boolean arg0) {
		if (Static421.anIntArray369 == null) {
			return 0;
		} else if (arg0 || Static564.aClass272Array1 == null) {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < Static421.anIntArray369.length; local33++) {
				@Pc(41) int local41 = Static421.anIntArray369[local33];
				if (Static33.aClass310_9.method7785(local41)) {
					local31++;
				}
				if (Static588.aClass310_115.method7785(local41)) {
					local31++;
				}
			}
			return local31;
		} else {
			return Static421.anIntArray369.length * 2;
		}
	}
}
