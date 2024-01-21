import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
	public static int[] anIntArray390;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "Lclient!v;")
	private static Class76 aClass76_1246 = Static134.method2017("glow3:");

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_1241 = aClass76_1246;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Lclient!v;")
	private static Class76 aClass76_1245 = Static134.method2017("Select");

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_1242 = aClass76_1245;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
	public static int[] anIntArray389 = new int[128];

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_1243 = Static134.method2017("null");

	@OriginalMember(owner = "client!v", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_1244 = Static134.method2017("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	public static int anInt2653 = 0;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Lclient!v;")
	public static Class76 aClass76_1247 = aClass76_1246;

	@OriginalMember(owner = "client!v", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_1248 = Static134.method2017("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
	public static int anInt2674 = -1;

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
	public static int anInt2680 = 0;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
	public static boolean method1852(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method1870() {
		aClass76_1245 = null;
		aClass76_1248 = null;
		anIntArray390 = null;
		anIntArray389 = null;
		aClass76_1246 = null;
		aClass76_1243 = null;
		aClass76_1242 = null;
		aClass76_1241 = null;
		aClass76_1244 = null;
		aClass76_1247 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)I")
	public static int method1889(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1890(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static92.aClass55_1);
		arg0.addMouseMotionListener(Static92.aClass55_1);
		arg0.addFocusListener(Static92.aClass55_1);
	}
}
