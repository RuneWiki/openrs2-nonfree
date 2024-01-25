import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public static int anInt5400 = -1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method4519(@OriginalArg(0) Class62 arg0) {
		for (@Pc(1) int local1 = Static179.anInt3489; local1 < Static460.anInt7893; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static374.anInt6925; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static430.anInt7565; local7++) {
					@Pc(16) Class37 local16 = Static152.aClass37ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class15_Sub3 local21 = local16.aClass15_Sub3_3;
						@Pc(24) Class15_Sub3 local24 = local16.aClass15_Sub3_2;
						if (local21 != null && local21.method6861()) {
							Static215.method3478(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6861()) {
								Static215.method3478(arg0, local24, local1, local4, local7, 1, 1);
								local24.method6859(false, 0, arg0, 0, 0, local21);
								local24.method6860();
							}
							local21.method6860();
						}
						for (@Pc(70) Class108 local70 = local16.aClass108_1; local70 != null; local70 = local70.aClass108_3) {
							@Pc(74) Class15_Sub2 local74 = local70.aClass15_Sub2_1;
							if (local74 != null && local74.method6861()) {
								Static215.method3478(arg0, local74, local1, local4, local7, local74.aShort111 + 1 - local74.aShort110, local74.aShort108 - local74.aShort109 + 1);
								local74.method6860();
							}
						}
						@Pc(111) Class15_Sub5 local111 = local16.aClass15_Sub5_1;
						if (local111 != null && local111.method6861()) {
							Static426.method6102(arg0, local111, local1, local4, local7);
							local111.method6860();
						}
					}
				}
			}
		}
	}
}
