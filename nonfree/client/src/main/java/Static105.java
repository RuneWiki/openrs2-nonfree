import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "Lclient!fe;")
	public static Class86 aClass86_3;

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "Z")
	public static boolean aBoolean148 = true;

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "[I")
	public static final int[] anIntArray219 = new int[3];

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
	public static int anInt2009 = 0;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "()V")
	public static void method1938() {
		for (@Pc(1) int local1 = 0; local1 < Static112.anInt2255; local1++) {
			@Pc(6) Class1_Sub1 local6 = Static126.aClass1_Sub1Array5[local1];
			Static363.method1118(local6);
			Static126.aClass1_Sub1Array5[local1] = null;
		}
		Static112.anInt2255 = 0;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!ps;I)V")
	public static void method1940(@OriginalArg(0) Class2_Sub29 arg0) {
		@Pc(11) int local11 = arg0.method5182();
		Static226.aClass203Array1 = new Class203[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			Static226.aClass203Array1[local16] = new Class203();
			Static226.aClass203Array1[local16].anInt6041 = arg0.method5182();
			Static226.aClass203Array1[local16].aString130 = arg0.method5176();
		}
		Static75.anInt1566 = arg0.method5182();
		Static155.anInt2819 = arg0.method5182();
		Static12.anInt263 = arg0.method5182();
		Static365.aClass178_Sub1Array1 = new Class178_Sub1[Static155.anInt2819 + 1 - Static75.anInt1566];
		for (@Pc(68) int local68 = 0; local68 < Static12.anInt263; local68++) {
			@Pc(74) int local74 = arg0.method5182();
			@Pc(82) Class178_Sub1 local82 = Static365.aClass178_Sub1Array1[local74] = new Class178_Sub1();
			local82.anInt5253 = arg0.method5170();
			local82.anInt5255 = arg0.method5198();
			local82.anInt5263 = local74 + Static75.anInt1566;
			local82.aString117 = arg0.method5176();
			local82.aString116 = arg0.method5176();
		}
		Static424.anInt7846 = arg0.method5198();
		Static427.aBoolean580 = true;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZII)Z")
	public static boolean method1941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static291.method4612(arg0, arg1) | Static538.method7755(arg1, arg0) | Static114.method2233(arg1, arg0)) & Static70.method1448(arg1, arg0);
	}
}
