import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!iv", name = "R", descriptor = "I")
	public static int anInt3669;

	@OriginalMember(owner = "client!iv", name = "U", descriptor = "Lclient!ed;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!iv", name = "Q", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!dh;I)V")
	public static void method3293(@OriginalArg(0) Class49 arg0) {
		@Pc(12) int local12;
		@Pc(23) int local23;
		@Pc(32) int local32;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(54) int local54;
		if (arg0 == Static199.aClass49_2) {
			local12 = Static196.aClass4_Sub20_Sub1_4.method4560();
			if (local12 == 65535) {
				local12 = -1;
			}
			local23 = Static196.aClass4_Sub20_Sub1_4.method4617();
			local32 = Static392.anInt6820 + (local23 >> 4 & 0x7);
			local38 = (local23 & 0x7) + Static389.anInt6757;
			local42 = Static196.aClass4_Sub20_Sub1_4.method4617();
			local46 = local42 >> 2;
			local50 = local42 & 0x3;
			local54 = Static86.anIntArray170[local46];
			Static396.method5603(Static107.anInt2321, local46, local54, local50, local12, local32, local38);
		} else if (Static34.aClass49_5 == arg0) {
			local12 = Static196.aClass4_Sub20_Sub1_4.method4617();
			local23 = local12 >> 2;
			local32 = local12 & 0x3;
			local38 = Static86.anIntArray170[local23];
			local42 = Static196.aClass4_Sub20_Sub1_4.method4617();
			local46 = Static392.anInt6820 + (local42 >> 4 & 0x7);
			local50 = (local42 & 0x7) + Static389.anInt6757;
			if (Static271.method4359(Static227.anInt4510) || local46 >= 0 && local50 >= 0 && local46 < Static193.anInt3853 && Static301.anInt5585 > local50) {
				Static254.method4162(Static107.anInt2321, local50, local46, local32, -1, local38, local23);
			}
		} else if (arg0 == Static413.aClass49_20) {
			local12 = Static196.aClass4_Sub20_Sub1_4.method4614();
			local23 = (local12 & 0x7) + Static389.anInt6757;
			local32 = Static72.anInt1776 + local23;
			local38 = (local12 >> 4 & 0x7) + Static392.anInt6820;
			local42 = Static426.anInt7325 + local38;
			local46 = Static196.aClass4_Sub20_Sub1_4.method4560();
			local50 = Static196.aClass4_Sub20_Sub1_4.method4560();
			local54 = Static196.aClass4_Sub20_Sub1_4.method4560();
			if (Static377.aClass96_31 != null) {
				@Pc(186) Class4_Sub47 local186 = (Class4_Sub47) Static377.aClass96_31.method2797((long) (local42 | local32 << 14 | Static107.anInt2321 << 28));
				if (local186 != null) {
					for (@Pc(194) Class4_Sub42 local194 = (Class4_Sub42) local186.aClass91_54.method2584(); local194 != null; local194 = (Class4_Sub42) local186.aClass91_54.method2586()) {
						if ((local46 & 0x7FFF) == local194.anInt7301 && local194.anInt7299 == local50) {
							local194.method6330();
							local194.anInt7299 = local54;
							Static402.method5648(local42, local194, local32, Static107.anInt2321);
							break;
						}
					}
					if (local38 >= 0 && local23 >= 0 && local38 < Static193.anInt3853 && Static301.anInt5585 > local23) {
						Static365.method5225(local38, Static107.anInt2321, local23);
					}
				}
			}
		} else if (arg0 == Static66.aClass49_8) {
			local12 = Static196.aClass4_Sub20_Sub1_4.method4614();
			local23 = Static392.anInt6820 + (local12 >> 4 & 0x7);
			local32 = (local12 & 0x7) + Static389.anInt6757;
			local38 = Static196.aClass4_Sub20_Sub1_4.method4617();
			local42 = local38 >> 2;
			local46 = local38 & 0x3;
			local50 = Static86.anIntArray170[local42];
			local54 = Static196.aClass4_Sub20_Sub1_4.method4560();
			if (Static271.method4359(Static227.anInt4510) || local23 >= 0 && local32 >= 0 && Static193.anInt3853 > local23 && Static301.anInt5585 > local32) {
				Static254.method4162(Static107.anInt2321, local32, local23, local46, local54, local50, local42);
			}
		} else {
			@Pc(390) int local390;
			@Pc(392) int local392;
			if (Static267.aClass49_17 == arg0) {
				local12 = Static196.aClass4_Sub20_Sub1_4.method4614();
				local23 = Static392.anInt6820 + (local12 >> 4 & 0x7);
				local32 = Static389.anInt6757 + (local12 & 0x7);
				local38 = Static196.aClass4_Sub20_Sub1_4.method4560();
				local42 = Static196.aClass4_Sub20_Sub1_4.method4614();
				local46 = Static196.aClass4_Sub20_Sub1_4.method4560();
				local50 = Static196.aClass4_Sub20_Sub1_4.method4614();
				if (local23 >= 0 && local32 >= 0 && local23 < Static193.anInt3853 && local32 < Static301.anInt5585) {
					local54 = local23 * 128 + 64;
					local390 = local32 * 128 + 64;
					local392 = Static107.anInt2321;
					if (local392 < 3 && Static34.method498(local23, local32)) {
						local392++;
					}
					@Pc(425) Class11_Sub5_Sub3 local425 = new Class11_Sub5_Sub3(local38, local46, Static277.anInt2834, Static107.anInt2321, local392, local54, Static21.method356(local54, local390, Static107.anInt2321) - local42, local390, local23, local23, local32, local32, local50);
					Static325.aClass91_36.method2587(new Class4_Sub1_Sub2(local425));
				}
			} else {
				@Pc(503) boolean local503;
				if (arg0 == Static265.aClass49_16) {
					local12 = Static196.aClass4_Sub20_Sub1_4.method4607();
					local23 = Static196.aClass4_Sub20_Sub1_4.method4607();
					local32 = Static196.aClass4_Sub20_Sub1_4.method4623();
					local38 = Static196.aClass4_Sub20_Sub1_4.method4614();
					local42 = Static389.anInt6757 + (local38 & 0x7);
					local46 = local42 + Static72.anInt1776;
					local50 = (local38 >> 4 & 0x7) + Static392.anInt6820;
					local54 = Static426.anInt7325 + local50;
					if (Static147.anInt3062 != local23) {
						local503 = local50 >= 0 && local42 >= 0 && Static193.anInt3853 > local50 && Static301.anInt5585 > local42;
						if (local503 || Static271.method4359(Static227.anInt4510)) {
							Static402.method5648(local54, new Class4_Sub42(local12, local32), local46, Static107.anInt2321);
							if (local503) {
								Static365.method5225(local50, Static107.anInt2321, local42);
							}
						}
					}
				} else {
					@Pc(601) int local601;
					@Pc(605) int local605;
					@Pc(609) int local609;
					@Pc(597) int local597;
					if (Static109.aClass49_11 == arg0) {
						local12 = Static196.aClass4_Sub20_Sub1_4.method4614();
						@Pc(545) boolean local545 = (local12 & 0x80) != 0;
						local32 = (local12 >> 3 & 0x7) + Static392.anInt6820;
						local38 = Static389.anInt6757 + (local12 & 0x7);
						local42 = local32 + Static196.aClass4_Sub20_Sub1_4.method4576();
						local46 = Static196.aClass4_Sub20_Sub1_4.method4576() + local38;
						local50 = Static196.aClass4_Sub20_Sub1_4.method4586();
						local54 = Static196.aClass4_Sub20_Sub1_4.method4560();
						local390 = Static196.aClass4_Sub20_Sub1_4.method4614() * 4;
						local392 = Static196.aClass4_Sub20_Sub1_4.method4614() * 4;
						local597 = Static196.aClass4_Sub20_Sub1_4.method4560();
						local601 = Static196.aClass4_Sub20_Sub1_4.method4560();
						local605 = Static196.aClass4_Sub20_Sub1_4.method4614();
						local609 = Static196.aClass4_Sub20_Sub1_4.method4560();
						if (local605 == 255) {
							local605 = -1;
						}
						if (local32 >= 0 && local38 >= 0 && Static193.anInt3853 > local32 && local38 < Static301.anInt5585 && local42 >= 0 && local46 >= 0 && local42 < Static193.anInt3853 && local46 < Static301.anInt5585 && local54 != 65535) {
							local609 <<= 0x0;
							local392 <<= 0x0;
							local390 <<= 0x0;
							local42 = local42 * 128 + 64;
							local46 = local46 * 128 + 64;
							local32 = local32 * 128 + 64;
							local38 = local38 * 128 + 64;
							@Pc(703) Class11_Sub5_Sub6 local703 = new Class11_Sub5_Sub6(local54, Static107.anInt2321, local32, local38, local390, local597 + Static277.anInt2834, Static277.anInt2834 + local601, local605, local609, local50, local392, local545);
							local703.method6054(local46, Static21.method356(local42, local46, Static107.anInt2321) - local392, local42, local597 + Static277.anInt2834);
							Static354.aClass91_42.method2587(new Class4_Sub1_Sub15(local703));
						}
					} else if (Static277.aClass49_12 == arg0) {
						Static196.aClass4_Sub20_Sub1_4.method4614();
						local12 = Static196.aClass4_Sub20_Sub1_4.method4614();
						local23 = (local12 >> 4 & 0x7) + Static392.anInt6820;
						local32 = (local12 & 0x7) + Static389.anInt6757;
						local38 = Static196.aClass4_Sub20_Sub1_4.method4560();
						local42 = Static196.aClass4_Sub20_Sub1_4.method4614();
						local46 = Static196.aClass4_Sub20_Sub1_4.method4582();
						@Pc(767) String local767 = Static196.aClass4_Sub20_Sub1_4.method4624();
						Static30.method448(local32, local46, local767, local42, Static107.anInt2321, local23, local38);
					} else if (arg0 == Static264.aClass49_21) {
						local23 = Static196.aClass4_Sub20_Sub1_4.method4614();
						local32 = Static392.anInt6820 + (local23 >> 4 & 0x7);
						local38 = Static389.anInt6757 + (local23 & 0x7);
						local42 = Static196.aClass4_Sub20_Sub1_4.method4560();
						if (local42 == 65535) {
							local42 = -1;
						}
						local46 = Static196.aClass4_Sub20_Sub1_4.method4614();
						local50 = local46 >> 4 & 0xF;
						local54 = local46 & 0x7;
						local390 = Static196.aClass4_Sub20_Sub1_4.method4614();
						local392 = Static196.aClass4_Sub20_Sub1_4.method4614();
						if (local32 >= 0 && local38 >= 0 && Static193.anInt3853 > local32 && Static301.anInt5585 > local38) {
							local597 = local50 + 1;
							if (Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0] >= local32 - local597 && local32 + local597 >= Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0] && Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0] >= local38 - local597 && Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0] <= local38 + local597) {
								Static378.method5368(local392, local54, (local38 << 8) + (local32 << 16) + (Static107.anInt2321 << 24) + local50, local42, local390);
							}
						}
					} else {
						@Pc(1018) int local1018;
						@Pc(965) boolean local965;
						if (arg0 == Static42.aClass49_6) {
							local23 = Static196.aClass4_Sub20_Sub1_4.method4614();
							local32 = Static392.anInt6820 * 2 + (local23 >> 4 & 0xF);
							local38 = Static389.anInt6757 * 2 + (local23 & 0xF);
							local965 = Static196.aClass4_Sub20_Sub1_4.method4614() != 0;
							local46 = Static196.aClass4_Sub20_Sub1_4.method4576() + local32;
							local50 = Static196.aClass4_Sub20_Sub1_4.method4576() + local38;
							local54 = Static196.aClass4_Sub20_Sub1_4.method4586();
							local390 = Static196.aClass4_Sub20_Sub1_4.method4560();
							local392 = Static196.aClass4_Sub20_Sub1_4.method4614() * 4;
							local597 = Static196.aClass4_Sub20_Sub1_4.method4614() * 4;
							local601 = Static196.aClass4_Sub20_Sub1_4.method4560();
							local605 = Static196.aClass4_Sub20_Sub1_4.method4560();
							local609 = Static196.aClass4_Sub20_Sub1_4.method4614();
							if (local609 == 255) {
								local609 = -1;
							}
							local1018 = Static196.aClass4_Sub20_Sub1_4.method4560();
							if (local32 >= 0 && local38 >= 0 && local32 < Static193.anInt3853 * 2 && local38 < Static193.anInt3853 * 2 && local46 >= 0 && local50 >= 0 && Static301.anInt5585 * 2 > local46 && local50 < Static301.anInt5585 * 2 && local390 != 65535) {
								local38 *= 64;
								local597 <<= 0x0;
								local32 = local32 * 64;
								local1018 <<= 0x0;
								local392 <<= 0x0;
								local50 = local50 * 64;
								local46 = local46 * 64;
								@Pc(1106) Class11_Sub5_Sub6 local1106 = new Class11_Sub5_Sub6(local390, Static107.anInt2321, local32, local38, local392, Static277.anInt2834 + local601, Static277.anInt2834 + local605, local609, local1018, local54, local597, local965);
								local1106.method6054(local50, Static21.method356(local46, local50, Static107.anInt2321) - local597, local46, Static277.anInt2834 + local601);
								Static354.aClass91_42.method2587(new Class4_Sub1_Sub15(local1106));
							}
						} else if (arg0 == Static289.aClass49_18) {
							local23 = Static196.aClass4_Sub20_Sub1_4.method4560();
							local32 = Static196.aClass4_Sub20_Sub1_4.method4614();
							Static146.aClass228_1.method5203(local23).method3762(local32);
						} else {
							@Pc(1212) byte local1212;
							if (arg0 == Static234.aClass49_15) {
								local23 = Static196.aClass4_Sub20_Sub1_4.method4614();
								local32 = (local23 >> 4 & 0xF) + Static392.anInt6820 * 2;
								local38 = (local23 & 0xF) + Static389.anInt6757 * 2;
								local965 = Static196.aClass4_Sub20_Sub1_4.method4614() != 0;
								local46 = local32 + Static196.aClass4_Sub20_Sub1_4.method4576();
								local50 = local38 + Static196.aClass4_Sub20_Sub1_4.method4576();
								local54 = Static196.aClass4_Sub20_Sub1_4.method4586();
								local390 = Static196.aClass4_Sub20_Sub1_4.method4586();
								local392 = Static196.aClass4_Sub20_Sub1_4.method4560();
								local1212 = Static196.aClass4_Sub20_Sub1_4.method4576();
								local601 = Static196.aClass4_Sub20_Sub1_4.method4614() * 4;
								local605 = Static196.aClass4_Sub20_Sub1_4.method4560();
								local609 = Static196.aClass4_Sub20_Sub1_4.method4560();
								local1018 = Static196.aClass4_Sub20_Sub1_4.method4614();
								@Pc(1234) int local1234 = Static196.aClass4_Sub20_Sub1_4.method4560();
								if (local1018 == 255) {
									local1018 = -1;
								}
								if (local32 >= 0 && local38 >= 0 && local32 < Static193.anInt3853 * 2 && Static193.anInt3853 * 2 > local38 && local46 >= 0 && local50 >= 0 && Static301.anInt5585 * 2 > local46 && local50 < Static301.anInt5585 * 2 && local392 != 65535) {
									local1234 <<= 0x0;
									local38 = local38 * 64;
									local601 <<= 0x0;
									local597 = local1212 << 0;
									local32 *= 64;
									local50 *= 64;
									local46 = local46 * 64;
									if (local54 != 0) {
										@Pc(1324) Class11_Sub5_Sub2 local1324 = null;
										@Pc(1344) int local1344;
										@Pc(1334) int local1334;
										@Pc(1338) int local1338;
										if (local54 < 0) {
											local1334 = -local54 - 1;
											local1338 = local1334 & 0x7FF;
											local1344 = local1334 >> 11 & 0xF;
											if (local1338 == Static147.anInt3062) {
												local1324 = Static52.aClass11_Sub5_Sub2_Sub1_2;
											} else {
												local1324 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local1338];
											}
										} else {
											local1334 = local54 - 1;
											local1344 = local1334 >> 11 & 0xF;
											local1338 = local1334 & 0x7FF;
											@Pc(1380) Class4_Sub44 local1380 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local1338);
											if (local1380 != null) {
												local1324 = local1380.aClass11_Sub5_Sub2_Sub2_2;
											}
										}
										if (local1324 != null) {
											@Pc(1391) Class231 local1391 = local1324.method5306();
											if (local1391.anIntArrayArray45 != null && local1391.anIntArrayArray45[local1344] != null) {
												local1338 = local1391.anIntArrayArray45[local1344][0];
												@Pc(1413) int local1413 = local1391.anIntArrayArray45[local1344][2];
												@Pc(1418) int local1418 = local1324.aClass102_7.method2899();
												@Pc(1422) int local1422 = Class4_Sub13.anIntArray497[local1418];
												@Pc(1426) int local1426 = Class4_Sub13.anIntArray496[local1418];
												@Pc(1436) int local1436 = local1426 * local1338 + local1413 * local1422 >> 15;
												@Pc(1446) int local1446 = local1413 * local1426 - local1338 * local1422 >> 15;
												local32 += local1436;
												local38 += local1446;
												local597 -= local1391.anIntArrayArray45[local1344][1];
											}
										}
									}
									@Pc(1486) Class11_Sub5_Sub6 local1486 = new Class11_Sub5_Sub6(local392, Static107.anInt2321, local32, local38, local597, Static277.anInt2834 + local605, local609 - -Static277.anInt2834, local1018, local1234, local390, local601, local965);
									local1486.method6054(local50, Static21.method356(local46, local50, Static107.anInt2321) - local601, local46, Static277.anInt2834 + local605);
									Static354.aClass91_42.method2587(new Class4_Sub1_Sub15(local1486));
								}
							} else if (Static376.aClass49_19 == arg0) {
								local23 = Static196.aClass4_Sub20_Sub1_4.method4617();
								local32 = (local23 & 0x7) + Static389.anInt6757;
								local38 = Static72.anInt1776 + local32;
								local42 = (local23 >> 4 & 0x7) + Static392.anInt6820;
								local46 = local42 + Static426.anInt7325;
								local50 = Static196.aClass4_Sub20_Sub1_4.method4606();
								local54 = Static196.aClass4_Sub20_Sub1_4.method4607();
								local503 = local42 >= 0 && local32 >= 0 && Static193.anInt3853 > local42 && Static301.anInt5585 > local32;
								if (local503 || Static271.method4359(Static227.anInt4510)) {
									Static402.method5648(local46, new Class4_Sub42(local54, local50), local38, Static107.anInt2321);
									if (local503) {
										Static365.method5225(local42, Static107.anInt2321, local32);
									}
								}
							} else if (Static193.aClass49_13 == arg0) {
								local23 = Static196.aClass4_Sub20_Sub1_4.method4560();
								@Pc(1611) byte local1611 = Static196.aClass4_Sub20_Sub1_4.method4568();
								local38 = Static196.aClass4_Sub20_Sub1_4.method4622();
								local42 = Static196.aClass4_Sub20_Sub1_4.method4606();
								local46 = Static196.aClass4_Sub20_Sub1_4.method4602();
								local50 = local46 >> 2;
								local54 = local46 & 0x3;
								@Pc(1635) byte local1635 = Static196.aClass4_Sub20_Sub1_4.method4568();
								@Pc(1639) byte local1639 = Static196.aClass4_Sub20_Sub1_4.method4568();
								local1212 = Static196.aClass4_Sub20_Sub1_4.method4568();
								local601 = Static196.aClass4_Sub20_Sub1_4.method4617();
								local605 = Static392.anInt6820 + (local601 >> 4 & 0x7);
								local609 = Static389.anInt6757 + (local601 & 0x7);
								local1018 = Static196.aClass4_Sub20_Sub1_4.method4623();
								if (!Static30.aClass30_3.method2052()) {
									Static233.method3938(local42, local54, local38, local23, local1611, local1639, local609, local605, Static107.anInt2321, local1212, local50, local1635, local1018);
								}
							} else if (arg0 == Static209.aClass49_14) {
								local23 = Static196.aClass4_Sub20_Sub1_4.method4560();
								local32 = Static196.aClass4_Sub20_Sub1_4.method4617();
								local38 = Static389.anInt6757 + (local32 & 0x7);
								local42 = local38 + Static72.anInt1776;
								local46 = Static392.anInt6820 + (local32 >> 4 & 0x7);
								local50 = Static426.anInt7325 + local46;
								@Pc(1735) Class4_Sub47 local1735 = (Class4_Sub47) Static377.aClass96_31.method2797((long) (local50 | Static107.anInt2321 << 28 | local42 << 14));
								if (local1735 != null) {
									for (@Pc(1743) Class4_Sub42 local1743 = (Class4_Sub42) local1735.aClass91_54.method2584(); local1743 != null; local1743 = (Class4_Sub42) local1735.aClass91_54.method2586()) {
										if (local1743.anInt7301 == (local23 & 0x7FFF)) {
											local1743.method6330();
											break;
										}
									}
									if (local1735.aClass91_54.method2575()) {
										local1735.method6330();
									}
									if (local46 >= 0 && local38 >= 0 && local46 < Static193.anInt3853 && Static301.anInt5585 > local38) {
										Static365.method5225(local46, Static107.anInt2321, local38);
									}
								}
							} else {
								Static417.method5814(null, "T3 - " + arg0);
								Static91.method1815(false);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
	public static void method3294() {
		@Pc(1) Class273[] local1 = Applet_Sub1.aClass273Array2;
		synchronized (Applet_Sub1.aClass273Array2) {
			for (@Pc(5) int local5 = 0; local5 < Applet_Sub1.aClass273Array2.length; local5++) {
				Applet_Sub1.aClass273Array2[local5] = new Class273();
				Static86.anIntArray171[local5] = 0;
			}
		}
	}
}
