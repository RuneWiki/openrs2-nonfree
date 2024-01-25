import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pja", name = "q", descriptor = "I")
	public static int anInt7919;

	@OriginalMember(owner = "client!pja", name = "k", descriptor = "F")
	public static float aFloat178 = 1024.0F;

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method6626(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static177.anInt3326 == 0 || Static581.anInt9233 == 0) {
			return;
		}
		@Pc(32) Class25 local32;
		@Pc(51) int local51;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(57) int local57;
		@Pc(63) int local63;
		if (Static649.aBoolean735) {
			Static431.method6358(false);
			local32 = arg1.method8159();
			@Pc(35) int[] local35 = arg1.Y();
			local39 = local35[1];
			local43 = local35[2];
			local47 = local35[3];
			local51 = local35[0];
			local57 = Static579.method7793(false) + arg0;
			local63 = Static255.method4045(false) + arg2;
		} else {
			arg1.DA(Static321.anInt5975, Static454.anInt7771, Static177.anInt3326, Static581.anInt9233);
			local47 = Static581.anInt9233;
			local39 = Static454.anInt7771;
			local51 = Static321.anInt5975;
			local43 = Static177.anInt3326;
			arg1.KA(Static422.anInt7120, Static446.anInt7707, Static177.anInt3326, Static581.anInt9233);
			local32 = arg1.method8178();
			local32.method4294(Static74.anInt1691, Static540.anInt7334, Static315.anInt5889, Static404.anInt6910, Static491.anInt9937, Static573.anInt9122);
			arg1.method8135(local32);
			local57 = arg0;
			local63 = arg2;
		}
		if (local43 == 0) {
			local43 = 1;
		}
		Static241.method3895(true);
		if (local47 == 0) {
			local47 = 1;
		}
		@Pc(135) int local135;
		@Pc(159) int local159;
		@Pc(147) int local147;
		@Pc(271) int local271;
		@Pc(280) int local280;
		@Pc(291) int local291;
		@Pc(302) int local302;
		@Pc(127) int local127;
		@Pc(350) int local350;
		if (Static239.aClass104Array1 != null && (!Static329.aBoolean166 || (Static7.anInt94 & 0x40) != 0)) {
			local127 = -1;
			@Pc(129) int local129 = -1;
			@Pc(132) int local132 = arg1.i();
			local135 = arg1.XA();
			@Pc(148) int local148;
			@Pc(158) int local158;
			if (Static148.aBoolean221) {
				local148 = local147 = Static209.anInt10104 * (local63 - local39) / local47;
				local159 = local158 = Static209.anInt10104 * (local57 - local51) / local43;
			} else {
				local147 = (local63 - local39) * local135 / local47;
				local148 = local132 * (local63 - local39) / local47;
				local158 = (local57 - local51) * local135 / local43;
				local159 = (local57 - local51) * local132 / local43;
			}
			@Pc(209) int[] local209 = new int[] { local159, local148, local132 };
			local32.method4299(local209);
			@Pc(227) int[] local227 = new int[] { local158, local147, local135 };
			local32.method4299(local227);
			@Pc(258) float local258 = Static351.method5278((float) local227[0], 4, (float) local209[0], (float) local209[2], (float) local227[2], (float) local209[1], (float) local227[1]);
			if (local258 > 0.0F) {
				local271 = local227[0] - local209[0];
				local280 = local227[2] - local209[2];
				local291 = (int) ((float) local209[0] + (float) local271 * local258);
				local302 = (int) (local258 * (float) local280 + (float) local209[2]);
				local127 = local291 + (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() - 1 << 8) >> 9;
				local129 = (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() - 1 << 8) + local302 >> 9;
				@Pc(329) byte local329 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142;
				if (local329 < 3 && (Static338.aByteArrayArrayArray13[1][local291 >> 9][local302 >> 9] & 0x2) != 0) {
					local350 = local329 + 1;
				}
			}
			if (local127 != -1 && local129 != -1) {
				if (Static329.aBoolean166 && (Static7.anInt94 & 0x40) != 0) {
					@Pc(368) Class208 local368 = Static108.method2085(Static452.anInt7746, Static395.anInt6819);
					if (local368 == null) {
						Static61.method1523();
					} else {
						Static225.method3514(true, true, -1, Static158.anInt2968, local129, 0L, " ->", 20, Static46.aString12, (long) (local129 | local127 << 0), false, local127);
					}
				} else {
					if (Static47.aBoolean109) {
						Static225.method3514(true, true, -1, -1, local129, 0L, "", 50, Static569.aClass335_28.method7694(Static319.anInt5939), (long) (local129 | local127 << 0), false, local127);
					}
					Static225.method3514(true, true, -1, Static276.anInt5163, local129, 0L, "", 16, Static602.aString119, (long) (local127 << 0 | local129), false, local127);
				}
			}
		}
		if (Static649.aBoolean735) {
			Static80.method8694();
		}
		for (local127 = 0; local127 < (Static649.aBoolean735 ? 2 : 1); local127++) {
			@Pc(456) boolean local456 = local127 == 0;
			@Pc(462) Class211 local462 = local456 ? Static52.aClass211_2 : Static455.aClass211_3;
			local135 = arg0;
			local159 = arg2;
			if (Static649.aBoolean735) {
				Static431.method6358(local456);
				local135 = arg0 + Static579.method7793(local456);
				local159 = arg2 + Static255.method4045(local456);
			}
			@Pc(486) Class105 local486 = local462.aClass105_7;
			for (@Pc(491) Class23_Sub6 local491 = (Class23_Sub6) local486.method2444(); local491 != null; local491 = (Class23_Sub6) local486.method2448()) {
				if ((Static630.aBoolean720 || Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 == local491.aClass23_Sub2_10.aByte142) && local491.method3462(local159, arg1, local135)) {
					@Pc(528) int local528;
					if (local491.aClass23_Sub2_10 instanceof Class23_Sub2_Sub1) {
						local147 = ((Class23_Sub2_Sub1) local491.aClass23_Sub2_10).aShort123;
						local528 = ((Class23_Sub2_Sub1) local491.aClass23_Sub2_10).aShort124;
					} else {
						local147 = local491.aClass23_Sub2_10.anInt10108 >> 9;
						local528 = local491.aClass23_Sub2_10.anInt10109 >> 9;
					}
					@Pc(649) int local649;
					@Pc(660) int local660;
					@Pc(767) int local767;
					@Pc(552) int local552;
					if (local491.aClass23_Sub2_10 instanceof Class23_Sub2_Sub1_Sub2_Sub1) {
						@Pc(548) Class23_Sub2_Sub1_Sub2_Sub1 local548 = (Class23_Sub2_Sub1_Sub2_Sub1) local491.aClass23_Sub2_10;
						local552 = local548.method8625();
						if ((local552 & 0x1) == 0 && (local548.anInt10108 & 0x1FF) == 0 && (local548.anInt10109 & 0x1FF) == 0 || (local552 & 0x1) == 1 && (local548.anInt10108 & 0x1FF) == 256 && (local548.anInt10109 & 0x1FF) == 256) {
							local271 = local548.anInt10108 - (local548.method8625() - 1 << 8);
							local280 = local548.anInt10109 - (local548.method8625() - 1 << 8);
							for (local291 = 0; local291 < Static308.anInt5687; local291++) {
								@Pc(623) Class3_Sub11 local623 = (Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local291]);
								if (local623 != null) {
									@Pc(628) Class23_Sub2_Sub1_Sub2_Sub2 local628 = local623.aClass23_Sub2_Sub1_Sub2_Sub2_1;
									if (Static621.anInt9665 != local628.anInt10124 && local628.aBoolean747) {
										local649 = local628.anInt10108 - (local628.aClass5_1.anInt66 - 1 << 8);
										local660 = local628.anInt10109 - (local628.aClass5_1.anInt66 - 1 << 8);
										if (local649 >= local271 && local628.aClass5_1.anInt66 <= local548.method8625() - (local649 - local271 >> 9) && local280 <= local660 && local628.aClass5_1.anInt66 <= local548.method8625() - (local660 - local280 >> 9)) {
											Static146.method2533(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local491.aClass23_Sub2_10.aByte142, local628);
											local628.anInt10124 = Static621.anInt9665;
										}
									}
								}
							}
							local302 = Static187.anInt3432;
							@Pc(731) int[] local731 = Static668.anIntArray664;
							for (local649 = 0; local649 < local302; local649++) {
								@Pc(741) Class23_Sub2_Sub1_Sub2_Sub1 local741 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local731[local649]];
								if (local741 != null && Static621.anInt9665 != local741.anInt10124 && local741 != local548 && local741.aBoolean747) {
									local767 = local741.anInt10108 - (local741.method8625() - 1 << 8);
									@Pc(778) int local778 = local741.anInt10109 - (local741.method8625() - 1 << 8);
									if (local271 <= local767 && local741.method8625() <= local548.method8625() - (local767 - local271 >> 9) && local778 >= local280 && local741.method8625() <= local548.method8625() - (local778 - local280 >> 9)) {
										Static245.method3918(local741, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local491.aClass23_Sub2_10.aByte142);
										local741.anInt10124 = Static621.anInt9665;
									}
								}
							}
						}
						if (local548.anInt10124 == Static621.anInt9665) {
							continue;
						}
						Static245.method3918(local548, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local491.aClass23_Sub2_10.aByte142);
						local548.anInt10124 = Static621.anInt9665;
					}
					if (local491.aClass23_Sub2_10 instanceof Class23_Sub2_Sub1_Sub2_Sub2) {
						@Pc(879) Class23_Sub2_Sub1_Sub2_Sub2 local879 = (Class23_Sub2_Sub1_Sub2_Sub2) local491.aClass23_Sub2_10;
						if (local879.aClass5_1 != null) {
							if ((local879.aClass5_1.anInt66 & 0x1) == 0 && (local879.anInt10108 & 0x1FF) == 0 && (local879.anInt10109 & 0x1FF) == 0 || (local879.aClass5_1.anInt66 & 0x1) == 1 && (local879.anInt10108 & 0x1FF) == 256 && (local879.anInt10109 & 0x1FF) == 256) {
								local552 = local879.anInt10108 - (local879.aClass5_1.anInt66 - 1 << 8);
								local271 = local879.anInt10109 - (local879.aClass5_1.anInt66 - 1 << 8);
								for (local280 = 0; local280 < Static308.anInt5687; local280++) {
									@Pc(957) Class3_Sub11 local957 = (Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local280]);
									if (local957 != null) {
										@Pc(962) Class23_Sub2_Sub1_Sub2_Sub2 local962 = local957.aClass23_Sub2_Sub1_Sub2_Sub2_1;
										if (Static621.anInt9665 != local962.anInt10124 && local962 != local879 && local962.aBoolean747) {
											local350 = local962.anInt10108 - (local962.aClass5_1.anInt66 - 1 << 8);
											local649 = local962.anInt10109 - (local962.aClass5_1.anInt66 - 1 << 8);
											if (local350 >= local552 && local879.aClass5_1.anInt66 - (local350 - local552 >> 9) >= local962.aClass5_1.anInt66 && local271 <= local649 && local962.aClass5_1.anInt66 <= local879.aClass5_1.anInt66 - (local649 - local271 >> 9)) {
												Static146.method2533(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local491.aClass23_Sub2_10.aByte142, local962);
												local962.anInt10124 = Static621.anInt9665;
											}
										}
									}
								}
								local291 = Static187.anInt3432;
								@Pc(1065) int[] local1065 = Static668.anIntArray664;
								for (local350 = 0; local350 < local291; local350++) {
									@Pc(1075) Class23_Sub2_Sub1_Sub2_Sub1 local1075 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local1065[local350]];
									if (local1075 != null && local1075.anInt10124 != Static621.anInt9665 && local1075.aBoolean747) {
										local660 = local1075.anInt10108 - (local1075.method8625() - 1 << 8);
										local767 = local1075.anInt10109 - (local1075.method8625() - 1 << 8);
										if (local552 <= local660 && local1075.method8625() <= local879.aClass5_1.anInt66 - (local660 - local552 >> 9) && local271 <= local767 && local1075.method8625() <= local879.aClass5_1.anInt66 - (local767 - local271 >> 9)) {
											Static245.method3918(local1075, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local491.aClass23_Sub2_10.aByte142);
											local1075.anInt10124 = Static621.anInt9665;
										}
									}
								}
							}
							if (local879.anInt10124 == Static621.anInt9665) {
								continue;
							}
							Static146.method2533(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local491.aClass23_Sub2_10.aByte142, local879);
							local879.anInt10124 = Static621.anInt9665;
						}
					}
					if (local491.aClass23_Sub2_10 instanceof Class23_Sub2_Sub4_Sub1) {
						@Pc(1215) int local1215 = Static417.anInt7047 + local147;
						local552 = Static347.anInt7851 + local528;
						@Pc(1236) Class3_Sub24 local1236 = (Class3_Sub24) Static421.aClass62_32.method1682((long) (local552 << 14 | local491.aClass23_Sub2_10.aByte142 << 28 | local1215));
						if (local1236 != null) {
							local280 = 0;
							for (@Pc(1246) Class3_Sub25 local1246 = (Class3_Sub25) local1236.aClass193_26.method4456(); local1246 != null; local1246 = (Class3_Sub25) local1236.aClass193_26.method4460()) {
								@Pc(1254) Class146 local1254 = Static237.aClass371_2.method8305(local1246.anInt4451);
								if (Static329.aBoolean166 && local491.aClass23_Sub2_10.aByte142 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142) {
									@Pc(1272) Class328 local1272 = Static104.anInt2203 == -1 ? null : Static145.aClass165_1.method3812(Static104.anInt2203);
									if ((Static7.anInt94 & 0x1) != 0 && (local1272 == null || local1254.method3206(local1272.anInt8911, Static104.anInt2203) != local1272.anInt8911)) {
										Static225.method3514(true, false, -1, Static158.anInt2968, local528, (long) local1246.anInt4451, Static542.aString107 + " -> <col=ff9040>" + local1254.aString46, 13, Static46.aString12, (long) local280, false, local147);
									}
								}
								if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 == local491.aClass23_Sub2_10.aByte142) {
									@Pc(1331) String[] local1331 = local1254.aStringArray29;
									for (local649 = 4; local649 >= 0; local649--) {
										if (local1331 != null && local1331[local649] != null) {
											@Pc(1343) byte local1343 = 0;
											local767 = Static581.anInt9234;
											if (local649 == 0) {
												local1343 = 11;
											}
											if (local649 == 1) {
												local1343 = 19;
											}
											if (local649 == 2) {
												local1343 = 47;
											}
											if (local649 == 3) {
												local1343 = 30;
											}
											if (local649 == 4) {
												local1343 = 48;
											}
											if (local1254.anInt3701 == local649) {
												local767 = local1254.anInt3690;
											}
											if (local649 == local1254.anInt3697) {
												local767 = local1254.anInt3722;
											}
											Static225.method3514(true, false, -1, local767, local528, (long) local1246.anInt4451, "<col=ff9040>" + local1254.aString46, local1343, local1331[local649], (long) local280, false, local147);
										}
									}
								}
								Static225.method3514(true, false, -1, Static674.anInt10304, local528, (long) local1246.anInt4451, "<col=ff9040>" + local1254.aString46, 1002, Static569.aClass335_23.method7694(Static319.anInt5939), (long) local280, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local491.aClass23_Sub2_10.aByte142, local147);
								local280++;
							}
						}
					}
					if (local491.aClass23_Sub2_10 instanceof Interface2) {
						@Pc(1478) Interface2 local1478 = (Interface2) local491.aClass23_Sub2_10;
						@Pc(1485) Class178 local1485 = Static349.aClass374_2.method8357(local1478.method7823());
						if (local1485.anIntArray313 != null) {
							local1485 = local1485.method4012(Static592.aClass47_2);
						}
						if (local1485 != null) {
							if (Static329.aBoolean166 && local491.aClass23_Sub2_10.aByte142 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142) {
								@Pc(1518) Class328 local1518 = Static104.anInt2203 == -1 ? null : Static145.aClass165_1.method3812(Static104.anInt2203);
								if ((Static7.anInt94 & 0x4) != 0 && (local1518 == null || local1485.method4015(local1518.anInt8911, Static104.anInt2203) != local1518.anInt8911)) {
									Static225.method3514(true, false, -1, Static158.anInt2968, local528, Static128.method2244(local1478, local528, local147), Static542.aString107 + " -> <col=00ffff>" + local1485.aString60, 49, Static46.aString12, (long) local1478.hashCode(), false, local147);
								}
							}
							if (local491.aClass23_Sub2_10.aByte142 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142) {
								@Pc(1580) String[] local1580 = local1485.aStringArray35;
								if (local1580 != null) {
									for (local280 = 4; local280 >= 0; local280--) {
										if (local1580[local280] != null) {
											@Pc(1592) short local1592 = 0;
											if (local280 == 0) {
												local1592 = 53;
											}
											local302 = Static581.anInt9234;
											if (local280 == 1) {
												local1592 = 59;
											}
											if (local280 == 2) {
												local1592 = 12;
											}
											if (local280 == 3) {
												local1592 = 21;
											}
											if (local280 == 4) {
												local1592 = 1010;
											}
											if (local1485.anInt4744 == local280) {
												local302 = local1485.anInt4736;
											}
											if (local1485.anInt4777 == local280) {
												local302 = local1485.anInt4783;
											}
											Static225.method3514(true, false, -1, local302, local528, Static128.method2244(local1478, local528, local147), "<col=00ffff>" + local1485.aString60, local1592, local1580[local280], (long) local1478.hashCode(), false, local147);
										}
									}
								}
								Static225.method3514(true, false, -1, Static674.anInt10304, local528, (long) local1485.anInt4778, "<col=00ffff>" + local1485.aString60, 1007, Static569.aClass335_23.method7694(Static319.anInt5939), (long) local1478.hashCode(), Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local491.aClass23_Sub2_10.aByte142, local147);
							}
						}
					}
				}
			}
			if (Static649.aBoolean735) {
				Static80.method8694();
			}
		}
		Static241.method3895(false);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(B)V")
	public static void method6627() {
		while (true) {
			if (Static67.aClass3_Sub17_Sub2_4.method4901(Static548.anInt8905) >= 15) {
				@Pc(16) int local16 = Static67.aClass3_Sub17_Sub2_4.method4905(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					@Pc(28) Class3_Sub11 local28 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local16);
					@Pc(34) Class23_Sub2_Sub1_Sub2_Sub2 local34;
					if (local28 == null) {
						local34 = new Class23_Sub2_Sub1_Sub2_Sub2();
						local34.anInt10180 = local16;
						local28 = new Class3_Sub11(local34);
						Static500.aClass62_40.method1686((long) local16, local28);
						Static43.aClass3_Sub11Array1[Static609.anInt6433++] = local28;
						local21 = true;
					}
					local34 = local28.aClass23_Sub2_Sub1_Sub2_Sub2_1;
					Static390.anIntArray424[Static308.anInt5687++] = local16;
					local34.anInt10155 = Static76.anInt1726;
					if (local34.aClass5_1 != null && local34.aClass5_1.method61()) {
						Static360.method5393(local34);
					}
					@Pc(94) int local94 = Static67.aClass3_Sub17_Sub2_4.method4905(3) + 4 << 11 & 0x3FB0;
					@Pc(99) int local99 = Static67.aClass3_Sub17_Sub2_4.method4905(1);
					@Pc(104) int local104 = Static67.aClass3_Sub17_Sub2_4.method4905(5);
					local34.method8636(Static481.aClass241_2.method5582(Static67.aClass3_Sub17_Sub2_4.method4905(14)));
					if (local104 > 15) {
						local104 -= 32;
					}
					@Pc(123) int local123 = Static67.aClass3_Sub17_Sub2_4.method4905(2);
					@Pc(128) int local128 = Static67.aClass3_Sub17_Sub2_4.method4905(5);
					if (local128 > 15) {
						local128 -= 32;
					}
					@Pc(139) int local139 = Static67.aClass3_Sub17_Sub2_4.method4905(1);
					if (local139 == 1) {
						Static256.anIntArray321[Static344.anInt6196++] = local16;
					}
					local34.method8621(local34.aClass5_1.anInt66);
					local34.anInt10133 = local34.aClass5_1.anInt55 << 3;
					if (local21) {
						local34.method8623(local94, true);
					}
					local34.method8638(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0] + local128, local123, local34.method8625(), local104 + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0], local99 == 1);
					if (local34.aClass5_1.method61()) {
						Static420.method5992(local34.anIntArray660[0], local34.aByte142, (Class178) null, 0, local34.anIntArray659[0], (Class23_Sub2_Sub1_Sub2_Sub1) null, local34);
					}
					continue;
				}
			}
			Static67.aClass3_Sub17_Sub2_4.method4908();
			return;
		}
	}
}
