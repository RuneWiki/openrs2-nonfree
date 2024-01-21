import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array19 = new Class49[500];

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1580 = Static32.method683("Sprites geladen)3");

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public static int anInt3503 = -1;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[J")
	public static long[] aLongArray19 = new long[100];

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1581 = Static32.method683("http:)4)4");

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[Lclient!p;")
	public static Class2_Sub2_Sub3_Sub7_Sub1[] aClass2_Sub2_Sub3_Sub7_Sub1Array1 = new Class2_Sub2_Sub3_Sub7_Sub1[32768];

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1582 = Static32.method683("(U4");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public static void method2712(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static33.aBoolean32) {
			Static127.method2155();
		} else if (arg0 != -1 && (Static116.anInt2424 != arg0 || !Static69.method1156()) && Static156.anInt3412 != 0 && !Static33.aBoolean32) {
			Static122.method2086(arg0, 0, Static91.aClass11_Sub1_23, Static156.anInt3412);
		}
		Static116.anInt2424 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public static void method2713() {
		if (!Static47.aBoolean40) {
			Static30.aShortArray1[0] = 1001;
			Static133.anInt3713 = 1;
			Static102.aClass49Array15[0] = Static53.aClass49_595;
			aClass49Array19[0] = Static154.aClass49_1489;
		}
		if (Static3.anInt57 != -1) {
			Static112.method1901(Static3.anInt57);
		}
		for (@Pc(30) int local30 = 0; local30 < Static100.anInt2133; local30++) {
			if (Static171.aBooleanArray18[local30]) {
				Static164.aBooleanArray17[local30] = true;
			}
			Static115.aBooleanArray11[local30] = Static171.aBooleanArray18[local30];
			Static171.aBooleanArray18[local30] = false;
		}
		Static93.anInt1951 = Static127.anInt2757;
		Static118.anInt2474 = -1;
		Static6.aClass85_1 = null;
		Static62.anInt1349 = -1;
		if (Static3.anInt57 != -1) {
			Static100.anInt2133 = 0;
			Static41.method796(0, 765, -1, Static3.anInt57, 0, 0, 0, 503);
		}
		Static10.method1864();
		Static5.method94();
		if (Static47.aBoolean40) {
			Static31.method659();
		} else if (Static118.anInt2474 != -1) {
			Static80.method2965(Static62.anInt1349, Static118.anInt2474);
		}
		if (Static153.anInt3281 == 3) {
			for (@Pc(104) int local104 = 0; local104 < Static100.anInt2133; local104++) {
				if (Static115.aBooleanArray11[local104]) {
					Static10.method1850(Static55.anIntArray111[local104], Static25.anIntArray48[local104], Static176.anIntArray361[local104], Static62.anIntArray164[local104], 16711935, 128);
				} else if (Static164.aBooleanArray17[local104]) {
					Static10.method1850(Static55.anIntArray111[local104], Static25.anIntArray48[local104], Static176.anIntArray361[local104], Static62.anIntArray164[local104], 16711680, 128);
				}
			}
		}
		Static133.method2825(Static66.anInt1396, Static170.anInt3724, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529);
		Static170.anInt3724 = 0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public static void method2714() {
		aClass49_1582 = null;
		aClass49_1581 = null;
		aClass2_Sub2_Sub3_Sub7_Sub1Array1 = null;
		aLongArray19 = null;
		aClass49Array19 = null;
		aClass49_1580 = null;
	}
}
