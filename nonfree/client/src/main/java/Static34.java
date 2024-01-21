import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	public static int anInt1158;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "J")
	public static long aLong41;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "[Lclient!hi;")
	public static Class35[] aClass35Array1 = new Class35[500];

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "[Lclient!v;")
	public static Class88[] aClass88Array1 = new Class88[16];

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_399 = Static161.method2971("<)4col>");

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "Lclient!dd;")
	private static Class13 aClass13_401 = Static161.method2971("Prepared sound engine");

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_400 = aClass13_401;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array7 = new Class13[200];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method955(@OriginalArg(1) KeyEvent arg0) {
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

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method956() {
		aClass13_401 = null;
		aClass35Array1 = null;
		aClass13_399 = null;
		aClass13Array7 = null;
		aClass13_400 = null;
		aClass88Array1 = null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Lclient!dd;")
	public static Class13 method957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return Static31.aClass13_379;
		} else if (local8 < -6) {
			return Static71.aClass13_695;
		} else if (local8 < -3) {
			return Static83.aClass13_779;
		} else if (local8 < 0) {
			return Static153.aClass13_1253;
		} else if (local8 > 9) {
			return Static75.aClass13_724;
		} else if (local8 > 6) {
			return Static121.aClass13_1054;
		} else if (local8 > 3) {
			return Static185.aClass13_1415;
		} else if (local8 > 0) {
			return Static99.aClass13_887;
		} else {
			return Static91.aClass13_859;
		}
	}
}
