import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!mca", name = "B", descriptor = "Lclient!hk;")
	public static Class155 aClass155_16;

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
	public static int anInt5799;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BI)V")
	public static void method5179(@OriginalArg(1) int arg0) {
		Static396.anInt6671 = 3;
		Static557.anInt8788 = -1;
		Static81.anInt1432 = 100;
		Static284.anInt5035 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!rda;III)V")
	public static void method5181(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class128 local12;
		if (arg2 < Static672.anInt10829) {
			local12 = Static283.aClass128ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass4_Sub1_Sub3_1 != null && local12.aClass4_Sub1_Sub3_1.method8339()) {
				arg0.method8354(true, 0, Static44.aClass100_1, 0, local12.aClass4_Sub1_Sub3_1, -124, Static492.anInt7972);
			}
		}
		if (arg3 < Static672.anInt10829) {
			local12 = Static283.aClass128ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub1_Sub3_1 != null && local12.aClass4_Sub1_Sub3_1.method8339()) {
				arg0.method8354(true, 0, Static44.aClass100_1, Static492.anInt7972, local12.aClass4_Sub1_Sub3_1, -44, 0);
			}
		}
		if (arg2 < Static672.anInt10829 && arg3 < Static532.anInt8517) {
			local12 = Static283.aClass128ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub1_Sub3_1 != null && local12.aClass4_Sub1_Sub3_1.method8339()) {
				arg0.method8354(true, 0, Static44.aClass100_1, Static492.anInt7972, local12.aClass4_Sub1_Sub3_1, -18, Static492.anInt7972);
			}
		}
		if (arg2 < Static672.anInt10829 && arg3 > 0) {
			local12 = Static283.aClass128ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass4_Sub1_Sub3_1 != null && local12.aClass4_Sub1_Sub3_1.method8339()) {
				arg0.method8354(true, 0, Static44.aClass100_1, -Static492.anInt7972, local12.aClass4_Sub1_Sub3_1, -85, Static492.anInt7972);
			}
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIII)Z")
	public static boolean method5185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static394.aClass10_4.method4216(arg2, arg1, arg0, Static93.anIntArray88);
		@Pc(13) int local13 = Static93.anIntArray88[2];
		if (local13 < 50) {
			return false;
		} else {
			Static93.anIntArray88[0] = Static29.anInt420 * Static93.anIntArray88[0] / local13 + Static538.anInt8593;
			Static93.anIntArray88[1] = Static310.anInt5339 + Static93.anIntArray88[1] * Static403.anInt6805 / local13;
			Static93.anIntArray88[2] = local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5186(@OriginalArg(1) String arg0) {
		return Static509.method7016(arg0);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!lt;I)V")
	public static void method5187(@OriginalArg(0) Class226 arg0) {
		@Pc(8) Class5_Sub36_Sub2 local8 = Static4.aClass389_17.aClass5_Sub36_Sub2_2;
		@Pc(15) int local15;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(48) int local48;
		@Pc(55) int local55;
		if (arg0 == Static114.aClass226_9) {
			local15 = local8.method7333();
			if (local15 == 65535) {
				local15 = -1;
			}
			local24 = local8.method7330();
			local28 = local24 >> 2;
			local32 = local24 & 0x3;
			local36 = Static248.anIntArray223[local28];
			local40 = local8.method7330();
			local48 = Static637.anInt7729 + (local40 >> 4 & 0x7);
			local55 = Static257.anInt4648 + (local40 & 0x7);
			Static23.method373(local28, local15, local32, local36, local48, local55, Static647.anInt10548);
			return;
		}
		@Pc(151) int local151;
		@Pc(155) int local155;
		@Pc(172) int local172;
		@Pc(180) int local180;
		@Pc(137) int local137;
		@Pc(141) int local141;
		@Pc(147) int local147;
		@Pc(176) int local176;
		if (Static626.aClass226_19 == arg0) {
			local15 = local8.method7291();
			local24 = (local15 >> 4 & 0xF) + Static637.anInt7729 * 2;
			local28 = Static257.anInt4648 * 2 + (local15 & 0xF);
			local32 = local8.method7291();
			@Pc(104) boolean local104 = (local32 & 0x1) != 0;
			@Pc(113) boolean local113 = (local32 & 0x2) != 0;
			local48 = local113 ? local32 >> 2 : -1;
			local55 = local24 + local8.method7318();
			local137 = local8.method7318() + local28;
			local141 = local8.method7303();
			local147 = local8.method7303();
			local151 = local8.method7333();
			local155 = local8.method7291();
			if (local113) {
				local155 = (byte) local155;
			} else {
				local155 *= 4;
			}
			local172 = local8.method7291() * 4;
			local176 = local8.method7333();
			local180 = local8.method7333();
			@Pc(184) int local184 = local8.method7291();
			if (local184 == 255) {
				local184 = -1;
			}
			@Pc(195) int local195 = local8.method7333();
			if (local24 >= 0 && local28 >= 0 && Static271.anInt4910 * 2 > local24 && local28 < Static271.anInt4910 * 2 && local55 >= 0 && local137 >= 0 && Static613.anInt9909 * 2 > local55 && local137 < Static613.anInt9909 * 2 && local151 != 65535) {
				local155 <<= 0x2;
				local24 = local24 * 256;
				local55 *= 256;
				local28 *= 256;
				local195 <<= 0x2;
				local137 = local137 * 256;
				local172 <<= 0x2;
				if (local141 != 0 && local48 != -1) {
					@Pc(289) Class4_Sub1_Sub1_Sub2 local289 = null;
					@Pc(298) int local298;
					if (local141 >= 0) {
						local298 = local141 - 1;
						@Pc(305) Class5_Sub9 local305 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local298);
						if (local305 != null) {
							local289 = local305.aClass4_Sub1_Sub1_Sub2_Sub2_1;
						}
					} else {
						local298 = -local141 - 1;
						if (local298 == Static649.anInt10621) {
							local289 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4;
						} else {
							local289 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local298];
						}
					}
					if (local289 != null) {
						@Pc(332) Class92 local332 = local289.method5930();
						if (local332.anIntArrayArray16 != null && local332.anIntArrayArray16[local48] != null) {
							local155 -= local332.anIntArrayArray16[local48][1];
						}
						if (local332.anIntArrayArray17 != null && local332.anIntArrayArray17[local48] != null) {
							local155 -= local332.anIntArrayArray17[local48][1];
						}
					}
				}
				@Pc(393) Class4_Sub1_Sub1_Sub4 local393 = new Class4_Sub1_Sub1_Sub4(local151, Static647.anInt10548, Static647.anInt10548, local24, local28, local155, Static565.anInt8921 + local176, Static565.anInt8921 + local180, local184, local195, local141, local147, local172, local104, local48);
				local393.method6890(local137, local55, Static461.method6500(local55, Static647.anInt10548, local137) - local172, local176 - -Static565.anInt8921);
				Static419.aClass20_35.method370(new Class5_Sub1_Sub3(local393));
			}
		} else if (arg0 == Static68.aClass226_15) {
			local15 = local8.method7291();
			local24 = (local15 >> 4 & 0x7) + Static637.anInt7729;
			local28 = Static257.anInt4648 + (local15 & 0x7);
			local32 = local8.method7333();
			if (local32 == 65535) {
				local32 = -1;
			}
			local36 = local8.method7291();
			local40 = local36 >> 4 & 0xF;
			local48 = local36 & 0x7;
			local55 = local8.method7291();
			local137 = local8.method7291();
			local141 = local8.method7333();
			if (local24 >= 0 && local28 >= 0 && local24 < Static271.anInt4910 && Static613.anInt9909 > local28) {
				local147 = local40 + 1;
				if (local24 - local147 <= Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0] && local24 + local147 >= Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0] && local28 - local147 <= Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0] && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0] <= local147 + local28) {
					Static231.method3631(local137, local55, local141, local32, local40 + (Static647.anInt10548 << 24) + (local24 << 16) + (local28 << 8), local48);
				}
			}
		} else if (Static640.aClass226_20 == arg0) {
			local15 = local8.method7280();
			local24 = (local15 & 0x7) + Static257.anInt4648;
			local28 = local24 + Static290.anInt5128;
			local32 = Static637.anInt7729 + (local15 >> 4 & 0x7);
			local36 = Static315.anInt5380 + local32;
			local40 = local8.method7300();
			local48 = local8.method7282();
			@Pc(653) boolean local653 = local32 >= 0 && local24 >= 0 && Static271.anInt4910 > local32 && Static613.anInt9909 > local24;
			if (local653 || Static199.method3308(Static139.anInt2749)) {
				Static18.method272(local28, new Class5_Sub2(local40, local48), local36, Static647.anInt10548);
				if (local653) {
					Static549.method7494(local32, Static647.anInt10548, local24);
				}
			}
		} else if (arg0 == Static57.aClass226_6) {
			local15 = local8.method7316();
			local24 = local8.method7290();
			local28 = Static257.anInt4648 + (local24 & 0x7);
			local32 = local28 + Static290.anInt5128;
			local36 = (local24 >> 4 & 0x7) + Static637.anInt7729;
			local40 = local36 + Static315.anInt5380;
			local48 = local8.method7282();
			local55 = local8.method7316();
			if (local55 != Static649.anInt10621) {
				@Pc(761) boolean local761 = local36 >= 0 && local28 >= 0 && Static271.anInt4910 > local36 && Static613.anInt9909 > local28;
				if (local761 || Static199.method3308(Static139.anInt2749)) {
					Static18.method272(local32, new Class5_Sub2(local15, local48), local40, Static647.anInt10548);
					if (local761) {
						Static549.method7494(local36, Static647.anInt10548, local28);
					}
				}
			}
		} else if (arg0 == Static111.aClass226_8) {
			local15 = local8.method7291();
			local24 = Static637.anInt7729 + (local15 >> 4 & 0x7);
			local28 = Static257.anInt4648 + (local15 & 0x7);
			local32 = local8.method7333();
			if (local32 == 65535) {
				local32 = -1;
			}
			local36 = local8.method7291();
			local40 = local36 >> 4 & 0xF;
			local48 = local36 & 0x7;
			local55 = local8.method7291();
			local137 = local8.method7291();
			local141 = local8.method7333();
			if (local24 >= 0 && local28 >= 0 && Static271.anInt4910 > local24 && Static613.anInt9909 > local28) {
				local147 = local40 + 1;
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0] >= local24 - local147 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0] <= local147 + local24 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0] >= local28 - local147 && local147 + local28 >= Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0]) {
					Static413.method6090(local48, local137, local32, local141, local55, (local24 << 16) + (Static647.anInt10548 << 24) + (local28 << 8) + local40);
				}
			}
		} else if (Static41.aClass226_5 == arg0) {
			local15 = local8.method7330();
			local24 = local8.method7333();
			@Pc(976) Class354 local976 = Static528.aClass243_3.method5556(local24);
			local32 = local8.method7280();
			local36 = local32 >> 2;
			local40 = Static248.anIntArray223[local36];
			local48 = local8.method7330();
			local55 = (local48 >> 4 & 0x7) + Static637.anInt7729;
			if (local36 == 11) {
				local36 = 10;
			}
			local137 = (local48 & 0x7) + Static257.anInt4648;
			local141 = 0;
			if (local976.aByteArray95 != null) {
				local147 = -1;
				for (local151 = 0; local151 < local976.aByteArray95.length; local151++) {
					if (local36 == local976.aByteArray95[local151]) {
						local147 = local151;
						break;
					}
				}
				local141 = local976.anIntArrayArray55[local147].length;
			}
			local147 = 0;
			if (local976.aShortArray138 != null) {
				local147 = local976.aShortArray138.length;
			}
			local151 = 0;
			if (local976.aShortArray137 != null) {
				local151 = local976.aShortArray137.length;
			}
			if ((local15 & 0x1) == 1) {
				Static531.method7490(local40, local137, Static647.anInt10548, (Class87) null, local55);
			} else {
				@Pc(1092) int[] local1092 = null;
				if ((local15 & 0x2) == 2) {
					local1092 = new int[local141];
					for (local172 = 0; local172 < local141; local172++) {
						local1092[local172] = local8.method7333();
					}
				}
				@Pc(1120) short[] local1120 = null;
				if ((local15 & 0x4) == 4) {
					local1120 = new short[local147];
					for (local176 = 0; local176 < local147; local176++) {
						local1120[local176] = (short) local8.method7333();
					}
				}
				@Pc(1147) short[] local1147 = null;
				if ((local15 & 0x8) == 8) {
					local1147 = new short[local151];
					for (local180 = 0; local180 < local151; local180++) {
						local1147[local180] = (short) local8.method7333();
					}
				}
				Static531.method7490(local40, local137, Static647.anInt10548, new Class87((long) Static629.aLong287++, local1092, local1120, local1147), local55);
			}
		} else if (Static113.aClass226_11 == arg0) {
			local15 = local8.method7291();
			@Pc(1212) boolean local1212 = (local15 & 0x80) != 0;
			local28 = Static637.anInt7729 + (local15 >> 3 & 0x7);
			local32 = (local15 & 0x7) + Static257.anInt4648;
			local36 = local28 + local8.method7318();
			local40 = local8.method7318() + local32;
			local48 = local8.method7303();
			local55 = local8.method7333();
			local137 = local8.method7291() * 4;
			local141 = local8.method7291() * 4;
			local147 = local8.method7333();
			local151 = local8.method7333();
			local155 = local8.method7291();
			local172 = local8.method7333();
			if (local155 == 255) {
				local155 = -1;
			}
			if (local28 >= 0 && local32 >= 0 && Static271.anInt4910 > local28 && Static613.anInt9909 > local32 && local36 >= 0 && local40 >= 0 && local36 < Static271.anInt4910 && local40 < Static613.anInt9909 && local55 != 65535) {
				local172 <<= 0x2;
				local36 = local36 * 512 + 256;
				local137 <<= 0x2;
				local32 = local32 * 512 + 256;
				local141 <<= 0x2;
				local28 = local28 * 512 + 256;
				local40 = local40 * 512 + 256;
				@Pc(1396) Class4_Sub1_Sub1_Sub4 local1396 = new Class4_Sub1_Sub1_Sub4(local55, Static647.anInt10548, Static647.anInt10548, local28, local32, local137, local147 + Static565.anInt8921, Static565.anInt8921 + local151, local155, local172, 0, local48, local141, local1212, -1);
				local1396.method6890(local40, local36, Static461.method6500(local36, Static647.anInt10548, local40) - local141, local147 + Static565.anInt8921);
				Static419.aClass20_35.method370(new Class5_Sub1_Sub3(local1396));
			}
		} else if (arg0 == Static25.aClass226_1) {
			local15 = local8.method7291();
			local24 = Static637.anInt7729 + (local15 >> 4 & 0x7);
			local28 = (local15 & 0x7) + Static257.anInt4648;
			local32 = local8.method7333();
			local36 = local8.method7291();
			local40 = local8.method7333();
			local48 = local8.method7291();
			if (local24 >= 0 && local28 >= 0 && Static271.anInt4910 > local24 && Static613.anInt9909 > local28) {
				local55 = local24 * 512 + 256;
				local137 = local28 * 512 + 256;
				local141 = Static647.anInt10548;
				if (local141 < 3 && Static389.method1741(local28, local24)) {
					local141++;
				}
				@Pc(1544) Class4_Sub1_Sub1_Sub5 local1544 = new Class4_Sub1_Sub1_Sub5(local32, local40, Static565.anInt8921, Static647.anInt10548, local141, local55, Static461.method6500(local55, Static647.anInt10548, local137) - local36, local137, local24, local24, local28, local28, local48);
				Static146.aClass20_10.method370(new Class5_Sub1_Sub17(local1544));
			}
		} else if (Static473.aClass226_18 == arg0) {
			local15 = local8.method7291();
			local24 = (local15 & 0x7) + Static257.anInt4648;
			local28 = local24 + Static290.anInt5128;
			local32 = Static637.anInt7729 + (local15 >> 4 & 0x7);
			local36 = local32 + Static315.anInt5380;
			local40 = local8.method7333();
			local48 = local8.method7333();
			local55 = local8.method7333();
			if (Static248.aClass306_18 != null) {
				@Pc(1612) Class5_Sub53 local1612 = (Class5_Sub53) Static248.aClass306_18.method6943((long) (local36 | local28 << 14 | Static647.anInt10548 << 28));
				if (local1612 != null) {
					for (@Pc(1620) Class5_Sub2 local1620 = (Class5_Sub2) local1612.aClass20_72.method378(); local1620 != null; local1620 = (Class5_Sub2) local1612.aClass20_72.method366()) {
						if ((local40 & 0x7FFF) == local1620.anInt118 && local48 == local1620.anInt113) {
							local1620.method9222();
							local1620.anInt113 = local55;
							Static18.method272(local28, local1620, local36, Static647.anInt10548);
							break;
						}
					}
					if (local32 >= 0 && local24 >= 0 && Static271.anInt4910 > local32 && Static613.anInt9909 > local24) {
						Static549.method7494(local32, Static647.anInt10548, local24);
					}
				}
			}
		} else if (Static36.aClass226_2 == arg0) {
			local15 = local8.method7333();
			local24 = local8.method7290();
			local28 = Static257.anInt4648 + (local24 & 0x7);
			local32 = Static290.anInt5128 + local28;
			local36 = Static637.anInt7729 + (local24 >> 4 & 0x7);
			local40 = Static315.anInt5380 + local36;
			@Pc(1745) Class5_Sub53 local1745 = (Class5_Sub53) Static248.aClass306_18.method6943((long) (local32 << 14 | Static647.anInt10548 << 28 | local40));
			if (local1745 != null) {
				for (@Pc(1753) Class5_Sub2 local1753 = (Class5_Sub2) local1745.aClass20_72.method378(); local1753 != null; local1753 = (Class5_Sub2) local1745.aClass20_72.method366()) {
					if ((local15 & 0x7FFF) == local1753.anInt118) {
						local1753.method9222();
						break;
					}
				}
				if (local1745.aClass20_72.method367()) {
					local1745.method9222();
				}
				if (local36 >= 0 && local28 >= 0 && local36 < Static271.anInt4910 && local28 < Static613.anInt9909) {
					Static549.method7494(local36, Static647.anInt10548, local28);
				}
			}
		} else if (arg0 == Static261.aClass226_12) {
			local15 = local8.method7333();
			local24 = local8.method7290();
			local28 = local24 >> 2;
			local32 = local24 & 0x3;
			local36 = Static248.anIntArray223[local28];
			local40 = local8.method7330();
			local48 = (local40 >> 4 & 0x7) + Static637.anInt7729;
			local55 = Static257.anInt4648 + (local40 & 0x7);
			if (Static199.method3308(Static139.anInt2749) || local48 >= 0 && local55 >= 0 && Static271.anInt4910 > local48 && Static613.anInt9909 > local55) {
				Static495.method300(local36, local55, local15, Static647.anInt10548, local48, local32, local28);
			}
		} else if (Static428.aClass226_17 == arg0) {
			local15 = local8.method7291();
			local24 = local15 >> 2;
			local28 = local15 & 0x3;
			local32 = Static248.anIntArray223[local24];
			local36 = local8.method7290();
			local40 = Static637.anInt7729 + (local36 >> 4 & 0x7);
			local48 = Static257.anInt4648 + (local36 & 0x7);
			if (Static199.method3308(Static139.anInt2749) || local40 >= 0 && local48 >= 0 && local40 < Static271.anInt4910 && Static613.anInt9909 > local48) {
				Static495.method300(local32, local48, -1, Static647.anInt10548, local40, local28, local24);
			}
		} else if (arg0 == Static415.aClass226_16) {
			local8.method7291();
			local15 = local8.method7291();
			local24 = Static637.anInt7729 + (local15 >> 4 & 0x7);
			local28 = Static257.anInt4648 + (local15 & 0x7);
			local32 = local8.method7333();
			local36 = local8.method7291();
			local40 = local8.method7331();
			@Pc(2032) String local2032 = local8.method7281();
			Static110.method8140(local32, Static647.anInt10548, local36, local24, local28, local2032, local40);
		} else if (Static368.aClass226_13 == arg0) {
			local15 = local8.method7333();
			local24 = local8.method7291();
			Static528.aClass243_3.method5556(local15).method8028(local24);
		} else {
			Static522.method7115((Throwable) null, "T3 - " + arg0);
			Static452.method6395(false);
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
	public static void method5188(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static325.aBooleanArray15[local3] = true;
		}
		if (arg0 < -37) {
			;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!rv;I)V")
	public static void method5189(@OriginalArg(0) Class5_Sub36_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static282.anInt5022; local3++) {
			@Pc(11) int local11 = Static486.anIntArray457[local3];
			@Pc(15) Class4_Sub1_Sub1_Sub2_Sub1 local15 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local11];
			@Pc(19) int local19 = arg0.method7291();
			if ((local19 & 0x4) != 0) {
				local19 += arg0.method7291() << 8;
			}
			if ((local19 & 0x8000) != 0) {
				local19 += arg0.method7291() << 16;
			}
			Static84.method1345(local19, arg0, local11, local15);
		}
		if (29838 != 29838) {
			anIntArray340 = null;
		}
	}
}
