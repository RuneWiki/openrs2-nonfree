import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "Lclient!nm;")
	public static Class119 aClass119_4;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "Lclient!uo;")
	public static Class176 aClass176_1;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!sk;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "Lclient!ui;")
	public static Class175 aClass175_3 = new Class175(64);

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
	public static int anInt371 = 0;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!nm;)V")
	public static void method269(@OriginalArg(1) Class119 arg0) {
		Static218.aClass119_75 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)I")
	public static int method270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	public static void method271() {
		Static146.aClass175_26.method4287();
		Static295.aClass175_42.method4287();
		Static145.aClass175_23.method4287();
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(III)Z")
	public static boolean method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static9.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static34.anInt651) {
			return false;
		} else if (local7 == Static34.anInt651) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static193.method3324(local22 + 1, Static280.anIntArrayArrayArray13[arg0][arg1][arg2], local26 + 1) && Static193.method3324(local22 + 128 - 1, Static280.anIntArrayArrayArray13[arg0][arg1 + 1][arg2], local26 + 1) && Static193.method3324(local22 + 128 - 1, Static280.anIntArrayArrayArray13[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static193.method3324(local22 + 1, Static280.anIntArrayArrayArray13[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static9.anIntArrayArrayArray2[arg0][arg1][arg2] = Static34.anInt651;
				return true;
			} else {
				Static9.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static34.anInt651;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZ)V")
	public static void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class96 local9 = Static203.aClass96ArrayArrayArray5[Static132.anInt2608][arg0][arg1];
		if (local9 == null) {
			Static142.method2504(Static132.anInt2608, arg0, arg1);
			return;
		}
		@Pc(28) Class1_Sub5_Sub11 local28 = (Class1_Sub5_Sub11) local9.method2340();
		@Pc(30) int local30 = -99999999;
		@Pc(32) Class1_Sub5_Sub11 local32 = null;
		while (local28 != null) {
			@Pc(41) Class3 local41 = Static69.method1330(local28.aClass11_Sub7_1.anInt5178);
			@Pc(44) int local44 = local41.anInt128;
			if (local41.anInt135 == 1) {
				local44 *= local28.aClass11_Sub7_1.anInt5176 + 1;
			}
			if (local44 > local30) {
				local32 = local28;
				local30 = local44;
			}
			local28 = (Class1_Sub5_Sub11) local9.method2342();
		}
		if (local32 == null) {
			Static142.method2504(Static132.anInt2608, arg0, arg1);
			return;
		}
		local9.method2337(local32);
		local28 = (Class1_Sub5_Sub11) local9.method2340();
		@Pc(92) Class11_Sub7 local92 = null;
		@Pc(101) Class11_Sub7 local101 = null;
		while (local28 != null) {
			@Pc(106) Class11_Sub7 local106 = local28.aClass11_Sub7_1;
			if (local32.aClass11_Sub7_1.anInt5178 != local106.anInt5178) {
				if (local92 == null) {
					local92 = local106;
				}
				if (local92.anInt5178 != local106.anInt5178 && local101 == null) {
					local101 = local106;
				}
			}
			local28 = (Class1_Sub5_Sub11) local9.method2342();
		}
		@Pc(142) long local142 = (long) ((arg1 << 7) + arg0 + 1610612736);
		Static124.method564(Static132.anInt2608, arg0, arg1, Static42.method768(arg0 * 128 + 64, Static132.anInt2608, arg1 * 128 + 64), local32.aClass11_Sub7_1, local142, local92, local101);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILclient!re;)V")
	public static void method275(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub4 arg1) {
		if (arg1.anInt3867 > Static167.anInt637) {
			Static287.method4321(arg1);
		} else if (arg1.anInt3807 >= Static167.anInt637) {
			Static105.method1989(arg1);
		} else {
			Static266.method4111(arg1);
		}
		if (arg1.anInt3865 < 128 || arg1.anInt3856 < 128 || arg1.anInt3865 >= 13184 || arg1.anInt3856 >= 13184) {
			arg1.anInt3807 = 0;
			arg1.anInt3867 = 0;
			arg1.anInt3864 = -1;
			arg1.anInt3857 = -1;
			arg1.anInt3865 = arg1.anIntArray407[0] * 128 + arg1.method3347() * 64;
			arg1.anInt3856 = arg1.anIntArray406[0] * 128 + arg1.method3347() * 64;
			arg1.method3357();
		}
		if (arg1 == Static138.aClass11_Sub4_Sub1_3 && (arg1.anInt3865 < 1536 || arg1.anInt3856 < 1536 || arg1.anInt3865 >= 11776 || arg1.anInt3856 >= 11776)) {
			arg1.anInt3857 = -1;
			arg1.anInt3864 = -1;
			arg1.anInt3867 = 0;
			arg1.anInt3807 = 0;
			arg1.anInt3865 = arg1.anIntArray407[0] * 128 + arg1.method3347() * 64;
			arg1.anInt3856 = arg1.anIntArray406[0] * 128 + arg1.method3347() * 64;
			arg1.method3357();
		}
		Static294.method947(arg1);
		Static8.method143(arg1);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	public static void method276() {
		Static183.aClass175_28.method4287();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBIIIIII)V")
	public static void method277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg2) {
			Static179.method3043(arg2, arg1, arg4, arg3, arg5, arg0);
		} else if (Static188.anInt3598 <= arg3 - arg2 && Static289.anInt5245 >= arg2 + arg3 && Static231.anInt4333 <= arg0 - arg6 && arg6 + arg0 <= Static218.anInt4086) {
			Static306.method4564(arg6, arg2, arg5, arg0, arg3, arg1, arg4);
		} else {
			Static243.method3853(arg1, arg0, arg4, arg2, arg3, arg6, arg5);
		}
	}
}
