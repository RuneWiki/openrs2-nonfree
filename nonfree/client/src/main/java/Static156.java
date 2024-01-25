import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!qa;")
	public static Class67_Sub3_Sub3_Sub2 aClass67_Sub3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	public static int anInt2981;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_26 = new Class26(4);

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!gd;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	public static final int[] anIntArray198 = new int[3];

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public static int anInt2987 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)Lclient!gh;")
	public static Class82 method2516(@OriginalArg(0) int arg0) {
		@Pc(5) Class26 local5 = Static59.aClass26_5;
		@Pc(14) Class82 local14;
		synchronized (Static59.aClass26_5) {
			local14 = (Class82) Static59.aClass26_5.method332((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static75.aClass144_28.method3896(Static92.method1346(arg0), Static349.method5643(arg0));
		local14 = new Class82();
		local14.anInt1863 = arg0;
		if (local34 != null) {
			local14.method1567(new Class11_Sub25(local34));
		}
		local14.method1562();
		@Pc(61) Class26 local61 = Static59.aClass26_5;
		synchronized (Static59.aClass26_5) {
			Static59.aClass26_5.method330((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)Lclient!bf;")
	public static Class24 method2517() {
		try {
			return (Class24) Class.forName("Class24_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!nq;I)V")
	public static void method2519(@OriginalArg(0) Class144 arg0) {
		Static328.aClass144_105 = arg0;
		Static306.anInt6039 = Static328.aClass144_105.method3890(19);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public static void method2520(@OriginalArg(0) int arg0) {
		Static313.method5276();
		Static172.method2812();
		Static195.method3969(true, arg0);
		Static96.method1451(Static182.aClass144_49, Static318.aClass144_101, Static107.aClass129_4);
		Static106.method1617(Static182.aClass144_49, Static107.aClass129_4);
		Static81.method1213(Static213.aClass97Array17);
		Static92.method1348();
		Static239.method4236();
		if (Static245.anInt6561 == 10) {
			Static136.method5520(false);
		} else if (Static245.anInt6561 == 30) {
			Static284.method4731(25);
		} else if (Static245.anInt6561 == 5) {
			Static287.method4785(Static182.aClass144_49, Static107.aClass129_4);
		}
	}
}
