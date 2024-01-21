import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array7;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_4;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt1547 = 0;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_1093 = Static72.method1077("Verbindung mit");

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!u;")
	private static Class74 aClass74_1096 = Static72.method1077("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_1094 = aClass74_1096;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "J")
	public static long aLong61 = 0L;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1095 = Static72.method1077("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	public static int anInt1556 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1069() {
		aClass2_Sub2_Sub1_Sub2_4 = null;
		aClass74_1095 = null;
		aClass74_1096 = null;
		anIntArray194 = null;
		aClass74_1093 = null;
		aClass2_Sub2_Sub1_Sub2Array7 = null;
		aClass74_1094 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1070() {
		Static19.aClass2_Sub10_Sub1_1.method1540();
		@Pc(11) int local11 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
		if (local11 == 0) {
			return;
		}
		@Pc(26) int local26 = Static19.aClass2_Sub10_Sub1_1.method1538(2);
		if (local26 == 0) {
			Static81.anIntArray255[Static107.anInt2342++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (local26 == 1) {
			local45 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
			Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.method1863(local45, false);
			local55 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
			if (local55 == 1) {
				Static81.anIntArray255[Static107.anInt2342++] = 2047;
			}
			return;
		}
		@Pc(97) int local97;
		if (local26 == 2) {
			local45 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
			Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.method1863(local45, true);
			local55 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
			Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.method1863(local55, true);
			local97 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
			if (local97 == 1) {
				Static81.anIntArray255[Static107.anInt2342++] = 2047;
			}
		} else if (local26 == 3) {
			Static117.anInt2529 = Static19.aClass2_Sub10_Sub1_1.method1538(2);
			local45 = Static19.aClass2_Sub10_Sub1_1.method1538(7);
			local55 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
			if (local55 == 1) {
				Static81.anIntArray255[Static107.anInt2342++] = 2047;
			}
			local97 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
			@Pc(150) int local150 = Static19.aClass2_Sub10_Sub1_1.method1538(7);
			Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.method1867(local97 == 1, local45, local150);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public static void method1071() {
		Static107.aClass9_52.method1589();
		Static44.method728();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
	public static int method1072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 2) {
			@Pc(25) int local25 = method1072(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local25 *= arg1;
			}
			return local25;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)V")
	public static void method1073(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static65.anInt1450; local20++) {
			if (arg0 == Static6.aLongArray2[local20]) {
				Static116.aBoolean107 = true;
				Static65.anInt1450--;
				for (@Pc(44) int local44 = local20; local44 < Static65.anInt1450; local44++) {
					Static19.aClass74Array2[local44] = Static19.aClass74Array2[local44 + 1];
					Static78.anIntArray251[local44] = Static78.anIntArray251[local44 + 1];
					Static6.aLongArray2[local44] = Static6.aLongArray2[local44 + 1];
					Static23.anIntArray67[local44] = Static23.anIntArray67[local44 + 1];
				}
				Static46.anInt1053 = Static107.anInt2338 + 1;
				Static128.aClass2_Sub10_Sub1_3.method1533(134);
				Static128.aClass2_Sub10_Sub1_3.method1495(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)I")
	public static int method1074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return arg1 / 2 + (arg0 / 32 << 7) + (arg2 / 4 << 10);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
	public static Object method1075(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static75.aBoolean62) {
			try {
				@Pc(28) Class1 local28 = (Class1) Class.forName("Class1_Sub1").getDeclaredConstructor().newInstance();
				local28.method1456(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static75.aBoolean62 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1076() {
		Static55.method382();
		Static39.method662();
		Static21.method459();
		Static121.method1787();
		Static53.method896();
		Static98.method1469();
		Static85.method1298();
		Static100.method1534();
		Static29.method516();
		Static126.method1919();
		Static101.method1557();
		Static107.method1604();
		((Class46) Static44.anInterface2_1).method1066();
		Static14.aClass16_21.method485();
		Static31.aClass26_Sub1_26.method1370();
		Static23.aClass26_Sub1_24.method1370();
		Static93.aClass26_Sub1_56.method1370();
		Static82.aClass26_Sub1_54.method1370();
		Static121.aClass26_Sub1_71.method1370();
		Static35.aClass26_Sub1_77.method1370();
		Static11.aClass26_Sub1_14.method1370();
		Static50.aClass26_Sub1_35.method1370();
		Static103.aClass26_Sub1_63.method1370();
		Static55.aClass26_Sub1_20.method1370();
		Static56.aClass26_Sub1_41.method1370();
		Static53.aClass26_Sub1_38.method1370();
	}
}
