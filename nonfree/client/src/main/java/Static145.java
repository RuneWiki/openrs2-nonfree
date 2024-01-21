import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!rb", name = "Q", descriptor = "[[Lclient!fd;")
	public static Class20[][] aClass20ArrayArray1;

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "Lclient!fd;")
	public static Class20 aClass20_10;

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1228 = Static161.method2971("Loaded interfaces");

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1224 = aClass13_1228;

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1227 = Static161.method2971("purple:");

	@OriginalMember(owner = "client!rb", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1225 = aClass13_1227;

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1226 = aClass13_1227;

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1229 = Static161.method2971("(R");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(JI)V")
	public static void method2571(@OriginalArg(0) long arg0) {
		if ((long) 0 != arg0) {
			Static1.aClass1_Sub8_Sub1_1.method1654(49);
			Static1.aClass1_Sub8_Sub1_1.method1625(arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(BI)V")
	public static void method2572(@OriginalArg(1) int arg0) {
		Static151.method3035();
		Static21.method689();
		@Pc(21) int local21 = Static99.method1996(arg0).anInt873;
		if (local21 == 0) {
			return;
		}
		@Pc(31) int local31 = Static103.anIntArray266[arg0];
		if (local21 == 1) {
			Static43.anInt1437 = local31;
			if (Static43.anInt1437 == 1) {
				Static9.method356(0.9F);
			}
			if (Static43.anInt1437 == 2) {
				Static9.method356(0.8F);
			}
			if (Static43.anInt1437 == 3) {
				Static9.method356(0.7F);
			}
			if (Static43.anInt1437 == 4) {
				Static9.method356(0.6F);
			}
			Static79.method1655();
		}
		if (local21 == 3) {
			@Pc(65) short local65 = 0;
			if (local31 == 0) {
				local65 = 255;
			}
			if (local31 == 1) {
				local65 = 192;
			}
			if (local31 == 2) {
				local65 = 128;
			}
			if (local31 == 3) {
				local65 = 64;
			}
			if (local31 == 4) {
				local65 = 0;
			}
			if (Static62.anInt2602 != local65) {
				if (Static62.anInt2602 == 0 && Static182.anInt918 != -1) {
					Static15.method630(Static144.aClass4_Sub1_47, Static182.anInt918, local65);
					Static162.aBoolean294 = false;
				} else if (local65 == 0) {
					Static15.method626();
					Static162.aBoolean294 = false;
				} else {
					Static154.method2654(local65);
				}
				Static62.anInt2602 = local65;
			}
		}
		if (local21 == 10) {
			if (local31 == 0) {
				Static21.anInt786 = 127;
			}
			if (local31 == 1) {
				Static21.anInt786 = 96;
			}
			if (local31 == 2) {
				Static21.anInt786 = 64;
			}
			if (local31 == 3) {
				Static21.anInt786 = 32;
			}
			if (local31 == 4) {
				Static21.anInt786 = 0;
			}
		}
		if (local21 == 4) {
			if (local31 == 0) {
				Static174.anInt1393 = 127;
			}
			if (local31 == 1) {
				Static174.anInt1393 = 96;
			}
			if (local31 == 2) {
				Static174.anInt1393 = 64;
			}
			if (local31 == 3) {
				Static174.anInt1393 = 32;
			}
			if (local31 == 4) {
				Static174.anInt1393 = 0;
			}
		}
		if (local21 == 5) {
			Static187.anInt4123 = local31;
		}
		if (local21 == 9) {
			Static98.anInt3743 = local31;
		}
		if (local21 == 6) {
			Static55.anInt1771 = local31;
		}
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public static void method2573() {
		aClass13_1229 = null;
		aClass20ArrayArray1 = null;
		aClass13_1225 = null;
		aClass13_1227 = null;
		aClass20_10 = null;
		aClass13_1228 = null;
		aClass13_1224 = null;
		aClass13_1226 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Z")
	public static boolean method2574(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static147.aShortArray41[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1007;
	}
}
