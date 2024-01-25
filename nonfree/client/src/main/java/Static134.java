import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_50 = new Class268(25, 8);

	@OriginalMember(owner = "client!en", name = "f", descriptor = "[I")
	public static final int[] anIntArray168 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	public static void method2182(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static272.aClass97ArrayArrayArray3 = Static179.aClass97ArrayArrayArray1;
			Static195.aClass199Array1 = Static510.aClass199Array3;
		} else {
			Static272.aClass97ArrayArrayArray3 = Static360.aClass97ArrayArrayArray4;
			Static195.aClass199Array1 = Static228.aClass199Array2;
		}
		Static535.anInt9275 = Static272.aClass97ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZIII)Lclient!mba;")
	public static Class6_Sub29 method2183(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub29 local7 = new Class6_Sub29();
		local7.anInt6363 = arg0;
		local7.anInt6361 = arg3;
		Static507.aClass128_42.method3551((long) arg2, local7);
		Static191.method3395(arg3);
		@Pc(37) Class302 local37 = Static386.method4914(arg2);
		if (local37 != null) {
			Static603.method8464(local37);
		}
		if (Static523.aClass302_53 != null) {
			Static603.method8464(Static523.aClass302_53);
			Static523.aClass302_53 = null;
		}
		Static208.method3599();
		if (local37 != null) {
			Static409.method6504(local37, !arg1);
		}
		if (!arg1) {
			Static244.method4205(arg3);
		}
		if (!arg1 && Static554.anInt1822 != -1) {
			Static104.method1720(Static554.anInt1822, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIILclient!ma;)Z")
	public static boolean method2185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class20_Sub2_Sub1 arg3) {
		if (!Static365.aBoolean444 || !Static231.aBoolean325) {
			return false;
		} else if (Static113.anInt2246 < 100) {
			return false;
		} else if (Static606.method7456(arg2, arg1, arg0)) {
			@Pc(28) int local28 = arg1 << Static643.anInt10682;
			@Pc(32) int local32 = arg2 << Static643.anInt10682;
			@Pc(42) int local42 = Static195.aClass199Array1[arg0].method8532(arg1, arg2) - 1;
			@Pc(48) int local48 = arg3.method9019() + local42;
			if (arg3.aShort112 == 1) {
				if (!Static577.method8180(local28, local32, local48, local28, local28, local48, local42, local32 + Static246.anInt4917, local32)) {
					return false;
				} else if (Static577.method8180(local28, Static246.anInt4917 + local32, local48, local28, local28, local42, local42, local32 + Static246.anInt4917, local32)) {
					Static404.anInt7516++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort112 == 2) {
				if (!Static577.method8180(local28 + Static246.anInt4917, Static246.anInt4917 + local32, local48, local28, local28, local48, local42, local32 + Static246.anInt4917, Static246.anInt4917 + local32)) {
					return false;
				} else if (Static577.method8180(Static246.anInt4917 + local28, Static246.anInt4917 + local32, local42, local28, local28 + Static246.anInt4917, local48, local42, Static246.anInt4917 + local32, Static246.anInt4917 + local32)) {
					Static404.anInt7516++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort112 == 4) {
				if (!Static577.method8180(local28 + Static246.anInt4917, local32, local48, Static246.anInt4917 + local28, local28 - -Static246.anInt4917, local48, local42, local32 + Static246.anInt4917, local32)) {
					return false;
				} else if (Static577.method8180(Static246.anInt4917 + local28, Static246.anInt4917 + local32, local48, Static246.anInt4917 + local28, local28 - -Static246.anInt4917, local42, local42, local32 + Static246.anInt4917, local32)) {
					Static404.anInt7516++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort112 == 8) {
				if (!Static577.method8180(local28 + Static246.anInt4917, local32, local48, local28, local28, local48, local42, local32, local32)) {
					return false;
				} else if (Static577.method8180(Static246.anInt4917 + local28, local32, local42, local28, Static246.anInt4917 + local28, local48, local42, local32, local32)) {
					Static404.anInt7516++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort112 == 16) {
				if (Static198.method3517(local32 + Static557.anInt9470, local48, Static557.anInt9470, local28, Static557.anInt9470, local42)) {
					Static404.anInt7516++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort112 == 32) {
				if (Static198.method3517(local32 + Static557.anInt9470, local48, Static557.anInt9470, Static557.anInt9470 + local28, Static557.anInt9470, local42)) {
					Static404.anInt7516++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort112 == 64) {
				if (Static198.method3517(local32, local48, Static557.anInt9470, Static557.anInt9470 + local28, Static557.anInt9470, local42)) {
					Static404.anInt7516++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort112 != 128) {
				return true;
			} else if (Static198.method3517(local32, local48, Static557.anInt9470, local28, Static557.anInt9470, local42)) {
				Static404.anInt7516++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)I")
	public static int method2186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(30) double local30 = local17 + (local10 - local17) * Math.random();
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}
}
