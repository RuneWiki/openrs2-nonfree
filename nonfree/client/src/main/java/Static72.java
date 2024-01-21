import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!ff;")
	public static Class26 aClass26_17;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt1990 = -1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_604 = Static129.method2060("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_605 = Static129.method2060("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "J")
	public static volatile long aLong65 = 0L;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_606 = Static129.method2060("Fps:");

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!r;")
	private static Class61 aClass61_607 = Static129.method2060("Loaded sprites");

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "[I")
	public static int[] anIntArray277 = new int[1000];

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_608 = aClass61_607;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!r;I)V")
	public static void method1283(@OriginalArg(1) Class61 arg0, @OriginalArg(2) int arg1) {
		Static1.aClass5_Sub14_Sub1_1.method1489(88);
		Static1.aClass5_Sub14_Sub1_1.method1473(arg0.method1723());
		Static1.aClass5_Sub14_Sub1_1.method1486(arg1);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1284() {
		aClass61_605 = null;
		anIntArray277 = null;
		aClass61_607 = null;
		aClass61_608 = null;
		aClass61_604 = null;
		aClass61_606 = null;
		aClass26_17 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZBLclient!gf;)V")
	public static void method1285(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class30 arg1) {
		if (Static81.aClass30_14 != null) {
			try {
				Static81.aClass30_14.method779();
			} catch (@Pc(8) Exception local8) {
			}
			Static81.aClass30_14 = null;
		}
		Static81.aClass30_14 = arg1;
		Static34.method678(arg0);
		Static127.anInt3198 = 0;
		Static30.aClass5_Sub14_2.anInt2199 = 0;
		Static127.aClass5_Sub2_Sub4_1 = null;
		Static47.aClass5_Sub14_4 = null;
		while (true) {
			@Pc(38) Class5_Sub2_Sub4 local38 = (Class5_Sub2_Sub4) Static65.aClass20_7.method655();
			if (local38 == null) {
				while (true) {
					local38 = (Class5_Sub2_Sub4) Static29.aClass20_4.method655();
					if (local38 == null) {
						if (Static67.aByte5 != 0) {
							try {
								@Pc(90) Class5_Sub14 local90 = new Class5_Sub14(4);
								local90.method1440(4);
								local90.method1440(Static67.aByte5);
								local90.method1468(0);
								Static81.aClass30_14.method780(local90.aByteArray33, 4);
							} catch (@Pc(111) IOException local111) {
								try {
									Static81.aClass30_14.method779();
								} catch (@Pc(116) Exception local116) {
								}
								Static81.aClass30_14 = null;
								Static8.anInt194++;
							}
						}
						Static134.anInt3405 = 0;
						Static76.aLong61 = Static102.method1742();
						return;
					}
					Static67.aClass83_2.method2201(local38);
					Static23.aClass20_2.method647(local38, local38.aLong100);
					Static31.anInt940--;
					Static113.anInt2957++;
				}
			}
			Static100.aClass20_10.method647(local38, local38.aLong100);
			Static50.anInt1257++;
			Static25.anInt735--;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public static void method1287() {
		Static112.aClass29_24.method765();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)Lclient!kc;")
	public static Class5_Sub2_Sub10 method1289(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub10 local10 = (Class5_Sub2_Sub10) Static101.aClass29_23.method766((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static64.method1759(arg0, Static11.aClass26_2, Static126.aClass26_31);
		if (local10 != null) {
			Static101.aClass29_23.method762(local10, (long) arg0);
		}
		return local10;
	}
}
