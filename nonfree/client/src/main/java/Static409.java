import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	public static int anInt9440;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V")
	public static void method7705() {
		Static464.method6502(Static547.aClass292_14);
		Static315.anInt5383++;
		if (Static90.aBoolean718 && Static577.aBoolean723) {
			@Pc(28) int local28 = Static164.aClass173_1.method6487();
			@Pc(32) int local32 = Static164.aClass173_1.method6489();
			local32 -= Static565.anInt6649;
			local28 -= Static66.anInt1325;
			if (local28 < Static428.anInt7474) {
				local28 = Static428.anInt7474;
			}
			if (Static529.anInt4675 > local32) {
				local32 = Static529.anInt4675;
			}
			if (Static473.aClass292_10.anInt7963 + Static428.anInt7474 < Static547.aClass292_14.anInt7963 + local28) {
				local28 = Static473.aClass292_10.anInt7963 + Static428.anInt7474 - Static547.aClass292_14.anInt7963;
			}
			if (Static473.aClass292_10.anInt7912 + Static529.anInt4675 < local32 - -Static547.aClass292_14.anInt7912) {
				local32 = Static529.anInt4675 + Static473.aClass292_10.anInt7912 - Static547.aClass292_14.anInt7912;
			}
			@Pc(104) int local104 = local28 + Static473.aClass292_10.anInt7957 - Static428.anInt7474;
			@Pc(111) int local111 = Static473.aClass292_10.anInt7911 + local32 - Static529.anInt4675;
			@Pc(164) Class6_Sub43 local164;
			if (Static164.aClass173_1.method6493()) {
				if (Static547.aClass292_14.anInt7895 < Static315.anInt5383) {
					@Pc(207) int local207 = local28 - Static304.anInt5592;
					@Pc(211) int local211 = local32 - Static29.anInt855;
					if (local207 > Static547.aClass292_14.anInt7884 || local207 < -Static547.aClass292_14.anInt7884 || Static547.aClass292_14.anInt7884 < local211 || local211 < -Static547.aClass292_14.anInt7884) {
						Static226.aBoolean322 = true;
					}
				}
				if (Static547.aClass292_14.anObjectArray30 != null && Static226.aBoolean322) {
					local164 = new Class6_Sub43();
					local164.anInt8284 = local111;
					local164.aClass292_12 = Static547.aClass292_14;
					local164.anObjectArray34 = Static547.aClass292_14.anObjectArray30;
					local164.anInt8283 = local104;
					Static446.method6319(local164);
				}
			} else {
				if (Static226.aBoolean322) {
					Static489.method6689();
					if (Static547.aClass292_14.anObjectArray5 != null) {
						local164 = new Class6_Sub43();
						local164.anInt8284 = local111;
						local164.anInt8283 = local104;
						local164.anObjectArray34 = Static547.aClass292_14.anObjectArray5;
						local164.aClass292_12 = Static547.aClass292_14;
						local164.aClass292_11 = Static408.aClass292_6;
						Static446.method6319(local164);
					}
					if (Static408.aClass292_6 != null && Static67.method1365(Static547.aClass292_14) != null) {
						Static564.method7579(Static547.aClass292_14, Static408.aClass292_6);
					}
				} else if ((Static51.anInt1132 == 1 || Static176.method3232()) && Static421.anInt7365 > 2) {
					Static92.method1684(Static565.anInt6649 + Static29.anInt855, Static66.anInt1325 + Static304.anInt5592);
				} else if (Static472.method6556()) {
					Static92.method1684(Static565.anInt6649 + Static29.anInt855, Static66.anInt1325 + Static304.anInt5592);
				}
				Static547.aClass292_14 = null;
			}
		} else if (Static315.anInt5383 > 1) {
			Static547.aClass292_14 = null;
		}
	}
}
