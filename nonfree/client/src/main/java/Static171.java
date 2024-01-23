import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "[I")
	public static int[] anIntArray653;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "Lclient!qe;")
	public static Class78 aClass78_686 = Static199.method3560("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!r", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_687 = Static199.method3560("(Y<)4col>");

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "Lclient!wc;")
	public static Class110 aClass110_17 = new Class110(64);

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "Lclient!nf;")
	public static Class2_Sub3_Sub20 aClass2_Sub3_Sub20_1 = new Class2_Sub3_Sub20();

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "Lclient!wc;")
	public static Class110 aClass110_18 = new Class110(128);

	@OriginalMember(owner = "client!r", name = "db", descriptor = "Lclient!qe;")
	public static Class78 aClass78_688 = null;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "[I")
	public static int[] anIntArray652 = new int[2000];

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(I)V")
	public static void method3139() {
		@Pc(3) int local3 = Static100.anInt2201;
		@Pc(9) int local9 = Static224.anInt4847;
		@Pc(11) int local11 = Static189.anInt4406;
		@Pc(18) int local18 = Static207.anInt4608;
		Static217.method3761(local3, local11, local9, local18, 6116423);
		Static217.method3761(local3 + 1, local11 + 1, local9 - 2, 16, 0);
		Static217.method3751(local3 + 1, local11 + 18, local9 - 2, local18 + -19, 0);
		Static75.aClass2_Sub3_Sub7_1.method904(Static80.aClass78_386, local3 + 3, local11 + 14, 6116423, -1);
		@Pc(65) int local65 = Static44.anInt806;
		@Pc(67) int local67 = Static81.anInt1744;
		for (@Pc(69) int local69 = 0; local69 < Static138.anInt3182; local69++) {
			@Pc(84) int local84 = local11 + (-local69 + -1 + Static138.anInt3182) * 15 + 31;
			@Pc(86) int local86 = 16777215;
			if (local3 < local65 && local9 + local3 > local65 && local67 > local84 - 13 && local84 + 3 > local67) {
				local86 = 16776960;
			}
			Static75.aClass2_Sub3_Sub7_1.method904(Static18.method263(local69), local3 + 3, local84, local86, 0);
		}
		Static158.method2847(Static207.anInt4608, Static189.anInt4406, Static224.anInt4847, Static100.anInt2201);
	}

	@OriginalMember(owner = "client!r", name = "j", descriptor = "(I)V")
	public static void method3140() {
		if (Static11.aClass76_1 != null) {
			@Pc(3) Class76 local3 = Static11.aClass76_1;
			synchronized (Static11.aClass76_1) {
				Static11.aClass76_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) int local6 = arg5 - arg4;
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(18) int local18 = (arg3 - arg0 << 16) / local6;
		if (arg5 < Static151.anInt3457) {
			local6++;
		}
		@Pc(35) int local35 = (arg7 - arg6 << 16) / local10;
		if (Static30.anInt547 > arg1) {
			local10++;
		}
		@Pc(51) int local51;
		@Pc(61) int local61;
		@Pc(72) int local72;
		@Pc(84) byte[][] local84;
		@Pc(106) int local106;
		@Pc(122) int local122;
		@Pc(116) int local116;
		for (@Pc(41) int local41 = 0; local41 < local6; local41++) {
			local51 = local18 * (local41 + 1) >> 16;
			@Pc(57) int local57 = local41 * local18 >> 16;
			local61 = local51 - local57;
			if (local61 > 0) {
				local72 = arg4 + local41 >> 6;
				local51 += arg0;
				local57 += arg0;
				local84 = Static164.aByteArrayArrayArray12[local72];
				@Pc(88) int[][] local88 = Static159.anIntArrayArrayArray12[local72];
				@Pc(92) byte[][] local92 = Static142.aByteArrayArrayArray11[local72];
				@Pc(96) byte[][] local96 = Static38.aByteArrayArrayArray3[local72];
				@Pc(100) byte[][] local100 = Static78.aByteArrayArrayArray6[local72];
				@Pc(104) byte[][] local104 = Static188.aByteArrayArrayArray14[local72];
				for (local106 = 0; local106 < local10; local106++) {
					local116 = local35 * (local106 + 1) >> 16;
					local122 = local106 * local35 >> 16;
					@Pc(127) int local127 = local116 - local122;
					if (local127 > 0) {
						local116 += arg6;
						local122 += arg6;
						@Pc(143) int local143 = arg2 + local106 & 0x3F;
						@Pc(149) int local149 = arg4 + local41 & 0x3F;
						@Pc(155) int local155 = (local143 << 6) + local149;
						@Pc(161) int local161 = arg2 + local106 >> 6;
						@Pc(171) int local171;
						@Pc(186) int local186;
						@Pc(180) int local180;
						if (local88[local161] == null) {
							local180 = local106 + arg2 & 0x4;
							local186 = arg4 + local41 & 0x4;
							if ((local186 >= 2 || local180 <= 2) && (local186 <= 2 || local180 >= 2)) {
								local171 = Static110.anIntArray420[Static182.anInt4235 + 1];
							} else {
								local171 = 4936552;
							}
						} else {
							local171 = local88[local161][local155];
						}
						local186 = local84[local161] == null ? 0 : Static110.anIntArray420[local84[local161][local155] & 0xFF];
						if (local171 == 0) {
							local171 = 1;
						}
						local180 = local96[local161] == null ? 0 : Static110.anIntArray420[local96[local161][local155] & 0xFF];
						@Pc(287) int local287;
						if (local186 == 0 && local180 == 0) {
							Static217.method3761(local57, local122, local61, local127, local171);
						} else {
							@Pc(283) byte local283;
							if (local186 != 0) {
								if (local186 == -1) {
									local186 = 1;
								}
								local283 = local92[local161] == null ? 0 : local92[local161][local155];
								local287 = local283 & 0xFC;
								if (local287 == 0 || local61 <= 1 || local127 <= 1) {
									Static217.method3761(local57, local122, local61, local127, local186);
								} else {
									Static52.method675(local127, local122, local186, local171, Static217.anIntArray752, local287 >> 2, true, local283 & 0x3, local57, local61);
								}
							}
							if (local180 != 0) {
								if (local180 == -1) {
									local180 = local171;
								}
								local283 = local100[local161][local155];
								local287 = local283 & 0xFC;
								if (local287 == 0 || local61 <= 1 || local127 <= 1) {
									Static217.method3761(local57, local122, local61, local127, local180);
								}
								Static52.method675(local127, local122, local180, 0, Static217.anIntArray752, local287 >> 2, local186 == 0, local283 & 0x3, local57, local61);
							}
						}
						if (local104[local161] != null) {
							@Pc(395) int local395 = local104[local161][local155] & 0xFF;
							if (local395 != 0) {
								@Pc(402) int local402;
								if (local127 == 1) {
									local402 = local122;
								} else {
									local402 = local116 - 1;
								}
								if (local61 == 1) {
									local287 = local57;
								} else {
									local287 = local51 - 1;
								}
								@Pc(423) int local423 = 13421772;
								if (local395 >= 5 && local395 <= 8 || local395 >= 13 && local395 <= 16 || local395 >= 21 && local395 <= 24 || local395 == 27 || local395 == 28) {
									local423 = 13369344;
									local395 -= 4;
								}
								if (local395 == 1) {
									Static217.method3758(local57, local122, local127, local423);
								} else if (local395 == 2) {
									Static217.method3762(local57, local122, local61, local423);
								} else if (local395 == 3) {
									Static217.method3758(local287, local122, local127, local423);
								} else if (local395 == 4) {
									Static217.method3762(local57, local402, local61, local423);
								} else if (local395 == 9) {
									Static217.method3758(local57, local122, local127, 16777215);
									Static217.method3762(local57, local122, local61, local423);
								} else if (local395 == 10) {
									Static217.method3758(local287, local122, local127, 16777215);
									Static217.method3762(local57, local122, local61, local423);
								} else if (local395 == 11) {
									Static217.method3758(local287, local122, local127, 16777215);
									Static217.method3762(local57, local402, local61, local423);
								} else if (local395 == 12) {
									Static217.method3758(local57, local122, local127, 16777215);
									Static217.method3762(local57, local402, local61, local423);
								} else if (local395 == 17) {
									Static217.method3762(local57, local122, 1, local423);
								} else if (local395 == 18) {
									Static217.method3762(local287, local122, 1, local423);
								} else if (local395 == 19) {
									Static217.method3762(local287, local402, 1, local423);
								} else if (local395 == 20) {
									Static217.method3762(local57, local402, 1, local423);
								} else {
									@Pc(554) int local554;
									if (local395 == 25) {
										for (local554 = 0; local554 < local127; local554++) {
											Static217.method3762(local57 + local554, local402 + -local554, 1, local423);
										}
									} else if (local395 == 26) {
										for (local554 = 0; local554 < local127; local554++) {
											Static217.method3762(local554 + local57, local122 + local554, 1, local423);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local51 = 0; local51 < local6; local51++) {
			local61 = local18 * local51 >> 16;
			local72 = local18 * (local51 + 1) >> 16;
			@Pc(702) int local702 = local72 - local61;
			if (local702 > 0) {
				local61 += arg0;
				local84 = Static129.aByteArrayArrayArray9[local51 + arg4 >> 6];
				for (@Pc(726) int local726 = 0; local726 < local10; local726++) {
					@Pc(736) int local736 = local35 * (local726 + 1) >> 16;
					@Pc(742) int local742 = local726 * local35 >> 16;
					@Pc(747) int local747 = local736 - local742;
					if (local747 > 0) {
						local742 += arg6;
						local106 = arg2 + local726 >> 6;
						local122 = ((arg2 + local726 & 0x3F) << 6) + (local51 + arg4 & 0x3F);
						if (local84[local106] != null) {
							local116 = local84[local106][local122] & 0xFF;
							if (local116 != 0) {
								if (local116 == 47 || local116 == 53) {
									Static67.aClass79_Sub1Array3[local116 - 1].method3076(local61, local742, local702 * 2 + 1, local747 * 2 + 1);
								} else {
									Static67.aClass79_Sub1Array3[local116 - 1].method3076(local61 - local702 / 2, -(local747 / 2) + local742, local702 * 2, local747 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "k", descriptor = "(I)V")
	public static void method3142() {
		Static158.aClass110_15.method3889();
		Static178.aClass53_15.method1797();
		Static14.aClass53_13.method1797();
	}
}
