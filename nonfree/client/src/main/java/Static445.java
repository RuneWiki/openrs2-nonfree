import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Lclient!gh;")
	public static Class81 aClass81_2;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public static int anInt7274;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "F")
	public static float aFloat222;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method5615() {
		Static166.aClass247Array1 = null;
		Static11.method123(0, -1, 0, Static141.anInt2881, Static334.anInt5766, Static302.anInt5346, 0, 0);
		if (Static166.aClass247Array1 != null) {
			Static147.method2460(0, Static141.anInt2881, Static258.anInt4823, Static57.aClass247_1.anInt6852, Static166.aClass247Array1, 0, -1412584499, Static302.anInt5346, Static151.anInt3054);
			Static166.aClass247Array1 = null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	public static void method5617() {
		Static212.anInt3932 = 0;
		Static22.aBoolean38 = false;
		Static299.anInt5328 = -1;
		Static175.anInt3398 = 0;
		Static64.anInt1366 = 0;
		Static238.anInt4506 = 1;
		Static296.anInt5302 = -3;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method5618(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static2.aString1 = arg0;
		Static297.aString52 = arg2;
		Static161.anInt3177 = arg1;
		if (Static2.aString1.equals("") || Static297.aString52.equals("")) {
			Static296.anInt5302 = 3;
		} else if (Static56.anInt1028 == -1) {
			Static296.anInt5302 = -3;
			Static276.anInt970 = 0;
			Static405.anInt6682 = 1;
			Static239.anInt4518 = 0;
			@Pc(40) Class4_Sub12 local40 = new Class4_Sub12(128);
			local40.method2551(10);
			local40.method2531((int) (Math.random() * 9.9999999E7D));
			local40.method2504(Static96.method1684(Static2.aString1));
			local40.method2531((int) (Math.random() * 9.9999999E7D));
			local40.method2518(Static297.aString52);
			local40.method2531((int) (Math.random() * 9.9999999E7D));
			local40.method2522(Static85.aBigInteger1, Static309.aBigInteger2);
			Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
			Static3.aClass4_Sub12_Sub1_5.method2551(Static153.aClass60_10.anInt1812);
			Static3.aClass4_Sub12_Sub1_5.method2551(local40.anInt2997 + 2);
			Static3.aClass4_Sub12_Sub1_5.method2524(592);
			Static3.aClass4_Sub12_Sub1_5.method2519(local40.aByteArray36, local40.anInt2997);
		} else {
			method5617();
		}
	}
}
