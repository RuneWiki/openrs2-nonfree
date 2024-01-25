import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
	public static int anInt4075 = 0;

	@OriginalMember(owner = "client!mr", name = "G", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_94 = new Class85("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!mr", name = "K", descriptor = "I")
	public static int anInt4080 = 0;

	@OriginalMember(owner = "client!mr", name = "M", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_95 = new Class85("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BJ)V")
	public static void method3771(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)V")
	public static void method3776() {
		@Pc(9) int local9 = Static181.anInt3653 * 128 + 64;
		@Pc(15) int local15 = Static238.anInt4735 * 128 + 64;
		@Pc(23) int local23 = Static208.method3804(Static239.anInt4811, local9, local15) - Static274.anInt5431;
		if (Static263.anInt5213 >= 100) {
			Static271.anInt5301 = Static181.anInt3653 * 128 + 64;
			Static21.anInt466 = Static238.anInt4735 * 128 + 64;
			Static102.anInt1934 = Static208.method3804(Static239.anInt4811, Static271.anInt5301, Static21.anInt466) - Static274.anInt5431;
		} else {
			if (local9 > Static271.anInt5301) {
				Static271.anInt5301 += Static28.anInt709 + (local9 - Static271.anInt5301) * Static263.anInt5213 / 1000;
				if (Static271.anInt5301 > local9) {
					Static271.anInt5301 = local9;
				}
			}
			if (local9 < Static271.anInt5301) {
				Static271.anInt5301 -= (Static271.anInt5301 - local9) * Static263.anInt5213 / 1000 + Static28.anInt709;
				if (local9 > Static271.anInt5301) {
					Static271.anInt5301 = local9;
				}
			}
			if (local23 > Static102.anInt1934) {
				Static102.anInt1934 += Static28.anInt709 + Static263.anInt5213 * (local23 - Static102.anInt1934) / 1000;
				if (local23 < Static102.anInt1934) {
					Static102.anInt1934 = local23;
				}
			}
			if (Static102.anInt1934 > local23) {
				Static102.anInt1934 -= Static28.anInt709 + (Static102.anInt1934 - local23) * Static263.anInt5213 / 1000;
				if (Static102.anInt1934 < local23) {
					Static102.anInt1934 = local23;
				}
			}
			if (local15 > Static21.anInt466) {
				Static21.anInt466 += Static263.anInt5213 * (local15 - Static21.anInt466) / 1000 + Static28.anInt709;
				if (local15 < Static21.anInt466) {
					Static21.anInt466 = local15;
				}
			}
			if (local15 < Static21.anInt466) {
				Static21.anInt466 -= (Static21.anInt466 - local15) * Static263.anInt5213 / 1000 + Static28.anInt709;
				if (local15 > Static21.anInt466) {
					Static21.anInt466 = local15;
				}
			}
		}
		local9 = Static103.anInt5457 * 128 + 64;
		local15 = Static120.anInt2266 * 128 + 64;
		local23 = Static208.method3804(Static239.anInt4811, local9, local15) - Static323.anInt6231;
		@Pc(222) int local222 = local9 - Static271.anInt5301;
		@Pc(227) int local227 = local23 - Static102.anInt1934;
		@Pc(231) int local231 = local15 - Static21.anInt466;
		@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local231 * local231));
		@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 2607.5945876176133D) & 0x3FFF;
		if (local254 < 1024) {
			local254 = 1024;
		}
		@Pc(272) int local272 = (int) (-2607.5945876176133D * Math.atan2((double) local222, (double) local231)) & 0x3FFF;
		if (local254 > 3072) {
			local254 = 3072;
		}
		if (Static42.anInt731 < local254) {
			Static42.anInt731 += Static30.anInt601 + (local254 - Static42.anInt731 >> 3) * Static350.anInt6717 / 1000 << 3;
			if (Static42.anInt731 > local254) {
				Static42.anInt731 = local254;
			}
		}
		if (Static42.anInt731 > local254) {
			Static42.anInt731 -= Static30.anInt601 + (Static42.anInt731 - local254 >> 3) * Static350.anInt6717 / 1000 << 3;
			if (local254 > Static42.anInt731) {
				Static42.anInt731 = local254;
			}
		}
		@Pc(338) int local338 = local272 - Static258.anInt5088;
		if (local338 > 8192) {
			local338 -= 16384;
		}
		if (local338 < -8192) {
			local338 += 16384;
		}
		local338 >>= 0x3;
		if (local338 > 0) {
			Static258.anInt5088 += Static30.anInt601 + Static350.anInt6717 * local338 / 1000 << 3;
			Static258.anInt5088 &= 0x3FFF;
		}
		if (local338 < 0) {
			Static258.anInt5088 -= -local338 * Static350.anInt6717 / 1000 + Static30.anInt601 << 3;
			Static258.anInt5088 &= 0x3FFF;
		}
		@Pc(398) int local398 = local272 - Static258.anInt5088;
		if (local398 > 8192) {
			local398 -= 16384;
		}
		if (local398 < -8192) {
			local398 += 16384;
		}
		if (local398 < 0 && local338 > 0 || local398 > 0 && local338 < 0) {
			Static258.anInt5088 = local272;
		}
		Static304.anInt5915 = 0;
	}
}
