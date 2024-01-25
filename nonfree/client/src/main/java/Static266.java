import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Lclient!jr;")
	public static Class1_Sub4_Sub15 aClass1_Sub4_Sub15_3;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	public static int anInt5226 = 0;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_141 = new Class21(5);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZ)V")
	public static void method4815(@OriginalArg(1) boolean arg0) {
		Static82.method1769();
		if (Static13.anInt334 != 30 && Static13.anInt334 != 25) {
			return;
		}
		Static182.anInt3704++;
		if (Static182.anInt3704 < 50 && !arg0) {
			return;
		}
		Static182.anInt3704 = 0;
		if (!Static301.aBoolean434 && Static165.aClass76_2 != null) {
			Static280.method5009(Static195.aClass18_126);
			try {
				Static165.aClass76_2.method2376(Static339.aClass1_Sub7_Sub2_4.anInt2219, Static339.aClass1_Sub7_Sub2_4.aByteArray41);
				Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
			} catch (@Pc(54) IOException local54) {
				Static301.aBoolean434 = true;
			}
		}
		Static82.method1769();
	}
}
