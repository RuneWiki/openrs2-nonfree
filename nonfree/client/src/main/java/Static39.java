import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_12 = new Class230(18, 1);

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!gv;")
	public static final Class130 aClass130_7 = new Class130();

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	public static int anInt1074 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ft;B)V")
	public static void method1143(@OriginalArg(0) Class110 arg0) {
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(49) int local49;
		@Pc(55) int local55;
		@Pc(67) int local67;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(59) int local59;
		@Pc(63) byte local63;
		if (arg0 == Static375.aClass110_29) {
			@Pc(17) byte local17 = Static89.aClass3_Sub7_Sub1_2.method6523();
			@Pc(23) byte local23 = Static89.aClass3_Sub7_Sub1_2.method6517();
			local29 = Static89.aClass3_Sub7_Sub1_2.method6538();
			local33 = local29 >> 2;
			local37 = local29 & 0x3;
			local41 = Static89.aClass3_Sub7_Sub1_2.method6555();
			local49 = (local41 >> 4 & 0x7) + Static112.anInt2616;
			local55 = (local41 & 0x7) + Static215.anInt6070;
			local59 = Static89.aClass3_Sub7_Sub1_2.method6525();
			local63 = Static89.aClass3_Sub7_Sub1_2.method6517();
			local67 = Static89.aClass3_Sub7_Sub1_2.method6535();
			@Pc(71) byte local71 = Static89.aClass3_Sub7_Sub1_2.method6517();
			local75 = Static89.aClass3_Sub7_Sub1_2.method6521();
			local79 = Static89.aClass3_Sub7_Sub1_2.method6541();
			if (!Static546.aClass15_16.method5289()) {
				Static473.method7261(Static292.anInt7686, local79, local67, local33, local63, local49, local71, local37, local23, local55, local75, local17, local59);
			}
			return;
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		if (arg0 == Static391.aClass110_30) {
			Static89.aClass3_Sub7_Sub1_2.method6538();
			local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
			local117 = (local109 >> 4 & 0x7) + Static112.anInt2616;
			local29 = Static215.anInt6070 + (local109 & 0x7);
			local33 = Static89.aClass3_Sub7_Sub1_2.method6535();
			local37 = Static89.aClass3_Sub7_Sub1_2.method6538();
			local41 = Static89.aClass3_Sub7_Sub1_2.method6506();
			@Pc(142) String local142 = Static89.aClass3_Sub7_Sub1_2.method6536();
			Static55.method1313(local37, local33, Static292.anInt7686, local41, local29, local117, local142);
			return;
		}
		@Pc(222) int local222;
		if (arg0 == Static239.aClass110_24) {
			local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
			local117 = Static112.anInt2616 + (local109 >> 4 & 0x7);
			local29 = Static215.anInt6070 + (local109 & 0x7);
			local33 = Static89.aClass3_Sub7_Sub1_2.method6535();
			local37 = Static89.aClass3_Sub7_Sub1_2.method6538();
			local41 = Static89.aClass3_Sub7_Sub1_2.method6535();
			local49 = Static89.aClass3_Sub7_Sub1_2.method6538();
			if (local117 >= 0 && local29 >= 0 && local117 < Static460.anInt8640 && Static292.anInt7682 > local29) {
				local55 = local117 * 512 + 256;
				local59 = local29 * 512 + 256;
				local222 = Static292.anInt7686;
				if (local222 < 3 && Static503.method7578(local117, local29)) {
					local222++;
				}
				@Pc(256) Class2_Sub2_Sub3 local256 = new Class2_Sub2_Sub3(local33, local41, Static129.anInt10429, Static292.anInt7686, local222, local55, Static274.method4782(local59, Static292.anInt7686, local55) - local37, local59, local117, local117, local29, local29, local49);
				Static542.aClass183_60.method4792(new Class3_Sub4_Sub17(local256));
			}
		} else if (Static237.aClass110_23 == arg0) {
			local109 = Static89.aClass3_Sub7_Sub1_2.method6532();
			local117 = Static89.aClass3_Sub7_Sub1_2.method6541();
			local29 = Static89.aClass3_Sub7_Sub1_2.method6547();
			local33 = Static215.anInt6070 + (local29 & 0x7);
			local37 = Static563.anInt10006 + local33;
			local41 = Static112.anInt2616 + (local29 >> 4 & 0x7);
			local49 = local41 + Static230.anInt4667;
			@Pc(330) boolean local330 = local41 >= 0 && local33 >= 0 && local41 < Static460.anInt8640 && local33 < Static292.anInt7682;
			if (local330 || Static393.method6278(anInt1074)) {
				Static276.method4822(Static292.anInt7686, local49, local37, new Class3_Sub10(local109, local117));
				if (local330) {
					Static510.method7653(local33, local41, Static292.anInt7686);
				}
			}
		} else if (Static172.aClass110_35 == arg0) {
			local109 = Static89.aClass3_Sub7_Sub1_2.method6547();
			local117 = Static215.anInt6070 + (local109 & 0x7);
			local29 = Static563.anInt10006 + local117;
			local33 = Static112.anInt2616 + (local109 >> 4 & 0x7);
			local37 = local33 + Static230.anInt4667;
			local41 = Static89.aClass3_Sub7_Sub1_2.method6521();
			@Pc(405) Class3_Sub30 local405 = (Class3_Sub30) Static30.aClass25_5.method946((long) (local37 | Static292.anInt7686 << 28 | local29 << 14));
			if (local405 != null) {
				for (@Pc(413) Class3_Sub10 local413 = (Class3_Sub10) local405.aClass183_37.method4795(); local413 != null; local413 = (Class3_Sub10) local405.aClass183_37.method4793()) {
					if (local413.anInt1852 == (local41 & 0x7FFF)) {
						local413.method8412();
						break;
					}
				}
				if (local405.aClass183_37.method4798()) {
					local405.method8412();
				}
				if (local33 >= 0 && local117 >= 0 && Static460.anInt8640 > local33 && Static292.anInt7682 > local117) {
					Static510.method7653(local117, local33, Static292.anInt7686);
				}
			}
		} else {
			@Pc(540) int local540;
			@Pc(501) boolean local501;
			if (arg0 == Static251.aClass110_26) {
				local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
				local117 = Static112.anInt2616 * 2 + (local109 >> 4 & 0xF);
				local29 = Static215.anInt6070 * 2 + (local109 & 0xF);
				local501 = Static89.aClass3_Sub7_Sub1_2.method6538() != 0;
				local37 = Static89.aClass3_Sub7_Sub1_2.method6529() + local117;
				local41 = local29 + Static89.aClass3_Sub7_Sub1_2.method6529();
				local49 = Static89.aClass3_Sub7_Sub1_2.method6525();
				local55 = Static89.aClass3_Sub7_Sub1_2.method6525();
				local59 = Static89.aClass3_Sub7_Sub1_2.method6535();
				local63 = Static89.aClass3_Sub7_Sub1_2.method6529();
				local67 = Static89.aClass3_Sub7_Sub1_2.method6538() * 4;
				local540 = Static89.aClass3_Sub7_Sub1_2.method6535();
				local75 = Static89.aClass3_Sub7_Sub1_2.method6535();
				local79 = Static89.aClass3_Sub7_Sub1_2.method6538();
				@Pc(554) int local554 = Static89.aClass3_Sub7_Sub1_2.method6535();
				if (local79 == 255) {
					local79 = -1;
				}
				if (local117 >= 0 && local29 >= 0 && local117 < Static460.anInt8640 * 2 && Static460.anInt8640 * 2 > local29 && local37 >= 0 && local41 >= 0 && Static292.anInt7682 * 2 > local37 && local41 < Static292.anInt7682 * 2 && local59 != 65535) {
					local41 = local41 * 256;
					local67 <<= 0x2;
					local29 = local29 * 256;
					local37 = local37 * 256;
					local117 *= 256;
					local222 = local63 << 2;
					local554 <<= 0x2;
					if (local49 != 0) {
						@Pc(639) Class2_Sub2_Sub1 local639 = null;
						@Pc(655) int local655;
						@Pc(649) int local649;
						@Pc(659) int local659;
						if (local49 < 0) {
							local649 = -local49 - 1;
							local655 = local649 >> 11 & 0xF;
							local659 = local649 & 0x7FF;
							if (Static381.anInt1560 == local659) {
								local639 = Static443.aClass2_Sub2_Sub1_Sub1_2;
							} else {
								local639 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local659];
							}
						} else {
							local649 = local49 - 1;
							local659 = local649 & 0x7FF;
							local655 = local649 >> 11 & 0xF;
							@Pc(695) Class3_Sub46 local695 = (Class3_Sub46) Static331.aClass25_25.method946((long) local659);
							if (local695 != null) {
								local639 = local695.aClass2_Sub2_Sub1_Sub2_2;
							}
						}
						if (local639 != null) {
							@Pc(706) Class171 local706 = local639.method6316();
							if (local706.anIntArrayArray39 != null && local706.anIntArrayArray39[local655] != null) {
								local659 = local706.anIntArrayArray39[local655][0];
								@Pc(728) int local728 = local706.anIntArrayArray39[local655][2];
								@Pc(733) int local733 = local639.aClass358_7.method8345();
								@Pc(737) int local737 = Class2_Sub3.anIntArray620[local733];
								@Pc(741) int local741 = Class2_Sub3.anIntArray621[local733];
								@Pc(751) int local751 = local741 * local659 + local728 * local737 >> 14;
								@Pc(761) int local761 = local728 * local741 - local737 * local659 >> 14;
								local222 -= local706.anIntArrayArray39[local655][1];
								local117 += local751;
								local29 += local761;
							}
						}
					}
					@Pc(800) Class2_Sub2_Sub5 local800 = new Class2_Sub2_Sub5(local59, Static292.anInt7686, local117, local29, local222, local540 + Static129.anInt10429, local75 + Static129.anInt10429, local79, local554, local55, local67, local501);
					local800.method6583(local41, Static129.anInt10429 + local540, Static274.method4782(local41, Static292.anInt7686, local37) + -local67, local37);
					Static591.aClass183_64.method4792(new Class3_Sub4_Sub18(local800));
				}
			} else {
				@Pc(1016) Class2_Sub2_Sub5 local1016;
				if (arg0 == Static399.aClass110_32) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local117 = Static112.anInt2616 * 2 + (local109 >> 4 & 0xF);
					local29 = (local109 & 0xF) + Static215.anInt6070 * 2;
					local501 = Static89.aClass3_Sub7_Sub1_2.method6538() != 0;
					local37 = Static89.aClass3_Sub7_Sub1_2.method6529() + local117;
					local41 = local29 + Static89.aClass3_Sub7_Sub1_2.method6529();
					local49 = Static89.aClass3_Sub7_Sub1_2.method6525();
					local55 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local59 = Static89.aClass3_Sub7_Sub1_2.method6538() * 4;
					local222 = Static89.aClass3_Sub7_Sub1_2.method6538() * 4;
					local67 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local540 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local75 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local79 = Static89.aClass3_Sub7_Sub1_2.method6535();
					if (local75 == 255) {
						local75 = -1;
					}
					if (local117 >= 0 && local29 >= 0 && local117 < Static460.anInt8640 * 2 && Static460.anInt8640 * 2 > local29 && local37 >= 0 && local41 >= 0 && Static292.anInt7682 * 2 > local37 && Static292.anInt7682 * 2 > local41 && local55 != 65535) {
						local222 <<= 0x2;
						local41 *= 256;
						local79 <<= 0x2;
						local37 = local37 * 256;
						local59 <<= 0x2;
						local29 *= 256;
						local117 *= 256;
						local1016 = new Class2_Sub2_Sub5(local55, Static292.anInt7686, local117, local29, local59, local67 + Static129.anInt10429, Static129.anInt10429 + local540, local75, local79, local49, local222, local501);
						local1016.method6583(local41, local67 + Static129.anInt10429, -local222 + Static274.method4782(local41, Static292.anInt7686, local37), local37);
						Static591.aClass183_64.method4792(new Class3_Sub4_Sub18(local1016));
					}
				} else if (arg0 == Static553.aClass110_38) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local117 = local109 >> 2;
					local29 = local109 & 0x3;
					local33 = Static85.anIntArray92[local117];
					local37 = Static89.aClass3_Sub7_Sub1_2.method6505();
					local41 = Static112.anInt2616 + (local37 >> 4 & 0x7);
					local49 = (local37 & 0x7) + Static215.anInt6070;
					local55 = Static89.aClass3_Sub7_Sub1_2.method6521();
					if (Static393.method6278(anInt1074) || local41 >= 0 && local49 >= 0 && Static460.anInt8640 > local41 && Static292.anInt7682 > local49) {
						Static131.method2556(local117, local49, Static292.anInt7686, local33, local41, local55, local29);
					}
				} else if (Static497.aClass110_37 == arg0) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local117 = Static112.anInt2616 + (local109 >> 4 & 0x7);
					local29 = (local109 & 0x7) + Static215.anInt6070;
					local33 = Static89.aClass3_Sub7_Sub1_2.method6535();
					if (local33 == 65535) {
						local33 = -1;
					}
					local37 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local41 = local37 >> 4 & 0xF;
					local49 = local37 & 0x7;
					local55 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local59 = Static89.aClass3_Sub7_Sub1_2.method6538();
					if (local117 >= 0 && local29 >= 0 && local117 < Static460.anInt8640 && Static292.anInt7682 > local29) {
						local222 = local41 + 1;
						if (local117 - local222 <= Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0] && local117 + local222 >= Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0] && local29 - local222 <= Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0] && Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0] <= local29 + local222) {
							Static348.method2211(local55, (local29 << 8) + (local117 << 16) + (Static292.anInt7686 << 24) + local41, local59, local49, local33);
						}
					}
				} else if (arg0 == Static167.aClass110_19) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6547();
					local117 = Static112.anInt2616 + (local109 >> 4 & 0x7);
					local29 = (local109 & 0x7) + Static215.anInt6070;
					local33 = Static89.aClass3_Sub7_Sub1_2.method6521();
					if (local33 == 65535) {
						local33 = -1;
					}
					local37 = Static89.aClass3_Sub7_Sub1_2.method6555();
					local41 = local37 >> 2;
					local49 = local37 & 0x3;
					local55 = Static85.anIntArray92[local41];
					Static269.method4714(local117, Static292.anInt7686, local41, local49, local33, local55, local29);
				} else if (arg0 == Static488.aClass110_9) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local117 = (local109 & 0x7) + Static215.anInt6070;
					local29 = Static563.anInt10006 + local117;
					local33 = (local109 >> 4 & 0x7) + Static112.anInt2616;
					local37 = Static230.anInt4667 + local33;
					local41 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local49 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local55 = Static89.aClass3_Sub7_Sub1_2.method6535();
					if (Static30.aClass25_5 != null) {
						@Pc(1367) Class3_Sub30 local1367 = (Class3_Sub30) Static30.aClass25_5.method946((long) (local29 << 14 | Static292.anInt7686 << 28 | local37));
						if (local1367 != null) {
							for (@Pc(1375) Class3_Sub10 local1375 = (Class3_Sub10) local1367.aClass183_37.method4795(); local1375 != null; local1375 = (Class3_Sub10) local1367.aClass183_37.method4793()) {
								if ((local41 & 0x7FFF) == local1375.anInt1852 && local49 == local1375.anInt1853) {
									local1375.method8412();
									local1375.anInt1853 = local55;
									Static276.method4822(Static292.anInt7686, local37, local29, local1375);
									break;
								}
							}
							if (local33 >= 0 && local117 >= 0 && local33 < Static460.anInt8640 && Static292.anInt7682 > local117) {
								Static510.method7653(local117, local33, Static292.anInt7686);
							}
						}
					}
				} else if (Static146.aClass110_39 == arg0) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
					@Pc(1455) boolean local1455 = (local109 & 0x80) != 0;
					local29 = Static112.anInt2616 + (local109 >> 3 & 0x7);
					local33 = Static215.anInt6070 + (local109 & 0x7);
					local37 = Static89.aClass3_Sub7_Sub1_2.method6529() + local29;
					local41 = local33 + Static89.aClass3_Sub7_Sub1_2.method6529();
					local49 = Static89.aClass3_Sub7_Sub1_2.method6525();
					local55 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local59 = Static89.aClass3_Sub7_Sub1_2.method6538() * 4;
					local222 = Static89.aClass3_Sub7_Sub1_2.method6538() * 4;
					local67 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local540 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local75 = Static89.aClass3_Sub7_Sub1_2.method6538();
					if (local75 == 255) {
						local75 = -1;
					}
					local79 = Static89.aClass3_Sub7_Sub1_2.method6535();
					if (local29 >= 0 && local33 >= 0 && local29 < Static460.anInt8640 && local33 < Static292.anInt7682 && local37 >= 0 && local41 >= 0 && Static460.anInt8640 > local37 && local41 < Static292.anInt7682 && local55 != 65535) {
						local29 = local29 * 512 + 256;
						local33 = local33 * 512 + 256;
						local37 = local37 * 512 + 256;
						local59 <<= 0x2;
						local222 <<= 0x2;
						local41 = local41 * 512 + 256;
						local79 <<= 0x2;
						local1016 = new Class2_Sub2_Sub5(local55, Static292.anInt7686, local29, local33, local59, local67 + Static129.anInt10429, local540 + Static129.anInt10429, local75, local79, local49, local222, local1455);
						local1016.method6583(local41, Static129.anInt10429 + local67, Static274.method4782(local41, Static292.anInt7686, local37) - local222, local37);
						Static591.aClass183_64.method4792(new Class3_Sub4_Sub18(local1016));
					}
				} else if (arg0 == Static550.aClass110_36) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local117 = Static112.anInt2616 + (local109 >> 4 & 0x7);
					local29 = Static215.anInt6070 + (local109 & 0x7);
					local33 = Static89.aClass3_Sub7_Sub1_2.method6535();
					if (local33 == 65535) {
						local33 = -1;
					}
					local37 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local41 = local37 >> 4 & 0xF;
					local49 = local37 & 0x7;
					local55 = Static89.aClass3_Sub7_Sub1_2.method6538();
					local59 = Static89.aClass3_Sub7_Sub1_2.method6538();
					if (local117 >= 0 && local29 >= 0 && Static460.anInt8640 > local117 && local29 < Static292.anInt7682) {
						local222 = local41 + 1;
						if (local117 - local222 <= Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0] && Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0] <= local117 + local222 && Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0] >= local29 - local222 && Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0] <= local29 + local222) {
							Static453.method7041(local49, local33, (local29 << 8) + (Static292.anInt7686 << 24) + (local117 << 16) + local41, local55, local59);
						}
					}
				} else if (Static5.aClass110_3 == arg0) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6541();
					local117 = Static89.aClass3_Sub7_Sub1_2.method6532();
					local29 = Static89.aClass3_Sub7_Sub1_2.method6555();
					local33 = (local29 & 0x7) + Static215.anInt6070;
					local37 = local33 + Static563.anInt10006;
					local41 = Static112.anInt2616 + (local29 >> 4 & 0x7);
					local49 = Static230.anInt4667 + local41;
					local55 = Static89.aClass3_Sub7_Sub1_2.method6535();
					if (local109 != Static381.anInt1560) {
						@Pc(1860) boolean local1860 = local41 >= 0 && local33 >= 0 && local41 < Static460.anInt8640 && Static292.anInt7682 > local33;
						if (local1860 || Static393.method6278(anInt1074)) {
							Static276.method4822(Static292.anInt7686, local49, local37, new Class3_Sub10(local55, local117));
							if (local1860) {
								Static510.method7653(local33, local41, Static292.anInt7686);
							}
						}
					}
				} else if (Static107.aClass110_14 == arg0) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6555();
					local117 = local109 >> 2;
					local29 = local109 & 0x3;
					local33 = Static85.anIntArray92[local117];
					local37 = Static89.aClass3_Sub7_Sub1_2.method6505();
					local41 = Static112.anInt2616 + (local37 >> 4 & 0x7);
					local49 = Static215.anInt6070 + (local37 & 0x7);
					if (Static393.method6278(anInt1074) || local41 >= 0 && local49 >= 0 && Static460.anInt8640 > local41 && local49 < Static292.anInt7682) {
						Static131.method2556(local117, local49, Static292.anInt7686, local33, local41, -1, local29);
					}
				} else if (Static570.aClass110_31 == arg0) {
					local109 = Static89.aClass3_Sub7_Sub1_2.method6535();
					local117 = Static89.aClass3_Sub7_Sub1_2.method6538();
					Static253.aClass146_2.method3356(local109).method7186(local117);
				} else {
					Static468.method7192("T3 - " + arg0, null);
					Static233.method4046(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
	public static void method1144() {
		Static93.aClipboard1 = null;
		Static361.aBoolean607 = false;
		Static210.method3686();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!ufa;)[Lclient!an;")
	public static Class13[] method1145(@OriginalArg(1) Class326 arg0) {
		if (!arg0.method7797()) {
			return new Class13[0];
		}
		@Pc(14) Class66 local14 = arg0.method7786();
		while (local14.anInt2308 == 0) {
			Static1.method125(10L);
		}
		if (local14.anInt2308 == 2) {
			return new Class13[0];
		}
		@Pc(34) int[] local34 = (int[]) local14.anObject4;
		@Pc(40) Class13[] local40 = new Class13[local34.length >> 2];
		for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
			@Pc(47) Class13 local47 = new Class13();
			local40[local42] = local47;
			local47.anInt487 = local34[local42 << 2];
			local47.anInt485 = local34[(local42 << 2) + 1];
			local47.anInt484 = local34[(local42 << 2) + 2];
			local47.anInt483 = local34[(local42 << 2) + 3];
		}
		return local40;
	}
}
