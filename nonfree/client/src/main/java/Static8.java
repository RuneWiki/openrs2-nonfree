import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!afa", name = "H", descriptor = "Lclient!wf;")
	public static Class360 aClass360_1;

	@OriginalMember(owner = "client!afa", name = "I", descriptor = "I")
	public static int anInt227 = 0;

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(B)V")
	public static void method173() {
		@Pc(1) Class21 local1 = Static133.aClass21_19;
		synchronized (Static133.aClass21_19) {
			Static133.aClass21_19.method313();
		}
	}

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "(B)V")
	public static void method174() {
		Static106.aClass150_3.method2630();
		Static205.aClass131_1.method6547();
		Static474.aClient1.method1146();
		Static9.aCanvas1.setBackground(Color.black);
		Static37.anInt678 = -1;
		Static106.aClass150_3 = Static209.method2579(Static9.aCanvas1);
		Static205.aClass131_1 = Static383.method5318(Static9.aCanvas1);
	}
}
