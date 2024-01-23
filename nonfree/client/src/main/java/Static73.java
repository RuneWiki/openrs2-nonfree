import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static73 {

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Z")
	public static boolean aBoolean87;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
	public static int anInt1539;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6 = new String[500];

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "Lclient!hi;")
	public static Class66 aClass66_15 = null;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	public static int anInt1540 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(JB)V")
	public static void method1457(@OriginalArg(0) long arg0) {
		Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
		Static127.aClass1_Sub14_Sub1_3.method1390(21);
		Static127.aClass1_Sub14_Sub1_3.method1374(arg0);
		Static280.anInt5073 = 0;
		Static178.anInt3427 = -3;
		Static227.anInt4177 = 1;
		Static314.anInt864 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method1460(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static136.method2364(arg0, 0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method1461(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
