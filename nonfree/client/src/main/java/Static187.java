import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static187 {

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
	public static int anInt4144;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "Lclient!ah;")
	public static Class5 aClass5_13 = new Class5(32);

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1449 = Static120.method2057("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1450 = Static120.method2057("null");

	@OriginalMember(owner = "client!wh", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray40 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1451 = Static120.method2057("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1452 = Static120.method2057("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1453 = aClass81_1449;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method3153(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static43.aClass14_1);
		arg0.removeFocusListener(Static43.aClass14_1);
		Static35.anInt969 = -1;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	public static void method3154() {
		aClass81_1451 = null;
		aClass81_1453 = null;
		anIntArrayArray40 = null;
		aClass81_1449 = null;
		aClass81_1452 = null;
		aClass5_13 = null;
		aClass81_1450 = null;
	}
}
