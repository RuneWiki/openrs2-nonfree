import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public static int anInt2565;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
	public static Object method2038(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static356.aBoolean475) {
			try {
				@Pc(30) Class247 local30 = (Class247) Class.forName("Class247_Sub1").getDeclaredConstructor().newInstance();
				local30.method5871(arg0);
				return local30;
			} catch (@Pc(37) Throwable local37) {
				Static356.aBoolean475 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method2041() {
		Static549.aClass4_Sub13_Sub2_2.method7063();
		@Pc(13) int local13 = Static549.aClass4_Sub13_Sub2_2.method7065(8);
		if (local13 < Static137.anInt3042) {
			for (@Pc(22) int local22 = local13; local22 < Static137.anInt3042; local22++) {
				Static192.anIntArray190[Static520.anInt10609++] = Static24.anIntArray24[local22];
			}
		}
		if (Static137.anInt3042 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static137.anInt3042 = 0;
		for (@Pc(58) int local58 = 0; local58 < local13; local58++) {
			@Pc(64) int local64 = Static24.anIntArray24[local58];
			@Pc(72) Class21_Sub1_Sub1_Sub1_Sub1 local72 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) local64)).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			@Pc(77) int local77 = Static549.aClass4_Sub13_Sub2_2.method7065(1);
			if (local77 == 0) {
				Static24.anIntArray24[Static137.anInt3042++] = local64;
				local72.anInt4260 = Static306.anInt6122;
			} else {
				@Pc(97) int local97 = Static549.aClass4_Sub13_Sub2_2.method7065(2);
				if (local97 == 0) {
					Static24.anIntArray24[Static137.anInt3042++] = local64;
					local72.anInt4260 = Static306.anInt6122;
					Static470.anIntArray519[Static407.anInt7865++] = local64;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						Static24.anIntArray24[Static137.anInt3042++] = local64;
						local72.anInt4260 = Static306.anInt6122;
						local139 = Static549.aClass4_Sub13_Sub2_2.method7065(3);
						local72.method1716(1, local139);
						local149 = Static549.aClass4_Sub13_Sub2_2.method7065(1);
						if (local149 == 1) {
							Static470.anIntArray519[Static407.anInt7865++] = local64;
						}
					} else if (local97 == 2) {
						Static24.anIntArray24[Static137.anInt3042++] = local64;
						local72.anInt4260 = Static306.anInt6122;
						if (Static549.aClass4_Sub13_Sub2_2.method7065(1) == 1) {
							local139 = Static549.aClass4_Sub13_Sub2_2.method7065(3);
							local72.method1716(2, local139);
							local149 = Static549.aClass4_Sub13_Sub2_2.method7065(3);
							local72.method1716(2, local149);
						} else {
							local139 = Static549.aClass4_Sub13_Sub2_2.method7065(3);
							local72.method1716(0, local139);
						}
						local139 = Static549.aClass4_Sub13_Sub2_2.method7065(1);
						if (local139 == 1) {
							Static470.anIntArray519[Static407.anInt7865++] = local64;
						}
					} else if (local97 == 3) {
						Static192.anIntArray190[Static520.anInt10609++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!wv;ILjava/awt/Component;I)Lclient!pda;")
	public static Class15 method2042(@OriginalArg(0) int arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static544.anInt9957 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class15 local33 = (Class15) Class.forName("Class15_Sub1").getDeclaredConstructor().newInstance();
			local33.anInt6848 = arg0;
			local33.anIntArray387 = new int[(Static455.aBoolean611 ? 2 : 1) * 256];
			local33.method5350(arg2);
			local33.anInt6852 = (arg0 & 0xFFFFFC00) + 1024;
			if (local33.anInt6852 > 16384) {
				local33.anInt6852 = 16384;
			}
			local33.method5343(local33.anInt6852);
			if (Static534.anInt9774 > 0 && Static514.aClass179_2 == null) {
				Static514.aClass179_2 = new Class179();
				Static514.aClass179_2.aClass366_4 = arg1;
				arg1.method8285(Static514.aClass179_2, Static534.anInt9774);
			}
			if (Static514.aClass179_2 != null) {
				if (Static514.aClass179_2.aClass15Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static514.aClass179_2.aClass15Array1[arg3] = local33;
			}
			return local33;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class15_Sub2 local117 = new Class15_Sub2(arg1, arg3);
				local117.anIntArray387 = new int[(Static455.aBoolean611 ? 2 : 1) * 256];
				local117.anInt6848 = arg0;
				local117.method5350(arg2);
				local117.anInt6852 = 16384;
				local117.method5343(local117.anInt6852);
				if (Static534.anInt9774 > 0 && Static514.aClass179_2 == null) {
					Static514.aClass179_2 = new Class179();
					Static514.aClass179_2.aClass366_4 = arg1;
					arg1.method8285(Static514.aClass179_2, Static534.anInt9774);
				}
				if (Static514.aClass179_2 != null) {
					if (Static514.aClass179_2.aClass15Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static514.aClass179_2.aClass15Array1[arg3] = local117;
				}
				return local117;
			} catch (@Pc(176) Throwable local176) {
				return new Class15();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(FBIFF)F")
	public static float method2043(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static386.aFloatArrayArray11[arg1];
		return local12[1] * arg2 + local12[0] * arg0 + arg3 * local12[2];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI[II[Ljava/lang/Object;)V")
	public static void method2045(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg2];
		arg3[arg2] = local30;
		@Pc(47) int local47 = local16 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(49) int local49 = arg0; local49 < arg2; local49++) {
			if (arg1[local49] < local16 + (local47 & local49)) {
				@Pc(64) int local64 = arg1[local49];
				arg1[local49] = arg1[local12];
				arg1[local12] = local64;
				@Pc(78) Object local78 = arg3[local49];
				arg3[local49] = arg3[local12];
				arg3[local12++] = local78;
			}
		}
		arg1[arg2] = arg1[local12];
		arg1[local12] = local16;
		arg3[arg2] = arg3[local12];
		arg3[local12] = local30;
		method2045(arg0, arg1, local12 - 1, arg3);
		method2045(local12 + 1, arg1, arg2, arg3);
	}
}
