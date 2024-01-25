import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!dk;")
	public static Class54 aClass54_115;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!ew;")
	public static final Class72 aClass72_47 = new Class72(16);

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString196 = "";

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method5591() {
		Static323.aClass218_2.method4673();
		Static246.aClass153_4.method3080();
		Static394.aClass47_2.method957();
		Static50.aClass190_1.method4212();
		Static155.aClass263_1.method5582();
		Static384.aClass164_2.method3459();
		Static334.aClass62_2.method1422();
		Static431.aClass36_2.method699();
		Static291.aClass8_1.method147();
		Static275.aClass138_1.method2815();
		Static56.aClass150_1.method3068();
		Static70.aClass97_1.method2132();
		Static193.aClass120_2.method2507();
		Static19.aClass96_1.method2088();
		Static234.aClass135_1.method2745();
		Static91.aClass180_1.method3849();
		Static231.aClass129_1.method2652();
		Static206.aClass176_1.method3749();
		Static185.aClass201_2.method4382();
		Static343.aClass27_1.method542();
		Static253.method3212();
		Static2.method6();
		Static108.method1676();
		Static195.method2636();
		Static343.aClass132_53.method2708();
		Static154.aClass132_18.method2708();
		Static314.aClass132_48.method2708();
		Static88.aClass132_9.method2708();
		Static191.aClass132_23.method2708();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBI)V")
	public static void method5592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (Static217.anInt3574 != arg0) {
			Static145.anIntArray199 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static145.anIntArray199[local17] = (local17 << 12) / arg0;
			}
			Static127.anInt2287 = arg0 - 1;
			Static217.anInt3574 = arg0;
			Static297.anInt4831 = arg0 * 32;
		}
		if (arg1 == Static290.anInt4775) {
			return;
		}
		if (Static217.anInt3574 == arg1) {
			Static405.anIntArray555 = Static145.anIntArray199;
		} else {
			Static405.anIntArray555 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static405.anIntArray555[local17] = (local17 << 12) / arg1;
			}
		}
		Static157.anInt2698 = arg1 - 1;
		Static290.anInt4775 = arg1;
	}
}
