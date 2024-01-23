import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	public static int anInt4766;

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
	public static int anInt4769;

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "Lclient!fm;")
	public static Class49 aClass49_9 = new Class49(64);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method3694() {
		@Pc(19) int local19 = (Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7) + Static53.anInt5288;
		Static266.anInt3889 = 0;
		@Pc(28) int local28 = Static83.anInt1875 + (Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7);
		if (local19 >= 3053 && local19 <= 3156 && local28 >= 3056 && local28 <= 3136) {
			Static266.anInt3889 = 1;
		}
		if (local19 >= 3072 && local19 <= 3118 && local28 >= 9492 && local28 <= 9535) {
			Static266.anInt3889 = 1;
		}
		if (Static266.anInt3889 == 1 && local19 >= 3139 && local19 <= 3199 && local28 >= 3008 && local28 <= 3062) {
			Static266.anInt3889 = 0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lclient!sn;")
	public static Class153 method3695(@OriginalArg(0) int arg0) {
		@Pc(10) Class153 local10 = (Class153) Static194.aClass135_20.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static265.aClass91_191.method2495(16, arg0);
		local10 = new Class153();
		if (local29 != null) {
			local10.method3817(new Class1_Sub11(local29));
		}
		Static194.aClass135_20.method3321((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static158.anInt3404 * 128) {
			arg0 = Static158.anInt3404 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static209.anInt4179 * 128) {
			arg2 = Static209.anInt4179 * 128 - 1;
		}
		Static112.anInt2572 = Class68.anIntArray229[arg3];
		Static47.anInt1116 = Class68.anIntArray226[arg3];
		Static26.anInt629 = Class68.anIntArray229[arg4];
		Static140.anInt3030 = Class68.anIntArray226[arg4];
		Static215.anInt4270 = arg0;
		Static197.anInt4046 = arg1;
		Static273.anInt5322 = arg2;
		Static186.anInt3849 = arg0 / 128;
		Static204.anInt4137 = arg2 / 128;
		Static161.anInt3459 = Static186.anInt3849 - Static171.anInt3641;
		if (Static161.anInt3459 < 0) {
			Static161.anInt3459 = 0;
		}
		Static172.anInt3652 = Static204.anInt4137 - Static171.anInt3641;
		if (Static172.anInt3652 < 0) {
			Static172.anInt3652 = 0;
		}
		Static30.anInt3246 = Static186.anInt3849 + Static171.anInt3641;
		if (Static30.anInt3246 > Static158.anInt3404) {
			Static30.anInt3246 = Static158.anInt3404;
		}
		Static152.anInt3232 = Static204.anInt4137 + Static171.anInt3641;
		if (Static152.anInt3232 > Static209.anInt4179) {
			Static152.anInt3232 = Static209.anInt4179;
		}
		@Pc(99) short local99;
		if (Static277.aBoolean412) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static171.anInt3641 + Static171.anInt3641 + 2; local104++) {
			for (local113 = 0; local113 < Static171.anInt3641 + Static171.anInt3641 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static171.anInt3641 << 7) - (Static215.anInt4270 & 0x7F);
				@Pc(140) int local140 = (local113 - Static171.anInt3641 << 7) - (Static273.anInt5322 & 0x7F);
				@Pc(146) int local146 = Static186.anInt3849 + local104 - Static171.anInt3641;
				@Pc(152) int local152 = Static204.anInt4137 + local113 - Static171.anInt3641;
				if (local146 >= 0 && local152 >= 0 && local146 < Static158.anInt3404 && local152 < Static209.anInt4179) {
					@Pc(176) int local176;
					if (Static255.anIntArrayArrayArray12 == null) {
						local176 = Static108.anIntArrayArrayArray7[0][local146][local152] + 128 - Static197.anInt4046;
					} else {
						local176 = Static255.anIntArrayArrayArray12[0][local146][local152] + 128 - Static197.anInt4046;
					}
					@Pc(201) int local201 = Static108.anIntArrayArrayArray7[3][local146][local152] - Static197.anInt4046 - 1000;
					Static135.aBooleanArrayArray4[local104][local113] = Static291.method4385(local130, local201, local176, local140, local99);
				} else {
					Static135.aBooleanArrayArray4[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static171.anInt3641 + Static171.anInt3641 + 1; local104++) {
			for (local113 = 0; local113 < Static171.anInt3641 + Static171.anInt3641 + 1; local113++) {
				Static260.aBooleanArrayArray8[local104][local113] = Static135.aBooleanArrayArray4[local104][local113] || Static135.aBooleanArrayArray4[local104 + 1][local113] || Static135.aBooleanArrayArray4[local104][local113 + 1] || Static135.aBooleanArrayArray4[local104 + 1][local113 + 1];
			}
		}
		Static200.anIntArray363 = arg6;
		Static9.anIntArray22 = arg7;
		Static274.anIntArray508 = arg8;
		Static204.anIntArray370 = arg9;
		Static162.anIntArray308 = arg10;
		Static90.method1585();
		if (Static273.aClass1_Sub26ArrayArrayArray3 != null) {
			Static284.method4269(true);
			Static29.method564(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static277.aBoolean412) {
				Static261.aBoolean387 = false;
				Static123.method2162(0, 0);
				Static28.method556(null);
				Static120.method2136();
			}
			Static284.method4269(false);
		}
		Static29.method564(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)Lclient!uh;")
	public static Class118 method3697() {
		try {
			return (Class118) Class.forName("Class118_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!km;B)Z")
	public static boolean method3698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2) {
		@Pc(9) byte[] local9 = arg2.method2495(arg1, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static82.method1391(local9);
			return true;
		}
	}
}
