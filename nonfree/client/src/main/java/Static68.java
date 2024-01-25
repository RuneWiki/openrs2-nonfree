import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public static int anInt1511;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Lclient!hn;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_47 = new Class62("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!di", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!oj;Z)V")
	public static void method1233(@OriginalArg(0) Class48 arg0) {
		if (Static90.aClass238_6.method5797() == 0) {
			return;
		}
		@Pc(25) Class2_Sub2 local25;
		if (Static36.anInt2910 == 0) {
			for (local25 = (Class2_Sub2) Static90.aClass238_6.method5795(); local25 != null; local25 = (Class2_Sub2) Static90.aClass238_6.method5799()) {
				Static57.aClass196_1.method4820(false, local25.aBoolean19 ? Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1 : null, false, local25.anInt128, arg0, arg0, local25.anInt130, local25.anInt133, Static135.aClass44_3, local25.anInt132, local25.anInt129);
				local25.method6130();
			}
			Static59.method899();
			return;
		}
		if (Static75.aClass48_3 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Static75.aClass48_3 = Static246.method2494(0, Static154.aClass123_2, Static332.anInterface3_7, 0, local72);
			Static73.aClass44_2 = Static75.aClass48_3.method2526(Static346.method5534(Static47.anInt762, Static381.aClass83_125), Static399.method3369(Static324.aClass83_116, Static47.anInt762));
		}
		for (local25 = (Class2_Sub2) Static90.aClass238_6.method5795(); local25 != null; local25 = (Class2_Sub2) Static90.aClass238_6.method5799()) {
			Static57.aClass196_1.method4820(false, local25.aBoolean19 ? Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1 : null, false, local25.anInt128, arg0, Static75.aClass48_3, local25.anInt130, local25.anInt133, Static73.aClass44_2, local25.anInt132, local25.anInt129);
			local25.method6130();
		}
	}
}
