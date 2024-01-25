import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString141 = "Please remove ";

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	public static int anInt3839 = 10;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!ii;Lclient!ps;II)V")
	public static void method3260(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class15 local10 = arg2.method4337(arg1);
		if (local10 == null) {
			return;
		}
		arg1.method4268(arg0, arg3, arg2.anInt4991 + arg0, arg2.anInt4935 + arg3);
		if (Static38.anInt3168 == 2 || Static38.anInt3168 == 5 || Static100.aClass8_14 == null) {
			arg1.method4244(local10, arg0, arg3);
			return;
		}
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(46) int local46;
		@Pc(55) int local55;
		if (Static246.anInt5156 == 4) {
			local58 = Static18.anInt355;
			local46 = (int) -Static143.aFloat21 & 0x3FFF;
			local55 = 4096;
			local49 = Static67.anInt1459;
		} else {
			local46 = Static86.anInt1648 + (int) -Static143.aFloat21 & 0x3FFF;
			local49 = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728;
			local55 = 4096 - Static260.anInt5347 * 16;
			local58 = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726;
		}
		@Pc(85) int local85 = local49 / 32 + 48 + 208 - Static43.anInt1151 * 2;
		@Pc(103) int local103 = Static260.anInt5348 * 4 + 48 - local58 / 32 - (Static260.anInt5348 + -104) * 2;
		Static100.aClass8_14.method4387((float) arg2.anInt4991 / 2.0F + (float) arg0, (float) arg3 + (float) arg2.anInt4935 / 2.0F, (float) local85, (float) local103, local55, local46 << 2, local10, arg0, arg3);
		@Pc(153) int local153;
		@Pc(163) int local163;
		@Pc(174) int local174;
		@Pc(185) int local185;
		for (@Pc(137) Class1_Sub14 local137 = (Class1_Sub14) Static85.aClass14_6.method302(); local137 != null; local137 = (Class1_Sub14) Static85.aClass14_6.method313()) {
			@Pc(142) int local142 = local137.anInt1474;
			local153 = (Static37.aClass129_1.anIntArray337[local142] >> 14 & 0x3FFF) - Static92.anInt1755;
			local163 = (Static37.aClass129_1.anIntArray337[local142] & 0x3FFF) - Static98.anInt1911;
			local174 = local153 * 4 + 2 - local49 / 32;
			local185 = local163 * 4 + 2 - local58 / 32;
			Static45.method925(local185, arg2, arg0, arg3, local10, Static37.aClass129_1.anIntArray336[local142], local174, arg1);
		}
		for (local153 = 0; local153 < Static73.anInt960; local153++) {
			local163 = Static142.anIntArray279[local153] * 4 + 2 - local49 / 32;
			local174 = Static322.anIntArray645[local153] * 4 + 2 - local58 / 32;
			@Pc(241) Class79 local241 = Static129.method2097(Static25.anIntArray26[local153]);
			if (local241.anIntArray161 != null) {
				local241 = local241.method1567();
				if (local241 == null || local241.anInt1895 == -1) {
					continue;
				}
			}
			Static45.method925(local174, arg2, arg0, arg3, local10, local241.anInt1895, local163, arg1);
		}
		for (@Pc(277) Class1_Sub17 local277 = (Class1_Sub17) Static98.aClass207_12.method5560(); local277 != null; local277 = (Class1_Sub17) Static98.aClass207_12.method5559()) {
			local174 = (int) (local277.aLong214 >> 28 & 0x3L);
			if (Static206.anInt4322 == local174) {
				local185 = (int) (local277.aLong214 & 0x3FFFL) * 4 + 2 - local49 / 32;
				@Pc(321) int local321 = (int) (local277.aLong214 >> 14 & 0x3FFFL) * 4 + 2 - local58 / 32;
				Static319.method2792(arg2, arg0, arg3, local185, Static83.aClass8Array5[0], local10, local321);
			}
		}
		@Pc(387) int local387;
		@Pc(396) int local396;
		for (local174 = 0; local174 < Static271.anInt5578; local174++) {
			@Pc(349) Class10_Sub1_Sub2_Sub1 local349 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local174]];
			if (local349 != null && local349.method680()) {
				@Pc(360) Class60 local360 = local349.aClass60_1;
				if (local360 != null && local360.anIntArray109 != null) {
					local360 = local360.method1274();
				}
				if (local360 != null && local360.aBoolean104 && local360.aBoolean103) {
					local387 = local349.anInt6728 / 32 - local49 / 32;
					local396 = local349.anInt6726 / 32 - local58 / 32;
					if (local360.anInt1500 == -1) {
						Static319.method2792(arg2, arg0, arg3, local387, Static83.aClass8Array5[1], local10, local396);
					} else {
						Static45.method925(local396, arg2, arg0, arg3, local10, local360.anInt1500, local387, arg1);
					}
				}
			}
		}
		@Pc(473) int local473;
		for (local185 = 0; local185 < Static167.anInt3454; local185++) {
			@Pc(442) Class10_Sub1_Sub2_Sub2 local442 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local185]];
			if (local442 != null && local442.method3418()) {
				local387 = local442.anInt6728 / 32 - local49 / 32;
				local396 = local442.anInt6726 / 32 - local58 / 32;
				@Pc(471) boolean local471 = false;
				for (local473 = 0; local473 < Static295.anInt5953; local473++) {
					if (local442.aString152.equals(Static301.aStringArray36[local473]) && Static311.anIntArray622[local473] != 0) {
						local471 = true;
						break;
					}
				}
				@Pc(496) boolean local496 = false;
				for (@Pc(498) int local498 = 0; local498 < Static244.anInt6205; local498++) {
					if (local442.aString152.equals(Static188.aClass189Array1[local498].aString223)) {
						local496 = true;
						break;
					}
				}
				@Pc(518) boolean local518 = false;
				if (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4096 != 0 && local442.anInt4096 != 0 && local442.anInt4096 == Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4096) {
					local518 = true;
				}
				if (local471) {
					Static319.method2792(arg2, arg0, arg3, local387, Static83.aClass8Array5[3], local10, local396);
				} else if (local496) {
					Static319.method2792(arg2, arg0, arg3, local387, Static83.aClass8Array5[5], local10, local396);
				} else if (local518) {
					Static319.method2792(arg2, arg0, arg3, local387, Static83.aClass8Array5[4], local10, local396);
				} else {
					Static319.method2792(arg2, arg0, arg3, local387, Static83.aClass8Array5[2], local10, local396);
				}
			}
		}
		@Pc(597) Class65[] local597 = Static11.aClass65Array4;
		@Pc(689) int local689;
		for (local387 = 0; local387 < local597.length; local387++) {
			@Pc(605) Class65 local605 = local597[local387];
			if (local605 != null && local605.anInt1591 != 0 && Static282.anInt3516 % 20 < 10) {
				@Pc(658) int local658;
				if (local605.anInt1591 == 1 && local605.anInt1595 >= 0 && local605.anInt1595 < Static178.aClass10_Sub1_Sub2_Sub1Array1.length) {
					@Pc(637) Class10_Sub1_Sub2_Sub1 local637 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local605.anInt1595];
					if (local637 != null) {
						local473 = local637.anInt6728 / 32 - local49 / 32;
						local658 = local637.anInt6726 / 32 - local58 / 32;
						Static281.method4987(local473, local10, local605.anInt1587, 360000, arg2, local658, arg0, arg3);
					}
				}
				if (local605.anInt1591 == 2) {
					local689 = (local605.anInt1592 - Static92.anInt1755) * 4 + 2 - local49 / 32;
					local473 = (-Static98.anInt1911 + local605.anInt1596) * 4 + 2 - local58 / 32;
					local658 = local605.anInt1594 * 4;
					local658 *= local658;
					Static281.method4987(local689, local10, local605.anInt1587, local658, arg2, local473, arg0, arg3);
				}
				if (local605.anInt1591 == 10 && local605.anInt1595 >= 0 && local605.anInt1595 < Static202.aClass10_Sub1_Sub2_Sub2Array1.length) {
					@Pc(746) Class10_Sub1_Sub2_Sub2 local746 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local605.anInt1595];
					if (local746 != null) {
						local473 = local746.anInt6728 / 32 - local49 / 32;
						local658 = local746.anInt6726 / 32 - local58 / 32;
						Static281.method4987(local473, local10, local605.anInt1587, 360000, arg2, local658, arg0, arg3);
					}
				}
			}
		}
		if (Static246.anInt5156 == 4) {
			return;
		}
		if (Static307.anInt6146 != 0) {
			local396 = Static307.anInt6146 * 4 + Static127.aClass10_Sub1_Sub2_Sub2_1.method3402() * 2 + 2 - local49 / 32 - 2;
			local689 = Static14.anInt229 * 4 + Static127.aClass10_Sub1_Sub2_Sub2_1.method3402() * 2 + 2 - local58 / 32 - 2;
			Static319.method2792(arg2, arg0, arg3, local396, Static189.aClass8Array14[Static324.aBoolean528 ? 1 : 0], local10, local689);
		}
		arg1.method4225(3, -1, 3, arg0 + arg2.anInt4991 / 2 - 1, arg3 + arg2.anInt4935 / 2 + -1);
	}
}
