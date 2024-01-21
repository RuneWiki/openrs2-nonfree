import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
	public static int anInt2827;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
	public static int anInt2820 = 2;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1028 = Static161.method2452("Mem:");

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1029 = Static161.method2452("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg6 - arg1;
		@Pc(18) int local18 = (arg7 - arg0 << 16) / local9;
		if (arg6 < Static165.anInt2257) {
			local9++;
		}
		@Pc(31) int local31 = arg4 - arg3;
		@Pc(40) int local40 = (arg2 - arg5 << 16) / local31;
		if (arg4 < Static131.anInt2727) {
			local31++;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(67) int local67;
		@Pc(78) int local78;
		@Pc(112) int local112;
		@Pc(120) int local120;
		for (@Pc(46) int local46 = 0; local46 < local31; local46++) {
			local54 = local46 * local40 >> 16;
			local62 = local40 * (local46 + 1) >> 16;
			local67 = local62 - local54;
			if (local67 > 0) {
				local78 = arg3 + local46 >> 6;
				local62 += arg5;
				local54 += arg5;
				@Pc(90) byte[][] local90 = Static106.aByteArrayArrayArray8[local78];
				@Pc(94) byte[][] local94 = Static28.aByteArrayArrayArray1[local78];
				@Pc(98) byte[][] local98 = Static200.aByteArrayArrayArray15[local78];
				@Pc(102) int[][] local102 = Static207.anIntArrayArrayArray13[local78];
				@Pc(106) byte[][] local106 = Static94.aByteArrayArrayArray7[local78];
				@Pc(110) byte[][] local110 = Static160.aByteArrayArrayArray12[local78];
				for (local112 = 0; local112 < local9; local112++) {
					local120 = local18 * local112 >> 16;
					@Pc(128) int local128 = local18 * (local112 + 1) >> 16;
					@Pc(133) int local133 = local128 - local120;
					if (local133 > 0) {
						local128 += arg0;
						local120 += arg0;
						@Pc(152) int local152 = arg1 + local112 & 0x3F;
						@Pc(158) int local158 = local46 + arg3 & 0x3F;
						@Pc(165) int local165 = local112 + arg1 >> 6;
						@Pc(172) int local172 = (local152 << 6) + local158;
						@Pc(182) int local182;
						@Pc(191) int local191;
						@Pc(198) int local198;
						if (local102[local165] == null) {
							local191 = local46 + arg3 & 0x4;
							local198 = local112 + arg1 & 0x4;
							if ((local191 >= 2 || local198 <= 2) && (local191 <= 2 || local198 >= 2)) {
								local182 = Static36.anIntArray45[Static37.anInt1356 + 1];
							} else {
								local182 = 4936552;
							}
						} else {
							local182 = local102[local165][local172];
						}
						local191 = local90[local165] == null ? 0 : Static36.anIntArray45[local90[local165][local172] & 0xFF];
						local198 = local98[local165] == null ? 0 : Static36.anIntArray45[local98[local165][local172] & 0xFF];
						@Pc(300) int local300;
						if (local191 == 0 && local198 == 0) {
							Static42.method824(local54, local120, local67, local133, local182);
						} else {
							@Pc(296) byte local296;
							if (local191 != 0) {
								if (local191 == -1) {
									local191 = 1;
								}
								local296 = local94[local165] == null ? 0 : local94[local165][local172];
								local300 = local296 & 0xFC;
								if (local300 == 0 || local67 <= 1 || local133 <= 1) {
									Static42.method824(local54, local120, local67, local133, local191);
								} else {
									Static175.method2662(local296 & 0x3, local120, local54, local191, local133, local182, Static42.anIntArray92, local300 >> 2, local67, true);
								}
							}
							if (local198 != 0) {
								local296 = local106[local165][local172];
								if (local198 == -1) {
									local198 = local182;
								}
								local300 = local296 & 0xFC;
								if (local300 == 0 || local67 <= 1 || local133 <= 1) {
									Static42.method824(local54, local120, local67, local133, local198);
								}
								Static175.method2662(local296 & 0x3, local120, local54, local198, local133, 0, Static42.anIntArray92, local300 >> 2, local67, local191 == 0);
							}
						}
						if (local110[local165] != null) {
							@Pc(404) int local404 = local110[local165][local172] & 0xFF;
							if (local404 != 0) {
								@Pc(416) int local416;
								if (local133 == 1) {
									local416 = local120;
								} else {
									local416 = local128 - 1;
								}
								@Pc(424) int local424 = 13421772;
								if (local404 >= 5 && local404 <= 8 || local404 >= 13 && local404 <= 16 || local404 >= 21 && local404 <= 24 || local404 == 27 || local404 == 28) {
									local424 = 13369344;
									local404 -= 4;
								}
								if (local67 == 1) {
									local300 = local54;
								} else {
									local300 = local62 - 1;
								}
								if (local404 == 1) {
									Static42.method813(local54, local120, local133, local424);
								} else if (local404 == 2) {
									Static42.method809(local54, local120, local67, local424);
								} else if (local404 == 3) {
									Static42.method813(local300, local120, local133, local424);
								} else if (local404 == 4) {
									Static42.method809(local54, local416, local67, local424);
								} else if (local404 == 9) {
									Static42.method813(local54, local120, local133, 16777215);
									Static42.method809(local54, local120, local67, local424);
								} else if (local404 == 10) {
									Static42.method813(local300, local120, local133, 16777215);
									Static42.method809(local54, local120, local67, local424);
								} else if (local404 == 11) {
									Static42.method813(local300, local120, local133, 16777215);
									Static42.method809(local54, local416, local67, local424);
								} else if (local404 == 12) {
									Static42.method813(local54, local120, local133, 16777215);
									Static42.method809(local54, local416, local67, local424);
								} else if (local404 == 17) {
									Static42.method809(local54, local120, 1, local424);
								} else if (local404 == 18) {
									Static42.method809(local300, local120, 1, local424);
								} else if (local404 == 19) {
									Static42.method809(local300, local416, 1, local424);
								} else if (local404 == 20) {
									Static42.method809(local54, local416, 1, local424);
								} else {
									@Pc(594) int local594;
									if (local404 == 25) {
										for (local594 = 0; local594 < local133; local594++) {
											Static42.method809(local594 + local54, local416 - local594, 1, local424);
										}
									} else if (local404 == 26) {
										for (local594 = 0; local594 < local133; local594++) {
											Static42.method809(local54 + local594, local594 + local120, 1, local424);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local54 = 0; local54 < local31; local54++) {
			local67 = local40 * (local54 + 1) >> 16;
			local62 = local54 * local40 >> 16;
			local78 = local67 - local62;
			if (local78 > 0) {
				local62 += arg5;
				@Pc(727) byte[][] local727 = Static62.aByteArrayArrayArray4[local54 + arg3 >> 6];
				for (@Pc(733) int local733 = 0; local733 < local9; local733++) {
					@Pc(741) int local741 = local733 * local18 >> 16;
					@Pc(749) int local749 = (local733 + 1) * local18 >> 16;
					@Pc(753) int local753 = local749 - local741;
					if (local753 > 0) {
						@Pc(764) int local764 = arg1 + local733 >> 6;
						local741 += arg0;
						local112 = (local54 + arg3 & 0x3F) + ((arg1 + local733 & 0x3F) << 6);
						if (local727[local764] != null) {
							local120 = local727[local764][local112] & 0xFF;
							if (local120 != 0) {
								if (local120 == 47 || local120 == 53) {
									Static191.aClass47_Sub1Array2[local120 - 1].method2019(local62, local741, local78 * 2 + 1, local753 * 2 + 1);
								} else {
									Static191.aClass47_Sub1Array2[local120 - 1].method2019(local62 - local78 / 2, -(local753 / 2) + local741, local78 * 2, local753 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
	public static void method2100() {
		Static27.aClass8_8.method233();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!wa;ZI)[Lclient!ng;")
	public static Class47_Sub1[] method2101(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1) {
		return Static114.method506(arg0, arg1) ? Static21.method3198() : null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;ZII)Lclient!pj;")
	public static Class24 method2102(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class24_Sub1");
			@Pc(10) Class24 local10 = (Class24) local6.getDeclaredConstructor().newInstance();
			local10.method2291(arg0, arg2, arg1);
			return local10;
		} catch (@Pc(28) Throwable local28) {
			@Pc(32) Class24_Sub2 local32 = new Class24_Sub2();
			local32.method2291(arg0, arg2, arg1);
			return local32;
		}
	}
}
