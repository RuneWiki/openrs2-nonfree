import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	public static int anInt3653 = 0;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Ljava/lang/String;")
	public static final String aString155 = "scroll:";

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
	public static int anInt3658 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!mb;IILclient!ja;)V")
	public static void method3596(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class81 arg3) {
		@Pc(12) Class74 local12 = arg0.method3534(arg3);
		if (local12 == null) {
			return;
		}
		arg3.method3033(arg2, arg1, arg0.anInt3507 + arg2, arg0.anInt3503 + arg1);
		if (Static340.anInt657 == 2 || Static340.anInt657 == 5 || Static296.aClass40_18 == null) {
			arg3.method3047(local12, arg2, arg1);
			return;
		}
		@Pc(63) int local63;
		@Pc(53) int local53;
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (Static334.anInt6112 == 4) {
			local60 = 4096;
			local63 = Static10.anInt187;
			local53 = Static277.anInt5293;
			local50 = (int) -Static117.aFloat58 & 0x3FFF;
		} else {
			local50 = (int) -Static117.aFloat58 + Static345.anInt6260 & 0x3FFF;
			local53 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339;
			local60 = 4096 - Static279.anInt5302 * 16;
			local63 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340;
		}
		@Pc(90) int local90 = local63 / 32 + 208 + 48 - Static153.anInt2883 * 2;
		@Pc(107) int local107 = Static246.anInt4606 * 4 + 208 + 48 - Static246.anInt4606 * 2 - local53 / 32;
		Static296.aClass40_18.method5079((float) arg2 + (float) arg0.anInt3507 / 2.0F, (float) arg1 + (float) arg0.anInt3503 / 2.0F, (float) local90, (float) local107, local60, local50 << 2, local12, arg2, arg1);
		@Pc(157) int local157;
		@Pc(167) int local167;
		@Pc(177) int local177;
		@Pc(188) int local188;
		for (@Pc(141) Class6_Sub43 local141 = (Class6_Sub43) Static280.aClass211_33.method5594(); local141 != null; local141 = (Class6_Sub43) Static280.aClass211_33.method5582()) {
			@Pc(146) int local146 = local141.anInt6289;
			local157 = (Static37.aClass41_1.anIntArray111[local146] >> 14 & 0x3FFF) - Static44.anInt881;
			local167 = (Static37.aClass41_1.anIntArray111[local146] & 0x3FFF) - Static300.anInt5672;
			local177 = local157 * 4 + 2 - local63 / 32;
			local188 = local167 * 4 + 2 - local53 / 32;
			Static99.method5557(local12, arg0, arg1, local188, local177, arg3, Static37.aClass41_1.anIntArray110[local146], arg2);
		}
		for (local157 = 0; local157 < Static171.anInt3184; local157++) {
			local167 = Static284.anIntArray578[local157] * 4 + 2 - local63 / 32;
			local177 = Static95.anIntArray245[local157] * 4 + 2 - local53 / 32;
			@Pc(246) Class66 local246 = Static196.method3622(Static132.anIntArray316[local157]);
			if (local246.anIntArray162 != null) {
				local246 = local246.method1373();
				if (local246 == null || local246.anInt1458 == -1) {
					continue;
				}
			}
			Static99.method5557(local12, arg0, arg1, local177, local167, arg3, local246.anInt1458, arg2);
		}
		for (@Pc(288) Class6_Sub8 local288 = (Class6_Sub8) Static33.aClass108_3.method2903(); local288 != null; local288 = (Class6_Sub8) Static33.aClass108_3.method2905()) {
			local177 = (int) (local288.aLong218 >> 28 & 0x3L);
			if (Static238.anInt5126 == local177) {
				local188 = (int) (local288.aLong218 & 0x3FFFL) * 4 + 2 - local63 / 32;
				@Pc(337) int local337 = (int) (local288.aLong218 >> 14 & 0x3FFFL) * 4 + 2 - local53 / 32;
				Static5.method96(arg0, Static98.aClass40Array17[0], local188, arg1, arg2, local337, local12);
			}
		}
		@Pc(401) int local401;
		@Pc(411) int local411;
		for (local177 = 0; local177 < Static149.anInt2759; local177++) {
			@Pc(365) Class44_Sub4_Sub4_Sub2 local365 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local177]];
			if (local365 != null && local365.method4728()) {
				@Pc(374) Class18 local374 = local365.aClass18_1;
				if (local374 != null && local374.anIntArray37 != null) {
					local374 = local374.method369();
				}
				if (local374 != null && local374.aBoolean28 && local374.aBoolean34) {
					local401 = local365.anInt6340 / 32 - local63 / 32;
					local411 = local365.anInt6339 / 32 - local53 / 32;
					if (local374.anInt397 == -1) {
						Static5.method96(arg0, Static98.aClass40Array17[1], local401, arg1, arg2, local411, local12);
					} else {
						Static99.method5557(local12, arg0, arg1, local411, local401, arg3, local374.anInt397, arg2);
					}
				}
			}
		}
		@Pc(490) int local490;
		for (local188 = 0; local188 < Static200.anInt3712; local188++) {
			@Pc(458) Class44_Sub4_Sub4_Sub1 local458 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local188]];
			if (local458 != null && local458.method4476()) {
				local401 = local458.anInt6340 / 32 - local63 / 32;
				local411 = local458.anInt6339 / 32 - local53 / 32;
				@Pc(488) boolean local488 = false;
				for (local490 = 0; local490 < Static57.anInt1094; local490++) {
					if (local458.aString207.equals(Static86.aStringArray11[local490]) && Static31.anIntArray63[local490] != 0) {
						local488 = true;
						break;
					}
				}
				@Pc(516) boolean local516 = false;
				for (@Pc(518) int local518 = 0; local518 < Static61.anInt1127; local518++) {
					if (local458.aString207.equals(Static233.aClass183Array1[local518].aString231)) {
						local516 = true;
						break;
					}
				}
				@Pc(542) boolean local542 = false;
				if (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4918 != 0 && local458.anInt4918 != 0 && local458.anInt4918 == Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4918) {
					local542 = true;
				}
				if (local488) {
					Static5.method96(arg0, Static98.aClass40Array17[3], local401, arg1, arg2, local411, local12);
				} else if (local516) {
					Static5.method96(arg0, Static98.aClass40Array17[5], local401, arg1, arg2, local411, local12);
				} else if (local542) {
					Static5.method96(arg0, Static98.aClass40Array17[4], local401, arg1, arg2, local411, local12);
				} else {
					Static5.method96(arg0, Static98.aClass40Array17[2], local401, arg1, arg2, local411, local12);
				}
			}
		}
		@Pc(627) Class154[] local627 = Static330.aClass154Array1;
		@Pc(731) int local731;
		for (local401 = 0; local401 < local627.length; local401++) {
			@Pc(635) Class154 local635 = local627[local401];
			if (local635 != null && local635.anInt4211 != 0 && Static76.anInt2853 % 20 < 10) {
				@Pc(697) int local697;
				if (local635.anInt4211 == 1 && local635.anInt4206 >= 0 && Static239.aClass44_Sub4_Sub4_Sub2Array8.length > local635.anInt4206) {
					@Pc(676) Class44_Sub4_Sub4_Sub2 local676 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local635.anInt4206];
					if (local676 != null) {
						local490 = local676.anInt6340 / 32 - local63 / 32;
						local697 = local676.anInt6339 / 32 - local53 / 32;
						Static165.method5488(arg1, local635.anInt4219, arg2, local697, 360000, local490, arg0, local12);
					}
				}
				if (local635.anInt4211 == 2) {
					local731 = (local635.anInt4208 - Static44.anInt881) * 4 + 2 - local63 / 32;
					local490 = (local635.anInt4212 - Static300.anInt5672) * 4 + 2 - local53 / 32;
					local697 = local635.anInt4204 * 4;
					local697 *= local697;
					Static165.method5488(arg1, local635.anInt4219, arg2, local490, local697, local731, arg0, local12);
				}
				if (local635.anInt4211 == 10 && local635.anInt4206 >= 0 && local635.anInt4206 < Static343.aClass44_Sub4_Sub4_Sub1Array1.length) {
					@Pc(791) Class44_Sub4_Sub4_Sub1 local791 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local635.anInt4206];
					if (local791 != null) {
						local490 = local791.anInt6340 / 32 - local63 / 32;
						local697 = local791.anInt6339 / 32 - local53 / 32;
						Static165.method5488(arg1, local635.anInt4219, arg2, local697, 360000, local490, arg0, local12);
					}
				}
			}
		}
		if (Static334.anInt6112 == 4) {
			return;
		}
		if (Static299.anInt5652 != 0) {
			local411 = Static299.anInt5652 * 4 + Static253.aClass44_Sub4_Sub4_Sub1_1.method4714() * 2 + 2 - local63 / 32 - 2;
			local731 = Static24.anInt385 * 4 + (Static253.aClass44_Sub4_Sub4_Sub1_1.method4714() + -1) * 2 + 2 - local53 / 32;
			Static5.method96(arg0, Static185.aClass40Array43[Static125.aBoolean198 ? 1 : 0], local411, arg1, arg2, local731, local12);
		}
		arg3.method3017(3, -1, 3, arg2 + arg0.anInt3507 / 2 - 1, arg1 - -(arg0.anInt3503 / 2) + -1);
		return;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V")
	public static void method3599(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static76.anInt2853 - Static63.anInt1157;
		if (local8 >= 100) {
			Static334.anInt6112 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static163.aFloat69;
		if (Static86.anInt1602 >> 8 > local19) {
			local19 = Static86.anInt1602 >> 8;
		}
		if (Static345.aBooleanArray28[4] && local19 < Static150.anIntArray346[4] + 128) {
			local19 = Static150.anIntArray346[4] + 128;
		}
		@Pc(60) int local60 = (int) Static117.aFloat58 + Static256.anInt4734 & 0x3FFF;
		Static113.method2273(Static306.method5249(Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340, Static343.anInt6225) - 50, local19, Static219.anInt4043, arg0, Static304.anInt5743, local60, (local19 >> 3) * 3 + 600);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static110.anInt2047 = (int) ((float) Static269.anInt5055 + local104 * (float) (Static110.anInt2047 - Static269.anInt5055));
		Static11.anInt197 = (int) (local104 * (float) (Static11.anInt197 - Static157.anInt2938) + (float) Static157.anInt2938);
		Static217.anInt4016 = (int) ((float) Static285.anInt5395 + local104 * (float) (Static217.anInt4016 - Static285.anInt5395));
		Static287.anInt5405 = (int) (local104 * (float) (Static287.anInt5405 - Static252.anInt4703) + (float) Static252.anInt4703);
		@Pc(157) int local157 = Static79.anInt1450 - Static351.anInt6306;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static79.anInt1450 = (int) ((float) Static351.anInt6306 + (float) local157 * local104);
		Static79.anInt1450 &= 0x3FFF;
	}
}
