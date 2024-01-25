import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public static int anInt1381;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "Lclient!wia;")
	public static Class386 aClass386_16;

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
	public static int anInt1384;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "[I")
	public static final int[] anIntArray93 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_23 = new Class100(17, 8);

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	public static int anInt1383 = 0;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V")
	public static void method1184(@OriginalArg(0) int arg0) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 16);
		local9.method2822();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!av;Z)I")
	public static int method1185(@OriginalArg(0) Class12_Sub2_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) Class283 local8 = arg0.aClass283_1;
		if (local8.anIntArray638 != null) {
			local8 = local8.method7129(Static595.aClass241_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt8615;
		@Pc(27) Class132 local27 = arg0.method2416();
		if (arg0.anInt2960 == -1 || arg0.aBoolean222) {
			local23 = local8.anInt8644;
		} else if (arg0.anInt2960 == local27.anInt3652 || arg0.anInt2960 == local27.anInt3656 || local27.anInt3648 == arg0.anInt2960 || local27.anInt3657 == arg0.anInt2960) {
			local23 = local8.anInt8637;
		} else if (arg0.anInt2960 == local27.anInt3663 || local27.anInt3628 == arg0.anInt2960 || local27.anInt3639 == arg0.anInt2960 || local27.anInt3651 == arg0.anInt2960) {
			local23 = local8.anInt8638;
		}
		return local23;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(CB)Z")
	public static boolean method1186(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!js;)V")
	public static void method1187(@OriginalArg(1) Class14_Sub29_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method4285();
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static209.anInt3954; local12++) {
			local18 = Static457.anIntArray607[local12];
			if ((Static474.aByteArray38[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static474.aByteArray38[local18] = (byte) (Static474.aByteArray38[local18] | 0x2);
					local7--;
				} else {
					local43 = arg0.method4289(1);
					if (local43 == 0) {
						local7 = Static7.method48(arg0);
						Static474.aByteArray38[local18] = (byte) (Static474.aByteArray38[local18] | 0x2);
					} else {
						Static47.method967(local18, arg0);
					}
				}
			}
		}
		arg0.method4290();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4285();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static209.anInt3954; local18++) {
			local43 = Static457.anIntArray607[local18];
			if ((Static474.aByteArray38[local43] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static474.aByteArray38[local43] = (byte) (Static474.aByteArray38[local43] | 0x2);
				} else {
					local124 = arg0.method4289(1);
					if (local124 == 0) {
						local7 = Static7.method48(arg0);
						Static474.aByteArray38[local43] = (byte) (Static474.aByteArray38[local43] | 0x2);
					} else {
						Static47.method967(local43, arg0);
					}
				}
			}
		}
		arg0.method4290();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4285();
		@Pc(185) int local185;
		@Pc(213) int local213;
		for (local124 = 0; local124 < Static127.anInt2500; local124++) {
			local185 = Static422.anIntArray561[local124];
			if ((Static474.aByteArray38[local185] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static474.aByteArray38[local185] = (byte) (Static474.aByteArray38[local185] | 0x2);
				} else {
					local213 = arg0.method4289(1);
					if (local213 == 0) {
						local7 = Static7.method48(arg0);
						Static474.aByteArray38[local185] = (byte) (Static474.aByteArray38[local185] | 0x2);
					} else if (Static558.method7841(local185, arg0)) {
						Static474.aByteArray38[local185] = (byte) (Static474.aByteArray38[local185] | 0x2);
					}
				}
			}
		}
		arg0.method4290();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4285();
		for (local185 = 0; local185 < Static127.anInt2500; local185++) {
			local213 = Static422.anIntArray561[local185];
			if ((Static474.aByteArray38[local213] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static474.aByteArray38[local213] = (byte) (Static474.aByteArray38[local213] | 0x2);
				} else {
					@Pc(303) int local303 = arg0.method4289(1);
					if (local303 == 0) {
						local7 = Static7.method48(arg0);
						Static474.aByteArray38[local213] = (byte) (Static474.aByteArray38[local213] | 0x2);
					} else if (Static558.method7841(local213, arg0)) {
						Static474.aByteArray38[local213] = (byte) (Static474.aByteArray38[local213] | 0x2);
					}
				}
			}
		}
		arg0.method4290();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static127.anInt2500 = 0;
		Static209.anInt3954 = 0;
		for (local213 = 1; local213 < 2048; local213++) {
			Static474.aByteArray38[local213] = (byte) (Static474.aByteArray38[local213] >> 1);
			@Pc(372) Class12_Sub2_Sub2_Sub1_Sub2 local372 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local213];
			if (local372 == null) {
				Static422.anIntArray561[Static127.anInt2500++] = local213;
			} else {
				Static457.anIntArray607[Static209.anInt3954++] = local213;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static258.method3697(arg3, Static370.anInt10475, Static468.anInt355);
		@Pc(21) int local21 = Static258.method3697(arg5, Static370.anInt10475, Static468.anInt355);
		@Pc(27) int local27 = Static258.method3697(arg6, Static575.anInt9879, Static313.anInt9045);
		@Pc(33) int local33 = Static258.method3697(arg1, Static575.anInt9879, Static313.anInt9045);
		@Pc(41) int local41 = Static258.method3697(arg2 + arg3, Static370.anInt10475, Static468.anInt355);
		@Pc(50) int local50 = Static258.method3697(arg5 - arg2, Static370.anInt10475, Static468.anInt355);
		for (@Pc(52) int local52 = local11; local52 < local41; local52++) {
			Static679.method9323(Static274.anIntArrayArray34[local52], local27, arg0, local33);
		}
		for (@Pc(68) int local68 = local21; local68 > local50; local68--) {
			Static679.method9323(Static274.anIntArrayArray34[local68], local27, arg0, local33);
		}
		@Pc(94) int local94 = Static258.method3697(arg2 + arg6, Static575.anInt9879, Static313.anInt9045);
		@Pc(103) int local103 = Static258.method3697(arg1 - arg2, Static575.anInt9879, Static313.anInt9045);
		for (@Pc(105) int local105 = local41; local105 <= local50; local105++) {
			@Pc(111) int[] local111 = Static274.anIntArrayArray34[local105];
			Static679.method9323(local111, local27, arg0, local94);
			Static679.method9323(local111, local94, arg4, local103);
			Static679.method9323(local111, local103, arg0, local33);
		}
	}
}
