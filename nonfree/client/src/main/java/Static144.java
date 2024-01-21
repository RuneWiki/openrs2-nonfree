import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1382 = Static32.method683("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1383 = Static32.method683("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt3045 = 0;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1384 = Static32.method683("");

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1385 = Static32.method683("Abbrechen");

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1386 = Static32.method683("Login limit exceeded)3");

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1387 = aClass49_1386;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1388 = aClass49_1382;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZZ)I")
	public static int method2367() {
		return Static134.anInt2914 + Static145.anInt3076;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([BI)Lclient!db;")
	public static Class2_Sub2_Sub2_Sub1_Sub1 method2368(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(22) Class2_Sub2_Sub2_Sub1_Sub1 local22 = new Class2_Sub2_Sub2_Sub1_Sub1(arg0, Static142.anIntArray282, Static178.anIntArray364, Static20.anIntArray41, Static63.anIntArray165, Static47.anIntArray105, Static9.aByteArrayArray1);
			Static63.method1094();
			return local22;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIBLclient!bg;)Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 method2369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static179.method2970(arg2, arg0, arg1) ? Static67.method1132() : null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method2370() {
		aClass49_1387 = null;
		aClass49_1382 = null;
		aClass49_1383 = null;
		Class75.anIntArray283 = null;
		aClass49_1384 = null;
		aClass49_1386 = null;
		aClass49_1388 = null;
		aClass49_1385 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!bg;II)Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 method2371(@OriginalArg(0) Class11 arg0, @OriginalArg(2) int arg1) {
		return Static41.method794(arg0, arg1) ? Static67.method1132() : null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!lf;I)V")
	public static void method2372(@OriginalArg(0) Class49 arg0) {
		if (Static102.anInt2166 >= 2) {
			if (arg0.method1645(Static185.aClass49_1756)) {
				System.gc();
			}
			if (arg0.method1645(Static147.aClass49_1413)) {
				Static48.method881();
			}
			if (arg0.method1645(Static151.aClass49_1467)) {
				Static116.aBoolean106 = true;
			}
			if (arg0.method1645(Static70.aClass49_761)) {
				Static116.aBoolean106 = false;
			}
			arg0.method1645(Static27.aClass49_331);
			arg0.method1645(Static174.aClass49_1693);
			if (arg0.method1645(Static122.aClass49_1178)) {
				for (@Pc(61) int local61 = 0; local61 < 4; local61++) {
					for (@Pc(65) int local65 = 1; local65 < 103; local65++) {
						for (@Pc(69) int local69 = 1; local69 < 103; local69++) {
							Static148.aClass48Array1[local61].anIntArrayArray21[local65][local69] = 0;
						}
					}
				}
			}
			if (arg0.method1660(Static156.aClass49_1522) && Static27.anInt594 != 0) {
				Static84.method1438(arg0.method1665(6).method1648());
			}
			if (arg0.method1645(Static84.aClass49_893) && Static27.anInt594 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1660(Static62.aClass49_681)) {
				Static153.anInt3281 = arg0.method1665(12).method1641().method1648();
				Static88.method1475(null, Static33.method692(new Class49[] { Static121.aClass49_1170, Static48.method882(Static153.anInt3281) }), 0);
			}
			if (arg0.method1645(Static139.aClass49_1340)) {
				Static140.aBoolean127 = true;
			}
		}
		Static176.aClass2_Sub13_Sub1_14.method2976(164);
		Static176.aClass2_Sub13_Sub1_14.method2932(arg0.method1653() - 1);
		Static176.aClass2_Sub13_Sub1_14.method2949(arg0.method1665(2));
	}
}
