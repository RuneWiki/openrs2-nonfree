import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!fc;")
	private static Class25 aClass25_49 = Static78.method1313("wishes to trade with you)3");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_45 = aClass25_49;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
	public static int[] anIntArray25 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!fc;")
	private static Class25 aClass25_46 = Static78.method1313("Login server offline)3");

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "J")
	public static long aLong7 = 0L;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_47 = Static78.method1313("Hidden)2");

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_48 = Static78.method1313("scrollen:");

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
	public static int anInt108 = 0;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_50 = Static78.method1313(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_51 = aClass25_46;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	public static int anInt111 = -1;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_52 = Static78.method1313("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)Z")
	public static boolean method95(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method96() {
		for (@Pc(15) Class1_Sub2_Sub3_Sub6 local15 = (Class1_Sub2_Sub3_Sub6) Static119.aClass2_11.method22(); local15 != null; local15 = (Class1_Sub2_Sub3_Sub6) Static119.aClass2_11.method23()) {
			if (local15.anInt2563 != Static21.anInt596 || Static60.anInt1366 > local15.anInt2562) {
				local15.method2024();
			} else if (local15.anInt2554 <= Static60.anInt1366) {
				if (local15.anInt2548 > 0) {
					@Pc(55) Class1_Sub2_Sub3_Sub4_Sub1 local55 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local15.anInt2548 - 1];
					if (local55 != null && local55.anInt2832 >= 0 && local55.anInt2832 < 13312 && local55.anInt2827 >= 0 && local55.anInt2827 < 13312) {
						local15.method1771(local55.anInt2827, Static129.method2048(local55.anInt2827, local15.anInt2563, local55.anInt2832) - local15.anInt2546, local55.anInt2832, Static60.anInt1366);
					}
				}
				if (local15.anInt2548 < 0) {
					@Pc(104) int local104 = -local15.anInt2548 - 1;
					@Pc(115) Class1_Sub2_Sub3_Sub4_Sub2 local115;
					if (local104 == Static45.anInt1178) {
						local115 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1;
					} else {
						local115 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local104];
					}
					if (local115 != null && local115.anInt2832 >= 0 && local115.anInt2832 < 13312 && local115.anInt2827 >= 0 && local115.anInt2827 < 13312) {
						local15.method1771(local115.anInt2827, Static129.method2048(local115.anInt2827, local15.anInt2563, local115.anInt2832) - local15.anInt2546, local115.anInt2832, Static60.anInt1366);
					}
				}
				local15.method1773(Static18.anInt522);
				Static118.aClass4_1.method66(Static21.anInt596, (int) local15.aDouble5, (int) local15.aDouble9, (int) local15.aDouble4, 60, local15, local15.anInt2542, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method97() {
		if (Static18.aClass77_3 != null) {
			Static18.aClass77_3.method1909();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public static void method98(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static33.anInt909 != 0 && arg1 != -1) {
			Static64.method1129(arg1, 0, Static120.aClass56_Sub1_20, Static33.anInt909);
			Static8.aBoolean5 = true;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public static void method99() {
		aClass25_49 = null;
		aClass25_47 = null;
		aClass25_48 = null;
		anIntArray25 = null;
		aClass25_52 = null;
		aClass25_50 = null;
		aClass25_51 = null;
		aClass25_46 = null;
		aClass25_45 = null;
	}
}
