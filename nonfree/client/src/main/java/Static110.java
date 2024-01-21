import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Lclient!jd;")
	public static Class37 aClass37_36;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "[Lclient!mc;")
	public static Class1_Sub2[] aClass1_Sub2Array3 = new Class1_Sub2[8];

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1665 = Static69.method1153("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1666 = aClass64_1665;

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Lclient!pc;")
	public static Class58 aClass58_7 = new Class58(4096);

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1667 = Static69.method1153("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "Lclient!pc;")
	public static Class58 aClass58_8 = new Class58(32);

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1668 = Static69.method1153("(U(Y");

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1669 = Static69.method1153("Von:");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIBI)V")
	public static void method1890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg3 * (arg3 - 32) / arg2;
		if (local11 < 8) {
			local11 = 8;
		}
		Static31.aClass1_Sub1_Sub5_Sub3Array3[0].method1290(arg1, arg4);
		Static31.aClass1_Sub1_Sub5_Sub3Array3[1].method1290(arg1, arg3 + arg4 - 16);
		@Pc(46) int local46 = arg0 * (arg3 - local11 - 32) / (arg2 - arg3);
		Static47.method1957(arg1, arg4 + 16, 16, arg3 - 32, Static12.anInt1936);
		Static47.method1957(arg1, local46 + arg4 + 16, 16, local11, Static73.anInt1645);
		Static47.method1958(arg1, arg4 + local46 + 16, local11, Static118.anInt2845);
		Static47.method1958(arg1 + 1, local46 + arg4 - -16, local11, Static118.anInt2845);
		Static47.method1955(arg1, local46 + arg4 + 16, 16, Static118.anInt2845);
		Static47.method1955(arg1, local46 + arg4 + 17, 16, Static118.anInt2845);
		Static47.method1958(arg1 + 15, arg4 + 16 - -local46, local11, Static11.anInt426);
		Static47.method1958(arg1 + 14, arg4 - -local46 + 17, local11 - 1, Static11.anInt426);
		Static47.method1955(arg1, arg4 + local46 + local11 + 15, 16, Static11.anInt426);
		Static47.method1955(arg1 + 1, local11 + arg4 + 14 - -local46, 15, Static11.anInt426);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(Z)V")
	public static void method1891() {
		aClass64_1669 = null;
		aClass58_7 = null;
		aClass64_1665 = null;
		aClass37_36 = null;
		aClass1_Sub2Array3 = null;
		aClass64_1668 = null;
		aClass58_8 = null;
		aClass64_1666 = null;
		aClass64_1667 = null;
		aByteArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
	public static void method1892() {
		aByteArrayArrayArray7 = null;
		Static75.aByteArrayArrayArray3 = null;
		Static96.anIntArray435 = null;
		Static38.anIntArrayArray7 = null;
		Static5.anIntArrayArrayArray4 = null;
		Static28.anIntArray357 = null;
		Static79.anIntArray284 = null;
		Static48.anIntArray381 = null;
		Static94.anIntArray310 = null;
		Static106.aByteArrayArrayArray6 = null;
		Static101.aByteArrayArrayArray5 = null;
		Static1.aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
	public static void method1893() {
		if (Static53.aClass27_3 != null) {
			Static53.aClass27_3.method562();
		}
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	public static void method1894() {
		if (Static74.aClass69_1 != null) {
			@Pc(7) Class69 local7 = Static74.aClass69_1;
			synchronized (Static74.aClass69_1) {
				Static74.aClass69_1 = null;
			}
		}
	}
}
