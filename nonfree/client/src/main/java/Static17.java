import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_167 = Static193.method3027("<)4col>");

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public static int anInt361 = 0;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt363 = -1;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!bd;")
	public static Class10 aClass10_13 = new Class10();

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_168 = Static193.method3027("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[[[B")
	public static final byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_169 = Static193.method3027("Standort");

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	public static int anInt368 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ke;BI)Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 method306(@OriginalArg(0) Class52 arg0, @OriginalArg(2) int arg1) {
		return Static212.method3340(arg0, arg1) ? Static21.method349() : null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
	public static void method307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = -arg1;
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(20) int local20 = Static130.method1827(Static200.anInt4074, arg3 + arg1, Static119.anInt2428);
		@Pc(22) int local22 = -1;
		@Pc(35) int local35 = Static130.method1827(Static200.anInt4074, arg3 - arg1, Static119.anInt2428);
		Static16.method302(arg0, local35, local20, Static157.anIntArrayArray24[arg2]);
		while (local12 > local10) {
			local22 += 2;
			local8 += local22;
			@Pc(58) int local58;
			@Pc(68) int local68;
			@Pc(86) int local86;
			@Pc(94) int local94;
			if (local8 > 0) {
				local12--;
				local58 = arg2 - local12;
				local8 -= local12 << 1;
				local68 = arg2 + local12;
				if (Static26.anInt554 <= local68 && Static52.anInt1117 >= local58) {
					local86 = Static130.method1827(Static200.anInt4074, local10 + arg3, Static119.anInt2428);
					local94 = Static130.method1827(Static200.anInt4074, arg3 - local10, Static119.anInt2428);
					if (local68 <= Static52.anInt1117) {
						Static16.method302(arg0, local94, local86, Static157.anIntArrayArray24[local68]);
					}
					if (local58 >= Static26.anInt554) {
						Static16.method302(arg0, local94, local86, Static157.anIntArrayArray24[local58]);
					}
				}
			}
			local10++;
			local68 = arg2 + local10;
			local58 = arg2 - local10;
			if (Static26.anInt554 <= local68 && Static52.anInt1117 >= local58) {
				local86 = Static130.method1827(Static200.anInt4074, local12 + arg3, Static119.anInt2428);
				local94 = Static130.method1827(Static200.anInt4074, arg3 - local12, Static119.anInt2428);
				if (Static52.anInt1117 >= local68) {
					Static16.method302(arg0, local94, local86, Static157.anIntArrayArray24[local68]);
				}
				if (Static26.anInt554 <= local58) {
					Static16.method302(arg0, local94, local86, Static157.anIntArrayArray24[local58]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Z")
	public static boolean method308(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(21) int local21 = Static55.aShortArray13[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		return local21 == 1007;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[IJ)Lclient!oc;")
	public static Class70 method310(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == 0) {
			@Pc(11) Class3_Sub3_Sub12 local11 = Static153.method2266(arg1[0]);
			return local11.method1002((int) arg2);
		} else if (arg0 == 1) {
			@Pc(27) Class3_Sub3_Sub11 local27 = Static14.method275((int) arg2);
			return local27.aClass70_579;
		} else if (arg0 == 5) {
			return Static113.method1641(arg2).method2033();
		} else if (arg0 == 6) {
			return Static153.method2266(arg1[0]).method1002((int) arg2);
		} else {
			return Static151.method2215(arg2);
		}
	}
}
