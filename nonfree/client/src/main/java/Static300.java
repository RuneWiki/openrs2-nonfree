import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
	public static void method4728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class9_Sub1_Sub2 local13 = local7.aClass9_Sub1_Sub2_1;
		@Pc(16) Class9_Sub1_Sub2 local16 = local7.aClass9_Sub1_Sub2_2;
		if (local13 != null) {
			local13.aShort47 = (short) (local13.aShort47 * arg3 / (0x10 << Static458.anInt7508 - 7));
			local13.aShort46 = (short) (local13.aShort46 * arg3 / (0x10 << Static458.anInt7508 - 7));
		}
		if (local16 != null) {
			local16.aShort47 = (short) (local16.aShort47 * arg3 / (0x10 << Static458.anInt7508 - 7));
			local16.aShort46 = (short) (local16.aShort46 * arg3 / (0x10 << Static458.anInt7508 - 7));
		}
	}
}
