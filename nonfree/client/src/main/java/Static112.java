import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!pb;")
	public static Class61 aClass61_12 = new Class61();

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1467 = Static28.method504(")1");

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "B")
	public static byte aByte7 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1973() {
		if (!Static64.aBoolean94) {
			return;
		}
		Static28.anIntArray84 = null;
		Static105.aClass4_Sub2_Sub3_Sub4_5 = null;
		Static32.aClass4_Sub2_Sub3_Sub4_2 = null;
		Static13.aClass4_Sub2_Sub3_Sub4Array1 = null;
		Static130.aClass4_Sub2_Sub3_Sub4Array9 = null;
		Static97.anIntArray276 = null;
		Static20.anIntArray59 = null;
		Static130.anIntArray365 = null;
		Static108.aClass4_Sub2_Sub3_Sub4Array6 = null;
		Static14.aClass4_Sub2_Sub3_Sub4_1 = null;
		Static1.anIntArray2 = null;
		Static109.aClass4_Sub2_Sub3_Sub1Array11 = null;
		Static64.anIntArray177 = null;
		Static93.aClass4_Sub2_Sub3_Sub1_9 = null;
		Static30.anIntArray86 = null;
		Static51.aClass4_Sub2_Sub3_Sub1_5 = null;
		Static113.anIntArray306 = null;
		Static36.aClass4_Sub2_Sub3_Sub4_3 = null;
		Static78.aClass4_Sub2_Sub3_Sub4Array5 = null;
		Static111.aClass4_Sub2_Sub3_Sub4Array7 = null;
		Static16.method258();
		Static68.method1172(true);
		Static64.aBoolean94 = false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method1974() {
		aClass39_1467 = null;
		aClass61_12 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJ)V")
	public static void method1975(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}
