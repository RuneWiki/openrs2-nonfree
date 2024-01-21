import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	public static int anInt2401;

	@OriginalMember(owner = "client!t", name = "I", descriptor = "Lclient!ee;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Lclient!v;")
	private static Class76 aClass76_1130 = Static134.method2017("Loading sprites )2 ");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_1129 = aClass76_1130;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array25 = new Class76[100];

	@OriginalMember(owner = "client!t", name = "j", descriptor = "[S")
	public static short[] aShortArray36 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!v;")
	private static Class76 aClass76_1132 = Static134.method2017("Loaded interfaces");

	@OriginalMember(owner = "client!t", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_1131 = aClass76_1132;

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!ne;")
	public static Class4_Sub10 aClass4_Sub10_7 = new Class4_Sub10(new byte[5000]);

	@OriginalMember(owner = "client!t", name = "H", descriptor = "Lclient!v;")
	public static Class76 aClass76_1133 = Static134.method2017("Fps:");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)I")
	public static int method1671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!la;Lclient!la;Lclient!mb;ZB)V")
	public static void method1672(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class4_Sub4_Sub5_Sub3_Sub1 arg2, @OriginalArg(3) boolean arg3) {
		Static41.aClass17_14 = arg0;
		Static12.aBoolean9 = arg3;
		Static118.aClass17_37 = arg1;
		Static118.aClass17_37.method283(10);
		Static56.aClass4_Sub4_Sub5_Sub3_Sub1_3 = arg2;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method1674() {
		aClass76_1129 = null;
		aClass4_Sub10_7 = null;
		aShortArray36 = null;
		aClass23_1 = null;
		aClass76_1130 = null;
		aClass76_1132 = null;
		aClass76Array25 = null;
		aClass76_1131 = null;
		aClass76_1133 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!la;Lclient!la;III)Lclient!mb;")
	public static Class4_Sub4_Sub5_Sub3_Sub1 method1679(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return Static1.method3(arg3, arg2, arg0) ? Static17.method234(arg1.method290(arg3, arg2)) : null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!qb;Z[B)V")
	public static void method1681(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class4_Sub5 local3 = new Class4_Sub5();
		local3.aByteArray3 = arg2;
		local3.anInt243 = 0;
		local3.aLong99 = arg0;
		local3.aClass58_1 = arg1;
		@Pc(22) Class78 local22 = Static8.aClass78_1;
		synchronized (Static8.aClass78_1) {
			Static8.aClass78_1.method1914(local3);
		}
		Static24.method352();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1683(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static6.aClass53_1);
		arg0.removeFocusListener(Static6.aClass53_1);
		Static111.anInt2442 = -1;
	}
}
