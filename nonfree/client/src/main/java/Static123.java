import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "Lclient!pc;")
	public static Class87 aClass87_6;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	public static int anInt1748 = 0;

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "[Lclient!ib;")
	public static Class20_Sub4[] aClass20_Sub4Array3 = new Class20_Sub4[4];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!qh;III)V")
	public static void method1272(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static192.method3138();
		Static29.method406(arg2, arg0, arg2 + arg1.anInt3600, arg0 + arg1.anInt3620);
		if (Static214.anInt4249 == 2 || Static214.anInt4249 == 5 || Static184.aClass1_Sub1_Sub8_5 == null) {
			Static29.method417(arg2, arg0, arg1.anIntArray394, arg1.anIntArray398);
		} else {
			@Pc(49) int local49 = Static223.anInt4341 + Static104.anInt2068 & 0x7FF;
			@Pc(57) int local57 = 464 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
			@Pc(64) int local64 = Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32 + 48;
			((Class1_Sub1_Sub8_Sub1) Static184.aClass1_Sub1_Sub8_5).method2436(arg2, arg0, arg1.anInt3600, arg1.anInt3620, local64, local57, local49, Static106.anInt2129 + 256, arg1.anIntArray394, arg1.anIntArray398);
			@Pc(130) int local130;
			@Pc(112) int local112;
			@Pc(134) int local134;
			@Pc(138) int local138;
			@Pc(164) int local164;
			@Pc(175) int local175;
			@Pc(203) int local203;
			@Pc(235) int local235;
			if (Static6.aClass62_1 != null) {
				for (@Pc(87) int local87 = 0; local87 < Static6.aClass62_1.anInt2136; local87++) {
					if (Static6.aClass62_1.method1642(local87)) {
						local112 = (-Static101.anInt2041 + Static6.aClass62_1.aShortArray31[local87]) * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
						local130 = (Static6.aClass62_1.aShortArray32[local87] - Static91.anInt4078) * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
						local134 = Class120.anIntArray491[local49];
						local138 = Class120.anIntArray492[local49];
						@Pc(146) int local146 = local134 * 256 / (Static106.anInt2129 + 256);
						@Pc(154) int local154 = local138 * 256 / (Static106.anInt2129 + 256);
						local164 = local154 * local130 + local146 * local112 >> 16;
						local175 = local112 * local154 - local146 * local130 >> 16;
						@Pc(177) Class1_Sub1_Sub10 local177 = Static5.aClass1_Sub1_Sub10_1;
						if (Static6.aClass62_1.method1640(local87) == 1) {
							local177 = Static130.aClass1_Sub1_Sub10_2;
						}
						if (Static6.aClass62_1.method1640(local87) == 2) {
							local177 = Static187.aClass1_Sub1_Sub10_3;
						}
						local203 = local177.method1822(Static6.aClass62_1.aClass50Array38[local87], 100);
						local164 -= local203 / 2;
						if (local164 >= -arg1.anInt3600 && arg1.anInt3600 >= local164 && -arg1.anInt3620 <= local175 && arg1.anInt3620 >= local175) {
							local235 = 16777215;
							if (Static6.aClass62_1.anIntArray205[local87] != -1) {
								local235 = Static6.aClass62_1.anIntArray205[local87];
							}
							Static29.method418(arg1.anIntArray394, arg1.anIntArray398);
							local177.method1809(Static6.aClass62_1.aClass50Array38[local87], arg1.anInt3600 / 2 + local164 + arg2, arg0 + arg1.anInt3620 / 2 + -local175, local203, 50, local235, 0, 1, 0, 0);
							Static29.method422();
						}
					}
				}
			}
			for (local130 = 0; local130 < Static41.anInt881; local130++) {
				local112 = Static221.anIntArray498[local130] * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
				local134 = Static26.anIntArray53[local130] * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
				@Pc(328) Class18 local328 = Static148.method2487(Static3.anIntArray12[local130]);
				if (local328.anIntArray66 != null) {
					local328 = local328.method599();
					if (local328 == null || local328.anInt815 == -1) {
						continue;
					}
				}
				Static42.method672(local112, arg0, Static210.aClass1_Sub1_Sub8Array10[local328.anInt815], arg2, arg1, local134);
			}
			for (local112 = 0; local112 < 104; local112++) {
				for (local134 = 0; local134 < 104; local134++) {
					@Pc(379) Class75 local379 = Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local112][local134];
					if (local379 != null) {
						local164 = local112 * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
						local175 = local134 * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
						Static42.method672(local164, arg0, Static147.aClass1_Sub1_Sub8Array7[0], arg2, arg1, local175);
					}
				}
			}
			@Pc(478) int local478;
			for (local134 = 0; local134 < Static103.anInt2065; local134++) {
				@Pc(432) Class20_Sub3_Sub2 local432 = Static78.aClass20_Sub3_Sub2Array1[Static21.anIntArray44[local134]];
				if (local432 != null && local432.method2467()) {
					@Pc(441) Class105 local441 = local432.aClass105_1;
					if (local441 != null && local441.anIntArray443 != null) {
						local441 = local441.method3127();
					}
					if (local441 != null && local441.aBoolean179 && local441.aBoolean181) {
						local175 = local432.anInt3022 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
						local478 = local432.anInt3008 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
						Static42.method672(local175, arg0, Static147.aClass1_Sub1_Sub8Array7[1], arg2, arg1, local478);
					}
				}
			}
			for (local138 = 0; local138 < Static13.anInt250; local138++) {
				@Pc(502) Class20_Sub3_Sub1 local502 = Static232.aClass20_Sub3_Sub1Array1[Static52.anIntArray356[local138]];
				if (local502 != null && local502.method2467()) {
					local175 = local502.anInt3022 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
					local478 = local502.anInt3008 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
					@Pc(532) boolean local532 = false;
					@Pc(537) long local537 = local502.aClass50_493.method1221();
					for (@Pc(539) int local539 = 0; local539 < Static21.anInt420; local539++) {
						if (local537 == Static129.aLongArray6[local539] && Static206.anIntArray467[local539] != 0) {
							local532 = true;
							break;
						}
					}
					@Pc(565) boolean local565 = false;
					if (Static230.aClass20_Sub3_Sub1_3.anInt1496 != 0 && local502.anInt1496 != 0 && Static230.aClass20_Sub3_Sub1_3.anInt1496 == local502.anInt1496) {
						local565 = true;
					}
					if (local532) {
						Static42.method672(local175, arg0, Static147.aClass1_Sub1_Sub8Array7[3], arg2, arg1, local478);
					} else if (local565) {
						Static42.method672(local175, arg0, Static147.aClass1_Sub1_Sub8Array7[4], arg2, arg1, local478);
					} else {
						Static42.method672(local175, arg0, Static147.aClass1_Sub1_Sub8Array7[2], arg2, arg1, local478);
					}
				}
			}
			@Pc(629) Class64[] local629 = Static229.aClass64Array1;
			for (local175 = 0; local175 < local629.length; local175++) {
				@Pc(637) Class64 local637 = local629[local175];
				if (local637 != null && local637.anInt2222 != 0 && Static107.anInt2132 % 20 < 10) {
					@Pc(686) int local686;
					if (local637.anInt2222 == 1 && local637.anInt2223 >= 0 && local637.anInt2223 < Static78.aClass20_Sub3_Sub2Array1.length) {
						@Pc(673) Class20_Sub3_Sub2 local673 = Static78.aClass20_Sub3_Sub2Array1[local637.anInt2223];
						if (local673 != null) {
							local686 = local673.anInt3008 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
							local235 = local673.anInt3022 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
							Static233.method3522(arg2, local235, local686, arg1, arg0, local637.anInt2213);
						}
					}
					if (local637.anInt2222 == 2) {
						local203 = (local637.anInt2224 - Static91.anInt4078) * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
						local235 = (local637.anInt2214 - Static101.anInt2041) * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
						Static233.method3522(arg2, local203, local235, arg1, arg0, local637.anInt2213);
					}
					if (local637.anInt2222 == 10 && local637.anInt2223 >= 0 && Static232.aClass20_Sub3_Sub1Array1.length > local637.anInt2223) {
						@Pc(771) Class20_Sub3_Sub1 local771 = Static232.aClass20_Sub3_Sub1Array1[local637.anInt2223];
						if (local771 != null) {
							local235 = local771.anInt3022 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
							local686 = local771.anInt3008 / 32 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
							Static233.method3522(arg2, local235, local686, arg1, arg0, local637.anInt2213);
						}
					}
				}
			}
			if (Static163.anInt3375 != 0) {
				local478 = Static163.anInt3375 * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3022 / 32;
				local203 = Static66.anInt1298 * 4 + 2 - Static230.aClass20_Sub3_Sub1_3.anInt3008 / 32;
				Static42.method672(local478, arg0, Static35.aClass1_Sub1_Sub8_3, arg2, arg1, local203);
			}
			Static29.method423(arg2 + arg1.anInt3600 / 2 - 1, arg1.anInt3620 / 2 + arg0 - 1, 3, 3, 16777215);
		}
		Static222.aBooleanArray28[arg3] = true;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
	public static void method1273() {
		Static41.aClass84_17.method2585();
		Static182.aClass84_31.method2585();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method1274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static131.anInt2713 <= arg0 && Static135.anInt2790 >= arg0 && Static131.anInt2713 <= arg4 && Static135.anInt2790 >= arg4 && Static131.anInt2713 <= arg2 && Static135.anInt2790 >= arg2 && Static131.anInt2713 <= arg7 && Static135.anInt2790 >= arg7 && arg8 >= Static49.anInt1030 && Static177.anInt3701 >= arg8 && arg3 >= Static49.anInt1030 && Static177.anInt3701 >= arg3 && Static49.anInt1030 <= arg6 && Static177.anInt3701 >= arg6 && Static49.anInt1030 <= arg1 && Static177.anInt3701 >= arg1) {
			Static185.method3085(arg0, arg7, arg1, arg8, arg4, arg3, arg6, arg2, arg5);
		} else {
			Static153.method2556(arg8, arg6, arg7, arg0, arg5, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!hh;ILclient!hh;I)V")
	public static void method1275(@OriginalArg(0) Class50 arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) int arg2) {
		Static181.method2964(arg0, -1, arg1, arg2, null);
	}
}
