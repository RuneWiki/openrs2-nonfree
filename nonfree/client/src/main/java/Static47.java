import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hd", name = "Ib", descriptor = "Lclient!ga;")
	public static Class29 aClass29_8;

	@OriginalMember(owner = "client!hd", name = "Mb", descriptor = "Z")
	public static boolean aBoolean72;

	@OriginalMember(owner = "client!hd", name = "bc", descriptor = "Lclient!ge;")
	public static Class7 aClass7_26;

	@OriginalMember(owner = "client!hd", name = "hc", descriptor = "Lclient!ge;")
	public static Class7 aClass7_27;

	@OriginalMember(owner = "client!hd", name = "pb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_779 = Static80.method1463("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_780 = Static80.method1463("leuchten2:");

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
	public static int anInt1479 = 0;

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "[I")
	public static int[] anIntArray166 = new int[] { 0, 0, 0, 0, 0, 11, 0, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 5, 0, 0, 0, 0, 0, 0, 15, 6, 0, 0, 4, 0, 0, 2, 0, 1, -2, 0, 2, 0, 0, 10, -2, -2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, -1, 0, -1, -2, 0, 0, 0, 0, 2, 6, 2, 0, 0, 0, 5, 0, 0, 0, 6, 6, 0, 0, -2, 0, 0, 6, 5, 6, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 10, 0, 0, 0, 0, 10, 0, 0, 0, 6, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, 0, -1, 0, 0, 4, 0, 0, 0, 14, 0, 0, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 5, 7, 8, 0, 0, 3, 1, 0, 0, 0, 0, 2, 0, 0, 0, -2, -1, 0, 0, 6, 0, -2, 0, 0, 0, 0, 4, 0, 6, 4, 0, 0, 0, 2, 3, 0, 0, 0, 0, 5, 0, 0, 2, 3, 0, 0, -2, 7, 0, 3, 0, 0, 0, 2 };

	@OriginalMember(owner = "client!hd", name = "Db", descriptor = "I")
	public static int anInt1485 = 0;

	@OriginalMember(owner = "client!hd", name = "Jb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_781 = Static80.method1463("(U3");

	@OriginalMember(owner = "client!hd", name = "Tb", descriptor = "I")
	public static int anInt1496 = 0;

	@OriginalMember(owner = "client!hd", name = "Wb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_782 = Static80.method1463("@whi@ )4 ");

	@OriginalMember(owner = "client!hd", name = "Yb", descriptor = "I")
	public static int anInt1499 = 0;

	@OriginalMember(owner = "client!hd", name = "cc", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!hd", name = "kc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_783 = Static80.method1463("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V")
	public static void method1022() {
		if (Static79.anInt2157 == 104) {
			@Pc(18) int local18;
			if (Static87.anInt2412 == -1) {
				local18 = anInt1485;
			} else {
				local18 = Static87.anInt2412;
			}
			if (anInt1485 != Static87.anInt2412) {
				local18--;
				if (local18 < 0) {
					local18 = 19;
				}
				if (Static113.aClass63Array6[local18] != null) {
					Static111.aClass63_1651 = Static113.aClass63Array6[local18];
					Static15.aBoolean29 = true;
					Static87.anInt2412 = local18;
				}
			}
		}
		if (Static79.anInt2157 != 105 || Static87.anInt2412 == -1) {
			return;
		}
		Static87.anInt2412++;
		if (Static87.anInt2412 >= 20) {
			Static87.anInt2412 = 0;
		}
		if (Static87.anInt2412 == anInt1485) {
			Static87.anInt2412 = -1;
			Static111.aClass63_1651 = Static111.aClass63_1661;
			Static15.aBoolean29 = true;
		} else if (Static113.aClass63Array6[Static87.anInt2412] != null) {
			Static111.aClass63_1651 = Static113.aClass63Array6[Static87.anInt2412];
			Static15.aBoolean29 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method1024(@OriginalArg(1) Class7 arg0) {
		Static114.aClass7_56 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V")
	public static void method1025(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static92.anInt2592; local18++) {
			if (Static92.aLongArray5[local18] == arg0) {
				Static92.anInt2592--;
				Static10.aBoolean20 = true;
				for (@Pc(42) int local42 = local18; local42 < Static92.anInt2592; local42++) {
					Static92.aLongArray5[local42] = Static92.aLongArray5[local42 + 1];
				}
				Static23.aClass6_Sub4_Sub1_4.method1347(23);
				Static23.aClass6_Sub4_Sub1_4.method1331(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)I")
	public static int method1027(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ge;IIIZI)V")
	public static void method1028(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		Static37.anInt1224 = arg2;
		Static69.anInt1998 = 1;
		Static29.aClass7_17 = arg0;
		Static64.anInt1833 = arg1;
		Static23.anInt2345 = 10000;
		Static68.anInt1982 = arg3;
		Static114.aBoolean166 = false;
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
	public static void method1029() {
		aClass63_782 = null;
		aClass63_783 = null;
		aClass63_781 = null;
		aClass29_8 = null;
		aClass63_780 = null;
		aClass63_779 = null;
		aClass7_26 = null;
		anIntArray166 = null;
		aByteArrayArray3 = null;
		aClass7_27 = null;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
	public static void method1030() {
		for (@Pc(10) Class6_Sub3_Sub1_Sub4 local10 = (Class6_Sub3_Sub1_Sub4) Static88.aClass1_5.method3(); local10 != null; local10 = (Class6_Sub3_Sub1_Sub4) Static88.aClass1_5.method14()) {
			if (Static101.anInt2810 != local10.anInt1504 || Static73.anInt2064 > local10.anInt1500) {
				local10.method2123();
			} else if (local10.anInt1481 <= Static73.anInt2064) {
				if (local10.anInt1492 > 0) {
					@Pc(50) Class6_Sub3_Sub1_Sub2_Sub1 local50 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local10.anInt1492 - 1];
					if (local50 != null && local50.anInt2319 >= 0 && local50.anInt2319 < 13312 && local50.anInt2347 >= 0 && local50.anInt2347 < 13312) {
						local10.method1026(Static73.anInt2064, local50.anInt2319, Static110.method2038(local10.anInt1504, local50.anInt2347, local50.anInt2319) - local10.anInt1494, local50.anInt2347);
					}
				}
				if (local10.anInt1492 < 0) {
					@Pc(108) int local108 = -local10.anInt1492 - 1;
					@Pc(115) Class6_Sub3_Sub1_Sub2_Sub2 local115;
					if (local108 == Static88.anInt2466) {
						local115 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1;
					} else {
						local115 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local108];
					}
					if (local115 != null && local115.anInt2319 >= 0 && local115.anInt2319 < 13312 && local115.anInt2347 >= 0 && local115.anInt2347 < 13312) {
						local10.method1026(Static73.anInt2064, local115.anInt2319, Static110.method2038(local10.anInt1504, local115.anInt2347, local115.anInt2319) - local10.anInt1494, local115.anInt2347);
					}
				}
				local10.method1023(Static68.anInt1973);
				Static76.aClass19_1.method657(Static101.anInt2810, (int) local10.aDouble8, (int) local10.aDouble7, (int) local10.aDouble6, 60, local10, local10.anInt1498, -1, false);
			}
		}
	}
}
