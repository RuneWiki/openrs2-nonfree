import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	public static int anInt2665;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
	public static final int[] anIntArray229 = new int[13];

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	public static int anInt2663 = 1;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZIIII)V")
	public static void method2216(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && Static269.anInt2101 == arg3 && arg2 == Static163.anInt2919 && (Static184.anInt3250 == Static204.anInt3498 || Static434.aClass165_Sub1_1.method3397(Static404.anInt2752))) {
			return;
		}
		Static163.anInt2919 = arg2;
		Static184.anInt3250 = Static204.anInt3498;
		Static269.anInt2101 = arg3;
		if (Static434.aClass165_Sub1_1.method3397(Static404.anInt2752)) {
			Static184.anInt3250 = 0;
		}
		Static274.method3920(arg1);
		Static1.method26(true, Static420.aClass231_118.method5261(Static80.anInt6195), Static11.aClass14_1);
		@Pc(56) int local56 = Static386.anInt7205;
		@Pc(58) int local58 = Static153.anInt2798;
		Static386.anInt7205 = (Static269.anInt2101 - (Static234.anInt3949 >> 4)) * 8;
		Static153.anInt2798 = (Static163.anInt2919 - (Static371.anInt6492 >> 4)) * 8;
		Static431.aClass2_Sub1_Sub14_3 = Static5.method5388(Static269.anInt2101 * 8, Static163.anInt2919 * 8);
		Static115.aClass176_2 = null;
		@Pc(91) int local91 = Static386.anInt7205 - local56;
		@Pc(96) int local96 = Static153.anInt2798 - local58;
		@Pc(103) int local103;
		@Pc(116) int local116;
		@Pc(241) int local241;
		@Pc(180) int local180;
		if (arg1 == 10) {
			for (local103 = 0; local103 < Static30.anInt548; local103++) {
				@Pc(109) Class2_Sub34 local109 = Static226.aClass2_Sub34Array1[local103];
				if (local109 != null) {
					@Pc(114) Class11_Sub5_Sub2_Sub2 local114 = local109.aClass11_Sub5_Sub2_Sub2_2;
					for (local116 = 0; local116 < 10; local116++) {
						local114.anIntArray632[local116] -= local91;
						local114.anIntArray633[local116] -= local96;
					}
					local114.anInt7622 -= local96 * 128;
					local114.anInt7626 -= local91 * 128;
				}
			}
		} else {
			@Pc(166) boolean local166 = false;
			Static458.anInt7721 = 0;
			@Pc(174) int local174 = (Static234.anInt3949 - 1) * 128;
			local180 = Static371.anInt6492 * 128 - 128;
			for (local116 = 0; local116 < Static30.anInt548; local116++) {
				@Pc(188) Class2_Sub34 local188 = Static226.aClass2_Sub34Array1[local116];
				if (local188 != null) {
					@Pc(193) Class11_Sub5_Sub2_Sub2 local193 = local188.aClass11_Sub5_Sub2_Sub2_2;
					local193.anInt7622 -= local96 * 128;
					local193.anInt7626 -= local91 * 128;
					if (local193.anInt7626 >= 0 && local174 >= local193.anInt7626 && local193.anInt7622 >= 0 && local193.anInt7622 <= local180) {
						@Pc(239) boolean local239 = true;
						for (local241 = 0; local241 < 10; local241++) {
							local193.anIntArray632[local241] -= local91;
							local193.anIntArray633[local241] -= local96;
							if (local193.anIntArray632[local241] < 0 || local193.anIntArray632[local241] >= Static234.anInt3949 || local193.anIntArray633[local241] < 0 || local193.anIntArray633[local241] >= Static371.anInt6492) {
								local239 = false;
							}
						}
						if (local239) {
							Static164.anIntArray253[Static458.anInt7721++] = local193.anInt7670;
						} else {
							local193.method6235(null);
							local188.method6260();
							local166 = true;
						}
					} else {
						local193.method6235(null);
						local188.method6260();
						local166 = true;
					}
				}
			}
			if (local166) {
				Static30.anInt548 = Static400.aClass220_41.method5103();
				Static400.aClass220_41.method5097(Static226.aClass2_Sub34Array1);
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(339) Class11_Sub5_Sub2_Sub1 local339 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local103];
			if (local339 != null) {
				for (local180 = 0; local180 < 10; local180++) {
					local339.anIntArray632[local180] -= local91;
					local339.anIntArray633[local180] -= local96;
				}
				local339.anInt7626 -= local91 * 128;
				local339.anInt7622 -= local96 * 128;
			}
		}
		@Pc(396) Class166[] local396 = Static223.aClass166Array1;
		for (local180 = 0; local180 < local396.length; local180++) {
			@Pc(404) Class166 local404 = local396[local180];
			if (local404 != null) {
				local404.anInt4243 -= local91 * 128;
				local404.anInt4239 -= local96 * 128;
			}
		}
		for (@Pc(436) Class2_Sub42 local436 = (Class2_Sub42) Static465.aClass181_49.method3972(); local436 != null; local436 = (Class2_Sub42) Static465.aClass181_49.method3975()) {
			local436.anInt7066 -= local96;
			local436.anInt7064 -= local91;
			if (Static409.anInt701 != 4 && (local436.anInt7064 < 0 || local436.anInt7066 < 0 || local436.anInt7064 >= Static234.anInt3949 || local436.anInt7066 >= Static371.anInt6492)) {
				local436.method6260();
			}
		}
		if (Static409.anInt701 != 4) {
			for (@Pc(499) Class2_Sub43 local499 = (Class2_Sub43) Static293.aClass220_27.method5096(); local499 != null; local499 = (Class2_Sub43) Static293.aClass220_27.method5098()) {
				@Pc(507) int local507 = (int) (local499.aLong401 & 0x3FFFL);
				@Pc(512) int local512 = local507 - Static386.anInt7205;
				local241 = (int) (local499.aLong401 >> 14 & 0x3FFFL);
				@Pc(525) int local525 = local241 - Static153.anInt2798;
				if (local512 < 0 || local525 < 0 || local512 >= Static234.anInt3949 || local525 >= Static371.anInt6492) {
					local499.method6260();
				}
			}
		}
		if (Static249.anInt4279 != 0) {
			Static331.anInt5943 -= local96;
			Static249.anInt4279 -= local91;
		}
		Static104.method1544();
		if (arg1 != 10) {
			Static263.anInt4619 -= local91 * 128;
			Static412.anInt7076 -= local91;
			Static258.anInt4504 -= local96;
			Static101.anInt1574 -= local91;
			Static281.anInt4446 -= local96;
			Static120.anInt2052 -= local96 * 128;
			if (Math.abs(local91) > Static234.anInt3949 || Math.abs(local96) > Static371.anInt6492) {
				Static366.method5130();
			}
		} else if (Static25.anInt7273 == 4) {
			Static235.anInt3979 -= local96 * 128;
			Static82.anInt3899 -= local91 * 128;
			Static184.anInt3246 -= local96 * 128;
			Static188.anInt6693 -= local91 * 128;
		} else {
			Static25.anInt7273 = 1;
		}
		Static194.method2776();
		Static388.method5383();
		Static364.aClass181_38.method3969();
		Static361.aClass181_36.method3969();
		Static383.aClass97_7.method2147();
		Static271.method3893();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	public static void method2217() {
		Static373.method5193((long) Static277.anInt5022, Static257.aClass75_8);
		if (Static103.anInt5365 != -1) {
			Static13.method314(Static103.anInt5365);
		}
		for (@Pc(23) int local23 = 0; local23 < Static153.anInt2793; local23++) {
			if (Static186.aBooleanArray12[local23]) {
				Static120.aBooleanArray3[local23] = true;
			}
			Static316.aBooleanArray20[local23] = Static186.aBooleanArray12[local23];
			Static186.aBooleanArray12[local23] = false;
		}
		Static456.anInt7597 = Static277.anInt5022;
		if (Static257.aClass75_8.method6002()) {
			Static142.aBoolean166 = true;
		}
		if (Static103.anInt5365 != -1) {
			Static153.anInt2793 = 0;
			Static111.method1812();
		}
		Static257.aClass75_8.va();
		Static408.method1353(Static257.aClass75_8);
		@Pc(76) int local76 = Static250.method3456();
		if (local76 == -1) {
			local76 = Static236.anInt3995;
		}
		if (local76 == -1) {
			local76 = Static447.anInt7439;
		}
		Static176.method2576(local76);
		Static417.anInt7158 = 0;
	}
}
