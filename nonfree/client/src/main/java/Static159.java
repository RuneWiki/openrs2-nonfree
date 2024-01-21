import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!rb", name = "kb", descriptor = "[I")
	public static int[] anIntArray428;

	@OriginalMember(owner = "client!rb", name = "nb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray96;

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lclient!v;")
	public static Class91 aClass91_19 = new Class91();

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2153 = Static118.method2249("Your account is already logged in)3");

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2152 = aClass65_2153;

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2154 = Static118.method2249(")3runescape)3com");

	@OriginalMember(owner = "client!rb", name = "ob", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2155 = Static118.method2249("rot:");

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2156 = Static118.method2249("mapdots");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIZII)V")
	public static void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg2 - arg3;
		@Pc(15) int local15 = arg0 - arg1;
		@Pc(28) int local28 = (arg4 - arg6 << 16) / local15;
		if (Static190.anInt4160 > arg0) {
			local15++;
		}
		@Pc(45) int local45 = (arg7 - arg5 << 16) / local10;
		if (Static25.anInt737 > arg2) {
			local10++;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(83) int local83;
		@Pc(117) int local117;
		@Pc(133) int local133;
		for (@Pc(51) int local51 = 0; local51 < local15; local51++) {
			local59 = local28 * local51 >> 16;
			local67 = (local51 + 1) * local28 >> 16;
			local72 = local67 - local59;
			if (local72 > 0) {
				local83 = arg1 + local51 >> 6;
				@Pc(87) int[][] local87 = Static40.anIntArrayArrayArray1[local83];
				@Pc(91) byte[][] local91 = aByteArrayArrayArray96[local83];
				@Pc(95) byte[][] local95 = Static91.aByteArrayArrayArray55[local83];
				@Pc(99) byte[][] local99 = Static139.aByteArrayArrayArray89[local83];
				@Pc(103) byte[][] local103 = Static131.aByteArrayArrayArray84[local83];
				local67 += arg6;
				local59 += arg6;
				@Pc(115) byte[][] local115 = Static145.aByteArrayArrayArray90[local83];
				for (local117 = 0; local117 < local10; local117++) {
					@Pc(127) int local127 = local45 * (local117 + 1) >> 16;
					local133 = local117 * local45 >> 16;
					@Pc(137) int local137 = local127 - local133;
					if (local137 > 0) {
						local127 += arg5;
						local133 += arg5;
						@Pc(153) int local153 = arg3 + local117 >> 6;
						@Pc(160) int local160 = local117 + arg3 & 0x3F;
						@Pc(166) int local166 = local51 + arg1 & 0x3F;
						@Pc(172) int local172 = local166 + (local160 << 6);
						@Pc(182) int local182;
						@Pc(190) int local190;
						@Pc(197) int local197;
						if (local87[local153] == null) {
							local190 = arg1 + local51 & 0x4;
							local197 = local117 + arg3 & 0x4;
							if ((local190 >= 2 || local197 <= 2) && (local190 <= 2 || local197 >= 2)) {
								local182 = Static18.anIntArray48[Static75.anInt1866 + 1];
							} else {
								local182 = 4936552;
							}
						} else {
							local182 = local87[local153][local172];
						}
						local190 = local95[local153] == null ? 0 : Static18.anIntArray48[local95[local153][local172] & 0xFF];
						local197 = local99[local153] == null ? 0 : Static18.anIntArray48[local99[local153][local172] & 0xFF];
						@Pc(295) int local295;
						if (local190 == 0 && local197 == 0) {
							Static194.method3096(local59, local133, local72, local137, local182);
						} else {
							@Pc(291) byte local291;
							if (local190 != 0) {
								if (local190 == -1) {
									local190 = 1;
								}
								local291 = local91[local153] == null ? 0 : local91[local153][local172];
								local295 = local291 & 0xFC;
								if (local295 == 0 || local72 <= 1 || local137 <= 1) {
									Static194.method3096(local59, local133, local72, local137, local190);
								} else {
									Static94.method1775(Static194.anIntArray468, local133, local291 & 0x3, local190, local137, local72, local182, true, local59, local295 >> 2);
								}
							}
							if (local197 != 0) {
								local291 = local103[local153][local172];
								if (local197 == -1) {
									local197 = local182;
								}
								local295 = local291 & 0xFC;
								if (local295 == 0 || local72 <= 1 || local137 <= 1) {
									Static194.method3096(local59, local133, local72, local137, local197);
								}
								Static94.method1775(Static194.anIntArray468, local133, local291 & 0x3, local197, local137, local72, 0, local190 == 0, local59, local295 >> 2);
							}
						}
						if (local115[local153] != null) {
							@Pc(395) int local395 = local115[local153][local172] & 0xFF;
							if (local395 != 0) {
								if (local72 == 1) {
									local295 = local59;
								} else {
									local295 = local67 - 1;
								}
								@Pc(415) int local415;
								if (local137 == 1) {
									local415 = local133;
								} else {
									local415 = local127 - 1;
								}
								@Pc(421) int local421 = 13421772;
								if (local395 >= 5 && local395 <= 8 || local395 >= 13 && local395 <= 16 || local395 >= 21 && local395 <= 24 || local395 == 27 || local395 == 28) {
									local421 = 13369344;
									local395 -= 4;
								}
								if (local395 == 1) {
									Static194.method3113(local59, local133, local137, local421);
								} else if (local395 == 2) {
									Static194.method3094(local59, local133, local72, local421);
								} else if (local395 == 3) {
									Static194.method3113(local295, local133, local137, local421);
								} else if (local395 == 4) {
									Static194.method3094(local59, local415, local72, local421);
								} else if (local395 == 9) {
									Static194.method3113(local59, local133, local137, 16777215);
									Static194.method3094(local59, local133, local72, local421);
								} else if (local395 == 10) {
									Static194.method3113(local295, local133, local137, 16777215);
									Static194.method3094(local59, local133, local72, local421);
								} else if (local395 == 11) {
									Static194.method3113(local295, local133, local137, 16777215);
									Static194.method3094(local59, local415, local72, local421);
								} else if (local395 == 12) {
									Static194.method3113(local59, local133, local137, 16777215);
									Static194.method3094(local59, local415, local72, local421);
								} else if (local395 == 17) {
									Static194.method3094(local59, local133, 1, local421);
								} else if (local395 == 18) {
									Static194.method3094(local295, local133, 1, local421);
								} else if (local395 == 19) {
									Static194.method3094(local295, local415, 1, local421);
								} else if (local395 == 20) {
									Static194.method3094(local59, local415, 1, local421);
								} else {
									@Pc(575) int local575;
									if (local395 == 25) {
										for (local575 = 0; local575 < local137; local575++) {
											Static194.method3094(local575 + local59, local415 - local575, 1, local421);
										}
									} else if (local395 == 26) {
										for (local575 = 0; local575 < local137; local575++) {
											Static194.method3094(local59 + local575, local133 + local575, 1, local421);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local59 = 0; local59 < local15; local59++) {
			local72 = local28 * (local59 + 1) >> 16;
			local67 = local59 * local28 >> 16;
			local83 = local72 - local67;
			if (local83 > 0) {
				local67 += arg6;
				@Pc(717) byte[][] local717 = Static90.aByteArrayArrayArray117[local59 + arg1 >> 6];
				for (@Pc(719) int local719 = 0; local719 < local10; local719++) {
					@Pc(727) int local727 = local45 * local719 >> 16;
					@Pc(735) int local735 = (local719 + 1) * local45 >> 16;
					@Pc(740) int local740 = local735 - local727;
					if (local740 > 0) {
						local727 += arg5;
						@Pc(759) int local759 = arg3 + local719 >> 6;
						local117 = ((local719 + arg3 & 0x3F) << 6) + (arg1 + local59 & 0x3F);
						if (local717[local759] != null) {
							local133 = local717[local759][local117] & 0xFF;
							if (local133 != 0) {
								if (local133 == 47 || local133 == 53) {
									Static107.aClass1_Sub2_Sub5_Sub1Array9[local133 - 1].method554(local67, local727, local83 * 2 + 1, local740 * 2 + 1);
								} else {
									Static107.aClass1_Sub2_Sub5_Sub1Array9[local133 - 1].method554(local67 - local83 / 2, local727 + -(local740 / 2), local83 * 2, local740 * 2);
								}
							}
						}
					}
				}
			}
		}
	}
}
