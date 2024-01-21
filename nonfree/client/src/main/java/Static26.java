import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!ud;")
	public static Class6_Sub3_Sub2 aClass6_Sub3_Sub2_3;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!te;")
	public static Class6_Sub2_Sub14 aClass6_Sub2_Sub14_35;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_16;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!mc;")
	public static Class39 aClass39_3;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_17;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public static int anInt2138;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_13;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_870 = Static34.method846("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!rc;")
	private static Class55 aClass55_871 = Static34.method846("Loading title screen )2 ");

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_872 = Static34.method846(")1");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!rc;")
	public static Class55 aClass55_873 = aClass55_871;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "[I")
	public static int[] anIntArray213 = new int[50];

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	public static int anInt2144 = 128;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method1444() {
		Static8.aClass36_5.method1155();
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public static void method1446() {
		aClass6_Sub2_Sub2_Sub2_13 = null;
		aClass6_Sub2_Sub2_Sub1_17 = null;
		aClass55_873 = null;
		aClass6_Sub2_Sub14_35 = null;
		aClass55_871 = null;
		aClass55_870 = null;
		aClass6_Sub3_Sub2_3 = null;
		anIntArray213 = null;
		aClass6_Sub2_Sub2_Sub1_16 = null;
		aClass39_3 = null;
		aClass55_872 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public static void method1447(@OriginalArg(0) int arg0) {
		for (Static3.anInt28 += arg0; Static3.anInt28 >= Static59.anInt1823; Static3.anInt28 -= Static59.anInt1823) {
			Static12.anInt716 -= Static12.anInt716 >> 2;
		}
		Static12.anInt716 -= arg0 * 1000;
		if (Static12.anInt716 < 0) {
			Static12.anInt716 = 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method1448() {
		@Pc(10) Object local10 = Static3.anObject1;
		synchronized (Static3.anObject1) {
			if (Static24.anInt1065 != 0) {
				Static24.anInt1065 = 1;
				try {
					Static3.anObject1.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}
}
