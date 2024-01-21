import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "Lclient!be;")
	public static Class10 aClass10_6;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_746 = Static56.method816("<br>(X");

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_747 = Static56.method816("Spieler");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
	public static int anInt1579 = 0;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_748 = Static56.method816("Attack");

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_749 = aClass34_748;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "Z")
	public static volatile boolean aBoolean62 = true;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_750 = Static56.method816("gleiten:");

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_751 = Static56.method816("Neuer Benutzer");

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!ic;")
	public static Class34 aClass34_752 = Static56.method816("Fertigkeit)2");

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_753 = Static56.method816("sl_flags");

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "Lclient!ic;")
	public static Class34 aClass34_754 = Static56.method816("m");

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
	public static int anInt1584 = 0;

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "Lclient!ic;")
	public static Class34 aClass34_755 = Static56.method816("<col=80ff00>");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZIZZ)Lclient!md;")
	public static Class14_Sub1 method931(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class61 local5 = null;
		if (Static7.aClass35_1 != null) {
			local5 = new Class61(arg1, Static7.aClass35_1, Static120.aClass35Array1[arg1], 1000000);
		}
		return new Class14_Sub1(local5, Static44.aClass61_1, arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!me;")
	public static Class8_Sub1_Sub14 method932(@OriginalArg(0) int arg0) {
		@Pc(17) Class8_Sub1_Sub14 local17 = (Class8_Sub1_Sub14) Static100.aClass48_45.method1100((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static106.aClass14_26.method1156(arg0, 16);
		local17 = new Class8_Sub1_Sub14();
		if (local27 != null) {
			local17.method1190(new Class8_Sub20(local27));
		}
		Static100.aClass48_45.method1097(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method933() {
		aClass34_747 = null;
		aClass34_755 = null;
		anObject4 = null;
		aClass34_752 = null;
		aClass34_751 = null;
		aClass34_750 = null;
		aClass34_746 = null;
		aClass34_749 = null;
		aByteArrayArrayArray4 = null;
		aClass10_6 = null;
		aClass34_754 = null;
		aClass34_753 = null;
		anIntArrayArray11 = null;
		aClass34_748 = null;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method934() {
		@Pc(7) int local7 = Static134.anInt3164;
		@Pc(9) int local9 = Static109.anInt2499;
		@Pc(11) int local11 = Static117.anInt2629;
		@Pc(15) int local15 = Static28.anInt802;
		Static110.method1729(local7, local9, local11, local15, 6116423);
		Static110.method1729(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static110.method1738(local7 + 1, local9 + 18, local11 - 2, local15 - 19, 0);
		Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1741(Static90.aClass34_170, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(60) int local60 = Static121.anInt2909;
		@Pc(62) int local62 = Static14.anInt366;
		for (@Pc(68) int local68 = 0; local68 < Static96.anInt552; local68++) {
			@Pc(82) int local82 = (Static96.anInt552 - local68 - 1) * 15 + local9 + 31;
			@Pc(84) int local84 = 16777215;
			if (local7 < local62 && local62 < local11 + local7 && local82 - 13 < local60 && local82 + 3 > local60) {
				local84 = 16776960;
			}
			Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1741(Static4.method32(local68), local7 + 3, local82, local84, 0);
		}
		Static24.method1160(Static109.anInt2499, Static28.anInt802, Static117.anInt2629, Static134.anInt3164);
	}
}
