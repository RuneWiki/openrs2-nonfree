import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt3846 = -1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!vc;Lclient!nl;BLclient!nl;)V")
	public static void method3529(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(3) Class171 arg2) {
		Static374.aClass136_9 = Static230.method3732(Static255.anInt4502, arg2);
		Static156.aClass9_1 = arg0.method2034(Static374.aClass136_9, Static397.method2332(arg1, Static255.anInt4502));
		Static302.aClass136_4 = Static230.method3732(Static208.anInt3820, arg2);
		Static319.aClass9_3 = arg0.method2034(Static302.aClass136_4, Static397.method2332(arg1, Static208.anInt3820));
		Static238.aClass136_7 = Static230.method3732(Static185.anInt3487, arg2);
		Static340.aClass9_4 = arg0.method2034(Static238.aClass136_7, Static397.method2332(arg1, Static185.anInt3487));
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method3532() {
		Static218.aClass2_Sub16_Sub2_3.method5378();
		@Pc(13) int local13 = Static218.aClass2_Sub16_Sub2_3.method5380(8);
		@Pc(22) int local22;
		if (Static171.anInt3311 > local13) {
			for (local22 = local13; local22 < Static171.anInt3311; local22++) {
				Static34.anIntArray166[Static43.anInt857++] = Static143.anIntArray583[local22];
			}
		}
		if (Static171.anInt3311 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static171.anInt3311 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static143.anIntArray583[local22];
			@Pc(64) Class1_Sub5_Sub1_Sub2 local64 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local60];
			@Pc(69) int local69 = Static218.aClass2_Sub16_Sub2_3.method5380(1);
			if (local69 == 0) {
				Static143.anIntArray583[Static171.anInt3311++] = local60;
				local64.anInt6422 = Static253.anInt4469;
			} else {
				@Pc(92) int local92 = Static218.aClass2_Sub16_Sub2_3.method5380(2);
				if (local92 == 0) {
					Static143.anIntArray583[Static171.anInt3311++] = local60;
					local64.anInt6422 = Static253.anInt4469;
					Static4.anIntArray45[Static158.anInt3041++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(146) int local146;
					if (local92 == 1) {
						Static143.anIntArray583[Static171.anInt3311++] = local60;
						local64.anInt6422 = Static253.anInt4469;
						local134 = Static218.aClass2_Sub16_Sub2_3.method5380(3);
						local64.method5558(1, local134);
						local146 = Static218.aClass2_Sub16_Sub2_3.method5380(1);
						if (local146 == 1) {
							Static4.anIntArray45[Static158.anInt3041++] = local60;
						}
					} else if (local92 == 2) {
						Static143.anIntArray583[Static171.anInt3311++] = local60;
						local64.anInt6422 = Static253.anInt4469;
						if (Static218.aClass2_Sub16_Sub2_3.method5380(1) == 1) {
							local134 = Static218.aClass2_Sub16_Sub2_3.method5380(3);
							local64.method5558(2, local134);
							local146 = Static218.aClass2_Sub16_Sub2_3.method5380(3);
							local64.method5558(2, local146);
						} else {
							local134 = Static218.aClass2_Sub16_Sub2_3.method5380(3);
							local64.method5558(0, local134);
						}
						local134 = Static218.aClass2_Sub16_Sub2_3.method5380(1);
						if (local134 == 1) {
							Static4.anIntArray45[Static158.anInt3041++] = local60;
						}
					} else if (local92 == 3) {
						Static34.anIntArray166[Static43.anInt857++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method3534() {
		for (@Pc(6) Class2_Sub26 local6 = (Class2_Sub26) Static195.aClass30_28.method694(); local6 != null; local6 = (Class2_Sub26) Static195.aClass30_28.method682()) {
			if (Static57.method3259(local6.anInt3594)) {
				Static16.method307(local6);
			}
		}
		if (Static285.anInt4946 == 1) {
			Static269.aBoolean349 = false;
			Static29.method507(Static320.anInt5473, Static108.anInt5290, Static236.anInt2045, Static255.anInt4503);
			return;
		}
		Static29.method507(Static320.anInt5473, Static108.anInt5290, Static236.anInt2045, Static255.anInt4503);
		@Pc(63) int local63 = Static238.aClass136_7.method3125(Static190.aClass32_48.method701(Static107.anInt2498));
		for (@Pc(68) Class2_Sub26 local68 = (Class2_Sub26) Static195.aClass30_28.method694(); local68 != null; local68 = (Class2_Sub26) Static195.aClass30_28.method682()) {
			@Pc(74) int local74 = Static239.method3868(local68);
			if (local74 > local63) {
				local63 = local74;
			}
		}
		Static320.anInt5473 = (Static284.aBoolean372 ? 26 : 22) + Static285.anInt4946 * 16;
		Static108.anInt5290 = local63 + 8;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([JII[II)V")
	public static void method3540(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg3) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg3];
		arg0[arg3] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local35;
		for (@Pc(47) int local47 = arg1; local47 < arg3; local47++) {
			if (arg0[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(64) long local64 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local64;
				@Pc(78) int local78 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local78;
			}
		}
		arg0[arg3] = arg0[local17];
		arg0[local17] = local21;
		arg2[arg3] = arg2[local17];
		arg2[local17] = local35;
		method3540(arg0, arg1, arg2, local17 - 1);
		method3540(arg0, local17 + 1, arg2, arg3);
	}
}
