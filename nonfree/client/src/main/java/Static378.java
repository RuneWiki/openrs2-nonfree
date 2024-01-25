import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_216 = new Class175("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
	public static int anInt6656 = 0;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Z")
	public static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V")
	public static void method5234() {
		if (Static122.aClass27_1 != null) {
			Static122.aClass27_1.method893();
			Static122.aClass27_1 = null;
		}
		Static245.method3782();
		Static139.method2521();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static389.aClass23Array1[local17].method825();
		}
		Static164.method2884(false);
		System.gc();
		Static82.method1421();
		Static257.anInt4778 = -1;
		Static358.aBoolean419 = false;
		Static361.method5115(true);
		Static442.anInt7524 = 0;
		Static339.anInt6223 = 0;
		Static422.anInt7272 = 0;
		Static108.anInt3458 = 0;
		Static197.anInt4304 = 0;
		for (@Pc(61) int local61 = 0; local61 < Static370.aClass125Array1.length; local61++) {
			Static370.aClass125Array1[local61] = null;
		}
		Static330.method4794();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static308.aClass1_Sub3_Sub3_Sub1Array1[local81] = null;
		}
		Static453.anInt7682 = 0;
		for (@Pc(94) int local94 = 0; local94 < 32768; local94++) {
			Static451.aClass1_Sub3_Sub3_Sub2Array1[local94] = null;
		}
		Static157.aClass127_15.method3249();
		Static344.method4923();
		Static100.anInt2246 = 0;
		Static369.aClass11_1.method459();
		Static448.method5929();
		Static43.method936();
		Static27.method719(true);
		try {
			Static462.method4867(Static295.aClass103_5.anApplet1, "loggedout");
		} catch (@Pc(132) Throwable local132) {
		}
		Static337.aClass3_Sub43_2 = null;
		Static98.aLong68 = 0L;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V")
	public static void method5235(@OriginalArg(0) int arg0) {
		Static336.anInt6190 = -1;
		Static189.anInt3807 = arg0;
		Static293.anInt3444 = -1;
		Static220.method3501();
	}
}
