import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)V")
	public static void method536() {
		Static424.method6093(Static72.aClass2_Sub12_Sub1_1.anInt1904);
		@Pc(17) int local17 = (Static35.anInt906 >> 3) + (Static90.anInt1932 >> 12);
		@Pc(25) int local25 = (Static130.anInt5246 >> 3) + (Static7.anInt337 >> 12);
		Static566.anInt9278 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 = 0;
		Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6182(8, 8);
		Static529.aByteArrayArray38 = new byte[18][];
		Static471.anIntArrayArray53 = new int[18][4];
		Static533.aByteArrayArray35 = new byte[18][];
		Static234.anIntArray280 = new int[18];
		Static394.anIntArray331 = new int[18];
		Static420.aByteArrayArray27 = new byte[18][];
		Static300.aByteArrayArray24 = new byte[18][];
		Static263.anIntArray328 = new int[18];
		Static135.anIntArray166 = new int[18];
		Static296.anIntArray380 = new int[18];
		Static585.anIntArray683 = new int[18];
		Static266.aByteArrayArray23 = new byte[18][];
		@Pc(83) int local83 = 0;
		@Pc(103) int local103;
		for (@Pc(92) int local92 = (local17 - (Static188.anInt3850 >> 4)) / 8; local92 <= (local17 + (Static188.anInt3850 >> 4)) / 8; local92++) {
			for (local103 = (local25 - (Static49.anInt1174 >> 4)) / 8; local103 <= ((Static49.anInt1174 >> 4) + local25) / 8; local103++) {
				@Pc(111) int local111 = (local92 << 8) + local103;
				Static234.anIntArray280[local83] = local111;
				Static585.anIntArray683[local83] = Static525.aClass259_170.method5961("m" + local92 + "_" + local103);
				Static394.anIntArray331[local83] = Static525.aClass259_170.method5961("l" + local92 + "_" + local103);
				Static135.anIntArray166[local83] = Static525.aClass259_170.method5961("n" + local92 + "_" + local103);
				Static296.anIntArray380[local83] = Static525.aClass259_170.method5961("um" + local92 + "_" + local103);
				Static263.anIntArray328[local83] = Static525.aClass259_170.method5961("ul" + local92 + "_" + local103);
				if (Static135.anIntArray166[local83] == -1) {
					Static585.anIntArray683[local83] = -1;
					Static394.anIntArray331[local83] = -1;
					Static296.anIntArray380[local83] = -1;
					Static263.anIntArray328[local83] = -1;
				}
				local83++;
			}
		}
		for (local103 = local83; local103 < Static135.anIntArray166.length; local103++) {
			Static135.anIntArray166[local103] = -1;
			Static585.anIntArray683[local103] = -1;
			Static394.anIntArray331[local103] = -1;
			Static296.anIntArray380[local103] = -1;
			Static263.anIntArray328[local103] = -1;
		}
		@Pc(290) byte local290;
		if (Static201.anInt3963 == 3) {
			local290 = 4;
		} else {
			local290 = 8;
		}
		Static277.method4190(local290, false, local17, local25);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLclient!r;)V")
	public static void method537(@OriginalArg(1) Class100 arg0) {
		@Pc(7) int local7 = Static344.anInt6231;
		@Pc(9) int local9 = Static202.anInt3966;
		@Pc(11) int local11 = Static23.anInt642;
		@Pc(15) int local15 = Static306.anInt5446 - 3;
		if (Static310.aClass39_11 == null || Static376.aClass39_28 == null) {
			if (Static490.aClass259_153.method5988(Static224.anInt4205) && Static490.aClass259_153.method5988(Static306.anInt5438)) {
				Static310.aClass39_11 = arg0.method6256(Static596.method247(Static490.aClass259_153, Static224.anInt4205, 0), true);
				@Pc(61) Class13 local61 = Static596.method247(Static490.aClass259_153, Static306.anInt5438, 0);
				Static376.aClass39_28 = arg0.method6256(local61, true);
				local61.method246();
				Static107.aClass39_6 = arg0.method6256(local61, true);
			} else {
				arg0.J(local7, local9, local11, 20, Static95.anInt2018 | 255 - Static466.anInt7988 << 24, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static310.aClass39_11 != null && Static376.aClass39_28 != null) {
			local87 = (local11 - Static376.aClass39_28.E() * 2) / Static310.aClass39_11.E();
			for (local89 = 0; local89 < local87; local89++) {
				Static310.aClass39_11.method7851(local7 + Static376.aClass39_28.E() + local89 * Static310.aClass39_11.E(), local9);
			}
			Static376.aClass39_28.method7851(local7, local9);
			Static107.aClass39_6.method7851(local7 + local11 - Static107.aClass39_6.E(), local9);
		}
		Static419.aClass29_13.method7111(Static558.anInt9167 | 0xFF000000, local7 + 3, Static290.aClass198_26.method4365(Static52.anInt1264), -1, local9 + 14);
		arg0.J(local7, local9 + 20, local11, local15 - 20, Static95.anInt2018 | 255 - Static466.anInt7988 << 24, 1);
		local87 = Static326.aClass149_1.method5879();
		local89 = Static326.aClass149_1.method5875();
		@Pc(173) int local173 = 0;
		@Pc(196) int local196;
		for (@Pc(178) Class2_Sub5 local178 = (Class2_Sub5) Static375.aClass8_38.method210(); local178 != null; local178 = (Class2_Sub5) Static375.aClass8_38.method218()) {
			local196 = local9 + (Static347.anInt6255 - local173 - 1) * 16 + 33;
			local173++;
			if (local7 < local87 && local11 + local7 > local87 && local196 - 13 < local89 && local89 < local196 + 4 && local178.aBoolean61) {
				arg0.J(local7, local196 - 12, local11, 16, Static296.anInt5335 | 255 - Static504.anInt8432 << 24, 1);
			}
		}
		if ((Static81.aClass39_5 == null || Static517.aClass39_36 == null || Static436.aClass39_30 == null) && Static490.aClass259_153.method5988(Static419.anInt6525) && Static490.aClass259_153.method5988(Static251.anInt4681) && Static490.aClass259_153.method5988(Static539.anInt8817)) {
			@Pc(271) Class13 local271 = Static596.method247(Static490.aClass259_153, Static251.anInt4681, 0);
			Static517.aClass39_36 = arg0.method6256(local271, true);
			local271.method246();
			Static221.aClass39_9 = arg0.method6256(local271, true);
			Static81.aClass39_5 = arg0.method6256(Static596.method247(Static490.aClass259_153, Static419.anInt6525, 0), true);
			@Pc(296) Class13 local296 = Static596.method247(Static490.aClass259_153, Static539.anInt8817, 0);
			Static436.aClass39_30 = arg0.method6256(local296, true);
			local296.method246();
			Static228.aClass39_10 = arg0.method6256(local296, true);
		}
		@Pc(366) int local366;
		@Pc(327) int local327;
		if (Static81.aClass39_5 != null && Static517.aClass39_36 != null && Static436.aClass39_30 != null) {
			local196 = (local11 - Static436.aClass39_30.E() * 2) / Static81.aClass39_5.E();
			for (local327 = 0; local327 < local196; local327++) {
				Static81.aClass39_5.method7851(Static436.aClass39_30.E() + local7 + Static81.aClass39_5.E() * local327, local15 + local9 - Static81.aClass39_5.u());
			}
			local366 = (local15 - Static436.aClass39_30.u() - 20) / Static517.aClass39_36.u();
			for (@Pc(368) int local368 = 0; local368 < local366; local368++) {
				Static517.aClass39_36.method7851(local7, local9 + Static517.aClass39_36.u() * local368 + 20);
				Static221.aClass39_9.method7851(local7 + local11 - Static221.aClass39_9.E(), local368 * Static517.aClass39_36.u() + 20 + local9);
			}
			Static436.aClass39_30.method7851(local7, local9 + local15 - Static436.aClass39_30.u());
			Static228.aClass39_10.method7851(local11 + local7 - Static436.aClass39_30.E(), -Static436.aClass39_30.u() + local9 + local15);
		}
		local173 = 0;
		for (@Pc(435) Class2_Sub5 local435 = (Class2_Sub5) Static375.aClass8_38.method210(); local435 != null; local435 = (Class2_Sub5) Static375.aClass8_38.method218()) {
			local327 = local9 + (-local173 + (Static347.anInt6255 - 1)) * 16 + 20 + 13;
			local366 = Static558.anInt9167 | 0xFF000000;
			if (local7 < local87 && local87 < local11 + local7 && local327 - 13 < local89 && local89 < local327 + 4 && local435.aBoolean61) {
				local366 = Static57.anInt1306 | 0xFF000000;
			}
			@Pc(495) int[] local495 = null;
			if (Static370.method5499(local435.anInt902)) {
				local495 = Static296.aClass218_1.method5067((int) local435.aLong30).anIntArray648;
			} else if (local435.anInt896 != -1) {
				local495 = Static296.aClass218_1.method5067(local435.anInt896).anIntArray648;
			} else if (Static489.method6854(local435.anInt902)) {
				@Pc(571) Class2_Sub32 local571 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local435.aLong30);
				if (local571 != null) {
					@Pc(576) Class6_Sub1_Sub1_Sub1_Sub1 local576 = local571.aClass6_Sub1_Sub1_Sub1_Sub1_1;
					@Pc(579) Class86 local579 = local576.aClass86_1;
					if (local579.anIntArray136 != null) {
						local579 = local579.method1567(Static70.aClass78_1);
					}
					if (local579 != null) {
						local495 = local579.anIntArray135;
					}
				}
			} else if (Static205.method3315(local435.anInt902)) {
				@Pc(536) Class32 local536;
				if (local435.anInt902 == 1008) {
					local536 = Static541.aClass97_4.method1794((int) local435.aLong30);
				} else {
					local536 = Static541.aClass97_4.method1794((int) (local435.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local536.anIntArray50 != null) {
					local536 = local536.method552(Static70.aClass78_1);
				}
				if (local536 != null) {
					local495 = local536.anIntArray45;
				}
			}
			@Pc(604) String local604 = Static374.method5546(local435);
			if (local495 != null) {
				local604 = local604 + Static362.method5082(local495);
			}
			Static419.aClass29_13.method7112(Static126.aClass39Array14, local327, Static402.anIntArray482, local366, local7 + 3, local604);
			if (local435.aBoolean60) {
				Static525.aClass39_38.method7851(Static83.aClass294_6.method6718(local604) + local7 + 5, local327 + -12);
			}
			local173++;
		}
		Static573.method7737(Static202.anInt3966, Static344.anInt6231, Static23.anInt642, Static306.anInt5446);
	}
}
