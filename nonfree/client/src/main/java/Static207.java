import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
	public static int anInt4248;

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_74 = new Class117("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "[B")
	public static final byte[] aByteArray64 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
	public static int anInt4247 = 0;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
	public static void method3720() {
		Static168.aClass26_30.method333();
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)V")
	public static void method3721() {
		Static330.aClass26_57.method333();
		Static313.aClass26_56.method333();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/lang/Object;Lclient!ko;)V")
	public static void method3723(@OriginalArg(1) Object arg0, @OriginalArg(2) Class118 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static244.method4311(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
