import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ya;)V")
	public static void method4317(@OriginalArg(0) Class51 arg0) {
		for (@Pc(1) int local1 = Static352.anInt5643; local1 < Static315.anInt5183; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static264.anInt4480; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static295.anInt4910; local7++) {
					@Pc(16) Class223 local16 = Static19.aClass223ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class26_Sub3 local21 = local16.aClass26_Sub3_2;
						@Pc(24) Class26_Sub3 local24 = local16.aClass26_Sub3_1;
						if (local21 != null && local21.method5721()) {
							Static238.method3238(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5721()) {
								Static238.method3238(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5712(arg0, 0, 0, 0, local21, false);
								local24.method5715();
							}
							local21.method5715();
						}
						for (@Pc(70) Class270 local70 = local16.aClass270_1; local70 != null; local70 = local70.aClass270_3) {
							@Pc(74) Class26_Sub2 local74 = local70.aClass26_Sub2_2;
							if (local74 != null && local74.method5721()) {
								Static238.method3238(arg0, local74, local1, local4, local7, local74.aShort104 + 1 - local74.aShort105, local74.aShort102 - local74.aShort103 + 1);
								local74.method5715();
							}
						}
						@Pc(111) Class26_Sub4 local111 = local16.aClass26_Sub4_2;
						if (local111 != null && local111.method5721()) {
							Static182.method2646(arg0, local111, local1, local4, local7);
							local111.method5715();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4319(@OriginalArg(0) String arg0) {
		Static240.aString48 = arg0;
		if (Static230.aClass61_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(22) String local22 = Static230.aClass61_4.anApplet1.getParameter("cookieprefix");
			@Pc(27) String local27 = Static230.aClass61_4.anApplet1.getParameter("cookiehost");
			@Pc(42) String local42 = local22 + "settings=" + arg0 + "; version=1; path=/; domain=" + local27;
			if (arg0.length() == 0) {
				local42 = local42 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local42 = local42 + "; Expires=" + Static407.method5109(Static158.method2342() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static468.method5097(Static230.aClass61_4.anApplet1, "document.cookie=\"" + local42 + "\"");
		} catch (@Pc(94) Throwable local94) {
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
	public static void method4323() {
		@Pc(9) int local9 = Static404.anInt7485 * 128 + 64;
		@Pc(15) int local15 = Static63.anInt1215 * 128 + 64;
		@Pc(23) int local23 = Static333.method2748(Static268.anInt4539, local15, local9) - Static150.anInt2821;
		if (Static62.anInt1155 >= 100) {
			Static181.anInt3254 = Static63.anInt1215 * 128 + 64;
			Static46.anInt737 = Static404.anInt7485 * 128 + 64;
			Static212.anInt3801 = Static333.method2748(Static268.anInt4539, Static181.anInt3254, Static46.anInt737) - Static150.anInt2821;
		} else {
			if (local9 > Static46.anInt737) {
				Static46.anInt737 += Static47.anInt746 + (local9 - Static46.anInt737) * Static62.anInt1155 / 1000;
				if (local9 < Static46.anInt737) {
					Static46.anInt737 = local9;
				}
			}
			if (Static46.anInt737 > local9) {
				Static46.anInt737 -= Static47.anInt746 + Static62.anInt1155 * (Static46.anInt737 - local9) / 1000;
				if (Static46.anInt737 < local9) {
					Static46.anInt737 = local9;
				}
			}
			if (local23 > Static212.anInt3801) {
				Static212.anInt3801 += Static62.anInt1155 * (local23 - Static212.anInt3801) / 1000 + Static47.anInt746;
				if (Static212.anInt3801 > local23) {
					Static212.anInt3801 = local23;
				}
			}
			if (local15 > Static181.anInt3254) {
				Static181.anInt3254 += Static47.anInt746 + Static62.anInt1155 * (local15 - Static181.anInt3254) / 1000;
				if (local15 < Static181.anInt3254) {
					Static181.anInt3254 = local15;
				}
			}
			if (local23 < Static212.anInt3801) {
				Static212.anInt3801 -= Static47.anInt746 + (Static212.anInt3801 - local23) * Static62.anInt1155 / 1000;
				if (Static212.anInt3801 < local23) {
					Static212.anInt3801 = local23;
				}
			}
			if (Static181.anInt3254 > local15) {
				Static181.anInt3254 -= (Static181.anInt3254 - local15) * Static62.anInt1155 / 1000 + Static47.anInt746;
				if (Static181.anInt3254 < local15) {
					Static181.anInt3254 = local15;
				}
			}
		}
		local9 = Static448.anInt7378 * 128 + 64;
		local15 = Static453.anInt7459 * 128 + 64;
		local23 = Static333.method2748(Static268.anInt4539, local15, local9) - Static263.anInt4464;
		@Pc(223) int local223 = local9 - Static46.anInt737;
		@Pc(228) int local228 = local23 - Static212.anInt3801;
		@Pc(232) int local232 = local15 - Static181.anInt3254;
		@Pc(243) int local243 = (int) Math.sqrt((double) (local223 * local223 + local232 * local232));
		@Pc(254) int local254 = (int) (Math.atan2((double) local228, (double) local243) * 2607.5945876176133D) & 0x3FFF;
		if (local254 < 1024) {
			local254 = 1024;
		}
		@Pc(277) int local277 = (int) (Math.atan2((double) local223, (double) local232) * -2607.5945876176133D) & 0x3FFF;
		if (local254 > 3072) {
			local254 = 3072;
		}
		if (Static9.anInt55 < local254) {
			Static9.anInt55 += Static131.anInt2511 * (local254 - Static9.anInt55 >> 3) / 1000 + Static316.anInt5194 << 3;
			if (Static9.anInt55 > local254) {
				Static9.anInt55 = local254;
			}
		}
		if (local254 < Static9.anInt55) {
			Static9.anInt55 -= Static316.anInt5194 + Static131.anInt2511 * (Static9.anInt55 - local254 >> 3) / 1000 << 3;
			if (local254 > Static9.anInt55) {
				Static9.anInt55 = local254;
			}
		}
		@Pc(351) int local351 = local277 - Static92.anInt1897;
		if (local351 > 8192) {
			local351 -= 16384;
		}
		if (local351 < -8192) {
			local351 += 16384;
		}
		local351 >>= 0x3;
		if (local351 > 0) {
			Static92.anInt1897 += Static131.anInt2511 * local351 / 1000 + Static316.anInt5194 << 3;
			Static92.anInt1897 &= 0x3FFF;
		}
		if (local351 < 0) {
			Static92.anInt1897 -= Static316.anInt5194 + Static131.anInt2511 * -local351 / 1000 << 3;
			Static92.anInt1897 &= 0x3FFF;
		}
		@Pc(412) int local412 = local277 - Static92.anInt1897;
		if (local412 > 8192) {
			local412 -= 16384;
		}
		if (local412 < -8192) {
			local412 += 16384;
		}
		if (local412 < 0 && local351 > 0 || local412 > 0 && local351 < 0) {
			Static92.anInt1897 = local277;
		}
		Static408.anInt6454 = 0;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)Lclient!mo;")
	public static Class28_Sub4 method4328(@OriginalArg(1) int arg0) {
		@Pc(7) Class169[] local7 = Class7_Sub6.aClass169Array1;
		synchronized (Class7_Sub6.aClass169Array1) {
			@Pc(32) Class28_Sub4 local32;
			if (Class7_Sub6.aClass169Array1.length <= arg0 || Class7_Sub6.aClass169Array1[arg0].method3595()) {
				local32 = new Class28_Sub4();
				local32.aClass28_Sub6Array1 = new Class28_Sub6[arg0];
				for (@Pc(54) int local54 = 0; local54 < arg0; local54++) {
					local32.aClass28_Sub6Array1[local54] = new Class28_Sub6();
				}
			} else {
				local32 = (Class28_Sub4) Class7_Sub6.aClass169Array1[arg0].method3592();
				local32.method5642();
				@Pc(39) int local39 = Static384.anIntArray619[arg0]--;
			}
			return local32;
		}
	}
}
