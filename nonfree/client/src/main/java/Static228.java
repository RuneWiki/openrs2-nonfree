import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static228 {

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Lclient!gp;")
	public static Class91 aClass91_4;

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
	public static int anInt3708;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_88 = new Class211(63, 2);

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_89 = new Class211(23, 8);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIZ)V")
	public static void method2981(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static204.anInt3409--;
			if (Static204.anInt3409 == 0) {
				Static216.anIntArray305 = null;
			}
		}
		if (arg1) {
			Static315.anInt5432--;
			if (Static315.anInt5432 == 0) {
				Static237.anIntArray330 = null;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method2982() {
		Static323.aClass218_2.method4674();
		Static246.aClass153_4.method3078();
		Static394.aClass47_2.method958();
		Static50.aClass190_1.method4217();
		Static155.aClass263_1.method5589();
		Static384.aClass164_2.method3463();
		Static334.aClass62_2.method1420();
		Static431.aClass36_2.method698();
		Static291.aClass8_1.method145();
		Static275.aClass138_1.method2813();
		Static56.aClass150_1.method3065();
		Static193.aClass120_2.method2513();
		Static70.aClass97_1.method2128();
		Static234.aClass135_1.method2746();
		Static19.aClass96_1.method2093();
		Static91.aClass180_1.method3844();
		Static231.aClass129_1.method2650();
		Static206.aClass176_1.method3751();
		Static185.aClass201_2.method4380();
		Static343.aClass27_1.method538();
		Static287.method3837();
		Static28.method446();
		Static81.method1180();
		Static303.method4019();
		Static343.aClass132_53.method2713(5);
		Static154.aClass132_18.method2713(5);
		Static314.aClass132_48.method2713(5);
		Static88.aClass132_9.method2713(5);
		Static191.aClass132_23.method2713(5);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([IILclient!pg;IZI)Lclient!gq;")
	public static Class20_Sub1_Sub1 method2984(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class163_Sub2 arg2, @OriginalArg(3) int arg3) {
		if (arg2.aBoolean380 || Static376.method4880(arg1) && Static376.method4880(arg3)) {
			return new Class20_Sub1_Sub1(arg2, 3553, arg1, arg3, false, arg0);
		} else if (arg2.aBoolean377) {
			return new Class20_Sub1_Sub1(arg2, 34037, arg1, arg3, false, arg0);
		} else {
			return new Class20_Sub1_Sub1(arg2, arg1, arg3, Static29.method453(arg1), Static29.method453(arg3), arg0);
		}
	}
}
