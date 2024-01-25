import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "Lclient!ra;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_22 = new Class236(77, 7);

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZILclient!jk;)V")
	public static void method2414(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class15_Sub2_Sub1_Sub2 arg1) {
		if (Static257.anInt5147 >= 400) {
			return;
		}
		@Pc(14) Class305 local14 = arg1.aClass305_1;
		if (local14.anIntArray679 != null) {
			local14 = local14.method7150(Static540.aClass242_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.lb) {
			return;
		}
		@Pc(36) String local36 = local14.aString82;
		if (local14.anInt8799 != 0) {
			@Pc(55) String local55 = Static525.aClass155_4 == Static53.aClass155_1 ? Static165.aClass40_53.method1063(Static194.anInt3737) : Static6.aClass40_1.method1063(Static194.anInt3737);
			local36 = local36 + Static137.method1264(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852, local14.anInt8799) + " (" + local55 + local14.anInt8799 + ")";
		}
		if (!Static479.aBoolean594) {
			if (!arg0) {
				@Pc(85) String[] local85 = local14.aStringArray39;
				if (Static272.aBoolean372) {
					local85 = Static314.method3571(local85);
				}
				@Pc(95) int local95;
				if (local85 != null) {
					for (local95 = 4; local95 >= 0; local95--) {
						if (local85[local95] != null && (local14.aByte103 == 0 || !local85[local95].equalsIgnoreCase(Static296.aClass40_89.method1063(Static194.anInt3737)))) {
							@Pc(118) byte local118 = 0;
							if (local95 == 0) {
								local118 = 47;
							}
							@Pc(124) int local124 = Static37.anInt895;
							if (local95 == 1) {
								local118 = 49;
							}
							if (local95 == 2) {
								local118 = 4;
							}
							if (local95 == 3) {
								local118 = 17;
							}
							if (local95 == 4) {
								local118 = 60;
							}
							if (local95 == local14.anInt8821) {
								local124 = local14.anInt8817;
							}
							if (local14.anInt8820 == local95) {
								local124 = local14.anInt8801;
							}
							Static371.method5606(local85[local95].equalsIgnoreCase(Static296.aClass40_89.method1063(Static194.anInt3737)) ? local14.anInt8792 : local124, 0, local118, -1, true, (long) arg1.anInt4745, 0, local85[local95], false, "<col=ffff00>" + local36);
						}
					}
				}
				if (local14.aByte103 == 1 && local85 != null) {
					for (local95 = 4; local95 >= 0; local95--) {
						if (local85[local95] != null && local85[local95].equalsIgnoreCase(Static296.aClass40_89.method1063(Static194.anInt3737))) {
							@Pc(233) short local233 = 0;
							if (local14.anInt8799 > Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852) {
								local233 = 2000;
							}
							@Pc(246) short local246 = 0;
							if (local95 == 0) {
								local246 = 47;
							}
							if (local95 == 1) {
								local246 = 49;
							}
							if (local95 == 2) {
								local246 = 4;
							}
							if (local95 == 3) {
								local246 = 17;
							}
							if (local95 == 4) {
								local246 = 60;
							}
							if (local246 != 0) {
								local246 += local233;
							}
							Static371.method5606(local14.anInt8792, 0, local246, -1, true, (long) arg1.anInt4745, 0, local85[local95], false, "<col=ffff00>" + local36);
						}
					}
				}
			}
			Static371.method5606(Static502.anInt8572, 0, 1012, -1, true, (long) arg1.anInt4745, 0, Static49.aClass40_15.method1063(Static194.anInt3737), arg0, "<col=ffff00>" + local36);
		} else if (!arg0) {
			@Pc(354) Class135 local354 = Static192.anInt3701 == -1 ? null : Static216.aClass298_11.method6969(Static192.anInt3701);
			if ((Static354.anInt6690 & 0x2) != 0) {
				if (local354 == null || local14.method7146(Static192.anInt3701, local354.anInt3793) != local354.anInt3793) {
					Static371.method5606(Static186.anInt3582, 0, 8, -1, true, (long) arg1.anInt4745, 0, Static150.aString37, false, Static516.aString81 + " -> <col=ffff00>" + local36);
				}
				return;
			}
		}
	}
}
