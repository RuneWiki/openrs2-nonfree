import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "Lclient!da;")
	public static Class62 aClass62_12;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "Z")
	public static boolean aBoolean670;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
	public static int anInt9304;

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "Lclient!la;")
	public static Class196 aClass196_113;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!ea;")
	public static final Class3_Sub15 aClass3_Sub15_2 = new Class3_Sub15(0, -1);

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "Z")
	public static boolean aBoolean669 = false;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "Z")
	public static boolean aBoolean671 = false;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIILclient!nf;)Z")
	public static boolean method8026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1_Sub3 arg3) {
		if (!Static500.aBoolean598 || !Static378.aBoolean511) {
			return false;
		} else if (Static127.anInt2678 < 100) {
			return false;
		} else if (Static69.method1704(arg0, arg2, arg1)) {
			@Pc(28) int local28 = arg0 << Static308.anInt5834;
			@Pc(32) int local32 = arg2 << Static308.anInt5834;
			@Pc(42) int local42 = Static364.aClass51Array3[arg1].method7835(arg0, arg2) - 1;
			@Pc(48) int local48 = arg3.method7703() + local42;
			if (arg3.aShort53 == 1) {
				if (!Static441.method6862(local28, local48, local28, local32 + Static384.anInt7200, local32, local42, local32, local48, local28)) {
					return false;
				} else if (Static441.method6862(local28, local42, local28, Static384.anInt7200 + local32, local32 + Static384.anInt7200, local42, local32, local48, local28)) {
					Static301.anInt5347++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort53 == 2) {
				if (!Static441.method6862(local28, local48, local28 + Static384.anInt7200, local32 - -Static384.anInt7200, Static384.anInt7200 + local32, local42, Static384.anInt7200 + local32, local48, local28)) {
					return false;
				} else if (Static441.method6862(local28 + Static384.anInt7200, local48, local28 + Static384.anInt7200, Static384.anInt7200 + local32, local32 + Static384.anInt7200, local42, local32 + Static384.anInt7200, local42, local28)) {
					Static301.anInt5347++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort53 == 4) {
				if (!Static441.method6862(local28 + Static384.anInt7200, local48, local28 + Static384.anInt7200, Static384.anInt7200 + local32, local32, local42, local32, local48, Static384.anInt7200 + local28)) {
					return false;
				} else if (Static441.method6862(Static384.anInt7200 + local28, local42, Static384.anInt7200 + local28, Static384.anInt7200 + local32, Static384.anInt7200 + local32, local42, local32, local48, local28 + Static384.anInt7200)) {
					Static301.anInt5347++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort53 == 8) {
				if (!Static441.method6862(local28, local48, local28 + Static384.anInt7200, local32, local32, local42, local32, local48, local28)) {
					return false;
				} else if (Static441.method6862(local28 + Static384.anInt7200, local48, local28 + Static384.anInt7200, local32, local32, local42, local32, local42, local28)) {
					Static301.anInt5347++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort53 == 16) {
				if (Static34.method1254(local42, local28, Static161.anInt3180, Static161.anInt3180, local48, Static161.anInt3180 + local32)) {
					Static301.anInt5347++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort53 == 32) {
				if (Static34.method1254(local42, Static161.anInt3180 + local28, Static161.anInt3180, Static161.anInt3180, local48, local32 + Static161.anInt3180)) {
					Static301.anInt5347++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort53 == 64) {
				if (Static34.method1254(local42, Static161.anInt3180 + local28, Static161.anInt3180, Static161.anInt3180, local48, local32)) {
					Static301.anInt5347++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort53 != 128) {
				return true;
			} else if (Static34.method1254(local42, local28, Static161.anInt3180, Static161.anInt3180, local48, local32)) {
				Static301.anInt5347++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
