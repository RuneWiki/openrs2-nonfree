import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!ht;")
	public static final Class151 aClass151_7 = new Class151();

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Z")
	public static boolean aBoolean513 = false;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!pe;IIII)V")
	public static void method6358(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class269 local9 = arg0.method1025();
		@Pc(27) int local27 = arg0.anInt1248 - arg0.aClass107_7.anInt2613 & 0x3FFF;
		if (arg1 == -1) {
			if (local27 != 0 || arg0.anInt1210 > 25) {
				if (arg3 < 0 && local9.anInt7258 != -1) {
					arg0.aBoolean70 = false;
					arg0.anInt1264 = local9.anInt7258;
				} else if (arg3 <= 0 || local9.anInt7249 == -1) {
					arg0.anInt1264 = local9.anInt7262;
				} else {
					arg0.anInt1264 = local9.anInt7249;
				}
				arg0.aBoolean70 = false;
			} else if (!arg0.aBoolean70 || !local9.method6404(arg0.anInt1264)) {
				arg0.anInt1264 = local9.method6406();
				arg0.aBoolean70 = arg0.anInt1264 != -1;
			}
		} else if (arg0.anInt1272 != -1 && (local27 >= 10240 || local27 <= 2048)) {
			@Pc(124) int local124 = Static450.anIntArray412[arg2] - arg0.aClass107_7.anInt2613 & 0x3FFF;
			arg0.aBoolean70 = false;
			if (arg1 == 2 && local9.anInt7255 != -1) {
				if (local124 > 2048 && local124 <= 6144 && local9.anInt7264 != -1) {
					arg0.anInt1264 = local9.anInt7264;
				} else if (local124 >= 10240 && local124 < 14336 && local9.anInt7257 != -1) {
					arg0.anInt1264 = local9.anInt7257;
				} else if (local124 <= 6144 || local124 >= 10240 || local9.anInt7248 == -1) {
					arg0.anInt1264 = local9.anInt7255;
				} else {
					arg0.anInt1264 = local9.anInt7248;
				}
			} else if (arg1 == 0 && local9.anInt7256 != -1) {
				if (local124 > 2048 && local124 <= 6144 && local9.anInt7277 != -1) {
					arg0.anInt1264 = local9.anInt7277;
				} else if (local124 >= 10240 && local124 < 14336 && local9.anInt7287 != -1) {
					arg0.anInt1264 = local9.anInt7287;
				} else if (local124 <= 6144 || local124 >= 10240 || local9.anInt7251 == -1) {
					arg0.anInt1264 = local9.anInt7256;
				} else {
					arg0.anInt1264 = local9.anInt7251;
				}
			} else if (local124 > 2048 && local124 <= 6144 && local9.anInt7279 != -1) {
				arg0.anInt1264 = local9.anInt7279;
			} else if (local124 >= 10240 && local124 < 14336 && local9.anInt7280 != -1) {
				arg0.anInt1264 = local9.anInt7280;
			} else if (local124 <= 6144 || local124 >= 10240 || local9.anInt7284 == -1) {
				arg0.anInt1264 = local9.anInt7262;
			} else {
				arg0.anInt1264 = local9.anInt7284;
			}
		} else if (local27 == 0 && arg0.anInt1210 <= 25) {
			arg0.aBoolean70 = false;
			if (arg1 == 2 && local9.anInt7255 != -1) {
				arg0.anInt1264 = local9.anInt7255;
			} else if (arg1 == 0 && local9.anInt7256 != -1) {
				arg0.anInt1264 = local9.anInt7256;
			} else {
				arg0.anInt1264 = local9.anInt7262;
			}
		} else {
			arg0.aBoolean70 = false;
			if (arg1 == 2 && local9.anInt7255 != -1) {
				if (arg3 < 0 && local9.anInt7285 != -1) {
					arg0.anInt1264 = local9.anInt7285;
				} else if (arg3 <= 0 || local9.anInt7273 == -1) {
					arg0.anInt1264 = local9.anInt7255;
				} else {
					arg0.anInt1264 = local9.anInt7273;
				}
			} else if (arg1 == 0 && local9.anInt7256 != -1) {
				if (arg3 < 0 && local9.anInt7263 != -1) {
					arg0.anInt1264 = local9.anInt7263;
				} else if (arg3 <= 0 || local9.anInt7254 == -1) {
					arg0.anInt1264 = local9.anInt7256;
				} else {
					arg0.anInt1264 = local9.anInt7254;
				}
			} else if (arg3 < 0 && local9.anInt7246 != -1) {
				arg0.anInt1264 = local9.anInt7246;
			} else if (arg3 <= 0 || local9.anInt7283 == -1) {
				arg0.anInt1264 = local9.anInt7262;
			} else {
				arg0.anInt1264 = local9.anInt7283;
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method6368(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static440.aString83 = Static440.aString83 + arg0[0];
			Static387.anInt6408 += arg0[0].length();
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11].startsWith("pause")) {
				@Pc(32) int local32 = 5;
				try {
					local32 = Integer.parseInt(arg0[local11].substring(6));
				} catch (@Pc(41) Exception local41) {
				}
				Static83.method6024("Pausing for " + local32 + " seconds...");
				Static85.anInt1718 = local11 + 1;
				Static483.aStringArray68 = arg0;
				Static268.aLong117 = (long) (local32 * 1000) + Static95.method1587();
				return;
			}
			Static440.aString83 = arg0[local11];
			Static336.method5069(false);
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public static void method6369() {
		Static67.method1109();
		Static229.method3856();
	}
}
