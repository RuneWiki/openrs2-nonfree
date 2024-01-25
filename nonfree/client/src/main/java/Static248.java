import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg1;
		@Pc(14) int local14 = arg0 - arg5;
		for (@Pc(20) int local20 = arg1; local20 < local9; local20++) {
			Static567.method8614(arg3, arg6, Static186.anIntArrayArray12[local20], arg2);
		}
		@Pc(43) int local43 = arg6 - arg5;
		for (@Pc(45) int local45 = arg0; local45 > local14; local45--) {
			Static567.method8614(arg3, arg6, Static186.anIntArrayArray12[local45], arg2);
		}
		@Pc(63) int local63 = arg3 + arg5;
		for (@Pc(65) int local65 = local9; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static186.anIntArrayArray12[local65];
			Static567.method8614(arg3, local63, local71, arg2);
			Static567.method8614(local63, local43, local71, arg4);
			Static567.method8614(local43, arg6, local71, arg2);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILclient!vu;I)J")
	public static long method4407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface23 arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class331 local19 = Static251.aClass328_1.method8261(arg2.method9451());
		@Pc(42) long local42 = (long) ((arg2.method9452() | 0x10000) << 14 | arg0 << 7 | arg1 | arg2.method9454() << 20);
		if (local19.lb == 0) {
			local42 |= local12;
		}
		if (local19.anInt9420 == 1) {
			local42 |= local10;
		}
		return local42 | (long) arg2.method9451() << 32;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)V")
	public static void method4408(@OriginalArg(1) int arg0) {
		if (arg0 == Static579.anInt10049) {
			return;
		}
		if (arg0 == 13) {
			if (Static616.aString130 == null) {
				Static62.method1156(Static353.anInt6795, Static332.aString71, Static470.aString67);
			} else {
				Static359.method6151(Static353.anInt6795);
			}
		}
		if (arg0 != 13 && Static314.aClass207_1 != null) {
			Static314.aClass207_1.method5436();
			Static314.aClass207_1 = null;
		}
		if (arg0 == 3) {
			Static278.method4684(Static640.anInt11084 != Static567.anInt9844);
		}
		if (arg0 == 7) {
			Static265.method4567(Static230.anInt4621 != Static567.anInt9844);
		}
		if (arg0 == 5) {
			if (Static616.aString130 == null) {
				Static277.method9738(Static332.aString71, Static470.aString67);
			} else {
				Static576.method8735();
			}
		} else if (arg0 == 6) {
			if (Static616.aString130 == null) {
				Static62.method1156(Static353.anInt6795, Static332.aString71, Static470.aString67);
			} else {
				Static359.method6151(Static353.anInt6795);
			}
		} else if (arg0 == 9) {
			if (Static616.aString130 == null) {
				Static62.method1156(Static353.anInt6795, Static332.aString71, Static470.aString67);
			} else {
				Static359.method6151(Static353.anInt6795);
			}
		} else if (arg0 == 12) {
			if (Static616.aString130 == null) {
				Static277.method9738(Static332.aString71, Static470.aString67);
			} else {
				Static576.method8735();
			}
		}
		if (Static657.method9646(Static579.anInt10049)) {
			Static361.aClass124_78.anInt3918 = 2;
			Static324.aClass124_69.anInt3918 = 2;
			Static287.aClass124_63.anInt3918 = 2;
			Static345.aClass124_75.anInt3918 = 2;
			Static383.aClass124_79.anInt3918 = 2;
			Static114.aClass124_30.anInt3918 = 2;
			Static233.aClass124_52.anInt3918 = 2;
		}
		if (Static657.method9646(arg0)) {
			Static147.anInt2736 = 0;
			Static524.anInt9259 = 0;
			Static506.anInt9000 = 1;
			Static94.anInt1685 = 0;
			Static351.anInt6781 = 1;
			Static428.method7019(true);
			Static361.aClass124_78.anInt3918 = 1;
			Static324.aClass124_69.anInt3918 = 1;
			Static287.aClass124_63.anInt3918 = 1;
			Static345.aClass124_75.anInt3918 = 1;
			Static383.aClass124_79.anInt3918 = 1;
			Static114.aClass124_30.anInt3918 = 1;
			Static233.aClass124_52.anInt3918 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static85.method1476();
		}
		@Pc(220) boolean local220 = arg0 == 2 || Static349.method6047(arg0) || Static43.method7854(arg0);
		@Pc(235) boolean local235 = Static579.anInt10049 == 2 || Static349.method6047(Static579.anInt10049) || Static43.method7854(Static579.anInt10049);
		if (local220 != local235) {
			if (local220) {
				Static143.anInt2682 = Static5.anInt86;
				if (Static230.aClass2_Sub54_15.aClass4_Sub22_3.method7520() == 0) {
					Static150.method2591();
				} else {
					Static188.method7426(Static230.aClass2_Sub54_15.aClass4_Sub22_3.method7520(), Static5.anInt86, Static502.aClass124_105);
					Static451.method7283();
				}
				Static396.aClass206_1.method5420(false);
			} else {
				Static150.method2591();
				Static396.aClass206_1.method5420(true);
			}
		}
		if (Static657.method9646(arg0) || arg0 == 13) {
			Static607.aClass101_15.method8147();
		}
		Static579.anInt10049 = arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIZI)V")
	public static void method4409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if ((arg5 ? Static230.aClass2_Sub54_15.aClass4_Sub22_2.method7520() : Static230.aClass2_Sub54_15.aClass4_Sub22_1.method7520()) != 0 && arg0 != 0 && Static356.anInt6821 < 50 && arg2 != -1) {
			Static307.aClass150Array1[Static356.anInt6821++] = new Class150((byte) (arg5 ? 3 : 2), arg2, arg0, arg3, arg1, 0, arg4, (Class15_Sub3) null);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!ha;II[[[BIIBIIIIII)V")
	public static void method4410(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg7 == 0 || arg9 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg8 = arg8 + 1 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 10) {
			arg8 = arg8 + 3 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 11) {
			arg8 = arg8 + 3 & 0x3;
			arg7 = 8;
		}
		arg0.Q(arg1, arg10, arg6, arg2, arg4, arg11, arg3[arg7 - 1][arg8], arg9, arg5);
	}
}
