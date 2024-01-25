import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static688 {

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "Lclient!ija;")
	public static Class14_Sub2_Sub10 aClass14_Sub2_Sub10_3;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!me;")
	public static Class232 aClass232_1;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "Lclient!vj;")
	public static final Class378 aClass378_7 = new Class378(16);

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
	public static int anInt11168 = 0;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "Z")
	public static boolean aBoolean777 = false;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)V")
	public static void method9470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class89 local28 = Static63.aClass89ArrayArrayArray1[local9][arg0][arg1] = Static63.aClass89ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class58 local33 = local28.aClass58_2; local33 != null; local33 = local33.aClass58_1) {
					@Pc(37) Class4_Sub3_Sub3 local37 = local33.aClass4_Sub3_Sub3_1;
					if (local37.aShort108 == arg0 && local37.aShort109 == arg1) {
						local37.aByte146--;
					}
				}
				if (local28.aClass4_Sub3_Sub2_1 != null) {
					local28.aClass4_Sub3_Sub2_1.aByte146--;
				}
				if (local28.aClass4_Sub3_Sub1_1 != null) {
					local28.aClass4_Sub3_Sub1_1.aByte146--;
				}
				if (local28.aClass4_Sub3_Sub1_2 != null) {
					local28.aClass4_Sub3_Sub1_2.aByte146--;
				}
				if (local28.aClass4_Sub3_Sub5_1 != null) {
					local28.aClass4_Sub3_Sub5_1.aByte146--;
				}
				if (local28.aClass4_Sub3_Sub5_2 != null) {
					local28.aClass4_Sub3_Sub5_2.aByte146--;
				}
			}
		}
		if (Static63.aClass89ArrayArrayArray1[0][arg0][arg1] == null) {
			Static63.aClass89ArrayArrayArray1[0][arg0][arg1] = new Class89(0);
			Static63.aClass89ArrayArrayArray1[0][arg0][arg1].aByte27 = 1;
		}
		Static63.aClass89ArrayArrayArray1[0][arg0][arg1].aClass89_1 = local7;
		Static63.aClass89ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z")
	public static boolean method9472(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
