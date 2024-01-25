import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
	public static int anInt4206;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
	public static int anInt4203 = 0;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
	public static void method3475() {
		for (@Pc(10) int local10 = 0; local10 < Static220.anInt4569; local10++) {
			Static526.aClass10Array3[local10] = null;
		}
		Static220.anInt4569 = 0;
		@Pc(26) int local26;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static330.anInt4381; local23++) {
			for (local26 = 0; local26 < Static347.anInt6411; local26++) {
				for (local29 = 0; local29 < Static191.anInt6006; local29++) {
					@Pc(38) Class217 local38 = Static440.aClass217ArrayArrayArray3[local23][local29][local26];
					if (local38 != null) {
						if (local38.aShort87 > 0) {
							local38.aShort87 = (short) (local38.aShort87 * -1);
						}
						if (local38.aShort88 > 0) {
							local38.aShort88 = (short) (local38.aShort88 * -1);
						}
					}
				}
			}
		}
		for (local26 = 0; local26 < Static330.anInt4381; local26++) {
			for (local29 = 0; local29 < Static347.anInt6411; local29++) {
				for (@Pc(86) int local86 = 0; local86 < Static191.anInt6006; local86++) {
					@Pc(95) Class217 local95 = Static440.aClass217ArrayArrayArray3[local26][local86][local29];
					if (local95 != null) {
						@Pc(118) boolean local118 = Static440.aClass217ArrayArrayArray3[0][local86][local29] != null && Static440.aClass217ArrayArrayArray3[0][local86][local29].aClass217_1 != null;
						@Pc(126) int local126;
						@Pc(128) int local128;
						@Pc(142) Class217 local142;
						@Pc(150) int local150;
						@Pc(305) int local305;
						@Pc(319) int local319;
						@Pc(327) int local327;
						@Pc(345) int local345;
						@Pc(352) int local352;
						@Pc(356) int local356;
						@Pc(360) int local360;
						@Pc(367) int local367;
						@Pc(406) int local406;
						@Pc(409) int local409;
						if (local95.aShort87 < 0) {
							local126 = local29;
							local128 = local29;
							local142 = Static440.aClass217ArrayArrayArray3[local26][local86][local29 - 1];
							local150 = Static178.aClass112Array2[local26].method7819(local29, local86);
							while (local126 > 0 && local142 != null && local142.aShort87 < 0 && local142.aShort87 == local95.aShort87 && local142.aShort90 == local95.aShort90 && Static178.aClass112Array2[local26].method7819(local126 - 1, local86) == local150 && (local126 - 1 <= 0 || local150 == Static178.aClass112Array2[local26].method7819(local126 - 2, local86))) {
								local126--;
								local142 = Static440.aClass217ArrayArrayArray3[local26][local86][local126 - 1];
							}
							for (local142 = Static440.aClass217ArrayArrayArray3[local26][local86][local29 + 1]; local128 < Static191.anInt6006 && local142 != null && local142.aShort87 < 0 && local95.aShort87 == local142.aShort87 && local142.aShort90 == local95.aShort90 && local150 == Static178.aClass112Array2[local26].method7819(local128 + 1, local86) && (Static191.anInt6006 <= local128 + 1 || Static178.aClass112Array2[local26].method7819(local128 + 2, local86) == local150); local142 = Static440.aClass217ArrayArrayArray3[local26][local86][local128 + 1]) {
								local128++;
							}
							local305 = local26 + 1 - local26;
							local319 = Static178.aClass112Array2[local118 ? local26 + 1 : local26].method7819(local126, local86);
							local327 = local319 + local305 * local95.aShort87;
							local345 = Static178.aClass112Array2[local118 ? local26 + 1 : local26].method7819(local128 + 1, local86);
							local352 = local305 * local95.aShort87 + local345;
							local356 = local86 << Static415.anInt7579;
							local360 = local126 << Static415.anInt7579;
							local367 = (local128 << Static415.anInt7579) + Static312.anInt5690;
							Static526.aClass10Array3[Static220.anInt4569++] = new Class10(1, local26, local356 + local95.aShort90, local95.aShort90 + local356, local356 + local95.aShort90, local95.aShort90 + local356, local319, local345, local352, local327, local360, local367, local367, local360);
							for (local406 = local26; local406 <= local26; local406++) {
								for (local409 = local126; local409 <= local128; local409++) {
									Static440.aClass217ArrayArrayArray3[local406][local86][local409].aShort87 = (short) (Static440.aClass217ArrayArrayArray3[local406][local86][local409].aShort87 * -1);
								}
							}
						}
						if (local95.aShort88 < 0) {
							local126 = local86;
							local128 = local86;
							local142 = Static440.aClass217ArrayArrayArray3[local26][local86 - 1][local29];
							local150 = Static178.aClass112Array2[local26].method7819(local29, local86);
							while (local126 > 0 && local142 != null && local142.aShort88 < 0 && local95.aShort88 == local142.aShort88 && local95.aShort89 == local142.aShort89 && local150 == Static178.aClass112Array2[local26].method7819(local29, local126 - 1) && (local126 - 1 <= 0 || local150 == Static178.aClass112Array2[local26].method7819(local29, local126 - 2))) {
								local126--;
								local142 = Static440.aClass217ArrayArrayArray3[local26][local126 - 1][local29];
							}
							for (local142 = Static440.aClass217ArrayArrayArray3[local26][local86 + 1][local29]; Static347.anInt6411 > local128 && local142 != null && local142.aShort88 < 0 && local95.aShort88 == local142.aShort88 && local95.aShort89 == local142.aShort89 && Static178.aClass112Array2[local26].method7819(local29, local128 + 1) == local150 && (local128 + 1 >= Static347.anInt6411 || Static178.aClass112Array2[local26].method7819(local29, local128 + 2) == local150); local142 = Static440.aClass217ArrayArrayArray3[local26][local128 + 1][local29]) {
								local128++;
							}
							local305 = local26 + 1 - local26;
							local319 = Static178.aClass112Array2[local118 ? local26 + 1 : local26].method7819(local29, local126);
							local327 = local319 + local305 * local95.aShort88;
							local345 = Static178.aClass112Array2[local118 ? local26 + 1 : local26].method7819(local29, local128 + 1);
							local352 = local305 * local95.aShort88 + local345;
							local356 = local126 << Static415.anInt7579;
							local360 = Static312.anInt5690 + (local128 << Static415.anInt7579);
							local367 = local29 << Static415.anInt7579;
							Static526.aClass10Array3[Static220.anInt4569++] = new Class10(2, local26, local356, local360, local360, local356, local319, local345, local352, local327, local95.aShort89 + local367, local367 - -local95.aShort89, local95.aShort89 + local367, local367 + local95.aShort89);
							for (local406 = local26; local406 <= local26; local406++) {
								for (local409 = local126; local409 <= local128; local409++) {
									Static440.aClass217ArrayArrayArray3[local406][local409][local29].aShort88 = (short) (Static440.aClass217ArrayArrayArray3[local406][local409][local29].aShort88 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static510.aBoolean637 = true;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZ)V")
	public static void method3476() {
		@Pc(17) Class2_Sub50 local17 = Static595.method8194(Static610.aClass310_2, Static104.aClass269_22);
		Static311.method4754(local17);
		for (@Pc(27) Class2_Sub37 local27 = (Class2_Sub37) Static206.aClass222_14.method5474(); local27 != null; local27 = (Class2_Sub37) Static206.aClass222_14.method5472()) {
			if (!local27.method8600()) {
				local27 = (Class2_Sub37) Static206.aClass222_14.method5474();
				if (local27 == null) {
					break;
				}
			}
			if (local27.anInt6849 == 0) {
				Static450.method4870(local27, true, true);
			}
		}
		if (Static97.aClass78_2 != null) {
			Static397.method6022(Static97.aClass78_2);
			Static97.aClass78_2 = null;
		}
	}
}
