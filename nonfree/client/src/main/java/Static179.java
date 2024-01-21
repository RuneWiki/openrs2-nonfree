import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "Lclient!nh;")
	public static Class62 aClass62_45;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_51 = null;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1467 = Static177.method3050("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	public static int anInt3998 = 0;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1468 = Static177.method3050("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1469 = Static177.method3050("b12_full");

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
	public static int anInt4002 = 0;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	public static int anInt4006 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(JZ)V")
	public static void method3067(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static57.anInt1403 >= 100) {
			Static105.method1982(Static3.aClass46_44, 0, Static28.aClass46_242);
			return;
		}
		@Pc(27) Class46 local27 = Static116.method2124(arg0).method1654();
		for (@Pc(29) int local29 = 0; local29 < Static57.anInt1403; local29++) {
			if (Static129.aLongArray33[local29] == arg0) {
				Static105.method1982(Static3.aClass46_44, 0, Static69.method1482(new Class46[] { local27, Static26.aClass46_218 }));
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static148.anInt3385; local64++) {
			if (Static84.aLongArray50[local64] == arg0) {
				Static105.method1982(Static3.aClass46_44, 0, Static69.method1482(new Class46[] { Static121.aClass46_1071, local27, Static137.aClass46_1197 }));
				return;
			}
		}
		if (local27.method1668(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass46_796)) {
			Static105.method1982(Static3.aClass46_44, 0, Static54.aClass46_522);
			return;
		}
		Static129.aLongArray33[Static57.anInt1403] = arg0;
		Static153.aClass46Array23[Static57.anInt1403++] = Static116.method2124(arg0);
		Static122.anInt2963 = Static163.anInt3721;
		Static90.aClass4_Sub11_Sub1_1.method1285(129);
		Static90.aClass4_Sub11_Sub1_1.method1269(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([Lclient!jd;Z[S)V")
	public static void method3068(@OriginalArg(0) Class46[] arg0, @OriginalArg(2) short[] arg1) {
		Static109.method2033(arg1, arg0, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([BLclient!la;II)V")
	public static void method3070(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class4_Sub19 local3 = new Class4_Sub19();
		local3.anInt3183 = 0;
		local3.aByteArray37 = arg0;
		local3.aClass52_2 = arg1;
		local3.aLong148 = arg2;
		@Pc(22) Class11 local22 = Static166.aClass11_15;
		synchronized (Static166.aClass11_15) {
			Static166.aClass11_15.method272(local3);
		}
		Static124.method2213();
	}
}
