import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_123 = new Class130(41, 5);

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "Z")
	public static boolean aBoolean664 = true;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BII)Z")
	public static boolean method7971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(II)V")
	public static void method7972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class77 local28 = Static330.aClass77ArrayArrayArray2[local9][arg0][arg1] = Static330.aClass77ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class128 local33 = local28.aClass128_1; local33 != null; local33 = local33.aClass128_2) {
					@Pc(37) Class4_Sub1_Sub2 local37 = local33.aClass4_Sub1_Sub2_1;
					if (local37.aShort118 == arg0 && local37.aShort116 == arg1) {
						local37.aByte123--;
					}
				}
				if (local28.aClass4_Sub1_Sub5_1 != null) {
					local28.aClass4_Sub1_Sub5_1.aByte123--;
				}
				if (local28.aClass4_Sub1_Sub3_2 != null) {
					local28.aClass4_Sub1_Sub3_2.aByte123--;
				}
				if (local28.aClass4_Sub1_Sub3_1 != null) {
					local28.aClass4_Sub1_Sub3_1.aByte123--;
				}
				if (local28.aClass4_Sub1_Sub4_2 != null) {
					local28.aClass4_Sub1_Sub4_2.aByte123--;
				}
				if (local28.aClass4_Sub1_Sub4_1 != null) {
					local28.aClass4_Sub1_Sub4_1.aByte123--;
				}
			}
		}
		if (Static330.aClass77ArrayArrayArray2[0][arg0][arg1] == null) {
			Static330.aClass77ArrayArrayArray2[0][arg0][arg1] = new Class77(0);
			Static330.aClass77ArrayArrayArray2[0][arg0][arg1].aByte23 = 1;
		}
		Static330.aClass77ArrayArrayArray2[0][arg0][arg1].aClass77_1 = local7;
		Static330.aClass77ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
