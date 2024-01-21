import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!tc", name = "dc", descriptor = "Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 aClass6_Sub3_Sub3_Sub2_5;

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "Lclient!mb;")
	public static Class49 aClass49_27 = new Class49(64);

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1595 = Static80.method1463("Fallen lassen");

	@OriginalMember(owner = "client!tc", name = "ob", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1596 = Static80.method1463("Accept trade");

	@OriginalMember(owner = "client!tc", name = "qb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1597 = aClass63_1596;

	@OriginalMember(owner = "client!tc", name = "Bb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1598 = Static80.method1463("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!tc", name = "Eb", descriptor = "I")
	public static int anInt2947 = 0;

	@OriginalMember(owner = "client!tc", name = "Ub", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array20 = new Class63[100];

	@OriginalMember(owner = "client!tc", name = "Yb", descriptor = "I")
	public static int anInt2957 = 0;

	@OriginalMember(owner = "client!tc", name = "Zb", descriptor = "I")
	public static int anInt2958 = 0;

	@OriginalMember(owner = "client!tc", name = "cc", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1599 = Static80.method1463("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!tc", name = "fc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1600 = aClass63_1599;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!da;")
	public static Class6_Sub3_Sub4 method1921(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub3_Sub4 local10 = (Class6_Sub3_Sub4) Static17.aClass49_25.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static48.aClass7_28.method110(5, arg0);
		local10 = new Class6_Sub3_Sub4();
		if (local20 != null) {
			local10.method525(new Class6_Sub4(local20));
		}
		Static17.aClass49_25.method1396((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public static void method1924() {
		aClass63_1595 = null;
		aClass63_1597 = null;
		aClass63_1598 = null;
		aClass63Array20 = null;
		aClass63_1599 = null;
		aClass49_27 = null;
		aClass63_1600 = null;
		aClass6_Sub3_Sub3_Sub2_5 = null;
		aClass63_1596 = null;
	}
}
