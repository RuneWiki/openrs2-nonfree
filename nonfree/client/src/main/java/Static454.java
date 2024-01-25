import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	public static int anInt7931;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "[I")
	public static final int[] anIntArray747 = new int[1];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZLclient!bl;)V")
	public static void method6161(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class30_Sub1_Sub1_Sub1 arg1) {
		if (Static126.anInt2794 >= 400) {
			return;
		}
		@Pc(14) Class11 local14 = arg1.aClass11_1;
		if (local14.anIntArray12 != null) {
			local14 = local14.method136(Static366.aClass190_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean11) {
			return;
		}
		@Pc(34) String local34 = local14.aString2;
		if (local14.anInt177 != 0) {
			@Pc(50) String local50 = Static268.aClass272_4 == Static266.aClass272_3 ? Static272.aClass158_134.method3594(Static365.anInt6682) : Static299.aClass158_27.method3594(Static365.anInt6682);
			local34 = local34 + Static433.method6158(local14.anInt177, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348) + " (" + local50 + local14.anInt177 + ")";
		}
		if (!Static293.aBoolean300) {
			if (!arg0) {
				@Pc(80) String[] local80 = local14.aStringArray1;
				if (Static57.aBoolean97) {
					local80 = Static318.method4540(local80);
				}
				@Pc(90) int local90;
				if (local80 != null) {
					for (local90 = 4; local90 >= 0; local90--) {
						if (local80[local90] != null && (local14.aByte7 == 0 || !local80[local90].equalsIgnoreCase(Static417.aClass158_201.method3594(Static365.anInt6682)))) {
							@Pc(113) byte local113 = 0;
							if (local90 == 0) {
								local113 = 12;
							}
							@Pc(119) int local119 = Static306.anInt5748;
							if (local90 == 1) {
								local113 = 21;
							}
							if (local90 == 2) {
								local113 = 3;
							}
							if (local90 == 3) {
								local113 = 57;
							}
							if (local90 == local14.anInt182) {
								local119 = local14.anInt188;
							}
							if (local90 == 4) {
								local113 = 59;
							}
							if (local90 == local14.anInt186) {
								local119 = local14.anInt195;
							}
							Static453.method6150(local113, true, false, local80[local90].equalsIgnoreCase(Static417.aClass158_201.method3594(Static365.anInt6682)) ? local14.anInt167 : local119, -1, 0, (long) arg1.anInt1299, 0, local80[local90], "<col=ffff00>" + local34);
						}
					}
				}
				if (local14.aByte7 == 1 && local80 != null) {
					for (local90 = 4; local90 >= 0; local90--) {
						if (local80[local90] != null && local80[local90].equalsIgnoreCase(Static417.aClass158_201.method3594(Static365.anInt6682))) {
							@Pc(225) short local225 = 0;
							if (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348 < local14.anInt177) {
								local225 = 2000;
							}
							@Pc(238) short local238 = 0;
							if (local90 == 0) {
								local238 = 12;
							}
							if (local90 == 1) {
								local238 = 21;
							}
							if (local90 == 2) {
								local238 = 3;
							}
							if (local90 == 3) {
								local238 = 57;
							}
							if (local90 == 4) {
								local238 = 59;
							}
							if (local238 != 0) {
								local238 += local225;
							}
							Static453.method6150(local238, true, false, local14.anInt167, -1, 0, (long) arg1.anInt1299, 0, local80[local90], "<col=ffff00>" + local34);
						}
					}
				}
			}
			Static453.method6150(1010, true, arg0, Static321.anInt5962, -1, 0, (long) arg1.anInt1299, 0, Static417.aClass158_200.method3594(Static365.anInt6682), "<col=ffff00>" + local34);
		} else if (!arg0) {
			@Pc(345) Class13 local345 = Static181.anInt3937 == -1 ? null : Static53.aClass32_1.method724(Static181.anInt3937);
			if ((Static439.anInt7742 & 0x2) != 0 && (local345 == null || local14.method140(Static181.anInt3937, local345.anInt200) != local345.anInt200)) {
				Static453.method6150(5, true, false, Static263.anInt5067, -1, 0, (long) arg1.anInt1299, 0, Static1.aString1, Static90.aString17 + " -> <col=ffff00>" + local34);
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)Lclient!hh;")
	public static Class30_Sub4 method6163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass30_Sub4_2 == null ? null : local7.aClass30_Sub4_2;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILclient!hc;Lclient!hc;)V")
	public static void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30_Sub3 arg3, @OriginalArg(4) Class30_Sub3 arg4) {
		@Pc(4) Class252 local4 = Static412.method5598(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass30_Sub3_3 = arg3;
			local4.aClass30_Sub3_2 = arg4;
		}
	}
}
