import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
	public static int anInt7298;

	@OriginalMember(owner = "client!paa", name = "o", descriptor = "Z")
	public static boolean aBoolean494 = false;

	@OriginalMember(owner = "client!paa", name = "p", descriptor = "Z")
	public static final boolean aBoolean495 = false;

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(II)V")
	public static void method6360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class128 local28 = Static283.aClass128ArrayArrayArray1[local9][arg0][arg1] = Static283.aClass128ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class299 local33 = local28.aClass299_2; local33 != null; local33 = local33.aClass299_3) {
					@Pc(37) Class4_Sub1_Sub1 local37 = local33.aClass4_Sub1_Sub1_1;
					if (local37.aShort104 == arg0 && local37.aShort105 == arg1) {
						local37.aByte139--;
					}
				}
				if (local28.aClass4_Sub1_Sub3_1 != null) {
					local28.aClass4_Sub1_Sub3_1.aByte139--;
				}
				if (local28.aClass4_Sub1_Sub2_2 != null) {
					local28.aClass4_Sub1_Sub2_2.aByte139--;
				}
				if (local28.aClass4_Sub1_Sub2_1 != null) {
					local28.aClass4_Sub1_Sub2_1.aByte139--;
				}
				if (local28.aClass4_Sub1_Sub5_2 != null) {
					local28.aClass4_Sub1_Sub5_2.aByte139--;
				}
				if (local28.aClass4_Sub1_Sub5_1 != null) {
					local28.aClass4_Sub1_Sub5_1.aByte139--;
				}
			}
		}
		if (Static283.aClass128ArrayArrayArray1[0][arg0][arg1] == null) {
			Static283.aClass128ArrayArrayArray1[0][arg0][arg1] = new Class128(0);
			Static283.aClass128ArrayArrayArray1[0][arg0][arg1].aByte40 = 1;
		}
		Static283.aClass128ArrayArrayArray1[0][arg0][arg1].aClass128_1 = local7;
		Static283.aClass128ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
