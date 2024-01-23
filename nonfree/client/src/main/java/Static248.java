import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
	public static void method3817(@OriginalArg(1) boolean arg0) {
		Static238.anIntArray434 = new int[104];
		@Pc(6) byte local6;
		if (arg0) {
			local6 = 1;
		} else {
			local6 = 4;
		}
		Static289.anIntArray501 = new int[104];
		Static136.anIntArray221 = new int[104];
		Static245.aByteArrayArrayArray11 = new byte[local6][104][104];
		Static231.anIntArrayArrayArray12 = new int[local6][105][105];
		Static94.anIntArray145 = new int[104];
		Static128.anIntArray203 = new int[104];
		Static59.aByteArrayArrayArray8 = new byte[local6][104][104];
		Static195.anIntArray320 = new int[5];
		Static7.anInt134 = 99;
		Static208.aByteArrayArrayArray18 = new byte[local6][104][104];
		Static265.aByteArrayArrayArray19 = new byte[local6][104][104];
		Static301.aByteArrayArrayArray21 = new byte[local6][105][105];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!ph;)Z")
	public static boolean method3818(@OriginalArg(1) Class138 arg0) {
		return arg0.method3340(Static296.anInt5600);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public static void method3824(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub2 local12 = Static46.method824(4, arg0);
		local12.method299();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ph;B)V")
	public static void method3827(@OriginalArg(0) Class138 arg0) {
		Static85.aClass138_26 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBII)V")
	public static void method3828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static291.aBoolean404) {
			Static133.method2180(arg0, arg1, arg3 + arg0, arg1 - -arg2);
			Static133.method2176(arg0, arg1, arg3, arg2, 0);
		} else {
			Static41.method739(arg0, arg1, arg3 + arg0, arg2 + arg1);
			Static41.method730(arg0, arg1, arg3, arg2, 0);
		}
		if (Static191.anInt3924 < 100) {
			return;
		}
		@Pc(52) float local52 = (float) Static58.anInt2563 / (float) Static58.anInt2561;
		@Pc(54) int local54 = arg3;
		@Pc(56) int local56 = arg2;
		if (local52 < 1.0F) {
			local56 = (int) ((float) arg3 * local52);
		} else {
			local54 = (int) ((float) arg2 / local52);
		}
		@Pc(83) int local83 = arg0 + (arg3 - local54) / 2;
		if (Static176.aClass1_Sub1_Sub3_11 == null || Static176.aClass1_Sub1_Sub3_11.anInt5875 != arg3 || arg2 != Static176.aClass1_Sub1_Sub3_11.anInt5887) {
			@Pc(108) Class1_Sub1_Sub3_Sub2 local108 = new Class1_Sub1_Sub3_Sub2(arg3, arg2);
			Static41.method738(local108.anIntArray344, arg3, arg2);
			if (Static58.aClass1_Sub1_Sub8_2.anInt1052 != -1) {
				Static41.method730(0, 0, arg3, arg2, Static58.aClass1_Sub1_Sub8_2.anInt1052);
			}
			Static58.method2042(0, 0, Static58.anInt2561, Static58.anInt2563, 0, 0, local54, local56);
			Static58.method2044();
			if (Static291.aBoolean404) {
				Static176.aClass1_Sub1_Sub3_11 = new Class1_Sub1_Sub3_Sub1(local108);
			} else {
				Static176.aClass1_Sub1_Sub3_11 = local108;
			}
			if (Static291.aBoolean404) {
				Static41.anIntArray62 = null;
			} else {
				Static242.aClass62_1.method4468();
			}
		}
		@Pc(162) int local162 = arg1 + (arg2 - local56) / 2;
		Static176.aClass1_Sub1_Sub3_11.method4632(local83, local162);
		@Pc(172) int local172 = Static304.anInt5751 * local54 / Static58.anInt2561;
		@Pc(180) int local180 = Static270.anInt5144 * local54 / Static58.anInt2561 + local83;
		@Pc(189) int local189 = local162 + Static106.anInt2121 * local56 / Static58.anInt2563;
		@Pc(195) int local195 = Static5.anInt66 * local56 / Static58.anInt2563;
		@Pc(204) int local204 = 16711680;
		if (Static35.anInt641 == 1) {
			local204 = 16777215;
		}
		if (Static291.aBoolean404) {
			Static133.method2177(local180, local189, local172, local195, local204, 128);
			Static133.method2164(local180, local189, local172, local195, local204);
		} else {
			Static41.method728(local180, local189, local172, local195, local204, 128);
			Static41.method729(local180, local189, local172, local195, local204);
		}
		if (Static137.anInt2704 <= 0) {
			return;
		}
		@Pc(254) int local254;
		if (Static314.anInt5911 <= 50) {
			local254 = Static314.anInt5911 * 5;
		} else {
			local254 = (100 - Static314.anInt5911) * 5;
		}
		for (@Pc(268) Class1_Sub1_Sub10 local268 = (Class1_Sub1_Sub10) Static58.aClass5_11.method49(); local268 != null; local268 = (Class1_Sub1_Sub10) Static58.aClass5_11.method51()) {
			@Pc(276) Class81 local276 = Static50.method874(local268.anInt1638);
			if (Static288.method4283(local276)) {
				@Pc(295) int local295;
				@Pc(304) int local304;
				if (Static283.anInt5402 == local268.anInt1638) {
					local295 = local83 + local54 * local268.anInt1633 / Static58.anInt2561;
					local304 = local162 + local268.anInt1630 * local56 / Static58.anInt2563;
					if (Static291.aBoolean404) {
						Static133.method2177(local295 - 2, local304 + -2, 4, 4, 16776960, local254);
					} else {
						Static41.method728(local295 - 2, local304 + -2, 4, 4, 16776960, local254);
					}
				} else if (Static299.anInt5666 != -1 && Static299.anInt5666 == local276.anInt2195) {
					local295 = local83 + local54 * local268.anInt1633 / Static58.anInt2561;
					local304 = local268.anInt1630 * local56 / Static58.anInt2563 + local162;
					if (Static291.aBoolean404) {
						Static133.method2177(local295 - 2, local304 + -2, 4, 4, 16776960, local254);
					} else {
						Static41.method728(local295 - 2, local304 + -2, 4, 4, 16776960, local254);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IC)Z")
	public static boolean method3830(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
