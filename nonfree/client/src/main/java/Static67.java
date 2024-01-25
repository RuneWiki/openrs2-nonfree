import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt1311;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!ao;")
	public static Class19 method1351(@OriginalArg(1) Component arg0) {
		return new Class19_Sub1(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
	public static void method1352(@OriginalArg(1) boolean arg0) {
		if (Static559.aClass269_1 != null) {
			Static559.aClass269_1.method6697();
			Static559.aClass269_1 = null;
		}
		Static234.method3925();
		Static429.method6182();
		Static405.method5734();
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			Static1.aClass252Array5[local24].method6169();
		}
		Static460.method6706(false);
		System.gc();
		Static594.method8355();
		Static214.anInt4080 = -1;
		Static278.aBoolean253 = false;
		Static476.method6888();
		Static443.method6285(true);
		Static567.anInt5924 = 0;
		Static580.anInt9328 = 0;
		Static72.anInt1361 = 0;
		Static288.anInt4926 = 0;
		Static601.anInt9665 = 0;
		Static287.anInt4910 = 0;
		for (@Pc(65) int local65 = 0; local65 < Static292.aClass142Array1.length; local65++) {
			Static292.aClass142Array1[local65] = null;
		}
		Static535.method7734();
		for (@Pc(80) int local80 = 0; local80 < 2048; local80++) {
			Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local80] = null;
		}
		Static561.anInt9114 = 0;
		Static522.aClass83_34.method2374();
		Static567.anInt5909 = 0;
		Static98.aClass83_6.method2374();
		Static139.method2541();
		Static611.anInt9850 = 0;
		Static131.aClass66_1.method1635();
		Static91.method1704();
		Static238.method4022();
		Static333.aClass185_7 = null;
		Static494.aLong245 = 0L;
		Static84.aClass185_1 = null;
		Static195.aClass3_Sub30_4 = null;
		Static90.aClass3_Sub30_10 = null;
		Static479.aClass3_Sub26_1 = null;
		if (arg0) {
			Static553.method7892(12);
			return;
		}
		Static553.method7892(3);
		try {
			Static686.method8109(Static124.anApplet1, "loggedout");
		} catch (@Pc(141) Throwable local141) {
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!d;IILjava/awt/Canvas;)Lclient!ha;")
	public static Class13 method1353(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new Class13_Sub3(arg3, arg1, arg2, arg0);
	}
}
