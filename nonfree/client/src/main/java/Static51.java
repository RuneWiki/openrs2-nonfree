import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array2;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!bl;")
	public static Class17 aClass17_3 = new Class17();

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Z")
	public static boolean aBoolean91 = true;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	public static int anInt1077 = -2;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ak;Lclient!ak;Lclient!un;Lclient!ak;Z)Z")
	public static boolean method875(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class1_Sub8_Sub4 arg2, @OriginalArg(3) Class7 arg3) {
		Static230.aClass7_187 = arg0;
		Static256.aClass1_Sub8_Sub4_3 = arg2;
		Static76.aClass7_76 = arg1;
		Static218.aClass7_56 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method877() {
		if (Static155.aClass73_3 != null) {
			Static155.aClass73_3.method1691();
			Static155.aClass73_3 = null;
		}
		Static115.method1779();
		Static196.method2977();
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			Static27.aClass2Array1[local17].method110();
		}
		Static115.method1777(false);
		System.gc();
		Static140.method2197();
		Static295.aBoolean448 = false;
		Static4.anInt146 = -1;
		Static105.method1664(true);
		Static179.anInt3322 = 0;
		Static75.anInt1495 = 0;
		Static158.anInt2961 = 0;
		Static86.aBoolean124 = false;
		Static224.anInt4695 = 0;
		for (local17 = 0; local17 < Static187.aClass36Array1.length; local17++) {
			Static187.aClass36Array1[local17] = null;
		}
		Static241.anInt4977 = 0;
		Static293.anInt5831 = 0;
		for (local17 = 0; local17 < 2048; local17++) {
			Static77.aClass6_Sub6_Sub2Array1[local17] = null;
			Static130.aClass1_Sub18Array1[local17] = null;
		}
		for (local17 = 0; local17 < 32768; local17++) {
			Static211.aClass6_Sub6_Sub1Array2[local17] = null;
		}
		for (local17 = 0; local17 < 4; local17++) {
			for (@Pc(115) int local115 = 0; local115 < 104; local115++) {
				for (@Pc(120) int local120 = 0; local120 < 104; local120++) {
					Static4.aClass69ArrayArrayArray1[local17][local115][local120] = null;
				}
			}
		}
		Static139.method2191();
		Static170.anInt3124 = 0;
		Static205.method3209();
		Static26.method442(true);
		try {
			Static301.method946("loggedout", Static13.aClass84_3.anApplet1);
		} catch (@Pc(161) Throwable local161) {
		}
	}
}
