import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!aa;")
	public static Class2 aClass2_6;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public static int anInt3421 = 0;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1861 = Static122.method531("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1862 = Static122.method531("mapfunction");

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1863 = Static122.method531("Please enter your username)3");

	@OriginalMember(owner = "client!td", name = "g", descriptor = "[I")
	public static int[] anIntArray371 = new int[128];

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1864 = Static122.method531("jlv");

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1865 = aClass73_1863;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method2490() {
		@Pc(14) int local14;
		if (Static76.anInt1684 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static76.anInt1684 > 768) {
					Static122.anIntArray72[local14] = Static45.method806(Static157.anIntArray372[local14], Static175.anIntArray417[local14], 1024 - Static76.anInt1684);
				} else if (Static76.anInt1684 > 256) {
					Static122.anIntArray72[local14] = Static157.anIntArray372[local14];
				} else {
					Static122.anIntArray72[local14] = Static45.method806(Static175.anIntArray417[local14], Static157.anIntArray372[local14], 256 - Static76.anInt1684);
				}
			}
		} else if (Static137.anInt3103 <= 0) {
			for (local14 = 0; local14 < 256; local14++) {
				Static122.anIntArray72[local14] = Static175.anIntArray417[local14];
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static137.anInt3103 > 768) {
					Static122.anIntArray72[local14] = Static45.method806(Static82.anIntArray189[local14], Static175.anIntArray417[local14], 1024 - Static137.anInt3103);
				} else if (Static137.anInt3103 <= 256) {
					Static122.anIntArray72[local14] = Static45.method806(Static175.anIntArray417[local14], Static82.anIntArray189[local14], 256 - Static137.anInt3103);
				} else {
					Static122.anIntArray72[local14] = Static82.anIntArray189[local14];
				}
			}
		}
		local14 = 0;
		@Pc(156) int local156 = Static67.aClass3_Sub1_Sub3_Sub4_13.anInt3223 * 9;
		@Pc(158) int local158 = 0;
		@Pc(175) int local175;
		@Pc(185) int local185;
		@Pc(192) int local192;
		@Pc(198) int local198;
		@Pc(213) int local213;
		@Pc(218) int local218;
		for (@Pc(160) int local160 = 1; local160 < 255; local160++) {
			local175 = Static172.anIntArray398[local160] * (256 - local160) / 256 + 22;
			if (local175 < 0) {
				local175 = 0;
			}
			local14 += local175;
			for (local185 = local175; local185 < 128; local185++) {
				local192 = Static17.anIntArray397[local14++];
				local198 = Static67.aClass3_Sub1_Sub3_Sub4_13.anIntArray336[local156++];
				if (local192 == 0) {
					Static32.aClass3_Sub1_Sub3_Sub4_7.anIntArray336[local158++] = local198;
				} else {
					local213 = local192;
					local218 = 256 - local192;
					local192 = Static122.anIntArray72[local192];
					Static32.aClass3_Sub1_Sub3_Sub4_7.anIntArray336[local158++] = (local213 * (local192 & 0xFF00) + (local198 & 0xFF00) * local218 & 0xFF0000) + (local218 * (local198 & 0xFF00FF) + (local192 & 0xFF00FF) * local213 & 0xFF00FF00) >> 8;
				}
			}
			for (local192 = 0; local192 < local175; local192++) {
				Static32.aClass3_Sub1_Sub3_Sub4_7.anIntArray336[local158++] = Static67.aClass3_Sub1_Sub3_Sub4_13.anIntArray336[local156++];
			}
			local156 += Static67.aClass3_Sub1_Sub3_Sub4_13.anInt3223 - 128;
		}
		local158 = 0;
		local14 = 0;
		Static32.aClass3_Sub1_Sub3_Sub4_7.method2317(0, 9);
		local156 = Static67.aClass3_Sub1_Sub3_Sub4_13.anInt3223 * 9 + 128;
		for (local175 = 1; local175 < 255; local175++) {
			local185 = Static172.anIntArray398[local175] * (256 - local175) / 256 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			for (local192 = 0; local192 < local185; local192++) {
				@Pc(342) int local342 = local158++;
				local156--;
				Static53.aClass3_Sub1_Sub3_Sub4_45.anIntArray336[local342] = Static67.aClass3_Sub1_Sub3_Sub4_13.anIntArray336[local156];
			}
			for (local198 = local185; local198 < 128; local198++) {
				local213 = Static17.anIntArray397[local14++];
				local156--;
				local218 = Static67.aClass3_Sub1_Sub3_Sub4_13.anIntArray336[local156];
				if (local213 == 0) {
					Static53.aClass3_Sub1_Sub3_Sub4_45.anIntArray336[local158++] = local218;
				} else {
					@Pc(379) int local379 = local213;
					@Pc(384) int local384 = 256 - local213;
					local213 = Static122.anIntArray72[local213];
					Static53.aClass3_Sub1_Sub3_Sub4_45.anIntArray336[local158++] = (local379 * (local213 & 0xFF00) + local384 * (local218 & 0xFF00) & 0xFF0000) + (local379 * (local213 & 0xFF00FF) + (local218 & 0xFF00FF) * local384 & 0xFF00FF00) >> 8;
				}
			}
			local156 += Static67.aClass3_Sub1_Sub3_Sub4_13.anInt3223 + 128;
			local14 += local185;
		}
		Static53.aClass3_Sub1_Sub3_Sub4_45.method2317(637, 9);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method2491() {
		aClass2_6 = null;
		aClass73_1865 = null;
		aClass73_1862 = null;
		aClass73_1864 = null;
		aClass73_1863 = null;
		anIntArray371 = null;
		aClass73_1861 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!sd;I)I")
	public static int method2492(@OriginalArg(0) Class73 arg0) {
		if (Static104.anInt2351 == 1) {
			return 7;
		} else if (arg0.method2434(Static121.aClass73_1600)) {
			return 1;
		} else if (arg0.method2434(Static162.aClass73_1927)) {
			return 1;
		} else if (arg0.method2434(Static4.aClass73_54)) {
			return 2;
		} else if (arg0.method2434(aClass73_1864)) {
			return 2;
		} else if (arg0.method2434(Static109.aClass73_1461)) {
			return 3;
		} else if (arg0.method2434(Static147.aClass73_1810)) {
			return 4;
		} else if (arg0.method2434(Static23.aClass73_375)) {
			return 4;
		} else if (arg0.method2434(Static117.aClass73_1571)) {
			return 5;
		} else if (arg0.method2434(Static165.aClass73_198)) {
			return 6;
		} else {
			return 0;
		}
	}
}
