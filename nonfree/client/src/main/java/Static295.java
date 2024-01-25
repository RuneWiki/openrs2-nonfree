import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)Lclient!jd;")
	public static Class41_Sub1_Sub5 method4024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass41_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBZ)V")
	public static void method4025(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class5_Sub49 local9 = arg1 ? Static394.aClass5_Sub49_2 : Static57.aClass5_Sub49_1;
		if (local9 == null || arg0 < 0 || local9.anInt9624 <= arg0) {
			return;
		}
		@Pc(26) Class192 local26 = local9.aClass192Array1[arg0];
		if (local26.aByte52 != -1) {
			return;
		}
		@Pc(35) String local35 = local26.aString42;
		@Pc(40) Class5_Sub16 local40 = Static455.method6717(Static302.aClass187_58, Static16.aClass332_8);
		local40.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(local35) + 3);
		local40.aClass5_Sub15_Sub2_1.method3651(arg1 ? 1 : 0);
		local40.aClass5_Sub15_Sub2_1.method3660(arg0);
		local40.aClass5_Sub15_Sub2_1.method3680(local35);
		Static479.method7038(local40);
	}
}
