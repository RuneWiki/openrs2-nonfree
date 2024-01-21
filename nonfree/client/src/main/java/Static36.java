import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!e", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray24;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Lclient!ed;")
	private static Class23 aClass23_379 = Static169.method2903(" more options");

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_380 = Static169.method2903("Die Verbindung konnte");

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!ed;")
	public static Class23 aClass23_381 = Static169.method2903("<col=ffff00>");

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!ed;")
	public static Class23 aClass23_382 = Static169.method2903("blaugr-Un:");

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!ed;")
	private static Class23 aClass23_384 = Static169.method2903("Please try again)3");

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_383 = aClass23_384;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "[Lclient!jg;")
	public static Class1_Sub8[] aClass1_Sub8Array1 = new Class1_Sub8[2048];

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_385 = aClass23_379;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	public static int anInt984 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method586(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static93.aClass51_1);
		arg0.removeMouseMotionListener(Static93.aClass51_1);
		arg0.removeFocusListener(Static93.aClass51_1);
		Static139.anInt3553 = 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	public static void method587(@OriginalArg(0) int arg0) {
		Static20.anInt672 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lclient!ed;")
	public static Class23 method588(@OriginalArg(0) int arg0) {
		@Pc(14) Class23 local14 = Static27.method498(arg0);
		for (@Pc(20) int local20 = local14.method642() - 3; local20 > 0; local20 -= 3) {
			local14 = Static149.method2571(new Class23[] { local14.method635(0, local20), Static125.aClass23_1215, local14.method632(local20) });
		}
		if (local14.method642() > 9) {
			return Static149.method2571(new Class23[] { Static98.aClass23_967, local14.method635(0, local14.method642() - 8), Static84.aClass23_1666, Static92.aClass23_916, local14, Static115.aClass23_1138 });
		} else if (local14.method642() > 6) {
			return Static149.method2571(new Class23[] { Static82.aClass23_808, local14.method635(0, local14.method642() - 4), Static101.aClass23_996, Static92.aClass23_916, local14, Static115.aClass23_1138 });
		} else {
			return Static149.method2571(new Class23[] { Static100.aClass23_992, local14, Static67.aClass23_650 });
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method589() {
		aClass23_384 = null;
		aByteArrayArrayArray24 = null;
		aClass23_383 = null;
		aClass23_380 = null;
		anIntArray123 = null;
		aClass23_385 = null;
		aClass23_381 = null;
		aClass23_379 = null;
		aClass1_Sub8Array1 = null;
		aClass23_382 = null;
	}
}
