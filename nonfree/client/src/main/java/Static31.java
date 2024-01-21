import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!d", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!oh;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_334 = Static49.method1293("::fpson");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method788() {
		aClass70_334 = null;
		aClass14_1 = null;
		anIntArrayArrayArray2 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!b;")
	public static Class1_Sub1_Sub3 method789(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = (Class1_Sub1_Sub3) Static171.aClass25_24.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static45.aClass76_41.method3316(arg0, 4);
		local10 = new Class1_Sub1_Sub3();
		if (local20 != null) {
			local10.method297(arg0, new Class1_Sub9(local20));
		}
		Static171.aClass25_24.method1299(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!rf;)Z")
	public static boolean method790(@OriginalArg(1) Class70 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static164.anInt4267; local11++) {
			if (arg0.method2905(Static80.aClass70Array13[local11])) {
				return true;
			}
		}
		return arg0.method2905(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass70_408);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILclient!s;Lclient!s;IIIIJ)V")
	public static void method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub4 arg4, @OriginalArg(5) Class1_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class54 local6 = new Class54();
		local6.aLong100 = arg10;
		local6.anInt3117 = arg1 * 128 + 64;
		local6.anInt3125 = arg2 * 128 + 64;
		local6.anInt3114 = arg3;
		local6.aClass1_Sub1_Sub4_6 = arg4;
		local6.aClass1_Sub1_Sub4_5 = arg5;
		local6.anInt3120 = arg6;
		local6.anInt3116 = arg7;
		local6.anInt3119 = arg8;
		local6.anInt3118 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static90.aClass1_Sub17ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static90.aClass1_Sub17ArrayArrayArray1[local46][arg1][arg2] = new Class1_Sub17(local46, arg1, arg2);
			}
		}
		Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass54_1 = local6;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)V")
	public static void method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static106.method2213(arg1)) {
			Static63.method1487(arg0, Static77.aClass39ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)V")
	public static void method793(@OriginalArg(1) boolean arg0) {
		Static30.method785();
		Static73.anInt2247++;
		if (Static73.anInt2247 < 50 && !arg0) {
			return;
		}
		Static73.anInt2247 = 0;
		if (Static109.aBoolean125 || Static85.aClass43_22 == null) {
			return;
		}
		Static131.aClass1_Sub9_Sub1_3.method1283(52);
		try {
			Static85.aClass43_22.method2045(Static131.aClass1_Sub9_Sub1_3.aByteArray25, Static131.aClass1_Sub9_Sub1_3.anInt1592);
			Static131.aClass1_Sub9_Sub1_3.anInt1592 = 0;
		} catch (@Pc(44) IOException local44) {
			Static109.aBoolean125 = true;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!fa;)Lclient!rf;")
	public static Class70 method794(@OriginalArg(1) Class1_Sub9 arg0) {
		return Static127.method2533(arg0);
	}
}
