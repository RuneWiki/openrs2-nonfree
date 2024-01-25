import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_5 = new Class387(90, 1);

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "J")
	public static long aLong6 = -1L;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLclient!vha;)V")
	public static void method239(@OriginalArg(1) Class370 arg0) {
		@Pc(21) int local21;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(47) int local47;
		if (Static581.aClass370_18 == arg0) {
			Static515.aClass5_Sub23_Sub2_1.method8529();
			local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
			local29 = Static309.anInt5494 + (local21 >> 4 & 0x7);
			local35 = Static345.anInt6091 + (local21 & 0x7);
			local39 = Static515.aClass5_Sub23_Sub2_1.method8519();
			local43 = Static515.aClass5_Sub23_Sub2_1.method8529();
			local47 = Static515.aClass5_Sub23_Sub2_1.method8510();
			@Pc(51) String local51 = Static515.aClass5_Sub23_Sub2_1.method8497();
			Static529.method7634(local43, local39, local29, local51, local35, local47, Static68.anInt1099);
		} else if (Static476.aClass370_13 == arg0) {
			local21 = Static515.aClass5_Sub23_Sub2_1.method8519();
			local29 = Static515.aClass5_Sub23_Sub2_1.method8529();
			Static536.aClass392_2.method9293(0, local21).method861(local29);
		} else {
			@Pc(137) int local137;
			@Pc(147) int local147;
			@Pc(153) int local153;
			@Pc(157) int local157;
			@Pc(161) int local161;
			@Pc(169) int local169;
			@Pc(141) int local141;
			@Pc(165) int local165;
			if (arg0 == Static202.aClass370_5) {
				local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
				@Pc(105) boolean local105 = (local21 & 0x80) != 0;
				local35 = Static309.anInt5494 + (local21 >> 3 & 0x7);
				local39 = Static345.anInt6091 + (local21 & 0x7);
				local43 = local35 + Static515.aClass5_Sub23_Sub2_1.method8488();
				local47 = local39 + Static515.aClass5_Sub23_Sub2_1.method8488();
				local137 = Static515.aClass5_Sub23_Sub2_1.method8516();
				local141 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local147 = Static515.aClass5_Sub23_Sub2_1.method8529() * 4;
				local153 = Static515.aClass5_Sub23_Sub2_1.method8529() * 4;
				local157 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local161 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local165 = Static515.aClass5_Sub23_Sub2_1.method8529();
				local169 = Static515.aClass5_Sub23_Sub2_1.method8519();
				if (local165 == 255) {
					local165 = -1;
				}
				if (local35 >= 0 && local39 >= 0 && local35 < Static544.anInt9261 && local39 < Static282.anInt4887 && local43 >= 0 && local47 >= 0 && Static544.anInt9261 > local43 && Static282.anInt4887 > local47 && local141 != 65535) {
					local43 = local43 * 512 + 256;
					local39 = local39 * 512 + 256;
					local147 <<= 0x2;
					local35 = local35 * 512 + 256;
					local47 = local47 * 512 + 256;
					local169 <<= 0x2;
					local153 <<= 0x2;
					@Pc(298) Class8_Sub1_Sub3_Sub1 local298 = new Class8_Sub1_Sub3_Sub1(local141, Static68.anInt1099, Static68.anInt1099, local35, local39, local147, Static44.anInt740 + local157, local161 + Static44.anInt740, local165, local169, 0, local137, local153, local105, -1);
					local298.method1523(Static380.method5559(local43, Static68.anInt1099, local47, 0) - local153, local157 - -Static44.anInt740, local43, local47);
					Static366.aClass102_43.method1921(new Class5_Sub5_Sub13(local298));
				}
			} else if (arg0 == Static622.aClass370_20) {
				local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
				local29 = Static309.anInt5494 + (local21 >> 4 & 0x7);
				local35 = (local21 & 0x7) + Static345.anInt6091;
				local39 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local43 = Static515.aClass5_Sub23_Sub2_1.method8529();
				local47 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local137 = Static515.aClass5_Sub23_Sub2_1.method8529();
				if (local29 >= 0 && local35 >= 0 && Static544.anInt9261 > local29 && local35 < Static282.anInt4887) {
					local141 = local29 * 512 + 256;
					local147 = local35 * 512 + 256;
					local153 = Static68.anInt1099;
					if (local153 < 3 && Static90.method1353(1, local35, local29)) {
						local153++;
					}
					@Pc(437) Class8_Sub1_Sub3_Sub5 local437 = new Class8_Sub1_Sub3_Sub5(local39, local47, Static44.anInt740, Static68.anInt1099, local153, local141, Static380.method5559(local141, Static68.anInt1099, local147, 0) - local43, local147, local29, local29, local35, local35, local137);
					Static480.aClass102_51.method1921(new Class5_Sub5_Sub9(local437));
				}
			} else if (arg0 == Static536.aClass370_14) {
				local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
				local29 = Static345.anInt6091 + (local21 & 0x7);
				local35 = local29 + Static668.anInt10683;
				local39 = (local21 >> 4 & 0x7) + Static309.anInt5494;
				local43 = Static622.anInt10188 + local39;
				local47 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local137 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local141 = Static515.aClass5_Sub23_Sub2_1.method8519();
				if (Static466.aClass291_33 != null) {
					@Pc(504) Class5_Sub25 local504 = (Class5_Sub25) Static466.aClass291_33.method6993((long) (local43 | Static68.anInt1099 << 28 | local35 << 14), 1);
					if (local504 != null) {
						for (@Pc(512) Class5_Sub15 local512 = (Class5_Sub15) local504.aClass102_34.method1916(); local512 != null; local512 = (Class5_Sub15) local504.aClass102_34.method1915()) {
							if (local512.anInt2420 == (local47 & 0x7FFF) && local512.anInt2422 == local137) {
								local512.method9327(1);
								local512.anInt2422 = local141;
								Static220.method3149(Static68.anInt1099, local35, local512, local43);
								break;
							}
						}
						if (local39 >= 0 && local29 >= 0 && local39 < Static544.anInt9261 && Static282.anInt4887 > local29) {
							Static619.method3009(local29, local39, Static68.anInt1099);
						}
					}
				}
			} else {
				@Pc(704) int local704;
				@Pc(708) int local708;
				if (arg0 == Static319.aClass370_10) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local29 = Static309.anInt5494 * 2 + (local21 >> 4 & 0xF);
					local35 = (local21 & 0xF) + Static345.anInt6091 * 2;
					local39 = Static515.aClass5_Sub23_Sub2_1.method8529();
					@Pc(637) boolean local637 = (local39 & 0x1) != 0;
					@Pc(646) boolean local646 = (local39 & 0x2) != 0;
					local137 = local646 ? local39 >> 2 : -1;
					local141 = local29 + Static515.aClass5_Sub23_Sub2_1.method8488();
					local147 = Static515.aClass5_Sub23_Sub2_1.method8488() + local35;
					local153 = Static515.aClass5_Sub23_Sub2_1.method8516();
					local157 = Static515.aClass5_Sub23_Sub2_1.method8516();
					local161 = Static515.aClass5_Sub23_Sub2_1.method8519();
					local165 = Static515.aClass5_Sub23_Sub2_1.method8529();
					if (local646) {
						local165 = (byte) local165;
					} else {
						local165 *= 4;
					}
					local169 = Static515.aClass5_Sub23_Sub2_1.method8529() * 4;
					local704 = Static515.aClass5_Sub23_Sub2_1.method8519();
					local708 = Static515.aClass5_Sub23_Sub2_1.method8519();
					@Pc(712) int local712 = Static515.aClass5_Sub23_Sub2_1.method8529();
					@Pc(716) int local716 = Static515.aClass5_Sub23_Sub2_1.method8519();
					if (local712 == 255) {
						local712 = -1;
					}
					if (local29 >= 0 && local35 >= 0 && Static544.anInt9261 * 2 > local29 && Static544.anInt9261 * 2 > local35 && local141 >= 0 && local147 >= 0 && Static282.anInt4887 * 2 > local141 && Static282.anInt4887 * 2 > local147 && local161 != 65535) {
						local169 <<= 0x2;
						local35 = local35 * 256;
						local147 *= 256;
						local141 *= 256;
						local29 *= 256;
						local716 <<= 0x2;
						local165 <<= 0x2;
						if (local153 != 0 && local137 != -1) {
							@Pc(828) Class8_Sub1_Sub3_Sub2 local828 = null;
							@Pc(838) int local838;
							if (local153 < 0) {
								local838 = -local153 - 1;
								if (Static279.anInt4838 == local838) {
									local828 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1;
								} else {
									local828 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local838];
								}
							} else {
								local838 = local153 - 1;
								@Pc(860) Class5_Sub35 local860 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local838, 1);
								if (local860 != null) {
									local828 = local860.aClass8_Sub1_Sub3_Sub2_Sub2_2;
								}
							}
							if (local828 != null) {
								@Pc(871) Class101 local871 = local828.method5991(103);
								if (local871.anIntArrayArray15 != null && local871.anIntArrayArray15[local137] != null) {
									local165 -= local871.anIntArrayArray15[local137][1];
								}
								if (local871.anIntArrayArray16 != null && local871.anIntArrayArray16[local137] != null) {
									local165 -= local871.anIntArrayArray16[local137][1];
								}
							}
						}
						@Pc(933) Class8_Sub1_Sub3_Sub1 local933 = new Class8_Sub1_Sub3_Sub1(local161, Static68.anInt1099, Static68.anInt1099, local29, local35, local165, Static44.anInt740 + local704, local708 - -Static44.anInt740, local712, local716, local153, local157, local169, local637, local137);
						local933.method1523(Static380.method5559(local141, Static68.anInt1099, local147, 0) - local169, Static44.anInt740 + local704, local141, local147);
						Static366.aClass102_43.method1921(new Class5_Sub5_Sub13(local933));
					}
				} else if (Static641.aClass370_21 == arg0) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local29 = Static309.anInt5494 + (local21 >> 4 & 0x7);
					local35 = Static345.anInt6091 + (local21 & 0x7);
					local39 = Static515.aClass5_Sub23_Sub2_1.method8506();
					if (local39 == 65535) {
						local39 = -1;
					}
					local43 = Static515.aClass5_Sub23_Sub2_1.method8500();
					local47 = local43 >> 2;
					local137 = local43 & 0x3;
					local141 = Static680.anIntArray624[local47];
					Static459.method6734(local141, local137, Static68.anInt1099, local47, local29, local35, local39);
				} else if (arg0 == Static42.aClass370_4) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8500();
					local29 = local21 >> 2;
					local35 = local21 & 0x3;
					local39 = Static680.anIntArray624[local29];
					local43 = Static515.aClass5_Sub23_Sub2_1.method8483();
					local47 = Static309.anInt5494 + (local43 >> 4 & 0x7);
					local137 = (local43 & 0x7) + Static345.anInt6091;
					if (Static612.method8696(Static452.anInt7483) || local47 >= 0 && local137 >= 0 && local47 < Static544.anInt9261 && local137 < Static282.anInt4887) {
						Static345.method5215(local35, local47, local29, local39, Static68.anInt1099, local137, -1);
					}
				} else if (Static277.aClass370_8 == arg0) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8483();
					local29 = (local21 >> 4 & 0x7) + Static309.anInt5494;
					local35 = Static345.anInt6091 + (local21 & 0x7);
					local39 = Static515.aClass5_Sub23_Sub2_1.method8519();
					local43 = Static515.aClass5_Sub23_Sub2_1.method8505();
					local47 = local43 >> 2;
					local137 = local43 & 0x3;
					local141 = Static680.anIntArray624[local47];
					if (Static612.method8696(Static452.anInt7483) || local29 >= 0 && local35 >= 0 && Static544.anInt9261 > local29 && Static282.anInt4887 > local35) {
						Static345.method5215(local137, local29, local47, local141, Static68.anInt1099, local35, local39);
					}
				} else if (arg0 == Static549.aClass370_16) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8519();
					local29 = Static515.aClass5_Sub23_Sub2_1.method8506();
					local35 = Static515.aClass5_Sub23_Sub2_1.method8500();
					local39 = Static345.anInt6091 + (local35 & 0x7);
					local43 = Static668.anInt10683 + local39;
					local47 = (local35 >> 4 & 0x7) + Static309.anInt5494;
					local137 = local47 + Static622.anInt10188;
					local141 = Static515.aClass5_Sub23_Sub2_1.method8518();
					if (local141 != Static279.anInt4838) {
						@Pc(1256) boolean local1256 = local47 >= 0 && local39 >= 0 && local47 < Static544.anInt9261 && Static282.anInt4887 > local39;
						if (local1256 || Static612.method8696(Static452.anInt7483)) {
							Static220.method3149(Static68.anInt1099, local43, new Class5_Sub15(local29, local21), local137);
							if (local1256) {
								Static619.method3009(local39, local47, Static68.anInt1099);
							}
						}
					}
				} else if (Static539.aClass370_15 == arg0) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local29 = (local21 >> 4 & 0x7) + Static309.anInt5494;
					local35 = Static345.anInt6091 + (local21 & 0x7);
					local39 = Static515.aClass5_Sub23_Sub2_1.method8519();
					if (local39 == 65535) {
						local39 = -1;
					}
					local43 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local47 = local43 >> 4 & 0xF;
					local137 = local43 & 0x7;
					local141 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local147 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local153 = Static515.aClass5_Sub23_Sub2_1.method8519();
					if (local29 >= 0 && local35 >= 0 && Static544.anInt9261 > local29 && Static282.anInt4887 > local35) {
						local157 = local47 + 1;
						if (local29 - local157 <= Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] <= local29 + local157 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0] >= local35 - local157 && local35 + local157 >= Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0]) {
							Static493.method7098(local153, local39, local47 + (local29 << 16) + (Static68.anInt1099 << 24) + (local35 << 8), local137, local141, local147);
						}
					}
				} else if (Static595.aClass370_19 == arg0) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8506();
					local29 = Static515.aClass5_Sub23_Sub2_1.method8483();
					local35 = Static345.anInt6091 + (local29 & 0x7);
					local39 = local35 + Static668.anInt10683;
					local43 = (local29 >> 4 & 0x7) + Static309.anInt5494;
					local47 = Static622.anInt10188 + local43;
					@Pc(1493) Class5_Sub25 local1493 = (Class5_Sub25) Static466.aClass291_33.method6993((long) (Static68.anInt1099 << 28 | local39 << 14 | local47), 1);
					if (local1493 != null) {
						for (@Pc(1501) Class5_Sub15 local1501 = (Class5_Sub15) local1493.aClass102_34.method1916(); local1501 != null; local1501 = (Class5_Sub15) local1493.aClass102_34.method1915()) {
							if (local1501.anInt2420 == (local21 & 0x7FFF)) {
								local1501.method9327(1);
								break;
							}
						}
						if (local1493.aClass102_34.method1926()) {
							local1493.method9327(1);
						}
						if (local43 >= 0 && local35 >= 0 && local43 < Static544.anInt9261 && Static282.anInt4887 > local35) {
							Static619.method3009(local35, local43, Static68.anInt1099);
						}
					}
				} else if (arg0 == Static452.aClass370_12) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local29 = (local21 >> 4 & 0x7) + Static309.anInt5494;
					local35 = (local21 & 0x7) + Static345.anInt6091;
					local39 = Static515.aClass5_Sub23_Sub2_1.method8519();
					if (local39 == 65535) {
						local39 = -1;
					}
					local43 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local47 = local43 >> 4 & 0xF;
					local137 = local43 & 0x7;
					local141 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local147 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local153 = Static515.aClass5_Sub23_Sub2_1.method8519();
					if (local29 >= 0 && local35 >= 0 && Static544.anInt9261 > local29 && Static282.anInt4887 > local35) {
						local157 = local47 + 1;
						if (local29 - local157 <= Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] && local29 + local157 >= Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] && local35 - local157 <= Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0] && local35 + local157 >= Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0]) {
							Static474.method6913(local47 + (Static68.anInt1099 << 24) + (local29 << 16) + (local35 << 8), local147, local141, local153, local39, local137);
						}
					}
				} else if (Static290.aClass370_9 == arg0) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8529();
					local29 = Static309.anInt5494 + (local21 >> 4 & 0x7);
					local35 = (local21 & 0x7) + Static345.anInt6091;
					local39 = Static515.aClass5_Sub23_Sub2_1.method8483();
					local43 = local39 >> 2;
					local47 = Static680.anIntArray624[local43];
					local137 = Static515.aClass5_Sub23_Sub2_1.method8515();
					@Pc(1784) Class55 local1784 = Static536.aClass392_2.method9293(0, local137);
					local147 = Static515.aClass5_Sub23_Sub2_1.method8529();
					if (local43 == 11) {
						local43 = 10;
					}
					local153 = 0;
					if (local1784.aByteArray4 != null) {
						local157 = -1;
						for (local161 = 0; local161 < local1784.aByteArray4.length; local161++) {
							if (local43 == local1784.aByteArray4[local161]) {
								local157 = local161;
								break;
							}
						}
						local153 = local1784.anIntArrayArray5[local157].length;
					}
					local157 = 0;
					if (local1784.aShortArray9 != null) {
						local157 = local1784.aShortArray9.length;
					}
					local161 = 0;
					if (local1784.aShortArray8 != null) {
						local161 = local1784.aShortArray8.length;
					}
					if ((local147 & 0x1) == 1) {
						Static207.method2970(local47, local29, local35, Static68.anInt1099, (Class309) null);
					} else {
						@Pc(1869) int[] local1869 = null;
						if ((local147 & 0x2) == 2) {
							local1869 = new int[local153];
							for (local169 = 0; local169 < local153; local169++) {
								local1869[local169] = Static515.aClass5_Sub23_Sub2_1.method8519();
							}
						}
						@Pc(1899) short[] local1899 = null;
						if ((local147 & 0x4) == 4) {
							local1899 = new short[local157];
							for (local704 = 0; local704 < local157; local704++) {
								local1899[local704] = (short) Static515.aClass5_Sub23_Sub2_1.method8519();
							}
						}
						@Pc(1928) short[] local1928 = null;
						if ((local147 & 0x8) == 8) {
							local1928 = new short[local161];
							for (local708 = 0; local708 < local161; local708++) {
								local1928[local708] = (short) Static515.aClass5_Sub23_Sub2_1.method8519();
							}
						}
						Static207.method2970(local47, local29, local35, Static68.anInt1099, new Class309((long) Static281.aLong154++, local1869, local1899, local1928));
					}
				} else if (Static483.aClass370_17 == arg0) {
					local21 = Static515.aClass5_Sub23_Sub2_1.method8519();
					local29 = Static515.aClass5_Sub23_Sub2_1.method8519();
					local35 = Static515.aClass5_Sub23_Sub2_1.method8505();
					local39 = Static345.anInt6091 + (local35 & 0x7);
					local43 = Static668.anInt10683 + local39;
					local47 = Static309.anInt5494 + (local35 >> 4 & 0x7);
					local137 = local47 + Static622.anInt10188;
					@Pc(2050) boolean local2050 = local47 >= 0 && local39 >= 0 && Static544.anInt9261 > local47 && local39 < Static282.anInt4887;
					if (local2050 || Static612.method8696(Static452.anInt7483)) {
						Static220.method3149(Static68.anInt1099, local43, new Class5_Sub15(local29, local21), local137);
						if (local2050) {
							Static619.method3009(local39, local47, Static68.anInt1099);
						}
					}
				} else {
					Static405.method5934("T3 - " + arg0, (Throwable) null);
					Static600.method8644(false);
				}
			}
		}
	}
}
