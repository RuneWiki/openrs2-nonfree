import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array9;

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
	public static int anInt4151;

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
	public static int anInt4152;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "Lclient!u;")
	public static Class76 aClass76_123;

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1396 = Static49.method1293("This world is full)3");

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1392 = aClass70_1396;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1393 = Static49.method1293("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
	public static volatile int anInt4149 = 0;

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1394 = aClass70_1393;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1395 = Static49.method1293("scape main");

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
	public static void method3171() {
		aClass70_1396 = null;
		aClass70_1392 = null;
		aClass1_Sub1_Sub1_Sub4Array9 = null;
		aClass76_123 = null;
		aClass70_1393 = null;
		aClass70_1395 = null;
		aClass70_1394 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!u;Lclient!rf;Lclient!rf;)[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] method3172(@OriginalArg(1) Class76 arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		@Pc(10) int local10 = arg0.method3309(arg1);
		@Pc(16) int local16 = arg0.method3312(arg2, local10);
		return Static52.method1328(local10, local16, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(II)Lclient!rf;")
	public static Class70 method3173(@OriginalArg(0) int arg0) {
		return Static174.aClass70Array23[arg0].method2896() > 0 ? Static160.method3210(new Class70[] { Static30.aClass70Array6[arg0], Static3.aClass70_51, Static174.aClass70Array23[arg0] }) : Static30.aClass70Array6[arg0];
	}
}
