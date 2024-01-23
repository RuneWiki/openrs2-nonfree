import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public static int anInt38;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1 aClass1_Sub2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	public static int anInt32 = -1;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	public static int anInt37 = 0;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = null;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Z")
	public static boolean aBoolean2 = true;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	public static int anInt44 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public static void method24(@OriginalArg(1) int arg0) {
		@Pc(20) Class1_Sub23 local20 = (Class1_Sub23) Static249.aClass140_17.method4014((long) arg0);
		if (local20 != null) {
			for (@Pc(25) int local25 = 0; local25 < local20.anIntArray342.length; local25++) {
				local20.anIntArray342[local25] = -1;
				local20.anIntArray343[local25] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V")
	public static void method25(@OriginalArg(0) int arg0) {
		@Pc(9) Class78 local9 = Static154.aClass78_5;
		synchronized (Static154.aClass78_5) {
			Static227.anInt4989 = arg0;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!hc;Lclient!hc;Lclient!hc;ILclient!hc;)V")
	public static void method26(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(4) Class51 arg3) {
		Static57.aClass51_21 = arg0;
		Static70.aClass51_23 = arg2;
		Static195.aClass51_61 = arg3;
		Static260.aClass51_34 = arg1;
		Static80.aClass122ArrayArray1 = new Class122[Static57.aClass51_21.method1859()][];
		Static18.aBooleanArray1 = new boolean[Static57.aClass51_21.method1859()];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Lclient!i;")
	public static Class1_Sub2_Sub9 method27(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub9 local12 = (Class1_Sub2_Sub9) Static186.aClass58_11.method2093((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static118.aClass51_39.method1874(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class1_Sub2_Sub9();
		@Pc(35) Class1_Sub13 local35 = new Class1_Sub13(local22);
		local35.anInt2395 = local35.aByteArray29.length - 2;
		@Pc(46) int local46 = local35.method1764();
		@Pc(56) int local56 = local35.aByteArray29.length - local46 - 2 - 12;
		local35.anInt2395 = local56;
		@Pc(63) int local63 = local35.method1802();
		local12.anInt2661 = local35.method1764();
		local12.anInt2663 = local35.method1764();
		local12.anInt2664 = local35.method1764();
		local12.anInt2662 = local35.method1764();
		@Pc(87) int local87 = local35.method1772();
		@Pc(95) int local95;
		@Pc(101) int local101;
		if (local87 > 0) {
			local12.aClass140Array1 = new Class140[local87];
			for (local95 = 0; local95 < local87; local95++) {
				local101 = local35.method1764();
				@Pc(108) Class140 local108 = new Class140(Static110.method2245(local101));
				local12.aClass140Array1[local95] = local108;
				while (local101-- > 0) {
					@Pc(119) int local119 = local35.method1802();
					@Pc(123) int local123 = local35.method1802();
					local108.method4011(new Class1_Sub24(local123), (long) local119);
				}
			}
		}
		local35.anInt2395 = 0;
		local12.aString169 = local35.method1769();
		local12.anIntArray196 = new int[local63];
		local12.anIntArray194 = new int[local63];
		local12.aStringArray17 = new String[local63];
		local95 = 0;
		while (local56 > local35.anInt2395) {
			local101 = local35.method1764();
			if (local101 == 3) {
				local12.aStringArray17[local95] = local35.method1774().intern();
			} else if (local101 >= 100 || local101 == 21 || local101 == 38 || local101 == 39) {
				local12.anIntArray196[local95] = local35.method1772();
			} else {
				local12.anIntArray196[local95] = local35.method1802();
			}
			local12.anIntArray194[local95++] = local101;
		}
		Static186.aClass58_11.method2089((long) arg0, local12);
		return local12;
	}
}
