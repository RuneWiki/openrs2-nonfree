import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "Lclient!ic;")
	public static Class33 aClass33_4;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!id;")
	private static Class34 aClass34_1374 = Static9.method266("Loaded interfaces");

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_1372 = aClass34_1374;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!id;")
	private static Class34 aClass34_1373 = Static9.method266("Free world");

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!id;")
	public static Class34 aClass34_1375 = aClass34_1373;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "Lclient!id;")
	public static Class34 aClass34_1376 = Static9.method266("Fertigkeit)2");

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "[Lclient!pb;")
	public static Class58[] aClass58Array1 = new Class58[4];

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "Lclient!qd;")
	public static Class63 aClass63_23 = new Class63(128);

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!id;")
	public static Class34 aClass34_1377 = Static9.method266("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "Lclient!id;")
	public static Class34 aClass34_1378 = Static9.method266("<img=0>");

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "[[I")
	public static int[][] anIntArrayArray28 = new int[5][5000];

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "Lclient!id;")
	public static Class34 aClass34_1379 = Static9.method266("Schlie-8en");

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "Lclient!uf;")
	public static Class76 aClass76_1 = new Class76();

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "[I")
	public static int[] anIntArray345 = new int[50];

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "Lclient!id;")
	private static Class34 aClass34_1381 = Static9.method266("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "Lclient!id;")
	public static Class34 aClass34_1380 = aClass34_1381;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
	public static int anInt2736 = 0;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "Lclient!id;")
	public static Class34 aClass34_1382 = Static9.method266(")3");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!q;")
	public static Class1_Sub1_Sub10 method1822(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub10 local10 = (Class1_Sub1_Sub10) Static105.aClass63_20.method1663((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static17.aClass35_4.method1573(8, arg0);
		local10 = new Class1_Sub1_Sub10();
		if (local20 != null) {
			local10.method1639(new Class1_Sub19(local20));
		}
		Static105.aClass63_20.method1659(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method1823(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt1432 == 0) {
			return;
		}
		@Pc(42) int local42;
		@Pc(49) int local49;
		if (arg0.anInt1389 != -1 && arg0.anInt1389 < 32768) {
			@Pc(33) Class1_Sub1_Sub1_Sub1_Sub2 local33 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1389];
			if (local33 != null) {
				local42 = arg0.anInt1428 - local33.anInt1428;
				local49 = arg0.anInt1405 - local33.anInt1405;
				if (local42 != 0 || local49 != 0) {
					arg0.anInt1402 = (int) (Math.atan2((double) local42, (double) local49) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(74) int local74;
		if (arg0.anInt1389 >= 32768) {
			local74 = arg0.anInt1389 - 32768;
			if (Static119.anInt2838 == local74) {
				local74 = 2047;
			}
			@Pc(83) Class1_Sub1_Sub1_Sub1_Sub1 local83 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local74];
			if (local83 != null) {
				local49 = arg0.anInt1428 - local83.anInt1428;
				@Pc(98) int local98 = arg0.anInt1405 - local83.anInt1405;
				if (local49 != 0 || local98 != 0) {
					arg0.anInt1402 = (int) (Math.atan2((double) local49, (double) local98) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1455 != 0 || arg0.anInt1422 != 0) && (arg0.anInt1417 == 0 || arg0.anInt1412 > 0)) {
			local42 = arg0.anInt1405 - (arg0.anInt1422 - Static121.anInt2871 - Static121.anInt2871) * 64;
			local74 = arg0.anInt1428 - (arg0.anInt1455 - Static37.anInt1098 - Static37.anInt1098) * 64;
			if (local74 != 0 || local42 != 0) {
				arg0.anInt1402 = (int) (Math.atan2((double) local74, (double) local42) * 325.949D) & 0x7FF;
			}
			arg0.anInt1422 = 0;
			arg0.anInt1455 = 0;
		}
		local74 = arg0.anInt1402 - arg0.anInt1436 & 0x7FF;
		if (local74 == 0) {
			arg0.anInt1403 = 0;
			return;
		}
		arg0.anInt1403++;
		@Pc(227) boolean local227;
		if (local74 > 1024) {
			arg0.anInt1436 -= arg0.anInt1432;
			local227 = true;
			if (local74 < arg0.anInt1432 || 2048 - arg0.anInt1432 < local74) {
				arg0.anInt1436 = arg0.anInt1402;
				local227 = false;
			}
			if (arg0.anInt1446 == arg0.anInt1409 && (arg0.anInt1403 > 25 || local227)) {
				if (arg0.anInt1398 == -1) {
					arg0.anInt1446 = arg0.anInt1442;
				} else {
					arg0.anInt1446 = arg0.anInt1398;
				}
			}
		} else {
			arg0.anInt1436 += arg0.anInt1432;
			local227 = true;
			if (arg0.anInt1432 > local74 || 2048 - arg0.anInt1432 < local74) {
				arg0.anInt1436 = arg0.anInt1402;
				local227 = false;
			}
			if (arg0.anInt1409 == arg0.anInt1446 && (arg0.anInt1403 > 25 || local227)) {
				if (arg0.anInt1392 == -1) {
					arg0.anInt1446 = arg0.anInt1442;
				} else {
					arg0.anInt1446 = arg0.anInt1392;
				}
			}
		}
		arg0.anInt1436 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public static void method1824() {
		anIntArrayArray28 = null;
		aClass63_23 = null;
		aClass34_1374 = null;
		aClass34_1375 = null;
		aClass34_1381 = null;
		aClass34_1380 = null;
		aClass58Array1 = null;
		aClass34_1382 = null;
		aClass34_1376 = null;
		aClass34_1379 = null;
		aClass34_1373 = null;
		aClass34_1377 = null;
		aClass76_1 = null;
		Class71.anIntArray344 = null;
		anIntArray345 = null;
		aClass33_4 = null;
		aClass34_1372 = null;
		aClass34_1378 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!id;)Z")
	public static boolean method1825(@OriginalArg(1) Class34 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static90.anInt3112; local11++) {
			if (arg0.method961(Static61.aClass34Array13[local11])) {
				return true;
			}
		}
		return arg0.method961(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass34_97);
	}
}
