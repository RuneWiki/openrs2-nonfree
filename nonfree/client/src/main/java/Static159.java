import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "Lclient!rc;")
	public static Class66 aClass66_20 = new Class66(50);

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1125 = Static8.method128("Loaded title screen");

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "[Lclient!cg;")
	public static Class12[] aClass12Array1 = new Class12[50];

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1126 = aClass18_1125;

	@OriginalMember(owner = "client!ub", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1127 = Static8.method128("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ub", name = "kb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1128 = Static8.method128("sl_flags");

	@OriginalMember(owner = "client!ub", name = "lb", descriptor = "I")
	public static int anInt4381 = 0;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
	public static void method2972() {
		aClass18_1128 = null;
		aClass18_1125 = null;
		aClass18_1126 = null;
		aClass12Array1 = null;
		aClass66_20 = null;
		aClass18_1127 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2973(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = Static112.aMethod1;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static80.aClass23_1);
		arg0.addFocusListener(Static80.aClass23_1);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method2974() {
		Static9.anIntArrayArrayArray1 = null;
		Static165.anIntArray408 = null;
		Static78.anIntArray210 = null;
		Static107.aByteArrayArrayArray4 = null;
		Static28.aByteArrayArrayArray5 = null;
		Static116.anIntArray289 = null;
		Static171.aByteArrayArrayArray8 = null;
		Static141.anIntArrayArray63 = null;
		Static158.anIntArray397 = null;
		Static22.anIntArray44 = null;
		Static60.aByteArrayArrayArray3 = null;
		Static143.aByteArrayArrayArray6 = null;
	}
}
