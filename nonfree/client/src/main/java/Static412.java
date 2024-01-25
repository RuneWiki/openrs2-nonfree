import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method6043(@OriginalArg(0) Class121 arg0) {
		for (@Pc(1) int local1 = Static518.anInt3345; local1 < Static41.anInt687; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static80.anInt1391; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static164.anInt2881; local7++) {
					@Pc(16) Class9 local16 = Static208.aClass9ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class29_Sub5 local21 = local16.aClass29_Sub5_1;
						@Pc(24) Class29_Sub5 local24 = local16.aClass29_Sub5_2;
						if (local21 != null && local21.method7540()) {
							Static487.method6724(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7540()) {
								Static487.method6724(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7543(local21, 0, arg0, 0, 0, false);
								local24.method7537();
							}
							local21.method7537();
						}
						for (@Pc(70) Class66 local70 = local16.aClass66_1; local70 != null; local70 = local70.aClass66_2) {
							@Pc(74) Class29_Sub2 local74 = local70.aClass29_Sub2_1;
							if (local74 != null && local74.method7540()) {
								Static487.method6724(arg0, local74, local1, local4, local7, local74.aShort124 + 1 - local74.aShort122, local74.aShort123 - local74.aShort121 + 1);
								local74.method7537();
							}
						}
						@Pc(111) Class29_Sub3 local111 = local16.aClass29_Sub3_1;
						if (local111 != null && local111.method7540()) {
							Static537.method7462(arg0, local111, local1, local4, local7);
							local111.method7537();
						}
					}
				}
			}
		}
	}
}
