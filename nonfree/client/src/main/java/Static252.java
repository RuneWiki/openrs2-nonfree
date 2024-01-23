import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!la;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!cj;")
	public static Class27 aClass27_35;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public static volatile int anInt5112 = 0;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString356 = "Starting 3d Library";

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	public static int anInt5113 = -2;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method3855() {
		Static302.method4613();
		Static111.method1805();
		Static137.method1700();
		Static147.method2378();
		Static133.method2267();
		Static39.method810();
		Static105.method1741();
		Static64.method1134();
		Static251.method4177();
		Static168.method2741();
		Static13.method343();
		Static94.method1602();
		Static17.method415();
		Static203.method4326();
		Static300.method4569();
		Static19.method424();
		Static165.method2680();
		Static288.method4418();
		Static36.method770();
		Static300.method4581();
		Static219.method3467();
		Static46.aClass89_7.method2266();
		Static203.aClass89_45.method2266();
		Static138.aClass89_18.method2266();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Lclient!me;")
	public static Class106 method3857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class106 local14 = local7.aClass106_1;
			local7.aClass106_1 = null;
			return local14;
		}
	}
}
