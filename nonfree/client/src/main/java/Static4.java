import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!bd;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString1 = "Loading world list data";

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIIII)V")
	public static void method25(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
		Static335.aClass5_Sub1_Sub1_3.method1886(20);
		Static335.aClass5_Sub1_Sub1_3.method1886(arg2);
		Static335.aClass5_Sub1_Sub1_3.method1886(arg0);
		Static335.aClass5_Sub1_Sub1_3.method1870(arg1);
		Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		Static88.anInt1583 = 1;
		Static111.anInt2410 = 0;
		Static64.anInt1550 = 0;
		Static45.anInt1178 = -3;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method26() {
		if (Static236.aString265.length() != 0) {
			Static236.method4028("--> " + Static236.aString265);
			Static310.method5287(false, Static236.aString265);
			Static236.aString265 = "";
			Static290.anInt5566 = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method27() {
		for (@Pc(12) int local12 = 0; local12 < Static225.anInt4428; local12++) {
			@Pc(18) int local18 = Static144.anIntArray189[local12]--;
			if (Static144.anIntArray189[local12] >= -10) {
				@Pc(93) Class196 local93 = Static94.aClass196Array1[local12];
				if (local93 == null) {
					local93 = Static368.method5324(Static101.aClass170_44, Static77.anIntArray100[local12], 0);
					if (local93 == null) {
						continue;
					}
					Static144.anIntArray189[local12] += local93.method5323();
					Static94.aClass196Array1[local12] = local93;
				}
				if (Static144.anIntArray189[local12] < 0) {
					@Pc(220) int local220;
					if (Static337.anIntArray548[local12] == 0) {
						local220 = Static126.anInt2647 * Static48.anIntArray57[local12] >> 8;
					} else {
						@Pc(137) int local137 = (Static337.anIntArray548[local12] & 0xFF) * 128;
						@Pc(145) int local145 = Static337.anIntArray548[local12] >> 16 & 0xFF;
						@Pc(155) int local155 = local145 * 128 + 64 - Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769;
						if (local155 < 0) {
							local155 = -local155;
						}
						@Pc(168) int local168 = Static337.anIntArray548[local12] >> 8 & 0xFF;
						@Pc(178) int local178 = local168 * 128 + 64 - Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773;
						if (local178 < 0) {
							local178 = -local178;
						}
						@Pc(189) int local189 = local178 + local155 - 128;
						if (local137 < local189) {
							Static144.anIntArray189[local12] = -100;
							continue;
						}
						if (local189 < 0) {
							local189 = 0;
						}
						local220 = Static48.anIntArray57[local12] * Static123.anInt2600 * (local137 - local189) / local137 >> 8;
					}
					if (local220 > 0) {
						@Pc(240) Class5_Sub15_Sub1 local240 = local93.method5322().method1982(Static195.aClass186_1);
						@Pc(245) Class5_Sub17_Sub1 local245 = Static361.method2115(local240, local220);
						local245.method2121(Static70.anIntArray82[local12] - 1);
						Static5.aClass5_Sub17_Sub3_1.method3547(local245);
					}
					Static144.anIntArray189[local12] = -100;
				}
			} else {
				Static225.anInt4428--;
				for (@Pc(32) int local32 = local12; local32 < Static225.anInt4428; local32++) {
					Static77.anIntArray100[local32] = Static77.anIntArray100[local32 + 1];
					Static94.aClass196Array1[local32] = Static94.aClass196Array1[local32 + 1];
					Static70.anIntArray82[local32] = Static70.anIntArray82[local32 + 1];
					Static144.anIntArray189[local32] = Static144.anIntArray189[local32 + 1];
					Static337.anIntArray548[local32] = Static337.anIntArray548[local32 + 1];
					Static48.anIntArray57[local32] = Static48.anIntArray57[local32 + 1];
				}
				local12--;
			}
		}
		if (Static46.aBoolean84 && !Static256.method4450()) {
			if (Static111.anInt2405 != 0 && Static100.anInt2201 != -1) {
				Static183.method3399(Static100.anInt2201, Static305.aClass170_102, Static111.anInt2405);
			}
			Static46.aBoolean84 = false;
		} else if (Static111.anInt2405 != 0 && Static100.anInt2201 != -1 && !Static256.method4450()) {
			Static335.aClass5_Sub1_Sub1_3.method174(255);
			Static335.aClass5_Sub1_Sub1_3.method1851(Static100.anInt2201);
			Static100.anInt2201 = -1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	public static void method29() {
		@Pc(1) Class66 local1 = Static173.aClass66_80;
		synchronized (Static173.aClass66_80) {
			Static173.aClass66_80.method1933();
		}
		@Pc(26) Class66 local26 = Static68.aClass66_27;
		synchronized (Static68.aClass66_27) {
			Static68.aClass66_27.method1933();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public static void method30(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub9_Sub16 local10 = Static239.method4052(11, arg0);
		local10.method4138();
	}
}
