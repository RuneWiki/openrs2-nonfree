import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!efa;")
	public static Class89 aClass89_4;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "[Lclient!sg;")
	public static final Class305[] aClass305Array1 = new Class305[37];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)Z")
	public static boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static480.aBoolean590 || !Static70.aBoolean94) {
			return false;
		} else if (Static560.anInt9310 < 100) {
			return false;
		} else if (Static348.method5647(arg1, arg3, arg2)) {
			@Pc(31) int local31 = arg2 << Static485.anInt8241;
			@Pc(35) int local35 = arg1 << Static485.anInt8241;
			if (Static141.method2404(Static188.anInt3555, arg0, local35, Static188.anInt3555, Static637.aClass91Array4[arg3].method7724(arg1, arg2), local31)) {
				Static74.anInt1446++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public static void method6309() {
		for (@Pc(7) int local7 = 0; local7 < Static576.anInt9431; local7++) {
			Static473.aClass153Array4[local7] = null;
		}
		Static576.anInt9431 = 0;
		@Pc(29) int local29;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static603.anInt9778; local25++) {
			for (local29 = 0; local29 < Static573.anInt6750; local29++) {
				for (local33 = 0; local33 < Static547.anInt9143; local33++) {
					@Pc(43) Class351 local43 = Static567.aClass351ArrayArrayArray4[local25][local33][local29];
					if (local43 != null) {
						if (local43.aShort119 > 0) {
							local43.aShort119 = (short) (local43.aShort119 * -1);
						}
						if (local43.aShort116 > 0) {
							local43.aShort116 = (short) (local43.aShort116 * -1);
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < Static603.anInt9778; local29++) {
			for (local33 = 0; local33 < Static573.anInt6750; local33++) {
				for (@Pc(90) int local90 = 0; local90 < Static547.anInt9143; local90++) {
					@Pc(100) Class351 local100 = Static567.aClass351ArrayArrayArray4[local29][local90][local33];
					if (local100 != null) {
						@Pc(123) boolean local123 = Static567.aClass351ArrayArrayArray4[0][local90][local33] != null && Static567.aClass351ArrayArrayArray4[0][local90][local33].aClass351_1 != null;
						@Pc(128) int local128;
						@Pc(130) int local130;
						@Pc(144) Class351 local144;
						@Pc(154) int local154;
						@Pc(323) int local323;
						@Pc(339) int local339;
						@Pc(346) int local346;
						@Pc(362) int local362;
						@Pc(369) int local369;
						@Pc(373) int local373;
						@Pc(377) int local377;
						@Pc(383) int local383;
						@Pc(421) int local421;
						@Pc(425) int local425;
						if (local100.aShort116 < 0) {
							local128 = local33;
							local130 = local33;
							local144 = Static567.aClass351ArrayArrayArray4[local29][local90][local33 - 1];
							local154 = Static518.aClass91Array2[local29].method7724(local33, local90);
							while (local128 > 0 && local144 != null && local144.aShort116 < 0 && local144.aShort116 == local100.aShort116 && local144.aShort117 == local100.aShort117 && local154 == Static518.aClass91Array2[local29].method7724(local128 - 1, local90) && (local128 - 1 <= 0 || local154 == Static518.aClass91Array2[local29].method7724(local128 - 2, local90))) {
								local128--;
								local144 = Static567.aClass351ArrayArrayArray4[local29][local90][local128 - 1];
							}
							for (local144 = Static567.aClass351ArrayArrayArray4[local29][local90][local33 + 1]; local130 < Static547.anInt9143 && local144 != null && local144.aShort116 < 0 && local144.aShort116 == local100.aShort116 && local144.aShort117 == local100.aShort117 && Static518.aClass91Array2[local29].method7724(local130 + 1, local90) == local154 && (Static547.anInt9143 <= local130 + 1 || Static518.aClass91Array2[local29].method7724(local130 + 2, local90) == local154); local144 = Static567.aClass351ArrayArrayArray4[local29][local90][local130 + 1]) {
								local130++;
							}
							local323 = local29 + 1 - local29;
							local339 = Static518.aClass91Array2[local123 ? local29 + 1 : local29].method7724(local128, local90);
							local346 = local100.aShort116 * local323 + local339;
							local362 = Static518.aClass91Array2[local123 ? local29 + 1 : local29].method7724(local130 + 1, local90);
							local369 = local100.aShort116 * local323 + local362;
							local373 = local90 << Static485.anInt8241;
							local377 = local128 << Static485.anInt8241;
							local383 = Static188.anInt3555 + (local130 << Static485.anInt8241);
							Static473.aClass153Array4[Static576.anInt9431++] = new Class153(1, local29, local100.aShort117 + local373, local100.aShort117 + local373, local100.aShort117 + local373, local100.aShort117 + local373, local339, local362, local369, local346, local377, local383, local383, local377);
							for (local421 = local29; local421 <= local29; local421++) {
								for (local425 = local128; local425 <= local130; local425++) {
									Static567.aClass351ArrayArrayArray4[local421][local90][local425].aShort116 = (short) (Static567.aClass351ArrayArrayArray4[local421][local90][local425].aShort116 * -1);
								}
							}
						}
						if (local100.aShort119 < 0) {
							local128 = local90;
							local130 = local90;
							local144 = Static567.aClass351ArrayArrayArray4[local29][local90 - 1][local33];
							local154 = Static518.aClass91Array2[local29].method7724(local33, local90);
							while (local128 > 0 && local144 != null && local144.aShort119 < 0 && local100.aShort119 == local144.aShort119 && local144.aShort118 == local100.aShort118 && local154 == Static518.aClass91Array2[local29].method7724(local33, local128 - 1) && (local128 - 1 <= 0 || Static518.aClass91Array2[local29].method7724(local33, local128 - 2) == local154)) {
								local128--;
								local144 = Static567.aClass351ArrayArrayArray4[local29][local128 - 1][local33];
							}
							for (local144 = Static567.aClass351ArrayArrayArray4[local29][local90 + 1][local33]; Static573.anInt6750 > local130 && local144 != null && local144.aShort119 < 0 && local144.aShort119 == local100.aShort119 && local100.aShort118 == local144.aShort118 && local154 == Static518.aClass91Array2[local29].method7724(local33, local130 + 1) && (Static573.anInt6750 <= local130 + 1 || Static518.aClass91Array2[local29].method7724(local33, local130 + 2) == local154); local144 = Static567.aClass351ArrayArrayArray4[local29][local130 + 1][local33]) {
								local130++;
							}
							local323 = local29 + 1 - local29;
							local339 = Static518.aClass91Array2[local123 ? local29 + 1 : local29].method7724(local33, local128);
							local346 = local100.aShort119 * local323 + local339;
							local362 = Static518.aClass91Array2[local123 ? local29 + 1 : local29].method7724(local33, local130 + 1);
							local369 = local362 + local323 * local100.aShort119;
							local373 = local128 << Static485.anInt8241;
							local377 = (local130 << Static485.anInt8241) + Static188.anInt3555;
							local383 = local33 << Static485.anInt8241;
							Static473.aClass153Array4[Static576.anInt9431++] = new Class153(2, local29, local373, local377, local377, local373, local339, local362, local369, local346, local100.aShort118 + local383, local100.aShort118 + local383, local100.aShort118 + local383, local100.aShort118 + local383);
							for (local421 = local29; local421 <= local29; local421++) {
								for (local425 = local128; local425 <= local130; local425++) {
									Static567.aClass351ArrayArrayArray4[local421][local425][local33].aShort119 = (short) (Static567.aClass351ArrayArrayArray4[local421][local425][local33].aShort119 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static365.aBoolean485 = true;
	}
}
