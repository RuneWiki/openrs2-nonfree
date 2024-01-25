import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "Lclient!vo;")
	public static Class348 aClass348_76;

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
	public static int anInt6929;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5411(@OriginalArg(1) String arg0) {
		if (Static523.aClass210Array1 != null) {
			@Pc(19) Class4_Sub39 local19 = Static32.method999(Static402.aClass356_1, Static271.aClass344_42);
			local19.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(arg0));
			local19.aClass4_Sub13_Sub2_1.method7002(arg0);
			Static50.method1166(local19);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	public static void method5412() {
		@Pc(9) int local9 = Static80.anInt2172 * 512 + 256;
		@Pc(15) int local15 = Static414.anInt7982 * 512 + 256;
		@Pc(24) int local24 = Static461.method6782(local15, Static352.anInt6764, local9) - Static346.anInt6650;
		if (Static297.anInt6022 < 100) {
			if (local9 > Static534.anInt9775) {
				Static534.anInt9775 += Static297.anInt6022 * (local9 - Static534.anInt9775) / 1000 + Static360.anInt6967;
				if (Static534.anInt9775 > local9) {
					Static534.anInt9775 = local9;
				}
			}
			if (Static139.anInt3067 < local24) {
				Static139.anInt3067 += Static360.anInt6967 + Static297.anInt6022 * (local24 - Static139.anInt3067) / 1000;
				if (local24 < Static139.anInt3067) {
					Static139.anInt3067 = local24;
				}
			}
			if (Static534.anInt9775 > local9) {
				Static534.anInt9775 -= Static360.anInt6967 + Static297.anInt6022 * (Static534.anInt9775 - local9) / 1000;
				if (Static534.anInt9775 < local9) {
					Static534.anInt9775 = local9;
				}
			}
			if (local24 < Static139.anInt3067) {
				Static139.anInt3067 -= Static360.anInt6967 + Static297.anInt6022 * (Static139.anInt3067 - local24) / 1000;
				if (Static139.anInt3067 < local24) {
					Static139.anInt3067 = local24;
				}
			}
			if (Static114.anInt2613 < local15) {
				Static114.anInt2613 += (local15 - Static114.anInt2613) * Static297.anInt6022 / 1000 + Static360.anInt6967;
				if (Static114.anInt2613 > local15) {
					Static114.anInt2613 = local15;
				}
			}
			if (Static114.anInt2613 > local15) {
				Static114.anInt2613 -= Static297.anInt6022 * (Static114.anInt2613 - local15) / 1000 + Static360.anInt6967;
				if (Static114.anInt2613 < local15) {
					Static114.anInt2613 = local15;
				}
			}
		} else {
			Static534.anInt9775 = Static80.anInt2172 * 512 + 256;
			Static114.anInt2613 = Static414.anInt7982 * 512 + 256;
			Static139.anInt3067 = Static461.method6782(Static114.anInt2613, Static352.anInt6764, Static534.anInt9775) - Static346.anInt6650;
		}
		local15 = Static533.anInt9769 * 512 + 256;
		local9 = Static191.anInt3980 * 512 + 256;
		local24 = Static461.method6782(local15, Static352.anInt6764, local9) - Static341.anInt6582;
		@Pc(216) int local216 = local9 - Static534.anInt9775;
		@Pc(221) int local221 = local24 - Static139.anInt3067;
		@Pc(226) int local226 = local15 - Static114.anInt2613;
		@Pc(237) int local237 = (int) Math.sqrt((double) (local226 * local226 + local216 * local216));
		@Pc(248) int local248 = (int) (Math.atan2((double) local221, (double) local237) * 2607.5945876176133D) & 0x3FFF;
		if (local248 < 1024) {
			local248 = 1024;
		}
		@Pc(266) int local266 = (int) (-2607.5945876176133D * Math.atan2((double) local216, (double) local226)) & 0x3FFF;
		if (local248 > 3072) {
			local248 = 3072;
		}
		if (Static233.anInt4905 < local248) {
			Static233.anInt4905 += Static458.anInt8765 * (local248 - Static233.anInt4905 >> 3) / 1000 + Static68.anInt1813 << 3;
			if (local248 < Static233.anInt4905) {
				Static233.anInt4905 = local248;
			}
		}
		if (Static233.anInt4905 > local248) {
			Static233.anInt4905 -= Static458.anInt8765 * (Static233.anInt4905 - local248 >> 3) / 1000 + Static68.anInt1813 << 3;
			if (Static233.anInt4905 < local248) {
				Static233.anInt4905 = local248;
			}
		}
		@Pc(330) int local330 = local266 - Static353.anInt6831;
		if (local330 > 8192) {
			local330 -= 16384;
		}
		if (local330 < -8192) {
			local330 += 16384;
		}
		local330 >>= 0x3;
		if (local330 > 0) {
			Static353.anInt6831 += Static458.anInt8765 * local330 / 1000 + Static68.anInt1813 << 3;
			Static353.anInt6831 &= 0x3FFF;
		}
		if (local330 < 0) {
			Static353.anInt6831 -= Static458.anInt8765 * -local330 / 1000 + Static68.anInt1813 << 3;
			Static353.anInt6831 &= 0x3FFF;
		}
		@Pc(389) int local389 = local266 - Static353.anInt6831;
		if (local389 > 8192) {
			local389 -= 16384;
		}
		if (local389 < -8192) {
			local389 += 16384;
		}
		if (local389 < 0 && local330 > 0 || local389 > 0 && local330 < 0) {
			Static353.anInt6831 = local266;
		}
		Static470.anInt8934 = 0;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(III)Z")
	public static boolean method5414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
