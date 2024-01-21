import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static26 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!dd;")
	public static Class16 aClass16_4;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_1;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "[Lclient!pa;")
	public static Class1_Sub19[] aClass1_Sub19Array1;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_11;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!ea;")
	private static Class18 aClass18_223 = Static8.method128("Please wait)3)3)3");

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!ea;")
	public static Class18 aClass18_222 = aClass18_223;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_224 = Static8.method128("Registrierter Benutzer");

	@OriginalMember(owner = "client!db", name = "p", descriptor = "[I")
	public static int[] anIntArray53 = new int[1000];

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Lclient!ea;")
	public static Class18 aClass18_225 = null;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method573() {
		aClass18_223 = null;
		aClass16_Sub1_11 = null;
		aClass16_4 = null;
		aClass1_Sub1_Sub8_Sub3_1 = null;
		aClass1_Sub19Array1 = null;
		aClass18_225 = null;
		aClass18_224 = null;
		aClass18_222 = null;
		anIntArray53 = null;
		anIntArray54 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method575() {
		if (!Static161.aBoolean197) {
			return;
		}
		Static4.aClass1_Sub1_Sub8_Sub3Array1 = null;
		Static46.anIntArray432 = null;
		Static126.aClass1_Sub1_Sub8_Sub1Array8 = null;
		Static95.aClass1_Sub1_Sub8_Sub1_3 = null;
		Static119.aClass1_Sub1_Sub8_Sub3_4 = null;
		Static163.anIntArray405 = null;
		Static154.aClass1_Sub1_Sub8_Sub1Array9 = null;
		Static101.aClass1_Sub1_Sub8_Sub1_4 = null;
		Static118.aClass1_Sub1_Sub8_Sub1_5 = null;
		Static107.anIntArray277 = null;
		Static145.anIntArray374 = null;
		Static135.aClass1_Sub1_Sub8_Sub3_6 = null;
		aClass1_Sub1_Sub8_Sub3_1 = null;
		Static61.anIntArray157 = null;
		Static54.anIntArray137 = null;
		Static29.aClass1_Sub1_Sub8_Sub1_1 = null;
		Static106.aClass1_Sub1_Sub8_Sub1Array6 = null;
		Static86.anIntArray232 = null;
		Static163.aClass1_Sub1_Sub8_Sub1Array10 = null;
		Static74.anIntArray198 = null;
		Static80.aClass1_Sub1_Sub8_Sub1Array4 = null;
		Static95.aClass1_Sub1_Sub8_Sub3_3 = null;
		Static69.method1447();
		Static12.method3146(true);
		Static161.aBoolean197 = false;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method576(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static136.aClass10_1);
		arg0.addMouseMotionListener(Static136.aClass10_1);
		arg0.addFocusListener(Static136.aClass10_1);
	}
}
