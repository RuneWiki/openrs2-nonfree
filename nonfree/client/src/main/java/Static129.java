import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "Lclient!id;")
	public static Class34 aClass34_1562 = Static9.method266("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
	public static int anInt3038 = 0;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1563 = Static9.method266("weiss:");

	@OriginalMember(owner = "client!wa", name = "nb", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_15 = null;

	@OriginalMember(owner = "client!wa", name = "xb", descriptor = "J")
	public static long aLong158 = 0L;

	@OriginalMember(owner = "client!wa", name = "Gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1564 = Static9.method266(" ");

	@OriginalMember(owner = "client!wa", name = "Nb", descriptor = "[I")
	public static int[] anIntArray376 = new int[128];

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
	public static void method2011() {
		if (Static3.aClass51_1 != null) {
			Static3.aClass51_1.method1361();
			Static3.aClass51_1 = null;
		}
		Static16.method382();
		Static39.aClass44_1.method1171();
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			Static114.aClass58Array1[local23].method1594();
		}
		System.gc();
		Static70.method1197();
		Static5.anInt361 = -1;
		Static64.aBoolean94 = false;
		Static99.method1662();
		Static41.method695(10);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Z")
	public static boolean method2012(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void method2014() {
		aClass34_1562 = null;
		anIntArray376 = null;
		aClass34_1564 = null;
		aClass1_Sub9_15 = null;
		aClass34_1563 = null;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
	public static void method2016() {
		if (Static122.aClass71_1 != null) {
			@Pc(14) Class71 local14 = Static122.aClass71_1;
			synchronized (Static122.aClass71_1) {
				Static122.aClass71_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!ie;)V")
	public static void method2018(@OriginalArg(1) Class35 arg0) {
		Static128.aClass35_34 = arg0;
	}
}
