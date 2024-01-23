import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lclient!wd;")
	public static Class111 aClass111_38;

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
	public static int anInt4268;

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "Lclient!qe;")
	public static Class78 aClass78_732 = Static199.method3560("sch-Utteln:");

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Lclient!qe;")
	private static Class78 aClass78_733 = Static199.method3560("Select");

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_734 = aClass78_733;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
	public static int anInt4263 = 0;

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "Lclient!wc;")
	public static Class110 aClass110_20 = new Class110(64);

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lclient!qe;")
	public static Class78 aClass78_735 = Static199.method3560("scrollen:");

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "Z")
	public static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!qf;Lclient!qf;IIIIJ)V")
	public static void method3362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class104 local6 = new Class104();
		local6.aLong175 = arg10;
		local6.anInt4648 = arg1 * 128 + 64;
		local6.anInt4643 = arg2 * 128 + 64;
		local6.anInt4649 = arg3;
		local6.aClass5_10 = arg4;
		local6.aClass5_9 = arg5;
		local6.anInt4651 = arg6;
		local6.anInt4646 = arg7;
		local6.anInt4644 = arg8;
		local6.anInt4645 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static226.aClass2_Sub12ArrayArrayArray3[local46][arg1][arg2] == null) {
				Static226.aClass2_Sub12ArrayArrayArray3[local46][arg1][arg2] = new Class2_Sub12(local46, arg1, arg2);
			}
		}
		Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2].aClass104_1 = local6;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([[II)V")
	public static void method3363(@OriginalArg(0) int[][] arg0) {
		anIntArrayArray40 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!nh;B)V")
	public static void method3364(@OriginalArg(0) Class2_Sub23 arg0) {
		if (Static106.aClass99_2 != null) {
			try {
				Static106.aClass99_2.method3579(0L);
				Static106.aClass99_2.method3574(arg0.anInt2703, 24, arg0.aByteArray41);
			} catch (@Pc(23) Exception local23) {
			}
		}
		arg0.anInt2703 += 24;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method3365() {
		@Pc(11) Object local11 = Static95.anObject3;
		synchronized (Static95.anObject3) {
			if (Static146.anInt3306 == 0) {
				Static133.aClass41_2.method1259(5, new Class91());
			}
			Static146.anInt3306 = 600;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIILclient!qf;IJZ)Z")
	public static boolean method3367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static44.method588(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)V")
	public static void method3368() {
		if (Static171.aClass78_688 == null) {
			return;
		}
		if (Static208.anInt4610 < 10) {
			if (!Static35.aClass72_Sub1_4.method3185(Static171.aClass78_688)) {
				Static208.anInt4610 = Static35.aClass72_Sub1_4.method3167(Static171.aClass78_688) / 10;
				return;
			}
			Static113.method1927();
			Static208.anInt4610 = 10;
		}
		if (Static208.anInt4610 == 10) {
			@Pc(44) Class2_Sub23 local44 = new Class2_Sub23(Static35.aClass72_Sub1_4.method3183(Static216.aClass78_845, Static171.aClass78_688));
			@Pc(48) int local48 = local44.method2095();
			@Pc(52) int local52 = local44.method2095();
			@Pc(56) int local56 = local44.method2095();
			@Pc(60) int local60 = local44.method2095();
			@Pc(64) int local64 = local44.method2095();
			@Pc(68) int local68 = local44.method2095();
			Static151.anInt3457 = (local56 + 1 - local48) * 64;
			Static221.anInt4795 = local48 * 64;
			Static30.anInt547 = (local60 - local52) * 64 + 64;
			@Pc(100) int local100 = Static28.anInt497 + (Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7) - Static221.anInt4795;
			Static45.anInt815 = local52 * 64;
			Static174.aDouble11 = 8.0D;
			Static165.aDouble10 = 8.0D;
			@Pc(117) int local117 = local100 + (int) (Math.random() * 10.0D) - 5;
			@Pc(126) int local126 = (Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7) + (Static57.anInt628 - Static45.anInt815);
			@Pc(135) int local135 = local126 + (int) (Math.random() * 10.0D) - 5;
			if (local117 >= 0 && local117 < Static151.anInt3457 && local135 >= 0 && Static30.anInt547 > local135) {
				Static223.anInt4831 = Static30.anInt547 - local135;
				Static32.anInt4049 = local117;
			} else {
				Static223.anInt4831 = Static45.anInt815 + Static30.anInt547 - local68 * 64;
				Static32.anInt4049 = local64 * 64 - Static221.anInt4795;
			}
			Static178.method3274();
			@Pc(184) int local184 = Static30.anInt547 >> 6;
			@Pc(188) int local188 = Static151.anInt3457 >> 6;
			Static129.aByteArrayArrayArray9 = new byte[local188][local184][];
			Static142.aByteArrayArrayArray11 = new byte[local188][local184][];
			Static38.aByteArrayArrayArray3 = new byte[local188][local184][];
			Static159.anIntArrayArrayArray12 = new int[local188][local184][];
			Static164.aByteArrayArrayArray12 = new byte[local188][local184][];
			Static35.anIntArrayArrayArray2 = new int[local188][local184][];
			Static78.aByteArrayArrayArray6 = new byte[local188][local184][];
			@Pc(220) int local220 = Static40.anInt747 >> 1;
			Static188.aByteArrayArrayArray14 = new byte[local188][local184][];
			Static110.anIntArray420 = new int[Static152.anInt3504 + 1];
			@Pc(235) int local235 = Static179.anInt4185 >> 2 << 10;
			for (@Pc(237) int local237 = 0; local237 < Static152.anInt3504; local237++) {
				@Pc(243) Class2_Sub3_Sub21 local243 = Static51.method669(local237);
				if (local243 != null) {
					@Pc(248) int local248 = local243.anInt3251;
					if (local248 >= 0 && !Static163.anInterface4_1.method762(local248)) {
						local248 = -1;
					}
					@Pc(274) int local274;
					@Pc(279) int local279;
					@Pc(285) int local285;
					@Pc(309) int local309;
					if (local243.anInt3252 >= 0) {
						local279 = local243.anInt3252;
						local285 = local220 + (local279 & 0x7F);
						if (local285 < 0) {
							local285 = 0;
						} else if (local285 > 127) {
							local285 = 127;
						}
						local309 = local285 + (local279 & 0x380) + (local279 - -local235 & 0xFC00);
						local274 = Static163.anIntArray630[Static77.method1312(96, local309)];
					} else if (local248 >= 0) {
						local274 = Static163.anIntArray630[Static77.method1312(96, Static163.anInterface4_1.method759(local248))];
					} else if (local243.anInt3253 == -1) {
						local274 = -1;
					} else {
						local279 = local243.anInt3253;
						local285 = local220 + (local279 & 0x7F);
						if (local285 < 0) {
							local285 = 0;
						} else if (local285 > 127) {
							local285 = 127;
						}
						local309 = local285 + (local279 & 0x380) + (local279 - -local235 & 0xFC00);
						local274 = Static163.anIntArray630[Static77.method1312(96, local309)];
					}
					Static110.anIntArray420[local237 + 1] = local274;
				}
			}
			Static208.anInt4610 = 20;
		} else if (Static208.anInt4610 == 20) {
			Static54.method688(Static35.aClass72_Sub1_4.method3183(Static26.aClass78_91, Static171.aClass78_688));
			Static208.anInt4610 = 30;
			Static102.method1746(true);
			Static82.method1361();
		} else if (Static208.anInt4610 == 30) {
			Static35.method431(Static35.aClass72_Sub1_4.method3183(Static177.aClass78_713, Static171.aClass78_688));
			Static208.anInt4610 = 40;
			Static82.method1361();
		} else if (Static208.anInt4610 == 40) {
			Static47.method628(Static35.aClass72_Sub1_4.method3183(Static210.aClass78_823, Static171.aClass78_688));
			Static208.anInt4610 = 50;
			Static82.method1361();
		} else if (Static208.anInt4610 == 50) {
			Static21.method294(Static35.aClass72_Sub1_4.method3183(Static72.aClass78_835, Static171.aClass78_688));
			Static208.anInt4610 = 60;
			Static102.method1746(true);
			Static82.method1361();
		} else if (Static208.anInt4610 == 60) {
			Static40.method551(Static35.aClass72_Sub1_4.method3183(Static198.aClass78_787, Static171.aClass78_688));
			Static208.anInt4610 = 70;
			Static82.method1361();
		} else if (Static208.anInt4610 == 70) {
			Static127.aClass111_42 = new Class111(11, true, Static79.aCanvas2);
			Static208.anInt4610 = 73;
			Static102.method1746(true);
			Static82.method1361();
		} else if (Static208.anInt4610 == 73) {
			Static37.aClass111_5 = new Class111(12, true, Static79.aCanvas2);
			Static208.anInt4610 = 76;
			Static102.method1746(true);
			Static82.method1361();
		} else if (Static208.anInt4610 == 76) {
			Static161.aClass111_35 = new Class111(14, true, Static79.aCanvas2);
			Static208.anInt4610 = 79;
			Static102.method1746(true);
			Static82.method1361();
		} else if (Static208.anInt4610 == 79) {
			Static71.aClass111_19 = new Class111(17, true, Static79.aCanvas2);
			Static208.anInt4610 = 82;
			Static102.method1746(true);
			Static82.method1361();
		} else if (Static208.anInt4610 == 82) {
			Static54.aClass111_9 = new Class111(19, true, Static79.aCanvas2);
			Static208.anInt4610 = 85;
			Static102.method1746(true);
			Static82.method1361();
		} else if (Static208.anInt4610 == 85) {
			Static201.aClass111_40 = new Class111(22, true, Static79.aCanvas2);
			Static208.anInt4610 = 88;
			Static102.method1746(true);
			Static82.method1361();
		} else if (Static208.anInt4610 == 88) {
			aClass111_38 = new Class111(26, true, Static79.aCanvas2);
			Static208.anInt4610 = 91;
			Static102.method1746(true);
			Static82.method1361();
		} else {
			Static205.aClass111_8 = new Class111(30, true, Static79.aCanvas2);
			Static208.anInt4610 = 100;
			Static102.method1746(true);
			Static82.method1361();
			Static4.anInt123 = -1;
			Static22.anInt416 = -1;
			System.gc();
		}
	}
}
