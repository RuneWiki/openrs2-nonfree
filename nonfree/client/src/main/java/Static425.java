import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray5;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public static int anInt5332 = 0;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method4452() {
		if (Static600.aClass87_15 == null) {
			return;
		}
		if (Static558.aBoolean680) {
			Static173.method3214();
		}
		Static98.aClass329_2.method7691();
		Static410.method6309();
		Static266.method4304();
		Static153.method2912();
		Static4.method57();
		Static264.method4291();
		if (Static587.aClass17_1 != null) {
			Static587.aClass17_1.method323();
		}
		Static278.method4446();
		Static320.method4827();
		Static435.method6491();
		Static284.method8369();
		Static328.method4913(false);
		for (@Pc(46) int local46 = 0; local46 < 2048; local46++) {
			@Pc(51) Class11_Sub1_Sub1_Sub2_Sub1 local51 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local46];
			if (local51 != null) {
				for (@Pc(55) int local55 = 0; local55 < local51.aClass25Array3.length; local55++) {
					local51.aClass25Array3[local55] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static225.anInt4616; local75++) {
			@Pc(81) Class11_Sub1_Sub1_Sub2_Sub2 local81 = Static86.aClass2_Sub51Array1[local75].aClass11_Sub1_Sub1_Sub2_Sub2_2;
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass25Array3.length; local85++) {
					local81.aClass25Array3[local85] = null;
				}
			}
		}
		Class6_Sub2.lb = null;
		Static386.aClass6_27 = null;
		Static600.aClass87_15.method7959();
		Static600.aClass87_15 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V")
	public static void method4453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static228.anInt4643 == 1) {
			Static92.method1620(arg1, Static401.aClass2_Sub5_Sub20_19, arg0);
		} else if (Static228.anInt4643 == 2) {
			if (Static558.aBoolean680) {
				Static240.method3964(arg0 + Static290.method4545(), arg1 + Static257.method4233());
			} else {
				Static240.method3964(arg0, arg1);
			}
		}
		Static228.anInt4643 = 0;
		Static401.aClass2_Sub5_Sub20_19 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!eq;)V")
	public static void method4455(@OriginalArg(1) Class97 arg0) {
		Static88.aClass97_97 = arg0;
	}
}
