import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
	public static int anInt1502;

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "Lclient!ga;")
	public static Class111 aClass111_10;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
	public static int anInt1501 = 0;

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
	public static int anInt1505 = 0;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIZILclient!ia;)Z")
	public static boolean method1381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class20_Sub2_Sub2 arg3) {
		if (!Static457.aBoolean566) {
			return false;
		} else if (Static13.anInt359 < 100) {
			return false;
		} else if (Static158.method2431(arg1, arg0, arg2)) {
			@Pc(24) int local24 = arg1 << Static378.anInt6665;
			@Pc(28) int local28 = arg2 << Static378.anInt6665;
			@Pc(38) int local38 = Static20.aClass17Array1[arg0].method6642(arg1, arg2) - 1;
			@Pc(44) int local44 = local38 + arg3.method7264();
			if (arg3.aShort102 == 1) {
				if (!Static314.method4794(local38, local44, local28 + Static47.anInt1239, local28, local44, local24, local28, local24, local24)) {
					return false;
				} else if (Static314.method4794(local38, local38, local28 + Static47.anInt1239, Static47.anInt1239 + local28, local44, local24, local28, local24, local24)) {
					Static486.anInt8200++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort102 == 2) {
				if (!Static314.method4794(local38, local44, Static47.anInt1239 + local28, Static47.anInt1239 + local28, local44, local24, local28 + Static47.anInt1239, local24, Static47.anInt1239 + local24)) {
					return false;
				} else if (Static314.method4794(local38, local44, local28 + Static47.anInt1239, local28 - -Static47.anInt1239, local38, local24, local28 + Static47.anInt1239, Static47.anInt1239 + local24, Static47.anInt1239 + local24)) {
					Static486.anInt8200++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort102 == 4) {
				if (!Static314.method4794(local38, local44, Static47.anInt1239 + local28, local28, local44, local24 + Static47.anInt1239, local28, Static47.anInt1239 + local24, Static47.anInt1239 + local24)) {
					return false;
				} else if (Static314.method4794(local38, local38, local28 + Static47.anInt1239, Static47.anInt1239 + local28, local44, local24 + Static47.anInt1239, local28, Static47.anInt1239 + local24, Static47.anInt1239 + local24)) {
					Static486.anInt8200++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort102 == 8) {
				if (!Static314.method4794(local38, local44, local28, local28, local44, local24, local28, local24, Static47.anInt1239 + local24)) {
					return false;
				} else if (Static314.method4794(local38, local44, local28, local28, local38, local24, local28, local24 + Static47.anInt1239, Static47.anInt1239 + local24)) {
					Static486.anInt8200++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort102 == 16) {
				if (Static20.method542(local38, local24, Static159.anInt2896, Static159.anInt2896, local44, Static159.anInt2896 + local28)) {
					Static486.anInt8200++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort102 == 32) {
				if (Static20.method542(local38, local24 + Static159.anInt2896, Static159.anInt2896, Static159.anInt2896, local44, Static159.anInt2896 + local28)) {
					Static486.anInt8200++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort102 == 64) {
				if (Static20.method542(local38, local24 + Static159.anInt2896, Static159.anInt2896, Static159.anInt2896, local44, local28)) {
					Static486.anInt8200++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort102 != 128) {
				return true;
			} else if (Static20.method542(local38, local24, Static159.anInt2896, Static159.anInt2896, local44, local28)) {
				Static486.anInt8200++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "([BIBI)I")
	public static int method1382(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg1; local14++) {
			local7 = local7 >>> 8 ^ Class1_Sub1_Sub29.anIntArray527[(arg0[local14] ^ local7) & 0xFF];
		}
		return ~local7;
	}
}
