import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
	public static int anInt9375;

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_207 = new Class215(71, 7);

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "Lclient!tca;")
	public static final Class325 aClass325_7 = new Class325();

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[4];

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!kn;B)V")
	public static void method7834(@OriginalArg(0) Class181 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(47) int local47;
		if (arg0 == Static350.aClass181_10) {
			local12 = Static627.aClass2_Sub11_Sub2_6.method8338();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static234.anIntArray261[local16];
			local28 = Static627.aClass2_Sub11_Sub2_6.method8326();
			local32 = Static627.aClass2_Sub11_Sub2_6.method8389();
			local40 = Static594.anInt10471 + (local32 >> 4 & 0x7);
			local47 = Static298.anInt6266 + (local32 & 0x7);
			if (Static600.method8800(Static69.anInt2216) || local40 >= 0 && local47 >= 0 && local40 < Static47.anInt1794 && Static209.anInt4742 > local47) {
				Static22.method607(Static27.anInt575, local47, local16, local24, local20, local28, local40);
			}
			return;
		}
		@Pc(157) int local157;
		@Pc(155) int local155;
		if (arg0 == Static155.aClass181_4) {
			local12 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local16 = Static594.anInt10471 + (local12 >> 4 & 0x7);
			local20 = Static298.anInt6266 + (local12 & 0x7);
			local24 = Static627.aClass2_Sub11_Sub2_6.method8326();
			local28 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local32 = Static627.aClass2_Sub11_Sub2_6.method8326();
			local40 = Static627.aClass2_Sub11_Sub2_6.method8383();
			if (local16 >= 0 && local20 >= 0 && Static47.anInt1794 > local16 && Static209.anInt4742 > local20) {
				local47 = local16 * 512 + 256;
				local155 = local20 * 512 + 256;
				local157 = Static27.anInt575;
				if (local157 < 3 && Static30.method735(local20, local16)) {
					local157++;
				}
				@Pc(192) Class3_Sub1_Sub3_Sub4 local192 = new Class3_Sub1_Sub3_Sub4(local24, local32, Static407.anInt7704, Static27.anInt575, local157, local47, Static590.method8716(local47, Static27.anInt575, local155) - local28, local155, local16, local16, local20, local20, local40);
				Static563.aClass341_65.method8528(new Class2_Sub6_Sub17(local192));
			}
			return;
		}
		@Pc(282) int local282;
		if (arg0 == Static325.aClass181_9) {
			local12 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local16 = Static594.anInt10471 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static298.anInt6266;
			local24 = Static627.aClass2_Sub11_Sub2_6.method8326();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local32 = local28 >> 4 & 0xF;
			local40 = local28 & 0x7;
			local47 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local155 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local157 = Static627.aClass2_Sub11_Sub2_6.method8326();
			if (local16 >= 0 && local20 >= 0 && local16 < Static47.anInt1794 && Static209.anInt4742 > local20) {
				local282 = local32 + 1;
				if (local16 - local282 <= Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] <= local282 + local16 && local20 - local282 <= Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0] && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0] <= local20 + local282) {
					Static392.method6459(local24, local155, (local20 << 8) + (Static27.anInt575 << 24) + (local16 << 16) + local32, local40, local157, local47);
				}
			}
		} else if (arg0 == Static489.aClass181_13) {
			local12 = Static627.aClass2_Sub11_Sub2_6.method8326();
			local16 = Static627.aClass2_Sub11_Sub2_6.method8383();
			Static27.aClass342_3.method8534(local12).method4604(local16);
		} else if (Static37.aClass181_2 == arg0) {
			local12 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local16 = Static594.anInt10471 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static298.anInt6266;
			local24 = Static627.aClass2_Sub11_Sub2_6.method8326();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local32 = local28 >> 4 & 0xF;
			local40 = local28 & 0x7;
			local47 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local155 = Static627.aClass2_Sub11_Sub2_6.method8383();
			local157 = Static627.aClass2_Sub11_Sub2_6.method8326();
			if (local16 >= 0 && local20 >= 0 && local16 < Static47.anInt1794 && local20 < Static209.anInt4742) {
				local282 = local32 + 1;
				if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] >= local16 - local282 && Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] <= local282 + local16 && local20 - local282 <= Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0] && local20 + local282 >= Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0]) {
					Static235.method4442(local40, local32 + (local20 << 8) + (Static27.anInt575 << 24) + (local16 << 16), local47, local155, local157, local24);
				}
			}
		} else if (Static576.aClass181_15 == arg0) {
			local12 = Static627.aClass2_Sub11_Sub2_6.method8369();
			if (local12 == 65535) {
				local12 = -1;
			}
			local16 = Static627.aClass2_Sub11_Sub2_6.method8338();
			local20 = (local16 >> 4 & 0x7) + Static594.anInt10471;
			local24 = Static298.anInt6266 + (local16 & 0x7);
			local28 = Static627.aClass2_Sub11_Sub2_6.method8325();
			local32 = local28 >> 2;
			local40 = local28 & 0x3;
			local47 = Static234.anIntArray261[local32];
			Static626.method1458(local24, local12, local32, local20, local40, Static27.anInt575, local47);
		} else {
			@Pc(655) int local655;
			@Pc(659) int local659;
			@Pc(678) int local678;
			if (arg0 == Static19.aClass181_1) {
				local12 = Static627.aClass2_Sub11_Sub2_6.method8383();
				local16 = (local12 >> 4 & 0xF) + Static594.anInt10471 * 2;
				local20 = (local12 & 0xF) + Static298.anInt6266 * 2;
				local24 = Static627.aClass2_Sub11_Sub2_6.method8383();
				@Pc(613) boolean local613 = (local24 & 0x1) != 0;
				@Pc(621) boolean local621 = (local24 & 0x2) != 0;
				local40 = local621 ? local24 >> 2 : -1;
				local47 = Static627.aClass2_Sub11_Sub2_6.method8384() + local16;
				local155 = Static627.aClass2_Sub11_Sub2_6.method8384() + local20;
				local157 = Static627.aClass2_Sub11_Sub2_6.method8368();
				local282 = Static627.aClass2_Sub11_Sub2_6.method8368();
				local655 = Static627.aClass2_Sub11_Sub2_6.method8326();
				local659 = Static627.aClass2_Sub11_Sub2_6.method8383();
				if (local621) {
					local659 = (byte) local659;
				} else {
					local659 *= 4;
				}
				local678 = Static627.aClass2_Sub11_Sub2_6.method8383() * 4;
				@Pc(684) int local684 = Static627.aClass2_Sub11_Sub2_6.method8326();
				@Pc(688) int local688 = Static627.aClass2_Sub11_Sub2_6.method8326();
				@Pc(692) int local692 = Static627.aClass2_Sub11_Sub2_6.method8383();
				@Pc(696) int local696 = Static627.aClass2_Sub11_Sub2_6.method8326();
				if (local692 == 255) {
					local692 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && Static47.anInt1794 * 2 > local16 && Static47.anInt1794 * 2 > local20 && local47 >= 0 && local155 >= 0 && Static209.anInt4742 * 2 > local47 && Static209.anInt4742 * 2 > local155 && local655 != 65535) {
					local155 *= 256;
					local47 = local47 * 256;
					local678 <<= 0x2;
					local16 = local16 * 256;
					local696 <<= 0x2;
					local659 <<= 0x2;
					local20 *= 256;
					if (local157 != 0 && local40 != -1) {
						@Pc(783) Class3_Sub1_Sub3_Sub3 local783 = null;
						@Pc(793) int local793;
						if (local157 < 0) {
							local793 = -local157 - 1;
							if (local793 == Static569.anInt10211) {
								local783 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2;
							} else {
								local783 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local793];
							}
						} else {
							local793 = local157 - 1;
							@Pc(819) Class2_Sub33 local819 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local793);
							if (local819 != null) {
								local783 = local819.aClass3_Sub1_Sub3_Sub3_Sub1_2;
							}
						}
						if (local783 != null) {
							@Pc(830) Class311 local830 = local783.method5200();
							if (local830.anIntArrayArray52 != null && local830.anIntArrayArray52[local40] != null) {
								local659 -= local830.anIntArrayArray52[local40][1];
							}
							if (local830.anIntArrayArray51 != null && local830.anIntArrayArray51[local40] != null) {
								local659 -= local830.anIntArrayArray51[local40][1];
							}
						}
					}
					@Pc(888) Class3_Sub1_Sub3_Sub5 local888 = new Class3_Sub1_Sub3_Sub5(local655, Static27.anInt575, Static27.anInt575, local16, local20, local659, local684 + Static407.anInt7704, local688 + Static407.anInt7704, local692, local696, local157, local282, local678, local613, local40);
					local888.method8224(Static590.method8716(local47, Static27.anInt575, local155) - local678, local155, local684 + Static407.anInt7704, local47);
					Static430.aClass341_24.method8528(new Class2_Sub6_Sub10(local888));
				}
			} else if (arg0 == Static423.aClass181_12) {
				local12 = Static627.aClass2_Sub11_Sub2_6.method8354();
				local16 = Static627.aClass2_Sub11_Sub2_6.method8338();
				local20 = Static298.anInt6266 + (local16 & 0x7);
				local24 = Static32.anInt723 + local20;
				local28 = Static594.anInt10471 + (local16 >> 4 & 0x7);
				local32 = Static84.anInt2565 + local28;
				@Pc(960) Class2_Sub45 local960 = (Class2_Sub45) Static378.aClass99_26.method3056((long) (local24 << 14 | Static27.anInt575 << 28 | local32));
				if (local960 != null) {
					for (@Pc(968) Class2_Sub7 local968 = (Class2_Sub7) local960.aClass341_60.method8524(); local968 != null; local968 = (Class2_Sub7) local960.aClass341_60.method8519()) {
						if (local968.anInt790 == (local12 & 0x7FFF)) {
							local968.method9253();
							break;
						}
					}
					if (local960.aClass341_60.method8531()) {
						local960.method9253();
					}
					if (local28 >= 0 && local20 >= 0 && Static47.anInt1794 > local28 && Static209.anInt4742 > local20) {
						Static483.method7529(local20, local28, Static27.anInt575);
					}
				}
			} else if (Static528.aClass181_14 == arg0) {
				local12 = Static627.aClass2_Sub11_Sub2_6.method8369();
				local16 = Static627.aClass2_Sub11_Sub2_6.method8369();
				local20 = Static627.aClass2_Sub11_Sub2_6.method8383();
				local24 = Static298.anInt6266 + (local20 & 0x7);
				local28 = local24 + Static32.anInt723;
				local32 = Static594.anInt10471 + (local20 >> 4 & 0x7);
				local40 = Static84.anInt2565 + local32;
				@Pc(1074) boolean local1074 = local32 >= 0 && local24 >= 0 && Static47.anInt1794 > local32 && Static209.anInt4742 > local24;
				if (local1074 || Static600.method8800(Static69.anInt2216)) {
					Static129.method3010(new Class2_Sub7(local16, local12), Static27.anInt575, local28, local40);
					if (local1074) {
						Static483.method7529(local24, local32, Static27.anInt575);
					}
				}
			} else if (arg0 == Static174.aClass181_5) {
				local12 = Static627.aClass2_Sub11_Sub2_6.method8389();
				local16 = local12 >> 2;
				local20 = local12 & 0x3;
				local24 = Static234.anIntArray261[local16];
				local28 = Static627.aClass2_Sub11_Sub2_6.method8383();
				local32 = Static594.anInt10471 + (local28 >> 4 & 0x7);
				local40 = Static298.anInt6266 + (local28 & 0x7);
				if (Static600.method8800(Static69.anInt2216) || local32 >= 0 && local40 >= 0 && local32 < Static47.anInt1794 && Static209.anInt4742 > local40) {
					Static22.method607(Static27.anInt575, local40, local16, local24, local20, -1, local32);
				}
			} else if (Static238.aClass181_6 == arg0) {
				local12 = Static627.aClass2_Sub11_Sub2_6.method8383();
				local16 = Static298.anInt6266 + (local12 & 0x7);
				local20 = local16 + Static32.anInt723;
				local24 = Static594.anInt10471 + (local12 >> 4 & 0x7);
				local28 = Static84.anInt2565 + local24;
				local32 = Static627.aClass2_Sub11_Sub2_6.method8326();
				local40 = Static627.aClass2_Sub11_Sub2_6.method8326();
				local47 = Static627.aClass2_Sub11_Sub2_6.method8326();
				if (Static378.aClass99_26 != null) {
					@Pc(1243) Class2_Sub45 local1243 = (Class2_Sub45) Static378.aClass99_26.method3056((long) (local28 | Static27.anInt575 << 28 | local20 << 14));
					if (local1243 != null) {
						for (@Pc(1251) Class2_Sub7 local1251 = (Class2_Sub7) local1243.aClass341_60.method8524(); local1251 != null; local1251 = (Class2_Sub7) local1243.aClass341_60.method8519()) {
							if (local1251.anInt790 == (local32 & 0x7FFF) && local40 == local1251.anInt789) {
								local1251.method9253();
								local1251.anInt789 = local47;
								Static129.method3010(local1251, Static27.anInt575, local20, local28);
								break;
							}
						}
						if (local24 >= 0 && local16 >= 0 && Static47.anInt1794 > local24 && local16 < Static209.anInt4742) {
							Static483.method7529(local16, local24, Static27.anInt575);
						}
					}
				}
			} else if (arg0 == Static93.aClass181_3) {
				local12 = Static627.aClass2_Sub11_Sub2_6.method8369();
				local16 = Static627.aClass2_Sub11_Sub2_6.method8383();
				local20 = (local16 & 0x7) + Static298.anInt6266;
				local24 = Static32.anInt723 + local20;
				local28 = Static594.anInt10471 + (local16 >> 4 & 0x7);
				local32 = Static84.anInt2565 + local28;
				local40 = Static627.aClass2_Sub11_Sub2_6.method8351();
				local47 = Static627.aClass2_Sub11_Sub2_6.method8351();
				if (local47 != Static569.anInt10211) {
					@Pc(1381) boolean local1381 = local28 >= 0 && local20 >= 0 && Static47.anInt1794 > local28 && Static209.anInt4742 > local20;
					if (local1381 || Static600.method8800(Static69.anInt2216)) {
						Static129.method3010(new Class2_Sub7(local40, local12), Static27.anInt575, local24, local32);
						if (local1381) {
							Static483.method7529(local20, local28, Static27.anInt575);
						}
					}
				}
			} else if (arg0 == Static419.aClass181_11) {
				local12 = Static627.aClass2_Sub11_Sub2_6.method8383();
				@Pc(1427) boolean local1427 = (local12 & 0x80) != 0;
				local20 = Static594.anInt10471 + (local12 >> 3 & 0x7);
				local24 = (local12 & 0x7) + Static298.anInt6266;
				local28 = local20 + Static627.aClass2_Sub11_Sub2_6.method8384();
				local32 = Static627.aClass2_Sub11_Sub2_6.method8384() + local24;
				local40 = Static627.aClass2_Sub11_Sub2_6.method8368();
				local47 = Static627.aClass2_Sub11_Sub2_6.method8326();
				local155 = Static627.aClass2_Sub11_Sub2_6.method8383() * 4;
				local157 = Static627.aClass2_Sub11_Sub2_6.method8383() * 4;
				local282 = Static627.aClass2_Sub11_Sub2_6.method8326();
				local655 = Static627.aClass2_Sub11_Sub2_6.method8326();
				local659 = Static627.aClass2_Sub11_Sub2_6.method8383();
				if (local659 == 255) {
					local659 = -1;
				}
				local678 = Static627.aClass2_Sub11_Sub2_6.method8326();
				if (local20 >= 0 && local24 >= 0 && Static47.anInt1794 > local20 && local24 < Static209.anInt4742 && local28 >= 0 && local32 >= 0 && Static47.anInt1794 > local28 && local32 < Static209.anInt4742 && local47 != 65535) {
					local678 <<= 0x2;
					local32 = local32 * 512 + 256;
					local157 <<= 0x2;
					local28 = local28 * 512 + 256;
					local24 = local24 * 512 + 256;
					local20 = local20 * 512 + 256;
					local155 <<= 0x2;
					@Pc(1605) Class3_Sub1_Sub3_Sub5 local1605 = new Class3_Sub1_Sub3_Sub5(local47, Static27.anInt575, Static27.anInt575, local20, local24, local155, local282 + Static407.anInt7704, Static407.anInt7704 + local655, local659, local678, 0, local40, local157, local1427, -1);
					local1605.method8224(Static590.method8716(local28, Static27.anInt575, local32) - local157, local32, local282 + Static407.anInt7704, local28);
					Static430.aClass341_24.method8528(new Class2_Sub6_Sub10(local1605));
				}
			} else if (Static456.aClass181_8 == arg0) {
				Static627.aClass2_Sub11_Sub2_6.method8383();
				local12 = Static627.aClass2_Sub11_Sub2_6.method8383();
				local16 = (local12 >> 4 & 0x7) + Static594.anInt10471;
				local20 = (local12 & 0x7) + Static298.anInt6266;
				local24 = Static627.aClass2_Sub11_Sub2_6.method8326();
				local28 = Static627.aClass2_Sub11_Sub2_6.method8383();
				local32 = Static627.aClass2_Sub11_Sub2_6.method8347();
				@Pc(1674) String local1674 = Static627.aClass2_Sub11_Sub2_6.method8373();
				Static191.method3917(local24, local16, local32, local1674, local28, local20, Static27.anInt575);
			} else {
				Static408.method6625("T3 - " + arg0, null);
				Static68.method2104(false);
			}
		}
	}
}
