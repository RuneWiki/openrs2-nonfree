import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_59 = new Class265(32);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZIII)V")
	public static void method7467(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static129.aClass313ArrayArrayArray7 == null) {
			Static563.aClass143_13.method6252(arg2, arg4, -16777216, arg0, arg3);
		} else if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 >= 0 && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 < Static124.anInt2150 * 512 && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 >= 0 && Static64.anInt1015 * 512 > Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367) {
			Static219.anInt3472++;
			if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 != null && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 - (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() - 1) * 256 >> 9 == Static443.anInt7790 && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 + 256 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() * 256 >> 9 == Static154.anInt2536) {
				Static443.anInt7790 = -1;
				Static154.anInt2536 = -1;
				Static394.method5730();
			}
			Static658.method7910();
			if (!arg1) {
				Static600.method8105();
			}
			Static149.method2220();
			Static464.method6869(arg0, arg4, arg2, arg3, true);
			@Pc(109) int local109 = Static452.anInt7902;
			@Pc(111) int local111 = Static490.anInt8423;
			Static663.anInt10391 = Static663.anInt10392;
			@Pc(115) int local115 = Static398.anInt6905;
			@Pc(121) int local121 = Static520.anInt8703;
			@Pc(130) int local130;
			@Pc(165) int local165;
			if (Static133.anInt2254 == 1) {
				local130 = (int) Static329.aFloat117;
				if (local130 < Static609.anInt9838 >> 8) {
					local130 = Static609.anInt9838 >> 8;
				}
				if (Static322.aBooleanArray13[4] && Static559.anIntArray503[4] + 128 > local130) {
					local130 = Static559.anIntArray503[4] + 128;
				}
				local165 = (int) Static495.aFloat161 + Static312.anInt5536 & 0x3FFF;
				Static612.method8233(local165, (local130 >> 3) * 3 + 600 << 2, Static602.anInt9872, local115, Static171.anInt2825, local130, Static161.method1246(Static458.anInt7955, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366) - 200);
			} else if (Static133.anInt2254 == 4) {
				local130 = (int) Static329.aFloat117;
				if (Static609.anInt9838 >> 8 > local130) {
					local130 = Static609.anInt9838 >> 8;
				}
				if (Static322.aBooleanArray13[4] && local130 < Static559.anIntArray503[4] + 128) {
					local130 = Static559.anIntArray503[4] + 128;
				}
				local165 = (int) Static495.aFloat161 & 0x3FFF;
				Static612.method8233(local165, (local130 >> 3) * 3 + 600 << 2, Static602.anInt9872, local115, Static171.anInt2825, local130, Static161.method1246(Static458.anInt7955, Static170.anInt2808, Static476.anInt8263) - 200);
			} else if (Static133.anInt2254 == 5) {
				Static238.method3421(local115);
			}
			local130 = Static570.anInt9347;
			local165 = Static546.anInt8938;
			@Pc(270) int local270 = Static105.anInt1868;
			@Pc(272) int local272 = Static498.anInt8495;
			@Pc(274) int local274 = Static493.anInt8442;
			@Pc(316) int local316;
			for (@Pc(276) int local276 = 0; local276 < 5; local276++) {
				if (Static322.aBooleanArray13[local276]) {
					local316 = (int) ((double) (Static156.anIntArray137[local276] * 2 + 1) * Math.random() - (double) Static156.anIntArray137[local276] + Math.sin((double) Static229.anIntArray222[local276] / 100.0D * (double) Static118.anIntArray106[local276]) * (double) Static559.anIntArray503[local276]);
					if (local276 == 4) {
						Static498.anInt8495 += local316;
						if (Static498.anInt8495 < 1024) {
							Static498.anInt8495 = 1024;
						} else if (Static498.anInt8495 > 3072) {
							Static498.anInt8495 = 3072;
						}
					}
					if (local276 == 1) {
						Static546.anInt8938 += local316 << 2;
					}
					if (local276 == 2) {
						Static105.anInt1868 += local316 << 2;
					}
					if (local276 == 3) {
						Static493.anInt8442 = local316 + Static493.anInt8442 & 0x3FFF;
					}
					if (local276 == 0) {
						Static570.anInt9347 += local316 << 2;
					}
				}
			}
			if (Static570.anInt9347 < 0) {
				Static570.anInt9347 = 0;
			}
			if (Static105.anInt1868 < 0) {
				Static105.anInt1868 = 0;
			}
			if ((Static665.anInt7330 << 9) - 1 < Static570.anInt9347) {
				Static570.anInt9347 = (Static665.anInt7330 << 9) - 1;
			}
			if ((Static92.anInt1526 << 9) - 1 < Static105.anInt1868) {
				Static105.anInt1868 = (Static92.anInt1526 << 9) - 1;
			}
			Static489.method7159();
			Static194.method8417();
			Static563.aClass143_13.KA(local111, local121, local109 + local111, local121 - -local115);
			Static374.method6478(true);
			if (Static305.aBoolean315) {
				Static495.method7196(Static240.anInt3902);
				if (Static663.anInt10391 != Static490.anInt8424) {
					Static677.aBoolean794 = true;
				}
				Static490.anInt8424 = Static663.anInt10391;
			} else {
				Static563.aClass143_13.ya();
				local316 = Static240.anInt3902;
				if (Static366.aClass116_2 == null) {
					Static563.aClass143_13.GA(local316);
				} else {
					Static366.aClass116_2.method2425(local111, local121, local109, local316, Static493.anInt8442, Static635.anInt10119 << 3, local115, Static563.aClass143_13, Static498.anInt8495);
				}
			}
			Static491.method7177();
			Static108.aClass56_4.method8388(Static570.anInt9347, Static546.anInt8938, Static105.anInt1868, -Static498.anInt8495 & 0x3FFF, -Static493.anInt8442 & 0x3FFF, -Static78.anInt1274 & 0x3FFF);
			Static563.aClass143_13.method6222(Static108.aClass56_4);
			Static563.aClass143_13.DA(local109 / 2 + local111, local115 / 2 + local121, Static454.anInt7909 << 1, Static454.anInt7909 << 1);
			Static630.method8380(Static454.anInt7909 << 1, local115 / 2 + local121, local109 / 2 + local111, Static454.anInt7909 << 1);
			Static232.method3326(-Static78.anInt1274 & 0x3FFF, Static570.anInt9347, -Static498.anInt8495 & 0x3FFF, Static546.anInt8938, -Static493.anInt8442 & 0x3FFF, Static105.anInt1868);
			@Pc(561) byte local561 = Static655.aClass5_Sub36_29.aClass2_Sub21_1.method7492() == 2 ? (byte) Static219.anInt3472 : 1;
			if (Static305.aBoolean315) {
				Static277.method3849(-Static493.anInt8442 & 0x3FFF, -Static498.anInt8495 & 0x3FFF, -Static78.anInt1274 & 0x3FFF);
				Static465.method6889(Static655.aClass5_Sub36_29.aClass2_Sub20_1.method7359() == 0, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 >> 9, Static664.aByteArrayArrayArray18, Static105.anInt1868, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 + 1, Static663.anInt10391, Static421.anInt7434, local561, Static553.anIntArray494, Static48.anIntArray53, Static196.anIntArray177, Static571.anIntArray514, Static655.anIntArray597, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 >> 9, Static546.anInt8938, Static570.anInt9347);
			} else {
				Static126.method1978(Static421.anInt7434, Static570.anInt9347, Static546.anInt8938, Static105.anInt1868, Static664.aByteArrayArrayArray18, Static48.anIntArray53, Static553.anIntArray494, Static571.anIntArray514, Static196.anIntArray177, Static655.anIntArray597, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 + 1, local561, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 >> 9, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 >> 9, Static655.aClass5_Sub36_29.aClass2_Sub20_1.method7359() == 0, Static426.aBoolean555 ? Static663.anInt10391 : -1, 0, false);
			}
			Static491.method7177();
			if (Static539.anInt8853 == 10) {
				Static53.method3581(local111, local121, local109, local115);
				Static112.method1804(local109, local111, local121, local115);
				Static357.method5269(local121, local111, local109, local115);
				Static3.method42(local109, local111, local121, local115);
			}
			Static28.method383();
			Static570.anInt9347 = local130;
			Static493.anInt8442 = local274;
			Static546.anInt8938 = local165;
			Static498.anInt8495 = local272;
			Static105.anInt1868 = local270;
			if (Static433.aBoolean562 && Static589.aClass288_3.method7049() == 0) {
				Static433.aBoolean562 = false;
			}
			if (Static433.aBoolean562) {
				Static563.aClass143_13.method6252(local121, local111, -16777216, local115, local109);
				Static193.method2763(Static364.aClass198_8, Static5.aClass72_1, Static563.aClass143_13, false, Static49.aClass42_12.method730(Static259.anInt4113));
			}
			Static374.method6478(false);
		} else {
			Static563.aClass143_13.method6252(arg2, arg4, -16777216, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BC)I")
	public static int method7468(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class5_Sub5_Sub12.anIntArray573.length ? Class5_Sub5_Sub12.anIntArray573[arg0] : -1;
	}
}
