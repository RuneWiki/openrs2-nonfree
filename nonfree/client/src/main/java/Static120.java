import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_76;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
	public static int[] anIntArray479;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!ie;")
	public static Class31 aClass31_69 = new Class31();

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
	public static int[] anIntArray478 = new int[5];

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1519 = Static108.method1915("Trade)4compete");

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1518 = aClass39_1519;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "[Lclient!oe;")
	public static Class56[] aClass56Array58 = new Class56[16];

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "[B")
	public static byte[] aByteArray95 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1520 = Static108.method1915("Duell akzeptieren");

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1521 = Static108.method1915("scrollbar");

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1522 = Static108.method1915("Untersuchen");

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	public static int anInt3073 = 3;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1523 = Static108.method1915("Members object");

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1524 = aClass39_1523;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!pe;BI[B)V")
	public static void method2127(@OriginalArg(0) Class61 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class1_Sub3 local3 = new Class1_Sub3();
		local3.aClass61_1 = arg0;
		local3.aByteArray6 = arg2;
		local3.aLong98 = arg1;
		local3.anInt151 = 0;
		@Pc(26) Class31 local26 = Static1.aClass31_4;
		synchronized (Static1.aClass31_4) {
			Static1.aClass31_4.method1005(local3);
		}
		Static64.method1141();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZZ)Lclient!kd;")
	public static Class39 method2129(@OriginalArg(0) int arg0) {
		return Static77.method1321(arg0, true);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public static void method2130() {
		aClass31_69 = null;
		aClass39_1523 = null;
		aClass39_1524 = null;
		aClass62_Sub1_76 = null;
		aClass39_1520 = null;
		aClass39_1518 = null;
		anIntArray478 = null;
		aClass39_1522 = null;
		anIntArray479 = null;
		aClass56Array58 = null;
		aClass39_1521 = null;
		aClass39_1519 = null;
		aByteArray95 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!q;B)V")
	public static void method2131(@OriginalArg(0) Class62 arg0) {
		Static100.aClass62_29 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lclient!df;")
	public static Class1_Sub1_Sub5 method2132(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub5 local12 = (Class1_Sub1_Sub5) Static28.aClass33_36.method1038((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static79.aClass62_28.method2008(arg0, 9);
		local12 = new Class1_Sub1_Sub5();
		local12.anInt903 = arg0;
		if (local22 != null) {
			local12.method517(new Class1_Sub18(local22));
		}
		local12.method519();
		Static28.aClass33_36.method1042(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(JZ)V")
	public static void method2134(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static108.anInt2750; local17++) {
			if (arg0 == Static88.aLongArray4[local17]) {
				Static35.aBoolean96 = true;
				Static108.anInt2750--;
				for (@Pc(40) int local40 = local17; local40 < Static108.anInt2750; local40++) {
					Static88.aLongArray4[local40] = Static88.aLongArray4[local40 + 1];
				}
				Static103.aClass1_Sub18_Sub1_5.method2203(197);
				Static103.aClass1_Sub18_Sub1_5.method2179(arg0);
				return;
			}
		}
	}
}
