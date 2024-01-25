import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
	public static final int[] anIntArray211 = new int[1];

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!maa;")
	public static final Class223 aClass223_2 = new Class223(true);

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
	public static final int[] anIntArray212 = new int[5];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2767(@OriginalArg(0) Class33 arg0) {
		if (Static55.aClass163_11.method3650() == 0) {
			return;
		}
		@Pc(20) Class4_Sub17 local20;
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 0) {
			for (local20 = (Class4_Sub17) Static55.aClass163_11.method3639(); local20 != null; local20 = (Class4_Sub17) Static55.aClass163_11.method3640()) {
				Static532.aClass255_2.method5215(Static302.aClass56_9, local20.anInt2288, false, false, local20.anInt2291, local20.anInt2286, arg0, local20.aBoolean155 ? Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 : null, arg0, local20.anInt2289, local20.anInt2287);
				local20.method9000();
			}
			Static34.method8332();
			return;
		}
		if (Static3.aClass33_5 == null) {
			@Pc(68) Canvas local68 = new Canvas();
			local68.setSize(36, 32);
			Static3.aClass33_5 = Static356.method4761(Static57.anInterface9_4, 0, 0, Static143.aClass34_31, local68);
			Static298.aClass56_16 = Static3.aClass33_5.method8081(Static464.method6458(Static625.anInt9801, Static305.aClass34_68), Static682.method1651(Static368.aClass34_80, Static625.anInt9801));
		}
		for (local20 = (Class4_Sub17) Static55.aClass163_11.method3639(); local20 != null; local20 = (Class4_Sub17) Static55.aClass163_11.method3640()) {
			Static532.aClass255_2.method5215(Static298.aClass56_16, local20.anInt2288, false, false, local20.anInt2291, local20.anInt2286, arg0, local20.aBoolean155 ? Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 : null, Static3.aClass33_5, local20.anInt2289, local20.anInt2287);
			local20.method9000();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)I")
	public static int method2776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg2 & 0x3;
		if (local13 == 0) {
			return arg1;
		} else if (local13 == 1) {
			return arg0;
		} else if (local13 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;ZZLjava/lang/String;I)V")
	public static void method2777(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		Static603.aBoolean725 = arg2;
		Static315.aBoolean370 = arg1;
		Static163.aString26 = arg0;
		if (!arg2) {
			Static53.anInt1190 = -1;
		}
		Static602.aString115 = arg3;
		if (!Static603.aBoolean725 && (Static163.aString26.equals("") || Static602.aString115.equals(""))) {
			Static97.method1973(3);
			return;
		}
		Static559.aBoolean671 = false;
		if (Static306.anInt4811 != 1) {
			Static18.anInt6907 = 0;
			Static80.anInt1713 = -1;
		}
		Static97.method1973(-3);
		Static50.anInt1093 = 0;
		Static618.anInt9708 = 1;
		Static361.anInt5460 = 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!fj;I)V")
	public static void method2778(@OriginalArg(0) Class117 arg0) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (arg0 == Static258.aClass117_9) {
			local12 = Static159.aClass4_Sub11_Sub1_1.method8843();
			local18 = (local12 & 0x7) + Static342.anInt8647;
			local22 = Static321.anInt5000 + local18;
			local30 = Static464.anInt7426 + (local12 >> 4 & 0x7);
			local34 = local30 + Static445.anInt6949;
			local38 = Static159.aClass4_Sub11_Sub1_1.method8890();
			@Pc(53) Class4_Sub7 local53 = (Class4_Sub7) Static406.aClass66_28.method1994((long) (local34 | local22 << 14 | Static433.anInt6809 << 28));
			if (local53 != null) {
				for (@Pc(61) Class4_Sub33 local61 = (Class4_Sub33) local53.aClass163_8.method3639(); local61 != null; local61 = (Class4_Sub33) local53.aClass163_8.method3640()) {
					if ((local38 & 0x7FFF) == local61.anInt5595) {
						local61.method9000();
						break;
					}
				}
				if (local53.aClass163_8.method3638()) {
					local53.method9000();
				}
				if (local30 >= 0 && local18 >= 0 && Static224.anInt3557 > local30 && local18 < Static267.anInt4309) {
					Static552.method7370(local30, Static433.anInt6809, local18);
				}
			}
			return;
		}
		@Pc(154) int local154;
		@Pc(158) int local158;
		if (arg0 == Static486.aClass117_13) {
			local12 = Static159.aClass4_Sub11_Sub1_1.method8890();
			if (local12 == 65535) {
				local12 = -1;
			}
			local18 = Static159.aClass4_Sub11_Sub1_1.method8855();
			local22 = Static464.anInt7426 + (local18 >> 4 & 0x7);
			local30 = Static342.anInt8647 + (local18 & 0x7);
			local34 = Static159.aClass4_Sub11_Sub1_1.method8865();
			local38 = local34 >> 2;
			local154 = local34 & 0x3;
			local158 = Static9.anIntArray715[local38];
			Static210.method3127(local22, local38, local30, local158, local12, local154, Static433.anInt6809);
		} else if (arg0 == Static228.aClass117_7) {
			local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
			local18 = local12 >> 2;
			local22 = local12 & 0x3;
			local30 = Static9.anIntArray715[local18];
			local34 = Static159.aClass4_Sub11_Sub1_1.method8855();
			local38 = Static464.anInt7426 + (local34 >> 4 & 0x7);
			local154 = (local34 & 0x7) + Static342.anInt8647;
			local158 = Static159.aClass4_Sub11_Sub1_1.method8871();
			if (Static593.method7798(Static124.anInt2310) || local38 >= 0 && local154 >= 0 && local38 < Static224.anInt3557 && Static267.anInt4309 > local154) {
				Static191.method2975(Static433.anInt6809, local18, local22, local38, local154, local158, local30);
			}
		} else {
			@Pc(302) int local302;
			@Pc(304) int local304;
			if (arg0 == Static23.aClass117_1) {
				local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
				local18 = (local12 >> 4 & 0x7) + Static464.anInt7426;
				local22 = Static342.anInt8647 + (local12 & 0x7);
				local30 = Static159.aClass4_Sub11_Sub1_1.method8859();
				local34 = Static159.aClass4_Sub11_Sub1_1.method8865();
				local38 = Static159.aClass4_Sub11_Sub1_1.method8859();
				local154 = Static159.aClass4_Sub11_Sub1_1.method8865();
				if (local18 >= 0 && local22 >= 0 && local18 < Static224.anInt3557 && local22 < Static267.anInt4309) {
					local158 = local18 * 512 + 256;
					local302 = local22 * 512 + 256;
					local304 = Static433.anInt6809;
					if (local304 < 3 && Static547.method7286(local18, local22)) {
						local304++;
					}
					@Pc(337) Class3_Sub1_Sub2_Sub5 local337 = new Class3_Sub1_Sub2_Sub5(local30, local38, Static177.anInt3088, Static433.anInt6809, local304, local158, Static674.method8951(Static433.anInt6809, local302, local158) - local34, local302, local18, local18, local22, local22, local154);
					Static153.aClass163_19.method3646(new Class4_Sub5_Sub10(local337));
				}
			} else {
				@Pc(426) int local426;
				if (arg0 == Static355.aClass117_10) {
					local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
					local18 = (local12 >> 4 & 0x7) + Static464.anInt7426;
					local22 = (local12 & 0x7) + Static342.anInt8647;
					local30 = Static159.aClass4_Sub11_Sub1_1.method8859();
					if (local30 == 65535) {
						local30 = -1;
					}
					local34 = Static159.aClass4_Sub11_Sub1_1.method8865();
					local38 = local34 >> 4 & 0xF;
					local154 = local34 & 0x7;
					local158 = Static159.aClass4_Sub11_Sub1_1.method8865();
					local302 = Static159.aClass4_Sub11_Sub1_1.method8865();
					local304 = Static159.aClass4_Sub11_Sub1_1.method8859();
					if (local18 >= 0 && local22 >= 0 && Static224.anInt3557 > local18 && local22 < Static267.anInt4309) {
						local426 = local38 + 1;
						if (local18 - local426 <= Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0] && local18 + local426 >= Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0] && local22 - local426 <= Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0] && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0] <= local426 + local22) {
							Static130.method2320(local154, local304, local30, local38 + (Static433.anInt6809 << 24) + (local18 << 16) + (local22 << 8), local302, local158);
						}
					}
				} else {
					@Pc(557) int local557;
					@Pc(630) int local630;
					@Pc(654) int local654;
					@Pc(685) int local685;
					if (arg0 == Static451.aClass117_12) {
						local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local18 = Static464.anInt7426 + (local12 >> 4 & 0x7);
						local22 = (local12 & 0x7) + Static342.anInt8647;
						local30 = Static159.aClass4_Sub11_Sub1_1.method8855();
						local34 = local30 >> 2;
						local38 = Static9.anIntArray715[local34];
						local154 = Static159.aClass4_Sub11_Sub1_1.method8862();
						local158 = Static159.aClass4_Sub11_Sub1_1.method8859();
						if (local34 == 11) {
							local34 = 10;
						}
						@Pc(548) Class342 local548 = Static441.aClass74_169.method2075(local158);
						local304 = 0;
						if (local548.aByteArray93 != null) {
							local426 = -1;
							for (local557 = 0; local557 < local548.aByteArray93.length; local557++) {
								if (local34 == local548.aByteArray93[local557]) {
									local426 = local557;
									break;
								}
							}
							local304 = local548.anIntArrayArray56[local426].length;
						}
						local426 = 0;
						if (local548.aShortArray139 != null) {
							local426 = local548.aShortArray139.length;
						}
						local557 = 0;
						if (local548.aShortArray141 != null) {
							local557 = local548.aShortArray141.length;
						}
						if ((local154 & 0x1) == 1) {
							Static297.method4196(Static433.anInt6809, (Class141) null, local38, local18, local22);
						} else {
							@Pc(618) int[] local618 = null;
							if ((local154 & 0x2) == 2) {
								local618 = new int[local304];
								for (local630 = 0; local630 < local304; local630++) {
									local618[local630] = Static159.aClass4_Sub11_Sub1_1.method8859();
								}
							}
							@Pc(644) short[] local644 = null;
							if ((local154 & 0x4) == 4) {
								local644 = new short[local426];
								for (local654 = 0; local654 < local426; local654++) {
									local644[local654] = (short) Static159.aClass4_Sub11_Sub1_1.method8859();
								}
							}
							@Pc(673) short[] local673 = null;
							if ((local154 & 0x8) == 8) {
								local673 = new short[local557];
								for (local685 = 0; local685 < local557; local685++) {
									local673[local685] = (short) Static159.aClass4_Sub11_Sub1_1.method8859();
								}
							}
							Static297.method4196(Static433.anInt6809, new Class141((long) Static356.aLong165++, local618, local644, local673), local38, local18, local22);
						}
					} else if (arg0 == Static666.aClass117_17) {
						local12 = Static159.aClass4_Sub11_Sub1_1.method8855();
						local18 = (local12 & 0x7) + Static342.anInt8647;
						local22 = Static321.anInt5000 + local18;
						local30 = Static464.anInt7426 + (local12 >> 4 & 0x7);
						local34 = local30 + Static445.anInt6949;
						local38 = Static159.aClass4_Sub11_Sub1_1.method8871();
						local154 = Static159.aClass4_Sub11_Sub1_1.method8859();
						@Pc(782) boolean local782 = local30 >= 0 && local18 >= 0 && local30 < Static224.anInt3557 && Static267.anInt4309 > local18;
						if (local782 || Static593.method7798(Static124.anInt2310)) {
							Static295.method4178(Static433.anInt6809, new Class4_Sub33(local154, local38), local34, local22);
							if (local782) {
								Static552.method7370(local30, Static433.anInt6809, local18);
							}
						}
					} else if (arg0 == Static614.aClass117_16) {
						local12 = Static159.aClass4_Sub11_Sub1_1.method8871();
						local18 = Static159.aClass4_Sub11_Sub1_1.method8883();
						local22 = Static159.aClass4_Sub11_Sub1_1.method8890();
						local30 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local34 = Static342.anInt8647 + (local30 & 0x7);
						local38 = Static321.anInt5000 + local34;
						local154 = (local30 >> 4 & 0x7) + Static464.anInt7426;
						local158 = Static445.anInt6949 + local154;
						if (Static184.anInt3149 != local12) {
							@Pc(875) boolean local875 = local154 >= 0 && local34 >= 0 && local154 < Static224.anInt3557 && Static267.anInt4309 > local34;
							if (local875 || Static593.method7798(Static124.anInt2310)) {
								Static295.method4178(Static433.anInt6809, new Class4_Sub33(local22, local18), local158, local38);
								if (local875) {
									Static552.method7370(local154, Static433.anInt6809, local34);
								}
							}
						}
					} else if (arg0 == Static587.aClass117_15) {
						local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local18 = Static464.anInt7426 + (local12 >> 4 & 0x7);
						local22 = (local12 & 0x7) + Static342.anInt8647;
						local30 = Static159.aClass4_Sub11_Sub1_1.method8859();
						if (local30 == 65535) {
							local30 = -1;
						}
						local34 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local38 = local34 >> 4 & 0xF;
						local154 = local34 & 0x7;
						local158 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local302 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local304 = Static159.aClass4_Sub11_Sub1_1.method8859();
						if (local18 >= 0 && local22 >= 0 && Static224.anInt3557 > local18 && local22 < Static267.anInt4309) {
							local426 = local38 + 1;
							if (local18 - local426 <= Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0] && local18 + local426 >= Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0] && local22 - local426 <= Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0] && local22 + local426 >= Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0]) {
								Static340.method4634(local302, local158, local304, local154, local30, local38 + (Static433.anInt6809 << 24) + (local18 << 16) + (local22 << 8));
							}
						}
					} else if (Static189.aClass117_6 == arg0) {
						local12 = Static159.aClass4_Sub11_Sub1_1.method8859();
						local18 = Static159.aClass4_Sub11_Sub1_1.method8865();
						Static441.aClass74_169.method2075(local12).method7492(local18);
					} else if (arg0 == Static140.aClass117_14) {
						local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local18 = (local12 & 0x7) + Static342.anInt8647;
						local22 = local18 + Static321.anInt5000;
						local30 = (local12 >> 4 & 0x7) + Static464.anInt7426;
						local34 = local30 + Static445.anInt6949;
						local38 = Static159.aClass4_Sub11_Sub1_1.method8859();
						local154 = Static159.aClass4_Sub11_Sub1_1.method8859();
						local158 = Static159.aClass4_Sub11_Sub1_1.method8859();
						if (Static406.aClass66_28 != null) {
							@Pc(1122) Class4_Sub7 local1122 = (Class4_Sub7) Static406.aClass66_28.method1994((long) (Static433.anInt6809 << 28 | local22 << 14 | local34));
							if (local1122 != null) {
								for (@Pc(1130) Class4_Sub33 local1130 = (Class4_Sub33) local1122.aClass163_8.method3639(); local1130 != null; local1130 = (Class4_Sub33) local1122.aClass163_8.method3640()) {
									if ((local38 & 0x7FFF) == local1130.anInt5595 && local154 == local1130.anInt5597) {
										local1130.method9000();
										local1130.anInt5597 = local158;
										Static295.method4178(Static433.anInt6809, local1130, local34, local22);
										break;
									}
								}
								if (local30 >= 0 && local18 >= 0 && Static224.anInt3557 > local30 && Static267.anInt4309 > local18) {
									Static552.method7370(local30, Static433.anInt6809, local18);
								}
							}
						}
					} else if (arg0 == Static254.aClass117_8) {
						Static159.aClass4_Sub11_Sub1_1.method8865();
						local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local18 = Static464.anInt7426 + (local12 >> 4 & 0x7);
						local22 = Static342.anInt8647 + (local12 & 0x7);
						local30 = Static159.aClass4_Sub11_Sub1_1.method8859();
						local34 = Static159.aClass4_Sub11_Sub1_1.method8865();
						local38 = Static159.aClass4_Sub11_Sub1_1.method8827();
						@Pc(1233) String local1233 = Static159.aClass4_Sub11_Sub1_1.method8853();
						Static377.method4935(local38, local1233, local34, local30, Static433.anInt6809, local18, local22);
					} else {
						@Pc(1324) int local1324;
						if (Static446.aClass117_11 == arg0) {
							local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
							@Pc(1263) boolean local1263 = (local12 & 0x80) != 0;
							local22 = Static464.anInt7426 + (local12 >> 3 & 0x7);
							local30 = Static342.anInt8647 + (local12 & 0x7);
							local34 = local22 + Static159.aClass4_Sub11_Sub1_1.method8861();
							local38 = Static159.aClass4_Sub11_Sub1_1.method8861() + local30;
							local154 = Static159.aClass4_Sub11_Sub1_1.method8834();
							local158 = Static159.aClass4_Sub11_Sub1_1.method8859();
							local302 = Static159.aClass4_Sub11_Sub1_1.method8865() * 4;
							local304 = Static159.aClass4_Sub11_Sub1_1.method8865() * 4;
							local426 = Static159.aClass4_Sub11_Sub1_1.method8859();
							local557 = Static159.aClass4_Sub11_Sub1_1.method8859();
							local1324 = Static159.aClass4_Sub11_Sub1_1.method8865();
							local630 = Static159.aClass4_Sub11_Sub1_1.method8859();
							if (local1324 == 255) {
								local1324 = -1;
							}
							if (local22 >= 0 && local30 >= 0 && local22 < Static224.anInt3557 && local30 < Static267.anInt4309 && local34 >= 0 && local38 >= 0 && local34 < Static224.anInt3557 && local38 < Static267.anInt4309 && local158 != 65535) {
								local630 <<= 0x2;
								local304 <<= 0x2;
								local38 = local38 * 512 + 256;
								local34 = local34 * 512 + 256;
								local22 = local22 * 512 + 256;
								local30 = local30 * 512 + 256;
								local302 <<= 0x2;
								@Pc(1435) Class3_Sub1_Sub2_Sub1 local1435 = new Class3_Sub1_Sub2_Sub1(local158, Static433.anInt6809, Static433.anInt6809, local22, local30, local302, Static177.anInt3088 + local426, local557 - -Static177.anInt3088, local1324, local630, 0, local154, local304, local1263, -1);
								local1435.method705(Static177.anInt3088 + local426, local38, Static674.method8951(Static433.anInt6809, local38, local34) - local304, local34);
								Static473.aClass163_57.method3646(new Class4_Sub5_Sub8(local1435));
							}
						} else if (arg0 == Static144.aClass117_5) {
							local12 = Static159.aClass4_Sub11_Sub1_1.method8855();
							local18 = local12 >> 2;
							local22 = local12 & 0x3;
							local30 = Static9.anIntArray715[local18];
							local34 = Static159.aClass4_Sub11_Sub1_1.method8855();
							local38 = (local34 >> 4 & 0x7) + Static464.anInt7426;
							local154 = (local34 & 0x7) + Static342.anInt8647;
							if (Static593.method7798(Static124.anInt2310) || local38 >= 0 && local154 >= 0 && Static224.anInt3557 > local38 && local154 < Static267.anInt4309) {
								Static191.method2975(Static433.anInt6809, local18, local22, local38, local154, -1, local30);
							}
						} else if (Static96.aClass117_2 == arg0) {
							local12 = Static159.aClass4_Sub11_Sub1_1.method8865();
							local18 = Static464.anInt7426 * 2 + (local12 >> 4 & 0xF);
							local22 = (local12 & 0xF) + Static342.anInt8647 * 2;
							local30 = Static159.aClass4_Sub11_Sub1_1.method8865();
							@Pc(1575) boolean local1575 = (local30 & 0x1) != 0;
							@Pc(1586) boolean local1586 = (local30 & 0x2) != 0;
							local154 = local1586 ? local30 >> 2 : -1;
							local158 = local18 + Static159.aClass4_Sub11_Sub1_1.method8861();
							local302 = Static159.aClass4_Sub11_Sub1_1.method8861() + local22;
							local304 = Static159.aClass4_Sub11_Sub1_1.method8834();
							local426 = Static159.aClass4_Sub11_Sub1_1.method8834();
							local557 = Static159.aClass4_Sub11_Sub1_1.method8859();
							local1324 = Static159.aClass4_Sub11_Sub1_1.method8865();
							if (local1586) {
								local1324 = (byte) local1324;
							} else {
								local1324 *= 4;
							}
							local630 = Static159.aClass4_Sub11_Sub1_1.method8865() * 4;
							local654 = Static159.aClass4_Sub11_Sub1_1.method8859();
							local685 = Static159.aClass4_Sub11_Sub1_1.method8859();
							@Pc(1651) int local1651 = Static159.aClass4_Sub11_Sub1_1.method8865();
							if (local1651 == 255) {
								local1651 = -1;
							}
							@Pc(1660) int local1660 = Static159.aClass4_Sub11_Sub1_1.method8859();
							if (local18 >= 0 && local22 >= 0 && local18 < Static224.anInt3557 * 2 && Static224.anInt3557 * 2 > local22 && local158 >= 0 && local302 >= 0 && Static267.anInt4309 * 2 > local158 && Static267.anInt4309 * 2 > local302 && local557 != 65535) {
								local158 *= 256;
								local22 = local22 * 256;
								local1324 <<= 0x2;
								local18 *= 256;
								local302 *= 256;
								local630 <<= 0x2;
								local1660 <<= 0x2;
								if (local304 != 0 && local154 != -1) {
									@Pc(1738) Class3_Sub1_Sub2_Sub2 local1738 = null;
									@Pc(1748) int local1748;
									if (local304 < 0) {
										local1748 = -local304 - 1;
										if (local1748 == Static184.anInt3149) {
											local1738 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4;
										} else {
											local1738 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local1748];
										}
									} else {
										local1748 = local304 - 1;
										@Pc(1770) Class4_Sub45 local1770 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local1748);
										if (local1770 != null) {
											local1738 = local1770.aClass3_Sub1_Sub2_Sub2_Sub2_2;
										}
									}
									if (local1738 != null) {
										@Pc(1781) Class377 local1781 = local1738.method8525();
										if (local1781.anIntArrayArray62 != null && local1781.anIntArrayArray62[local154] != null) {
											local1324 -= local1781.anIntArrayArray62[local154][1];
										}
										if (local1781.anIntArrayArray61 != null && local1781.anIntArrayArray61[local154] != null) {
											local1324 -= local1781.anIntArrayArray61[local154][1];
										}
									}
								}
								@Pc(1838) Class3_Sub1_Sub2_Sub1 local1838 = new Class3_Sub1_Sub2_Sub1(local557, Static433.anInt6809, Static433.anInt6809, local18, local22, local1324, local654 + Static177.anInt3088, Static177.anInt3088 + local685, local1651, local1660, local304, local426, local630, local1575, local154);
								local1838.method705(Static177.anInt3088 + local654, local302, Static674.method8951(Static433.anInt6809, local302, local158) - local630, local158);
								Static473.aClass163_57.method3646(new Class4_Sub5_Sub8(local1838));
							}
						} else {
							Static357.method4765((Throwable) null, "T3 - " + arg0);
							Static306.method4298(false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method2779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg5 > 2000 || arg0 > 2000 || arg7 > 2000 || arg3 > 2000 || arg6 > 2000 || arg4 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg0 >= -2000 && arg7 >= -2000 && arg3 >= -2000 && arg6 >= -2000 && arg4 >= -2000) {
			@Pc(72) int local72;
			if (Static509.anInt7969 == 2) {
				local72 = arg5 * Static491.anInt7688 + arg3;
				if (local72 >= 0 && local72 < Static581.anIntArray637.length && Static581.anIntArray637[local72] > (arg1 << 8) - 38400) {
					return false;
				}
				local72 = arg6 + arg0 * Static491.anInt7688;
				if (local72 >= 0 && local72 < Static581.anIntArray637.length && (arg2 << 8) - 38400 < Static581.anIntArray637[local72]) {
					return false;
				}
				local72 = arg4 + arg7 * Static491.anInt7688;
				if (local72 >= 0 && Static581.anIntArray637.length > local72 && (arg8 << 8) - 38400 < Static581.anIntArray637[local72]) {
					return false;
				}
			}
			local72 = arg6 - arg3;
			@Pc(168) int local168 = arg0 - arg5;
			@Pc(173) int local173 = arg4 - arg3;
			@Pc(177) int local177 = arg7 - arg5;
			@Pc(182) int local182 = arg2 - arg1;
			if (arg5 < arg0 && arg7 > arg7) {
				if (arg0 > arg7) {
					arg0++;
				} else {
					arg7++;
				}
				arg5--;
			} else if (arg7 > arg0) {
				if (arg5 <= arg7) {
					arg7++;
				} else {
					arg5++;
				}
				arg0--;
			} else {
				arg7--;
				if (arg0 >= arg5) {
					arg0++;
				} else {
					arg5++;
				}
			}
			@Pc(240) int local240 = arg8 - arg1;
			@Pc(242) int local242 = 0;
			if (arg0 != arg5) {
				local242 = (arg6 - arg3 << 12) / (arg0 - arg5);
			}
			@Pc(259) int local259 = 0;
			if (arg7 != arg0) {
				local259 = (arg4 - arg6 << 12) / (arg7 - arg0);
			}
			@Pc(276) int local276 = 0;
			if (arg5 != arg7) {
				local276 = (arg3 - arg4 << 12) / (arg5 - arg7);
			}
			@Pc(303) int local303 = local72 * local177 - local173 * local168;
			if (local303 == 0) {
				return false;
			}
			@Pc(320) int local320 = (local182 * local177 - local168 * local240 << 8) / local303;
			@Pc(333) int local333 = (local240 * local72 - local182 * local173 << 8) / local303;
			if (arg5 <= arg0 && arg5 <= arg7) {
				if (arg5 >= Static148.anInt2693) {
					return true;
				}
				if (arg7 > Static148.anInt2693) {
					arg7 = Static148.anInt2693;
				}
				arg1 = (arg1 << 8) - (local320 * arg3 - local320);
				if (arg0 > Static148.anInt2693) {
					arg0 = Static148.anInt2693;
				}
				if (arg7 > arg0) {
					arg4 = arg3 <<= 0xC;
					arg6 <<= 0xC;
					if (arg5 < 0) {
						arg4 -= arg5 * local276;
						arg3 -= arg5 * local242;
						arg1 -= arg5 * local333;
						arg5 = 0;
					}
					if (arg0 < 0) {
						arg6 -= arg0 * local259;
						arg0 = 0;
					}
					if ((arg0 == arg5 || local276 >= local242) && (arg0 != arg5 || local259 >= local276)) {
						arg7 -= arg0;
						arg0 -= arg5;
						arg5 = Static491.anInt7688 * arg5;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static577.method6921(arg1, (arg4 >> 12) + 1, (arg6 >> 12) + -1, local320, Static581.anIntArray637, arg5)) {
										return false;
									}
									arg5 += Static491.anInt7688;
									arg6 += local259;
									arg1 += local333;
									arg4 += local276;
								}
							}
							if (!Static577.method6921(arg1, (arg4 >> 12) + 1, (arg3 >> 12) + -1, local320, Static581.anIntArray637, arg5)) {
								return false;
							}
							arg4 += local276;
							arg1 += local333;
							arg3 += local242;
							arg5 += Static491.anInt7688;
						}
					} else {
						arg7 -= arg0;
						arg0 -= arg5;
						arg5 *= Static491.anInt7688;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static577.method6921(arg1, (arg6 >> 12) + 1, (arg4 >> 12) - 1, local320, Static581.anIntArray637, arg5)) {
										return false;
									}
									arg4 += local276;
									arg1 += local333;
									arg6 += local259;
									arg5 += Static491.anInt7688;
								}
							}
							if (!Static577.method6921(arg1, (arg3 >> 12) + 1, (arg4 >> 12) + -1, local320, Static581.anIntArray637, arg5)) {
								return false;
							}
							arg5 += Static491.anInt7688;
							arg3 += local242;
							arg1 += local333;
							arg4 += local276;
						}
					}
				} else {
					arg6 = arg3 <<= 0xC;
					if (arg5 < 0) {
						arg3 -= arg5 * local242;
						arg1 -= local333 * arg5;
						arg6 -= arg5 * local276;
						arg5 = 0;
					}
					arg4 <<= 0xC;
					if (arg7 < 0) {
						arg4 -= arg7 * local259;
						arg7 = 0;
					}
					if (arg7 != arg5 && local276 < local242 || arg5 == arg7 && local242 < local259) {
						arg0 -= arg7;
						arg7 -= arg5;
						arg5 *= Static491.anInt7688;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static577.method6921(arg1, (arg3 >> 12) + 1, (arg4 >> 12) - 1, local320, Static581.anIntArray637, arg5)) {
										return false;
									}
									arg1 += local333;
									arg5 += Static491.anInt7688;
									arg4 += local259;
									arg3 += local242;
								}
							}
							if (!Static577.method6921(arg1, (arg3 >> 12) + 1, (arg6 >> 12) + -1, local320, Static581.anIntArray637, arg5)) {
								return false;
							}
							arg1 += local333;
							arg6 += local276;
							arg5 += Static491.anInt7688;
							arg3 += local242;
						}
					} else {
						arg0 -= arg7;
						arg7 -= arg5;
						arg5 = Static491.anInt7688 * arg5;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static577.method6921(arg1, (arg4 >> 12) + 1, (arg3 >> 12) + -1, local320, Static581.anIntArray637, arg5)) {
										return false;
									}
									arg4 += local259;
									arg3 += local242;
									arg5 += Static491.anInt7688;
									arg1 += local333;
								}
							}
							if (!Static577.method6921(arg1, (arg6 >> 12) + 1, (arg3 >> 12) + -1, local320, Static581.anIntArray637, arg5)) {
								return false;
							}
							arg1 += local333;
							arg6 += local276;
							arg3 += local242;
							arg5 += Static491.anInt7688;
						}
					}
				}
			} else if (arg7 < arg0) {
				if (arg7 >= Static148.anInt2693) {
					return true;
				}
				if (arg5 > Static148.anInt2693) {
					arg5 = Static148.anInt2693;
				}
				if (Static148.anInt2693 < arg0) {
					arg0 = Static148.anInt2693;
				}
				arg8 = (arg8 << 8) + local320 - arg4 * local320;
				if (arg5 < arg0) {
					arg6 = arg4 <<= 0xC;
					if (arg7 < 0) {
						arg4 -= arg7 * local276;
						arg6 -= local259 * arg7;
						arg8 -= local333 * arg7;
						arg7 = 0;
					}
					arg3 <<= 0xC;
					if (arg5 < 0) {
						arg3 -= local242 * arg5;
						arg5 = 0;
					}
					if (local276 > local259) {
						arg0 -= arg5;
						arg5 -= arg7;
						arg7 *= Static491.anInt7688;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static577.method6921(arg8, (arg3 >> 12) + 1, (arg6 >> 12) + -1, local320, Static581.anIntArray637, arg7)) {
										return false;
									}
									arg8 += local333;
									arg7 += Static491.anInt7688;
									arg3 += local242;
									arg6 += local259;
								}
							}
							if (!Static577.method6921(arg8, (arg4 >> 12) + 1, (arg6 >> 12) + -1, local320, Static581.anIntArray637, arg7)) {
								return false;
							}
							arg4 += local276;
							arg8 += local333;
							arg6 += local259;
							arg7 += Static491.anInt7688;
						}
					} else {
						arg0 -= arg5;
						arg5 -= arg7;
						arg7 = Static491.anInt7688 * arg7;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static577.method6921(arg8, (arg6 >> 12) + 1, (arg3 >> 12) + -1, local320, Static581.anIntArray637, arg7)) {
										return false;
									}
									arg6 += local259;
									arg7 += Static491.anInt7688;
									arg8 += local333;
									arg3 += local242;
								}
							}
							if (!Static577.method6921(arg8, (arg6 >> 12) + 1, (arg4 >> 12) + -1, local320, Static581.anIntArray637, arg7)) {
								return false;
							}
							arg8 += local333;
							arg6 += local259;
							arg7 += Static491.anInt7688;
							arg4 += local276;
						}
					}
				} else {
					arg3 = arg4 <<= 0xC;
					arg6 <<= 0xC;
					if (arg7 < 0) {
						arg8 -= arg7 * local333;
						arg3 -= arg7 * local259;
						arg4 -= local276 * arg7;
						arg7 = 0;
					}
					if (arg0 < 0) {
						arg6 -= local242 * arg0;
						arg0 = 0;
					}
					if (local259 >= local276) {
						arg5 -= arg0;
						arg0 -= arg7;
						arg7 *= Static491.anInt7688;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static577.method6921(arg8, (arg6 >> 12) + 1, (arg4 >> 12) + -1, local320, Static581.anIntArray637, arg7)) {
										return false;
									}
									arg6 += local242;
									arg4 += local276;
									arg7 += Static491.anInt7688;
									arg8 += local333;
								}
							}
							if (!Static577.method6921(arg8, (arg3 >> 12) + 1, (arg4 >> 12) + -1, local320, Static581.anIntArray637, arg7)) {
								return false;
							}
							arg3 += local259;
							arg7 += Static491.anInt7688;
							arg8 += local333;
							arg4 += local276;
						}
					} else {
						arg5 -= arg0;
						arg0 -= arg7;
						arg7 = Static491.anInt7688 * arg7;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static577.method6921(arg8, (arg4 >> 12) + 1, (arg6 >> 12) + -1, local320, Static581.anIntArray637, arg7)) {
										return false;
									}
									arg8 += local333;
									arg4 += local276;
									arg6 += local242;
									arg7 += Static491.anInt7688;
								}
							}
							if (!Static577.method6921(arg8, (arg4 >> 12) + 1, (arg3 >> 12) + -1, local320, Static581.anIntArray637, arg7)) {
								return false;
							}
							arg7 += Static491.anInt7688;
							arg4 += local276;
							arg3 += local259;
							arg8 += local333;
						}
					}
				}
			} else if (arg0 >= Static148.anInt2693) {
				return true;
			} else {
				if (Static148.anInt2693 < arg5) {
					arg5 = Static148.anInt2693;
				}
				arg2 = local320 + (arg2 << 8) - local320 * arg6;
				if (arg7 > Static148.anInt2693) {
					arg7 = Static148.anInt2693;
				}
				if (arg7 < arg5) {
					arg3 = arg6 <<= 0xC;
					arg4 <<= 0xC;
					if (arg0 < 0) {
						arg3 -= local242 * arg0;
						arg2 -= local333 * arg0;
						arg6 -= local259 * arg0;
						arg0 = 0;
					}
					if (arg7 < 0) {
						arg4 -= arg7 * local276;
						arg7 = 0;
					}
					if (arg7 != arg0 && local242 < local259 || arg7 == arg0 && local242 > local276) {
						arg5 -= arg7;
						arg7 -= arg0;
						arg0 *= Static491.anInt7688;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static577.method6921(arg2, (arg4 >> 12) + 1, (arg3 >> 12) + -1, local320, Static581.anIntArray637, arg0)) {
										return false;
									}
									arg0 += Static491.anInt7688;
									arg2 += local333;
									arg4 += local276;
									arg3 += local242;
								}
							}
							if (!Static577.method6921(arg2, (arg6 >> 12) + 1, (arg3 >> 12) + -1, local320, Static581.anIntArray637, arg0)) {
								return false;
							}
							arg2 += local333;
							arg0 += Static491.anInt7688;
							arg3 += local242;
							arg6 += local259;
						}
					} else {
						arg5 -= arg7;
						arg7 -= arg0;
						arg0 = Static491.anInt7688 * arg0;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static577.method6921(arg2, (arg3 >> 12) + 1, (arg4 >> 12) + -1, local320, Static581.anIntArray637, arg0)) {
										return false;
									}
									arg4 += local276;
									arg2 += local333;
									arg3 += local242;
									arg0 += Static491.anInt7688;
								}
							}
							if (!Static577.method6921(arg2, (arg3 >> 12) + 1, (arg6 >> 12) + -1, local320, Static581.anIntArray637, arg0)) {
								return false;
							}
							arg3 += local242;
							arg2 += local333;
							arg0 += Static491.anInt7688;
							arg6 += local259;
						}
					}
				} else {
					arg4 = arg6 <<= 0xC;
					arg3 <<= 0xC;
					if (arg0 < 0) {
						arg6 -= local259 * arg0;
						arg2 -= local333 * arg0;
						arg4 -= local242 * arg0;
						arg0 = 0;
					}
					if (arg5 < 0) {
						arg3 -= local276 * arg5;
						arg5 = 0;
					}
					if (local242 < local259) {
						arg7 -= arg5;
						arg5 -= arg0;
						arg0 *= Static491.anInt7688;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static577.method6921(arg2, (arg6 >> 12) + 1, (arg3 >> 12) + -1, local320, Static581.anIntArray637, arg0)) {
										return false;
									}
									arg2 += local333;
									arg0 += Static491.anInt7688;
									arg6 += local259;
									arg3 += local276;
								}
							}
							if (!Static577.method6921(arg2, (arg6 >> 12) + 1, (arg4 >> 12) + -1, local320, Static581.anIntArray637, arg0)) {
								return false;
							}
							arg0 += Static491.anInt7688;
							arg2 += local333;
							arg4 += local242;
							arg6 += local259;
						}
					} else {
						arg7 -= arg5;
						arg5 -= arg0;
						arg0 *= Static491.anInt7688;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static577.method6921(arg2, (arg3 >> 12) + 1, (arg6 >> 12) + -1, local320, Static581.anIntArray637, arg0)) {
										return false;
									}
									arg3 += local276;
									arg6 += local259;
									arg0 += Static491.anInt7688;
									arg2 += local333;
								}
							}
							if (!Static577.method6921(arg2, (arg4 >> 12) + 1, (arg6 >> 12) + -1, local320, Static581.anIntArray637, arg0)) {
								return false;
							}
							arg2 += local333;
							arg4 += local242;
							arg6 += local259;
							arg0 += Static491.anInt7688;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V")
	public static void method2780(@OriginalArg(0) boolean arg0) {
		Static253.method3677();
		if (!Static310.method4317(Static656.anInt10356)) {
			return;
		}
		Static635.anInt9890++;
		if (Static635.anInt9890 < 50 && !arg0) {
			return;
		}
		Static635.anInt9890 = 0;
		if (!Static559.aBoolean671 && Static375.aClass192_2 != null) {
			@Pc(44) Class4_Sub48 local44 = Static335.method4615(Static7.aClass216_4, Static669.aClass196_2);
			Static410.method5170(local44);
			try {
				Static460.method6417();
			} catch (@Pc(53) IOException local53) {
				Static559.aBoolean671 = true;
			}
		}
		Static253.method3677();
	}
}
