import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bh", name = "nb", descriptor = "I")
	public static int anInt364;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
	public static int anInt348 = 0;

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_115 = Static120.method1824("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!bh", name = "ib", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_117 = Static120.method1824("Starte 3D)2Softwarebibliothek");

	@OriginalMember(owner = "client!bh", name = "Hb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_118 = Static120.method1824("p11_full");

	@OriginalMember(owner = "client!bh", name = "Nb", descriptor = "Z")
	public static final boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIZII)V")
	public static void method260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 1 || arg6 < 1 || arg3 > 102 || arg6 > 102) {
			return;
		}
		if (Static96.aBoolean83 && Static153.anInt673 != arg2) {
			return;
		}
		@Pc(36) long local36 = 0L;
		if (arg1 == 0) {
			local36 = Static11.method218(arg2, arg3, arg6);
		}
		if (arg1 == 1) {
			local36 = Static32.method3055(arg2, arg3, arg6);
		}
		if (arg1 == 2) {
			local36 = Static56.method822(arg2, arg3, arg6);
		}
		if (arg1 == 3) {
			local36 = Static31.method496(arg2, arg3, arg6);
		}
		if (local36 != 0L) {
			@Pc(93) int local93 = (int) local36 >> 14 & 0x1F;
			@Pc(100) int local100 = (int) local36 >> 20 & 0x3;
			@Pc(107) int local107 = Integer.MAX_VALUE & (int) (local36 >>> 32);
			@Pc(120) Class3_Sub1_Sub1 local120;
			if (arg1 == 0) {
				Static69.method1034(arg2, arg3, arg6);
				local120 = Static162.method2627(local107);
				if (local120.anInt134 != 0) {
					Static32.aClass82Array11[arg2].method2509(arg3, local100, local120.aBoolean14, arg6, local93);
				}
			}
			if (arg1 == 1) {
				Static7.method153(arg2, arg3, arg6);
			}
			if (arg1 == 2) {
				Static154.method2461(arg2, arg3, arg6);
				local120 = Static162.method2627(local107);
				if (local120.anInt145 + arg3 > 103 || local120.anInt145 + arg6 > 103 || local120.anInt150 + arg3 > 103 || arg6 + local120.anInt150 > 103) {
					return;
				}
				if (local120.anInt134 != 0) {
					Static32.aClass82Array11[arg2].method2519(arg6, local100, arg3, local120.anInt150, local120.aBoolean14, local120.anInt145);
				}
			}
			if (arg1 == 3) {
				Static36.method574(arg2, arg3, arg6);
				local120 = Static162.method2627(local107);
				if (local120.anInt134 == 1) {
					Static32.aClass82Array11[arg2].method2520(arg6, arg3);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		@Pc(239) int local239 = arg2;
		if (arg2 < 3 && (Static18.aByteArrayArrayArray1[1][arg3][arg6] & 0x2) == 2) {
			local239 = arg2 + 1;
		}
		Static30.method3168(arg5, arg4, local239, arg2, arg3, arg6, Static32.aClass82Array11[arg2], arg0);
		return;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIB)I")
	public static int method269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BSJLclient!rd;ILclient!rd;I)V")
	public static void method273(@OriginalArg(1) short arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class80 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class80 arg4, @OriginalArg(6) int arg5) {
		if (Static148.aBoolean134 || Static173.anInt3892 >= 500) {
			return;
		}
		Static148.aClass80Array25[Static173.anInt3892] = arg2;
		Static18.aClass80Array5[Static173.anInt3892] = arg4;
		Static160.aShortArray46[Static173.anInt3892] = arg0;
		Static176.aLongArray9[Static173.anInt3892] = arg1;
		Static73.anIntArray200[Static173.anInt3892] = arg3;
		Static19.anIntArray67[Static173.anInt3892] = arg5;
		Static173.anInt3892++;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIB)V")
	public static void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 - arg0 >= Static172.anInt3861 && Static85.anInt1779 >= arg0 + arg2 && arg1 - arg0 >= Static34.anInt790 && arg1 + arg0 <= Static17.anInt440) {
			Static78.method1189(arg0, arg2, arg3, arg1);
		} else {
			Static12.method41(arg2, arg1, arg0, arg3);
		}
	}
}
