import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!u", name = "h", descriptor = "[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] aClass3_Sub1_Sub3_Sub3Array41;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!f;")
	public static Class13 aClass13_30;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1897 = Static122.method531(" <col=ffff00>");

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1901 = Static122.method531("Please wait)3)3)3");

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1898 = aClass73_1901;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1899 = Static122.method531("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1900 = Static122.method531("Take");

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1902 = Static122.method531("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1903 = aClass73_1900;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "I")
	public static int anInt3497 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Z")
	public static boolean method2529(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IB)Lclient!vf;")
	public static Class3_Sub1_Sub18 method2530(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub18 local10 = (Class3_Sub1_Sub18) Static159.aClass7_25.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static23.aClass13_4.method348(14, arg0);
		local10 = new Class3_Sub1_Sub18();
		if (local25 != null) {
			local10.method2690(new Class3_Sub12(local25));
		}
		Static159.aClass7_25.method186(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!f;Lclient!f;I)V")
	public static void method2531(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1) {
		Static4.aClass13_1 = arg0;
		Static121.aClass13_24 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method2532() {
		aClass3_Sub1_Sub3_Sub3Array41 = null;
		aClass73_1900 = null;
		aClass73_1899 = null;
		aClass73_1898 = null;
		aClass73_1901 = null;
		aClass73_1897 = null;
		aClass13_30 = null;
		aClass73_1902 = null;
		aClass73_1903 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I")
	public static int method2533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub16 local17 = (Class3_Sub16) Static69.aClass16_6.method554((long) arg0);
		if (local17 == null) {
			return -1;
		} else if (arg1 >= 0 && local17.anIntArray307.length > arg1) {
			return local17.anIntArray307[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method2534() {
		Static85.aBoolean127 = true;
		Static64.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(IB)[B")
	public static synchronized byte[] method2535(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static62.anInt1470 > 0) {
			local19 = Static150.aByteArrayArray10[--Static62.anInt1470];
			Static150.aByteArrayArray10[Static62.anInt1470] = null;
			return local19;
		} else if (arg0 == 5000 && Static22.anInt586 > 0) {
			local19 = Static110.aByteArrayArray7[--Static22.anInt586];
			Static110.aByteArrayArray7[Static22.anInt586] = null;
			return local19;
		} else if (arg0 == 30000 && Static137.anInt3101 > 0) {
			local19 = Static6.aByteArrayArray1[--Static137.anInt3101];
			Static6.aByteArrayArray1[Static137.anInt3101] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)I")
	public static int method2536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local12 * arg1;
		} else {
			return local12;
		}
	}
}
