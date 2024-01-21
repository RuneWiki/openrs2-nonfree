import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt2892;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
	public static int[] anIntArray343;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!je;")
	private static Class40 aClass40_1564 = Static69.method1231("Loaded interfaces");

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_1562 = aClass40_1564;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_1563 = Static69.method1231("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "[[S")
	public static short[][] aShortArrayArray13 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!je;")
	private static Class40 aClass40_1565 = Static69.method1231("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_1566 = aClass40_1565;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!fd;I)Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1 method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2) {
		return method2076(arg2, arg1, arg0) ? Static25.method420() : null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)J")
	public static synchronized long method2075() {
		@Pc(12) long local12 = System.currentTimeMillis();
		if (local12 < Static123.aLong87) {
			Static43.aLong26 += Static123.aLong87 - local12;
		}
		Static123.aLong87 = local12;
		return Static43.aLong26 + local12;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!fd;III)Z")
	public static boolean method2076(@OriginalArg(0) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method1931(arg1, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static104.method1820(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	public static void method2077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static30.anInt730 == 2) {
			Static58.method1029(Static35.anInt826 + (Static63.anInt398 - Static107.anInt2546 << 7), Static16.anInt416 + (-Static29.anInt720 + Static62.anInt1685 << 7), Static122.anInt2860 * 2);
			if (Static123.anInt2876 > -1 && Static28.anInt704 % 20 < 10) {
				Static50.aClass2_Sub1_Sub2_Sub4Array8[0].method1722(arg1 + Static123.anInt2876 - 12, arg0 + -28 + Static118.anInt2788);
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public static void method2078() {
		aClass40_1566 = null;
		aClass40_1562 = null;
		aClass40_1563 = null;
		aClass40_1564 = null;
		aClass40_1565 = null;
		aShortArrayArray13 = null;
		anIntArray343 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Lclient!od;")
	public static Class2_Sub1_Sub9 method2079(@OriginalArg(0) int arg0) {
		@Pc(20) Class2_Sub1_Sub9 local20 = (Class2_Sub1_Sub9) Static14.aClass55_15.method1410((long) arg0);
		if (local20 != null) {
			return local20;
		}
		@Pc(30) byte[] local30 = Static65.aClass24_Sub1_9.method1931(0, arg0);
		if (local30 == null) {
			return null;
		}
		local20 = new Class2_Sub1_Sub9();
		@Pc(40) int local40 = 0;
		@Pc(45) Class2_Sub9 local45 = new Class2_Sub9(local30);
		local45.anInt976 = local45.aByteArray16.length - 12;
		@Pc(56) int local56 = local45.method622();
		local20.anInt2148 = local45.method632();
		local20.anInt2151 = local45.method632();
		local20.anInt2161 = local45.method632();
		local20.anInt2157 = local45.method632();
		local45.anInt976 = 0;
		local20.aClass40_1115 = local45.method615();
		local20.anIntArray234 = new int[local56];
		local20.aClass40Array12 = new Class40[local56];
		local20.anIntArray235 = new int[local56];
		while (local45.aByteArray16.length - 12 > local45.anInt976) {
			@Pc(102) int local102 = local45.method632();
			if (local102 == 3) {
				local20.aClass40Array12[local40] = local45.method625();
			} else if (local102 >= 100 || local102 == 21 || local102 == 38 || local102 == 39) {
				local20.anIntArray234[local40] = local45.method640();
			} else {
				local20.anIntArray234[local40] = local45.method622();
			}
			local20.anIntArray235[local40++] = local102;
		}
		Static14.aClass55_15.method1411((long) arg0, local20);
		return local20;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public static void method2080() {
		if (!Static31.aBoolean53) {
			return;
		}
		@Pc(17) Class2_Sub13 local17 = Static87.method894(Static32.anInt773, Static8.anInt206);
		if (local17 != null && local17.anObjectArray25 != null) {
			@Pc(26) Class2_Sub7 local26 = new Class2_Sub7();
			local26.anObjectArray1 = local17.anObjectArray25;
			local26.aClass2_Sub13_4 = local17;
			Static58.method1028(local26);
		}
		Static31.aBoolean53 = false;
		Static17.method316(local17);
	}
}
