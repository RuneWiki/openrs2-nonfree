import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
	public static int anInt4436 = 0;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	public static int anInt4445 = 0;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
	public static int anInt4446 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	public static void method3517() {
		Static216.aClass135_24.method3317();
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	public static void method3518() {
		@Pc(5) int local5 = Static188.anInt3900 * 128 + 64;
		@Pc(23) int local23 = Static189.anInt3906 * 128 + 64;
		@Pc(32) int local32 = Static20.method383(local23, Static140.anInt3034, local5) - Static88.anInt1963;
		if (Static238.anInt3833 >= 100) {
			Static239.anInt4738 = Static189.anInt3906 * 128 + 64;
			Static69.anInt1504 = Static188.anInt3900 * 128 + 64;
			Static297.anInt5618 = Static20.method383(Static239.anInt4738, Static140.anInt3034, Static69.anInt1504) - Static88.anInt1963;
		} else {
			if (local32 > Static297.anInt5618) {
				Static297.anInt5618 += Static5.anInt179 + (local32 - Static297.anInt5618) * Static238.anInt3833 / 1000;
				if (Static297.anInt5618 > local32) {
					Static297.anInt5618 = local32;
				}
			}
			if (Static239.anInt4738 < local23) {
				Static239.anInt4738 += (local23 - Static239.anInt4738) * Static238.anInt3833 / 1000 + Static5.anInt179;
				if (Static239.anInt4738 > local23) {
					Static239.anInt4738 = local23;
				}
			}
			if (local5 > Static69.anInt1504) {
				Static69.anInt1504 += Static5.anInt179 + Static238.anInt3833 * (local5 - Static69.anInt1504) / 1000;
				if (local5 < Static69.anInt1504) {
					Static69.anInt1504 = local5;
				}
			}
			if (Static239.anInt4738 > local23) {
				Static239.anInt4738 -= Static5.anInt179 + (Static239.anInt4738 - local23) * Static238.anInt3833 / 1000;
				if (Static239.anInt4738 < local23) {
					Static239.anInt4738 = local23;
				}
			}
			if (local32 < Static297.anInt5618) {
				Static297.anInt5618 -= Static5.anInt179 + Static238.anInt3833 * (Static297.anInt5618 - local32) / 1000;
				if (Static297.anInt5618 < local32) {
					Static297.anInt5618 = local32;
				}
			}
			if (Static69.anInt1504 > local5) {
				Static69.anInt1504 -= Static5.anInt179 + Static238.anInt3833 * (Static69.anInt1504 - local5) / 1000;
				if (local5 > Static69.anInt1504) {
					Static69.anInt1504 = local5;
				}
			}
		}
		local5 = Static244.anInt4843 * 128 + 64;
		local23 = Static76.anInt1612 * 128 + 64;
		local32 = Static20.method383(local23, Static140.anInt3034, local5) - Static219.anInt4351;
		@Pc(237) int local237 = local32 - Static297.anInt5618;
		@Pc(242) int local242 = local23 - Static239.anInt4738;
		@Pc(246) int local246 = local5 - Static69.anInt1504;
		@Pc(258) int local258 = (int) Math.sqrt((double) (local246 * local246 + local242 * local242));
		@Pc(269) int local269 = (int) (Math.atan2((double) local237, (double) local258) * 325.949D) & 0x7FF;
		@Pc(280) int local280 = (int) (-325.949D * Math.atan2((double) local246, (double) local242)) & 0x7FF;
		@Pc(285) int local285 = local280 - Static91.anInt2040;
		if (local269 < 128) {
			local269 = 128;
		}
		if (local269 > 383) {
			local269 = 383;
		}
		if (Static134.anInt2950 < local269) {
			Static134.anInt2950 += (local269 - Static134.anInt2950) * Static57.anInt1261 / 1000 + Static186.anInt3847;
			if (local269 < Static134.anInt2950) {
				Static134.anInt2950 = local269;
			}
		}
		if (Static134.anInt2950 > local269) {
			Static134.anInt2950 -= (Static134.anInt2950 - local269) * Static57.anInt1261 / 1000 + Static186.anInt3847;
			if (Static134.anInt2950 < local269) {
				Static134.anInt2950 = local269;
			}
		}
		if (local285 > 1024) {
			local285 -= 2048;
		}
		if (local285 < -1024) {
			local285 += 2048;
		}
		if (local285 > 0) {
			Static91.anInt2040 += Static57.anInt1261 * local285 / 1000 + Static186.anInt3847;
			Static91.anInt2040 &= 0x7FF;
		}
		if (local285 < 0) {
			Static91.anInt2040 -= Static186.anInt3847 + -local285 * Static57.anInt1261 / 1000;
			Static91.anInt2040 &= 0x7FF;
		}
		@Pc(395) int local395 = local280 - Static91.anInt2040;
		if (local395 > 1024) {
			local395 -= 2048;
		}
		if (local395 < -1024) {
			local395 += 2048;
		}
		if (local395 < 0 && local285 > 0 || local395 > 0 && local285 < 0) {
			Static91.anInt2040 = local280;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg2) {
			Static18.method337(arg4, arg2, arg3, arg5, arg6, arg1);
		} else if (arg4 - arg2 >= anInt4436 && arg4 + arg2 <= Static68.anInt1451 && Static297.anInt5619 <= arg1 - arg0 && Static49.anInt1129 >= arg1 + arg0) {
			Static198.method36(arg1, arg0, arg4, arg5, arg3, arg6, arg2);
		} else {
			Static61.method1099(arg5, arg4, arg2, arg6, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V")
	public static void method3521() {
		Static221.aClass1_Sub5_Sub2_2.method1647();
		Static299.anInt5641 = 1;
		Static14.aClass91_14 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Lclient!rj;")
	public static Class55 method3522() {
		try {
			return (Class55) Class.forName("Class55_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)[Lclient!pn;")
	public static Class1_Sub2_Sub11[] method3524() {
		@Pc(4) Class1_Sub2_Sub11[] local4 = new Class1_Sub2_Sub11[Static199.anInt4056];
		for (@Pc(11) int local11 = 0; local11 < Static199.anInt4056; local11++) {
			@Pc(18) byte[] local18 = Static268.aByteArrayArray13[local11];
			@Pc(26) int local26 = Static31.anIntArray78[local11] * Static44.anIntArray97[local11];
			if (Static130.aBooleanArray29[local11]) {
				@Pc(33) int[] local33 = new int[local26];
				@Pc(37) byte[] local37 = Static23.aByteArrayArray3[local11];
				for (@Pc(39) int local39 = 0; local39 < local26; local39++) {
					local33[local39] = (local37[local39] & 0xFF) << 24 | Static133.anIntArray266[local18[local39] & 0xFF];
				}
				if (Static277.aBoolean412) {
					local4[local11] = new Class1_Sub2_Sub11_Sub1_Sub1(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local11], Static289.anIntArray543[local11], Static31.anIntArray78[local11], Static44.anIntArray97[local11], local33);
				} else {
					local4[local11] = new Class1_Sub2_Sub11_Sub2_Sub1(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local11], Static289.anIntArray543[local11], Static31.anIntArray78[local11], Static44.anIntArray97[local11], local33);
				}
			} else {
				@Pc(118) int[] local118 = new int[local26];
				for (@Pc(120) int local120 = 0; local120 < local26; local120++) {
					local118[local120] = Static133.anIntArray266[local18[local120] & 0xFF];
				}
				if (Static277.aBoolean412) {
					local4[local11] = new Class1_Sub2_Sub11_Sub1(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local11], Static289.anIntArray543[local11], Static31.anIntArray78[local11], Static44.anIntArray97[local11], local118);
				} else {
					local4[local11] = new Class1_Sub2_Sub11_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local11], Static289.anIntArray543[local11], Static31.anIntArray78[local11], Static44.anIntArray97[local11], local118);
				}
			}
		}
		Static91.method1595();
		return local4;
	}
}
