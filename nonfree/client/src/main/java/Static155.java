import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lclient!bg;")
	public static Class11 aClass11_123;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
	public static int anInt3385;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1504 = Static32.method683("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1505 = aClass49_1504;

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "Lclient!tf;")
	public static Class81 aClass81_13 = new Class81();

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1506 = Static32.method683("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1508 = Static32.method683("Connection lost)3");

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1507 = aClass49_1508;

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
	public static int anInt3386 = 0;

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
	public static int anInt3387 = 0;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
	public static int anInt3388 = 0;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)Lclient!he;")
	public static Class2_Sub2_Sub7 method2620(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub7 local10 = (Class2_Sub2_Sub7) Static77.aClass74_55.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static127.aClass11_100.method2049(arg0, 16);
		local10 = new Class2_Sub2_Sub7();
		if (local20 != null) {
			local10.method1146(new Class2_Sub13(local20));
		}
		Static77.aClass74_55.method2341((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
	public static void method2621() {
		aClass49_1508 = null;
		aClass11_123 = null;
		aClass49_1505 = null;
		aClass49_1504 = null;
		aClass49_1506 = null;
		aClass49_1507 = null;
		aClass81_13 = null;
	}
}
