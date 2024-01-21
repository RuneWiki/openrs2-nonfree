import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rc", name = "fb", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_24;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "Lclient!id;")
	private static Class34 aClass34_1287 = Static9.method266("cyan:");

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
	public static int anInt2570 = 0;

	@OriginalMember(owner = "client!rc", name = "hb", descriptor = "Lclient!id;")
	private static Class34 aClass34_1292 = Static9.method266("level)2");

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "Lclient!id;")
	public static Class34 aClass34_1288 = aClass34_1292;

	@OriginalMember(owner = "client!rc", name = "cb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1289 = Static9.method266("::qa_op_test");

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "Lclient!id;")
	public static Class34 aClass34_1290 = aClass34_1287;

	@OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1291 = aClass34_1287;

	@OriginalMember(owner = "client!rc", name = "ib", descriptor = "Lclient!id;")
	public static Class34 aClass34_1293 = Static9.method266("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!rc", name = "jb", descriptor = "[I")
	public static int[] anIntArray321 = new int[2048];

	@OriginalMember(owner = "client!rc", name = "lb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1294 = Static9.method266("Hier wechseln");

	@OriginalMember(owner = "client!rc", name = "qb", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[5];

	@OriginalMember(owner = "client!rc", name = "rb", descriptor = "I")
	public static final int anInt2584 = 5063219;

	@OriginalMember(owner = "client!rc", name = "ub", descriptor = "I")
	public static int anInt2587 = 0;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	public static void method1708() {
		Static21.aBoolean39 = true;
		Static68.aBoolean96 = true;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	public static void method1710() {
		anIntArray321 = null;
		aClass34_1291 = null;
		aClass34_1289 = null;
		aBooleanArray17 = null;
		aClass34_1290 = null;
		aClass34_1294 = null;
		aClass35_Sub1_24 = null;
		aClass34_1292 = null;
		aClass34_1288 = null;
		aClass34_1293 = null;
		aClass34_1287 = null;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)Lclient!ff;")
	public static Class1_Sub1_Sub5 method1711(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub5 local15 = (Class1_Sub1_Sub5) Static98.aClass63_18.method1663((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static26.aClass35_7.method1573(3, arg0);
		local15 = new Class1_Sub1_Sub5();
		if (local25 != null) {
			local15.method678(new Class1_Sub19(local25));
		}
		Static98.aClass63_18.method1659(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)I")
	public static int method1712() {
		return 6;
	}
}
