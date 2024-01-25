import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
	public static int anInt6506;

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
	public static int anInt6507;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "[I")
	public static int[] anIntArray454 = new int[1];

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_34 = new Class330(8);

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_35 = new Class330(4);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V")
	public static void method5247(@OriginalArg(0) boolean arg0) {
		if (Static354.aClass1_1 != null) {
			Static354.aClass1_1.method50();
			Static354.aClass1_1 = null;
		}
		Static252.anInt4624 = 0;
		Static113.method1759();
		Static61.method883();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static30.aClass138Array1[local19].method3441();
		}
		Static138.method2968(false);
		System.gc();
		Static516.method7067();
		Static396.aBoolean490 = false;
		Static175.anInt3168 = -1;
		Static521.method7109(true);
		Static300.anInt5494 = 0;
		Static126.anInt2172 = 0;
		Static287.anInt5281 = 0;
		Static150.anInt2792 = 0;
		Static582.anInt8003 = 0;
		Static154.anInt2878 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static168.aClass279Array1.length; local60++) {
			Static168.aClass279Array1[local60] = null;
		}
		Static502.method6954();
		for (@Pc(79) int local79 = 0; local79 < 2048; local79++) {
			Static551.aClass15_Sub2_Sub4_Sub2Array1[local79] = null;
		}
		Static429.anInt7650 = 0;
		Static251.aClass234_29.method5463();
		Static192.anInt3744 = 0;
		Static500.aClass234_44.method5463();
		Static212.method7945();
		Static132.anInt2509 = 0;
		Static65.aClass51_1.method959();
		Static179.method2985();
		Static150.method2377();
		Static566.aClass6_Sub16_2 = null;
		Static126.aLong42 = 0L;
		if (arg0) {
			Static436.method6188(12);
			return;
		}
		Static436.method6188(3);
		try {
			Static594.method6348("loggedout", Static198.anApplet1);
		} catch (@Pc(128) Throwable local128) {
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI[B)I")
	public static int method5248(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static402.method5813(arg1, 0, arg0);
	}
}
