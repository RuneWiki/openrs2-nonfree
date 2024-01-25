import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Lclient!br;")
	public static Class26 aClass26_4 = new Class26(64);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIB)V")
	public static void method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static8.anInt208 = arg2;
		Static17.anInt380 = arg0;
		Static105.anInt2155 = arg1;
		Static147.anInt2898 = arg3;
		Static132.anInt2569 = arg4;
		if (Static17.anInt380 >= 100) {
			@Pc(27) int local27 = Static105.anInt2155 * 128 + 64;
			@Pc(33) int local33 = Static132.anInt2569 * 128 + 64;
			@Pc(42) int local42 = Static16.method362(local27, local33, Static285.anInt5511) - Static8.anInt208;
			@Pc(47) int local47 = local27 - Static221.anInt4363;
			@Pc(52) int local52 = local42 - Static194.anInt3958;
			@Pc(56) int local56 = local33 - Static164.anInt3425;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local56 * local56 + local47 * local47));
			Static107.anInt2183 = (int) (Math.atan2((double) local52, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static5.anInt99 = (int) (Math.atan2((double) local47, (double) local56) * -2607.5945876176133D) & 0x3FFF;
			if (Static107.anInt2183 < 1024) {
				Static107.anInt2183 = 1024;
			}
			if (Static107.anInt2183 > 3072) {
				Static107.anInt2183 = 3072;
			}
		}
		Static81.anInt1609 = 2;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
	public static void method1159() {
		Static111.aClass195_18.method5032();
		for (@Pc(21) Class1_Sub41 local21 = (Class1_Sub41) Static175.aClass195_36.method5029(); local21 != null; local21 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
			if (local21.anInt6339 < 1000) {
				local21.method5710();
				Static111.aClass195_18.method5018(local21);
			}
		}
		Static111.aClass195_18.method5020(Static175.aClass195_36);
		if (Static46.aClass177_2 != null || (Static317.aClass177_22 != null || Static112.anInt4022 > 0)) {
			return;
		}
		@Pc(58) int local58 = Static269.anInt5189;
		@Pc(65) int local65;
		if (!Static179.aBoolean310) {
			if (local58 == 1 && Static277.anInt6207 > 0) {
				local65 = ((Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248).anInt6339;
				if (local65 == 20 || local65 == 7 || local65 == 2 || local65 == 17 || local65 == 30 || local65 == 26 || local65 == 37 || local65 == 41 || local65 == 45 || local65 == 9 || local65 == 43 || local65 == 1004) {
					@Pc(325) Class1_Sub41 local325 = (Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248;
					@Pc(330) Class177 local330 = Static140.method2694(local325.anInt6340);
					@Pc(333) Class1_Sub35 local333 = Static47.method1096(local330);
					if (local333.method4894()) {
						Static192.aBoolean589 = false;
						Static304.anInt5855 = 0;
						if (Static46.aClass177_2 != null) {
							Static133.method2517(Static46.aClass177_2);
						}
						Static46.aClass177_2 = Static140.method2694(local325.anInt6340);
						Static127.anInt2492 = Static179.anInt3690;
						Static154.anInt3087 = Static178.anInt3687;
						Static255.anInt5009 = local325.anInt6347;
						Static133.method2517(Static46.aClass177_2);
						return;
					}
				}
			}
			if (local58 <= 0 && Static240.anInt4660 > 0) {
				local58 = Static240.anInt4660;
			}
			Static240.anInt4660 = 0;
			if (local58 == 1 && (Static77.anInt1554 == 1 && Static277.anInt6207 > 2 || Static154.method2926())) {
				local58 = 2;
			}
			if (local58 == 2 && Static277.anInt6207 > 0) {
				Static273.method4761(Static178.anInt3687, Static179.anInt3690);
			}
			if (local58 != 1 || Static277.anInt6207 <= 0) {
				return;
			}
			Static8.method287();
			return;
		}
		@Pc(67) int local67;
		if (local58 != 1) {
			local65 = Static179.anInt3693;
			local67 = Static295.anInt5742;
			if (Static13.anInt269 - 10 > local65 || local65 > Static139.anInt2759 + Static13.anInt269 + 10 || Static288.anInt6178 - 10 > local67 || local67 > Static288.anInt6178 + Static115.anInt2299 + 10) {
				Static179.aBoolean310 = false;
				Static50.method1133(Static115.anInt2299, Static139.anInt2759, Static13.anInt269, Static288.anInt6178);
			}
		}
		if (local58 != 1) {
			return;
		}
		local65 = Static13.anInt269;
		local67 = Static288.anInt6178;
		@Pc(118) int local118 = Static139.anInt2759;
		@Pc(120) int local120 = Static179.anInt3690;
		@Pc(122) int local122 = Static178.anInt3687;
		@Pc(124) int local124 = -1;
		@Pc(142) int local142;
		for (@Pc(126) int local126 = 0; local126 < Static277.anInt6207; local126++) {
			if (Static273.aBoolean458) {
				local142 = (Static277.anInt6207 - local126 - 1) * 16 + local67 + 33;
				if (local65 < local120 && local120 < local118 + local65 && local142 - 13 < local122 && local122 < local142 + 4) {
					local124 = local126;
				}
			} else {
				local142 = (Static277.anInt6207 - local126 - 1) * 16 + local67 + 31;
				if (local120 > local65 && local120 < local118 + local65 && local122 > local142 - 13 && local122 < local142 + 3) {
					local124 = local126;
				}
			}
		}
		if (local124 != -1) {
			local142 = 0;
			@Pc(223) Class76 local223 = new Class76(Static175.aClass195_36);
			for (@Pc(228) Class1_Sub41 local228 = (Class1_Sub41) local223.method2087(); local228 != null; local228 = (Class1_Sub41) local223.method2085()) {
				if (local124 == local142) {
					Static310.method5234(local228);
				}
				local142++;
			}
		}
		Static179.aBoolean310 = false;
		Static50.method1133(Static115.anInt2299, Static139.anInt2759, Static13.anInt269, Static288.anInt6178);
		return;
	}
}
