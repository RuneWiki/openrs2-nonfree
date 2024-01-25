import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "[I")
	public static final int[] anIntArray353 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "J")
	public static long aLong101 = -1L;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public static int anInt2871 = 0;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "[I")
	public static final int[] anIntArray354 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
	public static int anInt2875 = -50;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg1; local7++) {
			for (@Pc(11) int local11 = arg2; local11 <= arg3; local11++) {
				if (arg4 == Static280.anIntArrayArray175[local7][local11] && Static215.anIntArrayArray145[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lclient!gb;")
	public static Class80 method3077(@OriginalArg(0) int arg0) {
		@Pc(15) Class80 local15 = (Class80) Static43.aClass70_22.method1396((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static135.aClass53_140.method1033(arg0, 34);
		local15 = new Class80();
		if (local25 != null) {
			local15.method1715(arg0, new Class6_Sub10(local25));
		}
		Static43.aClass70_22.method1406(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)Lclient!tg;")
	public static Class6_Sub2_Sub19 method3078() {
		return Static307.aClass6_Sub2_Sub19_2;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public static void method3079() {
		Static43.aClass70_22.method1399();
		Static113.aClass70_37.method1399();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)Lclient!rs;")
	public static Class179 method3080(@OriginalArg(1) int arg0) {
		@Pc(10) Class179 local10 = (Class179) Static17.aClass70_107.method1396((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static240.aClass53_101.method1033(arg0, 1);
		local10 = new Class179();
		local10.anInt5332 = arg0;
		if (local25 != null) {
			local10.method4848(new Class6_Sub10(local25));
		}
		local10.method4851();
		if (local10.anInt5333 == 2 && Static203.aClass108_24.method2900((long) arg0) == null) {
			Static203.aClass108_24.method2898((long) arg0, new Class6_Sub43(Static39.anInt755));
			Static151.aClass179Array1[Static39.anInt755++] = local10;
		}
		Static17.aClass70_107.method1406(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!qo;IILclient!fb;BLclient!ri;)V")
	public static void method3082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44_Sub4_Sub4_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class66 arg5, @OriginalArg(7) Class44_Sub4_Sub4_Sub2 arg6) {
		@Pc(15) Class6_Sub39 local15 = new Class6_Sub39();
		local15.anInt5876 = arg0 * 128;
		local15.anInt5888 = arg4 * 128;
		local15.anInt5886 = arg1;
		if (arg5 != null) {
			local15.aClass66_1 = arg5;
			@Pc(138) int local138 = arg5.anInt1489;
			@Pc(141) int local141 = arg5.lb;
			if (arg3 == 1 || arg3 == 3) {
				local138 = arg5.lb;
				local141 = arg5.anInt1489;
			}
			local15.anInt5880 = arg5.anInt1471;
			local15.anInt5883 = arg5.anInt1465;
			local15.anInt5873 = arg5.anInt1500;
			local15.anInt5881 = (arg4 + local141) * 128;
			local15.anInt5869 = arg5.anInt1469 * 128;
			local15.anInt5877 = (arg0 + local138) * 128;
			local15.anIntArray667 = arg5.anIntArray165;
			local15.anInt5885 = arg5.anInt1472;
			if (arg5.anIntArray162 != null) {
				local15.aBoolean396 = true;
				local15.method5319();
			}
			if (local15.anIntArray667 != null) {
				local15.anInt5879 = local15.anInt5885 + (int) (Math.random() * (double) (local15.anInt5880 - local15.anInt5885));
			}
			Static264.aClass211_31.method5585(local15);
		} else if (arg6 != null) {
			local15.aClass44_Sub4_Sub4_Sub2_1 = arg6;
			@Pc(84) Class18 local84 = arg6.aClass18_1;
			if (local84.anIntArray37 != null) {
				local15.aBoolean396 = true;
				local84 = local84.method369();
			}
			if (local84 != null) {
				local15.anInt5881 = (local84.anInt409 + arg4) * 128;
				local15.anInt5877 = (local84.anInt409 + arg0) * 128;
				local15.anInt5873 = Static178.method3319(arg6);
				local15.anInt5883 = local84.anInt417;
				local15.anInt5869 = local84.anInt402 * 128;
			}
			Static113.aClass211_17.method5585(local15);
		} else if (arg2 != null) {
			local15.aClass44_Sub4_Sub4_Sub1_2 = arg2;
			local15.anInt5877 = (arg2.method4714() + arg0) * 128;
			local15.anInt5881 = (arg4 + arg2.method4714()) * 128;
			local15.anInt5873 = Static241.method5339(arg2);
			local15.anInt5869 = arg2.anInt4904 * 128;
			local15.anInt5883 = arg2.anInt4916;
			Static225.aClass108_26.method2898((long) arg2.anInt5127, local15);
			return;
		}
	}
}
