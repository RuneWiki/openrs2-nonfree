import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "Z")
	public static boolean aBoolean690 = false;

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_95 = new Class344(13, 7);

	@OriginalMember(owner = "client!uv", name = "C", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_96 = new Class344(10, 8);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!jb;I)I")
	public static int method7654(@OriginalArg(0) Class161 arg0) {
		if (arg0 == Static72.aClass161_4) {
			return 6407;
		} else if (arg0 == Static151.aClass161_6) {
			return 6408;
		} else if (Static129.aClass161_5 == arg0) {
			return 6406;
		} else if (arg0 == Static206.aClass161_20) {
			return 6409;
		} else if (Static470.aClass161_16 == arg0) {
			return 6410;
		} else if (arg0 == Static1.aClass161_12) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZLclient!d;I)V")
	public static void method7655(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class21_Sub1_Sub1_Sub1_Sub1 arg1) {
		if (Static384.anInt7556 >= 400) {
			return;
		}
		@Pc(12) Class51 local12 = arg1.aClass51_1;
		if (local12.anIntArray61 != null) {
			local12 = local12.method1371(Static523.aClass173_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean131) {
			return;
		}
		@Pc(30) String local30 = local12.aString16;
		if (local12.anInt1618 != 0) {
			@Pc(50) String local50 = Static162.aClass128_1 == Static403.aClass128_3 ? Static223.aClass152_34.method3624(Static142.anInt3088) : Static223.aClass152_32.method3624(Static142.anInt3088);
			local30 = local30 + Static333.method5094(local12.anInt1618, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287) + " (" + local50 + local12.anInt1618 + ")";
		}
		if (Static430.aBoolean586 && !arg0) {
			@Pc(87) Class275 local87 = Static494.anInt9306 == -1 ? null : Static245.aClass107_2.method2503(Static494.anInt9306);
			if ((Static264.anInt5328 & 0x2) != 0 && (local87 == null || local12.method1363(Static494.anInt9306, local87.anInt8186) != local87.anInt8186)) {
				Static437.method6478(0, (long) arg1.anInt4256, -1, 0, true, Static317.aString131, 11, Static393.aString154 + " -> <col=ffff00>" + local30, false, Static398.anInt7799);
			}
		}
		if (!arg0) {
			@Pc(137) String[] local137 = local12.aStringArray3;
			if (Static327.aBoolean598) {
				local137 = Static322.method5011(local137);
			}
			@Pc(147) int local147;
			if (local137 != null) {
				for (local147 = 4; local147 >= 0; local147--) {
					if (local137[local147] != null && (local12.aByte15 == 0 || !local137[local147].equalsIgnoreCase(Static223.aClass152_27.method3624(Static142.anInt3088)))) {
						@Pc(167) byte local167 = 0;
						if (local147 == 0) {
							local167 = 49;
						}
						@Pc(176) int local176 = Static542.anInt9892;
						if (local147 == 1) {
							local167 = 25;
						}
						if (local147 == 2) {
							local167 = 60;
						}
						if (local147 == 3) {
							local167 = 18;
						}
						if (local147 == local12.anInt1606) {
							local176 = local12.anInt1590;
						}
						if (local147 == 4) {
							local167 = 51;
						}
						if (local147 == local12.anInt1619) {
							local176 = local12.anInt1593;
						}
						Static437.method6478(0, (long) arg1.anInt4256, -1, 0, true, local137[local147], local167, "<col=ffff00>" + local30, false, local137[local147].equalsIgnoreCase(Static223.aClass152_27.method3624(Static142.anInt3088)) ? local12.anInt1591 : local176);
					}
				}
			}
			if (local12.aByte15 == 1 && local137 != null) {
				for (local147 = 4; local147 >= 0; local147--) {
					if (local137[local147] != null && local137[local147].equalsIgnoreCase(Static223.aClass152_27.method3624(Static142.anInt3088))) {
						@Pc(287) short local287 = 0;
						if (local12.anInt1618 > Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287) {
							local287 = 2000;
						}
						@Pc(300) short local300 = 0;
						if (local147 == 0) {
							local300 = 49;
						}
						if (local147 == 1) {
							local300 = 25;
						}
						if (local147 == 2) {
							local300 = 60;
						}
						if (local147 == 3) {
							local300 = 18;
						}
						if (local147 == 4) {
							local300 = 51;
						}
						if (local300 != 0) {
							local300 += local287;
						}
						Static437.method6478(0, (long) arg1.anInt4256, -1, 0, true, local137[local147], local300, "<col=ffff00>" + local30, false, local12.anInt1591);
					}
				}
			}
		}
		Static437.method6478(0, (long) arg1.anInt4256, -1, 0, true, Static223.aClass152_26.method3624(Static142.anInt3088), 1004, "<col=ffff00>" + local30, arg0, Static112.anInt2571);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)I")
	public static int method7656(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
