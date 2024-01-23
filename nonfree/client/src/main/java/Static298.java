import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!wf;")
	public static Class189 aClass189_16 = null;

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "[I")
	public static int[] anIntArray629 = new int[50];

	@OriginalMember(owner = "client!vh", name = "hb", descriptor = "I")
	public static int anInt5544 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method4484() {
		Static281.aClass4_Sub3_Sub14_9 = null;
		Static266.aClass4_Sub3_Sub14_8 = null;
		Static24.aClass4_Sub3_Sub14_1 = null;
		Static254.aClass4_Sub3_Sub14_5 = null;
		Static82.aClass4_Sub3_Sub14_2 = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public static void method4485() {
		Static293.aClass26_56.method511();
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	public static void method4492() {
		if (Static169.anInt3304 == 10 && Static94.aBoolean138) {
			Static15.method233(28);
		}
		if (Static169.anInt3304 == 30) {
			Static15.method233(25);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
	public static void method4499(@OriginalArg(0) byte arg0) {
		if (Static9.aByteArrayArrayArray2 == null) {
			Static9.aByteArrayArrayArray2 = new byte[4][104][104];
		}
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
				for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
					Static9.aByteArrayArrayArray2[local12][local17][local24] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLclient!wf;)I")
	public static int method4501(@OriginalArg(0) int arg0, @OriginalArg(2) Class189 arg1) {
		if (arg1.anIntArrayArray50 == null || arg0 >= arg1.anIntArrayArray50.length) {
			return -2;
		}
		try {
			@Pc(30) int[] local30 = arg1.anIntArrayArray50[arg0];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(36) byte local36 = 0;
			while (true) {
				@Pc(38) byte local38 = 0;
				@Pc(43) int local43 = local30[local32++];
				@Pc(45) int local45 = 0;
				if (local43 == 0) {
					return local34;
				}
				if (local43 == 1) {
					local45 = Static294.anIntArray501[local30[local32++]];
				}
				if (local43 == 15) {
					local38 = 1;
				}
				if (local43 == 16) {
					local38 = 2;
				}
				if (local43 == 17) {
					local38 = 3;
				}
				if (local43 == 2) {
					local45 = Static279.anIntArray599[local30[local32++]];
				}
				if (local43 == 3) {
					local45 = Static299.anIntArray637[local30[local32++]];
				}
				@Pc(118) int local118;
				@Pc(129) Class189 local129;
				@Pc(134) int local134;
				@Pc(147) int local147;
				if (local43 == 4) {
					local118 = local30[local32++] << 16;
					@Pc(125) int local125 = local118 + local30[local32++];
					local129 = Static114.method1814(local125);
					local134 = local30[local32++];
					if (local134 != -1 && (!Static287.method4398(local134).aBoolean351 || Static293.aBoolean371)) {
						for (local147 = 0; local147 < local129.anIntArray660.length; local147++) {
							if (local129.anIntArray660[local147] == local134 + 1) {
								local45 += local129.anIntArray661[local147];
							}
						}
					}
				}
				if (local43 == 5) {
					local45 = Static2.anIntArray2[local30[local32++]];
				}
				if (local43 == 6) {
					local45 = Class65.anIntArray165[Static279.anIntArray599[local30[local32++]] - 1];
				}
				if (local43 == 7) {
					local45 = Static2.anIntArray2[local30[local32++]] * 100 / 46875;
				}
				if (local43 == 8) {
					local45 = Static154.aClass53_Sub1_Sub1_2.anInt1597;
				}
				if (local43 == 9) {
					for (local118 = 0; local118 < 25; local118++) {
						if (Static281.aBooleanArray25[local118]) {
							local45 += Static279.anIntArray599[local118];
						}
					}
				}
				if (local43 == 10) {
					local118 = local30[local32++] << 16;
					local118 += local30[local32++];
					local129 = Static114.method1814(local118);
					local134 = local30[local32++];
					if (local134 != -1 && (!Static287.method4398(local134).aBoolean351 || Static293.aBoolean371)) {
						for (local147 = 0; local147 < local129.anIntArray660.length; local147++) {
							if (local134 + 1 == local129.anIntArray660[local147]) {
								local45 = 999999999;
								break;
							}
						}
					}
				}
				if (local43 == 11) {
					local45 = Static52.anInt2248;
				}
				if (local43 == 12) {
					local45 = Static91.anInt2048;
				}
				if (local43 == 13) {
					local118 = Static2.anIntArray2[local30[local32++]];
					@Pc(353) int local353 = local30[local32++];
					local45 = (0x1 << local353 & local118) == 0 ? 0 : 1;
				}
				if (local43 == 14) {
					local118 = local30[local32++];
					local45 = Static281.method4348(local118);
				}
				if (local43 == 18) {
					local45 = Static220.anInt3983 + (Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7);
				}
				if (local43 == 19) {
					local45 = (Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7) + Static295.anInt5480;
				}
				if (local43 == 20) {
					local45 = local30[local32++];
				}
				if (local38 == 0) {
					if (local36 == 0) {
						local34 += local45;
					}
					if (local36 == 1) {
						local34 -= local45;
					}
					if (local36 == 2 && local45 != 0) {
						local34 /= local45;
					}
					if (local36 == 3) {
						local34 *= local45;
					}
					local36 = 0;
				} else {
					local36 = local38;
				}
			}
		} catch (@Pc(459) Exception local459) {
			return -1;
		}
	}
}
