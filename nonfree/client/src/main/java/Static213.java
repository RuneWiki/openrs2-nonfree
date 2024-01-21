import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	public static int anInt4239;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public static volatile int anInt4241 = 0;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt4243 = 0;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1208 = Static181.method2795("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1209 = Static181.method2795("(U(Y");

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public static int anInt4246 = 0;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1210 = Static181.method2795("b12_full");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIILclient!rb;IZJ)Z")
	public static boolean method3227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class24 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static35.anInt916 || local4 >= Static31.anInt825) {
					return false;
				}
				@Pc(25) Class2_Sub23 local25 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt3554 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class78 local49 = new Class78();
		local49.aLong107 = arg11;
		local49.anInt3033 = arg0;
		local49.anInt3039 = arg5;
		local49.anInt3026 = arg6;
		local49.anInt3025 = arg7;
		local49.aClass24_4 = arg8;
		local49.anInt3035 = arg9;
		local49.anInt3028 = arg1;
		local49.anInt3036 = arg2;
		local49.anInt3031 = arg1 + arg3 - 1;
		local49.anInt3040 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static203.aClass2_Sub23ArrayArrayArray1[local124][local92][local95] == null) {
						Static203.aClass2_Sub23ArrayArrayArray1[local124][local92][local95] = new Class2_Sub23(local124, local92, local95);
					}
				}
				@Pc(157) Class2_Sub23 local157 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][local92][local95];
				local157.aClass78Array3[local157.anInt3554] = local49;
				local157.anIntArray328[local157.anInt3554] = local98;
				local157.anInt3563 |= local98;
				local157.anInt3554++;
			}
		}
		if (arg10) {
			Static155.aClass78Array2[Static63.anInt3434++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lclient!ki;")
	public static Class2_Sub2_Sub16 method3229(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub16 local10 = (Class2_Sub2_Sub16) Static195.aClass86_51.method2643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static74.aClass28_80.method852(Static97.method1652(arg0), Static125.method2107(arg0));
		local10 = new Class2_Sub2_Sub16();
		if (local24 != null) {
			local10.method1769(new Class2_Sub3(local24));
		}
		local10.method1763();
		Static195.aClass86_51.method2647(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)J")
	public static long method3230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass105_1 == null ? 0L : local7.aClass105_1.aLong146;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IB)V")
	public static void method3231(@OriginalArg(0) int arg0) {
		if (Static133.method2211(arg0)) {
			Static207.method3119(-1, Static175.aClass5ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!qf;IB)V")
	public static void method3232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub24 arg2, @OriginalArg(3) int arg3) {
		if (Static98.anInt2124 >= 400) {
			return;
		}
		if (arg2.anIntArray309 != null) {
			arg2 = arg2.method2447();
		}
		if (arg2 == null || !arg2.aBoolean151) {
			return;
		}
		@Pc(32) Class83 local32 = arg2.aClass83_942;
		if (arg2.anInt3197 != 0) {
			local32 = Static67.method1268(new Class83[] { local32, Static114.method2020(arg2.anInt3197, Static54.aClass24_Sub4_Sub1_1.anInt2299), Static55.aClass83_417, Static197.aClass83_1129, Static129.method2179(arg2.anInt3197), Static203.aClass83_1153 });
		}
		if (Static150.anInt3074 == 1) {
			Static43.method884(Static206.aClass83_1171, arg1, arg0, Static67.method1268(new Class83[] { Static99.aClass83_646, Static28.aClass83_209, local32 }), (short) 42, (long) arg3);
		} else if (!Static142.aBoolean141) {
			@Pc(87) Class83[] local87 = arg2.aClass83Array54;
			if (Static78.aBoolean93) {
				local87 = Static71.method1372(local87);
			}
			@Pc(97) int local97;
			if (local87 != null) {
				for (local97 = 4; local97 >= 0; local97--) {
					if (local87[local97] != null && (Static180.anInt3675 != 0 || !local87[local97].method2398(Static184.aClass83_1074))) {
						@Pc(118) byte local118 = 0;
						if (local97 == 0) {
							local118 = 13;
						}
						if (local97 == 1) {
							local118 = 48;
						}
						if (local97 == 2) {
							local118 = 12;
						}
						if (local97 == 3) {
							local118 = 33;
						}
						if (local97 == 4) {
							local118 = 47;
						}
						Static43.method884(local87[local97], arg1, arg0, Static67.method1268(new Class83[] { Static151.aClass83_914, local32 }), local118, (long) arg3);
					}
				}
			}
			if (Static180.anInt3675 == 0 && local87 != null) {
				for (local97 = 4; local97 >= 0; local97--) {
					if (local87[local97] != null && local87[local97].method2398(Static184.aClass83_1074)) {
						@Pc(197) short local197 = 0;
						@Pc(199) short local199 = 0;
						if (Static54.aClass24_Sub4_Sub1_1.anInt2299 < arg2.anInt3197) {
							local199 = 2000;
						}
						if (local97 == 0) {
							local197 = 13;
						}
						if (local97 == 1) {
							local197 = 48;
						}
						if (local97 == 2) {
							local197 = 12;
						}
						if (local97 == 3) {
							local197 = 33;
						}
						if (local97 == 4) {
							local197 = 47;
						}
						if (local197 != 0) {
							local197 += local199;
						}
						Static43.method884(local87[local97], arg1, arg0, Static67.method1268(new Class83[] { Static151.aClass83_914, local32 }), local197, (long) arg3);
					}
				}
			}
			Static43.method884(Static104.aClass83_690, arg1, arg0, Static67.method1268(new Class83[] { Static151.aClass83_914, local32 }), (short) 1001, (long) arg3);
			return;
		} else if ((Static75.anInt1757 & 0x2) == 2) {
			Static43.method884(Static171.aClass83_1013, arg1, arg0, Static67.method1268(new Class83[] { Static163.aClass83_962, Static28.aClass83_209, local32 }), (short) 31, (long) arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method3233() {
		Static11.aClass86_6.method2641();
		Static142.aClass91_11.method2709();
		Static15.aClass86_8.method2641();
	}
}
