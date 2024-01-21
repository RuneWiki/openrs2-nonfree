import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!je;")
	private static Class40 aClass40_566 = Static69.method1231(" from your friend list first");

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_563 = aClass40_566;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public static int anInt1092 = 0;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	public static int anInt1095 = 1;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_564 = Static69.method1231("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_565 = Static69.method1231("<col=ffffff>");

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	public static final int anInt1100 = 2301979;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method727() {
		@Pc(12) int local12 = Static7.aClass2_Sub9_Sub1_1.method671(8);
		@Pc(21) int local21;
		if (Static130.anInt3007 > local12) {
			for (local21 = local12; local21 < Static130.anInt3007; local21++) {
				Static104.anIntArray286[Static114.anInt2625++] = Static126.anIntArray347[local21];
			}
		}
		if (Static130.anInt3007 < local12) {
			throw new RuntimeException("gppov1");
		}
		Static130.anInt3007 = 0;
		for (local21 = 0; local21 < local12; local21++) {
			@Pc(60) int local60 = Static126.anIntArray347[local21];
			@Pc(64) Class2_Sub1_Sub1_Sub3_Sub2 local64 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local60];
			@Pc(69) int local69 = Static7.aClass2_Sub9_Sub1_1.method671(1);
			if (local69 == 0) {
				Static126.anIntArray347[Static130.anInt3007++] = local60;
				local64.anInt1808 = Static28.anInt704;
			} else {
				@Pc(92) int local92 = Static7.aClass2_Sub9_Sub1_1.method671(2);
				if (local92 == 0) {
					Static126.anIntArray347[Static130.anInt3007++] = local60;
					local64.anInt1808 = Static28.anInt704;
					Static73.anIntArray202[Static58.anInt1521++] = local60;
				} else {
					@Pc(136) int local136;
					@Pc(148) int local148;
					if (local92 == 1) {
						Static126.anIntArray347[Static130.anInt3007++] = local60;
						local64.anInt1808 = Static28.anInt704;
						local136 = Static7.aClass2_Sub9_Sub1_1.method671(3);
						local64.method1172(false, local136);
						local148 = Static7.aClass2_Sub9_Sub1_1.method671(1);
						if (local148 == 1) {
							Static73.anIntArray202[Static58.anInt1521++] = local60;
						}
					} else if (local92 == 2) {
						Static126.anIntArray347[Static130.anInt3007++] = local60;
						local64.anInt1808 = Static28.anInt704;
						local136 = Static7.aClass2_Sub9_Sub1_1.method671(3);
						local64.method1172(true, local136);
						local148 = Static7.aClass2_Sub9_Sub1_1.method671(3);
						local64.method1172(true, local148);
						@Pc(206) int local206 = Static7.aClass2_Sub9_Sub1_1.method671(1);
						if (local206 == 1) {
							Static73.anIntArray202[Static58.anInt1521++] = local60;
						}
					} else if (local92 == 3) {
						Static104.anIntArray286[Static114.anInt2625++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
	public static void method728(@OriginalArg(0) int arg0) {
		Static31.anInt733 += arg0 * 128;
		@Pc(21) int local21;
		if (Static31.anInt733 > Static115.anIntArray302.length) {
			Static31.anInt733 -= Static115.anIntArray302.length;
			local21 = (int) (Math.random() * 12.0D);
			Static70.method1219(Static69.aClass2_Sub1_Sub2_Sub1Array53[local21]);
		}
		@Pc(36) int local36 = arg0 * 128;
		local21 = 0;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(76) int local76;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local76 = Static97.anIntArray267[local36 + local21] - Static115.anIntArray302[local21 + Static31.anInt733 & Static115.anIntArray302.length + -1] * arg0 / 6;
			if (local76 < 0) {
				local76 = 0;
			}
			Static97.anIntArray267[local21++] = local76;
		}
		@Pc(104) int local104;
		@Pc(106) int local106;
		@Pc(113) int local113;
		for (local76 = 256 - arg0; local76 < 256; local76++) {
			local104 = local76 * 128;
			for (local106 = 0; local106 < 128; local106++) {
				local113 = (int) (Math.random() * 100.0D);
				if (local113 < 50 && local106 > 10 && local106 < 118) {
					Static97.anIntArray267[local104 + local106] = 255;
				} else {
					Static97.anIntArray267[local104 + local106] = 0;
				}
			}
		}
		if (Static70.anInt1887 > 0) {
			Static70.anInt1887 -= arg0 * 4;
		}
		if (Static46.anInt1211 > 0) {
			Static46.anInt1211 -= arg0 * 4;
		}
		if (Static46.anInt1211 == 0 && Static70.anInt1887 == 0) {
			local104 = (int) ((double) (2000 / arg0) * Math.random());
			if (local104 == 1) {
				Static70.anInt1887 = 1024;
			}
			if (local104 == 0) {
				Static46.anInt1211 = 1024;
			}
		}
		for (local104 = 0; local104 < 256 - arg0; local104++) {
			Static126.anIntArray346[local104] = Static126.anIntArray346[arg0 + local104];
		}
		for (local106 = 256 - arg0; local106 < 256; local106++) {
			Static126.anIntArray346[local106] = (int) (Math.sin((double) Static72.anInt1905 / 14.0D) * 16.0D + Math.sin((double) Static72.anInt1905 / 15.0D) * 14.0D + Math.sin((double) Static72.anInt1905 / 16.0D) * 12.0D);
			Static72.anInt1905++;
		}
		local113 = ((Static28.anInt704 & 0x1) + arg0) / 2;
		Static115.anInt2641 += arg0;
		if (local113 <= 0) {
			return;
		}
		@Pc(288) int local288;
		@Pc(295) int local295;
		for (@Pc(279) int local279 = 0; local279 < Static115.anInt2641 * 100; local279++) {
			local288 = (int) (Math.random() * 124.0D) + 2;
			local295 = (int) (Math.random() * 128.0D) + 128;
			Static97.anIntArray267[(local295 << 7) + local288] = 192;
		}
		Static115.anInt2641 = 0;
		@Pc(321) int local321;
		@Pc(324) int local324;
		for (local288 = 0; local288 < 256; local288++) {
			local295 = 0;
			local321 = local288 * 128;
			for (local324 = -local113; local324 < 128; local324++) {
				if (local324 + local113 < 128) {
					local295 += Static97.anIntArray267[local324 + local321 + local113];
				}
				if (local324 - local113 - 1 >= 0) {
					local295 -= Static97.anIntArray267[local321 + local324 - local113 - 1];
				}
				if (local324 >= 0) {
					Static125.anIntArray343[local321 + local324] = local295 / (local113 * 2 + 1);
				}
			}
		}
		for (local295 = 0; local295 < 128; local295++) {
			local321 = 0;
			for (local324 = -local113; local324 < 256; local324++) {
				@Pc(399) int local399 = local324 * 128;
				if (local324 + local113 < 256) {
					local321 += Static125.anIntArray343[local295 + local399 + local113 * 128];
				}
				if (local324 - local113 - 1 >= 0) {
					local321 -= Static125.anIntArray343[local399 + local295 - local113 * 128 - 128];
				}
				if (local324 >= 0) {
					Static97.anIntArray267[local399 + local295] = local321 / (local113 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public static void method730() {
		aClass40_566 = null;
		aClass40_565 = null;
		aClass40_563 = null;
		aClass40_564 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!fd;I)V")
	public static void method731(@OriginalArg(0) Class24 arg0) {
		Static85.aClass24_24 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIII)I")
	public static int method734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}
}
