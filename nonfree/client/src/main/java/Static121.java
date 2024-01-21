import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Lclient!f;")
	public static Class13 aClass13_23;

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "Lclient!f;")
	public static Class13 aClass13_24;

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_14;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "Lclient!sc;")
	public static Class72 aClass72_38 = new Class72();

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
	public static int anInt2850 = 0;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1600 = Static122.method531("mn");

	@OriginalMember(owner = "client!oh", name = "B", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1603 = Static122.method531("level)2");

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1601 = aClass73_1603;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1602 = Static122.method531("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1604 = Static122.method531("Ausw-=hlen");

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public static void method2097() {
		aClass73_1600 = null;
		aClass13_23 = null;
		aClass73_1603 = null;
		aClass13_24 = null;
		aClass73_1601 = null;
		aShortArrayArray4 = null;
		aClass73_1602 = null;
		aClass13_Sub1_14 = null;
		aClass73_1604 = null;
		aClass72_38 = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/Object;ILclient!ih;)V")
	public static void method2098(@OriginalArg(0) Object arg0, @OriginalArg(2) Class39 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static166.method2609(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
