import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!o;")
	public static Class116 aClass116_4;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!hd;")
	public static Class59 aClass59_4;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	public static int anInt4270;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
	public static int[] anIntArray381 = new int[14];

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public static int anInt4271 = -1;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
	public static int anInt4272 = 0;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "[I")
	public static int[] anIntArray382 = new int[100];

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIIIIIIIIIII)V")
	public static void method3398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(6) Class1_Sub28 local6 = new Class1_Sub28();
		local6.anInt4761 = arg5;
		local6.anInt4759 = arg8;
		local6.anInt4768 = arg0;
		local6.anInt4758 = arg3;
		local6.anInt4760 = arg1;
		local6.anInt4756 = arg10;
		local6.anInt4763 = arg7;
		local6.anInt4764 = arg4;
		local6.anInt4757 = arg9;
		local6.anInt4754 = arg2;
		local6.anInt4752 = arg11;
		local6.anInt4767 = arg6;
		Static260.aClass61_33.method1839(local6);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)I")
	public static int method3400(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public static void method3401() {
		Static55.aClass135_3.method3317();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)Lclient!ql;")
	public static Class1_Sub2_Sub17 method3402(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub17 local10 = (Class1_Sub2_Sub17) Static278.aClass49_12.method1381((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static121.aClass91_96.method2495(Static245.method3807(arg0), Static53.method4092(arg0));
		local10 = new Class1_Sub2_Sub17();
		if (local25 != null) {
			local10.method3439(new Class1_Sub11(local25));
		}
		Static278.aClass49_12.method1385(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!ui;")
	public static Class164 method3403(@OriginalArg(1) int arg0) {
		@Pc(12) Class164 local12 = (Class164) Static216.aClass135_24.method3316((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static150.aClass91_118.method2495(32, arg0);
		local12 = new Class164();
		if (local27 != null) {
			local12.method4063(new Class1_Sub11(local27));
		}
		local12.method4059();
		Static216.aClass135_24.method3321((long) arg0, local12);
		return local12;
	}
}
