import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_454 = Static49.method1293(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Lclient!rf;")
	private static Class70 aClass70_459 = Static49.method1293("Choose Option");

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_455 = aClass70_459;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!rf;")
	private static Class70 aClass70_456 = Static49.method1293("Players");

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
	public static int[] anIntArray131 = new int[1000];

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!rf;")
	public static Class70 aClass70_457 = aClass70_456;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!rf;")
	public static Class70 aClass70_458 = Static49.method1293("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Lclient!nh;")
	public static Class1_Sub1_Sub13 method1031(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub13 local10 = (Class1_Sub1_Sub13) Static92.aClass25_15.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static71.aClass76_62.method3316(arg0, 9);
		local10 = new Class1_Sub1_Sub13();
		local10.anInt3243 = arg0;
		if (local20 != null) {
			local10.method2430(new Class1_Sub9(local20));
		}
		local10.method2423();
		Static92.aClass25_15.method1299(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)Lclient!ja;")
	public static Class1_Sub14 method1032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class1_Sub14 local3 = new Class1_Sub14();
		local3.anInt2464 = arg1;
		local3.anInt2467 = arg2;
		Static128.aClass30_14.method1464(local3, (long) arg0);
		Static112.method3352(arg2);
		Static40.method1026(arg2);
		@Pc(29) Class39 local29 = Static128.method3227(arg0);
		if (local29 != null) {
			Static171.method3407(local29);
		}
		if (Static81.aClass39_25 != null) {
			Static171.method3407(Static81.aClass39_25);
			Static81.aClass39_25 = null;
		}
		Static32.aBoolean47 = false;
		Static162.anInt4331 = 0;
		Static169.method3346(Static110.anInt3091, Static18.anInt481, Static3.anInt150, Static170.anInt4398);
		if (Static58.anInt1865 != -1) {
			Static31.method792(1, Static58.anInt1865);
		}
		return local3;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	public static void method1033(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub16 local6 = (Class1_Sub16) Static61.aClass30_8.method1467((long) arg0);
		if (local6 != null) {
			local6.method3499();
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public static void method1034() {
		aClass70_456 = null;
		aByteArrayArrayArray3 = null;
		anIntArray132 = null;
		aClass70_455 = null;
		aClass70_458 = null;
		anIntArray131 = null;
		aClass70_454 = null;
		aClass70_457 = null;
		aClass70_459 = null;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)I")
	public static int method1035(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!rf;Lclient!rf;I)V")
	public static void method1036(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) int arg2) {
		Static119.method2422(arg0, null, arg2, arg1);
	}
}
