import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "Lclient!oga;")
	public static Class243 aClass243_2;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lclient!in;")
	public static Class157 aClass157_104;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)V")
	public static void method4088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class100 local28 = Static395.aClass100ArrayArrayArray3[local9][arg0][arg1] = Static395.aClass100ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class243 local33 = local28.aClass243_1; local33 != null; local33 = local33.aClass243_3) {
					@Pc(37) Class3_Sub1_Sub3 local37 = local33.aClass3_Sub1_Sub3_1;
					if (local37.aShort118 == arg0 && local37.aShort120 == arg1) {
						local37.aByte132--;
					}
				}
				if (local28.aClass3_Sub1_Sub1_1 != null) {
					local28.aClass3_Sub1_Sub1_1.aByte132--;
				}
				if (local28.aClass3_Sub1_Sub5_2 != null) {
					local28.aClass3_Sub1_Sub5_2.aByte132--;
				}
				if (local28.aClass3_Sub1_Sub5_1 != null) {
					local28.aClass3_Sub1_Sub5_1.aByte132--;
				}
				if (local28.aClass3_Sub1_Sub2_1 != null) {
					local28.aClass3_Sub1_Sub2_1.aByte132--;
				}
				if (local28.aClass3_Sub1_Sub2_2 != null) {
					local28.aClass3_Sub1_Sub2_2.aByte132--;
				}
			}
		}
		if (Static395.aClass100ArrayArrayArray3[0][arg0][arg1] == null) {
			Static395.aClass100ArrayArrayArray3[0][arg0][arg1] = new Class100(0);
			Static395.aClass100ArrayArrayArray3[0][arg0][arg1].aByte41 = 1;
		}
		Static395.aClass100ArrayArrayArray3[0][arg0][arg1].aClass100_1 = local7;
		Static395.aClass100ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIZLjava/lang/String;I)V")
	public static void method4089(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static444.method7024(false, null, arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)I")
	public static int method4090() {
		return Static66.anInt10075 == 1 ? Static272.anInt5779 : 0;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
	public static void method4092() {
		if (!Static414.aBoolean558) {
			Static414.aBoolean558 = true;
			Static485.aFloat196 += (-Static485.aFloat196 - 24.0F) / 2.0F;
			Static166.aBoolean304 = true;
		}
	}
}
