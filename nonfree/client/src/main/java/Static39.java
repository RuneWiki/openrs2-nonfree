import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	public static int anInt1012;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!km;")
	public static Class91 aClass91_39;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!rk;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!cg;)Lclient!uf;")
	public static Class15_Sub3 method821(@OriginalArg(1) Class1_Sub11 arg0) {
		return new Class15_Sub3(arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2681(), arg0.method2690());
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method822() {
		if (Static87.aClass113_1 != null) {
			Static87.aClass113_1.method3019();
			Static87.aClass113_1 = null;
		}
		Static197.method3240();
		Static146.method2566();
		@Pc(18) int local18;
		for (local18 = 0; local18 < 4; local18++) {
			Static88.aClass92Array1[local18].method2576();
		}
		Static131.method2228(false);
		System.gc();
		Static24.method3640();
		Static270.anInt5276 = -1;
		Static142.aBoolean225 = false;
		Static174.method2984(true);
		Static181.anInt3792 = 0;
		Static53.anInt5288 = 0;
		Static127.aBoolean210 = false;
		Static153.anInt3329 = 0;
		Static83.anInt1875 = 0;
		for (local18 = 0; local18 < Static198.aClass80Array2.length; local18++) {
			Static198.aClass80Array2[local18] = null;
		}
		Static278.anInt5374 = 0;
		Static233.anInt4582 = 0;
		for (local18 = 0; local18 < 2048; local18++) {
			Static98.aClass14_Sub2_Sub1Array1[local18] = null;
			Static76.aClass1_Sub11Array1[local18] = null;
		}
		for (local18 = 0; local18 < 32768; local18++) {
			Static254.aClass14_Sub2_Sub2Array1[local18] = null;
		}
		for (local18 = 0; local18 < 4; local18++) {
			for (@Pc(115) int local115 = 0; local115 < 104; local115++) {
				for (@Pc(120) int local120 = 0; local120 < 104; local120++) {
					Static229.aClass61ArrayArrayArray1[local18][local115][local120] = null;
				}
			}
		}
		Static56.method1051();
		Static61.anInt1305 = 0;
		Static174.method2980();
		Static281.method4072(true);
		try {
			Static309.method3982(Static253.aClass175_4.anApplet1, "loggedout");
		} catch (@Pc(157) Throwable local157) {
		}
	}
}
