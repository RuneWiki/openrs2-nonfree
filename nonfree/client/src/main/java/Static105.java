import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!uh;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 aClass2_Sub4_Sub3_Sub4_5;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!ff;")
	public static Class24 aClass24_6;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "[I")
	public static int[] anIntArray239 = new int[25];

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1536 = Static107.method1838("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1537 = Static107.method1838("::rect_debug");

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public static final int anInt2600 = 3353893;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "[I")
	public static int[] anIntArray240 = new int[5];

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1538 = aClass28_1536;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1539 = Static107.method1838("runes");

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Lclient!gg;")
	public static Class28 method1829(@OriginalArg(0) int arg0) {
		return Static83.method1481(new Class28[] { Static158.method2411(arg0 >> 24 & 0xFF), Static125.aClass28_1738, Static158.method2411(arg0 >> 16 & 0xFF), Static125.aClass28_1738, Static158.method2411(arg0 >> 8 & 0xFF), Static125.aClass28_1738, Static158.method2411(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1830(@OriginalArg(0) KeyEvent arg0) {
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

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1831() {
		aClass28_1537 = null;
		aClass28_1539 = null;
		aClass24_6 = null;
		anIntArray240 = null;
		anIntArray241 = null;
		aClass28_1538 = null;
		aClass2_Sub4_Sub3_Sub4_5 = null;
		aClass28_1536 = null;
		aClass83_1 = null;
		anIntArray239 = null;
	}
}
