import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!ef;")
	public static final Class87 aClass87_1 = new Class87();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!wv;)V")
	public static void method140(@OriginalArg(1) Class395 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (Static42.aClass395_3 == arg0) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local16 = Static481.aClass14_Sub29_Sub1_2.method5866();
			Static511.aClass13_2.method86(local12).method5013(local16);
			return;
		}
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(81) int local81;
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (arg0 == Static216.aClass395_7) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local16 = (local12 >> 4 & 0x7) + Static405.anInt7422;
			local46 = Static53.anInt1297 + (local12 & 0x7);
			local50 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local54 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local58 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local62 = Static481.aClass14_Sub29_Sub1_2.method5866();
			if (local16 >= 0 && local46 >= 0 && local16 < Static26.anInt462 && Static445.anInt6140 > local46) {
				local81 = local16 * 512 + 256;
				local87 = local46 * 512 + 256;
				local89 = Static474.anInt2217;
				if (local89 < 3 && Static329.method5158(local46, local16)) {
					local89++;
				}
				@Pc(122) Class12_Sub2_Sub2_Sub5 local122 = new Class12_Sub2_Sub2_Sub5(local50, local58, Static87.anInt1951, Static474.anInt2217, local89, local81, Static152.method2434(local81, Static474.anInt2217, local87) - local54, local87, local16, local16, local46, local46, local62);
				Static551.aClass262_40.method6314(new Class14_Sub3_Sub4(local122));
			}
			return;
		}
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(234) int local234;
		@Pc(238) int local238;
		@Pc(242) int local242;
		@Pc(217) int local217;
		if (arg0 == Static134.aClass395_8) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local16 = (local12 >> 4 & 0xF) + Static405.anInt7422 * 2;
			local46 = Static53.anInt1297 * 2 + (local12 & 0xF);
			local50 = Static481.aClass14_Sub29_Sub1_2.method5866();
			@Pc(170) boolean local170 = (local50 & 0x1) != 0;
			@Pc(181) boolean local181 = (local50 & 0x2) != 0;
			local62 = local181 ? local50 >> 2 : -1;
			local81 = Static481.aClass14_Sub29_Sub1_2.method5845() + local16;
			local87 = Static481.aClass14_Sub29_Sub1_2.method5845() + local46;
			local89 = Static481.aClass14_Sub29_Sub1_2.method5890();
			local209 = Static481.aClass14_Sub29_Sub1_2.method5890();
			local213 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local217 = Static481.aClass14_Sub29_Sub1_2.method5866();
			if (local181) {
				local217 = (byte) local217;
			} else {
				local217 *= 4;
			}
			local234 = Static481.aClass14_Sub29_Sub1_2.method5866() * 4;
			local238 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local242 = Static481.aClass14_Sub29_Sub1_2.method5900();
			@Pc(246) int local246 = Static481.aClass14_Sub29_Sub1_2.method5866();
			if (local246 == 255) {
				local246 = -1;
			}
			@Pc(255) int local255 = Static481.aClass14_Sub29_Sub1_2.method5900();
			if (local16 >= 0 && local46 >= 0 && Static26.anInt462 * 2 > local16 && Static26.anInt462 * 2 > local46 && local81 >= 0 && local87 >= 0 && Static445.anInt6140 * 2 > local81 && local87 < Static445.anInt6140 * 2 && local213 != 65535) {
				local87 = local87 * 256;
				local217 <<= 0x2;
				local81 *= 256;
				local234 <<= 0x2;
				local46 *= 256;
				local16 *= 256;
				local255 <<= 0x2;
				if (local89 != 0 && local62 != -1) {
					@Pc(339) Class12_Sub2_Sub2_Sub1 local339 = null;
					@Pc(348) int local348;
					if (local89 >= 0) {
						local348 = local89 - 1;
						@Pc(355) Class14_Sub44 local355 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local348);
						if (local355 != null) {
							local339 = local355.aClass12_Sub2_Sub2_Sub1_Sub1_2;
						}
					} else {
						local348 = -local89 - 1;
						if (Static568.anInt9800 == local348) {
							local339 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2;
						} else {
							local339 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local348];
						}
					}
					if (local339 != null) {
						@Pc(382) Class132 local382 = local339.method2416();
						if (local382.anIntArrayArray22 != null && local382.anIntArrayArray22[local62] != null) {
							local217 -= local382.anIntArrayArray22[local62][1];
						}
						if (local382.anIntArrayArray21 != null && local382.anIntArrayArray21[local62] != null) {
							local217 -= local382.anIntArrayArray21[local62][1];
						}
					}
				}
				@Pc(439) Class12_Sub2_Sub2_Sub4 local439 = new Class12_Sub2_Sub2_Sub4(local213, Static474.anInt2217, Static474.anInt2217, local16, local46, local217, local238 + Static87.anInt1951, Static87.anInt1951 + local242, local246, local255, local89, local209, local234, local170, local62);
				local439.method4125(Static87.anInt1951 + local238, local81, Static152.method2434(local81, Static474.anInt2217, local87) - local234, local87);
				Static144.aClass262_13.method6314(new Class14_Sub3_Sub10(local439));
			}
		} else if (Static419.aClass395_11 == arg0) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local16 = (local12 & 0x7) + Static53.anInt1297;
			local46 = local16 + Static202.anInt3755;
			local50 = Static405.anInt7422 + (local12 >> 4 & 0x7);
			local54 = local50 + Static329.anInt6225;
			local58 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local62 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local81 = Static481.aClass14_Sub29_Sub1_2.method5900();
			if (Static568.aClass187_71 != null) {
				@Pc(523) Class14_Sub42 local523 = (Class14_Sub42) Static568.aClass187_71.method4078((long) (Static474.anInt2217 << 28 | local46 << 14 | local54));
				if (local523 != null) {
					for (@Pc(531) Class14_Sub41 local531 = (Class14_Sub41) local523.aClass262_47.method6318(); local531 != null; local531 = (Class14_Sub41) local523.aClass262_47.method6311()) {
						if ((local58 & 0x7FFF) == local531.anInt7971 && local62 == local531.anInt7970) {
							local531.method9315();
							local531.anInt7970 = local81;
							Static476.method6899(Static474.anInt2217, local46, local531, local54);
							break;
						}
					}
					if (local50 >= 0 && local16 >= 0 && local50 < Static26.anInt462 && local16 < Static445.anInt6140) {
						Static236.method3563(local50, Static474.anInt2217, local16);
					}
				}
			}
		} else if (arg0 == Static230.aClass395_9) {
			Static481.aClass14_Sub29_Sub1_2.method5866();
			local12 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local16 = (local12 >> 4 & 0x7) + Static405.anInt7422;
			local46 = (local12 & 0x7) + Static53.anInt1297;
			local50 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local54 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local58 = Static481.aClass14_Sub29_Sub1_2.method5862();
			@Pc(629) String local629 = Static481.aClass14_Sub29_Sub1_2.method5898();
			Static164.method2651(local50, local58, local16, local46, local54, Static474.anInt2217, local629);
		} else if (arg0 == Static209.aClass395_5) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local16 = Static481.aClass14_Sub29_Sub1_2.method5876();
			local46 = Static481.aClass14_Sub29_Sub1_2.method5842();
			local50 = (local46 & 0x7) + Static53.anInt1297;
			local54 = local50 + Static202.anInt3755;
			local58 = Static405.anInt7422 + (local46 >> 4 & 0x7);
			local62 = local58 + Static329.anInt6225;
			@Pc(702) boolean local702 = local58 >= 0 && local50 >= 0 && local58 < Static26.anInt462 && Static445.anInt6140 > local50;
			if (local702 || Static175.method2827(Static74.anInt1617)) {
				Static476.method6899(Static474.anInt2217, local54, new Class14_Sub41(local16, local12), local62);
				if (local702) {
					Static236.method3563(local58, Static474.anInt2217, local50);
				}
			}
		} else if (Static214.aClass395_6 == arg0) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5866();
			@Pc(741) boolean local741 = (local12 & 0x80) != 0;
			local46 = Static405.anInt7422 + (local12 >> 3 & 0x7);
			local50 = Static53.anInt1297 + (local12 & 0x7);
			local54 = local46 + Static481.aClass14_Sub29_Sub1_2.method5845();
			local58 = Static481.aClass14_Sub29_Sub1_2.method5845() + local50;
			local62 = Static481.aClass14_Sub29_Sub1_2.method5890();
			local81 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local87 = Static481.aClass14_Sub29_Sub1_2.method5866() * 4;
			local89 = Static481.aClass14_Sub29_Sub1_2.method5866() * 4;
			local209 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local213 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local217 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local234 = Static481.aClass14_Sub29_Sub1_2.method5900();
			if (local217 == 255) {
				local217 = -1;
			}
			if (local46 >= 0 && local50 >= 0 && Static26.anInt462 > local46 && local50 < Static445.anInt6140 && local54 >= 0 && local58 >= 0 && local54 < Static26.anInt462 && Static445.anInt6140 > local58 && local81 != 65535) {
				local234 <<= 0x2;
				local54 = local54 * 512 + 256;
				local50 = local50 * 512 + 256;
				local46 = local46 * 512 + 256;
				local89 <<= 0x2;
				local87 <<= 0x2;
				local58 = local58 * 512 + 256;
				@Pc(906) Class12_Sub2_Sub2_Sub4 local906 = new Class12_Sub2_Sub2_Sub4(local81, Static474.anInt2217, Static474.anInt2217, local46, local50, local87, Static87.anInt1951 + local209, Static87.anInt1951 + local213, local217, local234, 0, local62, local89, local741, -1);
				local906.method4125(Static87.anInt1951 + local209, local54, Static152.method2434(local54, Static474.anInt2217, local58) - local89, local58);
				Static144.aClass262_13.method6314(new Class14_Sub3_Sub10(local906));
			}
		} else if (Static421.aClass395_12 == arg0) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local16 = Static405.anInt7422 + (local12 >> 4 & 0x7);
			local46 = (local12 & 0x7) + Static53.anInt1297;
			local50 = Static481.aClass14_Sub29_Sub1_2.method5900();
			if (local50 == 65535) {
				local50 = -1;
			}
			local54 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local58 = local54 >> 4 & 0xF;
			local62 = local54 & 0x7;
			local81 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local87 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local89 = Static481.aClass14_Sub29_Sub1_2.method5900();
			if (local16 >= 0 && local46 >= 0 && local16 < Static26.anInt462 && local46 < Static445.anInt6140) {
				local209 = local58 + 1;
				if (local16 - local209 <= Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0] && local209 + local16 >= Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0] && local46 - local209 <= Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0] && local209 + local46 >= Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0]) {
					Static679.method9321(local89, local62, local87, local50, local58 + (local16 << 16) + (Static474.anInt2217 << 24) + (local46 << 8), local81);
				}
			}
		} else if (Static360.aClass395_10 == arg0) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local16 = Static405.anInt7422 + (local12 >> 4 & 0x7);
			local46 = Static53.anInt1297 + (local12 & 0x7);
			local50 = Static481.aClass14_Sub29_Sub1_2.method5900();
			if (local50 == 65535) {
				local50 = -1;
			}
			local54 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local58 = local54 >> 4 & 0xF;
			local62 = local54 & 0x7;
			local81 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local87 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local89 = Static481.aClass14_Sub29_Sub1_2.method5900();
			if (local16 >= 0 && local46 >= 0 && Static26.anInt462 > local16 && Static445.anInt6140 > local46) {
				local209 = local58 + 1;
				if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0] >= local16 - local209 && Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0] <= local209 + local16 && local46 - local209 <= Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0] && local46 + local209 >= Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0]) {
					Static531.method7615(local58 + (Static474.anInt2217 << 24) + (local16 << 16) + (local46 << 8), local62, local87, local81, local50, local89);
				}
			}
		} else if (Static32.aClass395_15 == arg0) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5842();
			local16 = (local12 >> 4 & 0x7) + Static405.anInt7422;
			local46 = Static53.anInt1297 + (local12 & 0x7);
			local50 = Static481.aClass14_Sub29_Sub1_2.method5842();
			local54 = local50 >> 2;
			local58 = local50 & 0x3;
			local62 = Static55.anIntArray93[local54];
			if (Static175.method2827(Static74.anInt1617) || local16 >= 0 && local46 >= 0 && Static26.anInt462 > local16 && local46 < Static445.anInt6140) {
				Static517.method7486(-1, local54, local58, local62, local16, local46, Static474.anInt2217);
			}
		} else if (arg0 == Static530.aClass395_14) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5840();
			@Pc(1295) Class203 local1295 = Static511.aClass13_2.method86(local12);
			local46 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local50 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local54 = Static405.anInt7422 + (local50 >> 4 & 0x7);
			local58 = (local50 & 0x7) + Static53.anInt1297;
			local62 = Static481.aClass14_Sub29_Sub1_2.method5888();
			local81 = local62 >> 2;
			local87 = Static55.anIntArray93[local81];
			if (local81 == 11) {
				local81 = 10;
			}
			local89 = 0;
			if (local1295.aByteArray70 != null) {
				local209 = -1;
				for (local213 = 0; local213 < local1295.aByteArray70.length; local213++) {
					if (local1295.aByteArray70[local213] == local81) {
						local209 = local213;
						break;
					}
				}
				local89 = local1295.anIntArrayArray35[local209].length;
			}
			local209 = 0;
			if (local1295.aShortArray94 != null) {
				local209 = local1295.aShortArray94.length;
			}
			local213 = 0;
			if (local1295.aShortArray95 != null) {
				local213 = local1295.aShortArray95.length;
			}
			if ((local46 & 0x1) == 1) {
				Static67.method1343(local87, local58, Static474.anInt2217, (Class232) null, local54);
			} else {
				@Pc(1409) int[] local1409 = null;
				if ((local46 & 0x2) == 2) {
					local1409 = new int[local89];
					for (local234 = 0; local234 < local89; local234++) {
						local1409[local234] = Static481.aClass14_Sub29_Sub1_2.method5900();
					}
				}
				@Pc(1435) short[] local1435 = null;
				if ((local46 & 0x4) == 4) {
					local1435 = new short[local209];
					for (local238 = 0; local238 < local209; local238++) {
						local1435[local238] = (short) Static481.aClass14_Sub29_Sub1_2.method5900();
					}
				}
				@Pc(1460) short[] local1460 = null;
				if ((local46 & 0x8) == 8) {
					local1460 = new short[local213];
					for (local242 = 0; local242 < local213; local242++) {
						local1460[local242] = (short) Static481.aClass14_Sub29_Sub1_2.method5900();
					}
				}
				Static67.method1343(local87, local58, Static474.anInt2217, new Class232((long) Static382.aLong195++, local1409, local1435, local1460), local54);
			}
		} else if (arg0 == Static603.aClass395_16) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local16 = Static481.aClass14_Sub29_Sub1_2.method5842();
			local46 = (local16 >> 4 & 0x7) + Static405.anInt7422;
			local50 = (local16 & 0x7) + Static53.anInt1297;
			local54 = Static481.aClass14_Sub29_Sub1_2.method5888();
			local58 = local54 >> 2;
			local62 = local54 & 0x3;
			local81 = Static55.anIntArray93[local58];
			if (Static175.method2827(Static74.anInt1617) || local46 >= 0 && local50 >= 0 && Static26.anInt462 > local46 && Static445.anInt6140 > local50) {
				Static517.method7486(local12, local58, local62, local81, local46, local50, Static474.anInt2217);
			}
		} else if (arg0 == Static428.aClass395_13) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5866();
			local16 = local12 >> 2;
			local46 = local12 & 0x3;
			local50 = Static55.anIntArray93[local16];
			local54 = Static481.aClass14_Sub29_Sub1_2.method5884();
			if (local54 == 65535) {
				local54 = -1;
			}
			local58 = Static481.aClass14_Sub29_Sub1_2.method5842();
			local62 = Static405.anInt7422 + (local58 >> 4 & 0x7);
			local81 = (local58 & 0x7) + Static53.anInt1297;
			Static490.method7253(local62, local81, local16, local50, Static474.anInt2217, local46, local54);
		} else if (Static636.aClass395_17 == arg0) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5846();
			local16 = Static53.anInt1297 + (local12 & 0x7);
			local46 = Static202.anInt3755 + local16;
			local50 = Static405.anInt7422 + (local12 >> 4 & 0x7);
			local54 = local50 + Static329.anInt6225;
			local58 = Static481.aClass14_Sub29_Sub1_2.method5884();
			@Pc(1678) Class14_Sub42 local1678 = (Class14_Sub42) Static568.aClass187_71.method4078((long) (local54 | local46 << 14 | Static474.anInt2217 << 28));
			if (local1678 != null) {
				for (@Pc(1686) Class14_Sub41 local1686 = (Class14_Sub41) local1678.aClass262_47.method6318(); local1686 != null; local1686 = (Class14_Sub41) local1678.aClass262_47.method6311()) {
					if (local1686.anInt7971 == (local58 & 0x7FFF)) {
						local1686.method9315();
						break;
					}
				}
				if (local1678.aClass262_47.method6324()) {
					local1678.method9315();
				}
				if (local50 >= 0 && local16 >= 0 && Static26.anInt462 > local50 && local16 < Static445.anInt6140) {
					Static236.method3563(local50, Static474.anInt2217, local16);
				}
			}
		} else if (arg0 == Static21.aClass395_1) {
			local12 = Static481.aClass14_Sub29_Sub1_2.method5888();
			local16 = Static53.anInt1297 + (local12 & 0x7);
			local46 = local16 + Static202.anInt3755;
			local50 = (local12 >> 4 & 0x7) + Static405.anInt7422;
			local54 = Static329.anInt6225 + local50;
			local58 = Static481.aClass14_Sub29_Sub1_2.method5884();
			local62 = Static481.aClass14_Sub29_Sub1_2.method5900();
			local81 = Static481.aClass14_Sub29_Sub1_2.method5840();
			if (local81 != Static568.anInt9800) {
				@Pc(1814) boolean local1814 = local50 >= 0 && local16 >= 0 && local50 < Static26.anInt462 && Static445.anInt6140 > local16;
				if (local1814 || Static175.method2827(Static74.anInt1617)) {
					Static476.method6899(Static474.anInt2217, local46, new Class14_Sub41(local58, local62), local54);
					if (local1814) {
						Static236.method3563(local50, Static474.anInt2217, local16);
					}
				}
			}
		} else {
			Static524.method7532("T3 - " + arg0, (Throwable) null);
			Static128.method2105(false);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZII)V")
	public static void method141(@OriginalArg(1) boolean arg0) {
		Static515.anInt9036 = 22050;
		Static650.anInt10864 = 2;
		Static40.aBoolean129 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z")
	public static boolean method142(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	public static void method144() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static113.aClass109Array1.length; local3++) {
				if (Static113.aClass109Array1[local3].method2658()) {
					Static407.aLongArray18[local3] = Static113.aClass109Array1[local3].method2653();
				} else {
					synchronized (Static113.aClass109Array1[local3]) {
						Static113.aClass109Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static113.aClass109Array1[Static113.aClass109Array1.length - 1].method2656();
				Static422.method6249(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static113.aClass109Array1.length - 1; local3++) {
						if (!Static113.aClass109Array1[local3].method2658()) {
							synchronized (Static113.aClass109Array1[local3]) {
								Static113.aClass109Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static113.aClass109Array1.length - 2; local102++) {
							Static113.aClass109Array1[local102].method2656();
						}
						Static422.method6249(2);
						while (!Static113.aClass109Array1[0].method2658()) {
							synchronized (Static113.aClass109Array1[0]) {
								Static113.aClass109Array1[0].notify();
							}
							try {
								Static20.method9254(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static113.aClass109Array1[0].method2656();
						return;
					}
					try {
						Static20.method9254(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static20.method9254(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Z")
	public static boolean method145(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
