import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!vl;")
	public static Class263 aClass263_24;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!du;")
	public static final Class62 aClass62_24 = new Class62(10, 4);

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	public static int anInt3892 = 0;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	public static int anInt3893 = 2;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!za;Z)V")
	public static void method3028(@OriginalArg(0) Class117 arg0) {
		if (Static285.aClass14_29.method213() == 0) {
			return;
		}
		@Pc(55) Class1_Sub34 local55;
		if (Static214.anInt3968 == 0) {
			for (local55 = (Class1_Sub34) Static285.aClass14_29.method203(); local55 != null; local55 = (Class1_Sub34) Static285.aClass14_29.method208()) {
				Static285.aClass226_2.method4781(arg0, false, local55.anInt5275, arg0, local55.anInt5277, local55.anInt5280, Static300.aClass137_7, local55.anInt5276, false, local55.anInt5281, local55.aBoolean475 ? Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1 : null);
				local55.method5953();
			}
			Static186.method2688();
			return;
		}
		if (Static329.aClass117_5 == null) {
			@Pc(25) Canvas local25 = new Canvas();
			local25.setSize(36, 32);
			Static329.aClass117_5 = Static465.method5715(0, local25, 0, Static302.anInterface4_7, Static259.aClass177_2);
			Static250.aClass137_6 = Static329.aClass117_5.method5680(Static152.method1914(Static386.aClass185_118, Static31.anInt478), Static467.method894(Static178.aClass185_49, Static31.anInt478));
		}
		for (local55 = (Class1_Sub34) Static285.aClass14_29.method203(); local55 != null; local55 = (Class1_Sub34) Static285.aClass14_29.method208()) {
			Static285.aClass226_2.method4781(arg0, false, local55.anInt5275, Static329.aClass117_5, local55.anInt5277, local55.anInt5280, Static250.aClass137_6, local55.anInt5276, false, local55.anInt5281, local55.aBoolean475 ? Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1 : null);
			local55.method5953();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method3029() {
		if (Static372.anInt5995 == 6) {
			Static372.anInt5995 = 7;
		}
	}
}
