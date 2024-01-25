import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	public static final int anInt2457 = 1401;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V")
	public static void method2077() {
		if (Static263.anInt4598 < 0) {
			return;
		}
		@Pc(4) long local4 = Static521.method7499();
		Static263.anInt4598 = (int) ((long) Static263.anInt4598 + Static145.aLong78 - local4);
		if (Static263.anInt4598 <= 0) {
			Static324.aFloat148 = Static425.aClass304_1.aFloat220;
			Static147.aClass144_1 = Static425.aClass304_1.aClass144_3;
			Static587.aFloat263 = Static425.aClass304_1.aFloat225;
			Static511.aFloat66 = Static425.aClass304_1.aFloat221;
			Static358.anInt6601 = Static425.aClass304_1.anInt9030;
			Static361.aFloat154 = Static425.aClass304_1.aFloat224;
			Static333.aFloat150 = Static425.aClass304_1.aFloat226;
			Static213.anInt4048 = Static425.aClass304_1.anInt9028;
			Static260.anInt4564 = Static425.aClass304_1.anInt9034;
			Static263.anInt4598 = -1;
			Static74.aFloat48 = Static425.aClass304_1.aFloat223;
		} else {
			@Pc(55) int local55 = (Static263.anInt4598 << 8) / Static461.anInt8099;
			@Pc(60) int local60 = 255 - local55;
			@Pc(65) float local65 = (float) local55 / 255.0F;
			@Pc(70) float local70 = 1.0F - local65;
			Static260.anInt4564 = ((Static425.aClass304_1.anInt9034 & 0xFF00) * local60 + local55 * (Static153.anInt3014 & 0xFF00) & 0xFF0000) + (local60 * (Static425.aClass304_1.anInt9034 & 0xFF00FF) + (Static153.anInt3014 & 0xFF00FF) * local55 & 0xFF00FF00) >>> 8;
			Static213.anInt4048 = ((Static387.anInt7129 & 0xFF00FF) * local55 + (Static425.aClass304_1.anInt9028 & 0xFF00FF) * local60 & 0xFF00FF00) + (local55 * (Static387.anInt7129 & 0xFF00) + local60 * (Static425.aClass304_1.anInt9028 & 0xFF00) & 0xFF0000) >>> 8;
			Static333.aFloat150 = Static678.aFloat271 + local70 * (Static425.aClass304_1.aFloat226 - Static678.aFloat271);
			Static74.aFloat48 = local70 * (Static425.aClass304_1.aFloat223 - Static569.aFloat253) + Static569.aFloat253;
			Static511.aFloat66 = local70 * (Static425.aClass304_1.aFloat221 - Static562.aFloat252) + Static562.aFloat252;
			Static324.aFloat148 = local70 * (Static425.aClass304_1.aFloat220 - Static361.aFloat157) + Static361.aFloat157;
			Static358.anInt6601 = Static425.aClass304_1.anInt9030 * local60 + Static46.anInt1116 * local55 >> 8;
			Static361.aFloat154 = Static294.aFloat104 + local70 * (Static425.aClass304_1.aFloat224 - Static294.aFloat104);
			Static587.aFloat263 = local70 * (Static425.aClass304_1.aFloat225 - Static660.aFloat268) + Static660.aFloat268;
			if (Static425.aClass304_1.aClass144_3 != Static439.aClass144_2) {
				Static147.aClass144_1 = Static354.aClass137_31.method7894(Static439.aClass144_2, Static425.aClass304_1.aClass144_3, local70, Static147.aClass144_1);
			}
		}
		Static145.aLong78 = local4;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
	public static void method2078() {
		Static597.aClass264_59.method6360();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method2082(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static215.anInt4074 == 0 || Static380.anInt6947 == 0) {
			return;
		}
		@Pc(39) Class26 local39;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(26) int local26;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (Static128.aBoolean202) {
			Static505.method7392(false);
			local39 = arg0.method7872();
			@Pc(65) int[] local65 = arg0.Y();
			local28 = local65[1];
			local26 = local65[3];
			local30 = local65[2];
			local24 = local65[0];
			local49 = arg2 + Static502.method7351(false);
			local54 = Static421.method6233(false) + arg1;
		} else {
			arg0.DA(Static528.anInt9165, Static675.anInt11180, Static215.anInt4074, Static380.anInt6947);
			local24 = Static528.anInt9165;
			local26 = Static380.anInt6947;
			local28 = Static675.anInt11180;
			local30 = Static215.anInt4074;
			arg0.KA(Static674.anInt11170, Static549.anInt9387, Static215.anInt4074, Static380.anInt6947);
			local39 = arg0.method7918();
			local39.method6445(Static521.anInt9073, Static514.anInt9025, Static213.anInt4043, Static559.anInt9501, Static202.anInt3752, Static126.anInt2499);
			local49 = arg2;
			arg0.method7950(local39);
			local54 = arg1;
		}
		Static331.method5193(true);
		if (local26 == 0) {
			local26 = 1;
		}
		if (local30 == 0) {
			local30 = 1;
		}
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(167) int local167;
		@Pc(158) int local158;
		@Pc(267) int local267;
		@Pc(276) int local276;
		@Pc(287) int local287;
		@Pc(298) int local298;
		@Pc(347) int local347;
		if (Static343.aClass51Array1 != null && (!Static238.aBoolean302 || (Static156.anInt3080 & 0x40) != 0)) {
			local123 = -1;
			@Pc(125) int local125 = -1;
			@Pc(128) int local128 = arg0.i();
			local131 = arg0.XA();
			@Pc(150) int local150;
			@Pc(141) int local141;
			if (Static401.aBoolean511) {
				local167 = local141 = (local49 - local24) * Static331.anInt6277 / local30;
				local150 = local158 = (local54 - local28) * Static331.anInt6277 / local26;
			} else {
				local141 = local131 * (local49 - local24) / local30;
				local150 = (local54 - local28) * local128 / local26;
				local158 = (local54 - local28) * local131 / local26;
				local167 = (local49 - local24) * local128 / local30;
			}
			@Pc(205) int[] local205 = new int[] { local167, local150, local128 };
			local39.method6455(local205);
			@Pc(223) int[] local223 = new int[] { local141, local158, local131 };
			local39.method6455(local223);
			@Pc(254) float local254 = Static297.method4374((float) local205[1], 4, (float) local223[2], (float) local205[2], (float) local223[0], (float) local205[0], (float) local223[1]);
			if (local254 > 0.0F) {
				local267 = local223[0] - local205[0];
				local276 = local223[2] - local205[2];
				local287 = (int) ((float) local267 * local254 + (float) local205[0]);
				local298 = (int) ((float) local205[2] + (float) local276 * local254);
				local123 = (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() - 1 << 8) + local287 >> 9;
				local125 = local298 + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() - 1 << 8) >> 9;
				@Pc(326) byte local326 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146;
				if (local326 < 3 && (Static553.aByteArrayArrayArray18[1][local287 >> 9][local298 >> 9] & 0x2) != 0) {
					local347 = local326 + 1;
				}
			}
			if (local123 != -1 && local125 != -1) {
				if (Static238.aBoolean302 && (Static156.anInt3080 & 0x40) != 0) {
					@Pc(417) Class230 local417 = Static572.method8204(Static639.anInt10686, Static402.anInt10315);
					if (local417 == null) {
						Static141.method1563();
					} else {
						Static261.method3780(0L, -1, true, " ->", false, Static275.anInt4778, true, local123, (long) (local125 | local123 << 0), local125, Static139.aString30, 51);
					}
				} else {
					if (Static434.aBoolean524) {
						Static261.method3780(0L, -1, true, "", false, -1, true, local123, (long) (local123 << 0 | local125), local125, Static514.aClass303_29.method7473(Static232.anInt4258), 20);
					}
					Static261.method3780(0L, -1, true, "", false, Static167.anInt3248, true, local123, (long) (local125 | local123 << 0), local125, Static181.aString32, 23);
				}
			}
		}
		if (Static128.aBoolean202) {
			Static279.method4042();
		}
		for (local123 = 0; local123 < (Static128.aBoolean202 ? 2 : 1); local123++) {
			@Pc(456) boolean local456 = local123 == 0;
			@Pc(462) Class23 local462 = local456 ? Static326.aClass23_1 : Static430.aClass23_3;
			local131 = arg2;
			local167 = arg1;
			if (Static128.aBoolean202) {
				Static505.method7392(local456);
				local131 = arg2 + Static502.method7351(local456);
				local167 = arg1 + Static421.method6233(local456);
			}
			@Pc(486) Class376 local486 = local462.aClass376_1;
			for (@Pc(491) Class12_Sub8 local491 = (Class12_Sub8) local486.method9008(); local491 != null; local491 = (Class12_Sub8) local486.method9014()) {
				if ((Static418.aBoolean519 || Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 == local491.aClass12_Sub2_15.aByte146) && local491.method5353(local167, arg0, local131)) {
					@Pc(525) int local525;
					if (local491.aClass12_Sub2_15 instanceof Class12_Sub2_Sub2) {
						local525 = ((Class12_Sub2_Sub2) local491.aClass12_Sub2_15).aShort110;
						local158 = ((Class12_Sub2_Sub2) local491.aClass12_Sub2_15).aShort111;
					} else {
						local525 = local491.aClass12_Sub2_15.anInt11002 >> 9;
						local158 = local491.aClass12_Sub2_15.anInt10998 >> 9;
					}
					@Pc(656) int local656;
					@Pc(668) int local668;
					@Pc(770) int local770;
					@Pc(556) int local556;
					if (local491.aClass12_Sub2_15 instanceof Class12_Sub2_Sub2_Sub1_Sub2) {
						@Pc(552) Class12_Sub2_Sub2_Sub1_Sub2 local552 = (Class12_Sub2_Sub2_Sub1_Sub2) local491.aClass12_Sub2_15;
						local556 = local552.method2422();
						if ((local556 & 0x1) == 0 && (local552.anInt10998 & 0x1FF) == 0 && (local552.anInt11002 & 0x1FF) == 0 || (local556 & 0x1) == 1 && (local552.anInt10998 & 0x1FF) == 256 && (local552.anInt11002 & 0x1FF) == 256) {
							local267 = local552.anInt10998 - (local552.method2422() - 1 << 8);
							local276 = local552.anInt11002 - (local552.method2422() - 1 << 8);
							for (local287 = 0; local287 < Static471.anInt8216; local287++) {
								@Pc(630) Class14_Sub44 local630 = (Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local287]);
								if (local630 != null) {
									@Pc(635) Class12_Sub2_Sub2_Sub1_Sub1 local635 = local630.aClass12_Sub2_Sub2_Sub1_Sub1_2;
									if (Static87.anInt1951 != local635.anInt2918 && local635.aBoolean221) {
										local656 = local635.anInt10998 - (local635.aClass283_1.anInt8617 - 1 << 8);
										local668 = local635.anInt11002 - (local635.aClass283_1.anInt8617 - 1 << 8);
										if (local656 >= local267 && local635.aClass283_1.anInt8617 <= local552.method2422() - (local656 - local267 >> 9) && local668 >= local276 && local635.aClass283_1.anInt8617 <= local552.method2422() - (local668 - local276 >> 9)) {
											Static571.method8197(local635, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 != local491.aClass12_Sub2_15.aByte146);
											local635.anInt2918 = Static87.anInt1951;
										}
									}
								}
							}
							local298 = Static209.anInt3954;
							@Pc(735) int[] local735 = Static457.anIntArray607;
							for (local656 = 0; local656 < local298; local656++) {
								@Pc(745) Class12_Sub2_Sub2_Sub1_Sub2 local745 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local735[local656]];
								if (local745 != null && local745.anInt2918 != Static87.anInt1951 && local745 != local552 && local745.aBoolean221) {
									local770 = local745.anInt10998 - (local745.method2422() - 1 << 8);
									@Pc(782) int local782 = local745.anInt11002 - (local745.method2422() - 1 << 8);
									if (local770 >= local267 && local745.method2422() <= local552.method2422() - (local770 - local267 >> 9) && local276 <= local782 && local745.method2422() <= local552.method2422() - (local782 - local276 >> 9)) {
										Static47.method969(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 != local491.aClass12_Sub2_15.aByte146, local745);
										local745.anInt2918 = Static87.anInt1951;
									}
								}
							}
						}
						if (local552.anInt2918 == Static87.anInt1951) {
							continue;
						}
						Static47.method969(local491.aClass12_Sub2_15.aByte146 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146, local552);
						local552.anInt2918 = Static87.anInt1951;
					}
					if (local491.aClass12_Sub2_15 instanceof Class12_Sub2_Sub2_Sub1_Sub1) {
						@Pc(879) Class12_Sub2_Sub2_Sub1_Sub1 local879 = (Class12_Sub2_Sub2_Sub1_Sub1) local491.aClass12_Sub2_15;
						if (local879.aClass283_1 != null) {
							if ((local879.aClass283_1.anInt8617 & 0x1) == 0 && (local879.anInt10998 & 0x1FF) == 0 && (local879.anInt11002 & 0x1FF) == 0 || (local879.aClass283_1.anInt8617 & 0x1) == 1 && (local879.anInt10998 & 0x1FF) == 256 && (local879.anInt11002 & 0x1FF) == 256) {
								local556 = local879.anInt10998 - (local879.aClass283_1.anInt8617 - 1 << 8);
								local267 = local879.anInt11002 - (local879.aClass283_1.anInt8617 - 1 << 8);
								for (local276 = 0; local276 < Static471.anInt8216; local276++) {
									@Pc(963) Class14_Sub44 local963 = (Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local276]);
									if (local963 != null) {
										@Pc(968) Class12_Sub2_Sub2_Sub1_Sub1 local968 = local963.aClass12_Sub2_Sub2_Sub1_Sub1_2;
										if (Static87.anInt1951 != local968.anInt2918 && local968 != local879 && local968.aBoolean221) {
											local347 = local968.anInt10998 - (local968.aClass283_1.anInt8617 - 1 << 8);
											local656 = local968.anInt11002 - (local968.aClass283_1.anInt8617 - 1 << 8);
											if (local556 <= local347 && local879.aClass283_1.anInt8617 - (local347 - local556 >> 9) >= local968.aClass283_1.anInt8617 && local267 <= local656 && local879.aClass283_1.anInt8617 - (local656 - local267 >> 9) >= local968.aClass283_1.anInt8617) {
												Static571.method8197(local968, local491.aClass12_Sub2_15.aByte146 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146);
												local968.anInt2918 = Static87.anInt1951;
											}
										}
									}
								}
								local287 = Static209.anInt3954;
								@Pc(1081) int[] local1081 = Static457.anIntArray607;
								for (local347 = 0; local347 < local287; local347++) {
									@Pc(1091) Class12_Sub2_Sub2_Sub1_Sub2 local1091 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local1081[local347]];
									if (local1091 != null && local1091.anInt2918 != Static87.anInt1951 && local1091.aBoolean221) {
										local668 = local1091.anInt10998 - (local1091.method2422() - 1 << 8);
										local770 = local1091.anInt11002 - (local1091.method2422() - 1 << 8);
										if (local668 >= local556 && local1091.method2422() <= local879.aClass283_1.anInt8617 - (local668 - local556 >> 9) && local770 >= local267 && local1091.method2422() <= local879.aClass283_1.anInt8617 - (local770 - local267 >> 9)) {
											Static47.method969(local491.aClass12_Sub2_15.aByte146 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146, local1091);
											local1091.anInt2918 = Static87.anInt1951;
										}
									}
								}
							}
							if (Static87.anInt1951 == local879.anInt2918) {
								continue;
							}
							Static571.method8197(local879, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 != local491.aClass12_Sub2_15.aByte146);
							local879.anInt2918 = Static87.anInt1951;
						}
					}
					if (local491.aClass12_Sub2_15 instanceof Class12_Sub2_Sub5_Sub1) {
						@Pc(1226) int local1226 = Static329.anInt6225 + local158;
						local556 = local525 + Static202.anInt3755;
						@Pc(1247) Class14_Sub42 local1247 = (Class14_Sub42) Static568.aClass187_71.method4078((long) (local556 << 14 | local491.aClass12_Sub2_15.aByte146 << 28 | local1226));
						if (local1247 != null) {
							local276 = 0;
							for (@Pc(1257) Class14_Sub41 local1257 = (Class14_Sub41) local1247.aClass262_47.method6320(); local1257 != null; local1257 = (Class14_Sub41) local1247.aClass262_47.method6319()) {
								@Pc(1265) Class27 local1265 = Static175.aClass247_2.method5962(local1257.anInt7971);
								if (Static238.aBoolean302 && local491.aClass12_Sub2_15.aByte146 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146) {
									@Pc(1283) Class341 local1283 = Static597.anInt10147 == -1 ? null : Static217.aClass90_1.method2122(Static597.anInt10147);
									if ((Static156.anInt3080 & 0x1) != 0 && (local1283 == null || local1265.method807(Static597.anInt10147, local1283.anInt9931) != local1283.anInt9931)) {
										Static261.method3780((long) local1257.anInt7971, -1, true, Static639.aString114 + " -> <col=ff9040>" + local1265.aString9, false, Static275.anInt4778, false, local158, (long) local276, local525, Static139.aString30, 48);
									}
								}
								if (local491.aClass12_Sub2_15.aByte146 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146) {
									@Pc(1345) String[] local1345 = local1265.aStringArray2;
									for (local656 = 4; local656 >= 0; local656--) {
										if (local1345 != null && local1345[local656] != null) {
											@Pc(1357) byte local1357 = 0;
											local770 = Static334.anInt6334;
											if (local656 == 0) {
												local1357 = 46;
											}
											if (local656 == 1) {
												local1357 = 60;
											}
											if (local656 == 2) {
												local1357 = 50;
											}
											if (local656 == 3) {
												local1357 = 53;
											}
											if (local656 == 4) {
												local1357 = 22;
											}
											if (local1265.anInt898 == local656) {
												local770 = local1265.anInt907;
											}
											if (local1265.anInt895 == local656) {
												local770 = local1265.anInt936;
											}
											Static261.method3780((long) local1257.anInt7971, -1, true, "<col=ff9040>" + local1265.aString9, false, local770, false, local158, (long) local276, local525, local1345[local656], local1357);
										}
									}
								}
								Static261.method3780((long) local1257.anInt7971, -1, true, "<col=ff9040>" + local1265.aString9, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 != local491.aClass12_Sub2_15.aByte146, Static30.anInt779, false, local158, (long) local276, local525, Static514.aClass303_24.method7473(Static232.anInt4258), 1001);
								local276++;
							}
						}
					}
					if (local491.aClass12_Sub2_15 instanceof Interface19) {
						@Pc(1501) Interface19 local1501 = (Interface19) local491.aClass12_Sub2_15;
						@Pc(1508) Class203 local1508 = Static511.aClass13_2.method86(local1501.method9171());
						if (local1508.anIntArray440 != null) {
							local1508 = local1508.method5007(Static595.aClass241_1);
						}
						if (local1508 != null) {
							if (Static238.aBoolean302 && local491.aClass12_Sub2_15.aByte146 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146) {
								@Pc(1537) Class341 local1537 = Static597.anInt10147 == -1 ? null : Static217.aClass90_1.method2122(Static597.anInt10147);
								if ((Static156.anInt3080 & 0x4) != 0 && (local1537 == null || local1508.method5016(local1537.anInt9931, Static597.anInt10147) != local1537.anInt9931)) {
									Static261.method3780(Static253.method3717(local158, local1501, local525), -1, true, Static639.aString114 + " -> <col=00ffff>" + local1508.aString64, false, Static275.anInt4778, false, local158, (long) local1501.hashCode(), local525, Static139.aString30, 9);
								}
							}
							if (local491.aClass12_Sub2_15.aByte146 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146) {
								@Pc(1606) String[] local1606 = local1508.aStringArray20;
								if (local1606 != null) {
									for (local276 = 4; local276 >= 0; local276--) {
										if (local1606[local276] != null) {
											@Pc(1618) short local1618 = 0;
											local298 = Static334.anInt6334;
											if (local276 == 0) {
												local1618 = 19;
											}
											if (local276 == 1) {
												local1618 = 2;
											}
											if (local276 == 2) {
												local1618 = 59;
											}
											if (local276 == 3) {
												local1618 = 57;
											}
											if (local276 == local1508.anInt6023) {
												local298 = local1508.anInt6051;
											}
											if (local276 == 4) {
												local1618 = 1011;
											}
											if (local1508.anInt6032 == local276) {
												local298 = local1508.anInt6053;
											}
											Static261.method3780(Static253.method3717(local158, local1501, local525), -1, true, "<col=00ffff>" + local1508.aString64, false, local298, false, local158, (long) local1501.hashCode(), local525, local1606[local276], local1618);
										}
									}
								}
								Static261.method3780((long) local1508.anInt6014, -1, true, "<col=00ffff>" + local1508.aString64, local491.aClass12_Sub2_15.aByte146 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146, Static30.anInt779, false, local158, (long) local1501.hashCode(), local525, Static514.aClass303_24.method7473(Static232.anInt4258), 1010);
							}
						}
					}
				}
			}
			if (Static128.aBoolean202) {
				Static279.method4042();
			}
		}
		Static331.method5193(false);
	}
}
