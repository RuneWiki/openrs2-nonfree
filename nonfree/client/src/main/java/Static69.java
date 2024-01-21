import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt1483;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!qc;")
	public static Class66 aClass66_11;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt1480 = 0;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public static int anInt1481 = 0;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!p;")
	public static Class63 aClass63_11 = new Class63(64);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1144() {
		try {
			@Pc(2) Graphics local2 = Static119.aCanvas1.getGraphics();
			Static101.aClass7_15.method1095(local2, 553, 205);
		} catch (@Pc(15) Exception local15) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZZ)I")
	public static int method1145() {
		return Static30.anInt823 + Static98.anInt2779;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1146() {
		aClass63_11 = null;
		aClass66_11 = null;
	}
}
