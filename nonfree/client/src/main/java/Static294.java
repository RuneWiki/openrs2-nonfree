import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!te", name = "P", descriptor = "I")
	public static int anInt5736;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_46 = new Class195();

	@OriginalMember(owner = "client!te", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[200];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!lh;)V")
	public static void method5053(@OriginalArg(1) Class1_Sub21 arg0) {
		if (Static138.aClass204ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface8 local8 = null;
		if (arg0.anInt3639 == 0) {
			local8 = (Interface8) Static264.method4812(arg0.anInt3651, arg0.anInt3654, arg0.anInt3653);
		}
		if (arg0.anInt3639 == 1) {
			local8 = (Interface8) Static57.method1233(arg0.anInt3651, arg0.anInt3654, arg0.anInt3653);
		}
		if (arg0.anInt3639 == 2) {
			local8 = (Interface8) Static66.method1372(arg0.anInt3651, arg0.anInt3654, arg0.anInt3653, tr.class);
		}
		if (arg0.anInt3639 == 3) {
			local8 = (Interface8) Static331.method5551(arg0.anInt3651, arg0.anInt3654, arg0.anInt3653);
		}
		if (local8 == null) {
			arg0.anInt3641 = 0;
			arg0.anInt3642 = -1;
			arg0.anInt3650 = 0;
		} else {
			arg0.anInt3642 = local8.method5697();
			arg0.anInt3641 = local8.method5699();
			arg0.anInt3650 = local8.method5701();
		}
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
	public static void method5054() {
		Static190.aClass90_13 = null;
		Static50.aClass90_7 = null;
		Static88.aClass90_8 = null;
		Static156.aClass90_11 = null;
		Static44.aClass90_4 = null;
		Static175.aClass90_12 = null;
		Static306.aClass90_17 = null;
		Static155.aClass90_10 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Z")
	public static boolean method5055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static210.method3848(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static7.aClass41Array1[arg0].method5434(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static175.anInt3627) {
					if (!Static117.method2113(local10, local23, local14)) {
						return false;
					}
					if (!Static117.method2113(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static117.method2113(local10, local27, local14)) {
						return false;
					}
					if (!Static117.method2113(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static117.method2113(local10, local31, local14)) {
					return false;
				}
				if (!Static117.method2113(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static341.anInt2253) {
					if (!Static117.method2113(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static117.method2113(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static117.method2113(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static117.method2113(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static117.method2113(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static117.method2113(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static175.anInt3627) {
					if (!Static117.method2113(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static117.method2113(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static117.method2113(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static117.method2113(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static117.method2113(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static117.method2113(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static341.anInt2253) {
					if (!Static117.method2113(local10, local23, local14)) {
						return false;
					}
					if (!Static117.method2113(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static117.method2113(local10, local27, local14)) {
						return false;
					}
					if (!Static117.method2113(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static117.method2113(local10, local31, local14)) {
					return false;
				}
				if (!Static117.method2113(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static117.method2113(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static117.method2113(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static117.method2113(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static117.method2113(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static117.method2113(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZII)V")
	public static void method5056(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static215.aLong148 = 0L;
		@Pc(12) int local12 = Static295.method5063();
		if (arg2 == 3 || local12 == 3) {
			arg1 = true;
		}
		if (!Static34.aClass2_6.method3255()) {
			arg1 = true;
		}
		Static248.method4438(arg1, local12, arg2, arg0, arg3);
	}
}
