import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!eu", name = "J", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!eu", name = "V", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_52 = new Class216(34, -1);

	@OriginalMember(owner = "client!eu", name = "U", descriptor = "I")
	public static int anInt2583 = -1;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIILclient!et;)Z")
	public static boolean method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub4 arg3) {
		if (!Static671.aBoolean798 || !Static142.aBoolean362) {
			return false;
		} else if (Static267.anInt4311 < 100) {
			return false;
		} else if (Static592.method7783(arg2, arg1, arg0)) {
			@Pc(26) int local26 = arg0 << Static273.anInt4424;
			@Pc(30) int local30 = arg1 << Static273.anInt4424;
			@Pc(40) int local40 = Static140.aClass42Array4[arg2].method7450(arg1, arg0) - 1;
			@Pc(51) int local51 = arg3.method8499() + local40;
			if (arg3.aShort106 == 1) {
				if (!Static479.method6586(local40, local26, local30, local30, local30 + Static63.anInt1356, local51, local26, local26, local51)) {
					return false;
				} else if (Static479.method6586(local40, local26, local30, Static63.anInt1356 + local30, local30 - -Static63.anInt1356, local40, local26, local26, local51)) {
					Static596.anInt9159++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort106 == 2) {
				if (!Static479.method6586(local40, local26, Static63.anInt1356 + local30, local30 - -Static63.anInt1356, Static63.anInt1356 + local30, local51, local26, Static63.anInt1356 + local26, local51)) {
					return false;
				} else if (Static479.method6586(local40, local26, local30 + Static63.anInt1356, local30 + Static63.anInt1356, local30 + Static63.anInt1356, local51, local26 + Static63.anInt1356, local26 - -Static63.anInt1356, local40)) {
					Static596.anInt9159++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort106 == 4) {
				if (!Static479.method6586(local40, local26 + Static63.anInt1356, local30, local30, local30 + Static63.anInt1356, local51, Static63.anInt1356 + local26, Static63.anInt1356 + local26, local51)) {
					return false;
				} else if (Static479.method6586(local40, Static63.anInt1356 + local26, local30, Static63.anInt1356 + local30, Static63.anInt1356 + local30, local40, local26 + Static63.anInt1356, Static63.anInt1356 + local26, local51)) {
					Static596.anInt9159++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort106 == 8) {
				if (!Static479.method6586(local40, local26, local30, local30, local30, local51, local26, local26 + Static63.anInt1356, local51)) {
					return false;
				} else if (Static479.method6586(local40, local26, local30, local30, local30, local51, local26 + Static63.anInt1356, Static63.anInt1356 + local26, local40)) {
					Static596.anInt9159++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort106 == 16) {
				if (Static164.method2786(Static85.anInt1770, Static85.anInt1770, local40, local51, local26, local30 + Static85.anInt1770)) {
					Static596.anInt9159++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort106 == 32) {
				if (Static164.method2786(Static85.anInt1770, Static85.anInt1770, local40, local51, local26 + Static85.anInt1770, Static85.anInt1770 + local30)) {
					Static596.anInt9159++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort106 == 64) {
				if (Static164.method2786(Static85.anInt1770, Static85.anInt1770, local40, local51, Static85.anInt1770 + local26, local30)) {
					Static596.anInt9159++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort106 != 128) {
				return true;
			} else if (Static164.method2786(Static85.anInt1770, Static85.anInt1770, local40, local51, local26, local30)) {
				Static596.anInt9159++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Z")
	public static boolean method2475() {
		return Static656.anInt10356 >= 1;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II[F)[F")
	public static float[] method2477(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static685.method6463(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
