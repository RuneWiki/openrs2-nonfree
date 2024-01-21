import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!fd;")
	public static Class24 aClass24_33;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
	public static int anInt3005;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "Lclient!je;")
	private static Class40 aClass40_1611 = Static69.method1231("wishes to duel with you)3");

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_1608 = aClass40_1611;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_1609 = Static69.method1231("b12_full");

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public static int anInt2997 = 500;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_1610 = Static69.method1231("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	public static int anInt3007 = 0;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public static int anInt3009 = 0;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "Lclient!je;")
	public static Class40 aClass40_1612 = Static69.method1231("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	public static void method2149() {
		aClass24_33 = null;
		aClass40_1610 = null;
		aClass40_1608 = null;
		aClass40_1612 = null;
		aClass40_1609 = null;
		aClass40_1611 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
	public static int method2151(@OriginalArg(0) KeyEvent arg0) {
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
