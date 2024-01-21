import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static165 {

	@OriginalMember(owner = "client!uc", name = "pb", descriptor = "Lclient!fc;")
	public static Class21 aClass21_2;

	@OriginalMember(owner = "client!uc", name = "qb", descriptor = "Lclient!th;")
	public static Class2_Sub4_Sub3_Sub2_Sub1 aClass2_Sub4_Sub3_Sub2_Sub1_5;

	@OriginalMember(owner = "client!uc", name = "sb", descriptor = "I")
	public static int anInt3686;

	@OriginalMember(owner = "client!uc", name = "ub", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!uc", name = "ib", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2186 = Static107.method1838("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!uc", name = "kb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2187 = Static107.method1838("<)4col>");

	@OriginalMember(owner = "client!uc", name = "ob", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!uc", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2188 = Static107.method1838("<col=00ff80>");

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method2569() {
		aClass2_Sub4_Sub3_Sub2_Sub1_5 = null;
		aClass28_2187 = null;
		aClass21_2 = null;
		aClass28_2186 = null;
		anIntArray339 = null;
		anObject3 = null;
		aClass28_2188 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!ff;)Z")
	public static boolean method2570(@OriginalArg(1) Class24 arg0) {
		if (Static29.aBoolean34) {
			if (Static10.method323(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1425 == 0) {
				return false;
			}
		}
		return arg0.aBoolean72;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JI)V")
	public static void method2571(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static128.aClass2_Sub2_Sub1_2.method1711(230);
			Static128.aClass2_Sub2_Sub1_2.method1666(arg0);
		}
	}
}
