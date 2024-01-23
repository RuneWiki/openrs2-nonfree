import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Lclient!ol;")
	public static Class117 aClass117_8 = new Class117(16);

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
	public static void method2177() {
		Static42.anIntArray115 = Static200.method2871(0.4F);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!ok;I)I")
	public static int method2178(@OriginalArg(1) Class116 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray30 == null || arg1 >= arg0.anIntArrayArray30.length) {
			return -2;
		}
		try {
			@Pc(28) int[] local28 = arg0.anIntArrayArray30[arg1];
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			@Pc(34) byte local34 = 0;
			while (true) {
				@Pc(39) int local39 = local28[local32++];
				@Pc(41) int local41 = 0;
				@Pc(43) byte local43 = 0;
				if (local39 == 0) {
					return local30;
				}
				if (local39 == 15) {
					local43 = 1;
				}
				if (local39 == 1) {
					local41 = Static291.anIntArray607[local28[local32++]];
				}
				if (local39 == 2) {
					local41 = Static240.anIntArray544[local28[local32++]];
				}
				if (local39 == 3) {
					local41 = Static25.anIntArray53[local28[local32++]];
				}
				@Pc(103) int local103;
				@Pc(114) Class116 local114;
				@Pc(119) int local119;
				@Pc(133) int local133;
				if (local39 == 4) {
					local103 = local28[local32++] << 16;
					@Pc(110) int local110 = local103 + local28[local32++];
					local114 = Static115.method1897(local110);
					local119 = local28[local32++];
					if (local119 != -1 && (!Static238.method4099(local119).aBoolean275 || Static251.aBoolean291)) {
						for (local133 = 0; local133 < local114.anIntArray404.length; local133++) {
							if (local114.anIntArray404[local133] == local119 + 1) {
								local41 += local114.anIntArray397[local133];
							}
						}
					}
				}
				if (local39 == 5) {
					local41 = Static170.anIntArray601[local28[local32++]];
				}
				if (local39 == 6) {
					local41 = Class85_Sub1.anIntArray295[Static240.anIntArray544[local28[local32++]] - 1];
				}
				if (local39 == 16) {
					local43 = 2;
				}
				if (local39 == 17) {
					local43 = 3;
				}
				if (local39 == 7) {
					local41 = Static170.anIntArray601[local28[local32++]] * 100 / 46875;
				}
				if (local39 == 8) {
					local41 = Static239.aClass25_Sub1_Sub1_2.anInt715;
				}
				if (local39 == 9) {
					for (local103 = 0; local103 < 25; local103++) {
						if (Static148.aBooleanArray14[local103]) {
							local41 += Static240.anIntArray544[local103];
						}
					}
				}
				if (local39 == 10) {
					local103 = local28[local32++] << 16;
					local103 += local28[local32++];
					local114 = Static115.method1897(local103);
					local119 = local28[local32++];
					if (local119 != -1 && (!Static238.method4099(local119).aBoolean275 || Static251.aBoolean291)) {
						for (local133 = 0; local133 < local114.anIntArray404.length; local133++) {
							if (local114.anIntArray404[local133] == local119 + 1) {
								local41 = 999999999;
								break;
							}
						}
					}
				}
				if (local39 == 11) {
					local41 = Static254.anInt5401;
				}
				if (local39 == 12) {
					local41 = Static202.anInt4505;
				}
				if (local39 == 13) {
					local103 = Static170.anIntArray601[local28[local32++]];
					@Pc(346) int local346 = local28[local32++];
					local41 = (0x1 << local346 & local103) == 0 ? 0 : 1;
				}
				if (local39 == 14) {
					local103 = local28[local32++];
					local41 = Static40.method1449(local103);
				}
				if (local39 == 18) {
					local41 = Static82.anInt1972 + (Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7);
				}
				if (local39 == 19) {
					local41 = (Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7) + Static266.anInt5790;
				}
				if (local39 == 20) {
					local41 = local28[local32++];
				}
				if (local43 == 0) {
					if (local34 == 0) {
						local30 += local41;
					}
					if (local34 == 1) {
						local30 -= local41;
					}
					if (local34 == 2 && local41 != 0) {
						local30 /= local41;
					}
					if (local34 == 3) {
						local30 *= local41;
					}
					local34 = 0;
				} else {
					local34 = local43;
				}
			}
		} catch (@Pc(452) Exception local452) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(III)Lclient!ok;")
	public static Class116 method2179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class116 local15 = Static115.method1897(arg1);
		if (arg0 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass116Array1 == null || arg0 >= local15.aClass116Array1.length) {
			return null;
		} else {
			return local15.aClass116Array1[arg0];
		}
	}
}
