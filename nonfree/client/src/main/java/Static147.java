import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jh", name = "Lb", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
	public static int anInt2723 = 0;

	@OriginalMember(owner = "client!jh", name = "Cb", descriptor = "Z")
	public static boolean aBoolean216 = false;

	@OriginalMember(owner = "client!jh", name = "Qb", descriptor = "[I")
	public static final int[] anIntArray341 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "(I)V")
	public static void method2877() {
		Static47.method786();
		Static242.method4249();
		Static213.method3828();
		Static28.method471();
		Static20.method300();
		Static198.method3627();
		Static271.method4595();
		Static320.method5356();
		Static324.method5383();
		Static155.method4928();
		Static56.method2569();
		Static29.method476();
		Static86.method1478();
		Static30.method485();
		Static138.method4286();
		Static312.method5289();
		Static201.method3643();
		Static264.method4475();
		Static30.method484();
		Static23.method353();
		Static51.method850();
		Static252.method4328();
		Static343.method5642();
		Static132.aClass70_43.method1405();
		Static226.aClass70_75.method1405();
		Static323.aClass70_102.method1405();
		Static133.aClass70_45.method1405();
		Static140.aClass70_49.method1405();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ja;Lclient!mb;B)V")
	public static void method2878(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class132 arg1) {
		Static148.method2896(arg1, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(JLclient!ja;B)V")
	public static void method2881(@OriginalArg(0) long arg0, @OriginalArg(1) Class81 arg1) {
		Static41.anInt6381 = Static281.anInt5315;
		Static337.anInt6154 = 0;
		Static281.anInt5315 = 0;
		@Pc(16) long local16 = Static245.method4300();
		for (@Pc(25) Class20_Sub2 local25 = (Class20_Sub2) Static334.aClass109_7.method2948(); local25 != null; local25 = (Class20_Sub2) Static334.aClass109_7.method2939()) {
			if (local25.method444(arg1, arg0)) {
				Static337.anInt6154++;
			}
		}
		if (Static200.aBoolean283 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static334.aClass109_7.method2947() + ", running: " + Static337.anInt6154 + ". Particles: " + Static281.anInt5315 + ". Time taken: " + (Static245.method4300() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(BI)V")
	public static void method2885() {
		@Pc(5) Class70 local5 = Static9.aClass70_4;
		synchronized (Static9.aClass70_4) {
			Static9.aClass70_4.method1397(5);
		}
	}
}
