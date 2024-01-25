import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!rca", name = "M", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_186 = new Class362(99, 0);

	@OriginalMember(owner = "client!rca", name = "rb", descriptor = "[J")
	public static final long[] aLongArray15 = new long[100];

	@OriginalMember(owner = "client!rca", name = "ub", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[6][];

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method6886(@OriginalArg(1) byte[] arg0) {
		return Static534.method7768(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BI)V")
	public static void method6888(@OriginalArg(0) byte arg0) {
		if (Static483.aByteArrayArrayArray18 == null) {
			Static483.aByteArrayArrayArray18 = new byte[4][Static428.anInt8046][Static119.anInt2717];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < Static428.anInt8046; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static119.anInt2717; local26++) {
					Static483.aByteArrayArrayArray18[local18][local22][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "l", descriptor = "(I)V")
	public static void method6890() {
		for (@Pc(12) Class4_Sub39 local12 = (Class4_Sub39) Static40.aClass244_4.method5963(); local12 != null; local12 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
			if (Static150.method2826(local12.anInt8541)) {
				Static233.method3750(local12);
			}
		}
		if (Static339.anInt6583 == 1) {
			Static222.method3622();
			return;
		}
		Static82.method1377(Static543.anInt9642, Static179.anInt3618, Static17.anInt279, Static19.anInt285);
		@Pc(52) int local52 = Static314.aClass114_11.method2950(Static590.aClass364_28.method8334(Static154.anInt3181));
		for (@Pc(57) Class4_Sub39 local57 = (Class4_Sub39) Static40.aClass244_4.method5963(); local57 != null; local57 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
			@Pc(63) int local63 = Static505.method7413(local57);
			if (local52 < local63) {
				local52 = local63;
			}
		}
		Static17.anInt279 = Static339.anInt6583 * 16 + (Static567.aBoolean701 ? 26 : 22);
		Static179.anInt3618 = local52 + 8;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B[[BLclient!js;)V")
	public static void method6891(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class179_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class4_Sub11 local35 = new Class4_Sub11(local28);
				local41 = Static75.anIntArray18[local22] >> 8;
				@Pc(47) int local47 = Static75.anIntArray18[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static552.anInt9805;
				@Pc(61) int local61 = local47 * 64 - Static254.anInt4667;
				Static390.method6204();
				arg1.method4056(Static552.anInt9805, Static86.aClass111Array1, local54, Static254.anInt4667, local61, local35);
				arg1.method4070(local54, local61, local12, Static440.aClass44_12, local35);
				if (!arg1.aBoolean331 && local41 == Static541.anInt9603 / 8 && Static540.anInt5859 / 8 == local47 && local12[0] != -1) {
					Static529.aClass215_1 = Static419.aClass28_1.method457(local12[0], Static594.aClass170_1, local12[3], local12[2], local12[1]);
					Static177.anInt9180 = local12[4];
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < local20; local131++) {
			@Pc(143) int local143 = (Static75.anIntArray18[local131] >> 8) * 64 - Static552.anInt9805;
			local41 = (Static75.anIntArray18[local131] & 0xFF) * 64 - Static254.anInt4667;
			@Pc(157) byte[] local157 = arg0[local131];
			if (local157 == null && Static540.anInt5859 < 800) {
				Static390.method6204();
				arg1.method4057(local41, local143);
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!iv;)V")
	public static void method6892(@OriginalArg(1) Class162 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(43) int local43;
		if (arg0 == Static274.aClass162_14) {
			local12 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local16 = Static319.aClass4_Sub11_Sub1_2.method4950();
			local20 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local26 = (local20 & 0x7) + Static39.anInt538;
			local30 = local26 + Static254.anInt4667;
			local38 = Static570.anInt9983 + (local20 >> 4 & 0x7);
			local43 = Static552.anInt9805 + local38;
			@Pc(67) boolean local67 = local38 >= 0 && local26 >= 0 && Static428.anInt8046 > local38 && Static119.anInt2717 > local26;
			if (local67 || Static128.method2628(Static358.anInt6981)) {
				Static351.method7423(local30, new Class4_Sub20(local16, local12), local43, Static102.anInt6216);
				if (local67) {
					Static270.method4609(local38, local26, Static102.anInt6216);
				}
			}
			return;
		}
		@Pc(147) int local147;
		@Pc(151) int local151;
		@Pc(243) int local243;
		@Pc(169) int local169;
		@Pc(173) int local173;
		@Pc(177) int local177;
		@Pc(155) int local155;
		@Pc(159) int local159;
		if (arg0 == Static153.aClass162_9) {
			local12 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local16 = (local12 >> 4 & 0xF) + Static570.anInt9983 * 2;
			local20 = (local12 & 0xF) + Static39.anInt538 * 2;
			local26 = Static319.aClass4_Sub11_Sub1_2.method4905();
			@Pc(131) boolean local131 = (local26 & 0x1) != 0;
			local38 = local26 >> 1;
			local43 = Static319.aClass4_Sub11_Sub1_2.method4925() + local16;
			local147 = Static319.aClass4_Sub11_Sub1_2.method4925() + local20;
			local151 = Static319.aClass4_Sub11_Sub1_2.method4946();
			local155 = Static319.aClass4_Sub11_Sub1_2.method4946();
			local159 = Static319.aClass4_Sub11_Sub1_2.method4936();
			@Pc(163) byte local163 = Static319.aClass4_Sub11_Sub1_2.method4925();
			local169 = Static319.aClass4_Sub11_Sub1_2.method4905() * 4;
			local173 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local177 = Static319.aClass4_Sub11_Sub1_2.method4936();
			@Pc(181) int local181 = Static319.aClass4_Sub11_Sub1_2.method4905();
			@Pc(185) int local185 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (local181 == 255) {
				local181 = -1;
			}
			if (local16 >= 0 && local20 >= 0 && local16 < Static428.anInt8046 * 2 && local20 < Static428.anInt8046 * 2 && local43 >= 0 && local147 >= 0 && Static119.anInt2717 * 2 > local43 && local147 < Static119.anInt2717 * 2 && local159 != 65535) {
				local185 <<= 0x2;
				local243 = local163 << 2;
				local16 *= 256;
				local43 *= 256;
				local147 *= 256;
				local20 *= 256;
				local169 <<= 0x2;
				if (local151 != 0) {
					@Pc(267) Class1_Sub4_Sub2_Sub1 local267 = null;
					@Pc(274) int local274;
					if (local151 < 0) {
						local274 = -local151 - 1;
						if (Static411.anInt7797 == local274) {
							local267 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1;
						} else {
							local267 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local274];
						}
					} else {
						local274 = local151 - 1;
						@Pc(296) Class4_Sub4 local296 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local274);
						if (local296 != null) {
							local267 = local296.aClass1_Sub4_Sub2_Sub1_Sub1_1;
						}
					}
					if (local267 != null) {
						@Pc(307) Class316 local307 = local267.method6921();
						if (local307.anIntArrayArray56 != null && local307.anIntArrayArray56[local38] != null) {
							@Pc(322) int local322 = local307.anIntArrayArray56[local38][0];
							@Pc(329) int local329 = local307.anIntArrayArray56[local38][2];
							@Pc(334) int local334 = local267.aClass229_7.method5582();
							@Pc(338) int local338 = Class4_Sub27.anIntArray296[local334];
							@Pc(342) int local342 = Class4_Sub27.anIntArray297[local334];
							@Pc(352) int local352 = local322 * local342 + local338 * local329 >> 14;
							@Pc(363) int local363 = local342 * local329 - local338 * local322 >> 14;
							local20 += local363;
							local16 += local352;
							local243 -= local307.anIntArrayArray56[local38][1];
						}
					}
				}
				@Pc(404) Class1_Sub4_Sub2_Sub2 local404 = new Class1_Sub4_Sub2_Sub2(local159, Static102.anInt6216, Static102.anInt6216, local16, local20, local243, Static106.anInt2418 + local173, local177 - -Static106.anInt2418, local181, local185, local155, local169, local131);
				local404.method4719(local147, local43, Static501.method5641(local43, Static102.anInt6216, local147) - local169, local173 + Static106.anInt2418);
				Static212.aClass244_30.method5960(new Class4_Sub5_Sub15(local404));
			}
		} else if (Static240.aClass162_28 == arg0) {
			local12 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local16 = (local12 >> 4 & 0x7) + Static570.anInt9983;
			local20 = (local12 & 0x7) + Static39.anInt538;
			local26 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (local26 == 65535) {
				local26 = -1;
			}
			local30 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local38 = local30 >> 4 & 0xF;
			local43 = local30 & 0x7;
			local147 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local151 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local155 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (local16 >= 0 && local20 >= 0 && Static428.anInt8046 > local16 && local20 < Static119.anInt2717) {
				local159 = local38 + 1;
				if (local16 - local159 <= Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0] && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0] <= local159 + local16 && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0] >= local20 - local159 && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0] <= local20 + local159) {
					Static90.method2083(local155, local43, local147, local26, (Static102.anInt6216 << 24) - (-(local16 << 16) - ((local20 << 8) + local38)), local151);
				}
			}
		} else if (Static220.aClass162_11 == arg0) {
			local12 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local16 = Static570.anInt9983 * 2 + (local12 >> 4 & 0xF);
			local20 = Static39.anInt538 * 2 + (local12 & 0xF);
			@Pc(610) boolean local610 = Static319.aClass4_Sub11_Sub1_2.method4905() != 0;
			local30 = local16 + Static319.aClass4_Sub11_Sub1_2.method4925();
			local38 = local20 + Static319.aClass4_Sub11_Sub1_2.method4925();
			local43 = Static319.aClass4_Sub11_Sub1_2.method4946();
			local147 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local151 = Static319.aClass4_Sub11_Sub1_2.method4905() * 4;
			local155 = Static319.aClass4_Sub11_Sub1_2.method4905() * 4;
			local159 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local243 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local169 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local173 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (local169 == 255) {
				local169 = -1;
			}
			if (local16 >= 0 && local20 >= 0 && Static428.anInt8046 * 2 > local16 && Static428.anInt8046 * 2 > local20 && local30 >= 0 && local38 >= 0 && Static119.anInt2717 * 2 > local30 && Static119.anInt2717 * 2 > local38 && local147 != 65535) {
				local30 = local30 * 256;
				local151 <<= 0x2;
				local16 = local16 * 256;
				local173 <<= 0x2;
				local38 = local38 * 256;
				local155 <<= 0x2;
				local20 *= 256;
				@Pc(755) Class1_Sub4_Sub2_Sub2 local755 = new Class1_Sub4_Sub2_Sub2(local147, Static102.anInt6216, Static102.anInt6216, local16, local20, local151, local159 + Static106.anInt2418, local243 + Static106.anInt2418, local169, local173, local43, local155, local610);
				local755.method4719(local38, local30, Static501.method5641(local30, Static102.anInt6216, local38) - local155, local159 + Static106.anInt2418);
				Static212.aClass244_30.method5960(new Class4_Sub5_Sub15(local755));
			}
		} else if (arg0 == Static247.aClass162_12) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4947();
			local20 = local16 >> 2;
			local26 = local16 & 0x3;
			local30 = Static550.anIntArray521[local20];
			local38 = Static319.aClass4_Sub11_Sub1_2.method4947();
			local43 = Static570.anInt9983 + (local38 >> 4 & 0x7);
			local147 = Static39.anInt538 + (local38 & 0x7);
			if (Static128.method2628(Static358.anInt6981) || local43 >= 0 && local147 >= 0 && local43 < Static428.anInt8046 && Static119.anInt2717 > local147) {
				Static174.method3173(local20, Static102.anInt6216, -1, local30, local43, local26, local147);
			}
		} else if (Static504.aClass162_27 == arg0) {
			Static319.aClass4_Sub11_Sub1_2.method4905();
			local16 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local20 = (local16 >> 4 & 0x7) + Static570.anInt9983;
			local26 = Static39.anInt538 + (local16 & 0x7);
			local30 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local38 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local43 = Static319.aClass4_Sub11_Sub1_2.method4934();
			@Pc(895) String local895 = Static319.aClass4_Sub11_Sub1_2.method4920();
			Static255.method4098(local38, local26, Static102.anInt6216, local43, local30, local895, local20);
		} else if (arg0 == Static270.aClass162_13) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local20 = Static570.anInt9983 + (local16 >> 4 & 0x7);
			local26 = Static39.anInt538 + (local16 & 0x7);
			local30 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (local30 == 65535) {
				local30 = -1;
			}
			local38 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local43 = local38 >> 4 & 0xF;
			local147 = local38 & 0x7;
			local151 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local155 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local159 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (local20 >= 0 && local26 >= 0 && local20 < Static428.anInt8046 && local26 < Static119.anInt2717) {
				local243 = local43 + 1;
				if (local20 - local243 <= Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0] && local243 + local20 >= Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0] && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0] >= local26 - local243 && local26 + local243 >= Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0]) {
					Static100.method2184(local151, local159, (local20 << 16) + (Static102.anInt6216 << 24) + (local26 << 8) + local43, local30, local147, local155);
				}
			}
		} else if (arg0 == Static3.aClass162_1) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4950();
			local20 = Static319.aClass4_Sub11_Sub1_2.method4938();
			local26 = Static570.anInt9983 + (local20 >> 4 & 0x7);
			local30 = (local20 & 0x7) + Static39.anInt538;
			local38 = Static319.aClass4_Sub11_Sub1_2.method4916();
			local43 = local38 >> 2;
			local147 = local38 & 0x3;
			local151 = Static550.anIntArray521[local43];
			if (Static128.method2628(Static358.anInt6981) || local26 >= 0 && local30 >= 0 && local26 < Static428.anInt8046 && local30 < Static119.anInt2717) {
				Static174.method3173(local43, Static102.anInt6216, local16, local151, local26, local147, local30);
			}
		} else if (Static12.aClass162_2 == arg0) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4950();
			local20 = Static319.aClass4_Sub11_Sub1_2.method4938();
			local26 = Static39.anInt538 + (local20 & 0x7);
			local30 = Static254.anInt4667 + local26;
			local38 = Static570.anInt9983 + (local20 >> 4 & 0x7);
			local43 = local38 + Static552.anInt9805;
			@Pc(1174) Class4_Sub13 local1174 = (Class4_Sub13) Static251.aClass350_19.method8207((long) (local43 | Static102.anInt6216 << 28 | local30 << 14));
			if (local1174 != null) {
				for (@Pc(1182) Class4_Sub20 local1182 = (Class4_Sub20) local1174.aClass244_19.method5963(); local1182 != null; local1182 = (Class4_Sub20) local1174.aClass244_19.method5965()) {
					if ((local16 & 0x7FFF) == local1182.anInt3139) {
						local1182.method8379();
						break;
					}
				}
				if (local1174.aClass244_19.method5961()) {
					local1174.method8379();
				}
				if (local38 >= 0 && local26 >= 0 && Static428.anInt8046 > local38 && Static119.anInt2717 > local26) {
					Static270.method4609(local38, local26, Static102.anInt6216);
				}
			}
		} else if (Static364.aClass162_19 == arg0) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4916();
			local20 = Static39.anInt538 + (local16 & 0x7);
			local26 = local20 + Static254.anInt4667;
			local30 = Static570.anInt9983 + (local16 >> 4 & 0x7);
			local38 = local30 + Static552.anInt9805;
			local43 = Static319.aClass4_Sub11_Sub1_2.method4955();
			local147 = Static319.aClass4_Sub11_Sub1_2.method4955();
			local151 = Static319.aClass4_Sub11_Sub1_2.method4950();
			if (Static411.anInt7797 != local147) {
				@Pc(1309) boolean local1309 = local30 >= 0 && local20 >= 0 && local30 < Static428.anInt8046 && Static119.anInt2717 > local20;
				if (local1309 || Static128.method2628(Static358.anInt6981)) {
					Static351.method7423(local26, new Class4_Sub20(local151, local43), local38, Static102.anInt6216);
					if (local1309) {
						Static270.method4609(local30, local20, Static102.anInt6216);
					}
				}
			}
		} else if (arg0 == Static278.aClass162_15) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = Static319.aClass4_Sub11_Sub1_2.method4947();
			local26 = Static570.anInt9983 + (local20 >> 4 & 0x7);
			local30 = Static39.anInt538 + (local20 & 0x7);
			local38 = Static319.aClass4_Sub11_Sub1_2.method4947();
			local43 = local38 >> 2;
			local147 = local38 & 0x3;
			local151 = Static550.anIntArray521[local43];
			Static39.method491(local147, local26, local30, local16, Static102.anInt6216, local151, local43);
		} else if (arg0 == Static123.aClass162_8) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local20 = Static570.anInt9983 + (local16 >> 4 & 0x7);
			local26 = Static39.anInt538 + (local16 & 0x7);
			local30 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local38 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local43 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local147 = Static319.aClass4_Sub11_Sub1_2.method4905();
			if (local20 >= 0 && local26 >= 0 && Static428.anInt8046 > local20 && Static119.anInt2717 > local26) {
				local151 = local20 * 512 + 256;
				local155 = local26 * 512 + 256;
				local159 = Static102.anInt6216;
				if (local159 < 3 && Static310.method5267(local20, local26)) {
					local159++;
				}
				@Pc(1497) Class1_Sub4_Sub2_Sub5 local1497 = new Class1_Sub4_Sub2_Sub5(local30, local43, Static106.anInt2418, Static102.anInt6216, local159, local151, Static501.method5641(local151, Static102.anInt6216, local155) - local38, local155, local20, local20, local26, local26, local147);
				Static584.aClass244_62.method5960(new Class4_Sub5_Sub18(local1497));
			}
		} else if (arg0 == Static540.aClass162_16) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4905();
			@Pc(1523) boolean local1523 = (local16 & 0x80) != 0;
			local26 = (local16 >> 3 & 0x7) + Static570.anInt9983;
			local30 = Static39.anInt538 + (local16 & 0x7);
			local38 = Static319.aClass4_Sub11_Sub1_2.method4925() + local26;
			local43 = local30 + Static319.aClass4_Sub11_Sub1_2.method4925();
			local147 = Static319.aClass4_Sub11_Sub1_2.method4946();
			local151 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local155 = Static319.aClass4_Sub11_Sub1_2.method4905() * 4;
			local159 = Static319.aClass4_Sub11_Sub1_2.method4905() * 4;
			local243 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local169 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local173 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local177 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (local173 == 255) {
				local173 = -1;
			}
			if (local26 >= 0 && local30 >= 0 && local26 < Static428.anInt8046 && Static119.anInt2717 > local30 && local38 >= 0 && local43 >= 0 && local38 < Static428.anInt8046 && local43 < Static119.anInt2717 && local151 != 65535) {
				local26 = local26 * 512 + 256;
				local155 <<= 0x2;
				local30 = local30 * 512 + 256;
				local38 = local38 * 512 + 256;
				local177 <<= 0x2;
				local159 <<= 0x2;
				local43 = local43 * 512 + 256;
				@Pc(1688) Class1_Sub4_Sub2_Sub2 local1688 = new Class1_Sub4_Sub2_Sub2(local151, Static102.anInt6216, Static102.anInt6216, local26, local30, local155, local243 + Static106.anInt2418, Static106.anInt2418 + local169, local173, local177, local147, local159, local1523);
				local1688.method4719(local43, local38, Static501.method5641(local38, Static102.anInt6216, local43) - local159, Static106.anInt2418 + local243);
				Static212.aClass244_30.method5960(new Class4_Sub5_Sub15(local1688));
			}
		} else if (Static212.aClass162_10 == arg0) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4905();
			local20 = Static39.anInt538 + (local16 & 0x7);
			local26 = local20 + Static254.anInt4667;
			local30 = (local16 >> 4 & 0x7) + Static570.anInt9983;
			local38 = Static552.anInt9805 + local30;
			local43 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local147 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local151 = Static319.aClass4_Sub11_Sub1_2.method4936();
			if (Static251.aClass350_19 != null) {
				@Pc(1772) Class4_Sub13 local1772 = (Class4_Sub13) Static251.aClass350_19.method8207((long) (local38 | local26 << 14 | Static102.anInt6216 << 28));
				if (local1772 != null) {
					for (@Pc(1780) Class4_Sub20 local1780 = (Class4_Sub20) local1772.aClass244_19.method5963(); local1780 != null; local1780 = (Class4_Sub20) local1772.aClass244_19.method5965()) {
						if ((local43 & 0x7FFF) == local1780.anInt3139 && local147 == local1780.anInt3138) {
							local1780.method8379();
							local1780.anInt3138 = local151;
							Static351.method7423(local26, local1780, local38, Static102.anInt6216);
							break;
						}
					}
					if (local30 >= 0 && local20 >= 0 && Static428.anInt8046 > local30 && local20 < Static119.anInt2717) {
						Static270.method4609(local30, local20, Static102.anInt6216);
					}
				}
			}
		} else if (arg0 == Static296.aClass162_17) {
			local16 = Static319.aClass4_Sub11_Sub1_2.method4936();
			local20 = Static319.aClass4_Sub11_Sub1_2.method4905();
			Static204.aClass139_8.method3309(local16).method2699(local20);
		} else {
			Static205.method3450("T3 - " + arg0, null);
			Static135.method2684(false);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(JJ)J")
	public static long method6893(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
