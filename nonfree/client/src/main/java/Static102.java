import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString84 = "slide:";

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "[I")
	public static final int[] anIntArray210 = new int[5];

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "[I")
	public static final int[] anIntArray211 = new int[2500];

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "[I")
	public static final int[] anIntArray212 = new int[13];

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Ljava/lang/String;")
	public static final String aString85 = "glow3:";

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!e;II)V")
	public static void method2258(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static329.anInt6344 == 0 || Static59.anInt1436 == 0) {
			return;
		}
		arg0.method5178(Static175.anInt3620, Static339.anInt2493, Static329.anInt6344, Static59.anInt1436);
		arg0.method5172(Static165.anInt5094, Static21.anInt1363, Static329.anInt6344, Static59.anInt1436);
		@Pc(40) Class51 local40 = arg0.method5185();
		local40.method3552(Static192.anInt3937, Static254.anInt4871, Static82.anInt2015, Static30.anInt715, Static117.anInt5258, Static63.anInt1530);
		arg0.method5144(local40);
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(86) int local86;
		@Pc(95) int local95;
		@Pc(103) int local103;
		if (Static312.anInt6025 == 0 && Static18.aClass114Array1 != null) {
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			@Pc(65) int local65 = arg0.method5114();
			local74 = (arg1 - Static175.anInt3620) * local65 / Static329.anInt6344;
			local83 = local65 * (arg2 - Static339.anInt2493) / Static59.anInt1436;
			local86 = arg0.method5089();
			local95 = (arg1 - Static175.anInt3620) * local86 / Static329.anInt6344;
			local103 = local86 * (arg2 - Static339.anInt2493) / Static59.anInt1436;
			@Pc(118) int[] local118 = new int[] { local74, local83, local65 };
			local40.method3553(local118);
			@Pc(136) int[] local136 = new int[] { local95, local103, local86 };
			local40.method3553(local136);
			@Pc(141) float local141 = 0.0F;
			@Pc(150) int local150 = local136[0] - local118[0];
			@Pc(158) int local158 = local136[1] - local118[1];
			@Pc(166) int local166 = local136[2] - local118[2];
			while (local141 < 1.0F) {
				@Pc(179) int local179 = (int) ((float) local118[0] + (float) local150 * local141);
				@Pc(183) int local183 = local179 >> 7;
				@Pc(194) int local194 = (int) ((float) local166 * local141 + (float) local118[2]);
				@Pc(198) int local198 = local194 >> 7;
				if (local183 > 0 && local198 > 0 && Static195.anInt3965 > local183 && Static298.anInt5716 > local198) {
					@Pc(224) int local224 = Static219.anInt4400;
					if (local224 < 3 && (Static108.aByteArrayArrayArray5[1][local183][local198] & 0x2) != 0) {
						local224++;
					}
					if ((float) Static18.aClass114Array1[local224].method3607(local179, local194) < (float) local158 * local141 + (float) local118[1]) {
						local60 = local179 + Static173.aClass10_Sub3_Sub3_Sub2_1.method5353() * 64 - 64 >> 7;
						local62 = Static173.aClass10_Sub3_Sub3_Sub2_1.method5353() * 64 + local194 - 64 >> 7;
						break;
					}
				}
				local141 = (float) ((double) local141 + 0.01D);
			}
			if (local60 != -1 && local62 != -1) {
				if (Static184.aBoolean241 && (Static103.anInt2305 & 0x40) != 0) {
					@Pc(348) Class146 local348 = Static70.method1717(Static88.anInt2109, Static188.anInt3867);
					if (local348 == null) {
						Static164.method3270();
					} else {
						Static223.method5291(0L, Static324.aString230, local60, Static5.anInt4503, 42, local62, " ->");
					}
				} else {
					if (Static45.anInt1136 == 1) {
						Static223.method5291(0L, Static197.aString139, local60, -1, 21, local62, "");
					}
					Static223.method5291(0L, Static45.aString44, local60, -1, 34, local62, "");
				}
			}
		}
		@Pc(365) Class126 local365 = Static184.aClass126_4;
		for (@Pc(370) Class1_Sub8 local370 = (Class1_Sub8) local365.method3389(); local370 != null; local370 = (Class1_Sub8) local365.method3394()) {
			if (local370.method5566(arg1, arg2, arg0) && Static219.anInt4400 == local370.anInt6227) {
				@Pc(490) int local490;
				@Pc(502) int local502;
				if (local370.aClass10_1 instanceof Class10_Sub3_Sub3_Sub2) {
					@Pc(395) Class10_Sub3_Sub3_Sub2 local395 = (Class10_Sub3_Sub3_Sub2) local370.aClass10_1;
					local74 = local395.method5353();
					if ((local74 & 0x1) == 0 && (local395.anInt5910 & 0x7F) == 0 && (local395.anInt5908 & 0x7F) == 0 || (local74 & 0x1) == 1 && (local395.anInt5910 & 0x7F) == 64 && (local395.anInt5908 & 0x7F) == 64) {
						local83 = local395.anInt5910 - (local395.method5353() - 1) * 64;
						local86 = local395.anInt5908 + 64 - local395.method5353() * 64;
						for (local95 = 0; local95 < Static315.anInt6456; local95++) {
							@Pc(467) Class10_Sub3_Sub3_Sub1 local467 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local95]];
							if (local467 != null && local467.anInt5935 != Static153.anInt3257 && local467.aBoolean413) {
								local490 = local467.anInt5910 - (local467.aClass192_1.anInt5798 - 1) * 64;
								local502 = local467.anInt5908 + 64 - local467.aClass192_1.anInt5798 * 64;
								if (local83 <= local490 && local467.aClass192_1.anInt5798 <= local395.method5353() - (local490 - local83 >> 7) && local86 <= local502 && local467.aClass192_1.anInt5798 <= local395.method5353() - (local502 - local86 >> 7)) {
									Static153.method3019(local467);
									local467.anInt5935 = Static153.anInt3257;
								}
							}
						}
						for (local103 = 0; local103 < Static307.anInt2887; local103++) {
							@Pc(562) Class10_Sub3_Sub3_Sub2 local562 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local103]];
							if (local562 != null && Static153.anInt3257 != local562.anInt5935 && local562 != local395 && local562.aBoolean413) {
								local502 = local562.anInt5910 + 64 - local562.method5353() * 64;
								@Pc(604) int local604 = local562.anInt5908 + 64 - local562.method5353() * 64;
								if (local502 >= local83 && local562.method5353() <= local395.method5353() - (local502 - local83 >> 7) && local604 >= local86 && local562.method5353() <= local395.method5353() - (local604 - local86 >> 7)) {
									Static18.method432(local562);
									local562.anInt5935 = Static153.anInt3257;
								}
							}
						}
					}
					if (Static153.anInt3257 == local395.anInt5935) {
						continue;
					}
					Static18.method432(local395);
					local395.anInt5935 = Static153.anInt3257;
				}
				if (local370.aClass10_1 instanceof Class10_Sub3_Sub3_Sub1) {
					@Pc(685) Class10_Sub3_Sub3_Sub1 local685 = (Class10_Sub3_Sub3_Sub1) local370.aClass10_1;
					if (local685.aClass192_1 != null) {
						if ((local685.aClass192_1.anInt5798 & 0x1) == 0 && (local685.anInt5910 & 0x7F) == 0 && (local685.anInt5908 & 0x7F) == 0 || (local685.aClass192_1.anInt5798 & 0x1) == 1 && (local685.anInt5910 & 0x7F) == 64 && (local685.anInt5908 & 0x7F) == 64) {
							local74 = local685.anInt5910 + 64 - local685.aClass192_1.anInt5798 * 64;
							local83 = local685.anInt5908 - (local685.aClass192_1.anInt5798 - 1) * 64;
							for (local86 = 0; local86 < Static315.anInt6456; local86++) {
								@Pc(763) Class10_Sub3_Sub3_Sub1 local763 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local86]];
								if (local763 != null && Static153.anInt3257 != local763.anInt5935 && local685 != local763 && local763.aBoolean413) {
									local103 = local763.anInt5910 - (local763.aClass192_1.anInt5798 - 1) * 64;
									local490 = local763.anInt5908 + 64 - local763.aClass192_1.anInt5798 * 64;
									if (local103 >= local74 && local685.aClass192_1.anInt5798 - (local103 - local74 >> 7) >= local763.aClass192_1.anInt5798 && local83 <= local490 && local685.aClass192_1.anInt5798 - (local490 - local83 >> 7) >= local763.aClass192_1.anInt5798) {
										Static153.method3019(local763);
										local763.anInt5935 = Static153.anInt3257;
									}
								}
							}
							for (local95 = 0; local95 < Static307.anInt2887; local95++) {
								@Pc(870) Class10_Sub3_Sub3_Sub2 local870 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local95]];
								if (local870 != null && local870.anInt5935 != Static153.anInt3257 && local870.aBoolean413) {
									local490 = local870.anInt5910 + 64 - local870.method5353() * 64;
									local502 = local870.anInt5908 + 64 - local870.method5353() * 64;
									if (local74 <= local490 && local870.method5353() <= local685.aClass192_1.anInt5798 - (local490 - local74 >> 7) && local83 <= local502 && local870.method5353() <= local685.aClass192_1.anInt5798 - (local502 - local83 >> 7)) {
										Static18.method432(local870);
										local870.anInt5935 = Static153.anInt3257;
									}
								}
							}
						}
						if (Static153.anInt3257 == local685.anInt5935) {
							continue;
						}
						Static153.method3019(local685);
						local685.anInt5935 = Static153.anInt3257;
					}
				}
				if (local370.aClass10_1 instanceof Class10_Sub1_Sub1) {
					@Pc(1005) Class14_Sub39 local1005 = (Class14_Sub39) Static65.aClass25_32.method691((long) (local370.anInt6227 << 28 | local370.anInt6231 << 14 | local370.anInt6233));
					if (local1005 != null) {
						for (@Pc(1013) Class14_Sub42 local1013 = (Class14_Sub42) local1005.aClass18_45.method463(); local1013 != null; local1013 = (Class14_Sub42) local1005.aClass18_45.method460()) {
							@Pc(1020) Class220 local1020 = Static296.method5066(local1013.anInt6628);
							if (Static312.anInt6025 == 1) {
								Static223.method5291((long) local1013.anInt6628, Static2.aString1, local370.anInt6233, Static37.anInt891, 26, local370.anInt6231, Static328.aString237 + " -> <col=ff9040>" + local1020.aString251);
							} else if (Static184.aBoolean241) {
								@Pc(1152) Class14_Sub2_Sub6 local1152 = Static295.anInt5666 == -1 ? null : Static239.method5611(Static295.anInt5666);
								if ((Static103.anInt2305 & 0x1) != 0 && (local1152 == null || local1020.method5962(local1152.anInt2022, Static295.anInt5666) != local1152.anInt2022)) {
									Static223.method5291((long) local1013.anInt6628, Static324.aString230, local370.anInt6233, Static5.anInt4503, 5, local370.anInt6231, Static78.aString73 + " -> <col=ff9040>" + local1020.aString251);
								}
							} else {
								@Pc(1028) String[] local1028 = local1020.aStringArray78;
								for (local95 = 4; local95 >= 0; local95--) {
									if (local1028 != null && local1028[local95] != null) {
										@Pc(1040) byte local1040 = 0;
										if (local95 == 0) {
											local1040 = 47;
										}
										local490 = Static60.anInt1450;
										if (local95 == 1) {
											local1040 = 3;
										}
										if (local95 == 2) {
											local1040 = 6;
										}
										if (local95 == 3) {
											local1040 = 57;
										}
										if (local95 == 4) {
											local1040 = 30;
										}
										if (local95 == local1020.anInt6655) {
											local490 = local1020.anInt6654;
										}
										if (local95 == local1020.anInt6700) {
											local490 = local1020.anInt6682;
										}
										Static223.method5291((long) local1013.anInt6628, local1028[local95], local370.anInt6233, local490, local1040, local370.anInt6231, "<col=ff9040>" + local1020.aString251);
									}
								}
								Static223.method5291((long) local1013.anInt6628, Static144.aString111, local370.anInt6233, Static29.anInt4705, 1012, local370.anInt6231, "<col=ff9040>" + local1020.aString251);
							}
						}
					}
				}
				if (local370.aClass10_1 instanceof Interface7) {
					@Pc(1250) Interface7 local1250 = (Interface7) local370.aClass10_1;
					@Pc(1258) Class59 local1258 = Static232.method2200(local1250.method4070());
					if (local1258.anIntArray176 != null) {
						local1258 = local1258.method1977();
					}
					if (local1258 != null) {
						if (Static312.anInt6025 == 1) {
							Static223.method5291(Static184.method3543(local370.anInt6233, local1250, local370.anInt6231), Static2.aString1, local370.anInt6233, Static37.anInt891, 33, local370.anInt6231, Static328.aString237 + " -> <col=00ffff>" + local1258.aString75);
						} else if (Static184.aBoolean241) {
							@Pc(1282) Class14_Sub2_Sub6 local1282 = Static295.anInt5666 == -1 ? null : Static239.method5611(Static295.anInt5666);
							if ((Static103.anInt2305 & 0x4) != 0 && (local1282 == null || local1258.method1968(local1282.anInt2022, Static295.anInt5666) != local1282.anInt2022)) {
								Static223.method5291(Static184.method3543(local370.anInt6233, local1250, local370.anInt6231), Static324.aString230, local370.anInt6233, Static5.anInt4503, 9, local370.anInt6231, Static78.aString73 + " -> <col=00ffff>" + local1258.aString75);
							}
						} else {
							@Pc(1336) String[] local1336 = local1258.aStringArray30;
							if (local1336 != null) {
								for (local86 = 4; local86 >= 0; local86--) {
									if (local1336[local86] != null) {
										@Pc(1348) short local1348 = 0;
										if (local86 == 0) {
											local1348 = 41;
										}
										local103 = Static60.anInt1450;
										if (local86 == 1) {
											local1348 = 50;
										}
										if (local86 == 2) {
											local1348 = 19;
										}
										if (local86 == 3) {
											local1348 = 49;
										}
										if (local86 == 4) {
											local1348 = 1008;
										}
										if (local1258.anInt1945 == local86) {
											local103 = local1258.anInt1927;
										}
										if (local1258.anInt1946 == local86) {
											local103 = local1258.anInt1925;
										}
										Static223.method5291(Static184.method3543(local370.anInt6233, local1250, local370.anInt6231), local1336[local86], local370.anInt6233, local103, local1348, local370.anInt6231, "<col=00ffff>" + local1258.aString75);
									}
								}
							}
							Static223.method5291((long) local1258.anInt1951, Static144.aString111, local370.anInt6233, Static29.anInt4705, 1001, local370.anInt6231, "<col=00ffff>" + local1258.aString75);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIILclient!e;ILclient!id;IZII)Lclient!id;")
	public static Class45 method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class45 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class45 local12 = (Class45) Static256.aClass11_110.method209(local6);
		if (local12 == null) {
			@Pc(22) Class71 local22 = Static222.method3992(arg5, Static338.aClass143_114);
			if (local22 == null) {
				return null;
			}
			local12 = arg4.method5148(local22, 1031, Static80.anInt1922, 64, 768);
			Static256.aClass11_110.method219(local6, local12);
		}
		local12 = local12.method1793((byte) 2, 1031, true);
		if (arg8 != 0) {
			local12.method1797(arg8);
		}
		if (arg9 != 0) {
			local12.method1818(arg9);
		}
		if (arg1 != 0) {
			local12.method1784(arg1);
		}
		if (arg3 != 0) {
			local12.method1788(0, arg3, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public static void method2261() {
		if (Static267.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static205.anInt4113;
		@Pc(10) int local10 = Static249.anInt4822;
		@Pc(22) int local22 = Static2.anInt104 - local8 - Static294.anInt5659;
		@Pc(29) int local29 = Static218.anInt4396 - Static46.anInt1173 - local10;
		if (local8 <= 0 && local22 <= 0 && local10 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static277.aFrame2 == null) {
				local47 = Static105.aClass15_2.anApplet1;
			} else {
				local47 = Static277.aFrame2;
			}
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			if (Static277.aFrame2 == local47) {
				@Pc(62) Insets local62 = Static277.aFrame2.getInsets();
				local56 = local62.top;
				local54 = local62.left;
			}
			@Pc(71) Graphics local71 = local47.getGraphics();
			local71.setColor(Color.black);
			if (local8 > 0) {
				local71.fillRect(local54, local56, local8, Static218.anInt4396);
			}
			if (local10 > 0) {
				local71.fillRect(local54, local56, Static2.anInt104, local10);
			}
			if (local22 > 0) {
				local71.fillRect(local54 + Static2.anInt104 - local22, local56, local22, Static218.anInt4396);
			}
			if (local29 > 0) {
				local71.fillRect(local54, Static218.anInt4396 + local56 - local29, Static2.anInt104, local29);
				return;
			}
		} catch (@Pc(120) Exception local120) {
			return;
		}
	}
}
