import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "Lclient!gea;")
	public static Interface6 anInterface6_1;

	@OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
	public static int anInt10529;

	@OriginalMember(owner = "client!waa", name = "n", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_122 = new Class387(84, -1);

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)V")
	public static void method9034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class174 local28 = Static260.aClass174ArrayArrayArray2[local9][arg0][arg1] = Static260.aClass174ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class273 local33 = local28.aClass273_67; local33 != null; local33 = local33.aClass273_114) {
					@Pc(37) Class8_Sub1_Sub3 local37 = local33.aClass8_Sub1_Sub3_1;
					if (local37.aShort109 == arg0 && local37.aShort108 == arg1) {
						local37.aByte145--;
					}
				}
				if (local28.aClass8_Sub1_Sub1_1 != null) {
					local28.aClass8_Sub1_Sub1_1.aByte145--;
				}
				if (local28.aClass8_Sub1_Sub4_2 != null) {
					local28.aClass8_Sub1_Sub4_2.aByte145--;
				}
				if (local28.aClass8_Sub1_Sub4_1 != null) {
					local28.aClass8_Sub1_Sub4_1.aByte145--;
				}
				if (local28.aClass8_Sub1_Sub2_1 != null) {
					local28.aClass8_Sub1_Sub2_1.aByte145--;
				}
				if (local28.aClass8_Sub1_Sub2_2 != null) {
					local28.aClass8_Sub1_Sub2_2.aByte145--;
				}
			}
		}
		if (Static260.aClass174ArrayArrayArray2[0][arg0][arg1] == null) {
			Static260.aClass174ArrayArrayArray2[0][arg0][arg1] = new Class174(0);
			Static260.aClass174ArrayArrayArray2[0][arg0][arg1].aByte65 = 1;
		}
		Static260.aClass174ArrayArrayArray2[0][arg0][arg1].aClass174_1 = local7;
		Static260.aClass174ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IC)I")
	public static int method9036(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class351.anIntArray558.length ? Class351.anIntArray558[arg0] : -1;
	}
}
