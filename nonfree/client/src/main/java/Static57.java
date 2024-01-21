import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ja", name = "ib", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_31;

	@OriginalMember(owner = "client!ja", name = "mb", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_42;

	@OriginalMember(owner = "client!ja", name = "X", descriptor = "Lclient!kd;")
	public static Class39 aClass39_756 = Static108.method1915("leuchten2:");

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lclient!jb;")
	public static Class33 aClass33_20 = new Class33(64);

	@OriginalMember(owner = "client!ja", name = "lb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_759 = Static108.method1915("Loading sprites )2 ");

	@OriginalMember(owner = "client!ja", name = "jb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_757 = aClass39_759;

	@OriginalMember(owner = "client!ja", name = "kb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_758 = Static108.method1915("p12_full");

	@OriginalMember(owner = "client!ja", name = "nb", descriptor = "I")
	public static int anInt1547 = 0;

	@OriginalMember(owner = "client!ja", name = "ob", descriptor = "I")
	public static int anInt1548 = 0;

	@OriginalMember(owner = "client!ja", name = "pb", descriptor = "I")
	public static int anInt1549 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZB)V")
	public static void method1027(@OriginalArg(0) boolean arg0) {
		Static81.method1387();
		Static104.anInt2639++;
		if (Static104.anInt2639 < 50 && !arg0) {
			return;
		}
		Static104.anInt2639 = 0;
		if (Static24.aBoolean67 || Static29.aClass74_1 == null) {
			return;
		}
		Static103.aClass1_Sub18_Sub1_5.method2203(150);
		try {
			Static29.aClass74_1.method2055(Static103.aClass1_Sub18_Sub1_5.aByteArray96, Static103.aClass1_Sub18_Sub1_5.anInt3078);
			Static103.aClass1_Sub18_Sub1_5.anInt3078 = 0;
		} catch (@Pc(43) IOException local43) {
			Static24.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
	public static void method1029() {
		aClass39_757 = null;
		aClass62_Sub1_42 = null;
		aClass1_Sub1_Sub4_Sub1_31 = null;
		aClass33_20 = null;
		aClass39_758 = null;
		aClass39_759 = null;
		aClass39_756 = null;
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
	public static void method1031() {
		Static62.aClass70_11 = new Class70(32);
	}
}
