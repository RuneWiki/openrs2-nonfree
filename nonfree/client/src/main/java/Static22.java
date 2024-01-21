import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_6;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "[I")
	public static int[] anIntArray64;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!rc;")
	public static Class55 aClass55_368 = Static34.method846("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!le;")
	public static Class36 aClass36_11 = new Class36(64);

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public static int anInt1017 = -1;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!rc;")
	private static Class55 aClass55_374 = Static34.method846("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!rc;")
	public static Class55 aClass55_369 = aClass55_374;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_370 = null;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_371 = Static34.method846("@yel@*V");

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!rc;")
	private static Class55 aClass55_372 = Static34.method846("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_373 = aClass55_372;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Lclient!rc;")
	public static Class55 aClass55_375 = Static34.method846("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
	public static boolean method654(@OriginalArg(0) int arg0) {
		if (Static56.aBooleanArray6[arg0]) {
			return true;
		} else if (Static77.aClass40_27.method1231(arg0)) {
			@Pc(23) int local23 = Static77.aClass40_27.method1224(arg0);
			if (local23 == 0) {
				Static56.aBooleanArray6[arg0] = true;
				return true;
			}
			if (Static9.aClass6_Sub2_Sub14ArrayArray1[arg0] == null) {
				Static9.aClass6_Sub2_Sub14ArrayArray1[arg0] = new Class6_Sub2_Sub14[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static9.aClass6_Sub2_Sub14ArrayArray1[arg0][local42] == null) {
					@Pc(61) byte[] local61 = Static77.aClass40_27.method1243(local42, arg0);
					if (local61 != null) {
						Static9.aClass6_Sub2_Sub14ArrayArray1[arg0][local42] = new Class6_Sub2_Sub14();
						Static9.aClass6_Sub2_Sub14ArrayArray1[arg0][local42].anInt2920 = local42 + (arg0 << 16);
						if (local61[0] == -1) {
							Static9.aClass6_Sub2_Sub14ArrayArray1[arg0][local42].method1900(new Class6_Sub1(local61));
						} else {
							Static9.aClass6_Sub2_Sub14ArrayArray1[arg0][local42].method1899(new Class6_Sub1(local61));
						}
					}
				}
			}
			Static56.aBooleanArray6[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZII)I")
	public static int method655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return arg1 / 2 + (arg2 / 32 << 7) + (arg0 / 4 << 10);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!pb;Lclient!pb;Lclient!pb;I)V")
	public static void method656(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2) {
		Static77.aClass40_27 = arg2;
		Static71.aClass40_26 = arg0;
		Static34.aClass40_19 = arg1;
		Static9.aClass6_Sub2_Sub14ArrayArray1 = new Class6_Sub2_Sub14[Static77.aClass40_27.method1230()][];
		Static56.aBooleanArray6 = new boolean[Static77.aClass40_27.method1230()];
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Z")
	public static boolean method657(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!pb;Z)V")
	public static void method658(@OriginalArg(0) Class40 arg0) {
		Static106.aClass40_31 = arg0;
		Static92.anInt2558 = Static106.aClass40_31.method1224(16);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZI)I")
	public static int method659() {
		return Static47.anInt1513 + Static91.anInt2532;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public static void method660() {
		Static104.aClass36_36.method1155();
		Static98.aClass36_34.method1155();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method661() {
		aClass36_11 = null;
		aClass55_370 = null;
		aClass55_369 = null;
		aClass55_368 = null;
		anIntArray64 = null;
		aClass55_371 = null;
		aClass6_Sub2_Sub2_Sub1_6 = null;
		aClass55_372 = null;
		aClass55_375 = null;
		aClass55_374 = null;
		aClass55_373 = null;
	}
}
