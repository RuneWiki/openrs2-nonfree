import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static174 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt3617;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt3615 = -1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method3443(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static69.method1390(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method3444() {
		Static186.method3616(Static261.aCanvas4);
		Static68.method1387(Static261.aCanvas4);
		if (Static297.aClass153_1 != null) {
			Static297.aClass153_1.method5540(Static261.aCanvas4);
		}
		Static242.aClient1.method1070();
		Static261.aCanvas4.setBackground(Color.black);
		Static218.anInt4269 = -1;
		Static197.method5561(Static261.aCanvas4);
		Static205.method3809(Static261.aCanvas4);
		if (Static297.aClass153_1 != null) {
			Static297.aClass153_1.method5541(Static261.aCanvas4);
		}
	}
}
