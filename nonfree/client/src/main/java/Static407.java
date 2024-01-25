import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!un", name = "l", descriptor = "[Lclient!kf;")
	public static Class78_Sub1[] aClass78_Sub1Array2;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "I")
	public static int anInt6723;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt6710 = 0;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "[I")
	public static final int[] anIntArray513 = new int[4096];

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	public static int anInt6719 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IBIZII)V")
	public static void method5247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static202.aClass164ArrayArrayArray5 == null) {
			Static122.aClass19_16.method4293(arg0, arg1, arg3, -16777216, arg4);
		} else if (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >= 0 && Static326.anInt5666 * 128 > Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 && Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >= 0 && Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 < Static283.anInt5187 * 128) {
			Static361.anInt6264++;
			if (Static1.aClass16_Sub1_Sub5_Sub1_1 != null && Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 - (Static1.aClass16_Sub1_Sub5_Sub1_1.method4751() - 1) * 64 >> 7 == Static343.anInt771 && Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 - (Static1.aClass16_Sub1_Sub5_Sub1_1.method4751() - 1) * 64 >> 7 == Static60.anInt1094) {
				Static343.anInt771 = -1;
				Static60.anInt1094 = -1;
				Static75.method1365();
			}
			Static137.method2357();
			if (!arg2) {
				Static96.method1683();
			}
			Static449.method5654();
			Static276.method878(arg3, arg1, arg0, true, arg4);
			@Pc(113) int local113 = Static329.anInt5685;
			@Pc(115) int local115 = Static119.anInt2527;
			@Pc(117) int local117 = Static120.anInt2574;
			@Pc(119) int local119 = Static120.anInt2600;
			@Pc(127) int local127;
			@Pc(164) int local164;
			if (Static111.anInt2386 == 1) {
				local127 = (int) Static164.aFloat142;
				if (Static149.anInt3012 >> 8 > local127) {
					local127 = Static149.anInt3012 >> 8;
				}
				if (Static342.aBooleanArray17[4] && Static41.anIntArray46[4] + 128 > local127) {
					local127 = Static41.anIntArray46[4] + 128;
				}
				local164 = (int) Static368.aFloat192 + Static273.anInt5119 & 0x3FFF;
				Static195.method3072(Static394.anInt6578, (local127 >> 3) * 3 + 600 << 0, Static325.anInt5636, local164, Static13.method135(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893, Static263.anInt4963, Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892) - 50, local115, local127);
			} else if (Static111.anInt2386 == 4) {
				local127 = (int) Static164.aFloat142;
				if (Static149.anInt3012 >> 8 > local127) {
					local127 = Static149.anInt3012 >> 8;
				}
				if (Static342.aBooleanArray17[4] && local127 < Static41.anIntArray46[4] + 128) {
					local127 = Static41.anIntArray46[4] + 128;
				}
				local164 = (int) Static368.aFloat192 & 0x3FFF;
				Static195.method3072(Static394.anInt6578, (local127 >> 3) * 3 + 600 << 0, Static325.anInt5636, local164, Static13.method135(Static428.anInt7059, Static263.anInt4963, Static452.anInt7360) - 50, local115, local127);
			} else if (Static111.anInt2386 == 5) {
				Static153.method2610(local115);
			}
			local127 = Static163.anInt3197;
			local164 = Static100.anInt2024;
			@Pc(276) int local276 = Static145.anInt2906;
			@Pc(278) int local278 = Static431.anInt7074;
			@Pc(280) int local280 = Static136.anInt2790;
			@Pc(323) int local323;
			for (@Pc(282) int local282 = 0; local282 < 5; local282++) {
				if (Static342.aBooleanArray17[local282]) {
					local323 = (int) (Math.random() * (double) (Static105.anIntArray161[local282] * 2 + 1) - (double) Static105.anIntArray161[local282] + Math.sin((double) Static61.anIntArray65[local282] / 100.0D * (double) Static390.anIntArray486[local282]) * (double) Static41.anIntArray46[local282]);
					if (local282 == 3) {
						Static136.anInt2790 = Static136.anInt2790 + local323 & 0x3FFF;
					}
					if (local282 == 1) {
						Static100.anInt2024 += local323;
					}
					if (local282 == 0) {
						Static163.anInt3197 += local323;
					}
					if (local282 == 4) {
						Static431.anInt7074 += local323;
						if (Static431.anInt7074 < 1024) {
							Static431.anInt7074 = 1024;
						} else if (Static431.anInt7074 > 3072) {
							Static431.anInt7074 = 3072;
						}
					}
					if (local282 == 2) {
						Static145.anInt2906 += local323;
					}
				}
			}
			if (Static163.anInt3197 < 0) {
				Static163.anInt3197 = 0;
			}
			if (Static163.anInt3197 > (Static422.anInt6945 << 7) - 1) {
				Static163.anInt3197 = (Static422.anInt6945 << 7) - 1;
			}
			if (Static145.anInt2906 < 0) {
				Static145.anInt2906 = 0;
			}
			if ((Static171.anInt3361 << 7) - 1 < Static145.anInt2906) {
				Static145.anInt2906 = (Static171.anInt3361 << 7) - 1;
			}
			Static240.method5677();
			Static248.method3623();
			Static122.aClass19_16.OA(local119, local117, local119 + local113, local117 + local115);
			Static122.aClass19_16.method4266();
			local323 = Static352.anInt6110;
			if (Static10.aClass242_1 == null) {
				Static122.aClass19_16.p(local323);
			} else {
				Static10.aClass242_1.method5255(Static100.anInt2023 << 3, local119, local117, Static136.anInt2790, Static431.anInt7074, Static122.aClass19_16, local113, local323, local115);
			}
			Static159.method2701();
			Static111.aClass31_1.s(Static163.anInt3197, Static100.anInt2024, Static145.anInt2906, -Static431.anInt7074 & 0x3FFF, -Static136.anInt2790 & 0x3FFF, -Static103.anInt2070 & 0x3FFF);
			Static122.aClass19_16.ea(Static111.aClass31_1);
			Static122.aClass19_16.H(local113 / 2 + local119, local117 + local115 / 2, Static219.anInt6458 << 1, Static219.anInt6458 << 1);
			Static100.method1772(Static219.anInt6458 << 1, local113 / 2 + local119, local115 / 2 + local117, Static219.anInt6458 << 1);
			Static446.method5621(-Static136.anInt2790 & 0x3FFF, -Static103.anInt2070 & 0x3FFF, Static163.anInt3197, Static145.anInt2906, -Static431.anInt7074 & 0x3FFF, Static100.anInt2024);
			@Pc(548) byte local548 = Static323.aClass50_Sub1_1.method2858(Static177.anInt2973) == 2 ? (byte) Static361.anInt6264 : 1;
			Static90.method1610(Static122.aClass19_16, Static24.anInt5323, Static218.anInt4043, Static111.aClass31_1, Static163.anInt3197, Static100.anInt2024, Static145.anInt2906, Static12.aByteArrayArrayArray1, Static306.anIntArray360, Static21.anIntArray19, Static443.anIntArray549, Static316.anIntArray376, Static52.anIntArray53, Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 + 1, local548, Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7, Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7, !Static323.aClass50_Sub1_1.aBoolean295);
			Static159.method2701();
			if (Static403.anInt6667 == 30) {
				Static142.method2429(local115, local117, local113, local119);
				Static377.method4027(local113, local117, local119, local115);
				Static325.method4395(local117, local113, local115, local119);
				Static309.method4157(local115, local113, local119, local117);
			}
			Static276.method873();
			Static163.anInt3197 = local127;
			Static100.anInt2024 = local164;
			Static145.anInt2906 = local276;
			Static136.anInt2790 = local280;
			Static431.anInt7074 = local278;
			if (Static439.aBoolean676 && Static261.aClass255_2.method5469() == 0) {
				Static439.aBoolean676 = false;
			}
			if (Static439.aBoolean676) {
				Static122.aClass19_16.method4293(local119, local113, local117, -16777216, local115);
				Static436.method5519(false, Static439.aClass83_148.method2267(Static178.anInt3423), Static207.aClass46_9);
			}
		} else {
			Static122.aClass19_16.method4293(arg0, arg1, arg3, -16777216, arg4);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIBZIZI)V")
	public static void method5249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg3) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) Class78_Sub1 local24 = Static392.aClass78_Sub1Array1[local18];
		Static392.aClass78_Sub1Array1[local18] = Static392.aClass78_Sub1Array1[arg3];
		Static392.aClass78_Sub1Array1[arg3] = local24;
		for (@Pc(36) int local36 = arg0; local36 < arg3; local36++) {
			if (Static308.method4155(arg5, Static392.aClass78_Sub1Array1[local36], arg2, local24, arg1, arg4) <= 0) {
				@Pc(56) Class78_Sub1 local56 = Static392.aClass78_Sub1Array1[local36];
				Static392.aClass78_Sub1Array1[local36] = Static392.aClass78_Sub1Array1[local20];
				Static392.aClass78_Sub1Array1[local20++] = local56;
			}
		}
		Static392.aClass78_Sub1Array1[arg3] = Static392.aClass78_Sub1Array1[local20];
		Static392.aClass78_Sub1Array1[local20] = local24;
		method5249(arg0, arg1, arg2, local20 - 1, arg4, arg5);
		method5249(local20 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Lclient!kf;")
	public static Class78_Sub1 method5250() {
		Static341.anInt6617 = 0;
		return Static281.method3960();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)I")
	public static int method5252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(DB)V")
	public static void method5254(@OriginalArg(0) double arg0) {
		if (Static72.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static397.anIntArray45[local7] = local19 <= 255 ? local19 : 255;
		}
		Static72.aDouble1 = arg0;
	}
}
