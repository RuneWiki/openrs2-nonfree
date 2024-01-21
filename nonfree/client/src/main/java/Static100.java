import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!t", name = "q", descriptor = "I")
	public static int anInt2222;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1415 = Static69.method1153("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[104][104];

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1416 = Static69.method1153("null");

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1417 = Static69.method1153("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!t", name = "g", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1418 = Static69.method1153(" )2> ");

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1419 = Static69.method1153("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!t", name = "A", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1420 = Static69.method1153("backhmid2");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!pb;ILclient!pb;)V")
	public static void method1606(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Class41 arg1) {
		Static103.aClass41_61 = arg0;
		Static19.aClass41_11 = arg1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method1607() {
		aClass64_1415 = null;
		aClass64_1417 = null;
		aClass64_1420 = null;
		aClass64_1419 = null;
		aClass64_1418 = null;
		aClass64_1416 = null;
		anIntArrayArray27 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([BLclient!d;IZ)V")
	public static void method1608(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub12 local7 = new Class1_Sub12();
		local7.aLong87 = arg2;
		local7.anInt2329 = 0;
		local7.aByteArray26 = arg0;
		local7.aClass16_4 = arg1;
		@Pc(22) Class50 local22 = Static96.aClass50_14;
		synchronized (Static96.aClass50_14) {
			Static96.aClass50_14.method1142(local7);
		}
		Static3.method128();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!nd;I)Lclient!nd;")
	public static Class1_Sub1_Sub11 method1609(@OriginalArg(0) Class1_Sub1_Sub11 arg0) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static83.method1387(arg0);
		if (local8 == null) {
			local8 = arg0.aClass1_Sub1_Sub11_3;
		}
		return local8;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!pb;)V")
	public static void method1610(@OriginalArg(1) Class41 arg0) {
		Static44.aClass41_26 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Lclient!wb;")
	public static Class1_Sub1_Sub18 method1611(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub18 local12 = (Class1_Sub1_Sub18) Static31.aClass19_28.method410((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static21.aClass41_Sub1_2.method1062(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class1_Sub1_Sub18();
		@Pc(35) Class1_Sub6 local35 = new Class1_Sub6(local22);
		@Pc(37) int local37 = 0;
		local35.anInt2574 = local35.aByteArray27.length - 12;
		@Pc(48) int local48 = local35.method1817();
		local12.anInt2836 = local35.method1842();
		local12.anInt2844 = local35.method1842();
		local12.anInt2839 = local35.method1842();
		local12.anInt2837 = local35.method1842();
		local12.anIntArray450 = new int[local48];
		local35.anInt2574 = 0;
		local12.anIntArray451 = new int[local48];
		local12.aClass64Array18 = new Class64[local48];
		while (local35.anInt2574 < local35.aByteArray27.length - 12) {
			@Pc(95) int local95 = local35.method1842();
			if (local95 == 3) {
				local12.aClass64Array18[local37] = local35.method1831();
			} else if (local95 >= 100 || local95 == 21 || local95 == 38 || local95 == 39) {
				local12.anIntArray450[local37] = local35.method1837();
			} else {
				local12.anIntArray450[local37] = local35.method1817();
			}
			local12.anIntArray451[local37++] = local95;
		}
		Static31.aClass19_28.method409(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public static void method1612() {
		if (Static9.aClass21_1 == null) {
			return;
		}
		@Pc(11) long local11 = Static80.method1369();
		if (local11 <= Static46.aLong37) {
			return;
		}
		Static9.aClass21_1.method2021(local11);
		@Pc(25) int local25 = (int) (local11 - Static46.aLong37);
		Static46.aLong37 = local11;
		@Pc(36) Class local36 = eb.class;
		synchronized (eb.class) {
			Static113.anInt1816 += Static43.anInt980 * local25;
			@Pc(52) int local52 = (Static113.anInt1816 - Static43.anInt980 * 2000) / 1000;
			if (local52 > 0) {
				if (Static105.aClass1_Sub2_4 != null) {
					Static105.aClass1_Sub2_4.method1515(local52);
				}
				Static113.anInt1816 -= local52 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBILclient!pb;)Z")
	public static boolean method1613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(5) byte[] local5 = arg2.method1062(arg0, arg1);
		if (local5 == null) {
			return false;
		} else {
			Static82.method1382(local5);
			return true;
		}
	}
}
