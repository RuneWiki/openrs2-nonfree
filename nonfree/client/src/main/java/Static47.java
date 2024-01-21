import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!i", name = "Ic", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!i", name = "Jc", descriptor = "[I")
	public static int[] anIntArray150 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!i", name = "Mc", descriptor = "Lclient!vc;")
	public static Class71 aClass71_679 = Static38.method736(": ");

	@OriginalMember(owner = "client!i", name = "Nc", descriptor = "[I")
	public static int[] anIntArray151 = new int[500];

	@OriginalMember(owner = "client!i", name = "Qc", descriptor = "I")
	public static int anInt1298 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZB)I")
	public static int method856() {
		return Static108.anInt2619 + Static115.anInt2697;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(II)Lclient!db;")
	public static Class5_Sub1_Sub4 method857(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub1_Sub4 local12 = (Class5_Sub1_Sub4) Static48.aClass54_24.method1397((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static4.aClass24_Sub1_1.method679(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class5_Sub1_Sub4();
		@Pc(35) Class5_Sub11 local35 = new Class5_Sub11(local22);
		local35.anInt2233 = local35.aByteArray23.length - 12;
		@Pc(46) int local46 = local35.method1540();
		local12.anInt667 = local35.method1543();
		local12.anInt666 = local35.method1543();
		local12.anInt672 = local35.method1543();
		local12.anInt673 = local35.method1543();
		local35.anInt2233 = 0;
		local12.anIntArray82 = new int[local46];
		@Pc(82) int local82 = 0;
		local12.anIntArray81 = new int[local46];
		local12.aClass71Array6 = new Class71[local46];
		while (local35.anInt2233 < local35.aByteArray23.length - 12) {
			@Pc(98) int local98 = local35.method1543();
			if (local98 == 3) {
				local12.aClass71Array6[local82] = local35.method1541();
			} else if (local98 >= 100 || local98 == 21 || local98 == 38 || local98 == 39) {
				local12.anIntArray81[local82] = local35.method1546();
			} else {
				local12.anIntArray81[local82] = local35.method1540();
			}
			local12.anIntArray82[local82++] = local98;
		}
		Static48.aClass54_24.method1399(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(B)V")
	public static void method858() {
		aClass71_679 = null;
		anIntArray150 = null;
		anIntArray151 = null;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public static void method859() {
		for (@Pc(20) Class5_Sub6 local20 = (Class5_Sub6) Static2.aClass52_10.method1358(); local20 != null; local20 = (Class5_Sub6) Static2.aClass52_10.method1363()) {
			if (local20.anInt1582 > 0) {
				local20.anInt1582--;
			}
			if (local20.anInt1582 != 0) {
				if (local20.anInt1575 > 0) {
					local20.anInt1575--;
				}
				if (local20.anInt1575 == 0 && local20.anInt1580 >= 1 && local20.anInt1587 >= 1 && local20.anInt1580 <= 102 && local20.anInt1587 <= 102 && (local20.anInt1585 < 0 || Static115.method1783(local20.anInt1586, local20.anInt1585))) {
					Static14.method408(local20.anInt1580, local20.anInt1579, local20.anInt1585, local20.anInt1586, local20.anInt1581, local20.anInt1578, local20.anInt1587);
					local20.anInt1575 = -1;
					if (local20.anInt1585 == local20.anInt1584 && local20.anInt1584 == -1) {
						local20.method2002();
					} else if (local20.anInt1585 == local20.anInt1584 && local20.anInt1581 == local20.anInt1574 && local20.anInt1583 == local20.anInt1586) {
						local20.method2002();
					}
				}
			} else if (local20.anInt1584 < 0 || Static115.method1783(local20.anInt1583, local20.anInt1584)) {
				Static14.method408(local20.anInt1580, local20.anInt1579, local20.anInt1584, local20.anInt1583, local20.anInt1574, local20.anInt1578, local20.anInt1587);
				local20.method2002();
			}
		}
	}
}
