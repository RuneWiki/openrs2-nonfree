import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
	public static int anInt2776;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	public static int anInt2759 = 500;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
	public static int anInt2762 = 0;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1108 = Static121.method2047("<)4col>");

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1110 = Static121.method2047("Attack");

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1109 = aClass60_1110;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "[J")
	public static long[] aLongArray11 = new long[32];

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "[I")
	public static int[] anIntArray301 = new int[4000];

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1111 = Static121.method2047("Registrierter Benutzer");

	@OriginalMember(owner = "client!tc", name = "N", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1112 = Static121.method2047("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1113 = Static121.method2047("(Z");

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method1946() {
		try {
			if (Static127.aClass23_1 == null) {
				Static127.aClass23_1 = new Class23(Static129.aClass35_3, Static125.method2072(new Class60[] { Static66.aClass60_580, Static22.aClass60_235, Static129.aClass60_1203 }).method1642());
			} else {
				@Pc(32) byte[] local32 = Static127.aClass23_1.method633();
				if (local32 != null) {
					@Pc(39) Class4_Sub13 local39 = new Class4_Sub13(local32);
					Static43.anInt1096 = local39.method1244();
					Static32.aClass49Array1 = new Class49[Static43.anInt1096];
					for (@Pc(48) int local48 = 0; local48 < Static43.anInt1096; local48++) {
						@Pc(58) Class49 local58 = Static32.aClass49Array1[local48] = new Class49();
						@Pc(62) int local62 = local39.method1244();
						local58.aBoolean74 = (local62 & 0x8000) != 0;
						local58.anInt1875 = local62 & 0x7FFF;
						local58.aClass60_735 = local39.method1249();
						local58.anInt1871 = local39.method1246();
						local58.anInt1876 = local48;
						local58.anInt1874 = Static18.method299(local58.aClass60_735);
					}
					Static24.method473(Static34.anIntArray67, Static32.aClass49Array1, Static63.anIntArray169, Static32.aClass49Array1.length - 1, 0);
					Static90.aBoolean86 = true;
					Static127.aClass23_1 = null;
				}
			}
		} catch (@Pc(117) Exception local117) {
			local117.printStackTrace();
			Static127.aClass23_1 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public static void method1947() {
		for (@Pc(10) Class4_Sub19 local10 = (Class4_Sub19) Static52.aClass70_12.method1939(); local10 != null; local10 = (Class4_Sub19) Static52.aClass70_12.method1936()) {
			if (local10.anInt2486 > 0) {
				local10.anInt2486--;
			}
			if (local10.anInt2486 != 0) {
				if (local10.anInt2487 > 0) {
					local10.anInt2487--;
				}
				if (local10.anInt2487 == 0 && local10.anInt2496 >= 1 && local10.anInt2499 >= 1 && local10.anInt2496 <= 102 && local10.anInt2499 <= 102 && (local10.anInt2489 < 0 || Static27.method519(local10.anInt2495, local10.anInt2489))) {
					Static64.method1282(local10.anInt2489, local10.anInt2496, local10.anInt2499, local10.anInt2494, local10.anInt2497, local10.anInt2495, local10.anInt2490);
					local10.anInt2487 = -1;
					if (local10.anInt2484 == local10.anInt2489 && local10.anInt2484 == -1) {
						local10.method2124();
					} else if (local10.anInt2484 == local10.anInt2489 && local10.anInt2485 == local10.anInt2497 && local10.anInt2495 == local10.anInt2498) {
						local10.method2124();
					}
				}
			} else if (local10.anInt2484 < 0 || Static27.method519(local10.anInt2498, local10.anInt2484)) {
				Static64.method1282(local10.anInt2484, local10.anInt2496, local10.anInt2499, local10.anInt2494, local10.anInt2485, local10.anInt2498, local10.anInt2490);
				local10.method2124();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!qc;")
	public static Class60 method1949(@OriginalArg(1) int arg0) {
		@Pc(9) Class60 local9 = Static120.method1450(arg0);
		for (@Pc(15) int local15 = local9.method1644() - 3; local15 > 0; local15 -= 3) {
			local9 = Static125.method2072(new Class60[] { local9.method1657(local15, 0), Static83.aClass60_811, local9.method1662(local15) });
		}
		if (local9.method1644() > 9) {
			return Static125.method2072(new Class60[] { Static14.aClass60_1213, local9.method1657(local9.method1644() - 8, 0), Static105.aClass60_1011, Static81.aClass60_793, local9, Static22.aClass60_240 });
		} else if (local9.method1644() > 6) {
			return Static125.method2072(new Class60[] { Static24.aClass60_279, local9.method1657(local9.method1644() - 4, 0), Static94.aClass60_918, Static81.aClass60_793, local9, Static22.aClass60_240 });
		} else {
			return Static125.method2072(new Class60[] { Static128.aClass60_1060, local9, aClass60_1108 });
		}
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	public static void method1950() {
		aClass60_1113 = null;
		aClass60_1111 = null;
		aClass60_1109 = null;
		aLongArray11 = null;
		aClass60_1112 = null;
		aClass60_1108 = null;
		anIntArray301 = null;
		aClass60_1110 = null;
	}
}
