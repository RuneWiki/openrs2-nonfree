import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_40;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "Lclient!nb;")
	public static Class15 aClass15_14;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public static int anInt1641;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	public static int anInt1642;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_473 = Static184.method2923("");

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array24 = new Class41[500];

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	public static int anInt1639 = 0;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "[I")
	public static int[] anIntArray160 = new int[5];

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_474 = Static184.method2923("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "Lclient!wi;")
	public static Class108 aClass108_5 = new Class108();

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_475 = Static184.method2923("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1129(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}
}
