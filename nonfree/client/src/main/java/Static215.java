import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
	public static int anInt4065;

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
	public static int anInt4079;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(JLclient!qa;I)V")
	public static void method3475(@OriginalArg(0) long arg0, @OriginalArg(1) Class62 arg1) {
		Static380.anInt6972 = 0;
		Static252.anInt5082 = Static81.anInt1560;
		Static81.anInt1560 = 0;
		@Pc(14) long local14 = Static105.method2132();
		for (@Pc(21) Class30_Sub7 local21 = (Class30_Sub7) Static84.aClass77_5.method2157(); local21 != null; local21 = (Class30_Sub7) Static84.aClass77_5.method2160()) {
			if (local21.method5911(arg1, arg0)) {
				Static380.anInt6972++;
			}
		}
		if (Static269.aBoolean482 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static84.aClass77_5.method2162() + ", running: " + Static380.anInt6972 + ". Particles: " + Static81.anInt1560 + ". Time taken: " + (Static105.method2132() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!qa;Lclient!cea;IIIII)V")
	public static void method3478(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static460.anInt7893) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static374.anInt6925) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static430.anInt7565 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class37 local62 = Static152.aClass37ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static248.aClass131Array4[local17].ba(local23, local32) + Static248.aClass131Array4[local17].ba(local23 + 1, local32) + Static248.aClass131Array4[local17].ba(local23, local32 + 1) + Static248.aClass131Array4[local17].ba(local23 + 1, local32 + 1)) / 4 - (Static248.aClass131Array4[arg2].ba(arg3, arg4) + Static248.aClass131Array4[arg2].ba(arg3 + 1, arg4) + Static248.aClass131Array4[arg2].ba(arg3, arg4 + 1) + Static248.aClass131Array4[arg2].ba(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class15_Sub3 local143 = local62.aClass15_Sub3_3;
									@Pc(146) Class15_Sub3 local146 = local62.aClass15_Sub3_2;
									if (local143 != null && local143.method6861()) {
										arg1.method6859(local1, local140, arg0, (local23 - arg3) * Static58.anInt1202 + (1 - arg5) * Static261.anInt5167, (local32 - arg4) * Static58.anInt1202 + (1 - arg6) * Static261.anInt5167, local143);
									}
									if (local146 != null && local146.method6861()) {
										arg1.method6859(local1, local140, arg0, (local23 - arg3) * Static58.anInt1202 + (1 - arg5) * Static261.anInt5167, (local32 - arg4) * Static58.anInt1202 + (1 - arg6) * Static261.anInt5167, local146);
									}
									for (@Pc(219) Class108 local219 = local62.aClass108_1; local219 != null; local219 = local219.aClass108_3) {
										@Pc(223) Class15_Sub2 local223 = local219.aClass15_Sub2_1;
										if (local223 != null && local223.method6861() && (local23 == local223.aShort110 || local23 == local3) && (local32 == local223.aShort109 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort111 + 1 - local223.aShort110;
											@Pc(260) int local260 = local223.aShort108 + 1 - local223.aShort109;
											arg1.method6859(local1, local140, arg0, (local223.aShort110 - arg3) * Static58.anInt1202 + (local252 - arg5) * Static261.anInt5167, (local223.aShort109 - arg4) * Static58.anInt1202 + (local260 - arg6) * Static261.anInt5167, local223);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZIIIII)V")
	public static void method3483(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static152.aClass37ArrayArrayArray1 == null) {
			Static110.aClass62_15.method7040(-16777216, arg2, arg1, arg3, arg4);
		} else if (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >= 0 && Static460.anInt7894 * 128 > Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 && Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >= 0 && Static235.anInt4493 * 128 > Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493) {
			Static314.anInt4188++;
			if (Static35.aClass15_Sub2_Sub1_Sub1_1 != null && Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 - (Static35.aClass15_Sub2_Sub1_Sub1_1.method4035() - 1) * 64 >> 7 == Static384.anInt7374 && Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 - (Static35.aClass15_Sub2_Sub1_Sub1_1.method4035() - 1) * 64 >> 7 == Static40.anInt919) {
				Static40.anInt919 = -1;
				Static384.anInt7374 = -1;
				Static111.method2212();
			}
			Static272.method4493();
			if (!arg0) {
				Static223.method3540();
			}
			Static101.method2098();
			Static155.method2830(arg4, arg1, arg3, true, arg2);
			@Pc(115) int local115 = Static482.anInt8344;
			@Pc(117) int local117 = Static299.anInt5952;
			@Pc(119) int local119 = Static540.anInt9077;
			@Pc(121) int local121 = Static534.anInt9003;
			@Pc(134) int local134;
			@Pc(165) int local165;
			if (Static166.anInt3343 == 1) {
				local134 = (int) Static535.aFloat364;
				if (local134 < Static281.anInt5474 >> 8) {
					local134 = Static281.anInt5474 >> 8;
				}
				if (Static494.aBooleanArray35[4] && Static374.anIntArray512[4] + 128 > local134) {
					local134 = Static374.anIntArray512[4] + 128;
				}
				local165 = Static297.anInt7034 + (int) Static476.aFloat339 & 0x3FFF;
				Static386.method3041(Static387.anInt7017, local119, local165, Static191.method5464(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493, Static367.anInt6860) - 50, Static66.anInt1272, (local134 >> 3) * 3 + 600 << 0, local134);
			} else if (Static166.anInt3343 == 4) {
				local134 = (int) Static535.aFloat364;
				if (local134 < Static281.anInt5474 >> 8) {
					local134 = Static281.anInt5474 >> 8;
				}
				if (Static494.aBooleanArray35[4] && Static374.anIntArray512[4] + 128 > local134) {
					local134 = Static374.anIntArray512[4] + 128;
				}
				local165 = (int) Static476.aFloat339 & 0x3FFF;
				Static386.method3041(Static387.anInt7017, local119, local165, Static191.method5464(Static409.anInt7303, Static433.anInt7633, Static367.anInt6860) - 50, Static66.anInt1272, (local134 >> 3) * 3 + 600 << 0, local134);
			} else if (Static166.anInt3343 == 5) {
				Static530.method7240(local119);
			}
			local134 = Static367.anInt6861;
			local165 = Static182.anInt3520;
			@Pc(270) int local270 = Static364.anInt6817;
			@Pc(272) int local272 = Static180.anInt3500;
			@Pc(274) int local274 = Static141.anInt2910;
			@Pc(317) int local317;
			for (@Pc(276) int local276 = 0; local276 < 5; local276++) {
				if (Static494.aBooleanArray35[local276]) {
					local317 = (int) ((double) (Static456.anIntArray599[local276] * 2 + 1) * Math.random() - (double) Static456.anIntArray599[local276] + Math.sin((double) Static93.anIntArray185[local276] * ((double) Static530.anIntArray683[local276] / 100.0D)) * (double) Static374.anIntArray512[local276]);
					if (local276 == 0) {
						Static367.anInt6861 += local317 << 0;
					}
					if (local276 == 4) {
						Static180.anInt3500 += local317;
						if (Static180.anInt3500 < 1024) {
							Static180.anInt3500 = 1024;
						} else if (Static180.anInt3500 > 3072) {
							Static180.anInt3500 = 3072;
						}
					}
					if (local276 == 1) {
						Static182.anInt3520 += local317 << 0;
					}
					if (local276 == 3) {
						Static141.anInt2910 = Static141.anInt2910 + local317 & 0x3FFF;
					}
					if (local276 == 2) {
						Static364.anInt6817 += local317 << 0;
					}
				}
			}
			if (Static367.anInt6861 < 0) {
				Static367.anInt6861 = 0;
			}
			if (Static367.anInt6861 > (Static374.anInt6925 << 7) - 1) {
				Static367.anInt6861 = (Static374.anInt6925 << 7) - 1;
			}
			if (Static364.anInt6817 < 0) {
				Static364.anInt6817 = 0;
			}
			if (Static364.anInt6817 > (Static430.anInt7565 << 7) - 1) {
				Static364.anInt6817 = (Static430.anInt7565 << 7) - 1;
			}
			Static234.method3851();
			Static167.method2981();
			Static110.aClass62_15.N(local121, local117, local115 + local121, local117 - -local119);
			Static110.aClass62_15.method6999();
			local317 = Static174.anInt3441;
			if (Static514.aClass82_1 == null) {
				Static110.aClass62_15.Z(local317);
			} else {
				Static514.aClass82_1.method2239(local117, Static458.anInt7886 << 3, Static110.aClass62_15, local121, Static141.anInt2910, local115, local119, local317, Static180.anInt3500);
			}
			Static485.method6727();
			Static267.aClass78_3.B(Static367.anInt6861, Static182.anInt3520, Static364.anInt6817, -Static180.anInt3500 & 0x3FFF, -Static141.anInt2910 & 0x3FFF, -Static530.anInt8939 & 0x3FFF);
			Static110.aClass62_15.method7068(Static267.aClass78_3);
			Static110.aClass62_15.b(local115 / 2 + local121, local117 + local119 / 2, Static497.anInt9140 << 1, Static497.anInt9140 << 1);
			Static409.method5944(local119 / 2 + local117, Static497.anInt9140 << 1, Static497.anInt9140 << 1, local115 / 2 + local121);
			Static200.method3289(Static367.anInt6861, Static364.anInt6817, -Static530.anInt8939 & 0x3FFF, -Static141.anInt2910 & 0x3FFF, -Static180.anInt3500 & 0x3FFF, Static182.anInt3520);
			@Pc(558) byte local558 = Static300.aClass5_Sub28_Sub1_1.method4129(Static17.anInt459) == 2 ? (byte) Static314.anInt4188 : 1;
			Static85.method1488(Static110.aClass62_15, Static481.anInt8318, Static453.anInt7860, Static267.aClass78_3, Static367.anInt6861, Static182.anInt3520, Static364.anInt6817, Static203.aByteArrayArrayArray7, Static253.anIntArray659, Static30.anIntArray47, Static223.anIntArray287, Static53.anIntArray154, Static254.anIntArray687, Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 + 1, local558, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7, !Static300.aClass5_Sub28_Sub1_1.aBoolean324);
			Static485.method6727();
			if (Static389.anInt7024 == 9) {
				Static174.method3027(local121, local119, local115, local117);
				Static423.method6076(local119, local121, local115, local117);
				Static170.method3011(local119, local121, local117, local115);
				Static402.method5843(local119, local117, local115, local121);
			}
			Static82.method1443();
			Static141.anInt2910 = local274;
			Static367.anInt6861 = local134;
			Static180.anInt3500 = local272;
			Static182.anInt3520 = local165;
			Static364.anInt6817 = local270;
			if (Static217.aBoolean247 && Static301.aClass55_3.method1333() == 0) {
				Static217.aBoolean247 = false;
			}
			if (Static217.aBoolean247) {
				Static110.aClass62_15.method7040(-16777216, local119, local117, local121, local115);
				Static513.method7097(Static6.aClass40_2.method1063(Static194.anInt3737), Static492.aClass13_3, false);
			}
		} else {
			Static110.aClass62_15.method7040(-16777216, arg2, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([FBI)[F")
	public static float[] method3484(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static553.method2533(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
