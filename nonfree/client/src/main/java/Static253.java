import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "B")
	public static byte aByte59;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_149 = new Class272(83, -1);

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class63 local28 = Static554.aClass63ArrayArrayArray4[local9][arg0][arg1] = Static554.aClass63ArrayArrayArray4[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class16 local33 = local28.aClass16_3; local33 != null; local33 = local33.aClass16_1) {
					@Pc(37) Class9_Sub1_Sub1 local37 = local33.aClass9_Sub1_Sub1_1;
					if (local37.aShort112 == arg0 && local37.aShort115 == arg1) {
						local37.aByte126--;
					}
				}
				if (local28.aClass9_Sub1_Sub3_1 != null) {
					local28.aClass9_Sub1_Sub3_1.aByte126--;
				}
				if (local28.aClass9_Sub1_Sub4_1 != null) {
					local28.aClass9_Sub1_Sub4_1.aByte126--;
				}
				if (local28.aClass9_Sub1_Sub4_2 != null) {
					local28.aClass9_Sub1_Sub4_2.aByte126--;
				}
				if (local28.aClass9_Sub1_Sub2_1 != null) {
					local28.aClass9_Sub1_Sub2_1.aByte126--;
				}
				if (local28.aClass9_Sub1_Sub2_2 != null) {
					local28.aClass9_Sub1_Sub2_2.aByte126--;
				}
			}
		}
		if (Static554.aClass63ArrayArrayArray4[0][arg0][arg1] == null) {
			Static554.aClass63ArrayArrayArray4[0][arg0][arg1] = new Class63(0);
			Static554.aClass63ArrayArrayArray4[0][arg0][arg1].aByte37 = 1;
		}
		Static554.aClass63ArrayArrayArray4[0][arg0][arg1].aClass63_1 = local7;
		Static554.aClass63ArrayArrayArray4[3][arg0][arg1] = null;
	}
}
