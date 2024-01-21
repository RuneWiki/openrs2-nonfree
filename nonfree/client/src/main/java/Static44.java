import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
	public static int anInt1488;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
	public static int anInt1489;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "[I")
	public static int[] anIntArray175;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
	public static int anInt1482 = 0;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "Lclient!gd;")
	public static Class23 aClass23_787 = Static15.method178("mapmarker");

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Lclient!ba;")
	public static Class5 aClass5_37 = new Class5(64);

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "Lclient!gd;")
	public static Class23 aClass23_788 = Static15.method178("Chat panel redrawn");

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
	public static int anInt1485 = 0;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
	public static int anInt1486 = 0;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	public static int anInt1487 = -1;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "Lclient!gd;")
	private static Class23 aClass23_790 = Static15.method178("Loaded input handler");

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_789 = aClass23_790;

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!gd;")
	public static Class23 aClass23_791 = Static15.method178(":duelreq:");

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
	public static volatile int anInt1490 = -1;

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_792 = Static15.method178(" )2>");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Lclient!gd;")
	public static Class23 method921(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static19.method274(arg0);
		} else if (arg0 < 10000000) {
			return Static17.method233(new Class23[] { Static19.method274(arg0 / 1000), Static61.aClass23_1043 });
		} else {
			return Static17.method233(new Class23[] { Static19.method274(arg0 / 1000000), Static1.aClass23_55 });
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method922() {
		aClass5_37 = null;
		aClass23_789 = null;
		aClass23_788 = null;
		aClass23_791 = null;
		aClass23_787 = null;
		anIntArray176 = null;
		anIntArray175 = null;
		aClass23_790 = null;
		aClass23_792 = null;
		aFontMetrics1 = null;
	}
}
